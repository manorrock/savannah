/*
 * XML Type:  v6PrefixBinding
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6PrefixBinding
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6PrefixBinding(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6PrefixBindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6PrefixBinding
{
    private static final long serialVersionUID = 1L;
    
    public V6PrefixBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREFIX$0 = 
        new javax.xml.namespace.QName("", "prefix");
    private static final javax.xml.namespace.QName PREFIXLENGTH$2 = 
        new javax.xml.namespace.QName("", "prefixLength");
    private static final javax.xml.namespace.QName DUID$4 = 
        new javax.xml.namespace.QName("", "duid");
    private static final javax.xml.namespace.QName IAID$6 = 
        new javax.xml.namespace.QName("", "iaid");
    private static final javax.xml.namespace.QName POLICIES$8 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName PREFIXCONFIGOPTIONS$10 = 
        new javax.xml.namespace.QName("", "prefixConfigOptions");
    
    
    /**
     * Gets the "prefix" element
     */
    public java.lang.String getPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prefix" element
     */
    public com.jagornet.dhcp.xml.IpAddress xgetPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(PREFIX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prefix" element
     */
    public void setPrefix(java.lang.String prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
            }
            target.setStringValue(prefix);
        }
    }
    
    /**
     * Sets (as xml) the "prefix" element
     */
    public void xsetPrefix(com.jagornet.dhcp.xml.IpAddress prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(PREFIX$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddress)get_store().add_element_user(PREFIX$0);
            }
            target.set(prefix);
        }
    }
    
    /**
     * Gets the "prefixLength" element
     */
    public int getPrefixLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIXLENGTH$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "prefixLength" element
     */
    public com.jagornet.dhcp.xml.Length xgetPrefixLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Length target = null;
            target = (com.jagornet.dhcp.xml.Length)get_store().find_element_user(PREFIXLENGTH$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "prefixLength" element
     */
    public void setPrefixLength(int prefixLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIXLENGTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIXLENGTH$2);
            }
            target.setIntValue(prefixLength);
        }
    }
    
    /**
     * Sets (as xml) the "prefixLength" element
     */
    public void xsetPrefixLength(com.jagornet.dhcp.xml.Length prefixLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Length target = null;
            target = (com.jagornet.dhcp.xml.Length)get_store().find_element_user(PREFIXLENGTH$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Length)get_store().add_element_user(PREFIXLENGTH$2);
            }
            target.set(prefixLength);
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
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(DUID$4, 0);
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
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(DUID$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(DUID$4);
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
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(DUID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$6, 0);
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
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$6, 0);
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
            return get_store().count_elements(IAID$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IAID$6);
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
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IaId)get_store().add_element_user(IAID$6);
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
            get_store().remove_element(IAID$6, 0);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$8, 0);
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
            return get_store().count_elements(POLICIES$8) != 0;
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$8);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$8);
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
            get_store().remove_element(POLICIES$8, 0);
        }
    }
    
    /**
     * Gets the "prefixConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getPrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(PREFIXCONFIGOPTIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prefixConfigOptions" element
     */
    public boolean isSetPrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIXCONFIGOPTIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "prefixConfigOptions" element
     */
    public void setPrefixConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType prefixConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(PREFIXCONFIGOPTIONS$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(PREFIXCONFIGOPTIONS$10);
            }
            target.set(prefixConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "prefixConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewPrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(PREFIXCONFIGOPTIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "prefixConfigOptions" element
     */
    public void unsetPrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIXCONFIGOPTIONS$10, 0);
        }
    }
}
