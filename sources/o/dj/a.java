package o.dj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.o;
import o.by.g;
import o.ea.f;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23068a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23069b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23070c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23071d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23072e = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f23073f = null;

    /* JADX INFO: renamed from: g */
    public static int f23074g = 0;

    /* JADX INFO: renamed from: h */
    private static final List<Long> f23075h;

    /* JADX INFO: renamed from: i */
    private static final Object f23076i;

    /* JADX INFO: renamed from: j */
    private static final ArrayList<o.bh.e> f23077j;

    /* JADX INFO: renamed from: k */
    private static int f23078k = 0;

    /* JADX INFO: renamed from: l */
    private static int f23079l = 0;

    /* JADX INFO: renamed from: m */
    private static int f23080m = 0;

    /* JADX INFO: renamed from: n */
    private static int f23081n = 0;

    /* JADX INFO: renamed from: o */
    private static long f23082o = 0;

    /* JADX INFO: renamed from: o.dj.a$4 */
    public class AnonymousClass4 implements o.c.e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f23083a = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f23084d = null;

        /* JADX INFO: renamed from: f */
        private static short[] f23085f = null;

        /* JADX INFO: renamed from: g */
        private static int f23086g = 0;

        /* JADX INFO: renamed from: h */
        private static int f23087h = 0;

        /* JADX INFO: renamed from: i */
        private static byte[] f23088i = null;

        /* JADX INFO: renamed from: j */
        private static int f23089j = 0;

        /* JADX INFO: renamed from: k */
        private static int f23090k = 0;

        /* JADX INFO: renamed from: l */
        public static int f23091l = 0;

        /* JADX INFO: renamed from: m */
        private static int f23092m = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ String f23094c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Context f23095e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r7, int r8, int r9) {
            /*
                int r0 = r7 * 2
                int r7 = 3 - r0
                byte[] r6 = o.dj.a.AnonymousClass4.$$c
                int r2 = r8 * 4
                int r1 = 1 - r2
                int r0 = r9 + 102
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r6 != 0) goto L29
                r2 = r7
                r0 = r3
                r1 = r4
            L16:
                int r7 = r7 + r0
            L17:
                byte r0 = (byte) r7
                r5[r1] = r0
                int r2 = r2 + 1
                if (r1 != r3) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L24:
                r0 = r6[r2]
                int r1 = r1 + 1
                goto L16
            L29:
                r1 = r4
                r2 = r7
                r7 = r0
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.$$e(byte, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f23091l = 850650972;
            init$0();
            f23090k = 0;
            f23092m = 1;
            f23084d = new char[]{64576, 64612, 64585, 64620, 65471, 64631, 64619, 64521, 64597, 64614, 64595, 64517, 64525, 64617, 64599, 64578, 64592, 64577, 64621, 64582, 64589, 64580, 64583, 64524, 64584, 64605, 64523, 64593, 65470, 64586, 64598, 64579, 64588, 64587, 64520, 64604};
            f23083a = (char) 51641;
            f23089j = -1333291908;
            f23087h = 1150422408;
            f23086g = -1558317723;
            f23088i = new byte[]{104, 124, 110, 116, 100, 105, 126, 127, 103, 96, -67, 19, 102, 127, 108, 114, 103, 107, 98, 100, 108, 124, 96, -73, 41, 109, 122, 83, MessagePack.Code.UINT32, 40, 104, 124, 109, 99, 96, 100, 124, -79, 82, 116, Ascii.DC4, 97, 119, 99, 97, 87, 99, -78, 19, 102, 127, 108, 112, 103, 110, 97, 102, 117, -94, 82, 116, 110, 96, Base64.padSymbol, 102, 86, 116, 125, 99, 103, 114, 93, 102, 127, 108, 114, 103, 107, 98, 100, 108, 124, -128, 88, 104, 120, 91, -113, 103, 102, 100, -124, 71, 102, 109, 66, 113, Utf8.REPLACEMENT_BYTE, 91, 80, 65, 103, 88, 92, 89, 94, 90, -117, 41, 107, 88, MessagePack.Code.EXT16, -78, -93, -78, MessagePack.Code.FIXEXT2, 38, -67, -19, -4, -27, -20, -22, MessagePack.Code.FIXEXT1, -9, -23, -27, 19, -67, -19, -21, -22, 41, -81, -1, -17, -31, 44, -66, MessagePack.Code.STR32, -5, 16, -115, -115, -115, -115, -115};
        }

        AnonymousClass4(Context context, String str) {
            context = context;
            str = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:132:0x0308  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(android.content.Context r23, int r24, int r25, int r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1791
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.e(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{83, -90, 91, 36};
            $$b = 9;
        }

        static void init$1() {
            $$c = new byte[]{69, -20, MessagePack.Code.INT64, -20};
            $$d = 235;
        }

        private static void n(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = $11 + 101;
            $10 = i6 % 128;
            Object charArray = str2;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            o.a.h hVar = new o.a.h();
            char[] cArr2 = f23084d;
            int i7 = 421932776;
            int i8 = 1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 15;
                    $11 = i10 % 128;
                    if (i10 % i4 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                            Object objA = o.d.d.a(i7);
                            if (objA == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA = o.d.d.a(271 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -811348851, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                        Object objA2 = o.d.d.a(421932776);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.getDefaultSize(0, 0), (-16777205) - Color.rgb(0, 0, 0), -811348851, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i9++;
                    }
                    i4 = 2;
                    i7 = 421932776;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(f23083a)};
            Object objA3 = o.d.d.a(421932776);
            char c2 = '\b';
            char c3 = 11;
            if (objA3 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA3 = o.d.d.a(270 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getOffsetAfter("", 0), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -811348851, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + i8];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                        int i11 = $10 + 21;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = hVar;
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[10] = hVar;
                        objArr5[9] = hVar;
                        objArr5[c2] = Integer.valueOf(cCharValue);
                        objArr5[7] = hVar;
                        objArr5[6] = hVar;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = hVar;
                        objArr5[3] = hVar;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i8] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = o.d.d.a(219124184);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a(825 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -611683395, false, $$e(b9, b10, (byte) (9 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                            Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA5 = o.d.d.a(-634864343);
                            if (objA5 == null) {
                                c3 = 11;
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                c2 = '\b';
                                objA5 = o.d.d.a(218 - View.getDefaultSize(0, 0), (char) KeyEvent.normalizeMetaState(0), 11 - TextUtils.getOffsetAfter("", 0), 212688716, false, $$e(b11, b12, (byte) (7 | b12)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c3 = 11;
                                c2 = '\b';
                            }
                            int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                            int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i13];
                        } else {
                            c3 = 11;
                            c2 = '\b';
                            if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i14];
                                cArr4[hVar.f19926b + 1] = cArr2[i15];
                            } else {
                                int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i16];
                                i8 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i17];
                            }
                        }
                        i8 = 1;
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i18 = 0; i18 < i2; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void o(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 708
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.o(short, int, int, int, byte, java.lang.Object[]):void");
        }

        private static void p(byte b2, int i2, int i3, Object[] objArr) {
            byte[] bArr = $$a;
            int i4 = i2 * 2;
            int i5 = b2 + 4;
            int i6 = i3 + 97;
            byte[] bArr2 = new byte[1 - i4];
            int i7 = 0 - i4;
            int i8 = -1;
            if (bArr == null) {
                i6 = (-i6) + i7;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i6;
                i5++;
                if (i8 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i6 = (-bArr[i5]) + i6;
                }
            }
        }

        @Override // o.c.e
        public final void a(o.en.b bVar, o.bg.c cVar, g gVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f23092m + 79;
            f23090k = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                n((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 28), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                o((short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20), 199910927 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 409995143, TextUtils.indexOf((CharSequence) "", '0', 0) + 91, (byte) Color.alpha(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            o.c.a aVarA = bVar.a();
            if (aVarA != null) {
                int i5 = f23090k + 103;
                f23092m = i5 % 128;
                if (i5 % 2 == 0) {
                    aVarA.a(context);
                    throw null;
                }
                aVarA.a(context);
            }
            a.c(context, str);
        }

        @Override // o.c.e
        public final void b() {
            int i2 = 2 % 2;
            int i3 = f23090k + 121;
            f23092m = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.c.e
        public final void d() {
            int i2 = 2 % 2;
            int i3 = f23092m + 39;
            f23090k = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.c.e
        public final void d(o.bx.d dVar, o.j.b bVar, o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f23092m + 117;
            f23090k = i3 % 128;
            if (i3 % 2 != 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                n(15 - ExpandableListView.getPackedPositionType(0L), "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) (ExpandableListView.getPackedPositionType(0L) + 28), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                n(96 - View.getDefaultSize(0, 0), "\u001b#\u000e\u001f\u001e\u0001\u0017\u001f\u0014\u0001\u0006\f\u0018\u001c! \u001f\u0014\u001b!#\u001a#\u0003\u0001\u0012\u0002\u001e\u0006\u0004\f\r\u001d\u0011#\n\u0017\u0019㘰㘰\u0001\u0012\u001a!\u001b#\u0007#\u0014!\u0003\u0001\r\u000b\u0006#\u001a!㘲㘲\t\u0017㘪㘪\u0006\u001e\t\u001a!\"\u0011\t\u001c\u0018\u0011\u0017\u0001\u0012\u0002\u000e\u0012\u0002\u0011\b#\u001b\u001a! !\u0014\u0016\u001a!\u001b#", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i4 = f23092m + 81;
                f23090k = i4 % 128;
                int i5 = i4 % 2;
            }
            a.c(context, str);
        }

        @Override // o.c.e
        public final void e(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            if (f.a()) {
                int i3 = f23092m + 45;
                f23090k = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                n(TextUtils.lastIndexOf("", '0') + 16, "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                n(View.getDefaultSize(0, 0) + 96, "\u001b#\u000e\u001f\u001e\u0001\u0017\u001f\u0014\u0001\u0006\f\u0018\u001c! \u001f\u0014\u001b!#\u001a#\u0003\u0001\u0012\u0002\u001e\u0006\u0004\f\r\u001d\u0011#\n\u0017\u0019㘰㘰\u0001\u0012\u001a!\u001b#\u0007#\u0014!\u0003\u0001\r\u000b\u0006#\u001a!㘲㘲\t\u0017㘪㘪\u0006\u001e\t\u001a!\"\u0011\t\u001c\u0018\u0011\u0017\u0001\u0012\u0002\u000e\u0012\u0002\u0011\b#\u001b\u001a! !\u0014\u0016\u001a!\u001b#", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 61), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i5 = f23092m + 111;
                f23090k = i5 % 128;
                int i6 = i5 % 2;
            }
            a.c(context, str);
        }
    }

    static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f23096a = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f23097b = null;

        /* JADX INFO: renamed from: c */
        private static boolean f23098c = false;

        /* JADX INFO: renamed from: e */
        private static boolean f23099e = false;

        /* JADX INFO: renamed from: f */
        private static int f23100f = 0;

        /* JADX INFO: renamed from: g */
        public static int f23101g = 0;

        /* JADX INFO: renamed from: h */
        private static int f23102h = 0;

        /* JADX INFO: renamed from: d */
        private o.c.a f23103d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r8, int r9, short r10) {
            /*
                int r0 = r8 * 2
                int r8 = 4 - r0
                byte[] r7 = o.dj.a.b.$$c
                int r0 = r9 * 6
                int r6 = r0 + 67
                int r1 = r10 * 2
                int r0 = 1 - r1
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r7 != 0) goto L2e
                r2 = r4
                r1 = r8
            L17:
                int r8 = r8 + r6
                int r0 = r1 + 1
                r6 = r8
                r8 = r0
            L1c:
                byte r0 = (byte) r6
                r5[r2] = r0
                if (r2 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                int r2 = r2 + 1
                r0 = r7[r8]
                r1 = r8
                r8 = r0
                goto L17
            L2e:
                r2 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.b.$$g(int, int, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f23101g = 1304408383;
            init$0();
            f23102h = 0;
            f23100f = 1;
            f23097b = new char[]{2333, 2318, 2328, 2314, 2319, 2309, 2382, 2315, 2347, 2549, 2312, 2329, 2305, 2363, 2304, 2331, 2307, 2316, 2346, 2365, 2550, 2344, 2308, 2313, 2306, 2311, 2340};
            f23096a = 2040400252;
            f23098c = true;
            f23099e = true;
        }

        b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void i(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r0 = r8 * 4
                int r8 = 4 - r0
                int r7 = 100 - r7
                int r1 = r6 * 4
                int r0 = 1 - r1
                byte[] r6 = o.dj.a.b.$$a
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r6 != 0) goto L2e
                r1 = r8
                r2 = r4
            L15:
                int r0 = -r8
                int r7 = r7 + r0
                int r8 = r1 + 1
                r1 = r2
            L1a:
                byte r0 = (byte) r7
                r5[r1] = r0
                int r2 = r1 + 1
                if (r1 != r3) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r9[r4] = r0
                return
            L29:
                r0 = r6[r8]
                r1 = r8
                r8 = r0
                goto L15
            L2e:
                r1 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.b.i(int, short, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.CR, MessagePack.Code.FALSE, -97, -84};
            $$b = 40;
        }

        static void init$1() {
            $$d = new byte[]{8, -110, 120, 122, MessagePack.Code.BIN32, 62, Ascii.NAK, MessagePack.Code.FALSE, 62};
            $$e = 13;
        }

        static void init$2() {
            $$c = new byte[]{49, -6, 40, 32};
            $$f = 221;
        }

        private static void j(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            o.a.f fVar = new o.a.f();
            char[] cArr2 = f23097b;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (13181 - View.resolveSize(0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -1225586509, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i4++;
                        int i5 = $11 + 123;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
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
            Object[] objArr3 = {Integer.valueOf(f23096a)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31, (char) View.getDefaultSize(0, 0), TextUtils.indexOf("", "", 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f23099e) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA3 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 458, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 12, -1923924106, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f23098c) {
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
                int i9 = $10 + 115;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 458, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1923924106, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i11 = $10 + 79;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(int r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.dj.a.b.$$d
                int r2 = r9 * 5
                int r1 = 6 - r2
                int r0 = r8 * 5
                int r6 = 9 - r0
                int r0 = r10 * 13
                int r0 = r0 + 98
                byte[] r5 = new byte[r1]
                int r4 = 5 - r2
                r3 = 0
                if (r7 != 0) goto L2f
                r2 = r6
                r0 = r4
                r1 = r3
            L18:
                int r6 = r6 + r0
                int r6 = r6 + (-7)
                int r2 = r2 + 1
            L1d:
                byte r0 = (byte) r6
                r5[r1] = r0
                if (r1 != r4) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r3)
                r11[r3] = r0
                return
            L2a:
                r0 = r7[r2]
                int r1 = r1 + 1
                goto L18
            L2f:
                r1 = r3
                r2 = r6
                r6 = r0
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.b.k(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02ee  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0300  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.c.a a() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dj.a.b.a():o.c.a");
        }

        public final void e(o.c.a aVar) {
            int i2 = 2 % 2;
            int i3 = f23102h + 57;
            int i4 = i3 % 128;
            f23100f = i4;
            int i5 = i3 % 2;
            this.f23103d = aVar;
            int i6 = i4 + 79;
            f23102h = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            int r8 = r11 + 99
            int r0 = r9 * 3
            int r7 = r0 + 4
            byte[] r6 = o.dj.a.$$a
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2d
            r2 = r7
            r0 = r3
            r1 = r4
        L16:
            int r7 = r7 + r0
            int r0 = r2 + 1
            r8 = r7
            r7 = r0
        L1b:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r7]
            int r1 = r1 + 1
            r2 = r7
            r7 = r8
            goto L16
        L2d:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.a.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23074g = -715845544;
        f23072e = -338072745;
        f23069b = -1792516847;
        f23071d = 971592300;
        f23070c = 2057054827;
        f23068a = -1917209170;
        f23081n = 0;
        f23078k = 1;
        f23080m = 0;
        f23079l = 1;
        c();
        Process.myPid();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getTapTimeout();
        f23075h = new ArrayList();
        f23076i = new Object();
        f23077j = new ArrayList<>();
        int i2 = f23078k + 85;
        f23081n = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        synchronized (f23076i) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                p((char) (Color.green(0) + 5111), (-1) - ImageFormat.getBitsPerPixel(0), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                p((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4380), 439 - Process.getGidForName(""), 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(str);
                Object[] objArr4 = new Object[1];
                p((char) (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + 496, KeyEvent.keyCodeFromString("") + 16, objArr4);
                f.c(strIntern, sbAppend.append(((String) objArr4[0]).intern()).append(str2).toString());
            }
            Iterator<o.bh.e> it = f23077j.iterator();
            while (it.hasNext()) {
                it.next().d(str, str2);
            }
        }
        return null;
    }

    private static h a(o.ef.a aVar) throws o.dj.b {
        Object[] objArr = {aVar};
        int i2 = f23068a * (-47618562);
        f23068a = i2;
        int i3 = f23070c * (-1059623622);
        f23070c = i3;
        int i4 = f23071d * 350231406;
        f23071d = i4;
        int i5 = f23069b * (-1933098941);
        f23069b = i5;
        return (h) c(objArr, 694432681, -694432681, i5, i2, i4, i3);
    }

    public static void a(Context context) {
        synchronized (f23076i) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                p((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5111), ViewConfiguration.getTapTimeout() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                p((char) (Color.rgb(0, 0, 0) + 16777216), 512 - View.resolveSizeAndState(0, 0, 0), (-16777189) - Color.rgb(0, 0, 0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            for (d dVar : c.b(context)) {
                List<Long> list = f23075h;
                if (!list.contains(Long.valueOf(dVar.e()))) {
                    if (f.a()) {
                        Object[] objArr3 = new Object[1];
                        p((char) (View.resolveSizeAndState(0, 0, 0) + 5111), ViewConfiguration.getScrollBarFadeDuration() >> 16, 15 - Color.green(0), objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        p((char) (34416 - TextUtils.indexOf((CharSequence) "", '0', 0)), 605 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.alpha(0) + 58, objArr4);
                        f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(dVar.e()).toString());
                    }
                    new o.di.a();
                    o.di.d dVarC = o.di.a.c(dVar.a());
                    o.ef.a aVarJ = dVar.j();
                    dVar.e();
                    o.di.b bVarA = dVarC.a(context, aVarJ);
                    int i2 = 1985992943 * o.di.b.f23026a;
                    o.di.b.f23026a = i2;
                    int priority = Thread.currentThread().getPriority();
                    int i3 = (-603574452) * o.di.b.f23029d;
                    o.di.b.f23029d = i3;
                    if (((Boolean) o.di.b.a(priority, i2, 846237084, new Object[]{bVarA}, i3, -846237084, new Random().nextInt())).booleanValue()) {
                        list.add(Long.valueOf(dVar.e()));
                        bVarA.b().d(context);
                    } else {
                        Object[] objArr5 = {context, Long.valueOf(dVar.e())};
                        int i4 = c.f23110g * 853602821;
                        c.f23110g = i4;
                        int iMyPid = Process.myPid();
                        int id = (int) Thread.currentThread().getId();
                        int i5 = c.f23112i * 693335188;
                        c.f23112i = i5;
                        c.b(id, objArr5, i4, 901275581, -901275578, iMyPid, i5);
                    }
                    int i6 = o.di.b.f23027b * (-891032732);
                    o.di.b.f23027b = i6;
                    int i7 = o.di.b.f23030e * 1071354274;
                    o.di.b.f23030e = i7;
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i8 = o.di.b.f23028c * 1175147630;
                    o.di.b.f23028c = i8;
                    if (((o.dd.e) o.di.b.a(i7, i6, -551405895, new Object[]{bVarA}, iFreeMemory, 551405896, i8)) != null) {
                        o.dc.d dVarA = o.dc.d.a();
                        int i9 = o.di.b.f23027b * (-891032732);
                        o.di.b.f23027b = i9;
                        int i10 = o.di.b.f23030e * 1071354274;
                        o.di.b.f23030e = i10;
                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i11 = o.di.b.f23028c * 1175147630;
                        o.di.b.f23028c = i11;
                        dVarA.b(context, (o.dd.e) o.di.b.a(i10, i9, -551405895, new Object[]{bVarA}, iFreeMemory2, 551405896, i11), true);
                    }
                } else if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    p((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5111), KeyEvent.normalizeMetaState(0), Color.alpha(0) + 15, objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    p((char) KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IptcDirectory.TAG_CONTENT_LOCATION_CODE, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45, objArr7);
                    StringBuilder sbAppend = sb2.append(((String) objArr7[0]).intern()).append(dVar.e());
                    Object[] objArr8 = new Object[1];
                    p((char) TextUtils.getOffsetBefore("", 0), 585 - Color.alpha(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, objArr8);
                    f.c(strIntern3, sbAppend.append(((String) objArr8[0]).intern()).toString());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc A[Catch: b -> 0x03a9, TryCatch #1 {b -> 0x03a9, blocks: (B:59:0x0004, B:62:0x003a, B:64:0x0062, B:66:0x00c6, B:72:0x0128, B:73:0x012e, B:74:0x0135, B:76:0x01b8, B:77:0x0213, B:79:0x021b, B:81:0x0221, B:82:0x02a5, B:83:0x02d0, B:84:0x02d1, B:92:0x0327, B:100:0x034e, B:102:0x0354, B:86:0x02d7, B:87:0x02db, B:88:0x02dc, B:90:0x02e2), top: B:110:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.dj.d b(android.content.Context r26, o.ef.a r27, o.dj.h r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.a.b(android.content.Context, o.ef.a, o.dj.h):o.dj.d");
    }

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = (-1) - (((-1) - i8) & ((-1) - i9));
        int i11 = ~i5;
        int i12 = (-1) - (((-1) - (~((i10 + i11) - (i10 & i11)))) & ((-1) - (~((-1) - (((-1) - (i2 | i3)) & ((-1) - i5))))));
        int i13 = ~((i9 + i2) - (i9 & i2));
        int i14 = ~((-1) - (((-1) - i9) & ((-1) - i5)));
        int i15 = (i14 + i13) - (i14 & i13);
        int i16 = ~((-1) - (((-1) - i5) & ((-1) - i3)));
        int i17 = (i16 + i2) - (i16 & i2);
        int i18 = i2 + i3 + i7 + (1661237432 * i6) + (961048624 * i4);
        int i19 = i18 * i18;
        int i20 = ((119520104 * i2) - 281083904) + ((-1329838950) * i3) + (i12 * 724679527) + (724679527 * i15) + ((-724679527) * i17) + ((-605159424) * i7) + ((-1559232512) * i6) + (1553989632 * i4) + (2020540416 * i19);
        int i21 = (i2 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i12 * (-595)) + (i15 * (-595)) + (i17 * 595) + (i7 * (-2040814133)) + (i6 * (-1614655000)) + (i4 * 500164112) + (i19 * 184877056);
        return i20 + ((i21 * i21) * 1800994816) != 1 ? e(objArr) : a(objArr);
    }

    static void c() {
        char[] cArr = new char[PhotoshopDirectory.TAG_HDR_TONING_INFO];
        ByteBuffer.wrap("\u0087K\u001cÑ°\u0007T]é\u008f\u008dË!\u0004ÅyZ©þÿ\u0092$6bË\u0089o\u000f\u0003]\u0094\u009d\u000f'£ÈGªúx\u009e02óÖ\u0096IIí\r\u0081Ù%µØY|ù\u0010¡\u008ba/+Ãúgµ\u001ag¾\u0007RÊö\u008eim\r\u001f¡ÒDiø\"\u009cð0¸«|O\u007fã»\u0094\u009d\u000f'£ÈGªúx\u009e02óÖ\u0096IIí\r\u0081Ù%µØY|ù\u0010¡\u008ba/+Ãúgµ\u001ag¾\u0007RÊö\u008eim\r\u001f¡ÒDiø\"\u009cð0¸«|O\u007fã»\u0087É:\tÞCrÉ\u0016\u0094\u0089\\-ãÁ¯du\u0018|¼òP¥Ë\ro\u0006\u0003È§\u0096Z\u0019þ\u0006\u0092Æ5`©+Méá±\u0084}8}Ü\u008cp\u008aëR\u008f\t#ÝÇ\u009azB\u001eý²\u00adUmÉ9mµ\u0001±¤AXJüÀ\u0090\u009f\u000bO¯\u001fC»æi\u009a3>ëÒ¶uz\u0094\u0096\u000f,£çG±úg\u009e%2äÖ¿IKí\u0018\u0081Ð%\u0094ØW|é\u0010à\u008b./bÃ´gô\u001aw¾\u000bRÆö\u0092iF\r\n¡ÅDiø/\u009c¦0\u00ad«yO.ãþ\u0087\u0086:EÞ\u0007r\u009e\u0016\u0093\u0089B-àÁ§d!\u0018\u001f¼»P¿Ë^oH\u0003É§\u0097ZUþ\u0018\u0092\u009f5.©$Mâá°\u0084h8%ÜÅp\u0085ëA\u0094\u009d\u000f'£ÈGªúx\u009e02óÖ\u0096IIí\r\u0081Ù%µØY|ù\u0010¡\u008ba/+Ãúgµ\u001ag¾\u0007RÊö\u008eim\r\u001f¡ÒDiø\"\u009cð0¸«|O\u007fã»\u0087É:\tÞCrë\u0016\u009b\u0089Q-íÁ¦dd\u0018|¼ïP¹Ë\ro\n\u0003Ò§\u008bZUþ\u0010\u0092\u00935D©6Mïá±\u0084U83ÜÆp\u008eëE\u008f\t\u0094\u0096\u000f,£çG±úg\u009e%2äÖ¿IKí\u0018\u0081Ð%\u0094ØW|é\u0010à\u008b./bÃ´gô\u001aw¾\u000bRÆö\u0089iO\r\u0012¡ÔD~ø.\u009câ0ý«HO6ãà\u0087\u0088:IÞ\u0006rÊ\u0016\u0090\u0089B-üÁêd;\u0018|\u0094\u009d\u000f'£ÊG¬új\u009e<2öÖ\u0086IIí\u0000\u0081È%\u0092ØY|ã\u0010\u009a\u008bb/!Ãüg½\u001ae¾\u000bRÁöÀi\u0005\rZ¡ßDcø?\u009cï0»«qO4ãó\u0087\u009d:MÞ\frÐ\u0016Õ\u0089V-ãÁ«df\u0018;¼þP²Ë\ro\t\u0003Ó§ÂZJþ\u0000\u0092Ú5m©.Mù\u0094\u009d\u000f'£ÊG¬új\u009e<2öÖ\u0086IIí\u0000\u0081È%\u0092ØY|ã\u0010\u009a\u008bb/!Ãüg½\u001ae¾\u000bRÁöÀi\u0005\rZ¡ßDcø?\u009cï0»«qO4ãó\u0087\u009d:MÞ\frÐ\u0016Õ\u0089Y-ëÁêdu\u00183¼»PµËAo\r\u0003Æ§\u008cZLþ\u0004\u0092\u00895.1&ª\u009c\u0006qâ\u0017_Ñ;\u0087\u0097Ms=ìòH»$s\u0080)}âÙXµ!.Ù\u008a\u009afGÂ\u0006¿Þ\u001b°÷zS{Ì©¨á\u0004OáÏ]\u00939X\u0095\u0016\u000e×ê\u0085FF\"<\u009f¿\u0085\u0081\u001e;²ÙV¼ëv\u008f #úÇ\u0092XBü\u0014\u0090Ï4\u0089Édmþ\u0001 \u009ar>8Òìv«\u000bn¯\u0006CÐç\u0093xM\u001c4°ÈUsé2\u008dó!·ºa^/ò®\u0096Ø+\u0018Ï\u001acÌ\u0007\u008a\u0098^<êÐ¦ui\t%\u00adãAêÚA~\u0015\u0012Â¶\u0092KJï\t\u0083Ë$2¸y\\¦ðã\u0094Ò\u000fd£¤G°ú{\u009e&2ãÖ\u0086IEí\u000f\u0081\u009c%\u0092ØR|\u00ad\u0010ò\u008b'\u0094\u0096\u000f £÷G³ú\u007f\u009e!2óÖ\u0087Iyí\u0015\u0081Õ%\u0098Ø]|ô\u0010\u0086\u008bh/6Ãðg²\u001az¾\rRÄö\u0094iV\r\u0015¡ßD\u007f\u0094\u0096\u000f £÷G³ú\u007f\u009e!2óÖ\u0087Iyí\u0015\u0081Õ%\u0098Ø]|ô\u0010\u0086\u008bh/6Ãðg²\u001az¾\rRÄö\u0094iV\r\u0015¡ßD\u007føk\u009c«0ý«vO8ãæ\u0087\u0080:BÞ\nrÝ\u0016\u0094\u0089D-æÁ¥do\u0018|¼»PìË\r\u0094Ò\u000f(£èG±ú{\u009e42ôÖ\u0096I\ní\u0005\u0081Õ%\u0088ØF|ì\u0010¼\u008bd/*Ãüg°\u0012ç\u0089Q%\u0086ÁÂ|\u000e\u0018P´\u0082PöÏ\bkd\u0007¤£é^,ú\u0085\u0096÷\r\u0019©GE\u0081áÃ\u009c\u000b8|Ôµpåï'\u008bd'®Â\u000e~\u001a\u001aÚ¶\u008c-\rÉOe\u0090\u0001è¼4Xfô¬\u0090ì\u000f(«\u0090GÜâP\u009eC:\u0085ÖÓM5é\u007f\u0085¿!ðÜ)xq\u0014«³\u0010/ZËÑg\u008e\u0002Q¾\u0000\u0094\u009d\u000f;£íG¤úw\u009e;8©£)\u000fëë¯V|2>\u009e¾z\u0095åKAO-À\u0089\u0090tKÐì¼ª'\u007f\u0083)o·Ë´¶r\u0012\u0014þÂZ\u0088ÅX¡\u0017\rÞèvT,0ç\u009c½\u00076ã6Oî+\u008e\u0096Mr\u0004ÞÞºÛ%\u0004\u0081¡\u0094\u009b\u000f-\u0094\u0091\u000f;£áG¢új\u009e<2ÿÖ\u0081Iní\u0000\u0081È%\u009e\u0094\u0097\u000f1£ôGªúl\u009e,2ÔÖ\u008eI^í\u0004\u0098u\u0003Æ¯\u001dKZö\u0095\u0092Ø>\u001f\u0094\u0081\u000f<£æG®úw\u009e!2ÞÖ\u0080I^í\b\u0081Ú%\u0092ØU|ì\u0010¼\u008bn/-Ã÷g\u0092\u001a|¾\u001cRöö\u0094iP\r\b¡ÐDkø.\u009c¦0ð«8O$ãæ\u0087\u0086:VÞ\u0002rÙ\u0016\u0090\u0089\u0010-ýÁ¯dp\u0018)¼òP¤ËHo\f\u0003\u0087§\u0084ZVþ\u0006\u0092\u00935`©*Môá¶\u0084|88ÜÏp\u008aëR\u008f\u0014#×Ç\u0099z\u0012\u001e³²ä\u0094\u0081\u000f<£æG®úw\u009e!2ÞÖ\u0080I^í\b\u0081Ú%\u0092ØU|ì\u0010¼\u008bn/-Ã÷g\u0092\u001a|¾\u001cRöö\u0094iP\r\b¡ÐDkø.\u009c¦0ð«8O\u0007ãç\u0087\u0085:HÞ-rÑ\u0016\u0081\u0089Y-éÁ£db\u0018=¼ïP¿ËBo\u0006\u0003ê§\u0087ZJþ\u0007\u0092Ò5i© M á¨\u0084s8%ÜÄpËëO\u008f\u0019#\u0098ÇÍz\u0012¬©7S\u009b\u0093\u007fÊÂ\u0000¦O\n\u008fîíqqÕj¹¢\u001dòà>D\u009f(À³\b\u0017\\û\u0086_\u008f\"\t\u0086{jºÎ»Q 5h\u0099¹|\u0007ÀQ¤\u0089\bÅ\u0093\u000bwIÛ\u008d\u0094³\u000f%£öG¦ú\u007f\u009e12éÖÏINí\b\u0081Ï%\u008bØW|ù\u0010«\u008bo/'Ãýgô\u001a}¾\u0001RÑö\u0089iY\r\u0013¡ÒDmø?\u009cï0²«v7\u008f¬2\u0000èä Yy=/\u0091Ðu\u008eêPN\u0006\"Ô\u0086\u009c{[ßâ³²(`\u008c#`ùÄ\u009c¹r\u001d\u0012ñøU\u009aÊ^®\u0006\u0002Þçe[ ?¨\u0093þ\b6ì<@î$\u0095\u0099E}\u001fÑ\u0090µ\u008c*V\u008eèb¨Çj»r\u001fåó½hQÌ\u0015 À\u0004\u009fùC]\u00131Ó\u0096g\nkîàB¾'`\u009b6\u007fÄÓ\u008cHK,\u0012\u0080Âd\u0090ÙS½é\u0094\u0081\u000f<£æG®úw\u009e!2ÞÖ\u0080I^í\b\u0081Ú%\u0092ØU|ì\u0010¼\u008bn/-Ã÷g\u0092\u001a|¾\u001cRöö\u0094iP\r\b¡ÐDkø.\u009c¦0ð«8O$ãæ\u0087\u0086:VÞ\u0002rÙ\u0016\u0090\u0089\u0010-áÁ¥du\u0018|¼éP³Ë\\o\u001d\u0003Î§\u0090Z\\þ\u0010\u0092\u00935h©*Mòáÿ\u0084t8>ÜØp\u0082ë@\u008f\u0014#ÛÇ\u0096zF\u001eà²«UmÉ~".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, PhotoshopDirectory.TAG_HDR_TONING_INFO);
        f23073f = cArr;
        f23082o = -5680796081862537399L;
    }

    public static void c(Context context) {
        synchronized (f23076i) {
            f23075h.clear();
            int iNextInt = new Random().nextInt();
            int i2 = c.f23108e * 1630934154;
            c.f23108e = i2;
            int i3 = c.f23106c * (-1067748560);
            c.f23106c = i3;
            c.b(i3, new Object[]{context}, iNextInt, 1428144871, -1428144871, i2, (int) Runtime.getRuntime().totalMemory());
        }
    }

    static void c(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        String strA = new o.dk.a(context).a(10, 3, str, null, null, null, null);
        Object obj = null;
        if (strA != null) {
            int i3 = f23080m + 99;
            f23079l = i3 % 128;
            if (i3 % 2 == 0) {
                strA.length();
                obj.hashCode();
                throw null;
            }
            if (strA.length() != 0) {
                try {
                    o.ef.a aVar = new o.ef.a(strA);
                    int i4 = f23080m + 39;
                    f23079l = i4 % 128;
                    int i5 = i4 % 2;
                    if (f.a()) {
                        Object[] objArr = new Object[1];
                        p((char) (5111 - (Process.myPid() >> 22)), TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        p((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 254, ((byte) KeyEvent.getModifierMetaStateMask()) + 44, objArr2);
                        f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(strA).toString());
                    }
                    e(context, aVar);
                    return;
                } catch (o.ef.b e2) {
                    if (f.a()) {
                        Object[] objArr3 = new Object[1];
                        p((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5111), ViewConfiguration.getKeyRepeatDelay() >> 16, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        p((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 193, 61 - ImageFormat.getBitsPerPixel(0), objArr4);
                        f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
                        return;
                    }
                    return;
                }
            }
        }
        if (f.a()) {
            Object[] objArr5 = new Object[1];
            p((char) (TextUtils.indexOf("", "") + 5111), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            p((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 132 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 61 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
            f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        int i6 = f23080m + 47;
        f23079l = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static void c(o.bh.e eVar) {
        int i2 = 2 % 2;
        int i3 = f23080m + 87;
        f23079l = i3 % 128;
        if (i3 % 2 == 0) {
            f23077j.add(eVar);
            throw null;
        }
        f23077j.add(eVar);
        int i4 = f23079l + 53;
        f23080m = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void d(o.bh.e eVar) {
        int i2 = 2 % 2;
        int i3 = f23079l + 105;
        f23080m = i3 % 128;
        if (i3 % 2 != 0) {
            f23077j.remove(eVar);
            int i4 = 89 / 0;
        } else {
            f23077j.remove(eVar);
        }
        int i5 = f23080m + 115;
        f23079l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        o.ef.a aVar = (o.ef.a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23079l + 113;
        f23080m = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr2 = new Object[1];
            p((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + IptcDirectory.TAG_AUDIO_TYPE, 5 - Process.getGidForName(""), objArr2);
            if (!aVar.d(((String) objArr2[0]).intern())) {
                return null;
            }
            int i5 = f23079l + 117;
            f23080m = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr3 = new Object[1];
            p((char) (Process.myPid() >> 22), 662 - TextUtils.indexOf("", "", 0, 0), 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int i7 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i7;
            return h.valueOf((String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority()));
        } catch (o.ef.b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            p((char) (44046 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.alpha(0) + 668, View.MeasureSpec.getSize(0) + 40, objArr5);
            throw new o.dj.b(sb.append(((String) objArr5[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    public static void e(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f23080m + 91;
            f23079l = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p((char) (5111 - TextUtils.getTrimmedLength("")), ViewConfiguration.getMaximumFlingVelocity() >> 16, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) KeyEvent.keyCodeFromString(""), Color.green(0) + 15, Color.rgb(0, 0, 0) + 16777249, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (o.en.b.c().s()) {
            c(context, str);
            return;
        }
        int i5 = f23079l + 43;
        f23080m = i5 % 128;
        int i6 = i5 % 2;
        if (f.a()) {
            int i7 = f23079l + 121;
            f23080m = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr3 = new Object[1];
            p((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5111), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 15, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            p((char) View.MeasureSpec.makeMeasureSpec(0, 0), 49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 83 - KeyEvent.normalizeMetaState(0), objArr4);
            f.c(strIntern2, ((String) objArr4[0]).intern());
        }
        b bVar = new b();
        AnonymousClass4 anonymousClass4 = new o.c.e() { // from class: o.dj.a.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static char f23083a = 0;

            /* JADX INFO: renamed from: d */
            private static char[] f23084d = null;

            /* JADX INFO: renamed from: f */
            private static short[] f23085f = null;

            /* JADX INFO: renamed from: g */
            private static int f23086g = 0;

            /* JADX INFO: renamed from: h */
            private static int f23087h = 0;

            /* JADX INFO: renamed from: i */
            private static byte[] f23088i = null;

            /* JADX INFO: renamed from: j */
            private static int f23089j = 0;

            /* JADX INFO: renamed from: k */
            private static int f23090k = 0;

            /* JADX INFO: renamed from: l */
            public static int f23091l = 0;

            /* JADX INFO: renamed from: m */
            private static int f23092m = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ String f23094c;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ Context f23095e;

            private static String $$e(byte v2, int v3, int v4) {
                /*
                    int r0 = r7 * 2
                    int r7 = 3 - r0
                    byte[] r6 = o.dj.a.AnonymousClass4.$$c
                    int r2 = r8 * 4
                    int r1 = 1 - r2
                    int r0 = r9 + 102
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L29
                    r2 = r7
                    r0 = r3
                    r1 = r4
                L16:
                    int r7 = r7 + r0
                L17:
                    byte r0 = (byte) r7
                    r5[r1] = r0
                    int r2 = r2 + 1
                    if (r1 != r3) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L24:
                    r0 = r6[r2]
                    int r1 = r1 + 1
                    goto L16
                L29:
                    r1 = r4
                    r2 = r7
                    r7 = r0
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.$$e(byte, int, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f23091l = 850650972;
                init$0();
                f23090k = 0;
                f23092m = 1;
                f23084d = new char[]{64576, 64612, 64585, 64620, 65471, 64631, 64619, 64521, 64597, 64614, 64595, 64517, 64525, 64617, 64599, 64578, 64592, 64577, 64621, 64582, 64589, 64580, 64583, 64524, 64584, 64605, 64523, 64593, 65470, 64586, 64598, 64579, 64588, 64587, 64520, 64604};
                f23083a = (char) 51641;
                f23089j = -1333291908;
                f23087h = 1150422408;
                f23086g = -1558317723;
                f23088i = new byte[]{104, 124, 110, 116, 100, 105, 126, 127, 103, 96, -67, 19, 102, 127, 108, 114, 103, 107, 98, 100, 108, 124, 96, -73, 41, 109, 122, 83, MessagePack.Code.UINT32, 40, 104, 124, 109, 99, 96, 100, 124, -79, 82, 116, Ascii.DC4, 97, 119, 99, 97, 87, 99, -78, 19, 102, 127, 108, 112, 103, 110, 97, 102, 117, -94, 82, 116, 110, 96, Base64.padSymbol, 102, 86, 116, 125, 99, 103, 114, 93, 102, 127, 108, 114, 103, 107, 98, 100, 108, 124, -128, 88, 104, 120, 91, -113, 103, 102, 100, -124, 71, 102, 109, 66, 113, Utf8.REPLACEMENT_BYTE, 91, 80, 65, 103, 88, 92, 89, 94, 90, -117, 41, 107, 88, MessagePack.Code.EXT16, -78, -93, -78, MessagePack.Code.FIXEXT2, 38, -67, -19, -4, -27, -20, -22, MessagePack.Code.FIXEXT1, -9, -23, -27, 19, -67, -19, -21, -22, 41, -81, -1, -17, -31, 44, -66, MessagePack.Code.STR32, -5, 16, -115, -115, -115, -115, -115};
            }

            AnonymousClass4(Context context2, String str2) {
                context = context2;
                str = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:132:0x0308  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(android.content.Context r23, int r24, int r25, int r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1791
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.e(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{83, -90, 91, 36};
                $$b = 9;
            }

            static void init$1() {
                $$c = new byte[]{69, -20, MessagePack.Code.INT64, -20};
                $$d = 235;
            }

            private static void n(int i22, String str2, byte b2, Object[] objArr5) throws Throwable {
                int i32;
                String str22 = str2;
                int i42 = 2;
                int i52 = 2 % 2;
                int i62 = $11 + 101;
                $10 = i62 % 128;
                Object charArray = str22;
                if (i62 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (str22 != null) {
                    charArray = str22.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.h hVar = new o.a.h();
                char[] cArr2 = f23084d;
                int i72 = 421932776;
                int i82 = 1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 15;
                        $11 = i10 % 128;
                        if (i10 % i42 == 0) {
                            try {
                                Object[] objArr22 = {Integer.valueOf(cArr2[i9])};
                                Object objA = o.d.d.a(i72);
                                if (objA == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objA = o.d.d.a(271 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -811348851, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr32 = {Integer.valueOf(cArr2[i9])};
                            Object objA2 = o.d.d.a(421932776);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.getDefaultSize(0, 0), (-16777205) - Color.rgb(0, 0, 0), -811348851, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            cArr3[i9] = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                            i9++;
                        }
                        i42 = 2;
                        i72 = 421932776;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr42 = {Integer.valueOf(f23083a)};
                Object objA3 = o.d.d.a(421932776);
                char c2 = '\b';
                char c3 = 11;
                if (objA3 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA3 = o.d.d.a(270 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getOffsetAfter("", 0), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -811348851, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr42)).charValue();
                char[] cArr4 = new char[i22];
                if (i22 % 2 != 0) {
                    i32 = i22 - 1;
                    cArr4[i32] = (char) (cArr[i32] - b2);
                } else {
                    i32 = i22;
                }
                if (i32 > 1) {
                    hVar.f19926b = 0;
                    while (hVar.f19926b < i32) {
                        hVar.f19927c = cArr[hVar.f19926b];
                        hVar.f19925a = cArr[hVar.f19926b + i82];
                        if (hVar.f19927c == hVar.f19925a) {
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + i82] = (char) (hVar.f19925a - b2);
                            int i11 = $10 + 21;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            Object[] objArr52 = new Object[13];
                            objArr52[12] = hVar;
                            objArr52[c3] = Integer.valueOf(cCharValue);
                            objArr52[10] = hVar;
                            objArr52[9] = hVar;
                            objArr52[c2] = Integer.valueOf(cCharValue);
                            objArr52[7] = hVar;
                            objArr52[6] = hVar;
                            objArr52[5] = Integer.valueOf(cCharValue);
                            objArr52[4] = hVar;
                            objArr52[3] = hVar;
                            objArr52[2] = Integer.valueOf(cCharValue);
                            objArr52[i82] = hVar;
                            objArr52[0] = hVar;
                            Object objA4 = o.d.d.a(219124184);
                            if (objA4 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objA4 = o.d.d.a(825 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -611683395, false, $$e(b9, b10, (byte) (9 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA4).invoke(null, objArr52)).intValue() == hVar.f19930g) {
                                Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA5 = o.d.d.a(-634864343);
                                if (objA5 == null) {
                                    c3 = 11;
                                    byte b11 = (byte) 0;
                                    byte b12 = b11;
                                    c2 = '\b';
                                    objA5 = o.d.d.a(218 - View.getDefaultSize(0, 0), (char) KeyEvent.normalizeMetaState(0), 11 - TextUtils.getOffsetAfter("", 0), 212688716, false, $$e(b11, b12, (byte) (7 | b12)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c3 = 11;
                                    c2 = '\b';
                                }
                                int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                                int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr2[i13];
                            } else {
                                c3 = 11;
                                c2 = '\b';
                                if (hVar.f19928d == hVar.f19929e) {
                                    hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                    hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                    int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                    int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                    cArr4[hVar.f19926b] = cArr2[i14];
                                    cArr4[hVar.f19926b + 1] = cArr2[i15];
                                } else {
                                    int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                    int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                    cArr4[hVar.f19926b] = cArr2[i16];
                                    i82 = 1;
                                    cArr4[hVar.f19926b + 1] = cArr2[i17];
                                }
                            }
                            i82 = 1;
                        }
                        hVar.f19926b += 2;
                    }
                }
                for (int i18 = 0; i18 < i22; i18++) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr5[0] = new String(cArr4);
            }

            /* JADX WARN: Removed duplicated region for block: B:135:0x0258  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x007f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void o(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 708
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.dj.a.AnonymousClass4.o(short, int, int, int, byte, java.lang.Object[]):void");
            }

            private static void p(byte b2, int i22, int i32, Object[] objArr5) {
                byte[] bArr = $$a;
                int i42 = i22 * 2;
                int i52 = b2 + 4;
                int i62 = i32 + 97;
                byte[] bArr2 = new byte[1 - i42];
                int i72 = 0 - i42;
                int i82 = -1;
                if (bArr == null) {
                    i62 = (-i62) + i72;
                }
                while (true) {
                    i82++;
                    bArr2[i82] = (byte) i62;
                    i52++;
                    if (i82 == i72) {
                        objArr5[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i62 = (-bArr[i52]) + i62;
                    }
                }
            }

            @Override // o.c.e
            public final void a(o.en.b bVar2, o.bg.c cVar, g gVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f23092m + 79;
                f23090k = i32 % 128;
                int i42 = i32 % 2;
                if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    n((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 28), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr22 = new Object[1];
                    o((short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20), 199910927 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 409995143, TextUtils.indexOf((CharSequence) "", '0', 0) + 91, (byte) Color.alpha(0), objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                }
                o.c.a aVarA = bVar.a();
                if (aVarA != null) {
                    int i52 = f23090k + 103;
                    f23092m = i52 % 128;
                    if (i52 % 2 == 0) {
                        aVarA.a(context);
                        throw null;
                    }
                    aVarA.a(context);
                }
                a.c(context, str);
            }

            @Override // o.c.e
            public final void b() {
                int i22 = 2 % 2;
                int i32 = f23090k + 121;
                f23092m = i32 % 128;
                if (i32 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.c.e
            public final void d() {
                int i22 = 2 % 2;
                int i32 = f23092m + 39;
                f23090k = i32 % 128;
                int i42 = i32 % 2;
            }

            @Override // o.c.e
            public final void d(o.bx.d dVar, o.j.b bVar2, o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f23092m + 117;
                f23090k = i32 % 128;
                if (i32 % 2 != 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    n(15 - ExpandableListView.getPackedPositionType(0L), "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) (ExpandableListView.getPackedPositionType(0L) + 28), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr22 = new Object[1];
                    n(96 - View.getDefaultSize(0, 0), "\u001b#\u000e\u001f\u001e\u0001\u0017\u001f\u0014\u0001\u0006\f\u0018\u001c! \u001f\u0014\u001b!#\u001a#\u0003\u0001\u0012\u0002\u001e\u0006\u0004\f\r\u001d\u0011#\n\u0017\u0019㘰㘰\u0001\u0012\u001a!\u001b#\u0007#\u0014!\u0003\u0001\r\u000b\u0006#\u001a!㘲㘲\t\u0017㘪㘪\u0006\u001e\t\u001a!\"\u0011\t\u001c\u0018\u0011\u0017\u0001\u0012\u0002\u000e\u0012\u0002\u0011\b#\u001b\u001a! !\u0014\u0016\u001a!\u001b#", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60), objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                    int i42 = f23092m + 81;
                    f23090k = i42 % 128;
                    int i52 = i42 % 2;
                }
                a.c(context, str);
            }

            @Override // o.c.e
            public final void e(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                if (f.a()) {
                    int i32 = f23092m + 45;
                    f23090k = i32 % 128;
                    int i42 = i32 % 2;
                    Object[] objArr5 = new Object[1];
                    n(TextUtils.lastIndexOf("", '0') + 16, "\u000b\u0018\u001a! !\u0014\u0016\u001a!\u001b#\u0016\f㘔", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr22 = new Object[1];
                    n(View.getDefaultSize(0, 0) + 96, "\u001b#\u000e\u001f\u001e\u0001\u0017\u001f\u0014\u0001\u0006\f\u0018\u001c! \u001f\u0014\u001b!#\u001a#\u0003\u0001\u0012\u0002\u001e\u0006\u0004\f\r\u001d\u0011#\n\u0017\u0019㘰㘰\u0001\u0012\u001a!\u001b#\u0007#\u0014!\u0003\u0001\r\u000b\u0006#\u001a!㘲㘲\t\u0017㘪㘪\u0006\u001e\t\u001a!\"\u0011\t\u001c\u0018\u0011\u0017\u0001\u0012\u0002\u000e\u0012\u0002\u0011\b#\u001b\u001a! !\u0014\u0016\u001a!\u001b#", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 61), objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                    int i52 = f23092m + 111;
                    f23090k = i52 % 128;
                    int i62 = i52 % 2;
                }
                a.c(context, str);
            }
        };
        o.c.a aVar = new o.c.a(context2);
        bVar.e(aVar);
        aVar.e(context2, anonymousClass4, new e(), null, null);
    }

    private static void e(Context context, o.ef.a aVar) {
        d dVarB;
        o.di.b bVarA;
        int i2;
        int i3;
        int iFreeMemory;
        int i4;
        synchronized (f23076i) {
            try {
                int i5 = f23068a * (-47618562);
                f23068a = i5;
                int i6 = f23070c * (-1059623622);
                f23070c = i6;
                int i7 = f23071d * 350231406;
                f23071d = i7;
                int i8 = f23069b * (-1933098941);
                f23069b = i8;
                h hVar = (h) c(new Object[]{aVar}, 694432681, -694432681, i8, i5, i7, i6);
                if (hVar != null) {
                    dVarB = b(context, aVar, hVar);
                    if (dVarB != null) {
                        dVarB.e();
                    }
                } else {
                    dVarB = null;
                }
                new o.di.a();
                bVarA = o.di.a.c(hVar).a(context, aVar);
                if (dVarB != null) {
                    if (bVarA.e()) {
                        if (f.a()) {
                            Object[] objArr = new Object[1];
                            p((char) (5111 - Color.blue(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, Color.green(0) + 15, objArr);
                            String strIntern = ((String) objArr[0]).intern();
                            Object[] objArr2 = new Object[1];
                            p((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 298, AndroidCharacter.getMirror('0') + 7, objArr2);
                            f.c(strIntern, ((String) objArr2[0]).intern());
                        }
                        c.a(context, Long.valueOf(dVarB.e()));
                        f23075h.add(Long.valueOf(dVarB.e()));
                    }
                    if (bVarA.c() != null) {
                        if (f.a()) {
                            Object[] objArr3 = new Object[1];
                            p((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 5111), Color.blue(0), (ViewConfiguration.getTouchSlop() >> 8) + 15, objArr3);
                            String strIntern2 = ((String) objArr3[0]).intern();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr4 = new Object[1];
                            p((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (Process.myTid() >> 22) + 352, 53 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
                            f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(bVarA.c()).toString());
                        }
                        Object[] objArr5 = {context, bVarA.c()};
                        int i9 = c.f23110g * 853602821;
                        c.f23110g = i9;
                        int iMyPid = Process.myPid();
                        int id = (int) Thread.currentThread().getId();
                        int i10 = c.f23112i * 693335188;
                        c.f23112i = i10;
                        c.b(id, objArr5, i9, 901275581, -901275578, iMyPid, i10);
                        f23075h.remove(bVarA.c());
                    }
                }
                bVarA.b().d(context);
                i2 = o.di.b.f23027b * (-891032732);
                o.di.b.f23027b = i2;
                i3 = o.di.b.f23030e * 1071354274;
                o.di.b.f23030e = i3;
                iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                i4 = o.di.b.f23028c * 1175147630;
                o.di.b.f23028c = i4;
            } catch (o.dj.b e2) {
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    p((char) (TextUtils.indexOf("", "", 0, 0) + 5111), ViewConfiguration.getPressedStateDuration() >> 16, TextUtils.getOffsetAfter("", 0) + 15, objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    p((char) (42427 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + HttpStatus.SC_NOT_FOUND, 34 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr7);
                    f.d(strIntern3, sb2.append(((String) objArr7[0]).intern()).append(e2).toString());
                }
            }
            if (((o.dd.e) o.di.b.a(i3, i2, -551405895, new Object[]{bVarA}, iFreeMemory, 551405896, i4)) != null) {
                o.dc.d dVarA = o.dc.d.a();
                int i11 = o.di.b.f23027b * (-891032732);
                o.di.b.f23027b = i11;
                int i12 = o.di.b.f23030e * 1071354274;
                o.di.b.f23030e = i12;
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i13 = o.di.b.f23028c * 1175147630;
                o.di.b.f23028c = i13;
                dVarA.b(context, (o.dd.e) o.di.b.a(i12, i11, -551405895, new Object[]{bVarA}, iFreeMemory2, 551405896, i13), true);
            }
        }
    }

    public static void e(String str, String str2) {
        Object[] objArr = {str, str2};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f23072e * 2034601121;
        f23072e = i2;
        int i3 = f23074g * 661142827;
        f23074g = i3;
        c(objArr, 1652035770, -1652035769, Process.myTid(), iFreeMemory, i3, i2);
    }

    static void init$0() {
        $$a = new byte[]{44, -120, 71, -108};
        $$b = 99;
    }

    private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 21;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23073f[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 12, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f23082o), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 767, (char) (12470 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 387, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 19, 39570797, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(387 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39570797, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 59;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }
}
