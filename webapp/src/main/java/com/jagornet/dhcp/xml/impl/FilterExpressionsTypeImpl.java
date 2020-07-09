/*
 * XML Type:  filterExpressionsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.FilterExpressionsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML filterExpressionsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class FilterExpressionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.FilterExpressionsType
{
    private static final long serialVersionUID = 1L;
    
    public FilterExpressionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("", "filterExpression");
    
    
    /**
     * Gets a List of "filterExpression" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.FilterExpression> getFilterExpressionList()
    {
        final class FilterExpressionList extends java.util.AbstractList<com.jagornet.dhcp.xml.FilterExpression>
        {
            public com.jagornet.dhcp.xml.FilterExpression get(int i)
                { return FilterExpressionsTypeImpl.this.getFilterExpressionArray(i); }
            
            public com.jagornet.dhcp.xml.FilterExpression set(int i, com.jagornet.dhcp.xml.FilterExpression o)
            {
                com.jagornet.dhcp.xml.FilterExpression old = FilterExpressionsTypeImpl.this.getFilterExpressionArray(i);
                FilterExpressionsTypeImpl.this.setFilterExpressionArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.FilterExpression o)
                { FilterExpressionsTypeImpl.this.insertNewFilterExpression(i).set(o); }
            
            public com.jagornet.dhcp.xml.FilterExpression remove(int i)
            {
                com.jagornet.dhcp.xml.FilterExpression old = FilterExpressionsTypeImpl.this.getFilterExpressionArray(i);
                FilterExpressionsTypeImpl.this.removeFilterExpression(i);
                return old;
            }
            
            public int size()
                { return FilterExpressionsTypeImpl.this.sizeOfFilterExpressionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterExpressionList();
        }
    }
    
    /**
     * Gets array of all "filterExpression" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.FilterExpression[] getFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.FilterExpression> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.FilterExpression>();
            get_store().find_all_element_users(FILTEREXPRESSION$0, targetList);
            com.jagornet.dhcp.xml.FilterExpression[] result = new com.jagornet.dhcp.xml.FilterExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filterExpression" element
     */
    public com.jagornet.dhcp.xml.FilterExpression getFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FilterExpression target = null;
            target = (com.jagornet.dhcp.xml.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filterExpression" element
     */
    public int sizeOfFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTEREXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "filterExpression" element
     */
    public void setFilterExpressionArray(com.jagornet.dhcp.xml.FilterExpression[] filterExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterExpressionArray, FILTEREXPRESSION$0);
        }
    }
    
    /**
     * Sets ith "filterExpression" element
     */
    public void setFilterExpressionArray(int i, com.jagornet.dhcp.xml.FilterExpression filterExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FilterExpression target = null;
            target = (com.jagornet.dhcp.xml.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filterExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filterExpression" element
     */
    public com.jagornet.dhcp.xml.FilterExpression insertNewFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FilterExpression target = null;
            target = (com.jagornet.dhcp.xml.FilterExpression)get_store().insert_element_user(FILTEREXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filterExpression" element
     */
    public com.jagornet.dhcp.xml.FilterExpression addNewFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.FilterExpression target = null;
            target = (com.jagornet.dhcp.xml.FilterExpression)get_store().add_element_user(FILTEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filterExpression" element
     */
    public void removeFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTEREXPRESSION$0, i);
        }
    }
}
