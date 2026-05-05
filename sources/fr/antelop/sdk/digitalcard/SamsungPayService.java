package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.e;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.Address;
import fr.antelop.sdk.util.OperationCallback;
import java.util.Random;
import o.ep.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class SamsungPayService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19139b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19140c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19141d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19142e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19143f = 0;
    private final e innerSamsungPayService;
    private final e innerSamsungWatchPayService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r0 = r7 * 4
            int r7 = 4 - r0
            int r0 = r6 * 3
            int r6 = r0 + 69
            byte[] r5 = fr.antelop.sdk.digitalcard.SamsungPayService.$$c
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L2c
            r1 = r7
            r6 = r8
            r2 = r3
        L16:
            int r6 = r6 + r7
            int r7 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r5[r7]
            r1 = r7
            r7 = r0
            goto L16
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SamsungPayService.$$g(short, short, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f19139b = 0;
        f19143f = 1;
        f19140c = (char) 60523;
        f19141d = (char) 8144;
        f19138a = (char) 38427;
        f19142e = (char) 1836;
    }

    SamsungPayService(d dVar) throws WalletValidationException {
        this.innerSamsungPayService = new e(dVar, (o.eq.e) dVar.G(), false);
        this.innerSamsungWatchPayService = new e(dVar, (o.eq.e) dVar.G(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 1
            int r0 = r10 * 4
            int r7 = r0 + 4
            int r0 = 100 - r9
            byte[] r6 = fr.antelop.sdk.digitalcard.SamsungPayService.$$a
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L2a
            r0 = r8
            r1 = r7
            r3 = r4
        L14:
            int r7 = r7 + r0
            int r1 = r1 + 1
            r2 = r3
        L18:
            int r3 = r2 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r3 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L27:
            r0 = r6[r1]
            goto L14
        L2a:
            r2 = r4
            r1 = r7
            r7 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SamsungPayService.g(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(java.lang.String r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SamsungPayService.h(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(int r9, byte r10, int r11, java.lang.Object[] r12) {
        /*
            int r8 = r11 + 4
            int r0 = r10 * 3
            int r7 = 102 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.SamsungPayService.$$d
            int r5 = r9 * 85
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r6 != 0) goto L2d
            r2 = r8
            r1 = r3
        L13:
            int r0 = -r7
            int r2 = r2 + r0
            int r7 = r2 + (-4)
        L17:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L24:
            int r8 = r8 + 1
            int r1 = r1 + 1
            r0 = r6[r8]
            r2 = r7
            r7 = r0
            goto L13
        L2d:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SamsungPayService.i(int, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -87, -21};
        $$b = Mp4VideoDirectory.TAG_DEPTH;
    }

    static void init$1() {
        $$d = new byte[]{90, 91, 103, -77, -16, 64, MessagePack.Code.EXT32, -17, -10, Ascii.VT, -11, -7, -5, 62, -73, Ascii.VT, -11, 57, MessagePack.Code.BIN32, -9, -2, -6, -15, Ascii.SI, -15, 5, -2, -21, 10, 50, -74, -2, Ascii.CR, -17, -9, Ascii.SO, -6, -21, 7, -10, -3, 7, -16, -3, -10, -2, -1, -1, 58, MessagePack.Code.FIXEXT4, MessagePack.Code.MAP16, Ascii.CR, -17, -9, Ascii.SO, -6, -21, 7, -10, -3, 39, MessagePack.Code.INT8, -3, -10, -2, -1, -1, -11, 75, MessagePack.Code.INT64, -28, -17, Ascii.VT, -9, 3, -17, -10, Ascii.FS, MessagePack.Code.FIXEXT8, 5, 7, Ascii.RS, MessagePack.Code.INT8, -3, -10, -2, -1, -1, -11};
        $$e = 68;
    }

    static void init$2() {
        $$c = new byte[]{117, -127, -11, 113};
        $$f = 177;
    }

    public final void configureWallet(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f19143f + 15;
        f19139b = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungPayService.a(activity);
        int i5 = f19139b + 67;
        f19143f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void configureWalletOnWatch(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f19139b + 111;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungWatchPayService.a(activity);
        int i5 = f19143f + 23;
        f19139b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final SecureCardPushToSamsungPay getSecureCardPush() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19139b + 3;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        SecureCardPushToSamsungPay secureCardPushToSamsungPayF = this.innerSamsungPayService.f();
        int i5 = f19139b + 25;
        f19143f = i5 % 128;
        int i6 = i5 % 2;
        return secureCardPushToSamsungPayF;
    }

    public final SecureCardPushToSamsungPay getSecureCardPushOnWatch() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19139b + 55;
        f19143f = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSamsungWatchPayService.f();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SecureCardPushToSamsungPay secureCardPushToSamsungPayF = this.innerSamsungWatchPayService.f();
        int i4 = f19143f + 121;
        f19139b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return secureCardPushToSamsungPayF;
    }

    public final void getStatus(Context context, OperationCallback<DigitalCardServiceStatus> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 13;
        f19139b = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungPayService.c(context, operationCallback);
        int i5 = f19143f + 49;
        f19139b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void getStatusOnWatch(Context context, OperationCallback<DigitalCardServiceStatus> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19139b + 7;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungWatchPayService.c(context, operationCallback);
        int i5 = f19139b + 77;
        f19143f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void getTspTokenId(Context context, OperationCallback<String> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19139b + 5;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungPayService.h(context, operationCallback);
        int i5 = f19139b + 53;
        f19143f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void getTspTokenIdOnWatch(Context context, OperationCallback<String> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 45;
        f19139b = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSamsungWatchPayService.h(context, operationCallback);
        } else {
            this.innerSamsungWatchPayService.h(context, operationCallback);
            int i4 = 93 / 0;
        }
    }

    public final void isCardInSamsungPay(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 125;
        f19139b = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSamsungPayService.a(context, operationCallback);
            return;
        }
        this.innerSamsungPayService.a(context, operationCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void isCardInSamsungPayOffline(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19139b + 85;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerSamsungPayService, context, operationCallback};
        int i5 = o.er.d.f24831b * 1411408100;
        o.er.d.f24831b = i5;
        o.er.d.a(-1035223737, i5, Process.myTid(), objArr, 1035223737, new Random().nextInt(837508811), Process.myTid());
        int i6 = f19139b + 13;
        f19143f = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void isCardInSamsungPayOnWatch(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 43;
        f19139b = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungWatchPayService.a(context, operationCallback);
        int i5 = f19143f + 17;
        f19139b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void isCardInSamsungPayOnWatchOffline(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19139b + 27;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerSamsungWatchPayService, context, operationCallback};
        int i5 = o.er.d.f24831b * 1411408100;
        o.er.d.f24831b = i5;
        o.er.d.a(-1035223737, i5, Process.myTid(), objArr, 1035223737, new Random().nextInt(837508811), Process.myTid());
        int i6 = f19143f + 7;
        f19139b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
    }

    public final void pushCard(Activity activity, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19139b + 109;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungPayService.a(activity, operationCallback);
        int i5 = f19139b + 35;
        f19143f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void pushCard(Activity activity, OperationCallback<Void> operationCallback, Address address) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 101;
        f19139b = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSamsungPayService.c(activity, operationCallback, address);
            int i4 = 28 / 0;
        } else {
            this.innerSamsungPayService.c(activity, operationCallback, address);
        }
        int i5 = f19139b + 61;
        f19143f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void pushCardOnWatch(android.app.Activity r26, fr.antelop.sdk.util.OperationCallback<java.lang.Void> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SamsungPayService.pushCardOnWatch(android.app.Activity, fr.antelop.sdk.util.OperationCallback):void");
    }

    public final void pushCardOnWatch(Activity activity, OperationCallback<Void> operationCallback, Address address) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19143f + 65;
        f19139b = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungWatchPayService.c(activity, operationCallback, address);
        int i5 = f19139b + 41;
        f19143f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
    }

    public final void showCard(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f19139b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f19143f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSamsungPayService.c(activity);
        int i5 = f19139b + 65;
        f19143f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
