package o.ai;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.q;
import o.bg.a;
import o.bg.c;
import o.cg.f;
import o.cg.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.ab.e<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l */
    private static int f20244l = 0;

    /* JADX INFO: renamed from: m */
    private static long f20245m = 0;

    /* JADX INFO: renamed from: p */
    private static int f20246p = 0;

    /* JADX INFO: renamed from: s */
    private static int f20247s = 0;

    /* JADX INFO: renamed from: t */
    private static int f20248t = 0;

    /* JADX INFO: renamed from: f */
    String f20249f;

    /* JADX INFO: renamed from: g */
    o.i.d f20250g;

    /* JADX INFO: renamed from: j */
    byte[] f20251j;

    /* JADX INFO: renamed from: k */
    Boolean f20252k;

    /* JADX INFO: renamed from: n */
    private final j f20253n;

    /* JADX INFO: renamed from: o */
    o.ep.d f20254o;

    /* JADX INFO: renamed from: o.ai.b$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        private static int f20255a = 1;

        /* JADX INFO: renamed from: b */
        private static int f20256b = 0;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f20257c;

        static {
            int[] iArr = new int[a.values().length];
            f20257c = iArr;
            try {
                iArr[a.aA.ordinal()] = 1;
                int i2 = f20256b;
                int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
                f20255a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 5;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20257c[a.aB.ordinal()] = 2;
                int i6 = f20256b;
                int i7 = (((-1) - (((-1) - i6) & ((-1) - 15))) << 1) - (i6 ^ 15);
                f20255a = i7 % 128;
                int i8 = i7 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class d extends o.ab.j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20258b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20259c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20260d = 0;

        /* JADX INFO: renamed from: g */
        private static int f20261g = 0;

        /* JADX INFO: renamed from: h */
        private static char[] f20262h = null;

        /* JADX INFO: renamed from: j */
        private static int f20263j = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r8, short r9, int r10) {
            /*
                byte[] r7 = o.ai.b.d.$$a
                int r0 = r9 * 4
                int r6 = 1 - r0
                int r1 = r8 + 4
                int r0 = r10 * 4
                int r5 = 120 - r0
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r7 != 0) goto L28
                r2 = r3
                r0 = r1
            L13:
                int r1 = r1 + r5
                r5 = r1
                r1 = r0
            L16:
                int r0 = r1 + 1
                byte r1 = (byte) r5
                r4[r2] = r1
                int r2 = r2 + 1
                if (r2 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r1 = r7[r0]
                goto L13
            L28:
                r2 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ai.b.d.$$d(int, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20259c = -1521936933;
            f20258b = -1487103911;
            f20260d = 476173312;
            f20263j = 0;
            f20261g = 1;
            f20262h = new char[]{56500, 56558, 56554, 56550, 56535, 56530, 56553, 56555, 56546, 56546, 56555, 56558, 56559, 56555, 56554, 56556, 56532, 56534, 56552, 56546, 56389, 56385, 56381, 56384, 56386, 56385, 56385, 56383, 56384, 56387, 56389, 56387, 56386, 56387, 56387, 56384, 56385, 56385, 56564, 56424, 56431, 56433, 56412, 56412, 56503, 56536, 56537, 56553, 56548, 56554, 56556, 56502, 56557, 56565, 56557, 56552, 56559, 56564, 56548, 56547, 56566, 56567, 56565, 56559, 56567};
        }

        d(b bVar) {
            super(bVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            a aVar;
            int i8;
            int i9 = ~i4;
            int i10 = ~i5;
            int i11 = ~(i9 | i10);
            int i12 = (i6 + i11) - (i6 & i11);
            int i13 = (-1) - (((-1) - ((~((-1) - (((-1) - i9) & ((-1) - i6)))) | i11)) & ((-1) - (~((-1) - (((-1) - i10) & ((-1) - i6))))));
            int i14 = ~i6;
            int i15 = (i14 + i4) - (i14 & i4);
            int i16 = ~((i15 + i5) - (i15 & i5));
            int i17 = i4 + i5 + i3 + ((-2027816600) * i2) + ((-1234684791) * i7);
            int i18 = i17 * i17;
            int i19 = (i4 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i12 * 228444679) + (228444679 * i13) + ((-228444679) * i16) + (96206848 * i3) + (811597824 * i2) + (1100742656 * i7) + (1751056384 * i18);
            int i20 = ((i4 * 572746074) - 905264446) + (i5 * 572746074) + (i12 * (-489)) + (i13 * (-489)) + (i16 * 489) + (i3 * 572745585) + (i2 * 982511336) + (i7 * (-774025351)) + (i18 * 1257177088);
            if (i19 + (i20 * i20 * 1874919424) != 1) {
                d dVar = (d) objArr[0];
                int i21 = 2 % 2;
                if (((b) dVar.e()).f20251j == null) {
                    return null;
                }
                int i22 = f20261g + 15;
                f20263j = i22 % 128;
                int i23 = i22 % 2;
                byte[][] bArr = {((b) dVar.e()).f20251j};
                int i24 = f20261g + 15;
                f20263j = i24 % 128;
                int i25 = i24 % 2;
                return bArr;
            }
            d dVar2 = (d) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i26 = 2 % 2;
            if (iIntValue == 5001) {
                aVar = a.aA;
                i8 = f20263j + 111;
            } else {
                if (iIntValue != 5002) {
                    return super.b(iIntValue);
                }
                aVar = a.aB;
                i8 = f20263j + 81;
            }
            f20261g = i8 % 128;
            int i27 = i8 % 2;
            return aVar;
        }

        static void init$0() {
            $$a = new byte[]{113, 10, 2, -109};
            $$b = 202;
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x00e4 A[Catch: all -> 0x01f8, TryCatch #0 {all -> 0x01f8, blocks: (B:92:0x0041, B:94:0x0052, B:95:0x0087, B:109:0x00cc, B:111:0x00e4, B:112:0x0112, B:125:0x01a0, B:127:0x01b1, B:128:0x01e6, B:117:0x012f, B:119:0x0148, B:120:0x0185), top: B:154:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0148 A[Catch: all -> 0x01f8, TryCatch #0 {all -> 0x01f8, blocks: (B:92:0x0041, B:94:0x0052, B:95:0x0087, B:109:0x00cc, B:111:0x00e4, B:112:0x0112, B:125:0x01a0, B:127:0x01b1, B:128:0x01e6, B:117:0x012f, B:119:0x0148, B:120:0x0185), top: B:154:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(java.lang.String r22, int[] r23, boolean r24, java.lang.Object[] r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ai.b.d.v(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{19, 19, 141, 0}, true, objArr);
            o.cg.b bVar = new o.cg.b(context, 42, ((String) objArr[0]).intern());
            int i3 = f20263j + 23;
            f20261g = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20261g + 19;
            f20263j = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) e();
            Object[] objArr = new Object[1];
            v("\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{51, 14, 11, 11}, true, objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern(), Boolean.FALSE};
            int iNextInt = new Random().nextInt();
            int i5 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i5;
            int iMyUid = Process.myUid();
            int i6 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i6;
            bVar.f20252k = (Boolean) o.ef.a.a(821341192, objArr2, iMyUid, i6, -821341184, iNextInt, i5);
            o.en.b bVarJ = j();
            Context contextH = h();
            Object[] objArr3 = {((b) e()).f20254o};
            int priority = Thread.currentThread().getPriority();
            int i7 = o.ep.d.f24459k * (-265870313);
            o.ep.d.f24459k = i7;
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = o.ep.d.f24467s * 971716978;
            o.ep.d.f24467s = i9;
            i().d(bVarJ.b(contextH, (o.ep.d) o.ep.d.e(-635724502, 635724509, objArr3, i7, i8, i9, priority)));
            int i10 = f20263j + 15;
            f20261g = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // o.ab.j
        public final a b(int i2) {
            Object[] objArr = {this, Integer.valueOf(i2)};
            int i3 = f20258b * (-1404499564);
            f20258b = i3;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i4 = (-1110494514) * f20259c;
            f20259c = i4;
            return (a) c(i4, iFreeMemory, objArr, -633546876, 633546877, i3, (int) SystemClock.elapsedRealtime());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20263j + 69;
            f20261g = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) e()).g().e(cVar);
                return;
            }
            ((b) e()).g().e(cVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20263j + 93;
            f20261g = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().a(((b) e()).f20252k);
            int i5 = f20261g + 71;
            f20263j = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final j k() {
            int i2 = 2 % 2;
            if (((b) e()).f20249f != null) {
                int i3 = f20261g + 51;
                f20263j = i3 % 128;
                if (i3 % 2 != 0) {
                    o.i.d dVar = ((b) e()).f20250g;
                    throw null;
                }
                if (((b) e()).f20250g != null) {
                    j jVar = new j(((b) e()).f20249f, ((b) e()).f20250g);
                    int i4 = f20261g + 25;
                    f20263j = i4 % 128;
                    int i5 = i4 % 2;
                    return jVar;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v("\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{38, 6, 134, 0}, false, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((b) e()).f20254o.b());
            if (((b) e()).f20251j != null) {
                int i3 = f20263j + 21;
                f20261g = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    v("\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{44, 7, 0, 5}, true, objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    v("\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{44, 7, 0, 5}, false, objArr3);
                    obj = objArr3[0];
                }
                aVar.c(((String) obj).intern(), 0);
            }
            int i4 = f20263j + 105;
            f20261g = i4 % 128;
            if (i4 % 2 != 0) {
                return aVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20261g + 87;
            f20263j = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{0, 19, 0, 8}, false, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{0, 19, 0, 8}, false, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20261g + 17;
            f20263j = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = f20260d * 1110791327;
            f20260d = i2;
            int i3 = (int) Runtime.getRuntime().totalMemory();
            return (byte[][]) c((int) Runtime.getRuntime().maxMemory(), i3, new Object[]{this}, -809744328, 809744328, i2, Process.myUid());
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
        
            if (r1 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0027, code lost:
        
            super.s();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0040, code lost:
        
            j().d(h(), ((o.ai.b) e()).f20254o.b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s() throws java.lang.Throwable {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = o.ai.b.d.f20261g
                int r1 = r0 + 31
                int r0 = r1 % 128
                o.ai.b.d.f20263j = r0
                int r1 = r1 % r3
                r2 = 1
                if (r1 == 0) goto L2b
                int[] r1 = o.ai.b.AnonymousClass3.f20257c
                o.bg.c r0 = r4.f()
                o.bg.a r0 = r0.c()
                int r0 = r0.ordinal()
                r1 = r1[r0]
                r0 = 75
                int r0 = r0 / 0
                if (r1 == r2) goto L58
                if (r1 == r3) goto L40
            L27:
                super.s()
                return
            L2b:
                int[] r1 = o.ai.b.AnonymousClass3.f20257c
                o.bg.c r0 = r4.f()
                o.bg.a r0 = r0.c()
                int r0 = r0.ordinal()
                r0 = r1[r0]
                if (r0 == r2) goto L58
                if (r0 == r3) goto L40
                goto L27
            L40:
                o.en.b r2 = r4.j()
                android.content.Context r1 = r4.h()
                o.ab.e r0 = r4.e()
                o.ai.b r0 = (o.ai.b) r0
                o.ep.d r0 = r0.f20254o
                java.lang.String r0 = r0.b()
                r2.d(r1, r0)
                return
            L58:
                o.en.b r2 = r4.j()
                android.content.Context r1 = r4.h()
                o.ab.e r0 = r4.e()
                o.ai.b r0 = (o.ai.b) r0
                o.ep.d r0 = r0.f20254o
                java.lang.String r0 = r0.b()
                r2.c(r1, r0)
                int r0 = o.ai.b.d.f20263j
                int r1 = r0 + 95
                int r0 = r1 % 128
                o.ai.b.d.f20261g = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L7e
                r0 = 93
                int r0 = r0 / 0
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ai.b.d.s():void");
        }
    }

    public interface e {
        void a(Boolean bool);

        void e(c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r8, int r9, byte r10) {
        /*
            byte[] r7 = o.ai.b.$$d
            int r0 = r9 * 7
            int r6 = 78 - r0
            int r0 = r8 * 2
            int r5 = 1 - r0
            int r0 = r10 * 2
            int r4 = 5 - r0
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r7 != 0) goto L28
            r0 = r4
            r1 = r2
        L15:
            int r4 = r4 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r7[r4]
            goto L15
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ai.b.$$j(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20246p = 0;
        f20248t = 1;
        f20244l = 0;
        f20247s = 1;
        k();
        TextUtils.getCapsMode("", 0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = f20246p + 15;
        f20248t = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public b(Context context, e eVar, o.en.b bVar) {
        super(context, eVar, bVar, o.bg.e.f21127y);
        this.f20253n = null;
        this.f20252k = Boolean.FALSE;
    }

    static void init$0() {
        $$d = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$e = 173;
    }

    static void k() {
        f20245m = 3120788664269377992L;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i4 = $11 + 97;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 731;
                    char c2 = (char) (7934 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF;
                    byte b2 = $$d[0];
                    byte b3 = b2;
                    objA = o.d.d.a(longPressTimeout, c2, modifierMetaStateMask, 355847088, false, $$j(b3, (byte) (b3 + 1), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20245m ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    int i7 = 836 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    char cMyTid = (char) ((Process.myTid() >> 22) + 27279);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                    byte b4 = $$d[0];
                    byte b5 = b4;
                    objA2 = o.d.d.a(i7, cMyTid, iResolveOpacity, -2145994442, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $11 + 49;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 836;
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27278);
                int mode = 11 - View.MeasureSpec.getMode(0);
                byte b6 = $$d[0];
                byte b7 = b6;
                objA3 = o.d.d.a(capsMode, c3, mode, -2145994442, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        d dVar = new d(this);
        int i3 = f20247s + 57;
        f20244l = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return dVar;
    }

    public final void c(byte[] bArr, o.i.d dVar, String str, o.ep.d dVar2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20244l + 31;
        f20247s = i3 % 128;
        int i4 = i3 % 2;
        this.f20251j = bArr;
        this.f20250g = dVar;
        this.f20249f = str;
        this.f20254o = dVar2;
        a();
        int i5 = f20244l + 15;
        f20247s = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20247s + 121;
        f20244l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q("鳆\uead9炉﹙䐅폗妝ꝉ\u2d2b듋ʂ衱ᘯ鷿\uebbd煗Ｖ䛸첩婃ꀬ\u2feb뗔Ν襑\u1716", 30269 - Color.blue(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20244l + 13;
        f20247s = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
