/*
 * XML Type:  opaqueData
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.OpaqueData
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML opaqueData(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class OpaqueDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.OpaqueData
{
    private static final long serialVersionUID = 1L;
    
    public OpaqueDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASCIIVALUE$0 = 
        new javax.xml.namespace.QName("", "asciiValue");
    private static final javax.xml.namespace.QName HEXVALUE$2 = 
        new javax.xml.namespace.QName("", "hexValue");
    
    
    /**
     * Gets the "asciiValue" element
     */
    public java.lang.String getAsciiValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCIIVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "asciiValue" element
     */
    public org.apache.xmlbeans.XmlString xgetAsciiValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASCIIVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "asciiValue" element
     */
    public boolean isSetAsciiValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASCIIVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "asciiValue" element
     */
    public void setAsciiValue(java.lang.String asciiValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCIIVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASCIIVALUE$0);
            }
            target.setStringValue(asciiValue);
        }
    }
    
    /**
     * Sets (as xml) the "asciiValue" element
     */
    public void xsetAsciiValue(org.apache.xmlbeans.XmlString asciiValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASCIIVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASCIIVALUE$0);
            }
            target.set(asciiValue);
        }
    }
    
    /**
     * Unsets the "asciiValue" element
     */
    public void unsetAsciiValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASCIIVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "hexValue" element
     */
    public byte[] getHexValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEXVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "hexValue" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetHexValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(HEXVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "hexValue" element
     */
    public boolean isSetHexValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEXVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "hexValue" element
     */
    public void setHexValue(byte[] hexValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEXVALUE$2);
            }
            target.setByteArrayValue(hexValue);
        }
    }
    
    /**
     * Sets (as xml) the "hexValue" element
     */
    public void xsetHexValue(org.apache.xmlbeans.XmlHexBinary hexValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(HEXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(HEXVALUE$2);
            }
            target.set(hexValue);
        }
    }
    
    /**
     * Unsets the "hexValue" element
     */
    public void unsetHexValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEXVALUE$2, 0);
        }
    }
}
