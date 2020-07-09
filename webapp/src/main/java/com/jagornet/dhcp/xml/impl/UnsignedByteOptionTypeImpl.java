/*
 * XML Type:  unsignedByteOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedByteOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML unsignedByteOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class UnsignedByteOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.UnsignedByteOptionType
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedByteOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDBYTE$0 = 
        new javax.xml.namespace.QName("", "unsignedByte");
    
    
    /**
     * Gets the "unsignedByte" element
     */
    public short getUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedByte" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "unsignedByte" element
     */
    public void setUnsignedByte(short unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.setShortValue(unsignedByte);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedByte" element
     */
    public void xsetUnsignedByte(org.apache.xmlbeans.XmlUnsignedByte unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.set(unsignedByte);
        }
    }
}
