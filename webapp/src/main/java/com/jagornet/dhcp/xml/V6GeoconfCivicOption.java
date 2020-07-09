/*
 * XML Type:  v6GeoconfCivicOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6GeoconfCivicOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML v6GeoconfCivicOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface V6GeoconfCivicOption extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(V6GeoconfCivicOption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("v6geoconfcivicoptionba66type");
    
    /**
     * Gets the "what" element
     */
    short getWhat();
    
    /**
     * Gets (as xml) the "what" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetWhat();
    
    /**
     * Sets the "what" element
     */
    void setWhat(short what);
    
    /**
     * Sets (as xml) the "what" element
     */
    void xsetWhat(org.apache.xmlbeans.XmlUnsignedByte what);
    
    /**
     * Gets the "countryCode" element
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "countryCode" element
     */
    com.jagornet.dhcp.xml.CountryCode xgetCountryCode();
    
    /**
     * Sets the "countryCode" element
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "countryCode" element
     */
    void xsetCountryCode(com.jagornet.dhcp.xml.CountryCode countryCode);
    
    /**
     * Gets a List of "civicAddressElement" elements
     */
    java.util.List<com.jagornet.dhcp.xml.CivicAddressElement> getCivicAddressElementList();
    
    /**
     * Gets array of all "civicAddressElement" elements
     * @deprecated
     */
    com.jagornet.dhcp.xml.CivicAddressElement[] getCivicAddressElementArray();
    
    /**
     * Gets ith "civicAddressElement" element
     */
    com.jagornet.dhcp.xml.CivicAddressElement getCivicAddressElementArray(int i);
    
    /**
     * Returns number of "civicAddressElement" element
     */
    int sizeOfCivicAddressElementArray();
    
    /**
     * Sets array of all "civicAddressElement" element
     */
    void setCivicAddressElementArray(com.jagornet.dhcp.xml.CivicAddressElement[] civicAddressElementArray);
    
    /**
     * Sets ith "civicAddressElement" element
     */
    void setCivicAddressElementArray(int i, com.jagornet.dhcp.xml.CivicAddressElement civicAddressElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "civicAddressElement" element
     */
    com.jagornet.dhcp.xml.CivicAddressElement insertNewCivicAddressElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "civicAddressElement" element
     */
    com.jagornet.dhcp.xml.CivicAddressElement addNewCivicAddressElement();
    
    /**
     * Removes the ith "civicAddressElement" element
     */
    void removeCivicAddressElement(int i);
    
    /**
     * Gets the "code" attribute
     */
    int getCode();
    
    /**
     * Gets (as xml) the "code" attribute
     */
    com.jagornet.dhcp.xml.Code xgetCode();
    
    /**
     * True if has "code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" attribute
     */
    void setCode(int code);
    
    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(com.jagornet.dhcp.xml.Code code);
    
    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption newInstance() {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.V6GeoconfCivicOption parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.V6GeoconfCivicOption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
