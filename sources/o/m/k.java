package o.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.t.a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k<Provider extends o.t.a> extends h {
    private static final byte[] $$f = null;
    private static final int $$g = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f26522a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26523b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f26524c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26525d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26526f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26527j = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26528m = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26529e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$h(int r8, byte r9, byte r10) {
        /*
            byte[] r7 = o.m.k.$$f
            int r0 = r9 * 3
            int r6 = 4 - r0
            int r2 = r8 * 4
            int r1 = 1 - r2
            int r0 = r10 + 99
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r7 != 0) goto L2a
            r0 = r3
            r1 = r6
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            int r1 = r1 + 1
        L1a:
            int r2 = r2 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r7[r1]
            goto L16
        L2a:
            r1 = r6
            r6 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.k.$$h(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26527j = 0;
        f26528m = 1;
        f26523b = 0;
        f26526f = 1;
        o();
        Color.red(0);
        SystemClock.uptimeMillis();
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f26528m + 65;
        f26527j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
    }

    k(i iVar, Provider provider) {
        super(iVar);
        this.f26529e = provider;
    }

    private b c(Context context) throws Throwable {
        b bVar;
        int i2 = 2 % 2;
        if (this.f26529e.c(context)) {
            int i3 = f26523b + 81;
            f26526f = i3 % 128;
            int i4 = i3 % 2;
            if (!this.f26529e.a(context)) {
                bVar = b.f26404e;
            } else if (this.f26529e.e()) {
                int i5 = f26523b + 85;
                f26526f = i5 % 128;
                int i6 = i5 % 2;
                bVar = b.f26400a;
            } else {
                bVar = b.f26402c;
            }
        } else {
            bVar = b.f26403d;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q(35 - ImageFormat.getBitsPerPixel(0), "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + ExifDirectoryBase.TAG_PAGE_NUMBER, 29 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            r((char) (65524 - ((Process.getThreadPriority(0) + 20) >> 6)), View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 38, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), bVar));
        }
        return bVar;
    }

    private boolean e(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (f() != b.f26400a) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                q(TextUtils.getOffsetAfter("", 0) + 36, "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, View.MeasureSpec.getSize(0) + ExifDirectoryBase.TAG_PAGE_NUMBER, (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, "\u0005\u0003ￂ\u0016\u0011\u0010ￂ\u0015\u000bￂ\u0015ￇￂￏￂ\u0016\u0017\u0012\u0010￫\u0007\u0014\u0011\u0016\u0015\u001b\u0007￭\u0016\u0007\u0015\u0007\u0014\u0006\u0007\u0016\u0003\u0018\u000b\u0016", true, TextUtils.indexOf("", "", 0, 0) + OlympusImageProcessingMakernoteDirectory.TagWbGLevel, Color.rgb(0, 0, 0) + 16777249, objArr2);
                o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d()));
            }
            return true;
        }
        int i3 = f26523b + 5;
        f26526f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            q(36 - View.MeasureSpec.getSize(0), "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, 296 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            q(63 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0013\u0014\u000f\u0012\u0005￩\u000e\u0010\u0015\u0014\uffc0ￍ\uffc0ￅ\u0013\uffc0\t\u0013\uffc0\u0001\u0003\u0014\t\u0016\u0001\u0014\u0005\u0004\uffc0\f\u000f\u0001\u0004\t\u000e\u0007\uffc0\u000e\u0005\u0017\uffc0\u000b\u0005\u0019\u0013\u0014\u000f\u0012\u0005\uffc0\t\u000e\u0010\u0015\u0014\u0012\u0005\u0013\u0005\u0014￫\u0005\u0019", false, (Process.myTid() >> 22) + 289, KeyEvent.normalizeMetaState(0) + 55, objArr4);
            o.ea.f.c(strIntern2, String.format(((String) objArr4[0]).intern(), d()));
            int i4 = f26526f + 47;
            f26523b = i4 % 128;
            int i5 = i4 % 2;
        }
        String strB = new o.dk.a(context).b(m());
        if (strB == null) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                q(37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, (ViewConfiguration.getJumpTapTimeout() >> 16) + ExifDirectoryBase.TAG_PAGE_NUMBER, 30 - ExpandableListView.getPackedPositionType(0L), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                r((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 78, 36 - TextUtils.indexOf("", "", 0), objArr6);
                o.ea.f.d(strIntern3, ((String) objArr6[0]).intern());
            }
            return false;
        }
        try {
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
        try {
            this.f26529e.a(o.dl.d.e(strB));
            int i6 = f26523b + 5;
            f26526f = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            if (o.ea.f.a()) {
                Object[] objArr7 = new Object[1];
                q(KeyEvent.getDeadChar(0, 0) + 36, "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, 297 - Color.red(0), 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
                String strIntern4 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                r((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 114, TextUtils.indexOf("", "") + 45, objArr8);
                o.ea.f.e(strIntern4, ((String) objArr8[0]).intern(), e);
            }
            return false;
        }
    }

    static void init$0() {
        $$f = new byte[]{Ascii.ETB, 117, 49, -107};
        $$g = 104;
    }

    static void o() {
        f26525d = -1270219302;
        f26524c = new char[]{27508, 47755, 51365, 7889, 11466, 29432, 32787, 54805, 58403, 2647, 22629, 28554, 48521, 50108, 4563, 10189, 30194, 39695, 43298, 65355, 3413, 21294, 25307, 45310, 50915, 5341, 15030, 18515, 40518, 44093, 62018, Ascii.MAX, 22130, 26011, 35749, 55710, 61315, 15869, 38035, 17785, 14166, 57635, 54052, 36123, 32758, 10691, 7133, 62900, 42946, 36963, 17023, 15434, 60973, 55321, 35329, 25843, 22208, 166, 62135, 38036, 17782, 14167, 57657, 54074, 36115, 32748, 10701, 7058, 62899, 42895, 36986, 17021, 15433, 60977, 55299, 35344, 25846, 22215, 38016, 17791, 14161, 57647, 54054, 36145, 32743, 10707, 7105, 62894, 42893, 36984, 17015, 15475, 60972, 55322, 35335, 25838, 22146, 240, 62194, 44212, 40311, 20294, 14686, 60282, 50465, 47068, 25055, 21402, 3505, 65438, 43411, 39534, 29783, 9785, 38016, 17791, 14161, 57647, 54054, 36145, 32743, 10707, 7105, 62894, 42893, 36984, 17015, 15475, 60972, 55322, 35335, 25838, 22146, 240, 62194, 44211, 40302, 20294, 14679, 60221, 50435, 47078, 25043, 21448, 3493, 65439, 43423, 39551, 29772, 9790, 4119, 49666, 48353, 28367, 22722, 2734, 58507, 54629, 34684, 38016, 17791, 14148, 57656, 54071, 36105, 32746, 10725, 7132, 62872, 42883, 36969, 17017, 15471, 60978, 55310, 35347, 25838, 22215, 234, 62207, 44250, 40303, 20303, 14662, 60210, 50445, 47086, 25010, 21376, 3554, 65487, 43393, 39482, 29711, 9834, 4157, 49676, 48359, 28376, 22720, 2739, 58502, 54638, 34679, 29012, 9058, 7449, 52998, 47611, 27606, 17855, 14241, 57818, 53816, 35850, 32279, 10281, 38016, 17791, 14148, 57656, 54071, 36105, 32746, 10725, 7132, 62856, 42887, 36985, 16999, 15447, 60967, 55370, 35423, 25786, 22223, 175, 62118, 44178, 40301, 20302, 14610, 60256, 50498, 47023, 25057, 21402, 3509, 65419, 43393, 39482, 29778, 9784, 4151, 49676, 48363, 28357, 22727, 2729, 58510, 54643, 34610, 29012, 9005, 7454, 53074, 47603, 27596, 17898, 14227, 57753, 53878, 35907, 32324, 10299, 6678, 62703, 42742, 37018, 17073, 15518, 61075, 57198, 35143, 31590, 21874, 1800, 61927, 41932, 40384, 20415, 14737, 60002, 50299, 46676, 24613, 21066, 3097, 65279, 43227, 39609, 29862, 9877, 6000, 49487, 45842, 27955, 24332, 2554, 64487, 54734, 38016, 17791, 14148, 57656, 54071, 36105, 32746, 10725, 7132, 62856, 42887, 36985, 16999, 15447, 60967, 55370, 35423, 25786, 22209, 188, 62143, 44250, 40248, 20234, 14615, 60201, 50498, 47015, 25010, 21449, 3510, 65419, 43398, 39535, 29777, 9834, 4200, 49754, 48295, 28377};
        f26522a = -1586098126526724838L;
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.n nVar = new o.a.n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f26525d)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 270, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.MeasureSpec.getSize(0), -2071844881, false, $$h(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 16)))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 627984172, false, $$h(b4, b5, (byte) (14 | b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $10 + 57;
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 522, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - ExpandableListView.getPackedPositionType(0L), 627984172, false, $$h(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 14)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str3 = new String(cArr2);
        int i11 = $10 + 91;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    private static void r(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26524c[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 742, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - Color.blue(0), 632508977, false, $$h(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f26522a), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 766, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12471), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1946853218, false, $$h(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - Color.red(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - (Process.myTid() >> 22), 39570797, false, $$h(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 99;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 19, 39570797, false, $$h(b8, b9, (byte) (6 | b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $11 + 67;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    @Override // o.m.h
    final void a(Context context) {
        int i2 = 2 % 2;
        int i3 = f26523b + 1;
        f26526f = i3 % 128;
        int i4 = i3 % 2;
        super.a(context);
        if (!e(context)) {
            int i5 = f26526f + 13;
            f26523b = i5 % 128;
            if (i5 % 2 != 0) {
                a(b.f26402c);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            a(b.f26402c);
        }
        int i6 = f26523b + 85;
        f26526f = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd A[PHI: r3
  0x00bd: PHI (r3v2 o.m.b) = (r3v1 o.m.b), (r3v4 o.m.b) binds: [B:14:0x00b9, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r16, boolean r17, o.ef.a r18) throws java.lang.Throwable {
        /*
            r15 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.m.k.f26523b
            int r2 = r0 + 89
            int r0 = r2 % 128
            o.m.k.f26526f = r0
            int r2 = r2 % r8
            r1 = 0
            r0 = r18
            r4 = r17
            r3 = r16
            if (r2 != 0) goto Lb0
            super.a(r3, r4, r0)
            o.m.b r3 = r15.c(r3)
            o.m.b r2 = o.m.b.f26400a
            r0 = 8
            int r0 = r0 / r1
            if (r3 != r2) goto Lbd
        L23:
            if (r4 == 0) goto La9
            o.m.b r0 = o.m.b.f26400a
            r15.a(r0)
        L2a:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto La8
            int r0 = o.m.k.f26526f
            int r2 = r0 + 115
            int r0 = r2 % 128
            o.m.k.f26523b = r0
            int r2 = r2 % r8
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            int r9 = 37 - r0
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r12 = r0 + 297
            java.lang.String r4 = ""
            int r0 = android.text.TextUtils.getOffsetBefore(r4, r1)
            int r13 = r0 + 30
            r2 = 1
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r10 = "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006"
            r11 = 0
            q(r9, r10, r11, r12, r13, r14)
            r0 = r14[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
            int r0 = android.text.TextUtils.indexOf(r4, r4, r1, r1)
            int r9 = 52 - r0
            long r4 = android.widget.ExpandableListView.getPackedPositionForChild(r1, r1)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r12 = 279 - r0
            int r0 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r0 = r0 >> 16
            int r13 = r0 + 24
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r10 = "ￖ\uffc9\u0018\u001f\u000e\u001b\u001b\u0012\r\r\u000e\u0017\uffc9\u001c\u001d\n\u001d\u001e\u001c\uffc9￣\uffc9ￎ\u001c\u001b\u000e\u000f\u001b\u000e\u001c\u0011\ufff8\u0017\ufff2\u0017\u0012\u001d\uffc9ￖ\uffc9\u0016\u000e\u001d\u0011\u0018\r\uffc9￣\uffc9ￎ\u001c\uffc9"
            r11 = 0
            q(r9, r10, r11, r12, r13, r14)
            r0 = r14[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r0.intern()
            o.m.i r1 = r15.d()
            o.m.b r0 = r15.f()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = java.lang.String.format(r2, r0)
            o.ea.f.c(r3, r0)
            int r0 = o.m.k.f26523b
            int r1 = r0 + 43
            int r0 = r1 % 128
            o.m.k.f26526f = r0
            int r1 = r1 % r8
        La8:
            return
        La9:
            o.m.b r0 = o.m.b.f26402c
            r15.a(r0)
            goto L2a
        Lb0:
            super.a(r3, r4, r0)
            o.m.b r3 = r15.c(r3)
            o.m.b r0 = o.m.b.f26400a
            if (r3 != r0) goto Lbd
            goto L23
        Lbd:
            r15.a(r3)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.k.a(android.content.Context, boolean, o.ef.a):void");
    }

    @Override // o.m.h
    public final boolean c(Context context, boolean z2, o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        boolean zC = super.c(context, z2, cVar);
        b bVarC = c(context);
        if (bVarC != b.f26400a) {
            a(bVarC);
        } else if (z2) {
            int i3 = f26526f + 45;
            f26523b = i3 % 128;
            int i4 = i3 % 2;
            a(b.f26400a);
        } else {
            a(b.f26402c);
        }
        if (!e(context)) {
            int i5 = f26523b + 19;
            f26526f = i5 % 128;
            int i6 = i5 % 2;
            a(b.f26402c);
            int i7 = f26523b + 93;
            f26526f = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
        }
        if (o.ea.f.a()) {
            int i9 = f26526f + 113;
            f26523b = i9 % 128;
            int i10 = i9 % 2;
            Object[] objArr = new Object[1];
            q(TextUtils.lastIndexOf("", '0', 0, 0) + 37, "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + ExifDirectoryBase.TAG_PAGE_NUMBER, TextUtils.getOffsetAfter("", 0) + 30, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            r((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (Process.myTid() >> 22) + 159, View.combineMeasuredStates(0, 0) + 58, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
        }
        int i11 = f26523b + 97;
        f26526f = i11 % 128;
        if (i11 % 2 != 0) {
            return zC;
        }
        throw null;
    }

    final byte[] d(Context context) throws e {
        int i2 = 2 % 2;
        int i3 = f26526f + 33;
        f26523b = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bArrE = this.f26529e.e(context);
            int i5 = f26526f + 15;
            f26523b = i5 % 128;
            if (i5 % 2 == 0) {
                return bArrE;
            }
            throw null;
        } catch (o.t.d e2) {
            Object[] objArr = new Object[1];
            r((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38, TextUtils.indexOf("", "") + 21, objArr);
            throw new e(((String) objArr[0]).intern(), e2);
        }
    }

    @Override // o.m.h
    public final void e(Context context, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        b bVarF = f();
        b bVarC = c(context);
        if (bVarC == b.f26400a) {
            int i3 = f26523b + 5;
            f26526f = i3 % 128;
            int i4 = i3 % 2;
            if (z2) {
                a(b.f26400a);
                int i5 = f26526f + 125;
                f26523b = i5 % 128;
                int i6 = i5 % 2;
            } else {
                a(b.f26402c);
            }
        } else {
            a(bVarC);
        }
        if (f() == b.f26400a && bVarF != b.f26400a) {
            if (o.ea.f.a()) {
                int i7 = f26526f + 1;
                f26523b = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                q((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, 297 - TextUtils.getCapsMode("", 0, 0), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                r((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.blue(0) + 217, 93 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d()));
            }
            if (!e(context)) {
                int i9 = f26523b + 33;
                f26526f = i9 % 128;
                int i10 = i9 % 2;
                a(b.f26402c);
                int i11 = f26523b + 111;
                f26526f = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 2 % 3;
                }
            }
        }
        if (o.ea.f.a()) {
            int i13 = f26523b + 73;
            f26526f = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr3 = new Object[1];
            q(ImageFormat.getBitsPerPixel(0) + 37, "\ufff9\u0004ￛ\r\u000b\f\u0007\u0005�\n\uffd9\r\f\u0000�\u0006\f\u0001\ufffb\ufff9\f\u0001\u0007\u0006￥�\f\u0000\u0007￼￡\u0006\f�\n\u0006", false, 296 - Process.getGidForName(""), ExpandableListView.getPackedPositionType(0L) + 30, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            r((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 311, TextUtils.lastIndexOf("", '0', 0) + 41, objArr4);
            o.ea.f.c(strIntern2, String.format(((String) objArr4[0]).intern(), d(), f()));
        }
    }

    final void k() throws e {
        int i2 = 2 % 2;
        int i3 = f26523b + 79;
        f26526f = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.f26529e.a();
                int i4 = 26 / 0;
            } else {
                this.f26529e.a();
            }
            int i5 = f26523b + 33;
            f26526f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
            }
        } catch (o.t.d e2) {
            Object[] objArr = new Object[1];
            r((char) KeyEvent.normalizeMetaState(0), KeyEvent.normalizeMetaState(0) + 59, 18 - Process.getGidForName(""), objArr);
            throw new e(((String) objArr[0]).intern(), e2);
        }
    }

    public final Provider l() {
        Provider provider;
        int i2 = 2 % 2;
        int i3 = f26526f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f26523b = i4;
        if (i3 % 2 != 0) {
            provider = this.f26529e;
            int i5 = 24 / 0;
        } else {
            provider = this.f26529e;
        }
        int i6 = i4 + 51;
        f26526f = i6 % 128;
        if (i6 % 2 != 0) {
            return provider;
        }
        throw null;
    }
}
