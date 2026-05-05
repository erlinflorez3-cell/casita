package fr.antelop.sdk.digitalcard;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.g;
import o.a.i;
import o.a.k;
import o.d.d;
import o.er.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class ClickToPayPushCardNotProcessed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19032a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19033b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f19034c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f19035d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19036e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19037f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19038g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19039h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19040i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19041j = 0;
    private final m innerClickToPayPushCardNotProcessed;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorCode {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        private static final /* synthetic */ ErrorCode[] $VALUES;
        public static final ErrorCode CARD_NOT_ELIGIBLE;
        public static final ErrorCode CLICK_TO_PAY_NOT_ACTIVATED;
        public static final ErrorCode CUSTOMER_PROFILE_ALREADY_EXISTS;
        public static final ErrorCode CUSTOMER_PROFILE_DOES_NOT_EXIST;
        public static final ErrorCode DIGITAL_CARD_DELETED;
        public static final ErrorCode DIGITAL_CARD_ERROR;
        public static final ErrorCode DIGITAL_CARD_INACTIVE;
        public static final ErrorCode DIGITAL_CARD_LOCKED;
        public static final ErrorCode DIGITAL_CARD_WRONG_FUNDING_TYPE;
        public static final ErrorCode OTHER;
        public static final ErrorCode TECHNICAL_SRC_ERROR;
        public static final ErrorCode WRONG_CARD_INFORMATION;
        public static final ErrorCode WRONG_CUSTOMER_PROFILE_INFORMATION;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f19042a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char f19043b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f19044c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char f19045d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static char f19046e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f19047f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f19048h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f19049j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r7, byte r8, byte r9) {
            /*
                int r0 = r7 * 3
                int r7 = 1 - r0
                byte[] r6 = fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.ErrorCode.$$a
                int r0 = r9 * 2
                int r0 = 3 - r0
                int r1 = r8 * 3
                int r5 = 72 - r1
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L2b
                r5 = r7
                r1 = r0
                r2 = r3
            L16:
                int r0 = -r0
                int r5 = r5 + r0
                r0 = r1
            L19:
                byte r1 = (byte) r5
                r4[r2] = r1
                int r2 = r2 + 1
                if (r2 != r7) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                int r1 = r0 + 1
                r0 = r6[r1]
                goto L16
            L2b:
                r2 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.ErrorCode.$$c(int, byte, byte):java.lang.String");
        }

        private static /* synthetic */ ErrorCode[] $values() {
            int i2 = 2 % 2;
            int i3 = f19044c + 71;
            int i4 = i3 % 128;
            f19048h = i4;
            int i5 = i3 % 2;
            ErrorCode[] errorCodeArr = {TECHNICAL_SRC_ERROR, WRONG_CUSTOMER_PROFILE_INFORMATION, CUSTOMER_PROFILE_ALREADY_EXISTS, CUSTOMER_PROFILE_DOES_NOT_EXIST, WRONG_CARD_INFORMATION, CARD_NOT_ELIGIBLE, DIGITAL_CARD_LOCKED, DIGITAL_CARD_DELETED, DIGITAL_CARD_ERROR, DIGITAL_CARD_INACTIVE, DIGITAL_CARD_WRONG_FUNDING_TYPE, CLICK_TO_PAY_NOT_ACTIVATED, OTHER};
            int i6 = i4 + 97;
            f19044c = i6 % 128;
            int i7 = i6 % 2;
            return errorCodeArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f19049j = 0;
            f19047f = 1;
            f19044c = 0;
            f19048h = 1;
            d();
            TECHNICAL_SRC_ERROR = new ErrorCode("TECHNICAL_SRC_ERROR", 0);
            WRONG_CUSTOMER_PROFILE_INFORMATION = new ErrorCode("WRONG_CUSTOMER_PROFILE_INFORMATION", 1);
            CUSTOMER_PROFILE_ALREADY_EXISTS = new ErrorCode("CUSTOMER_PROFILE_ALREADY_EXISTS", 2);
            CUSTOMER_PROFILE_DOES_NOT_EXIST = new ErrorCode("CUSTOMER_PROFILE_DOES_NOT_EXIST", 3);
            WRONG_CARD_INFORMATION = new ErrorCode("WRONG_CARD_INFORMATION", 4);
            CARD_NOT_ELIGIBLE = new ErrorCode("CARD_NOT_ELIGIBLE", 5);
            DIGITAL_CARD_LOCKED = new ErrorCode("DIGITAL_CARD_LOCKED", 6);
            DIGITAL_CARD_DELETED = new ErrorCode("DIGITAL_CARD_DELETED", 7);
            DIGITAL_CARD_ERROR = new ErrorCode("DIGITAL_CARD_ERROR", 8);
            DIGITAL_CARD_INACTIVE = new ErrorCode("DIGITAL_CARD_INACTIVE", 9);
            DIGITAL_CARD_WRONG_FUNDING_TYPE = new ErrorCode("DIGITAL_CARD_WRONG_FUNDING_TYPE", 10);
            CLICK_TO_PAY_NOT_ACTIVATED = new ErrorCode("CLICK_TO_PAY_NOT_ACTIVATED", 11);
            Object[] objArr = new Object[1];
            g("\ueaf8鑃窤羸诱杚", 5 - KeyEvent.keyCodeFromString(""), objArr);
            OTHER = new ErrorCode(((String) objArr[0]).intern(), 12);
            $VALUES = $values();
            int i2 = f19049j + 47;
            f19047f = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
            }
        }

        private ErrorCode(String str, int i2) {
        }

        static void d() {
            f19046e = (char) 21413;
            f19042a = (char) 563;
            f19045d = (char) 49291;
            f19043b = (char) 48465;
        }

        private static void g(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $11;
            int i6 = i5 + 99;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            if (str2 != null) {
                int i8 = i5 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            int i10 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                cArr3[i10] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i11 = 58224;
                int i12 = i10;
                while (i12 < 16) {
                    int i13 = $11 + 107;
                    $10 = i13 % 128;
                    int i14 = i13 % i3;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i10];
                    int i15 = (c3 + i11) ^ ((c3 << 4) + ((char) (((long) f19045d) ^ (-7511683281764982996L))));
                    int i16 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f19043b);
                        objArr2[i3] = Integer.valueOf(i16);
                        objArr2[1] = Integer.valueOf(i15);
                        objArr2[i10] = Integer.valueOf(c2);
                        Object objA = d.a(1603517628);
                        if (objA == null) {
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 270;
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int scrollBarSize = 11 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b2 = (byte) i10;
                            byte b3 = (byte) (b2 + 1);
                            String str$$c = $$c(b2, b3, (byte) (b3 - 1));
                            Class[] clsArr = new Class[4];
                            clsArr[i10] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objA = d.a(windowTouchSlop, packedPositionType, scrollBarSize, -1995022631, false, str$$c, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i10]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f19046e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19042a)};
                        Object objA2 = d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objA2 = d.a(269 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Process.myTid() >> 22), 11 - TextUtils.indexOf("", "", 0), -1995022631, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i11 -= 40503;
                        i12++;
                        i3 = 2;
                        i10 = 0;
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
                    int i17 = 270 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    char cGreen = (char) Color.green(0);
                    int i18 = 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    String str$$c2 = $$c(b6, b7, b7);
                    i3 = 2;
                    objA3 = d.a(i17, cGreen, i18, -2074123590, false, str$$c2, new Class[]{Object.class, Object.class});
                } else {
                    i3 = 2;
                }
                ((Method) objA3).invoke(null, objArr4);
                i10 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        static void init$0() {
            $$a = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
            $$b = 78;
        }

        public static ErrorCode valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f19048h + 29;
            f19044c = i3 % 128;
            int i4 = i3 % 2;
            ErrorCode errorCode = (ErrorCode) Enum.valueOf(ErrorCode.class, str);
            if (i4 == 0) {
                return errorCode;
            }
            throw null;
        }

        public static ErrorCode[] values() {
            int i2 = 2 % 2;
            int i3 = f19048h + 101;
            f19044c = i3 % 128;
            int i4 = i3 % 2;
            ErrorCode[] errorCodeArr = (ErrorCode[]) $VALUES.clone();
            int i5 = f19048h + 117;
            f19044c = i5 % 128;
            int i6 = i5 % 2;
            return errorCodeArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r9, short r10, int r11) {
        /*
            int r8 = 122 - r10
            int r0 = r11 * 3
            int r7 = 1 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.$$c
            int r5 = r9 + 4
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L28
            r2 = r5
            r0 = r7
            r1 = r3
        L12:
            int r5 = r5 + r0
            r8 = r5
            r5 = r2
        L15:
            int r2 = r5 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r6[r2]
            r5 = r8
            goto L12
        L28:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.$$g(int, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19040i = 1722292977;
        init$0();
        f19039h = 0;
        f19041j = 1;
        f19037f = 0;
        f19038g = 1;
        e();
        f19035d = new char[]{56558};
        int i2 = f19039h + 7;
        f19041j = i2 % 128;
        int i3 = i2 % 2;
    }

    public ClickToPayPushCardNotProcessed(m mVar) {
        this.innerClickToPayPushCardNotProcessed = mVar;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] c(android.content.Context r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.c(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void e() {
        f19034c = 4056657175014651820L;
        f19036e = 941133086572314644L;
        f19033b = 1564493270;
        f19032a = (char) 17878;
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 4;
    }

    static void init$1() {
        $$d = new byte[]{103, 35, 47, 90, -12, 68, MessagePack.Code.UINT16, -13, -6, Ascii.SI, -7, -3, -1, 66, -69, Ascii.SI, -7, Base64.padSymbol, MessagePack.Code.FLOAT32, -5, 2, -2, -11, 19, -11, 9, 2, -17, Ascii.SO, 54, MessagePack.Code.STR32, -18, 2, -18, 3, Ascii.CR, 17, -27, 4, 6, -9, Ascii.FS, -19, -14, -2, 8, 8};
        $$e = 183;
    }

    static void init$2() {
        $$c = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$f = 64;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 97
            int r0 = r7 * 2
            int r7 = 4 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.$$a
            int r0 = r9 * 3
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r8
            r8 = r5
            r2 = r3
        L14:
            int r8 = r8 + r0
            int r7 = r7 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L27:
            r0 = r6[r7]
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.k(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 105;
        $10 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            int i6 = i4 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f19034c ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19034c)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 229, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 51004), (ViewConfiguration.getTouchSlop() >> 8) + 9, 1749983833, false, $$g(b2, (byte) ((b2 + Ascii.SI) - (15 | b2)), (byte) 0), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = d.a(676 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 522683165, false, $$g(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 8))), (byte) 0), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    private static void m(char c2, String str, int i2, String str2, String str3, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10 + 115;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = str6;
        if (str6 != null) {
            int i7 = i5 + 89;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str6.toCharArray();
            int i9 = $10 + 89;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            charArray3 = str4.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        i iVar = new i();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = d.a((-16777110) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 11, -155898465, false, $$g(b2, (byte) (57 & b2), (byte) 0), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 846, (char) (6488 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, -694521287, false, $$g(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 54))), (byte) 0), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr4[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    objA3 = d.a(Color.green(0) + 458, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 11 - KeyEvent.normalizeMetaState(0), 1804962841, false, $$g(b4, (byte) ((-1) - (((-1) - b4) | ((-1) - 56))), (byte) 0), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objA4 = d.a(639 - Color.argb(0, 0, 0, 0), (char) (KeyEvent.keyCodeFromString("") + 65100), Drawable.resolveOpacity(0, 0) + 12, 1636969060, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iVar.f19933e;
                cArr6[iVar.f19932b] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iVar.f19932b])) ^ (f19036e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f19033b) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f19032a) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(short r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.$$d
            int r0 = r10 * 43
            int r6 = 44 - r0
            int r0 = r9 * 4
            int r5 = r0 + 98
            int r1 = r8 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2b
            r2 = r3
            r0 = r1
        L13:
            int r1 = -r1
            int r1 = r1 + r5
            r5 = r1
            r1 = r0
        L17:
            int r0 = r1 + 1
            byte r1 = (byte) r5
            r4[r2] = r1
            int r2 = r2 + 1
            if (r2 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            r1 = r7[r0]
            goto L13
        L2b:
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.n(short, int, byte, java.lang.Object[]):void");
    }

    private static void o(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f19035d;
        int i11 = -1;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i6 < length) {
                int i12 = $10 + 109;
                $11 = i12 % 128;
                int i13 = i12 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i11;
                        objA = d.a((SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 248, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 1376582792, false, $$g(b2, (byte) (6 & b2), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i11 = -1;
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
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i7, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = $11 + 75;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = d.a(120026474);
                        if (objA2 == null) {
                            objA2 = d.a(12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        int i16 = 95 / 0;
                    } else {
                        int i17 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = d.a(120026474);
                        if (objA3 == null) {
                            objA3 = d.a(12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 11, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i18 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = d.a(1632715197);
                    if (objA4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 3);
                        objA4 = d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 836, (char) (27278 - TextUtils.lastIndexOf("", '0')), 10 - TextUtils.indexOf((CharSequence) "", '0'), -1210801192, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35715), View.getDefaultSize(0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                int i19 = $10 + 51;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i21 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i21, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i21);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i22 = $11 + 85;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    cArr6[mVar.f19943d] = cArr3[(i8 >> mVar.f19943d) << 1];
                    i2 = mVar.f19943d;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getCardId() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed.getCardId():java.lang.String");
    }

    public final ErrorCode getErrorCode() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19038g + 7;
        f19037f = i3 % 128;
        int i4 = i3 % 2;
        m.b bVarA = this.innerClickToPayPushCardNotProcessed.a();
        if (i4 == 0) {
            return bVarA.b();
        }
        bVarA.b();
        throw null;
    }

    public final String getErrorMessage() {
        String strC;
        int i2 = 2 % 2;
        int i3 = f19037f + 81;
        f19038g = i3 % 128;
        if (i3 % 2 == 0) {
            strC = this.innerClickToPayPushCardNotProcessed.c();
            int i4 = 51 / 0;
        } else {
            strC = this.innerClickToPayPushCardNotProcessed.c();
        }
        int i5 = f19037f + 61;
        f19038g = i5 % 128;
        int i6 = i5 % 2;
        return strC;
    }
}
