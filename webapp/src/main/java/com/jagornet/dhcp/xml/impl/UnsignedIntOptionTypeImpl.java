/*
 * XML Type:  unsignedIntOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedIntOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML unsignedIntOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class UnsignedIntOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.UnsignedIntOptionType
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedIntOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDINT$0 = 
        new javax.xml.namespace.QName("", "unsignedInt");
    
    
    /**
     * Gets the "unsignedInt" element
     */
    public long getUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedInt" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "unsignedInt" element
     */
    public void setUnsignedInt(long unsignedInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.setLongValue(unsignedInt);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedInt" element
     */
    public void xsetUnsignedInt(org.apache.xmlbeans.XmlUnsignedInt unsignedInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.set(unsignedInt);
        }
    }
}
