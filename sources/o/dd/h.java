package o.dd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import o.en.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22882a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22883b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22884c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22885d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f22886e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22887f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22888h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22889j = 0;

    /* JADX INFO: renamed from: o.dd.h$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f22890a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f22891c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f22892e;

        static {
            int[] iArr = new int[g.values().length];
            f22892e = iArr;
            try {
                iArr[g.f22858c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22892e[g.f22859d.ordinal()] = 2;
                int i2 = f22890a;
                int i3 = ((i2 + 19) - (19 | i2)) + ((i2 + 19) - (i2 & 19));
                f22891c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22892e[g.f22863h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22892e[g.f22865j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22892e[g.f22868m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22892e[g.f22869n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22892e[g.f22867l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22892e[g.f22866k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22892e[g.f22870o.ordinal()] = 9;
                int i6 = f22891c;
                int i7 = (i6 ^ 17) + (((-1) - (((-1) - i6) | ((-1) - 17))) << 1);
                f22890a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22892e[g.f22875t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22892e[g.f22871p.ordinal()] = 11;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22892e[g.f22872q.ordinal()] = 12;
                int i11 = f22891c + 89;
                f22890a = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22892e[g.f22874s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22892e[g.f22873r.ordinal()] = 14;
                int i14 = f22890a;
                int i15 = (((i14 + 85) - (85 & i14)) << 1) - (i14 ^ 85);
                f22891c = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 2 % 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22892e[g.f22876u.ordinal()] = 15;
                int i18 = 2 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22892e[g.f22880y.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22892e[g.f22877v.ordinal()] = 17;
                int i19 = 2 % 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22892e[g.f22878w.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22892e[g.f22860e.ordinal()] = 19;
                int i20 = f22890a;
                int i21 = (i20 & 89) + ((-1) - (((-1) - i20) & ((-1) - 89)));
                f22891c = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 2 % 2;
                }
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22892e[g.f22861f.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22892e[g.f22864i.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22892e[g.A.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22892e[g.C.ordinal()] = 23;
                int i23 = f22890a;
                int i24 = (((i23 + 125) - (125 & i23)) << 1) - (i23 ^ 125);
                f22891c = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 2 % 2;
                }
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22892e[g.f22881z.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22892e[g.f22857b.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22892e[g.f22856a.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22892e[g.f22862g.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22892e[g.f22879x.ordinal()] = 28;
                int i26 = f22891c;
                int i27 = (i26 ^ 75) + (((-1) - (((-1) - i26) | ((-1) - 75))) << 1);
                f22890a = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 2 % 2;
                }
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22892e[g.D.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            int r8 = r10 + 4
            byte[] r7 = o.dd.h.$$a
            int r0 = r11 * 4
            int r6 = r0 + 1
            int r0 = r9 * 6
            int r5 = r0 + 67
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r6
            r2 = r3
        L13:
            int r0 = -r0
            int r5 = r5 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r8 = r8 + 1
            r0 = r7[r8]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.h.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22889j = 0;
        f22887f = 1;
        f22882a = 0;
        f22888h = 1;
        e();
        TextUtils.indexOf("", "", 0);
        int i2 = f22887f + 75;
        f22889j = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long c(Context context, o.en.b bVar, g gVar) throws f {
        long time;
        int iC;
        int i2 = 2 % 2;
        Object obj = null;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            g(126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, null, "\u008f\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u008b\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            g(126 - Process.getGidForName(""), null, null, "\u0098\u009b\u0098\u0084\u008d\u0089\u009a\u0098\u0095\u0089\u0090\u0097\u0084\u008f\u0098\u0099\u0098\u0090\u008d\u0095\u0089\u0085\u0084\u008b\u0086\u0097\u0087\u0084\u0096\u0095\u0089\u0082\u0094\u008e\u0085\u0084\u0093\u0092\u0084\u0091\u0087\u0089\u0090\u0084\u008f", objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(gVar.toString()).toString());
        }
        switch (AnonymousClass3.f22892e[gVar.ordinal()]) {
            case 1:
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int priority = Thread.currentThread().getPriority();
                int i3 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i3;
                int iG = ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime, new Object[]{bVar}, iUptimeMillis, 568976490, priority, i3)).b().g();
                if (iG == -1) {
                    return 1L;
                }
                iC = Math.max(1, iG / 1000);
                return iC;
            case 2:
            case 3:
                return 1L;
            case 4:
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int priority2 = Thread.currentThread().getPriority();
                int i4 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i4;
                iC = ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime2, new Object[]{bVar}, iUptimeMillis2, 568976490, priority2, i4)).b().c() / 1000;
                return iC;
            case 5:
                return 1L;
            case 6:
                try {
                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    int priority3 = Thread.currentThread().getPriority();
                    int i5 = o.en.b.f24088c * (-1721916949);
                    o.en.b.f24088c = i5;
                    int iD = ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime3, new Object[]{bVar}, iUptimeMillis3, 568976490, priority3, i5)).b().d();
                    Date dateD = bVar.e().f().d();
                    if (dateD != null && dateD.after(new Date())) {
                        long time2 = (dateD.getTime() - new Date().getTime()) / 1000;
                        return iD != -1 ? Math.min(iD, time2) : time2;
                    }
                    if (iD != -1) {
                        return iD;
                    }
                } catch (f e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        g((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u008f\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u008b\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        g(MotionEvent.axisFromString("") + 128, null, null, "\u0098\u009b\u0098\u0095\u0089\u0082\u0094\u009f\u0084\u0085\u0093\u0092\u0095\u0089\u0082\u0094\u0097\u008f\u008e¡\u0082\u0083\u0095\u0089\u009c\u0094\u0084\u0087\u0087\u0097 \u0098\u0099\u0098\u0084\u0094\u0097\u008d\u009f\u009e\u009d\u0085\u0084\u008c\u009c\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u0090", objArr4);
                        o.ea.f.c(strIntern2, sb2.append(((String) objArr4[0]).intern()).append(e2.getMessage()).toString());
                    }
                    return -1L;
                }
            case 7:
                return 1L;
            case 8:
                return 120L;
            case 9:
            case 10:
            case 11:
                return 1L;
            case 12:
            case 13:
                return 30L;
            case 16:
                int i6 = f22888h + 75;
                f22882a = i6 % 128;
                int i7 = i6 % 2;
            case 14:
            case 15:
                return 1L;
            case 17:
            case 18:
            case 19:
                return 1L;
            case 20:
            case 21:
                return 120L;
            case 22:
            case 23:
            case 24:
                return 1L;
            case 25:
            case 26:
            case 27:
            case 28:
                int i8 = o.c.a.f21922i * 1809095941;
                o.c.a.f21922i = i8;
                int i9 = o.c.a.f21923j * (-208500124);
                o.c.a.f21923j = i9;
                o.c.a.e(new Object[]{bVar, context}, 367855230, (int) Runtime.getRuntime().freeMemory(), i8, i9, -367855229, (int) SystemClock.uptimeMillis());
                int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
                int priority4 = Thread.currentThread().getPriority();
                int i10 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i10;
                Object[] objArr5 = {(o.fm.g) o.en.b.a(-568976488, elapsedCpuTime4, new Object[]{bVar}, iUptimeMillis4, 568976490, priority4, i10)};
                int i11 = o.fm.g.f26061f * 390633709;
                o.fm.g.f26061f = i11;
                Long l2 = (Long) o.fm.g.b((int) Thread.currentThread().getId(), new Random().nextInt(983859859), Thread.activeCount(), i11, 540695712, -540695709, objArr5);
                int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
                int iUptimeMillis5 = (int) SystemClock.uptimeMillis();
                int priority5 = Thread.currentThread().getPriority();
                int i12 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i12;
                int iD2 = ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime5, new Object[]{bVar}, iUptimeMillis5, 568976490, priority5, i12)).b().d();
                Date dateD2 = bVar.e().f().d();
                if (dateD2 != null && dateD2.after(new Date())) {
                    time = (dateD2.getTime() - new Date().getTime()) / 1000;
                    if (iD2 != -1) {
                        time = Math.min(iD2, time);
                    }
                } else if (iD2 != -1) {
                    int i13 = f22888h + 73;
                    f22882a = i13 % 128;
                    if (i13 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    time = iD2;
                } else {
                    time = -1;
                }
                if (o.ea.f.a()) {
                    Object[] objArr6 = new Object[1];
                    g(128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), null, null, "\u008f\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u008b\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Locale localeD = o.ea.g.d();
                    Object[] objArr7 = new Object[1];
                    g((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u008d¢\u0098\u009b\u0098\u0086\u0097\u0087\u0084\u008d\u0098\u0095\u0089\u0082\u0094\u008e\u0085\u0084\u0093\u0084\u0098\u009f\u009a\u0084\u0094\u0098\u0099\u0098\u0090¢\u0098\u009b\u0098\u0084\u0094\u0097\u008d\u0098\u0084\u0094\u0097\u008d\u009f\u008e\u0098\u0094\u0090\u0097\u0087\u0098\u0099\u0098\u0094\u008f\u0097\u0094\u0090\u0084\u008f\u0098\u008f\u0084\u0094\u0083\u0097\u0098\u0084\u0094\u0097\u008d\u009f\u008e\u0098\u009d\u0085\u0084\u008c\u0085\u0098\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u0090", objArr7);
                    o.ea.f.c(strIntern3, String.format(localeD, ((String) objArr7[0]).intern(), new Date(l2.longValue() * 1000), Long.valueOf(time)));
                }
                long jMax = time != -1 ? Math.max(1, ((int) (new Date((l2.longValue() + time) * 1000).getTime() - new Date().getTime())) / 1000) : -1L;
                if (o.ea.f.a()) {
                    int i14 = f22888h + 19;
                    f22882a = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr8 = new Object[1];
                    g((-16777089) - Color.rgb(0, 0, 0), null, null, "\u008f\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u008b\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081", objArr8);
                    String strIntern4 = ((String) objArr8[0]).intern();
                    Locale localeD2 = o.ea.g.d();
                    Object[] objArr9 = new Object[1];
                    g(127 - TextUtils.getTrimmedLength(""), null, null, "\u008d¢\u0098\u009b\u0098\u0086\u0097\u0087\u0084\u0096\u0095\u0089\u0082\u0094\u008e\u0085\u0084\u0093\u0084\u0098\u0099\u0098\u0094\u008f\u0097\u0094\u0090\u0084\u008f\u0098\u009a\u0084\u0094\u0090\u0086\u0090\u0098\u008f\u0084\u0094\u0083\u0097\u0098\u0084\u0094\u0097\u008d\u009f\u008e\u0098\u009d\u0085\u0084\u008c\u0085\u0098\u0084\u0087\u008e\u008d\u0084\u008c\u0085\u0090", objArr9);
                    o.ea.f.c(strIntern4, String.format(localeD2, ((String) objArr9[0]).intern(), Long.valueOf(jMax)));
                }
                return jMax;
            case 29:
                return 1L;
            default:
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                g(126 - MotionEvent.axisFromString(""), null, null, "\u0098\u009b\u0098\u008d\u0084\u0094\u008f\u0089\u009f\u009f\u008e\u0090\u0098\u0094\u0089\u0095\u0098\u008f\u0084¡¡\u0082\u008f£", objArr10);
                throw new f(sb3.append(((String) objArr10[0]).intern()).append(gVar).toString());
        }
    }

    static void e() {
        f22885d = new char[]{2129, 2098, 2103, 2102, 2120, 2082, 2097, 2131, 2108, 2123, 2136, 2101, 2121, 2086, 2107, 2104, 2087, 2134, 2085, 2105, 2111, 2153, 2122, 2445, 2174, 2110, 2147, 2152, 2096, 2118, 2109, 2116, 2100, 2166, 2137};
        f22884c = 2040400301;
        f22886e = true;
        f22883b = true;
    }

    private static void g(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i4 = 2;
        int i5 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i6 = $11 + 49;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
                bytes = str4.getBytes("ISO-8859-1");
            } else {
                bytes = str4.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f22885d;
        long j2 = 0;
        if (cArr3 != null) {
            int i10 = $10 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 107;
                $10 = i13 % 128;
                int i14 = i13 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i12])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 594, (char) (13181 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionGroup(j2) + 11, -1225586509, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i12++;
                    int i15 = $11 + 69;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 2;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f22884c)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) Color.blue(0), 11 - ((Process.getThreadPriority(0) + 20) >> 6), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f22883b) {
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objA3 = o.d.d.a(Color.red(0) + 458, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!f22886e) {
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i17 = $11 + 69;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                int i19 = $10 + 79;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr6[fVar.f19922a] = (char) (cArr3[iArr[fVar.f19923e << fVar.f19922a] % i2] * iIntValue);
                    i3 = fVar.f19922a;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i3 = fVar.f19922a + 1;
                }
                fVar.f19922a = i3;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i20 = $11 + 45;
        $10 = i20 % 128;
        if (i20 % 2 != 0) {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 1;
        } else {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 0;
        }
        while (fVar.f19922a < fVar.f19923e) {
            cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 1;
                byte b7 = (byte) (-b6);
                objA4 = o.d.d.a(458 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i21 = $11 + 37;
            $10 = i21 % 128;
            int i22 = i21 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$b = 238;
    }
}
