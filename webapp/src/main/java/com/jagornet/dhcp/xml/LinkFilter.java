/*
 * XML Type:  linkFilter
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.LinkFilter
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML linkFilter(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface LinkFilter extends com.jagornet.dhcp.xml.Filter
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("linkfiltera07etype");
    
    /**
     * Gets the "v6NaAddrPools" element
     */
    com.jagornet.dhcp.xml.V6AddressPoolsType getV6NaAddrPools();
    
    /**
     * True if has "v6NaAddrPools" element
     */
    boolean isSetV6NaAddrPools();
    
    /**
     * Sets the "v6NaAddrPools" element
     */
    void setV6NaAddrPools(com.jagornet.dhcp.xml.V6AddressPoolsType v6NaAddrPools);
    
    /**
     * Appends and returns a new empty "v6NaAddrPools" element
     */
    com.jagornet.dhcp.xml.V6AddressPoolsType addNewV6NaAddrPools();
    
    /**
     * Unsets the "v6NaAddrPools" element
     */
    void unsetV6NaAddrPools();
    
    /**
     * Gets the "v6TaAddrPools" element
     */
    com.jagornet.dhcp.xml.V6AddressPoolsType getV6TaAddrPools();
    
    /**
     * True if has "v6TaAddrPools" element
     */
    boolean isSetV6TaAddrPools();
    
    /**
     * Sets the "v6TaAddrPools" element
     */
    void setV6TaAddrPools(com.jagornet.dhcp.xml.V6AddressPoolsType v6TaAddrPools);
    
    /**
     * Appends and returns a new empty "v6TaAddrPools" element
     */
    com.jagornet.dhcp.xml.V6AddressPoolsType addNewV6TaAddrPools();
    
    /**
     * Unsets the "v6TaAddrPools" element
     */
    void unsetV6TaAddrPools();
    
    /**
     * Gets the "v6PrefixPools" element
     */
    com.jagornet.dhcp.xml.V6PrefixPoolsType getV6PrefixPools();
    
    /**
     * True if has "v6PrefixPools" element
     */
    boolean isSetV6PrefixPools();
    
    /**
     * Sets the "v6PrefixPools" element
     */
    void setV6PrefixPools(com.jagornet.dhcp.xml.V6PrefixPoolsType v6PrefixPools);
    
    /**
     * Appends and returns a new empty "v6PrefixPools" element
     */
    com.jagornet.dhcp.xml.V6PrefixPoolsType addNewV6PrefixPools();
    
    /**
     * Unsets the "v6PrefixPools" element
     */
    void unsetV6PrefixPools();
    
    /**
     * Gets the "v4AddrPools" element
     */
    com.jagornet.dhcp.xml.V4AddressPoolsType getV4AddrPools();
    
    /**
     * True if has "v4AddrPools" element
     */
    boolean isSetV4AddrPools();
    
    /**
     * Sets the "v4AddrPools" element
     */
    void setV4AddrPools(com.jagornet.dhcp.xml.V4AddressPoolsType v4AddrPools);
    
    /**
     * Appends and returns a new empty "v4AddrPools" element
     */
    com.jagornet.dhcp.xml.V4AddressPoolsType addNewV4AddrPools();
    
    /**
     * Unsets the "v4AddrPools" element
     */
    void unsetV4AddrPools();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.LinkFilter newInstance() {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.LinkFilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.LinkFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.LinkFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.LinkFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
