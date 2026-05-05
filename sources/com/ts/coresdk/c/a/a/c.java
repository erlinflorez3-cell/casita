package com.ts.coresdk.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    private final String cW;
    private final Context cX;
    private final Object cY;

    public c(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.cW = str;
        short sXd = (short) (OY.Xd() ^ 12358);
        int[] iArr = new int["AMFSSLJ\u0013KVX]QYb\u001b\u0013>@E9KJ".length()];
        QB qb = new QB("AMFSSLJ\u0013KVX]QYb\u001b\u0013>@E9KJ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u000e\u000b\u0019d\u0013\u0012\r\t\u0002~\u0011\u0005\n\b[\u0007\u0005\ny\f\u0007", (short) (Od.Xd() ^ (-22887)), (short) (Od.Xd() ^ (-18347))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.cX = context2;
            this.cY = new Object();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void a(SharedPreferences sharedPreferences, String str, Object obj) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        try {
            Object objB = b(obj);
            if (objB instanceof String) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit, "");
                editorEdit.putString(str, (String) objB);
                editorEdit.apply();
            } else if (objB instanceof Integer) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit2, "");
                editorEdit2.putInt(str, ((Number) objB).intValue());
                editorEdit2.apply();
            } else if (objB instanceof Boolean) {
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit3, "");
                editorEdit3.putBoolean(str, ((Boolean) objB).booleanValue());
                editorEdit3.apply();
            } else if (objB instanceof Float) {
                SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit4, "");
                editorEdit4.putFloat(str, ((Number) objB).floatValue());
                editorEdit4.apply();
            } else if (objB instanceof Long) {
                SharedPreferences.Editor editorEdit5 = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit5, "");
                editorEdit5.putLong(str, ((Number) objB).longValue());
                editorEdit5.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract SharedPreferences C();

    protected final String D() {
        return this.cW;
    }

    protected final Context E() {
        return this.cX;
    }

    public final void F() {
        try {
            synchronized (this.cY) {
                SharedPreferences.Editor editorEdit = C().edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit, "");
                editorEdit.clear();
                editorEdit.apply();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }

    public abstract <R> R a(Object obj, KClass<R> kClass);

    public abstract KClass<? extends Object> a(KClass<? extends Object> kClass);

    public final void a(String str, float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Float fValueOf = Float.valueOf(f2);
        synchronized (this.cY) {
            try {
                a(C(), str, fValueOf);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Long lValueOf = Long.valueOf(j2);
        synchronized (this.cY) {
            try {
                a(C(), str, lValueOf);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean boolValueOf = Boolean.valueOf(z2);
        synchronized (this.cY) {
            try {
                a(C(), str, boolValueOf);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final float b(String str, float f2) {
        Object objA;
        Object string;
        Intrinsics.checkNotNullParameter(str, "");
        KClass<? extends Object> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Float.TYPE);
        Object objValueOf = Float.valueOf(f2);
        try {
            synchronized (this.cY) {
                SharedPreferences sharedPreferencesC = C();
                try {
                    Object objC = c(objValueOf);
                    KClass<? extends Object> kClassA = a(orCreateKotlinClass);
                    if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = sharedPreferencesC.getString(str, objC instanceof String ? (String) objC : null);
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        Integer num = objC instanceof Integer ? (Integer) objC : null;
                        string = Integer.valueOf(sharedPreferencesC.getInt(str, num != null ? num.intValue() : -1));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
                        string = Boolean.valueOf(sharedPreferencesC.getBoolean(str, bool != null ? bool.booleanValue() : false));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        Float f3 = objC instanceof Float ? (Float) objC : null;
                        string = Float.valueOf(sharedPreferencesC.getFloat(str, f3 != null ? f3.floatValue() : -1.0f));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        Long l2 = objC instanceof Long ? (Long) objC : null;
                        string = Long.valueOf(sharedPreferencesC.getLong(str, l2 != null ? l2.longValue() : -1L));
                    } else {
                        string = sharedPreferencesC.getString(str, null);
                    }
                    objA = a(string, orCreateKotlinClass);
                } catch (Throwable unused) {
                    objA = objValueOf;
                }
                if (objA == null) {
                    objA = objValueOf;
                }
            }
            objValueOf = objA;
        } catch (Throwable unused2) {
        }
        Float f4 = (Float) objValueOf;
        return f4 != null ? f4.floatValue() : f2;
    }

    public final long b(String str, long j2) {
        Object objA;
        Object string;
        Intrinsics.checkNotNullParameter(str, "");
        KClass<? extends Object> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.TYPE);
        Object objValueOf = Long.valueOf(j2);
        try {
            synchronized (this.cY) {
                SharedPreferences sharedPreferencesC = C();
                try {
                    Object objC = c(objValueOf);
                    KClass<? extends Object> kClassA = a(orCreateKotlinClass);
                    if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = sharedPreferencesC.getString(str, objC instanceof String ? (String) objC : null);
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        Integer num = objC instanceof Integer ? (Integer) objC : null;
                        string = Integer.valueOf(sharedPreferencesC.getInt(str, num != null ? num.intValue() : -1));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
                        string = Boolean.valueOf(sharedPreferencesC.getBoolean(str, bool != null ? bool.booleanValue() : false));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        Float f2 = objC instanceof Float ? (Float) objC : null;
                        string = Float.valueOf(sharedPreferencesC.getFloat(str, f2 != null ? f2.floatValue() : -1.0f));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        Long l2 = objC instanceof Long ? (Long) objC : null;
                        string = Long.valueOf(sharedPreferencesC.getLong(str, l2 != null ? l2.longValue() : -1L));
                    } else {
                        string = sharedPreferencesC.getString(str, null);
                    }
                    objA = a(string, orCreateKotlinClass);
                } catch (Throwable unused) {
                    objA = objValueOf;
                }
                if (objA == null) {
                    objA = objValueOf;
                }
            }
            objValueOf = objA;
        } catch (Throwable unused2) {
        }
        Long l3 = (Long) objValueOf;
        return l3 != null ? l3.longValue() : j2;
    }

    public abstract Object b(Object obj);

    public final void b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (this.cY) {
            try {
                a(C(), str, str2);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean b(String str, boolean z2) {
        Object objA;
        Object string;
        Intrinsics.checkNotNullParameter(str, "");
        KClass<? extends Object> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        Object objValueOf = Boolean.valueOf(z2);
        try {
            synchronized (this.cY) {
                SharedPreferences sharedPreferencesC = C();
                try {
                    Object objC = c(objValueOf);
                    KClass<? extends Object> kClassA = a(orCreateKotlinClass);
                    if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = sharedPreferencesC.getString(str, objC instanceof String ? (String) objC : null);
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        Integer num = objC instanceof Integer ? (Integer) objC : null;
                        string = Integer.valueOf(sharedPreferencesC.getInt(str, num != null ? num.intValue() : -1));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
                        string = Boolean.valueOf(sharedPreferencesC.getBoolean(str, bool != null ? bool.booleanValue() : false));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        Float f2 = objC instanceof Float ? (Float) objC : null;
                        string = Float.valueOf(sharedPreferencesC.getFloat(str, f2 != null ? f2.floatValue() : -1.0f));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        Long l2 = objC instanceof Long ? (Long) objC : null;
                        string = Long.valueOf(sharedPreferencesC.getLong(str, l2 != null ? l2.longValue() : -1L));
                    } else {
                        string = sharedPreferencesC.getString(str, null);
                    }
                    objA = a(string, orCreateKotlinClass);
                } catch (Throwable unused) {
                    objA = objValueOf;
                }
                if (objA == null) {
                    objA = objValueOf;
                }
            }
            objValueOf = objA;
        } catch (Throwable unused2) {
        }
        Boolean bool2 = (Boolean) objValueOf;
        return bool2 != null ? bool2.booleanValue() : z2;
    }

    public abstract Object c(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final String c(String str, String str2) {
        ?? A;
        Object string;
        Intrinsics.checkNotNullParameter(str, "");
        KClass<? extends Object> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        try {
            synchronized (this.cY) {
                SharedPreferences sharedPreferencesC = C();
                try {
                    Object objC = c(str2);
                    KClass<? extends Object> kClassA = a(orCreateKotlinClass);
                    if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = sharedPreferencesC.getString(str, objC instanceof String ? (String) objC : null);
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        Integer num = objC instanceof Integer ? (Integer) objC : null;
                        string = Integer.valueOf(sharedPreferencesC.getInt(str, num != null ? num.intValue() : -1));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
                        string = Boolean.valueOf(sharedPreferencesC.getBoolean(str, bool != null ? bool.booleanValue() : false));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        Float f2 = objC instanceof Float ? (Float) objC : null;
                        string = Float.valueOf(sharedPreferencesC.getFloat(str, f2 != null ? f2.floatValue() : -1.0f));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        Long l2 = objC instanceof Long ? (Long) objC : null;
                        string = Long.valueOf(sharedPreferencesC.getLong(str, l2 != null ? l2.longValue() : -1L));
                    } else {
                        string = sharedPreferencesC.getString(str, null);
                    }
                    A = a(string, orCreateKotlinClass);
                } catch (Throwable unused) {
                    A = str2;
                }
                if (A == 0) {
                    A = str2;
                }
            }
            str2 = A;
        } catch (Throwable unused2) {
        }
        return (String) str2;
    }

    public final void c(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer numValueOf = Integer.valueOf(i2);
        synchronized (this.cY) {
            try {
                a(C(), str, numValueOf);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int d(String str, int i2) {
        Object objA;
        Object string;
        Intrinsics.checkNotNullParameter(str, "");
        KClass<? extends Object> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        Object objValueOf = Integer.valueOf(i2);
        try {
            synchronized (this.cY) {
                SharedPreferences sharedPreferencesC = C();
                try {
                    Object objC = c(objValueOf);
                    KClass<? extends Object> kClassA = a(orCreateKotlinClass);
                    if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = sharedPreferencesC.getString(str, objC instanceof String ? (String) objC : null);
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        Integer num = objC instanceof Integer ? (Integer) objC : null;
                        string = Integer.valueOf(sharedPreferencesC.getInt(str, num != null ? num.intValue() : -1));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
                        string = Boolean.valueOf(sharedPreferencesC.getBoolean(str, bool != null ? bool.booleanValue() : false));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                        Float f2 = objC instanceof Float ? (Float) objC : null;
                        string = Float.valueOf(sharedPreferencesC.getFloat(str, f2 != null ? f2.floatValue() : -1.0f));
                    } else if (Intrinsics.areEqual(kClassA, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        Long l2 = objC instanceof Long ? (Long) objC : null;
                        string = Long.valueOf(sharedPreferencesC.getLong(str, l2 != null ? l2.longValue() : -1L));
                    } else {
                        string = sharedPreferencesC.getString(str, null);
                    }
                    objA = a(string, orCreateKotlinClass);
                } catch (Throwable unused) {
                    objA = objValueOf;
                }
                if (objA == null) {
                    objA = objValueOf;
                }
            }
            objValueOf = objA;
        } catch (Throwable unused2) {
        }
        Integer num2 = (Integer) objValueOf;
        return num2 != null ? num2.intValue() : i2;
    }

    public final void l(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            synchronized (this.cY) {
                SharedPreferences.Editor editorEdit = C().edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit, "");
                editorEdit.remove(str);
                editorEdit.apply();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }
}
