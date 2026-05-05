package com.upokecenter.cbor;

import com.biocatch.android.commonsdk.core.Utils;
import com.upokecenter.cbor.CBORTypeMapper;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class PropertyMap {
    private static final int TicksDivFracSeconds = 1000000;
    private static Map<Class<?>, List<MethodData>> propertyLists = new HashMap();
    private static Map<Class<?>, List<MethodData>> setterPropertyList = new HashMap();

    static class CopyOnWriteList extends AbstractList<CBORObject> {
        CBORObject[] array;
        List<CBORObject> list;

        public CopyOnWriteList(CBORObject[] cBORObjectArr) {
            this.array = cBORObjectArr;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, CBORObject cBORObject) {
            if (this.list == null) {
                this.list = new ArrayList(Arrays.asList(this.array));
                this.array = null;
            }
            this.list.add(i2, cBORObject);
        }

        @Override // java.util.AbstractList, java.util.List
        public CBORObject get(int i2) {
            List<CBORObject> list = this.list;
            return list != null ? list.get(i2) : this.array[i2];
        }

        @Override // java.util.AbstractList, java.util.List
        public CBORObject remove(int i2) {
            if (this.list == null) {
                this.list = new ArrayList(Arrays.asList(this.array));
                this.array = null;
            }
            return this.list.remove(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public CBORObject set(int i2, CBORObject cBORObject) {
            if (this.list == null) {
                this.list = new ArrayList(Arrays.asList(this.array));
                this.array = null;
            }
            return this.list.set(i2, cBORObject);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            List<CBORObject> list = this.list;
            return list != null ? list.size() : this.array.length;
        }
    }

    private static final class LinkedListKeySet<TKey> extends AbstractSet<TKey> {
        private final LinkedList list;

        public LinkedListKeySet(LinkedList<TKey> linkedList) {
            this.list = linkedList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<TKey> iterator() {
            return this.list.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.list.size();
        }
    }

    private static class MethodData {
        private final String adjustedName = GetAdjustedNameInternal(false);
        private final String adjustedNameCamelCase = GetAdjustedNameInternal(true);
        private final Member method;
        private final String name;

        public MethodData(String str, Member member) {
            this.name = str;
            this.method = member;
        }

        public String GetAdjustedName(boolean z2) {
            return z2 ? this.adjustedNameCamelCase : this.adjustedName;
        }

        private String GetAdjustedNameInternal(boolean z2) {
            return this.method instanceof Field ? z2 ? CBORUtilities.FirstCharLower(RemoveIs(this.name)) : CBORUtilities.FirstCharUpper(this.name) : z2 ? CBORUtilities.FirstCharLower(RemoveGetSetIs(this.name)) : CBORUtilities.FirstCharUpper(RemoveGetSet(this.name));
        }

        public static String GetGetMethod(String str) {
            return IsSetMethod(str) ? "get" + str.substring(3) : str;
        }

        public static String GetIsMethod(String str) {
            return IsIsMethod(str) ? "is" + str.substring(2) : str;
        }

        public static String GetSetMethod(String str) {
            return IsSetMethod(str) ? "set" + str.substring(3) : str;
        }

        public static boolean IsGetMethod(String str) {
            return CBORUtilities.NameStartsWithWord(str, "get") && !str.equals("getClass");
        }

        public static boolean IsIsMethod(String str) {
            return CBORUtilities.NameStartsWithWord(str, "is");
        }

        public static boolean IsSetMethod(String str) {
            return CBORUtilities.NameStartsWithWord(str, "set");
        }

        private static String RemoveGetSet(String str) {
            return (IsSetMethod(str) || IsGetMethod(str)) ? str.substring(3) : str;
        }

        public static String RemoveGetSetIs(String str) {
            if (!IsSetMethod(str) && !IsGetMethod(str)) {
                return IsIsMethod(str) ? str.substring(2) : str;
            }
            return str.substring(3);
        }

        public static String RemoveIs(String str) {
            return IsIsMethod(str) ? str.substring(2) : str;
        }

        public Object GetValue(Object obj) {
            try {
                Member member = this.method;
                if (member instanceof Method) {
                    return ((Method) member).invoke(obj, new Object[0]);
                }
                if (member instanceof Field) {
                    return ((Field) member).get(obj);
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw ((RuntimeException) new CBORException("").initCause(e2));
            } catch (InvocationTargetException e3) {
                throw ((RuntimeException) new CBORException("").initCause(e3));
            }
        }

        public Type GetValueType() {
            Member member = this.method;
            if (member instanceof Method) {
                return ((Method) member).getGenericParameterTypes()[0];
            }
            if (member instanceof Field) {
                return ((Field) member).getGenericType();
            }
            return null;
        }

        public void SetValue(Object obj, Object obj2) {
            try {
                Member member = this.method;
                if (member instanceof Method) {
                    ((Method) member).invoke(obj, obj2);
                } else if (member instanceof Field) {
                    ((Field) member).set(obj, obj2);
                }
            } catch (IllegalAccessException e2) {
                throw ((RuntimeException) new CBORException("").initCause(e2));
            } catch (InvocationTargetException e3) {
                throw ((RuntimeException) new CBORException("").initCause(e3));
            }
        }

        public String getName() {
            return this.name;
        }
    }

    public static final class OrderedMap<TKey, TValue> implements Map<TKey, TValue> {
        private final SortedMap<TKey, TValue> dict = new TreeMap();
        private final LinkedList<TKey> list = new LinkedList<>();

        @Override // java.util.Map
        public void clear() {
            this.list.clear();
            this.dict.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.dict.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.dict.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<TKey, TValue>> entrySet() {
            return new OrderedMapSet(this.list, this.dict);
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.dict.equals(obj);
        }

        @Override // java.util.Map
        public TValue get(Object obj) {
            return this.dict.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.dict.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.dict.isEmpty();
        }

        @Override // java.util.Map
        public Set<TKey> keySet() {
            return new LinkedListKeySet(this.list);
        }

        @Override // java.util.Map
        public TValue put(TKey tkey, TValue tvalue) {
            if (containsKey(tkey)) {
                return this.dict.put(tkey, tvalue);
            }
            TValue tvaluePut = this.dict.put(tkey, tvalue);
            this.list.add(tkey);
            return tvaluePut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends TKey, ? extends TValue> map) {
            for (TKey tkey : map.keySet()) {
                put(tkey, map.get(tkey));
            }
        }

        @Override // java.util.Map
        public TValue remove(Object obj) {
            TValue tvalueRemove = this.dict.remove(obj);
            this.list.remove(obj);
            return tvalueRemove;
        }

        @Override // java.util.Map
        public int size() {
            return this.dict.size();
        }

        public Set<TKey> sortedKeys() {
            return this.dict.keySet();
        }

        public String toString() {
            return this.dict.toString();
        }

        @Override // java.util.Map
        public Collection<TValue> values() {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<TKey, TValue>> it = entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            return arrayList;
        }
    }

    public static final class OrderedMapIterator<TKey, TValue> implements Iterator<Map.Entry<TKey, TValue>> {
        private final Map<TKey, TValue> dict;
        private final Iterator<TKey> iter;

        public OrderedMapIterator(Iterator<TKey> it, Map<TKey, TValue> map) {
            this.iter = it;
            this.dict = map;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<TKey, TValue> next() {
            TKey next = this.iter.next();
            return new AbstractMap.SimpleImmutableEntry(next, this.dict.get(next));
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iter.remove();
        }
    }

    public static final class OrderedMapSet<TKey, TValue> extends AbstractSet<Map.Entry<TKey, TValue>> {
        private final Map<TKey, TValue> dict;
        private final LinkedList<TKey> list;

        public OrderedMapSet(LinkedList<TKey> linkedList, Map<TKey, TValue> map) {
            this.list = linkedList;
            this.dict = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<TKey, TValue>> iterator() {
            return new OrderedMapIterator(this.list.iterator(), this.dict);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.list.size();
        }
    }

    PropertyMap() {
    }

    public static void BreakDownDateTime(Date date, EInteger[] eIntegerArr, int[] iArr) {
        long time = date.getTime();
        int iFloorModLong = ((int) FloorModLong(time, 1000)) * 1000000;
        CBORUtilities.BreakDownSecondsSinceEpoch(FloorDiv(time, 1000), eIntegerArr, iArr);
        iArr[5] = iFloorModLong;
    }

    public static Date BuildUpDateTime(EInteger eInteger, int[] iArr) {
        EInteger eIntegerAdd = CBORUtilities.GetNumberOfDaysProlepticGregorian(eInteger, iArr[0], iArr[1]).Multiply(EInteger.FromInt32(86400000)).Add(EInteger.FromInt32(0).Add(EInteger.FromInt32((iArr[2] * 3600000) + (iArr[3] * Utils.miliSecondsInMinute) + (iArr[4] * 1000))).Add(EInteger.FromInt32(iArr[5] / 1000000)).Subtract(EInteger.FromInt32(iArr[6] * Utils.miliSecondsInMinute)));
        if (eIntegerAdd.CanFitInInt64()) {
            return new Date(eIntegerAdd.ToInt64Checked());
        }
        throw new CBORException("Value too big or too small for Java Date");
    }

    public static Object CallFromObject(CBORTypeMapper.ConverterInfo converterInfo, CBORObject cBORObject) {
        if (converterInfo.getConverter() instanceof ICBORToFromConverter) {
            return ((ICBORToFromConverter) converterInfo.getConverter()).FromCBORObject(cBORObject);
        }
        return null;
    }

    public static CBORObject CallToObject(CBORTypeMapper.ConverterInfo converterInfo, Object obj) {
        if (converterInfo.getConverter() instanceof ICBORConverter) {
            return ((ICBORConverter) converterInfo.getConverter()).ToCBORObject(obj);
        }
        return null;
    }

    private static <T> List<T> Compact(List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    if (t2 != null) {
                        arrayList.add(t2);
                    }
                }
                return arrayList;
            }
        }
        return list;
    }

    public static <K, V> boolean DictRemove(Map<K, V> map, K k2) {
        return map.remove(k2) != null;
    }

    public static Object EnumToObject(Enum<?> r02) {
        return r02.name();
    }

    public static Object EnumToObjectAsInteger(Enum<?> r02) {
        return Integer.valueOf(r02.ordinal());
    }

    public static Object[] EnumValues(Class<?> cls) {
        try {
            Method method = cls.getMethod("values", new Class[0]);
            return (method.getParameterCount() != 0 || (-1) - (((-1) - method.getModifiers()) | ((-1) - 1)) == 0) ? new Object[0] : (Object[]) method.invoke(null, new Object[0]);
        } catch (IllegalAccessException unused) {
            return new Object[0];
        } catch (NoSuchMethodException unused2) {
            return new Object[0];
        } catch (SecurityException unused3) {
            return new Object[0];
        } catch (InvocationTargetException unused4) {
            return new Object[0];
        }
    }

    public static boolean ExceedsKnownLength(InputStream inputStream, long j2) {
        return false;
    }

    private static Method FindMethod(List<Method> list, String str, Type type) {
        for (Method method : list) {
            if (MethodData.RemoveGetSetIs(method.getName()).equals(str) && method.getReturnType().equals(type)) {
                return method;
            }
        }
        return null;
    }

    public static Object FindOneArgumentMethod(Object obj, String str, Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        try {
            return obj.getClass().getMethod(str, (Class) type);
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    private static long FloorDiv(long j2, int i2) {
        return j2 >= 0 ? j2 / ((long) i2) : (-1) - (((-1) - j2) / ((long) i2));
    }

    private static long FloorModLong(long j2, int i2) {
        return j2 - (FloorDiv(j2, i2) * ((long) i2));
    }

    public static CBORObject FromArray(Object obj, PODOptions pODOptions, CBORTypeMapper cBORTypeMapper, int i2) {
        int length = Array.getLength(obj);
        CBORObject cBORObjectNewArray = CBORObject.NewArray();
        int i3 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (cBORTypeMapper == null && pODOptions == null) {
                while (i3 < length) {
                    cBORObjectNewArray.Add(CBORObject.FromObject(iArr[i3]));
                    i3++;
                }
            } else {
                while (i3 < length) {
                    cBORObjectNewArray.Add(CBORObject.FromObject(Integer.valueOf(iArr[i3]), pODOptions, cBORTypeMapper, i2 + 1));
                    i3++;
                }
            }
            return cBORObjectNewArray;
        }
        if (!(obj instanceof Integer[])) {
            while (i3 < length) {
                cBORObjectNewArray.Add(CBORObject.FromObject(Array.get(obj, i3), pODOptions, cBORTypeMapper, i2 + 1));
                i3++;
            }
            return cBORObjectNewArray;
        }
        Integer[] numArr = (Integer[]) obj;
        if (cBORTypeMapper == null && pODOptions == null) {
            while (i3 < length) {
                cBORObjectNewArray.Add(CBORObject.FromObject(numArr[i3].intValue()));
                i3++;
            }
        } else {
            while (i3 < length) {
                cBORObjectNewArray.Add(CBORObject.FromObject(Integer.valueOf(numArr[i3].intValue()), pODOptions, cBORTypeMapper, i2 + 1));
                i3++;
            }
        }
        return cBORObjectNewArray;
    }

    public static CBORObject FromObjectOther(Object obj) {
        if (!(obj instanceof BigDecimal)) {
            if (obj instanceof BigInteger) {
                return CBORObject.FromObject(EInteger.FromBytes(((BigInteger) obj).toByteArray(), false));
            }
            return null;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        EInteger eIntegerFromBytes = EInteger.FromBytes(bigDecimal.unscaledValue().toByteArray(), false);
        int iScale = bigDecimal.scale();
        return iScale == Integer.MIN_VALUE ? CBORObject.NewArray(CBORObject.FromObject(-iScale), CBORObject.FromObject(eIntegerFromBytes)).WithTag(4) : CBORObject.NewArray(CBORObject.FromObject(-iScale), CBORObject.FromObject(eIntegerFromBytes)).WithTag(4);
    }

    public static <K, V> Collection<Map.Entry<K, V>> GetEntries(Map<K, V> map) {
        return Collections.unmodifiableMap(map).entrySet();
    }

    public static <TKey, TValue> TValue GetOrDefault(Map<TKey, TValue> map, TKey tkey, TValue tvalue) {
        return map.getOrDefault(tkey, tvalue);
    }

    public static Iterable<Map.Entry<String, Object>> GetProperties(Object obj) {
        return GetProperties(obj, true);
    }

    public static Iterable<Map.Entry<String, Object>> GetProperties(Object obj, boolean z2) {
        List<MethodData> listGetPropertyList = GetPropertyList(obj.getClass());
        if (listGetPropertyList.size() == 1 && listGetPropertyList.get(0) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(listGetPropertyList.size());
        for (MethodData methodData : listGetPropertyList) {
            arrayList.add(new AbstractMap.SimpleEntry(methodData.GetAdjustedName(z2), methodData.GetValue(obj)));
        }
        return arrayList;
    }

    private static List<MethodData> GetPropertyList(Class<?> cls) {
        return GetPropertyList(cls, false);
    }

    private static List<MethodData> GetPropertyList(Class<?> cls, boolean z2) {
        synchronized ((z2 ? setterPropertyList : propertyLists)) {
            List<MethodData> list = (z2 ? setterPropertyList : propertyLists).get(cls);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            if (IsProblematicForSerialization(cls)) {
                arrayList.add(null);
                (z2 ? setterPropertyList : propertyLists).put(cls, arrayList);
                return arrayList;
            }
            ArrayList<Method> arrayList2 = new ArrayList();
            ArrayList<Method> arrayList3 = new ArrayList();
            ArrayList<Method> arrayList4 = new ArrayList();
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            for (Method method : cls.getMethods()) {
                int modifiers = method.getModifiers();
                if ((modifiers + 9) - (modifiers | 9) == 1) {
                    String name = method.getName();
                    String strRemoveGetSetIs = MethodData.RemoveGetSetIs(name);
                    if (MethodData.IsGetMethod(name)) {
                        if (method.getParameterTypes().length == 0 && !method.getReturnType().equals(Void.TYPE)) {
                            if (treeMap.containsKey(strRemoveGetSetIs)) {
                                treeMap.put(strRemoveGetSetIs, Integer.valueOf(((Integer) treeMap.get(strRemoveGetSetIs)).intValue() + 1));
                            } else {
                                treeMap.put(strRemoveGetSetIs, 1);
                            }
                            arrayList2.add(method);
                        }
                    } else if (MethodData.IsIsMethod(name)) {
                        if (method.getParameterTypes().length == 0 && !method.getReturnType().equals(Void.TYPE)) {
                            if (treeMap.containsKey(strRemoveGetSetIs)) {
                                treeMap.put(strRemoveGetSetIs, Integer.valueOf(((Integer) treeMap.get(strRemoveGetSetIs)).intValue() + 1));
                            } else {
                                treeMap.put(strRemoveGetSetIs, 1);
                            }
                            arrayList4.add(method);
                        }
                    } else if (MethodData.IsSetMethod(name) && method.getParameterTypes().length == 1 && method.getReturnType().equals(Void.TYPE)) {
                        if (treeMap2.containsKey(strRemoveGetSetIs)) {
                            treeMap2.put(strRemoveGetSetIs, Integer.valueOf(((Integer) treeMap2.get(strRemoveGetSetIs)).intValue() + 1));
                        } else {
                            treeMap2.put(strRemoveGetSetIs, 1);
                        }
                        arrayList3.add(method);
                    }
                }
            }
            if (z2) {
                for (Method method2 : arrayList3) {
                    String strRemoveGetSetIs2 = MethodData.RemoveGetSetIs(method2.getName());
                    if (((Integer) treeMap2.get(strRemoveGetSetIs2)).intValue() <= 1 && treeMap.containsKey(strRemoveGetSetIs2)) {
                        Method methodFindMethod = FindMethod(arrayList2, strRemoveGetSetIs2, method2.getParameterTypes()[0]);
                        if (methodFindMethod == null) {
                            methodFindMethod = FindMethod(arrayList4, strRemoveGetSetIs2, method2.getParameterTypes()[0]);
                        }
                        if (methodFindMethod != null) {
                            int size = arrayList.size();
                            arrayList.add(new MethodData(method2.getName(), method2));
                            treeMap3.put(strRemoveGetSetIs2, Integer.valueOf(size));
                        }
                    }
                }
            } else {
                for (Method method3 : arrayList2) {
                    if (((Integer) treeMap.get(MethodData.RemoveGetSetIs(method3.getName()))).intValue() <= 1) {
                        arrayList.add(new MethodData(method3.getName(), method3));
                    }
                }
                for (Method method4 : arrayList4) {
                    if (((Integer) treeMap.get(MethodData.RemoveGetSetIs(method4.getName()))).intValue() <= 1) {
                        arrayList.add(new MethodData(method4.getName(), method4));
                    }
                }
            }
            for (Field field : cls.getFields()) {
                int modifiers2 = field.getModifiers();
                if ((modifiers2 + 25) - (modifiers2 | 25) == 1) {
                    String strRemoveIs = MethodData.RemoveIs(field.getName());
                    if (treeMap.containsKey(strRemoveIs) || treeMap2.containsKey(strRemoveIs)) {
                        int iIntValue = treeMap3.containsKey(strRemoveIs) ? ((Integer) treeMap3.get(strRemoveIs)).intValue() : -1;
                        if (iIntValue >= 0) {
                            arrayList.set(iIntValue, null);
                        }
                    } else {
                        arrayList.add(new MethodData(field.getName(), field));
                    }
                }
            }
            List<MethodData> listCompact = Compact(arrayList);
            (z2 ? setterPropertyList : propertyLists).put(cls, listCompact);
            return listCompact;
        }
    }

    public static <TKey, TValue> Collection<TKey> GetSortedKeys(Map<TKey, TValue> map) {
        if (map instanceof OrderedMap) {
            return ((OrderedMap) map).sortedKeys();
        }
        if (map instanceof SortedMap) {
            return ((SortedMap) map).keySet();
        }
        throw new IllegalStateException("Internal error: Map doesn't support sorted keys");
    }

    public static Object InvokeOneArgumentMethod(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            throw new NullPointerException("method");
        }
        try {
            return ((Method) obj).invoke(obj2, obj3);
        } catch (IllegalAccessException e2) {
            throw new CBORException(e2.getMessage(), e2);
        } catch (InvocationTargetException e3) {
            throw new CBORException(e3.getMessage(), e3);
        }
    }

    private static boolean IsProblematicForSerialization(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("com.sun.")) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (!cls2.equals(Serializable.class)) {
                }
            }
            return true;
        }
        if (!Type.class.isAssignableFrom(cls) && !Method.class.isAssignableFrom(cls) && !Field.class.isAssignableFrom(cls) && !Constructor.class.isAssignableFrom(cls)) {
            if (name.startsWith("com.")) {
                if (name.startsWith("com.sun.rowset") || name.startsWith("com.sun.org.apache.") || name.startsWith("com.sun.jndi.") || name.startsWith("com.mchange.v2.c3p0.")) {
                    return true;
                }
            } else if (name.startsWith("org.springframework.") || name.startsWith("java.io.") || name.startsWith("java.lang.annotation.") || name.startsWith("java.security.SignedObject") || name.startsWith("org.apache.xalan.") || name.startsWith("org.apache.xpath.") || name.startsWith("org.codehaus.groovy.") || name.startsWith("groovy.util.Expando") || name.startsWith("java.util.logging.")) {
            }
            return false;
        }
        return true;
    }

    public static List<CBORObject> ListFromArray(CBORObject[] cBORObjectArr) {
        return new CopyOnWriteList(cBORObjectArr);
    }

    public static Map<CBORObject, CBORObject> NewOrderedDict() {
        return new OrderedMap();
    }

    public static <K, V> Collection<K> ReadOnlyKeys(Map<K, V> map) {
        return Collections.unmodifiableCollection(map.keySet());
    }

    public static <K, V> Collection<V> ReadOnlyValues(Map<K, V> map) {
        return Collections.unmodifiableCollection(map.values());
    }

    public static void SkipStreamToEnd(InputStream inputStream) {
    }

    public static Object TypeToObject(CBORObject cBORObject, Type type, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions, int i2) {
        if (type.equals(Byte.class) || type.equals(Byte.TYPE)) {
            return Byte.valueOf(cBORObject.AsNumber().ToByteChecked());
        }
        if (type.equals(Short.class) || type.equals(Short.TYPE)) {
            return Short.valueOf(cBORObject.AsNumber().ToInt16Checked());
        }
        if (type.equals(Integer.class) || type.equals(Integer.TYPE)) {
            return Integer.valueOf(cBORObject.AsInt32());
        }
        if (type.equals(Long.class) || type.equals(Long.TYPE)) {
            return Long.valueOf(cBORObject.AsNumber().ToInt64Checked());
        }
        if (type.equals(Double.class) || type.equals(Double.TYPE)) {
            return Double.valueOf(cBORObject.AsDouble());
        }
        if (type.equals(Float.class) || type.equals(Float.TYPE)) {
            return Float.valueOf(cBORObject.AsSingle());
        }
        if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
            return Boolean.valueOf(cBORObject.AsBoolean());
        }
        int i3 = 0;
        if (type.equals(Character.class) || type.equals(Character.TYPE)) {
            if (cBORObject.getType() == CBORType.TextString) {
                String strAsString = cBORObject.AsString();
                if (strAsString.length() == 1) {
                    return Character.valueOf(strAsString.charAt(0));
                }
                throw new CBORException("Can't convert to char");
            }
            if (!cBORObject.isNumber() || !cBORObject.AsNumber().IsInteger() || !cBORObject.AsNumber().CanTruncatedIntFitInInt32()) {
                throw new CBORException("Can't convert to char");
            }
            int iAsInt32 = cBORObject.AsInt32();
            if (iAsInt32 < 0 || iAsInt32 >= 65536) {
                throw new CBORException("Can't convert to char");
            }
            return Character.valueOf((char) iAsInt32);
        }
        if (type.equals(Date.class)) {
            return new CBORDateConverter().FromCBORObject(cBORObject);
        }
        if (type.equals(UUID.class)) {
            return new CBORUuidConverter().FromCBORObject(cBORObject);
        }
        if (type.equals(URI.class)) {
            return new CBORUriConverter().FromCBORObject(cBORObject);
        }
        if (type.equals(BigDecimal.class)) {
            if (!cBORObject.isNumber()) {
                throw new IllegalStateException("Not a CBOR number");
            }
            EDecimal eDecimalToEDecimal = cBORObject.AsNumber().ToEDecimal();
            if (!eDecimalToEDecimal.isFinite()) {
                throw new CBORException("Can't convert to BigDecimal");
            }
            try {
                return new BigDecimal(new BigInteger(eDecimalToEDecimal.getMantissa().ToBytes(false)), eDecimalToEDecimal.getExponent().Negate().ToInt32Checked());
            } catch (Exception e2) {
                throw new CBORException("Can't convert to BigDecimal", e2);
            }
        }
        if (type.equals(BigInteger.class)) {
            if (cBORObject.isNumber()) {
                return new BigInteger(cBORObject.AsNumber().ToEInteger().ToBytes(false));
            }
            throw new IllegalStateException("Not a CBOR number");
        }
        if (type.equals(EInteger.class)) {
            if (cBORObject.isNumber()) {
                return cBORObject.AsNumber().ToEInteger();
            }
            throw new IllegalStateException("Not a CBOR number");
        }
        if (type.equals(EDecimal.class)) {
            if (cBORObject.isNumber()) {
                return cBORObject.AsNumber().ToEDecimal();
            }
            throw new IllegalStateException("Not a CBOR number");
        }
        if (type.equals(EFloat.class)) {
            if (cBORObject.isNumber()) {
                return cBORObject.AsNumber().ToEFloat();
            }
            throw new IllegalStateException("Not a CBOR number");
        }
        if (type.equals(ERational.class)) {
            if (cBORObject.isNumber()) {
                return cBORObject.AsNumber().ToERational();
            }
            throw new IllegalStateException("Not a CBOR number");
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (Enum.class.isAssignableFrom(cls)) {
                if (cBORObject.getType() == CBORType.TextString) {
                    try {
                        return Enum.valueOf((Class) type, cBORObject.AsString());
                    } catch (Exception e3) {
                        throw new CBORException(e3.getMessage(), e3);
                    }
                }
                if (!cBORObject.isNumber() || !cBORObject.AsNumber().IsInteger()) {
                    throw new CBORException("Invalid enum: " + cBORObject.toString());
                }
                Object[] objArrEnumValues = EnumValues(cls);
                int iAsInt322 = cBORObject.AsInt32();
                if (iAsInt322 < 0 || iAsInt322 >= objArrEnumValues.length) {
                    throw new CBORException("Invalid enum: " + cBORObject.toString());
                }
                return objArrEnumValues[iAsInt322];
            }
        }
        ParameterizedType parameterizedType = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        Type rawType = parameterizedType == null ? type : parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType == null ? null : parameterizedType.getActualTypeArguments();
        if (cBORObject.getType() == CBORType.ByteString && type.equals(byte[].class)) {
            byte[] bArrGetByteString = cBORObject.GetByteString();
            int length = bArrGetByteString.length;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrGetByteString, 0, bArr, 0, length);
            return bArr;
        }
        if (cBORObject.getType() == CBORType.Array) {
            Class cls2 = rawType instanceof Class ? (Class) rawType : null;
            if (cls2 != null && cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Object objNewInstance = Array.newInstance(componentType, cBORObject.size());
                Iterator<CBORObject> it = cBORObject.getValues().iterator();
                while (it.hasNext()) {
                    Array.set(objNewInstance, i3, it.next().ToObject(componentType, cBORTypeMapper, pODOptions, i2 + 1));
                    i3++;
                }
                return objNewInstance;
            }
            if ((rawType != null && rawType.equals(List.class)) || rawType.equals(Iterable.class) || rawType.equals(Collection.class) || rawType.equals(ArrayList.class)) {
                if (actualTypeArguments == null || actualTypeArguments.length == 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<CBORObject> it2 = cBORObject.getValues().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().ToObject(Object.class, cBORTypeMapper, pODOptions, i2 + 1));
                    }
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<CBORObject> it3 = cBORObject.getValues().iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().ToObject(actualTypeArguments[0], cBORTypeMapper, pODOptions, i2 + 1));
                }
                return arrayList2;
            }
            if (cls2 != null && !cls2.isInterface() && List.class.isAssignableFrom(cls2) && actualTypeArguments != null && actualTypeArguments.length == 1) {
                try {
                    List list = (List) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Iterator<CBORObject> it4 = cBORObject.getValues().iterator();
                    while (it4.hasNext()) {
                        list.add(it4.next().ToObject(actualTypeArguments[0], cBORTypeMapper, pODOptions, i2 + 1));
                    }
                    return list;
                } catch (IllegalAccessException e4) {
                    throw new CBORException("Failed to create object", e4);
                } catch (InstantiationException e5) {
                    throw new CBORException("Failed to create object", e5);
                } catch (NoSuchMethodException e6) {
                    throw new CBORException("Failed to create object", e6);
                } catch (InvocationTargetException e7) {
                    throw new CBORException("Failed to create object", e7);
                }
            }
        }
        if (cBORObject.getType() != CBORType.Map) {
            throw new CBORException();
        }
        if (rawType != null && rawType.equals(HashMap.class)) {
            if (actualTypeArguments == null || actualTypeArguments.length < 2) {
                HashMap map = new HashMap();
                for (Map.Entry<CBORObject, CBORObject> entry : cBORObject.getEntries()) {
                    int i4 = i2 + 1;
                    map.put(entry.getKey().ToObject(Object.class, cBORTypeMapper, pODOptions, i4), entry.getValue().ToObject(Object.class, cBORTypeMapper, pODOptions, i4));
                }
                return map;
            }
            HashMap map2 = new HashMap();
            for (Map.Entry<CBORObject, CBORObject> entry2 : cBORObject.getEntries()) {
                int i5 = i2 + 1;
                map2.put(entry2.getKey().ToObject(actualTypeArguments[0], cBORTypeMapper, pODOptions, i5), entry2.getValue().ToObject(actualTypeArguments[1], cBORTypeMapper, pODOptions, i5));
            }
            return map2;
        }
        if ((rawType != null && rawType.equals(TreeMap.class)) || rawType.equals(Map.class)) {
            if (actualTypeArguments == null || actualTypeArguments.length < 2) {
                TreeMap treeMap = new TreeMap();
                for (Map.Entry<CBORObject, CBORObject> entry3 : cBORObject.getEntries()) {
                    int i6 = i2 + 1;
                    treeMap.put(entry3.getKey().ToObject(Object.class, cBORTypeMapper, pODOptions, i6), entry3.getValue().ToObject(Object.class, cBORTypeMapper, pODOptions, i6));
                }
                return treeMap;
            }
            TreeMap treeMap2 = new TreeMap();
            for (Map.Entry<CBORObject, CBORObject> entry4 : cBORObject.getEntries()) {
                int i7 = i2 + 1;
                treeMap2.put(entry4.getKey().ToObject(actualTypeArguments[0], cBORTypeMapper, pODOptions, i7), entry4.getValue().ToObject(actualTypeArguments[1], cBORTypeMapper, pODOptions, i7));
            }
            return treeMap2;
        }
        if (rawType == null || !(rawType instanceof Class)) {
            throw new CBORException();
        }
        Class cls3 = (Class) rawType;
        if (cls3.getName() == null) {
            throw new CBORException();
        }
        ArrayList<Map.Entry> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<MethodData> listGetPropertyList = GetPropertyList(cls3, true);
        if (listGetPropertyList.size() == 1 && listGetPropertyList.get(0) == null) {
            throw new CBORException();
        }
        for (MethodData methodData : listGetPropertyList) {
            String strGetAdjustedName = methodData.GetAdjustedName(pODOptions == null || pODOptions.getUseCamelCase());
            CBORObject cBORObjectGetOrDefault = cBORObject.GetOrDefault(strGetAdjustedName, null);
            if (cBORObjectGetOrDefault != null) {
                arrayList3.add(new AbstractMap.SimpleEntry(strGetAdjustedName, cBORObjectGetOrDefault));
                arrayList4.add(methodData);
            }
        }
        try {
            Class<?> cls4 = (Class) rawType;
            Object objNewInstance2 = cls4.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (cls4 == objNewInstance2.getClass()) {
                for (Map.Entry entry5 : arrayList3) {
                    MethodData methodData2 = (MethodData) arrayList4.get(i3);
                    methodData2.SetValue(objNewInstance2, ((CBORObject) entry5.getValue()).ToObject(methodData2.GetValueType(), cBORTypeMapper, pODOptions, i2 + 1));
                    i3++;
                }
            } else {
                Map map3 = new HashMap();
                for (Map.Entry entry6 : arrayList3) {
                    map3.put((String) entry6.getKey(), (CBORObject) entry6.getValue());
                    if (map3.size() == 50) {
                        map3 = new TreeMap(map3);
                    }
                }
                List<MethodData> listGetPropertyList2 = GetPropertyList(objNewInstance2.getClass(), true);
                if (listGetPropertyList2.size() == 1 && listGetPropertyList2.get(0) == null) {
                    throw new CBORException();
                }
                for (MethodData methodData3 : listGetPropertyList2) {
                    String strGetAdjustedName2 = methodData3.GetAdjustedName(pODOptions == null || pODOptions.getUseCamelCase());
                    if (map3.containsKey(strGetAdjustedName2)) {
                        methodData3.SetValue(objNewInstance2, ((CBORObject) map3.get(strGetAdjustedName2)).ToObject(methodData3.GetValueType(), cBORTypeMapper, pODOptions, i2 + 1));
                    }
                }
            }
            return objNewInstance2;
        } catch (IllegalAccessException e8) {
            throw ((RuntimeException) new CBORException("").initCause(e8));
        } catch (IllegalArgumentException e9) {
            throw ((RuntimeException) new CBORException("").initCause(e9));
        } catch (InstantiationException e10) {
            throw ((RuntimeException) new CBORException("").initCause(e10));
        } catch (NoSuchMethodException e11) {
            throw ((RuntimeException) new CBORException("").initCause(e11));
        } catch (InvocationTargetException e12) {
            throw ((RuntimeException) new CBORException("").initCause(e12));
        }
    }

    public static byte[] UUIDToBytes(UUID uuid) {
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        long j2 = mostSignificantBits >> 40;
        byte b2 = (byte) ((j2 + 255) - (j2 | 255));
        long j3 = mostSignificantBits >> 32;
        byte b3 = (byte) ((j3 + 255) - (j3 | 255));
        long j4 = mostSignificantBits >> 24;
        byte b4 = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = mostSignificantBits >> 16;
        long j6 = leastSignificantBits >> 56;
        return new byte[]{(byte) ((-1) - (((-1) - (mostSignificantBits >> 56)) | ((-1) - 255))), (byte) ((mostSignificantBits >> 48) & 255), b2, b3, b4, (byte) ((j5 + 255) - (j5 | 255)), (byte) ((-1) - (((-1) - (mostSignificantBits >> 8)) | ((-1) - 255))), (byte) ((-1) - (((-1) - mostSignificantBits) | ((-1) - 255))), (byte) ((j6 + 255) - (j6 | 255)), (byte) ((leastSignificantBits >> 48) & 255), (byte) ((-1) - (((-1) - (leastSignificantBits >> 40)) | ((-1) - 255))), (byte) ((leastSignificantBits >> 32) & 255), (byte) ((-1) - (((-1) - (leastSignificantBits >> 24)) | ((-1) - 255))), (byte) ((leastSignificantBits >> 16) & 255), (byte) ((-1) - (((-1) - (leastSignificantBits >> 8)) | ((-1) - 255))), (byte) ((leastSignificantBits + 255) - (leastSignificantBits | 255))};
    }
}
