package edu.neu.khoury.cs5004;

import java.util.Collection;
import java.util.Set;

public interface Map<K,V> {
    /**
     * Returns the number of key-value mappings in this map.  If the
     * map contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     */
    int size();

    /**
     * Returns <tt>true</tt> if this map contains no key-value mappings.
     */
    boolean isEmpty();

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the specified
     * key.  
     */
    boolean containsKey(Object key);

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.  
     */
    boolean containsValue(Object value);

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     */
    V get(Object key);

    /**
     * Associates the specified value with the specified key in this map
     */
    V put(K key, V value);

    /**
     * Removes the mapping for a key from this map if it is present
     */
    V remove(Object key);

    /**
     * Removes all of the mappings from this map (optional operation).
     */
    void clear();

    /**
     * Returns a {@link Set} view of the keys contained in this map.
     */
    Set<K> keySet();

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     */
    Collection<V> values();

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     */
    Set<Entry<K, V>> entrySet();

    /**
     * A map entry (key-value pair).  
     */
    interface Entry<K,V> {
        /**
         * Returns the key corresponding to this entry.
         */
        K getKey();

        /**
         * Returns the value corresponding to this entry.  
         */
        V getValue();

        /**
         * Replaces the value corresponding to this entry with the specified
         * value. 
         */
        V setValue(V value);

        /**
         * Compares the specified object with this entry for equality.
         */
        boolean equals(Object o);

        /**
         * Returns the hash code value for this map entry.  
         */
        int hashCode();
    }

    /**
     * Compares the specified object with this map for equality.
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this map.  
     */
    int hashCode();
}
