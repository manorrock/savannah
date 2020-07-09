/*
 * XML Type:  ipAddressOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.IpAddressOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML ipAddressOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class IpAddressOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.IpAddressOptionType
{
    private static final long serialVersionUID = 1L;
    
    public IpAddressOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPADDRESS$0 = 
        new javax.xml.namespace.QName("", "ipAddress");
    
    
    /**
     * Gets the "ipAddress" element
     */
    public java.lang.String getIpAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ipAddress" element
     */
    public com.jagornet.dhcp.xml.IpAddress xgetIpAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ipAddress" element
     */
    public void setIpAddress(java.lang.String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPADDRESS$0);
            }
            target.setStringValue(ipAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ipAddress" element
     */
    public void xsetIpAddress(com.jagornet.dhcp.xml.IpAddress ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPADDRESS$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddress)get_store().add_element_user(IPADDRESS$0);
            }
            target.set(ipAddress);
        }
    }
}
