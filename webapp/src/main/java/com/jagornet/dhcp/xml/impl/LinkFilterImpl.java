/*
 * XML Type:  linkFilter
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.LinkFilter
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML linkFilter(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class LinkFilterImpl extends com.jagornet.dhcp.xml.impl.FilterImpl implements com.jagornet.dhcp.xml.LinkFilter
{
    private static final long serialVersionUID = 1L;
    
    public LinkFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V6NAADDRPOOLS$0 = 
        new javax.xml.namespace.QName("", "v6NaAddrPools");
    private static final javax.xml.namespace.QName V6TAADDRPOOLS$2 = 
        new javax.xml.namespace.QName("", "v6TaAddrPools");
    private static final javax.xml.namespace.QName V6PREFIXPOOLS$4 = 
        new javax.xml.namespace.QName("", "v6PrefixPools");
    private static final javax.xml.namespace.QName V4ADDRPOOLS$6 = 
        new javax.xml.namespace.QName("", "v4AddrPools");
    
    
    /**
     * Gets the "v6NaAddrPools" element
     */
    public com.jagornet.dhcp.xml.V6AddressPoolsType getV6NaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6NAADDRPOOLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NaAddrPools" element
     */
    public boolean isSetV6NaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NAADDRPOOLS$0) != 0;
        }
    }
    
    /**
     * Sets the "v6NaAddrPools" element
     */
    public void setV6NaAddrPools(com.jagornet.dhcp.xml.V6AddressPoolsType v6NaAddrPools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6NAADDRPOOLS$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6NAADDRPOOLS$0);
            }
            target.set(v6NaAddrPools);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NaAddrPools" element
     */
    public com.jagornet.dhcp.xml.V6AddressPoolsType addNewV6NaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6NAADDRPOOLS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NaAddrPools" element
     */
    public void unsetV6NaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NAADDRPOOLS$0, 0);
        }
    }
    
    /**
     * Gets the "v6TaAddrPools" element
     */
    public com.jagornet.dhcp.xml.V6AddressPoolsType getV6TaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6TAADDRPOOLS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6TaAddrPools" element
     */
    public boolean isSetV6TaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6TAADDRPOOLS$2) != 0;
        }
    }
    
    /**
     * Sets the "v6TaAddrPools" element
     */
    public void setV6TaAddrPools(com.jagornet.dhcp.xml.V6AddressPoolsType v6TaAddrPools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6TAADDRPOOLS$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6TAADDRPOOLS$2);
            }
            target.set(v6TaAddrPools);
        }
    }
    
    /**
     * Appends and returns a new empty "v6TaAddrPools" element
     */
    public com.jagornet.dhcp.xml.V6AddressPoolsType addNewV6TaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6TAADDRPOOLS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "v6TaAddrPools" element
     */
    public void unsetV6TaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6TAADDRPOOLS$2, 0);
        }
    }
    
    /**
     * Gets the "v6PrefixPools" element
     */
    public com.jagornet.dhcp.xml.V6PrefixPoolsType getV6PrefixPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().find_element_user(V6PREFIXPOOLS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6PrefixPools" element
     */
    public boolean isSetV6PrefixPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6PREFIXPOOLS$4) != 0;
        }
    }
    
    /**
     * Sets the "v6PrefixPools" element
     */
    public void setV6PrefixPools(com.jagornet.dhcp.xml.V6PrefixPoolsType v6PrefixPools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().find_element_user(V6PREFIXPOOLS$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().add_element_user(V6PREFIXPOOLS$4);
            }
            target.set(v6PrefixPools);
        }
    }
    
    /**
     * Appends and returns a new empty "v6PrefixPools" element
     */
    public com.jagornet.dhcp.xml.V6PrefixPoolsType addNewV6PrefixPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().add_element_user(V6PREFIXPOOLS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "v6PrefixPools" element
     */
    public void unsetV6PrefixPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6PREFIXPOOLS$4, 0);
        }
    }
    
    /**
     * Gets the "v4AddrPools" element
     */
    public com.jagornet.dhcp.xml.V4AddressPoolsType getV4AddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().find_element_user(V4ADDRPOOLS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4AddrPools" element
     */
    public boolean isSetV4AddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4ADDRPOOLS$6) != 0;
        }
    }
    
    /**
     * Sets the "v4AddrPools" element
     */
    public void setV4AddrPools(com.jagornet.dhcp.xml.V4AddressPoolsType v4AddrPools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().find_element_user(V4ADDRPOOLS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().add_element_user(V4ADDRPOOLS$6);
            }
            target.set(v4AddrPools);
        }
    }
    
    /**
     * Appends and returns a new empty "v4AddrPools" element
     */
    public com.jagornet.dhcp.xml.V4AddressPoolsType addNewV4AddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().add_element_user(V4ADDRPOOLS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "v4AddrPools" element
     */
    public void unsetV4AddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4ADDRPOOLS$6, 0);
        }
    }
}
