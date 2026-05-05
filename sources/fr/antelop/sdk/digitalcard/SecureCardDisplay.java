package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.util.ResourcesHelper;
import java.lang.reflect.Method;
import java.util.List;
import o.a.k;
import o.d.d;
import o.ea.m;
import o.eb.b;
import o.y.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCardDisplay implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f19144a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19145b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19146c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f19147d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f19148e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19149f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19150g = 0;
    private CustomerAuthenticatedProcessActivityCallback activityCallback;
    private Rect anchorCardViewRect;
    private Drawable cardDrawable = null;
    private Integer cardForegroundColor = null;
    private boolean endedOnTouchOutside = true;
    private final j<b> innerSecureDigitalCardDisplay;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r9, short r10, byte r11) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.SecureCardDisplay.$$c
            int r0 = r11 * 7
            int r7 = 114 - r0
            int r0 = r10 * 4
            int r6 = 4 - r0
            int r5 = r9 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r8 != 0) goto L2b
            r0 = r7
            r2 = r3
            r7 = r6
        L16:
            int r6 = r6 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1b:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L28:
            r0 = r8[r6]
            goto L16
        L2b:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.$$g(int, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19150g = -308811;
        f19149f = -944263115;
        f19148e = -1998804438;
        f19146c = -557726750;
        init$0();
        f19144a = 0;
        f19145b = 1;
        f19147d = 2109729189890888210L;
    }

    public SecureCardDisplay(j<b> jVar) {
        this.innerSecureDigitalCardDisplay = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 3
            int r8 = 4 - r0
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardDisplay.$$a
            int r0 = r11 + 97
            int r2 = r9 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2d
            r3 = r4
            r2 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r3
            int r8 = r8 + 1
        L19:
            byte r1 = (byte) r0
            r6[r2] = r1
            if (r2 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L26:
            int r2 = r2 + 1
            r1 = r7[r8]
            r3 = r0
            r0 = r1
            goto L15
        L2d:
            r2 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.h(short, byte, short, java.lang.Object[]):void");
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f19147d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i4 = $11 + 51;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19147d)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 229, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 51004), (ViewConfiguration.getJumpTapTimeout() >> 16) + 9, 1749983833, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(675 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - Process.getGidForName("")), View.combineMeasuredStates(0, 0) + 12, 522683165, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $11 + 37;
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
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i9 = $11 + 7;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i10 = 97 / 0;
            objArr[0] = str3;
        }
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 44;
    }

    static void init$1() {
        $$d = new byte[]{117, -6, 58, MessagePack.Code.MAP32, MessagePack.Code.NEVER_USED, 55, 2, MessagePack.Code.UINT16, 56, MessagePack.Code.FALSE, 17, MessagePack.Code.NEVER_USED, 56, Ascii.SYN, -72, 53, Ascii.SO, -66, 53, Ascii.SI, 8, -13, 9, 5, 3, MessagePack.Code.NIL, 71, -13, 9, MessagePack.Code.BIN16, 56, 7, 0, 4, Ascii.CR, -17, Ascii.CR, -7, 0, 19, -12, MessagePack.Code.UINT8, 39, Ascii.DC4, 0, Ascii.DC4, -1, -11, -15, Ascii.GS, -2, -4, Ascii.VT, -26, Ascii.NAK, 16, 4, -6, -6};
        $$e = 46;
    }

    static void init$2() {
        $$c = new byte[]{120, 46, 101, 90};
        $$f = 35;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(byte r9, short r10, byte r11, java.lang.Object[] r12) {
        /*
            int r8 = 44 - r11
            int r7 = 111 - r10
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureCardDisplay.$$d
            int r5 = r9 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L29
            r2 = r5
            r7 = r8
            r1 = r3
        L10:
            int r7 = r7 + r5
            int r5 = r2 + 1
            int r7 = r7 + (-2)
        L15:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L24:
            r0 = r6[r5]
            r2 = r5
            r5 = r0
            goto L10
        L29:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.j(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        int i2 = 2 % 2;
        int i3 = f19145b + 61;
        f19144a = i3 % 128;
        int i4 = i3 % 2;
        List<CustomerAuthenticationMethodType> listB = m.b(this.innerSecureDigitalCardDisplay.d());
        int i5 = f19145b + 103;
        f19144a = i5 % 128;
        if (i5 % 2 == 0) {
            return listB;
        }
        throw null;
    }

    public final CancellationSignal getCancellationSignal() {
        int i2 = 2 % 2;
        int i3 = f19145b + 63;
        f19144a = i3 % 128;
        int i4 = i3 % 2;
        CancellationSignal cancellationSignalL = this.innerSecureDigitalCardDisplay.l();
        int i5 = f19144a + 111;
        f19145b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return cancellationSignalL;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19145b + 39;
        f19144a = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.innerSecureDigitalCardDisplay.g();
        int i5 = f19145b + 59;
        f19144a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19145b;
        int i4 = i3 + 59;
        f19144a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 55;
        f19144a = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a A[PHI: r16
  0x006a: PHI (r16v14 long) = (r16v0 long), (r16v17 long) binds: [B:17:0x00e9, B:8:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean, int] */
    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOnline() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.isOnline():boolean");
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        j<b> jVar = this.innerSecureDigitalCardDisplay;
        o.x.d dVar = new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardDisplay);
        this.innerSecureDigitalCardDisplay.m();
        jVar.c(context, dVar, new b());
        int i3 = f19144a + 97;
        f19145b = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19144a + 13;
        f19145b = i3 % 128;
        int i4 = i3 % 2;
        if (this.innerSecureDigitalCardDisplay.o() != null) {
            int i5 = f19144a + 93;
            f19145b = i5 % 128;
            if (i5 % 2 == 0) {
                this.cardDrawable = this.innerSecureDigitalCardDisplay.o().e(context);
                int i6 = 45 / 0;
            } else {
                this.cardDrawable = this.innerSecureDigitalCardDisplay.o().e(context);
            }
            int i7 = f19144a + 81;
            f19145b = i7 % 128;
            int i8 = i7 % 2;
        }
        j<b> jVar = this.innerSecureDigitalCardDisplay;
        o.x.j jVar2 = new o.x.j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardDisplay);
        this.innerSecureDigitalCardDisplay.m();
        jVar.c(context, jVar2, new b());
    }

    public final SecureCardDisplay setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int i2 = 2 % 2;
        int i3 = f19145b + 21;
        int i4 = i3 % 128;
        f19144a = i4;
        if (i3 % 2 != 0) {
            this.activityCallback = customerAuthenticatedProcessActivityCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.activityCallback = customerAuthenticatedProcessActivityCallback;
        int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f19145b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final SecureCardDisplay setAnchorCardView(Activity activity, View view) {
        int i2 = 2 % 2;
        int i3 = f19144a + 33;
        f19145b = i3 % 128;
        int i4 = i3 % 2;
        if (view == null) {
            throw new RuntimeException("Null provided");
        }
        this.anchorCardViewRect = ResourcesHelper.getLocalRectForView(activity, view);
        this.endedOnTouchOutside = true;
        int i5 = f19144a + 85;
        f19145b = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final SecureCardDisplay setAnchorCardView(Rect rect) {
        int i2 = 2 % 2;
        int i3 = f19144a;
        int i4 = i3 + 25;
        f19145b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (rect == null) {
            throw new RuntimeException("Null provided");
        }
        this.anchorCardViewRect = rect;
        this.endedOnTouchOutside = true;
        int i5 = i3 + 79;
        f19145b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Deprecated
    public final SecureCardDisplay setAnchorCardView(View view) {
        int i2 = 2 % 2;
        int i3 = f19144a + 7;
        f19145b = i3 % 128;
        int i4 = i3 % 2;
        if (view == null) {
            throw new RuntimeException("Null provided");
        }
        this.anchorCardViewRect = ResourcesHelper.getLocalRectForView(null, view);
        int i5 = f19145b + 93;
        f19144a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return this;
    }

    public final SecureCardDisplay setCardBackground(Drawable drawable) {
        int i2 = 2 % 2;
        int i3 = f19144a + 31;
        int i4 = i3 % 128;
        f19145b = i4;
        if (i3 % 2 == 0) {
            this.cardDrawable = drawable;
            int i5 = 26 / 0;
        } else {
            this.cardDrawable = drawable;
        }
        int i6 = i4 + 11;
        f19144a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.digitalcard.SecureCardDisplay setCardForegroundColor(java.lang.Integer r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.setCardForegroundColor(java.lang.Integer):fr.antelop.sdk.digitalcard.SecureCardDisplay");
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19144a + 103;
        f19145b = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSecureDigitalCardDisplay.e(context, customerAuthenticationCredentials);
            int i4 = 69 / 0;
        } else {
            this.innerSecureDigitalCardDisplay.e(context, customerAuthenticationCredentials);
        }
        int i5 = f19145b + 19;
        f19144a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.digitalcard.SecureCardDisplay setEndedOnTouchOutside(boolean r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardDisplay.setEndedOnTouchOutside(boolean):fr.antelop.sdk.digitalcard.SecureCardDisplay");
    }
}
