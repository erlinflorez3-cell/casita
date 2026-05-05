package o.er;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.digitalcard.CardPushUrl;
import fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor;
import fr.antelop.sdk.digitalcard.TokenRequestor;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class w {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f25204a = 0;

    /* JADX INFO: renamed from: f */
    private static int f25205f = 0;

    /* JADX INFO: renamed from: g */
    private static int f25206g = 0;

    /* JADX INFO: renamed from: h */
    private static char f25207h = 0;

    /* JADX INFO: renamed from: i */
    private static char f25208i = 0;

    /* JADX INFO: renamed from: j */
    private static char f25209j = 0;

    /* JADX INFO: renamed from: b */
    private final String f25210b;

    /* JADX INFO: renamed from: c */
    private final d[] f25211c;

    /* JADX INFO: renamed from: d */
    private final o.dx.g f25212d;

    /* JADX INFO: renamed from: e */
    private final String f25213e;

    /* JADX INFO: renamed from: o.er.w$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b */
        private static int f25214b = 1;

        /* JADX INFO: renamed from: d */
        private static int f25215d = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f25216e;

        static {
            int[] iArr = new int[d.values().length];
            f25216e = iArr;
            try {
                iArr[d.f25230b.ordinal()] = 1;
                int i2 = f25214b;
                int i3 = (i2 ^ 25) + (((i2 + 25) - (i2 | 25)) << 1);
                f25215d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 3;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25216e[d.f25232d.ordinal()] = 2;
                int i6 = f25214b + 89;
                f25215d = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o.er.w$4 */
    final class AnonymousClass4 implements CustomCustomerAuthenticatedProcessCallback {

        /* JADX INFO: renamed from: a */
        public static int f25217a = 810533754;

        /* JADX INFO: renamed from: b */
        public static int f25218b = 2055820103;

        /* JADX INFO: renamed from: c */
        public static int f25219c = -2072844023;

        /* JADX INFO: renamed from: d */
        public static int f25220d = 723585556;

        /* JADX INFO: renamed from: e */
        public static int f25221e = 981949627;

        /* JADX INFO: renamed from: f */
        public static int f25222f = -1906400158;

        /* JADX INFO: renamed from: h */
        public static int f25223h = -1946721796;

        /* JADX INFO: renamed from: i */
        public static int f25224i = 1558131538;

        /* JADX INFO: renamed from: k */
        private static int f25225k = 1;

        /* JADX INFO: renamed from: l */
        private static int f25226l = 0;

        /* JADX INFO: renamed from: g */
        private /* synthetic */ SecureCardPushToTokenRequestor f25227g;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ OperationCallback f25228j;

        AnonymousClass4(OperationCallback operationCallback, SecureCardPushToTokenRequestor secureCardPushToTokenRequestor) {
            operationCallback = operationCallback;
            secureCardPushToTokenRequestor = secureCardPushToTokenRequestor;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f25225k;
            int i4 = ((99 | i3) << 1) - (i3 ^ 99);
            f25226l = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            int i8 = ~i2;
            int i9 = ~i3;
            int i10 = ~((i8 + i9) - (i8 & i9));
            int i11 = (~((~i5) | i8)) | i10;
            int i12 = (-1) - (((-1) - (~((-1) - (((-1) - i5) & ((-1) - i8))))) & ((-1) - i10));
            int i13 = ~((i9 + i2) - (i9 & i2));
            int i14 = i2 + i3 + i6 + (104229478 * i4) + ((-1414784667) * i7);
            int i15 = i14 * i14;
            int i16 = ((i2 * (-393484327)) - 513802240) + ((-393484327) * i3) + (i11 * 23337000) + (i12 * 23337000) + (23337000 * i13) + ((-370147328) * i6) + ((-1784676352) * i4) + ((-1146093568) * i7) + ((-1043988480) * i15);
            int i17 = ((i2 * 256725217) - 1927268364) + (i3 * 256725217) + (i11 * 872) + (i12 * 872) + (i13 * 872) + (i6 * 256726089) + (i4 * (-1692676330)) + (i7 * (-87465523)) + (i15 * 964034560);
            int i18 = i16 + (i17 * i17 * (-1055260672));
            if (i18 == 1) {
                return e(objArr);
            }
            if (i18 == 2) {
                return c(objArr);
            }
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
            int i19 = 2 % 2;
            operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            int i20 = f25226l + 17;
            f25225k = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
            int i2 = 2 % 2;
            int i3 = f25226l + 65;
            f25225k = i3 % 128;
            if (i3 % 2 != 0) {
                operationCallback.onSuccess(secureCardPushToTokenRequestor.getCardPushUrl());
                return null;
            }
            operationCallback.onSuccess(secureCardPushToTokenRequestor.getCardPushUrl());
            throw null;
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int i2 = f25224i * 1268959244;
            f25224i = i2;
            int id = (int) Thread.currentThread().getId();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i3 = f25223h * (-1898447722);
            f25223h = i3;
            e(-741149616, 741149618, new Object[]{this, customerAuthenticatedProcess}, iUptimeMillis, i2, id, i3);
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int i2 = 2 % 2;
            int i3 = f25225k;
            int i4 = ((i3 + 105) - (105 | i3)) + ((i3 + 105) - (i3 & 105));
            f25226l = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int i2 = f25217a * 824046993;
            f25217a = i2;
            int i3 = f25221e * 1934222988;
            f25221e = i3;
            int iMyTid = Process.myTid();
            int i4 = f25219c * (-482347758);
            f25219c = i4;
            e(-1376333246, 1376333246, new Object[]{this, list, customerAuthenticatedProcess}, iMyTid, i2, i3, i4);
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int i2 = 2 % 2;
            int i3 = f25225k;
            int i4 = (i3 ^ 7) + (((-1) - (((-1) - i3) | ((-1) - 7))) << 1);
            f25226l = i4 % 128;
            if (i4 % 2 != 0) {
                operationCallback.onError(antelopError);
                int i5 = 43 / 0;
            } else {
                operationCallback.onError(antelopError);
            }
            int i6 = f25225k;
            int i7 = (i6 ^ 45) + ((i6 & 45) << 1);
            f25226l = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int i2 = 2 % 2;
            int i3 = f25225k + 51;
            f25226l = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
        public final void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            int iMyUid = Process.myUid();
            int i2 = f25220d * 1923112211;
            f25220d = i2;
            int i3 = f25218b * (-35070017);
            f25218b = i3;
            int i4 = f25222f * 7319284;
            f25222f = i4;
            e(-1066801196, 1066801197, new Object[]{this, customerAuthenticatedProcess}, i3, iMyUid, i2, i4);
        }
    }

    public static final class d extends Enum<d> implements o.ea.a<TokenRequestor.Type>, o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static final d f25230b;

        /* JADX INFO: renamed from: c */
        private static long f25231c = 0;

        /* JADX INFO: renamed from: d */
        public static final d f25232d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ d[] f25233e;

        /* JADX INFO: renamed from: f */
        private static char f25234f = 0;

        /* JADX INFO: renamed from: g */
        private static int f25235g = 0;

        /* JADX INFO: renamed from: h */
        private static int f25236h = 0;

        /* JADX INFO: renamed from: i */
        private static int f25237i = 0;

        /* JADX INFO: renamed from: j */
        private static int f25238j = 0;

        /* JADX INFO: renamed from: o */
        private static int f25239o = 0;

        /* JADX INFO: renamed from: a */
        private final String f25240a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r7, byte r8, short r9) {
            /*
                int r7 = r7 + 65
                int r6 = r8 + 4
                int r1 = r9 * 2
                int r0 = 1 - r1
                byte[] r5 = o.er.w.d.$$a
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r5 != 0) goto L27
                r0 = r7
                r7 = r2
                r1 = r3
            L14:
                int r7 = r7 + r0
            L15:
                byte r0 = (byte) r7
                r4[r1] = r0
                int r6 = r6 + 1
                if (r1 != r2) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r5[r6]
                goto L14
            L27:
                r1 = r3
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.w.d.$$c(short, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25236h = 0;
            f25239o = 1;
            f25238j = 0;
            f25237i = 1;
            c();
            Object[] objArr = new Object[1];
            k((char) (MotionEvent.axisFromString("") + 4522), "縞ۿஜフ뜭F", "\u0000\u0000\u0000\u0000", "ꦱ㺸ꦏ脑", TextUtils.getCapsMode("", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((char) (4521 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "縞ۿஜフ뜭F", "\u0000\u0000\u0000\u0000", "ꦱ㺸ꦏ脑", ViewConfiguration.getPressedStateDuration() >> 16, objArr2);
            f25230b = new d(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\ueef7冂ꌬ꩕\ue253頦\uea7a➌絊", "\u0000\u0000\u0000\u0000", "픻㞲ጔ᭖", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 339194580, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k((char) Gravity.getAbsoluteGravity(0, 0), "\ueef7冂ꌬ꩕\ue253頦\uea7a➌絊", "\u0000\u0000\u0000\u0000", "픻㞲ጔ᭖", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 339194581, objArr4);
            f25232d = new d(strIntern2, 1, ((String) objArr4[0]).intern());
            f25233e = b();
            int i2 = f25239o + 45;
            f25236h = i2 % 128;
            int i3 = i2 % 2;
        }

        private d(String str, int i2, String str2) {
            super(str, i2);
            this.f25240a = str2;
        }

        private static /* synthetic */ d[] b() {
            int i2 = 2 % 2;
            int i3 = f25237i + 67;
            int i4 = i3 % 128;
            f25238j = i4;
            int i5 = i3 % 2;
            d[] dVarArr = {f25230b, f25232d};
            int i6 = i4 + 53;
            f25237i = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 94 / 0;
            }
            return dVarArr;
        }

        static void c() {
            f25231c = 740602047300126166L;
            f25235g = 1564493270;
            f25234f = (char) 23719;
        }

        private TokenRequestor.Type d() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f25237i + 113;
            f25238j = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass3.f25216e[ordinal()];
            if (i5 == 1) {
                return TokenRequestor.Type.Wallet;
            }
            if (i5 != 2) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                k((char) (58903 - Gravity.getAbsoluteGravity(0, 0)), "ពݥ罒㋢㹃妭ࠬ苁ଏ꜍ᢝᅸ鋪ꤊ妃\uf6e7滓勫", "\u0000\u0000\u0000\u0000", "ᦤڴ៉퓦", View.combineMeasuredStates(0, 0), objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
            }
            TokenRequestor.Type type = TokenRequestor.Type.Ecommerce;
            int i6 = f25238j + 23;
            f25237i = i6 % 128;
            if (i6 % 2 != 0) {
                return type;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{88, 0, 126, -69};
            $$b = 134;
        }

        private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $10;
            int i6 = i5 + 1;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            Object charArray = str6;
            if (str6 != null) {
                int i8 = i5 + 43;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                int i10 = $11 + 13;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                charArray3 = str4.toCharArray();
            }
            o.a.i iVar = new o.a.i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            int i12 = $10 + 81;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (iVar.f19932b < length3) {
                int i14 = $10 + 37;
                $11 = i14 % 128;
                int i15 = i14 % i3;
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        int iArgb = 106 - Color.argb(0, 0, 0, 0);
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10;
                        byte b2 = $$a[1];
                        byte b3 = b2;
                        objA = o.d.d.a(iArgb, offsetBefore, i16, -155898465, false, $$c(b3, (byte) (b3 - 1), b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) 3;
                        objA2 = o.d.d.a(Color.blue(0) + 847, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6488), TextUtils.lastIndexOf("", '0') + 13, -694521287, false, $$c(b4, (byte) (b4 - 4), $$a[1]), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        int size = 458 - View.MeasureSpec.getSize(0);
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int edgeSlop = 11 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b5 = $$a[1];
                        byte b6 = (byte) (b5 + 1);
                        objA3 = o.d.d.a(size, c3, edgeSlop, 1804962841, false, $$c(b6, (byte) (-b6), b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        int iRed = Color.red(0) + 639;
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 65100);
                        int edgeSlop2 = 12 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b7 = $$a[1];
                        i3 = 2;
                        objA4 = o.d.d.a(iRed, touchSlop, edgeSlop2, 1636969060, false, $$c((byte) 57, (byte) (b7 - 1), b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i3 = 2;
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (r10[iVar.f19932b] ^ cArr3[iIntValue2])) ^ (f25231c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25235g) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25234f) ^ 740602047300126166L))));
                    iVar.f19932b++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25238j + 17;
            f25237i = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i5 = f25237i + 121;
            f25238j = i5 % 128;
            int i6 = i5 % 2;
            return dVar;
        }

        public static d[] values() {
            d[] dVarArr;
            int i2 = 2 % 2;
            int i3 = f25237i + 1;
            f25238j = i3 % 128;
            if (i3 % 2 != 0) {
                dVarArr = (d[]) f25233e.clone();
                int i4 = 39 / 0;
            } else {
                dVarArr = (d[]) f25233e.clone();
            }
            int i5 = f25237i + 17;
            f25238j = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return dVarArr;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f25238j + 65;
            f25237i = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f25240a;
            }
            throw null;
        }

        @Override // o.ea.a
        public final /* synthetic */ TokenRequestor.Type e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f25237i + 109;
            f25238j = i3 % 128;
            int i4 = i3 % 2;
            TokenRequestor.Type typeD = d();
            int i5 = f25237i + 11;
            f25238j = i5 % 128;
            int i6 = i5 % 2;
            return typeD;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r0 = r8 * 3
            int r8 = 4 - r0
            int r0 = r7 * 4
            int r7 = r0 + 1
            int r0 = r6 * 3
            int r0 = r0 + 69
            byte[] r6 = o.er.w.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2c
            r3 = r4
            r2 = r7
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            int r8 = r8 + 1
            r2 = r3
        L1a:
            byte r1 = (byte) r0
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r6[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.w.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25206g = 0;
        f25205f = 1;
        f25204a = (char) 59260;
        f25209j = (char) 31600;
        f25207h = (char) 13069;
        f25208i = (char) 17111;
    }

    public w(String str, d[] dVarArr, String str2, o.dx.g gVar) {
        this.f25213e = str;
        this.f25211c = dVarArr;
        this.f25210b = str2;
        this.f25212d = gVar;
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 205;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.w.k(java.lang.String, int, java.lang.Object[]):void");
    }

    public final o.dx.g a() {
        int i2 = 2 % 2;
        int i3 = f25206g;
        int i4 = i3 + 1;
        f25205f = i4 % 128;
        int i5 = i4 % 2;
        o.dx.g gVar = this.f25212d;
        int i6 = i3 + 9;
        f25205f = i6 % 128;
        if (i6 % 2 != 0) {
            return gVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SecureCardPushToTokenRequestor b(o.ep.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25206g + 79;
        f25205f = i3 % 128;
        int i4 = i3 % 2;
        if (!dVar.y().hasNext()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            k("龜\uee1dП耩䌠엗", 5 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        int i5 = f25205f + 5;
        f25206g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        j jVarI = ((a) dVar.y().next().iterator().next()).i();
        SecureCardPushToTokenRequestor secureCardPushToTokenRequestor = new SecureCardPushToTokenRequestor(new o.y.h(jVarI.b(), dVar, jVarI.c(), this.f25213e));
        int i6 = f25206g + 79;
        f25205f = i6 % 128;
        int i7 = i6 % 2;
        return secureCardPushToTokenRequestor;
    }

    public final d[] b() {
        int i2 = 2 % 2;
        int i3 = f25205f + 93;
        int i4 = i3 % 128;
        f25206g = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        d[] dVarArr = this.f25211c;
        int i5 = i4 + 75;
        f25205f = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarArr;
        }
        obj.hashCode();
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f25206g + 109;
        int i4 = i3 % 128;
        f25205f = i4;
        int i5 = i3 % 2;
        String str = this.f25210b;
        int i6 = i4 + 103;
        f25206g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Drawable d(Context context) {
        int i2 = 2 % 2;
        int i3 = f25205f + 79;
        int i4 = i3 % 128;
        f25206g = i4;
        int i5 = i3 % 2;
        o.dx.g gVar = this.f25212d;
        if (gVar == null) {
            return null;
        }
        int i6 = i4 + 23;
        f25205f = i6 % 128;
        if (i6 % 2 != 0) {
            return gVar.e(context);
        }
        gVar.e(context);
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f25205f;
        int i4 = i3 + 61;
        f25206g = i4 % 128;
        int i5 = i4 % 2;
        o.dx.g gVar = this.f25212d;
        if (gVar == null) {
            return null;
        }
        int i6 = i3 + 107;
        f25206g = i6 % 128;
        int i7 = i6 % 2;
        return gVar.b().b();
    }

    public final void d(Context context, String str, o.ep.d dVar, OperationCallback<CardPushUrl> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        SecureCardPushToTokenRequestor secureCardPushToTokenRequestorB = b(dVar);
        secureCardPushToTokenRequestorB.setReturnUrl(str);
        secureCardPushToTokenRequestorB.launch(context, new CustomCustomerAuthenticatedProcessCallback() { // from class: o.er.w.4

            /* JADX INFO: renamed from: a */
            public static int f25217a = 810533754;

            /* JADX INFO: renamed from: b */
            public static int f25218b = 2055820103;

            /* JADX INFO: renamed from: c */
            public static int f25219c = -2072844023;

            /* JADX INFO: renamed from: d */
            public static int f25220d = 723585556;

            /* JADX INFO: renamed from: e */
            public static int f25221e = 981949627;

            /* JADX INFO: renamed from: f */
            public static int f25222f = -1906400158;

            /* JADX INFO: renamed from: h */
            public static int f25223h = -1946721796;

            /* JADX INFO: renamed from: i */
            public static int f25224i = 1558131538;

            /* JADX INFO: renamed from: k */
            private static int f25225k = 1;

            /* JADX INFO: renamed from: l */
            private static int f25226l = 0;

            /* JADX INFO: renamed from: g */
            private /* synthetic */ SecureCardPushToTokenRequestor f25227g;

            /* JADX INFO: renamed from: j */
            private /* synthetic */ OperationCallback f25228j;

            AnonymousClass4(OperationCallback operationCallback2, SecureCardPushToTokenRequestor secureCardPushToTokenRequestorB2) {
                operationCallback = operationCallback2;
                secureCardPushToTokenRequestor = secureCardPushToTokenRequestorB2;
            }

            private static /* synthetic */ Object c(Object[] objArr) {
                int i22 = 2 % 2;
                int i3 = f25225k;
                int i4 = ((99 | i3) << 1) - (i3 ^ 99);
                f25226l = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }

            public static /* synthetic */ Object e(int i22, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
                int i8 = ~i22;
                int i9 = ~i3;
                int i10 = ~((i8 + i9) - (i8 & i9));
                int i11 = (~((~i5) | i8)) | i10;
                int i12 = (-1) - (((-1) - (~((-1) - (((-1) - i5) & ((-1) - i8))))) & ((-1) - i10));
                int i13 = ~((i9 + i22) - (i9 & i22));
                int i14 = i22 + i3 + i6 + (104229478 * i4) + ((-1414784667) * i7);
                int i15 = i14 * i14;
                int i16 = ((i22 * (-393484327)) - 513802240) + ((-393484327) * i3) + (i11 * 23337000) + (i12 * 23337000) + (23337000 * i13) + ((-370147328) * i6) + ((-1784676352) * i4) + ((-1146093568) * i7) + ((-1043988480) * i15);
                int i17 = ((i22 * 256725217) - 1927268364) + (i3 * 256725217) + (i11 * 872) + (i12 * 872) + (i13 * 872) + (i6 * 256726089) + (i4 * (-1692676330)) + (i7 * (-87465523)) + (i15 * 964034560);
                int i18 = i16 + (i17 * i17 * (-1055260672));
                if (i18 == 1) {
                    return e(objArr);
                }
                if (i18 == 2) {
                    return c(objArr);
                }
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                int i19 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i20 = f25226l + 17;
                f25225k = i20 % 128;
                int i21 = i20 % 2;
                return null;
            }

            private static /* synthetic */ Object e(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                int i22 = 2 % 2;
                int i3 = f25226l + 65;
                f25225k = i3 % 128;
                if (i3 % 2 != 0) {
                    operationCallback.onSuccess(secureCardPushToTokenRequestor.getCardPushUrl());
                    return null;
                }
                operationCallback.onSuccess(secureCardPushToTokenRequestor.getCardPushUrl());
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i22 = f25224i * 1268959244;
                f25224i = i22;
                int id = (int) Thread.currentThread().getId();
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i3 = f25223h * (-1898447722);
                f25223h = i3;
                e(-741149616, 741149618, new Object[]{this, customerAuthenticatedProcess}, iUptimeMillis, i22, id, i3);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i22 = 2 % 2;
                int i3 = f25225k;
                int i4 = ((i3 + 105) - (105 | i3)) + ((i3 + 105) - (i3 & 105));
                f25226l = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i22 = f25217a * 824046993;
                f25217a = i22;
                int i3 = f25221e * 1934222988;
                f25221e = i3;
                int iMyTid = Process.myTid();
                int i4 = f25219c * (-482347758);
                f25219c = i4;
                e(-1376333246, 1376333246, new Object[]{this, list, customerAuthenticatedProcess}, iMyTid, i22, i3, i4);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i22 = 2 % 2;
                int i3 = f25225k;
                int i4 = (i3 ^ 7) + (((-1) - (((-1) - i3) | ((-1) - 7))) << 1);
                f25226l = i4 % 128;
                if (i4 % 2 != 0) {
                    operationCallback.onError(antelopError);
                    int i5 = 43 / 0;
                } else {
                    operationCallback.onError(antelopError);
                }
                int i6 = f25225k;
                int i7 = (i6 ^ 45) + ((i6 & 45) << 1);
                f25226l = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i22 = 2 % 2;
                int i3 = f25225k + 51;
                f25226l = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int iMyUid = Process.myUid();
                int i22 = f25220d * 1923112211;
                f25220d = i22;
                int i3 = f25218b * (-35070017);
                f25218b = i3;
                int i4 = f25222f * 7319284;
                f25222f = i4;
                e(-1066801196, 1066801197, new Object[]{this, customerAuthenticatedProcess}, i3, iMyUid, i22, i4);
            }
        });
        int i3 = f25206g + 71;
        f25205f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f25205f + 29;
        f25206g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f25213e;
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        return str;
    }
}
