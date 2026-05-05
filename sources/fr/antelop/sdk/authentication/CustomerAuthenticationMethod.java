package fr.antelop.sdk.authentication;

import android.content.Context;
import android.graphics.Color;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.ForeignCurrencySupport;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.o;
import o.d.d;
import o.m.f;
import o.m.h;
import o.m.i;
import o.m.j;
import o.m.m;
import o.q.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerAuthenticationMethod {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final short CURRENT_ATTEMPT_COUNT_NOT_SET = -1;
    public static final short MAXIMUM_ATTEMPT_COUNT_NOT_SET = -1;

    @Deprecated
    public static final String NO_AUTHENTICATION_METHODE_NAME = "noAuthentication";

    /* JADX INFO: renamed from: a */
    private static int f18792a = 0;

    /* JADX INFO: renamed from: b */
    private static long f18793b = 0;

    /* JADX INFO: renamed from: c */
    public static int f18794c = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f18795d = null;

    /* JADX INFO: renamed from: e */
    private static int f18796e = 0;
    private final h innerCustomerAuthenticationMethod;

    public static final class CryptoObject {
        private final Cipher cipher;

        public CryptoObject(Cipher cipher) {
            this.cipher = cipher;
        }

        public final Cipher getCipher() {
            return this.cipher;
        }

        public final String toString() {
            return new StringBuilder("CryptoObject{cipher=").append(this.cipher).append(AbstractJsonLexerKt.END_OBJ).toString();
        }
    }

    private static String $$g(short s2, byte b2, byte b3) {
        int i2 = 4 - (s2 * 2);
        int i3 = b2 * 2;
        byte[] bArr = $$c;
        int i4 = b3 + 99;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = i5 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            byte b4 = bArr[i2];
            i2++;
            i4 += b4;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18794c = 56027633;
        init$0();
        f18792a = 0;
        f18796e = 1;
        f18795d = new char[]{19477, 7805, 59614, 47923, 1415, 53278, 41594, 3211, 57123, 43416, 29788, 50762, 37081, 25404, 52642, 38936, 27241, 13536, 34598, 20926, 15387, 36460, 21657, 1783, 61523, 41913, 7443, 51354, 47858, 5247, 51105, 45314, 27798, 57061, 34881, 31658, 54587, 45210, 58098, 5201, 18364, 63752, 11409, 24309, 61444, 9122, 21780, 34957, 15032, 27758, 40867, 12589, 25755, 38653, 51269, 31665, 44327, 49315, 29408, 42067, 55263, 2354, 48272, 38033, 50912, 12366, 25525, 56587, 2207, 31468, 54370, 1978, 28957, 44184, 7926, 18501, 48040, 5412, 16530, 45805, 60491, 29831, 9963, 53333, 33721, 15711, 59522, 39654, 13394, 59314, 37212, 19640, 65273, 43082, 23458, 62762, 41097, 38043, 50929, 12377, 25513, 56602, 2200, 31468, 54362, 1922, 28940, 44167, 7927, 18533, 48038, 5428, 16542};
        f18793b = 6918915934069311125L;
    }

    public CustomerAuthenticationMethod(h hVar) {
        this.innerCustomerAuthenticationMethod = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r0 = r8 * 2
            int r0 = 5 - r0
            byte[] r8 = fr.antelop.sdk.authentication.CustomerAuthenticationMethod.$$a
            int r1 = r7 * 3
            int r7 = r1 + 98
            int r2 = r9 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L30
            r2 = r0
            r3 = r5
        L17:
            int r1 = -r0
            int r0 = r2 + 1
            int r7 = r7 + r1
            r2 = r3
        L1c:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r10[r5] = r0
            return
        L2b:
            r1 = r8[r0]
            r2 = r0
            r0 = r1
            goto L17
        L30:
            r2 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f(short, short, byte, java.lang.Object[]):void");
    }

    private static void g(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i6 = $10 + 47;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 4;
        }
        while (oVar.f19947b < i3) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            if (i8 % i4 != 0) {
                int i9 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f18795d[i2 * i9])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(Color.red(0) + 742, (char) View.resolveSize(0, 0), 12 - Color.blue(0), 632508977, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f18793b), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 765, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 12471), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1946853218, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = d.a(TextUtils.indexOf("", "", 0, 0) + 387, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 39570797, false, $$g(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f18795d[i2 + i10])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a(743 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), 12 - ExpandableListView.getPackedPositionGroup(0L), 632508977, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(f18793b), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = d.a(766 - View.resolveSize(0, 0), (char) (12471 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = d.a(TextUtils.lastIndexOf("", '0', 0) + 388, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 17 - MotionEvent.axisFromString(""), 39570797, false, $$g(b12, b13, (byte) ((b13 + 6) - (6 & b13))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i11 = $11 + 49;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = d.a(-723636472);
            if (objA7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objA7 = d.a(386 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.resolveSize(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 18, 39570797, false, $$g(b14, b15, (byte) (6 | b15)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 13
            int r7 = r0 + 98
            int r0 = r6 * 6
            int r0 = 10 - r0
            int r1 = r8 + 1
            byte[] r6 = fr.antelop.sdk.authentication.CustomerAuthenticationMethod.$$d
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2e
            r3 = r4
            r2 = r0
        L13:
            int r1 = -r0
            int r0 = r2 + 1
            int r7 = r7 + r1
            int r7 = r7 + (-6)
            r2 = r3
        L1a:
            byte r1 = (byte) r7
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L29:
            r1 = r6[r0]
            r2 = r0
            r0 = r1
            goto L13
        L2e:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.CustomerAuthenticationMethod.h(byte, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$b = 39;
    }

    static void init$1() {
        $$d = new byte[]{96, -118, -108, -83, 59, MessagePack.Code.TRUE, -19, 62, MessagePack.Code.EXT8, -6, 59, MessagePack.Code.BIN16, -10, 51, MessagePack.Code.EXT8};
        $$e = 249;
    }

    static void init$2() {
        $$c = new byte[]{90, 91, 103, -77};
        $$f = 21;
    }

    public final BigDecimal getAllowedPaymentAmount() {
        int i2 = 2 % 2;
        int i3 = f18792a + 117;
        f18796e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.innerCustomerAuthenticationMethod.g();
            obj.hashCode();
            throw null;
        }
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG == null) {
            int i4 = f18796e + 85;
            f18792a = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        BigDecimal bigDecimalJ = cVarG.j();
        int i6 = f18792a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18796e = i6 % 128;
        if (i6 % 2 != 0) {
            return bigDecimalJ;
        }
        obj.hashCode();
        throw null;
    }

    public final CryptoObject getAuthenticationCryptoObject() {
        int i2 = 2 % 2;
        h hVar = this.innerCustomerAuthenticationMethod;
        if (!(hVar instanceof j)) {
            return null;
        }
        int i3 = f18796e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        Cipher cipherA = ((j) hVar).a();
        if (cipherA != null) {
            return new CryptoObject(cipherA);
        }
        int i5 = f18792a + 73;
        f18796e = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final Integer getAuthenticationDuration() {
        int i2 = 2 % 2;
        int i3 = f18792a + 69;
        f18796e = i3 % 128;
        int i4 = i3 % 2;
        Integer numJ = this.innerCustomerAuthenticationMethod.j();
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        return numJ;
    }

    public final short getCurrentAttemptsCount() {
        int i2 = 2 % 2;
        int i3 = f18792a + 9;
        f18796e = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z2 = this.innerCustomerAuthenticationMethod instanceof m;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        h hVar = this.innerCustomerAuthenticationMethod;
        if (!(hVar instanceof m)) {
            return (short) -1;
        }
        short sB = ((m) hVar).b();
        int i4 = f18792a + 13;
        f18796e = i4 % 128;
        int i5 = i4 % 2;
        return sB;
    }

    public final Integer getCurrentPaymentCount() {
        int i2 = 2 % 2;
        int i3 = f18796e + 63;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG != null) {
            return cVarG.g();
        }
        int i5 = f18796e;
        int i6 = i5 + 71;
        f18792a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 11;
        f18792a = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final BigDecimal getCurrentPaymentCumulativeAmount() {
        int i2 = 2 % 2;
        int i3 = f18796e + 99;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG == null) {
            int i5 = f18792a + 1;
            f18796e = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Object[] objArr = {cVarG};
        int i6 = c.f26702b * (-62757511);
        c.f26702b = i6;
        int iNextInt = new Random().nextInt();
        int i7 = c.f26705e * (-1802221721);
        c.f26705e = i7;
        int i8 = c.f26704d * (-1767993704);
        c.f26704d = i8;
        return (BigDecimal) c.a(i8, i6, iNextInt, -340587862, i7, 340587863, objArr);
    }

    public final ForeignCurrencySupport getForeignCurrencySupport() {
        int i2 = 2 % 2;
        int i3 = f18796e + 11;
        f18792a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerCustomerAuthenticationMethod.g();
            throw null;
        }
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG == null) {
            int i4 = f18792a + 91;
            f18796e = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ForeignCurrencySupport foreignCurrencySupportE = cVarG.f().e();
        int i5 = f18796e + 69;
        f18792a = i5 % 128;
        if (i5 % 2 == 0) {
            return foreignCurrencySupportE;
        }
        obj.hashCode();
        throw null;
    }

    public final BigDecimal getMaxPaymentAmount() {
        int i2 = 2 % 2;
        int i3 = f18796e + 105;
        f18792a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerCustomerAuthenticationMethod.g();
            throw null;
        }
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG != null) {
            return cVarG.e();
        }
        int i4 = f18796e + 73;
        f18792a = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getMaxPaymentCount() {
        int i2 = 2 % 2;
        int i3 = f18796e + 85;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG == null) {
            return null;
        }
        Integer numI = cVarG.i();
        int i5 = f18792a + 7;
        f18796e = i5 % 128;
        int i6 = i5 % 2;
        return numI;
    }

    public final BigDecimal getMaxPaymentCumulativeAmount() {
        int i2 = 2 % 2;
        int i3 = f18796e + 89;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG != null) {
            Object[] objArr = {cVarG};
            int iActiveCount = Thread.activeCount();
            int i5 = c.f26701a * (-696035060);
            c.f26701a = i5;
            int i6 = c.f26703c * 1745089391;
            c.f26703c = i6;
            return (BigDecimal) c.a((int) SystemClock.uptimeMillis(), iActiveCount, i5, -834340607, i6, 834340607, objArr);
        }
        int i7 = f18792a;
        int i8 = i7 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18796e = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 91;
        f18796e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 57 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if ((r4.innerCustomerAuthenticationMethod instanceof o.m.m) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0018, code lost:
    
        r2 = ((o.m.m) r4.innerCustomerAuthenticationMethod).l();
        r1 = fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18796e + 45;
        fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18792a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0029, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        if ((r4.innerCustomerAuthenticationMethod instanceof o.m.m) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        r1 = r2 + 15;
        fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18792a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short getMaximumAttemptsCount() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18792a
            int r0 = r0 + 1
            int r2 = r0 % 128
            fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18796e = r2
            int r0 = r0 % r3
            if (r0 != 0) goto L2a
            o.m.h r0 = r4.innerCustomerAuthenticationMethod
            boolean r1 = r0 instanceof o.m.m
            r0 = 97
            int r0 = r0 / 0
            if (r1 == 0) goto L31
        L18:
            o.m.h r0 = r4.innerCustomerAuthenticationMethod
            o.m.m r0 = (o.m.m) r0
            short r2 = r0.l()
            int r0 = fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18796e
            int r1 = r0 + 45
            int r0 = r1 % 128
            fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18792a = r0
            int r1 = r1 % r3
            return r2
        L2a:
            o.m.h r0 = r4.innerCustomerAuthenticationMethod
            boolean r0 = r0 instanceof o.m.m
            if (r0 == 0) goto L31
            goto L18
        L31:
            int r1 = r2 + 15
            int r0 = r1 % 128
            fr.antelop.sdk.authentication.CustomerAuthenticationMethod.f18792a = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L3c
            r0 = -1
            return r0
        L3c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.CustomerAuthenticationMethod.getMaximumAttemptsCount():short");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x047d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.authentication.CustomerAuthenticationMethodStatus getStatus() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.CustomerAuthenticationMethod.getStatus():fr.antelop.sdk.authentication.CustomerAuthenticationMethodStatus");
    }

    public final Short getStrength() {
        int i2 = 2 % 2;
        int i3 = f18796e + 29;
        f18792a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerCustomerAuthenticationMethod.g();
            obj.hashCode();
            throw null;
        }
        c cVarG = this.innerCustomerAuthenticationMethod.g();
        if (cVarG == null) {
            return null;
        }
        Short shValueOf = Short.valueOf(cVarG.b());
        int i4 = f18792a + 39;
        f18796e = i4 % 128;
        int i5 = i4 % 2;
        return shValueOf;
    }

    public final CustomerAuthenticationMethodType getType() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18792a + 21;
        f18796e = i3 % 128;
        int i4 = i3 % 2;
        i iVarD = this.innerCustomerAuthenticationMethod.d();
        if (i4 != 0) {
            return iVarD.d();
        }
        iVarD.d();
        throw null;
    }

    public final Set<CustomerAuthenticationMethodUsage> getUsages() {
        int i2 = 2 % 2;
        int i3 = f18796e + 51;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        Set<f> setH = this.innerCustomerAuthenticationMethod.h();
        if (i4 == 0) {
            return f.a(setH);
        }
        f.a(setH);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public final void promptCustomer(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt, CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback) throws WalletValidationException, CloneNotSupportedException {
        int i2 = 2 % 2;
        int i3 = f18796e + 125;
        f18792a = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, null, null, null};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int id = (int) Thread.currentThread().getId();
            int i4 = h.f26478l * (-377380400);
            h.f26478l = i4;
            h.c(i4, objArr, iElapsedRealtime, -960880587, id, 960880589, (int) Thread.currentThread().getId());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, null, null, null};
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int id2 = (int) Thread.currentThread().getId();
        int i5 = h.f26478l * (-377380400);
        h.f26478l = i5;
        h.c(i5, objArr2, iElapsedRealtime2, -960880587, id2, 960880589, (int) Thread.currentThread().getId());
        int i6 = f18796e + 9;
        f18792a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void promptCustomer(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt, CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback, CancellationSignal cancellationSignal) throws WalletValidationException, CloneNotSupportedException {
        int i2 = 2 % 2;
        int i3 = f18792a + 101;
        f18796e = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, null, null, cancellationSignal};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int id = (int) Thread.currentThread().getId();
            int i4 = h.f26478l * (-377380400);
            h.f26478l = i4;
            h.c(i4, objArr, iElapsedRealtime, -960880587, id, 960880589, (int) Thread.currentThread().getId());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, null, null, cancellationSignal};
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int id2 = (int) Thread.currentThread().getId();
        int i5 = h.f26478l * (-377380400);
        h.f26478l = i5;
        h.c(i5, objArr2, iElapsedRealtime2, -960880587, id2, 960880589, (int) Thread.currentThread().getId());
        int i6 = f18796e + 77;
        f18792a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
    }

    @Deprecated
    public final void promptCustomer(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt, CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback, CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPrompt customerAuthenticationPrompt2) throws WalletValidationException, CloneNotSupportedException {
        int i2 = 2 % 2;
        int i3 = f18796e + 65;
        f18792a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, customerAuthenticationMethodType, customerAuthenticationPrompt2, null};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int id = (int) Thread.currentThread().getId();
            int i4 = h.f26478l * (-377380400);
            h.f26478l = i4;
            h.c(i4, objArr, iElapsedRealtime, -960880587, id, 960880589, (int) Thread.currentThread().getId());
            return;
        }
        Object[] objArr2 = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, customerAuthenticationMethodType, customerAuthenticationPrompt2, null};
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int id2 = (int) Thread.currentThread().getId();
        int i5 = h.f26478l * (-377380400);
        h.f26478l = i5;
        h.c(i5, objArr2, iElapsedRealtime2, -960880587, id2, 960880589, (int) Thread.currentThread().getId());
        int i6 = 66 / 0;
    }

    public final void promptCustomer(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt, CustomerAuthenticationPromptCallback customerAuthenticationPromptCallback, CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPrompt customerAuthenticationPrompt2, CancellationSignal cancellationSignal) throws WalletValidationException, CloneNotSupportedException {
        int i2 = 2 % 2;
        int i3 = f18796e + 87;
        f18792a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerCustomerAuthenticationMethod, context, customerAuthenticationPrompt, customerAuthenticationPromptCallback, customerAuthenticationMethodType, customerAuthenticationPrompt2, cancellationSignal};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int id = (int) Thread.currentThread().getId();
        int i5 = (-377380400) * h.f26478l;
        h.f26478l = i5;
        h.c(i5, objArr, iElapsedRealtime, -960880587, id, 960880589, (int) Thread.currentThread().getId());
        int i6 = f18796e + 121;
        f18792a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
    }

    public final String toString() {
        Object maxPaymentCumulativeAmount;
        Object maxPaymentCount;
        Object authenticationDuration;
        int i2 = 2 % 2;
        Object foreignCurrencySupport = "";
        StringBuilder sbAppend = new StringBuilder("CustomerAuthenticationMethod{strength=").append(getStrength() == null ? "" : getStrength()).append(", maxPaymentAmount=").append(getMaxPaymentAmount() == null ? "" : getMaxPaymentAmount()).append(", maxPaymentCumulativeAmount=");
        if (getMaxPaymentCumulativeAmount() == null) {
            int i3 = f18796e + 89;
            f18792a = i3 % 128;
            int i4 = i3 % 2;
            maxPaymentCumulativeAmount = "";
        } else {
            maxPaymentCumulativeAmount = getMaxPaymentCumulativeAmount();
        }
        StringBuilder sbAppend2 = sbAppend.append(maxPaymentCumulativeAmount).append(", currentPaymentCumulativeAmount=").append(getCurrentPaymentCumulativeAmount() == null ? "" : getCurrentPaymentCumulativeAmount()).append(", maxPaymentCount=");
        if (getMaxPaymentCount() == null) {
            int i5 = f18792a + 31;
            f18796e = i5 % 128;
            int i6 = i5 % 2;
            maxPaymentCount = "";
        } else {
            maxPaymentCount = getMaxPaymentCount();
        }
        StringBuilder sbAppend3 = sbAppend2.append(maxPaymentCount).append(", currentPaymentCount=").append(getCurrentPaymentCount() == null ? "" : getCurrentPaymentCount()).append(", allowedPaymentAmount=").append(getAllowedPaymentAmount() == null ? "" : getAllowedPaymentAmount()).append(", authenticationDuration=");
        Object obj = null;
        if (getAuthenticationDuration() == null) {
            int i7 = f18792a + 125;
            f18796e = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            authenticationDuration = "";
        } else {
            authenticationDuration = getAuthenticationDuration();
        }
        StringBuilder sbAppend4 = sbAppend3.append(authenticationDuration).append(", currentAttemptsCount=").append((int) getCurrentAttemptsCount()).append(", maximumAttempsCount=").append((int) getMaximumAttemptsCount()).append(", authenticationCryptoObject=").append(getAuthenticationCryptoObject() == null ? "" : getAuthenticationCryptoObject().toString()).append(", foreignCurrencySupport=");
        if (getForeignCurrencySupport() == null) {
            int i8 = f18792a + 79;
            f18796e = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            foreignCurrencySupport = getForeignCurrencySupport();
        }
        return sbAppend4.append(foreignCurrencySupport).append(", status=").append(getStatus()).append(", type=").append(getType()).append(", usages=").append(getUsages()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
