/*
 * XML Type:  v6PrefixPool
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6PrefixPool
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6PrefixPool(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6PrefixPoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6PrefixPool
{
    private static final long serialVersionUID = 1L;
    
    public V6PrefixPoolImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGE$0 = 
        new javax.xml.namespace.QName("", "range");
    private static final javax.xml.namespace.QName PREFIXLENGTH$2 = 
        new javax.xml.namespace.QName("", "prefixLength");
    private static final javax.xml.namespace.QName POLICIES$4 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName PREFIXCONFIGOPTIONS$6 = 
        new javax.xml.namespace.QName("", "prefixConfigOptions");
    private static final javax.xml.namespace.QName FILTERS$8 = 
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
     * Gets the "prefixConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getPrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(PREFIXCONFIGOPTIONS$6, 0);
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
            return get_store().count_elements(PREFIXCONFIGOPTIONS$6) != 0;
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(PREFIXCONFIGOPTIONS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(PREFIXCONFIGOPTIONS$6);
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
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(PREFIXCONFIGOPTIONS$6);
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
            get_store().remove_element(PREFIXCONFIGOPTIONS$6, 0);
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
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$8, 0);
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
            return get_store().count_elements(FILTERS$8) != 0;
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
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$8);
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
            target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$8);
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
            get_store().remove_element(FILTERS$8, 0);
        }
    }
}
