package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import o.a.f;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayInfoListener implements StatusListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f18571e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f18572f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18573g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18574h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18575i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f18576j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18577k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18578l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a<String> f18580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f18582d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, byte r10) {
        /*
            int r0 = r10 * 6
            int r7 = r0 + 67
            int r6 = r9 * 2
            int r1 = r6 + 1
            byte[] r5 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayInfoListener.$$a
            int r0 = r8 * 2
            int r4 = 4 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r5 != 0) goto L29
            r7 = r4
            r0 = r6
            r1 = r2
        L16:
            int r4 = r4 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r4]
            goto L16
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayInfoListener.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18578l = 0;
        f18577k = 1;
        f18574h = 0;
        f18575i = 1;
        d();
        TextUtils.indexOf((CharSequence) "", '0');
        int i2 = f18577k + 105;
        f18578l = i2 % 128;
        int i3 = i2 % 2;
    }

    protected SamsungPayInfoListener(b bVar, c.a<String> aVar, Boolean bool, String str) {
        this.f18579a = bVar;
        this.f18580b = aVar;
        this.f18582d = bool;
        this.f18581c = str;
    }

    static void d() {
        f18571e = new char[]{2537, 2523, 2511, 2505, 2487, 2508, 2501, 2538, 2483, 2531, 2500, 2509, 2542, 2499, 2486, 2503, 2504, 2330, 2517, 2510, 2521, 2319, 2544, 2317, 2485, 2534, 2484, 2502, 2553};
        f18573g = 2040400186;
        f18576j = true;
        f18572f = true;
    }

    static void init$0() {
        $$a = new byte[]{116, 109, 87, -103};
        $$b = 240;
    }

    private static void m(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str4.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f18571e;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(594 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)), (char) (13181 - Drawable.resolveOpacity(0, 0)), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 2;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f18573g)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - TextUtils.getOffsetBefore("", 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f18572f) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i11 = $11 + 89;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f18576j) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
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
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a(458 - (Process.myTid() >> 22), (char) (Process.getGidForName("") + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    public void onFail(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18575i + 3;
        f18574h = i4 % 128;
        int i5 = i4 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            m((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0091\u0090\u0086\u0090\u008f\u0084\u008e\u008d\u008c\u008b\u0086\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            m(KeyEvent.keyCodeFromString("") + 127, null, null, "\u0092\u0097\u0092\u0090\u009c\u008c\u009d\u0091\u008c\u0091\u0091\u0090\u0092\u0096\u0092\u009c\u0090\u0094\u008e\u0082\u008b\u0092\u008c\u008b\u0086\u008a\u0092\u008f\u0090\u0094\u0094\u0082\u0093\u0092\u008f\u0090\u0087", objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            m(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u0092\u0097\u0092\u0082\u008f\u0082\u009a\u0091\u008c\u0091\u0091\u0090\u0092\u0098\u0092", objArr3);
            o.ea.f.d(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(bundle.toString()).toString());
            int i6 = f18575i + 13;
            f18574h = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f18580b.d(new o.by.c(AntelopErrorCode.SamsungPayWalletNotAvailable));
    }

    public void onSuccess(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18574h + 85;
        f18575i = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            m(Color.blue(0) + 127, null, null, "\u0091\u0090\u0086\u0090\u008f\u0084\u008e\u008d\u008c\u008b\u0086\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            m(KeyEvent.getDeadChar(0, 0) + 127, null, null, "\u0092\u0097\u0092\u0084\u0085\u008f\u0082\u008f\u0084\u0092\u0096\u0092\u0084\u0084\u0090\u0095\u0095\u0085\u0084\u0092\u008c\u008b\u0086\u008a\u0092\u008f\u0090\u0094\u0094\u0082\u0093\u0092\u008f\u0090\u0087", objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            m(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0092\u0097\u0092\u0082\u008f\u0082\u009a\u008f\u0090\u0094\u0094\u0082\u0099\u0092\u0098\u0092", objArr3);
            o.ea.f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(bundle.toString()).toString());
        }
        if (!this.f18582d.booleanValue()) {
            String string = bundle.getString(this.f18581c);
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                m(127 - TextUtils.indexOf("", ""), null, null, "\u0091\u0090\u0086\u0090\u008f\u0084\u008e\u008d\u008c\u008b\u0086\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr5 = new Object[1];
                m(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0092\u0097\u0092\u009c\u008a\u0090\u0095\u008e\u009b\u0090\u009c\u0092\u0096\u0092\u009c\u008a\u0090\u0095\u008e\u009b\u0090\u009a\u0089\u0082\u0088\u0090\u0095\u008e\u009b\u0090\u009a\u008f\u0090\u0084\u0092\u0096\u0092\u0084\u0084\u0090\u0095\u0095\u0085\u0081\u0086\u008c", objArr5);
                o.ea.f.c(strIntern2, sb2.append(((String) objArr5[0]).intern()).append(string).toString());
            }
            this.f18579a.c(string);
            this.f18580b.a(string);
            return;
        }
        int i5 = f18575i + 9;
        f18574h = i5 % 128;
        if (i5 % 2 != 0) {
            bundle.getString(this.f18581c);
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        String string2 = bundle.getString(this.f18581c);
        if (o.ea.f.a()) {
            Object[] objArr6 = new Object[1];
            m(((Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u0091\u0090\u0086\u0090\u008f\u0084\u008e\u008d\u008c\u008b\u0086\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
            String strIntern3 = ((String) objArr6[0]).intern();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            m(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, "\u0092\u0097\u0092\u009c\u008a\u008f\u0090\u0094\u0094\u0082\u0099\u0092\u0096\u0092\u009c\u008a\u008f\u0090\u0094\u0094\u0082\u0093\u0089\u0082\u0088\u0090\u0095\u008e\u009b\u0090\u009a\u008f\u0090\u0084\u0092\u0096\u0092\u0084\u0084\u0090\u0095\u0095\u0085\u0081\u0086\u008c", objArr7);
            o.ea.f.c(strIntern3, sb3.append(((String) objArr7[0]).intern()).append(string2).toString());
        }
        this.f18579a.e(string2);
        this.f18580b.a(string2);
    }
}
