/*
 * XML Type:  v4AddressBinding
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V4AddressBinding
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v4AddressBinding(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V4AddressBindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V4AddressBinding
{
    private static final long serialVersionUID = 1L;
    
    public V4AddressBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPADDRESS$0 = 
        new javax.xml.namespace.QName("", "ipAddress");
    private static final javax.xml.namespace.QName CHADDR$2 = 
        new javax.xml.namespace.QName("", "chaddr");
    private static final javax.xml.namespace.QName POLICIES$4 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName CONFIGOPTIONS$6 = 
        new javax.xml.namespace.QName("", "configOptions");
    
    
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
    
    /**
     * Gets the "chaddr" element
     */
    public byte[] getChaddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHADDR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "chaddr" element
     */
    public com.jagornet.dhcp.xml.MacAddress xgetChaddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.MacAddress target = null;
            target = (com.jagornet.dhcp.xml.MacAddress)get_store().find_element_user(CHADDR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chaddr" element
     */
    public void setChaddr(byte[] chaddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHADDR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHADDR$2);
            }
            target.setByteArrayValue(chaddr);
        }
    }
    
    /**
     * Sets (as xml) the "chaddr" element
     */
    public void xsetChaddr(com.jagornet.dhcp.xml.MacAddress chaddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.MacAddress target = null;
            target = (com.jagornet.dhcp.xml.MacAddress)get_store().find_element_user(CHADDR$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.MacAddress)get_store().add_element_user(CHADDR$2);
            }
            target.set(chaddr);
        }
    }
    
    /**
     * Gets the "policies" element
     */
    public com.jagornet.dhcp.xml.PoliciesType getPolicies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.PoliciesType target = null;
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "policies" element
     */
    public boolean isSetPolicies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICIES$4) != 0;
        }
    }
    
    /**
     * Sets the "policies" element
     */
    public void setPolicies(com.jagornet.dhcp.xml.PoliciesType policies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.PoliciesType target = null;
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$4);
            }
            target.set(policies);
        }
    }
    
    /**
     * Appends and returns a new empty "policies" element
     */
    public com.jagornet.dhcp.xml.PoliciesType addNewPolicies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.PoliciesType target = null;
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "policies" element
     */
    public void unsetPolicies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICIES$4, 0);
        }
    }
    
    /**
     * Gets the "configOptions" element
     */
    public com.jagornet.dhcp.xml.V4ConfigOptionsType getConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "configOptions" element
     */
    public boolean isSetConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGOPTIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "configOptions" element
     */
    public void setConfigOptions(com.jagornet.dhcp.xml.V4ConfigOptionsType configOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$6);
            }
            target.set(configOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "configOptions" element
     */
    public com.jagornet.dhcp.xml.V4ConfigOptionsType addNewConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "configOptions" element
     */
    public void unsetConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGOPTIONS$6, 0);
        }
    }
}
