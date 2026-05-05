package com.incode.welcome_sdk.commons.utils;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6697a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6698b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f6699c = new z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6700d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6701e = 1;

    private z() {
    }

    public static Object b(String str, String str2, Object obj) {
        Field declaredField;
        int i2 = 2 % 2;
        int i3 = f6701e + 87;
        f6698b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                declaredField = Class.forName(str).getDeclaredField(str2);
                declaredField.setAccessible(true);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                declaredField = Class.forName(str).getDeclaredField(str2);
                declaredField.setAccessible(true);
            }
            return declaredField.get(obj);
        } catch (ClassNotFoundException e2) {
            Timber.Forest.e(e2, "Class not found: " + str, new Object[0]);
            int i4 = f6698b + 5;
            f6701e = i4 % 128;
            int i5 = i4 % 2;
            return null;
        } catch (ExceptionInInitializerError e3) {
            Timber.Forest.e(e3, "Initialization provoked by the accessing the '" + str + "' class failed", new Object[0]);
            int i42 = f6698b + 5;
            f6701e = i42 % 128;
            int i52 = i42 % 2;
            return null;
        } catch (IllegalAccessException e4) {
            Timber.Forest.e(e4, "Failed to access the '" + str2 + "' field", new Object[0]);
            int i422 = f6698b + 5;
            f6701e = i422 % 128;
            int i522 = i422 % 2;
            return null;
        } catch (IllegalArgumentException e5) {
            Timber.Forest.e(e5, obj + " must be an instance of '" + str + "' that has the '" + str2 + "' field", new Object[0]);
            int i4222 = f6698b + 5;
            f6701e = i4222 % 128;
            int i5222 = i4222 % 2;
            return null;
        } catch (LinkageError e6) {
            Timber.Forest.e(e6, "Linkage between: " + str + " and the '" + str2 + "' field encountered an issue", new Object[0]);
            int i42222 = f6698b + 5;
            f6701e = i42222 % 128;
            int i52222 = i42222 % 2;
            return null;
        } catch (NoSuchFieldException e7) {
            Timber.Forest.e(e7, "Field '" + str2 + "' not found in: " + str, new Object[0]);
            int i422222 = f6698b + 5;
            f6701e = i422222 % 128;
            int i522222 = i422222 % 2;
            return null;
        } catch (NullPointerException e8) {
            Timber.Forest.e(e8, obj + " must not be null to access the '" + str + "." + str2 + "' field", new Object[0]);
            int i4222222 = f6698b + 5;
            f6701e = i4222222 % 128;
            int i5222222 = i4222222 % 2;
            return null;
        } catch (SecurityException e9) {
            Timber.Forest.e(e9, "A security issue prevented access to the '" + str2 + "' field", new Object[0]);
            int i42222222 = f6698b + 5;
            f6701e = i42222222 % 128;
            int i52222222 = i42222222 % 2;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Method d(java.lang.String r7, java.lang.String r8, java.lang.Class<?>... r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.z.d(java.lang.String, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0068: INVOKE (r4 I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:136), block:B:21:0x0068 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: INVOKE (r4 I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:129), block:B:23:0x00a0 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00c6: INVOKE (r4 I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:122), block:B:25:0x00c6 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00fb: INVOKE (r4 I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:115), block:B:27:0x00fb */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x011e: INVOKE (r4 I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:143), block:B:29:0x011e */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0082: INVOKE (r1 I:java.lang.StringBuilder) = (r0v11 ?? I:java.lang.StringBuilder), (r7 I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[MD:(java.lang.String):java.lang.StringBuilder (c)], block:B:21:0x0068 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e0: INVOKE (r1 I:java.lang.StringBuilder) = (r0v20 ?? I:java.lang.StringBuilder), (r7 I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[MD:(java.lang.String):java.lang.StringBuilder (c)], block:B:25:0x00c6 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0130: INVOKE (r1 I:java.lang.StringBuilder) = (r1v9 ?? I:java.lang.StringBuilder), (r7 I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[MD:(java.lang.String):java.lang.StringBuilder (c)], block:B:29:0x011e */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Class[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Class[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Class[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Class[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Class[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(java.lang.reflect.Method r8, java.lang.Object r9, java.lang.Object... r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.z.b(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    private static void b(Class<?>[] clsArr, Class<?> cls, Throwable th, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6701e + 75;
        f6698b = i3 % 128;
        if (i3 % 2 == 0) {
            if (ArraysKt.contains(clsArr, cls)) {
                throw th;
            }
            Timber.Forest.e(th, str, new Object[0]);
            int i4 = f6701e + 115;
            f6698b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        ArraysKt.contains(clsArr, cls);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f6700d + 47;
        f6697a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
