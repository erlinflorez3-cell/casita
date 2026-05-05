package o.an;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.n;
import o.ab.j;
import o.cg.f;
import o.i.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static char f20351k = 0;

    /* JADX INFO: renamed from: l */
    private static char f20352l = 0;

    /* JADX INFO: renamed from: o */
    private static char f20353o = 0;

    /* JADX INFO: renamed from: p */
    private static int f20354p = 0;

    /* JADX INFO: renamed from: q */
    private static int f20355q = 0;

    /* JADX INFO: renamed from: r */
    private static int f20356r = 0;

    /* JADX INFO: renamed from: s */
    private static int f20357s = 0;

    /* JADX INFO: renamed from: t */
    private static char f20358t = 0;

    /* JADX INFO: renamed from: f */
    String f20359f;

    /* JADX INFO: renamed from: g */
    d f20360g;

    /* JADX INFO: renamed from: j */
    String f20361j;

    /* JADX INFO: renamed from: m */
    c f20362m;

    /* JADX INFO: renamed from: n */
    String f20363n;

    /* JADX INFO: renamed from: o.an.a$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f20364c;

        /* JADX INFO: renamed from: d */
        private static int f20365d = 1;

        /* JADX INFO: renamed from: e */
        private static int f20366e = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20364c = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20366e;
                int i3 = (((i2 + 67) - (67 & i2)) << 1) - (i2 ^ 67);
                f20365d = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20364c[o.bg.a.aB.ordinal()] = 2;
                int i6 = f20365d;
                int i7 = ((105 | i6) << 1) - (i6 ^ 105);
                f20366e = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void b(o.bg.c cVar);

        void c(String str);
    }

    public static final class c extends Enum<c> implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final c f20367a;

        /* JADX INFO: renamed from: b */
        private static int f20368b = 0;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ c[] f20369d;

        /* JADX INFO: renamed from: e */
        public static final c f20370e;

        /* JADX INFO: renamed from: f */
        private static int f20371f = 0;

        /* JADX INFO: renamed from: g */
        private static int f20372g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20373h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20374i = 0;

        /* JADX INFO: renamed from: c */
        private final String f20375c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, int r10, int r11) {
            /*
                byte[] r8 = o.an.a.c.$$a
                int r0 = r10 * 2
                int r7 = r0 + 113
                int r0 = r11 * 3
                int r6 = 3 - r0
                int r0 = r9 * 2
                int r5 = r0 + 1
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r8 != 0) goto L2a
                r0 = r7
                r2 = r3
                r7 = r5
            L16:
                int r7 = r7 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r7
                int r6 = r6 + 1
                r4[r1] = r0
                if (r2 != r5) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r0 = r8[r6]
                goto L16
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.an.a.c.$$c(byte, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20374i = 0;
            f20372g = 1;
            f20373h = 0;
            f20371f = 1;
            e();
            Object[] objArr = new Object[1];
            j((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, "\u0002￢\u0003\u0012\uffff\u0007\n\u0011￡\uffff\u0010", false, 284 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - TextUtils.indexOf("", "", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            j('<' - AndroidCharacter.getMirror('0'), "\b\ufff7\ufff9\t\u0002\uffff\ufff7\n\ufffb\ufffa\u0015\ufffa", true, 259 - TextUtils.indexOf("", ""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr2);
            f20367a = new c(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            j(7 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0004\u000f￣\u000e\t\ufff0\u0005", true, 280 - TextUtils.indexOf((CharSequence) "", '0'), 6 - TextUtils.getCapsMode("", 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            j(8 - (Process.myPid() >> 22), "\u0004\ufff9\ufff8\u0003\ufff7\u0013\u0002�", true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 260, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr4);
            f20370e = new c(strIntern2, 1, ((String) objArr4[0]).intern());
            f20369d = d();
            int i2 = f20374i + 81;
            f20372g = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private c(String str, int i2, String str2) {
            super(str, i2);
            this.f20375c = str2;
        }

        private static /* synthetic */ c[] d() {
            int i2 = 2 % 2;
            int i3 = f20373h + 87;
            int i4 = i3 % 128;
            f20371f = i4;
            c[] cVarArr = i3 % 2 == 0 ? new c[]{f20367a, f20370e} : new c[]{f20367a, f20370e};
            int i5 = i4 + 75;
            f20373h = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }

        static void e() {
            f20368b = -1270219358;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SYN, -5, 39, 97};
            $$b = 95;
        }

        private static void j(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i7 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(f20368b)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) TextUtils.indexOf("", ""), View.resolveSizeAndState(0, 0, 0) + 11, -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 522, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                int i8 = $11 + 37;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
                int i10 = $10 + 125;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i12 = $11 + 91;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[nVar.f19944a] = cArr2[(nVar.f19944a * i2) >>> 1];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a(523 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.resolveSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 12, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } else {
                        cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                        Object[] objArr5 = {nVar, nVar};
                        Object objA4 = o.d.d.a(-202660535);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(Color.green(0) + 522, (char) (ImageFormat.getBitsPerPixel(0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                }
                int i13 = $10 + 117;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f20373h + 17;
            f20371f = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f20371f + 15;
            f20373h = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f20373h + 89;
            f20371f = i3 % 128;
            if (i3 % 2 == 0) {
                cVarArr = (c[]) f20369d.clone();
                int i4 = 41 / 0;
            } else {
                cVarArr = (c[]) f20369d.clone();
            }
            int i5 = f20373h + 123;
            f20371f = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f20371f;
            int i4 = i3 + 63;
            f20373h = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f20375c;
            int i6 = i3 + 23;
            f20373h = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    static final class e extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20376b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20377c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20378d = 0;

        /* JADX INFO: renamed from: g */
        public static int f20379g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20380h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20381i = 0;

        /* JADX INFO: renamed from: j */
        private static int f20382j = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(byte r7, byte r8, byte r9) {
            /*
                int r0 = r8 * 3
                int r8 = r0 + 4
                int r0 = r7 * 2
                int r7 = r0 + 113
                int r1 = r9 * 4
                int r0 = 1 - r1
                byte[] r6 = o.an.a.e.$$a
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r6 != 0) goto L2e
                r2 = r8
                r7 = r3
                r1 = r4
            L18:
                int r0 = -r8
                int r7 = r7 + r0
                int r8 = r2 + 1
            L1c:
                byte r0 = (byte) r7
                r5[r1] = r0
                if (r1 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                int r1 = r1 + 1
                r0 = r6[r8]
                r2 = r8
                r8 = r0
                goto L18
            L2e:
                r1 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.an.a.e.$$d(byte, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20379g = -555419101;
            f20378d = -1172914663;
            f20376b = 345245679;
            f20377c = 1638076796;
            f20380h = 0;
            f20382j = 1;
            f20381i = -1270219329;
        }

        e(a aVar) {
            super(aVar, true);
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f20380h + 29;
            f20382j = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~i6;
            int i10 = (i8 + i9) - (i8 & i9);
            int i11 = ~i3;
            int i12 = ~((i10 + i11) - (i10 & i11));
            int i13 = i5 | i6;
            int i14 = (-1) - (((-1) - i12) & ((-1) - (~((i13 + i3) - (i13 & i3)))));
            int i15 = ~((i9 + i5) - (i9 & i5));
            int i16 = ~(i9 | i3);
            int i17 = (i16 + i15) - (i16 & i15);
            int i18 = ~(i3 | i6);
            int i19 = (i18 + i5) - (i18 & i5);
            int i20 = i5 + i6 + i2 + (1661237432 * i7) + (961048624 * i4);
            int i21 = i20 * i20;
            int i22 = ((119520104 * i5) - 281083904) + ((-1329838950) * i6) + (i14 * 724679527) + (724679527 * i17) + ((-724679527) * i19) + ((-605159424) * i2) + ((-1559232512) * i7) + (1553989632 * i4) + (2020540416 * i21);
            int i23 = (i5 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i14 * (-595)) + (i17 * (-595)) + (i19 * 595) + (i2 * (-2040814133)) + (i7 * (-1614655000)) + (i4 * 500164112) + (i21 * 184877056);
            return i22 + ((i23 * i23) * 1800994816) != 1 ? c(objArr) : a(objArr);
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            e eVar = (e) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i2 = 2 % 2;
            int i3 = f20380h + 125;
            f20382j = i3 % 128;
            int i4 = i3 % 2;
            if (iIntValue == 5001) {
                return o.bg.a.aA;
            }
            if (iIntValue != 5002) {
                return super.b(iIntValue);
            }
            o.bg.a aVar = o.bg.a.aB;
            int i5 = f20382j + 21;
            f20380h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return aVar;
        }

        static void init$0() {
            $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
            $$b = 48;
        }

        private static void v(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $11 + 11;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i8 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f20381i)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(270 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2071844881, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 522, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 627984172, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
                int i9 = $10 + 63;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i11 = $11 + 19;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(522 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSize(0, 0) + 12, 627984172, false, $$d(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v(19 - KeyEvent.getDeadChar(0, 0), "\u0003\uffff\u0002\ufffe\ufffe\ufffe\ufffe\u0005\uffff\u0000\uffff\u0002\u0003\u0002\uffff\u0000\uffff\ufffe\u0001", true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + Mp4VideoDirectory.TAG_FRAME_RATE, Process.getGidForName("") + 4, objArr);
            o.cg.b bVar = new o.cg.b(context, 31, ((String) objArr[0]).intern());
            int i3 = f20382j + 121;
            f20380h = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20382j + 45;
            f20380h = i3 % 128;
            int i4 = i3 % 2;
            a aVar2 = (a) e();
            Object[] objArr = new Object[1];
            v(TextUtils.getOffsetBefore("", 0) + 11, "\u0002�\ufffa\r\ufffa\uffdd\u0012\ufffa\u0005\t\f", true, 268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            aVar2.f20363n = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            int i6 = f20380h + 9;
            f20382j = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            Object[] objArr = {this, Integer.valueOf(i2)};
            int iMyPid = Process.myPid();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i3 = 663756586 * f20377c;
            f20377c = i3;
            return (o.bg.a) a(objArr, iUptimeMillis, iMyPid, i3, -1227699850, 1227699850, priority);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20382j + 77;
            f20380h = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().b(cVar);
            int i5 = f20380h + 61;
            f20382j = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20382j + 99;
            f20380h = i3 % 128;
            if (i3 % 2 == 0) {
                ((a) e()).g().c(((a) e()).f20363n);
            } else {
                ((a) e()).g().c(((a) e()).f20363n);
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((a) e()).f20359f, ((a) e()).f20360g);
            int i3 = f20380h + 19;
            f20382j = i3 % 128;
            if (i3 % 2 != 0) {
                return jVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v(5 - TextUtils.lastIndexOf("", '0', 0), "\u0002\u0000\u0011\u0003￨\u0003", false, 262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((a) e()).f20361j);
            Object[] objArr2 = new Object[1];
            v(Color.green(0) + 4, "\u0000\ufff5\u0004\t", false, 276 - (ViewConfiguration.getTouchSlop() >> 8), 2 - (Process.myPid() >> 22), objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((a) e()).f20362m.a());
            int i3 = f20380h + 7;
            f20382j = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20382j + 43;
            f20380h = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v(73 << Color.green(1), "\ufffa\u000b�￬\ufffe￼\u000e\u000b\ufffe\uffdd\u0002\f\t\u0005\ufffa\u0012￼", true, 17348 / KeyEvent.normalizeMetaState(1), 101 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(17 - Color.green(0), "\ufffa\u000b�￬\ufffe￼\u000e\u000b\ufffe\uffdd\u0002\f\t\u0005\ufffa\u0012￼", false, KeyEvent.normalizeMetaState(0) + 267, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = (-1416940881) * f20376b;
            f20376b = i2;
            int i3 = f20378d * 1581967658;
            f20378d = i3;
            int i4 = f20379g * (-246110105);
            f20379g = i4;
            return (byte[][]) a(new Object[]{this}, i3, i2, (int) Thread.currentThread().getId(), -2102691391, 2102691392, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20382j + 83;
            f20380h = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass2.f20364c[f().c().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    super.s();
                    return;
                } else {
                    j().d(h(), ((a) e()).f20361j);
                    return;
                }
            }
            j().c(h(), ((a) e()).f20361j);
            int i6 = f20380h + 49;
            f20382j = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, short r9, int r10) {
        /*
            int r0 = r10 * 3
            int r7 = 72 - r0
            byte[] r6 = o.an.a.$$d
            int r0 = r9 * 4
            int r5 = 3 - r0
            int r1 = r8 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2c
            r1 = r7
            r0 = r3
            r7 = r2
        L18:
            int r7 = r7 + r1
            r1 = r0
        L1a:
            int r5 = r5 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L29:
            r1 = r6[r5]
            goto L18
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.an.a.$$j(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20356r = 0;
        f20357s = 1;
        f20355q = 0;
        f20354p = 1;
        k();
        View.getDefaultSize(0, 0);
        Process.myPid();
        int i2 = f20356r + 77;
        f20357s = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public a(Context context, b bVar, o.en.b bVar2) {
        super(context, bVar, bVar2, o.bg.e.f21124v);
        this.f20363n = null;
    }

    static void init$0() {
        $$d = new byte[]{106, -29, 108, MessagePack.Code.MAP32};
        $$e = 95;
    }

    static void k() {
        f20351k = (char) 12487;
        f20352l = (char) 55806;
        f20353o = (char) 9545;
        f20358t = (char) 57143;
    }

    private e l() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f20355q + 25;
        f20354p = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(java.lang.String r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.an.a.u(java.lang.String, int, java.lang.Object[]):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20354p + 105;
        f20355q = i3 % 128;
        if (i3 % 2 != 0) {
            l();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e eVarL = l();
        int i4 = f20355q + 107;
        f20354p = i4 % 128;
        int i5 = i4 % 2;
        return eVarL;
    }

    public final void c(d dVar, String str, String str2, c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20355q + 59;
        f20354p = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            u("옔コ㤫\uecdf栊嵥ᘈ䚶翬晧䢾뎙塝퉝ਫ娫\uedae캎㈱惺瑌껴労Հ", TextUtils.lastIndexOf("", '0') + 25, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            u("ᄼ\ue226옔コ㤫\uecdf栊嵥ᘈ䚶翬晧䢾뎙塝퉝ਫ娫꾦麍넴\ude73뚞\udf5a㤫\uecdf\uedcaᦀ뚟ൻꝠꢭ塝퉝ਫ娫꾦麍艰歅", TextUtils.indexOf("", "", 0, 0) + 40, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str2).toString());
            int i5 = f20355q + 115;
            f20354p = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f20359f = str;
        this.f20360g = dVar;
        this.f20361j = str2;
        this.f20362m = cVar;
        a();
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20354p + 71;
        f20355q = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u("옔コ㤫\uecdf栊嵥ᘈ䚶翬晧䢾뎙塝퉝ਫ娫\uedae캎㈱惺瑌껴労Հ", 24 - Color.argb(0, 0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20354p + 57;
        f20355q = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
