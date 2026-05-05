package o.bk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Locale;
import o.a.l;
import o.bk.d;
import o.br.i;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f21339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f21340c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f21341e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21342f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21343g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21344h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21345i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21346j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.br.a f21347a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.br.c[] f21348d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, byte r11) {
        /*
            int r0 = r10 * 4
            int r8 = r0 + 4
            byte[] r7 = o.bk.e.$$a
            int r0 = r9 * 3
            int r6 = r0 + 1
            int r0 = r11 * 2
            int r3 = r0 + 113
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2b
            r0 = r6
            r3 = r8
            r2 = r4
        L16:
            int r0 = -r0
            int r8 = r8 + 1
            int r3 = r3 + r0
            r1 = r2
        L1b:
            int r2 = r1 + 1
            byte r0 = (byte) r3
            r5[r1] = r0
            if (r2 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r7[r8]
            goto L16
        L2b:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.e.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21343g = 0;
        f21346j = 1;
        f21344h = 0;
        f21342f = 1;
        f();
        ExpandableListView.getPackedPositionForChild(0, 0);
        f21339b = new Object();
        int i2 = f21343g + 79;
        f21346j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private e(Context context) {
        o.br.a aVar = new o.br.a(context);
        this.f21347a = aVar;
        this.f21348d = new o.br.c[]{new o.br.e(), new o.br.b(context), new o.br.d(context), aVar, new i()};
    }

    public static e d(Context context) {
        e eVar;
        synchronized (f21339b) {
            if (f21340c == null) {
                f21340c = new e(context);
            }
            eVar = f21340c;
        }
        return eVar;
    }

    static void f() {
        f21341e = new int[]{1628378619, -454155200, -1154953644, -1581181580, 50818706, 539847759, -578759191, 451904022, 2126804032, -2066000433, 1403542327, -1203407158, 1429636903, 238372610, -1718098725, -1922824428, 1356924382, -1022006954};
        f21345i = -1270219510;
    }

    static void init$0() {
        $$a = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
        $$b = 191;
    }

    private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f21341e;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(TextUtils.indexOf("", "", i5, i5) + 675, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12 - TextUtils.indexOf("", "", i5), -328001469, false, $$c(b2, b2, (byte) $$a.length), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 75;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f21341e;
        char c2 = '0';
        if (iArr6 != null) {
            int i9 = $10 + 95;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 675, (char) (TextUtils.lastIndexOf("", c2, 0, 0) + 1), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -328001469, false, $$c(b3, b3, (byte) $$a.length), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i10++;
                c2 = '0';
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        lVar.f19941d = 0;
        int i11 = $11 + 83;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                lVar.f19942e ^= iArr5[i13];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(Color.red(0) + 301, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 52697), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1416256172, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 229, (char) (TextUtils.getOffsetBefore("", 0) + 51004), 8 - Process.getGidForName(""), -330018025, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r20, java.lang.String r21, boolean r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.e.l(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    public final c a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21342f + 59;
        f21344h = i3 % 128;
        int i4 = i3 % 2;
        for (o.br.c cVar : this.f21348d) {
            c cVarC = cVar.c();
            if (cVarC != null) {
                int i5 = f21342f + 23;
                f21344h = i5 % 128;
                int i6 = i5 % 2;
                if (f.a()) {
                    int i7 = f21344h + 107;
                    f21342f = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = new Object[1];
                    k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Locale locale = Locale.getDefault();
                    Object[] objArr2 = new Object[1];
                    l(70 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0005\uffc1\u0007\u0013\u0010\u000e\uffc1\u0004\u0010\u000f\u0007\n\b\u0016\u0013\u0002\u0015\n\u0010\u000f\uffc1\u0011\u0013\u0010\u0017\n\u0005\u0006\u0013\uffc1ￛ\uffc1ￆ\u0014\b\u0006\u0015￩\u000e\u0014￤\u0010\u000f\u0007\n\b\u0016\u0013\u0002\u0015\n\u0010\u000f\uffc1ￎ\uffc1\u0017\u0002\r\u0016\u0006\uffc1\u0013\u0006\u0014\u0010\r\u0017\u0006", false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33, objArr2);
                    f.c(strIntern, String.format(locale, ((String) objArr2[0]).intern(), cVar.d()));
                }
                return cVarC;
            }
        }
        if (!f.a()) {
            return null;
        }
        int i9 = f21344h + 49;
        f21342f = i9 % 128;
        int i10 = i9 % 2;
        Object[] objArr3 = new Object[1];
        k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 19 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        l((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46, "\b\u0006\u0014\u0011\u0000\u0013\b\u000e\r\uffbfￌ\uffbf\r\u000e\uffbf\u0002\u000e\r\u0005\b\u0006\u0014\u0011\u0000\u0013\b\u000e\r\uffbf\u0003\u0004\u0005\b\r\u0004\u0003\u0006\u0004\u0013\uffe7\f\u0012￢\u000e\r\u0005", false, 114 - Drawable.resolveOpacity(0, 0), 36 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        f.c(strIntern2, ((String) objArr4[0]).intern());
        int i11 = f21344h + 29;
        f21342f = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    public final String b() throws Throwable {
        int i2 = 2 % 2;
        o.br.c[] cVarArr = this.f21348d;
        int i3 = f21342f + 27;
        f21344h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 5;
        }
        for (o.br.c cVar : cVarArr) {
            String strB = cVar.b();
            if (strB != null) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Locale locale = Locale.getDefault();
                    Object[] objArr2 = new Object[1];
                    k(new int[]{-1147843434, 803800282, -49807796, 1030280399, -1775959107, 2092240776, -1520245494, 2042023123, -1141242683, 133966458, 1224541964, -2004894158, -1280554778, -1263828499, -732024253, 1891297314, -792391157, 921704079, 455695119, 2143208707, -990211480, 461049552, 1128956875, -611486333, 1884834220, 1275362692, -120881379, -1127840553, 1267655136, 1468710875, 2017914318, 1748148011, 780603970, 1047458456}, 65 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                    f.c(strIntern, String.format(locale, ((String) objArr2[0]).intern(), strB, cVar.d()));
                }
                int i5 = f21344h + 69;
                f21342f = i5 % 128;
                int i6 = i5 % 2;
                return strB;
            }
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, MotionEvent.axisFromString("") + 21, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k(new int[]{-1147843434, 803800282, -49807796, 1030280399, -1775959107, 2092240776, 2072846392, -261199499, 541660572, -648564636, -1758896423, -1634910155}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, objArr4);
            f.d(strIntern2, ((String) objArr4[0]).intern());
        }
        throw new d(d.a.f21328b);
    }

    public final String c() throws d {
        int i2 = 2 % 2;
        for (o.br.c cVar : this.f21348d) {
            int i3 = f21342f + 61;
            f21344h = i3 % 128;
            int i4 = i3 % 2;
            String strA = cVar.a();
            if (strA != null) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, KeyEvent.normalizeMetaState(0) + 20, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Locale locale = Locale.getDefault();
                    Object[] objArr2 = new Object[1];
                    l(71 - View.MeasureSpec.getSize(0), "ￊ\u0018\f\n\u0019￦\u0015\u0015\u0011\u000e\b\u0006\u0019\u000e\u0014\u0013￮\tￅￒￅ\u001b\u0006\u0011\u001a\nￅￊ\u0018ￅￒￅ\u0017\n\u0018\u0014\u0011\u001b\n\tￅ\u000b\u0017\u0014\u0012ￅ\b\u0014\u0013\u000b\u000e\f\u001a\u0017\u0006\u0019\u000e\u0014\u0013ￅ\u0015\u0017\u0014\u001b\u000e\t\n\u0017ￅ\uffdfￅ", false, 108 - (Process.myPid() >> 22), 2 - View.MeasureSpec.getSize(0), objArr2);
                    f.c(strIntern, String.format(locale, ((String) objArr2[0]).intern(), strA, cVar.d()));
                }
                int i5 = f21344h + 25;
                f21342f = i5 % 128;
                int i6 = i5 % 2;
                return strA;
            }
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 19 - MotionEvent.axisFromString(""), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            l(TextUtils.getTrimmedLength("") + 28, "\u000b\u0011\u0010￫\u0006ￂￏￂ\u0010\u0011\u0016ￂ\b\u0011\u0017\u0010\u0006\t\u0007\u0016￣\u0012\u0012\u000e\u000b\u0005\u0003\u0016", false, 111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            f.d(strIntern2, ((String) objArr4[0]).intern());
        }
        throw new d(d.a.f21331e);
    }

    public final a d() throws Throwable {
        int i2 = 2 % 2;
        o.br.c[] cVarArr = this.f21348d;
        int length = cVarArr.length;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                if (f.a()) {
                    int i4 = f21342f + 35;
                    f21344h = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = new Object[1];
                    k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    l(((Process.getThreadPriority(0) + 20) >> 6) + 51, "\u0004\u0007\f\u0003\u0002\u0005\u0003\u0012￤\u0007\u0010\u0003\u0000\uffff\u0011\u0003￡\r\f\u0004\u0007\u0005\u0013\u0010\uffff\u0012\u0007\r\fﾾￋﾾ\f\rﾾ\u0001\r\f\u0004\u0007\u0005\u0013\u0010\uffff\u0012\u0007\r\fﾾ\u0002\u0003", false, 115 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                int i6 = f21342f + 63;
                f21344h = i6 % 128;
                if (i6 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            o.br.c cVar = cVarArr[i3];
            a aVarE = cVar.e();
            if (aVarE != null) {
                int i7 = f21344h + 25;
                f21342f = i7 % 128;
                if (i7 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Locale locale = Locale.getDefault();
                    Object[] objArr4 = new Object[1];
                    l((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73, "\u0012\u000f\r\uffc0\u0003\u000f\u000e\u0006\t\u0007\u0015\u0012\u0001\u0014\t\u000f\u000e\uffc0\u0010\u0012\u000f\u0016\t\u0004\u0005\u0012\uffc0ￚ\uffc0ￅ\u0013\u0007\u0005\u0014￦\t\u0012\u0005\u0002\u0001\u0013\u0005￣\u000f\u000e\u0006\t\u0007\u0015\u0012\u0001\u0014\t\u000f\u000e\uffc0ￍ\uffc0\u0016\u0001\f\u0015\u0005\uffc0\u0012\u0005\u0013\u000f\f\u0016\u0005\u0004\uffc0\u0006", false, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 113, 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                    f.c(strIntern2, String.format(locale, ((String) objArr4[0]).intern(), cVar.d()));
                }
                return aVarE;
            }
            i3++;
        }
    }

    public final o.br.a e() {
        int i2 = 2 % 2;
        int i3 = f21344h + 107;
        f21342f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f21347a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(Context context) {
        synchronized (f21339b) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, View.resolveSizeAndState(0, 0, 0) + 20, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k(new int[]{2052834230, 531746002, -1664054408, -326777633, 2068680951, -986657451, 917733546, -1549167852, 1560214687, 890301531}, 17 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            for (o.br.c cVar : this.f21348d) {
                cVar.d(context);
            }
            f21340c = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0113, code lost:
    
        if (((o.br.a.b) o.br.a.e(r12, r13, r14, -1023910309, 1023910309, (int) java.lang.Thread.currentThread().getId(), r18)) == o.br.a.b.f21552c) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0115, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0147, code lost:
    
        if (((o.br.a.b) o.br.a.e(r12, r13, r14, -1023910309, 1023910309, (int) java.lang.Thread.currentThread().getId(), r18)) != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x014b, code lost:
    
        r2 = o.bk.e.f21344h + 65;
        o.bk.e.f21342f = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0154, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0156, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0157, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0161, code lost:
    
        if (o.ea.f.a() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0163, code lost:
    
        r2 = o.bk.e.f21344h + 125;
        o.bk.e.f21342f = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016e, code lost:
    
        if ((r2 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0170, code lost:
    
        r1 = new java.lang.Object[1];
        k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 26 % android.view.MotionEvent.axisFromString(""), r1);
        r6 = ((java.lang.String) r1[0]).intern();
        r1 = new java.lang.Object[1];
        k(new int[]{-1610644952, 83621346, -1904863610, -1702499654, -61491213, 925417913, 588779292, 1872652848, -898203813, -1348005034, 1270385355, 2109779047, -561581644, -604163540, -891940916, -926624163, -345731228, 1750134354, 1960136774, 1194078763, 1347594652, 494587012, -381963240, -167126406, 1677041673, 1890330238}, (android.util.TypedValue.complexToFloat(1) > 2.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)) + 50, r1);
        r1 = r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019e, code lost:
    
        o.ea.f.c(r6, ((java.lang.String) r1).intern());
        r2 = o.bk.e.f21344h + 65;
        o.bk.e.f21342f = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b0, code lost:
    
        if ((r2 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b2, code lost:
    
        r1 = 3 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r1 = new java.lang.Object[1];
        k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 19 - android.view.MotionEvent.axisFromString(""), r1);
        r6 = ((java.lang.String) r1[0]).intern();
        r1 = new java.lang.Object[1];
        k(new int[]{-1610644952, 83621346, -1904863610, -1702499654, -61491213, 925417913, 588779292, 1872652848, -898203813, -1348005034, 1270385355, 2109779047, -561581644, -604163540, -891940916, -926624163, -345731228, 1750134354, 1960136774, 1194078763, 1347594652, 494587012, -381963240, -167126406, 1677041673, 1890330238}, 50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), r1);
        r1 = r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        if (((o.br.a.b) o.br.a.e(r12, r13, r14, -1023910309, 1023910309, (int) java.lang.Thread.currentThread().getId(), r18)) != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        if (o.ea.f.a() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        r1 = new java.lang.Object[1];
        k(new int[]{-305373, 2065370116, -136256848, -988272440, 748640114, 486276531, 2003910071, -2087610488, -668699929, 1155219555}, 19 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), r1);
        r5 = ((java.lang.String) r1[0]).intern();
        r2 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        l((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, "\u0006￮\t\u0014\u0016\u0011\uffc1ￛ\u0006\u0005\u0010\u000e\uffc1\u0005\u000f\u0006\f\u0004\u0002\u0003\uffc1\u000f\u0013\u0016\u0015\u0006\ufff3\uffc1ￎ\uffc1\u0005\u0006\u0015\u0013\u0010\u0011\u0011\u0016\ufff4\b\u000f\n\b\u0002\u0014\u0014", true, android.view.View.MeasureSpec.getMode(0) + com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r1);
        r3 = r2.append(((java.lang.String) r1[0]).intern());
        r14 = new java.lang.Object[]{r19.f21347a};
        r18 = o.br.a.f21541e * (-371875515);
        o.br.a.f21541e = r18;
        r13 = (int) java.lang.Thread.currentThread().getId();
        r12 = o.br.a.f21539c * 248001262;
        o.br.a.f21539c = r12;
        o.ea.f.c(r5, r3.append((o.br.a.b) o.br.a.e(r12, r13, r14, -1023910309, 1023910309, (int) java.lang.Thread.currentThread().getId(), r18)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e0, code lost:
    
        r14 = new java.lang.Object[]{r19.f21347a};
        r18 = o.br.a.f21541e * (-371875515);
        o.br.a.f21541e = r18;
        r13 = (int) java.lang.Thread.currentThread().getId();
        r12 = o.br.a.f21539c * 248001262;
        o.br.a.f21539c = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.e.j():boolean");
    }
}
