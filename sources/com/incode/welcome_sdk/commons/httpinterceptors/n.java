package com.incode.welcome_sdk.commons.httpinterceptors;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.NetworkUtils;
import com.incode.welcome_sdk.listeners.SSLPinningFailedListener;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public final class n implements Interceptor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f5253c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5254d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5255e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 1
            int r0 = r7 * 2
            int r7 = r0 + 117
            int r0 = r6 * 2
            int r1 = 3 - r0
            byte[] r6 = com.incode.welcome_sdk.commons.httpinterceptors.n.$$a
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L2b
            r3 = r4
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r7
            r7 = r1
            r1 = r0
        L19:
            byte r2 = (byte) r7
            int r0 = r1 + 1
            r5[r3] = r2
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r1 = r6[r0]
            goto L15
        L2b:
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.n.$$c(int, short, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{4, Ascii.VT, 101, -73};
        $$b = 73;
    }

    @Inject
    public n() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5255e + 43;
        f5254d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(chain, "");
            IncodeWelcome.Companion.getInstance().getSslPinningFailedListener();
            NetworkUtils.hasToTriggerCallbackAndProceedWithError();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(chain, "");
        SSLPinningFailedListener sslPinningFailedListener = IncodeWelcome.Companion.getInstance().getSslPinningFailedListener();
        if (NetworkUtils.hasToTriggerCallbackAndProceedWithError()) {
            if (sslPinningFailedListener != null) {
                sslPinningFailedListener.onSSLPinningFailed();
            }
            NetworkUtils.isSSLPinningFailedCallbackTriggered = true;
            Response.Builder builderBody = new Response.Builder().code(495).protocol(Protocol.HTTP_2).body(ResponseBody.Companion.create$default(ResponseBody.Companion, "{}", (MediaType) null, 1, (Object) null));
            Object[] objArr = new Object[1];
            a("맑릂ꡎ\u0c74汧⓹헰㣫⠶㨜\ufefd꭛髰쮣䢊씐൜啕\ud922矷＄\ue6ffꯩ\ue654憗", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            return builderBody.message(((String) objArr[0]).intern()).request(chain.request()).build();
        }
        if (NetworkUtils.hasToTriggerCallback()) {
            if (sslPinningFailedListener != null) {
                sslPinningFailedListener.onSSLPinningFailed();
            }
            NetworkUtils.isSSLPinningFailedCallbackTriggered = true;
        }
        Response responseProceed = chain.proceed(chain.request());
        int i4 = f5254d + 43;
        f5255e = i4 % 128;
        int i5 = i4 % 2;
        return responseProceed;
    }

    private static void a(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 23;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        com.c.a.k kVar = new com.c.a.k();
        char[] cArrE = com.c.a.k.e(f5253c ^ (-3501477462694648052L), (char[]) charArray, i2);
        kVar.f2772b = 4;
        int i5 = $11 + 1;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (kVar.f2772b < cArrE.length) {
            int i7 = $11 + 51;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            kVar.f2773d = kVar.f2772b - 4;
            int i9 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f5253c)};
                Object objC = com.c.a.e.e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objC = com.c.a.e.e.e((char) (92 - (Process.myPid() >> 22)), Color.blue(0) + 20, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1107, 1223194345, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = com.c.a.e.e.c(-727400358);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) Color.blue(0), 20 - Color.alpha(0), 1283 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -734084573, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrE, 4, cArrE.length - 4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f5255e = 0;
        f5254d = 1;
        f5253c = 5824536493683770213L;
    }
}
