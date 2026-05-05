package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.samsung.android.sdk.samsungpay.v2.card.GetCardListener;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import java.util.List;
import o.a.k;
import o.a.l;
import o.ea.f;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayGetCardListener implements GetCardListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f18563a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f18564d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18565e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18566g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18567i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18568j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a<List<o.es.e>> f18569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f18570c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r0 = r7 * 2
            int r7 = 3 - r0
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r5 = r8 + 107
            byte[] r4 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayGetCardListener.$$a
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L29
            r5 = r6
            r0 = r7
            r1 = r2
        L14:
            int r7 = r7 + r5
            r5 = r7
            r7 = r0
        L17:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r0 = r7 + 1
            int r1 = r1 + 1
            r7 = r4[r0]
            goto L14
        L29:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayGetCardListener.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18567i = 0;
        f18568j = 1;
        f18565e = 0;
        f18566g = 1;
        a();
        Color.red(0);
        int i2 = f18567i + 41;
        f18568j = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected SamsungPayGetCardListener(b bVar, c.a<List<o.es.e>> aVar) {
        this.f18570c = bVar;
        this.f18569b = aVar;
    }

    static void a() {
        f18564d = -8716056953047053271L;
        f18563a = new int[]{-439147755, 1487249510, 1498584777, 1541172402, 378876637, -278635808, -1919007825, -987722642, -303113319, 1014538418, -549372628, -366569001, -1435756110, 1007077158, -490687263, 1021756458, -1734295617, -2100127584};
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $11 + 111;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        k kVar = new k();
        char[] cArrC = k.c(f18564d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f18564d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Drawable.resolveOpacity(0, 0) + 229, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51004), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, 522683165, false, $$c(b4, b5, (byte) (7 | b5)), new Class[]{Object.class, Object.class});
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
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i7 = $11 + 115;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i8 = 61 / 0;
            objArr[0] = str3;
        }
    }

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f18563a;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((-16776541) - Color.rgb(0, 0, 0), (char) View.MeasureSpec.getMode(0), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -328001469, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 14)))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f18563a;
        if (iArr5 != null) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 31;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.getTrimmedLength("") + 675, (char) KeyEvent.keyCodeFromString(""), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -328001469, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 14)))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i11 /= 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, -328001469, false, $$c(b6, b7, (byte) ((b7 + Ascii.SO) - (b7 & Ascii.SO))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 95;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(301 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (52697 - ExpandableListView.getPackedPositionGroup(0L)), 11 - (ViewConfiguration.getTouchSlop() >> 8), -1416256172, false, $$c(b8, b9, (byte) ((b9 + Ascii.FF) - (12 & b9))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
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
                byte b10 = (byte) 0;
                objA5 = o.d.d.a(229 - Drawable.resolveOpacity(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 51005), (-16777207) - Color.rgb(0, 0, 0), -330018025, false, $$c(b10, b10, $$a[1]), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{123, 10, 108, -85};
        $$b = 247;
    }

    public void onFail(int i2, Bundle bundle) throws Throwable {
        String string;
        int i3 = 2 % 2;
        int i4 = f18566g + 9;
        f18565e = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f("顸↙頫㾫蟿무垁ഋ\ue141뙨㉪莔檁ㄋꢆ᩵\uf3e8꯭⼔鄮紬≖Ꙁ៛왰崳Ჳ\uee91係", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            h(new int[]{191124659, -963860565, 777947908, 778935470, -883922765, 44900257, 1448045709, -2043100587, -1441538740, -1734213787, -170888238, 213246876, -737559156, -362888057, 423499774, -2005927820, 258478293, 1826968791, 1054408303, 1069234922}, View.getDefaultSize(0, 0) + 39, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            f("뤐貎뤰鋰⠦ᒠ쮊鄑쀩᭿鶰ᾣ䯭鱅ܢ蘻", -ExpandableListView.getPackedPositionChild(0L), objArr3);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern());
            if (bundle == null) {
                int i6 = f18565e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f18566g = i6 % 128;
                if (i6 % 2 == 0) {
                    ExpandableListView.getPackedPositionType(0L);
                    Object[] objArr4 = new Object[1];
                    f("\ue4ac듭\ue4c2\uaacbך㤐ଘ再", 0, objArr4);
                    string = ((String) objArr4[0]).intern();
                } else {
                    Object[] objArr5 = new Object[1];
                    f("\ue4ac듭\ue4c2\uaacbך㤐ଘ再", ExpandableListView.getPackedPositionType(0L) + 1, objArr5);
                    string = ((String) objArr5[0]).intern();
                }
            } else {
                string = bundle.toString();
                int i7 = f18565e + 105;
                f18566g = i7 % 128;
                int i8 = i7 % 2;
            }
            f.c(strIntern, sbAppend2.append(string).toString());
        }
        this.f18569b.d(new o.by.c(AntelopErrorCode.SamsungPayWalletNotAvailable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01dc, code lost:
    
        r1 = 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.util.List<com.samsung.android.sdk.samsungpay.v2.card.Card> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayGetCardListener.onSuccess(java.util.List):void");
    }
}
