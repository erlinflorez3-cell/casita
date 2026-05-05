package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.o;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ai {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9253b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9254c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9255d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9256e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o> f9257a;

    public ai(List<o> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f9257a = list;
    }

    public final List<o> c() {
        int i2 = 2 % 2;
        int i3 = f9253b + 73;
        int i4 = i3 % 128;
        f9255d = i4;
        int i5 = i3 % 2;
        List<o> list = this.f9257a;
        int i6 = i4 + 99;
        f9253b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return list;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9258a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9259e = 1;

        private c() {
        }

        /* synthetic */ class e extends FunctionReferenceImpl implements Function1<JSONObject, o> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f9260c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f9261e = 0;

            private o c(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = f9260c + 59;
                f9261e = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(jSONObject, "");
                    o.e.c(jSONObject);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(jSONObject, "");
                o oVarC = o.e.c(jSONObject);
                int i4 = f9261e + 27;
                f9260c = i4 % 128;
                int i5 = i4 % 2;
                return oVarC;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ o invoke(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = f9260c + 69;
                f9261e = i3 % 128;
                int i4 = i3 % 2;
                o oVarC = c(jSONObject);
                if (i4 != 0) {
                    int i5 = 91 / 0;
                }
                return oVarC;
            }

            e(Object obj) {
                super(1, obj, o.e.class, "fromJson", "fromJson(Lorg/json/JSONObject;)Lcom/incode/welcome_sdk/data/remote/beans/EKYCResultCheck;", 0);
            }
        }

        @JvmStatic
        public static ai d(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            ai aiVar = new ai(com.incode.welcome_sdk.commons.extensions.i.d(com.incode.welcome_sdk.commons.extensions.i.b(new JSONObject(responseBody.string()), "kyc"), new e(o.f9738e)));
            int i3 = f9259e + 69;
            f9258a = i3 % 128;
            if (i3 % 2 == 0) {
                return aiVar;
            }
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
        int i2 = f9256e + 83;
        f9254c = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final ai b(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f9253b + 49;
        f9255d = i3 % 128;
        int i4 = i3 % 2;
        ai aiVarD = c.d(responseBody);
        int i5 = f9253b + 113;
        f9255d = i5 % 128;
        if (i5 % 2 == 0) {
            return aiVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
