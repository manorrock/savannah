/*
 * XML Type:  v6PrefixBinding
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6PrefixBinding
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML v6PrefixBinding(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface V6PrefixBinding extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(V6PrefixBinding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("v6prefixbinding2eaftype");
    
    /**
     * Gets the "prefix" element
     */
    java.lang.String getPrefix();
    
    /**
     * Gets (as xml) the "prefix" element
     */
    com.jagornet.dhcp.xml.IpAddress xgetPrefix();
    
    /**
     * Sets the "prefix" element
     */
    void setPrefix(java.lang.String prefix);
    
    /**
     * Sets (as xml) the "prefix" element
     */
    void xsetPrefix(com.jagornet.dhcp.xml.IpAddress prefix);
    
    /**
     * Gets the "prefixLength" element
     */
    int getPrefixLength();
    
    /**
     * Gets (as xml) the "prefixLength" element
     */
    com.jagornet.dhcp.xml.Length xgetPrefixLength();
    
    /**
     * Sets the "prefixLength" element
     */
    void setPrefixLength(int prefixLength);
    
    /**
     * Sets (as xml) the "prefixLength" element
     */
    void xsetPrefixLength(com.jagornet.dhcp.xml.Length prefixLength);
    
    /**
     * Gets the "duid" element
     */
    com.jagornet.dhcp.xml.OpaqueData getDuid();
    
    /**
     * Sets the "duid" element
     */
    void setDuid(com.jagornet.dhcp.xml.OpaqueData duid);
    
    /**
     * Appends and returns a new empty "duid" element
     */
    com.jagornet.dhcp.xml.OpaqueData addNewDuid();
    
    /**
     * Gets the "iaid" element
     */
    long getIaid();
    
    /**
     * Gets (as xml) the "iaid" element
     */
    com.jagornet.dhcp.xml.IaId xgetIaid();
    
    /**
     * True if has "iaid" element
     */
    boolean isSetIaid();
    
    /**
     * Sets the "iaid" element
     */
    void setIaid(long iaid);
    
    /**
     * Sets (as xml) the "iaid" element
     */
    void xsetIaid(com.jagornet.dhcp.xml.IaId iaid);
    
    /**
     * Unsets the "iaid" element
     */
    void unsetIaid();
    
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
     * Gets the "prefixConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType getPrefixConfigOptions();
    
    /**
     * True if has "prefixConfigOptions" element
     */
    boolean isSetPrefixConfigOptions();
    
    /**
     * Sets the "prefixConfigOptions" element
     */
    void setPrefixConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType prefixConfigOptions);
    
    /**
     * Appends and returns a new empty "prefixConfigOptions" element
     */
    com.jagornet.dhcp.xml.V6ConfigOptionsType addNewPrefixConfigOptions();
    
    /**
     * Unsets the "prefixConfigOptions" element
     */
    void unsetPrefixConfigOptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.V6PrefixBinding newInstance() {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.V6PrefixBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.V6PrefixBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
