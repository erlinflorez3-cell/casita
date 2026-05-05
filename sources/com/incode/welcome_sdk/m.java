package com.incode.welcome_sdk;

import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10421a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f10422b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final MutableStateFlow<e> f10423c = StateFlowKt.MutableStateFlow(new e(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10424d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10425e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f10426i = 1;

    private m() {
    }

    static {
        int i2 = f10426i + 91;
        f10421a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void c(e eVar) {
        MutableStateFlow<e> mutableStateFlow;
        int i2 = 2 % 2;
        int i3 = f10424d + 7;
        f10425e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            mutableStateFlow = f10423c;
            int i4 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(eVar, "");
            mutableStateFlow = f10423c;
        }
        int i5 = f10425e + 47;
        f10424d = i5 % 128;
        int i6 = i5 % 2;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), eVar)) {
        }
    }

    public static StateFlow<e> b() {
        int i2 = 2 % 2;
        int i3 = f10425e + 35;
        f10424d = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<e> mutableStateFlow = f10423c;
        if (i4 != 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10427a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10428e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function0<Unit> f10429b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f10430d;

        public /* synthetic */ e(byte b2) {
            this(false, null);
        }

        public e(boolean z2, Function0<Unit> function0) {
            this.f10430d = z2;
            this.f10429b = function0;
        }

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f10428e + 51;
            f10427a = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f10430d;
            if (i4 == 0) {
                int i5 = 80 / 0;
            }
            return z2;
        }

        public final Function0<Unit> e() {
            int i2 = 2 % 2;
            int i3 = f10427a + 75;
            f10428e = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f10429b;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public e() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10428e;
            int i4 = i3 + 125;
            f10427a = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                int i5 = i3 + 95;
                f10427a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            e eVar = (e) obj;
            if (this.f10430d != eVar.f10430d) {
                return false;
            }
            if (Intrinsics.areEqual(this.f10429b, eVar.f10429b)) {
                return true;
            }
            int i7 = f10428e + 89;
            int i8 = i7 % 128;
            f10427a = i8;
            boolean z2 = i7 % 2 == 0;
            int i9 = i8 + 103;
            f10428e = i9 % 128;
            if (i9 % 2 == 0) {
                return z2;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[PHI: r3
  0x002a: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x0027, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r3
  0x001a: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x0027, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int hashCode() {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.m.e.f10428e
                int r1 = r0 + 55
                int r0 = r1 % 128
                com.incode.welcome_sdk.m.e.f10427a = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L1d
                boolean r0 = r5.f10430d
                int r0 = java.lang.Boolean.hashCode(r0)
                int r3 = r0 >>> 23
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.f10429b
                if (r0 != 0) goto L2a
            L1a:
                r2 = 0
            L1b:
                int r3 = r3 + r2
                return r3
            L1d:
                boolean r0 = r5.f10430d
                int r0 = java.lang.Boolean.hashCode(r0)
                int r3 = r0 * 31
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.f10429b
                if (r0 != 0) goto L2a
                goto L1a
            L2a:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.f10429b
                int r2 = r0.hashCode()
                int r0 = com.incode.welcome_sdk.m.e.f10427a
                int r1 = r0 + 77
                int r0 = r1 % 128
                com.incode.welcome_sdk.m.e.f10428e = r0
                int r1 = r1 % r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.m.e.hashCode():int");
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10428e + 47;
            f10427a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                String str = "TransitionState(isShown=" + this.f10430d + ", noConnectivityAction=" + this.f10429b + ")";
                throw null;
            }
            String str2 = "TransitionState(isShown=" + this.f10430d + ", noConnectivityAction=" + this.f10429b + ")";
            int i4 = f10427a + 29;
            f10428e = i4 % 128;
            if (i4 % 2 == 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        }
    }
}
