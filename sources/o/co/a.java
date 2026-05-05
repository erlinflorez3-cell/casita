package o.co;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.m;
import o.cl.c;
import o.dl.d;
import o.en.f;
import o.et.a;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
abstract class a<T extends o.et.a> implements c<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22514a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22515b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f22516c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22517d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static short[] f22518e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22519f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22520g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22521h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22522i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f22523j = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, short r10) {
        /*
            int r7 = r10 + 103
            byte[] r6 = o.co.a.$$a
            int r2 = r8 * 4
            int r1 = 1 - r2
            int r0 = r9 * 3
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L29
            r0 = r2
            r7 = r5
            r1 = r3
        L16:
            int r5 = r5 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L16
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.co.a.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22522i = 0;
        f22519f = 1;
        f22521h = 0;
        f22520g = 1;
        c();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f22519f + 101;
        f22522i = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    a() {
    }

    static void c() {
        f22515b = -2031422835;
        f22514a = 1150422455;
        f22517d = 224130634;
        f22516c = new byte[]{-128, -116, -114, 113, -98, 96, 116, -114, -114, 122, 112, -81, 99, 114, -108, 91, -100, -113, 98, 115, -116, -100, -84, 107, -105, 54, 116, -114, -114, 122, 112, -81, 97, -114, 113, 126, -128, -116, -116, -120, 119, 127, -114, -115, -117, 112, 118, -123, -97, 97, -100, 96, -98, MessagePack.Code.FIXARRAY_PREFIX, 108, 119, -114, 112, -117, 115, 120, MessagePack.Code.FIXARRAY_PREFIX, -115, -115, -119, 113, -113, 117, -117, -116, 120, -127, -119, 107, -101, 120, -124, 126, -115, 112, -97, -119, 115, -115, 115, -116, 120, -127, -119, 107, -118, 115, -117, 116, -117, -127, -119, 115, -115, 115, 122, -98, -119, 102, -122, 113, -119, 112, -128, 96, -128, 125, -113, -115, -121, 114, -117, -121, 117, -119, 120, -104, 102, -126, 127, -125, 126, -98, 98, -126, 96, -104, 126, -122, 97, -100, 119, -118, -123, 111, 102, -117, -124, 117, 121, -107, 124, 118, -117, -120, 111, 102, -117, -124, 117, 121, -107, 124, -118, -123, 111, 107, -101, -113, 119, -113, 116, -118, -123, 111, 102, -122, 123, -120, -128, 98, 115, -127, -113, 96, -98, MessagePack.Code.FIXARRAY_PREFIX, 110, 112, -104, 103, 124, -98, 102, -128, 122, -81, 107, -105, 33, -116, -121, MessagePack.Code.FIXARRAY_PREFIX, -95, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -98, 115, 119, 112, 113, -115, -94, -84, 83, 114, 116, -89, 52, 116, -120, -120, -114, 113, 126, MessagePack.Code.MAP32, 54, 116, -114, -116, 124, MessagePack.Code.STR16, 49, 114, 126, -128, 124, -117, 116, -117, -127, 120, -124, MessagePack.Code.EXT16, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -119, -122, -113, 102, -98, MessagePack.Code.EXT16, Utf8.REPLACEMENT_BYTE, 114, 113, -92, 118, 125, -124, -122, 102, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
        f22523j = new char[]{56502, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56560, 56538, 56536, 56560, 56536, 56373, 56369, 56360, 56361, 56504, 56561, 56554, 56323, 56713, 56724, 56729, 56720, 56718, 56717, 56714, 56500, 56558, 56563, 56564, 56557, 56555, 56552, 56545, 56556, 56561, 56550, 56553, 56556, 56552, 56552, 56548, 56555, 56558, 56556, 56558, 56550, 56549, 56554, 56558, 56563, 56497, 56556, 56562, 56503, 56558, 56551, 56545, 56547, 56547, 56556, 56561, 56550, 56544, 56546, 56547, 56556, 56561, 56561, 56560, 56550, 56554, 56561, 56560, 56552, 56549, 56554, 56555, 56555, 56558, 56516, 56334, 56343, 56342, 56342, 56337, 56336, 56333, 56330, 56335, 56336, 56336, 56339, 56342, 56339, 56332, 56326, 56328, 56328, 56337, 56342, 56331, 56527, 56352, 56349, 56375, 56373, 56379, 56377, 56384, 56352, 56346, 56341, 56371, 56397, 56523, 56341, 56331, 56329, 56338, 56336, 56336, 56331, 56562, 56549, 56555, 56525, 56345, 56347, 56526, 56349, 56344, 56344, 56335, 56328, 56337, 56562, 56423, 56422, 56421, 56387, 56383, 56403, 56403, 56424, 56429, 56422, 56417, 56424, 56390, 56383, 56419, 56423, 56419, 56424, 56431, 56424, 56385, 56355, 56355, 56390, 56424, 56424, 56429, 56422, 56417, 56408, 56408, 56425, 56431, 56422, 56421, 56425, 56427};
    }

    private static List<o.cl.b> d(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        new o.dh.e();
        int i3 = f22521h + 1;
        f22520g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i6;
            int i7 = 1136425123 * o.ef.c.f23798a;
            o.ef.c.f23798a = i7;
            if (i5 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i7, i6, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                return arrayList;
            }
            int i8 = f22520g + 5;
            f22521h = i8 % 128;
            int i9 = i8 % 2;
            o.ef.a aVarD = cVar.d(i5);
            Object[] objArr = new Object[1];
            k((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1032258047 + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1237973854) + (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) - 56, (byte) KeyEvent.keyCodeFromString(""), objArr);
            Object[] objArr2 = {aVarD, ((String) objArr[0]).intern()};
            int i10 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i10;
            String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority());
            if (str.length() != 4) {
                Object[] objArr3 = new Object[1];
                l("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{138, 38, 125, 36}, true, objArr3);
                throw new f(((String) objArr3[0]).intern());
            }
            Object[] objArr4 = {str.substring(0, 2)};
            int i11 = d.f23185c * 447039506;
            d.f23185c = i11;
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i12 = d.f23187e * 1037703823;
            d.f23187e = i12;
            byte bByteValue = ((Byte) d.c(708803393, iMyUid, i12, priority, i11, -708803392, objArr4)).byteValue();
            Object[] objArr5 = {str.substring(2, 4)};
            int i13 = d.f23185c * 447039506;
            d.f23185c = i13;
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid2 = Process.myUid();
            int i14 = d.f23187e * 1037703823;
            d.f23187e = i14;
            byte bByteValue2 = ((Byte) d.c(708803393, iMyUid2, i14, priority2, i13, -708803392, objArr5)).byteValue();
            Object[] objArr6 = new Object[1];
            k((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.makeMeasureSpec(0, 0) + 1032258048, (-1237973841) + (ViewConfiguration.getKeyRepeatDelay() >> 16), (-53) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
            byte[] bArrD = aVarD.D(((String) objArr6[0]).intern());
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i15 = o.dh.a.f23009a * (-2093433746);
            o.dh.a.f23009a = i15;
            arrayList.add(new o.cl.b(bByteValue, bByteValue2, o.ei.d.b(bArrD, (byte[]) o.dh.a.a(195285494, iElapsedRealtime, new Random().nextInt(1524627709), new Object[0], i15, -195285492, (int) SystemClock.uptimeMillis()))));
            i5++;
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
        $$b = 22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[PHI: r8
  0x0089: PHI (r8v15 byte[] A[IMMUTABLE_TYPE]) = (r8v7 byte[]), (r8v17 byte[]) binds: [B:24:0x00fa, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.co.a.k(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void l(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str2 = str;
        int i2 = 2 % 2;
        int i3 = $11 + 83;
        $10 = i3 % 128;
        Object bytes = str2;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f22523j;
        if (cArr2 != null) {
            int i9 = $10 + 89;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objA = o.d.d.a(KeyEvent.getDeadChar(i4, i4) + 249, (char) TextUtils.indexOf("", ""), View.resolveSize(i4, i4) + 11, 1376582792, false, $$c(b2, b3, (byte) ((b3 + Ascii.CR) - (b3 & Ascii.CR))), new Class[]{Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i11 = $11 + 105;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(11 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 11, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        int i13 = 15 / 0;
                    } else {
                        int i14 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 11, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 10 - View.getDefaultSize(0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 836, (char) (27327 - AndroidCharacter.getMirror('0')), 11 - ExpandableListView.getPackedPositionType(0L), -1210801192, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 17)))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35714), (ViewConfiguration.getTapTimeout() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
        }
        if (z2) {
            int i17 = $10 + 53;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i6];
            int i19 = 0;
            while (true) {
                mVar.f19943d = i19;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i20 = $11 + 21;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr6[mVar.f19943d] = cArr3[i6 / mVar.f19943d];
                    i19 = mVar.f19943d % 1;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                    i19 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            mVar.f19943d = 0;
            int i21 = $11 + 43;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 3 % 2;
            }
            while (mVar.f19943d < i6) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22521h + 75;
        f22520g = i4 % 128;
        int i5 = i4 % 2;
        o.et.a aVarC = c(str, str2, i2, str3);
        int i6 = f22520g + 93;
        f22521h = i6 % 128;
        if (i6 % 2 == 0) {
            return aVarC;
        }
        throw null;
    }

    public T c(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22520g + 5;
        f22521h = i4 % 128;
        if (i4 % 2 == 0) {
            return (T) e(str, str2, i2, str3);
        }
        e(str, str2, i2, str3);
        throw null;
    }

    abstract void c(List<T> list, o.ef.a aVar) throws o.ef.b;

    @Override // o.cl.c
    public List<T> d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        o.ef.a aVarD;
        int i3;
        String strA;
        boolean z2;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = f22520g + 15;
        f22521h = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 1;
        int i9 = 0;
        try {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                k((short) KeyEvent.normalizeMetaState(0), 1032257792 - (ViewConfiguration.getEdgeSlop() >> 16), (-1237973894) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-34) - View.MeasureSpec.getMode(0), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                k((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (Process.myTid() >> 22) + 1032257815, (-1237973845) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-43) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            }
            ArrayList arrayList = new ArrayList();
            Object[] objArr3 = new Object[1];
            k((short) (Process.myPid() >> 22), 1032257828 - ((Process.getThreadPriority(0) + 20) >> 6), (-1237973847) + View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) - 49, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i10 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i10;
            o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr4, iMyUid, i10, 1398121917, iUptimeMillis, iElapsedRealtime);
            Object[] objArr5 = new Object[1];
            l("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 12, 0, 9}, false, objArr5);
            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int iMyUid2 = Process.myUid();
            int i11 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i11;
            o.ef.c cVar2 = (o.ef.c) o.ef.a.a(-1398121910, objArr6, iMyUid2, i11, 1398121917, iUptimeMillis2, iElapsedRealtime2);
            int i12 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i13 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i13;
                int i14 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i14;
                if (i12 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i14, i13, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar2})).intValue()) {
                    break;
                }
                int i15 = f22521h + 103;
                f22520g = i15 % 128;
                if (i15 % i4 == 0) {
                    aVarD = cVar2.d(i12);
                    int i16 = 83 / i9;
                    i3 = i12 == 0 ? i8 : i9;
                } else {
                    aVarD = cVar2.d(i12);
                    if (i12 == 0) {
                    }
                }
                if ((i3 ^ 1) != i8) {
                    strA = str;
                } else {
                    strA = o.et.a.a(str, i12);
                }
                o.et.a aVarE = e(strA, str2, i2, str3);
                if (i3 == 0) {
                    int i17 = f22521h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f22520g = i17 % 128;
                    int i18 = i17 % i4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                aVarE.d(z2);
                byte[] bArrC = o.dl.b.c(d.e(cVar.e(i12)));
                int i19 = (int) Runtime.getRuntime().totalMemory();
                int id = (int) Thread.currentThread().getId();
                int i20 = o.et.c.f25341f * 1595628892;
                o.et.c.f25341f = i20;
                o.et.c.d(-1863692548, new Object[]{aVarE, bArrC}, i19, 1863692548, id, i20, Process.myUid());
                Object[] objArr7 = new Object[1];
                k((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 1032257836, (-1237973858) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0') - 54, (byte) (Process.myPid() >> 22), objArr7);
                Object[] objArr8 = {aVarE, aVarD.D(((String) objArr7[0]).intern())};
                int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                int i21 = o.et.c.f25349r * 1770900040;
                o.et.c.f25349r = i21;
                int i22 = o.et.c.f25350s * 1440287991;
                o.et.c.f25350s = i22;
                int i23 = o.et.c.f25351t * 985966497;
                o.et.c.f25351t = i23;
                o.et.c.d(486595506, objArr8, iUptimeMillis3, -486595502, i21, i22, i23);
                Object[] objArr9 = new Object[1];
                k((short) (Process.myPid() >> 22), KeyEvent.normalizeMetaState(0) + 1032257838, (-1237973862) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 55, (byte) ('0' - AndroidCharacter.getMirror('0')), objArr9);
                aVarE.e(aVarD.D(((String) objArr9[0]).intern()));
                int iMyPid = Process.myPid();
                int i24 = o.et.c.f25353v * 1073314991;
                o.et.c.f25353v = i24;
                int iMyTid = Process.myTid();
                int i25 = o.et.c.f25354w * 1986112249;
                o.et.c.f25354w = i25;
                aVarE.b(o.dl.b.a((byte[]) o.et.c.d(-1168717246, new Object[]{aVarE}, iMyPid, 1168717251, i24, iMyTid, i25), bArrC));
                byte[] bArrC2 = aVarE.C();
                Object[] objArr10 = new Object[1];
                k((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 1032257840, KeyEvent.getDeadChar(0, 0) - 1237973906, (-54) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                aVarE.a(o.ei.d.d(bArrC2, ((String) objArr10[0]).intern()));
                arrayList.add(aVarE);
                i12++;
                i4 = 2;
                i8 = 1;
                i9 = 0;
            }
            Object[] objArr11 = new Object[1];
            k((short) ((Process.getThreadPriority(i9) + 20) >> 6), 1032257843 - (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFraction(i9, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i9, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1237973876, (ExpandableListView.getPackedPositionForGroup(i9) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i9) == 0L ? 0 : -1)) - 46, (byte) TextUtils.indexOf("", "", i9, i9), objArr11);
            o.ef.a aVarX = aVar.x(((String) objArr11[0]).intern());
            Object[] objArr12 = new Object[1];
            l("\u0000\u0000\u0000\u0000\u0000", new int[]{12, 5, 71, 0}, true, objArr12);
            aVarX.D(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            l("\u0000\u0001\u0000", new int[]{17, 3, 0, 1}, true, objArr13);
            aVarX.D(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            l("\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{20, 8, 168, 4}, false, objArr14);
            aVarX.D(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            k((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1032257854 - View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1237973860, TextUtils.lastIndexOf("", '0', 0, 0) - 49, (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr15);
            aVarX.D(((String) objArr15[0]).intern());
            Object[] objArr16 = new Object[1];
            l("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{28, 25, 0, 0}, false, objArr16);
            aVarX.B(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            l("\u0001\u0001\u0000", new int[]{53, 3, 0, 0}, false, objArr17);
            aVarX.B(((String) objArr17[0]).intern());
            Object[] objArr18 = new Object[1];
            k((short) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') + 1032257862, Process.getGidForName("") - 1237973859, Drawable.resolveOpacity(0, 0) - 41, (byte) KeyEvent.keyCodeFromString(""), objArr18);
            String strS = aVarX.s(((String) objArr18[0]).intern());
            if (strS != null) {
                int i26 = f22521h + 7;
                f22520g = i26 % 128;
                o.ei.c.c(i26 % 2 == 0 ? Integer.parseInt(strS, 19) : Integer.parseInt(strS, 16));
            }
            Object[] objArr19 = new Object[1];
            k((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1032257877 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-1237973861) - ((byte) KeyEvent.getModifierMetaStateMask()), (-42) - Gravity.getAbsoluteGravity(0, 0), (byte) Color.blue(0), objArr19);
            aVarX.z(((String) objArr19[0]).intern());
            Object[] objArr20 = new Object[1];
            k((short) ('0' - AndroidCharacter.getMirror('0')), 1032257892 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1237973855) - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 43, (byte) Drawable.resolveOpacity(0, 0), objArr20);
            aVarX.z(((String) objArr20[0]).intern());
            Object[] objArr21 = new Object[1];
            l("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{56, 26, 0, 0}, false, objArr21);
            aVarX.z(((String) objArr21[0]).intern());
            Object[] objArr22 = new Object[1];
            l("\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{82, 22, 37, 13}, false, objArr22);
            aVarX.z(((String) objArr22[0]).intern());
            Object[] objArr23 = new Object[1];
            k((short) Color.argb(0, 0, 0, 0), 1032257908 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1237973859) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-37) - ImageFormat.getBitsPerPixel(0), (byte) View.combineMeasuredStates(0, 0), objArr23);
            aVarX.z(((String) objArr23[0]).intern());
            Object[] objArr24 = new Object[1];
            l("\u0001\u0000\u0001", new int[]{104, 3, 54, 0}, true, objArr24);
            aVarX.B(((String) objArr24[0]).intern());
            Object[] objArr25 = new Object[1];
            k((short) TextUtils.indexOf("", "", 0, 0), Color.argb(0, 0, 0, 0) + 1032257928, (ViewConfiguration.getTouchSlop() >> 8) - 1237973903, (-56) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
            String strIntern2 = ((String) objArr25[0]).intern();
            Object[] objArr26 = new Object[1];
            k((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1032257929 - Color.red(0), (-1237973847) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 46, (byte) Color.red(0), objArr26);
            new o.dm.b(strIntern2, aVarX.D(((String) objArr26[0]).intern()));
            Object[] objArr27 = new Object[1];
            k((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1032257938, (-1237973903) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-56) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) KeyEvent.keyCodeFromString(""), objArr27);
            String strIntern3 = ((String) objArr27[0]).intern();
            Object[] objArr28 = new Object[1];
            k((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1032257940, (-1237973846) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.blue(0) - 47, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr28);
            new o.dm.b(strIntern3, aVarX.D(((String) objArr28[0]).intern()));
            Object[] objArr29 = new Object[1];
            k((short) Color.green(0), 1032257951 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1237973851) - (ViewConfiguration.getEdgeSlop() >> 16), (-48) - ExpandableListView.getPackedPositionType(0L), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr29);
            byte[] bArrZ = aVarX.z(((String) objArr29[0]).intern());
            if (bArrZ != null) {
                Object[] objArr30 = new Object[1];
                k((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 1032257928, (ViewConfiguration.getJumpTapTimeout() >> 16) - 1237973903, (-56) - Gravity.getAbsoluteGravity(0, 0), (byte) Color.argb(0, 0, 0, 0), objArr30);
                new o.dm.b(((String) objArr30[0]).intern(), bArrZ);
            }
            Object[] objArr31 = new Object[1];
            l(null, new int[]{107, 10, 84, 5}, true, objArr31);
            int i27 = 0;
            byte[] bArrZ2 = aVarX.z(((String) objArr31[0]).intern());
            if (bArrZ2 != null) {
                Object[] objArr32 = new Object[1];
                k((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1032257938 - TextUtils.lastIndexOf("", '0'), (-1237973902) - TextUtils.getOffsetAfter("", 0), Color.argb(0, 0, 0, 0) - 56, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr32);
                new o.dm.b(((String) objArr32[0]).intern(), bArrZ2);
                i27 = 0;
            }
            Object[] objArr33 = new Object[1];
            k((short) View.combineMeasuredStates(i27, i27), 1032257959 - Gravity.getAbsoluteGravity(i27, i27), View.combineMeasuredStates(i27, i27) - 1237973843, (-47) - (KeyEvent.getMaxKeyCode() >> 16), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr33);
            byte[] bArrZ3 = aVarX.z(((String) objArr33[0]).intern());
            if (bArrZ3 != null) {
                Object[] objArr34 = new Object[1];
                k((short) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 1032257928, (-1237973903) - TextUtils.indexOf("", "", 0, 0), Color.argb(0, 0, 0, 0) - 56, (byte) KeyEvent.keyCodeFromString(""), objArr34);
                new o.dm.b(((String) objArr34[0]).intern(), bArrZ3);
            }
            Object[] objArr35 = new Object[1];
            l("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{117, 11, 34, 0}, false, objArr35);
            byte[] bArrZ4 = aVarX.z(((String) objArr35[0]).intern());
            if (bArrZ4 != null) {
                Object[] objArr36 = new Object[1];
                k((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1032257938 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.alpha(0) - 1237973902, (-56) - Color.alpha(0), (byte) View.MeasureSpec.getSize(0), objArr36);
                new o.dm.b(((String) objArr36[0]).intern(), bArrZ4);
            }
            Object[] objArr37 = new Object[1];
            l("\u0000\u0000\u0000", new int[]{128, 3, 53, 0}, false, objArr37);
            aVarX.z(((String) objArr37[0]).intern());
            Object[] objArr38 = new Object[1];
            k((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1032257969 - View.MeasureSpec.makeMeasureSpec(0, 0), (-1237973862) - View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 54, (byte) TextUtils.getOffsetBefore("", 0), objArr38);
            aVarX.z(((String) objArr38[0]).intern());
            Object[] objArr39 = new Object[1];
            k((short) Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1032257971, (Process.myPid() >> 22) - 1237973879, (ViewConfiguration.getPressedStateDuration() >> 16) - 44, (byte) TextUtils.getOffsetBefore("", 0), objArr39);
            aVar.d(((String) objArr39[0]).intern());
            Object[] objArr40 = new Object[1];
            l("\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{131, 7, 45, 4}, false, objArr40);
            Object[] objArr41 = {aVar, ((String) objArr40[0]).intern()};
            int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int iMyUid3 = Process.myUid();
            int i28 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i28;
            List<o.cl.b> listD = d((o.ef.c) o.ef.a.a(-1398121910, objArr41, iMyUid3, i28, 1398121917, iUptimeMillis4, iElapsedRealtime3));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i29 = f22521h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f22520g = i29 % 128;
                int i30 = i29 % 2;
                ((o.et.a) it.next()).a(listD);
            }
            c(arrayList, aVar);
            return arrayList;
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr42 = new Object[1];
            k((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.normalizeMetaState(0) + 1032257984, (-1237973885) + (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr42);
            throw new f(sb2.append(((String) objArr42[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    abstract T e(String str, String str2, int i2, String str3);
}
