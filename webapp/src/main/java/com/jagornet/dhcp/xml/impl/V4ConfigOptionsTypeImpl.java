/*
 * XML Type:  v4ConfigOptionsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V4ConfigOptionsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v4ConfigOptionsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V4ConfigOptionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V4ConfigOptionsType
{
    private static final long serialVersionUID = 1L;
    
    public V4ConfigOptionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V4SUBNETMASKOPTION$0 = 
        new javax.xml.namespace.QName("", "v4SubnetMaskOption");
    private static final javax.xml.namespace.QName V4TIMEOFFSETOPTION$2 = 
        new javax.xml.namespace.QName("", "v4TimeOffsetOption");
    private static final javax.xml.namespace.QName V4ROUTERSOPTION$4 = 
        new javax.xml.namespace.QName("", "v4RoutersOption");
    private static final javax.xml.namespace.QName V4TIMESERVERSOPTION$6 = 
        new javax.xml.namespace.QName("", "v4TimeServersOption");
    private static final javax.xml.namespace.QName V4DOMAINSERVERSOPTION$8 = 
        new javax.xml.namespace.QName("", "v4DomainServersOption");
    private static final javax.xml.namespace.QName V4DOMAINNAMEOPTION$10 = 
        new javax.xml.namespace.QName("", "v4DomainNameOption");
    private static final javax.xml.namespace.QName V4VENDORSPECIFICOPTION$12 = 
        new javax.xml.namespace.QName("", "v4VendorSpecificOption");
    private static final javax.xml.namespace.QName V4NETBIOSNAMESERVERSOPTION$14 = 
        new javax.xml.namespace.QName("", "v4NetbiosNameServersOption");
    private static final javax.xml.namespace.QName V4NETBIOSNODETYPEOPTION$16 = 
        new javax.xml.namespace.QName("", "v4NetbiosNodeTypeOption");
    private static final javax.xml.namespace.QName V4TFTPSERVERNAMEOPTION$18 = 
        new javax.xml.namespace.QName("", "v4TftpServerNameOption");
    private static final javax.xml.namespace.QName V4BOOTFILENAMEOPTION$20 = 
        new javax.xml.namespace.QName("", "v4BootFileNameOption");
    private static final javax.xml.namespace.QName OTHEROPTIONS$22 = 
        new javax.xml.namespace.QName("", "otherOptions");
    
    
    /**
     * Gets the "v4SubnetMaskOption" element
     */
    public com.jagornet.dhcp.xml.V4SubnetMaskOption getV4SubnetMaskOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4SubnetMaskOption target = null;
            target = (com.jagornet.dhcp.xml.V4SubnetMaskOption)get_store().find_element_user(V4SUBNETMASKOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4SubnetMaskOption" element
     */
    public boolean isSetV4SubnetMaskOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4SUBNETMASKOPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "v4SubnetMaskOption" element
     */
    public void setV4SubnetMaskOption(com.jagornet.dhcp.xml.V4SubnetMaskOption v4SubnetMaskOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4SubnetMaskOption target = null;
            target = (com.jagornet.dhcp.xml.V4SubnetMaskOption)get_store().find_element_user(V4SUBNETMASKOPTION$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4SubnetMaskOption)get_store().add_element_user(V4SUBNETMASKOPTION$0);
            }
            target.set(v4SubnetMaskOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4SubnetMaskOption" element
     */
    public com.jagornet.dhcp.xml.V4SubnetMaskOption addNewV4SubnetMaskOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4SubnetMaskOption target = null;
            target = (com.jagornet.dhcp.xml.V4SubnetMaskOption)get_store().add_element_user(V4SUBNETMASKOPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "v4SubnetMaskOption" element
     */
    public void unsetV4SubnetMaskOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4SUBNETMASKOPTION$0, 0);
        }
    }
    
    /**
     * Gets the "v4TimeOffsetOption" element
     */
    public com.jagornet.dhcp.xml.V4TimeOffsetOption getV4TimeOffsetOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeOffsetOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeOffsetOption)get_store().find_element_user(V4TIMEOFFSETOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4TimeOffsetOption" element
     */
    public boolean isSetV4TimeOffsetOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4TIMEOFFSETOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "v4TimeOffsetOption" element
     */
    public void setV4TimeOffsetOption(com.jagornet.dhcp.xml.V4TimeOffsetOption v4TimeOffsetOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeOffsetOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeOffsetOption)get_store().find_element_user(V4TIMEOFFSETOPTION$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4TimeOffsetOption)get_store().add_element_user(V4TIMEOFFSETOPTION$2);
            }
            target.set(v4TimeOffsetOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4TimeOffsetOption" element
     */
    public com.jagornet.dhcp.xml.V4TimeOffsetOption addNewV4TimeOffsetOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeOffsetOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeOffsetOption)get_store().add_element_user(V4TIMEOFFSETOPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "v4TimeOffsetOption" element
     */
    public void unsetV4TimeOffsetOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4TIMEOFFSETOPTION$2, 0);
        }
    }
    
    /**
     * Gets the "v4RoutersOption" element
     */
    public com.jagornet.dhcp.xml.V4RoutersOption getV4RoutersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4RoutersOption target = null;
            target = (com.jagornet.dhcp.xml.V4RoutersOption)get_store().find_element_user(V4ROUTERSOPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4RoutersOption" element
     */
    public boolean isSetV4RoutersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4ROUTERSOPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "v4RoutersOption" element
     */
    public void setV4RoutersOption(com.jagornet.dhcp.xml.V4RoutersOption v4RoutersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4RoutersOption target = null;
            target = (com.jagornet.dhcp.xml.V4RoutersOption)get_store().find_element_user(V4ROUTERSOPTION$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4RoutersOption)get_store().add_element_user(V4ROUTERSOPTION$4);
            }
            target.set(v4RoutersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4RoutersOption" element
     */
    public com.jagornet.dhcp.xml.V4RoutersOption addNewV4RoutersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4RoutersOption target = null;
            target = (com.jagornet.dhcp.xml.V4RoutersOption)get_store().add_element_user(V4ROUTERSOPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "v4RoutersOption" element
     */
    public void unsetV4RoutersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4ROUTERSOPTION$4, 0);
        }
    }
    
    /**
     * Gets the "v4TimeServersOption" element
     */
    public com.jagornet.dhcp.xml.V4TimeServersOption getV4TimeServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeServersOption)get_store().find_element_user(V4TIMESERVERSOPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4TimeServersOption" element
     */
    public boolean isSetV4TimeServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4TIMESERVERSOPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "v4TimeServersOption" element
     */
    public void setV4TimeServersOption(com.jagornet.dhcp.xml.V4TimeServersOption v4TimeServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeServersOption)get_store().find_element_user(V4TIMESERVERSOPTION$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4TimeServersOption)get_store().add_element_user(V4TIMESERVERSOPTION$6);
            }
            target.set(v4TimeServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4TimeServersOption" element
     */
    public com.jagornet.dhcp.xml.V4TimeServersOption addNewV4TimeServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TimeServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4TimeServersOption)get_store().add_element_user(V4TIMESERVERSOPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "v4TimeServersOption" element
     */
    public void unsetV4TimeServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4TIMESERVERSOPTION$6, 0);
        }
    }
    
    /**
     * Gets the "v4DomainServersOption" element
     */
    public com.jagornet.dhcp.xml.V4DomainServersOption getV4DomainServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainServersOption)get_store().find_element_user(V4DOMAINSERVERSOPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4DomainServersOption" element
     */
    public boolean isSetV4DomainServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4DOMAINSERVERSOPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "v4DomainServersOption" element
     */
    public void setV4DomainServersOption(com.jagornet.dhcp.xml.V4DomainServersOption v4DomainServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainServersOption)get_store().find_element_user(V4DOMAINSERVERSOPTION$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4DomainServersOption)get_store().add_element_user(V4DOMAINSERVERSOPTION$8);
            }
            target.set(v4DomainServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4DomainServersOption" element
     */
    public com.jagornet.dhcp.xml.V4DomainServersOption addNewV4DomainServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainServersOption)get_store().add_element_user(V4DOMAINSERVERSOPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "v4DomainServersOption" element
     */
    public void unsetV4DomainServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4DOMAINSERVERSOPTION$8, 0);
        }
    }
    
    /**
     * Gets the "v4DomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V4DomainNameOption getV4DomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainNameOption)get_store().find_element_user(V4DOMAINNAMEOPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4DomainNameOption" element
     */
    public boolean isSetV4DomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4DOMAINNAMEOPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "v4DomainNameOption" element
     */
    public void setV4DomainNameOption(com.jagornet.dhcp.xml.V4DomainNameOption v4DomainNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainNameOption)get_store().find_element_user(V4DOMAINNAMEOPTION$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4DomainNameOption)get_store().add_element_user(V4DOMAINNAMEOPTION$10);
            }
            target.set(v4DomainNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4DomainNameOption" element
     */
    public com.jagornet.dhcp.xml.V4DomainNameOption addNewV4DomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4DomainNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4DomainNameOption)get_store().add_element_user(V4DOMAINNAMEOPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "v4DomainNameOption" element
     */
    public void unsetV4DomainNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4DOMAINNAMEOPTION$10, 0);
        }
    }
    
    /**
     * Gets the "v4VendorSpecificOption" element
     */
    public com.jagornet.dhcp.xml.V4VendorSpecificOption getV4VendorSpecificOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorSpecificOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorSpecificOption)get_store().find_element_user(V4VENDORSPECIFICOPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4VendorSpecificOption" element
     */
    public boolean isSetV4VendorSpecificOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4VENDORSPECIFICOPTION$12) != 0;
        }
    }
    
    /**
     * Sets the "v4VendorSpecificOption" element
     */
    public void setV4VendorSpecificOption(com.jagornet.dhcp.xml.V4VendorSpecificOption v4VendorSpecificOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorSpecificOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorSpecificOption)get_store().find_element_user(V4VENDORSPECIFICOPTION$12, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4VendorSpecificOption)get_store().add_element_user(V4VENDORSPECIFICOPTION$12);
            }
            target.set(v4VendorSpecificOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4VendorSpecificOption" element
     */
    public com.jagornet.dhcp.xml.V4VendorSpecificOption addNewV4VendorSpecificOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorSpecificOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorSpecificOption)get_store().add_element_user(V4VENDORSPECIFICOPTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "v4VendorSpecificOption" element
     */
    public void unsetV4VendorSpecificOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4VENDORSPECIFICOPTION$12, 0);
        }
    }
    
    /**
     * Gets the "v4NetbiosNameServersOption" element
     */
    public com.jagornet.dhcp.xml.V4NetbiosNameServersOption getV4NetbiosNameServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNameServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNameServersOption)get_store().find_element_user(V4NETBIOSNAMESERVERSOPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4NetbiosNameServersOption" element
     */
    public boolean isSetV4NetbiosNameServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4NETBIOSNAMESERVERSOPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "v4NetbiosNameServersOption" element
     */
    public void setV4NetbiosNameServersOption(com.jagornet.dhcp.xml.V4NetbiosNameServersOption v4NetbiosNameServersOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNameServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNameServersOption)get_store().find_element_user(V4NETBIOSNAMESERVERSOPTION$14, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4NetbiosNameServersOption)get_store().add_element_user(V4NETBIOSNAMESERVERSOPTION$14);
            }
            target.set(v4NetbiosNameServersOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4NetbiosNameServersOption" element
     */
    public com.jagornet.dhcp.xml.V4NetbiosNameServersOption addNewV4NetbiosNameServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNameServersOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNameServersOption)get_store().add_element_user(V4NETBIOSNAMESERVERSOPTION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "v4NetbiosNameServersOption" element
     */
    public void unsetV4NetbiosNameServersOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4NETBIOSNAMESERVERSOPTION$14, 0);
        }
    }
    
    /**
     * Gets the "v4NetbiosNodeTypeOption" element
     */
    public com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption getV4NetbiosNodeTypeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption)get_store().find_element_user(V4NETBIOSNODETYPEOPTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4NetbiosNodeTypeOption" element
     */
    public boolean isSetV4NetbiosNodeTypeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4NETBIOSNODETYPEOPTION$16) != 0;
        }
    }
    
    /**
     * Sets the "v4NetbiosNodeTypeOption" element
     */
    public void setV4NetbiosNodeTypeOption(com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption v4NetbiosNodeTypeOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption)get_store().find_element_user(V4NETBIOSNODETYPEOPTION$16, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption)get_store().add_element_user(V4NETBIOSNODETYPEOPTION$16);
            }
            target.set(v4NetbiosNodeTypeOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4NetbiosNodeTypeOption" element
     */
    public com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption addNewV4NetbiosNodeTypeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption target = null;
            target = (com.jagornet.dhcp.xml.V4NetbiosNodeTypeOption)get_store().add_element_user(V4NETBIOSNODETYPEOPTION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "v4NetbiosNodeTypeOption" element
     */
    public void unsetV4NetbiosNodeTypeOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4NETBIOSNODETYPEOPTION$16, 0);
        }
    }
    
    /**
     * Gets the "v4TftpServerNameOption" element
     */
    public com.jagornet.dhcp.xml.V4TftpServerNameOption getV4TftpServerNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TftpServerNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4TftpServerNameOption)get_store().find_element_user(V4TFTPSERVERNAMEOPTION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4TftpServerNameOption" element
     */
    public boolean isSetV4TftpServerNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4TFTPSERVERNAMEOPTION$18) != 0;
        }
    }
    
    /**
     * Sets the "v4TftpServerNameOption" element
     */
    public void setV4TftpServerNameOption(com.jagornet.dhcp.xml.V4TftpServerNameOption v4TftpServerNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TftpServerNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4TftpServerNameOption)get_store().find_element_user(V4TFTPSERVERNAMEOPTION$18, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4TftpServerNameOption)get_store().add_element_user(V4TFTPSERVERNAMEOPTION$18);
            }
            target.set(v4TftpServerNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4TftpServerNameOption" element
     */
    public com.jagornet.dhcp.xml.V4TftpServerNameOption addNewV4TftpServerNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4TftpServerNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4TftpServerNameOption)get_store().add_element_user(V4TFTPSERVERNAMEOPTION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "v4TftpServerNameOption" element
     */
    public void unsetV4TftpServerNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4TFTPSERVERNAMEOPTION$18, 0);
        }
    }
    
    /**
     * Gets the "v4BootFileNameOption" element
     */
    public com.jagornet.dhcp.xml.V4BootFileNameOption getV4BootFileNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4BootFileNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4BootFileNameOption)get_store().find_element_user(V4BOOTFILENAMEOPTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4BootFileNameOption" element
     */
    public boolean isSetV4BootFileNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4BOOTFILENAMEOPTION$20) != 0;
        }
    }
    
    /**
     * Sets the "v4BootFileNameOption" element
     */
    public void setV4BootFileNameOption(com.jagornet.dhcp.xml.V4BootFileNameOption v4BootFileNameOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4BootFileNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4BootFileNameOption)get_store().find_element_user(V4BOOTFILENAMEOPTION$20, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4BootFileNameOption)get_store().add_element_user(V4BOOTFILENAMEOPTION$20);
            }
            target.set(v4BootFileNameOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4BootFileNameOption" element
     */
    public com.jagornet.dhcp.xml.V4BootFileNameOption addNewV4BootFileNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4BootFileNameOption target = null;
            target = (com.jagornet.dhcp.xml.V4BootFileNameOption)get_store().add_element_user(V4BOOTFILENAMEOPTION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "v4BootFileNameOption" element
     */
    public void unsetV4BootFileNameOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4BOOTFILENAMEOPTION$20, 0);
        }
    }
    
    /**
     * Gets the "otherOptions" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType getOtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(OTHEROPTIONS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "otherOptions" element
     */
    public boolean isSetOtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHEROPTIONS$22) != 0;
        }
    }
    
    /**
     * Sets the "otherOptions" element
     */
    public void setOtherOptions(com.jagornet.dhcp.xml.GenericOptionsType otherOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(OTHEROPTIONS$22, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(OTHEROPTIONS$22);
            }
            target.set(otherOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "otherOptions" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType addNewOtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(OTHEROPTIONS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "otherOptions" element
     */
    public void unsetOtherOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHEROPTIONS$22, 0);
        }
    }
}
