/*
 * XML Type:  v6PrefixPoolsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6PrefixPoolsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6PrefixPoolsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6PrefixPoolsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6PrefixPoolsType
{
    private static final long serialVersionUID = 1L;
    
    public V6PrefixPoolsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOL$0 = 
        new javax.xml.namespace.QName("", "pool");
    
    
    /**
     * Gets a List of "pool" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V6PrefixPool> getPoolList()
    {
        final class PoolList extends java.util.AbstractList<com.jagornet.dhcp.xml.V6PrefixPool>
        {
            public com.jagornet.dhcp.xml.V6PrefixPool get(int i)
                { return V6PrefixPoolsTypeImpl.this.getPoolArray(i); }
            
            public com.jagornet.dhcp.xml.V6PrefixPool set(int i, com.jagornet.dhcp.xml.V6PrefixPool o)
            {
                com.jagornet.dhcp.xml.V6PrefixPool old = V6PrefixPoolsTypeImpl.this.getPoolArray(i);
                V6PrefixPoolsTypeImpl.this.setPoolArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V6PrefixPool o)
                { V6PrefixPoolsTypeImpl.this.insertNewPool(i).set(o); }
            
            public com.jagornet.dhcp.xml.V6PrefixPool remove(int i)
            {
                com.jagornet.dhcp.xml.V6PrefixPool old = V6PrefixPoolsTypeImpl.this.getPoolArray(i);
                V6PrefixPoolsTypeImpl.this.removePool(i);
                return old;
            }
            
            public int size()
                { return V6PrefixPoolsTypeImpl.this.sizeOfPoolArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PoolList();
        }
    }
    
    /**
     * Gets array of all "pool" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.V6PrefixPool[] getPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V6PrefixPool> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V6PrefixPool>();
            get_store().find_all_element_users(POOL$0, targetList);
            com.jagornet.dhcp.xml.V6PrefixPool[] result = new com.jagornet.dhcp.xml.V6PrefixPool[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pool" element
     */
    public com.jagornet.dhcp.xml.V6PrefixPool getPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPool target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pool" element
     */
    public int sizeOfPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOL$0);
        }
    }
    
    /**
     * Sets array of all "pool" element
     */
    public void setPoolArray(com.jagornet.dhcp.xml.V6PrefixPool[] poolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poolArray, POOL$0);
        }
    }
    
    /**
     * Sets ith "pool" element
     */
    public void setPoolArray(int i, com.jagornet.dhcp.xml.V6PrefixPool pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPool target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPool)get_store().find_element_user(POOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pool);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pool" element
     */
    public com.jagornet.dhcp.xml.V6PrefixPool insertNewPool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPool target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPool)get_store().insert_element_user(POOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pool" element
     */
    public com.jagornet.dhcp.xml.V6PrefixPool addNewPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixPool target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixPool)get_store().add_element_user(POOL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pool" element
     */
    public void removePool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOL$0, i);
        }
    }
}
