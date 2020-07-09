/*
 * XML Type:  unsignedShortListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedShortListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML unsignedShortListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface UnsignedShortListOptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnsignedShortListOptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("unsignedshortlistoptiontype66cetype");
    
    /**
     * Gets a List of "unsignedShort" elements
     */
    java.util.List<java.lang.Integer> getUnsignedShortList();
    
    /**
     * Gets array of all "unsignedShort" elements
     * @deprecated
     */
    int[] getUnsignedShortArray();
    
    /**
     * Gets ith "unsignedShort" element
     */
    int getUnsignedShortArray(int i);
    
    /**
     * Gets (as xml) a List of "unsignedShort" elements
     */
    java.util.List<org.apache.xmlbeans.XmlUnsignedShort> xgetUnsignedShortList();
    
    /**
     * Gets (as xml) array of all "unsignedShort" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlUnsignedShort[] xgetUnsignedShortArray();
    
    /**
     * Gets (as xml) ith "unsignedShort" element
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetUnsignedShortArray(int i);
    
    /**
     * Returns number of "unsignedShort" element
     */
    int sizeOfUnsignedShortArray();
    
    /**
     * Sets array of all "unsignedShort" element
     */
    void setUnsignedShortArray(int[] unsignedShortArray);
    
    /**
     * Sets ith "unsignedShort" element
     */
    void setUnsignedShortArray(int i, int unsignedShort);
    
    /**
     * Sets (as xml) array of all "unsignedShort" element
     */
    void xsetUnsignedShortArray(org.apache.xmlbeans.XmlUnsignedShort[] unsignedShortArray);
    
    /**
     * Sets (as xml) ith "unsignedShort" element
     */
    void xsetUnsignedShortArray(int i, org.apache.xmlbeans.XmlUnsignedShort unsignedShort);
    
    /**
     * Inserts the value as the ith "unsignedShort" element
     */
    void insertUnsignedShort(int i, int unsignedShort);
    
    /**
     * Appends the value as the last "unsignedShort" element
     */
    void addUnsignedShort(int unsignedShort);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unsignedShort" element
     */
    org.apache.xmlbeans.XmlUnsignedShort insertNewUnsignedShort(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unsignedShort" element
     */
    org.apache.xmlbeans.XmlUnsignedShort addNewUnsignedShort();
    
    /**
     * Removes the ith "unsignedShort" element
     */
    void removeUnsignedShort(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType newInstance() {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.UnsignedShortListOptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.UnsignedShortListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
