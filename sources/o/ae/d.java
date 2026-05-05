package o.ae;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.n;
import o.a.o;
import o.ab.e;
import o.ab.j;
import o.cg.b;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e<a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f20163f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f20164j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20165l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20166m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20167n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20168o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20169g;

    /* JADX INFO: renamed from: o.ae.d$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20170a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20171c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20172e = 1;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20171c = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20172e;
                int i3 = (((-1) - (((-1) - i2) & ((-1) - 37))) << 1) - (i2 ^ 37);
                f20170a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20171c[o.bg.a.aB.ordinal()] = 2;
                int i5 = f20172e;
                int i6 = (((i5 + 55) - (55 & i5)) << 1) - (i5 ^ 55);
                f20170a = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a {
        void a();

        void b(o.bg.c cVar);
    }

    static final class c extends j<d> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20173b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20174c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20175d = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f20176h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20177j = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static int f20178v = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static int f20179z = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(byte r6, byte r7, int r8) {
            /*
                int r0 = r7 * 3
                int r7 = r0 + 4
                int r0 = r8 * 2
                int r2 = r0 + 113
                int r1 = r6 * 2
                int r0 = 1 - r1
                byte[] r6 = o.ae.d.c.$$k
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r6 != 0) goto L2b
                r0 = r3
                r2 = r7
                r1 = r4
            L18:
                int r7 = r7 + 1
                int r2 = r2 + r0
            L1b:
                byte r0 = (byte) r2
                r5[r1] = r0
                if (r1 != r3) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                int r1 = r1 + 1
                r0 = r6[r7]
                goto L18
            L2b:
                r1 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ae.d.c.$$m(byte, byte, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20179z = 537596124;
            f20178v = 1865935982;
            init$0();
            f20174c = -771255054;
            f20175d = 1245766432;
            f20176h = 0;
            f20177j = 1;
            f20173b = -1270219411;
        }

        c(d dVar) {
            super(dVar, true);
        }

        private static void A(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            String str2 = str;
            int i5 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i6 = $10 + 61;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i8 = $11 + 115;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i10 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f20173b)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetAfter("", 0) + 11, -2071844881, false, $$m(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 522, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 13, 627984172, false, $$m(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    int i11 = $11 + 43;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i4 > 0) {
                int i13 = $10 + 113;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                int i15 = $11 + 113;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(KeyEvent.keyCodeFromString("") + 522, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetAfter("", 0) + 12, 627984172, false, $$m(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void B(int r9, short r10, int r11, java.lang.Object[] r12) {
            /*
                int r0 = r11 * 3
                int r8 = 101 - r0
                int r0 = r9 * 3
                int r7 = 3 - r0
                byte[] r6 = o.ae.d.c.$$a
                int r0 = r10 * 2
                int r5 = 1 - r0
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r6 != 0) goto L2e
                r0 = r7
                r8 = r5
                r2 = r3
            L16:
                int r7 = r7 + r8
                r1 = r2
                r8 = r7
                r7 = r0
            L1a:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                int r0 = r7 + 1
                if (r2 != r5) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L2b:
                r7 = r6[r0]
                goto L16
            L2e:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ae.d.c.B(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(byte r8, int r9, int r10, java.lang.Object[] r11) {
            /*
                int r8 = 111 - r8
                int r0 = r10 * 5
                int r7 = 6 - r0
                byte[] r6 = o.ae.d.c.$$d
                int r5 = r9 + 4
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L2a
                r0 = r8
                r8 = r7
                r2 = r3
            L12:
                int r8 = r8 + r0
                int r8 = r8 + (-6)
                r1 = r2
            L16:
                int r5 = r5 + 1
                byte r0 = (byte) r8
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r7) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L27:
                r0 = r6[r5]
                goto L12
            L2a:
                r1 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ae.d.c.E(byte, int, int, java.lang.Object[]):void");
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            c cVar = (c) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i2 = 2 % 2;
            int i3 = f20176h + 53;
            f20177j = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (iIntValue == 5001) {
                return o.bg.a.aA;
            }
            if (iIntValue == 5002) {
                return o.bg.a.aB;
            }
            if (iIntValue == 6000) {
                return o.bg.a.aI;
            }
            o.bg.a aVarB = super.b(iIntValue);
            int i4 = f20177j + 121;
            f20176h = i4 % 128;
            int i5 = i4 % 2;
            return aVarB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~i4;
            int i10 = ~(i8 | i9);
            int i11 = (~(i8 | i2)) | i10;
            int i12 = (-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - (~i2)) & ((-1) - i8)))) & ((-1) - i4))))) & ((-1) - (~((i9 + i5) - (i9 & i5)))));
            int i13 = i5 + i4 + i3 + (531708263 * i7) + ((-608630064) * i6);
            int i14 = i13 * i13;
            int i15 = (i5 * (-228234701)) + 730857472 + ((-228234701) * i4) + (i10 * (-1010133554)) + (i11 * (-1010133554)) + ((-1010133554) * i12) + ((-1238368256) * i3) + ((-45088768) * i7) + ((-419430400) * i6) + ((-1471938560) * i14);
            int i16 = ((i5 * (-1679524527)) - 150938974) + (i4 * (-1679524527)) + (i10 * 282) + (i11 * 282) + (i12 * 282) + (i3 * (-1679524245)) + (i7 * (-166744051)) + (i6 * 2062148848) + (i14 * (-865337344));
            if (i15 + (i16 * i16 * (-1617166336)) != 1) {
                return a(objArr);
            }
            c cVar = (c) objArr[0];
            int i17 = 2 % 2;
            int i18 = f20176h + 75;
            f20177j = i18 % 128;
            int i19 = i18 % 2;
            ((d) cVar.e()).g().a();
            int i20 = f20177j + 41;
            f20176h = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }

        private static b e(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            A(((Process.getThreadPriority(0) + 20) >> 6) + 19, "\ufffe\u0004\u0005￼\u0003\u0001�￼�\u0004\u0004\u0005\u0004��\u0000�\u0005\u0002", false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 169, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr);
            b bVar = new b(context, 54, ((String) objArr[0]).intern());
            int i3 = f20176h + 99;
            f20177j = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
            $$b = 238;
        }

        static void init$1() {
            $$d = new byte[]{85, Ascii.RS, 127, 42, MessagePack.Code.BIN16, 59, 10, MessagePack.Code.UINT16, 57};
            $$e = 89;
        }

        static void init$2() {
            $$k = new byte[]{108, -10, -111, 117};
            $$l = 169;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ o.cg.f a(android.content.Context r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1905
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ae.d.c.a(android.content.Context):o.cg.f");
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20176h + 83;
            f20177j = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            Object[] objArr = {this, Integer.valueOf(i2)};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i3 = f20175d * 1753976900;
            f20175d = i3;
            return (o.bg.a) b(iFreeMemory, iMaxMemory, -2125857076, objArr, 2125857076, (int) Process.getElapsedCpuTime(), i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20177j + 47;
            f20176h = i3 % 128;
            if (i3 % 2 != 0) {
                ((d) e()).g().b(cVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((d) e()).g().b(cVar);
            int i4 = f20176h + 63;
            f20177j = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int priority = Thread.currentThread().getPriority();
            int iNextInt = new Random().nextInt();
            int iMyUid = Process.myUid();
            int i2 = f20174c * 729824606;
            f20174c = i2;
            b(priority, iNextInt, -288567, new Object[]{this, cVar}, 288568, i2, iMyUid);
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20176h + 73;
            int i4 = i3 % 128;
            f20177j = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 35;
            f20176h = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 59 / 0;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            A(TextUtils.indexOf((CharSequence) "", '0', 0) + 7, "\u0002\u0000\u0011\u0003￨\u0003", false, Color.argb(0, 0, 0, 0) + JfifUtil.MARKER_RST7, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((d) e()).f20169g);
            int i3 = f20176h + 81;
            f20177j = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20176h + 67;
            f20177j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            A(13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0007￥ￔ\u0012￥\u0003\u0014\u0006\u0006\u0007\u000e\u0007\u0016", false, (Process.myTid() >> 22) + Mp4VideoDirectory.TAG_OPCOLOR, 8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20176h + 9;
            f20177j = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20176h;
            int i4 = i3 + 13;
            f20177j = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 57;
            f20177j = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void q() {
            int i2 = 2 % 2;
            int i3 = f20176h + 53;
            f20177j = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20176h + 31;
            f20177j = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass5.f20171c[f().c().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    super.s();
                    return;
                } else {
                    j().d(h(), ((d) e()).f20169g);
                    return;
                }
            }
            j().c(h(), ((d) e()).f20169g);
            int i6 = f20176h + 61;
            f20177j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 40 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, int r9, int r10) {
        /*
            int r0 = r10 * 2
            int r7 = 3 - r0
            int r6 = r8 + 99
            byte[] r5 = o.ae.d.$$d
            int r1 = r9 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2a
            r1 = r6
            r6 = r2
            r0 = r3
        L16:
            int r6 = r6 + r1
            r1 = r0
        L18:
            byte r0 = (byte) r6
            int r7 = r7 + 1
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r1 = r5[r7]
            goto L16
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ae.d.$$j(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20167n = 0;
        f20168o = 1;
        f20165l = 0;
        f20166m = 1;
        o();
        View.resolveSizeAndState(0, 0, 0);
        AndroidCharacter.getMirror('0');
        View.getDefaultSize(0, 0);
        SystemClock.elapsedRealtime();
        KeyEvent.getModifierMetaStateMask();
        KeyEvent.getDeadChar(0, 0);
        int i2 = f20167n + 39;
        f20168o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public d(Context context, a aVar, o.en.b bVar) {
        super(context, aVar, bVar, o.bg.e.B);
    }

    static void init$0() {
        $$d = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$e = 233;
    }

    private c k() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f20165l + 89;
        f20166m = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    static void o() {
        f20163f = new char[]{55334, 48237, 4161, 62607, 18664, 11563, 33116, 25991, 63952, 24108, 12864, 38505, 27321, 52948, 41766, 1902, 39848, 32734, 54303, 43087, 13298, 22467, 64422, 8029, 41746, 50897, 27326, 36453, 4613, 46589, 55712, 32140, 33038, 9545, 18586, 60563, 28759, 37950, 16358, 17378, 59198, 38038, 61613, 23786, 47161, 1134, 25013, 52717, 10582, 46418, 4795, 32471, 56062, 9774};
        f20164j = -1606926704832483128L;
    }

    private static void q(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 95;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f20163f[i2 >> i6])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(742 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "") + 12, 632508977, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f20164j), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int iResolveSize = View.resolveSize(0, 0) + 766;
                        char tapTimeout = (char) (12470 - (ViewConfiguration.getTapTimeout() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12;
                        byte b4 = (byte) ($$e & 7);
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(iResolveSize, tapTimeout, windowTouchSlop, 1946853218, false, $$j(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = o.d.d.a(387 - Gravity.getAbsoluteGravity(0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, 39570797, false, $$j((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f20163f[i2 + i7])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(742 - TextUtils.indexOf("", ""), (char) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 12, 632508977, false, $$j(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f20164j), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 766;
                    char c3 = (char) (12471 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int absoluteGravity = 12 - Gravity.getAbsoluteGravity(0, 0);
                    byte b9 = (byte) ($$e & 7);
                    byte b10 = (byte) (b9 - 1);
                    objA5 = o.d.d.a(maximumDrawingCacheSize, c3, absoluteGravity, 1946853218, false, $$j(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 388, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$j((byte) 6, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 27;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                objA7 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 387, (char) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 18, 39570797, false, $$j((byte) 6, b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f20166m + 89;
        f20165l = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            q((char) (View.MeasureSpec.getMode(0) + 19607), KeyEvent.getMaxKeyCode() >> 16, KeyEvent.normalizeMetaState(0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42852), 20 - ExpandableListView.getPackedPositionGroup(0L), 22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i4 = f20165l + 17;
            f20166m = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        this.f20169g = str;
        a();
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20165l + 35;
        f20166m = i3 % 128;
        if (i3 % 2 == 0) {
            k();
            throw null;
        }
        c cVarK = k();
        int i4 = f20165l + 79;
        f20166m = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return cVarK;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20165l + 3;
        f20166m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 19607), ViewConfiguration.getMinimumFlingVelocity() >> 16, Color.green(0) + 20, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20165l + 41;
        f20166m = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }
}
