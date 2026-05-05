package o.bo;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.l;
import o.a.m;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21457a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21458b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21459c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f21460d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f21461e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21462f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21463g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21464i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21465j = 0;

    static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21466a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f21467b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static C0344e f21468c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int[] f21469d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f21470e = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21471i = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, int r9, short r10) {
            /*
                int r2 = r9 * 3
                int r1 = 1 - r2
                int r0 = r8 * 2
                int r9 = 121 - r0
                byte[] r8 = o.bo.e.b.$$a
                int r7 = r10 + 4
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r8 != 0) goto L2c
                r1 = r7
                r3 = r5
            L15:
                int r9 = r9 + r7
                r7 = r1
                r2 = r3
            L18:
                byte r0 = (byte) r9
                r6[r2] = r0
                int r1 = r7 + 1
                int r3 = r2 + 1
                if (r2 != r4) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L27:
                r0 = r8[r1]
                r7 = r9
                r9 = r0
                goto L15
            L2c:
                r2 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bo.e.b.$$c(byte, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21470e = 0;
            f21471i = 1;
            f21466a = 0;
            f21467b = 1;
            b();
            ViewConfiguration.getZoomControlsTimeout();
            Color.rgb(0, 0, 0);
            f21468c = null;
            int i2 = f21470e + 113;
            f21471i = i2 % 128;
            int i3 = i2 % 2;
        }

        static void a(Context context, C0344e c0344e) throws Throwable {
            String strE;
            int i2 = 2 % 2;
            C0344e c0344e2 = f21468c;
            if (c0344e2 != null) {
                int i3 = f21466a + 61;
                f21467b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 86 / 0;
                    if (c0344e2.b(c0344e)) {
                        return;
                    }
                } else if (c0344e2.b(c0344e)) {
                    return;
                }
            }
            try {
                o.ef.a aVar = new o.ef.a();
                Object[] objArr = new Object[1];
                f(new int[]{1756139719, 342447663, 1299147606, -1267325858, 1339030075, 1007970019}, ((Process.getThreadPriority(0) + 20) >> 6) + 12, objArr);
                aVar.a(((String) objArr[0]).intern(), (Object) c0344e.f21478a);
                Object[] objArr2 = new Object[1];
                f(new int[]{1045179256, -1694021520, -292727733, 793701063}, Color.alpha(0) + 5, objArr2);
                aVar.a(((String) objArr2[0]).intern(), (Object) c0344e.f21479b);
                strE = aVar.e();
                int i5 = f21466a + 33;
                f21467b = i5 % 128;
                int i6 = i5 % 2;
            } catch (o.ef.b e2) {
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    f(new int[]{-1819059569, 420821526, 61946180, 730132234, 555358569, -1275521592, -1629651906, -2029369785, -466989300, 1095157651}, 20 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                    String strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f(new int[]{-351649939, 1352392129, -870229343, -1194367105, 1993003146, 2004865266, -244362894, -673115114, -1249695049, -1114332508, 1434652776, -153533306, 305333767, -1545880123}, Color.blue(0) + 28, objArr4);
                    o.ea.f.e(strIntern, ((String) objArr4[0]).intern(), e2);
                    int i7 = f21466a + 35;
                    f21467b = i7 % 128;
                    int i8 = i7 % 2;
                }
                strE = null;
            }
            Object[] objArr5 = new Object[1];
            f(new int[]{1817932412, 224455116, -716094933, -686972018, 1010506107, 380615910, -716094933, -686972018, -1357309562, 1137000244, -501803223, -70076358, -1367495687, -1696196409, 2098951830, -1568630980, -310057443, 143245615, -1667066223, -388818990, -1017188633, 936016201, -1086124317, -278876728}, View.MeasureSpec.getMode(0) + 47, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Class<?> cls = Class.forName(Xg.qd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (C1580rY.Xd() ^ (-22089)), (short) (C1580rY.Xd() ^ (-7702))));
            Class<?>[] clsArr = {Class.forName(Jg.Wd("k1\u001fnk\u001fZ8\u00065\u000f\u001fe1\u0007d", (short) (C1580rY.Xd() ^ (-4457)), (short) (C1580rY.Xd() ^ (-18807)))), Integer.TYPE};
            Object[] objArr6 = {strIntern2, 0};
            short sXd = (short) (C1607wl.Xd() ^ 30339);
            short sXd2 = (short) (C1607wl.Xd() ^ 20257);
            int[] iArr = new int["\rj] 9%I\n+E1Cj<\u0007oN\u001d4G".length()];
            QB qb = new QB("\rj] 9%I\n+E1Cj<\u0007oN\u001d4G");
            int i9 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i9] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((i9 * sXd2) + sXd)));
                i9++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i9), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr6)).edit();
                Object[] objArr7 = new Object[1];
                f(new int[]{-593721925, -863769861, -1536247051, 1665338960, 1559582793, -1004561715, 305333767, -1545880123, -650398918, 94439107, 1299147606, -1267325858, 312653589, -2058716575, -400996998, -35581399, 1973271983, 928157121, 207875643, -1877223134}, 37 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
                editorEdit.putString(((String) objArr7[0]).intern(), strE).commit();
                f21468c = c0344e;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        static void b() {
            f21469d = new int[]{1765143978, 1777954253, -2015549855, 1682353772, 357490966, -1442756411, 735000851, -1323078642, -1757830583, -1791274563, -1459948446, -1809882463, 1519624387, -2110168019, 206822448, 1021774692, -1950942334, -1031272349};
        }

        static C0344e d(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21466a + 57;
            f21467b = i3 % 128;
            int i4 = i3 % 2;
            C0344e c0344e = f21468c;
            if (c0344e != null) {
                return c0344e;
            }
            Object obj = null;
            try {
                Object[] objArr = new Object[1];
                f(new int[]{1817932412, 224455116, -716094933, -686972018, 1010506107, 380615910, -716094933, -686972018, -1357309562, 1137000244, -501803223, -70076358, -1367495687, -1696196409, 2098951830, -1568630980, -310057443, 143245615, -1667066223, -388818990, -1017188633, 936016201, -1086124317, -278876728}, 47 - Color.argb(0, 0, 0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Class<?> cls = Class.forName(C1626yg.Ud("\u0011\u0016x\u0014ZwN\u001f|?<3_C v\u0014ZwL\u0012*C", (short) (Od.Xd() ^ (-29408)), (short) (Od.Xd() ^ (-18746))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Ig.wd("\u0004Wx\u0002T5\u0014\u0010)6[\u001dK6]^", (short) (C1580rY.Xd() ^ (-6176))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strIntern, 0};
                Method method = cls.getMethod(EO.Od("\u0017BE~u;Z\u007f)\u00146\t83V*gx%M", (short) (FB.Xd() ^ 11798)), clsArr);
                try {
                    method.setAccessible(true);
                    SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
                    Object[] objArr3 = new Object[1];
                    f(new int[]{-593721925, -863769861, -1536247051, 1665338960, 1559582793, -1004561715, 305333767, -1545880123, -650398918, 94439107, 1299147606, -1267325858, 312653589, -2058716575, -400996998, -35581399, 1973271983, 928157121, 207875643, -1877223134}, 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                    String string = sharedPreferences.getString(((String) objArr3[0]).intern(), null);
                    if (string != null) {
                        o.ef.a aVar = new o.ef.a(string);
                        Object[] objArr4 = new Object[1];
                        f(new int[]{1756139719, 342447663, 1299147606, -1267325858, 1339030075, 1007970019}, 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                        Object[] objArr5 = {aVar, ((String) objArr4[0]).intern()};
                        int i5 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i5;
                        String str = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
                        Object[] objArr6 = new Object[1];
                        f(new int[]{1045179256, -1694021520, -292727733, 793701063}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, objArr6);
                        Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                        int i6 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i6;
                        f21468c = new C0344e(str, (String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority()));
                    } else {
                        Object[] objArr8 = new Object[1];
                        f(new int[]{-333444428, 1506705741}, Drawable.resolveOpacity(0, 0) + 4, objArr8);
                        String string2 = sharedPreferences.getString(((String) objArr8[0]).intern(), null);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        Object[] objArr9 = new Object[1];
                        f(new int[]{-333444428, 1506705741}, 3 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
                        editorEdit.remove(((String) objArr9[0]).intern()).apply();
                        if (string2 != null) {
                            Object[] objArr10 = new Object[1];
                            f(new int[]{429157237, -1807955716, -219818794, 557299117}, TextUtils.getOffsetAfter("", 0) + 8, objArr10);
                            f21468c = new C0344e(((String) objArr10[0]).intern(), string2);
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (o.ef.b e3) {
                if (o.ea.f.a()) {
                    Object[] objArr11 = new Object[1];
                    f(new int[]{-1819059569, 420821526, 61946180, 730132234, 555358569, -1275521592, -1629651906, -2029369785, -466989300, 1095157651}, (KeyEvent.getMaxKeyCode() >> 16) + 20, objArr11);
                    String strIntern2 = ((String) objArr11[0]).intern();
                    Object[] objArr12 = new Object[1];
                    f(new int[]{-1272050912, -1226831044, 391319222, 1255259971, -686887570, 431272384, 1973271983, 928157121, -1055489764, 1344002858, -208767865, -1611841768, 26834426, 20520913, 787686073, -1553231750, 207875643, -1877223134}, 33 - View.MeasureSpec.getSize(0), objArr12);
                    o.ea.f.e(strIntern2, ((String) objArr12[0]).intern(), e3);
                }
            }
            C0344e c0344e2 = f21468c;
            int i7 = f21467b + 85;
            f21466a = i7 % 128;
            if (i7 % 2 == 0) {
                return c0344e2;
            }
            obj.hashCode();
            throw null;
        }

        private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f21469d;
            int i4 = 989264422;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $11;
                int i7 = i6 + 97;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = i6 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - View.combineMeasuredStates(i5, i5), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.keyCodeFromString("") + 12, -328001469, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i11++;
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
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f21469d;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i12 = 0; i12 < length3; i12++) {
                    int i13 = $10 + 81;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 675, (char) View.getDefaultSize(0, 0), 12 - View.resolveSizeAndState(0, 0, 0), -328001469, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            lVar.f19941d = 0;
            while (lVar.f19941d < iArr.length) {
                int i15 = $11 + 107;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i17 = 0;
                while (i17 < 16) {
                    int i18 = $11 + 97;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        lVar.f19942e ^= iArr4[i17];
                        Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA3 = o.d.d.a(2098218801);
                        if (objA3 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objA3 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 301, (char) (52698 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-16777205) - Color.rgb(0, 0, 0), -1416256172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i17 += 71;
                    } else {
                        lVar.f19942e ^= iArr4[i17];
                        Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = o.d.d.a(2098218801);
                        if (objA4 == null) {
                            byte b8 = (byte) 1;
                            byte b9 = (byte) (b8 - 1);
                            objA4 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 300, (char) (View.getDefaultSize(0, 0) + 52697), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -1416256172, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue2;
                        i17++;
                    }
                }
                int i19 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i19;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i20 = lVar.f19942e;
                int i21 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    int iLastIndexOf = 228 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char longPressTimeout = (char) (51004 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 9;
                    int i22 = $$b;
                    byte b10 = (byte) ((i22 + 3) - (i22 | 3));
                    byte b11 = (byte) (b10 - 2);
                    objA5 = o.d.d.a(iLastIndexOf, longPressTimeout, jumpTapTimeout, -330018025, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                int i23 = $11 + 113;
                $10 = i23 % 128;
                int i24 = i23 % 2;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        static void init$0() {
            $$a = new byte[]{Ascii.ETB, 117, 49, -107};
            $$b = 62;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21472a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21473c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f21474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f21475e;

        public c(String str, String str2) {
            this.f21474d = str;
            this.f21475e = str2;
        }

        public final String d() {
            String str;
            int i2 = 2 % 2;
            int i3 = f21473c;
            int i4 = i3 + 47;
            f21472a = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.f21475e;
                int i5 = 64 / 0;
            } else {
                str = this.f21475e;
            }
            int i6 = (i3 & 3) + ((-1) - (((-1) - i3) & ((-1) - 3)));
            f21472a = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String e() {
            String str;
            int i2 = 2 % 2;
            int i3 = f21473c;
            int i4 = (i3 ^ 111) + (((i3 + 111) - (i3 | 111)) << 1);
            int i5 = i4 % 128;
            f21472a = i5;
            if (i4 % 2 == 0) {
                str = this.f21474d;
                int i6 = 97 / 0;
            } else {
                str = this.f21474d;
            }
            int i7 = ((-1) - (((-1) - i5) | ((-1) - 87))) + (i5 | 87);
            f21473c = i7 % 128;
            if (i7 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.bo.e$e, reason: collision with other inner class name */
    static final class C0344e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21476c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f21477e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f21478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f21479b;

        C0344e(String str, String str2) {
            this.f21478a = str;
            this.f21479b = str2;
        }

        final boolean b(C0344e c0344e) {
            int i2 = 2 % 2;
            int i3 = f21477e + 63;
            int i4 = i3 % 128;
            f21476c = i4;
            int i5 = i3 % 2;
            if (c0344e == null) {
                int i6 = i4 + 117;
                f21477e = i6 % 128;
                int i7 = i6 % 2;
                int i8 = ((i4 | 25) << 1) - (i4 ^ 25);
                f21477e = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.f21478a.equals(c0344e.f21478a)) {
                int i10 = f21477e + 39;
                f21476c = i10 % 128;
                int i11 = i10 % 2;
                if (this.f21479b.equals(c0344e.f21479b)) {
                    int i12 = f21476c + 71;
                    f21477e = i12 % 128;
                    return i12 % 2 != 0;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r0 = r7 * 4
            int r7 = 4 - r0
            int r0 = r6 + 67
            int r1 = r8 * 3
            int r6 = 1 - r1
            byte[] r5 = o.bo.e.$$a
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L27
            r2 = r7
            r1 = r3
        L13:
            int r0 = -r0
            int r7 = r7 + r0
            int r2 = r2 + 1
        L17:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r2]
            goto L13
        L27:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.e.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21462f = 0;
        f21464i = 1;
        f21465j = 0;
        f21463g = 1;
        a();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f21464i + 123;
        f21462f = i2 % 128;
        int i3 = i2 % 2;
    }

    public static c a(Context context) throws f {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            h(127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h(KeyEvent.normalizeMetaState(0) + 127, null, null, "\u008a\u0086\u008f\u0092\u0091\u0090\u008a\u0086\u008f\u008e\u0087\u008d\u008c\u0086\u0088", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f21465j + 61;
            f21463g = i3 % 128;
            int i4 = i3 % 2;
        }
        d dVarE = new g().e(context);
        if (dVarE == null) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                h(127 - View.MeasureSpec.getMode(0), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{0, 76, 0, 0}, false, objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            int i5 = f21465j + 99;
            f21463g = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strA = dVarE.a(context);
        C0344e c0344e = new C0344e(dVarE.d(), strA);
        b.a(context, c0344e);
        if (o.ea.f.a()) {
            Object[] objArr5 = new Object[1];
            h(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            h(127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, null, "\u0093\u0097\u0093\u0086\u0082\u0095\u0087\u0096\u0093\u0090\u0086\u0096\u0095\u0092\u0083\u0086\u008b\u0093\u0094\u0093\u008a\u0086\u008f\u0092\u0091\u0090\u008a\u0086\u008f\u008e\u0087\u008d\u008c\u0086\u0088", objArr6);
            o.ea.f.c(strIntern3, sb.append(((String) objArr6[0]).intern()).append(c0344e).toString());
        }
        return new c(dVarE.c(), strA);
    }

    static void a() {
        f21460d = new char[]{2507, 2452, 2454, 2467, 2508, 2468, 2488, 2466, 2464, 2477, 2473, 2455, 2521, 2470, 2478, 2471, 2487, 2474, 2555, 2540, 2479, 2453, 2513, 2469, 2484, 2475, 2476, 2489, 2543, 2448, 2501, 2496};
        f21457a = 2040400155;
        f21459c = true;
        f21458b = true;
        f21461e = new char[]{56499, 56550, 56556, 56539, 56529, 56546, 56551, 56552, 56553, 56553, 56540, 56545, 56557, 56552, 56553, 56519, 56486, 56486, 56519, 56558, 56519, 56520, 56562, 56564, 56557, 56516, 56518, 56553, 56556, 56563, 56554, 56548, 56552, 56555, 56554, 56515, 56520, 56561, 56560, 56562, 56559, 56550, 56548, 56555, 56521, 56512, 56555, 56555, 56549, 56554, 56550, 56545, 56551, 56552, 56520, 56486, 56520, 56561, 56560, 56562, 56559, 56550, 56550, 56555, 56554, 56515, 56519, 56561, 56560, 56556, 56518, 56522, 56561, 56557, 56552, 56553, 56498, 56552, 56551, 56545, 56550, 56554, 56549, 56555, 56555, 56512, 56521, 56555, 56548, 56550, 56559, 56562, 56560, 56561, 56520, 56519, 56558, 56519, 56486, 56486, 56514, 56556, 56554, 56546, 56554, 56546, 56545, 56553, 56552, 56557, 56545, 56548, 56555, 56548, 56552, 56553, 56549, 56555, 56555, 56556, 56554, 56546, 56554, 56562, 56522, 56519, 56553, 56552, 56557, 56561, 56522, 56522, 56561, 56553, 56555, 56562, 56563, 56556, 56513, 56514, 56550, 56558, 56522, 56521, 56560, 56554, 56515, 56324, 56705, 56443, 56447, 56446, 56442, 56705, 56442, 56439, 56707, 56446, 56447, 56439, 56440, 56704, 56440, 56704, 56706, 56408, 56380, 56380, 56413, 56708, 56413, 56416, 56711, 56707, 56446, 56447, 56413, 56414, 56704, 56705, 56712, 56708, 56708, 56713, 56706, 56442, 56414, 56380, 56413, 56708, 56413, 56416, 56712, 56704, 56440, 56704, 56706, 56408, 56416, 56711, 56413, 56407, 56440, 56447, 56712, 56715, 56418, 56413, 56712, 56714, 56498, 56514, 56523, 56555, 56550, 56560, 56557, 56514, 56493, 56493, 56521, 56555, 56549, 56553, 56552, 56548, 56555, 56548, 56545, 56557, 56552, 56553, 56545, 56546, 56554, 56546, 56554, 56556, 56514, 56486, 56486, 56521, 56555, 56556, 56561, 56557, 56561, 56557, 56516, 56329, 56327, 56540, 56545, 56330, 56327, 56574, 56567, 56534, 56540, 56326, 56543, 56535, 56321, 56575, 56567, 56575, 56327, 56543, 56540, 56323, 56540, 56507, 56541, 56569, 56321, CharCompanionObject.MIN_LOW_SURROGATE, 56569, 56321, 56321, 56569, 56535, 56535, 56571, 56575, 56572, 56569, 56570, 56534, 56540, 56574, 56573, 56322, 56326, 56543, 56540, 56323, 56540, 56507, 56507, 56535, 56321, 56575, 56567, 56575, 56567, 56566, 56574, 56573, 56322, 56566, 56569, CharCompanionObject.MIN_LOW_SURROGATE, 56569, 56573, 56574, 56570, CharCompanionObject.MIN_LOW_SURROGATE, 56505, 56555, 56548, 56550, 56559, 56562, 56560, 56545, 56538, 56548, 56550, 56559, 56564, 56555, 56540, 56541, 56554, 56555, 56552, 56548, 56554, 56563, 56556, 56537, 56538, 56557, 56564, 56546, 56540, 56557, 56556, 56555, 56556, 56549, 56555};
    }

    public static void b(Context context) {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (!(!o.ea.f.a())) {
            int i3 = f21463g + 97;
            f21465j = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                h(121 - View.MeasureSpec.getSize(0), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{317, 35, 0, 0}, false, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                h(View.MeasureSpec.getSize(0) + 127, null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{317, 35, 0, 0}, true, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        new g();
        g.a(context);
        int i4 = f21463g + 115;
        f21465j = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String c(Context context) throws f {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            h(ExpandableListView.getPackedPositionType(0L) + 127, null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h(128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0090 \u0088\u008a\u0089\u008c\u008a\u0089\u008b\u009a\u008b\u0086\u0088\u008a\u0089\u009f\u008c\u0086\u0088", objArr2);
            o.ea.f.c(strIntern2, ((String) objArr2[0]).intern());
        }
        d dVarE = new g().e(context);
        if (dVarE != null) {
            return dVarE.d(context);
        }
        int i3 = f21465j + 65;
        f21463g = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = f21463g + 63;
            f21465j = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr3 = new Object[1];
                h(99 << TextUtils.indexOf("", ""), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                h(29 / TextUtils.getTrimmedLength(""), null, null, "\u008a\u0086\u008f\u0092\u008c\u0093\u0095\u0095\u0082\u008a\u0093\u0088\u008a\u0089\u0090\u0089\u0096\u0092\u008b\u009a\u0093\u009d\u0086\u0095\u009c\u0087\u0095\u0089\u0087\u0096\u0087\u0093\u008b\u0086\u0090\u0089\u0096\u0092\u008b\u009a\u0093\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u009b\u0093\u0084\u0083\u0082\u009a\u0093\u0092\u008a\u0093\u0094\u0093\u0090 \u0088\u008a\u0089\u008c\u008a\u0089\u008b\u009a\u008b\u0086\u0088\u008a\u0089\u009f\u008c\u0086\u0088", objArr4);
                obj = objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                h(TextUtils.indexOf("", "") + 127, null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                strIntern = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                h(127 - TextUtils.getTrimmedLength(""), null, null, "\u008a\u0086\u008f\u0092\u008c\u0093\u0095\u0095\u0082\u008a\u0093\u0088\u008a\u0089\u0090\u0089\u0096\u0092\u008b\u009a\u0093\u009d\u0086\u0095\u009c\u0087\u0095\u0089\u0087\u0096\u0087\u0093\u008b\u0086\u0090\u0089\u0096\u0092\u008b\u009a\u0093\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u009b\u0093\u0084\u0083\u0082\u009a\u0093\u0092\u008a\u0093\u0094\u0093\u0090 \u0088\u008a\u0089\u008c\u008a\u0089\u008b\u009a\u008b\u0086\u0088\u008a\u0089\u009f\u008c\u0086\u0088", objArr6);
                obj = objArr6[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        int i5 = f21463g + 105;
        f21465j = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return null;
    }

    public static void d(Context context) throws f {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        h(127 - View.resolveSize(0, 0), null, null, "\u008b\u0086\u0088\u0087\u008a\u0087\u0085\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            int i3 = f21465j + 81;
            f21463g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            h(128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, null, "\u0086\u008c\u0087\u0090\u009a\u0099\u008a\u0086\u008f\u0092\u0091\u008c\u008e\u0086\u0095\u0098\u0086\u008b", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        d dVarE = new g().e(context);
        if (dVarE == null) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                k("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{76, 71, 0, 42}, true, objArr3);
                o.ea.f.d(strIntern, ((String) objArr3[0]).intern());
            }
            Object[] objArr4 = new Object[1];
            h(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0086\u0095\u009c\u0087\u0095\u0089\u0087\u0096\u0087\u0093\u008b\u0086\u0090\u0089\u0096\u0092\u008b\u009a\u0093\u0088\u008a\u0089\u0088\u0087\u0083\u0083\u0086\u009b\u0093\u0084\u0083\u0082\u009a\u0093\u0092\u008a", objArr4);
            throw new f(((String) objArr4[0]).intern());
        }
        C0344e c0344eD = b.d(context);
        if (c0344eD == null) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                k("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{147, 63, 150, 0}, false, objArr5);
                o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
                return;
            }
            return;
        }
        String strA = dVarE.a(context);
        C0344e c0344e = new C0344e(dVarE.d(), strA);
        b.a(context, c0344e);
        if (o.ea.f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            k("\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{Mp4VideoDirectory.TAG_COMPRESSION_TYPE, 38, 0, 10}, false, objArr6);
            o.ea.f.c(strIntern, sb.append(((String) objArr6[0]).intern()).append(strA).toString());
        }
        if (!c0344e.b(c0344eD)) {
            if (o.ea.f.a()) {
                Object[] objArr7 = new Object[1];
                h(127 - ExpandableListView.getPackedPositionType(0L), null, null, "\u0090\u008a\u0086\u008f\u008e\u0087\u009c\u0093\u0088\u008a\u0089\u009e\u0098\u0089\u008c\u0092\u008a\u0093\u009d\u0090\u0086\u008c\u008e\u0086\u008c\u0086\u0090\u0093\u0086\u0088\u008a\u0087\u0084\u008e\u0093\u008a\u0086\u008f\u0092\u008c\u0093\u0094\u0093\u0086\u008c\u0087\u0090\u009a\u0099\u008a\u0086\u008f\u0092\u0091\u008c\u008e\u0086\u0095\u0098\u0086\u008b", objArr7);
                o.ea.f.c(strIntern, ((String) objArr7[0]).intern());
            }
            o.dc.d.a().b(context, new o.dd.e(o.az.a.f20791b, o.dd.g.D), false);
            return;
        }
        if (o.ea.f.a()) {
            Object[] objArr8 = new Object[1];
            k("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{248, 69, 21, 0}, true, objArr8);
            o.ea.f.c(strIntern, ((String) objArr8[0]).intern());
            int i5 = f21463g + 61;
            f21465j = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f21463g + 53;
        f21465j = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void h(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11 + 121;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f21460d;
        int i6 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objA = o.d.d.a(593 - Color.argb(i6, i6, i6, i6), (char) (13181 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getOffsetBefore("", i6) + 11, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f21457a)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f21458b) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = fVar.f19922a;
                    int i10 = fVar.f19923e;
                    cArr4[i9] = (char) (cArr2[bArr[fVar.f19922a] >>> i2] * iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(458 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.argb(0, 0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -1923924106, false, $$c((byte) ($$b & 22), b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 459, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), -1923924106, false, $$c((byte) ($$b & 22), b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f21459c) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i11 = $11 + 89;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr6 = {fVar, fVar};
            Object objA5 = o.d.d.a(1540807955);
            if (objA5 == null) {
                byte b6 = (byte) 0;
                objA5 = o.d.d.a(459 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - TextUtils.getOffsetBefore("", 0), -1923924106, false, $$c((byte) ($$b & 22), b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    static void init$0() {
        $$a = new byte[]{120, 70, -13, MessagePack.Code.FIXEXT4};
        $$b = 239;
    }

    private static void k(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        byte b2;
        char[] cArr;
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = f21461e;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 105;
                $11 = i12 % 128;
                if (i12 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b3 = (byte) i6;
                            objA = o.d.d.a((TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 249, (char) ((-1) - TextUtils.lastIndexOf("", '0', i6)), 10 - TextUtils.indexOf((CharSequence) "", '0', i6), 1376582792, false, $$c((byte) 49, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i11])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 250, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 1376582792, false, $$c((byte) 49, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i11++;
                }
                i2 = 2;
                i6 = 0;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr2, i7, cArr4, 0, i8);
        if (bArr != null) {
            int i13 = $11 + 61;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i8];
                b2 = 1;
                mVar.f19943d = 1;
            } else {
                b2 = 1;
                cArr = new char[i8];
                mVar.f19943d = 0;
            }
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == b2) {
                    int i14 = mVar.f19943d;
                    char c3 = cArr4[mVar.f19943d];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c3);
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a(10 - ImageFormat.getBitsPerPixel(0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(835 - ExpandableListView.getPackedPositionChild(0L), (char) (27279 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getOffsetAfter("", 0) + 11, -1210801192, false, $$c((byte) 53, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 21, (char) (Color.alpha(0) + 35715), (ViewConfiguration.getTouchSlop() >> 8) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                b2 = 1;
            }
            cArr4 = cArr;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            System.arraycopy(cArr4, 0, cArr5, 0, i8);
            int i16 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr4, i16, i10);
            System.arraycopy(cArr5, i10, cArr4, 0, i16);
            int i17 = $11 + 95;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            int i19 = 0;
            loop2: while (true) {
                mVar.f19943d = i19;
                while (mVar.f19943d < i8) {
                    int i20 = $11 + 103;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr6[mVar.f19943d] = cArr4[(i8 >> mVar.f19943d) % 0];
                        int i21 = mVar.f19943d;
                        mVar.f19943d = 0;
                    }
                }
                cArr6[mVar.f19943d] = cArr4[(i8 - mVar.f19943d) - 1];
                i19 = mVar.f19943d + 1;
            }
            int i22 = $11 + 63;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 3 / 5;
            }
            cArr4 = cArr6;
        }
        if (i9 > 0) {
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i25 = $10 + 73;
                $11 = i25 % 128;
                int i26 = i25 % 2;
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                i24 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
