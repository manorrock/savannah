/*
 * XML Type:  unsignedByteListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedByteListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml;


/**
 * An XML unsignedByteListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public interface UnsignedByteListOptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnsignedByteListOptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD56CBE84D5CF418F95EC3D8B4674371").resolveHandle("unsignedbytelistoptiontype1206type");
    
    /**
     * Gets a List of "unsignedByte" elements
     */
    java.util.List<java.lang.Short> getUnsignedByteList();
    
    /**
     * Gets array of all "unsignedByte" elements
     * @deprecated
     */
    short[] getUnsignedByteArray();
    
    /**
     * Gets ith "unsignedByte" element
     */
    short getUnsignedByteArray(int i);
    
    /**
     * Gets (as xml) a List of "unsignedByte" elements
     */
    java.util.List<org.apache.xmlbeans.XmlUnsignedByte> xgetUnsignedByteList();
    
    /**
     * Gets (as xml) array of all "unsignedByte" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlUnsignedByte[] xgetUnsignedByteArray();
    
    /**
     * Gets (as xml) ith "unsignedByte" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetUnsignedByteArray(int i);
    
    /**
     * Returns number of "unsignedByte" element
     */
    int sizeOfUnsignedByteArray();
    
    /**
     * Sets array of all "unsignedByte" element
     */
    void setUnsignedByteArray(short[] unsignedByteArray);
    
    /**
     * Sets ith "unsignedByte" element
     */
    void setUnsignedByteArray(int i, short unsignedByte);
    
    /**
     * Sets (as xml) array of all "unsignedByte" element
     */
    void xsetUnsignedByteArray(org.apache.xmlbeans.XmlUnsignedByte[] unsignedByteArray);
    
    /**
     * Sets (as xml) ith "unsignedByte" element
     */
    void xsetUnsignedByteArray(int i, org.apache.xmlbeans.XmlUnsignedByte unsignedByte);
    
    /**
     * Inserts the value as the ith "unsignedByte" element
     */
    void insertUnsignedByte(int i, short unsignedByte);
    
    /**
     * Appends the value as the last "unsignedByte" element
     */
    void addUnsignedByte(short unsignedByte);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unsignedByte" element
     */
    org.apache.xmlbeans.XmlUnsignedByte insertNewUnsignedByte(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unsignedByte" element
     */
    org.apache.xmlbeans.XmlUnsignedByte addNewUnsignedByte();
    
    /**
     * Removes the ith "unsignedByte" element
     */
    void removeUnsignedByte(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType newInstance() {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.jagornet.dhcp.xml.UnsignedByteListOptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.jagornet.dhcp.xml.UnsignedByteListOptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
