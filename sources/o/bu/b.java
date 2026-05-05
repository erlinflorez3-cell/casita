package o.bu;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.ea.f;
import o.ea.m;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f21660a = 0;

    /* JADX INFO: renamed from: b */
    private static int f21661b = 0;

    /* JADX INFO: renamed from: c */
    private static long f21662c = 0;

    /* JADX INFO: renamed from: d */
    private static int f21663d = 0;

    /* JADX INFO: renamed from: e */
    private static int f21664e = 0;

    /* JADX INFO: renamed from: k */
    public static int f21665k = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, int r6, short r7) {
        /*
            int r2 = r7 * 3
            int r1 = 1 - r2
            int r0 = r5 * 4
            int r7 = 4 - r0
            int r0 = r6 * 7
            int r0 = r0 + 107
            byte[] r6 = o.bu.b.$$c
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r6 != 0) goto L2b
            r1 = r7
            r0 = r3
        L18:
            int r7 = r7 + r0
            int r1 = r1 + 1
        L1b:
            int r2 = r2 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r2 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r6[r1]
            goto L18
        L2b:
            r1 = r7
            r7 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.b.$$i(byte, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f21665k = 383858201;
        init$0();
        f21661b = 0;
        f21660a = 1;
        f21663d = 0;
        f21664e = 1;
        c();
        ViewConfiguration.getMaximumDrawingCacheSize();
        int i2 = f21661b + 7;
        f21660a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String b(Context context) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("61V)`\u0006iL\u0018YM\u00184\u0012{\u001e\u0018W\u007f]q\u0010/", (short) (C1633zX.Xd() ^ (-10756)), (short) (C1633zX.Xd() ^ (-25000)))).getMethod(C1626yg.Ud("H?\u001b$gc~xKxs\u0019\u0007-", (short) (C1499aX.Xd() ^ (-17435)), (short) (C1499aX.Xd() ^ (-7467))), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(context, objArr));
            o.ea.c.a();
            int i3 = o.ea.b.f23483d * (-465297448);
            o.ea.b.f23483d = i3;
            int i4 = (-1596292587) * o.ea.b.f23480a;
            o.ea.b.f23480a = i4;
            String string = sbAppend.append((String) o.ea.b.a(i4, 1544988355, i3, new Object[]{context}, (int) Runtime.getRuntime().freeMemory(), Thread.activeCount(), -1544988354)).toString();
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                l(Ig.wd("㱝\ue391횀⮱ҋ콑鱚\ue1dc읰︆兲ᚖ皏䭃뛆膁\ue96e쵺㱶\uf425", (short) (ZN.Xd() ^ 24534)), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                int iRgb = ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0);
                Object[] objArr3 = new Object[1];
                short sXd = (short) (C1580rY.Xd() ^ (-5432));
                int[] iArr = new int["蚠䦑⠏\ue87d᪕鈔讐ꄕꆁᙊೇﶒా഻ꤍꊙ馁鵇☂\u243f\u0ae5엳蚂뛡镉契便㫮ﲔǎ鹔큞踇".length()];
                QB qb = new QB("蚠䦑⠏\ue87d᪕鈔讐ꄕꆁᙊೇﶒా഻ꤍꊙ馁鵇☂\u243f\u0ae5엳蚂뛡镉契便㫮ﲔǎ鹔큞踇");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + i5)) + xuXd.CK(iKK));
                    i5++;
                }
                l(new String(iArr, 0, i5), iRgb, objArr3);
                f.c(strIntern, sb2.append(((String) objArr3[0]).intern()).append(string).toString());
                int i6 = f21663d + 93;
                f21664e = i6 % 128;
                int i7 = i6 % 2;
            }
            return m.c(string);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void c() {
        f21662c = 4313439765340770190L;
    }

    protected static String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        new o.bo.e();
        String strC = o.bo.e.c(context);
        if (f.a()) {
            Object[] objArr = new Object[1];
            l("팷\udfdf퍱⫃ɂ酅岳ꒂ詩씈ᤋ퓖㳾ሥ脿䰡됳髒৷쐷", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            l("鶰旂鷗㸙롓薅⭚\uea15ふ닖\u0dc9ꌴ牿ꠢ闸㯌睊\u20c5ᴠ돮䊙\ud899ꕟ쮚쫒傩ⲗ䉓匴쥳뒣\uda2c\udb69䄈㳦刿⍂阮䐃\ueae3ꮎ燲찁拗㎰\ue9a0呰\uf546렵晃\udfe1ഠP", TextUtils.indexOf("", "", 0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(strC).toString());
        }
        if (strC != null) {
            return m.c(strC);
        }
        int i3 = f21664e + 67;
        int i4 = i3 % 128;
        f21663d = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 51;
        f21664e = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{93, 121, -117, 60};
        $$b = 72;
    }

    static void init$1() {
        $$g = new byte[]{68, -115, MessagePack.Code.BIN16, -123, MessagePack.Code.BIN16, Base64.padSymbol, 19, MessagePack.Code.FALSE, 60, MessagePack.Code.BIN32, Ascii.SYN, -10, Ascii.ETB, -11, Ascii.DC4};
        $$h = 158;
    }

    static void init$2() {
        $$c = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$f = 30;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 5;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f21662c ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21662c)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.getTrimmedLength("") + 229, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 51004), 8 - Process.getGidForName(""), 1749983833, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 675, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 522683165, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $11 + 87;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(byte r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 4
            int r0 = r9 * 4
            int r7 = 1 - r0
            int r0 = r10 * 3
            int r6 = 101 - r0
            byte[] r5 = o.bu.b.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L2b
            r0 = r7
            r2 = r3
        L15:
            int r8 = r8 + 1
            int r6 = r6 + r0
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r7) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            r0 = r5[r8]
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.b.m(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r2 = r6 * 11
            int r1 = 12 - r2
            byte[] r6 = o.bu.b.$$g
            int r0 = r7 * 11
            int r5 = 15 - r0
            int r0 = 111 - r8
            byte[] r4 = new byte[r1]
            int r3 = 11 - r2
            r2 = -1
            if (r6 != 0) goto L2d
            r0 = r3
            r1 = r5
        L15:
            int r5 = r5 + r0
            int r5 = r5 + (-6)
            int r1 = r1 + 1
        L1a:
            int r2 = r2 + 1
            byte r0 = (byte) r5
            r4[r2] = r0
            if (r2 != r3) goto L2a
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r4, r0)
            r9[r0] = r1
            return
        L2a:
            r0 = r6[r1]
            goto L15
        L2d:
            r1 = r5
            r5 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.b.n(int, short, int, java.lang.Object[]):void");
    }

    public abstract String a(Context context) throws c;

    /* JADX WARN: Removed duplicated region for block: B:143:0x03ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(android.content.Context r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.b.c(android.content.Context):java.lang.String");
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    abstract int d();

    public abstract String e(Context context) throws o.bo.f, c;

    public abstract String e(Context context, boolean z2) throws c;

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f21664e + 85;
        int i4 = i3 % 128;
        f21663d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i5 = i4 + 97;
            f21664e = i5 % 128;
            int i6 = i5 % 2;
            if (getClass() == obj.getClass()) {
                if (d() == ((a) obj).d()) {
                    return true;
                }
                int i7 = f21663d + 61;
                f21664e = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        int i8 = f21664e + 67;
        f21663d = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21663d + 23;
        f21664e = i3 % 128;
        if (i3 % 2 == 0) {
            super.finalize();
            int i4 = 37 / 0;
        } else {
            super.finalize();
        }
        int i5 = f21663d + 27;
        f21664e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public final int hashCode() {
        int iHash;
        int i2 = 2 % 2;
        int i3 = f21663d + 85;
        f21664e = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = Integer.valueOf(d());
            iHash = Objects.hash(objArr);
        } else {
            iHash = Objects.hash(Integer.valueOf(d()));
        }
        int i4 = f21663d + 13;
        f21664e = i4 % 128;
        if (i4 % 2 != 0) {
            return iHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f21663d + 97;
        f21664e = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        return string;
    }
}
