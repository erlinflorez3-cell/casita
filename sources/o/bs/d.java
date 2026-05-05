package o.bs;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
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
import com.drew.metadata.iptc.IptcDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Random;
import o.a.f;
import o.a.h;
import o.ea.m;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends SQLiteOpenHelper {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21614a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21615b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21616c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21617d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21618e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f21619f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21620h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f21621i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f21622j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21623k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21624l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21625m = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f21626g;

    public static final class a implements AutoCloseable, Iterator<o.dq.c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char[] f21627g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f21628h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f21629i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static boolean f21630j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static short[] f21631k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f21632l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f21633m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static byte[] f21634n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f21635o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static int f21636p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static int f21637q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static int f21638r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static int f21639s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static int f21640t = 0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static int f21641u = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f21642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Cursor f21645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f21646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o.bs.a f21647f;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, byte r9, byte r10) {
            /*
                int r0 = r8 * 3
                int r8 = 3 - r0
                byte[] r7 = o.bs.d.a.$$c
                int r0 = r10 * 3
                int r6 = 1 - r0
                int r0 = r9 + 67
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r7 != 0) goto L28
                r3 = r8
                r2 = r4
            L13:
                int r0 = -r0
                int r8 = r8 + r0
                r1 = r2
            L16:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r2 != r6) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L23:
                int r3 = r3 + 1
                r0 = r7[r3]
                goto L13
            L28:
                r1 = r4
                r3 = r8
                r8 = r0
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bs.d.a.$$e(byte, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f21641u = -986907633;
            f21639s = 1190866562;
            f21638r = 1236368591;
            f21636p = -1760788839;
            init$0();
            f21640t = 0;
            f21637q = 1;
            f21627g = new char[]{2533, 2503, 2518, 2523, 2500, 2516, 2501, 2526, 2520, 2549, 2519, 2514, 2545, 2525, 2521, 2517, 2345, 2330, 2515, 2522, 2513, 2498, 2512, 2548, 2331, 2328, 2510, 2524, 2536};
            f21628h = 2040400201;
            f21629i = true;
            f21630j = true;
            f21633m = 1903697723;
            f21632l = 1150422416;
            f21635o = -557058984;
            f21634n = new byte[]{-104, 107, -105, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -119, -122, -113, 102, -98, MessagePack.Code.EXT16, 52, 116, -120, 123, -116, -100, 124, MessagePack.Code.ARRAY32, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -100, -113, 99, -120, -128, 98, 115, MessagePack.Code.STR8, 126, -128, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -100, -113, 99, -120, -128, 98, -109, 125, -114, 113, 126, -120, -126, 123, 116, -117, -128, MessagePack.Code.UINT64, 55, 122, MessagePack.Code.FALSE, 33, 114, -117, MessagePack.Code.FALSE, 35, -114, 118, -98, 98, -128, 124, -122, MessagePack.Code.BIN8, Utf8.REPLACEMENT_BYTE, 114, -117, 120, -100, -113, 99, -120, -128, 98, 115, 120, -128, 115, -115, 127, -98, 112, -84, 95, -114, -92, 82, 116, -120, 120, -122, -123, 103, -122, -128, -113, -113, 98, 115, -104, 102, -117, -124, 126, -115, 112, -97, -71, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32, 105, -118, 114, -99, 117, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32};
        }

        a(Context context) {
            this(context, null, 0, 0, 0);
        }

        a(Context context, Cursor cursor, int i2, int i3, int i4) {
            this.f21642a = context;
            this.f21645d = cursor;
            this.f21643b = i2;
            this.f21644c = i3;
            this.f21646e = i4;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:31|(2:103|32)|(2:34|(3:38|106|39))(4:40|96|41|(3:43|44|(1:46))(2:47|(8:49|37|105|54|(4:56|108|57|58)(1:62)|(4:100|64|(2:66|73)(4:67|98|68|69)|(2:(1:78)(1:81)|(2:82|83)))|75|76)(3:50|86|87)))|36|37|105|54|(0)(0)|(0)|75|76) */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b9: ARITH (r8 I:??[int, boolean]) = (r12 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:14:0x01b9 */
        /* JADX WARN: Removed duplicated region for block: B:100:0x056a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x050d A[Catch: Exception -> 0x0567, TRY_LEAVE, TryCatch #6 {Exception -> 0x0567, blocks: (B:54:0x04e8, B:56:0x050d, B:58:0x0558, B:60:0x0560, B:61:0x0566, B:57:0x0517), top: B:105:0x04e8, inners: #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0567  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(int r24, int r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1790
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bs.d.a.d(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{44, -120, 71, -108};
            $$b = 244;
        }

        static void init$1() {
            $$c = new byte[]{Ascii.GS, 50, -104, 42};
            $$d = 132;
        }

        private static void v(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i4 = $10 + 93;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str4.getBytes("ISO-8859-1");
                    throw null;
                }
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            f fVar = new f();
            char[] cArr2 = f21627g;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(View.MeasureSpec.getSize(0) + 593, (char) (13181 - (Process.myTid() >> 22)), 11 - Color.blue(0), -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(f21628h)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 32, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f21630j) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i8 = $10 + 27;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(458 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1923924106, false, $$e(b4, (byte) (6 | b4), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f21629i) {
                fVar.f19923e = iArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = cArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i10 = $10 + 75;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e >>> 1) >>> fVar.f19922a] / i2] * iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(Color.red(0) + 458, (char) (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1923924106, false, $$e(b5, (byte) (6 | b5), b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(1540807955);
                    if (objA5 == null) {
                        byte b6 = (byte) 0;
                        objA5 = o.d.d.a(View.MeasureSpec.getMode(0) + 458, (char) View.MeasureSpec.getMode(0), 11 - View.MeasureSpec.getSize(0), -1923924106, false, $$e(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
            }
            String str5 = new String(cArr6);
            int i11 = $10 + 73;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str5;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x022f A[PHI: r1
  0x022f: PHI (r1v58 int) = (r1v4 int), (r1v61 int) binds: [B:50:0x0244, B:46:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0247 A[PHI: r1
  0x0247: PHI (r1v5 int) = (r1v4 int), (r1v61 int) binds: [B:50:0x0244, B:46:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void w(short r28, int r29, int r30, int r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 906
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bs.d.a.w(short, int, int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void x(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r0 = r8 * 3
                int r8 = 1 - r0
                int r0 = r7 * 2
                int r7 = 4 - r0
                int r0 = r6 * 2
                int r0 = 100 - r0
                byte[] r6 = o.bs.d.a.$$a
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L2b
                r1 = r7
                r3 = r4
            L15:
                int r7 = r7 + r0
                int r1 = r1 + 1
                r2 = r3
            L19:
                int r3 = r2 + 1
                byte r0 = (byte) r7
                r5[r2] = r0
                if (r3 != r8) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r9[r4] = r0
                return
            L28:
                r0 = r6[r1]
                goto L15
            L2b:
                r2 = r4
                r1 = r7
                r7 = r0
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bs.d.a.x(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [int[], java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v4, types: [o.dq.c] */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final o.dq.c a() throws Throwable {
            String strIntern;
            Object obj;
            int i2 = 2 % 2;
            int i3 = f21640t + 23;
            f21637q = i3 % 128;
            int i4 = i3 % 2;
            Cursor cursor = this.f21645d;
            if (cursor == null || cursor.isAfterLast()) {
                Object[] objArr = new Object[1];
                w((short) (ViewConfiguration.getLongPressTimeout() >> 16), (-904532612) + (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 1705379487, (-29) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                throw new IndexOutOfBoundsException(((String) objArr[0]).intern());
            }
            o.dk.a aVar = new o.dk.a(this.f21642a);
            this.f21647f = o.bs.a.b(this.f21645d.getInt(this.f21643b));
            String strC = aVar.c(this.f21645d.getString(this.f21644c));
            String string = this.f21645d.getString(this.f21646e);
            o.dq.c cVar = 0;
            ?? E = 0;
            cVar = 0;
            if (this.f21647f != null && strC != null && !strC.isEmpty()) {
                try {
                    E = c.e(new o.ef.a(strC), string);
                    cVar = E;
                } catch (o.ef.b e2) {
                    cVar = E;
                    if (o.ea.f.a()) {
                        Object[] objArr2 = new Object[1];
                        v((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, E, E, "\u0082\u008c\u008f\u008e\u008c\u008d\u008c\u0085\u0083\u008b\u0083\u0087\u0083\u008a\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
                        String strIntern2 = ((String) objArr2[0]).intern();
                        Object[] objArr3 = new Object[1];
                        w((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-904532662) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1705379485, (-30) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr3);
                        o.ea.f.e(strIntern2, ((String) objArr3[0]).intern(), e2);
                        cVar = E;
                    }
                }
            } else if (o.ea.f.a()) {
                int i5 = f21637q + 89;
                f21640t = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    v(1892 >> (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0082\u008c\u008f\u008e\u008c\u008d\u008c\u0085\u0083\u008b\u0083\u0087\u0083\u008a\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
                    strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    v(8026 >>> AndroidCharacter.getMirror((char) 0), null, null, "\u008b\u0089\u008e\u008b\u0091\u0090\u008c\u0082\u008c\u0095\u008f\u0088\u0086\u0091\u0094\u0089\u0082\u0093\u0091\u0090\u008c\u0082\u0089\u0087\u0085\u008c\u0082\u0091\u008c\u008b\u0091\u0087\u0089\u0084\u0084\u0083\u0086\u0091\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0087\u0091\u0092\u0091\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081\u0090\u0083\u008c\u0082", objArr5);
                    obj = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    v(128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0082\u008c\u008f\u008e\u008c\u008d\u008c\u0085\u0083\u008b\u0083\u0087\u0083\u008a\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr6);
                    strIntern = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    v(175 - AndroidCharacter.getMirror('0'), null, null, "\u008b\u0089\u008e\u008b\u0091\u0090\u008c\u0082\u008c\u0095\u008f\u0088\u0086\u0091\u0094\u0089\u0082\u0093\u0091\u0090\u008c\u0082\u0089\u0087\u0085\u008c\u0082\u0091\u008c\u008b\u0091\u0087\u0089\u0084\u0084\u0083\u0086\u0091\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0087\u0091\u0092\u0091\u0084\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081\u0090\u0083\u008c\u0082", objArr7);
                    obj = objArr7[0];
                }
                o.ea.f.d(strIntern, ((String) obj).intern());
            }
            this.f21645d.moveToNext();
            return cVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            int i2 = 2 % 2;
            int i3 = f21640t + 39;
            int i4 = i3 % 128;
            f21637q = i4;
            int i5 = i3 % 2;
            Cursor cursor = this.f21645d;
            if (cursor != null) {
                int i6 = i4 + 15;
                f21640t = i6 % 128;
                int i7 = i6 % 2;
                if (!cursor.isClosed()) {
                    int i8 = f21637q + 99;
                    f21640t = i8 % 128;
                    if (i8 % 2 != 0) {
                        this.f21645d.close();
                        int i9 = 97 / 0;
                    } else {
                        this.f21645d.close();
                    }
                }
            }
            int i10 = f21637q + 53;
            f21640t = i10 % 128;
            int i11 = i10 % 2;
        }

        public final o.bs.a d() {
            int i2 = 2 % 2;
            int i3 = f21637q + 113;
            int i4 = i3 % 128;
            f21640t = i4;
            int i5 = i3 % 2;
            o.bs.a aVar = this.f21647f;
            int i6 = i4 + 15;
            f21637q = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 83 / 0;
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i2 = 2 % 2;
            int i3 = f21640t + 45;
            int i4 = i3 % 128;
            f21637q = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            Cursor cursor = this.f21645d;
            if (cursor != null) {
                int i5 = i4 + 117;
                f21640t = i5 % 128;
                int i6 = i5 % 2;
                boolean zIsAfterLast = cursor.isAfterLast();
                if (i6 != 0) {
                    int i7 = 73 / 0;
                    if (!zIsAfterLast) {
                        return true;
                    }
                } else if (!zIsAfterLast) {
                    return true;
                }
            }
            int i8 = f21637q + 33;
            f21640t = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ o.dq.c next() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21637q + 31;
            f21640t = i3 % 128;
            int i4 = i3 % 2;
            o.dq.c cVarA = a();
            int i5 = f21637q + 77;
            f21640t = i5 % 128;
            int i6 = i5 % 2;
            return cVarA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, short r10) {
        /*
            int r7 = r10 + 102
            int r6 = r8 * 3
            int r1 = r6 + 1
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = o.bs.d.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L28
            r7 = r6
            r1 = r5
            r0 = r2
        L14:
            int r5 = r5 + 1
            int r7 = r7 + r1
            r1 = r0
        L18:
            byte r0 = (byte) r7
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r1 = r4[r5]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.d.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21614a = 2040082137;
        f21615b = 56312028;
        f21617d = -1026233114;
        f21616c = 479573801;
        f21618e = 553857937;
        f21623k = 0;
        f21624l = 1;
        f21620h = 0;
        f21625m = 1;
        b();
        View.MeasureSpec.getMode(0);
        View.resolveSizeAndState(0, 0, 0);
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getLongPressTimeout();
        int i2 = f21623k + 39;
        f21624l = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) throws Throwable {
        Object[] objArr = new Object[1];
        n("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000", new int[]{0, 16, 0, 0}, false, objArr);
        super(context, ((String) objArr[0]).intern(), (SQLiteDatabase.CursorFactory) null, 11);
        long jA = a(context);
        this.f21626g = jA;
        if (jA == -1 || e() <= jA) {
            return;
        }
        d();
    }

    private static int a(Context context) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        int i4 = f21620h + 85;
        f21625m = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                o((-16777177) / Color.rgb(0, 1, 0), "\b'\u0005\u000b\u001a\u0006 \u0010\u001f$\u0005\u0012\u0010\u001f&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u00180 0\u0001!#\u000f\u001a\b\u0006\u0007\u001c)㙅", (byte) (2 - TextUtils.getOffsetAfter("", 0)), objArr);
                i2 = Integer.parseInt(m.d(context, ((String) objArr[0]).intern()));
                if (i2 < 0) {
                    int i5 = f21625m + 21;
                    f21620h = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = -1;
                }
            } else {
                Object[] objArr2 = new Object[1];
                o((-16777177) - Color.rgb(0, 0, 0), "\b'\u0005\u000b\u001a\u0006 \u0010\u001f$\u0005\u0012\u0010\u001f&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u00180 0\u0001!#\u000f\u001a\b\u0006\u0007\u001c)㙅", (byte) (70 - TextUtils.getOffsetAfter("", 0)), objArr2);
                i2 = Integer.parseInt(m.d(context, ((String) objArr2[0]).intern()));
                if (i2 < 0) {
                    int i52 = f21625m + 21;
                    f21620h = i52 % 128;
                    int i62 = i52 % 2;
                    i2 = -1;
                }
            }
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                o((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24, "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10), objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{136, 37, 195, 23}, true, objArr4);
                o.ea.f.c(strIntern, sb.append(((String) objArr4[0]).intern()).append(i2).toString());
            }
            return i2;
        } catch (PackageManager.NameNotFoundException unused) {
            if (!o.ea.f.a()) {
                return -1;
            }
            Object[] objArr5 = new Object[1];
            o(24 - TextUtils.lastIndexOf("", '0', 0, 0), "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) (10 - Gravity.getAbsoluteGravity(0, 0)), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            n("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{173, 66, 0, 8}, true, objArr6);
            o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
            int i7 = f21625m + 77;
            f21620h = i7 % 128;
            int i8 = i7 % 2;
            return -1;
        }
    }

    static void b() {
        char[] cArr = new char[623];
        ByteBuffer.wrap("ÜªÜãÜéÜçÜðÜêÜâÜëÜîÜìÜîÜÙÜÃÜ¸ÜÉÜãÜÒÜýÜéÜ\u0000Ü\u0006Ü\u0001ÜûÜûÜ\u0000ÜôÜÛÜöÜ\u001eÜ\"Ü\u001aÜ\u001eÜ+Ü)Ü\u001fÜ÷ÜéÜ\u0000Ü\u0006Ü\u0001ÜûÜûÜ\u0000ÜòÜçÜôÜÿÜ\u0000ÜøÜÿÜ\u0001ÜçÜïÜÿÜöÜüÜýÜçÜÿÜ\u001fÜ\u0016Ü\u001cÜ\u001dÜ\u0017Ü\u001eÜ(Ü\u001eÜ\u001cÜ%Ü\u001fÜ\u0017Ü Ü#Ü!Ü#ÜüÜÙÜúÜ\u001eÜ\"Ü\u001aÜ\u0019Ü\u001bÜ÷ÜðÜ\u0000ÜþÜÿÜúÜùÜþÜòÜâÜçÜâÜÙÜíÜ\u0006Ü\u0002Ü\u0000ÜüÜþÜ\nÜñÜêÜýÜ\u0004Ü÷ÜÛÜöÜ\u001eÜ\"Ü\u001aÜ\u0015Ü\u001cÜ\"Ü\u001dÜöÜïÜ\u0001Ü\u0003Ü\u000bÜõÜÛÜöÜ\u001eÜ\"Ü\u001aÜ\u001eÜ#Ü Ü\u001eÜ!Ü(Ü\u001fÜ\u001cÜ\u0018ÝªÝªÝ\u0089ÜiÜiÝ\u0085Ý²Ý´Ý¡Ý¨Ý¯Ý\u009aÝ¦Ý¸Ý³Ý´Ý¶Ý±Ý\u009bÝ¡Ý¯Ý©Ý\u0086ÜpÜpÝ\u0085Ý°Ý³Ý©Ý®Ý\u008eÝ\u008dÝ¶Ý¯Ý¨ÝªÜ·ÜñÜóÜîÜØÜÞÜìÜæÜæÜíÜðÜæÜëÜËÜÊÜðÜðÜëÜãÜåÜäÜÂÜÃÜêÜëÜîÜôÜÊÜ¦Ü¦ÜÂÜéÜñÜòÜêÜÃÜÊÜñÜîÜÇÜÂÜíÜðÜæÜëÜËÜÊÜóÜìÜåÜçÜëÜçÜçÜÆÜ¦Ü¦ÜÂÜïÜñÜÞÜåÜìÜ×ÜãÜõÜ±ÜéÜíÜåÜäÜæÜ·ÜíÜçÜàÜåÜíÜéÜâÜ(Ü5Ü8Ü,Ü9Ü6Ü*Ü=Ü<Ü.Ü6Ü2Ü=Ü±ÜéÜíÜåÜéÜöÜôÜêÜÈÜ\u0011Ü\u000fÜ\u0011Ü\u000eÜ\u0005Ü\rÜ\u0013Ü\nÜ\fÜ\u0016Ü\fÜ\u0005Ü\u000bÜ\nÜ\u0004Ü\rÜËÜ\u0010Ü\rÜ\u000bÜ\u000eÜ\u0015Ü\fÜ\tÜ\u0010ÜêÜÒÜìÜíÜõÜ\u000bÜ\u000fÜ\u0007Ü\u0098ÜâÜKÜOÜGÜFÜHÜ$Ü\u0010Ü\u001fÜ\u0010Ü\u0011ÜÜÜ2Ü*Ü)Ü#Ü*Ü0Ü.Ü7Ü1Ü)Ü2Ü5Ü3Ü5Ü\u000eÜíÜíÜ\u0011Ü:Ü0Ü.Ü7Ü1Ü)Ü2Ü5Ü3Ü5Ü\u000eÜ\bÜ)Ü.Ü5Ü5Ü8Ü\u0011Ü\bÜ*Ü\tÜ\u0010Ü2Ü3Ü:Ü8Ü7Ü2Ü+Ü\tÜ\nÜ3Ü7Ü5Ü\rÜ\bÜ-Ü3Ü3Ü-Ü2Ü2Ü+Ü\tÜ\bÜ.Ü4Ü/ÜÎÜ@ÜgÜhÜkÜqÜGÜIÜjÜ>Ü?Ü_Ü`ÜiÜpÜmÜhÜAÜAÜbÜhÜgÜ^Ü>ÜDÜhÜAÜFÜmÜkÜiÜkÜhÜ_ÜgÜmÜdÜfÜpÜGÜ?Ü_ÜeÜjÜCÜ#ÜEÜaÜaÜfÜfÜfÜjÜkÜfÜaÜhÜFÜGÜnÜkÜDÜFÜkÜAÜGÜkÜhÜhÜgÜCÜFÜgÜ=Ü%Ü,Ü#Ü@ÜgÜhÜkÜpÜgÜeÜEÜ#Ü#ÜFÜmÜkÜiÜkÜhÜ_ÜgÜmÜdÜfÜ`ÜYÜ_Ü`ÜhÜoÜoÜhÜiÜiÜfÜdÜfÜfÜeÜEÜGÜkÜhÜhÜgÜCÜ Ü ÜGÜiÜiÜiÜcÜgÜ¹ÜëÜãÜâÜÜÜãÜéÜçÜðÜêÜâÜëÜîÜìÜîÜðÜÉÜ¦Ü¦ÜÇÜêÜæÜìÜìÜìÜÊÜÄÜîÜÉÜÇÜéÜæÜäÜêÜîÜïÜíÜÂÜ¦Ü¦Ü¹ÜÛÜêÜîÜæÜâÜäÜÂÜËÜðÜîÜîÜÄÜ¨ÜÃÜ\u001bÜ2Ü\u001eÜ\u000bÜ\u009fÜÌÜ\u009eÜ¼Ü®ÜÁÜéÜíÜåÜéÜîÜëÜéÜìÜóÜêÜçÜîÜÈÜ\u0090Ü\u00adÜ\u00adÜÉÜìÜéÜëÜêÜÆÜÂÜäÜìÜìÜèÜèÜäÜÂÜ¦Ü¦ÜÌÜõÜðÜñÜóÜîÜØÜÜÜïÜðÜê".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 623);
        f21621i = cArr;
        f21622j = new char[]{64605, 64608, 64517, 64603, 64523, 64593, 64538, 64634, 64583, 64609, 64636, 64579, 64580, 64630, 64604, 64532, 64584, 64582, 64585, 64589, 64520, 64614, 64616, 64578, 64619, 64620, 64521, 64587, 64602, 64586, 64576, 64594, 64631, 64615, 64588, 64607, 64599, 64625, 64597, 64543, 64623, 64536, 64618, 64617, 64611, 64621, 64598, 64577, 64527};
        f21619f = (char) 51640;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f21625m + 29;
        f21620h = i3 % 128;
        int i4 = i3 % 2;
        SQLiteDatabase writableDatabase = dVar.getWritableDatabase();
        try {
            Object[] objArr2 = new Object[1];
            o(TextUtils.getTrimmedLength("") + 10, "\u000f\u001f\u000e\u000b!0\u0006%\u0003\u0000", (byte) (55 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
            Object[] objArr3 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr3);
            writableDatabase.delete(((String) objArr3[0]).intern(), ((String) objArr2[0]).intern(), new String[]{str});
            if (writableDatabase == null) {
                int i5 = f21620h + 9;
                f21625m = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i6 = f21625m + 37;
            f21620h = i6 % 128;
            if (i6 % 2 == 0) {
                writableDatabase.close();
                return null;
            }
            writableDatabase.close();
            throw null;
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void d() {
        long j2;
        int i2 = 2 % 2;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        try {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            o(77 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\b\u0006\u0001\b\u0017#\u0006,\t\u0002\u001c.\u0017\u0001\f\u0013\u000b\u000f\u001c\t\u0001(\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\u0006.\u001c\b\u0002\u001e\u0004\u001f\f\u0003\u0010 \u000f\f\u0000\u001e\u0014 ,\f\u0013\u0011%\t\u0010\u0006\b\u0017\u0000\u0001,\u001a\u0017\u0017'\u0001\u0010\u0000,㘉㘉\b\u0006,\t", (byte) (44 - MotionEvent.axisFromString("")), objArr);
            Cursor cursorRawQuery = readableDatabase.rawQuery(sb.append(((String) objArr[0]).intern()).append(this.f21626g).toString(), null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() != 0) {
                Object[] objArr2 = new Object[1];
                n(null, new int[]{253, 13, 73, 4}, true, objArr2);
                int columnIndex = cursorRawQuery.getColumnIndex(((String) objArr2[0]).intern());
                if (cursorRawQuery.moveToNext()) {
                    int i3 = f21625m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f21620h = i3 % 128;
                    if (i3 % 2 != 0) {
                        j2 = cursorRawQuery.getLong(columnIndex);
                        int i4 = 2 / 0;
                    } else {
                        j2 = cursorRawQuery.getLong(columnIndex);
                    }
                } else {
                    j2 = 0;
                }
                cursorRawQuery.close();
                Object[] objArr3 = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                n("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{576, 17, 0, 3}, false, objArr4);
                int iDelete = readableDatabase.delete(strIntern, sb2.append(((String) objArr4[0]).intern()).append(j2).toString(), null);
                if (o.ea.f.a()) {
                    Object[] objArr5 = new Object[1];
                    o(Color.blue(0) + 25, "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10), objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr6 = new Object[1];
                    n("\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{593, 30, 0, 0}, true, objArr6);
                    o.ea.f.c(strIntern2, sb3.append(((String) objArr6[0]).intern()).append(iDelete).toString());
                }
                if (readableDatabase != null) {
                    int i5 = f21625m + 29;
                    f21620h = i5 % 128;
                    int i6 = i5 % 2;
                    readableDatabase.close();
                    return;
                }
                return;
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
        } catch (Throwable th) {
            if (readableDatabase != null) {
                try {
                    readableDatabase.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private long e() {
        long jQueryNumEntries;
        SQLiteDatabase sQLiteDatabase;
        int i2 = 2 % 2;
        int i3 = f21620h + 85;
        f21625m = i3 % 128;
        SQLiteDatabase sQLiteDatabase2 = i3 % 2;
        try {
            if (sQLiteDatabase2 == 0) {
                SQLiteDatabase readableDatabase = getReadableDatabase();
                Object[] objArr = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr);
                jQueryNumEntries = DatabaseUtils.queryNumEntries(readableDatabase, ((String) objArr[0]).intern());
                sQLiteDatabase = readableDatabase;
                sQLiteDatabase2 = readableDatabase;
                if (readableDatabase != null) {
                    sQLiteDatabase.close();
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            } else {
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                Object[] objArr2 = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr2);
                jQueryNumEntries = DatabaseUtils.queryNumEntries(readableDatabase2, ((String) objArr2[0]).intern());
                sQLiteDatabase2 = readableDatabase2;
                if (readableDatabase2 != null) {
                    sQLiteDatabase = readableDatabase2;
                    sQLiteDatabase.close();
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            }
            return jQueryNumEntries;
        } catch (Throwable th) {
            if (sQLiteDatabase2 != 0) {
                try {
                    sQLiteDatabase2.close();
                    int i4 = f21620h + 43;
                    f21625m = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        Object obj;
        int i8 = ~i3;
        int i9 = ~((i8 + i5) - (i8 & i5));
        int i10 = ~i6;
        int i11 = (-1) - (((-1) - i9) & ((-1) - (~(i10 | i5))));
        int i12 = ~i5;
        int i13 = ~((-1) - (((-1) - i12) & ((-1) - i10)));
        int i14 = ~((i12 + i3) - (i12 & i3));
        int i15 = i13 | i14;
        int i16 = ~((i10 + i3) - (i10 & i3));
        int i17 = (i16 + i15) - (i16 & i15);
        int i18 = (-1) - (((-1) - (~((-1) - (((-1) - i6) & ((-1) - i12))))) & ((-1) - i14));
        int i19 = i3 + i5 + i7 + (1039959776 * i2) + ((-2046201414) * i4);
        int i20 = i19 * i19;
        int i21 = ((357140864 * i3) - 8388608) + ((-1785926397) * i5) + ((-2146011519) * i11) + (i17 * 2146011519) + (2146011519 * i18) + ((-1788870656) * i7) + ((-201326592) * i2) + ((-406847488) * i4) + (529399808 * i20);
        int i22 = ((i3 * 868240256) - 1765242424) + (i5 * 868238279) + (i11 * (-659)) + (i17 * 659) + (i18 * 659) + (i7 * 868239597) + (i2 * 817356128) + (i4 * 406493490) + (i20 * 645267456);
        if (i21 + (i22 * i22 * 681705472) == 1) {
            return d(objArr);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) objArr[1];
        int i23 = 2 % 2;
        int i24 = f21620h + 91;
        f21625m = i24 % 128;
        if (i24 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{16, 120, 53, 29}, false, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{16, 120, 53, 29}, false, objArr3);
            obj = objArr3[0];
        }
        sQLiteDatabase.execSQL(((String) obj).intern());
        int i25 = f21620h + 67;
        f21625m = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$b = 65;
    }

    private static void n(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = f21621i;
        if (cArr2 != null) {
            int i11 = $10 + 37;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i7 = 0;
            }
            while (i7 < length) {
                int i12 = $10 + 53;
                $11 = i12 % 128;
                if (i12 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objA = o.d.d.a(249 - View.MeasureSpec.getMode(i5), (char) (Process.myTid() >> 22), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1376582792, false, $$c(b2, b3, (byte) (14 | b3)), new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(Color.green(0) + 249, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), 1376582792, false, $$c(b4, b5, (byte) ((b5 + Ascii.SO) - (14 & b5))), new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                int i13 = $10 + 5;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i3 = 2;
                i5 = 0;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr2, i6, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                int i15 = $11 + 115;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i17 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 11, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.rgb(0, 0, 0) + 16777226, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i18 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a(836 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 27279), 10 - TextUtils.lastIndexOf("", '0', 0), -1210801192, false, $$c(b6, b7, (byte) ((b7 + Ascii.DC2) - (18 & b7))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 21, (char) (35715 - Drawable.resolveOpacity(0, 0)), 11 - Color.alpha(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i19 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i19, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i19);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i21 = $11 + 103;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i20 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void o(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f21622j;
        long j2 = 0;
        if (cArr2 != null) {
            int i8 = $10 + 77;
            int i9 = i8 % 128;
            $11 = i9;
            int i10 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = i9 + 43;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length) {
                int i14 = $10 + 59;
                $11 = i14 % 128;
                int i15 = i14 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object objA = o.d.d.a(421932776);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(270 - ExpandableListView.getPackedPositionGroup(j2), (char) KeyEvent.getDeadChar(0, 0), 11 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i13++;
                    i4 = 2;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f21619f)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\n';
        char c3 = '\b';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(269 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i16 = $10 + 85;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                int i17 = $10 + 25;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    int i19 = $10 + 69;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c * b2);
                        cArr4[hVar.f19926b % 1] = (char) (hVar.f19925a % b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[c2] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, -611683395, false, $$c(b7, b8, (byte) (9 | b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c3 = '\b';
                            c2 = '\n';
                            objA4 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + JfifUtil.MARKER_SOS, (char) TextUtils.indexOf("", "", 0), Gravity.getAbsoluteGravity(0, 0) + 11, 212688716, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = '\b';
                            c2 = '\n';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i20];
                    } else {
                        c3 = '\b';
                        c2 = '\n';
                        if (hVar.f19928d == hVar.f19929e) {
                            int i21 = $10 + 107;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i23 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i24 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i23];
                            cArr4[hVar.f19926b + 1] = cArr2[i24];
                        } else {
                            int i25 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i26 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i25];
                            cArr4[hVar.f19926b + 1] = cArr2[i26];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i27 = 0; i27 < i2; i27++) {
            cArr4[i27] = (char) (cArr4[i27] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final void b(String str) throws Throwable {
        int iNextInt = new Random().nextInt();
        int i2 = f21617d * 635033288;
        f21617d = i2;
        int i3 = 716764378 * f21615b;
        f21615b = i3;
        int i4 = f21614a * (-1681288992);
        f21614a = i4;
        e(i3, -1697204815, i4, 1697204816, new Object[]{this, str}, iNextInt, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.dq.c c(android.content.Context r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.d.c(android.content.Context, java.lang.String):o.dq.c");
    }

    public final void c(Context context, o.dq.c cVar) throws Throwable {
        int i2 = 2 % 2;
        try {
            o.ef.a aVarA = b.a(cVar);
            int i3 = f21625m + 17;
            f21620h = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 3;
            }
            String strE = new o.dk.a(context).e(aVarA.e());
            ContentValues contentValues = new ContentValues();
            Object[] objArr = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{245, 8, 0, 7}, true, objArr);
            contentValues.put(((String) objArr[0]).intern(), strE);
            Object[] objArr2 = new Object[1];
            n(null, new int[]{253, 13, 73, 4}, true, objArr2);
            contentValues.put(((String) objArr2[0]).intern(), Long.valueOf(cVar.s().getTime()));
            Object[] objArr3 = new Object[1];
            o(10 - Drawable.resolveOpacity(0, 0), "\u000f\u001f\u000e\u000b!0\u0006%\u0003\u0000", (byte) ('g' - AndroidCharacter.getMirror('0')), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            String[] strArr = {cVar.a()};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                Object[] objArr4 = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr4);
                writableDatabase.update(((String) objArr4[0]).intern(), contentValues, strIntern, strArr);
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                        int i5 = f21620h + 57;
                        f21625m = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                o(26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) (10 - Drawable.resolveOpacity(0, 0)), objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                o(TextUtils.indexOf((CharSequence) "", '0') + 63, "\u001d&!\u0006%,(\b\u00190\n\u0013\u0006!\"\u0016\u0006\u0010\u0005\t\u000f$(\u0001)\"\u0018\u001b\u0005%\u00070\u0016\u0003\u0003\u000e\u001f%\u0006!\"\u0016\u0001\u001e\u0017\u0006, )\u001d\u000b\u0013\u001c)\u0013\f\u001c\u001e\u0017\u0006%\u0004", (byte) (View.resolveSize(0, 0) + 63), objArr6);
                o.ea.f.d(strIntern2, sb.append(((String) objArr6[0]).intern()).append(e2).toString());
            }
        }
    }

    public final void c(String str, o.bs.a aVar) throws Throwable {
        int i2 = 2 % 2;
        ContentValues contentValues = new ContentValues();
        Object[] objArr = new Object[1];
        n("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{266, 8, 0, 8}, false, objArr);
        contentValues.put(((String) objArr[0]).intern(), Integer.valueOf(aVar.c()));
        Object[] objArr2 = new Object[1];
        o(10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000f\u001f\u000e\u000b!0\u0006%\u0003\u0000", (byte) (55 - View.MeasureSpec.getSize(0)), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        String[] strArr = {str};
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            Object[] objArr3 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr3);
            writableDatabase.update(((String) objArr3[0]).intern(), contentValues, strIntern, strArr);
            if (writableDatabase != null) {
                int i3 = f21625m + 113;
                f21620h = i3 % 128;
                if (i3 % 2 != 0) {
                    writableDatabase.close();
                    int i4 = 57 / 0;
                } else {
                    writableDatabase.close();
                }
                int i5 = f21620h + 25;
                f21625m = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.close();
                    int i6 = f21625m + 121;
                    f21620h = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void d(Context context, o.dq.c cVar, o.bs.a aVar) throws Throwable {
        o.ef.a aVarA;
        Cursor cursorQuery;
        int i2 = 2 % 2;
        int i3 = f21625m + 3;
        f21620h = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                aVarA = b.a(cVar);
                int i4 = 2 / 0;
            } else {
                aVarA = b.a(cVar);
            }
            String strE = new o.dk.a(context).e(aVarA.e());
            ContentValues contentValues = new ContentValues();
            Object[] objArr = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{239, 6, 0, 0}, false, objArr);
            contentValues.put(((String) objArr[0]).intern(), cVar.a());
            Object[] objArr2 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{245, 8, 0, 7}, true, objArr2);
            contentValues.put(((String) objArr2[0]).intern(), strE);
            Object[] objArr3 = new Object[1];
            Object obj = null;
            n(null, new int[]{253, 13, 73, 4}, true, objArr3);
            contentValues.put(((String) objArr3[0]).intern(), Long.valueOf(cVar.s().getTime()));
            Object[] objArr4 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{266, 8, 0, 8}, false, objArr4);
            contentValues.put(((String) objArr4[0]).intern(), Integer.valueOf(aVar.c()));
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                Object[] objArr5 = new Object[1];
                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr5);
                writableDatabase.insert(((String) objArr5[0]).intern(), null, contentValues);
                if (writableDatabase != null) {
                    int i5 = f21620h + 73;
                    f21625m = i5 % 128;
                    int i6 = i5 % 2;
                    writableDatabase.close();
                }
                if (this.f21626g != -1 && e() > this.f21626g) {
                    writableDatabase = getWritableDatabase();
                    try {
                        Object[] objArr6 = new Object[1];
                        n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr6);
                        String strIntern = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        n("\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{239, 6, 0, 0}, false, objArr7);
                        String[] strArr = {((String) objArr7[0]).intern()};
                        Object[] objArr8 = new Object[1];
                        n("\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{291, 17, 34, 13}, false, objArr8);
                        String strIntern2 = ((String) objArr8[0]).intern();
                        Object[] objArr9 = new Object[1];
                        n("\u0001", new int[]{308, 1, 0, 1}, true, objArr9);
                        cursorQuery = writableDatabase.query(strIntern, strArr, null, null, null, null, strIntern2, ((String) objArr9[0]).intern());
                    } finally {
                    }
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToNext()) {
                                Object[] objArr10 = new Object[1];
                                n("\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{239, 6, 0, 0}, false, objArr10);
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex(((String) objArr10[0]).intern()));
                                Object[] objArr11 = new Object[1];
                                n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr11);
                                String strIntern3 = ((String) objArr11[0]).intern();
                                Object[] objArr12 = new Object[1];
                                n("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{309, 11, 98, 0}, false, objArr12);
                                writableDatabase.delete(strIntern3, ((String) objArr12[0]).intern(), new String[]{string});
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (writableDatabase != null) {
                                    int i7 = f21625m + 45;
                                    f21620h = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        writableDatabase.close();
                                        return;
                                    } else {
                                        writableDatabase.close();
                                        int i8 = 11 / 0;
                                        return;
                                    }
                                }
                                return;
                            }
                        } finally {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase != null) {
                        int i9 = f21620h + 67;
                        f21625m = i9 % 128;
                        if (i9 % 2 != 0) {
                            writableDatabase.close();
                        } else {
                            writableDatabase.close();
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            } finally {
            }
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr13 = new Object[1];
                o(25 - View.getDefaultSize(0, 0), "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) (10 - ExpandableListView.getPackedPositionGroup(0L)), objArr13);
                String strIntern4 = ((String) objArr13[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr14 = new Object[1];
                o(View.resolveSizeAndState(0, 0, 0) + 62, "\u001d&!\u0006%,(\b\u00190\n\u0013\u0006!\"\u0016\u0006\u0010\u0005\t\u000f$(\u0001)\"\u0018\u001b\u0005%\u00070\u0016\u0003\u0003\u000e\u001f%\u0006!\"\u0016\u0001\u001e\u0017\u0006, )\u001d\u000b\u0013\u001c)\u0013\f\u001c\u001e\u0017\u0006%\u0004", (byte) (63 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr14);
                o.ea.f.d(strIntern4, sb.append(((String) objArr14[0]).intern()).append(e2).toString());
            }
        }
    }

    public final a e(Context context, o.bs.a[] aVarArr, int i2, int i3) {
        String string;
        int i4 = i2;
        int i5 = 2 % 2;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int i6 = 0;
            Object[] objArr = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{239, 6, 0, 0}, false, objArr);
            Object[] objArr2 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{266, 8, 0, 8}, false, objArr2);
            Object[] objArr3 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{245, 8, 0, 7}, true, objArr3);
            String[] strArr = {((String) objArr[0]).intern(), ((String) objArr2[0]).intern(), ((String) objArr3[0]).intern()};
            Object[] objArr4 = new Object[1];
            o(17 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u000f\u001f\u000e\u000b\u0006!\u0017%/\u0004\t\u0013%\u0003\b\u0002\u0007\u001b", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 2), objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            if (i3 <= 0) {
                if (i3 == -1) {
                    int i7 = f21620h + 117;
                    f21625m = i7 % 128;
                    int i8 = i7 % 2;
                    if (o.ea.f.a()) {
                        int i9 = f21625m + 25;
                        f21620h = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = new Object[1];
                        o(25 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) (View.combineMeasuredStates(0, 0) + 10), objArr5);
                        String strIntern2 = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        n("\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{387, 128, 125, 103}, true, objArr6);
                        o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
                        int i11 = f21620h + 17;
                        f21625m = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 4 % 4;
                        }
                    }
                }
                string = null;
            } else {
                if (i4 < 0) {
                    int i13 = f21620h + 69;
                    f21625m = i13 % 128;
                    int i14 = i13 % 2;
                    if (o.ea.f.a()) {
                        Object[] objArr7 = new Object[1];
                        o((ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, "&%\r\u001a/\u000b\u0013\u0003\u001c\u001e\u0017\r\u0013\f\r\t\u000b/\u001f, \u0010%\u001f㗲", (byte) (11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr7);
                        String strIntern3 = ((String) objArr7[0]).intern();
                        Object[] objArr8 = new Object[1];
                        n("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{515, 54, 0, 0}, false, objArr8);
                        o.ea.f.c(strIntern3, ((String) objArr8[0]).intern());
                    }
                    i4 = 0;
                }
                StringBuilder sbAppend = new StringBuilder().append(i4);
                Object[] objArr9 = new Object[1];
                o((ViewConfiguration.getWindowTouchSlop() >> 8) + 1, "㖸", (byte) (2 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr9);
                string = sbAppend.append(((String) objArr9[0]).intern()).append(i3).toString();
            }
            String[] strArr2 = new String[aVarArr.length];
            Object[] objArr10 = new Object[1];
            n("\u0001\u0001\u0001\u0000\u0000", new int[]{569, 5, 103, 0}, false, objArr10);
            StringBuilder sb = new StringBuilder(((String) objArr10[0]).intern());
            int i15 = 0;
            while (i15 < aVarArr.length) {
                strArr2[i15] = String.valueOf(aVarArr[i15].c());
                int[] iArr = {IptcDirectory.TAG_DIGITAL_DATE_CREATED, 1, i6, i6};
                Object[] objArr11 = new Object[1];
                n("\u0001", iArr, true, objArr11);
                sb.append(((String) objArr11[0]).intern());
                if (i15 < aVarArr.length - 1) {
                    Object[] objArr12 = new Object[1];
                    o(1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "㖸", (byte) (MotionEvent.axisFromString("") + 3), objArr12);
                    sb.append(((String) objArr12[0]).intern());
                }
                i15++;
                i6 = 0;
            }
            Object[] objArr13 = new Object[1];
            n(null, new int[]{IptcDirectory.TAG_DIGITAL_TIME_CREATED, 1, 35, 1}, true, objArr13);
            sb.append(((String) objArr13[0]).intern());
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr14 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{266, 8, 0, 8}, false, objArr14);
            String string2 = sb2.append(((String) objArr14[0]).intern()).append((Object) sb).toString();
            Object[] objArr15 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{274, 17, 35, 0}, true, objArr15);
            Cursor cursorQuery = writableDatabase.query(((String) objArr15[0]).intern(), strArr, string2, strArr2, null, null, strIntern, string);
            if (!cursorQuery.moveToFirst()) {
                a aVar = new a(context);
                if (writableDatabase != null) {
                    int i16 = f21620h + 69;
                    f21625m = i16 % 128;
                    int i17 = i16 % 2;
                    writableDatabase.close();
                }
                return aVar;
            }
            Object[] objArr16 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{266, 8, 0, 8}, false, objArr16);
            int columnIndex = cursorQuery.getColumnIndex(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            n("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{245, 8, 0, 7}, true, objArr17);
            int columnIndex2 = cursorQuery.getColumnIndex(((String) objArr17[0]).intern());
            Object[] objArr18 = new Object[1];
            n("\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{239, 6, 0, 0}, false, objArr18);
            a aVar2 = new a(context, cursorQuery, columnIndex, columnIndex2, cursorQuery.getColumnIndex(((String) objArr18[0]).intern()));
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            return aVar2;
        } catch (Throwable th) {
            if (writableDatabase != null) {
                try {
                    writableDatabase.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int iMyPid = Process.myPid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = 312920484 * f21618e;
        f21618e = i2;
        int i3 = f21616c * (-983405919);
        f21616c = i3;
        e(i2, -2079962329, i3, 2079962329, new Object[]{this, sQLiteDatabase}, iMyPid, iMaxMemory);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f21625m + 91;
        f21620h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
