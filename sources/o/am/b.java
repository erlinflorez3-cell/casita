package o.am;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.n;
import o.a.q;
import o.ab.e;
import o.ab.j;
import o.bg.c;
import o.cg.f;
import o.d.d;
import o.dx.g;
import o.er.w;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<InterfaceC0330b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: j */
    private static int f20328j = 0;

    /* JADX INFO: renamed from: l */
    private static int f20329l = 0;

    /* JADX INFO: renamed from: m */
    private static int f20330m = 0;

    /* JADX INFO: renamed from: n */
    private static int f20331n = 0;

    /* JADX INFO: renamed from: o */
    private static int f20332o = 0;

    /* JADX INFO: renamed from: f */
    String f20333f;

    /* JADX INFO: renamed from: g */
    List<w> f20334g;

    /* JADX INFO: renamed from: o.am.b$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        private static int f20335a = 1;

        /* JADX INFO: renamed from: d */
        private static int f20336d = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f20337e;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20337e = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20336d;
                int i3 = (i2 ^ 39) + (((i2 + 39) - (i2 | 39)) << 1);
                f20335a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20337e[o.bg.a.aB.ordinal()] = 2;
                int i6 = f20335a + 1;
                f20336d = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class a extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20338b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20339c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20340d = 0;

        /* JADX INFO: renamed from: f */
        public static int f20341f = 0;

        /* JADX INFO: renamed from: g */
        private static long f20342g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20343h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20344i = 0;

        /* JADX INFO: renamed from: j */
        public static int f20345j = 0;

        /* JADX INFO: renamed from: k */
        private static int f20346k = 0;

        /* JADX INFO: renamed from: l */
        private static short[] f20347l = null;

        /* JADX INFO: renamed from: m */
        private static int f20348m = 0;

        /* JADX INFO: renamed from: n */
        private static byte[] f20349n = null;

        /* JADX INFO: renamed from: o */
        private static int f20350o = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x001f -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r9, byte r10, byte r11) {
            /*
                byte[] r8 = o.am.b.a.$$a
                int r7 = r10 + 4
                int r6 = r9 + 71
                int r5 = r11 * 3
                int r0 = r5 + 1
                byte[] r4 = new byte[r0]
                r3 = 0
                if (r8 != 0) goto L26
                r1 = r7
                r0 = r5
                r2 = r3
            L12:
                int r0 = -r0
                int r7 = r7 + r0
            L14:
                byte r0 = (byte) r7
                r4[r2] = r0
                if (r2 != r5) goto L1f
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L1f:
                int r1 = r1 + 1
                int r2 = r2 + 1
                r0 = r8[r1]
                goto L12
            L26:
                r2 = r3
                r1 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.am.b.a.$$d(int, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20345j = -1659580639;
            f20341f = 2063233267;
            f20338b = 1432755855;
            f20340d = 1729225091;
            f20339c = -756711638;
            f20350o = 0;
            f20346k = 1;
            f20342g = 4845183191323651133L;
            f20343h = -1729725764;
            f20344i = 1150422516;
            f20348m = 694032154;
            f20349n = new byte[]{Ascii.ESC, 76, 78, -74, 76, 67, -67, 73, 65, 94, -87, 68, -73, -79, -74, Ascii.FS, -6, 1, 3, MessagePack.Code.INT16, Ascii.DC2, -3, Ascii.SO, 8, Ascii.SI, 79, -89, 87, -116, -125, 1, -84, 84, -82, -95, 95, -85, -93, -68, -99, Ascii.GS, -90, 85, 83, -76, -101, Ascii.DC4, 82, -86, -83, 81, -20, Ascii.RS, 84, -5, Ascii.DC4, 86, -91, -82, 92, -74, -102, 92, -94, 2, -81, -95, -83, 91, 82, -115, 115, -82, -85, -80, 114, -81, -95, -83, -81, 65, -115, 74, 80};
        }

        a(b bVar) {
            super(bVar, true);
        }

        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i3;
            int i9 = ~i7;
            int i10 = (-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i9))))) & ((-1) - (~(i8 | i6))));
            int i11 = ~((i3 + i6) - (i3 & i6));
            int i12 = ~i6;
            int i13 = i8 | i12;
            int i14 = (~((i7 + i13) - (i7 & i13))) | i11;
            int i15 = (-1) - (((-1) - i8) & ((-1) - (~((-1) - (((-1) - i9) & ((-1) - i12))))));
            int i16 = i3 + i6 + i2 + ((-1570926368) * i4) + ((-1409401439) * i5);
            int i17 = i16 * i16;
            int i18 = (((-543990125) * i3) - 657981440) + (821186744 * i6) + ((-1953193618) * i10) + ((-976596809) * i14) + (976596809 * i15) + (1797783552 * i2) + (1124073472 * i4) + ((-332922880) * i5) + ((-1182662656) * i17);
            int i19 = (i3 * 1410161459) + 847508490 + (i6 * 1410159032) + (i10 * (-1618)) + (i14 * (-809)) + (i15 * 809) + (i2 * 1410159841) + (i4 * 1126552800) + (i5 * (-1948647807)) + (i17 * (-1287520256));
            return i18 + ((i19 * i19) * (-1577189376)) != 1 ? e(objArr) : d(objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object d(Object[] objArr) {
            a aVar = (a) objArr[0];
            c cVar = (c) objArr[1];
            int i2 = 2 % 2;
            int i3 = f20350o + 23;
            f20346k = i3 % 128;
            int i4 = i3 % 2;
            ((b) aVar.e()).g().c(cVar);
            int i5 = f20346k + 105;
            f20350o = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
            a aVar = (a) objArr[0];
            int i2 = 2 % 2;
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr2 = new Object[1];
            v("ℑ愬ꅾ\ue1ab⇇怭", 16447 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            aVar2.a(((String) objArr2[0]).intern(), (Object) ((b) aVar.e()).f20333f);
            int i3 = f20350o + 89;
            f20346k = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            return aVar2;
        }

        static void init$0() {
            $$a = new byte[]{93, 121, -117, 60};
            $$b = 183;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10;
            int i5 = i4 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            if (str2 != null) {
                int i7 = i4 + 31;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char[] charArray = str2.toCharArray();
                int i9 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            char[] cArr = (char[]) obj;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i11 = $11 + 109;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objA = d.a(View.resolveSizeAndState(0, 0, 0) + 731, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7933), View.resolveSize(0, 0) + 11, 355847088, false, $$d(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                        long j2 = f20342g & 4743694005979712847L;
                        jArr[i12] = (jLongValue + j2) - (jLongValue | j2);
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = d.a(1452497747);
                        if (objA2 == null) {
                            byte b4 = (byte) (-1);
                            objA2 = d.a(836 - TextUtils.getCapsMode("", 0, 0), (char) (View.getDefaultSize(0, 0) + 27279), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -2145994442, false, $$d((byte) ((-1) - (((-1) - $$b) | ((-1) - 15))), b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i13 = qVar.f19948a;
                    Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA3 = d.a(-1011865131);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objA3 = d.a(730 - ExpandableListView.getPackedPositionChild(0L), (char) (Color.blue(0) + 7933), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 355847088, false, $$d(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i13] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f20342g ^ 4743694005979712847L);
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = d.a(1452497747);
                    if (objA4 == null) {
                        byte b7 = (byte) (-1);
                        objA4 = d.a(837 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (27278 - TextUtils.lastIndexOf("", '0', 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -2145994442, false, $$d((byte) ($$b & 15), b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i14 = $10 + 5;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = d.a(1452497747);
                if (objA5 == null) {
                    byte b8 = (byte) (-1);
                    objA5 = d.a(836 - (ViewConfiguration.getTouchSlop() >> 8), (char) (27278 - ExpandableListView.getPackedPositionChild(0L)), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2145994442, false, $$d((byte) ($$b & 15), b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        private static void z(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            int i5;
            boolean z2;
            int length;
            byte[] bArr;
            int i6;
            int i7 = 2;
            int i8 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20344i)};
                Object objA = d.a(-727631768);
                int i9 = -1;
                long j3 = 0;
                if (objA == null) {
                    byte b3 = (byte) (-1);
                    objA = d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 237, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44530), 11 - Color.alpha(0), 35969549, false, $$d((byte) ((-1) - (((-1) - $$b) | ((-1) - 105))), b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z3 = iIntValue == -1;
                if (z3) {
                    byte[] bArr2 = f20349n;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i10 = 0;
                        while (i10 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objA2 = d.a(-1239398195);
                            if (objA2 == null) {
                                byte b4 = (byte) i9;
                                objA2 = d.a(629 - (Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 28648), ExpandableListView.getPackedPositionChild(j3) + 12, 1621469864, false, $$d((byte) ((-1) - (((-1) - $$b) | ((-1) - 104))), b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i9 = -1;
                            j3 = 0;
                        }
                        int i11 = $11 + 7;
                        $10 = i11 % 128;
                        i7 = 2;
                        int i12 = i11 % 2;
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = f20349n;
                        Object[] objArr4 = new Object[i7];
                        objArr4[1] = Integer.valueOf(f20343h);
                        objArr4[0] = Integer.valueOf(i2);
                        Object objA3 = d.a(-727631768);
                        if (objA3 == null) {
                            int minimumFlingVelocity = 238 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 44532);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                            int i13 = $$b;
                            byte b5 = (byte) (-1);
                            objA3 = d.a(minimumFlingVelocity, modifierMetaStateMask, iResolveOpacity, 35969549, false, $$d((byte) ((i13 + 105) - (i13 | 105)), b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20344i) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f20347l[i2 + ((int) (((long) f20343h) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20344i) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i14 = ((i2 + iIntValue) - 2) + ((int) (((long) f20343h) ^ j2));
                    if (z3) {
                        int i15 = $10 + 101;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i14 + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20348m), sb};
                    Object objA4 = d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = d.a(Color.red(0), (char) (5359 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - View.MeasureSpec.getSize(0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f20349n;
                    if (bArr5 != null) {
                        int i17 = $11 + 47;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i6 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i6 = 0;
                        }
                        while (i6 < length) {
                            bArr[i6] = (byte) (((long) bArr5[i6]) ^ (-7649639543924978291L));
                            i6++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i18 = $10 + 23;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = f20349n;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f20347l;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("⅃嘗쿿䝜ﰶ疗\ued6c拉鮣ጃ裧ƿ뤟⻳Ꙓ\udf32咗챯䗍", 30557 - (Process.myTid() >> 22), objArr);
            o.cg.b bVar = new o.cg.b(context, 35, ((String) objArr[0]).intern());
            int i3 = f20350o + 37;
            f20346k = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            Object[] objArr = new Object[1];
            z((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 596347087 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-1842092578) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-121) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((-63) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
            o.ef.c cVarT = aVar.t(((String) objArr[0]).intern());
            ArrayList arrayList = new ArrayList();
            if (cVarT != null) {
                int i4 = f20350o + 45;
                f20346k = i4 % 128;
                int i5 = 1136425123;
                if (i4 % 2 == 0) {
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i6 = o.ef.c.f23799b * 1567746851;
                    o.ef.c.f23799b = i6;
                    int i7 = o.ef.c.f23798a * 1136425123;
                    o.ef.c.f23798a = i7;
                    ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i7, i6, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i8 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i8;
                int i9 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i9;
                if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime2, 1513293186, new Object[]{cVarT})).intValue() > 0) {
                    int i10 = 0;
                    while (true) {
                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                        int i11 = o.ef.c.f23799b * 1567746851;
                        o.ef.c.f23799b = i11;
                        int i12 = o.ef.c.f23798a * i5;
                        o.ef.c.f23798a = i12;
                        if (i10 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i12, i11, -1513293186, elapsedCpuTime3, 1513293186, new Object[]{cVarT})).intValue()) {
                            break;
                        }
                        int i13 = f20350o + 23;
                        f20346k = i13 % 128;
                        int i14 = i13 % i2;
                        o.ef.a aVarD = cVarT.d(i10);
                        Object[] objArr2 = new Object[1];
                        v("ℛ旁", TextUtils.indexOf("", "") + 17623, objArr2);
                        Object[] objArr3 = {aVarD, ((String) objArr2[0]).intern()};
                        int i15 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i15;
                        String str = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority());
                        Object[] objArr4 = new Object[1];
                        z((short) ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 596347102, (-1842092580) - ((byte) KeyEvent.getModifierMetaStateMask()), (-122) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (121 - View.MeasureSpec.getMode(0)), objArr4);
                        w.d[] dVarArr = (w.d[]) aVarD.d(w.d.class, ((String) objArr4[0]).intern());
                        Object[] objArr5 = new Object[1];
                        v("ℜ㟤ೱ旲", (Process.myTid() >> 22) + 5879, objArr5);
                        String strS = aVarD.s(((String) objArr5[0]).intern());
                        Object[] objArr6 = new Object[1];
                        v("℞硨鏿ⵂ䓳鹉㦠", Color.argb(0, 0, 0, 0) + 22901, objArr6);
                        String strS2 = aVarD.s(((String) objArr6[0]).intern());
                        arrayList.add(new w(str, dVarArr, strS, strS2 != null ? new g(strS2) : null));
                        i10++;
                        i2 = 2;
                        i5 = 1136425123;
                    }
                }
            }
            ((b) e()).f20334g = arrayList;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20346k + 125;
            f20350o = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 != 5002) {
                return super.b(i2);
            }
            o.bg.a aVar = o.bg.a.aB;
            int i5 = f20346k + 75;
            f20350o = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = f20338b * 928966859;
            f20338b = i2;
            int i3 = 461619042 * f20341f;
            f20341f = i3;
            int iActiveCount = Thread.activeCount();
            int i4 = f20345j * 1646303637;
            f20345j = i4;
            a(i3, 233495646, iActiveCount, i4, new Object[]{this, cVar}, -233495645, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20346k + 15;
            f20350o = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().a(((b) e()).f20334g);
            int i5 = f20350o + 67;
            f20346k = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20350o + 35;
            int i4 = i3 % 128;
            f20346k = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 97;
            f20350o = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i2 = f20339c * 1683407983;
            f20339c = i2;
            int i3 = (-1452827819) * f20340d;
            f20340d = i3;
            return (o.ef.a) a(i2, -1985664705, i3, (int) Runtime.getRuntime().maxMemory(), new Object[]{this}, 1985664705, iElapsedRealtime);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20346k + 59;
            f20350o = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v("ℕ䮚\uf41cẁ謩㗘幙죇畈鿢ࢁ딈\udf8b䠨\uf2b0\u1f5e觐㉜峞쥪爄鲳ङ뎪\udc22", 27900 >>> (ViewConfiguration.getScrollBarFadeDuration() + 25), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v("ℕ䮚\uf41cẁ謩㗘幙죇畈鿢ࢁ딈\udf8b䠨\uf2b0\u1f5e觐㉜峞쥪爄鲳ङ뎪\udc22", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27277, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20346k + 101;
            f20350o = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20350o + 83;
            int i4 = i3 % 128;
            f20346k = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 41;
            f20350o = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 60 / 0;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0048 A[EXC_TOP_SPLITTER, PHI: r3
  0x0048: PHI (r3v2 o.er.w) = (r3v1 o.er.w), (r3v5 o.er.w) binds: [B:44:0x0039, B:47:0x0046] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void q() throws java.lang.Throwable {
            /*
                r15 = this;
                r8 = 2
                int r0 = r8 % r8
                int r0 = o.am.b.a.f20350o
                int r1 = r0 + 59
                int r0 = r1 % 128
                o.am.b.a.f20346k = r0
                int r1 = r1 % r8
                if (r1 == 0) goto Lb8
                o.ab.e r0 = r15.e()
                o.am.b r0 = (o.am.b) r0
                java.util.List<o.er.w> r0 = r0.f20334g
                java.util.Iterator r7 = r0.iterator()
            L1a:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Lb7
                int r0 = o.am.b.a.f20350o
                int r1 = r0 + 111
                int r0 = r1 % 128
                o.am.b.a.f20346k = r0
                int r1 = r1 % r8
                r4 = 0
                if (r1 != 0) goto L3c
                java.lang.Object r3 = r7.next()
                o.er.w r3 = (o.er.w) r3
                o.dx.g r1 = r3.a()
                r0 = 78
                int r0 = r0 / r4
                if (r1 == 0) goto L1a
                goto L48
            L3c:
                java.lang.Object r3 = r7.next()
                o.er.w r3 = (o.er.w) r3
                o.dx.g r0 = r3.a()
                if (r0 == 0) goto L1a
            L48:
                o.dx.e r2 = o.dx.e.e()     // Catch: o.dx.a -> L58
                android.content.Context r1 = r15.h()     // Catch: o.dx.a -> L58
                o.dx.g r0 = r3.a()     // Catch: o.dx.a -> L58
                r2.d(r1, r0)     // Catch: o.dx.a -> L58
                goto L1a
            L58:
                r3 = move-exception
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L1a
                double r5 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r4)
                r1 = 0
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                r2 = 52103(0xcb87, float:7.3012E-41)
                int r2 = r2 - r0
                r5 = 1
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.lang.String r0 = "ℵ\uea90똈䎳༁\ud8ba\ue43d놭紘ڨ퉅鿊ꭃ瓚d췴饰ꋶ湊㨘잌錱岝栠㖲섞誫嘢換⽘\uf8ce葏"
                v(r0, r2, r1)
                r0 = r1[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r2 = r0.intern()
                int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
                int r0 = r0 >> 16
                short r9 = (short) r0
                int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
                int r0 = r0 >> 16
                r10 = 596347112(0x238b88e8, float:1.5128392E-17)
                int r10 = r10 + r0
                r11 = -1842092584(0xffffffff9233e5d8, float:-5.6765745E-28)
                int r0 = android.graphics.drawable.Drawable.resolveOpacity(r4, r4)
                int r11 = r11 - r0
                r0 = 0
                int r0 = android.widget.ExpandableListView.getPackedPositionChild(r0)
                int r12 = (-123) - r0
                int r0 = android.view.ViewConfiguration.getMaximumFlingVelocity()
                int r0 = r0 >> 16
                int r0 = r0 + 34
                byte r13 = (byte) r0
                java.lang.Object[] r14 = new java.lang.Object[r5]
                z(r9, r10, r11, r12, r13, r14)
                r0 = r14[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.e(r2, r0, r3)
                goto L1a
            Lb7:
                return
            Lb8:
                o.ab.e r0 = r15.e()
                o.am.b r0 = (o.am.b) r0
                java.util.List<o.er.w> r0 = r0.f20334g
                r0.iterator()
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.am.b.a.q():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20350o + 3;
            f20346k = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = AnonymousClass5.f20337e[f().c().ordinal()];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = AnonymousClass5.f20337e[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((b) e()).f20333f);
                return;
            }
            if (i5 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((b) e()).f20333f);
            int i6 = f20350o + 77;
            f20346k = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: o.am.b$b */
    public interface InterfaceC0330b {
        void a(List<w> list);

        void c(c cVar);
    }

    private static String $$j(byte b2, short s2, byte b3) {
        byte[] bArr = $$d;
        int i2 = b3 * 2;
        int i3 = (s2 * 2) + 4;
        int i4 = 115 - (b2 * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 += -i3;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i4 += -bArr[i3];
            i3 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20329l = 0;
        f20332o = 1;
        f20330m = 0;
        f20331n = 1;
        m();
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getScrollBarFadeDuration();
        TypedValue.complexToFloat(0);
        TextUtils.getOffsetAfter("", 0);
        int i2 = f20329l + 15;
        f20332o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public b(Context context, InterfaceC0330b interfaceC0330b, o.en.b bVar) {
        super(context, interfaceC0330b, bVar, o.bg.e.f21120r);
    }

    static void init$0() {
        $$d = new byte[]{113, 10, 2, -109};
        $$e = 9;
    }

    private a k() {
        int i2 = 2 % 2;
        a aVar = new a(this);
        int i3 = f20331n + 115;
        f20330m = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m() {
        f20328j = -1270219365;
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr2 = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr3 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr2[nVar.f19944a];
            cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(f20328j)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(270 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2071844881, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 522;
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int pressedStateDuration = 12 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i9 = $$e;
                    byte b4 = (byte) ((i9 + 7) - (i9 | 7));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(iNormalizeMetaState, modifierMetaStateMask, pressedStateDuration, 627984172, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i10 = $11 + 117;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i2];
                nVar.f19944a = 1;
            } else {
                cArr = new char[i2];
                nVar.f19944a = 0;
            }
            while (nVar.f19944a < i2) {
                cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 522;
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iResolveSize = View.resolveSize(0, 0) + 12;
                    int i11 = $$e;
                    byte b6 = (byte) ((i11 + 7) - (i11 | 7));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(scrollDefaultDelay, doubleTapTimeout, iResolveSize, 627984172, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20330m + 19;
        f20331n = i3 % 128;
        int i4 = i3 % 2;
        a aVarK = k();
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return aVarK;
    }

    public final void c(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20331n + 73;
        f20330m = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q(Color.green(0) + 32, "￫\ufffe\n\u000e\ufffe\f\r\b\u000b\f\uffdf\b\u000b￩\u000e\f\u0001ￜ\b\u0006\u0006\ufffa\u0007�￠\ufffe\r￭\b\u0004\ufffe\u0007", false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 230, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50, "\b\u0017\ufff7\u0012\u000e\b\u0011\ufff5\b\u0014\u0018\b\u0016\u0017\u0012\u0015\u0016￩\u0012\u0015\ufff3\u0018\u0016\u000bￃ\uffd0ￃ\u0006\u0004\u0015\u0007ￃ\u0017\u0012ￃ\n\b\u0017ￃ\u0017\u0012\u000e\b\u0011\u0016ￃ\uffddￃ\u0007\u0012￪", false, MotionEvent.axisFromString("") + 222, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i4 = f20330m + 75;
            f20331n = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f20333f = str;
        a();
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20330m + 1;
        f20331n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q(ExpandableListView.getPackedPositionType(0L) + 32, "￫\ufffe\n\u000e\ufffe\f\r\b\u000b\f\uffdf\b\u000b￩\u000e\f\u0001ￜ\b\u0006\u0006\ufffa\u0007�￠\ufffe\r￭\b\u0004\ufffe\u0007", false, 231 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) + 24, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20331n + 53;
        f20330m = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
