/*
 * XML Type:  length
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.Length
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML length(@http://jagornet.com/dhcp/xml).
 *
 * This is an atomic type that is a restriction of com.jagornet.dhcp.xml.Length.
 */
public interface Length extends org.apache.xmlbeans.XmlUnsignedShort
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Length.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("length9daatype");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.Length newValue(java.lang.Object obj) {
          return (com.jagornet.dhcp.xml.Length) type.newValue( obj ); }
        
        public static com.jagornet.dhcp.xml.Length newInstance() {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.Length newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.Length parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.Length parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.Length parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.Length parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.Length parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Length parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Length parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Length) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}