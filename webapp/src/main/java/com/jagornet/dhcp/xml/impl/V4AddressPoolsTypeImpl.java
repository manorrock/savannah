/*
 * XML Type:  v4AddressPoolsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V4AddressPoolsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v4AddressPoolsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V4AddressPoolsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V4AddressPoolsType
{
    private static final long serialVersionUID = 1L;
    
    public V4AddressPoolsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOL$0 = 
        new javax.xml.namespace.QName("", "pool");
    
    
    /**
     * Gets a List of "pool" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V4AddressPool> getPoolList()
    {
        final class PoolList extends java.util.AbstractList<com.jagornet.dhcp.xml.V4AddressPool>
        {
            public com.jagornet.dhcp.xml.V4AddressPool get(int i)
                { return V4AddressPoolsTypeImpl.this.getPoolArray(i); }
            
            public com.jagornet.dhcp.xml.V4AddressPool set(int i, com.jagornet.dhcp.xml.V4AddressPool o)
            {
                com.jagornet.dhcp.xml.V4AddressPool old = V4AddressPoolsTypeImpl.this.getPoolArray(i);
                V4AddressPoolsTypeImpl.this.setPoolArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V4AddressPool o)
                { V4AddressPoolsTypeImpl.this.insertNewPool(i).set(o); }
            
            public com.jagornet.dhcp.xml.V4AddressPool remove(int i)
            {
                com.jagornet.dhcp.xml.V4AddressPool old = V4AddressPoolsTypeImpl.this.getPoolArray(i);
                V4AddressPoolsTypeImpl.this.removePool(i);
                return old;
            }
            
            public int size()
                { return V4AddressPoolsTypeImpl.this.sizeOfPoolArray(); }
            
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
    public com.jagornet.dhcp.xml.V4AddressPool[] getPoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V4AddressPool> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V4AddressPool>();
            get_store().find_all_element_users(POOL$0, targetList);
            com.jagornet.dhcp.xml.V4AddressPool[] result = new com.jagornet.dhcp.xml.V4AddressPool[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pool" element
     */
    public com.jagornet.dhcp.xml.V4AddressPool getPoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPool target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPool)get_store().find_element_user(POOL$0, i);
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
    public void setPoolArray(com.jagornet.dhcp.xml.V4AddressPool[] poolArray)
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
    public void setPoolArray(int i, com.jagornet.dhcp.xml.V4AddressPool pool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPool target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPool)get_store().find_element_user(POOL$0, i);
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
    public com.jagornet.dhcp.xml.V4AddressPool insertNewPool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPool target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPool)get_store().insert_element_user(POOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pool" element
     */
    public com.jagornet.dhcp.xml.V4AddressPool addNewPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4AddressPool target = null;
            target = (com.jagornet.dhcp.xml.V4AddressPool)get_store().add_element_user(POOL$0);
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
