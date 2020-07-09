/*
 * XML Type:  domainNameListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.DomainNameListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML domainNameListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class DomainNameListOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.DomainNameListOptionType
{
    private static final long serialVersionUID = 1L;
    
    public DomainNameListOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINNAME$0 = 
        new javax.xml.namespace.QName("", "domainName");
    
    
    /**
     * Gets a List of "domainName" elements
     */
    public java.util.List<java.lang.String> getDomainNameList()
    {
        final class DomainNameList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return DomainNameListOptionTypeImpl.this.getDomainNameArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = DomainNameListOptionTypeImpl.this.getDomainNameArray(i);
                DomainNameListOptionTypeImpl.this.setDomainNameArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { DomainNameListOptionTypeImpl.this.insertDomainName(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = DomainNameListOptionTypeImpl.this.getDomainNameArray(i);
                DomainNameListOptionTypeImpl.this.removeDomainName(i);
                return old;
            }
            
            public int size()
                { return DomainNameListOptionTypeImpl.this.sizeOfDomainNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DomainNameList();
        }
    }
    
    /**
     * Gets array of all "domainName" elements
     * @deprecated
     */
    public java.lang.String[] getDomainNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.DomainName> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.DomainName>();
            get_store().find_all_element_users(DOMAINNAME$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "domainName" element
     */
    public java.lang.String getDomainNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "domainName" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.DomainName> xgetDomainNameList()
    {
        final class DomainNameList extends java.util.AbstractList<com.jagornet.dhcp.xml.DomainName>
        {
            public com.jagornet.dhcp.xml.DomainName get(int i)
                { return DomainNameListOptionTypeImpl.this.xgetDomainNameArray(i); }
            
            public com.jagornet.dhcp.xml.DomainName set(int i, com.jagornet.dhcp.xml.DomainName o)
            {
                com.jagornet.dhcp.xml.DomainName old = DomainNameListOptionTypeImpl.this.xgetDomainNameArray(i);
                DomainNameListOptionTypeImpl.this.xsetDomainNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.DomainName o)
                { DomainNameListOptionTypeImpl.this.insertNewDomainName(i).set(o); }
            
            public com.jagornet.dhcp.xml.DomainName remove(int i)
            {
                com.jagornet.dhcp.xml.DomainName old = DomainNameListOptionTypeImpl.this.xgetDomainNameArray(i);
                DomainNameListOptionTypeImpl.this.removeDomainName(i);
                return old;
            }
            
            public int size()
                { return DomainNameListOptionTypeImpl.this.sizeOfDomainNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DomainNameList();
        }
    }
    
    /**
     * Gets array of all "domainName" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.DomainName[] xgetDomainNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.DomainName> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.DomainName>();
            get_store().find_all_element_users(DOMAINNAME$0, targetList);
            com.jagornet.dhcp.xml.DomainName[] result = new com.jagornet.dhcp.xml.DomainName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "domainName" element
     */
    public com.jagornet.dhcp.xml.DomainName xgetDomainNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().find_element_user(DOMAINNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.jagornet.dhcp.xml.DomainName)target;
        }
    }
    
    /**
     * Returns number of "domainName" element
     */
    public int sizeOfDomainNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINNAME$0);
        }
    }
    
    /**
     * Sets array of all "domainName" element
     */
    public void setDomainNameArray(java.lang.String[] domainNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(domainNameArray, DOMAINNAME$0);
        }
    }
    
    /**
     * Sets ith "domainName" element
     */
    public void setDomainNameArray(int i, java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Sets (as xml) array of all "domainName" element
     */
    public void xsetDomainNameArray(com.jagornet.dhcp.xml.DomainName[]domainNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(domainNameArray, DOMAINNAME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "domainName" element
     */
    public void xsetDomainNameArray(int i, com.jagornet.dhcp.xml.DomainName domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().find_element_user(DOMAINNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(domainName);
        }
    }
    
    /**
     * Inserts the value as the ith "domainName" element
     */
    public void insertDomainName(int i, java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOMAINNAME$0, i);
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Appends the value as the last "domainName" element
     */
    public void addDomainName(java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$0);
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "domainName" element
     */
    public com.jagornet.dhcp.xml.DomainName insertNewDomainName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().insert_element_user(DOMAINNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "domainName" element
     */
    public com.jagornet.dhcp.xml.DomainName addNewDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.DomainName target = null;
            target = (com.jagornet.dhcp.xml.DomainName)get_store().add_element_user(DOMAINNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "domainName" element
     */
    public void removeDomainName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINNAME$0, i);
        }
    }
}
