/*
 * XML Type:  domainNameOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.DomainNameOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML domainNameOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class DomainNameOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.DomainNameOptionType
{
    private static final long serialVersionUID = 1L;
    
    public DomainNameOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINNAME$0 = 
        new javax.xml.namespace.QName("", "domainName");
    
    
    /**
     * Gets the "domainName" element
     */
    public java.lang.String getDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainName" element
     */
    public com.jagornet.dhcp.xml.DomainName xgetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().find_element_user(DOMAINNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domainName" element
     */
    public void setDomainName(java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$0);
            }
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Sets (as xml) the "domainName" element
     */
    public void xsetDomainName(com.jagornet.dhcp.xml.DomainName domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.DomainName)get_store().add_element_user(DOMAINNAME$0);
            }
            target.set(domainName);
        }
    }
}
