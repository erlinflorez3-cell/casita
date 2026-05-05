package com.incode.welcome_sdk.data.remote.beans;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9737b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f9738e = new e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9739f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9740g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9741j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9742a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f9743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9744d;

    public o(String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f9742a = str;
        this.f9744d = str2;
        this.f9743c = list;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9745a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9746c = 1;

        private e() {
        }

        static final class c extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9747a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f9748b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ List<String> f9749c;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f9748b + 45;
                f9747a = i3 % 128;
                int i4 = i3 % 2;
                a(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f9747a + 9;
                f9748b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            private void a(String str) {
                int i2 = 2 % 2;
                int i3 = f9748b + 21;
                f9747a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                this.f9749c.add(str);
                int i5 = f9747a + 35;
                f9748b = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List<String> list) {
                super(1);
                this.f9749c = list;
            }
        }

        @JvmStatic
        public static o c(JSONObject jSONObject) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String strOptString = jSONObject.optString("key");
            String strOptString2 = jSONObject.optString("status");
            JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "reasonCodes");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayB.length();
            int i3 = 0;
            while (i3 < length) {
                com.incode.welcome_sdk.commons.extensions.o.a(jSONArrayB.optString(i3), new c(arrayList));
                i3++;
                int i4 = f9746c + 13;
                f9745a = i4 % 128;
                int i5 = i4 % 2;
            }
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            o oVar = new o(strOptString, strOptString2, arrayList);
            int i6 = f9745a + 29;
            f9746c = i6 % 128;
            int i7 = i6 % 2;
            return oVar;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9739f + 69;
        f9740g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9737b + 23;
            f9741j = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (Intrinsics.areEqual(this.f9742a, oVar.f9742a)) {
            return Intrinsics.areEqual(this.f9744d, oVar.f9744d) && Intrinsics.areEqual(this.f9743c, oVar.f9743c);
        }
        int i5 = f9737b + 97;
        f9741j = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9737b + 33;
        f9741j = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.f9742a.hashCode() * 31) + this.f9744d.hashCode()) * 31) + this.f9743c.hashCode();
        int i5 = f9737b + 103;
        f9741j = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9741j + 23;
        f9737b = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "EKYCResultCheck(key=" + this.f9742a + ", status=" + this.f9744d + ", reasonCodes=" + this.f9743c + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "EKYCResultCheck(key=" + this.f9742a + ", status=" + this.f9744d + ", reasonCodes=" + this.f9743c + ")";
        int i4 = f9737b + 113;
        f9741j = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }
}
