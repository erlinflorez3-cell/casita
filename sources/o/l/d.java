package o.l;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationFailureReason;
import java.lang.reflect.Method;
import o.a.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements o.ea.d<CustomerAuthenticationFailureReason> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f26353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f26354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f26355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f26356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f26357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26358g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f26359h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f26360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f26361j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26362l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26363m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26364o = 0;

    /* JADX INFO: renamed from: o.l.d$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26365a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f26366d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f26367e = 0;

        static {
            int[] iArr = new int[d.values().length];
            f26365a = iArr;
            try {
                iArr[d.f26355d.ordinal()] = 1;
                int i2 = f26366d + 91;
                f26367e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26365a[d.f26353b.ordinal()] = 2;
                int i5 = f26366d;
                int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
                f26367e = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26365a[d.f26352a.ordinal()] = 3;
                int i8 = f26366d;
                int i9 = (i8 & 63) + (i8 | 63);
                f26367e = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26365a[d.f26356e.ordinal()] = 4;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26365a[d.f26360i.ordinal()] = 5;
                int i12 = f26367e + 41;
                f26366d = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26365a[d.f26354c.ordinal()] = 6;
                int i15 = f26366d;
                int i16 = ((i15 + 5) - (5 | i15)) + ((-1) - (((-1) - 5) & ((-1) - i15)));
                f26367e = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            byte[] r8 = o.l.d.$$a
            int r0 = r10 * 2
            int r7 = r0 + 4
            int r0 = r9 * 3
            int r6 = r0 + 1
            int r0 = r11 + 99
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L29
            r3 = r6
            r2 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r3
            int r7 = r7 + 1
        L17:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r1 = r8[r7]
            r3 = r0
            r0 = r1
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.d.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26362l = 0;
        f26364o = 1;
        f26358g = 0;
        f26363m = 1;
        d();
        Object[] objArr = new Object[1];
        k((char) ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) + 9, objArr);
        f26353b = new d(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        k((char) (((Process.getThreadPriority(0) + 20) >> 6) + 32722), 9 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, objArr2);
        f26355d = new d(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        k((char) (ViewConfiguration.getScrollBarSize() >> 8), 15 - TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") + 7, objArr3);
        f26352a = new d(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        k((char) (31604 - TextUtils.indexOf("", "", 0)), ExpandableListView.getPackedPositionType(0L) + 22, 14 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        f26354c = new d(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        k((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33145), 37 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr5);
        f26356e = new d(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        k((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
        f26360i = new d(((String) objArr6[0]).intern(), 5);
        f26357f = b();
        int i2 = f26364o + 7;
        f26362l = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, int i2) {
    }

    private static /* synthetic */ d[] b() {
        d[] dVarArr;
        int i2 = 2 % 2;
        int i3 = f26358g;
        int i4 = i3 + 99;
        f26363m = i4 % 128;
        if (i4 % 2 == 0) {
            dVarArr = new d[4];
            dVarArr[1] = f26353b;
            dVarArr[0] = f26355d;
            dVarArr[4] = f26352a;
            dVarArr[4] = f26354c;
            dVarArr[4] = f26356e;
            dVarArr[2] = f26360i;
        } else {
            dVarArr = new d[]{f26353b, f26355d, f26352a, f26354c, f26356e, f26360i};
        }
        int i5 = i3 + 3;
        f26363m = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void d() {
        f26361j = new char[]{38065, 54209, 6712, 16743, 35295, 61444, 16242, 26537, 44550, 60268, 44061, 26087, 16061, 62989, 36830, 38054, 54217, 6715, 16737, 35285, 61469, 16234, 61390, 43189, 24912, 14868, 62137, 35709, 17432, 7389, 54608, 28165, 9947, 65388, 47147, 28894, 2463, 5599, 21174, 39773, 49161, 2226, 29024, 48649, 59078, 12142, 37901, 56538, 38075, 54222, 6690, 16737, 35272, 61446, 16255, 26528, 44583, 5474, 23988, 33819, 50008};
        f26359h = 8287079851436004256L;
    }

    static void init$0() {
        $$a = new byte[]{40, 101, 74, -30};
        $$b = 55;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26361j[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 741, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 12 - View.MeasureSpec.getSize(0), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f26359h), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(766 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 12470), (ViewConfiguration.getScrollBarSize() >> 8) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((-16776829) - Color.rgb(0, 0, 0), (char) KeyEvent.keyCodeFromString(""), 17 - TextUtils.indexOf((CharSequence) "", '0'), 39570797, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 1;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(387 - (Process.myPid() >> 22), (char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0) + 18, 39570797, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 388, (char) (Process.myPid() >> 22), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39570797, false, $$c(b10, b11, (byte) ((-1) - (((-1) - b11) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str = new String(cArr);
        int i9 = $10 + 83;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26358g + 99;
        f26363m = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        if (i4 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f26363m + 43;
        f26358g = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = (d[]) f26357f.clone();
        int i5 = f26363m + 125;
        f26358g = i5 % 128;
        if (i5 % 2 == 0) {
            return dVarArr;
        }
        throw null;
    }

    public final CustomerAuthenticationFailureReason c() {
        int i2 = 2 % 2;
        int i3 = f26358g + 9;
        f26363m = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass2.f26365a[ordinal()];
        Object obj = null;
        if (i5 == 1) {
            CustomerAuthenticationFailureReason customerAuthenticationFailureReason = CustomerAuthenticationFailureReason.Locked;
            int i6 = f26363m + 77;
            f26358g = i6 % 128;
            if (i6 % 2 == 0) {
                return customerAuthenticationFailureReason;
            }
            throw null;
        }
        if (i5 == 2) {
            return CustomerAuthenticationFailureReason.Cancelled;
        }
        if (i5 == 3) {
            return CustomerAuthenticationFailureReason.Timeout;
        }
        if (i5 != 4) {
            return CustomerAuthenticationFailureReason.InternalError;
        }
        CustomerAuthenticationFailureReason customerAuthenticationFailureReason2 = CustomerAuthenticationFailureReason.Unsupported;
        int i7 = f26363m + 57;
        f26358g = i7 % 128;
        if (i7 % 2 == 0) {
            return customerAuthenticationFailureReason2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() {
        int i2 = 2 % 2;
        int i3 = f26363m + 45;
        f26358g = i3 % 128;
        int i4 = i3 % 2;
        CustomerAuthenticationFailureReason customerAuthenticationFailureReasonC = c();
        int i5 = f26363m + 21;
        f26358g = i5 % 128;
        int i6 = i5 % 2;
        return customerAuthenticationFailureReasonC;
    }
}
