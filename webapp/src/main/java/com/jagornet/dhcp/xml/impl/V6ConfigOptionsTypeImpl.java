/*
 * XML Type:  v6ConfigOptionsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6ConfigOptionsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6ConfigOptionsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6ConfigOptionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6ConfigOptionsType
{
    private static final long serialVersionUID = 1L;
    
    public V6ConfigOptionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V6PREFERENCEOPTION$0 = 
        new javax.xml.namespace.QName("", "v6PreferenceOption");
    private static final javax.xml.namespace.QName V6SERVERUNICASTOPTION$2 = 
        new javax.xml.namespace.QName("", "v6ServerUnicastOption");
    private static final javax.xml.namespace.QName V6STATUSCODEOPTION$4 = 
        new javax.xml.namespace.QName("", "v6StatusCodeOption");
    private static final javax.xml.namespace.QName V6VENDORINFOOPTION$6 = 
        new javax.xml.namespace.QName("", "v6VendorInfoOption");
    private static final javax.xml.namespace.QName V6SIPSERVERDOMAINNAMESOPTION$8 = 
        new javax.xml.namespace.QName("", "v6SipServerDomainNamesOption");
    private static final javax.xml.namespace.QName V6SIPSERVERADDRESSESOPTION$10 = 
        new javax.xml.namespace.QName("", "v6SipServerAddressesOption");
    private static final javax.xml.namespace.QName V6DNSSERVERSOPTION$12 = 
        new javax.xml.namespace.QName("", "v6DnsServersOption");
    private static final javax.xml.namespace.QName V6DOMAINSEARCHLISTOPTION$14 = 
        new javax.xml.namespace.QName("", "v6DomainSearchListOption");
    private static final javax.xml.namespace.QName V6NISSERVERSOPTION$16 = 
        new javax.xml.namespace.QName("", "v6NisServersOption");
    private static final javax.xml.namespace.QName V6NISPLUSSERVERSOPTION$18 = 
        new javax.xml.namespace.QName("", "v6NisPlusServersOption");
    private static final javax.xml.namespace.QName V6NISDOMAINNAMEOPTION$20 = 
        new javax.xml.namespace.QName("", "v6NisDomainNameOption");
    private static final javax.xml.namespace.QName V6NISPLUSDOMAINNAMEOPTION$22 = 
        new javax.xml.namespace.QName("", "v6NisPlusDomainNameOption");
    private static final javax.xml.namespace.QName V6SNTPSERVERSOPTION$24 = 
        new javax.xml.namespace.QName("", "v6SntpServersOption");
    private static final javax.xml.namespace.QName V6INFOREFRESHTIMEOPTION$26 = 
        new javax.xml.namespace.QName("", "v6InfoRefreshTimeOption");
    private static final javax.xml.namespace.QName V6BCMCSDOMAINNAMESOPTION$28 = 
        new javax.xml.namespace.QName("", "v6BcmcsDomainNamesOption");
    private static final javax.xml.namespace.QName V6BCMCSADDRESSESOPTION$30 = 
        new javax.xml.namespace.QName("", "v6BcmcsAddressesOption");
    private static final javax.xml.namespace.QName V6GEOCONFCIVICOPTION$32 = 
        new javax.xml.namespace.QName("", "v6GeoconfCivicOption");
    private static final javax.xml.namespace.QName V6PANAAGENTADDRESSESOPTION$34 = 
        new javax.xml.namespace.QName("", "v6PanaAgentAddressesOption");
    private static final javax.xml.namespace.QName V6NEWPOSIXTIMEZONEOPTION$36 = 
        new javax.xml.namespace.QName("", "v6NewPosixTimezoneOption");
    private static final javax.xml.namespace.QName V6NEWTZDBTIMEZONEOPTION$38 = 
        new javax.xml.namespace.QName("", "v6NewTzdbTimezoneOption");
    private static final javax.xml.namespace.QName V6LOSTSERVERDOMAINNAMEOPTION$40 = 
        new javax.xml.namespace.QName("", "v6LostServerDomainNameOption");
    private static final javax.xml.namespace.QName V6OTHEROPTIONS$42 = 
        new javax.xml.namespace.QName("", "v6OtherOptions");
    
    
    /**
     * Gets the "v6PreferenceOption" element
     */
    public com.jagornet.dhcp.xml.V6PreferenceOption getV6PreferenceOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PreferenceOption target = null;
            target = (com.jagornet.dhcp.xml.V6PreferenceOption)get_store().find_element_user(V6PREFERENCEOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6PreferenceOption" element
     */
    public boolean isSetV6PreferenceOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6PREFERENCEOPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "v6PreferenceOption" element
     */
    public void setV6PreferenceOption(com.jagornet.dhcp.xml.V6PreferenceOption v6PreferenceOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PreferenceOption target = null;
            target = (com.jagornet.dhcp.xml.V6PreferenceOption)get_store().find_element_user(V6PREFERENCEOPTION$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6PreferenceOption)get_store().add_element_user(V6PREFERENCEOPTION$0);
            }
            target.set(v6PreferenceOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6PreferenceOption" element
     */
    public com.jagornet.dhcp.xml.V6PreferenceOption addNewV6PreferenceOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PreferenceOption target = null;
            target = (com.jagornet.dhcp.xml.V6PreferenceOption)get_store().add_element_user(V6PREFERENCEOPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "v6PreferenceOption" element
     */
    public void unsetV6PreferenceOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6PREFERENCEOPTION$0, 0);
        }
    }
    
    /**
     * Gets the "v6ServerUnicastOption" element
     */
    public com.jagornet.dhcp.xml.V6ServerUnicastOption getV6ServerUnicastOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerUnicastOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerUnicastOption)get_store().find_element_user(V6SERVERUNICASTOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6ServerUnicastOption" element
     */
    public boolean isSetV6ServerUnicastOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6SERVERUNICASTOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "v6ServerUnicastOption" element
     */
    public void setV6ServerUnicastOption(com.jagornet.dhcp.xml.V6ServerUnicastOption v6ServerUnicastOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerUnicastOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerUnicastOption)get_store().find_element_user(V6SERVERUNICASTOPTION$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ServerUnicastOption)get_store().add_element_user(V6SERVERUNICASTOPTION$2);
            }
            target.set(v6ServerUnicastOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6ServerUnicastOption" element
     */
    public com.jagornet.dhcp.xml.V6ServerUnicastOption addNewV6ServerUnicastOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ServerUnicastOption target = null;
            target = (com.jagornet.dhcp.xml.V6ServerUnicastOption)get_store().add_element_user(V6SERVERUNICASTOPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "v6ServerUnicastOption" element
     */
    public void unsetV6ServerUnicastOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6SERVERUNICASTOPTION$2, 0);
        }
    }
    
    /**
     * Gets the "v6StatusCodeOption" element
     */
    public com.jagornet.dhcp.xml.V6StatusCodeOption getV6StatusCodeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6StatusCodeOption target = null;
            target = (com.jagornet.dhcp.xml.V6StatusCodeOption)get_store().find_element_user(V6STATUSCODEOPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6StatusCodeOption" element
     */
    public boolean isSetV6StatusCodeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6STATUSCODEOPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "v6StatusCodeOption" element
     */
    public void setV6StatusCodeOption(com.jagornet.dhcp.xml.V6StatusCodeOption v6StatusCodeOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6StatusCodeOption target = null;
            target = (com.jagornet.dhcp.xml.V6StatusCodeOption)get_store().find_element_user(V6STATUSCODEOPTION$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6StatusCodeOption)get_store().add_element_user(V6STATUSCODEOPTION$4);
            }
            target.set(v6StatusCodeOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6StatusCodeOption" element
     */
    public com.jagornet.dhcp.xml.V6StatusCodeOption addNewV6StatusCodeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6StatusCodeOption target = null;
            target = (com.jagornet.dhcp.xml.V6StatusCodeOption)get_store().add_element_user(V6STATUSCODEOPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "v6StatusCodeOption" element
     */
    public void unsetV6StatusCodeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6STATUSCODEOPTION$4, 0);
        }
    }
    
    /**
     * Gets the "v6VendorInfoOption" element
     */
    public com.jagornet.dhcp.xml.V6VendorInfoOption getV6VendorInfoOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorInfoOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorInfoOption)get_store().find_element_user(V6VENDORINFOOPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6VendorInfoOption" element
     */
    public boolean isSetV6VendorInfoOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6VENDORINFOOPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "v6VendorInfoOption" element
     */
    public void setV6VendorInfoOption(com.jagornet.dhcp.xml.V6VendorInfoOption v6VendorInfoOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorInfoOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorInfoOption)get_store().find_element_user(V6VENDORINFOOPTION$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6VendorInfoOption)get_store().add_element_user(V6VENDORINFOOPTION$6);
            }
            target.set(v6VendorInfoOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6VendorInfoOption" element
     */
    public com.jagornet.dhcp.xml.V6VendorInfoOption addNewV6VendorInfoOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorInfoOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorInfoOption)get_store().add_element_user(V6VENDORINFOOPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "v6VendorInfoOption" element
     */
    public void unsetV6VendorInfoOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6VENDORINFOOPTION$6, 0);
        }
    }
    
    /**
     * Gets the "v6SipServerDomainNamesOption" element
     */
    public com.jagornet.dhcp.xml.V6SipServerDomainNamesOption getV6SipServerDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerDomainNamesOption)get_store().find_element_user(V6SIPSERVERDOMAINNAMESOPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6SipServerDomainNamesOption" element
     */
    public boolean isSetV6SipServerDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6SIPSERVERDOMAINNAMESOPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "v6SipServerDomainNamesOption" element
     */
    public void setV6SipServerDomainNamesOption(com.jagornet.dhcp.xml.V6SipServerDomainNamesOption v6SipServerDomainNamesOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerDomainNamesOption)get_store().find_element_user(V6SIPSERVERDOMAINNAMESOPTION$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6SipServerDomainNamesOption)get_store().add_element_user(V6SIPSERVERDOMAINNAMESOPTION$8);
            }
            target.set(v6SipServerDomainNamesOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6SipServerDomainNamesOption" element
     */
    public com.jagornet.dhcp.xml.V6SipServerDomainNamesOption addNewV6SipServerDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerDomainNamesOption)get_store().add_element_user(V6SIPSERVERDOMAINNAMESOPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "v6SipServerDomainNamesOption" element
     */
    public void unsetV6SipServerDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6SIPSERVERDOMAINNAMESOPTION$8, 0);
        }
    }
    
    /**
     * Gets the "v6SipServerAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6SipServerAddressesOption getV6SipServerAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerAddressesOption)get_store().find_element_user(V6SIPSERVERADDRESSESOPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6SipServerAddressesOption" element
     */
    public boolean isSetV6SipServerAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6SIPSERVERADDRESSESOPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "v6SipServerAddressesOption" element
     */
    public void setV6SipServerAddressesOption(com.jagornet.dhcp.xml.V6SipServerAddressesOption v6SipServerAddressesOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerAddressesOption)get_store().find_element_user(V6SIPSERVERADDRESSESOPTION$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6SipServerAddressesOption)get_store().add_element_user(V6SIPSERVERADDRESSESOPTION$10);
            }
            target.set(v6SipServerAddressesOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6SipServerAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6SipServerAddressesOption addNewV6SipServerAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SipServerAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6SipServerAddressesOption)get_store().add_element_user(V6SIPSERVERADDRESSESOPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "v6SipServerAddressesOption" element
     */
    public void unsetV6SipServerAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6SIPSERVERADDRESSESOPTION$10, 0);
        }
    }
    
    /**
     * Gets the "v6DnsServersOption" element
     */
    public com.jagornet.dhcp.xml.V6DnsServersOption getV6DnsServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DnsServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6DnsServersOption)get_store().find_element_user(V6DNSSERVERSOPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6DnsServersOption" element
     */
    public boolean isSetV6DnsServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6DNSSERVERSOPTION$12) != 0;
        }
    }
    
    /**
     * Sets the "v6DnsServersOption" element
     */
    public void setV6DnsServersOption(com.jagornet.dhcp.xml.V6DnsServersOption v6DnsServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DnsServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6DnsServersOption)get_store().find_element_user(V6DNSSERVERSOPTION$12, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6DnsServersOption)get_store().add_element_user(V6DNSSERVERSOPTION$12);
            }
            target.set(v6DnsServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6DnsServersOption" element
     */
    public com.jagornet.dhcp.xml.V6DnsServersOption addNewV6DnsServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DnsServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6DnsServersOption)get_store().add_element_user(V6DNSSERVERSOPTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "v6DnsServersOption" element
     */
    public void unsetV6DnsServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6DNSSERVERSOPTION$12, 0);
        }
    }
    
    /**
     * Gets the "v6DomainSearchListOption" element
     */
    public com.jagornet.dhcp.xml.V6DomainSearchListOption getV6DomainSearchListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DomainSearchListOption target = null;
            target = (com.jagornet.dhcp.xml.V6DomainSearchListOption)get_store().find_element_user(V6DOMAINSEARCHLISTOPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6DomainSearchListOption" element
     */
    public boolean isSetV6DomainSearchListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6DOMAINSEARCHLISTOPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "v6DomainSearchListOption" element
     */
    public void setV6DomainSearchListOption(com.jagornet.dhcp.xml.V6DomainSearchListOption v6DomainSearchListOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DomainSearchListOption target = null;
            target = (com.jagornet.dhcp.xml.V6DomainSearchListOption)get_store().find_element_user(V6DOMAINSEARCHLISTOPTION$14, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6DomainSearchListOption)get_store().add_element_user(V6DOMAINSEARCHLISTOPTION$14);
            }
            target.set(v6DomainSearchListOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6DomainSearchListOption" element
     */
    public com.jagornet.dhcp.xml.V6DomainSearchListOption addNewV6DomainSearchListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6DomainSearchListOption target = null;
            target = (com.jagornet.dhcp.xml.V6DomainSearchListOption)get_store().add_element_user(V6DOMAINSEARCHLISTOPTION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "v6DomainSearchListOption" element
     */
    public void unsetV6DomainSearchListOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6DOMAINSEARCHLISTOPTION$14, 0);
        }
    }
    
    /**
     * Gets the "v6NisServersOption" element
     */
    public com.jagornet.dhcp.xml.V6NisServersOption getV6NisServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisServersOption)get_store().find_element_user(V6NISSERVERSOPTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NisServersOption" element
     */
    public boolean isSetV6NisServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NISSERVERSOPTION$16) != 0;
        }
    }
    
    /**
     * Sets the "v6NisServersOption" element
     */
    public void setV6NisServersOption(com.jagornet.dhcp.xml.V6NisServersOption v6NisServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisServersOption)get_store().find_element_user(V6NISSERVERSOPTION$16, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NisServersOption)get_store().add_element_user(V6NISSERVERSOPTION$16);
            }
            target.set(v6NisServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NisServersOption" element
     */
    public com.jagornet.dhcp.xml.V6NisServersOption addNewV6NisServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisServersOption)get_store().add_element_user(V6NISSERVERSOPTION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NisServersOption" element
     */
    public void unsetV6NisServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NISSERVERSOPTION$16, 0);
        }
    }
    
    /**
     * Gets the "v6NisPlusServersOption" element
     */
    public com.jagornet.dhcp.xml.V6NisPlusServersOption getV6NisPlusServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusServersOption)get_store().find_element_user(V6NISPLUSSERVERSOPTION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NisPlusServersOption" element
     */
    public boolean isSetV6NisPlusServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NISPLUSSERVERSOPTION$18) != 0;
        }
    }
    
    /**
     * Sets the "v6NisPlusServersOption" element
     */
    public void setV6NisPlusServersOption(com.jagornet.dhcp.xml.V6NisPlusServersOption v6NisPlusServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusServersOption)get_store().find_element_user(V6NISPLUSSERVERSOPTION$18, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NisPlusServersOption)get_store().add_element_user(V6NISPLUSSERVERSOPTION$18);
            }
            target.set(v6NisPlusServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NisPlusServersOption" element
     */
    public com.jagornet.dhcp.xml.V6NisPlusServersOption addNewV6NisPlusServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusServersOption)get_store().add_element_user(V6NISPLUSSERVERSOPTION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NisPlusServersOption" element
     */
    public void unsetV6NisPlusServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NISPLUSSERVERSOPTION$18, 0);
        }
    }
    
    /**
     * Gets the "v6NisDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6NisDomainNameOption getV6NisDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisDomainNameOption)get_store().find_element_user(V6NISDOMAINNAMEOPTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NisDomainNameOption" element
     */
    public boolean isSetV6NisDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NISDOMAINNAMEOPTION$20) != 0;
        }
    }
    
    /**
     * Sets the "v6NisDomainNameOption" element
     */
    public void setV6NisDomainNameOption(com.jagornet.dhcp.xml.V6NisDomainNameOption v6NisDomainNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisDomainNameOption)get_store().find_element_user(V6NISDOMAINNAMEOPTION$20, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NisDomainNameOption)get_store().add_element_user(V6NISDOMAINNAMEOPTION$20);
            }
            target.set(v6NisDomainNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NisDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6NisDomainNameOption addNewV6NisDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisDomainNameOption)get_store().add_element_user(V6NISDOMAINNAMEOPTION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NisDomainNameOption" element
     */
    public void unsetV6NisDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NISDOMAINNAMEOPTION$20, 0);
        }
    }
    
    /**
     * Gets the "v6NisPlusDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6NisPlusDomainNameOption getV6NisPlusDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusDomainNameOption)get_store().find_element_user(V6NISPLUSDOMAINNAMEOPTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NisPlusDomainNameOption" element
     */
    public boolean isSetV6NisPlusDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NISPLUSDOMAINNAMEOPTION$22) != 0;
        }
    }
    
    /**
     * Sets the "v6NisPlusDomainNameOption" element
     */
    public void setV6NisPlusDomainNameOption(com.jagornet.dhcp.xml.V6NisPlusDomainNameOption v6NisPlusDomainNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusDomainNameOption)get_store().find_element_user(V6NISPLUSDOMAINNAMEOPTION$22, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NisPlusDomainNameOption)get_store().add_element_user(V6NISPLUSDOMAINNAMEOPTION$22);
            }
            target.set(v6NisPlusDomainNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NisPlusDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6NisPlusDomainNameOption addNewV6NisPlusDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NisPlusDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6NisPlusDomainNameOption)get_store().add_element_user(V6NISPLUSDOMAINNAMEOPTION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NisPlusDomainNameOption" element
     */
    public void unsetV6NisPlusDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NISPLUSDOMAINNAMEOPTION$22, 0);
        }
    }
    
    /**
     * Gets the "v6SntpServersOption" element
     */
    public com.jagornet.dhcp.xml.V6SntpServersOption getV6SntpServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SntpServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6SntpServersOption)get_store().find_element_user(V6SNTPSERVERSOPTION$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6SntpServersOption" element
     */
    public boolean isSetV6SntpServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6SNTPSERVERSOPTION$24) != 0;
        }
    }
    
    /**
     * Sets the "v6SntpServersOption" element
     */
    public void setV6SntpServersOption(com.jagornet.dhcp.xml.V6SntpServersOption v6SntpServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SntpServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6SntpServersOption)get_store().find_element_user(V6SNTPSERVERSOPTION$24, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6SntpServersOption)get_store().add_element_user(V6SNTPSERVERSOPTION$24);
            }
            target.set(v6SntpServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6SntpServersOption" element
     */
    public com.jagornet.dhcp.xml.V6SntpServersOption addNewV6SntpServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6SntpServersOption target = null;
            target = (com.jagornet.dhcp.xml.V6SntpServersOption)get_store().add_element_user(V6SNTPSERVERSOPTION$24);
            return target;
        }
    }
    
    /**
     * Unsets the "v6SntpServersOption" element
     */
    public void unsetV6SntpServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6SNTPSERVERSOPTION$24, 0);
        }
    }
    
    /**
     * Gets the "v6InfoRefreshTimeOption" element
     */
    public com.jagornet.dhcp.xml.V6InfoRefreshTimeOption getV6InfoRefreshTimeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6InfoRefreshTimeOption target = null;
            target = (com.jagornet.dhcp.xml.V6InfoRefreshTimeOption)get_store().find_element_user(V6INFOREFRESHTIMEOPTION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6InfoRefreshTimeOption" element
     */
    public boolean isSetV6InfoRefreshTimeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6INFOREFRESHTIMEOPTION$26) != 0;
        }
    }
    
    /**
     * Sets the "v6InfoRefreshTimeOption" element
     */
    public void setV6InfoRefreshTimeOption(com.jagornet.dhcp.xml.V6InfoRefreshTimeOption v6InfoRefreshTimeOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6InfoRefreshTimeOption target = null;
            target = (com.jagornet.dhcp.xml.V6InfoRefreshTimeOption)get_store().find_element_user(V6INFOREFRESHTIMEOPTION$26, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6InfoRefreshTimeOption)get_store().add_element_user(V6INFOREFRESHTIMEOPTION$26);
            }
            target.set(v6InfoRefreshTimeOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6InfoRefreshTimeOption" element
     */
    public com.jagornet.dhcp.xml.V6InfoRefreshTimeOption addNewV6InfoRefreshTimeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6InfoRefreshTimeOption target = null;
            target = (com.jagornet.dhcp.xml.V6InfoRefreshTimeOption)get_store().add_element_user(V6INFOREFRESHTIMEOPTION$26);
            return target;
        }
    }
    
    /**
     * Unsets the "v6InfoRefreshTimeOption" element
     */
    public void unsetV6InfoRefreshTimeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6INFOREFRESHTIMEOPTION$26, 0);
        }
    }
    
    /**
     * Gets the "v6BcmcsDomainNamesOption" element
     */
    public com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption getV6BcmcsDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption)get_store().find_element_user(V6BCMCSDOMAINNAMESOPTION$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6BcmcsDomainNamesOption" element
     */
    public boolean isSetV6BcmcsDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6BCMCSDOMAINNAMESOPTION$28) != 0;
        }
    }
    
    /**
     * Sets the "v6BcmcsDomainNamesOption" element
     */
    public void setV6BcmcsDomainNamesOption(com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption v6BcmcsDomainNamesOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption)get_store().find_element_user(V6BCMCSDOMAINNAMESOPTION$28, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption)get_store().add_element_user(V6BCMCSDOMAINNAMESOPTION$28);
            }
            target.set(v6BcmcsDomainNamesOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6BcmcsDomainNamesOption" element
     */
    public com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption addNewV6BcmcsDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsDomainNamesOption)get_store().add_element_user(V6BCMCSDOMAINNAMESOPTION$28);
            return target;
        }
    }
    
    /**
     * Unsets the "v6BcmcsDomainNamesOption" element
     */
    public void unsetV6BcmcsDomainNamesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6BCMCSDOMAINNAMESOPTION$28, 0);
        }
    }
    
    /**
     * Gets the "v6BcmcsAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6BcmcsAddressesOption getV6BcmcsAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsAddressesOption)get_store().find_element_user(V6BCMCSADDRESSESOPTION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6BcmcsAddressesOption" element
     */
    public boolean isSetV6BcmcsAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6BCMCSADDRESSESOPTION$30) != 0;
        }
    }
    
    /**
     * Sets the "v6BcmcsAddressesOption" element
     */
    public void setV6BcmcsAddressesOption(com.jagornet.dhcp.xml.V6BcmcsAddressesOption v6BcmcsAddressesOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsAddressesOption)get_store().find_element_user(V6BCMCSADDRESSESOPTION$30, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6BcmcsAddressesOption)get_store().add_element_user(V6BCMCSADDRESSESOPTION$30);
            }
            target.set(v6BcmcsAddressesOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6BcmcsAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6BcmcsAddressesOption addNewV6BcmcsAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6BcmcsAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6BcmcsAddressesOption)get_store().add_element_user(V6BCMCSADDRESSESOPTION$30);
            return target;
        }
    }
    
    /**
     * Unsets the "v6BcmcsAddressesOption" element
     */
    public void unsetV6BcmcsAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6BCMCSADDRESSESOPTION$30, 0);
        }
    }
    
    /**
     * Gets the "v6GeoconfCivicOption" element
     */
    public com.jagornet.dhcp.xml.V6GeoconfCivicOption getV6GeoconfCivicOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6GeoconfCivicOption target = null;
            target = (com.jagornet.dhcp.xml.V6GeoconfCivicOption)get_store().find_element_user(V6GEOCONFCIVICOPTION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6GeoconfCivicOption" element
     */
    public boolean isSetV6GeoconfCivicOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6GEOCONFCIVICOPTION$32) != 0;
        }
    }
    
    /**
     * Sets the "v6GeoconfCivicOption" element
     */
    public void setV6GeoconfCivicOption(com.jagornet.dhcp.xml.V6GeoconfCivicOption v6GeoconfCivicOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6GeoconfCivicOption target = null;
            target = (com.jagornet.dhcp.xml.V6GeoconfCivicOption)get_store().find_element_user(V6GEOCONFCIVICOPTION$32, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6GeoconfCivicOption)get_store().add_element_user(V6GEOCONFCIVICOPTION$32);
            }
            target.set(v6GeoconfCivicOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6GeoconfCivicOption" element
     */
    public com.jagornet.dhcp.xml.V6GeoconfCivicOption addNewV6GeoconfCivicOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6GeoconfCivicOption target = null;
            target = (com.jagornet.dhcp.xml.V6GeoconfCivicOption)get_store().add_element_user(V6GEOCONFCIVICOPTION$32);
            return target;
        }
    }
    
    /**
     * Unsets the "v6GeoconfCivicOption" element
     */
    public void unsetV6GeoconfCivicOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6GEOCONFCIVICOPTION$32, 0);
        }
    }
    
    /**
     * Gets the "v6PanaAgentAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6PanaAgentAddressesOption getV6PanaAgentAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PanaAgentAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6PanaAgentAddressesOption)get_store().find_element_user(V6PANAAGENTADDRESSESOPTION$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6PanaAgentAddressesOption" element
     */
    public boolean isSetV6PanaAgentAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6PANAAGENTADDRESSESOPTION$34) != 0;
        }
    }
    
    /**
     * Sets the "v6PanaAgentAddressesOption" element
     */
    public void setV6PanaAgentAddressesOption(com.jagornet.dhcp.xml.V6PanaAgentAddressesOption v6PanaAgentAddressesOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PanaAgentAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6PanaAgentAddressesOption)get_store().find_element_user(V6PANAAGENTADDRESSESOPTION$34, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6PanaAgentAddressesOption)get_store().add_element_user(V6PANAAGENTADDRESSESOPTION$34);
            }
            target.set(v6PanaAgentAddressesOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6PanaAgentAddressesOption" element
     */
    public com.jagornet.dhcp.xml.V6PanaAgentAddressesOption addNewV6PanaAgentAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PanaAgentAddressesOption target = null;
            target = (com.jagornet.dhcp.xml.V6PanaAgentAddressesOption)get_store().add_element_user(V6PANAAGENTADDRESSESOPTION$34);
            return target;
        }
    }
    
    /**
     * Unsets the "v6PanaAgentAddressesOption" element
     */
    public void unsetV6PanaAgentAddressesOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6PANAAGENTADDRESSESOPTION$34, 0);
        }
    }
    
    /**
     * Gets the "v6NewPosixTimezoneOption" element
     */
    public com.jagornet.dhcp.xml.V6NewPosixTimezoneOption getV6NewPosixTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewPosixTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewPosixTimezoneOption)get_store().find_element_user(V6NEWPOSIXTIMEZONEOPTION$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NewPosixTimezoneOption" element
     */
    public boolean isSetV6NewPosixTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NEWPOSIXTIMEZONEOPTION$36) != 0;
        }
    }
    
    /**
     * Sets the "v6NewPosixTimezoneOption" element
     */
    public void setV6NewPosixTimezoneOption(com.jagornet.dhcp.xml.V6NewPosixTimezoneOption v6NewPosixTimezoneOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewPosixTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewPosixTimezoneOption)get_store().find_element_user(V6NEWPOSIXTIMEZONEOPTION$36, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NewPosixTimezoneOption)get_store().add_element_user(V6NEWPOSIXTIMEZONEOPTION$36);
            }
            target.set(v6NewPosixTimezoneOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NewPosixTimezoneOption" element
     */
    public com.jagornet.dhcp.xml.V6NewPosixTimezoneOption addNewV6NewPosixTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewPosixTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewPosixTimezoneOption)get_store().add_element_user(V6NEWPOSIXTIMEZONEOPTION$36);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NewPosixTimezoneOption" element
     */
    public void unsetV6NewPosixTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NEWPOSIXTIMEZONEOPTION$36, 0);
        }
    }
    
    /**
     * Gets the "v6NewTzdbTimezoneOption" element
     */
    public com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption getV6NewTzdbTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption)get_store().find_element_user(V6NEWTZDBTIMEZONEOPTION$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6NewTzdbTimezoneOption" element
     */
    public boolean isSetV6NewTzdbTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6NEWTZDBTIMEZONEOPTION$38) != 0;
        }
    }
    
    /**
     * Sets the "v6NewTzdbTimezoneOption" element
     */
    public void setV6NewTzdbTimezoneOption(com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption v6NewTzdbTimezoneOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption)get_store().find_element_user(V6NEWTZDBTIMEZONEOPTION$38, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption)get_store().add_element_user(V6NEWTZDBTIMEZONEOPTION$38);
            }
            target.set(v6NewTzdbTimezoneOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6NewTzdbTimezoneOption" element
     */
    public com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption addNewV6NewTzdbTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption target = null;
            target = (com.jagornet.dhcp.xml.V6NewTzdbTimezoneOption)get_store().add_element_user(V6NEWTZDBTIMEZONEOPTION$38);
            return target;
        }
    }
    
    /**
     * Unsets the "v6NewTzdbTimezoneOption" element
     */
    public void unsetV6NewTzdbTimezoneOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6NEWTZDBTIMEZONEOPTION$38, 0);
        }
    }
    
    /**
     * Gets the "v6LostServerDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6LostServerDomainNameOption getV6LostServerDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6LostServerDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6LostServerDomainNameOption)get_store().find_element_user(V6LOSTSERVERDOMAINNAMEOPTION$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6LostServerDomainNameOption" element
     */
    public boolean isSetV6LostServerDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6LOSTSERVERDOMAINNAMEOPTION$40) != 0;
        }
    }
    
    /**
     * Sets the "v6LostServerDomainNameOption" element
     */
    public void setV6LostServerDomainNameOption(com.jagornet.dhcp.xml.V6LostServerDomainNameOption v6LostServerDomainNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6LostServerDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6LostServerDomainNameOption)get_store().find_element_user(V6LOSTSERVERDOMAINNAMEOPTION$40, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6LostServerDomainNameOption)get_store().add_element_user(V6LOSTSERVERDOMAINNAMEOPTION$40);
            }
            target.set(v6LostServerDomainNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6LostServerDomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V6LostServerDomainNameOption addNewV6LostServerDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6LostServerDomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V6LostServerDomainNameOption)get_store().add_element_user(V6LOSTSERVERDOMAINNAMEOPTION$40);
            return target;
        }
    }
    
    /**
     * Unsets the "v6LostServerDomainNameOption" element
     */
    public void unsetV6LostServerDomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6LOSTSERVERDOMAINNAMEOPTION$40, 0);
        }
    }
    
    /**
     * Gets the "v6OtherOptions" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType getV6OtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(V6OTHEROPTIONS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6OtherOptions" element
     */
    public boolean isSetV6OtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6OTHEROPTIONS$42) != 0;
        }
    }
    
    /**
     * Sets the "v6OtherOptions" element
     */
    public void setV6OtherOptions(com.jagornet.dhcp.xml.GenericOptionsType v6OtherOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(V6OTHEROPTIONS$42, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(V6OTHEROPTIONS$42);
            }
            target.set(v6OtherOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "v6OtherOptions" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType addNewV6OtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(V6OTHEROPTIONS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "v6OtherOptions" element
     */
    public void unsetV6OtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6OTHEROPTIONS$42, 0);
        }
    }
}
