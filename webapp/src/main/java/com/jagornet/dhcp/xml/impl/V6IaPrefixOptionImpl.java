/*
 * XML Type:  v6IaPrefixOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaPrefixOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaPrefixOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaPrefixOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaPrefixOption
{
    private static final long serialVersionUID = 1L;
    
    public V6IaPrefixOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREFIXLENGTH$0 = 
        new javax.xml.namespace.QName("", "prefixLength");
    private static final javax.xml.namespace.QName IPV6PREFIX$2 = 
        new javax.xml.namespace.QName("", "ipv6Prefix");
    private static final javax.xml.namespace.QName PREFERREDLIFETIME$4 = 
        new javax.xml.namespace.QName("", "preferredLifetime");
    private static final javax.xml.namespace.QName VALIDLIFETIME$6 = 
        new javax.xml.namespace.QName("", "validLifetime");
    private static final javax.xml.namespace.QName CONFIGOPTIONS$8 = 
        new javax.xml.namespace.QName("", "configOptions");
    private static final javax.xml.namespace.QName CODE$10 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "prefixLength" element
     */
    public short getPrefixLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIXLENGTH$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "prefixLength" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetPrefixLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PREFIXLENGTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prefixLength" element
     */
    public void setPrefixLength(short prefixLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIXLENGTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIXLENGTH$0);
            }
            target.setShortValue(prefixLength);
        }
    }
    
    /**
     * Sets (as xml) the "prefixLength" element
     */
    public void xsetPrefixLength(org.apache.xmlbeans.XmlUnsignedByte prefixLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PREFIXLENGTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(PREFIXLENGTH$0);
            }
            target.set(prefixLength);
        }
    }
    
    /**
     * Gets the "ipv6Prefix" element
     */
    public java.lang.String getIpv6Prefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPV6PREFIX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ipv6Prefix" element
     */
    public com.jagornet.dhcp.xml.IpAddress xgetIpv6Prefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPV6PREFIX$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ipv6Prefix" element
     */
    public void setIpv6Prefix(java.lang.String ipv6Prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPV6PREFIX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPV6PREFIX$2);
            }
            target.setStringValue(ipv6Prefix);
        }
    }
    
    /**
     * Sets (as xml) the "ipv6Prefix" element
     */
    public void xsetIpv6Prefix(com.jagornet.dhcp.xml.IpAddress ipv6Prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPV6PREFIX$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddress)get_store().add_element_user(IPV6PREFIX$2);
            }
            target.set(ipv6Prefix);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDLIFETIME$4, 0);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PREFERREDLIFETIME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDLIFETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDLIFETIME$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PREFERREDLIFETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(PREFERREDLIFETIME$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDLIFETIME$6, 0);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(VALIDLIFETIME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDLIFETIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDLIFETIME$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(VALIDLIFETIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(VALIDLIFETIME$6);
            }
            target.set(validLifetime);
        }
    }
    
    /**
     * Gets the "configOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configOptions" element
     */
    public void setConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType configOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$8);
            }
            target.set(configOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "configOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$10);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$10);
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
            return get_store().find_attribute_user(CODE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$10);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$10);
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
            get_store().remove_attribute(CODE$10);
        }
    }
}
