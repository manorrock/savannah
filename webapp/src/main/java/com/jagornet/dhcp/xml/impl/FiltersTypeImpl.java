/*
 * XML Type:  filtersType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.FiltersType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML filtersType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class FiltersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.FiltersType
{
    private static final long serialVersionUID = 1L;
    
    public FiltersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("", "filter");
    
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.Filter> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<com.jagornet.dhcp.xml.Filter>
        {
            public com.jagornet.dhcp.xml.Filter get(int i)
                { return FiltersTypeImpl.this.getFilterArray(i); }
            
            public com.jagornet.dhcp.xml.Filter set(int i, com.jagornet.dhcp.xml.Filter o)
            {
                com.jagornet.dhcp.xml.Filter old = FiltersTypeImpl.this.getFilterArray(i);
                FiltersTypeImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.Filter o)
                { FiltersTypeImpl.this.insertNewFilter(i).set(o); }
            
            public com.jagornet.dhcp.xml.Filter remove(int i)
            {
                com.jagornet.dhcp.xml.Filter old = FiltersTypeImpl.this.getFilterArray(i);
                FiltersTypeImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return FiltersTypeImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.Filter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.Filter> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.Filter>();
            get_store().find_all_element_users(FILTER$0, targetList);
            com.jagornet.dhcp.xml.Filter[] result = new com.jagornet.dhcp.xml.Filter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public com.jagornet.dhcp.xml.Filter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Filter target = null;
            target = (com.jagornet.dhcp.xml.Filter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(com.jagornet.dhcp.xml.Filter[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$0);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, com.jagornet.dhcp.xml.Filter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Filter target = null;
            target = (com.jagornet.dhcp.xml.Filter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public com.jagornet.dhcp.xml.Filter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Filter target = null;
            target = (com.jagornet.dhcp.xml.Filter)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public com.jagornet.dhcp.xml.Filter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Filter target = null;
            target = (com.jagornet.dhcp.xml.Filter)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, i);
        }
    }
}
