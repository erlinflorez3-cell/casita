package org.springframework.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.springframework.util.ClassUtils;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CollectionFactory {
    private static final Set<Class> approximableCollectionTypes;
    private static final Set<Class> approximableMapTypes;
    private static Class navigableMapClass = null;
    private static Class navigableSetClass = null;

    @Deprecated
    private static class JdkConcurrentHashMap extends ConcurrentHashMap implements ConcurrentMap {
        private JdkConcurrentHashMap(int i2) {
            super(i2);
        }
    }

    static {
        HashSet hashSet = new HashSet(10);
        approximableCollectionTypes = hashSet;
        HashSet hashSet2 = new HashSet(6);
        approximableMapTypes = hashSet2;
        hashSet.add(Collection.class);
        hashSet.add(List.class);
        hashSet.add(Set.class);
        hashSet.add(SortedSet.class);
        hashSet2.add(Map.class);
        hashSet2.add(SortedMap.class);
        ClassLoader classLoader = CollectionFactory.class.getClassLoader();
        try {
            navigableSetClass = ClassUtils.forName("java.util.NavigableSet", classLoader);
            navigableMapClass = ClassUtils.forName("java.util.NavigableMap", classLoader);
            hashSet.add(navigableSetClass);
            hashSet2.add(navigableMapClass);
        } catch (ClassNotFoundException unused) {
        }
        Set<Class> set = approximableCollectionTypes;
        set.add(ArrayList.class);
        set.add(LinkedList.class);
        set.add(HashSet.class);
        set.add(LinkedHashSet.class);
        set.add(TreeSet.class);
        Set<Class> set2 = approximableMapTypes;
        set2.add(HashMap.class);
        set2.add(LinkedHashMap.class);
        set2.add(TreeMap.class);
    }

    public static Collection createApproximateCollection(Object obj, int i2) {
        return obj instanceof LinkedList ? new LinkedList() : obj instanceof List ? new ArrayList(i2) : obj instanceof SortedSet ? new TreeSet(((SortedSet) obj).comparator()) : new LinkedHashSet(i2);
    }

    public static Map createApproximateMap(Object obj, int i2) {
        return obj instanceof SortedMap ? new TreeMap(((SortedMap) obj).comparator()) : new LinkedHashMap(i2);
    }

    public static Collection createCollection(Class<?> cls, int i2) {
        if (!cls.isInterface()) {
            if (!Collection.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unsupported Collection type: " + cls.getName());
            }
            try {
                return (Collection) cls.newInstance();
            } catch (Exception e2) {
                throw new IllegalArgumentException("Could not instantiate Collection type: " + cls.getName(), e2);
            }
        }
        if (List.class.equals(cls)) {
            return new ArrayList(i2);
        }
        if (SortedSet.class.equals(cls) || cls.equals(navigableSetClass)) {
            return new TreeSet();
        }
        if (Set.class.equals(cls) || Collection.class.equals(cls)) {
            return new LinkedHashSet(i2);
        }
        throw new IllegalArgumentException("Unsupported Collection interface: " + cls.getName());
    }

    @Deprecated
    public static ConcurrentMap createConcurrentMap(int i2) {
        return new JdkConcurrentHashMap(i2);
    }

    @Deprecated
    public static Map createConcurrentMapIfPossible(int i2) {
        return new ConcurrentHashMap(i2);
    }

    @Deprecated
    public static <T> Set<T> createCopyOnWriteSet() {
        return new CopyOnWriteArraySet();
    }

    @Deprecated
    public static Map createIdentityMapIfPossible(int i2) {
        return new IdentityHashMap(i2);
    }

    @Deprecated
    public static Map createLinkedCaseInsensitiveMapIfPossible(int i2) {
        return new LinkedCaseInsensitiveMap(i2);
    }

    @Deprecated
    public static <K, V> Map<K, V> createLinkedMapIfPossible(int i2) {
        return new LinkedHashMap(i2);
    }

    @Deprecated
    public static <T> Set<T> createLinkedSetIfPossible(int i2) {
        return new LinkedHashSet(i2);
    }

    public static Map createMap(Class<?> cls, int i2) {
        if (!cls.isInterface()) {
            if (!Map.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unsupported Map type: " + cls.getName());
            }
            try {
                return (Map) cls.newInstance();
            } catch (Exception e2) {
                throw new IllegalArgumentException("Could not instantiate Map type: " + cls.getName(), e2);
            }
        }
        if (Map.class.equals(cls)) {
            return new LinkedHashMap(i2);
        }
        if (SortedMap.class.equals(cls) || cls.equals(navigableMapClass)) {
            return new TreeMap();
        }
        if (MultiValueMap.class.equals(cls)) {
            return new LinkedMultiValueMap();
        }
        throw new IllegalArgumentException("Unsupported Map interface: " + cls.getName());
    }

    public static boolean isApproximableCollectionType(Class<?> cls) {
        return cls != null && approximableCollectionTypes.contains(cls);
    }

    public static boolean isApproximableMapType(Class<?> cls) {
        return cls != null && approximableMapTypes.contains(cls);
    }
}
