package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9651b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f9652d = new d(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9653e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9654h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9655i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9656a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9657c;

    public e(boolean z2, boolean z3) {
        this.f9657c = z2;
        this.f9656a = z3;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f9653e + 31;
        f9651b = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f9657c;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        return z2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f9653e + 59;
        f9651b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9656a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9658a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9659b = 0;

        private d() {
        }

        public static e a(JSONObject jSONObject) {
            int i2 = 2 % 2;
            int i3 = f9659b + 75;
            int i4 = i3 % 128;
            f9658a = i4;
            int i5 = i3 % 2;
            if (jSONObject != null) {
                return new e(jSONObject.optBoolean("classification"), jSONObject.optBoolean("readability"));
            }
            int i6 = i4 + 49;
            f9659b = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9655i + 85;
        f9654h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f9657c != eVar.f9657c) {
            int i3 = f9651b + 63;
            f9653e = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.f9656a == eVar.f9656a) {
            return true;
        }
        int i5 = f9653e;
        int i6 = i5 + 33;
        f9651b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 13;
        f9651b = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9653e + 107;
        f9651b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Boolean.hashCode(this.f9657c) * 31) + Boolean.hashCode(this.f9656a);
        int i5 = f9651b + 71;
        f9653e = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9653e + 101;
        f9651b = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "AddResult(classification=" + this.f9657c + ", readability=" + this.f9656a + ")";
            throw null;
        }
        String str2 = "AddResult(classification=" + this.f9657c + ", readability=" + this.f9656a + ")";
        int i4 = f9653e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9651b = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }
}
