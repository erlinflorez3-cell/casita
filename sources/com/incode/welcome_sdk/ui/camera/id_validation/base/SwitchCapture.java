package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.data.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SwitchCapture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11829b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11830c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11831a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11833e;

    public SwitchCapture(Event event, String str, String str2) {
        Intrinsics.checkNotNullParameter(event, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f11833e = str;
        this.f11831a = str2;
        this.f11832d = event.getValue();
    }

    public final String getEventValue() {
        int i2 = 2 % 2;
        int i3 = f11829b;
        int i4 = i3 + 9;
        f11830c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f11832d;
        int i6 = i3 + 45;
        f11830c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r2
  0x0024: PHI (r2v3 java.util.HashMap<java.lang.String, java.lang.Object>) = 
  (r2v1 java.util.HashMap<java.lang.String, java.lang.Object>)
  (r2v4 java.util.HashMap<java.lang.String, java.lang.Object>)
 binds: [B:9:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> toMap() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture.f11829b
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture.f11830c = r0
            int r1 = r1 % r5
            java.lang.String r4 = "idCategory"
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L34
            kotlin.Pair[] r1 = new kotlin.Pair[r2]
            java.lang.String r0 = r6.f11833e
            kotlin.Pair r0 = kotlin.TuplesKt.to(r4, r0)
            r1[r2] = r0
            java.util.HashMap r2 = kotlin.collections.MapsKt.hashMapOf(r1)
            java.lang.String r0 = r6.f11831a
            if (r0 == 0) goto L33
        L24:
            java.lang.String r1 = "idType"
            java.lang.String r0 = r6.f11831a
            r2.put(r1, r0)
            int r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture.f11830c
            int r1 = r1 + r3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture.f11829b = r0
            int r1 = r1 % r5
        L33:
            return r2
        L34:
            kotlin.Pair[] r1 = new kotlin.Pair[r3]
            java.lang.String r0 = r6.f11833e
            kotlin.Pair r0 = kotlin.TuplesKt.to(r4, r0)
            r1[r2] = r0
            java.util.HashMap r2 = kotlin.collections.MapsKt.hashMapOf(r1)
            java.lang.String r0 = r6.f11831a
            if (r0 == 0) goto L33
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture.toMap():java.util.HashMap");
    }
}
