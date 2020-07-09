/*
 * XML Type:  v6AddressBinding
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6AddressBinding
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6AddressBinding(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6AddressBindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6AddressBinding
{
    private static final long serialVersionUID = 1L;
    
    public V6AddressBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPADDRESS$0 = 
        new javax.xml.namespace.QName("", "ipAddress");
    private static final javax.xml.namespace.QName DUID$2 = 
        new javax.xml.namespace.QName("", "duid");
    private static final javax.xml.namespace.QName IAID$4 = 
        new javax.xml.namespace.QName("", "iaid");
    private static final javax.xml.namespace.QName POLICIES$6 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName ADDRCONFIGOPTIONS$8 = 
        new javax.xml.namespace.QName("", "addrConfigOptions");
    
    
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
     * Gets the "duid" element
     */
    public com.jagornet.dhcp.xml.OpaqueData getDuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(DUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "duid" element
     */
    public void setDuid(com.jagornet.dhcp.xml.OpaqueData duid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(DUID$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(DUID$2);
            }
            target.set(duid);
        }
    }
    
    /**
     * Appends and returns a new empty "duid" element
     */
    public com.jagornet.dhcp.xml.OpaqueData addNewDuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(DUID$2);
            return target;
        }
    }
    
    /**
     * Gets the "iaid" element
     */
    public long getIaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iaid" element
     */
    public com.jagornet.dhcp.xml.IaId xgetIaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IaId target = null;
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "iaid" element
     */
    public boolean isSetIaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IAID$4) != 0;
        }
    }
    
    /**
     * Sets the "iaid" element
     */
    public void setIaid(long iaid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IAID$4);
            }
            target.setLongValue(iaid);
        }
    }
    
    /**
     * Sets (as xml) the "iaid" element
     */
    public void xsetIaid(com.jagornet.dhcp.xml.IaId iaid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IaId target = null;
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IaId)get_store().add_element_user(IAID$4);
            }
            target.set(iaid);
        }
    }
    
    /**
     * Unsets the "iaid" element
     */
    public void unsetIaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IAID$4, 0);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$6, 0);
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
            return get_store().count_elements(POLICIES$6) != 0;
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$6);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$6);
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
            get_store().remove_element(POLICIES$6, 0);
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addrConfigOptions" element
     */
    public boolean isSetAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRCONFIGOPTIONS$8) != 0;
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$8);
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "addrConfigOptions" element
     */
    public void unsetAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRCONFIGOPTIONS$8, 0);
        }
    }
}
