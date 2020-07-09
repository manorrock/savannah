/*
 * XML Type:  optionDefType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.OptionDefType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML optionDefType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class OptionDefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.OptionDefType
{
    private static final long serialVersionUID = 1L;
    
    public OptionDefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NILOPTION$0 = 
        new javax.xml.namespace.QName("", "nilOption");
    private static final javax.xml.namespace.QName UBYTEOPTION$2 = 
        new javax.xml.namespace.QName("", "uByteOption");
    private static final javax.xml.namespace.QName UBYTELISTOPTION$4 = 
        new javax.xml.namespace.QName("", "uByteListOption");
    private static final javax.xml.namespace.QName USHORTOPTION$6 = 
        new javax.xml.namespace.QName("", "uShortOption");
    private static final javax.xml.namespace.QName USHORTLISTOPTION$8 = 
        new javax.xml.namespace.QName("", "uShortListOption");
    private static final javax.xml.namespace.QName UINTOPTION$10 = 
        new javax.xml.namespace.QName("", "uIntOption");
    private static final javax.xml.namespace.QName STRINGOPTION$12 = 
        new javax.xml.namespace.QName("", "stringOption");
    private static final javax.xml.namespace.QName IPADDRESSOPTION$14 = 
        new javax.xml.namespace.QName("", "ipAddressOption");
    private static final javax.xml.namespace.QName IPADDRESSLISTOPTION$16 = 
        new javax.xml.namespace.QName("", "ipAddressListOption");
    private static final javax.xml.namespace.QName DOMAINNAMEOPTION$18 = 
        new javax.xml.namespace.QName("", "domainNameOption");
    private static final javax.xml.namespace.QName DOMAINNAMELISTOPTION$20 = 
        new javax.xml.namespace.QName("", "domainNameListOption");
    private static final javax.xml.namespace.QName OPAQUEDATAOPTION$22 = 
        new javax.xml.namespace.QName("", "opaqueDataOption");
    private static final javax.xml.namespace.QName OPAQUEDATALISTOPTION$24 = 
        new javax.xml.namespace.QName("", "opaqueDataListOption");
    private static final javax.xml.namespace.QName V4$26 = 
        new javax.xml.namespace.QName("", "v4");
    private static final javax.xml.namespace.QName CODE$28 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName NAME$30 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "nilOption" element
     */
    public com.jagornet.dhcp.xml.NilOptionType getNilOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.NilOptionType target = null;
            target = (com.jagornet.dhcp.xml.NilOptionType)get_store().find_element_user(NILOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nilOption" element
     */
    public boolean isSetNilOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NILOPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "nilOption" element
     */
    public void setNilOption(com.jagornet.dhcp.xml.NilOptionType nilOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.NilOptionType target = null;
            target = (com.jagornet.dhcp.xml.NilOptionType)get_store().find_element_user(NILOPTION$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.NilOptionType)get_store().add_element_user(NILOPTION$0);
            }
            target.set(nilOption);
        }
    }
    
    /**
     * Appends and returns a new empty "nilOption" element
     */
    public com.jagornet.dhcp.xml.NilOptionType addNewNilOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.NilOptionType target = null;
            target = (com.jagornet.dhcp.xml.NilOptionType)get_store().add_element_user(NILOPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "nilOption" element
     */
    public void unsetNilOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NILOPTION$0, 0);
        }
    }
    
    /**
     * Gets the "uByteOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedByteOptionType getUByteOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteOptionType)get_store().find_element_user(UBYTEOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uByteOption" element
     */
    public boolean isSetUByteOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UBYTEOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "uByteOption" element
     */
    public void setUByteOption(com.jagornet.dhcp.xml.UnsignedByteOptionType uByteOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteOptionType)get_store().find_element_user(UBYTEOPTION$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.UnsignedByteOptionType)get_store().add_element_user(UBYTEOPTION$2);
            }
            target.set(uByteOption);
        }
    }
    
    /**
     * Appends and returns a new empty "uByteOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedByteOptionType addNewUByteOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteOptionType)get_store().add_element_user(UBYTEOPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "uByteOption" element
     */
    public void unsetUByteOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UBYTEOPTION$2, 0);
        }
    }
    
    /**
     * Gets the "uByteListOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedByteListOptionType getUByteListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteListOptionType)get_store().find_element_user(UBYTELISTOPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uByteListOption" element
     */
    public boolean isSetUByteListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UBYTELISTOPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "uByteListOption" element
     */
    public void setUByteListOption(com.jagornet.dhcp.xml.UnsignedByteListOptionType uByteListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteListOptionType)get_store().find_element_user(UBYTELISTOPTION$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.UnsignedByteListOptionType)get_store().add_element_user(UBYTELISTOPTION$4);
            }
            target.set(uByteListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "uByteListOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedByteListOptionType addNewUByteListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedByteListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedByteListOptionType)get_store().add_element_user(UBYTELISTOPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "uByteListOption" element
     */
    public void unsetUByteListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UBYTELISTOPTION$4, 0);
        }
    }
    
    /**
     * Gets the "uShortOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedShortOptionType getUShortOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortOptionType)get_store().find_element_user(USHORTOPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uShortOption" element
     */
    public boolean isSetUShortOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USHORTOPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "uShortOption" element
     */
    public void setUShortOption(com.jagornet.dhcp.xml.UnsignedShortOptionType uShortOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortOptionType)get_store().find_element_user(USHORTOPTION$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.UnsignedShortOptionType)get_store().add_element_user(USHORTOPTION$6);
            }
            target.set(uShortOption);
        }
    }
    
    /**
     * Appends and returns a new empty "uShortOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedShortOptionType addNewUShortOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortOptionType)get_store().add_element_user(USHORTOPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "uShortOption" element
     */
    public void unsetUShortOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USHORTOPTION$6, 0);
        }
    }
    
    /**
     * Gets the "uShortListOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedShortListOptionType getUShortListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortListOptionType)get_store().find_element_user(USHORTLISTOPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uShortListOption" element
     */
    public boolean isSetUShortListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USHORTLISTOPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "uShortListOption" element
     */
    public void setUShortListOption(com.jagornet.dhcp.xml.UnsignedShortListOptionType uShortListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortListOptionType)get_store().find_element_user(USHORTLISTOPTION$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.UnsignedShortListOptionType)get_store().add_element_user(USHORTLISTOPTION$8);
            }
            target.set(uShortListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "uShortListOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedShortListOptionType addNewUShortListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedShortListOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedShortListOptionType)get_store().add_element_user(USHORTLISTOPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "uShortListOption" element
     */
    public void unsetUShortListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USHORTLISTOPTION$8, 0);
        }
    }
    
    /**
     * Gets the "uIntOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedIntOptionType getUIntOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedIntOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedIntOptionType)get_store().find_element_user(UINTOPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uIntOption" element
     */
    public boolean isSetUIntOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UINTOPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "uIntOption" element
     */
    public void setUIntOption(com.jagornet.dhcp.xml.UnsignedIntOptionType uIntOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedIntOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedIntOptionType)get_store().find_element_user(UINTOPTION$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.UnsignedIntOptionType)get_store().add_element_user(UINTOPTION$10);
            }
            target.set(uIntOption);
        }
    }
    
    /**
     * Appends and returns a new empty "uIntOption" element
     */
    public com.jagornet.dhcp.xml.UnsignedIntOptionType addNewUIntOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.UnsignedIntOptionType target = null;
            target = (com.jagornet.dhcp.xml.UnsignedIntOptionType)get_store().add_element_user(UINTOPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "uIntOption" element
     */
    public void unsetUIntOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UINTOPTION$10, 0);
        }
    }
    
    /**
     * Gets the "stringOption" element
     */
    public com.jagornet.dhcp.xml.StringOptionType getStringOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.StringOptionType target = null;
            target = (com.jagornet.dhcp.xml.StringOptionType)get_store().find_element_user(STRINGOPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stringOption" element
     */
    public boolean isSetStringOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGOPTION$12) != 0;
        }
    }
    
    /**
     * Sets the "stringOption" element
     */
    public void setStringOption(com.jagornet.dhcp.xml.StringOptionType stringOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.StringOptionType target = null;
            target = (com.jagornet.dhcp.xml.StringOptionType)get_store().find_element_user(STRINGOPTION$12, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.StringOptionType)get_store().add_element_user(STRINGOPTION$12);
            }
            target.set(stringOption);
        }
    }
    
    /**
     * Appends and returns a new empty "stringOption" element
     */
    public com.jagornet.dhcp.xml.StringOptionType addNewStringOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.StringOptionType target = null;
            target = (com.jagornet.dhcp.xml.StringOptionType)get_store().add_element_user(STRINGOPTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "stringOption" element
     */
    public void unsetStringOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGOPTION$12, 0);
        }
    }
    
    /**
     * Gets the "ipAddressOption" element
     */
    public com.jagornet.dhcp.xml.IpAddressOptionType getIpAddressOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressOptionType)get_store().find_element_user(IPADDRESSOPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ipAddressOption" element
     */
    public boolean isSetIpAddressOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPADDRESSOPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "ipAddressOption" element
     */
    public void setIpAddressOption(com.jagornet.dhcp.xml.IpAddressOptionType ipAddressOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressOptionType)get_store().find_element_user(IPADDRESSOPTION$14, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddressOptionType)get_store().add_element_user(IPADDRESSOPTION$14);
            }
            target.set(ipAddressOption);
        }
    }
    
    /**
     * Appends and returns a new empty "ipAddressOption" element
     */
    public com.jagornet.dhcp.xml.IpAddressOptionType addNewIpAddressOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressOptionType)get_store().add_element_user(IPADDRESSOPTION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ipAddressOption" element
     */
    public void unsetIpAddressOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPADDRESSOPTION$14, 0);
        }
    }
    
    /**
     * Gets the "ipAddressListOption" element
     */
    public com.jagornet.dhcp.xml.IpAddressListOptionType getIpAddressListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressListOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressListOptionType)get_store().find_element_user(IPADDRESSLISTOPTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ipAddressListOption" element
     */
    public boolean isSetIpAddressListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPADDRESSLISTOPTION$16) != 0;
        }
    }
    
    /**
     * Sets the "ipAddressListOption" element
     */
    public void setIpAddressListOption(com.jagornet.dhcp.xml.IpAddressListOptionType ipAddressListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressListOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressListOptionType)get_store().find_element_user(IPADDRESSLISTOPTION$16, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IpAddressListOptionType)get_store().add_element_user(IPADDRESSLISTOPTION$16);
            }
            target.set(ipAddressListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "ipAddressListOption" element
     */
    public com.jagornet.dhcp.xml.IpAddressListOptionType addNewIpAddressListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddressListOptionType target = null;
            target = (com.jagornet.dhcp.xml.IpAddressListOptionType)get_store().add_element_user(IPADDRESSLISTOPTION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ipAddressListOption" element
     */
    public void unsetIpAddressListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPADDRESSLISTOPTION$16, 0);
        }
    }
    
    /**
     * Gets the "domainNameOption" element
     */
    public com.jagornet.dhcp.xml.DomainNameOptionType getDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameOptionType)get_store().find_element_user(DOMAINNAMEOPTION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainNameOption" element
     */
    public boolean isSetDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINNAMEOPTION$18) != 0;
        }
    }
    
    /**
     * Sets the "domainNameOption" element
     */
    public void setDomainNameOption(com.jagornet.dhcp.xml.DomainNameOptionType domainNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameOptionType)get_store().find_element_user(DOMAINNAMEOPTION$18, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.DomainNameOptionType)get_store().add_element_user(DOMAINNAMEOPTION$18);
            }
            target.set(domainNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "domainNameOption" element
     */
    public com.jagornet.dhcp.xml.DomainNameOptionType addNewDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameOptionType)get_store().add_element_user(DOMAINNAMEOPTION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "domainNameOption" element
     */
    public void unsetDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINNAMEOPTION$18, 0);
        }
    }
    
    /**
     * Gets the "domainNameListOption" element
     */
    public com.jagornet.dhcp.xml.DomainNameListOptionType getDomainNameListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameListOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameListOptionType)get_store().find_element_user(DOMAINNAMELISTOPTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainNameListOption" element
     */
    public boolean isSetDomainNameListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINNAMELISTOPTION$20) != 0;
        }
    }
    
    /**
     * Sets the "domainNameListOption" element
     */
    public void setDomainNameListOption(com.jagornet.dhcp.xml.DomainNameListOptionType domainNameListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameListOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameListOptionType)get_store().find_element_user(DOMAINNAMELISTOPTION$20, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.DomainNameListOptionType)get_store().add_element_user(DOMAINNAMELISTOPTION$20);
            }
            target.set(domainNameListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "domainNameListOption" element
     */
    public com.jagornet.dhcp.xml.DomainNameListOptionType addNewDomainNameListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainNameListOptionType target = null;
            target = (com.jagornet.dhcp.xml.DomainNameListOptionType)get_store().add_element_user(DOMAINNAMELISTOPTION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "domainNameListOption" element
     */
    public void unsetDomainNameListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINNAMELISTOPTION$20, 0);
        }
    }
    
    /**
     * Gets the "opaqueDataOption" element
     */
    public com.jagornet.dhcp.xml.OpaqueDataOptionType getOpaqueDataOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataOptionType)get_store().find_element_user(OPAQUEDATAOPTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opaqueDataOption" element
     */
    public boolean isSetOpaqueDataOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPAQUEDATAOPTION$22) != 0;
        }
    }
    
    /**
     * Sets the "opaqueDataOption" element
     */
    public void setOpaqueDataOption(com.jagornet.dhcp.xml.OpaqueDataOptionType opaqueDataOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataOptionType)get_store().find_element_user(OPAQUEDATAOPTION$22, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueDataOptionType)get_store().add_element_user(OPAQUEDATAOPTION$22);
            }
            target.set(opaqueDataOption);
        }
    }
    
    /**
     * Appends and returns a new empty "opaqueDataOption" element
     */
    public com.jagornet.dhcp.xml.OpaqueDataOptionType addNewOpaqueDataOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataOptionType)get_store().add_element_user(OPAQUEDATAOPTION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "opaqueDataOption" element
     */
    public void unsetOpaqueDataOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPAQUEDATAOPTION$22, 0);
        }
    }
    
    /**
     * Gets the "opaqueDataListOption" element
     */
    public com.jagornet.dhcp.xml.OpaqueDataListOptionType getOpaqueDataListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataListOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataListOptionType)get_store().find_element_user(OPAQUEDATALISTOPTION$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opaqueDataListOption" element
     */
    public boolean isSetOpaqueDataListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPAQUEDATALISTOPTION$24) != 0;
        }
    }
    
    /**
     * Sets the "opaqueDataListOption" element
     */
    public void setOpaqueDataListOption(com.jagornet.dhcp.xml.OpaqueDataListOptionType opaqueDataListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataListOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataListOptionType)get_store().find_element_user(OPAQUEDATALISTOPTION$24, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueDataListOptionType)get_store().add_element_user(OPAQUEDATALISTOPTION$24);
            }
            target.set(opaqueDataListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "opaqueDataListOption" element
     */
    public com.jagornet.dhcp.xml.OpaqueDataListOptionType addNewOpaqueDataListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueDataListOptionType target = null;
            target = (com.jagornet.dhcp.xml.OpaqueDataListOptionType)get_store().add_element_user(OPAQUEDATALISTOPTION$24);
            return target;
        }
    }
    
    /**
     * Unsets the "opaqueDataListOption" element
     */
    public void unsetOpaqueDataListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPAQUEDATALISTOPTION$24, 0);
        }
    }
    
    /**
     * Gets the "v4" attribute
     */
    public boolean getV4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V4$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(V4$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "v4" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetV4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V4$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(V4$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "v4" attribute
     */
    public boolean isSetV4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(V4$26) != null;
        }
    }
    
    /**
     * Sets the "v4" attribute
     */
    public void setV4(boolean v4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V4$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(V4$26);
            }
            target.setBooleanValue(v4);
        }
    }
    
    /**
     * Sets (as xml) the "v4" attribute
     */
    public void xsetV4(org.apache.xmlbeans.XmlBoolean v4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V4$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(V4$26);
            }
            target.set(v4);
        }
    }
    
    /**
     * Unsets the "v4" attribute
     */
    public void unsetV4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(V4$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$28);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$28);
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
            return get_store().find_attribute_user(CODE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$28);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$28);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$28);
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
            get_store().remove_attribute(CODE$28);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public com.jagornet.dhcp.xml.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Name target = null;
            target = (com.jagornet.dhcp.xml.Name)get_store().find_attribute_user(NAME$30);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$30) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$30);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(com.jagornet.dhcp.xml.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Name target = null;
            target = (com.jagornet.dhcp.xml.Name)get_store().find_attribute_user(NAME$30);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Name)get_store().add_attribute_user(NAME$30);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$30);
        }
    }
}
