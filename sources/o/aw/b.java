package o.aw;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.a.f;
import o.ab.a;
import o.ab.j;
import o.bg.c;
import o.fj.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a<InterfaceC0336b> {
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20715l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static byte[] f20716m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20717n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20718o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f20719p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20720q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20721r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static short[] f20722s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20723t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f20724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o.eq.b f20725g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f20727k;

    /* JADX INFO: renamed from: o.aw.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20728a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20729c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20730d = 1;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20728a = iArr;
            try {
                iArr[o.bg.a.as.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20728a[o.bg.a.av.ordinal()] = 2;
                int i2 = f20730d;
                int i3 = ((105 | i2) << 1) - (i2 ^ 105);
                f20729c = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20728a[o.bg.a.aA.ordinal()] = 3;
                int i5 = f20729c + 111;
                f20730d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20728a[o.bg.a.aB.ordinal()] = 4;
                int i7 = f20730d;
                int i8 = (i7 & 121) + ((-1) - (((-1) - i7) & ((-1) - 121)));
                f20729c = i8 % 128;
                int i9 = i8 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: o.aw.b$b, reason: collision with other inner class name */
    public interface InterfaceC0336b {
        void c();

        void c(c cVar);
    }

    static final class e extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20731b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20732c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20733d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f20734f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static boolean f20735g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f20736h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20737i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20738j = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f20739n = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r7, int r8, byte r9) {
            /*
                int r3 = r8 * 2
                int r2 = 1 - r3
                byte[] r8 = o.aw.b.e.$$a
                int r0 = r7 * 6
                int r0 = 73 - r0
                int r1 = r9 * 3
                int r7 = r1 + 4
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r8 != 0) goto L2f
                r1 = r7
                r3 = r5
            L17:
                int r0 = -r0
                int r0 = r0 + r7
                int r7 = r1 + 1
                r2 = r3
            L1c:
                byte r1 = (byte) r0
                r6[r2] = r1
                int r3 = r2 + 1
                if (r2 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L29:
                r2 = r8[r7]
                r1 = r7
                r7 = r0
                r0 = r2
                goto L17
            L2f:
                r2 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aw.b.e.$$d(short, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20731b = -112863869;
            f20733d = 1187189106;
            f20732c = -246156695;
            f20738j = 0;
            f20739n = 1;
            f20736h = new char[]{2307, 2305, 2558, 2315, 2556, 2319, 2351, 2551, 2339, 2546, 2550, 2549, 2548, 2366, 2363, 2353, 2365, 2364, 2362, 2352, 2355, 2367, 2347, 2318, 2544, 2545, 2317, 2322, 2555, 2337};
            f20737i = 2040400226;
            f20734f = true;
            f20735g = true;
        }

        e(b bVar) {
            super(bVar, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            if (r0 != 4) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            r2 = r3.j();
            r1 = r3.h();
            r15 = new java.lang.Object[]{((o.aw.b) r3.e()).f20725g};
            r13 = android.os.Process.myUid();
            r11 = java.lang.Thread.currentThread().getPriority();
            r9 = java.lang.Thread.activeCount();
            r10 = o.eq.b.f24699e * (-280241304);
            o.eq.b.f24699e = r10;
            r2.d(r1, (java.lang.String) o.eq.b.e(r9, r10, r11, -688819955, r13, 688819957, r15));
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        
            if (r1 != 4) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        
            super.s();
            r1 = o.aw.b.e.f20738j + 105;
            o.aw.b.e.f20739n = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object a(java.lang.Object[] r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aw.b.e.a(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
            e eVar = (e) objArr[0];
            int i2 = 2 % 2;
            eVar.j().e().j().b(((b) eVar.e()).f20725g);
            eVar.j().e(eVar.h());
            o.fj.b bVar = new o.fj.b();
            Object[] objArr2 = {bVar, new d(((b) eVar.e()).f20726j, ((b) eVar.e()).f20727k, o.fj.a.f25884b)};
            int id = (int) Thread.currentThread().getId();
            int i3 = o.fj.b.f25904e * 1927270547;
            o.fj.b.f25904e = i3;
            int i4 = o.fj.b.f25902c * 1291554296;
            o.fj.b.f25902c = i4;
            int i5 = o.fj.b.f25901b * (-673355590);
            o.fj.b.f25901b = i5;
            o.fj.b.e(-1392211334, i3, id, 1392211334, objArr2, i5, i4);
            eVar.i().d(bVar);
            int i6 = f20738j + 85;
            f20739n = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i2;
            int i9 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
            int i10 = ~((-1) - (((-1) - i6) & ((-1) - i2)));
            int i11 = ~i6;
            int i12 = (i8 + i11) - (i8 & i11);
            int i13 = ~((i12 + i7) - (i12 & i7));
            int i14 = (i10 + i13) - (i10 & i13);
            int i15 = ~i7;
            int i16 = (i15 + i12) - (i15 & i12);
            int i17 = i6 + i2 + i3 + (1134938392 * i5) + ((-1730424158) * i4);
            int i18 = i17 * i17;
            int i19 = (1345404558 * i6) + 1061748736 + ((-382549644) * i2) + (1727954202 * i9) + ((-1283506547) * i14) + (1283506547 * i16) + ((-1666056192) * i3) + (1924136960 * i5) + (748945408 * i4) + (912850944 * i18);
            int i20 = (i6 * 1914917686) + 639827133 + (i2 * 1914918628) + (i9 * (-942)) + (i14 * (-471)) + (i16 * 471) + (i3 * 1914918157) + (i5 * (-1451741640)) + (i4 * (-1338016710)) + (i18 * (-1605042176));
            return i19 + ((i20 * i20) * (-230752256)) != 1 ? a(objArr) : b(objArr);
        }

        static void init$0() {
            $$a = new byte[]{97, 98, -19, -80};
            $$b = 75;
        }

        private static void v(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i4 = $10 + 125;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                    bytes = str4.getBytes("ISO-8859-1");
                } else {
                    bytes = str4.getBytes("ISO-8859-1");
                }
            }
            byte[] bArr = (byte[]) bytes;
            Object obj = str3;
            if (str3 != null) {
                char[] charArray = str3.toCharArray();
                int i6 = $10 + 87;
                $11 = i6 % 128;
                obj = charArray;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 3;
                    obj = charArray;
                }
            }
            char[] cArr = (char[]) obj;
            f fVar = new f();
            char[] cArr2 = f20736h;
            long j2 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j2) + 593;
                            char scrollDefaultDelay = (char) (13181 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int iAlpha = 11 - Color.alpha(0);
                            byte b2 = (byte) ($$b & 5);
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a(packedPositionGroup, scrollDefaultDelay, iAlpha, -1225586509, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i8++;
                        int i9 = $11 + 109;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
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
            Object[] objArr3 = {Integer.valueOf(f20737i)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, (char) View.resolveSize(0, 0), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            char c2 = '0';
            int i11 = 1540807955;
            float f2 = 0.0f;
            if (f20735g) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a((TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + 458, (char) ((-1) - TextUtils.lastIndexOf("", c2)), 11 - View.MeasureSpec.getSize(0), -1923924106, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    c2 = '0';
                    f2 = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f20734f) {
                fVar.f19923e = iArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                    int i12 = $11 + 5;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = cArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i14 = $11 + 115;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[fVar.f19923e / fVar.f19922a] >> i2] + iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(i11);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a(458 - Color.blue(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, -1923924106, false, $$d(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(i11);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA5 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 457, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10 - TextUtils.lastIndexOf("", '0', 0), -1923924106, false, $$d(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                    i11 = 1540807955;
                }
            }
            objArr[0] = new String(cArr6);
        }

        @Override // o.ab.j
        public final o.cg.f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            Object obj = null;
            v(127 - View.resolveSizeAndState(0, 0, 0), null, null, "\u0091\u008f\u0094\u0091\u0095\u0093\u0096\u008f\u0093\u0096\u0095\u0094\u0093\u0092\u0091\u0091\u0090\u008f\u008e", objArr);
            o.cg.b bVar = new o.cg.b(context, 24, ((String) objArr[0]).intern());
            int i3 = f20739n + 67;
            f20738j = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20738j + 13;
            f20739n = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 80 / 0;
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20738j + 3;
            f20739n = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 == 5002) {
                o.bg.a aVar = o.bg.a.aB;
                int i5 = f20738j + 31;
                f20739n = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 23 / 0;
                }
                return aVar;
            }
            switch (i2) {
                case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                    return o.bg.a.au;
                case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                    return o.bg.a.av;
                case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                    o.bg.a aVar2 = o.bg.a.as;
                    int i7 = f20738j + 59;
                    f20739n = i7 % 128;
                    int i8 = i7 % 2;
                    return aVar2;
                default:
                    return super.b(i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20739n + 115;
            f20738j = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().c(cVar);
            int i5 = f20738j + 109;
            f20739n = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20739n + 101;
            f20738j = i3 % 128;
            if (i3 % 2 == 0) {
                ((b) e()).g().c();
            } else {
                ((b) e()).g().c();
                throw null;
            }
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20739n + 39;
            int i4 = i3 % 128;
            f20738j = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 29;
            f20739n = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0098\u0097\u008d\u008c\u0084\u0083\u0081\u0082\u0084\u008b\u008a\u008a\u0089\u0085\u0088\u0086", objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((b) e()).f20725g.k());
            Object[] objArr2 = new Object[1];
            v(View.MeasureSpec.getMode(0) + 127, null, null, "\u009d\u0082\u0084\u008b\u008c\u009c\u009b\u008d\u0084\u009a\u009a\u0086\u0082\u008c\u0099\u008a", objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((b) e()).f20725g.q());
            Object[] objArr3 = new Object[1];
            v((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u0086\u0098\u008c\u009e\u008d\u008c\u0084\u0083\u0081\u0085\u0084\u0083\u0082\u0081", objArr3);
            aVar.a(((String) objArr3[0]).intern(), (Object) ((b) e()).f20724f);
            int i3 = f20738j + 37;
            f20739n = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20739n + 101;
            f20738j = i3 % 128;
            int i4 = i3 % 2;
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            if (i4 != 0) {
                Object[] objArr = new Object[1];
                v(37 >> (packedPositionForGroup > 1L ? 1 : (packedPositionForGroup == 1L ? 0 : -1)), null, null, "\u008d\u008c\u0084\u0083\u0081\u0082\u0084\u008b\u008a\u008a\u0089\u0085\u0088\u0087\u0086\u0083\u0081\u0085\u0084\u0083\u0082\u0081", objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(127 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), null, null, "\u008d\u008c\u0084\u0083\u0081\u0082\u0084\u008b\u008a\u008a\u0089\u0085\u0088\u0087\u0086\u0083\u0081\u0085\u0084\u0083\u0082\u0081", objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20738j;
            int i4 = i3 + 69;
            f20739n = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 65;
            f20739n = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final void q() {
            int i2 = f20733d * (-558987277);
            f20733d = i2;
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int id = (int) Thread.currentThread().getId();
            int i4 = 1653466413 * f20731b;
            f20731b = i4;
            e(645603751, new Object[]{this}, i3, i4, id, -645603750, i2);
        }

        @Override // o.ab.j
        public final void s() {
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iMyTid = Process.myTid();
            int i2 = f20732c * (-583736664);
            f20732c = i2;
            e(145578844, new Object[]{this}, iMyTid, (int) Process.getElapsedCpuTime(), i2, -145578844, iUptimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$o(byte r6, int r7, short r8) {
        /*
            int r0 = r7 + 4
            int r1 = r8 * 4
            int r8 = r1 + 1
            byte[] r7 = o.aw.b.$$m
            int r6 = 104 - r6
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L27
            r1 = r0
            r3 = r4
        L11:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L15:
            int r1 = r0 + 1
            byte r0 = (byte) r6
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r0 = r7[r1]
            goto L11
        L27:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aw.b.$$o(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20720q = 0;
        f20719p = 1;
        f20721r = 0;
        f20723t = 1;
        l();
        TextUtils.indexOf("", "");
        TextUtils.indexOf("", "");
        Color.rgb(0, 0, 0);
        Process.myPid();
        AndroidCharacter.getMirror('0');
        Drawable.resolveOpacity(0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        Process.myPid();
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        int i2 = f20720q + 51;
        f20719p = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, InterfaceC0336b interfaceC0336b, o.en.b bVar) {
        super(context, interfaceC0336b, bVar, o.bg.e.f21113k);
    }

    static /* synthetic */ void d(b bVar, o.eq.b bVar2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20723t + 5;
        f20721r = i3 % 128;
        int i4 = i3 % 2;
        bVar.e(bVar2);
        int i5 = f20723t + 41;
        f20721r = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$m = new byte[]{Ascii.ETB, 117, 49, -107};
        $$n = 34;
    }

    private e k() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f20721r + 11;
        f20723t = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void l() {
        f20717n = -315743226;
        f20715l = 1150422454;
        f20718o = -1930462050;
        f20716m = new byte[]{111, MessagePack.Code.FIXARRAY_PREFIX, MessagePack.Code.FLOAT64, -110, MessagePack.Code.BIN32, -104, -22, 115, -103, MessagePack.Code.NIL, -109, -75, -104, -100, -101, -102, MessagePack.Code.BIN32, -23, -115, MessagePack.Code.UINT64, -18, -90, -105, -75, -83, MessagePack.Code.FLOAT64, -109, -73, -28, 100, 106, -109, -4, -84, -123, -31, -89, -92, 83, -71, -85, -2, -75, -110, -93, -103, -70, -74, -69, -72, -84, -123, -31, -89, -124, MessagePack.Code.UINT8, -65, -103, MessagePack.Code.NEVER_USED, -85, -93, -97, -114, MessagePack.Code.MAP16, -95, 94, MessagePack.Code.BIN32, 58, MessagePack.Code.INT64, Ascii.SUB, 60, MessagePack.Code.BIN16, 58, MessagePack.Code.INT8, 40, -78, 58, MessagePack.Code.FIXEXT4, -31, 86, MessagePack.Code.TRUE, 106, MessagePack.Code.STR8, 127, MessagePack.Code.FALSE, MessagePack.Code.BIN32, MessagePack.Code.NEVER_USED, MessagePack.Code.NIL, 108, 115, -105, 85, 116, MessagePack.Code.UINT8, MessagePack.Code.ARRAY32, 127, -73, 81, MessagePack.Code.STR8, 125, 110};
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aw.b.w(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public final void a(String str, String str2, o.eq.b bVar, String str3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20723t + 73;
        f20721r = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            w((short) (View.resolveSize(0, 0) + 80), 1447286389 + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 931303214 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') - 59, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 101), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w((short) (View.combineMeasuredStates(0, 0) - 45), 1447286418 + (KeyEvent.getMaxKeyCode() >> 16), 931303249 - Drawable.resolveOpacity(0, 0), (-60) - TextUtils.indexOf("", ""), (byte) ((-12) - (Process.myPid() >> 22)), objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), bVar.k()));
            int i5 = f20721r + 113;
            f20723t = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f20725g = bVar;
        this.f20726j = str;
        this.f20727k = str2;
        if (str3 == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            w((short) (TextUtils.getOffsetAfter("", 0) + 2), ExpandableListView.getPackedPositionGroup(0L) + 1447286454, 931303214 - KeyEvent.keyCodeFromString(""), (-60) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 76), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern(), "");
        }
        if (str3.length() <= 48) {
            this.f20724f = str3;
            a();
        } else {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr4 = new Object[1];
            w((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 3), 1447286455 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 931303215 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-60) - Drawable.resolveOpacity(0, 0), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 76), objArr4);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr4[0]).intern(), "");
        }
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20723t + 77;
        f20721r = i3 % 128;
        int i4 = i3 % 2;
        e eVarK = k();
        int i5 = f20723t + 65;
        f20721r = i5 % 128;
        if (i5 % 2 == 0) {
            return eVarK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20721r + 5;
        f20723t = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        w((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 80), 1447286389 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 931303215, Color.red(0) - 60, (byte) ((-101) - KeyEvent.keyCodeFromString("")), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20721r + 105;
        f20723t = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
