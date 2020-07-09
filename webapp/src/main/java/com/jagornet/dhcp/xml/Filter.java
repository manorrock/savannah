/*
 * XML Type:  filter
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.Filter
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML filter(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface Filter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("filteree58type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    com.jagornet.dhcp.xml.Name xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(com.jagornet.dhcp.xml.Name name);
    
    /**
     * Gets the "filterExpressions" element
     */
    com.jagornet.dhcp.xml.FilterExpressionsType getFilterExpressions();
    
    /**
     * Sets the "filterExpressions" element
     */
    void setFilterExpressions(com.jagornet.dhcp.xml.FilterExpressionsType filterExpressions);
    
    /**
     * Appends and returns a new empty "filterExpressions" element
     */
    com.jagornet.dhcp.xml.FilterExpressionsType addNewFilterExpressions();
    
    /**
     * Gets the "policies" element
     */
    com.jagornet.dhcp.xml.PoliciesType getPolicies();
    
    /**
     * True if has "policies" element
     */
    boolean isSetPolicies();
    
    /**
     * Sets the "policies" element
     */
    void setPolicies(com.jagornet.dhcp.xml.PoliciesType policies);
    
    /**
     * Appends and returns a new empty "policies" element
     */
    com.jagornet.dhcp.xml.PoliciesType addNewPolicies();
    
    /**
     * Unsets the "policies" element
     */
    void unsetPolicies();
    
    /**
     * Gets the "v6MsgConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6MsgConfigOptions();
    
    /**
     * True if has "v6MsgConfigOptions" element
     */
    boolean isSetV6MsgConfigOptions();
    
    /**
     * Sets the "v6MsgConfigOptions" element
     */
    void setV6MsgConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6MsgConfigOptions);
    
    /**
     * Appends and returns a new empty "v6MsgConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6MsgConfigOptions();
    
    /**
     * Unsets the "v6MsgConfigOptions" element
     */
    void unsetV6MsgConfigOptions();
    
    /**
     * Gets the "v6IaNaConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaNaConfigOptions();
    
    /**
     * True if has "v6IaNaConfigOptions" element
     */
    boolean isSetV6IaNaConfigOptions();
    
    /**
     * Sets the "v6IaNaConfigOptions" element
     */
    void setV6IaNaConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaNaConfigOptions);
    
    /**
     * Appends and returns a new empty "v6IaNaConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaNaConfigOptions();
    
    /**
     * Unsets the "v6IaNaConfigOptions" element
     */
    void unsetV6IaNaConfigOptions();
    
    /**
     * Gets the "v6NaAddrConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6NaAddrConfigOptions();
    
    /**
     * True if has "v6NaAddrConfigOptions" element
     */
    boolean isSetV6NaAddrConfigOptions();
    
    /**
     * Sets the "v6NaAddrConfigOptions" element
     */
    void setV6NaAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6NaAddrConfigOptions);
    
    /**
     * Appends and returns a new empty "v6NaAddrConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6NaAddrConfigOptions();
    
    /**
     * Unsets the "v6NaAddrConfigOptions" element
     */
    void unsetV6NaAddrConfigOptions();
    
    /**
     * Gets the "v6IaTaConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaTaConfigOptions();
    
    /**
     * True if has "v6IaTaConfigOptions" element
     */
    boolean isSetV6IaTaConfigOptions();
    
    /**
     * Sets the "v6IaTaConfigOptions" element
     */
    void setV6IaTaConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaTaConfigOptions);
    
    /**
     * Appends and returns a new empty "v6IaTaConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaTaConfigOptions();
    
    /**
     * Unsets the "v6IaTaConfigOptions" element
     */
    void unsetV6IaTaConfigOptions();
    
    /**
     * Gets the "v6TaAddrConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6TaAddrConfigOptions();
    
    /**
     * True if has "v6TaAddrConfigOptions" element
     */
    boolean isSetV6TaAddrConfigOptions();
    
    /**
     * Sets the "v6TaAddrConfigOptions" element
     */
    void setV6TaAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6TaAddrConfigOptions);
    
    /**
     * Appends and returns a new empty "v6TaAddrConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6TaAddrConfigOptions();
    
    /**
     * Unsets the "v6TaAddrConfigOptions" element
     */
    void unsetV6TaAddrConfigOptions();
    
    /**
     * Gets the "v6IaPdConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaPdConfigOptions();
    
    /**
     * True if has "v6IaPdConfigOptions" element
     */
    boolean isSetV6IaPdConfigOptions();
    
    /**
     * Sets the "v6IaPdConfigOptions" element
     */
    void setV6IaPdConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaPdConfigOptions);
    
    /**
     * Appends and returns a new empty "v6IaPdConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaPdConfigOptions();
    
    /**
     * Unsets the "v6IaPdConfigOptions" element
     */
    void unsetV6IaPdConfigOptions();
    
    /**
     * Gets the "v6PrefixConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getV6PrefixConfigOptions();
    
    /**
     * True if has "v6PrefixConfigOptions" element
     */
    boolean isSetV6PrefixConfigOptions();
    
    /**
     * Sets the "v6PrefixConfigOptions" element
     */
    void setV6PrefixConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6PrefixConfigOptions);
    
    /**
     * Appends and returns a new empty "v6PrefixConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6PrefixConfigOptions();
    
    /**
     * Unsets the "v6PrefixConfigOptions" element
     */
    void unsetV6PrefixConfigOptions();
    
    /**
     * Gets the "v4ConfigOptions" element
     */
    com.jagornet.dhcp.xml.V4ConfigOptionsType getV4ConfigOptions();
    
    /**
     * True if has "v4ConfigOptions" element
     */
    boolean isSetV4ConfigOptions();
    
    /**
     * Sets the "v4ConfigOptions" element
     */
    void setV4ConfigOptions(com.jagornet.dhcp.xml.V4ConfigOptionsType v4ConfigOptions);
    
    /**
     * Appends and returns a new empty "v4ConfigOptions" element
     */
    com.jagornet.dhcp.xml.V4ConfigOptionsType addNewV4ConfigOptions();
    
    /**
     * Unsets the "v4ConfigOptions" element
     */
    void unsetV4ConfigOptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.Filter newInstance() {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.Filter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.Filter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.Filter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Filter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Filter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
