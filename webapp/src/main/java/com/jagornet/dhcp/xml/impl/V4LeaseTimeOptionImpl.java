/*
 * XML Type:  v4LeaseTimeOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V4LeaseTimeOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v4LeaseTimeOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V4LeaseTimeOptionImpl extends com.jagornet.dhcp.xml.impl.UnsignedIntOptionTypeImpl implements com.jagornet.dhcp.xml.V4LeaseTimeOption
{
    private static final long serialVersionUID = 1L;
    
    public V4LeaseTimeOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "code" attribute
     */
    public short getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public com.jagornet.dhcp.xml.V4Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4Code target = null;
            target = (com.jagornet.dhcp.xml.V4Code)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4Code)get_default_attribute_value(CODE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$0) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(short code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
            }
            target.setShortValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(com.jagornet.dhcp.xml.V4Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4Code target = null;
            target = (com.jagornet.dhcp.xml.V4Code)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4Code)get_store().add_attribute_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$0);
        }
    }
}
