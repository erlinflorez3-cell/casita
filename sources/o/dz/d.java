package o.dz;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import o.dx.a;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements c<Drawable> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static byte[] f23470a = null;

    /* JADX INFO: renamed from: b */
    private static int f23471b = 0;

    /* JADX INFO: renamed from: c */
    private static int f23472c = 0;

    /* JADX INFO: renamed from: d */
    private static int f23473d = 0;

    /* JADX INFO: renamed from: e */
    public static final d f23474e;

    /* JADX INFO: renamed from: f */
    private static short[] f23475f = null;

    /* JADX INFO: renamed from: g */
    private static int f23476g = 0;

    /* JADX INFO: renamed from: h */
    private static int f23477h = 0;

    /* JADX INFO: renamed from: i */
    private static int f23478i = 0;

    /* JADX INFO: renamed from: j */
    private static int f23479j = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, short r10) {
        /*
            int r0 = r10 * 4
            int r7 = r0 + 1
            byte[] r6 = o.dz.d.$$a
            int r5 = r8 + 103
            int r0 = r9 * 4
            int r4 = 4 - r0
            byte[] r3 = new byte[r7]
            r2 = 0
            if (r6 != 0) goto L28
            r5 = r4
            r0 = r7
            r1 = r2
        L14:
            int r4 = r4 + 1
            int r0 = -r0
            int r5 = r5 + r0
        L18:
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r6[r4]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dz.d.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23478i = 0;
        f23476g = 1;
        f23477h = 0;
        f23479j = 1;
        b();
        f23474e = new d();
        int i2 = f23478i + 3;
        f23476g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static Drawable b(File file) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23477h + 19;
        f23479j = i3 % 128;
        BufferedInputStream bufferedInputStream = null;
        try {
            if (i3 % 2 == 0) {
                Drawable.createFromPath(file.getAbsolutePath());
                bufferedInputStream.hashCode();
                throw null;
            }
            Drawable drawableCreateFromPath = Drawable.createFromPath(file.getAbsolutePath());
            if (drawableCreateFromPath != null) {
                return drawableCreateFromPath;
            }
            if (f.a()) {
                AudioTrack.getMinVolume();
                ImageFormat.getBitsPerPixel(0);
                TextUtils.getTrimmedLength("");
                TextUtils.getCapsMode("", 0, 0);
                ExpandableListView.getPackedPositionForChild(0, 0);
                try {
                    byte[] bArr = new byte[8192];
                    Object[] objArr = new Object[1];
                    k((short) (ViewConfiguration.getJumpTapTimeout() >> 16), 1590190897 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-2098729302) + TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) - 83, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                    MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    while (true) {
                        try {
                            int i4 = bufferedInputStream2.read(bArr);
                            if (i4 <= 0) {
                                break;
                            }
                            int i5 = f23479j + 35;
                            f23477h = i5 % 128;
                            int i6 = i5 % 2;
                            messageDigest.update(bArr, 0, i4);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    String strE = o.dl.d.e(messageDigest.digest());
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused2) {
                    }
                    if (f.a()) {
                        Object[] objArr2 = new Object[1];
                        k((short) View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1590190902, (-2098729317) - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) - 55, (byte) TextUtils.getCapsMode("", 0, 0), objArr2);
                        String strIntern = ((String) objArr2[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr3 = new Object[1];
                        k((short) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1590190937, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 2098729285, (ViewConfiguration.getScrollBarSize() >> 8) - 57, (byte) View.combineMeasuredStates(0, 0), objArr3);
                        StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(file.getAbsolutePath());
                        Object[] objArr4 = new Object[1];
                        k((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1590190968 - TextUtils.lastIndexOf("", '0', 0), (-2098729353) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-80) - TextUtils.indexOf((CharSequence) "", '0'), (byte) TextUtils.getOffsetBefore("", 0), objArr4);
                        StringBuilder sbAppend2 = sbAppend.append(((String) objArr4[0]).intern()).append(file.length());
                        Object[] objArr5 = new Object[1];
                        k((short) (ViewConfiguration.getJumpTapTimeout() >> 16), 1590190979 - Color.green(0), (-2098729352) + ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) - 80, (byte) Color.argb(0, 0, 0, 0), objArr5);
                        f.d(strIntern, sbAppend2.append(((String) objArr5[0]).intern()).append(strE).toString());
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            Object[] objArr6 = new Object[1];
            k((short) TextUtils.getOffsetBefore("", 0), 25532 - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionType(0L) - 2098729307, MotionEvent.axisFromString("") - 70, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
            throw new a(((String) objArr6[0]).intern());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            k((short) (ViewConfiguration.getEdgeSlop() >> 16), Color.rgb(0, 0, 0) + 1606968222, TextUtils.indexOf((CharSequence) "", '0', 0) - 2098729299, View.MeasureSpec.getSize(0) - 52, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr7);
            throw new a(sb2.append(((String) objArr7[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    static void b() {
        f23472c = -442134183;
        f23471b = 1150422487;
        f23473d = 965352484;
        f23470a = new byte[]{121, -115, 122, -118, -125, -116, -114, -120, 97, 116, 120, -128, -116, 120, -127, 115, -84, 82, -113, 124, 112, -117, -111, 99, -113, 124, 112, -117, 113, -125, -98, 96, 124, -120, -113, -123, -98, 96, 116, -121, -116, 103, -101, 98, -93, 107, -105, 54, 116, -114, -114, MessagePack.Code.FLOAT64, 54, -116, 120, -127, 115, -116, MessagePack.Code.EXT32, 60, 118, MessagePack.Code.STR8, 49, 114, 116, -114, -123, -106, -85, 126, -128, 54, -116, 120, -127, 115, -116, 107, -105, 54, 102, -100, 123, MessagePack.Code.MAP16, -115, -115, -115, 107, 95, 120, -97, 116, MessagePack.Code.BIN16, -115, -115, -115, 114, 122, 113, 112, -116, -126, 126, MessagePack.Code.MAP32, 54, 125, -124, -122, 102, MessagePack.Code.STR32, 57, -115, 122, -86, 107, 88, 116, -114, -114, MessagePack.Code.FLOAT64, 62, 115, 112, -127, MessagePack.Code.FLOAT64, 54, 116, -121, -116, 103, -101, 98, -93, -87, 54, 124, -98, 120, -117, 117, -120, MessagePack.Code.BIN8, 60, 118, MessagePack.Code.STR8, 54, 116, -121, -116, 126, -108, -113, -124, -128, -116, 120, -127, 115, -84, 82, -113, 124, 112, -117, -111, 99, -113, 124, 112, -117, 113, -125, -98, 96, 124, -120, -113, -123, -98, 96, 116, -121, -116, 103, -101, 98, -93, -115, -115, -115, -115, -115, -115, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 18;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008b A[PHI: r8
  0x008b: PHI (r8v7 byte[] A[IMMUTABLE_TYPE]) = (r8v2 byte[]), (r8v9 byte[]) binds: [B:97:0x00f2, B:87:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dz.d.k(short, int, int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.dz.c
    public final Class<Drawable> a() {
        int i2 = 2 % 2;
        int i3 = f23479j + 49;
        f23477h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return Drawable.class;
    }

    @Override // o.dz.c
    public final /* synthetic */ Drawable e(File file) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23477h + 111;
        f23479j = i3 % 128;
        if (i3 % 2 == 0) {
            b(file);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawableB = b(file);
        int i4 = f23477h + 125;
        f23479j = i4 % 128;
        int i5 = i4 % 2;
        return drawableB;
    }

    public final String toString() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f23477h + 109;
        f23479j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            k((short) (KeyEvent.getMaxKeyCode() * 20), 1590191043 >>> Color.argb(1, 1, 1, 0), ViewConfiguration.getMaximumDrawingCacheSize() * 682560634, 67 - (ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1)), (byte) Color.red(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            k((short) (KeyEvent.getMaxKeyCode() >> 16), 1590191043 - Color.argb(0, 0, 0, 0), (-2098729317) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-54) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) Color.red(0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
