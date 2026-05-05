package com.incode.welcome_sdk.commons.httpinterceptors;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public final class g implements Interceptor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f5210f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int[] f5211g = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f5212j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f5213k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f5214m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f5215n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f5216o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cipher f5218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeWelcome f5220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SecretKey f5221e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SessionConfig.E2eEncryptionAlgorithm f5222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5223i;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, byte r10) {
        /*
            byte[] r7 = com.incode.welcome_sdk.commons.httpinterceptors.g.$$a
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r0 = r9 * 3
            int r6 = 4 - r0
            int r0 = r10 + 98
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r7 != 0) goto L28
            r1 = r6
        L15:
            int r6 = r6 + r0
            int r1 = r1 + 1
        L18:
            int r2 = r2 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r7[r1]
            goto L15
        L28:
            r1 = r6
            r6 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.g.$$c(byte, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~((~i5) | i2);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i2));
        int i11 = ~i2;
        int i12 = ~(i11 | i9);
        int i13 = ~(i11 | i5);
        int i14 = (~(i9 | i5)) | i12 | i13;
        int i15 = (~(i6 | i11)) | i13;
        int i16 = i5 + i2 + i3 + (1039959776 * i4) + ((-2046201414) * i7);
        int i17 = i16 * i16;
        int i18 = ((357140864 * i5) - 8388608) + ((-1785926397) * i2) + ((-2146011519) * i10) + (i14 * 2146011519) + (2146011519 * i15) + ((-1788870656) * i3) + ((-201326592) * i4) + ((-406847488) * i7) + (529399808 * i17);
        int i19 = ((i5 * 868240256) - 1765242424) + (i2 * 868238279) + (i10 * (-659)) + (i14 * 659) + (i15 * 659) + (i3 * 868239597) + (i4 * 817356128) + (i7 * 406493490) + (i17 * 645267456);
        return i18 + ((i19 * i19) * 681705472) != 1 ? b(objArr) : e(objArr);
    }

    static void init$0() {
        $$a = new byte[]{67, 87, 59, -10};
        $$b = 115;
    }

    @Inject
    public g() throws Throwable {
        Object[] objArr = new Object[1];
        l("\u000e\u0005\u000f\r\u0004\t\u0018\u0012\r\u0007\u001d\u0011㙘㙘\u0014\"㙗", (byte) (TextUtils.getOffsetBefore("", 0) + 90), KeyEvent.keyCodeFromString("") + 17, objArr);
        this.f5218b = Cipher.getInstance(((String) objArr[0]).intern());
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5224b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5225e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5226a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PublicKey f5227c;

        public e(PublicKey publicKey, String str) {
            Intrinsics.checkNotNullParameter(publicKey, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.f5227c = publicKey;
            this.f5226a = str;
        }

        public final PublicKey b() {
            int i2 = 2 % 2;
            int i3 = f5224b + 57;
            int i4 = i3 % 128;
            f5225e = i4;
            int i5 = i3 % 2;
            PublicKey publicKey = this.f5227c;
            int i6 = i4 + 23;
            f5224b = i6 % 128;
            if (i6 % 2 != 0) {
                return publicKey;
            }
            throw null;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f5224b + 43;
            int i4 = i3 % 128;
            f5225e = i4;
            int i5 = i3 % 2;
            String str = this.f5226a;
            int i6 = i4 + 97;
            f5224b = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5224b;
            int i4 = i3 + 99;
            f5225e = i4 % 128;
            int i5 = i4 % 2;
            if (this == obj) {
                int i6 = i3 + 49;
                f5225e = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 62 / 0;
                }
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!Intrinsics.areEqual(this.f5227c, eVar.f5227c) || !Intrinsics.areEqual(this.f5226a, eVar.f5226a)) {
                return false;
            }
            int i8 = f5224b + 85;
            f5225e = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5225e + 3;
            f5224b = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (this.f5227c.hashCode() * 31) + this.f5226a.hashCode();
            int i5 = f5224b + 91;
            f5225e = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5224b + 5;
            f5225e = i3 % 128;
            int i4 = i3 % 2;
            String str = "ResponsePublicKeySessionId(publicKey=" + this.f5227c + ", sessionId=" + this.f5226a + ")";
            int i5 = f5225e + 21;
            f5224b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    private final SessionConfig.E2eEncryptionAlgorithm e() {
        int i2 = 2 % 2;
        int i3 = f5214m;
        int i4 = i3 + 107;
        f5215n = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SessionConfig.E2eEncryptionAlgorithm e2eEncryptionAlgorithm = this.f5222h;
        if (e2eEncryptionAlgorithm == null) {
            int i5 = i3 + 67;
            f5215n = i5 % 128;
            if (i5 % 2 != 0) {
                e2eEncryptionAlgorithm = a().getInternalConfig().getE2eEncryptionAlgorithm();
                this.f5222h = e2eEncryptionAlgorithm;
                int i6 = 10 / 0;
            } else {
                e2eEncryptionAlgorithm = a().getInternalConfig().getE2eEncryptionAlgorithm();
                this.f5222h = e2eEncryptionAlgorithm;
            }
            int i7 = f5215n + 35;
            f5214m = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 3;
            }
        }
        return e2eEncryptionAlgorithm;
    }

    private final IncodeWelcome a() {
        int i2 = 2 % 2;
        int i3 = f5215n + 27;
        f5214m = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
        int i5 = f5214m + 11;
        f5215n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return companion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r14.isSuccessful() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r6 = r14.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r6 = r6.string();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        r7 = com.incode.welcome_sdk.data.e.d.f7660e;
        r7 = com.incode.welcome_sdk.data.e.d.b.b(r6);
        r11 = new com.incode.welcome_sdk.commons.httpinterceptors.g.e(r7.c(), r7.a());
        r23.f5221e = r13;
        r23.f5217a = r11.e();
        r9 = r23.f5221e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r9 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r7 = com.incode.welcome_sdk.commons.httpinterceptors.f.e(r9, r12, r11.b());
        r9 = new java.lang.Object[1];
        p(new int[]{1420123005, -319656953, -186115099, -552706718, -682870846, 727407361}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, r9);
        r12 = r3.header(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        r11 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n + 61;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        if ((r11 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (r12.length() != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        r2 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n + 47;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if ((r2 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        r0 = 5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        r0 = r23.f5217a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        r2 = b(r24, r8, r7, r0);
        r23.f5223i = r2.isSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        r5 = new java.lang.Object[1];
        p(new int[]{627785483, -557607985, 731856543, -22780510, 2083600383, 1906496520}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, r5);
        r3 = r3.header(((java.lang.String) r5[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        if (r3.length() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        r5 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m + 55;
        r3 = r5 % 128;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n = r3;
        r5 = r5 % 2;
        r5 = r3 + 55;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        if ((r5 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0124, code lost:
    
        r23.f5219c = com.incode.welcome_sdk.commons.extensions.a.c(r7.d());
        r23.f5223i = r14.isSuccessful();
        r5 = r14.newBuilder();
        r9 = okhttp3.ResponseBody.Companion;
        r10 = okhttp3.MediaType.Companion;
        r2 = new java.lang.Object[1];
        l("\t\u001d\u001c\u000f\u0013\u0010\u0006\u001d\u0013\u0004\u001e\u000e\u001a\u001b\u0002\u001f", (byte) ('G' - android.text.AndroidCharacter.getMirror('0')), 17 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016e, code lost:
    
        return r5.body(r9.create(r6, r10.parse(((java.lang.String) r2[0]).intern()))).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        if (c(r3) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017e, code lost:
    
        r12.length();
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0185, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018b, code lost:
    
        throw new com.incode.welcome_sdk.commons.httpinterceptors.E2EEHandshakeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018f, code lost:
    
        if ((!r23.f5223i) == true) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0195, code lost:
    
        if (a(r3) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
    
        r9 = r3.newBuilder();
        r6 = new java.lang.Object[1];
        p(new int[]{-1537305137, -2114274, -1390446355, 772469922, -1619798953, -1358832952}, 9 - android.text.TextUtils.indexOf("", "", 0, 0), r6);
        r7 = ((java.lang.String) r6[0]).intern();
        r6 = r23.f5217a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b5, code lost:
    
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b7, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bb, code lost:
    
        r6 = r9.header(r7, r6);
        r10 = r3.method();
        r7 = new java.lang.Object[1];
        p(new int[]{1147760620, -811409741}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, ((java.lang.String) r7[0]).intern()) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e8, code lost:
    
        r9 = r3.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ec, code lost:
    
        if (r9 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (c(r3) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ee, code lost:
    
        r8 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m + 125;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ff, code lost:
    
        if (r9.contentLength() != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0201, code lost:
    
        r8 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n + 17;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0210, code lost:
    
        if (e() != com.incode.welcome_sdk.SessionConfig.E2eEncryptionAlgorithm.SHA256) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0212, code lost:
    
        r8 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n + 13;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021b, code lost:
    
        if ((r8 % 2) == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021d, code lost:
    
        a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0220, code lost:
    
        r8 = a(r3.url());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024c, code lost:
    
        if (((java.lang.Boolean) d(-139063721, new java.lang.Object[]{r3}, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 139063722, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a())).booleanValue() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        r8 = r3.newBuilder().url(a(r3.url()).build());
        r13 = com.incode.welcome_sdk.commons.httpinterceptors.f.e();
        r12 = com.incode.welcome_sdk.commons.httpinterceptors.f.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024e, code lost:
    
        r9 = new java.lang.Object[1];
        l("\u001e ", (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 82), android.graphics.Color.rgb(0, 0, 0) + 16777218, r9);
        r8.addPathSegment(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0273, code lost:
    
        r7 = r24.proceed(r6.url(r8.build()).build());
        r9 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) r3.url().pathSegments());
        r2 = new java.lang.Object[1];
        p(new int[]{-790224739, 431017591, -228174843, 2095944121}, android.graphics.ImageFormat.getBitsPerPixel(0) + 6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9, ((java.lang.String) r2[0]).intern()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b7, code lost:
    
        r23.f5223i = r7.isSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c1, code lost:
    
        return c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c2, code lost:
    
        r8 = com.incode.welcome_sdk.commons.httpinterceptors.g.f5214m + 69;
        com.incode.welcome_sdk.commons.httpinterceptors.g.f5215n = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02cb, code lost:
    
        if ((r8 % 2) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02cd, code lost:
    
        r6.method(r3.method(), (okhttp3.RequestBody) d(-1951741022, new java.lang.Object[]{r23, r3}, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 1951741022, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a()));
        r7 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f9, code lost:
    
        r6.method(r3.method(), (okhttp3.RequestBody) d(-1951741022, new java.lang.Object[]{r23, r3}, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 1951741022, com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (e() != com.incode.welcome_sdk.SessionConfig.E2eEncryptionAlgorithm.SHA256) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0322, code lost:
    
        a(r6);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0329, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x032e, code lost:
    
        return r24.proceed(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        r8 = r8.build();
        r14 = r24.proceed(r8);
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.g.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private static void p(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        com.c.a.e eVar = new com.c.a.e();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f5211g;
        int i5 = 1605946101;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objC = com.c.a.e.e.c(i5);
                    if (objC == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) (TextUtils.lastIndexOf("", '0') + 1), 18 - TextUtils.lastIndexOf("", '0', i6, i6), Color.red(i6) + IptcDirectory.TAG_ACTION_ADVISED, 1596115084, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = 1605946101;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f5211g;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i8 = 0; i8 < length3; i8++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objC2 = com.c.a.e.e.c(1605946101);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, Color.green(0) + IptcDirectory.TAG_ACTION_ADVISED, 1596115084, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        eVar.f2735a = 0;
        while (eVar.f2735a < iArr.length) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[eVar.f2735a] >> 16);
            cArr[1] = (char) iArr[eVar.f2735a];
            cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
            cArr[3] = (char) iArr[eVar.f2735a + 1];
            eVar.f2736c = (cArr[0] << 16) + cArr[1];
            eVar.f2737d = (cArr[2] << 16) + cArr[3];
            com.c.a.e.b(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $10 + 25;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                eVar.f2736c ^= iArr4[i11];
                Object[] objArr4 = {eVar, Integer.valueOf(com.c.a.e.c(eVar.f2736c)), eVar, eVar};
                Object objC3 = com.c.a.e.e.c(-190252621);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) (ViewConfiguration.getScrollBarSize() >> 8), 19 - View.getDefaultSize(0, 0), 167 - (ViewConfiguration.getWindowTouchSlop() >> 8), -197985334, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                eVar.f2736c = eVar.f2737d;
                eVar.f2737d = iIntValue;
                i11++;
            }
            int i15 = eVar.f2736c;
            eVar.f2736c = eVar.f2737d;
            eVar.f2737d = i15;
            eVar.f2737d ^= iArr4[16];
            eVar.f2736c ^= iArr4[17];
            int i16 = eVar.f2736c;
            int i17 = eVar.f2737d;
            cArr[0] = (char) (eVar.f2736c >>> 16);
            cArr[1] = (char) eVar.f2736c;
            cArr[2] = (char) (eVar.f2737d >>> 16);
            cArr[3] = (char) eVar.f2737d;
            com.c.a.e.b(iArr4);
            cArr2[eVar.f2735a * 2] = cArr[0];
            cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
            cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
            cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
            Object[] objArr5 = {eVar, eVar};
            Object objC4 = com.c.a.e.e.c(-1176571471);
            if (objC4 == null) {
                objC4 = com.c.a.e.e.e((char) (42780 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 16 - (ViewConfiguration.getEdgeSlop() >> 16), 134 - TextUtils.indexOf("", ""), -1186663480, false, "a", new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: all -> 0x02a7, TryCatch #0 {all -> 0x02a7, blocks: (B:6:0x0022, B:12:0x005a, B:17:0x006a, B:22:0x0076, B:23:0x007a, B:29:0x00c1, B:30:0x00c5, B:32:0x00ea, B:33:0x0100, B:35:0x0131, B:36:0x0135, B:40:0x014c, B:41:0x016b, B:28:0x00ab, B:15:0x0061, B:42:0x0170), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131 A[Catch: all -> 0x02a7, TryCatch #0 {all -> 0x02a7, blocks: (B:6:0x0022, B:12:0x005a, B:17:0x006a, B:22:0x0076, B:23:0x007a, B:29:0x00c1, B:30:0x00c5, B:32:0x00ea, B:33:0x0100, B:35:0x0131, B:36:0x0135, B:40:0x014c, B:41:0x016b, B:28:0x00ab, B:15:0x0061, B:42:0x0170), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.g.b(java.lang.Object[]):java.lang.Object");
    }

    private static Request.Builder a(Request.Builder builder) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f5214m + 31;
        f5215n = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            l("\u0004#\u0010\u000f\u0010#\b\u0002\f\u0007\t\u001a\u001c\u0012\u0002\u001f \u0010\f\u0001\u0016\u001a㘞", (byte) (66 % (KeyEvent.getMaxKeyCode() % 17)), 80 % (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p(new int[]{-1302009046, -1065886654, -1030450018, 1694675829, 906103257, -1677887016, 965905744, 357683909, -966308884, -1902275324, -17414463, -1654534214, -1417283511, 273343833, -653961072, -891065410, -1361138547, 1262126013, 2041930153, 52803969}, 103 % Gravity.getAbsoluteGravity(0, 0), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            l("\u0004#\u0010\u000f\u0010#\b\u0002\f\u0007\t\u001a\u001c\u0012\u0002\u001f \u0010\f\u0001\u0016\u001a㘞", (byte) (31 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            p(new int[]{-1302009046, -1065886654, -1030450018, 1694675829, 906103257, -1677887016, 965905744, 357683909, -966308884, -1902275324, -17414463, -1654534214, -1417283511, 273343833, -653961072, -891065410, -1361138547, 1262126013, 2041930153, 52803969}, Gravity.getAbsoluteGravity(0, 0) + 38, objArr4);
            obj = objArr4[0];
        }
        return builder.addHeader(strIntern, ((String) obj).intern());
    }

    private final Response c(Response response) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5215n + 107;
        f5214m = i3 % 128;
        int i4 = i3 % 2;
        String strString = response.peekBody(Long.MAX_VALUE).string();
        Response.Builder builderNewBuilder = response.newBuilder();
        if (!StringsKt.isBlank(strString)) {
            int i5 = f5215n + 45;
            f5214m = i5 % 128;
            int i6 = i5 % 2;
            if (response.code() == 200) {
                JSONObject jSONObject = new JSONObject(strString);
                Object[] objArr = new Object[1];
                p(new int[]{-1124853940, 1200322604}, 2 - ExpandableListView.getPackedPositionGroup(0L), objArr);
                String strOptString = jSONObject.optString(((String) objArr[0]).intern());
                if (strOptString == null) {
                    strOptString = "";
                }
                byte[] bArrD = com.incode.welcome_sdk.commons.extensions.o.d(strOptString);
                Cipher cipher = this.f5218b;
                SecretKey secretKey = this.f5221e;
                if (secretKey == null) {
                    int i7 = f5214m + 27;
                    f5215n = i7 % 128;
                    secretKey = null;
                    if (i7 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = f5214m + 51;
                    f5215n = i8 % 128;
                    int i9 = i8 % 2;
                }
                cipher.init(2, secretKey, new GCMParameterSpec(128, bArrD));
                Object[] objArr2 = new Object[1];
                p(new int[]{2009275041, 871492276, -843059883, -2063636037, 1446031048, 594655764, -748185873, -1046351002}, AndroidCharacter.getMirror('0') - '#', objArr2);
                String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
                Cipher cipher2 = this.f5218b;
                Intrinsics.checkNotNull(strOptString2);
                byte[] bArrDoFinal = cipher2.doFinal(com.incode.welcome_sdk.commons.extensions.o.d(strOptString2));
                Intrinsics.checkNotNull(bArrDoFinal);
                Charset charsetDefaultCharset = Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
                String str = new String(bArrDoFinal, charsetDefaultCharset);
                ResponseBody.Companion companion = ResponseBody.Companion;
                MediaType.Companion companion2 = MediaType.Companion;
                Object[] objArr3 = new Object[1];
                l("\t\u001d\u001c\u000f\u0013\u0010\u0006\u001d\u0013\u0004\u001e\u000e\u001a\u001b\u0002\u001f", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23), 16 - TextUtils.getOffsetBefore("", 0), objArr3);
                return builderNewBuilder.body(companion.create(str, companion2.parse(((String) objArr3[0]).intern()))).build();
            }
        }
        return builderNewBuilder.build();
    }

    private static Response b(Interceptor.Chain chain, Request request, j jVar, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5215n + 23;
        f5214m = i3 % 128;
        int i4 = i3 % 2;
        HttpUrl httpUrlBuild = request.url().newBuilder().removePathSegment(request.url().pathSegments().size() - 1).build();
        Request.Builder builderNewBuilder = request.newBuilder();
        Object[] objArr = new Object[1];
        p(new int[]{627785483, -557607985, 731856543, -22780510, 2083600383, 1906496520}, ExpandableListView.getPackedPositionChild(0L) + 13, objArr);
        Request.Builder builderRemoveHeader = builderNewBuilder.removeHeader(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        p(new int[]{-1537305137, -2114274, -1390446355, 772469922, -1619798953, -1358832952}, TextUtils.indexOf((CharSequence) "", '0') + 10, objArr2);
        Response responseProceed = chain.proceed(builderRemoveHeader.header(((String) objArr2[0]).intern(), str).url(httpUrlBuild).post(com.incode.welcome_sdk.commons.extensions.i.c(f.a(jVar))).build());
        int i5 = f5214m + 101;
        f5215n = i5 % 128;
        if (i5 % 2 == 0) {
            return responseProceed;
        }
        throw null;
    }

    private static void l(String str, byte b2, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i5 = $10 + 15;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        com.c.a.f fVar = new com.c.a.f();
        char[] cArr2 = f5212j;
        long j2 = 0;
        int i7 = 1768797182;
        int i8 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objC = com.c.a.e.e.c(i7);
                    if (objC == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objC = com.c.a.e.e.e((char) (29971 - (ViewConfiguration.getLongPressTimeout() >> 16)), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 829 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), 1777840519, false, $$c(b3, b4, (byte) (b4 | Ascii.ETB)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i9++;
                    j2 = 0;
                    i7 = 1768797182;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f5210f)};
        Object objC2 = com.c.a.e.e.c(1768797182);
        if (objC2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objC2 = com.c.a.e.e.e((char) (29971 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), KeyEvent.getDeadChar(0, 0) + 18, (ViewConfiguration.getEdgeSlop() >> 16) + 828, 1777840519, false, $$c(b5, b6, (byte) (b6 | Ascii.ETB)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            fVar.f2749e = 0;
            while (fVar.f2749e < i3) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                fVar.f2747c = cArr[fVar.f2749e];
                fVar.f2746b = cArr[fVar.f2749e + i8];
                if (fVar.f2747c == fVar.f2746b) {
                    cArr4[fVar.f2749e] = (char) (fVar.f2747c - b2);
                    cArr4[fVar.f2749e + i8] = (char) (fVar.f2746b - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = fVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = fVar;
                    objArr4[9] = fVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = fVar;
                    objArr4[6] = fVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = fVar;
                    objArr4[3] = fVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = fVar;
                    objArr4[0] = fVar;
                    Object objC3 = com.c.a.e.e.c(1369381351);
                    if (objC3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objC3 = com.c.a.e.e.e((char) (49572 - View.getDefaultSize(0, 0)), 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1221 - TextUtils.indexOf((CharSequence) "", '0'), 1359289246, false, $$c(b7, b8, (byte) (b8 | Ascii.DC4)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objC3).invoke(null, objArr4)).intValue() == fVar.f2750f) {
                        int i12 = $11 + 111;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, Integer.valueOf(cCharValue), fVar};
                        Object objC4 = com.c.a.e.e.c(-486756316);
                        if (objC4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objC4 = com.c.a.e.e.e((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27451), 19 - TextUtils.indexOf("", ""), (ViewConfiguration.getPressedStateDuration() >> 16) + 392, -496586147, false, $$c(b9, b10, (byte) (b10 | Ascii.SYN)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                        int i14 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr2[iIntValue];
                        cArr4[fVar.f2749e + 1] = cArr2[i14];
                    } else if (fVar.f2748d == fVar.f2745a) {
                        int i15 = $11 + 11;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        fVar.f2751h = ((fVar.f2751h + cCharValue) - 1) % cCharValue;
                        fVar.f2750f = ((fVar.f2750f + cCharValue) - 1) % cCharValue;
                        int i17 = (fVar.f2748d * cCharValue) + fVar.f2751h;
                        int i18 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr2[i17];
                        cArr4[fVar.f2749e + 1] = cArr2[i18];
                        int i19 = $10 + 125;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        int i21 = (fVar.f2748d * cCharValue) + fVar.f2750f;
                        int i22 = (fVar.f2745a * cCharValue) + fVar.f2751h;
                        cArr4[fVar.f2749e] = cArr2[i21];
                        i8 = 1;
                        cArr4[fVar.f2749e + 1] = cArr2[i22];
                    }
                    i8 = 1;
                }
                fVar.f2749e += 2;
            }
        }
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static boolean c(Request request) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5214m + 19;
        f5215n = i3 % 128;
        int i4 = i3 % 2;
        List<String> listPathSegments = request.url().pathSegments();
        Object[] objArr = new Object[1];
        p(new int[]{826906110, -984247909}, 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        boolean zContains = listPathSegments.contains(((String) objArr[0]).intern());
        int i5 = f5215n + 83;
        f5214m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return zContains;
    }

    private static boolean a(Request request) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5215n + 65;
        f5214m = i3 % 128;
        int i4 = i3 % 2;
        String string = request.url().toString();
        String str = com.incode.welcome_sdk.commons.c.f4650b;
        Intrinsics.checkNotNullExpressionValue(str, "");
        Object[] objArr = new Object[1];
        l("\u0006\u001e\u0019\u001c\u001b 㗔㗔", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 32), 8 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        boolean zContains$default = StringsKt.contains$default((CharSequence) string, (CharSequence) StringsKt.removePrefix(str, (CharSequence) ((String) objArr[0]).intern()), false, 2, (Object) null);
        int i5 = f5215n + 9;
        f5214m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return zContains$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0110, code lost:
    
        if (kotlin.collections.ArraysKt.contains(r3, r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.g.e(java.lang.Object[]):java.lang.Object");
    }

    private static HttpUrl.Builder a(HttpUrl httpUrl) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f5215n + 83;
        f5214m = i3 % 128;
        int i4 = i3 % 2;
        String str = com.incode.welcome_sdk.commons.c.f4651c;
        if (StringsKt.isBlank(str)) {
            int i5 = f5214m + 15;
            f5215n = i5 % 128;
            int i6 = i5 % 2;
            str = com.incode.welcome_sdk.commons.c.f4650b;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Object[] objArr = new Object[1];
        l("\u0006\u001e\u0019\u001c\u001b 㗔㗔", (byte) (30 - TextUtils.lastIndexOf("", '0', 0)), 8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String strRemovePrefix = StringsKt.removePrefix(str, (CharSequence) ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        l("\u0012\u0000", (byte) (70 - KeyEvent.keyCodeFromString("")), 1 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        return httpUrl.newBuilder().host(StringsKt.removeSuffix(strRemovePrefix, (CharSequence) ((String) objArr2[0]).intern()));
    }

    static void c() {
        f5212j = new char[]{23094, 23089, 23067, 23065, 23098, 23046, 23084, 23056, 23079, 23061, 23069, 23103, 23153, 23101, 23053, 23052, 23090, 23071, 23059, 23083, 23099, 23057, 23095, 23054, 23082, 23092, 23085, 23086, 23091, 23097, 23150, 23148, 23088, 23140, 23155, 23080};
        f5210f = (char) 28610;
        f5211g = new int[]{1066865204, 1034739323, 1560871058, 1068835016, 126749717, 1229428150, 1028249645, -611138595, -817140955, 1811540701, 393380272, 1675356339, -1778932057, -208554408, 1434870952, 194631929, 262893863, 1094835151};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f5213k = 0;
        f5216o = 1;
        f5215n = 0;
        f5214m = 1;
        c();
        int i2 = f5213k + 27;
        f5216o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean b(Request request) {
        return ((Boolean) d(-139063721, new Object[]{request}, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 139063722, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a())).booleanValue();
    }

    private final RequestBody e(Request request) {
        return (RequestBody) d(-1951741022, new Object[]{this, request}, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 1951741022, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a());
    }
}
