package o.ab;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.dd.g;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a<CB> extends e<CB> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f20065f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f20066g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f20067j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char f20068l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20069m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20070n = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$l(short r9, short r10, int r11) {
        /*
            int r0 = r10 * 3
            int r8 = r0 + 69
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r7 = o.ab.a.$$j
            int r0 = r9 * 4
            int r6 = r0 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L30
            r1 = r8
            r2 = r4
            r0 = r6
        L18:
            int r6 = r6 + r1
            int r0 = r0 + 1
            r1 = r2
            r8 = r6
            r6 = r0
        L1e:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L2b:
            r1 = r7[r6]
            r0 = r6
            r6 = r8
            goto L18
        L30:
            r1 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.a.$$l(short, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f20069m = 0;
        f20070n = 1;
        f20065f = (char) 36682;
        f20067j = (char) 23569;
        f20066g = (char) 43868;
        f20068l = (char) 53111;
    }

    public a(Context context, CB cb, o.en.b bVar, o.bg.e eVar) {
        super(context, cb, bVar, eVar);
    }

    public static void b(Context context, long j2, long j3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20069m + 71;
        f20070n = i3 % 128;
        long j4 = i3 % 2 == 0 ? j2 / (j3 >>> 19) : j2 ^ (j3 << 32);
        try {
            Method method = f.class.getMethod("a", null);
            method.setAccessible(true);
            if (((Boolean) method.invoke(null, null)).booleanValue()) {
                int i4 = f20070n + 1;
                f20069m = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                u("镜\uf05d尨㵷굫점쁛坺谦ᴄ\udc84\ue00b嵰耎", 13 - ExpandableListView.getPackedPositionType(0L), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(null);
                Object[] objArr2 = new Object[1];
                u("䐄㷀\u0cc9鱔镜\uf05d尨㵷굫점쁛坺谦ᴄ⥧╼վ豱䵮쁟毎恁鬯\ue4a9撱트뱩\u0a8eߨ硩", 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                Object[] objArr3 = {((String) objArr2[0]).intern()};
                Object[] objArr4 = new Object[1];
                u("ദ\ueb07➵ꄔ틊\uf3c2", Color.argb(0, 0, 0, 0) + 6, objArr4);
                Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(objNewInstance, objArr3);
                Object[] objArr5 = {Long.valueOf(j4)};
                Object[] objArr6 = new Object[1];
                u("ദ\ueb07➵ꄔ틊\uf3c2", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr6);
                Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                method3.setAccessible(true);
                Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                Object[] objArr7 = new Object[1];
                u("㐕瓒\udb1d䳘벒鵋瀦ﲟ", View.MeasureSpec.getMode(0) + 8, objArr7);
                Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                method4.setAccessible(true);
                Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                Method method5 = f.class.getMethod("c", String.class, Object.class);
                method5.setAccessible(true);
                method5.invoke(null, objArr8);
                int i6 = f20070n + 41;
                f20069m = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 4;
                }
            }
            byte b2 = (byte) 0;
            byte b3 = b2;
            byte b4 = (byte) ((-1) - (((-1) - b3) & ((-1) - 12)));
            Object[] objArr9 = new Object[1];
            v(b2, b3, b4, objArr9);
            Class<?> cls = Class.forName((String) objArr9[0]);
            int i8 = $$e;
            byte b5 = (byte) (5 & i8);
            byte b6 = b5;
            Object[] objArr10 = new Object[1];
            v(b5, b6, b6, objArr10);
            Method method6 = cls.getMethod((String) objArr10[0], null);
            method6.setAccessible(true);
            Object objInvoke3 = method6.invoke(null, null);
            int i9 = (int) j4;
            Object[] objArr11 = new Object[1];
            v(b2, b3, b4, objArr11);
            Class.forName((String) objArr11[0]).getField("c").setInt(objInvoke3, i9);
            Object[] objArr12 = new Object[1];
            v(b2, b3, b4, objArr12);
            Class<?> cls2 = Class.forName((String) objArr12[0]);
            byte b7 = (byte) (5 & i8);
            byte b8 = b7;
            Object[] objArr13 = new Object[1];
            v(b7, b8, b8, objArr13);
            Method method7 = cls2.getMethod((String) objArr13[0], null);
            method7.setAccessible(true);
            Object objInvoke4 = method7.invoke(null, null);
            Object[] objArr14 = new Object[1];
            v(b2, b3, b4, objArr14);
            Object objInvoke5 = context;
            if (Class.forName((String) objArr14[0]).getField("d").getBoolean(objInvoke4)) {
                return;
            }
            if (context == null) {
                int i10 = f20070n + 75;
                f20069m = i10 % 128;
                int i11 = i10 % 2;
                byte b9 = (byte) ((i8 + 5) - (5 | i8));
                byte b10 = b9;
                Object[] objArr15 = new Object[1];
                v(b9, b10, (byte) (b10 - 1), objArr15);
                Method method8 = o.en.b.class.getMethod((String) objArr15[0], null);
                method8.setAccessible(true);
                Object objInvoke6 = method8.invoke(null, null);
                byte b11 = (byte) ((i8 + 5) - (5 | i8));
                Object[] objArr16 = new Object[1];
                v(b11, b11, (byte) 14, objArr16);
                Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                method9.setAccessible(true);
                objInvoke5 = method9.invoke(objInvoke6, null);
            }
            if (objInvoke5 != null) {
                int i12 = f20070n + 21;
                f20069m = i12 % 128;
                int i13 = i12 % 2;
                Method method10 = o.dc.d.class.getMethod("a", null);
                method10.setAccessible(true);
                Object objInvoke7 = method10.invoke(null, null);
                Object[] objArr17 = {o.az.a.class.getField("b").get(null), g.class.getField("z").get(null)};
                Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, g.class);
                declaredConstructor2.setAccessible(true);
                Object[] objArr18 = {objInvoke5, declaredConstructor2.newInstance(objArr17), true};
                Method method11 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                method11.setAccessible(true);
                method11.invoke(objInvoke7, objArr18);
                Object[] objArr19 = new Object[1];
                v(b2, b3, b4, objArr19);
                Class<?> cls3 = Class.forName((String) objArr19[0]);
                byte b12 = (byte) ((-1) - (((-1) - 5) | ((-1) - i8)));
                byte b13 = b12;
                Object[] objArr20 = new Object[1];
                v(b12, b13, b13, objArr20);
                Method method12 = cls3.getMethod((String) objArr20[0], null);
                method12.setAccessible(true);
                Object objInvoke8 = method12.invoke(null, null);
                Object[] objArr21 = new Object[1];
                v(b2, b3, b4, objArr21);
                Class.forName((String) objArr21[0]).getField("d").setBoolean(objInvoke8, true);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$d = new byte[]{Ascii.NAK, 117, 119, 110, 59, MessagePack.Code.BIN32, -20, 60, MessagePack.Code.BIN8};
        $$e = 75;
    }

    static void init$1() {
        $$j = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$k = 61;
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        int i4 = $11 + 5;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i6 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 5;
        }
        while (gVar.f19924d < cArr.length) {
            cArr3[i5] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = i5;
            while (i9 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[i5];
                int i10 = (c4 + i8) ^ ((c4 << 4) + ((char) (((long) f20066g) ^ (-7511683281764982996L))));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f20068l);
                    objArr2[c2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c3);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int defaultSize = 11 - View.getDefaultSize(i5, i5);
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$l = $$l(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 269, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), defaultSize, -1995022631, false, str$$l, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f20065f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20067j)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 270, (char) ExpandableListView.getPackedPositionGroup(0L), 11 - TextUtils.getTrimmedLength(""), -1995022631, false, $$l(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    c2 = 2;
                    i5 = 0;
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
                byte b7 = (byte) (b6 + 1);
                c2 = 2;
                objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2074123590, false, $$l(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            } else {
                c2 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(short r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 5
            int r8 = r0 + 4
            int r7 = r10 + 99
            int r1 = r9 * 5
            int r0 = 6 - r1
            byte[] r6 = o.ab.a.$$d
            byte[] r5 = new byte[r0]
            int r4 = 5 - r1
            r3 = 0
            if (r6 != 0) goto L2f
            r2 = r4
            r1 = r3
        L15:
            int r0 = -r7
            int r2 = r2 + r0
            int r7 = r2 + (-6)
            int r8 = r8 + 1
        L1b:
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r11[r3] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r6[r8]
            r2 = r7
            r7 = r0
            goto L15
        L2f:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.a.v(short, int, short, java.lang.Object[]):void");
    }

    public final void e(o.eq.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20069m + 101;
        f20070n = i3 % 128;
        int i4 = i3 % 2;
        h().e().j().a(bVar);
        h().e(b());
        int i5 = f20070n + 117;
        f20069m = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
