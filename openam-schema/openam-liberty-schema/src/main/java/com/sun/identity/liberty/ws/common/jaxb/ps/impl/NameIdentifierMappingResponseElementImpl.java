//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ps.impl;

public class NameIdentifierMappingResponseElementImpl
    extends com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.ps.NameIdentifierMappingResponseElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ps.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ps.NameIdentifierMappingResponseElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:iff:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "NameIdentifierMappingResponse";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:iff:2003-08", "NameIdentifierMappingResponse");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ps.NameIdentifierMappingResponseElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0014sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq"
+"\u0000~\u0000\u0014ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom"
+".sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0018ps"
+"r\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\t"
+"nameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u00002com.sun.msv.grammar.Expression"
+"$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0017\u0001q\u0000~\u0000!sr\u0000 com.sun"
+".msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar."
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Eps"
+"ilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\"q\u0000~\u0000\'sr\u0000#com.sun.msv.gra"
+"mmar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Str"
+"ing;L\u0000\fnamespaceURIq\u0000~\u0000)xq\u0000~\u0000$t\u0000?com.sun.identity.liberty.ws"
+".common.jaxb.xmlsig.SignatureElementt\u0000+http://java.sun.com/j"
+"axb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014pp"
+"sq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u0000<com.sun.iden"
+"tity.liberty.ws.common.jaxb.xmlsig.SignatureTypeq\u0000~\u0000,sq\u0000~\u0000\u0014p"
+"psq\u0000~\u0000\u001eq\u0000~\u0000\u0018psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dt"
+"t\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLc"
+"om/sun/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u0000\"com.sun.msv.datat"
+"ype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Bui"
+"ltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concre"
+"teType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000)L\u0000\btypeNameq\u0000~\u0000)L\u0000\nwhiteSpace"
+"t\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:/"
+"/www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.x"
+"sd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.g"
+"rammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr"
+"\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000)L\u0000\f"
+"namespaceURIq\u0000~\u0000)xpq\u0000~\u0000Bq\u0000~\u0000Asq\u0000~\u0000(t\u0000\u0004typet\u0000)http://www.w3.o"
+"rg/2001/XMLSchema-instanceq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\tSignaturet\u0000\"http://w"
+"ww.w3.org/2000/09/xmldsig#q\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000"
+"~\u0000\'sq\u0000~\u0000(t\u0000;com.sun.identity.liberty.ws.common.jaxb.ps.Exten"
+"sionElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00008com.sun.identity.l"
+"iberty.ws.common.jaxb.ps.ExtensionTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~"
+"\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\tExtensiont\u0000\u0017urn:liberty:iff:2003-"
+"08q\u0000~\u0000\'sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u00007ppsr\u0000\'com.sun.msv.datatype.xsd"
+".MaxLengthFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\tmaxLengthxr\u00009com.sun.msv.dataty"
+"pe.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.su"
+"n.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFix"
+"edZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/x"
+"sd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xs"
+"d/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000)xq\u0000~\u0000>t\u0000\u001curn:liberty:metadat"
+"a:2003-08t\u0000\fentityIDTypeq\u0000~\u0000E\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd."
+"AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\u0006anyURIq\u0000~\u0000Eq\u0000~\u0000rt\u0000\tmaxLen"
+"gth\u0000\u0000\u0004\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000pq\u0000~\u0000osq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000"
+"~\u0000\'sq\u0000~\u0000(t\u0000\nProviderIDq\u0000~\u0000esq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u0000>com.sun.identity.lib"
+"erty.ws.common.jaxb.protocol.StatusElementq\u0000~\u0000,sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'"
+"sq\u0000~\u0000(t\u0000;com.sun.identity.liberty.ws.common.jaxb.protocol.St"
+"atusTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\u0006Sta"
+"tust\u0000$urn:oasis:names:tc:SAML:1.0:protocolsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0014q\u0000~\u0000"
+"\u0018psq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq"
+"\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u0000Gcom.sun.identity.liberty.ws.common.ja"
+"xb.assertion.NameIdentifierElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007pp"
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~"
+"\u0000(t\u0000Dcom.sun.identity.liberty.ws.common.jaxb.assertion.NameI"
+"dentifierTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t"
+"\u0000\u000eNameIdentifiert\u0000%urn:oasis:names:tc:SAML:1.0:assertionsq\u0000~"
+"\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~"
+"\u0000(t\u0000Kcom.sun.identity.liberty.ws.common.jaxb.ps.EncryptableN"
+"ameIdentifierElementq\u0000~\u0000,q\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018psq\u0000~\u00007ppsr"
+"\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun."
+"msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatyp"
+"e.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000<q\u0000~\u0000At\u0000\u0006NCN"
+"ameq\u0000~\u0000E\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00b1q\u0000~\u0000Asq\u0000~\u0000(t\u0000\fInResponseTot\u0000\u0000q\u0000~\u0000\'s"
+"q\u0000~\u0000\u001eppsq\u0000~\u00007ppsr\u0000%com.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5"
+"\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\bdateTimeq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00bbq\u0000~\u0000Asq\u0000~\u0000(t\u0000\f"
+"IssueInstantq\u0000~\u0000\u00b5sq\u0000~\u0000\u001eppsq\u0000~\u00007ppsr\u0000$com.sun.msv.datatype.xs"
+"d.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.Integer"
+"DerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000lxq\u0000~\u0000<q\u0000~\u0000At\u0000\u0007intege"
+"rq\u0000~\u0000Esr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexica"
+"lConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000kppq\u0000~\u0000E\u0001\u0000sr\u0000#com.sun.msv.da"
+"tatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\u0007decimalq\u0000~\u0000Eq\u0000"
+"~\u0000\u00c9t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00c4q\u0000~\u0000Asq\u0000~\u0000(t\u0000\fMajorV"
+"ersionq\u0000~\u0000\u00b5sq\u0000~\u0000\u001eppq\u0000~\u0000\u00c0sq\u0000~\u0000(t\u0000\fMinorVersionq\u0000~\u0000\u00b5sq\u0000~\u0000\u0014ppsq"
+"\u0000~\u0000\u001eq\u0000~\u0000\u0018psq\u0000~\u00007q\u0000~\u0000\u0018pq\u0000~\u0000rq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000sq\u0000~\u0000Asq\u0000~\u0000(t\u0000\tRec"
+"ipientq\u0000~\u0000\u00b5q\u0000~\u0000\'sq\u0000~\u0000\u001eppsq\u0000~\u00007ppsr\u0000\u001fcom.sun.msv.datatype.xsd"
+".IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u00adq\u0000~\u0000At\u0000\u0002IDq\u0000~\u0000E\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00dcq\u0000~\u0000"
+"Asq\u0000~\u0000(t\u0000\nResponseIDq\u0000~\u0000\u00b5sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'"
+"sq\u0000~\u0000(t\u0000\u001dNameIdentifierMappingResponseq\u0000~\u0000esr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL"
+"\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u00003\u0001pq\u0000~\u0000R"
+"q\u0000~\u0000zq\u0000~\u0000\u0090q\u0000~\u0000Pq\u0000~\u0000Qq\u0000~\u0000\u001dq\u0000~\u00001q\u0000~\u0000Uq\u0000~\u0000]q\u0000~\u0000}q\u0000~\u0000\u0085q\u0000~\u0000\u0093q\u0000~\u0000\u009b"
+"q\u0000~\u0000\u00a6q\u0000~\u0000\tq\u0000~\u0000\u0012q\u0000~\u0000\u001aq\u0000~\u00000q\u0000~\u0000Tq\u0000~\u0000\\q\u0000~\u0000|q\u0000~\u0000\u0084q\u0000~\u0000\u0092q\u0000~\u0000\u009aq\u0000~\u0000\u00a5"
+"q\u0000~\u0000gq\u0000~\u0000\fq\u0000~\u0000.q\u0000~\u0000Zq\u0000~\u0000\u0013q\u0000~\u0000\u0082q\u0000~\u0000\u0098q\u0000~\u0000\u000eq\u0000~\u0000\nq\u0000~\u0000\u008fq\u0000~\u0000\u0011q\u0000~\u0000\u00aa"
+"q\u0000~\u0000\rq\u0000~\u0000\u00d2q\u0000~\u0000\u000fq\u0000~\u0000\u000bq\u0000~\u0000\u0015q\u0000~\u0000\u008eq\u0000~\u00005q\u0000~\u0000aq\u0000~\u0000vq\u0000~\u0000\u0089q\u0000~\u0000\u009fq\u0000~\u0000\u00e0"
+"q\u0000~\u0000\u0010q\u0000~\u0000\u0016x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("NameIdentifierMappingResponse" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("NameIdentifierMappingResponse" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("InResponseTo" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("IssueInstant" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ps.impl.NameIdentifierMappingResponseElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "InResponseTo");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "IssueInstant");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
