package o.fl;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Random;
import o.ea.f;
import o.ef.c;
import o.ff.a;
import o.ff.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f26002a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26003b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26004c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26005d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26006e = 0;

    /* JADX INFO: renamed from: g */
    private static char[] f26007g = null;

    /* JADX INFO: renamed from: h */
    private static long f26008h = 0;

    /* JADX INFO: renamed from: k */
    private static int f26009k = 0;

    /* JADX INFO: renamed from: m */
    private static int f26010m = 0;

    /* JADX INFO: renamed from: n */
    private static int f26011n = 0;

    /* JADX INFO: renamed from: o */
    private static int f26012o = 0;

    /* JADX INFO: renamed from: f */
    private int f26013f;

    /* JADX INFO: renamed from: i */
    private int f26014i;

    /* JADX INFO: renamed from: j */
    private int f26015j;

    /* JADX INFO: renamed from: o.fl.e$1 */
    public final class AnonymousClass1 extends d {

        /* JADX INFO: renamed from: d */
        private static int f26016d = 1;

        /* JADX INFO: renamed from: e */
        private static int f26017e = 0;

        /* JADX INFO: renamed from: c */
        private final e f26019c;

        AnonymousClass1(b bVar, short s2, int i2, int i3) {
            super(true, bVar, s2, i2, i3);
            this.f26019c = e.this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
        
            if (b() == o.ff.b.f25845c) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0023, code lost:
        
            r2 = o.fl.e.AnonymousClass1.f26017e;
            r1 = (r2 ^ 41) + ((r2 & 41) << 1);
            o.fl.e.AnonymousClass1.f26016d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
        
            if ((r1 % 2) != 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
        
            c(o.ff.b.f25844b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
        
            if (b() == o.ff.b.f25845c) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
        
            c(o.ff.b.f25844b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        
            r2 = o.fl.e.AnonymousClass1.f26016d;
            r1 = (((r2 + 123) - (123 & r2)) << 1) - (r2 ^ 123);
            o.fl.e.AnonymousClass1.f26017e = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
        
            if ((r1 % 2) == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        
            r0 = 12 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        
            return false;
         */
        @Override // o.ff.e, o.ff.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(java.lang.String r7, o.dk.a r8) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r2 = o.fl.e.AnonymousClass1.f26017e
                r0 = 11
                int r1 = r2 + r0
                r0 = r0 & r2
                int r1 = r1 - r0
                r4 = 1
                int r1 = r1 << r4
                r0 = r2 ^ 11
                int r1 = r1 - r0
                int r0 = r1 % 128
                o.fl.e.AnonymousClass1.f26016d = r0
                int r1 = r1 % r5
                r3 = 0
                if (r1 != 0) goto L39
                o.ff.b r2 = r6.b()
                o.ff.b r1 = o.ff.b.f25845c
                r0 = 84
                int r0 = r0 / r3
                if (r2 != r1) goto L48
            L23:
                int r2 = o.fl.e.AnonymousClass1.f26017e
                r1 = r2 ^ 41
                r0 = 41
                r2 = r2 & r0
                int r2 = r2 << r4
                int r1 = r1 + r2
                int r0 = r1 % 128
                o.fl.e.AnonymousClass1.f26016d = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L42
                o.ff.b r0 = o.ff.b.f25844b
                r6.c(r0)
                return r3
            L39:
                o.ff.b r1 = r6.b()
                o.ff.b r0 = o.ff.b.f25845c
                if (r1 != r0) goto L48
                goto L23
            L42:
                o.ff.b r0 = o.ff.b.f25844b
                r6.c(r0)
                return r4
            L48:
                int r2 = o.fl.e.AnonymousClass1.f26016d
                r0 = 123(0x7b, float:1.72E-43)
                int r1 = r2 + r0
                r0 = r0 & r2
                int r1 = r1 - r0
                int r1 = r1 << 1
                r0 = r2 ^ 123(0x7b, float:1.72E-43)
                int r1 = r1 - r0
                int r0 = r1 % 128
                o.fl.e.AnonymousClass1.f26017e = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L5f
                r0 = 12
                int r0 = r0 / r3
            L5f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.fl.e.AnonymousClass1.d(java.lang.String, o.dk.a):boolean");
        }
    }

    private static String $$c(short s2, byte b2, int i2) {
        byte[] bArr = $$a;
        int i3 = 105 - s2;
        int i4 = i2 * 3;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i5++;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i5];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26004c = 731400839;
        f26006e = -1689156441;
        f26002a = 969348562;
        f26005d = -1948949134;
        f26003b = -63455364;
        f26012o = 0;
        f26009k = 1;
        f26011n = 0;
        f26010m = 1;
        m();
        ViewConfiguration.getKeyRepeatDelay();
        ExpandableListView.getPackedPositionChild(0L);
        Process.getThreadPriority(0);
        int i2 = f26012o + 99;
        f26009k = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public e(boolean z2, b bVar, short s2) {
        super(z2, bVar, s2);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        if (eVar.b() == b.f25845c) {
            eVar.c(b.f25844b);
            int i3 = f26011n + 3;
            f26010m = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f26011n + 29;
        f26010m = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws Throwable {
        int i8 = ~((-1) - (((-1) - ((i4 + i7) - (i4 & i7))) & ((-1) - i2)));
        int i9 = ~i7;
        int i10 = ~((-1) - (((-1) - i9) & ((-1) - i2)));
        int i11 = ~i2;
        int i12 = ~((i11 + i4) - (i11 & i4));
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = (~(i2 | (~i4))) | i9;
        int i15 = i4 + i7 + i5 + ((-2044576983) * i3) + (1743660113 * i6);
        int i16 = i15 * i15;
        int i17 = ((1047202342 * i4) - 713031680) + (164951516 * i7) + (i8 * 441125413) + (441125413 * i13) + ((-441125413) * i14) + (606076928 * i5) + (689963008 * i3) + ((-299892736) * i6) + ((-1081737216) * i16);
        int i18 = ((i4 * 2048727874) - 782056376) + (i7 * 2048728756) + (i8 * (-441)) + (i13 * (-441)) + (i14 * 441) + (i5 * 2048728315) + (i3 * 2142076211) + (i6 * (-1448904853)) + (i16 * 1885470720);
        if (i17 + (i18 * i18 * (-1618345984)) != 1) {
            return a(objArr);
        }
        e eVar = (e) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i19 = 2 % 2;
        if (!eVar.c()) {
            if (!f.a()) {
                return null;
            }
            int i20 = f26011n + 35;
            f26010m = i20 % 128;
            int i21 = i20 % 2;
            Object[] objArr2 = new Object[1];
            l((char) (55149 - Color.red(0)), 9 - View.MeasureSpec.getMode(0), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            l((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 22 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionType(0L) + 54, objArr3);
            f.d(strIntern, ((String) objArr3[0]).intern());
            return null;
        }
        if (eVar.f26013f < eVar.f26015j) {
            if (iIntValue < 65535) {
                return new d(b.f25845c, eVar.a(), iIntValue, eVar.f26014i) { // from class: o.fl.e.1

                    /* JADX INFO: renamed from: d */
                    private static int f26016d = 1;

                    /* JADX INFO: renamed from: e */
                    private static int f26017e = 0;

                    /* JADX INFO: renamed from: c */
                    private final e f26019c;

                    AnonymousClass1(b bVar, short s2, int iIntValue2, int i32) {
                        super(true, bVar, s2, iIntValue2, i32);
                        this.f26019c = e.this;
                    }

                    @Override // o.ff.e, o.ff.a
                    public final boolean d(String v2, o.dk.a v3) {
                        /*
                            this = this;
                            r5 = 2
                            int r0 = r5 % r5
                            int r2 = o.fl.e.AnonymousClass1.f26017e
                            r0 = 11
                            int r1 = r2 + r0
                            r0 = r0 & r2
                            int r1 = r1 - r0
                            r4 = 1
                            int r1 = r1 << r4
                            r0 = r2 ^ 11
                            int r1 = r1 - r0
                            int r0 = r1 % 128
                            o.fl.e.AnonymousClass1.f26016d = r0
                            int r1 = r1 % r5
                            r3 = 0
                            if (r1 != 0) goto L39
                            o.ff.b r2 = r6.b()
                            o.ff.b r1 = o.ff.b.f25845c
                            r0 = 84
                            int r0 = r0 / r3
                            if (r2 != r1) goto L48
                        L23:
                            int r2 = o.fl.e.AnonymousClass1.f26017e
                            r1 = r2 ^ 41
                            r0 = 41
                            r2 = r2 & r0
                            int r2 = r2 << r4
                            int r1 = r1 + r2
                            int r0 = r1 % 128
                            o.fl.e.AnonymousClass1.f26016d = r0
                            int r1 = r1 % r5
                            if (r1 != 0) goto L42
                            o.ff.b r0 = o.ff.b.f25844b
                            r6.c(r0)
                            return r3
                        L39:
                            o.ff.b r1 = r6.b()
                            o.ff.b r0 = o.ff.b.f25845c
                            if (r1 != r0) goto L48
                            goto L23
                        L42:
                            o.ff.b r0 = o.ff.b.f25844b
                            r6.c(r0)
                            return r4
                        L48:
                            int r2 = o.fl.e.AnonymousClass1.f26016d
                            r0 = 123(0x7b, float:1.72E-43)
                            int r1 = r2 + r0
                            r0 = r0 & r2
                            int r1 = r1 - r0
                            int r1 = r1 << 1
                            r0 = r2 ^ 123(0x7b, float:1.72E-43)
                            int r1 = r1 - r0
                            int r0 = r1 % 128
                            o.fl.e.AnonymousClass1.f26017e = r0
                            int r1 = r1 % r5
                            if (r1 == 0) goto L5f
                            r0 = 12
                            int r0 = r0 / r3
                        L5f:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.fl.e.AnonymousClass1.d(java.lang.String, o.dk.a):boolean");
                    }
                };
            }
            if (!f.a()) {
                return null;
            }
            Object[] objArr4 = new Object[1];
            l((char) (55149 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            l((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.keyCodeFromString("") + 153, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 66, objArr5);
            f.d(strIntern2, ((String) objArr5[0]).intern());
            return null;
        }
        if (!f.a()) {
            return null;
        }
        int i22 = f26010m + 117;
        f26011n = i22 % 128;
        int i23 = i22 % 2;
        Object[] objArr6 = new Object[1];
        l((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 55150), ((Process.getThreadPriority(0) + 20) >> 6) + 9, 14 - Color.green(0), objArr6);
        String strIntern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        l((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 77 - Drawable.resolveOpacity(0, 0), 76 - View.MeasureSpec.getMode(0), objArr7);
        f.c(strIntern3, ((String) objArr7[0]).intern());
        return null;
    }

    static void init$0() {
        $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$b = 120;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(char r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fl.e.l(char, int, int, java.lang.Object[]):void");
    }

    static void m() {
        f26007g = new char[]{38035, 62255, 23491, 38017, 62255, 23489, 41597, 2595, 37580, 17352, 9311, 36030, 29953, 56683, 17843, 11792, 38509, 32434, 59136, 20337, 14231, 38934, 's', 38032, 62254, 23497, 41573, 2610, 37617, 63841, 16661, 43470, 12368, 38913, 57567, 20345, 55051, 16297, 34368, 60945, 30382, 56667, 9500, 36287, 5225, 31771, 50351, 9082, 35602, 5025, 31308, 49899, 10937, 45384, 6565, 25087, 51227, 20715, 47244, 1871, 28607, 63373, 24126, 42682, 3725, 38183, 64997, 17886, 44070, 13530, 40084, 64299, 17351, 43921, 12859, 39626, 57706, 38032, 62254, 23497, 41573, 2610, 37617, 63841, 16661, 43470, 12368, 38913, 57567, 20345, 55051, 16297, 34368, 60945, 30382, 56667, 9500, 36287, 5225, 31771, 50351, 9082, 35602, 5025, 31308, 49899, 10937, 45384, 6565, 25087, 51227, 20715, 47244, 1871, 28607, 63372, 24108, 42729, 3779, 38202, 65012, 17823, 44068, 13508, 40080, 64294, 17291, 43929, 12845, 39637, 57647, 18745, 53724, 14450, 32826, 59605, 30580, 57091, 10135, 36460, 5636, 32459, 50550, 11525, 46503, 7266, 25695, 52394, 11096, 45847, 7073, 25165, 51715, 38032, 62254, 23497, 41573, 2610, 37617, 63841, 16661, 43470, 12368, 38913, 57567, 20345, 55051, 16297, 34368, 60945, 30382, 56667, 9500, 36287, 5225, 31771, 50351, 9082, 35602, 5025, 31308, 49899, 10937, 45384, 6565, 25087, 51227, 20673, 47293, 1909, 28607, 63372, 24108, 42729, 3779, 38202, 65012, 17823, 44068, 13508, 40080, 64294, 17291, 43908, 12849, 39619, 57647, 18745, 53724, 14450, 32826, 59605, 30580, 57091, 10135, 36458, 5636, 32478, 50542, 11525};
        f26008h = 1694168554756371291L;
    }

    public final c a(int i2) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        Object obj = null;
        if (this.f26015j == 0) {
            int i5 = f26010m + 29;
            f26011n = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        c cVar = new c();
        int i6 = 0;
        while (true) {
            i3 = this.f26013f;
            if (i6 >= i3) {
                break;
            }
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            l((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getSize(0) + 3, objArr);
            aVar.c(((String) objArr[0]).intern(), i2 + i6);
            Object[] objArr2 = new Object[1];
            l((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) b.f25843a.a());
            cVar.a(aVar);
            i6++;
        }
        while (i3 < this.f26015j) {
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr3 = new Object[1];
            l((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0', 0) + 1, TextUtils.getOffsetBefore("", 0) + 3, objArr3);
            aVar2.c(((String) objArr3[0]).intern(), i2 + i3);
            Object[] objArr4 = new Object[1];
            l((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.alpha(0) + 3, 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) b().a());
            cVar.a(aVar2);
            i3++;
        }
        int i7 = f26010m + 85;
        f26011n = i7 % 128;
        if (i7 % 2 == 0) {
            return cVar;
        }
        obj.hashCode();
        throw null;
    }

    public final d b(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        int i3 = 645608949 * f26002a;
        f26002a = i3;
        int i4 = f26006e * 1360166262;
        f26006e = i4;
        int i5 = (-292459287) * f26004c;
        f26004c = i5;
        return (d) c(i3, i5, -1668709194, i4, Thread.activeCount(), 1668709195, objArr);
    }

    public final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = f26010m + 21;
        int i5 = i4 % 128;
        f26011n = i5;
        int i6 = i4 % 2;
        this.f26013f = i2;
        int i7 = i5 + 115;
        f26010m = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.ff.a
    public final void d() {
        int i2 = 2 % 2;
        int i3 = f26010m + 117;
        f26011n = i3 % 128;
        if (i3 % 2 != 0) {
            c(b.f25843a);
            throw null;
        }
        c(b.f25843a);
        int i4 = f26010m + 87;
        f26011n = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f26010m + 9;
        int i5 = i4 % 128;
        f26011n = i5;
        int i6 = i4 % 2;
        this.f26015j = i2;
        int i7 = i5 + 17;
        f26010m = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.ff.a
    public final boolean d(String str, o.dk.a aVar) {
        int iMyPid = Process.myPid();
        int i2 = f26003b * (-157132869);
        f26003b = i2;
        int iNextInt = new Random().nextInt();
        int i3 = f26005d * (-1275353515);
        f26005d = i3;
        return ((Boolean) c(iMyPid, iNextInt, 1604109642, i2, i3, -1604109642, new Object[]{this, str, aVar})).booleanValue();
    }

    public final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = f26010m;
        int i5 = i4 + 91;
        f26011n = i5 % 128;
        if (i5 % 2 != 0) {
            this.f26014i = i2;
            int i6 = 69 / 0;
        } else {
            this.f26014i = i2;
        }
        int i7 = i4 + 13;
        f26011n = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int g() {
        int i2 = 2 % 2;
        int i3 = f26011n + 23;
        int i4 = i3 % 128;
        f26010m = i4;
        int i5 = i3 % 2;
        int i6 = this.f26014i;
        int i7 = i4 + 29;
        f26011n = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    @Override // o.ff.a
    public final short h() {
        int i2 = 2 % 2;
        short s2 = (short) (this.f26015j - this.f26013f);
        if (s2 <= 0) {
            return (short) 0;
        }
        int i3 = f26010m;
        int i4 = i3 + 93;
        f26011n = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        f26011n = i6 % 128;
        int i7 = i6 % 2;
        return s2;
    }

    public final int i() {
        int i2 = 2 % 2;
        int i3 = f26011n;
        int i4 = i3 + 75;
        f26010m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f26015j;
        int i7 = i3 + 27;
        f26010m = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int j() {
        int i2 = 2 % 2;
        int i3 = f26011n;
        int i4 = i3 + 41;
        f26010m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f26013f;
        int i7 = i3 + 115;
        f26010m = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
