package o.fi;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import o.a.g;
import o.ea.f;
import o.ff.b;
import o.fg.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f25868d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f25869e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f25870f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25871g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f25872h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f25873i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f25874j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25875k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f25876m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25877n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timestamp f25878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timestamp f25879c;

    /* JADX INFO: renamed from: o.fi.a$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f25880a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25881b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f25882d = 1;

        static {
            int[] iArr = new int[b.values().length];
            f25881b = iArr;
            try {
                iArr[b.f25845c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25881b[b.f25844b.ordinal()] = 2;
                int i2 = f25882d;
                int i3 = (((i2 + 1) - (1 & i2)) << 1) - (i2 ^ 1);
                f25880a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25881b[b.f25847e.ordinal()] = 3;
                int i6 = f25882d;
                int i7 = (i6 ^ 69) + (((i6 + 69) - (i6 | 69)) << 1);
                f25880a = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 5;
                } else {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25881b[b.f25846d.ordinal()] = 4;
                int i10 = f25882d;
                int i11 = ((-1) - (((-1) - i10) | ((-1) - 107))) + ((-1) - (((-1) - i10) & ((-1) - 107)));
                f25880a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25881b[b.f25843a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
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
    private static java.lang.String $$f(byte r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r7 = r9 + 69
            int r1 = r10 * 4
            int r0 = 1 - r1
            byte[] r6 = o.fi.a.$$d
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2a
            r2 = r8
            r1 = r3
            r0 = r4
        L16:
            int r8 = r8 + r1
            int r2 = r2 + 1
            r1 = r0
        L1a:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r0 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r6[r2]
            goto L16
        L2a:
            r1 = r4
            r2 = r8
            r8 = r7
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fi.a.$$f(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25875k = 0;
        f25877n = 1;
        f25871g = 0;
        f25876m = 1;
        n();
        ViewConfiguration.getGlobalActionKeyTimeout();
        TextUtils.indexOf("", "");
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Color.rgb(0, 0, 0);
        Color.blue(0);
        ViewConfiguration.getWindowTouchSlop();
        Process.getElapsedCpuTime();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getScrollFriction();
        int i2 = f25877n + 37;
        f25875k = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(boolean z2, b bVar, short s2) {
        super(z2, bVar, s2);
    }

    static void init$0() {
        $$d = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
        $$e = 159;
    }

    static void n() {
        f25868d = (char) 60611;
        f25869e = (char) 58639;
        f25874j = (char) 15327;
        f25872h = (char) 36915;
        f25870f = new char[]{64634, 64631, 64588, 64618, 64576, 64597, 64614, 64617, 64580, 64592, 64584, 64611, 64608, 64619, 64628, 64632, 64624, 64598, 64609, 64625, 64593, 64612, 64633, 64630, 64629};
        f25873i = (char) 51642;
    }

    private static void o(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 87;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 93;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) f25874j) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f25872h)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - Color.alpha(0), (char) View.MeasureSpec.getMode(0), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1995022631, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f25868d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f25869e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "", 0) + 270, (char) ((-1) - MotionEvent.axisFromString("")), 11 - Color.argb(0, 0, 0, 0), -1995022631, false, $$f(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i9 = $10 + 109;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
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
                byte b7 = (byte) (b6 + 3);
                objA3 = o.d.d.a(TextUtils.getTrimmedLength("") + 270, (char) View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 12, -2074123590, false, $$f(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fi.a.p(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public final o.ef.a d(Date date) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f25876m + 117;
        f25871g = i3 % 128;
        Timestamp timestamp = null;
        if (i3 % 2 != 0) {
            super.j();
            int i4 = AnonymousClass2.f25881b[b().ordinal()];
            timestamp.hashCode();
            throw null;
        }
        o.ef.a aVarJ = super.j();
        int i5 = AnonymousClass2.f25881b[b().ordinal()];
        if (i5 == 1) {
            timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
            Object[] objArr = new Object[1];
            o("僀\uf788ط\uf12e\uf125걶곧㣴둸\udd20\ue798\ue1a1삷늹", 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else if (i5 == 2) {
            if (date != null) {
                int i6 = f25876m + 29;
                f25871g = i6 % 128;
                int i7 = i6 % 2;
                if (date.before(this.f25878b)) {
                    timestamp = new Timestamp(date.getTime());
                    int i8 = f25871g + 19;
                    f25876m = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    timestamp = this.f25878b;
                }
            } else {
                timestamp = this.f25878b;
            }
            Object[] objArr2 = new Object[1];
            o("僀\uf788ط\uf12e\uf125걶݃税솃찖싡亨\uda18\uea94\uf125걶", TextUtils.indexOf("", "", 0) + 16, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
            timestamp = this.f25879c;
            Object[] objArr3 = new Object[1];
            p((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20, "\u0012\u0015\r\u0011\u0001\n\u0004\u0002\u0001\u0005\b\u0012\u0010\u0018\t\u0010\f\u0011㗏㗏", (byte) (6 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr3);
            strIntern = ((String) objArr3[0]).intern();
        } else {
            strIntern = "";
        }
        Object[] objArr4 = new Object[1];
        o("ꏯ녓䧫\ud988", 3 - TextUtils.indexOf("", "", 0, 0), objArr4);
        TimeZone timeZone = TimeZone.getTimeZone(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        o("顥\uf029顥\uf029쉦\udb42騵倏濙尀\ue3f3슡肅숃缦藸ﾢ鴌\ued70䇔沏⚉㖊\uf6bf", TextUtils.getCapsMode("", 0, 0) + 24, objArr5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        if (timestamp == null) {
            timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                o("겯牻湼襫婅碚㽚껹单㺜\ud94d\u1bfb\ue8cd䶼㺡搰檧\ue5d3︫\uf73cⰏ濨\udfba彰", 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                o("⿻ꤖ\uf526訞쮆쐈ꙿ焎湼襫렸\uf6a6鍐㭻诮\ue7a1鿆\uf113煾ଜ\u0ff9봖퇬뫺", (Process.myTid() >> 22) + 23, objArr7);
                f.c(strIntern2, ((String) objArr7[0]).intern());
            }
        }
        Object[] objArr8 = new Object[1];
        p((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, "\u0016\u0000\u000e\u0000\u000f\u0016\u0005\r㙃", (byte) (89 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr8);
        aVarJ.a(((String) objArr8[0]).intern(), (Object) simpleDateFormat.format((Date) timestamp));
        Object[] objArr9 = new Object[1];
        p(6 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u000f\u0016\u0005\u0017\u0007\u0013", (byte) (MotionEvent.axisFromString("") + 5), objArr9);
        aVarJ.a(((String) objArr9[0]).intern(), (Object) strIntern);
        return aVarJ;
    }

    @Override // o.ff.e, o.ff.a
    public final void d() {
        int i2 = 2 % 2;
        super.d();
        this.f25879c = new Timestamp(Calendar.getInstance().getTimeInMillis());
        int i3 = f25871g + 13;
        f25876m = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void d(Timestamp timestamp) {
        int i2 = 2 % 2;
        int i3 = f25871g + 117;
        int i4 = i3 % 128;
        f25876m = i4;
        int i5 = i3 % 2;
        this.f25878b = timestamp;
        int i6 = i4 + 79;
        f25871g = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.ff.e, o.ff.a
    public final boolean d(String str, o.dk.a aVar) {
        int i2 = 2 % 2;
        int i3 = f25876m + 31;
        f25871g = i3 % 128;
        if (i3 % 2 != 0) {
            super.d(str, aVar);
            throw null;
        }
        if (!super.d(str, aVar)) {
            int i4 = f25876m + 49;
            f25871g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        this.f25878b = new Timestamp(Calendar.getInstance().getTimeInMillis());
        int i6 = f25876m + 37;
        f25871g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
        return true;
    }

    public final void e(Timestamp timestamp) {
        int i2 = 2 % 2;
        int i3 = f25876m + 9;
        f25871g = i3 % 128;
        if (i3 % 2 == 0) {
            this.f25879c = timestamp;
        } else {
            this.f25879c = timestamp;
            throw null;
        }
    }

    public final Timestamp k() {
        int i2 = 2 % 2;
        int i3 = f25876m;
        int i4 = i3 + 1;
        f25871g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Timestamp timestamp = this.f25879c;
        int i5 = i3 + 117;
        f25871g = i5 % 128;
        int i6 = i5 % 2;
        return timestamp;
    }

    public final Timestamp m() {
        int i2 = 2 % 2;
        int i3 = f25876m;
        int i4 = i3 + 73;
        f25871g = i4 % 128;
        int i5 = i4 % 2;
        Timestamp timestamp = this.f25878b;
        int i6 = i3 + 93;
        f25871g = i6 % 128;
        int i7 = i6 % 2;
        return timestamp;
    }
}
