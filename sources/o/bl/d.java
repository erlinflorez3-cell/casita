package o.bl;

import android.content.Context;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
final class d extends o.ad.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21364b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21365d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21366e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21367f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21368g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static byte[] f21369h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static short[] f21370i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21371j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21372n = 0;

    private static String $$d(byte b2, byte b3, short s2) {
        byte[] bArr = $$a;
        int i2 = b3 + 4;
        int i3 = s2 * 2;
        int i4 = b2 + 103;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
            i2 = i2;
        }
        while (true) {
            i5++;
            int i6 = i2 + 1;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i6];
            i2 = i6;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21367f = 0;
        f21372n = 1;
        f21368g = 0;
        f21371j = 1;
        a();
        Process.myPid();
        ViewConfiguration.getMaximumFlingVelocity();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.getCapsMode("", 0, 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        int i2 = f21372n + 29;
        f21367f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
    }

    d(Context context, o.h.d dVar) {
        super(context, dVar);
    }

    static void a() {
        f21364b = -1202494681;
        f21365d = 1150422506;
        f21366e = 1408583395;
        f21369h = new byte[]{-128, 115, -117, 126, -128, -103, 82, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 80, 123, -128, 121, -115, 115, -95, 81, 115, -114, 117, 114, -95, 83, 124, -98, 112, 121, -106, 114, 126, -124, 121, -119, -127, 126, MessagePack.Code.MAP32, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -103, MessagePack.Code.UINT8, 60, -116, MessagePack.Code.TRUE, 126, -128, 52, 116, -120, 119, -123, MessagePack.Code.FLOAT32, Utf8.REPLACEMENT_BYTE, 114, MessagePack.Code.FALSE, 49, 120, -117, 122, -128, 120, MessagePack.Code.ARRAY32, 54, -115, 126, -127, MessagePack.Code.FLOAT64, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -126, MessagePack.Code.UINT32, 126, -128, 49, 114, 126, -124, 121, -119, -127, -98, 105, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 67, -121, 114, 126, -124, 121, -119, -127, 126, MessagePack.Code.MAP32, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -103, MessagePack.Code.UINT8, 126, -128, 52, 116, -120, 119, -123, MessagePack.Code.FLOAT32, Utf8.REPLACEMENT_BYTE, 114, MessagePack.Code.FALSE, 49, 120, -117, 122, -128, 120, MessagePack.Code.ARRAY32, 54, -115, 126, -127, MessagePack.Code.FLOAT64, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -126, MessagePack.Code.UINT32, 60, -116, MessagePack.Code.TRUE, 126, -128, 49, 114, 126, -124, 121, -119, -127, -98, 105, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 67, -121, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{53, 97, -95, 41};
        $$b = 113;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bl.d.p(short, int, int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.ad.e
    public final boolean b(o.i.d dVar) {
        int i2 = 2 % 2;
        int i3 = f21371j + 77;
        int i4 = i3 % 128;
        f21368g = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        f21371j = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // o.ad.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bl.d.d():boolean");
    }
}
