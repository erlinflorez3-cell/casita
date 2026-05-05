package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.ax.e;
import o.ep.h;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;

    /* JADX INFO: renamed from: k */
    public static int f27237k = 0;

    /* JADX INFO: renamed from: n */
    public static int f27238n = 0;

    /* JADX INFO: renamed from: p */
    public static int f27239p = 0;

    /* JADX INFO: renamed from: q */
    public static int f27240q = 0;

    /* JADX INFO: renamed from: t */
    public static int f27241t = 0;

    /* JADX INFO: renamed from: u */
    private static int f27242u = 0;

    /* JADX INFO: renamed from: v */
    private static int f27243v = 0;

    /* JADX INFO: renamed from: w */
    private static int f27244w = 0;

    /* JADX INFO: renamed from: y */
    private static char[] f27245y = null;

    /* JADX INFO: renamed from: l */
    CancellationSignal f27246l;

    /* JADX INFO: renamed from: m */
    final o.eb.e f27247m;

    /* JADX INFO: renamed from: o */
    o.eb.b f27248o;

    /* JADX INFO: renamed from: s */
    private final boolean f27249s;

    /* JADX INFO: renamed from: x */
    private final o.ep.h f27250x;

    /* JADX INFO: renamed from: o.y.m$5 */
    public class AnonymousClass5 implements e.b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f27251b = 0;

        /* JADX INFO: renamed from: c */
        private static int f27252c = 0;

        /* JADX INFO: renamed from: e */
        private static int f27253e = 0;

        /* JADX INFO: renamed from: f */
        private static int f27254f = 0;

        /* JADX INFO: renamed from: g */
        private static int f27255g = 0;

        /* JADX INFO: renamed from: h */
        private static short[] f27256h = null;

        /* JADX INFO: renamed from: i */
        private static byte[] f27257i = null;

        /* JADX INFO: renamed from: j */
        private static long f27258j = 0;

        /* JADX INFO: renamed from: k */
        public static int f27259k = 0;

        /* JADX INFO: renamed from: l */
        public static int f27260l = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Context f27261a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, byte r9, int r10) {
            /*
                int r0 = r8 * 4
                int r8 = 3 - r0
                int r0 = r10 + 103
                byte[] r7 = o.y.m.AnonymousClass5.$$c
                int r6 = r9 * 2
                int r1 = r6 + 1
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r7 != 0) goto L28
                r3 = r8
                r2 = r4
            L13:
                int r0 = -r0
                int r8 = r8 + r0
                r1 = r2
            L16:
                byte r0 = (byte) r8
                r5[r1] = r0
                int r2 = r1 + 1
                int r3 = r3 + 1
                if (r1 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r0 = r7[r3]
                goto L13
            L28:
                r1 = r4
                r3 = r8
                r8 = r0
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.$$e(byte, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f27260l = 238264562;
            f27259k = -1202264236;
            init$0();
            f27255g = 0;
            f27254f = 1;
            f27252c = 1161252990;
            f27251b = 1150422457;
            f27253e = -1391216818;
            f27257i = new byte[]{-24, MessagePack.Code.STR16, -18, 60, 39, Ascii.SO, Ascii.GS, MessagePack.Code.NIL, Utf8.REPLACEMENT_BYTE, 36, 39, MessagePack.Code.FIXEXT4, Ascii.SI, 2, MessagePack.Code.INT16, MessagePack.Code.FIXEXT8, 62, 62, MessagePack.Code.STR32, MessagePack.Code.FLOAT32, Ascii.GS, MessagePack.Code.INT16, 55, MessagePack.Code.INT16, -18, 42, Ascii.SI, 5, 57, 39, MessagePack.Code.MAP16, 42, MessagePack.Code.MAP16, 75, MessagePack.Code.FIXEXT8, Base64.padSymbol, -24, Ascii.SI, 115, -30, -116, -2, -103, -29, -81, MessagePack.Code.MAP16, -119, -105, MessagePack.Code.ARRAY32, -25, -117, -5, 113, 116, MessagePack.Code.FIXEXT4, 106, 81, 81, 68, 85, 98, 72, 109, 110, 64, 87, 90, 97, -125, 47, 94, 82, 109, 81, 68, 85, -110, 47, 65, 96, 90, 86, -126, 16, 108, 92, 91, 106, 89, -101, Ascii.ESC, 89, 109, -109, -98, -98, 123, 46, 118, 113, Base64.padSymbol, 32, 60, -117, 120, -3, 102, 113, Base64.padSymbol, 32, 60, -117, 120, -3, 102, -116, 47, 117, 57, 77, 127, 35, 115, 122, 37, 116, 58, -70, 116, 32, -30, -115, -115, -115, -115, -115, -115};
            f27258j = -5680065787137940688L;
        }

        AnonymousClass5(Context context) {
            context = context;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:(2:204|142)|(1:144)(4:145|209|146|(9:148|154|205|155|(1:157)(9:161|207|162|163|164|(1:166)|(7:211|170|(1:172)(7:186|212|187|188|(1:175)(1:185)|176|(3:(1:179)(1:184)|180|(2:182|183)))|173|(0)(0)|176|(0))|192|193)|158|(0)|192|193)(1:149))|153|154|205|155|(0)(0)|158|(0)|192|193) */
        /* JADX WARN: Removed duplicated region for block: B:157:0x04a3  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x04b1 A[Catch: Exception -> 0x04ad, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ad, blocks: (B:155:0x0483, B:161:0x04b1, B:163:0x0501, B:168:0x0518, B:169:0x051e, B:162:0x04bb), top: B:205:0x0483, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0578  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x057e  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x060d  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(int r24, int r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1769
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.d(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{64, -9, -71, 106};
            $$b = 188;
        }

        static void init$1() {
            $$c = new byte[]{108, -100, -109, 80};
            $$d = 58;
        }

        private static void m(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            int i5;
            long j2;
            int i6;
            int i7 = 2;
            int i8 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f27251b)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a(238 - KeyEvent.normalizeMetaState(0), (char) (44530 - TextUtils.indexOf((CharSequence) "", '0', 0)), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), 35969549, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i9 = $10 + 43;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = 1;
                } else {
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 0;
                }
                if (i5 != 0) {
                    byte[] bArr = f27257i;
                    long j3 = 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i13 = 0;
                        while (i13 < length) {
                            int i14 = $10 + 81;
                            $11 = i14 % 128;
                            int i15 = i14 % i7;
                            Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(629 - (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 28648), 11 - (KeyEvent.getMaxKeyCode() >> 16), 1621469864, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i13++;
                            i7 = 2;
                            j3 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f27257i;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f27252c)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a(238 - (KeyEvent.getMaxKeyCode() >> 16), (char) (44530 - TextUtils.lastIndexOf("", '0', 0, 0)), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 35969549, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f27251b) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f27256h[i2 + ((int) (((long) f27252c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f27251b) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f27252c) ^ j2)) + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f27253e), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 1, (char) (5358 - View.getDefaultSize(0, 0)), KeyEvent.normalizeMetaState(0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f27257i;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-7649639543924978291L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            int i17 = $10 + 61;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                byte[] bArr6 = f27257i;
                                jVar.f19936d = jVar.f19936d;
                                i6 = jVar.f19935c / (((byte) (((byte) (((long) bArr6[r2]) - (-7649639543924978291L))) * s2)) ^ b2);
                            } else {
                                byte[] bArr7 = f27257i;
                                jVar.f19936d = jVar.f19936d - 1;
                                i6 = jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2);
                            }
                            jVar.f19937e = (char) i6;
                        } else {
                            short[] sArr = f27256h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

        private static void n(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i4 = $11 + 21;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2.toCharArray();
                }
            }
            o.a.k kVar = new o.a.k();
            char[] cArrC = o.a.k.c(f27258j ^ (-5882309809461882246L), (char[]) charArray, i2);
            int i6 = 4;
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                kVar.f19938a = kVar.f19939c - i6;
                int i9 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i6]), Long.valueOf(kVar.f19938a), Long.valueOf(f27258j)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228, (char) (Process.getGidForName("") + 51005), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, 1749983833, false, $$e(b2, b2, (byte) $$c.length), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA2 = o.d.d.a(676 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - TextUtils.lastIndexOf("", '0'), 522683165, false, $$e(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 11)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    i6 = 4;
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

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void o(byte r8, byte r9, byte r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 2
                int r8 = 4 - r0
                int r0 = r10 * 4
                int r7 = 1 - r0
                byte[] r6 = o.y.m.AnonymousClass5.$$a
                int r0 = r9 * 4
                int r0 = 100 - r0
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L2e
                r2 = r7
                r3 = r4
            L15:
                int r0 = -r0
                int r0 = r0 + r2
                int r8 = r8 + 1
                r2 = r3
            L1a:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r3 != r7) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L29:
                r1 = r6[r8]
                r2 = r0
                r0 = r1
                goto L15
            L2e:
                r2 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.o(byte, byte, byte, java.lang.Object[]):void");
        }

        @Override // o.ax.e.b
        public final void b(String str) throws Throwable {
            int i2 = 2 % 2;
            if (o.ea.f.a()) {
                int i3 = f27255g + 61;
                f27254f = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                m((short) (Color.alpha(0) - 7), (-27614708) + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 377374085 - MotionEvent.axisFromString(""), Color.rgb(0, 0, 0) + 16777203, (byte) (94 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                n("戛扴塁\ue965龶便ﵦ\uead2Ꝁ⹃롦\u2002\ue832掍猱朥ⴰ壶ⷙ驐盞鷘\ue8f1", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                int i5 = f27254f + 91;
                f27255g = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 3;
                }
            }
            if (m.d(m.this) != null) {
                m.this.f27246l = new CancellationSignal();
                m.this.f27247m.launch2(context, m.this.f27248o, str, m.this.f27246l);
            }
        }

        @Override // o.ax.e.b
        public final void b(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27255g + 117;
            f27254f = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                int i5 = f27255g + 63;
                f27254f = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                m((short) ((-7) - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.getSize(0) - 27614707, 377374085 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-13) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 94), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                n("銝鋲좦禂㽅둉嶕ꟾ埆뺤ᢕ洮ᢴ\uf36a폂⨉\udda3젅贠흳虈ാ䠔", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                int i7 = f27254f + 19;
                f27255g = i7 % 128;
                int i8 = i7 % 2;
            }
            Object[] objArr3 = {m.this};
            int iActiveCount = Thread.activeCount();
            int i9 = m.f27240q * (-1399050305);
            m.f27240q = i9;
            int i10 = m.f27241t * 267513568;
            m.f27241t = i10;
            if (((o.x.f) m.a((int) Runtime.getRuntime().freeMemory(), -1578218857, objArr3, i10, 1578218858, i9, iActiveCount)) != null) {
                if (cVar.c() != o.bg.a.az) {
                    m.c(m.this).onError(o.by.c.b(cVar));
                    int i11 = f27254f + 11;
                    f27255g = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
                int i13 = f27255g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f27254f = i13 % 128;
                if (i13 % 2 != 0) {
                    m.a(m.this);
                    Object[] objArr4 = {m.this};
                    int i14 = m.f27238n * 607093118;
                    m.f27238n = i14;
                    int i15 = m.f27237k * (-305438439);
                    m.f27237k = i15;
                    int i16 = m.f27239p * 1804208547;
                    m.f27239p = i16;
                    ((o.x.f) m.a((int) Runtime.getRuntime().maxMemory(), 507695054, objArr4, i16, -507695054, i15, i14)).onAuthenticationDeclined();
                    return;
                }
                m.a(m.this);
                Object[] objArr5 = {m.this};
                int i17 = m.f27238n * 607093118;
                m.f27238n = i17;
                int i18 = m.f27237k * (-305438439);
                m.f27237k = i18;
                int i19 = m.f27239p * 1804208547;
                m.f27239p = i19;
                ((o.x.f) m.a((int) Runtime.getRuntime().maxMemory(), 507695054, objArr5, i19, -507695054, i18, i17)).onAuthenticationDeclined();
                int i20 = 46 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r5, int r6, int r7) {
        /*
            int r2 = r6 * 2
            int r1 = 1 - r2
            int r0 = r7 * 4
            int r7 = 120 - r0
            byte[] r6 = o.y.m.$$d
            int r0 = r5 * 4
            int r5 = 3 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2b
            r0 = r2
            r1 = r3
        L17:
            int r0 = -r0
            int r7 = r7 + r0
        L19:
            int r5 = r5 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L17
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.m.$$j(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27241t = -2135624098;
        f27240q = -56525582;
        f27239p = -1006288429;
        f27237k = -615686389;
        f27238n = 907331232;
        f27242u = 0;
        A = 1;
        f27244w = 0;
        f27243v = 1;
        m();
        int i2 = f27242u + 11;
        A = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public m(String str, o.ep.d dVar, boolean z2, o.eb.e eVar, o.ep.h hVar) {
        super(str, dVar);
        this.f27249s = z2;
        this.f27247m = eVar;
        this.f27250x = hVar;
    }

    private static void B(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        byte b2;
        char[] cArr;
        char c2;
        int length;
        char[] cArr2;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = 1;
        int i9 = iArr[1];
        int i10 = iArr[2];
        char c3 = 3;
        int i11 = iArr[3];
        char[] cArr3 = f27245y;
        if (cArr3 != null) {
            int i12 = $10 + 57;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i8 = 0;
            }
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int mode = 249 - View.MeasureSpec.getMode(i6);
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollBarSize = 11 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b3 = $$d[c3];
                        byte b4 = (byte) (b3 - 1);
                        objA = o.d.d.a(mode, jumpTapTimeout, scrollBarSize, 1376582792, false, $$j(b4, b4, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i6 = 0;
                    c3 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i9];
        System.arraycopy(cArr3, i7, cArr4, 0, i9);
        if (bArr != null) {
            int i13 = $10 + 107;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i9];
                b2 = 1;
                mVar.f19943d = 1;
                c2 = 1;
            } else {
                b2 = 1;
                cArr = new char[i9];
                mVar.f19943d = 0;
                c2 = 0;
            }
            while (mVar.f19943d < i9) {
                if (bArr[mVar.f19943d] == b2) {
                    int i14 = mVar.f19943d;
                    char c4 = cArr4[mVar.f19943d];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c4);
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 12, (char) Color.alpha(0), (Process.myTid() >> 22) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        int size = View.MeasureSpec.getSize(0) + 836;
                        char c5 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27278);
                        int iArgb = 11 - Color.argb(0, 0, 0, 0);
                        byte b5 = (byte) ($$d[3] - 1);
                        byte b6 = b5;
                        objA3 = o.d.d.a(size, c5, iArgb, -1210801192, false, $$j(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 21, (char) (TextUtils.lastIndexOf("", '0', 0) + 35716), 10 - ImageFormat.getBitsPerPixel(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr4 = cArr;
        }
        if (i11 > 0) {
            int i16 = $11 + 27;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                char[] cArr5 = new char[i9];
                i2 = 0;
                System.arraycopy(cArr4, 1, cArr5, 0, i9);
                System.arraycopy(cArr5, 1, cArr4, i9 * i11, i11);
                System.arraycopy(cArr5, i11, cArr4, 0, i9 % i11);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i9];
                System.arraycopy(cArr4, 0, cArr6, 0, i9);
                int i17 = i9 - i11;
                System.arraycopy(cArr6, 0, cArr4, i17, i11);
                System.arraycopy(cArr6, i11, cArr4, 0, i17);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i9];
            mVar.f19943d = i2;
            while (mVar.f19943d < i9) {
                cArr7[mVar.f19943d] = cArr4[(i9 - mVar.f19943d) - 1];
                mVar.f19943d++;
                int i18 = $10 + 63;
                $11 = i18 % 128;
                int i19 = i18 % 2;
            }
            cArr4 = cArr7;
        }
        if (i10 > 0) {
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i9) {
                    break;
                }
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                i20 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = (i8 + i3) - (i8 & i3);
        int i10 = ~((-1) - (((-1) - i9) & ((-1) - i7)));
        int i11 = ~i7;
        int i12 = ~i3;
        int i13 = (-1) - (((-1) - i11) & ((-1) - (~((i12 + i5) - (i12 & i5)))));
        int i14 = (-1) - (((-1) - (~((i8 + i7) - (i8 & i7)))) & ((-1) - (~i9)));
        int i15 = ~((i7 + i3) - (i7 & i3));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = i5 + i3 + i6 + ((-953487067) * i4) + ((-1992133889) * i2);
        int i18 = i17 * i17;
        int i19 = (1737059190 * i5) + 1765277696 + (1051104396 * i3) + (i10 * (-342977397)) + (342977397 * i13) + ((-342977397) * i16) + (1394081792 * i6) + ((-1703411712) * i4) + (1961361408 * i2) + (907935744 * i18);
        int i20 = ((i5 * 272661978) - 2115615402) + (i3 * 272662804) + (i10 * HttpStatus.SC_REQUEST_TOO_LONG) + (i13 * (-413)) + (i16 * HttpStatus.SC_REQUEST_TOO_LONG) + (i6 * 272662391) + (i4 * 2077717299) + (i2 * 1957688713) + (i18 * 166854656);
        if (i19 + (i20 * i20 * (-213778432)) == 1) {
            return d(objArr);
        }
        m mVar = (m) objArr[0];
        int i21 = 2 % 2;
        int i22 = f27243v + 57;
        f27244w = i22 % 128;
        int i23 = i22 % 2;
        o.x.f fVarI = mVar.i();
        int i24 = f27243v + 49;
        f27244w = i24 % 128;
        int i25 = i24 % 2;
        return fVarI;
    }

    static /* synthetic */ void a(m mVar) {
        int i2 = 2 % 2;
        int i3 = f27244w + 123;
        f27243v = i3 % 128;
        int i4 = i3 % 2;
        mVar.e();
        int i5 = f27243v + 113;
        f27244w = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ o.x.f b(m mVar) {
        Object[] objArr = {mVar};
        int iActiveCount = Thread.activeCount();
        int i2 = f27240q * (-1399050305);
        f27240q = i2;
        int i3 = f27241t * 267513568;
        f27241t = i3;
        return (o.x.f) a((int) Runtime.getRuntime().freeMemory(), -1578218857, objArr, i3, 1578218858, i2, iActiveCount);
    }

    static /* synthetic */ o.x.f c(m mVar) {
        int i2 = 2 % 2;
        int i3 = f27244w + 57;
        f27243v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = mVar.i();
        int i5 = f27243v + 125;
        f27244w = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        m mVar = (m) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27243v + 85;
        f27244w = i3 % 128;
        if (i3 % 2 != 0) {
            mVar.i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = mVar.i();
        int i4 = f27244w + 49;
        f27243v = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f d(m mVar) {
        int i2 = 2 % 2;
        int i3 = f27244w + 7;
        f27243v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = mVar.i();
        int i5 = f27244w + 41;
        f27243v = i5 % 128;
        if (i5 % 2 != 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ o.x.f e(m mVar) {
        Object[] objArr = {mVar};
        int i2 = f27238n * 607093118;
        f27238n = i2;
        int i3 = f27237k * (-305438439);
        f27237k = i3;
        int i4 = f27239p * 1804208547;
        f27239p = i4;
        return (o.x.f) a((int) Runtime.getRuntime().maxMemory(), 507695054, objArr, i4, -507695054, i3, i2);
    }

    static void init$0() {
        $$d = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
        $$e = 93;
    }

    static void m() {
        f27245y = new char[]{56555, 56407, 56415, 56408, 56403, 56417, 56423, 56424, 56415, 56410, 56395, 56390, 56413, 56415, 56397, 56405, 56421, 56500, 56552, 56552, 56534, 56532, 56555, 56563, 56556, 56548, 56540, 56546, 56555, 56553, 56558, 56539, 56542, 56563, 56556, 56548, 56553, 56560, 56545, 56548, 56557, 56550, 56558, 56561, 56558, 56534, 56537, 56552, 56540, 56541, 56555, 56553, 56530, 56535, 56550, 56554, 56503, 56560, 56545, 56543, 56561, 56563, 56562, 56563, 56556, 56548, 56498, 56540, 56546, 56555, 56547, 56551, 56561, 56545, 56537, 56555, 56553, 56530, 56535, 56550, 56555, 56564, 56563, 56557, 56543, 56541, 56548, 56550, 56559, 56564, 56528, 56341, 56334, 56342, 56345, 56342, 56334};
    }

    public final void a(Context context, o.x.f fVar, o.eb.b bVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f27244w + 121;
        f27243v = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            B("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{17, 39, 0, 15}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B("\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{90, 7, 40, 0}, true, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f27248o = bVar;
        this.f27247m.setProcessCallback(fVar);
        b(context, fVar);
        int i5 = f27243v + 113;
        f27244w = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27243v + 69;
        f27244w = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!this.f27249s) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            B("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{66, 24, 0, 19}, true, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        Object[] objArr2 = {this.f27250x};
        int i4 = o.ep.h.f24529j * (-1456136215);
        o.ep.h.f24529j = i4;
        int i5 = o.ep.h.f24527h * 389977318;
        o.ep.h.f24527h = i5;
        int i6 = o.ep.h.f24528i * (-407821031);
        o.ep.h.f24528i = i6;
        int i7 = o.ep.h.f24526f * (-2143292461);
        o.ep.h.f24526f = i7;
        if (((h.e) o.ep.h.c(-1791483773, i4, 1791483775, i5, objArr2, i6, i7)) == h.e.f24570a) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            B("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{0, 17, 116, 3}, false, objArr3);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr3[0]).intern());
        }
        int i8 = f27243v + 17;
        f27244w = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 49 / 0;
        }
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27243v + 27;
        f27244w = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            B("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{0, 17, 116, 3}, true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{0, 17, 116, 3}, false, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f27244w + 93;
        f27243v = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return strIntern;
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27243v + 123;
        f27244w = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f27243v + 1;
            f27244w = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            B("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{17, 39, 0, 15}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{56, 10, 0, 6}, true, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f27243v + 11;
            f27244w = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 2;
            }
        }
        new o.ax.e(context, new e.b() { // from class: o.y.m.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b */
            private static int f27251b = 0;

            /* JADX INFO: renamed from: c */
            private static int f27252c = 0;

            /* JADX INFO: renamed from: e */
            private static int f27253e = 0;

            /* JADX INFO: renamed from: f */
            private static int f27254f = 0;

            /* JADX INFO: renamed from: g */
            private static int f27255g = 0;

            /* JADX INFO: renamed from: h */
            private static short[] f27256h = null;

            /* JADX INFO: renamed from: i */
            private static byte[] f27257i = null;

            /* JADX INFO: renamed from: j */
            private static long f27258j = 0;

            /* JADX INFO: renamed from: k */
            public static int f27259k = 0;

            /* JADX INFO: renamed from: l */
            public static int f27260l = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ Context f27261a;

            private static String $$e(byte v2, byte v3, int v4) {
                /*
                    int r0 = r8 * 4
                    int r8 = 3 - r0
                    int r0 = r10 + 103
                    byte[] r7 = o.y.m.AnonymousClass5.$$c
                    int r6 = r9 * 2
                    int r1 = r6 + 1
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r7 != 0) goto L28
                    r3 = r8
                    r2 = r4
                L13:
                    int r0 = -r0
                    int r8 = r8 + r0
                    r1 = r2
                L16:
                    byte r0 = (byte) r8
                    r5[r1] = r0
                    int r2 = r1 + 1
                    int r3 = r3 + 1
                    if (r1 != r6) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L25:
                    r0 = r7[r3]
                    goto L13
                L28:
                    r1 = r4
                    r3 = r8
                    r8 = r0
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.$$e(byte, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f27260l = 238264562;
                f27259k = -1202264236;
                init$0();
                f27255g = 0;
                f27254f = 1;
                f27252c = 1161252990;
                f27251b = 1150422457;
                f27253e = -1391216818;
                f27257i = new byte[]{-24, MessagePack.Code.STR16, -18, 60, 39, Ascii.SO, Ascii.GS, MessagePack.Code.NIL, Utf8.REPLACEMENT_BYTE, 36, 39, MessagePack.Code.FIXEXT4, Ascii.SI, 2, MessagePack.Code.INT16, MessagePack.Code.FIXEXT8, 62, 62, MessagePack.Code.STR32, MessagePack.Code.FLOAT32, Ascii.GS, MessagePack.Code.INT16, 55, MessagePack.Code.INT16, -18, 42, Ascii.SI, 5, 57, 39, MessagePack.Code.MAP16, 42, MessagePack.Code.MAP16, 75, MessagePack.Code.FIXEXT8, Base64.padSymbol, -24, Ascii.SI, 115, -30, -116, -2, -103, -29, -81, MessagePack.Code.MAP16, -119, -105, MessagePack.Code.ARRAY32, -25, -117, -5, 113, 116, MessagePack.Code.FIXEXT4, 106, 81, 81, 68, 85, 98, 72, 109, 110, 64, 87, 90, 97, -125, 47, 94, 82, 109, 81, 68, 85, -110, 47, 65, 96, 90, 86, -126, 16, 108, 92, 91, 106, 89, -101, Ascii.ESC, 89, 109, -109, -98, -98, 123, 46, 118, 113, Base64.padSymbol, 32, 60, -117, 120, -3, 102, 113, Base64.padSymbol, 32, 60, -117, 120, -3, 102, -116, 47, 117, 57, 77, 127, 35, 115, 122, 37, 116, 58, -70, 116, 32, -30, -115, -115, -115, -115, -115, -115};
                f27258j = -5680065787137940688L;
            }

            AnonymousClass5(Context context2) {
                context = context2;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:(2:204|142)|(1:144)(4:145|209|146|(9:148|154|205|155|(1:157)(9:161|207|162|163|164|(1:166)|(7:211|170|(1:172)(7:186|212|187|188|(1:175)(1:185)|176|(3:(1:179)(1:184)|180|(2:182|183)))|173|(0)(0)|176|(0))|192|193)|158|(0)|192|193)(1:149))|153|154|205|155|(0)(0)|158|(0)|192|193) */
            /* JADX WARN: Removed duplicated region for block: B:157:0x04a3  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x04b1 A[Catch: Exception -> 0x04ad, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ad, blocks: (B:155:0x0483, B:161:0x04b1, B:163:0x0501, B:168:0x0518, B:169:0x051e, B:162:0x04bb), top: B:205:0x0483, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0578  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x057e  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x060d  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(int r24, int r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1769
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.d(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{64, -9, -71, 106};
                $$b = 188;
            }

            static void init$1() {
                $$c = new byte[]{108, -100, -109, 80};
                $$d = 58;
            }

            private static void m(short s2, int i22, int i32, int i42, byte b2, Object[] objArr3) throws Throwable {
                int i52;
                long j2;
                int i62;
                int i72 = 2;
                int i82 = 2 % 2;
                o.a.j jVar = new o.a.j();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr22 = {Integer.valueOf(i42), Integer.valueOf(f27251b)};
                    Object objA = o.d.d.a(-727631768);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(238 - KeyEvent.normalizeMetaState(0), (char) (44530 - TextUtils.indexOf((CharSequence) "", '0', 0)), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), 35969549, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                    if (iIntValue == -1) {
                        int i9 = $10 + 43;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        i52 = 1;
                    } else {
                        int i11 = $11 + 23;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        i52 = 0;
                    }
                    if (i52 != 0) {
                        byte[] bArr = f27257i;
                        long j3 = 0;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i13 = 0;
                            while (i13 < length) {
                                int i14 = $10 + 81;
                                $11 = i14 % 128;
                                int i15 = i14 % i72;
                                Object[] objArr32 = {Integer.valueOf(bArr[i13])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objA2 = o.d.d.a(629 - (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 28648), 11 - (KeyEvent.getMaxKeyCode() >> 16), 1621469864, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                                }
                                bArr2[i13] = ((Byte) ((Method) objA2).invoke(null, objArr32)).byteValue();
                                i13++;
                                i72 = 2;
                                j3 = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = f27257i;
                            Object[] objArr4 = {Integer.valueOf(i22), Integer.valueOf(f27252c)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(238 - (KeyEvent.getMaxKeyCode() >> 16), (char) (44530 - TextUtils.lastIndexOf("", '0', 0, 0)), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 35969549, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f27251b) ^ (-7649639543924978291L))));
                            j2 = -7649639543924978291L;
                        } else {
                            j2 = -7649639543924978291L;
                            iIntValue = (short) (((short) (((long) f27256h[i22 + ((int) (((long) f27252c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f27251b) ^ (-7649639543924978291L))));
                        }
                    } else {
                        j2 = -7649639543924978291L;
                    }
                    if (iIntValue > 0) {
                        jVar.f19936d = ((i22 + iIntValue) - 2) + ((int) (((long) f27252c) ^ j2)) + i52;
                        Object[] objArr5 = {jVar, Integer.valueOf(i32), Integer.valueOf(f27253e), sb};
                        Object objA4 = o.d.d.a(1819197256);
                        if (objA4 == null) {
                            objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 1, (char) (5358 - View.getDefaultSize(0, 0)), KeyEvent.normalizeMetaState(0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        byte[] bArr4 = f27257i;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i16 = 0; i16 < length2; i16++) {
                                bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-7649639543924978291L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        jVar.f19934b = 1;
                        while (jVar.f19934b < iIntValue) {
                            if (z2) {
                                int i17 = $10 + 61;
                                $11 = i17 % 128;
                                if (i17 % 2 == 0) {
                                    byte[] bArr6 = f27257i;
                                    jVar.f19936d = jVar.f19936d;
                                    i62 = jVar.f19935c / (((byte) (((byte) (((long) bArr6[r2]) - (-7649639543924978291L))) * s2)) ^ b2);
                                } else {
                                    byte[] bArr7 = f27257i;
                                    jVar.f19936d = jVar.f19936d - 1;
                                    i62 = jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2);
                                }
                                jVar.f19937e = (char) i62;
                            } else {
                                short[] sArr = f27256h;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            }
                            sb.append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            jVar.f19934b++;
                        }
                    }
                    objArr3[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            private static void n(String str, int i22, Object[] objArr3) throws Throwable {
                String str2 = str;
                int i32 = 2 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    int i42 = $11 + 21;
                    $10 = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i52 = 23 / 0;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2.toCharArray();
                    }
                }
                o.a.k kVar = new o.a.k();
                char[] cArrC = o.a.k.c(f27258j ^ (-5882309809461882246L), (char[]) charArray, i22);
                int i62 = 4;
                kVar.f19939c = 4;
                while (kVar.f19939c < cArrC.length) {
                    int i72 = $11 + 55;
                    $10 = i72 % 128;
                    int i82 = i72 % 2;
                    kVar.f19938a = kVar.f19939c - i62;
                    int i9 = kVar.f19939c;
                    try {
                        Object[] objArr22 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i62]), Long.valueOf(kVar.f19938a), Long.valueOf(f27258j)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228, (char) (Process.getGidForName("") + 51005), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, 1749983833, false, $$e(b2, b2, (byte) $$c.length), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                        Object[] objArr32 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA2 = o.d.d.a(676 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - TextUtils.lastIndexOf("", '0'), 522683165, false, $$e(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 11)))), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr32);
                        i62 = 4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr3[0] = new String(cArrC, 4, cArrC.length - 4);
            }

            private static void o(byte v2, byte v3, byte v4, Object[] v5) {
                /*
                    int r0 = r8 * 2
                    int r8 = 4 - r0
                    int r0 = r10 * 4
                    int r7 = 1 - r0
                    byte[] r6 = o.y.m.AnonymousClass5.$$a
                    int r0 = r9 * 4
                    int r0 = 100 - r0
                    byte[] r5 = new byte[r7]
                    r4 = 0
                    if (r6 != 0) goto L2e
                    r2 = r7
                    r3 = r4
                L15:
                    int r0 = -r0
                    int r0 = r0 + r2
                    int r8 = r8 + 1
                    r2 = r3
                L1a:
                    int r3 = r2 + 1
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    if (r3 != r7) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r11[r4] = r0
                    return
                L29:
                    r1 = r6[r8]
                    r2 = r0
                    r0 = r1
                    goto L15
                L2e:
                    r2 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.m.AnonymousClass5.o(byte, byte, byte, java.lang.Object[]):void");
            }

            @Override // o.ax.e.b
            public final void b(String str) throws Throwable {
                int i22 = 2 % 2;
                if (o.ea.f.a()) {
                    int i32 = f27255g + 61;
                    f27254f = i32 % 128;
                    int i42 = i32 % 2;
                    Object[] objArr3 = new Object[1];
                    m((short) (Color.alpha(0) - 7), (-27614708) + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 377374085 - MotionEvent.axisFromString(""), Color.rgb(0, 0, 0) + 16777203, (byte) (94 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr22 = new Object[1];
                    n("戛扴塁\ue965龶便ﵦ\uead2Ꝁ⹃롦\u2002\ue832掍猱朥ⴰ壶ⷙ驐盞鷘\ue8f1", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr22);
                    o.ea.f.c(strIntern2, ((String) objArr22[0]).intern());
                    int i52 = f27254f + 91;
                    f27255g = i52 % 128;
                    if (i52 % 2 != 0) {
                        int i62 = 5 % 3;
                    }
                }
                if (m.d(m.this) != null) {
                    m.this.f27246l = new CancellationSignal();
                    m.this.f27247m.launch2(context, m.this.f27248o, str, m.this.f27246l);
                }
            }

            @Override // o.ax.e.b
            public final void b(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f27255g + 117;
                f27254f = i32 % 128;
                int i42 = i32 % 2;
                if (o.ea.f.a()) {
                    int i52 = f27255g + 63;
                    f27254f = i52 % 128;
                    int i62 = i52 % 2;
                    Object[] objArr3 = new Object[1];
                    m((short) ((-7) - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.getSize(0) - 27614707, 377374085 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-13) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 94), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr22 = new Object[1];
                    n("銝鋲좦禂㽅둉嶕ꟾ埆뺤ᢕ洮ᢴ\uf36a폂⨉\udda3젅贠흳虈ാ䠔", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr22);
                    o.ea.f.c(strIntern2, ((String) objArr22[0]).intern());
                    int i72 = f27254f + 19;
                    f27255g = i72 % 128;
                    int i82 = i72 % 2;
                }
                Object[] objArr32 = {m.this};
                int iActiveCount = Thread.activeCount();
                int i9 = m.f27240q * (-1399050305);
                m.f27240q = i9;
                int i10 = m.f27241t * 267513568;
                m.f27241t = i10;
                if (((o.x.f) m.a((int) Runtime.getRuntime().freeMemory(), -1578218857, objArr32, i10, 1578218858, i9, iActiveCount)) != null) {
                    if (cVar.c() != o.bg.a.az) {
                        m.c(m.this).onError(o.by.c.b(cVar));
                        int i11 = f27254f + 11;
                        f27255g = i11 % 128;
                        int i12 = i11 % 2;
                        return;
                    }
                    int i13 = f27255g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f27254f = i13 % 128;
                    if (i13 % 2 != 0) {
                        m.a(m.this);
                        Object[] objArr4 = {m.this};
                        int i14 = m.f27238n * 607093118;
                        m.f27238n = i14;
                        int i15 = m.f27237k * (-305438439);
                        m.f27237k = i15;
                        int i16 = m.f27239p * 1804208547;
                        m.f27239p = i16;
                        ((o.x.f) m.a((int) Runtime.getRuntime().maxMemory(), 507695054, objArr4, i16, -507695054, i15, i14)).onAuthenticationDeclined();
                        return;
                    }
                    m.a(m.this);
                    Object[] objArr5 = {m.this};
                    int i17 = m.f27238n * 607093118;
                    m.f27238n = i17;
                    int i18 = m.f27237k * (-305438439);
                    m.f27237k = i18;
                    int i19 = m.f27239p * 1804208547;
                    m.f27239p = i19;
                    ((o.x.f) m.a((int) Runtime.getRuntime().maxMemory(), 507695054, objArr5, i19, -507695054, i18, i17)).onAuthenticationDeclined();
                    int i20 = 46 / 0;
                }
            }
        }, bVar).b(dVar, g(), this.f27250x, ((c) this).f27088r.b());
    }

    public final fr.antelop.sdk.CancellationSignal n() {
        int i2 = 2 % 2;
        int i3 = f27244w + 99;
        f27243v = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CancellationSignal cancellationSignal = this.f27246l;
        if (cancellationSignal == null || cancellationSignal.isCanceled()) {
            return null;
        }
        fr.antelop.sdk.CancellationSignal cancellationSignal2 = new fr.antelop.sdk.CancellationSignal(this.f27246l);
        int i4 = f27243v + 9;
        f27244w = i4 % 128;
        if (i4 % 2 == 0) {
            return cancellationSignal2;
        }
        throw null;
    }
}
