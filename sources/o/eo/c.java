package o.eo;

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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.ep.h;
import o.ep.i;
import o.er.w;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24256a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24257b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24258c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24259d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24260e = 0;

    /* JADX INFO: renamed from: f */
    private static final Map<Class<? extends o.eo.b<?>>, String> f24261f;

    /* JADX INFO: renamed from: g */
    public static int f24262g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24263h = 0;

    /* JADX INFO: renamed from: j */
    private static int f24264j = 0;

    /* JADX INFO: renamed from: k */
    private static char f24265k = 0;

    /* JADX INFO: renamed from: l */
    private static short[] f24266l = null;

    /* JADX INFO: renamed from: m */
    private static int f24267m = 0;

    /* JADX INFO: renamed from: n */
    private static byte[] f24268n = null;

    /* JADX INFO: renamed from: o */
    private static int f24269o = 0;

    /* JADX INFO: renamed from: p */
    private static char f24270p = 0;

    /* JADX INFO: renamed from: q */
    private static char f24271q = 0;

    /* JADX INFO: renamed from: r */
    private static char f24272r = 0;

    /* JADX INFO: renamed from: s */
    private static int f24273s = 0;

    /* JADX INFO: renamed from: t */
    private static int f24274t = 0;

    /* JADX INFO: renamed from: v */
    private static int f24275v = 0;

    /* JADX INFO: renamed from: x */
    private static int f24276x = 0;

    /* JADX INFO: renamed from: i */
    private final Map<String, b> f24277i = new HashMap();

    public static final class b {

        /* JADX INFO: renamed from: b */
        public static int f24278b = -224378507;

        /* JADX INFO: renamed from: c */
        public static int f24279c = -1870890230;

        /* JADX INFO: renamed from: d */
        public static int f24280d = 884605135;

        /* JADX INFO: renamed from: e */
        public static int f24281e = -1720085916;

        /* JADX INFO: renamed from: f */
        private static int f24282f = 0;

        /* JADX INFO: renamed from: g */
        private static int f24283g = 1;

        /* JADX INFO: renamed from: a */
        private final a f24284a;

        /* JADX INFO: renamed from: h */
        private final d f24285h;

        /* JADX INFO: renamed from: i */
        private final g f24286i;

        /* JADX INFO: renamed from: j */
        private final f f24287j;

        public b() {
            this(new a(), new d(), new g(), new f());
        }

        public b(a aVar, d dVar, g gVar, f fVar) {
            this.f24284a = aVar;
            this.f24285h = dVar;
            this.f24286i = gVar;
            this.f24287j = fVar;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            b bVar = (b) objArr[0];
            int i2 = 2 % 2;
            int i3 = f24283g + 103;
            int i4 = i3 % 128;
            f24282f = i4;
            int i5 = i3 % 2;
            Object obj = null;
            d dVar = bVar.f24285h;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i4 + 83;
            f24283g = i6 % 128;
            if (i6 % 2 != 0) {
                return dVar;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i6;
            int i9 = (~((i8 + i3) - (i8 & i3))) | (~((i6 + i2) - (i6 & i2)));
            int i10 = ~i3;
            int i11 = (~((i10 + i2) - (i10 & i2))) | i6;
            int i12 = ~i2;
            int i13 = (~((-1) - (((-1) - i2) & ((-1) - i3)))) | (~((i10 + i12) - (i10 & i12))) | i6;
            int i14 = i3 + i6 + i5 + ((-737137436) * i7) + ((-1840598144) * i4);
            int i15 = i14 * i14;
            int i16 = (((-699670985) * i3) - 818937856) + (24099949 * i6) + (723770934 * i9) + ((-1447541868) * i11) + ((-723770934) * i13) + ((-1423441920) * i5) + (1335885824 * i7) + ((-1946157056) * i4) + ((-1593638912) * i15);
            int i17 = (i3 * 1252406331) + 1981669868 + (i6 * 1252405337) + (i9 * (-994)) + (i11 * 1988) + (i13 * 994) + (i5 * 1252407325) + (i7 * (-1820396076)) + (i4 * 1320834432) + (i15 * (-447283200));
            int i18 = i16 + (i17 * i17 * 1511325696);
            if (i18 == 1) {
                return e(objArr);
            }
            if (i18 != 2) {
                return a(objArr);
            }
            b bVar = (b) objArr[0];
            int i19 = 2 % 2;
            int i20 = f24283g + 55;
            int i21 = i20 % 128;
            f24282f = i21;
            int i22 = i20 % 2;
            g gVar = bVar.f24286i;
            int i23 = i21 + 65;
            f24283g = i23 % 128;
            int i24 = i23 % 2;
            return gVar;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            b bVar = (b) objArr[0];
            int i2 = 2 % 2;
            int i3 = f24283g;
            int i4 = (((i3 + 77) - (77 & i3)) << 1) - (i3 ^ 77);
            f24282f = i4 % 128;
            int i5 = i4 % 2;
            f fVar = bVar.f24287j;
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = (i3 ^ 85) + (((-1) - (((-1) - i3) | ((-1) - 85))) << 1);
            f24282f = i6 % 128;
            int i7 = i6 % 2;
            return fVar;
        }

        public final f a() {
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = f24280d * (-865627137);
            f24280d = i2;
            return (f) c(iFreeMemory, new Object[]{this}, -1983340530, (int) Runtime.getRuntime().freeMemory(), i2, 1983340531, Process.myUid());
        }

        public final a b() {
            int i2 = 2 % 2;
            int i3 = f24282f;
            int i4 = ((i3 + 115) - (115 | i3)) + (115 | i3);
            f24283g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            a aVar = this.f24284a;
            int i5 = i3 + 103;
            f24283g = i5 % 128;
            if (i5 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        public final d c() {
            int i2 = f24279c * (-819250473);
            f24279c = i2;
            return (d) c(i2, new Object[]{this}, -556348340, Process.myUid(), (int) Process.getElapsedCpuTime(), 556348340, (int) Thread.currentThread().getId());
        }

        public final g d() {
            int iNextInt = new Random().nextInt(710546813);
            int i2 = f24278b * (-1534841831);
            f24278b = i2;
            int i3 = f24281e * (-1576044770);
            f24281e = i3;
            return (g) c(iNextInt, new Object[]{this}, 139242858, (int) Process.getElapsedCpuTime(), i2, -139242856, i3);
        }

        public final o.eo.b<?>[] e() {
            int i2 = 2 % 2;
            int i3 = f24283g + 27;
            f24282f = i3 % 128;
            if (i3 % 2 == 0) {
                return new o.eo.b[]{this.f24284a, this.f24285h, this.f24286i, this.f24287j};
            }
            o.eo.b<?>[] bVarArr = new o.eo.b[4];
            bVarArr[0] = this.f24284a;
            bVarArr[1] = this.f24285h;
            bVarArr[3] = this.f24286i;
            bVarArr[4] = this.f24287j;
            return bVarArr;
        }

        public final void i() {
            int i2 = 2 % 2;
            int i3 = f24282f;
            int i4 = (i3 ^ 21) + (((i3 + 21) - (i3 | 21)) << 1);
            f24283g = i4 % 128;
            if (i4 % 2 == 0) {
                this.f24284a.e();
                this.f24285h.e();
                this.f24286i.e();
                this.f24287j.e();
                int i5 = 94 / 0;
            } else {
                this.f24284a.e();
                this.f24285h.e();
                this.f24286i.e();
                this.f24287j.e();
            }
            int i6 = f24282f;
            int i7 = (i6 ^ 55) + ((i6 & 55) << 1);
            f24283g = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static String $$c(int i2, short s2, byte b2) {
        byte[] bArr = $$a;
        int i3 = i2 * 4;
        int i4 = s2 + 4;
        int i5 = 104 - b2;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5 = i4 + i5;
            i4 = i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i5 = bArr[i8] + i5;
            i4 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24263h = -1998804438;
        f24262g = -584864919;
        f24256a = -1618877173;
        f24258c = 1240352909;
        f24259d = -2139563804;
        f24257b = 1372433924;
        f24260e = -155589720;
        f24275v = 0;
        f24276x = 1;
        f24273s = 0;
        f24274t = 1;
        e();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getTapTimeout();
        View.MeasureSpec.getMode(0);
        AudioTrack.getMaxVolume();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        Process.getThreadPriority(0);
        View.getDefaultSize(0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Drawable.resolveOpacity(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Color.alpha(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Color.alpha(0);
        SystemClock.uptimeMillis();
        View.resolveSizeAndState(0, 0, 0);
        Color.red(0);
        SystemClock.currentThreadTimeMillis();
        MotionEvent.axisFromString("");
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getMaximumDrawingCacheSize();
        Color.blue(0);
        AudioTrack.getMaxVolume();
        Process.getElapsedCpuTime();
        KeyEvent.getDeadChar(0, 0);
        SystemClock.uptimeMillis();
        Color.alpha(0);
        Process.myPid();
        ViewConfiguration.getEdgeSlop();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        u((short) (TextUtils.lastIndexOf("", '0') + 1), Gravity.getAbsoluteGravity(0, 0) - 1848588608, 1078770430 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-89) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (12 - Color.red(0)), objArr);
        map.put(a.class, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        u((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1848588603, Color.green(0) + 1078770429, (-79) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (114 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
        map.put(d.class, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        u((short) (ViewConfiguration.getEdgeSlop() >> 16), (-1848588589) - (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 1078770431, View.getDefaultSize(0, 0) - 78, (byte) ((-41) - KeyEvent.getDeadChar(0, 0)), objArr3);
        map.put(g.class, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        w("連ᮏﺌ䬅軓\uecda辠\u0a63谑\udd47䍂㱻", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr4);
        map.put(f.class, ((String) objArr4[0]).intern());
        f24261f = Collections.unmodifiableMap(map);
        int i2 = f24275v + 31;
        f24276x = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~((i8 + i4) - (i8 & i4));
        int i10 = ~i4;
        int i11 = ~i5;
        int i12 = (-1) - (((-1) - (~((i10 + i11) - (i10 & i11)))) & ((-1) - i9));
        int i13 = i4 | i5;
        int i14 = i4 + i5 + i7 + ((-39394691) * i3) + ((-2104995841) * i2);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1773844906) - 1404835566) + (i5 * 1773844906) + (i9 * (-613)) + (i12 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i13 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (1773845519 * i7) + (1055723859 * i3) + (1996616689 * i2) + (i15 * (-1450508288));
        int i17 = (i4 * (-1880913482)) + 198443008 + ((-1880913482) * i5) + ((-1126725195) * i9) + (i12 * 1126725195) + (1126725195 * i13) + ((-754188288) * i7) + ((-1529085952) * i3) + ((-319553536) * i2) + ((-289079296) * i15) + (i16 * i16 * (-778371072));
        if (i17 != 1) {
            if (i17 == 2) {
                return c(objArr);
            }
            c cVar = (c) objArr[0];
            String str = (String) objArr[1];
            int i18 = 2 % 2;
            i iVar = new i(null, (String) objArr[2], null, null, null, null, null, (i.c) objArr[3], null, null, null, null, null);
            b bVar = cVar.f24277i.get(str);
            if (bVar != null) {
                int i19 = f24273s + 29;
                f24274t = i19 % 128;
                int i20 = i19 % 2;
                bVar.b().d().add(iVar);
            }
            int i21 = f24273s + 121;
            f24274t = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        c cVar2 = (c) objArr[0];
        String str2 = (String) objArr[1];
        int i23 = 2 % 2;
        int i24 = f24273s + 125;
        f24274t = i24 % 128;
        int i25 = i24 % 2;
        b bVar2 = cVar2.f24277i.get(str2);
        if (bVar2 == null) {
            int i26 = f24273s + 21;
            f24274t = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i28 = b.f24280d * (-865627137);
        b.f24280d = i28;
        return Long.valueOf(((f) b.c(iFreeMemory, new Object[]{bVar2}, -1983340530, (int) Runtime.getRuntime().freeMemory(), i28, 1983340531, Process.myUid())).c());
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        o.ef.c cVar2 = new o.ef.c();
        try {
            for (Map.Entry<String, b> entry : cVar.f24277i.entrySet()) {
                String key = entry.getKey();
                o.ef.a aVar = new o.ef.a();
                Object[] objArr2 = new Object[1];
                u((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-1848588620) - (Process.myPid() >> 22), 1078770413 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 82, (byte) (TextUtils.getOffsetBefore("", 0) - 17), objArr2);
                aVar.a(((String) objArr2[0]).intern(), (Object) key);
                o.eo.b<?>[] bVarArrE = entry.getValue().e();
                int length = bVarArrE.length;
                int i3 = 0;
                while (i3 < 4) {
                    int i4 = f24273s + 91;
                    f24274t = i4 % 128;
                    int i5 = i4 % 2;
                    o.eo.b<?> bVar = bVarArrE[i3];
                    aVar.a(f24261f.get(bVar.getClass()), bVar.b());
                    i3++;
                    int i6 = f24273s + 103;
                    f24274t = i6 % 128;
                    int i7 = i6 % 2;
                }
                cVar2.a(aVar);
            }
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr3 = new Object[1];
            u((short) TextUtils.indexOf("", "", 0), (-1848588634) - TextUtils.indexOf("", "", 0, 0), 1078770413 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) - 80, (byte) ((-65) - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr3);
            aVar2.a(((String) objArr3[0]).intern(), cVar2);
            return aVar2;
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                u((short) KeyEvent.keyCodeFromString(""), (-1848588573) - ExpandableListView.getPackedPositionType(0L), 1078770381 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-73) - Color.green(0), (byte) ((-17) - TextUtils.getTrimmedLength("")), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                w("\uf131揔わ퀈\ue388\ue9f5廢\ueb69縶ὸ", TextUtils.lastIndexOf("", '0', 0, 0) + 10, objArr5);
                o.ea.f.e(strIntern, ((String) objArr5[0]).intern(), e2);
            }
            throw e2;
        }
    }

    static void e() {
        f24264j = 717042903;
        f24269o = 1150422482;
        f24267m = -81704710;
        f24268n = new byte[]{MessagePack.Code.MAP32, 33, 47, MessagePack.Code.INT32, MessagePack.Code.NIL, 35, 44, -27, 57, MessagePack.Code.MAP32, 57, 48, MessagePack.Code.UINT8, 55, 121, -121, MessagePack.Code.FIXARRAY_PREFIX, 115, 124, -75, 105, -113, 105, 96, -100, 103, -124, -120, 123, 125, 122, -1, 7, -3, -14, Ascii.FF, -8, -16, -17, 35, -7, -11, 6, 0, 7, 87, 89, -81, -94, 125, -80, -88, 75, 68, -115, 81, -74, 91, 88, 83, -87, 111, -100, 100, -111, 111, 118, -114, -113, 113, 127, -126, MessagePack.Code.FIXARRAY_PREFIX, 115, 124, -75, 105, -113, 105, 96, -100, 71, -1, 6, -11, 4, Ascii.VT, 2, -21, 51, 37, -78, -1, -4, 41, 42, -13, Ascii.CR, -69, -21, 17, -3, Ascii.VT, -8, -11, Ascii.VT, -5, 5, -115, -115, -115, -115, -115, -115, -115};
        f24265k = (char) 40294;
        f24272r = (char) 43682;
        f24270p = (char) 36632;
        f24271q = (char) 55800;
    }

    static void init$0() {
        $$a = new byte[]{101, -87, 81, 90};
        $$b = 111;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x022b A[PHI: r1
  0x022b: PHI (r1v52 int) = (r1v4 int), (r1v55 int) binds: [B:135:0x0241, B:131:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0244 A[PHI: r1
  0x0244: PHI (r1v5 int) = (r1v4 int), (r1v55 int) binds: [B:135:0x0241, B:131:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.c.u(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void w(String str, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (gVar.f19924d < cArr.length) {
            int i8 = $10 + 45;
            $11 = i8 % 128;
            int i9 = 58224;
            if (i8 % i4 == 0) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[0] = cArr[gVar.f19924d % 0];
                i3 = 1;
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                int i10 = $10 + 57;
                $11 = i10 % 128;
                int i11 = i10 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i12 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f24270p) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f24271q);
                    objArr2[i4] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(269 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1995022631, false, $$c(b2, b3, (byte) ((b3 + 35) - (35 | b3))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f24265k) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24272r)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -1995022631, false, $$c(b4, b5, (byte) (35 & b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    i4 = 2;
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
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                i4 = 2;
                objA3 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getTrimmedLength(""), 11 - KeyEvent.getDeadChar(0, 0), -2074123590, false, $$c(b6, b7, (byte) (32 & b7)), new Class[]{Object.class, Object.class});
            } else {
                i4 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final Long a(String str) {
        int i2 = 2 % 2;
        b bVar = this.f24277i.get(str);
        Object obj = null;
        if (bVar == null) {
            int i3 = f24273s + 67;
            f24274t = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = (-819250473) * b.f24279c;
        b.f24279c = i5;
        Long lValueOf = Long.valueOf(((d) b.c(i5, new Object[]{bVar}, -556348340, Process.myUid(), (int) Process.getElapsedCpuTime(), 556348340, (int) Thread.currentThread().getId())).c());
        int i6 = f24273s + 25;
        f24274t = i6 % 128;
        if (i6 % 2 != 0) {
            return lValueOf;
        }
        obj.hashCode();
        throw null;
    }

    public final void a() {
        int i2 = 2 % 2;
        Iterator<b> it = this.f24277i.values().iterator();
        int i3 = f24274t + 79;
        f24273s = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f24273s + 35;
            f24274t = i5 % 128;
            if (i5 % 2 == 0) {
                it.next().i();
                throw null;
            }
            it.next().i();
        }
        this.f24277i.clear();
    }

    public final void a(String str, String str2, i.c cVar) {
        int i2 = f24260e * (-824593982);
        f24260e = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = f24257b * (-720527739);
        f24257b = i3;
        a((int) SystemClock.elapsedRealtime(), new Object[]{this, str, str2, cVar}, i3, -1335420037, 1335420037, i2, iFreeMemory);
    }

    public final Long b(String str) {
        int i2 = 2 % 2;
        int i3 = f24273s + 53;
        f24274t = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24277i.get(str);
            throw null;
        }
        b bVar = this.f24277i.get(str);
        if (bVar != null) {
            return Long.valueOf(bVar.b().c());
        }
        int i4 = f24274t + 79;
        f24273s = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final o.ef.a b() throws o.ef.b {
        int i2 = f24256a * (-805690);
        f24256a = i2;
        int i3 = f24262g * (-1866330840);
        f24262g = i3;
        int i4 = 1365440401 * f24263h;
        f24263h = i4;
        return (o.ef.a) a(new Random().nextInt(742452500), new Object[]{this}, i4, -811278882, 811278884, i2, i3);
    }

    public final List<h> c(String str) {
        int i2 = 2 % 2;
        int i3 = f24273s + 107;
        f24274t = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24277i.get(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = this.f24277i.get(str);
        if (bVar == null) {
            List<h> listEmptyList = Collections.emptyList();
            int i4 = f24274t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f24273s = i4 % 128;
            int i5 = i4 % 2;
            return listEmptyList;
        }
        int iNextInt = new Random().nextInt(710546813);
        int i6 = b.f24278b * (-1534841831);
        b.f24278b = i6;
        int i7 = b.f24281e * (-1576044770);
        b.f24281e = i7;
        return ((g) b.c(iNextInt, new Object[]{bVar}, 139242858, (int) Process.getElapsedCpuTime(), i6, -139242856, i7)).d();
    }

    public final List<i> d(String str) {
        int i2 = 2 % 2;
        int i3 = f24274t + 21;
        f24273s = i3 % 128;
        int i4 = i3 % 2;
        b bVar = this.f24277i.get(str);
        if (bVar != null) {
            return bVar.b().d();
        }
        int i5 = f24274t + 25;
        f24273s = i5 % 128;
        int i6 = i5 % 2;
        return Collections.emptyList();
    }

    public final List<w> e(String str) {
        int i2 = 2 % 2;
        b bVar = this.f24277i.get(str);
        if (bVar != null) {
            Object[] objArr = {bVar};
            int i3 = b.f24279c * (-819250473);
            b.f24279c = i3;
            return ((d) b.c(i3, objArr, -556348340, Process.myUid(), (int) Process.getElapsedCpuTime(), 556348340, (int) Thread.currentThread().getId())).d();
        }
        int i4 = f24274t + 41;
        f24273s = i4 % 128;
        int i5 = i4 % 2;
        List<w> listEmptyList = Collections.emptyList();
        int i6 = f24273s + 111;
        f24274t = i6 % 128;
        int i7 = i6 % 2;
        return listEmptyList;
    }

    public final void e(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24273s + 85;
        f24274t = i3 % 128;
        int i4 = i3 % 2;
        this.f24277i.clear();
        long j2 = 0;
        int i5 = 1078770413;
        Object[] objArr = new Object[1];
        u((short) Color.argb(0, 0, 0, 0), (-1848588634) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1078770413, View.MeasureSpec.getSize(0) - 80, (byte) ((-64) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        if (!aVar.C(((String) objArr[0]).intern())) {
            return;
        }
        char c2 = '0';
        try {
            Object[] objArr2 = new Object[1];
            u((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-1848588633) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1078770413 - TextUtils.indexOf("", ""), (ViewConfiguration.getTouchSlop() >> 8) - 80, (byte) ((-65) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr2);
            Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i6 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i6;
            o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr3, iMyUid, i6, 1398121917, iUptimeMillis, iElapsedRealtime);
            int i7 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i8;
                int i9 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i9;
                if (i7 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    return;
                }
                o.ef.a aVarD = cVar.d(i7);
                Object[] objArr4 = new Object[1];
                u((short) ExpandableListView.getPackedPositionGroup(j2), (-1848588619) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + i5, (-83) - TextUtils.lastIndexOf("", c2), (byte) ((-17) - (ViewConfiguration.getScrollBarSize() >> 8)), objArr4);
                Object[] objArr5 = {aVarD, ((String) objArr4[0]).intern()};
                int i10 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i10;
                String str = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority());
                a aVar2 = new a();
                d dVar = new d();
                g gVar = new g();
                f fVar = new f();
                Object[] objArr6 = new Object[1];
                u((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) - 1848588608, KeyEvent.getDeadChar(0, 0) + 1078770429, (-89) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (13 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), objArr6);
                if (aVarD.C(((String) objArr6[0]).intern())) {
                    int i11 = f24273s + 103;
                    f24274t = i11 % 128;
                    int i12 = i11 % 2;
                    Object[] objArr7 = new Object[1];
                    u((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-1848588608) - Color.blue(0), ExpandableListView.getPackedPositionChild(0L) + 1078770430, ImageFormat.getBitsPerPixel(0) - 88, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR), objArr7);
                    aVar2.c(aVarD.x(((String) objArr7[0]).intern()));
                }
                Object[] objArr8 = new Object[1];
                u((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1848588603) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 1078770430, (-80) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (113 - TextUtils.getOffsetBefore("", 0)), objArr8);
                if (aVarD.C(((String) objArr8[0]).intern())) {
                    int i13 = f24274t + 79;
                    f24273s = i13 % 128;
                    int i14 = i13 % 2;
                    j2 = 0;
                    Object[] objArr9 = new Object[1];
                    u((short) Color.red(0), MotionEvent.axisFromString("") - 1848588602, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1078770430, (-79) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (113 - Drawable.resolveOpacity(0, 0)), objArr9);
                    dVar.c(aVarD.x(((String) objArr9[0]).intern()));
                } else {
                    j2 = 0;
                }
                Object[] objArr10 = new Object[1];
                u((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.red(0) - 1848588589, TextUtils.getCapsMode("", 0, 0) + 1078770431, Color.alpha(0) - 78, (byte) ((-41) - Color.argb(0, 0, 0, 0)), objArr10);
                if (aVarD.C(((String) objArr10[0]).intern())) {
                    int i15 = f24273s + 15;
                    f24274t = i15 % 128;
                    int i16 = i15 % 2;
                    Object[] objArr11 = new Object[1];
                    u((short) View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) - 1848588589, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1078770432, (-78) - KeyEvent.getDeadChar(0, 0), (byte) (View.MeasureSpec.getSize(0) - 41), objArr11);
                    gVar.c(aVarD.x(((String) objArr11[0]).intern()));
                }
                Object[] objArr12 = new Object[1];
                w("連ᮏﺌ䬅軓\uecda辠\u0a63谑\udd47䍂㱻", 12 - TextUtils.indexOf("", "", 0), objArr12);
                if (aVarD.C(((String) objArr12[0]).intern())) {
                    Object[] objArr13 = new Object[1];
                    w("連ᮏﺌ䬅軓\uecda辠\u0a63谑\udd47䍂㱻", 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
                    fVar.c(aVarD.x(((String) objArr13[0]).intern()));
                }
                this.f24277i.put(str, new b(aVar2, dVar, gVar, fVar));
                i7++;
                c2 = '0';
                i5 = 1078770413;
            }
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr14 = new Object[1];
                u((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-1848588573) - (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + 1078770381, View.MeasureSpec.getSize(0) - 73, (byte) ((-16) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr14);
                String strIntern = ((String) objArr14[0]).intern();
                Object[] objArr15 = new Object[1];
                u((short) Color.argb(0, 0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 1848588552, 1078770418 + (ViewConfiguration.getLongPressTimeout() >> 16), 65516 - AndroidCharacter.getMirror('0'), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 114), objArr15);
                o.ea.f.e(strIntern, ((String) objArr15[0]).intern(), e2);
            }
            Object[] objArr16 = new Object[1];
            w("㋙\ue33e㺯겡ᰯ\uf0a1索欃뚁抦賯蹒缽봆♱疖퓴臌놟닿㋙\ue33e彀駯ឞ⤢뙑ퟻ驓芶Ფꆖ䚒Ꚕﳣ뼻⼻∭", TextUtils.lastIndexOf("", '0') + 38, objArr16);
            throw new o.en.f(((String) objArr16[0]).intern());
        }
    }

    public final b f(String str) {
        int i2 = 2 % 2;
        int i3 = f24273s + 111;
        f24274t = i3 % 128;
        int i4 = i3 % 2;
        b bVar = this.f24277i.get(str);
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        return bVar;
    }

    public final Long g(String str) {
        int i2 = 2 % 2;
        int i3 = f24274t + 73;
        f24273s = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f24277i.get(str);
            throw null;
        }
        b bVar = this.f24277i.get(str);
        if (bVar == null) {
            int i4 = f24273s + 15;
            f24274t = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return null;
        }
        int iNextInt = new Random().nextInt(710546813);
        int i6 = b.f24278b * (-1534841831);
        b.f24278b = i6;
        int i7 = b.f24281e * (-1576044770);
        b.f24281e = i7;
        Long lValueOf = Long.valueOf(((g) b.c(iNextInt, new Object[]{bVar}, 139242858, (int) Process.getElapsedCpuTime(), i6, -139242856, i7)).c());
        int i8 = f24273s + 77;
        f24274t = i8 % 128;
        if (i8 % 2 != 0) {
            return lValueOf;
        }
        obj.hashCode();
        throw null;
    }

    public final Date h(String str) {
        int i2 = 2 % 2;
        int i3 = f24274t + 125;
        f24273s = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24277i.get(str);
            throw null;
        }
        b bVar = this.f24277i.get(str);
        if (bVar == null) {
            Date date = new Date();
            int i4 = f24273s + 93;
            f24274t = i4 % 128;
            int i5 = i4 % 2;
            return date;
        }
        Object[] objArr = {bVar};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i6 = b.f24280d * (-865627137);
        b.f24280d = i6;
        return ((f) b.c(iFreeMemory, objArr, -1983340530, (int) Runtime.getRuntime().freeMemory(), i6, 1983340531, Process.myUid())).f();
    }

    public final Long i(String str) {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f24259d * (-1919265164);
        f24259d = i2;
        int i3 = f24258c * (-869862370);
        f24258c = i3;
        return (Long) a((int) Runtime.getRuntime().freeMemory(), new Object[]{this, str}, i3, 523744759, -523744758, iElapsedRealtime, i2);
    }

    public final List<o.ex.b<?>> j(String str) {
        int i2 = 2 % 2;
        b bVar = this.f24277i.get(str);
        if (bVar == null) {
            int i3 = f24273s + 73;
            f24274t = i3 % 128;
            int i4 = i3 % 2;
            List<o.ex.b<?>> listEmptyList = Collections.emptyList();
            int i5 = f24273s + 29;
            f24274t = i5 % 128;
            if (i5 % 2 != 0) {
                return listEmptyList;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i6 = b.f24280d * (-865627137);
        b.f24280d = i6;
        Object[] objArr = {(f) b.c(iFreeMemory, new Object[]{bVar}, -1983340530, (int) Runtime.getRuntime().freeMemory(), i6, 1983340531, Process.myUid())};
        int i7 = f.f24372g * 1769805705;
        f.f24372g = i7;
        int i8 = (int) Runtime.getRuntime().totalMemory();
        int iNextInt = new Random().nextInt();
        int i9 = (-649624030) * f.f24375j;
        f.f24375j = i9;
        return (List) f.c(i8, i9, objArr, -54820160, iNextInt, 54820161, i7);
    }

    public final b o(String str) {
        int i2 = 2 % 2;
        int i3 = f24274t + 85;
        f24273s = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24277i.get(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = this.f24277i.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f24277i.put(str, bVar2);
        int i4 = f24273s + 91;
        f24274t = i4 % 128;
        int i5 = i4 % 2;
        return bVar2;
    }
}
