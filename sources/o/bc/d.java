package o.bc;

import android.content.Context;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.az.e;
import o.cg.f;
import o.dj.c;
import o.ef.a;
import o.fm.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f20895f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f20896g = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f20897k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20898l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f20899m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20900n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20901o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20902r = 0;

    public static final class b extends e.d<d> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char[] f20903d = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20904f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char f20905g = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20906j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r8, short r9, int r10) {
            /*
                int r1 = r9 + 4
                byte[] r7 = o.bc.d.b.$$a
                int r6 = 111 - r10
                int r5 = r8 * 4
                int r0 = r5 + 1
                byte[] r4 = new byte[r0]
                r3 = 0
                if (r7 != 0) goto L26
                r2 = r3
                r0 = r1
            L11:
                int r1 = r1 + r6
                r6 = r1
                r1 = r0
            L14:
                int r0 = r1 + 1
                byte r1 = (byte) r6
                r4[r2] = r1
                if (r2 != r5) goto L21
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L21:
                r1 = r7[r0]
                int r2 = r2 + 1
                goto L11
            L26:
                r2 = r3
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bc.d.b.$$d(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20904f = 0;
            f20906j = 1;
            f20903d = new char[]{64578, 65467, 64629, 64597, 64534, 64531, 64631, 64528, 64577, 65470, 64532, 64586, 64625, 64590, 64541, 64595, 64535, 64584, 65469, 64593, 64585, 64587, 64583, 65471, 65465, 65466, 64630, 64582, 64624, 64580, 64588, 64576, 64592, 65468, 64598, 64540};
            f20905g = (char) 51641;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(dVar);
            ViewConfiguration.getWindowTouchSlop();
            KeyEvent.getModifierMetaStateMask();
        }

        static void init$0() {
            $$a = new byte[]{42, -91, MessagePack.Code.MAP16, 103};
            $$b = 44;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(int r25, java.lang.String r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1012
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bc.d.b.v(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((ViewConfiguration.getScrollBarSize() >> 8) + 19, "\u0001\n\u000b\u0005\b\r\u001f\u000b\u0016\n\u0011\"\b\u000b\u0010\u0002\u001f\u000b㗯", (byte) (67 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
            o.cg.b bVar = new o.cg.b(context, 3, ((String) objArr[0]).intern());
            int i3 = f20906j + 33;
            f20904f = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final void a(a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20904f + 65;
            f20906j = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.ab.j
        public final void e(a aVar) throws Throwable {
            a aVarD;
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20904f + 65;
            f20906j = i3 % 128;
            if (i3 % 2 == 0) {
                aVarD = j().e().d();
                Object[] objArr = new Object[1];
                v((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) * 31, "\u0017\u0011\u0012\"\u0013 \u0019\u0014\u0019\u0017!#", (byte) ((ViewConfiguration.getLongPressTimeout() >> 7) * 23), objArr);
                obj = objArr[0];
            } else {
                aVarD = j().e().d();
                Object[] objArr2 = new Object[1];
                v((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, "\u0017\u0011\u0012\"\u0013 \u0019\u0014\u0019\u0017!#", (byte) (8 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr2);
                obj = objArr2[0];
            }
            aVar.a(((String) obj).intern(), aVarD);
        }

        @Override // o.ab.j
        public final a m() throws Throwable {
            int i2 = 2 % 2;
            a aVar = new a();
            Object[] objArr = new Object[1];
            v(TextUtils.lastIndexOf("", '0', 0) + 19, "\u0017\u001a\u001f\u0016\u0007\u001e\u0019!!\f \u0007\u001b\u0004\u000b\u001a\u0019\u0001", (byte) ('>' - AndroidCharacter.getMirror('0')), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = {j()};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i3 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i3;
            Object[] objArr3 = {(g) o.en.b.a(-568976488, elapsedCpuTime, objArr2, iUptimeMillis, 568976490, priority, i3)};
            int i4 = g.f26061f * 390633709;
            g.f26061f = i4;
            aVar.a(strIntern, (Long) g.b((int) Thread.currentThread().getId(), new Random().nextInt(983859859), Thread.activeCount(), i4, 540695712, -540695709, objArr3));
            int i5 = f20906j + 13;
            f20904f = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20904f + 53;
            f20906j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v(4 - TextUtils.indexOf("", "", 0), "\u0000!\u0012\u0003", (byte) (86 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20906j + 121;
            f20904f = i5 % 128;
            if (i5 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            j().e().f().e(new o.dk.a(h()));
            int i3 = f20904f + 109;
            f20906j = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.ab.j
        public final void t() throws Throwable {
            int i2 = 2 % 2;
            c.c(h());
            j().e().f().e(new o.dk.a(h()));
            int i3 = f20904f + 13;
            f20906j = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(int r8, byte r9, int r10) {
        /*
            byte[] r7 = o.bc.d.$$k
            int r0 = r8 * 3
            int r6 = r0 + 69
            int r2 = r10 * 3
            int r1 = 1 - r2
            int r0 = r9 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2b
            r2 = r0
            r6 = r3
            r1 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r2
        L19:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L16
        L2b:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bc.d.$$m(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20900n = 0;
        f20902r = 1;
        f20898l = 0;
        f20901o = 1;
        n();
        Process.myPid();
        View.resolveSize(0, 0);
        int i2 = f20902r + 41;
        f20900n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    public d(Context context, e.c cVar, o.en.b bVar, o.dd.g gVar) {
        super(context, cVar, bVar, gVar);
    }

    static void init$0() {
        $$k = new byte[]{76, -80, -89, 46};
        $$l = 251;
    }

    static void n() {
        f20896g = (char) 29605;
        f20895f = (char) 40640;
        f20897k = (char) 47720;
        f20899m = (char) 23077;
    }

    private static void s(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 89;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else if (str2 != null) {
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f20897k) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f20899m)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 270, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1995022631, false, $$m(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f20896g) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20895f)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(TextUtils.indexOf("", "", 0) + 270, (char) TextUtils.indexOf("", "", 0, 0), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1995022631, false, $$m(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 270;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i10 = $$l;
                byte b6 = (byte) ((i10 + 5) - (i10 | 5));
                byte b7 = (byte) (-b6);
                objA3 = o.d.d.a(scrollBarFadeDuration, cLastIndexOf, iIndexOf, -2074123590, false, $$m(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2, 0, i2);
        int i11 = $11 + 21;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        b bVar = new b(this);
        int i3 = f20901o + 55;
        f20898l = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20898l + 15;
        f20901o = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            s("諾游輦嫻⫠샗뎽ຜ렂⯦ḗݏ", 27 - (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 0.0d ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            s("諾游輦嫻⫠샗뎽ຜ렂⯦ḗݏ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f20898l + 69;
        f20901o = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.az.e
    public final boolean o() {
        int i2 = 2 % 2;
        int i3 = f20901o;
        int i4 = i3 + 125;
        f20898l = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        f20898l = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }
}
