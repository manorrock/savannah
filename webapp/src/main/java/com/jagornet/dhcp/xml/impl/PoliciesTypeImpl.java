/*
 * XML Type:  policiesType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.PoliciesType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML policiesType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class PoliciesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.PoliciesType
{
    private static final long serialVersionUID = 1L;
    
    public PoliciesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICY$0 = 
        new javax.xml.namespace.QName("", "policy");
    
    
    /**
     * Gets a List of "policy" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.Policy> getPolicyList()
    {
        final class PolicyList extends java.util.AbstractList<com.jagornet.dhcp.xml.Policy>
        {
            public com.jagornet.dhcp.xml.Policy get(int i)
                { return PoliciesTypeImpl.this.getPolicyArray(i); }
            
            public com.jagornet.dhcp.xml.Policy set(int i, com.jagornet.dhcp.xml.Policy o)
            {
                com.jagornet.dhcp.xml.Policy old = PoliciesTypeImpl.this.getPolicyArray(i);
                PoliciesTypeImpl.this.setPolicyArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.Policy o)
                { PoliciesTypeImpl.this.insertNewPolicy(i).set(o); }
            
            public com.jagornet.dhcp.xml.Policy remove(int i)
            {
                com.jagornet.dhcp.xml.Policy old = PoliciesTypeImpl.this.getPolicyArray(i);
                PoliciesTypeImpl.this.removePolicy(i);
                return old;
            }
            
            public int size()
                { return PoliciesTypeImpl.this.sizeOfPolicyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PolicyList();
        }
    }
    
    /**
     * Gets array of all "policy" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.Policy[] getPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.Policy> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.Policy>();
            get_store().find_all_element_users(POLICY$0, targetList);
            com.jagornet.dhcp.xml.Policy[] result = new com.jagornet.dhcp.xml.Policy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "policy" element
     */
    public com.jagornet.dhcp.xml.Policy getPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Policy target = null;
            target = (com.jagornet.dhcp.xml.Policy)get_store().find_element_user(POLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "policy" element
     */
    public int sizeOfPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICY$0);
        }
    }
    
    /**
     * Sets array of all "policy" element
     */
    public void setPolicyArray(com.jagornet.dhcp.xml.Policy[] policyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(policyArray, POLICY$0);
        }
    }
    
    /**
     * Sets ith "policy" element
     */
    public void setPolicyArray(int i, com.jagornet.dhcp.xml.Policy policy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Policy target = null;
            target = (com.jagornet.dhcp.xml.Policy)get_store().find_element_user(POLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(policy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "policy" element
     */
    public com.jagornet.dhcp.xml.Policy insertNewPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Policy target = null;
            target = (com.jagornet.dhcp.xml.Policy)get_store().insert_element_user(POLICY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "policy" element
     */
    public com.jagornet.dhcp.xml.Policy addNewPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Policy target = null;
            target = (com.jagornet.dhcp.xml.Policy)get_store().add_element_user(POLICY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "policy" element
     */
    public void removePolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICY$0, i);
        }
    }
}
