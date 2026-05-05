package o.cg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import o.a.o;
import o.bu.c;
import o.cg.j;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    private static int D = 0;

    /* JADX INFO: renamed from: a */
    public static int f22297a = 0;

    /* JADX INFO: renamed from: b */
    public static int f22298b = 0;

    /* JADX INFO: renamed from: c */
    public static int f22299c = 0;

    /* JADX INFO: renamed from: g */
    public static int f22300g = 0;

    /* JADX INFO: renamed from: j */
    public static int f22301j = 0;

    /* JADX INFO: renamed from: u */
    private static char f22302u = 0;

    /* JADX INFO: renamed from: v */
    private static char[] f22303v = null;

    /* JADX INFO: renamed from: w */
    private static int f22304w = 0;

    /* JADX INFO: renamed from: x */
    private static long f22305x = 0;

    /* JADX INFO: renamed from: y */
    private static long f22306y = 0;

    /* JADX INFO: renamed from: z */
    private static int f22307z = 0;

    /* JADX INFO: renamed from: d */
    public final Context f22308d;

    /* JADX INFO: renamed from: e */
    public boolean f22309e;

    /* JADX INFO: renamed from: f */
    private int f22310f;

    /* JADX INFO: renamed from: h */
    private final Boolean f22311h;

    /* JADX INFO: renamed from: i */
    private final String f22312i;

    /* JADX INFO: renamed from: k */
    private String f22313k;

    /* JADX INFO: renamed from: l */
    private String f22314l;

    /* JADX INFO: renamed from: m */
    private o.ef.a f22315m;

    /* JADX INFO: renamed from: n */
    private Long f22316n;

    /* JADX INFO: renamed from: o */
    private final o.ef.a f22317o;

    /* JADX INFO: renamed from: p */
    private int f22318p;

    /* JADX INFO: renamed from: q */
    private o.h.d f22319q;

    /* JADX INFO: renamed from: r */
    private byte[][] f22320r;

    /* JADX INFO: renamed from: s */
    private o.ad.d f22321s;

    /* JADX INFO: renamed from: t */
    private boolean f22322t;

    public static final class e {

        /* JADX INFO: renamed from: a */
        private static int f22323a = 0;

        /* JADX INFO: renamed from: c */
        private static int f22324c = 1;

        /* JADX INFO: renamed from: d */
        private final boolean f22325d;

        /* JADX INFO: renamed from: e */
        private final o.ef.a f22326e;

        public e(o.ef.a aVar, boolean z2) {
            this.f22326e = aVar;
            this.f22325d = z2;
        }

        public final o.ef.a b() {
            int i2 = 2 % 2;
            int i3 = f22324c + 9;
            int i4 = i3 % 128;
            f22323a = i4;
            int i5 = i3 % 2;
            o.ef.a aVar = this.f22326e;
            int i6 = i4 + 53;
            f22324c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return aVar;
        }

        public final boolean e() {
            int i2 = 2 % 2;
            int i3 = f22324c;
            int i4 = (i3 ^ 121) + (((-1) - (((-1) - i3) | ((-1) - 121))) << 1);
            int i5 = i4 % 128;
            f22323a = i5;
            int i6 = i4 % 2;
            boolean z2 = this.f22325d;
            int i7 = (i5 ^ 39) + (((-1) - (((-1) - i5) | ((-1) - 39))) << 1);
            f22324c = i7 % 128;
            int i8 = i7 % 2;
            return z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r6, byte r7, int r8) {
        /*
            int r0 = r7 + 65
            int r1 = r8 * 3
            int r8 = 3 - r1
            int r7 = r6 * 2
            int r1 = r7 + 1
            byte[] r6 = o.cg.f.$$h
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2a
            r2 = r8
            r3 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r8
            r8 = r2
        L16:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r5[r3] = r1
            if (r3 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r3 = r3 + 1
            r1 = r6[r2]
            r8 = r0
            r0 = r1
            goto L13
        L2a:
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.$$j(byte, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f22301j = 683917135;
        f22300g = 490308728;
        f22298b = -560383188;
        f22299c = 19011647;
        f22297a = -1284977330;
        f22307z = 0;
        D = 1;
        B = 0;
        A = 1;
        s();
        p();
        View.MeasureSpec.getMode(0);
        TextUtils.indexOf("", "", 0);
        AudioTrack.getMaxVolume();
        Color.red(0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollDefaultDelay();
        int i2 = D + 71;
        f22307z = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public f(Context context, int i2) {
        this(context, i2, (byte) 0);
    }

    private f(Context context, int i2, byte b2) {
        this.f22322t = true;
        this.f22308d = context;
        this.f22310f = i2;
        this.f22311h = null;
        this.f22312i = a(context);
        this.f22317o = new o.ef.a();
    }

    private static void E(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22303v[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, 632508977, false, $$j(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 34))), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22305x), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(766 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12470), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$j(b3, (byte) ((b3 + 35) - (35 & b3)), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.getDefaultSize(0, 0) + 18, 39570797, false, $$j(b4, (byte) (40 | b4), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 111;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = o.d.d.a(387 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 19, 39570797, false, $$j(b5, (byte) (40 | b5), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void F(char c2, String str, int i2, String str2, String str3, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        o.a.i iVar = new o.a.i();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iArgb = 11 - Color.argb(i3, i3, i3, i3);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$j = $$j(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 107, (char) (AndroidCharacter.getMirror('0') - '0'), iArgb, -155898465, false, str$$j, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = (byte) (b4 + 3);
                    objA2 = o.d.d.a(847 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6488), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -694521287, false, $$j(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr4[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 457, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.resolveSize(0, 0) + 11, 1804962841, false, $$j(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 639, (char) (TextUtils.indexOf((CharSequence) "", '0') + 65101), (Process.myPid() >> 22) + 12, 1636969060, false, $$j(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 57))), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iVar.f19933e;
                cArr6[iVar.f19932b] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iVar.f19932b])) ^ (f22306y ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22304w) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22302u) ^ 740602047300126166L))));
                iVar.f19932b++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void G(int r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.cg.f.$$a
            int r0 = r9 * 3
            int r7 = r0 + 1
            int r0 = 100 - r11
            int r6 = r10 + 4
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L29
            r3 = r7
            r2 = r4
        L11:
            int r0 = -r0
            int r0 = r0 + r3
        L13:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            int r6 = r6 + 1
            if (r2 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L24:
            r1 = r8[r6]
            r3 = r0
            r0 = r1
            goto L11
        L29:
            r2 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.G(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void H(short r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 6
            int r8 = r0 + 4
            int r0 = r10 * 12
            int r7 = 111 - r0
            int r0 = r9 * 6
            int r6 = r0 + 1
            byte[] r5 = o.cg.f.$$d
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2b
            r2 = r8
            r0 = r6
            r1 = r3
        L16:
            int r8 = r8 + r0
            int r2 = r2 + 1
        L19:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            r0 = r5[r2]
            goto L16
        L2b:
            r1 = r3
            r2 = r8
            r8 = r7
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.H(short, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = B + 93;
        int i4 = i3 % 128;
        A = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            int i5 = i4 + 31;
            B = i5 % 128;
            int i6 = i5 % 2;
            if (!str.isEmpty()) {
                Object[] objArr2 = new Object[1];
                E((char) ((-1) - MotionEvent.axisFromString("")), 3628 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr2);
                if (!((String) objArr2[0]).intern().equals(str)) {
                    try {
                        return new o.ef.a(str);
                    } catch (o.ef.b e2) {
                        throw new a(c.f22254g, e2.getMessage());
                    }
                }
                c cVar = c.f22259l;
                Object[] objArr3 = new Object[1];
                E((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 3630, 18 - ExpandableListView.getPackedPositionChild(0L), objArr3);
                throw new a(cVar, ((String) objArr3[0]).intern());
            }
        }
        throw new a(c.f22257j);
    }

    private static String a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 45;
        B = i3 % 128;
        int i4 = i3 % 2;
        try {
            String strC = o.bk.e.d(context).c();
            int i5 = A + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            B = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 76 / 0;
            }
            return strC;
        } catch (o.bk.d unused) {
            if (!o.ea.f.a()) {
                return null;
            }
            Object[] objArr = new Object[1];
            E((char) TextUtils.getOffsetBefore("", 0), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 13 - TextUtils.indexOf("", ""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            E((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, View.MeasureSpec.getSize(0) + 32, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0e9f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0edd  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0f31 A[Catch: all -> 0x1189, TryCatch #6 {all -> 0x1189, blocks: (B:415:0x0f1b, B:417:0x0f31, B:418:0x0f79), top: B:463:0x0f1b }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0f88  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1072  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1184  */
    /* JADX WARN: Type inference failed for: r11v13, types: [o.bu.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o.ef.a] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v290, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v175, types: [o.bu.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.ef.a a(boolean r28, long r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.a(boolean, long):o.ef.a");
    }

    private Context b() {
        Context context;
        int i2 = 2 % 2;
        int i3 = A + 21;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 != 0) {
            context = this.f22308d;
            int i5 = 97 / 0;
        } else {
            context = this.f22308d;
        }
        int i6 = i4 + 125;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        f fVar = (f) objArr[0];
        Long l2 = (Long) objArr[1];
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 13;
        B = i4 % 128;
        if (i4 % 2 != 0) {
            fVar.f22316n = l2;
            int i5 = 6 / 0;
        } else {
            fVar.f22316n = l2;
        }
        int i6 = i3 + 35;
        B = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws CloneNotSupportedException {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = (~((i8 + i9) - (i8 & i9))) | (~(i9 | i3));
        int i11 = ~i3;
        int i12 = ~(((i11 + i7) - (i11 & i7)) | i6);
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = (-1) - (((-1) - i9) & ((-1) - i7));
        int i15 = (~((i3 + i7) - (i3 & i7))) | (~i14);
        int i16 = i14 | i11;
        int i17 = i7 + i6 + i2 + ((-1468046718) * i5) + (327422179 * i4);
        int i18 = i17 * i17;
        int i19 = (677926197 * i7) + 1810235392 + (1154460365 * i6) + (i13 * (-238267084)) + ((-238267084) * i15) + (238267084 * i16) + (916193280 * i2) + (1933049856 * i5) + (743702528 * i4) + (286654464 * i18);
        int i20 = (i7 * (-645773371)) + 280972133 + (i6 * (-645772067)) + (i13 * (-652)) + (i15 * (-652)) + (i16 * 652) + (i2 * (-645772719)) + (i5 * 1523302178) + (i4 * 1475409363) + (i18 * (-1007288320));
        int i21 = i19 + (i20 * i20 * (-492175360));
        if (i21 != 1) {
            return i21 != 2 ? i21 != 3 ? i21 != 4 ? i21 != 5 ? c(objArr) : a(objArr) : b(objArr) : e(objArr) : d(objArr);
        }
        int i22 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 51;
        A = i4 % 128;
        int i5 = i4 % 2;
        String str = fVar.f22313k;
        int i6 = i3 + 99;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 103;
        B = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[1];
        E((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55612), View.MeasureSpec.getMode(0) + 2249, 15 - KeyEvent.getDeadChar(0, 0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        E((char) View.MeasureSpec.getMode(0), 2264 - View.MeasureSpec.getSize(0), Drawable.resolveOpacity(0, 0) + 2, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        E((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 2266 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        E((char) (49217 - View.MeasureSpec.getSize(0)), (Process.myPid() >> 22) + 2268, Color.argb(0, 0, 0, 0) + 1, objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        E((char) (Process.myPid() >> 22), (Process.myPid() >> 22) + 2264, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr6);
        String strIntern5 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        E((char) (39727 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2269 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, objArr7);
        String str = String.format(strIntern, strIntern2, strIntern3, strIntern4, strIntern5, ((String) objArr7[0]).intern());
        int i5 = A + 5;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static o.ef.a d(String str) throws a {
        int i2 = f22301j * 388491108;
        f22301j = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iMyPid = Process.myPid();
        return (o.ef.a) c(elapsedCpuTime, i2, new Random().nextInt(1107220882), iMyPid, -1931806080, 1931806085, new Object[]{str});
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x037a A[Catch: b -> 0x0822, TryCatch #0 {b -> 0x0822, blocks: (B:126:0x0017, B:128:0x0022, B:129:0x0048, B:131:0x004e, B:132:0x0094, B:138:0x00e8, B:140:0x0114, B:141:0x011a, B:142:0x0121, B:144:0x0129, B:146:0x0187, B:148:0x0237, B:150:0x024f, B:151:0x0254, B:152:0x025b, B:154:0x0269, B:155:0x029b, B:158:0x02b7, B:201:0x05a1, B:203:0x05a7, B:204:0x05dd, B:205:0x0649, B:207:0x0657, B:208:0x06d2, B:210:0x0781, B:162:0x031f, B:164:0x037a, B:168:0x038a, B:172:0x0396, B:173:0x039b, B:177:0x03ac, B:179:0x03cc, B:180:0x03d1, B:184:0x03df, B:182:0x03da, B:183:0x03de, B:185:0x03e1, B:189:0x049d, B:191:0x04a3, B:192:0x04e0, B:193:0x04e5, B:194:0x054c, B:196:0x0559, B:197:0x0593, B:198:0x0599, B:199:0x059e, B:212:0x080e, B:214:0x0814, B:215:0x0815, B:217:0x0817, B:218:0x081b, B:220:0x081d, B:221:0x0821, B:186:0x0449), top: B:228:0x0017, inners: #1, #2, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049a  */
    /* JADX WARN: Type inference failed for: r2v167, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.e(java.lang.Object[]):java.lang.Object");
    }

    static void init$0() {
        $$a = new byte[]{97, 98, -19, -80};
        $$b = 254;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88, -65, 75, -75, 54, MessagePack.Code.NIL, Ascii.SO};
        $$e = 102;
    }

    static void init$2() {
        $$h = new byte[]{60, -28, -86, -124};
        $$i = 237;
    }

    static void p() {
        char[] cArr = new char[3649];
        ByteBuffer.wrap("\u0094¡\fÅ¤$\\rõßm\u001a\u0005L¾©V\u0013Îeg£\u001f\u0007·^\u0094\u0080\fÅ¤%\\kõÖm\u001e\u0005{¾\u008dV\u0012Î`gª\u001f\u001d·I(¹ÀúxU\u0011½\u0089î!\u007fÚ\u0080rºêe\u0083Þ;âÓ-t\u0084ì\u0086\u00842<eÕÍM\u0000åx|Ää\u008bLy´#\u001d\u008b\u0085^í=Vã¾Pô¼løÄ\u001f<}\u0095â\r#eJÞ\u00926:\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\fåy\u009eô6\u0001®eG°ÿZ\u0097\u0017\bþ\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u000fål\u009eÛ6@®zG¡ÿ\f\u0097M\b²MQÕ\u0012}ý\u0085\u008a,\u001d´ÜÜ¹gb\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\fån\u009eÓ6\u000e®r\u0094\u0090\fÒ¤7\\jõÞáÚy\u008aÑw).\u0080\u0087\u0018Fp%Ëæ#i»:\u0012ÿjRÂ\u0006]òµ\u0088\r\u001ddûü T\u000b¯Æ\u0007´\u009fsöØN\u008c¦c\u0001\u0097\u0099Àñ;Ih ×8Q\u0090!ë\u0092CKÛ,2è\u008aAâG}ÜÕ¬-\t\u0084ú\u001c¥RsÊ#bÈ\u009a\u00913>«úÃ\u009bxp\u0090ü\b\u0085¡RÙé\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M+åq\u009eÇ6\f®wG°ÿ\u0015\u0097Z\u0094\u0097\fÍ¤#\\hõÛm\u001c\u0005q¾¾\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M/år\u009eÖ6\u0012®yG\u00adÿ\u001e\u0097\b\b\u0097 ÈX\u0002ñýi¦\u0001zº\u009fRôÊ\")<±A\u0019½áùHZÐ\u008e¸õ\u0003cë¤sÛÚi¢\u0095\nÐ\u0095;}m\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M/år\u009eÖ6\u0012®yG\u00adÿ\u001e\u0097\b\b\u0097 È\u0094\u0093\fÎ¤2\\võÕm\u0001\u0005z¾\u0085V\u0006\u0092´\nä¢\u0019Z@óék(\u0003K¸\u0088P\u0007ÈTa\u0091\u0019<±h.\u009cÆæ~s\u0017\u0095\u008fÎ'eÜ¨tÚì\u001d\u0085¶=âÕ\rrùê®\u0082U:\u0006Ó¹K ãN\u0098³07¨RA\u0097ù(\u0091`\u000e\u0090¦Ã\u0094\u009d\fÓ¤\u0000\\aõÈm\u001b\u0005w¾£V\fj¬òüZ\u0001¢X\u000bñ\u00930ûS@\u0090¨\u001f0L\u0099\u0089á$IpÖ\u0084>þ\u0086kï\u008dwÖß}$°\u008cÂ\u0014\u0005}®Åú-\u0015\u008aá\u0012¶zMÂ\u001e+¡³'\u001bI`êÈ-PI¹\u0092\u00011i|öÇ^Û¦z\u000f\u0084\u0097ÚrÆê\u0088y}á-IÐ±\u0089\u0018 \u0080áè\u0082SA»Î#\u009d\u008aXòõZ¡ÅU-/\u0095ºü\\d\u0007Ì¬7a\u009f\u0013\u0007Ôn\u007fÖ+>Ä\u00990\u0001gi\u009cÑÏ8p à\b\u009ds4ÛïC\u009bª^\u0012âz²å_M\nµ¾\u001c\u0018\u0084\u001dì¹Wl¿\u0003'É\u008eföZ^É¹h!-\u0089Ûñ\u008cX7Àæ(\u0083\u00934ûçc\u0088Ê[ÊGR\u001aúë\u0002°«\f3É[½àm\bØ\u0090\u00ad9aAôé\u009cve\u009e.&\u0080Os\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u0007åo\u009e\u00926\u0012®yG«ÿ\u000e\u0097M\bº\u0094§\fÎ¤7\\fõÖm\r\u0005>¾¸V\rÎ0g¶\u001f\u0011·X(¾ÀáxN\u0011¿\u0089 !DÚ\u008brõê<\u0083Þ;ÈÓ't\u0084ìÃ\u00847<~ÕÑM\u0001år\u009e\u00926\t®xGäÿI\u0097\u0018\b\u00ad éXA\u0094 \fÏ¤9\\põ\u009am,\u0005{¾¸V\u0007Îsg²\u001f\u001d·E(¶À®x\u0011\u0011ò\u0089ò!YÚ\u008brîê\u001a\u0083\u009b;ßÓ7t\u009cìÒ\u0084n\u0094\u0080\fÏ¤9\\pÍ#Usý\u008e\u0005×¬~4¿\\Üç\u001f\u000f\u0090\u0097Ã>\u0006F«îÿq\u000b\u0099q!äH\u0002ÐYxò\u0083?+M³\u008aÚ!bu\u008a\u009a-nµ9ÝÂe\u0091\u008c.\u0014°¼ÉÇa\u0094\u009a\fÃ¤3\u008b\u0083\u0013Ó».CwêÞr\u001f\u001a|¡¿I0Ñcx¦\u0000\u000b¨_7«ßÑgD\u000e¢\u0096ù>RÅ\u009fmíõ*\u009c\u0081$ÕÌ:kÎó\u0099\u009bb#1Ê\u008eR\u0016úl\u0081ÇÞuF/îÜ\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\båu\u009eÜ6\u0007®sG¶ÿ\n\u0097Z\b· âXVñði«\u0001\u0014º¤R÷Ê:cÜ\u001bû³.T\u009fÌÐd3\u001ciµÒ-\u0005Åx~Õ\u0016\u0002\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\båu\u009eÜ6\u0007®sG¶ÿ\n\u0097Z\b· âXVl\u0093ôÎ\\?¤d\rØ\u0095\u001dýiF¹®\f6y\u009fµ\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\bå-\u0094\u0094\f\u0091\u00989\u0000i¨\u0094PÍùda¥\tÆ²\u0005Z\u008aÂÙk\u001c\u0013±»å$\u0011Ìktþ\u001d\u0018\u0085C-èÖ%~Wæ\u0090\u008f;7oß\u0080xtà#\u0088Ø0\u008bÙ4A¤é\u0082ñ]i\rÁð9©\u0090\u0000\bÁ`¢Ûa3î«½\u0002xzÕÒ\u0081Mu¥\u000f\u001d\u009at|ì'D\u008c¿A\u00173\u008fôæ_^\u000b¶ä\u0011\u0010\u0089Gá¼Yï°P(Å\u0080µû\u0014SÆË±\"x\u009a\u0092ò\u0087msÅ0=Ê\u0094z\f/d\u009fßI75¯è\u0006P~zÖü1Q©\u0007\u0001÷y®\u0094\u0094\f\u0092¿\f'\\\u008f¡wøÞQF\u0090.ó\u00950}¿åìL)4\u0084\u009cÐ\u0003$ë^SË:-¢v\nÝñ\u0010YbÁ¥¨\u000e\u0010Zøµ_AÇ\u0016¯í\u0017¾þ\u0001f\u0091Î¶EKÝL\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\bå(\u001eì\u0086ì½r%\"\u008dßu\u0086Ü/Dî,\u008d\u0097N\u007fÁç\u0092NW6ú\u009e®\u0001Zé Qµ8S \b\b£ón[\u001cÃÛªp\u0012$úË]?Åh\u00ad\u0093\u0015Àü\u007fdïÌÎ\u0000\u000b\u0098\n\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\bå*\u0094\u0094\f\u0096\u0091^\t\u000e¡óYªð\u0003hÂ\u0000¡»bSíË¾b{\u001aÖ²\u0082-vÅ\f}\u0099\u0014\u007f\u008c$$\u008fßBw0ï÷\u0086\\>\bÖçq\u0013éD\u0081¿9ìÐSHÕà¥\u009b\u00163Ï«¨BlúÅ\u0092Ã\rs¥.]\u0087ô|l(\u0004\u008d¿QW!ÏìfY\u001e-\u0094\u0082\fÒ¤9\\`õÏm\u000b\u0005j¾\u008aV\u000bÎ~g¡\u001f\u0011·X(¨ÀüxU\u0011¼\u0089ô\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M*åy\u009eÄ6\t®uG¡ÿZ\u0097a\b\u009a ¬XCñ»iç\u0001\u001aºÊRÙÊ\u0000c¸\u001bÀ³\u000fT¿Ìàd\u0005\u001cAµú\u0094\u0081\fÔ¤7\\põÓm\u000b\u0005Z¾©V\u0014Îyg¥\u001f\u0011·c(¼\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M*åy\u009eÄ6\t®uG¡ÿZ\u0097F\b¿ áXGñðià\u0001]º\u0084RÿÊ+c\u008e\u001bâ³2T\u009fÌÊd.æ\u0003~PÖµ.ø\u0087L\u001f\u0098wÅÌ8$\u009a¼à\u0015\u0015m\u0088ÅÑZ*²~\nÛc7ûgSÊ¨\u001f\u0000{\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M-åi\u009eÀ6\u0012®sGªÿ\u000e\u0097\b\b² åX@ñ³i¦\u0001\\º\u008bRëÊ&cÜ\u001bà³%T\u0086ÌÖd?\u001c{µÛ-\u0002Åv~Ñ\u0016\u0012\u008e}'¥ß\u0016w\u000eèô\u0080\u00148\u0011ÑæIµá\u0013\u0094\u0094\f\u0091¤f\\5\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M-ås\u009eÀ6\u0012®sG§ÿ\u000e\u0097\b\b² åX@ñ³i¦\u0001\\º\u008bRëÊ&cÜ\u001bà³%T\u0086ÌÖd?\u001c{µÛ-\u0002Åv~Ñ\u0016\u0012\u008e}'¥ß\u0016w\u000eèô\u0080\u00148\u0011ÑæI¶á\u0013\u0013I\u008bL#»Ûë\u009c1\u0004a¬\u009cTÅýle\u00ad\rÎ¶\r^\u0082ÆÑo\u0014\u0017¹¿í \u0019Ècpö\u0019\u0010\u0081K)àÒ-z_â\u0098\u008b33gÛ\u0088||ä+\u008cÐ4\u0083Ý<E\u0086íë\u0096]>ä¦ÂO\u0015÷¼\u009fà\u0000\u0013¨KP¦ù\u001faG\té²nZ_Â\u008fk*\u0013B»\u008d\\4Äil\u009d\u0014Í½n%\u00adÍ\u0086vw\u001eª\u0086Ñ/\u0007×²\u0094\u0099\fÅ¤/\\wõÎm\u0007\u0005l¾©V!Îug´\u001f\u0000·C(¾Àçx_\u0011³\u0089ô!SÚ§ròê)\u0083\u0097;Â\u0094\u0091\fÁ¤8\\jõÕm\u001c\u0005>¾ªV\u0007Îdg¥\u001f\u001c·\n(´ÀýxW\u0011ò\u0089ã!SÚ\u0096rîê!\u0083\u0098;ÅÓ!t\u0091ìÒ\u00841<*ÕÛM\u0006å}\u009eÛ6\u000e\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M>åi\u009eÁ6\b®6G©ÿ\u001f\u0097[\b\u00ad íXEñ¹iè\u0001SºÊRüÊ'c\u008f\u001bó³\"T\u009aÌÁd>\u001c(µÜ-\u0015Å\"~Ò\u0016\u0007\u008ew'¡ß\u001dw@è¸\u0080R8OÑ¤I¤áT\u009a\u00872êªlC\u0092ûâ\u0093#4\u0087¬ÏD6üz\u0095\u009c\r;¥n^\u0096ö7n^\u0007\u0083³F+\u0016\u0083ë{²Ò\u001bJÚ\"¹\u0099zqõé¦@c8Î\u0090\u009a\u000fnç\u0014_\u00816g®<\u0006\u0097ýZU(Íï¤D\u001c\u0010ôÿS\u000bË\\£§\u001bôòKjÍÂº¹\u0012\u0011Û\u0089å`YØÆ°\u008f/d\u00879\u007f\u0098Ö`N4&\u0093\u009dPu$íóD\u000f<\u0015\u0094üsNë\u0012Cç;û\u0092W\n\u009f\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u001eåi\u009eÁ6\b®6G\u008aÿ\u0015\u0097\\\b· êXKñ³iç\u0001@º\u0083R÷Ê cÜ\u001bÂ³2T\u0099ÌÒd3\u001clµÛ-\u001eÅ\"~þ\u0016\u0007\u008ey'¯ßXw\u0014èü\u0094\u0091\fÌ¤9\\qõÞm%\u0005{¾¿V\u0011Îqg¡\u001f\u001d·D(¿ÀÇxXVwÎ*fß\u009e\u009778¯ÃÇ\u009d|Y\u0094÷\f\u0097¥GÝûu¢êY\u00028º¨Ó[K\u0010ã¹\u0018f°\u0019(Ü\u0094\u0081\fÈ¤7\\5\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u001dåt\u009eÓ6Q®6GþÿZ\u0097`\b¿ ÿXJñðiô\u0001Qº\u009eRêÊ'c\u0099\u001bä³%TÌÌ\u0084#\u009d»Í\u00130ëiBÀÚ\u0001²b\t¡á.y}Ð¸¨\u0015\u0000A\u009fµwÏÏZ¦¼>ç\u0096Lm\u0081Åó]44\u009f\u008cËd$ÃÐ[\u00873|\u008b/b\u0090ú\u0015R|)Û\u0081Y\u0019>ðöHR\u0019æ\u0081¯)PÑQxèà9\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u001dåt\u009eÓ6R®#GòÿZ\u0097\u0012\bþ ÄXCñ£iî\u0001\u0014º\u0098RýÊ:c\u008e\u001bû³%T\u0080ÌÁd`\u001c(BkÚ;rÆ\u008a\u009f#6»÷Ó\u0094hW\u0080Ø\u0018\u008b±NÉãa·þC\u00169®¬ÇJ_\u0011÷º\fw¤\u0005<ÂUií=\u0005Ò¢&:qR\u008aêÙ\u0003f\u009bã3\u008aH-à¬xÝ\u0091\f)¤AìÞ\u0000v;\u008e²'X¿\u0019×¦l}\u0084\u0002\u001c\u0090µaÍ\u0003eÚ\u0082m\u001az²ÂÊ\u0084c/ûÿ\u0013Ü¨\nÀýX\u0092ñS\tó¡±>PVèîþ\u0007k\u009f\u001f7¶Lbä\t|Ô\u0095u-\rEÙâ~z1\u0092å*\u0098C'ÛÏs\u0095\u0088- è¸ÞÑ\u0016½é%·\u008d\u0013uRÜãD;,F\u0097\u0096\u007f<ç]N\u00946c\u009e\u007f\u0001\u0080éÍQc8Å ß\b`ó [ÅÃ\u001aªº\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u001dåt\u009eÓ6R®#GòÿZ\u0097\u0012\bþT\u0003Ì@d¶\u009cÝ5D\u00ad\u008cÅë~;\u0096\u0080\u000eé§\"ß\u009dwþè)\u0000j¸Í5#\u00adp\u0005\u0099\u001b¤\u0094\u0095\fÅ¤8\\aõÈm\t\u0005j¾©V&Îug°\u001f\u001d·I(½ÀÇxR\u0011´\u0089ï!DÚ\u0089rûê<\u0083\u0097;ÃÓ,tØì\u008f\u0084t<'Õ\u0098M\u000båj\u009e×6\u0012®oG°ÿ\u0012\u0097A\b° ëX\u0002ñ¿ií\u0094\u0093\fÐ¤&\\FõÏm\u0001\u0005r¾¨V,Îeg«\u001f\u0016·O(ª\u0094\u0093\fÐ¤&\\FõÏm\u0001\u0005r¾¨V-Î`g²\u001f\u001d·E(¶Àý\u0094\u0081\fÄ¤=\\Rõßm\u001a\u0005m¾¥V\rÎ~M¸Õ¹}\u0019\u0085\u0015,£´'Ü\u000fgÕ\u008f-\u0017\u0001¾ßÆ;n;ñÁ\u0019Á\u0094Â\f\u0096\u0094Â\f\u0094T\u008c\u000fò\u0097¢\u0094\u009e\fÏ¤1\u0084Í\u001c\u0098´mL<E&Ývu\u009d\u008dÄ$k¼¯ÔÎo\u001b\u0018ø\u0080¥(B\u0094Ã\f\u0093¤x\\4õ\u0089mF\u0005.¾üVOÎ&g§\u001f\u0016·N(¼Àêx\r\u0094\u009c\fÁ¤;\\aw¢ïòG\u0019¿@\u0016·\u008e,æ_]\u009aµ+-F\u0084\u008fü1TdË\u009c#Ï\u0094\u0095\fÅ¤\"\\EõÊm\u0018\u0005\\¾¹V\u000bÎ|g¢\u001f;·Z(¬ÀçxS\u0011¼\u0089 !\u001bÚÄrÏê&\u0083\u009f;ÎÓ.t\u0095ì\u0086\u0084 <eÕ\u0098M\rås\u009eß6\u0010®cG°ÿ\u001f\u0097\b\b¿ üXRñðiä\u0001Aº\u0083RôÊ*cÜ\u001bý³0T\u0082ÌÍd5\u001cfµÍùja$ÉË1\u0080\u0098%\u0094\u0093\fÕ¤\"\\lõùm\u0007\u0005z¾©V1ÎSg\u00857µ¯ê\u0007\u000eÿ[VÒÎ,¦[\u001d\u0081õ m\\Ä¸¼/\u0014e\u008b\u0092cÑÛr²½*Ê\u0082iyªGmß2wÑ\u0094\u009e\fÏ¤8\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089ð!DÚ\u008brùê-\u0083\u008d;ßÓ+t\u009eìÁ\u0084t<kÕÍM\u001aåt\u009e×6\u000e®bG\u00adÿ\u0019\u0097I\bª åXMñ¾i¦\u0001Aº\u009aRüÊ/c\u0088\u001b÷³`T\u0090ÌÍd?\u001cdµÚ-\u001f\u0094\u009c\fÅ¤!\\TõÛm\u001b\u0005m¾¯V\rÎtg£\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089ð!DÚ\u008brùê-\u0083\u008d;ßÓ+t\u009eìÁ\u0084t<kÕÍM\u001aåt\u009e×6\u000e®bG\u00adÿ\u0019\u0097I\bª åXMñ¾i¦\u0001Rº\u0083RýÊ\"c\u0098\u001bá\u0094\u0082\fÁ¤%\\wõÙm\u0007\u0005z¾©\u0094\u0082\fÁ¤%\\wõÙm\u0007\u0005z¾©V&Îqg²\u001f\u0015\u0094\u009e\fÃ¤2\\gõÌm\u0005\u0005]¾¾V\u001bÎ`g²\u001f\u001b·M(ªÀïxQ\u001c¯\u0084û,\u001bÔ^}Ñå2\u008dS6\u0080Þ/FVï\u009a\u00975?c \u009cHÕ\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089ð!WÚ\u009dröê'\u0083\u009f;ÈÓbt\u0084ìÉ\u0084t<oÕÖM\rån\u009eË6\u0010®bGþÿZ\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089å!XÚ\u0087rèê1\u0083\u008e;ØÓ't\u0094ì\u0086\u0084$<kÕÁM\u0002ås\u009eÓ6\u0004®6GþÿZ\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089å!XÚ\u0087rèê1\u0083\u008e;ØÓ't\u0094ì\u0086\u0084$<kÕÁM\u0002ås\u009eÓ6\u0004®6G\u00adÿ\t\u0097\b\b° ùXNñ¼i¦\u0001\u000eºÊRýÊ<c\u008e\u001bý³2\u0094\u0097\fÎ¤5\\võÃm\u0018\u0005j¾\u009cV\u0003Îigª\u001f\u001b·K(¼À®x\u0011\u0011ò\u0089Ê!eÚ«rÔê\r\u0083\u0086;ÏÓ't\u0080ìÒ\u0084=<eÕÖ\u0097\u0010\u000f]§·_â\u0094³\fÃ¤5\\aõÊm\u001c\u00053¾\u0089V\fÎsg©\u001f\u0010·C(¶Àé\u001bÀ\u0083\u009f+hÓ1z\u0095âZ\u008a11î\u0096`\u000e\u001e¦é^¡÷\u000eo×\u0007»¼0TçÌ¸eg\u001dÀ\u0094\u0093\fÐ¤&\\hõÓm\u000b\u0005\u007f¾¸V\u000bÎ\u007fg¨\u001f[·@(«ÀáxR\u0094ª\f\u008d¤\u001f\\wõÉm\u001d\u0005{¾¾VOÎYg¢\u0094\u009f\fÏ¤4\\mõÖm\r\u00053\u0094ß\u00adm5J\u009dÄe°Ì\u0018TÝ<ô\u0087BoÁçÕ\u007fò×{/\u001e\u0086´\u001ebv\u0004ÍÀ%i½B\u0014ðloØh@,èÑ\u0010\u0089¹\u0017!àI\u0083òD\u001aß\u0082\u0096+mSüû dZ\u008c\u00024»]_ÅImò\u0096->!¦ÄÏfw0\u009fÎ8j ;È\u009dpª\u0099\u0015\u0001§\u00008\u0098|0\u0081ÈÙaGù°\u0091Ó*\u0014Â\u008fZÆó=\u008b¬#ð¼\nTRìë\u0085\u000f\u001d\u0019µµN}æQ~\u0094\u00174¯eG\u0094à'xl\u0010\u0088¨\u0093AbÙ¸qÁ\nn¢ù:\u0095Ó]\u0094\u0081\fÅ¤8\\`õþm\t\u0005j¾\u00adV6Î\u007fg\u0084\u001f\u0015·I(³ÀëxR\u0011¶\u0089 !\fÚÄrèê-\u0083\u008d;ÜÓ-t\u009eìÕ\u00841<*ÕÕM\u000båo\u009eÁ6\u0001®qG¡ÿZ\u0097\u0012\bþ¦\u0097>Ó\u0096.nvÇè_\u001f7|\u008c»d üiU\u0092-\u0003\u0085_\u001a¥òýJD# »¶\u0013\rèÒ@îØ?±\u008c\t\u009aá<F\u0092ÞÄ¶2\u000e<çÜ\u007f\u001d×y¬Ô\u0004\u0019\u009cnu¡Í\t¥\u001e:«\u0092õjPÃ£[°3\u0018\u0088Ü\u0094\u0081\fÅ¤8\\`õþm\t\u0005j¾\u00adV6Î\u007fg\u0084\u001f\u0015·I(³ÀëxR\u0011¶\u0089 !\u001bÚÄrÓê\u0007\u0083»;ÔÓ!t\u0095ìÖ\u0084 <cÕ×M\u0000KbÓ-{Æ\u0083\u0092*:²éÚ\u008eai\u0089ø\u0011\u0096¸GÀ©hö÷\r\u001fV§éÎuV\u0010þ²\u0005d\u00ad\n5Î\\\u007fäy\fÇ«d3*[Íã\u0090\n,\u0092ÿ:ÉA7éçq\u0086\u0098A îH¯×J\u007f\r\u0087¾.J¶\u001dÞáey\u008d\f\u0015Ò¼eÄ\u0002lÑ\u008b#\u0013k»\u008fÃ·j8òö\u001a\u0099¡eÉÖQ\u0099ø\\\u0000è¨«7]_îçº\u000eM\u0094 \fÅ¤'\\qõßm\u001b\u0005j¾ìV\u0012Îqg¿\u001f\u0018·E(¹Àêx\u001c\u0011¢\u0089ò!SÚ\u0094rûê:\u0083\u009f;ØÓ+t\u009fìÈ\u0084t<lÕÙM\u0007åp\u009e×6\u0004®:Gäÿ0\u0097[\b± âX\u0002ñ\u0095iþ\u0001Wº\u008fRèÊ:c\u0095\u001bý³.aoù QË©\u009f\u00007\u0098äð\u0083Kd£õ;\u009b\u0092Jê¤BûÝ\u00005[\u008dääd|\u001dÔº/k\u0087\r\u001fÂvmÎ8&ß\u0081{\u0019-q\u008cÉ\u0097 8¸õ\u0010\u008ck+Ãö[\u0089²Y=æ¥©\rBõ\u0016\\¾Äm¬\n\u0017íÿ|g\u0012ÎÃ¶-\u001er\u0081\u0089iÒÑm¸ñ \u0094\u00886sàÛ\u008eCJ*û\u0092ýzCÝàE®-I\u0095\u0014|¨ä{LM7¦\u009f\u007f\u0007\u0004îÇVr>)¡Û\t\u0094ñ<XÏÀ×¨#\u0013úû\u0080cSÊè²\u0087'é¿¦\u0017Mï\u0019F±Þb¶\u0005\râås}\u001dÔÌ¬\"\u0004}\u009b\u0086sÝËb¢þ:\u009b\u00929iïÁ\u0081YE0ô\u0088ò`LÇü_½7Z\u008f\u0015f´þqV\u0016-¥\u0085q\u001d\u0006ô\u009aLb$?»Î\u0013\u0093ë0BÇÚ\u0082²+\tàá\u008fy_Ðì¨Ì\u0000Xçé\u007f³×H¯\u0013\u0006¤\u0094\u0097\fØ¤3\\gõÏm\u001c\u0005{¾\u009cV\rÎcg²\u001f\\·\u0003(øÀ£x\u001c\u0011\u009c\u0089ï!\u0016Úªrÿê<\u0083\u0089;ÃÓ0t\u009bì\u0086\u0084\u0017<eÕÖM\u0000åy\u009eÑ6\u0014®\u007fG²ÿ\u0013\u0097\\\b§ ¬XCñ¦iç\u0001]º\u0086RùÊ,c\u0090\u001b÷\u0094¼\fÏ¤v\\Jõßm\u001c\u0005i¾£V\u0010Î{gæ\u001f7·E(¶ÀàxY\u0011±\u0089ô!_Ú\u0092róê<\u0083\u0087;\u008cÓ#t\u0086ìÇ\u0084=<fÕÙM\fåp\u009e×\u0094\u0093\fÐ¤&\\hõÓm\u000b\u0005\u007f¾¸V\u000bÎ\u007fg¨\u001f=·nç¨\u007fõ×\u0004/Q\u0086õ\u001e<vfÍ\u0091%*½M\u0014ªl:Äs[\u0094³Ó\u000brb\u008fúÈRc©·\u0001È\u0099TðïH° \u000e\u0007¾\u009fÿ÷\u0018OW¦ö>7\u0096\u0000íïE?Ý^4\u0091\u008c)äz{ÂÓÙ+zVéÎ´fE\u009e\u00107´¯}Ç'|Ð\u0094k\f\f¥ëÝ{u2êÕ\u0002\u0092º3ÓÎK\u0089ã\"\u0018ö°\u0089(\u0015A®ùñ\u0011^¶î.¯F@þ\u0018\u0017«\u008f3'\b\\«ô=l\u001b\u0085Ë=bU%ÊÂb\u0083\u009a:3É«ÛÃsx·\u0094\u0091\u0094³\fî¤\u0012\\Võõm!\u0005Z\u0017'\u008fd'\u0090ßÊv~îª\u0086Þ='Õ¦MØä\u0006\u0094\u0093\fÎ¤2\\võÕm\u0001\u0005z¾âV\rÎcgè\u001f'·S(«ÀúxY\u0011¿\u0089Ã!ZÚ\u008brùê#\u0094\u0097\fÌ¤7\\tõÉm\r\u0005z¾\u009eV\u0007Îqgª\u001f\u0000·C(µÀëN?Öb~\u009e\u0086Ú/y·\u00adßÖdN\u008c¯\u0014Ì½\u001aÅömÇò\u0017\u001aV¢ùË\bSEûî\u00001¨b0\u008cY áe\t\u008f®8\u0094\u0091\fÕ¤$\\võßm\u0006\u0005j¾\u008dV\u0012Î`gª\u001f\u001d·I(¹ÀúxU\u0011½\u0089î\u0094\u0098\fÁ¤ \\eõ\u0094m\u0004\u0005\u007f¾¢V\u0005Î>g\u0095\u001f\r·Y(¬ÀëxQhoð0XÇ \u009e\t:\u0091õù\u009eBAªÞ2\u0085\u009bAãèK\u009dÔC<\u001e\u0084\u00ad\u0094\u0094\fÉ¤8\\mõÉm\u0000\u0005Z¾\u00adV\u0016Îqg\u0096\u001f\u0006·O(¨ÀïxN\u0011³\u0089ô!_Ú\u008brôê`\u0083×;\u008cÓotÐìì\u0084\u0007<EÕöM+åd\u009eÑ6\u0005®fG°ÿ\u0013\u0097G\b°\u0094ß\f\u0091\u0094\u009b\fÎ¤ \\eõÖm\u0001\u0005z¾ìV\u0001Îbg£\u001f\u0010·O(¶ÀúxU\u0011³\u0089ì!E".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3649);
        f22303v = cArr;
        f22305x = 8881352837026745504L;
    }

    private static String q() {
        int i2 = f22299c * (-1009177125);
        f22299c = i2;
        int iMyPid = Process.myPid();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        return (String) c(iMyPid, i2, Process.myUid(), iUptimeMillis, -1242184795, 1242184797, new Object[0]);
    }

    private static o.ef.a r() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        try {
            o.ea.c.a();
            Object[] objArr = new Object[1];
            E((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2270 - TextUtils.lastIndexOf("", '0', 0), 3 - TextUtils.getOffsetBefore("", 0), objArr);
            aVar.b(((String) objArr[0]).intern(), false);
            Object[] objArr2 = new Object[1];
            E((char) (TextUtils.getTrimmedLength("") + 4171), 2274 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - ExpandableListView.getPackedPositionType(0L), objArr2);
            aVar.a(((String) objArr2[0]).intern(), new o.ef.c((List<?>) m.d((Map) o.cg.e.f22290a, (Object[]) o.ea.b.i())));
            Object[] objArr3 = new Object[1];
            E((char) (53668 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 2278 - ExpandableListView.getPackedPositionGroup(0L), 8 - TextUtils.getCapsMode("", 0, 0), objArr3);
            aVar.a(((String) objArr3[0]).intern(), new o.ef.c((List<?>) m.d((Map) o.cg.e.f22292c, (Object[]) o.ea.b.c())));
            Object[] objArr4 = new Object[1];
            E((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35948), 2285 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            E((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2289, '@' - AndroidCharacter.getMirror('0'), objArr5);
            aVar.a(strIntern, (Object) ((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            E((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2305 - View.resolveSizeAndState(0, 0, 0), AndroidCharacter.getMirror('0') - ',', objArr6);
            String strIntern2 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            E((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58144), 2309 - TextUtils.getOffsetAfter("", 0), 15 - TextUtils.getCapsMode("", 0, 0), objArr7);
            aVar.a(strIntern2, (Object) ((String) objArr7[0]).intern());
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr8 = new Object[1];
                E((char) ExpandableListView.getPackedPositionType(0L), ViewConfiguration.getKeyRepeatTimeout() >> 16, 13 - View.resolveSize(0, 0), objArr8);
                String strIntern3 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                E((char) ExpandableListView.getPackedPositionGroup(0L), 2324 - KeyEvent.normalizeMetaState(0), Color.red(0) + 55, objArr9);
                o.ea.f.e(strIntern3, ((String) objArr9[0]).intern(), e2);
                int i3 = A + 91;
                B = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return aVar;
    }

    static void s() {
        f22306y = -845837712580679727L;
        f22304w = 1564493270;
        f22302u = (char) 17878;
    }

    private boolean w() {
        int iMyTid = Process.myTid();
        int iNextInt = new Random().nextInt();
        int i2 = (-1740153203) * f22298b;
        f22298b = i2;
        return ((Boolean) c(iNextInt, iMyTid, new Random().nextInt(), i2, -630666183, 630666186, new Object[]{this})).booleanValue();
    }

    private static String x() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 83;
        B = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        E((char) (28074 - TextUtils.getCapsMode("", 0, 0)), TextUtils.indexOf("", "", 0, 0) + 2379, (KeyEvent.getMaxKeyCode() >> 16) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = B + 71;
        A = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public abstract String a();

    public final void b(j jVar, byte[][] bArr) throws o.ef.b {
        int length;
        int i2 = 2 % 2;
        if (bArr != null) {
            this.f22320r = bArr;
            int i3 = A + 33;
            B = i3 % 128;
            int i4 = i3 % 2;
        }
        if (jVar != null) {
            byte[][] bArr2 = new byte[0][];
            byte[][] bArr3 = this.f22320r;
            if (bArr3 != null) {
                int i5 = B + 83;
                A = i5 % 128;
                int i6 = i5 % 2;
                length = bArr3.length;
            } else {
                bArr3 = bArr2;
                length = 0;
            }
            j.e eVarE = jVar.e(length);
            this.f22315m = eVarE.b();
            byte[][] bArr4 = new byte[bArr3.length + eVarE.d().length][];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(eVarE.d(), 0, bArr4, bArr3.length, eVarE.d().length);
            this.f22320r = bArr4;
        }
        int i7 = A + 123;
        B = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public e b_() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        E((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 13, objArr);
        String strIntern = ((String) objArr[0]).intern();
        try {
            HttpsURLConnection httpsURLConnectionB = new o.ce.b().b(this.f22308d);
            int i3 = A + 55;
            B = i3 % 128;
            int i4 = i3 % 2;
            try {
                try {
                    Object[] objArr2 = new Object[1];
                    E((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 946), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2742, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr2);
                    httpsURLConnectionB.setRequestMethod(((String) objArr2[0]).intern());
                    httpsURLConnectionB.setConnectTimeout(this.f22318p * 1000);
                    Object[] objArr3 = new Object[1];
                    E((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2747 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    E((char) (36700 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2760 - ImageFormat.getBitsPerPixel(0), 8 - Color.argb(0, 0, 0, 0), objArr4);
                    httpsURLConnectionB.setRequestProperty(strIntern2, ((String) objArr4[0]).intern());
                    Object[] objArr5 = new Object[1];
                    E((char) (KeyEvent.getDeadChar(0, 0) + 721), (Process.myTid() >> 22) + 2769, 12 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    E((char) (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 2781, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
                    httpsURLConnectionB.setRequestProperty(strIntern3, ((String) objArr6[0]).intern());
                    Object[] objArr7 = new Object[1];
                    E((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 2797, 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
                    httpsURLConnectionB.setRequestProperty(((String) objArr7[0]).intern(), o.bk.e.d(this.f22308d).b());
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr8 = new Object[1];
                    E((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2807, 7 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
                    StringBuilder sbAppend = sb.append(((String) objArr8[0]).intern());
                    o.ea.c.a();
                    Object[] objArr9 = {this.f22308d};
                    int i5 = o.ea.b.f23483d * (-465297448);
                    o.ea.b.f23483d = i5;
                    int i6 = o.ea.b.f23480a * (-1596292587);
                    o.ea.b.f23480a = i6;
                    StringBuilder sbAppend2 = sbAppend.append((String) o.ea.b.a(i6, 1544988355, i5, objArr9, (int) Runtime.getRuntime().freeMemory(), Thread.activeCount(), -1544988354));
                    Object[] objArr10 = new Object[1];
                    E((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 2814 - MotionEvent.axisFromString(""), 1 - ExpandableListView.getPackedPositionType(0L), objArr10);
                    String string = sbAppend2.append(((String) objArr10[0]).intern()).append(Process.myPid()).toString();
                    Object[] objArr11 = new Object[1];
                    E((char) (14791 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2816, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, objArr11);
                    httpsURLConnectionB.setRequestProperty(((String) objArr11[0]).intern(), string);
                    String string2 = UUID.randomUUID().toString();
                    Object[] objArr12 = new Object[1];
                    E((char) (29568 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2825, 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
                    httpsURLConnectionB.setRequestProperty(((String) objArr12[0]).intern(), string2);
                    if (o.ea.f.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr13 = new Object[1];
                        E((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19688), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2837, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, objArr13);
                        o.ea.f.c(strIntern, sb2.append(((String) objArr13[0]).intern()).append(string2).toString());
                    }
                    httpsURLConnectionB.setUseCaches(false);
                    httpsURLConnectionB.setDoInput(true);
                    httpsURLConnectionB.setDoOutput(true);
                    OutputStream outputStream = Callback.getOutputStream((URLConnection) httpsURLConnectionB);
                    outputStream.write(this.f22313k.getBytes(o.ea.g.c()));
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = Callback.getResponseCode(httpsURLConnectionB);
                    if (o.ea.f.a()) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr14 = new Object[1];
                        E((char) (38073 - Color.alpha(0)), 2868 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 36 - KeyEvent.normalizeMetaState(0), objArr14);
                        o.ea.f.c(strIntern, sb3.append(((String) objArr14[0]).intern()).append(responseCode).toString());
                    }
                    if (o.ea.f.a()) {
                        StringBuilder sb4 = new StringBuilder();
                        Object[] objArr15 = new Object[1];
                        E((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 2904, 39 - KeyEvent.keyCodeFromString(""), objArr15);
                        o.ea.f.c(strIntern, sb4.append(((String) objArr15[0]).intern()).append(Callback.getResponseMessage(httpsURLConnectionB)).toString());
                    }
                    if (responseCode >= 200) {
                        int i7 = A + 123;
                        B = i7 % 128;
                        if (i7 % 2 == 0 ? responseCode < 300 : responseCode < 22573) {
                            InputStream inputStream = Callback.getInputStream((URLConnection) httpsURLConnectionB);
                            byte[] bArr = new byte[1024];
                            StringBuilder sb5 = new StringBuilder();
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                            while (true) {
                                int i8 = bufferedInputStream.read(bArr);
                                if (i8 == -1) {
                                    bufferedInputStream.close();
                                    String string3 = sb5.toString();
                                    httpsURLConnectionB.disconnect();
                                    Object[] objArr16 = {string3};
                                    int i9 = f22301j * 388491108;
                                    f22301j = i9;
                                    return new e((o.ef.a) c((int) Process.getElapsedCpuTime(), i9, new Random().nextInt(1107220882), Process.myPid(), -1931806080, 1931806085, objArr16), false);
                                }
                                sb5.append(new String(bArr, 0, i8, o.ea.g.c()));
                            }
                        }
                    }
                    if (o.ea.f.a()) {
                        StringBuilder sb6 = new StringBuilder();
                        Object[] objArr17 = new Object[1];
                        E((char) (View.getDefaultSize(0, 0) + 12822), (-16774273) - Color.rgb(0, 0, 0), 45 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr17);
                        o.ea.f.d(strIntern, sb6.append(((String) objArr17[0]).intern()).append(responseCode).toString());
                        int i10 = A + 25;
                        B = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    throw new a(c.f22256i, Callback.getResponseMessage(httpsURLConnectionB));
                } catch (IOException e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr18 = new Object[1];
                        E((char) TextUtils.getOffsetBefore("", 0), 2987 - Process.getGidForName(""), (-16777185) - Color.rgb(0, 0, 0), objArr18);
                        o.ea.f.e(strIntern, ((String) objArr18[0]).intern(), e2);
                    }
                    throw new a(c.f22255h, e2.getMessage());
                }
            } catch (Throwable th) {
                httpsURLConnectionB.disconnect();
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new a(c.f22251d, e3.getMessage());
        } catch (o.ce.d e4) {
            throw new a(c.f22253f, e4.getMessage());
        }
    }

    public final void c(String str, o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = B + 121;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.f22314l = str;
        this.f22317o.a(str, aVar);
        int i5 = A + 81;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
    }

    public final void c(o.h.d dVar) {
        int i2 = 2 % 2;
        int i3 = A + 19;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        this.f22319q = dVar;
        int i6 = i4 + 25;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d A[Catch: b -> 0x0287, TryCatch #0 {b -> 0x0287, blocks: (B:60:0x002b, B:62:0x0040, B:64:0x0046, B:65:0x006b, B:67:0x009f, B:69:0x00a3, B:71:0x00a9, B:72:0x00cf, B:74:0x0164, B:76:0x0168, B:77:0x0193, B:79:0x019f, B:80:0x01d9, B:86:0x01f0, B:88:0x0204, B:89:0x0240, B:94:0x0251, B:95:0x0254, B:98:0x0257, B:100:0x025d, B:102:0x0263), top: B:111:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.c():boolean");
    }

    protected final Object clone() throws CloneNotSupportedException {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iMyTid = Process.myTid();
        int iMyTid2 = Process.myTid();
        return c(iMyTid, iFreeMemory, (int) Runtime.getRuntime().maxMemory(), iMyTid2, 233112977, -233112976, new Object[]{this});
    }

    public abstract void d() throws o.ef.b, o.bt.b, o.bu.c, o.bw.d;

    public final void d(int i2) {
        int i3 = 2 % 2;
        int i4 = B + 55;
        int i5 = i4 % 128;
        A = i5;
        if (i4 % 2 == 0) {
            this.f22318p = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f22318p = i2;
        int i6 = i5 + 29;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
    }

    public final void d(Long l2) throws CloneNotSupportedException {
        int iMyTid = Process.myTid();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iMyTid2 = Process.myTid();
        int i3 = 692187901 * f22300g;
        f22300g = i3;
        c(i2, iMyTid, i3, iMyTid2, 1670596800, -1670596796, new Object[]{this, l2});
    }

    public final void d(o.ad.d dVar) {
        int i2 = 2 % 2;
        int i3 = A + 83;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        this.f22321s = dVar;
        int i6 = i4 + 11;
        A = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
    }

    protected final void e(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 59;
        B = i3 % 128;
        int i4 = i3 % 2;
        o.ea.c.a();
        long jG = o.ea.b.g();
        o.ef.a aVar = this.f22317o;
        Object[] objArr = new Object[1];
        E((char) (TextUtils.lastIndexOf("", '0', 0) + 59459), (ViewConfiguration.getTouchSlop() >> 8) + 45, 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) String.valueOf(jG));
        o.ef.a aVar2 = this.f22317o;
        Object[] objArr2 = new Object[1];
        E((char) (24637 - (ViewConfiguration.getTouchSlop() >> 8)), 55 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        aVar2.a(((String) objArr2[0]).intern(), a(z2, jG));
        int i5 = A + 15;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = A + 29;
        B = i3 % 128;
        if (i3 % 2 == 0) {
            return super.equals(obj);
        }
        super.equals(obj);
        throw null;
    }

    public final String f() {
        int i2 = (-1205835066) * f22297a;
        f22297a = i2;
        int iMyUid = Process.myUid();
        int priority = Thread.currentThread().getPriority();
        return (String) c(iMyUid, i2, (int) Process.getElapsedCpuTime(), priority, -1637849138, 1637849138, new Object[]{this});
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 71;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void g() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 83;
        A = i4 % 128;
        this.f22310f = i4 % 2 == 0 ? 20 : 16;
        int i5 = i3 + 31;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final int h() {
        int i2 = 2 % 2;
        int i3 = A + 29;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        int i6 = this.f22310f;
        int i7 = i4 + 15;
        A = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
        return i6;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = A + 13;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            super.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = super.hashCode();
        int i4 = B + 19;
        A = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final o.ef.a i() {
        int i2 = 2 % 2;
        int i3 = B + 123;
        int i4 = i3 % 128;
        A = i4;
        int i5 = i3 % 2;
        o.ef.a aVar = this.f22317o;
        int i6 = i4 + 117;
        B = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    protected final void j() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 121;
        B = i3 % 128;
        int i4 = i3 % 2;
        e(false);
        int i5 = A + 33;
        B = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:
    
        if (r10.f22316n != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
    
        r4 = r10.f22317o;
        r0 = new java.lang.Object[1];
        E((char) (android.widget.ExpandableListView.getPackedPositionChild(0) + 41772), 2396 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), (android.os.Process.myTid() >> 22) + 20, r0);
        r4.a(((java.lang.String) r0[0]).intern(), r10.f22316n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r10.f22316n != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r4 = r10.f22317o;
        r0 = new java.lang.Object[1];
        E((char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 41771), 2396 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 20, r0);
        r4.a(((java.lang.String) r0[0]).intern(), o.ef.a.f23770d);
        r1 = o.cg.f.A + 35;
        o.cg.f.B = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void k() throws java.lang.Throwable {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = o.cg.f.B
            int r1 = r0 + 25
            int r0 = r1 % 128
            o.cg.f.A = r0
            int r1 = r1 % r9
            r5 = 1
            r8 = 0
            if (r1 != 0) goto L47
            java.lang.Long r1 = r10.f22316n
            r0 = 52
            int r0 = r0 / r8
            if (r1 == 0) goto L4c
        L17:
            o.ef.a r4 = r10.f22317o
            r1 = 41772(0xa32c, float:5.8535E-41)
            r6 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionChild(r6)
            int r0 = r0 + r1
            char r3 = (char) r0
            long r1 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            int r2 = 2396 - r0
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 22
            int r1 = r0 + 20
            java.lang.Object[] r0 = new java.lang.Object[r5]
            E(r3, r2, r1, r0)
            r0 = r0[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.intern()
            java.lang.Long r0 = r10.f22316n
            r4.a(r1, r0)
            return
        L47:
            java.lang.Long r0 = r10.f22316n
            if (r0 == 0) goto L4c
            goto L17
        L4c:
            o.ef.a r4 = r10.f22317o
            double r6 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r8)
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 41771(0xa32b, float:5.8534E-41)
            int r1 = r1 + r0
            char r3 = (char) r1
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r2 = 2396 - r0
            int r0 = android.os.Process.getThreadPriority(r8)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r1 = r0 + 20
            java.lang.Object[] r0 = new java.lang.Object[r5]
            E(r3, r2, r1, r0)
            r0 = r0[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.intern()
            java.lang.Object r0 = o.ef.a.f23770d
            r4.a(r1, r0)
            int r0 = o.cg.f.A
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.cg.f.B = r0
            int r1 = r1 % r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.f.k():void");
    }

    protected final void l() throws Throwable {
        int i2 = 2 % 2;
        o.bu.b bVarC = o.bu.e.a().c();
        Object obj = null;
        if (bVarC != null) {
            o.ef.a aVar = this.f22317o;
            Object[] objArr = new Object[1];
            E((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2383 - ((byte) KeyEvent.getModifierMetaStateMask()), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) bVarC.c(this.f22308d));
            int i3 = B + 109;
            A = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = B + 53;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            E((char) TextUtils.indexOf("", "", 0, 0), Color.argb(0, 0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 13, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            E((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 758, (Process.myPid() >> 22) + 59, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        throw new o.bu.c(c.EnumC0345c.f21672a);
    }

    protected final void m() throws Throwable {
        o.ef.a aVar;
        String strIntern;
        Object objC;
        int i2 = 2 % 2;
        int i3 = A + 117;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            aVar = this.f22317o;
            Object[] objArr = new Object[1];
            E((char) ((-1) - Process.getGidForName("")), 32236 - MotionEvent.axisFromString(""), 120 << (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
            int i4 = f22299c * (-1009177125);
            f22299c = i4;
            objC = c(Process.myPid(), i4, Process.myUid(), (int) SystemClock.uptimeMillis(), -1242184795, 1242184797, new Object[0]);
        } else {
            aVar = this.f22317o;
            Object[] objArr2 = new Object[1];
            E((char) ((-1) - Process.getGidForName("")), 2209 - MotionEvent.axisFromString(""), 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i5 = f22299c * (-1009177125);
            f22299c = i5;
            objC = c(Process.myPid(), i5, Process.myUid(), (int) SystemClock.uptimeMillis(), -1242184795, 1242184797, new Object[0]);
        }
        aVar.a(strIntern, objC);
        int i6 = B + 85;
        A = i6 % 128;
        int i7 = i6 % 2;
    }

    protected final void n() throws Throwable {
        o.ef.a aVar;
        Object obj;
        int i2 = 2 % 2;
        int i3 = B + 11;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            aVar = this.f22317o;
            TextUtils.lastIndexOf("", (char) 15, 0);
            Object[] objArr = new Object[1];
            E((char) 0, 31785 - (ViewConfiguration.getScrollBarFadeDuration() - 41), 111 - View.MeasureSpec.getMode(1), objArr);
            obj = objArr[0];
        } else {
            aVar = this.f22317o;
            Object[] objArr2 = new Object[1];
            E((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 2239 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.getMode(0) + 10, objArr2);
            obj = objArr2[0];
        }
        aVar.a(((String) obj).intern(), (Object) x());
    }

    protected final void o() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 41;
        B = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVar = this.f22317o;
        Object[] objArr = new Object[1];
        E((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2224, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        aVar.a(((String) objArr[0]).intern(), r());
        int i5 = A + 95;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final e t() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        E((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - Process.getGidForName(""), 12 - ExpandableListView.getPackedPositionChild(0L), objArr);
        String strIntern = ((String) objArr[0]).intern();
        try {
            d();
            int i3 = B + 81;
            A = i3 % 128;
            if (i3 % 2 == 0) {
                c();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!c()) {
                if (!this.f22309e) {
                    if (o.ea.f.a()) {
                        Object[] objArr2 = new Object[1];
                        E((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43377), Gravity.getAbsoluteGravity(0, 0) + 3172, View.combineMeasuredStates(0, 0) + 49, objArr2);
                        o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                    throw new a(c.f22248a);
                }
                int i4 = A + 45;
                B = i4 % 128;
                int i5 = i4 % 2;
                if (o.ea.f.a()) {
                    int i6 = B + 61;
                    A = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr3 = new Object[1];
                    E((char) (62968 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 3136, 36 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                    o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
                }
                Object[] objArr4 = {this.f22313k};
                int i8 = f22301j * 388491108;
                f22301j = i8;
                return new e((o.ef.a) c((int) Process.getElapsedCpuTime(), i8, new Random().nextInt(1107220882), Process.myPid(), -1931806080, 1931806085, objArr4), true);
            }
            int iMyTid = Process.myTid();
            int iNextInt = new Random().nextInt();
            int i9 = f22298b * (-1740153203);
            f22298b = i9;
            if (!((Boolean) c(iNextInt, iMyTid, new Random().nextInt(), i9, -630666183, 630666186, new Object[]{this})).booleanValue()) {
                if (o.ea.f.a()) {
                    int i10 = A + 29;
                    B = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr5 = new Object[1];
                    E((char) (45951 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 3221, 56 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
                    o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
                }
                throw new a(c.f22249b);
            }
            o.ea.c.a();
            if (o.ea.b.j(this.f22308d)) {
                return b_();
            }
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                E((char) ('0' - AndroidCharacter.getMirror('0')), 3276 - ExpandableListView.getPackedPositionType(0L), 49 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr6);
                o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
            }
            c cVar = c.f22252e;
            Object[] objArr7 = new Object[1];
            E((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3325, 33 - View.getDefaultSize(0, 0), objArr7);
            throw new a(cVar, ((String) objArr7[0]).intern());
        } catch (o.ef.b unused) {
            if (o.ea.f.a()) {
                Object[] objArr8 = new Object[1];
                E((char) (57333 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 3019, 67 - TextUtils.getTrimmedLength(""), objArr8);
                o.ea.f.c(strIntern, ((String) objArr8[0]).intern());
            }
            c cVar2 = c.f22250c;
            Object[] objArr9 = new Object[1];
            E((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 3086 - Color.red(0), 50 - Color.green(0), objArr9);
            throw new a(cVar2, ((String) objArr9[0]).intern());
        }
    }

    public final String toString() {
        String string;
        int i2 = 2 % 2;
        int i3 = A + 15;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            string = super.toString();
            int i4 = 4 / 0;
        } else {
            string = super.toString();
        }
        int i5 = B + 9;
        A = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }
}
