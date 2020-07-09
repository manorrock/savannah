/*
 * XML Type:  unsignedShortOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedShortOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML unsignedShortOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class UnsignedShortOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.UnsignedShortOptionType
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedShortOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDSHORT$0 = 
        new javax.xml.namespace.QName("", "unsignedShort");
    
    
    /**
     * Gets the "unsignedShort" element
     */
    public int getUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedShort" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "unsignedShort" element
     */
    public void setUnsignedShort(int unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.setIntValue(unsignedShort);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedShort" element
     */
    public void xsetUnsignedShort(org.apache.xmlbeans.XmlUnsignedShort unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.set(unsignedShort);
        }
    }
}
