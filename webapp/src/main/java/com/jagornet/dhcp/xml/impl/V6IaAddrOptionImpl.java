/*
 * XML Type:  v6IaAddrOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaAddrOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaAddrOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaAddrOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaAddrOption
{
    private static final long serialVersionUID = 1L;
    
    public V6IaAddrOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPV6ADDRESS$0 = 
        new javax.xml.namespace.QName("", "ipv6Address");
    private static final javax.xml.namespace.QName PREFERREDLIFETIME$2 = 
        new javax.xml.namespace.QName("", "preferredLifetime");
    private static final javax.xml.namespace.QName VALIDLIFETIME$4 = 
        new javax.xml.namespace.QName("", "validLifetime");
    private static final javax.xml.namespace.QName ADDRCONFIGOPTIONS$6 = 
        new javax.xml.namespace.QName("", "addrConfigOptions");
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "ipv6Address" element
     */
    public java.lang.String getIpv6Address()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPV6ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ipv6Address" element
     */
    public com.jagornet.dhcp.xml.IpAddress xgetIpv6Address()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPV6ADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ipv6Address" element
     */
    public void setIpv6Address(java.lang.String ipv6Address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPV6ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPV6ADDRESS$0);
            }
            target.setStringValue(ipv6Address);
        }
    }
    
    /**
     * Sets (as xml) the "ipv6Address" element
     */
    public void xsetIpv6Address(com.jagornet.dhcp.xml.IpAddress ipv6Address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPV6ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddress)get_store().add_element_user(IPV6ADDRESS$0);
            }
            target.set(ipv6Address);
        }
    }
    
    /**
     * Gets the "preferredLifetime" element
     */
    public long getPreferredLifetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDLIFETIME$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferredLifetime" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPreferredLifetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PREFERREDLIFETIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "preferredLifetime" element
     */
    public void setPreferredLifetime(long preferredLifetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDLIFETIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDLIFETIME$2);
            }
            target.setLongValue(preferredLifetime);
        }
    }
    
    /**
     * Sets (as xml) the "preferredLifetime" element
     */
    public void xsetPreferredLifetime(org.apache.xmlbeans.XmlUnsignedInt preferredLifetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PREFERREDLIFETIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(PREFERREDLIFETIME$2);
            }
            target.set(preferredLifetime);
        }
    }
    
    /**
     * Gets the "validLifetime" element
     */
    public long getValidLifetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDLIFETIME$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "validLifetime" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetValidLifetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(VALIDLIFETIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "validLifetime" element
     */
    public void setValidLifetime(long validLifetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDLIFETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDLIFETIME$4);
            }
            target.setLongValue(validLifetime);
        }
    }
    
    /**
     * Sets (as xml) the "validLifetime" element
     */
    public void xsetValidLifetime(org.apache.xmlbeans.XmlUnsignedInt validLifetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(VALIDLIFETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(VALIDLIFETIME$4);
            }
            target.set(validLifetime);
        }
    }
    
    /**
     * Gets the "addrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addrConfigOptions" element
     */
    public void setAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType addrConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$6);
            }
            target.set(addrConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "addrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Gets the "code" attribute
     */
    public int getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$8);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public com.jagornet.dhcp.xml.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Code target = null;
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$8);
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
            return get_store().find_attribute_user(CODE$8) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(int code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$8);
            }
            target.setIntValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(com.jagornet.dhcp.xml.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Code target = null;
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$8);
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
            get_store().remove_attribute(CODE$8);
        }
    }
}
