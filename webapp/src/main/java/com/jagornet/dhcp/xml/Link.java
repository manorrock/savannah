/*
 * XML Type:  link
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.Link
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML link(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface Link extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("link82d6type");
    
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
     * Gets the "interface" element
     */
    java.lang.String getInterface();
    
    /**
     * Gets (as xml) the "interface" element
     */
    org.apache.xmlbeans.XmlString xgetInterface();
    
    /**
     * True if has "interface" element
     */
    boolean isSetInterface();
    
    /**
     * Sets the "interface" element
     */
    void setInterface(java.lang.String xinterface);
    
    /**
     * Sets (as xml) the "interface" element
     */
    void xsetInterface(org.apache.xmlbeans.XmlString xinterface);
    
    /**
     * Unsets the "interface" element
     */
    void unsetInterface();
    
    /**
     * Gets the "address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "v6ServerIdOption" element
     */
    com.jagornet.dhcp.xml.V6ServerIdOption getV6ServerIdOption();
    
    /**
     * True if has "v6ServerIdOption" element
     */
    boolean isSetV6ServerIdOption();
    
    /**
     * Sets the "v6ServerIdOption" element
     */
    void setV6ServerIdOption(com.jagornet.dhcp.xml.V6ServerIdOption v6ServerIdOption);
    
    /**
     * Appends and returns a new empty "v6ServerIdOption" element
     */
    com.jagornet.dhcp.xml.V6ServerIdOption addNewV6ServerIdOption();
    
    /**
     * Unsets the "v6ServerIdOption" element
     */
    void unsetV6ServerIdOption();
    
    /**
     * Gets the "v4ServerIdOption" element
     */
    com.jagornet.dhcp.xml.V4ServerIdOption getV4ServerIdOption();
    
    /**
     * True if has "v4ServerIdOption" element
     */
    boolean isSetV4ServerIdOption();
    
    /**
     * Sets the "v4ServerIdOption" element
     */
    void setV4ServerIdOption(com.jagornet.dhcp.xml.V4ServerIdOption v4ServerIdOption);
    
    /**
     * Appends and returns a new empty "v4ServerIdOption" element
     */
    com.jagornet.dhcp.xml.V4ServerIdOption addNewV4ServerIdOption();
    
    /**
     * Unsets the "v4ServerIdOption" element
     */
    void unsetV4ServerIdOption();
    
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
     * Gets the "v6NaAddrBindings" element
     */
    com.jagornet.dhcp.xml.V6AddressBindingsType getV6NaAddrBindings();
    
    /**
     * True if has "v6NaAddrBindings" element
     */
    boolean isSetV6NaAddrBindings();
    
    /**
     * Sets the "v6NaAddrBindings" element
     */
    void setV6NaAddrBindings(com.jagornet.dhcp.xml.V6AddressBindingsType v6NaAddrBindings);
    
    /**
     * Appends and returns a new empty "v6NaAddrBindings" element
     */
    com.jagornet.dhcp.xml.V6AddressBindingsType addNewV6NaAddrBindings();
    
    /**
     * Unsets the "v6NaAddrBindings" element
     */
    void unsetV6NaAddrBindings();
    
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
     * Gets the "v6TaAddrBindings" element
     */
    com.jagornet.dhcp.xml.V6AddressBindingsType getV6TaAddrBindings();
    
    /**
     * True if has "v6TaAddrBindings" element
     */
    boolean isSetV6TaAddrBindings();
    
    /**
     * Sets the "v6TaAddrBindings" element
     */
    void setV6TaAddrBindings(com.jagornet.dhcp.xml.V6AddressBindingsType v6TaAddrBindings);
    
    /**
     * Appends and returns a new empty "v6TaAddrBindings" element
     */
    com.jagornet.dhcp.xml.V6AddressBindingsType addNewV6TaAddrBindings();
    
    /**
     * Unsets the "v6TaAddrBindings" element
     */
    void unsetV6TaAddrBindings();
    
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
     * Gets the "v6PrefixBindings" element
     */
    com.jagornet.dhcp.xml.V6PrefixBindingsType getV6PrefixBindings();
    
    /**
     * True if has "v6PrefixBindings" element
     */
    boolean isSetV6PrefixBindings();
    
    /**
     * Sets the "v6PrefixBindings" element
     */
    void setV6PrefixBindings(com.jagornet.dhcp.xml.V6PrefixBindingsType v6PrefixBindings);
    
    /**
     * Appends and returns a new empty "v6PrefixBindings" element
     */
    com.jagornet.dhcp.xml.V6PrefixBindingsType addNewV6PrefixBindings();
    
    /**
     * Unsets the "v6PrefixBindings" element
     */
    void unsetV6PrefixBindings();
    
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
     * Gets the "v4AddrBindings" element
     */
    com.jagornet.dhcp.xml.V4AddressBindingsType getV4AddrBindings();
    
    /**
     * True if has "v4AddrBindings" element
     */
    boolean isSetV4AddrBindings();
    
    /**
     * Sets the "v4AddrBindings" element
     */
    void setV4AddrBindings(com.jagornet.dhcp.xml.V4AddressBindingsType v4AddrBindings);
    
    /**
     * Appends and returns a new empty "v4AddrBindings" element
     */
    com.jagornet.dhcp.xml.V4AddressBindingsType addNewV4AddrBindings();
    
    /**
     * Unsets the "v4AddrBindings" element
     */
    void unsetV4AddrBindings();
    
    /**
     * Gets the "linkFilters" element
     */
    com.jagornet.dhcp.xml.LinkFiltersType getLinkFilters();
    
    /**
     * True if has "linkFilters" element
     */
    boolean isSetLinkFilters();
    
    /**
     * Sets the "linkFilters" element
     */
    void setLinkFilters(com.jagornet.dhcp.xml.LinkFiltersType linkFilters);
    
    /**
     * Appends and returns a new empty "linkFilters" element
     */
    com.jagornet.dhcp.xml.LinkFiltersType addNewLinkFilters();
    
    /**
     * Unsets the "linkFilters" element
     */
    void unsetLinkFilters();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.Link newInstance() {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.Link parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.Link parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.Link parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.Link parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.Link parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Link parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.Link parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
