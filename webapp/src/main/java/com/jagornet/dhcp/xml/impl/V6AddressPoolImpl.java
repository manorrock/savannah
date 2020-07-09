/*
 * XML Type:  v6AddressPool
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6AddressPool
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6AddressPool(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6AddressPoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6AddressPool
{
    private static final long serialVersionUID = 1L;
    
    public V6AddressPoolImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGE$0 = 
        new javax.xml.namespace.QName("", "range");
    private static final javax.xml.namespace.QName POLICIES$2 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName ADDRCONFIGOPTIONS$4 = 
        new javax.xml.namespace.QName("", "addrConfigOptions");
    private static final javax.xml.namespace.QName FILTERS$6 = 
        new javax.xml.namespace.QName("", "filters");
    
    
    /**
     * Gets the "range" element
     */
    public java.lang.String getRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "range" element
     */
    public com.jagornet.dhcp.xml.Range xgetRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Range target = null;
            target = (com.jagornet.dhcp.xml.Range)get_store().find_element_user(RANGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "range" element
     */
    public void setRange(java.lang.String range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RANGE$0);
            }
            target.setStringValue(range);
        }
    }
    
    /**
     * Sets (as xml) the "range" element
     */
    public void xsetRange(com.jagornet.dhcp.xml.Range range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Range target = null;
            target = (com.jagornet.dhcp.xml.Range)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Range)get_store().add_element_user(RANGE$0);
            }
            target.set(range);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$2, 0);
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
            return get_store().count_elements(POLICIES$2) != 0;
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$2);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$2);
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
            get_store().remove_element(POLICIES$2, 0);
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$4, 0);
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
            return get_store().count_elements(ADDRCONFIGOPTIONS$4) != 0;
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$4);
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$4);
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
            get_store().remove_element(ADDRCONFIGOPTIONS$4, 0);
        }
    }
    
    /**
     * Gets the "filters" element
     */
    public com.jagornet.dhcp.xml.FiltersType getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FiltersType target = null;
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$6) != 0;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(com.jagornet.dhcp.xml.FiltersType filters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FiltersType target = null;
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$6);
            }
            target.set(filters);
        }
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public com.jagornet.dhcp.xml.FiltersType addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FiltersType target = null;
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$6, 0);
        }
    }
}
