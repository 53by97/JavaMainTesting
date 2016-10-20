package com.kvvssut.learnings.java.must;

import java.util.HashSet;

public class HashSetImpl {
	
	public static void main(String[] args) {
		
		/*
		 *     public V put(K key, V value) {
        if (key == null)
            return putForNullKey(value);
        int hash = hash(key);				// calculates key.hashCode()
        int i = indexFor(hash, table.length);
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {		// checks 1st for same hash, 2nd for == || .equals()
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        addEntry(hash, key, value, i);		// also stores the hash calculated before for key, with <key, value> within "Entry<K,V>[] table"
        return null;
    }
		 */
		
		
		HashSet<HSObject> hashSet = new HashSet<HSObject>();
		
		HSObject hso1 = new HSObject();
		hso1.setEmpId(1234);
		hso1.setName("One");
		
		HSObject hso2 = new HSObject();
		hso2.setEmpId(1234);
		hso2.setName("Two");
		
		HSObject hso3 = new HSObject();
		hso3.setEmpId(4321);
		hso3.setName("Three");
		
		hashSet.add(hso1);
		hashSet.add(hso2);
		hashSet.add(hso3);
		hashSet.add(null);		// As hash calculated in map.put results in 0 for null element, it is located at zeroth index 
		
		
		for (HSObject hso : hashSet) {
			System.out.println(hso);
		}
		
	}

}
