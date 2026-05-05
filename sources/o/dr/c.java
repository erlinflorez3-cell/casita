package o.dr;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.g;
import o.d.d;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23307b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23308c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f23309d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f23310e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23311f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23312g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23313h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23314i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f23315j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f23316a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r10, short r11, int r12) {
        /*
            int r0 = r12 * 2
            int r9 = 1 - r0
            int r0 = r10 * 3
            int r0 = 72 - r0
            byte[] r8 = o.dr.c.$$a
            int r1 = r11 * 4
            int r7 = 3 - r1
            byte[] r6 = new byte[r9]
            r5 = 0
            if (r8 != 0) goto L2e
            r2 = r7
            r1 = r9
            r4 = r5
        L16:
            int r0 = -r1
            int r7 = r7 + r0
            r3 = r4
            r0 = r7
            r7 = r2
        L1b:
            int r2 = r7 + 1
            int r4 = r3 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r4 != r9) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r1 = r8[r2]
            r7 = r0
            goto L16
        L2e:
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dr.c.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23311f = 0;
        f23314i = 1;
        f23312g = 0;
        f23313h = 1;
        a();
        Gravity.getAbsoluteGravity(0, 0);
        f23310e = new c();
        int i2 = f23311f + 39;
        f23314i = i2 % 128;
        int i3 = i2 % 2;
    }

    private c() {
    }

    static void a() {
        f23308c = (char) 50158;
        f23309d = (char) 23222;
        f23307b = (char) 61471;
        f23315j = (char) 22163;
    }

    public static c b() {
        int i2 = 2 % 2;
        int i3 = f23312g + 5;
        f23313h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (f23310e == null) {
            f23310e = new c();
        }
        c cVar = f23310e;
        int i4 = f23313h + 57;
        f23312g = i4 % 128;
        int i5 = i4 % 2;
        return cVar;
    }

    static void init$0() {
        $$a = new byte[]{44, -120, 71, -108};
        $$b = 236;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        int i4 = $11 + 5;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[0];
                int i10 = (c4 + i8) ^ ((c4 << 4) + ((char) (((long) f23307b) ^ (-7511683281764982996L))));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f23315j);
                    objArr2[c2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(View.resolveSizeAndState(0, 0, 0) + 270, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f23308c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23309d)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = d.a(270 - TextUtils.indexOf("", ""), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), KeyEvent.getDeadChar(0, 0) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i12 = $11 + 87;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    c2 = 2;
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
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(MotionEvent.axisFromString("") + 271, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            c2 = 2;
        }
        String str3 = new String(cArr2, 0, i2);
        int i14 = $11 + 105;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i15 = 19 / 0;
            objArr[0] = str3;
        }
    }

    public final void d() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f23312g + 45;
        f23313h = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f23313h + 61;
            f23312g = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                k("Ꚕ艰㞗⠰⪝ᜇv仺喝ꧯ㡪ハ❑鎣쬓玗ꍭᾆ┻瓶䉑敭撼ᩌ雽ퟶ❑鎣\uda2f┚\ue7a3\uf3ab", 29 >> View.getDefaultSize(1, 1), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k("팓⎶ￌⶴ詶熀尘㹘岔ﴥ儃ꦥᑿ㊸┻瓶Ꚓ䞞ᯤ㵒팓⎶趠賄戡\uf21f쿱ᰨꚷ鞟", 40 - Color.argb(0, 0, 0, 0), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                k("Ꚕ艰㞗⠰⪝ᜇv仺喝ꧯ㡪ハ❑鎣쬓玗ꍭᾆ┻瓶䉑敭撼ᩌ雽ퟶ❑鎣\uda2f┚\ue7a3\uf3ab", View.getDefaultSize(0, 0) + 31, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k("팓⎶ￌⶴ詶熀尘㹘岔ﴥ儃ꦥᑿ㊸┻瓶Ꚓ䞞ᯤ㵒팓⎶趠賄戡\uf21f쿱ᰨꚷ鞟", Color.argb(0, 0, 0, 0) + 29, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        this.f23316a = null;
        int i6 = f23313h + 47;
        f23312g = i6 % 128;
        int i7 = i6 % 2;
    }
}
