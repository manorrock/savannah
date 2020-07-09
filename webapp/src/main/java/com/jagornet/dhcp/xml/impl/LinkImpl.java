/*
 * XML Type:  link
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.Link
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML link(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.Link
{
    private static final long serialVersionUID = 1L;
    
    public LinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName INTERFACE$2 = 
        new javax.xml.namespace.QName("", "interface");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("", "address");
    private static final javax.xml.namespace.QName V6SERVERIDOPTION$6 = 
        new javax.xml.namespace.QName("", "v6ServerIdOption");
    private static final javax.xml.namespace.QName V4SERVERIDOPTION$8 = 
        new javax.xml.namespace.QName("", "v4ServerIdOption");
    private static final javax.xml.namespace.QName POLICIES$10 = 
        new javax.xml.namespace.QName("", "policies");
    private static final javax.xml.namespace.QName V6MSGCONFIGOPTIONS$12 = 
        new javax.xml.namespace.QName("", "v6MsgConfigOptions");
    private static final javax.xml.namespace.QName V6IANACONFIGOPTIONS$14 = 
        new javax.xml.namespace.QName("", "v6IaNaConfigOptions");
    private static final javax.xml.namespace.QName V6NAADDRCONFIGOPTIONS$16 = 
        new javax.xml.namespace.QName("", "v6NaAddrConfigOptions");
    private static final javax.xml.namespace.QName V6NAADDRPOOLS$18 = 
        new javax.xml.namespace.QName("", "v6NaAddrPools");
    private static final javax.xml.namespace.QName V6NAADDRBINDINGS$20 = 
        new javax.xml.namespace.QName("", "v6NaAddrBindings");
    private static final javax.xml.namespace.QName V6IATACONFIGOPTIONS$22 = 
        new javax.xml.namespace.QName("", "v6IaTaConfigOptions");
    private static final javax.xml.namespace.QName V6TAADDRCONFIGOPTIONS$24 = 
        new javax.xml.namespace.QName("", "v6TaAddrConfigOptions");
    private static final javax.xml.namespace.QName V6TAADDRPOOLS$26 = 
        new javax.xml.namespace.QName("", "v6TaAddrPools");
    private static final javax.xml.namespace.QName V6TAADDRBINDINGS$28 = 
        new javax.xml.namespace.QName("", "v6TaAddrBindings");
    private static final javax.xml.namespace.QName V6IAPDCONFIGOPTIONS$30 = 
        new javax.xml.namespace.QName("", "v6IaPdConfigOptions");
    private static final javax.xml.namespace.QName V6PREFIXCONFIGOPTIONS$32 = 
        new javax.xml.namespace.QName("", "v6PrefixConfigOptions");
    private static final javax.xml.namespace.QName V6PREFIXPOOLS$34 = 
        new javax.xml.namespace.QName("", "v6PrefixPools");
    private static final javax.xml.namespace.QName V6PREFIXBINDINGS$36 = 
        new javax.xml.namespace.QName("", "v6PrefixBindings");
    private static final javax.xml.namespace.QName V4CONFIGOPTIONS$38 = 
        new javax.xml.namespace.QName("", "v4ConfigOptions");
    private static final javax.xml.namespace.QName V4ADDRPOOLS$40 = 
        new javax.xml.namespace.QName("", "v4AddrPools");
    private static final javax.xml.namespace.QName V4ADDRBINDINGS$42 = 
        new javax.xml.namespace.QName("", "v4AddrBindings");
    private static final javax.xml.namespace.QName LINKFILTERS$44 = 
        new javax.xml.namespace.QName("", "linkFilters");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public com.jagornet.dhcp.xml.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Name target = null;
            target = (com.jagornet.dhcp.xml.Name)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(com.jagornet.dhcp.xml.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Name target = null;
            target = (com.jagornet.dhcp.xml.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Name)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "interface" element
     */
    public java.lang.String getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interface" element
     */
    public org.apache.xmlbeans.XmlString xgetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "interface" element
     */
    public boolean isSetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACE$2) != 0;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(java.lang.String xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACE$2);
            }
            target.setStringValue(xinterface);
        }
    }
    
    /**
     * Sets (as xml) the "interface" element
     */
    public void xsetInterface(org.apache.xmlbeans.XmlString xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERFACE$2);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Unsets the "interface" element
     */
    public void unsetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACE$2, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$4);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$4);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "v6ServerIdOption" element
     */
    public com.jagornet.dhcp.xml.V6ServerIdOption getV6ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().find_element_user(V6SERVERIDOPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6ServerIdOption" element
     */
    public boolean isSetV6ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6SERVERIDOPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "v6ServerIdOption" element
     */
    public void setV6ServerIdOption(com.jagornet.dhcp.xml.V6ServerIdOption v6ServerIdOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().find_element_user(V6SERVERIDOPTION$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().add_element_user(V6SERVERIDOPTION$6);
            }
            target.set(v6ServerIdOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6ServerIdOption" element
     */
    public com.jagornet.dhcp.xml.V6ServerIdOption addNewV6ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().add_element_user(V6SERVERIDOPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "v6ServerIdOption" element
     */
    public void unsetV6ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6SERVERIDOPTION$6, 0);
        }
    }
    
    /**
     * Gets the "v4ServerIdOption" element
     */
    public com.jagornet.dhcp.xml.V4ServerIdOption getV4ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().find_element_user(V4SERVERIDOPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4ServerIdOption" element
     */
    public boolean isSetV4ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4SERVERIDOPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "v4ServerIdOption" element
     */
    public void setV4ServerIdOption(com.jagornet.dhcp.xml.V4ServerIdOption v4ServerIdOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().find_element_user(V4SERVERIDOPTION$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().add_element_user(V4SERVERIDOPTION$8);
            }
            target.set(v4ServerIdOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4ServerIdOption" element
     */
    public com.jagornet.dhcp.xml.V4ServerIdOption addNewV4ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ServerIdOption target = null;
            target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().add_element_user(V4SERVERIDOPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "v4ServerIdOption" element
     */
    public void unsetV4ServerIdOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4SERVERIDOPTION$8, 0);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$10, 0);
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
            return get_store().count_elements(POLICIES$10) != 0;
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().find_element_user(POLICIES$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$10);
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
            target = (com.jagornet.dhcp.xml.PoliciesType)get_store().add_element_user(POLICIES$10);
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
            get_store().remove_element(POLICIES$10, 0);
        }
    }
    
    /**
     * Gets the "v6MsgConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6MsgConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6MSGCONFIGOPTIONS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6MsgConfigOptions" element
     */
    public boolean isSetV6MsgConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6MSGCONFIGOPTIONS$12) != 0;
        }
    }
    
    /**
     * Sets the "v6MsgConfigOptions" element
     */
    public void setV6MsgConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6MsgConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6MSGCONFIGOPTIONS$12, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6MSGCONFIGOPTIONS$12);
            }
            target.set(v6MsgConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6MsgConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6MsgConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6MSGCONFIGOPTIONS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "v6MsgConfigOptions" element
     */
    public void unsetV6MsgConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6MSGCONFIGOPTIONS$12, 0);
        }
    }
    
    /**
     * Gets the "v6IaNaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaNaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IANACONFIGOPTIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6IaNaConfigOptions" element
     */
    public boolean isSetV6IaNaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6IANACONFIGOPTIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "v6IaNaConfigOptions" element
     */
    public void setV6IaNaConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaNaConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IANACONFIGOPTIONS$14, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IANACONFIGOPTIONS$14);
            }
            target.set(v6IaNaConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6IaNaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaNaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IANACONFIGOPTIONS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "v6IaNaConfigOptions" element
     */
    public void unsetV6IaNaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6IANACONFIGOPTIONS$14, 0);
        }
    }
    
    /**
     * Gets the "v6NaAddrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6NaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6NAADDRCONFIGOPTIONS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NaAddrConfigOptions" element
     */
    public boolean isSetV6NaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NAADDRCONFIGOPTIONS$16) != 0;
        }
    }
    
    /**
     * Sets the "v6NaAddrConfigOptions" element
     */
    public void setV6NaAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6NaAddrConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6NAADDRCONFIGOPTIONS$16, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6NAADDRCONFIGOPTIONS$16);
            }
            target.set(v6NaAddrConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NaAddrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6NaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6NAADDRCONFIGOPTIONS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NaAddrConfigOptions" element
     */
    public void unsetV6NaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NAADDRCONFIGOPTIONS$16, 0);
        }
    }
    
    /**
     * Gets the "v6NaAddrPools" element
     */
    public com.jagornet.dhcp.xml.V6AddressPoolsType getV6NaAddrPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressPoolsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6NAADDRPOOLS$18, 0);
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
            return get_store().count_elements(V6NAADDRPOOLS$18) != 0;
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
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6NAADDRPOOLS$18, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6NAADDRPOOLS$18);
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
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6NAADDRPOOLS$18);
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
            get_store().remove_element(V6NAADDRPOOLS$18, 0);
        }
    }
    
    /**
     * Gets the "v6NaAddrBindings" element
     */
    public com.jagornet.dhcp.xml.V6AddressBindingsType getV6NaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().find_element_user(V6NAADDRBINDINGS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NaAddrBindings" element
     */
    public boolean isSetV6NaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NAADDRBINDINGS$20) != 0;
        }
    }
    
    /**
     * Sets the "v6NaAddrBindings" element
     */
    public void setV6NaAddrBindings(com.jagornet.dhcp.xml.V6AddressBindingsType v6NaAddrBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().find_element_user(V6NAADDRBINDINGS$20, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().add_element_user(V6NAADDRBINDINGS$20);
            }
            target.set(v6NaAddrBindings);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NaAddrBindings" element
     */
    public com.jagornet.dhcp.xml.V6AddressBindingsType addNewV6NaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().add_element_user(V6NAADDRBINDINGS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NaAddrBindings" element
     */
    public void unsetV6NaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NAADDRBINDINGS$20, 0);
        }
    }
    
    /**
     * Gets the "v6IaTaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaTaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IATACONFIGOPTIONS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6IaTaConfigOptions" element
     */
    public boolean isSetV6IaTaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6IATACONFIGOPTIONS$22) != 0;
        }
    }
    
    /**
     * Sets the "v6IaTaConfigOptions" element
     */
    public void setV6IaTaConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaTaConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IATACONFIGOPTIONS$22, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IATACONFIGOPTIONS$22);
            }
            target.set(v6IaTaConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6IaTaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaTaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IATACONFIGOPTIONS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "v6IaTaConfigOptions" element
     */
    public void unsetV6IaTaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6IATACONFIGOPTIONS$22, 0);
        }
    }
    
    /**
     * Gets the "v6TaAddrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6TaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6TAADDRCONFIGOPTIONS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6TaAddrConfigOptions" element
     */
    public boolean isSetV6TaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6TAADDRCONFIGOPTIONS$24) != 0;
        }
    }
    
    /**
     * Sets the "v6TaAddrConfigOptions" element
     */
    public void setV6TaAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6TaAddrConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6TAADDRCONFIGOPTIONS$24, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6TAADDRCONFIGOPTIONS$24);
            }
            target.set(v6TaAddrConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6TaAddrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6TaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6TAADDRCONFIGOPTIONS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "v6TaAddrConfigOptions" element
     */
    public void unsetV6TaAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6TAADDRCONFIGOPTIONS$24, 0);
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
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6TAADDRPOOLS$26, 0);
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
            return get_store().count_elements(V6TAADDRPOOLS$26) != 0;
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
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().find_element_user(V6TAADDRPOOLS$26, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6TAADDRPOOLS$26);
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
            target = (com.jagornet.dhcp.xml.V6AddressPoolsType)get_store().add_element_user(V6TAADDRPOOLS$26);
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
            get_store().remove_element(V6TAADDRPOOLS$26, 0);
        }
    }
    
    /**
     * Gets the "v6TaAddrBindings" element
     */
    public com.jagornet.dhcp.xml.V6AddressBindingsType getV6TaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().find_element_user(V6TAADDRBINDINGS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6TaAddrBindings" element
     */
    public boolean isSetV6TaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6TAADDRBINDINGS$28) != 0;
        }
    }
    
    /**
     * Sets the "v6TaAddrBindings" element
     */
    public void setV6TaAddrBindings(com.jagornet.dhcp.xml.V6AddressBindingsType v6TaAddrBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().find_element_user(V6TAADDRBINDINGS$28, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().add_element_user(V6TAADDRBINDINGS$28);
            }
            target.set(v6TaAddrBindings);
        }
    }
    
    /**
     * Appends and returns a new empty "v6TaAddrBindings" element
     */
    public com.jagornet.dhcp.xml.V6AddressBindingsType addNewV6TaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBindingsType)get_store().add_element_user(V6TAADDRBINDINGS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "v6TaAddrBindings" element
     */
    public void unsetV6TaAddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6TAADDRBINDINGS$28, 0);
        }
    }
    
    /**
     * Gets the "v6IaPdConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6IaPdConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IAPDCONFIGOPTIONS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6IaPdConfigOptions" element
     */
    public boolean isSetV6IaPdConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6IAPDCONFIGOPTIONS$30) != 0;
        }
    }
    
    /**
     * Sets the "v6IaPdConfigOptions" element
     */
    public void setV6IaPdConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6IaPdConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IAPDCONFIGOPTIONS$30, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IAPDCONFIGOPTIONS$30);
            }
            target.set(v6IaPdConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6IaPdConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6IaPdConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IAPDCONFIGOPTIONS$30);
            return target;
        }
    }
    
    /**
     * Unsets the "v6IaPdConfigOptions" element
     */
    public void unsetV6IaPdConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6IAPDCONFIGOPTIONS$30, 0);
        }
    }
    
    /**
     * Gets the "v6PrefixConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6PrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6PREFIXCONFIGOPTIONS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6PrefixConfigOptions" element
     */
    public boolean isSetV6PrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6PREFIXCONFIGOPTIONS$32) != 0;
        }
    }
    
    /**
     * Sets the "v6PrefixConfigOptions" element
     */
    public void setV6PrefixConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType v6PrefixConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6PREFIXCONFIGOPTIONS$32, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6PREFIXCONFIGOPTIONS$32);
            }
            target.set(v6PrefixConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6PrefixConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewV6PrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6PREFIXCONFIGOPTIONS$32);
            return target;
        }
    }
    
    /**
     * Unsets the "v6PrefixConfigOptions" element
     */
    public void unsetV6PrefixConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6PREFIXCONFIGOPTIONS$32, 0);
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
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().find_element_user(V6PREFIXPOOLS$34, 0);
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
            return get_store().count_elements(V6PREFIXPOOLS$34) != 0;
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
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().find_element_user(V6PREFIXPOOLS$34, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().add_element_user(V6PREFIXPOOLS$34);
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
            target = (com.jagornet.dhcp.xml.V6PrefixPoolsType)get_store().add_element_user(V6PREFIXPOOLS$34);
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
            get_store().remove_element(V6PREFIXPOOLS$34, 0);
        }
    }
    
    /**
     * Gets the "v6PrefixBindings" element
     */
    public com.jagornet.dhcp.xml.V6PrefixBindingsType getV6PrefixBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBindingsType)get_store().find_element_user(V6PREFIXBINDINGS$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6PrefixBindings" element
     */
    public boolean isSetV6PrefixBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6PREFIXBINDINGS$36) != 0;
        }
    }
    
    /**
     * Sets the "v6PrefixBindings" element
     */
    public void setV6PrefixBindings(com.jagornet.dhcp.xml.V6PrefixBindingsType v6PrefixBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBindingsType)get_store().find_element_user(V6PREFIXBINDINGS$36, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6PrefixBindingsType)get_store().add_element_user(V6PREFIXBINDINGS$36);
            }
            target.set(v6PrefixBindings);
        }
    }
    
    /**
     * Appends and returns a new empty "v6PrefixBindings" element
     */
    public com.jagornet.dhcp.xml.V6PrefixBindingsType addNewV6PrefixBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBindingsType)get_store().add_element_user(V6PREFIXBINDINGS$36);
            return target;
        }
    }
    
    /**
     * Unsets the "v6PrefixBindings" element
     */
    public void unsetV6PrefixBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6PREFIXBINDINGS$36, 0);
        }
    }
    
    /**
     * Gets the "v4ConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V4ConfigOptionsType getV4ConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(V4CONFIGOPTIONS$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4ConfigOptions" element
     */
    public boolean isSetV4ConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4CONFIGOPTIONS$38) != 0;
        }
    }
    
    /**
     * Sets the "v4ConfigOptions" element
     */
    public void setV4ConfigOptions(com.jagornet.dhcp.xml.V4ConfigOptionsType v4ConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(V4CONFIGOPTIONS$38, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(V4CONFIGOPTIONS$38);
            }
            target.set(v4ConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v4ConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V4ConfigOptionsType addNewV4ConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(V4CONFIGOPTIONS$38);
            return target;
        }
    }
    
    /**
     * Unsets the "v4ConfigOptions" element
     */
    public void unsetV4ConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4CONFIGOPTIONS$38, 0);
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
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().find_element_user(V4ADDRPOOLS$40, 0);
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
            return get_store().count_elements(V4ADDRPOOLS$40) != 0;
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
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().find_element_user(V4ADDRPOOLS$40, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().add_element_user(V4ADDRPOOLS$40);
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
            target = (com.jagornet.dhcp.xml.V4AddressPoolsType)get_store().add_element_user(V4ADDRPOOLS$40);
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
            get_store().remove_element(V4ADDRPOOLS$40, 0);
        }
    }
    
    /**
     * Gets the "v4AddrBindings" element
     */
    public com.jagornet.dhcp.xml.V4AddressBindingsType getV4AddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressBindingsType)get_store().find_element_user(V4ADDRBINDINGS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4AddrBindings" element
     */
    public boolean isSetV4AddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4ADDRBINDINGS$42) != 0;
        }
    }
    
    /**
     * Sets the "v4AddrBindings" element
     */
    public void setV4AddrBindings(com.jagornet.dhcp.xml.V4AddressBindingsType v4AddrBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressBindingsType)get_store().find_element_user(V4ADDRBINDINGS$42, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4AddressBindingsType)get_store().add_element_user(V4ADDRBINDINGS$42);
            }
            target.set(v4AddrBindings);
        }
    }
    
    /**
     * Appends and returns a new empty "v4AddrBindings" element
     */
    public com.jagornet.dhcp.xml.V4AddressBindingsType addNewV4AddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressBindingsType target = null;
            target = (com.jagornet.dhcp.xml.V4AddressBindingsType)get_store().add_element_user(V4ADDRBINDINGS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "v4AddrBindings" element
     */
    public void unsetV4AddrBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4ADDRBINDINGS$42, 0);
        }
    }
    
    /**
     * Gets the "linkFilters" element
     */
    public com.jagornet.dhcp.xml.LinkFiltersType getLinkFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFiltersType target = null;
            target = (com.jagornet.dhcp.xml.LinkFiltersType)get_store().find_element_user(LINKFILTERS$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linkFilters" element
     */
    public boolean isSetLinkFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFILTERS$44) != 0;
        }
    }
    
    /**
     * Sets the "linkFilters" element
     */
    public void setLinkFilters(com.jagornet.dhcp.xml.LinkFiltersType linkFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFiltersType target = null;
            target = (com.jagornet.dhcp.xml.LinkFiltersType)get_store().find_element_user(LINKFILTERS$44, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.LinkFiltersType)get_store().add_element_user(LINKFILTERS$44);
            }
            target.set(linkFilters);
        }
    }
    
    /**
     * Appends and returns a new empty "linkFilters" element
     */
    public com.jagornet.dhcp.xml.LinkFiltersType addNewLinkFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFiltersType target = null;
            target = (com.jagornet.dhcp.xml.LinkFiltersType)get_store().add_element_user(LINKFILTERS$44);
            return target;
        }
    }
    
    /**
     * Unsets the "linkFilters" element
     */
    public void unsetLinkFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFILTERS$44, 0);
        }
    }
}
