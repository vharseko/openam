/**
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

/*global define*/

define("org/forgerock/openam/ui/admin/views/realms/policies/policies/conditions/ConditionAttrTimeZoneView", [
    "jquery",
    "underscore",
    "org/forgerock/openam/ui/admin/views/realms/policies/policies/conditions/ConditionAttrBaseView",
    "jqueryui"
], function ($, _, ConditionAttrBaseView) {
    return ConditionAttrBaseView.extend({
        template: "templates/admin/views/realms/policies/policies/conditions/ConditionAttrTimeZone.html",
        DEFAULT_TIME_ZONE: "GMT",

        render: function (data, element, callback) {
            this.initBasic(data, element, "pull-left");

            _.extend(this.data, {defaultTimeZone: this.DEFAULT_TIME_ZONE});

            this.initTimeZones();

            this.parentRender(function () {
                if (callback) {
                    callback();
                }
            });

            return this;
        },

        initTimeZones: function () {
            var self = this;

            if (this.data.timezones) {
                this.setTimeZones();
                return;
            }

            $.ajax({
                url: "timezones.json",
                dataType: "json",
                cache: true
            }).then(function (data) {
                self.data.timezones = data.timezones;
                self.setTimeZones();
            });
        },

        setTimeZones: function () {
            var self = this,
                timezone = self.$el.find("#enforcementTimeZone");

            timezone.autocomplete({
                source: self.data.timezones
            });

            if (!timezone.val()) {
                timezone.val(self.data.defaultTimeZone).trigger("autocompleteselect");
                self.data.itemData.enforcementTimeZone = self.data.defaultTimeZone;
            }
        },

        attrSpecificChangeInput: function (e) {
            this.handleTimeZone(e.currentTarget.value);
        },

        handleTimeZone: function (currentVal) {
            if (!_.find(this.data.timezones, function (zone) {
                return zone === currentVal;
            })) {
                this.data.itemData.enforcementTimeZone = this.data.defaultTimeZone;
            }
        }
    });
});