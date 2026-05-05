package com.facetec.sdk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
final class eg extends eh {
    private static Class Z = null;
    private final Object Code = Code();
    private final Field B = V();

    eg() {
    }

    private static Object Code() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Z = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field V() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private boolean V(AccessibleObject accessibleObject) {
        if (this.Code != null && this.B != null) {
            try {
                Z.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.Code, accessibleObject, Long.valueOf(((Long) Z.getMethod("objectFieldOffset", Field.class).invoke(this.Code, this.B)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.eh
    public final void B(AccessibleObject accessibleObject) {
        if (V(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new cu(new StringBuilder("Gson couldn't modify fields for ").append(accessibleObject).append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.").toString(), e2);
        }
    }
}
