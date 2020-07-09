/*
 * XML Type:  ipAddressListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.IpAddressListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML ipAddressListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class IpAddressListOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.IpAddressListOptionType
{
    private static final long serialVersionUID = 1L;
    
    public IpAddressListOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPADDRESS$0 = 
        new javax.xml.namespace.QName("", "ipAddress");
    
    
    /**
     * Gets a List of "ipAddress" elements
     */
    public java.util.List<java.lang.String> getIpAddressList()
    {
        final class IpAddressList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return IpAddressListOptionTypeImpl.this.getIpAddressArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = IpAddressListOptionTypeImpl.this.getIpAddressArray(i);
                IpAddressListOptionTypeImpl.this.setIpAddressArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { IpAddressListOptionTypeImpl.this.insertIpAddress(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = IpAddressListOptionTypeImpl.this.getIpAddressArray(i);
                IpAddressListOptionTypeImpl.this.removeIpAddress(i);
                return old;
            }
            
            public int size()
                { return IpAddressListOptionTypeImpl.this.sizeOfIpAddressArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IpAddressList();
        }
    }
    
    /**
     * Gets array of all "ipAddress" elements
     * @deprecated
     */
    public java.lang.String[] getIpAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.IpAddress> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.IpAddress>();
            get_store().find_all_element_users(IPADDRESS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ipAddress" element
     */
    public java.lang.String getIpAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ipAddress" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.IpAddress> xgetIpAddressList()
    {
        final class IpAddressList extends java.util.AbstractList<com.jagornet.dhcp.xml.IpAddress>
        {
            public com.jagornet.dhcp.xml.IpAddress get(int i)
                { return IpAddressListOptionTypeImpl.this.xgetIpAddressArray(i); }
            
            public com.jagornet.dhcp.xml.IpAddress set(int i, com.jagornet.dhcp.xml.IpAddress o)
            {
                com.jagornet.dhcp.xml.IpAddress old = IpAddressListOptionTypeImpl.this.xgetIpAddressArray(i);
                IpAddressListOptionTypeImpl.this.xsetIpAddressArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.IpAddress o)
                { IpAddressListOptionTypeImpl.this.insertNewIpAddress(i).set(o); }
            
            public com.jagornet.dhcp.xml.IpAddress remove(int i)
            {
                com.jagornet.dhcp.xml.IpAddress old = IpAddressListOptionTypeImpl.this.xgetIpAddressArray(i);
                IpAddressListOptionTypeImpl.this.removeIpAddress(i);
                return old;
            }
            
            public int size()
                { return IpAddressListOptionTypeImpl.this.sizeOfIpAddressArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IpAddressList();
        }
    }
    
    /**
     * Gets array of all "ipAddress" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.IpAddress[] xgetIpAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.IpAddress> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.IpAddress>();
            get_store().find_all_element_users(IPADDRESS$0, targetList);
            com.jagornet.dhcp.xml.IpAddress[] result = new com.jagornet.dhcp.xml.IpAddress[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ipAddress" element
     */
    public com.jagornet.dhcp.xml.IpAddress xgetIpAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.jagornet.dhcp.xml.IpAddress)target;
        }
    }
    
    /**
     * Returns number of "ipAddress" element
     */
    public int sizeOfIpAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "ipAddress" element
     */
    public void setIpAddressArray(java.lang.String[] ipAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ipAddressArray, IPADDRESS$0);
        }
    }
    
    /**
     * Sets ith "ipAddress" element
     */
    public void setIpAddressArray(int i, java.lang.String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(ipAddress);
        }
    }
    
    /**
     * Sets (as xml) array of all "ipAddress" element
     */
    public void xsetIpAddressArray(com.jagornet.dhcp.xml.IpAddress[]ipAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ipAddressArray, IPADDRESS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ipAddress" element
     */
    public void xsetIpAddressArray(int i, com.jagornet.dhcp.xml.IpAddress ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().find_element_user(IPADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ipAddress);
        }
    }
    
    /**
     * Inserts the value as the ith "ipAddress" element
     */
    public void insertIpAddress(int i, java.lang.String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IPADDRESS$0, i);
            target.setStringValue(ipAddress);
        }
    }
    
    /**
     * Appends the value as the last "ipAddress" element
     */
    public void addIpAddress(java.lang.String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPADDRESS$0);
            target.setStringValue(ipAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ipAddress" element
     */
    public com.jagornet.dhcp.xml.IpAddress insertNewIpAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().insert_element_user(IPADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ipAddress" element
     */
    public com.jagornet.dhcp.xml.IpAddress addNewIpAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IpAddress target = null;
            target = (com.jagornet.dhcp.xml.IpAddress)get_store().add_element_user(IPADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ipAddress" element
     */
    public void removeIpAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPADDRESS$0, i);
        }
    }
}
