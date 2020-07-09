/*
 * XML Type:  linksType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.LinksType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML linksType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class LinksTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.LinksType
{
    private static final long serialVersionUID = 1L;
    
    public LinksTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("", "link");
    
    
    /**
     * Gets a List of "link" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.Link> getLinkList()
    {
        final class LinkList extends java.util.AbstractList<com.jagornet.dhcp.xml.Link>
        {
            public com.jagornet.dhcp.xml.Link get(int i)
                { return LinksTypeImpl.this.getLinkArray(i); }
            
            public com.jagornet.dhcp.xml.Link set(int i, com.jagornet.dhcp.xml.Link o)
            {
                com.jagornet.dhcp.xml.Link old = LinksTypeImpl.this.getLinkArray(i);
                LinksTypeImpl.this.setLinkArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.Link o)
                { LinksTypeImpl.this.insertNewLink(i).set(o); }
            
            public com.jagornet.dhcp.xml.Link remove(int i)
            {
                com.jagornet.dhcp.xml.Link old = LinksTypeImpl.this.getLinkArray(i);
                LinksTypeImpl.this.removeLink(i);
                return old;
            }
            
            public int size()
                { return LinksTypeImpl.this.sizeOfLinkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LinkList();
        }
    }
    
    /**
     * Gets array of all "link" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.Link[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.Link> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.Link>();
            get_store().find_all_element_users(LINK$0, targetList);
            com.jagornet.dhcp.xml.Link[] result = new com.jagornet.dhcp.xml.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "link" element
     */
    public com.jagornet.dhcp.xml.Link getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Link target = null;
            target = (com.jagornet.dhcp.xml.Link)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$0);
        }
    }
    
    /**
     * Sets array of all "link" element
     */
    public void setLinkArray(com.jagornet.dhcp.xml.Link[] linkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$0);
        }
    }
    
    /**
     * Sets ith "link" element
     */
    public void setLinkArray(int i, com.jagornet.dhcp.xml.Link link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Link target = null;
            target = (com.jagornet.dhcp.xml.Link)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    public com.jagornet.dhcp.xml.Link insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Link target = null;
            target = (com.jagornet.dhcp.xml.Link)get_store().insert_element_user(LINK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    public com.jagornet.dhcp.xml.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Link target = null;
            target = (com.jagornet.dhcp.xml.Link)get_store().add_element_user(LINK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$0, i);
        }
    }
}
