package o.fm;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import fr.antelop.sdk.settings.WalletSettingsRights;
import fr.antelop.sdk.settings.WalletSettingsValue;
import java.lang.reflect.Method;
import java.util.Currency;
import o.a.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<b> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26033a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f26034c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static /* synthetic */ boolean f26035d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f26036f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f26037g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26038h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26039i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26040j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26041n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Currency f26042b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o.ei.c f26043e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            byte[] r7 = o.fm.b.$$a
            int r2 = r9 * 2
            int r1 = 1 - r2
            int r0 = r10 * 6
            int r6 = r0 + 67
            int r0 = r8 * 3
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r7 != 0) goto L2a
            r0 = r2
            r1 = r3
        L17:
            int r6 = r6 + r0
            int r5 = r5 + 1
        L1a:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r7[r5]
            goto L17
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26039i = 0;
        f26041n = 1;
        f26040j = 0;
        f26038h = 1;
        a();
        TextUtils.getCapsMode("", 0, 0);
        int i2 = f26039i + 95;
        f26041n = i2 % 128;
        int i3 = 2 % 2;
        f26035d = i2 % 2 != 0;
    }

    b() {
        super(false);
        this.f26042b = null;
        this.f26043e = null;
    }

    public b(Currency currency) {
        super(true);
        this.f26042b = currency;
        this.f26043e = o.ei.c.e(currency.getCurrencyCode());
    }

    static void a() {
        f26034c = new char[]{2099, 2078, 2090, 2092, 2067, 2088, 2159, 2077, 2065, 2075, 2068, 2053, 2091};
        f26033a = 2040400271;
        f26037g = true;
        f26036f = true;
    }

    private Currency e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26040j + 47;
        f26038h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, "\u008d\u0086\u008c\u008b\u0085\u0084\u008b\u008a\u008b\u0089\u008b\u0087\u008a\u0082\u0089\u0087\u0086\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        c(((String) objArr[0]).intern());
        if (!f26035d && this.f26042b == null) {
            throw new AssertionError();
        }
        Currency currency = this.f26042b;
        int i5 = f26040j + 43;
        f26038h = i5 % 128;
        if (i5 % 2 != 0) {
            return currency;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 86;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
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
        f fVar = new f();
        char[] cArr2 = f26034c;
        long j2 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1)) + IptcDirectory.TAG_BY_LINE, (char) (Gravity.getAbsoluteGravity(0, 0) + 13181), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $11 + 77;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 5;
                    }
                    j2 = -1;
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
        Object[] objArr3 = {Integer.valueOf(f26033a)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getMode(0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f26036f) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 458, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f26037g) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
                int i9 = $11 + 107;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i11 = $11 + 75;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e >> 1) << fVar.f19922a] % i2] % iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(458 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 12, -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 457, (char) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 11, -1923924106, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            int i12 = $11 + 73;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 / 2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final boolean b(b bVar) {
        int i2 = 2 % 2;
        int i3 = f26038h + 97;
        f26040j = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = this.f26042b.getCurrencyCode().equals(bVar.f26042b.getCurrencyCode());
        int i5 = f26038h + 115;
        f26040j = i5 % 128;
        if (i5 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public final WalletSettingsValue<Currency> d() throws Throwable {
        Currency currencyE;
        int i2 = 2 % 2;
        int i3 = f26040j + 21;
        f26038h = i3 % 128;
        int i4 = i3 % 2;
        try {
            currencyE = e();
            int i5 = f26040j + 53;
            f26038h = i5 % 128;
            int i6 = i5 % 2;
        } catch (o.en.j unused) {
            currencyE = null;
        }
        return new WalletSettingsValue<>(currencyE, WalletSettingsRights.ReadOnly);
    }
}
