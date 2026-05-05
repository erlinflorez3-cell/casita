package o.eq;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.card.emvapplication.EmvApplicationStatus;
import java.lang.reflect.Method;
import kotlin.text.Typography;
import o.a.n;
import o.a.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements o.ea.d<EmvApplicationStatus> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f24730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f24731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f24732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f24733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f24734e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24735g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f24736h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ d[] f24737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f24738k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f24739l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f24740m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f24741n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f24742o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f24743p = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24744f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f24745i;

    /* JADX INFO: renamed from: o.eq.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f24747b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f24748c = 0;

        static {
            int[] iArr = new int[d.values().length];
            f24746a = iArr;
            try {
                iArr[d.f24730a.ordinal()] = 1;
                int i2 = f24747b + 21;
                f24748c = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 2;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24746a[d.f24734e.ordinal()] = 2;
                int i5 = f24747b + 115;
                f24748c = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24746a[d.f24731b.ordinal()] = 3;
                int i8 = f24747b + 107;
                f24748c = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24746a[d.f24733d.ordinal()] = 4;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24746a[d.f24736h.ordinal()] = 5;
                int i12 = f24747b + 9;
                f24748c = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24746a[d.f24732c.ordinal()] = 6;
                int i15 = f24747b + 69;
                f24748c = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 38 / 0;
                }
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static String $$c(byte b2, byte b3, byte b4) {
        int i2 = b4 + 99;
        int i3 = (b2 * 2) + 4;
        byte[] bArr = $$a;
        int i4 = b3 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2);
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            i2 += -bArr[i3];
            i3 = i6 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24742o = 0;
        f24743p = 1;
        f24739l = 0;
        f24738k = 1;
        a();
        Object[] objArr = new Object[1];
        r((char) Color.green(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, 6 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        r((char) ((KeyEvent.getMaxKeyCode() >> 16) + 1246), 64 - ExpandableListView.getPackedPositionChild(0L), MotionEvent.axisFromString("") + 7, objArr2);
        f24730a = new d(strIntern, 0, ((String) objArr2[0]).intern(), 0);
        Object[] objArr3 = new Object[1];
        q(((Process.getThreadPriority(0) + 20) >> 6) + 6, "￩\u0001\u0002\b\u0000\f", true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 252, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        q((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, "\u0007\ufffb\u0003�￼\u0004", false, Color.green(0) + JfifUtil.MARKER_APP1, 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        f24734e = new d(strIntern2, 1, ((String) objArr4[0]).intern(), 4);
        Object[] objArr5 = new Object[1];
        q(18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\r\u0001\n�￼\uffd9\ufffb\f\u0001\u000e\ufff9\f\u0001\u0007\u0006￪�\t", false, TextUtils.lastIndexOf("", '0', 0) + 258, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        r((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 71, TextUtils.indexOf((CharSequence) "", '0', 0) + 17, objArr6);
        f24731b = new d(strIntern3, 2, ((String) objArr6[0]).intern(), 1);
        Object[] objArr7 = new Object[1];
        r((char) (19488 - TextUtils.indexOf("", "", 0, 0)), 87 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9 - ImageFormat.getBitsPerPixel(0), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        r((char) (23316 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 97, 6 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
        f24733d = new d(strIntern4, 3, ((String) objArr8[0]).intern(), 2);
        Object[] objArr9 = new Object[1];
        r((char) (19871 - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 101, View.MeasureSpec.getSize(0) + 7, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        r((char) (Process.myTid() >> 22), 109 - Color.alpha(0), 6 - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
        f24732c = new d(strIntern5, 4, ((String) objArr10[0]).intern(), 5);
        Object[] objArr11 = new Object[1];
        r((char) View.combineMeasuredStates(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 115, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        r((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 134 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr12);
        f24736h = new d(strIntern6, 5, ((String) objArr12[0]).intern(), 3);
        f24737j = b();
        int i2 = f24743p + 45;
        f24742o = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private d(String str, int i2, String str2, int i3) {
        this.f24744f = str2;
        this.f24745i = i3;
    }

    static void a() {
        f24735g = -1270219390;
        f24741n = new char[]{38055, 63272, 21499, 49036, 6734, 26131, 49898, 11626, 35133, 5510, 29085, 56363, 14582, 34038, 59225, 17162, 45011, 2674, 38447, 62173, 24258, 47449, 1516, 25086, 52339, 10248, 46234, 5994, 29479, 57338, 15247, 34378, 57879, 20130, 43322, 13611, 37327, 64896, 22539, 42222, Typography.cent, 24223, 15632, 39367, 30126, 53354, 44075, 2193, 59218, 17167, 57338, 48098, 5664, 62171, 20098, 11623, 35107, 26032, 49182, 38067, 63269, 21486, 49031, 6740, 26131, 36973, 62427, 22288, 47993, 7850, 25325, 38049, 63250, 21471, 49086, 6781, 26147, 49818, 11585, 35072, 5603, 29099, 56347, 14539, 33924, 59247, 17210, 55443, 47877, 8142, 62375, 22132, 10807, 36510, 24919, 50460, 23009, 53171, 44048, 2248, 58553, 16744, 55574, 47747, 7766, 61995, 22518, 11187, 36622, 38070, 63235, 21462, 49067, 6774, 26163, 49806, 38067, 63269, 21486, 49031, 6740, 26135, 49854, 11639, 35133, 5576, 29096, 56363, 14564, 33955, 59225, 17179, 45014, 38067, 63237, 21454, 49063, 6772, 26167, 49822, 11607, 35101, 5608, 29093, 56348, 14535, 33936, 59263, 17197, 45047, 2626};
        f24740m = 1803848039584036678L;
    }

    private static /* synthetic */ d[] b() {
        d[] dVarArr;
        int i2 = 2 % 2;
        int i3 = f24738k + 11;
        int i4 = i3 % 128;
        f24739l = i4;
        if (i3 % 2 != 0) {
            dVarArr = new d[PanasonicMakernoteDirectory.TAG_BURST_SPEED];
            dVarArr[0] = f24730a;
            dVarArr[0] = f24734e;
            dVarArr[2] = f24731b;
            dVarArr[3] = f24733d;
            dVarArr[5] = f24732c;
            dVarArr[3] = f24736h;
        } else {
            dVarArr = new d[]{f24730a, f24734e, f24731b, f24733d, f24732c, f24736h};
        }
        int i5 = i4 + 97;
        f24738k = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return dVarArr;
    }

    public static d c(d dVar, d dVar2) {
        int i2 = 2 % 2;
        int i3 = f24738k;
        int i4 = i3 + 113;
        int i5 = i4 % 128;
        f24739l = i5;
        int i6 = i4 % 2;
        if (dVar == null) {
            return dVar2;
        }
        Object obj = null;
        if (dVar2 == null) {
            int i7 = i5 + 25;
            f24738k = i7 % 128;
            if (i7 % 2 != 0) {
                return dVar;
            }
            throw null;
        }
        if (dVar.f24745i < dVar2.f24745i) {
            return dVar2;
        }
        int i8 = i3 + 19;
        f24739l = i8 % 128;
        if (i8 % 2 == 0) {
            return dVar;
        }
        obj.hashCode();
        throw null;
    }

    public static d d(String str) throws Throwable {
        d[] dVarArrValues;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = f24738k + 13;
        f24739l = i4 % 128;
        if (i4 % 2 != 0) {
            dVarArrValues = values();
            length = dVarArrValues.length;
            i2 = 1;
        } else {
            dVarArrValues = values();
            length = dVarArrValues.length;
            i2 = 0;
        }
        int i5 = f24738k + 33;
        f24739l = i5 % 128;
        int i6 = i5 % 2;
        while (i2 < length) {
            d dVar = dVarArrValues[i2];
            if (str.equals(dVar.f24744f)) {
                int i7 = f24738k + 39;
                f24739l = i7 % 128;
                int i8 = i7 % 2;
                return dVar;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        q((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, "\uffc1\u0017\u000e￦\uffc1ￛ\uffc1\u000f\u0018\u0010\u000f\f\u000f\u0016\uffc1\u0014\u0016\u0015\u0002\u0015\u0014\uffc1\u000f\u0010\n\u0015\u0002\u0004\n\r\u0011\u0011\u0002", true, (ViewConfiguration.getEdgeSlop() >> 16) + 248, 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void init$0() {
        $$a = new byte[]{80, 70, 7, 82};
        $$b = 229;
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            char[] charArray = str2.toCharArray();
            int i7 = $11 + 37;
            $10 = i7 % 128;
            obj = charArray;
            if (i7 % 2 != 0) {
                int i8 = 5 / 3;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f24735g)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.argb(0, 0, 0, 0) + 11, -2071844881, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 16)))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 521, (char) ((-1) - Process.getGidForName("")), TextUtils.indexOf("", "") + 12, 627984172, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 14)))), new Class[]{Object.class, Object.class});
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
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i10 = $10 + 97;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[i2 - nVar.f19944a];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 523, (char) Drawable.resolveOpacity(0, 0), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 627984172, false, $$c(b6, b7, (byte) (14 | b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 522, (char) Color.argb(0, 0, 0, 0), 11 - MotionEvent.axisFromString(""), 627984172, false, $$c(b8, b9, (byte) (14 | b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void r(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 15;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f24741n[i2 % i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 742, (char) View.resolveSize(0, 0), Color.rgb(0, 0, 0) + 16777228, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f24740m), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(766 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (MotionEvent.axisFromString("") + 12471), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(Color.green(0) + 387, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - TextUtils.indexOf((CharSequence) "", '0'), 39570797, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
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
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f24741n[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(742 - ExpandableListView.getPackedPositionType(0L), (char) ((-1) - Process.getGidForName("")), 12 - (ViewConfiguration.getTouchSlop() >> 8), 632508977, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f24740m), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(View.getDefaultSize(0, 0) + 766, (char) (12470 - View.MeasureSpec.makeMeasureSpec(0, 0)), 12 - (Process.myPid() >> 22), 1946853218, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 387, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 39570797, false, $$c(b12, b13, (byte) (6 | b13)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objA7 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 386, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 39570797, false, $$c(b14, b15, (byte) ((b15 + 6) - (6 & b15))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
            int i11 = $11 + 31;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f24739l + 1;
        f24738k = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f24738k + 81;
        f24739l = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f24738k + 87;
        f24739l = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = (d[]) f24737j.clone();
        int i5 = f24739l + 95;
        f24738k = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarArr;
        }
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f24739l + 7;
        int i4 = i3 % 128;
        f24738k = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f24744f;
        int i5 = i4 + 97;
        f24739l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EmvApplicationStatus d() {
        int i2 = 2 % 2;
        int i3 = f24739l + 31;
        f24738k = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass1.f24746a[ordinal()]) {
            case 1:
                return EmvApplicationStatus.Active;
            case 2:
                EmvApplicationStatus emvApplicationStatus = EmvApplicationStatus.Locked;
                int i5 = f24738k + 25;
                f24739l = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 77 / 0;
                }
                return emvApplicationStatus;
            case 3:
                return EmvApplicationStatus.ActivationRequired;
            case 4:
                return EmvApplicationStatus.Activating;
            case 5:
                return EmvApplicationStatus.ActivationRefused;
            case 6:
                Object[] objArr = new Object[1];
                r((char) KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41, objArr);
                throw new RuntimeException(((String) objArr[0]).intern());
            default:
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                r((char) (Color.rgb(0, 0, 0) + 16828984), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42, View.resolveSizeAndState(0, 0, 0) + 18, objArr2);
                throw new UnsupportedOperationException(sb.append(((String) objArr2[0]).intern()).append(name()).toString());
        }
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() {
        int i2 = 2 % 2;
        int i3 = f24739l + 79;
        f24738k = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationStatus emvApplicationStatusD = d();
        int i5 = f24738k + 25;
        f24739l = i5 % 128;
        int i6 = i5 % 2;
        return emvApplicationStatusD;
    }
}
