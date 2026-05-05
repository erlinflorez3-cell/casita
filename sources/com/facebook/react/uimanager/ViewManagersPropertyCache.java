package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.braze.models.FeatureFlag;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import yg.Kl;

/* JADX INFO: loaded from: classes3.dex */
class ViewManagersPropertyCache {
    private static final Map<Class, Map<String, PropSetter>> CLASS_PROPS_CACHE = new HashMap();
    private static final Map<String, PropSetter> EMPTY_PROPS_MAP = new HashMap();

    private static class ArrayPropSetter extends PropSetter {
        public ArrayPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    private static class BooleanPropSetter extends PropSetter {
        private final boolean mDefaultValue;

        public BooleanPropSetter(ReactProp reactProp, Method method, boolean z2) {
            super(reactProp, "boolean", method);
            this.mDefaultValue = z2;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return obj == null ? this.mDefaultValue : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    private static class BoxedBooleanPropSetter extends PropSetter {
        public BoxedBooleanPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    private static class BoxedColorPropSetter extends PropSetter {
        public BoxedColorPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        public BoxedColorPropSetter(ReactPropGroup reactPropGroup, Method method, int i2) {
            super(reactPropGroup, "mixed", method, i2);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }
    }

    private static class BoxedIntPropSetter extends PropSetter {
        public BoxedIntPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, FeatureFlag.PROPERTIES_TYPE_NUMBER, method);
        }

        public BoxedIntPropSetter(ReactPropGroup reactPropGroup, Method method, int i2) {
            super(reactPropGroup, FeatureFlag.PROPERTIES_TYPE_NUMBER, method, i2);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }
    }

    private static class ColorPropSetter extends PropSetter {
        private final int mDefaultValue;

        public ColorPropSetter(ReactProp reactProp, Method method) {
            this(reactProp, method, 0);
        }

        public ColorPropSetter(ReactProp reactProp, Method method, int i2) {
            super(reactProp, "mixed", method);
            this.mDefaultValue = i2;
        }

        public ColorPropSetter(ReactPropGroup reactPropGroup, Method method, int i2, int i3) {
            super(reactPropGroup, "mixed", method, i2);
            this.mDefaultValue = i3;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.mDefaultValue) : ColorPropConverter.getColor(obj, context);
        }
    }

    private static class DoublePropSetter extends PropSetter {
        private final double mDefaultValue;

        public DoublePropSetter(ReactProp reactProp, Method method, double d2) {
            super(reactProp, FeatureFlag.PROPERTIES_TYPE_NUMBER, method);
            this.mDefaultValue = d2;
        }

        public DoublePropSetter(ReactPropGroup reactPropGroup, Method method, int i2, double d2) {
            super(reactPropGroup, FeatureFlag.PROPERTIES_TYPE_NUMBER, method, i2);
            this.mDefaultValue = d2;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.mDefaultValue : ((Double) obj).doubleValue());
        }
    }

    private static class DynamicPropSetter extends PropSetter {
        public DynamicPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        public DynamicPropSetter(ReactPropGroup reactPropGroup, Method method, int i2) {
            super(reactPropGroup, "mixed", method, i2);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    private static class FloatPropSetter extends PropSetter {
        private final float mDefaultValue;

        public FloatPropSetter(ReactProp reactProp, Method method, float f2) {
            super(reactProp, FeatureFlag.PROPERTIES_TYPE_NUMBER, method);
            this.mDefaultValue = f2;
        }

        public FloatPropSetter(ReactPropGroup reactPropGroup, Method method, int i2, float f2) {
            super(reactPropGroup, FeatureFlag.PROPERTIES_TYPE_NUMBER, method, i2);
            this.mDefaultValue = f2;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.mDefaultValue : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }
    }

    private static class IntPropSetter extends PropSetter {
        private final int mDefaultValue;

        public IntPropSetter(ReactProp reactProp, Method method, int i2) {
            super(reactProp, FeatureFlag.PROPERTIES_TYPE_NUMBER, method);
            this.mDefaultValue = i2;
        }

        public IntPropSetter(ReactPropGroup reactPropGroup, Method method, int i2, int i3) {
            super(reactPropGroup, FeatureFlag.PROPERTIES_TYPE_NUMBER, method, i2);
            this.mDefaultValue = i3;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.mDefaultValue : Integer.valueOf(((Double) obj).intValue()).intValue());
        }
    }

    private static class MapPropSetter extends PropSetter {
        public MapPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    static abstract class PropSetter {
        protected final Integer mIndex;
        protected final String mPropName;
        protected final String mPropType;
        protected final Method mSetter;
        private static final ThreadLocal<Object[]> VIEW_MGR_ARGS = ViewManagersPropertyCache.createThreadLocalArray(2);
        private static final ThreadLocal<Object[]> VIEW_MGR_GROUP_ARGS = ViewManagersPropertyCache.createThreadLocalArray(3);
        private static final ThreadLocal<Object[]> SHADOW_ARGS = ViewManagersPropertyCache.createThreadLocalArray(1);
        private static final ThreadLocal<Object[]> SHADOW_GROUP_ARGS = ViewManagersPropertyCache.createThreadLocalArray(2);

        private PropSetter(ReactProp reactProp, String str, Method method) {
            this.mPropName = reactProp.name();
            this.mPropType = "__default_type__".equals(reactProp.customType()) ? str : reactProp.customType();
            this.mSetter = method;
            this.mIndex = null;
        }

        private PropSetter(ReactPropGroup reactPropGroup, String str, Method method, int i2) {
            this.mPropName = reactPropGroup.names()[i2];
            this.mPropType = "__default_type__".equals(reactPropGroup.customType()) ? str : reactPropGroup.customType();
            this.mSetter = method;
            this.mIndex = Integer.valueOf(i2);
        }

        public String getPropName() {
            return this.mPropName;
        }

        public String getPropType() {
            return this.mPropType;
        }

        protected abstract Object getValueOrDefault(Object obj, Context context);

        public void updateShadowNodeProp(ReactShadowNode reactShadowNode, Object obj) {
            Object[] objArr;
            try {
                if (this.mIndex == null) {
                    objArr = SHADOW_ARGS.get();
                    objArr[0] = getValueOrDefault(obj, reactShadowNode.getThemedContext());
                } else {
                    objArr = SHADOW_GROUP_ARGS.get();
                    objArr[0] = this.mIndex;
                    objArr[1] = getValueOrDefault(obj, reactShadowNode.getThemedContext());
                }
                this.mSetter.invoke(reactShadowNode, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                FLog.e((Class<?>) ViewManager.class, "Error while updating prop " + this.mPropName, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.mPropName + "' in shadow node of type: " + reactShadowNode.getViewClass(), th);
            }
        }

        public void updateViewProp(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.mIndex == null) {
                    objArr = VIEW_MGR_ARGS.get();
                    objArr[0] = view;
                    objArr[1] = getValueOrDefault(obj, view.getContext());
                } else {
                    objArr = VIEW_MGR_GROUP_ARGS.get();
                    objArr[0] = view;
                    objArr[1] = this.mIndex;
                    objArr[2] = getValueOrDefault(obj, view.getContext());
                }
                this.mSetter.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                FLog.e((Class<?>) ViewManager.class, "Error while updating prop " + this.mPropName, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.mPropName + "' of a view managed by: " + viewManager.getName(), th);
            }
        }
    }

    private static class StringPropSetter extends PropSetter {
        public StringPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        protected Object getValueOrDefault(Object obj, Context context) {
            return (String) obj;
        }
    }

    ViewManagersPropertyCache() {
    }

    public static void clear() {
        CLASS_PROPS_CACHE.clear();
        EMPTY_PROPS_MAP.clear();
    }

    private static PropSetter createPropSetter(ReactProp reactProp, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new DynamicPropSetter(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanPropSetter(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(reactProp.customType()) ? new ColorPropSetter(reactProp, method, reactProp.defaultInt()) : new IntPropSetter(reactProp, method, reactProp.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new FloatPropSetter(reactProp, method, reactProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new DoublePropSetter(reactProp, method, reactProp.defaultDouble());
        }
        if (cls == String.class) {
            return new StringPropSetter(reactProp, method);
        }
        if (cls == Boolean.class) {
            return new BoxedBooleanPropSetter(reactProp, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(reactProp.customType()) ? new BoxedColorPropSetter(reactProp, method) : new BoxedIntPropSetter(reactProp, method);
        }
        if (cls == ReadableArray.class) {
            return new ArrayPropSetter(reactProp, method);
        }
        if (cls == ReadableMap.class) {
            return new MapPropSetter(reactProp, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void createPropSetters(ReactPropGroup reactPropGroup, Method method, Class<?> cls, Map<String, PropSetter> map) {
        String[] strArrNames = reactPropGroup.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new DynamicPropSetter(reactPropGroup, method, i2));
                i2++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i2 < strArrNames.length) {
                if ("Color".equals(reactPropGroup.customType())) {
                    map.put(strArrNames[i2], new ColorPropSetter(reactPropGroup, method, i2, reactPropGroup.defaultInt()));
                } else {
                    map.put(strArrNames[i2], new IntPropSetter(reactPropGroup, method, i2, reactPropGroup.defaultInt()));
                }
                i2++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new FloatPropSetter(reactPropGroup, method, i2, reactPropGroup.defaultFloat()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new DoublePropSetter(reactPropGroup, method, i2, reactPropGroup.defaultDouble()));
                i2++;
            }
        } else {
            if (cls != Integer.class) {
                throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            }
            while (i2 < strArrNames.length) {
                if ("Color".equals(reactPropGroup.customType())) {
                    map.put(strArrNames[i2], new BoxedColorPropSetter(reactPropGroup, method, i2));
                } else {
                    map.put(strArrNames[i2], new BoxedIntPropSetter(reactPropGroup, method, i2));
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal<Object[]> createThreadLocalArray(final int i2) {
        if (i2 <= 0) {
            return null;
        }
        return new ThreadLocal<Object[]>() { // from class: com.facebook.react.uimanager.ViewManagersPropertyCache.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Object[] initialValue() {
                return new Object[i2];
            }
        };
    }

    private static void extractPropSettersFromShadowNodeClassDefinition(Class<? extends ReactShadowNode> cls, Map<String, PropSetter> map) {
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) Kl.zd(method, ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[0]));
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) Kl.zd(method, ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                createPropSetters(reactPropGroup, method, parameterTypes2[1], map);
            }
        }
    }

    private static void extractPropSettersFromViewManagerClassDefinition(Class<? extends ViewManager> cls, Map<String, PropSetter> map) {
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) Kl.zd(method, ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[1]));
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) Kl.zd(method, ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                createPropSetters(reactPropGroup, method, parameterTypes2[2], map);
            }
        }
    }

    static Map<String, PropSetter> getNativePropSettersForShadowNodeClass(Class<? extends ReactShadowNode> cls) {
        if (cls == null) {
            return EMPTY_PROPS_MAP;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == ReactShadowNode.class) {
                return EMPTY_PROPS_MAP;
            }
        }
        Map<Class, Map<String, PropSetter>> map = CLASS_PROPS_CACHE;
        Map<String, PropSetter> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(getNativePropSettersForShadowNodeClass(cls.getSuperclass()));
        extractPropSettersFromShadowNodeClassDefinition(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map<String, PropSetter> getNativePropSettersForViewManagerClass(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return EMPTY_PROPS_MAP;
        }
        Map<Class, Map<String, PropSetter>> map = CLASS_PROPS_CACHE;
        Map<String, PropSetter> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(getNativePropSettersForViewManagerClass(cls.getSuperclass()));
        extractPropSettersFromViewManagerClassDefinition(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map<String, String> getNativePropsForView(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap map = new HashMap();
        for (PropSetter propSetter : getNativePropSettersForViewManagerClass(cls).values()) {
            map.put(propSetter.getPropName(), propSetter.getPropType());
        }
        for (PropSetter propSetter2 : getNativePropSettersForShadowNodeClass(cls2).values()) {
            map.put(propSetter2.getPropName(), propSetter2.getPropType());
        }
        return map;
    }
}
