package o.br;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.configuration.AntelopConfiguration;
import fr.antelop.sdk.configuration.AntelopConfigurationManager;
import java.lang.reflect.Method;
import o.a.m;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f21579a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21580b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21581c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21582d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21583e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, int r11) {
        /*
            int r0 = r9 * 3
            int r9 = r0 + 1
            byte[] r8 = o.br.e.$$a
            int r0 = r11 * 4
            int r7 = r0 + 116
            int r0 = r10 * 3
            int r6 = 3 - r0
            byte[] r5 = new byte[r9]
            r4 = 0
            if (r8 != 0) goto L2e
            r0 = r7
            r3 = r4
            r2 = r6
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r3
            r7 = r6
            r6 = r2
        L1b:
            int r3 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r6 + 1
            if (r3 != r9) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L2a:
            r0 = r8[r2]
            r6 = r7
            goto L16
        L2e:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.e.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21582d = 0;
        f21583e = 1;
        f21581c = 0;
        f21580b = 1;
        h();
        int i2 = f21583e + 29;
        f21582d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f21579a;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionType(j2) + 249, (char) ((ExpandableListView.getPackedPositionForChild(i5, i5) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j2 ? 0 : -1)) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 10, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i5 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                if (bArr[mVar.f19943d] == 1) {
                    int i11 = $10 + 47;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 12, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i12] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i13 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a(10 - TextUtils.lastIndexOf("", '0', 0, 0), (char) KeyEvent.getDeadChar(0, 0), TextUtils.getTrimmedLength("") + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA4 = o.d.d.a(836 - View.MeasureSpec.getSize(0), (char) (27280 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -1210801192, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a(View.combineMeasuredStates(0, 0) + 21, (char) (35716 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            int i15 = $10 + 115;
            $11 = i15 % 128;
            i2 = 2;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        } else {
            i2 = 2;
        }
        if (i9 > 0) {
            int i17 = $10 + 99;
            $11 = i17 % 128;
            if (i17 % i2 == 0) {
                char[] cArr5 = new char[i7];
                i3 = 0;
                System.arraycopy(cArr3, 0, cArr5, 1, i7);
                System.arraycopy(cArr5, 0, cArr3, i7 / i9, i9);
                System.arraycopy(cArr5, i9, cArr3, 1, i7 * i9);
            } else {
                i3 = 0;
                char[] cArr6 = new char[i7];
                System.arraycopy(cArr3, 0, cArr6, 0, i7);
                int i18 = i7 - i9;
                System.arraycopy(cArr6, 0, cArr3, i18, i9);
                System.arraycopy(cArr6, i9, cArr3, 0, i18);
            }
        } else {
            i3 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i7];
            mVar.f19943d = i3;
            while (mVar.f19943d < i7) {
                cArr7[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                mVar.f19943d++;
            }
            cArr3 = cArr7;
        }
        if (i8 > 0) {
            int i19 = $11 + 57;
            $10 = i19 % 128;
            int i20 = i19 % 2 != 0 ? 1 : 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i21 = $10 + 57;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i20 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void h() {
        f21579a = new char[]{56545, 56361, 56360, 56384, 56369, 56371, 56385, 56385, 56382, 56379, 56377, 56356, 56361, 56382, 56378, 56375, 56376, 56382, 56387, 56377, 56378, 56382, 56380, 56382, 56367, 56369, 56384, 56386, 56383, 56374, 56372};
    }

    static void init$0() {
        $$a = new byte[]{4, 39, -92, -86};
        $$b = 249;
    }

    @Override // o.br.c
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f21580b + 19;
        f21581c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            AntelopConfigurationManager.get();
            throw null;
        }
        AntelopConfiguration antelopConfiguration = AntelopConfigurationManager.get();
        if (antelopConfiguration == null) {
            return null;
        }
        String applicationId = antelopConfiguration.getApplicationId();
        int i4 = f21580b + 83;
        f21581c = i4 % 128;
        if (i4 % 2 == 0) {
            return applicationId;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f21580b + 111;
        f21581c = i3 % 128;
        int i4 = i3 % 2;
        AntelopConfiguration antelopConfiguration = AntelopConfigurationManager.get();
        if (antelopConfiguration != null) {
            return antelopConfiguration.getIssuerId();
        }
        int i5 = f21581c + 21;
        f21580b = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.br.c
    public final o.bk.c c() {
        int i2 = 2 % 2;
        int i3 = f21580b;
        int i4 = i3 + 5;
        f21581c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        f21581c = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final String d() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21581c + 79;
        f21580b = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            f("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 31, 80, 1}, true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 31, 80, 1}, false, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f21580b + 65;
        f21581c = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // o.br.c
    public final void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f21581c + 115;
        f21580b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.br.c
    public final o.bk.a e() {
        int i2 = 2 % 2;
        int i3 = f21581c;
        int i4 = i3 + 53;
        f21580b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        f21580b = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }
}
