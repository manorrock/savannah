/*
 * XML Type:  linkFiltersType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.LinkFiltersType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML linkFiltersType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class LinkFiltersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.LinkFiltersType
{
    private static final long serialVersionUID = 1L;
    
    public LinkFiltersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKFILTER$0 = 
        new javax.xml.namespace.QName("", "linkFilter");
    
    
    /**
     * Gets a List of "linkFilter" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.LinkFilter> getLinkFilterList()
    {
        final class LinkFilterList extends java.util.AbstractList<com.jagornet.dhcp.xml.LinkFilter>
        {
            public com.jagornet.dhcp.xml.LinkFilter get(int i)
                { return LinkFiltersTypeImpl.this.getLinkFilterArray(i); }
            
            public com.jagornet.dhcp.xml.LinkFilter set(int i, com.jagornet.dhcp.xml.LinkFilter o)
            {
                com.jagornet.dhcp.xml.LinkFilter old = LinkFiltersTypeImpl.this.getLinkFilterArray(i);
                LinkFiltersTypeImpl.this.setLinkFilterArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.LinkFilter o)
                { LinkFiltersTypeImpl.this.insertNewLinkFilter(i).set(o); }
            
            public com.jagornet.dhcp.xml.LinkFilter remove(int i)
            {
                com.jagornet.dhcp.xml.LinkFilter old = LinkFiltersTypeImpl.this.getLinkFilterArray(i);
                LinkFiltersTypeImpl.this.removeLinkFilter(i);
                return old;
            }
            
            public int size()
                { return LinkFiltersTypeImpl.this.sizeOfLinkFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LinkFilterList();
        }
    }
    
    /**
     * Gets array of all "linkFilter" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.LinkFilter[] getLinkFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.LinkFilter> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.LinkFilter>();
            get_store().find_all_element_users(LINKFILTER$0, targetList);
            com.jagornet.dhcp.xml.LinkFilter[] result = new com.jagornet.dhcp.xml.LinkFilter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkFilter" element
     */
    public com.jagornet.dhcp.xml.LinkFilter getLinkFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFilter target = null;
            target = (com.jagornet.dhcp.xml.LinkFilter)get_store().find_element_user(LINKFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkFilter" element
     */
    public int sizeOfLinkFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFILTER$0);
        }
    }
    
    /**
     * Sets array of all "linkFilter" element
     */
    public void setLinkFilterArray(com.jagornet.dhcp.xml.LinkFilter[] linkFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkFilterArray, LINKFILTER$0);
        }
    }
    
    /**
     * Sets ith "linkFilter" element
     */
    public void setLinkFilterArray(int i, com.jagornet.dhcp.xml.LinkFilter linkFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFilter target = null;
            target = (com.jagornet.dhcp.xml.LinkFilter)get_store().find_element_user(LINKFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkFilter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkFilter" element
     */
    public com.jagornet.dhcp.xml.LinkFilter insertNewLinkFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFilter target = null;
            target = (com.jagornet.dhcp.xml.LinkFilter)get_store().insert_element_user(LINKFILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkFilter" element
     */
    public com.jagornet.dhcp.xml.LinkFilter addNewLinkFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.LinkFilter target = null;
            target = (com.jagornet.dhcp.xml.LinkFilter)get_store().add_element_user(LINKFILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkFilter" element
     */
    public void removeLinkFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFILTER$0, i);
        }
    }
}
