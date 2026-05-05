package o.al;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.l;
import o.ab.j;
import o.bg.c;
import o.cg.b;
import o.cg.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: n */
    private static char[] f20299n = null;

    /* JADX INFO: renamed from: o */
    private static long f20300o = 0;

    /* JADX INFO: renamed from: p */
    private static int f20301p = 0;

    /* JADX INFO: renamed from: q */
    private static int f20302q = 0;

    /* JADX INFO: renamed from: r */
    private static int f20303r = 0;

    /* JADX INFO: renamed from: s */
    private static int f20304s = 0;

    /* JADX INFO: renamed from: f */
    byte[] f20305f;

    /* JADX INFO: renamed from: g */
    o.ep.d f20306g;

    /* JADX INFO: renamed from: j */
    byte[] f20307j;

    /* JADX INFO: renamed from: k */
    int f20308k;

    /* JADX INFO: renamed from: l */
    String f20309l;

    /* JADX INFO: renamed from: m */
    o.i.d f20310m;

    /* JADX INFO: renamed from: o.al.a$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c */
        private static int f20311c = 1;

        /* JADX INFO: renamed from: d */
        private static int f20312d = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f20313e;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20313e = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20311c + 115;
                f20312d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20313e[o.bg.a.aB.ordinal()] = 2;
                int i5 = f20311c;
                int i6 = ((23 | i5) << 1) - (i5 ^ 23);
                f20312d = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface d {
        void c();

        void d(c cVar, int i2);
    }

    static final class e extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20314b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20315c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20316d = 0;

        /* JADX INFO: renamed from: f */
        public static int f20317f = 0;

        /* JADX INFO: renamed from: g */
        public static int f20318g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20319h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20320i = 0;

        /* JADX INFO: renamed from: j */
        private static int[] f20321j = null;

        /* JADX INFO: renamed from: k */
        private static int f20322k = 0;

        /* JADX INFO: renamed from: l */
        private static int f20323l = 0;

        /* JADX INFO: renamed from: m */
        private static int f20324m = 0;

        /* JADX INFO: renamed from: n */
        private static byte[] f20325n = null;

        /* JADX INFO: renamed from: o */
        private static short[] f20326o = null;

        /* JADX INFO: renamed from: v */
        public static int f20327v = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(byte r7, byte r8, int r9) {
            /*
                int r0 = r7 * 4
                int r0 = r0 + 4
                int r8 = r8 + 103
                byte[] r7 = o.al.a.e.$$k
                int r1 = r9 * 2
                int r6 = r1 + 1
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r7 != 0) goto L2a
                r3 = r4
                r2 = r0
            L13:
                int r1 = -r0
                int r1 = r1 + r8
                int r0 = r2 + 1
                r8 = r1
            L18:
                byte r1 = (byte) r8
                r5[r3] = r1
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r1 = r7[r0]
                r2 = r0
                r0 = r1
                goto L13
            L2a:
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.al.a.e.$$m(byte, byte, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20327v = -1402673363;
            init$0();
            f20317f = -714092490;
            f20318g = 670796552;
            f20315c = -264515662;
            f20316d = 1667328039;
            f20314b = -576495061;
            f20323l = 0;
            f20324m = 1;
            f20321j = new int[]{-733831206, -1452795255, -1700046379, -1474745684, 1465455051, -469578170, 674620310, 1006203843, -1857278587, -889524007, -2031519811, 1433468128, 854646312, -893803898, -2128010384, 528164055, 827495450, -2060449732};
            f20320i = -977092758;
            f20319h = 1150422431;
            f20322k = 73136471;
            f20325n = new byte[]{103, 99, -102, 102, -101, 98, -101, 98, 100, -100, 97, -99, -102, 97, 102, -103, -99, 99, -123, 113, -88, 81, -127, -99, 104, 124, 121, -13, 7, MessagePack.Code.MAP16, 39, -9, -21, 43, MessagePack.Code.NEGFIXINT_PREFIX, 5, 116, -120, 127, 85, -86, 116, -115, 125, -122, 90, 89, MessagePack.Code.EXT8, 120, Base64.padSymbol, -74, -121, -122, -127, 114, -118, 113, -101, 98, -111, 119, -102, -98, -103, -104, 100, 75, -87, 98, 109, -105, 100, -103, 118, -115, -115, -115, -115, -115};
        }

        public e(a aVar) {
            super(aVar, true);
        }

        private static void A(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            boolean z2;
            int i5 = 2;
            int i6 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20319h)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 237, (char) (44531 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 35969549, false, $$m(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 == 0) {
                    j2 = -7649639543924978291L;
                } else {
                    byte[] bArr = f20325n;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = $10 + 69;
                            $11 = i9 % 128;
                            int i10 = i9 % i5;
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) ((Process.myTid() >> 22) + 28649), 10 - ImageFormat.getBitsPerPixel(0), 1621469864, false, $$m(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i8++;
                            i5 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f20325n;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f20320i)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objA3 = o.d.d.a(238 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 44531), TextUtils.indexOf("", "") + 11, 35969549, false, $$m(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20319h) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f20326o[i2 + ((int) (((long) f20320i) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20319h) ^ (-7649639543924978291L))));
                    }
                }
                if (iIntValue > 0) {
                    jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f20320i) ^ j2)) + i7;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20322k), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (KeyEvent.keyCodeFromString("") + 5358), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f20325n;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i11 = 0;
                        while (i11 < length2) {
                            int i12 = $11 + 103;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                bArr5[i11] = (byte) (((long) bArr4[i11]) - 7649639543924978291L);
                                i11 <<= 1;
                            } else {
                                bArr5[i11] = (byte) (((long) bArr4[i11]) ^ (-7649639543924978291L));
                                i11++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i13 = $10 + 45;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (!(!z2)) {
                            int i15 = $11 + 5;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            byte[] bArr6 = f20325n;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            int i17 = $10 + 5;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            short[] sArr = f20326o;
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

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void B(short r9, int r10, byte r11, java.lang.Object[] r12) {
            /*
                int r8 = r10 * 3
                int r1 = r8 + 1
                byte[] r7 = o.al.a.e.$$a
                int r0 = r11 + 98
                int r6 = r9 + 4
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r7 != 0) goto L2a
                r2 = r8
                r3 = r4
            L11:
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L14:
                byte r1 = (byte) r0
                r5[r2] = r1
                int r3 = r2 + 1
                if (r2 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r12[r4] = r0
                return
            L23:
                int r6 = r6 + 1
                r1 = r7[r6]
                r2 = r0
                r0 = r1
                goto L11
            L2a:
                r2 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.al.a.e.B(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(int r9, byte r10, short r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = o.al.a.e.$$d
                int r0 = r11 * 7
                int r7 = 11 - r0
                int r0 = r10 * 7
                int r6 = 8 - r0
                int r0 = r9 * 10
                int r5 = r0 + 101
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r8 != 0) goto L2e
                r5 = r6
                r0 = r7
                r2 = r3
            L16:
                int r7 = r7 + 1
                int r5 = r5 + r0
                int r5 = r5 + (-6)
                r1 = r2
            L1c:
                byte r0 = (byte) r5
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r6) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L2b:
                r0 = r8[r7]
                goto L16
            L2e:
                r1 = r3
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.al.a.e.E(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object a(Object[] objArr) {
            e eVar = (e) objArr[0];
            c cVar = (c) objArr[1];
            int i2 = 2 % 2;
            int i3 = f20323l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f20324m = i3 % 128;
            int i4 = i3 % 2;
            ((a) eVar.e()).g().d(cVar, ((a) eVar.e()).f20308k);
            int i5 = f20323l + 3;
            f20324m = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[PHI: r3
  0x00ba: PHI (r3v5 byte[][]) = (r3v2 byte[][]), (r3v6 byte[][]) binds: [B:37:0x00e9, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ec A[PHI: r3
  0x00ec: PHI (r3v3 byte[][]) = (r3v2 byte[][]), (r3v6 byte[][]) binds: [B:37:0x00e9, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ java.lang.Object c(int r9, int r10, int r11, int r12, int r13, int r14, java.lang.Object[] r15) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.al.a.e.c(int, int, int, int, int, int, java.lang.Object[]):java.lang.Object");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
            $$b = 177;
        }

        static void init$1() {
            $$d = new byte[]{117, -10, 112, 71, MessagePack.Code.BIN16, 57, 6, MessagePack.Code.INT64, 58, MessagePack.Code.EXT16, 19};
            $$e = 145;
        }

        static void init$2() {
            $$k = new byte[]{64, -9, -71, 106};
            $$l = 37;
        }

        private static void z(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20321j;
            long j2 = 0;
            int i4 = 989264422;
            int i5 = 16;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            int packedPositionGroup = 675 - ExpandableListView.getPackedPositionGroup(j2);
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int scrollBarFadeDuration = 12 - (ViewConfiguration.getScrollBarFadeDuration() >> i5);
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(packedPositionGroup, cResolveOpacity, scrollBarFadeDuration, -328001469, false, $$m(b2, (byte) (18 | b2), b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i7++;
                        j2 = 0;
                        i4 = 989264422;
                        i5 = 16;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f20321j;
            if (iArr5 != null) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b3 = (byte) i6;
                        objA2 = o.d.d.a(Color.alpha(i6) + 675, (char) Color.green(i6), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, -328001469, false, $$m(b3, (byte) (18 | b3), b3), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i10++;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                int i11 = $10 + 81;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i13 = 0;
                for (int i14 = 16; i13 < i14; i14 = 16) {
                    lVar.f19942e ^= iArr4[i13];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(KeyEvent.keyCodeFromString("") + 301, (char) (52697 - ExpandableListView.getPackedPositionGroup(0L)), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1416256172, false, $$m(b4, (byte) (16 | b4), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i13++;
                }
                int i15 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i15;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i16 = lVar.f19942e;
                int i17 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr5 = {lVar, lVar};
                Object objA4 = o.d.d.a(986820978);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(229 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 51004), 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -330018025, false, $$m(b5, (byte) (14 | b5), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            String str = new String(cArr2, 0, i2);
            int i18 = $11 + 17;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            A((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 2125417753, (-1086977190) + ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 22), objArr);
            b bVar = new b(context, 43, ((String) objArr[0]).intern());
            int i3 = f20323l + 81;
            f20324m = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 71 / 0;
            }
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            z(new int[]{-259839547, 334924272, 371982554, -276476826, -2003767976, 2076016445, 88525516, -324914992}, TextUtils.indexOf((CharSequence) "", '0') + 15, objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern(), Boolean.FALSE};
            int iNextInt = new Random().nextInt();
            int i3 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i3;
            int iMyUid = Process.myUid();
            int i4 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i4;
            boolean zBooleanValue = ((Boolean) o.ef.a.a(821341192, objArr2, iMyUid, i4, -821341184, iNextInt, i3)).booleanValue();
            a aVar2 = (a) e();
            Object[] objArr3 = new Object[1];
            z(new int[]{-1222872498, 7188642, -2094991818, -1556383244, -5446839, -392824730, -1296163080, 1416312228, -1014878394, 75362961}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern(), -1};
            int priority = Thread.currentThread().getPriority();
            int i5 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i5;
            aVar2.f20308k = ((Integer) o.ef.a.a(1647814368, objArr4, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i5)).intValue();
            if (!zBooleanValue) {
                int i6 = f20323l + 125;
                f20324m = i6 % 128;
                if (i6 % 2 == 0) {
                    f().d(o.bg.a.aF);
                    int i7 = 11 / 0;
                } else {
                    f().d(o.bg.a.aF);
                }
            }
            int i8 = f20324m + 17;
            f20323l = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20324m + 7;
            f20323l = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 != 5002) {
                return super.b(i2);
            }
            o.bg.a aVar = o.bg.a.aB;
            int i5 = f20324m + 111;
            f20323l = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = f20315c * (-792454617);
            f20315c = i2;
            int i3 = 777913969 * f20318g;
            f20318g = i3;
            int i4 = f20317f * (-614236349);
            f20317f = i4;
            c(i3, (int) Runtime.getRuntime().freeMemory(), 1442819992, -1442819991, i4, i2, new Object[]{this, cVar});
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0344  */
        @Override // o.ab.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(o.bg.c r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1924
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.al.a.e.c(o.bg.c):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20324m + 47;
            f20323l = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                String str = ((a) e()).f20309l;
                obj.hashCode();
                throw null;
            }
            if (((a) e()).f20309l != null && ((a) e()).f20310m != null) {
                return new o.cg.j(((a) e()).f20309l, ((a) e()).f20310m);
            }
            int i4 = f20324m + 91;
            f20323l = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            if (((a) e()).f20306g != null) {
                int i3 = f20323l + 111;
                f20324m = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    z(new int[]{-2144792256, 1513482263, 577991541, -1908165355}, 12 << ExpandableListView.getPackedPositionGroup(1L), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    z(new int[]{-2144792256, 1513482263, 577991541, -1908165355}, ExpandableListView.getPackedPositionGroup(0L) + 6, objArr2);
                    obj = objArr2[0];
                }
                aVar.a(((String) obj).intern(), (Object) ((a) e()).f20306g.b());
            }
            Object[] objArr3 = new Object[1];
            A((short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.getDeadChar(0, 0) + 2125417771, View.getDefaultSize(0, 0) - 1086977131, (-9) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (9 - Drawable.resolveOpacity(0, 0)), objArr3);
            aVar.c(((String) objArr3[0]).intern(), 0);
            Object[] objArr4 = new Object[1];
            A((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2125417780 - KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1086977131, KeyEvent.keyCodeFromString("") - 8, (byte) (View.getDefaultSize(0, 0) + 127), objArr4);
            aVar.c(((String) objArr4[0]).intern(), 1);
            int i4 = f20324m + 75;
            f20323l = i4 % 128;
            int i5 = i4 % 2;
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20323l + 83;
            f20324m = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                z(new int[]{-1303356428, 1900625047, 891759107, -655180298, -1520911687, 1886331992}, 'u' >>> AndroidCharacter.getMirror(AbstractJsonLexerKt.COLON), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                z(new int[]{-1303356428, 1900625047, 891759107, -655180298, -1520911687, 1886331992}, '9' - AndroidCharacter.getMirror('0'), objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20324m + 55;
            f20323l = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = f20314b * (-56370811);
            f20314b = i2;
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i3 = f20316d * (-2018081206);
            f20316d = i3;
            return (byte[][]) c(priority, i3, 788245439, -788245439, iMyUid, i2, new Object[]{this});
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = AnonymousClass5.f20313e[f().c().ordinal()];
            Object obj = null;
            if (i3 == 1) {
                j().c(h(), ((a) e()).f20306g.b());
                int i4 = f20324m + 39;
                f20323l = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (i3 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((a) e()).f20306g.b());
            int i5 = f20324m + 25;
            f20323l = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, byte r10, int r11) {
        /*
            byte[] r8 = o.al.a.$$d
            int r0 = r10 * 3
            int r7 = 3 - r0
            int r2 = r11 * 4
            int r1 = 1 - r2
            int r0 = r9 + 99
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2d
            r2 = r7
            r1 = r4
            r3 = r5
        L16:
            int r0 = -r1
            int r7 = r7 + r0
            r0 = r7
            r7 = r2
        L1a:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r2]
            int r3 = r3 + 1
            r7 = r0
            goto L16
        L2d:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.al.a.$$j(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20303r = 0;
        f20302q = 1;
        f20304s = 0;
        f20301p = 1;
        l();
        Gravity.getAbsoluteGravity(0, 0);
        Color.green(0);
        ViewConfiguration.getPressedStateDuration();
        Color.argb(0, 0, 0, 0);
        View.getDefaultSize(0, 0);
        View.MeasureSpec.getMode(0);
        int i2 = f20303r + 13;
        f20302q = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    public a(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21123u);
    }

    static void init$0() {
        $$d = new byte[]{90, -4, -67, Ascii.NAK};
        $$e = 122;
    }

    static void l() {
        f20299n = new char[]{50491, 61918, 44189, 23414, 5711, 52528, 63978, 46266, 25492, 7786, 54579, 32779, 27127, 23858, 'Q', 63386, 47779, 25052, 21768, 6217, 53105};
        f20300o = -1597762171746934752L;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.al.a.t(char, int, int, java.lang.Object[]):void");
    }

    public final void a(byte[] bArr, byte[] bArr2, o.i.d dVar, String str, o.ep.d dVar2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20301p + 91;
        f20304s = i3 % 128;
        if (i3 % 2 != 0) {
            this.f20307j = bArr;
            this.f20305f = bArr2;
            this.f20310m = dVar;
            this.f20309l = str;
            this.f20306g = dVar2;
            a();
            throw null;
        }
        this.f20307j = bArr;
        this.f20305f = bArr2;
        this.f20310m = dVar;
        this.f20309l = str;
        this.f20306g = dVar2;
        a();
        int i4 = f20304s + 61;
        f20301p = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f20301p + 77;
        f20304s = i3 % 128;
        if (i3 % 2 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20304s + 19;
        f20301p = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        t((char) (20890 - MotionEvent.axisFromString("")), TextUtils.indexOf("", ""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20301p + 45;
        f20304s = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
