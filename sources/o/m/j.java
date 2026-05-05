package o.m;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.DeviceBiometricCustomerAuthenticationPrompt;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import javax.crypto.Cipher;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k<o.t.b> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static byte[] f26513a = null;

    /* JADX INFO: renamed from: b */
    private static int f26514b = 0;

    /* JADX INFO: renamed from: c */
    private static short[] f26515c = null;

    /* JADX INFO: renamed from: d */
    private static int f26516d = 0;

    /* JADX INFO: renamed from: e */
    private static int f26517e = 0;

    /* JADX INFO: renamed from: f */
    private static int f26518f = 0;

    /* JADX INFO: renamed from: j */
    private static int f26519j = 0;

    /* JADX INFO: renamed from: m */
    private static int f26520m = 0;

    /* JADX INFO: renamed from: o */
    private static int f26521o = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0020 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 1
            int r7 = r9 + 103
            byte[] r6 = o.m.j.$$a
            int r5 = r10 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L25
            r0 = r8
            r2 = r3
        L11:
            int r7 = r7 + r0
            r1 = r2
        L13:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L20:
            int r5 = r5 + 1
            r0 = r6[r5]
            goto L11
        L25:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.j.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26521o = 0;
        f26520m = 1;
        f26519j = 0;
        f26518f = 1;
        b();
        ViewConfiguration.getPressedStateDuration();
        ExpandableListView.getPackedPositionGroup(0L);
        Process.getElapsedCpuTime();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getFadingEdgeLength();
        int i2 = f26520m + 61;
        f26521o = i2 % 128;
        int i3 = i2 % 2;
    }

    public j() {
        super(i.f26494b, new o.t.b());
    }

    static void b() {
        f26514b = 952245263;
        f26516d = 1150422461;
        f26517e = 543673497;
        f26513a = new byte[]{118, 120, -118, 121, -126, -107, 82, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 66, -128, 117, 115, 118, -116, 115, -65, 109, 119, 122, 115, -126, 117, 115, -117, -86, 80, -113, 119, 126, -100, -84, -122, 114, -116, 118, 126, -118, 112, -113, MessagePack.Code.ARRAY32, 33, -119, -114, 115, 112, -81, 111, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 66, -128, 117, 115, 118, -116, 115, -65, -82, 49, 118, 112, -122, 102, -123, -120, MessagePack.Code.BIN8, 126, -128, 33, -119, -114, 115, 112, -81, 97, 117, -114, 121, -98, 97, -119, -114, 115, 112, -81, 111, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 66, -128, 117, 115, 118, -116, 115, -65, 98, 114, -117, 120, -119, -122, -113, 102, -66, -88, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 83, 124, -98, 112, 118, 112, -122, 102, 117, -124, 98, -128, -113, MessagePack.Code.FLOAT32, 35, -128, 112, 117, -118, -85, -82, 52, 116, 114, 112, -106, -70, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 83, 124, -98, 112, 118, 112, -122, 102, 126, 114, -117, 120, -119, -122, -113, 102, -66, -88, 126, -128, 35, -128, 112, 117, -118, -85, 88, 114, -117, 120, -98, 115, 119, 120, -117, -124, 112, 121, 114, -71, 64, -126, 115};
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 202;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01a8 A[PHI: r1
  0x01a8: PHI (r1v61 int) = (r1v6 int), (r1v64 int) binds: [B:128:0x01bd, B:124:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bf A[PHI: r1
  0x01bf: PHI (r1v7 int) = (r1v6 int), (r1v64 int) binds: [B:128:0x01bd, B:124:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.j.p(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public final Cipher a() {
        int i2 = 2 % 2;
        int i3 = f26518f + 21;
        f26519j = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (f() != b.f26400a) {
                return null;
            }
            l();
            return o.t.b.c();
        } catch (o.t.d e2) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                p((short) (ImageFormat.getBitsPerPixel(0) + 1), (-2085622146) - ExpandableListView.getPackedPositionType(0L), (-1693827280) + (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) - 48, (byte) (Process.myTid() >> 22), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                p((short) TextUtils.getCapsMode("", 0, 0), (-2085621945) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1693827246) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-50) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr2);
                o.ea.f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                int i5 = f26519j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f26518f = i5 % 128;
                int i6 = i5 % 2;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r22, o.g.a r23, o.j.e r24, o.m.a r25, boolean r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.j.d(android.content.Context, o.g.a, o.j.e, o.m.a, boolean):void");
    }

    @Override // o.m.h
    protected final o.l.c e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt) throws Throwable {
        int i2 = 2 % 2;
        if (customerAuthenticationPrompt instanceof DeviceBiometricCustomerAuthenticationPrompt) {
            DeviceBiometricCustomerAuthenticationPrompt deviceBiometricCustomerAuthenticationPrompt = (DeviceBiometricCustomerAuthenticationPrompt) customerAuthenticationPrompt;
            return new o.o.c(context, deviceBiometricCustomerAuthenticationPrompt.getTitle(), deviceBiometricCustomerAuthenticationPrompt.getSubtitle(), this);
        }
        int i3 = f26518f + 117;
        f26519j = i3 % 128;
        int i4 = i3 % 2;
        if (!(!o.ea.f.a())) {
            int i5 = f26518f + 111;
            f26519j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            p((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-2085622146) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1693827281) - ExpandableListView.getPackedPositionChild(0L), KeyEvent.getDeadChar(0, 0) - 49, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-2085622102) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.resolveSize(0, 0) - 1693827250, (-49) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.InvalidFormat;
        Object[] objArr3 = new Object[1];
        p((short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf((CharSequence) "", '0', 0) - 2085622043, (-1693827281) - (Process.myTid() >> 22), (-49) - View.getDefaultSize(0, 0), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr3);
        throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
    }
}
