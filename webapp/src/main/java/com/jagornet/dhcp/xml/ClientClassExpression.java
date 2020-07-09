/*
 * XML Type:  clientClassExpression
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.ClientClassExpression
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML clientClassExpression(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface ClientClassExpression extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClientClassExpression.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("clientclassexpression9f3dtype");
    
    /**
     * Gets the "v6UserClassOption" element
     */
    com.jagornet.dhcp.xml.V6UserClassOption getV6UserClassOption();
    
    /**
     * True if has "v6UserClassOption" element
     */
    boolean isSetV6UserClassOption();
    
    /**
     * Sets the "v6UserClassOption" element
     */
    void setV6UserClassOption(com.jagornet.dhcp.xml.V6UserClassOption v6UserClassOption);
    
    /**
     * Appends and returns a new empty "v6UserClassOption" element
     */
    com.jagornet.dhcp.xml.V6UserClassOption addNewV6UserClassOption();
    
    /**
     * Unsets the "v6UserClassOption" element
     */
    void unsetV6UserClassOption();
    
    /**
     * Gets the "v6VendorClassOption" element
     */
    com.jagornet.dhcp.xml.V6VendorClassOption getV6VendorClassOption();
    
    /**
     * True if has "v6VendorClassOption" element
     */
    boolean isSetV6VendorClassOption();
    
    /**
     * Sets the "v6VendorClassOption" element
     */
    void setV6VendorClassOption(com.jagornet.dhcp.xml.V6VendorClassOption v6VendorClassOption);
    
    /**
     * Appends and returns a new empty "v6VendorClassOption" element
     */
    com.jagornet.dhcp.xml.V6VendorClassOption addNewV6VendorClassOption();
    
    /**
     * Unsets the "v6VendorClassOption" element
     */
    void unsetV6VendorClassOption();
    
    /**
     * Gets the "v4VendorClassOption" element
     */
    com.jagornet.dhcp.xml.V4VendorClassOption getV4VendorClassOption();
    
    /**
     * True if has "v4VendorClassOption" element
     */
    boolean isSetV4VendorClassOption();
    
    /**
     * Sets the "v4VendorClassOption" element
     */
    void setV4VendorClassOption(com.jagornet.dhcp.xml.V4VendorClassOption v4VendorClassOption);
    
    /**
     * Appends and returns a new empty "v4VendorClassOption" element
     */
    com.jagornet.dhcp.xml.V4VendorClassOption addNewV4VendorClassOption();
    
    /**
     * Unsets the "v4VendorClassOption" element
     */
    void unsetV4VendorClassOption();
    
    /**
     * Gets the "operator" attribute
     */
    com.jagornet.dhcp.xml.Operator.Enum getOperator();
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    com.jagornet.dhcp.xml.Operator xgetOperator();
    
    /**
     * True if has "operator" attribute
     */
    boolean isSetOperator();
    
    /**
     * Sets the "operator" attribute
     */
    void setOperator(com.jagornet.dhcp.xml.Operator.Enum operator);
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    void xsetOperator(com.jagornet.dhcp.xml.Operator operator);
    
    /**
     * Unsets the "operator" attribute
     */
    void unsetOperator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.ClientClassExpression newInstance() {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.ClientClassExpression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.ClientClassExpression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
