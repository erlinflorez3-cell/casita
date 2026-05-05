package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import o.ap.h;
import o.ea.f;
import o.ea.j;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f18599i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18600k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18601l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char[] f18602m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18603n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f18604o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, int r9, short r10) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 116
            byte[] r7 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.a.$$h
            int r0 = r10 * 3
            int r6 = 4 - r0
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L2c
            r2 = r6
            r1 = r4
        L17:
            int r8 = r8 + r6
            int r6 = r2 + 1
        L1a:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r7[r6]
            r2 = r6
            r6 = r0
            goto L17
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.a.$$j(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18603n = 0;
        f18604o = 1;
        f18601l = 0;
        f18600k = 1;
        d();
        f18599i = new a();
        int i2 = f18603n + 117;
        f18604o = i2 % 128;
        int i3 = i2 % 2;
    }

    private void a(Activity activity, c.InterfaceC0350c interfaceC0350c, o.ep.d dVar, h.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18601l + 115;
        f18600k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f18601l + 115;
            f18600k = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 16, 137, 0}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{109, 10, 88, 0}, true, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        f18605b.addCard(a(eVar), new SamsungPayAddCardListener(activity, this, dVar.s().d(), interfaceC0350c));
    }

    static void d() {
        f18602m = new char[]{56558, 56419, 56432, 56441, 56445, 56442, 56435, 56420, 56417, 56438, 56433, 56421, 56431, 56437, 56433, 56437, 56536, 56371, 56375, 56372, 56365, 56374, 56378, 56363, 56368, 56383, 56380, 56372, 56368, 56363, 56364, 56371, 56374, 56365, 56326, 56716, 56722, 56715, 56706, 56716, 56722, 56718, 56722, 56708, 56705, 56720, 56720, 56429, 56396, 56396, 56433, 56722, 56716, 56722, 56718, 56722, 56432, 56403, 56403, 56464, 56493, 56493, 56524, 56559, 56552, 56517, 56487, 56487, 56505, 56564, 56564, 56554, 56554, 56547, 56547, 56556, 56552, 56556, 56550, 56540, 56552, 56557, 56536, 56538, 56548, 56550, 56559, 56557, 56532, 56540, 56556, 56550, 56333, 56324, 56330, 56334, 56563, 56323, 56324, 56331, 56331, 56334, 56337, 56333, 56548, 56339, 56324, 56326, 56338, 56512, CharCompanionObject.MIN_LOW_SURROGATE, 56350, 56387, 56385, 56362, 56365, 56389, 56396, 56394};
    }

    public static a e(Context context) {
        int i2 = 2 % 2;
        int i3 = f18601l + 89;
        f18600k = i3 % 128;
        int i4 = i3 % 2;
        if (f18605b == null) {
            int i5 = f18601l + 31;
            f18600k = i5 % 128;
            if (i5 % 2 == 0) {
                f18599i.b(context);
                int i6 = 3 / 0;
            } else {
                f18599i.b(context);
            }
        }
        return f18599i;
    }

    static void init$0() {
        $$h = new byte[]{7, -110, 9, 72};
        $$i = 203;
    }

    private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f18602m;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int maxKeyCode = 249 - (KeyEvent.getMaxKeyCode() >> 16);
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i4, i4);
                        int i12 = (TypedValue.complexToFraction(i4, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i4, f2, f2) == f2 ? 0 : -1)) + 11;
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objA = o.d.d.a(maxKeyCode, cMakeMeasureSpec, i12, 1376582792, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i4 = 0;
                    f2 = 0.0f;
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
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            char[] cArr5 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                int i13 = $11 + 25;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i15 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 11, (char) (Process.getGidForName("") + 1), 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i15] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 836;
                        char c3 = (char) (27279 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int maxKeyCode2 = 11 - (KeyEvent.getMaxKeyCode() >> 16);
                        int i17 = $$i;
                        byte b4 = (byte) ((i17 + 5) - (i17 | 5));
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a(mode, c3, maxKeyCode2, -1210801192, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35714), TextUtils.lastIndexOf("", '0', 0, 0) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i18 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr4, i18, i8);
            System.arraycopy(cArr6, i8, cArr4, 0, i18);
        }
        if (z2) {
            int i19 = $10 + 103;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                cArr = new char[i6];
                i2 = 0;
            } else {
                i2 = 0;
                cArr = new char[i6];
            }
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr[mVar.f19943d] = cArr4[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i21 = $10 + 125;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] / iArr[5]);
                    i20 = mVar.f19943d;
                } else {
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                    i20 = mVar.f19943d + 1;
                }
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    public final void a(c.a<String> aVar, Boolean bool, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18601l + 1;
        f18600k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            String strB = b();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            v("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{34, 25, 166, 25}, false, objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(bool);
            Object[] objArr2 = new Object[1];
            v("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{59, 9, 0, 0}, true, objArr2);
            f.c(strB, sbAppend.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = f18600k + 17;
            f18601l = i5 % 128;
            int i6 = i5 % 2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.f18617d.getWalletInfo(arrayList, new SamsungPayInfoListener(this, aVar, bool, str));
        int i7 = f18601l + 103;
        f18600k = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    final String b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18600k + 65;
        f18601l = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            v("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 16, 137, 0}, true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            v("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 16, 137, 0}, false, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f18600k + 49;
        f18601l = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return strIntern;
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    protected final void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        super.b(context);
        f18605b = new CardManager(context, this.f18615a);
        int i3 = f18601l + 15;
        f18600k = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.es.c
    public final void c(c.a<List<o.es.e>> aVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f18601l + 71;
            f18600k = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                v("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 16, 137, 0}, false, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                v(null, new int[]{92, 17, 31, 16}, true, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                v("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 16, 137, 0}, false, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                v(null, new int[]{92, 17, 31, 16}, true, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        f18605b.getAllCards(new Bundle(), new SamsungPayGetCardListener(this, aVar));
        int i4 = f18601l + 13;
        f18600k = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.es.c
    public final void d(c.a<c.e> aVar) throws Throwable {
        String strB;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f18600k + 87;
            f18601l = i3 % 128;
            if (i3 % 2 != 0) {
                strB = b();
                Object[] objArr = new Object[1];
                v("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{68, 24, 0, 24}, false, objArr);
                obj = objArr[0];
            } else {
                strB = b();
                Object[] objArr2 = new Object[1];
                v("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{68, 24, 0, 24}, true, objArr2);
                obj = objArr2[0];
            }
            f.c(strB, ((String) obj).intern());
        }
        this.f18617d.getSamsungPayStatus(new SamsungPayStatusListener(aVar));
        int i4 = f18601l + 7;
        f18600k = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    @Override // fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b
    final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18600k + 33;
        f18601l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        v("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{16, 18, 99, 16}, false, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f18600k + 113;
        f18601l = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.es.c
    public final /* synthetic */ void e(Activity activity, c.InterfaceC0350c interfaceC0350c, j jVar, o.ep.d dVar, o.es.e eVar, h.e eVar2, o.ea.h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18601l + 5;
        f18600k = i3 % 128;
        int i4 = i3 % 2;
        a(activity, interfaceC0350c, dVar, eVar2);
        int i5 = f18601l + 99;
        f18600k = i5 % 128;
        int i6 = i5 % 2;
    }
}
