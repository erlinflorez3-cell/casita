package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.Address;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.k;
import o.ep.d;
import o.ey.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class GooglePayService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f19107a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19108b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19109c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19110d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19111e = 0;
    private final e innerGooglePayService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r9, byte r10, byte r11) {
        /*
            int r0 = r11 * 3
            int r8 = 4 - r0
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.sdk.digitalcard.GooglePayService.$$c
            int r0 = r10 * 7
            int r5 = 114 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r7
            r2 = r3
        L15:
            int r0 = -r0
            int r8 = r8 + 1
            int r5 = r5 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r8]
            goto L15
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.GooglePayService.$$g(int, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19109c = -1153329315;
        f19107a = -1173735284;
        init$0();
        f19110d = 0;
        f19108b = 1;
        f19111e = 5473178916392971737L;
    }

    GooglePayService(d dVar) throws WalletValidationException {
        this.innerGooglePayService = new e(dVar, (o.eq.e) dVar.G());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r10, int r11, short r12, java.lang.Object[] r13) {
        /*
            byte[] r9 = fr.antelop.sdk.digitalcard.GooglePayService.$$a
            int r0 = r12 * 2
            int r8 = r0 + 1
            int r0 = r11 * 3
            int r7 = r0 + 98
            int r0 = r10 * 3
            int r6 = 3 - r0
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r9 != 0) goto L2f
            r3 = r6
            r0 = r8
            r2 = r4
        L16:
            int r6 = r6 + r0
            r1 = r2
            r7 = r6
            r6 = r3
        L1a:
            byte r0 = (byte) r7
            int r3 = r6 + 1
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r8) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r13[r4] = r0
            return
        L2b:
            r0 = r9[r3]
            r6 = r7
            goto L16
        L2f:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.GooglePayService.f(int, int, short, java.lang.Object[]):void");
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 37;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f19111e ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19111e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 229, (char) (KeyEvent.normalizeMetaState(0) + 51004), 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1749983833, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - TextUtils.lastIndexOf("", '0', 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "") + 12, 522683165, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r10, int r11, short r12, java.lang.Object[] r13) {
        /*
            int r9 = 102 - r11
            byte[] r8 = fr.antelop.sdk.digitalcard.GooglePayService.$$d
            int r7 = r10 + 1
            int r0 = 93 - r12
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L26
            r1 = r0
            r4 = r5
        Lf:
            int r9 = r9 + r0
            r0 = r1
            r3 = r4
        L12:
            int r4 = r3 + 1
            byte r2 = (byte) r9
            int r1 = r0 + 1
            r6[r3] = r2
            if (r4 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r13[r5] = r0
            return
        L23:
            r0 = r8[r1]
            goto Lf
        L26:
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.GooglePayService.h(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{60, 66, -100, 104};
        $$b = 252;
    }

    static void init$1() {
        $$d = new byte[]{93, 121, -117, 60, Ascii.FF, -68, 51, Ascii.CR, 6, -15, 7, 3, 1, -66, 69, -15, 7, MessagePack.Code.TRUE, 54, 5, -2, 2, Ascii.VT, -19, Ascii.VT, -9, -2, 17, -14, MessagePack.Code.FLOAT32, 34, 37, -2, -11, -20, Ascii.ESC, -27, Ascii.ESC, -4, -6, 9, -28, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -5, 3, -31, Ascii.DC2, Ascii.CR, 4, -13, -6, 2, Ascii.FF, -68, 51, Ascii.CR, 6, -15, 7, 3, 1, -66, 69, -15, 7, MessagePack.Code.TRUE, 69, -14, Ascii.SI, 0, -11, 5, -7, Ascii.FF, -69, 41, 10, Ascii.VT, 0, -7, Ascii.SI, MessagePack.Code.MAP32, Ascii.DC2, Ascii.SI, 0, -11, 5, -7, Ascii.FF};
        $$e = 20;
    }

    static void init$2() {
        $$c = new byte[]{6, 32, -91, MessagePack.Code.BIN16};
        $$f = 52;
    }

    public final void canPushCard(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19110d + 63;
        f19108b = i3 % 128;
        int i4 = i3 % 2;
        this.innerGooglePayService.d(context, operationCallback);
        int i5 = f19110d + 61;
        f19108b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void canPushCardOffline(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19110d + 39;
        f19108b = i3 % 128;
        int i4 = i3 % 2;
        this.innerGooglePayService.e(context, operationCallback);
        int i5 = f19110d + 57;
        f19108b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Deprecated
    public final AndroidActivityResultCallback configureWallet(Activity activity, OperationCallback<Void> operationCallback) {
        int i2 = 2 % 2;
        int i3 = f19110d + 19;
        f19108b = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerGooglePayService.c(activity, operationCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AndroidActivityResultCallback androidActivityResultCallbackC = this.innerGooglePayService.c(activity, operationCallback);
        int i4 = f19108b + 23;
        f19110d = i4 % 128;
        int i5 = i4 % 2;
        return androidActivityResultCallbackC;
    }

    public final void configureWallet(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f19110d + 19;
        f19108b = i3 % 128;
        int i4 = i3 % 2;
        this.innerGooglePayService.a(activity);
        int i5 = f19110d + 85;
        f19108b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final AndroidActivityResultCallback deleteCard(Activity activity, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 111;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        e eVar = this.innerGooglePayService;
        if (i4 == 0) {
            return eVar.b(activity, operationCallback);
        }
        eVar.b(activity, operationCallback);
        throw null;
    }

    public final SecureCardPushToGooglePay getSecureCardPush() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 3;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        SecureCardPushToGooglePay secureCardPushToGooglePayG = this.innerGooglePayService.g();
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        return secureCardPushToGooglePayG;
    }

    public final void getStatus(Context context, OperationCallback<DigitalCardServiceStatus> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 121;
        f19110d = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerGooglePayService.c(context, operationCallback);
        } else {
            this.innerGooglePayService.c(context, operationCallback);
            int i4 = 14 / 0;
        }
    }

    public final void getTspTokenId(Context context, OperationCallback<String> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 57;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        this.innerGooglePayService.h(context, operationCallback);
        int i5 = f19108b + 31;
        f19110d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void isCardInGooglePay(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19110d + 59;
        f19108b = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerGooglePayService.a(context, operationCallback);
        } else {
            this.innerGooglePayService.a(context, operationCallback);
            throw null;
        }
    }

    public final void isCardInGooglePayOffline(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19110d + 45;
        f19108b = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerGooglePayService, context, operationCallback};
            int i4 = o.er.d.f24831b * 1411408100;
            o.er.d.f24831b = i4;
            o.er.d.a(-1035223737, i4, Process.myTid(), objArr, 1035223737, new Random().nextInt(837508811), Process.myTid());
            return;
        }
        Object[] objArr2 = {this.innerGooglePayService, context, operationCallback};
        int i5 = o.er.d.f24831b * 1411408100;
        o.er.d.f24831b = i5;
        o.er.d.a(-1035223737, i5, Process.myTid(), objArr2, 1035223737, new Random().nextInt(837508811), Process.myTid());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void isDefaultPaymentCard(Activity activity, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 25;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        this.innerGooglePayService.a(activity, operationCallback);
        int i5 = f19110d + 25;
        f19108b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x04c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.util.AndroidActivityResultCallback pushCard(android.app.Activity r28, fr.antelop.sdk.util.OperationCallback<java.lang.Void> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.GooglePayService.pushCard(android.app.Activity, fr.antelop.sdk.util.OperationCallback):fr.antelop.sdk.util.AndroidActivityResultCallback");
    }

    public final AndroidActivityResultCallback pushCard(Activity activity, OperationCallback<Void> operationCallback, Address address) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        AndroidActivityResultCallback androidActivityResultCallbackC = this.innerGooglePayService.c(activity, operationCallback, address);
        int i5 = f19110d + 41;
        f19108b = i5 % 128;
        int i6 = i5 % 2;
        return androidActivityResultCallbackC;
    }

    public final AndroidActivityResultCallback setAsDefaultCard(Activity activity, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 95;
        f19110d = i3 % 128;
        int i4 = i3 % 2;
        AndroidActivityResultCallback androidActivityResultCallbackE = this.innerGooglePayService.e(activity, operationCallback);
        int i5 = f19108b + 47;
        f19110d = i5 % 128;
        if (i5 % 2 == 0) {
            return androidActivityResultCallbackE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void showCard(Activity activity) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19108b + 123;
        f19110d = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerGooglePayService, activity};
            int i4 = e.f25619m * (-1956041236);
            e.f25619m = i4;
            int priority = Thread.currentThread().getPriority();
            int i5 = e.f25620n * 1875359101;
            e.f25620n = i5;
            int i6 = e.f25621o * (-938990395);
            e.f25621o = i6;
            e.e(priority, 62877414, i5, i4, i6, objArr, -62877411);
            return;
        }
        Object[] objArr2 = {this.innerGooglePayService, activity};
        int i7 = e.f25619m * (-1956041236);
        e.f25619m = i7;
        int priority2 = Thread.currentThread().getPriority();
        int i8 = e.f25620n * 1875359101;
        e.f25620n = i8;
        int i9 = e.f25621o * (-938990395);
        e.f25621o = i9;
        e.e(priority2, 62877414, i8, i7, i9, objArr2, -62877411);
        throw null;
    }
}
