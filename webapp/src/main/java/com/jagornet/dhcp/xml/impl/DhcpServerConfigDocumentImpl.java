/*
 * An XML document type.
 * Localname: dhcpServerConfig
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.DhcpServerConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * A document containing one dhcpServerConfig(@http://jagornet.com/dhcp/xml) element.
 *
 * This is a complex type.
 */
public class DhcpServerConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.DhcpServerConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public DhcpServerConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DHCPSERVERCONFIG$0 = 
        new javax.xml.namespace.QName("http://jagornet.com/dhcp/xml", "dhcpServerConfig");
    
    
    /**
     * Gets the "dhcpServerConfig" element
     */
    public com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig getDhcpServerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig target = null;
            target = (com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig)get_store().find_element_user(DHCPSERVERCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dhcpServerConfig" element
     */
    public void setDhcpServerConfig(com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig dhcpServerConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig target = null;
            target = (com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig)get_store().find_element_user(DHCPSERVERCONFIG$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig)get_store().add_element_user(DHCPSERVERCONFIG$0);
            }
            target.set(dhcpServerConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "dhcpServerConfig" element
     */
    public com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig addNewDhcpServerConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig target = null;
            target = (com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig)get_store().add_element_user(DHCPSERVERCONFIG$0);
            return target;
        }
    }
    /**
     * An XML dhcpServerConfig(@http://jagornet.com/dhcp/xml).
     *
     * This is a complex type.
     */
    public static class DhcpServerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.DhcpServerConfigDocument.DhcpServerConfig
    {
        private static final long serialVersionUID = 1L;
        
        public DhcpServerConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName V6SERVERIDOPTION$0 = 
            new javax.xml.namespace.QName("", "v6ServerIdOption");
        private static final javax.xml.namespace.QName V4SERVERIDOPTION$2 = 
            new javax.xml.namespace.QName("", "v4ServerIdOption");
        private static final javax.xml.namespace.QName POLICIES$4 = 
            new javax.xml.namespace.QName("", "policies");
        private static final javax.xml.namespace.QName V6MSGCONFIGOPTIONS$6 = 
            new javax.xml.namespace.QName("", "v6MsgConfigOptions");
        private static final javax.xml.namespace.QName V6IANACONFIGOPTIONS$8 = 
            new javax.xml.namespace.QName("", "v6IaNaConfigOptions");
        private static final javax.xml.namespace.QName V6NAADDRCONFIGOPTIONS$10 = 
            new javax.xml.namespace.QName("", "v6NaAddrConfigOptions");
        private static final javax.xml.namespace.QName V6IATACONFIGOPTIONS$12 = 
            new javax.xml.namespace.QName("", "v6IaTaConfigOptions");
        private static final javax.xml.namespace.QName V6TAADDRCONFIGOPTIONS$14 = 
            new javax.xml.namespace.QName("", "v6TaAddrConfigOptions");
        private static final javax.xml.namespace.QName V6IAPDCONFIGOPTIONS$16 = 
            new javax.xml.namespace.QName("", "v6IaPdConfigOptions");
        private static final javax.xml.namespace.QName V6PREFIXCONFIGOPTIONS$18 = 
            new javax.xml.namespace.QName("", "v6PrefixConfigOptions");
        private static final javax.xml.namespace.QName V4CONFIGOPTIONS$20 = 
            new javax.xml.namespace.QName("", "v4ConfigOptions");
        private static final javax.xml.namespace.QName FILTERS$22 = 
            new javax.xml.namespace.QName("", "filters");
        private static final javax.xml.namespace.QName LINKS$24 = 
            new javax.xml.namespace.QName("", "links");
        
        
        /**
         * Gets the "v6ServerIdOption" element
         */
        public com.jagornet.dhcp.xml.V6ServerIdOption getV6ServerIdOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.jagornet.dhcp.xml.V6ServerIdOption target = null;
                target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().find_element_user(V6SERVERIDOPTION$0, 0);
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
                return get_store().count_elements(V6SERVERIDOPTION$0) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().find_element_user(V6SERVERIDOPTION$0, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().add_element_user(V6SERVERIDOPTION$0);
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
                target = (com.jagornet.dhcp.xml.V6ServerIdOption)get_store().add_element_user(V6SERVERIDOPTION$0);
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
                get_store().remove_element(V6SERVERIDOPTION$0, 0);
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
                target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().find_element_user(V4SERVERIDOPTION$2, 0);
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
                return get_store().count_elements(V4SERVERIDOPTION$2) != 0;
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
                target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().find_element_user(V4SERVERIDOPTION$2, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().add_element_user(V4SERVERIDOPTION$2);
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
                target = (com.jagornet.dhcp.xml.V4ServerIdOption)get_store().add_element_user(V4SERVERIDOPTION$2);
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
                get_store().remove_element(V4SERVERIDOPTION$2, 0);
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
         * Gets the "v6MsgConfigOptions" element
         */
        public com.jagornet.dhcp.xml.V6ConfigOptionsType getV6MsgConfigOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6MSGCONFIGOPTIONS$6, 0);
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
                return get_store().count_elements(V6MSGCONFIGOPTIONS$6) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6MSGCONFIGOPTIONS$6, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6MSGCONFIGOPTIONS$6);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6MSGCONFIGOPTIONS$6);
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
                get_store().remove_element(V6MSGCONFIGOPTIONS$6, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IANACONFIGOPTIONS$8, 0);
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
                return get_store().count_elements(V6IANACONFIGOPTIONS$8) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IANACONFIGOPTIONS$8, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IANACONFIGOPTIONS$8);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IANACONFIGOPTIONS$8);
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
                get_store().remove_element(V6IANACONFIGOPTIONS$8, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6NAADDRCONFIGOPTIONS$10, 0);
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
                return get_store().count_elements(V6NAADDRCONFIGOPTIONS$10) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6NAADDRCONFIGOPTIONS$10, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6NAADDRCONFIGOPTIONS$10);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6NAADDRCONFIGOPTIONS$10);
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
                get_store().remove_element(V6NAADDRCONFIGOPTIONS$10, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IATACONFIGOPTIONS$12, 0);
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
                return get_store().count_elements(V6IATACONFIGOPTIONS$12) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IATACONFIGOPTIONS$12, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IATACONFIGOPTIONS$12);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IATACONFIGOPTIONS$12);
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
                get_store().remove_element(V6IATACONFIGOPTIONS$12, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6TAADDRCONFIGOPTIONS$14, 0);
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
                return get_store().count_elements(V6TAADDRCONFIGOPTIONS$14) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6TAADDRCONFIGOPTIONS$14, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6TAADDRCONFIGOPTIONS$14);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6TAADDRCONFIGOPTIONS$14);
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
                get_store().remove_element(V6TAADDRCONFIGOPTIONS$14, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IAPDCONFIGOPTIONS$16, 0);
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
                return get_store().count_elements(V6IAPDCONFIGOPTIONS$16) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6IAPDCONFIGOPTIONS$16, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IAPDCONFIGOPTIONS$16);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6IAPDCONFIGOPTIONS$16);
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
                get_store().remove_element(V6IAPDCONFIGOPTIONS$16, 0);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6PREFIXCONFIGOPTIONS$18, 0);
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
                return get_store().count_elements(V6PREFIXCONFIGOPTIONS$18) != 0;
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(V6PREFIXCONFIGOPTIONS$18, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6PREFIXCONFIGOPTIONS$18);
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
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(V6PREFIXCONFIGOPTIONS$18);
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
                get_store().remove_element(V6PREFIXCONFIGOPTIONS$18, 0);
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
                target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(V4CONFIGOPTIONS$20, 0);
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
                return get_store().count_elements(V4CONFIGOPTIONS$20) != 0;
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
                target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().find_element_user(V4CONFIGOPTIONS$20, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(V4CONFIGOPTIONS$20);
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
                target = (com.jagornet.dhcp.xml.V4ConfigOptionsType)get_store().add_element_user(V4CONFIGOPTIONS$20);
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
                get_store().remove_element(V4CONFIGOPTIONS$20, 0);
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
                target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$22, 0);
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
                return get_store().count_elements(FILTERS$22) != 0;
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
                target = (com.jagornet.dhcp.xml.FiltersType)get_store().find_element_user(FILTERS$22, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$22);
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
                target = (com.jagornet.dhcp.xml.FiltersType)get_store().add_element_user(FILTERS$22);
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
                get_store().remove_element(FILTERS$22, 0);
            }
        }
        
        /**
         * Gets the "links" element
         */
        public com.jagornet.dhcp.xml.LinksType getLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.jagornet.dhcp.xml.LinksType target = null;
                target = (com.jagornet.dhcp.xml.LinksType)get_store().find_element_user(LINKS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "links" element
         */
        public boolean isSetLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKS$24) != 0;
            }
        }
        
        /**
         * Sets the "links" element
         */
        public void setLinks(com.jagornet.dhcp.xml.LinksType links)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.jagornet.dhcp.xml.LinksType target = null;
                target = (com.jagornet.dhcp.xml.LinksType)get_store().find_element_user(LINKS$24, 0);
                if (target == null)
                {
                    target = (com.jagornet.dhcp.xml.LinksType)get_store().add_element_user(LINKS$24);
                }
                target.set(links);
            }
        }
        
        /**
         * Appends and returns a new empty "links" element
         */
        public com.jagornet.dhcp.xml.LinksType addNewLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.jagornet.dhcp.xml.LinksType target = null;
                target = (com.jagornet.dhcp.xml.LinksType)get_store().add_element_user(LINKS$24);
                return target;
            }
        }
        
        /**
         * Unsets the "links" element
         */
        public void unsetLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKS$24, 0);
            }
        }
    }
}
