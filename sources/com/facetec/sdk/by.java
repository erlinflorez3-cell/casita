package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facetec.sdk.Code;
import com.facetec.sdk.Z;
import com.facetec.sdk.cf;
import com.facetec.sdk.fq;
import com.facetec.sdk.ft;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
final class by implements ZoomEncryptStrings {
    private static String B = null;
    private static String C = null;
    private static by Code = null;
    private static char[] D = null;
    private static String I = null;
    private static long L = 0;
    private static int S = 0;
    static int V = 0;
    static String Z = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f3080d = 1;
    private final ft F;

    static abstract class B {
        B() {
        }

        void B() {
        }

        void Code() {
        }
    }

    static class Code {
        boolean Code;
        boolean Z;

        Code(boolean z2, boolean z3) {
            this.Z = z2;
            this.Code = z3;
        }
    }

    static abstract class I {
        I() {
        }

        public abstract void B(Code code);
    }

    static {
        I();
        V = 0;
        int i2 = f3080d + 55;
        S = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    private by(Context context) throws Throwable {
        B(EO.Od("ۯs\u038dʮǈ?\u001bِٷЯβ\u0012\u0378Cڌ֧\u000e,ԛ\f#{MIκʘJ\u0013xg", (short) (OY.Xd() ^ 27966)), new int[]{0, 30, 0, 12}, false).intern();
        Z(C1561oA.Qd("꼼⥱鮧ᗡ蘆\uf84d犇\ue482慗쮤䷟뙊㠺ꪎ⒱饪\u0ba7", (short) (C1580rY.Xd() ^ (-30902))), 35401 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        this.F = V();
        String strIntern = B(C1593ug.zd("ŭ456ű", (short) (OY.Xd() ^ 32328), (short) (OY.Xd() ^ 10378)), new int[]{30, 5, 71, 0}, true).intern();
        Class<?> cls = Class.forName(C1561oA.od("O[P]YRL\u0015ITRWGOT\r!LJO?QL", (short) (Od.Xd() ^ (-11054))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 5951);
        int[] iArr = new int["f^t`.mcqk3Y{zrxr".length()];
        QB qb = new QB("f^t`.mcqk3Y{zrxr");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strIntern};
        Method method = cls.getMethod(Wg.Zd("`\u0019\u000fxFG/+Y>7OztUb", (short) (ZN.Xd() ^ 10281), (short) (ZN.Xd() ^ 6863)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            if (C == null) {
                C = n.D(context);
            }
            if (I == null) {
                Class<?> cls2 = Class.forName(C1561oA.Xd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (ZN.Xd() ^ 17867)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (C1633zX.Xd() ^ (-30425));
                int[] iArr2 = new int["UR`;ST[P]ZBTg^".length()];
                QB qb2 = new QB("UR`;ST[P]ZBTg^");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    I = (String) method2.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (B == null) {
                B = ce.Z(context);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static String B(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        Object obj = str;
        if (str != null) {
            byte[] bytes = str.getBytes("ISO-8859-1");
            int i3 = f3080d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            S = i3 % 128;
            int i4 = i3 % 2;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = new char[i6];
        System.arraycopy(D, i5, cArr, 0, i6);
        if (bArr != null) {
            char[] cArr2 = new char[i6];
            char c2 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (bArr[i9] == 1) {
                    cArr2[i9] = (char) (((cArr[i9] << 1) + 1) - c2);
                } else {
                    cArr2[i9] = (char) ((cArr[i9] << 1) - c2);
                }
                c2 = cArr2[i9];
            }
            cArr = cArr2;
        }
        if (i8 > 0) {
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, 0, cArr3, 0, i6);
            int i10 = i6 - i8;
            System.arraycopy(cArr3, 0, cArr, i10, i8);
            System.arraycopy(cArr3, i8, cArr, 0, i10);
        }
        if (z2) {
            char[] cArr4 = new char[i6];
            int i11 = 0;
            while (i11 < i6) {
                int i12 = S + 45;
                int i13 = i12 % 128;
                f3080d = i13;
                int i14 = i12 % 2;
                cArr4[i11] = cArr[(i6 - i11) - 1];
                i11++;
                int i15 = i13 + 93;
                S = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr = cArr4;
        }
        if (i7 > 0) {
            for (int i17 = 0; i17 < i6; i17++) {
                int i18 = S + 83;
                f3080d = i18 % 128;
                int i19 = i18 % 2;
                cArr[i17] = (char) (cArr[i17] - iArr[2]);
            }
        }
        return new String(cArr);
    }

    static /* synthetic */ void B(Context context, String str, I i2) throws Throwable {
        boolean zBooleanValue;
        boolean z2;
        JSONObject jSONObject;
        Z.I iCode;
        int i3 = 2 % 2;
        boolean z3 = false;
        try {
            jSONObject = new JSONObject(str);
            z2 = true;
        } catch (Throwable th) {
            th = th;
            zBooleanValue = false;
            z2 = false;
        }
        if (!jSONObject.getJSONObject(B("\u0001\u0000\u0000\u0001", new int[]{103, 4, 0, 1}, false).intern()).getBoolean(Z("ﴴ\u0b49", 63097 - Drawable.resolveOpacity(0, 0)).intern())) {
            zBooleanValue = false;
            Code(i2, new Code(z3, zBooleanValue));
            int i4 = f3080d + 101;
            S = i4 % 128;
            int i5 = i4 % 2;
            a.I(context);
            br.I(context);
        }
        try {
            iCode = Z.I.Code(jSONObject.getJSONObject(Z("﴿ᾕ㡱唷", (ViewConfiguration.getJumpTapTimeout() >> 16) + 58031).intern()));
            Z.Z(context, Z.V(context), iCode);
            n.Code = iCode.I;
            Z = iCode.Z;
            zBooleanValue = iCode.L.booleanValue();
        } catch (Throwable th2) {
            th = th2;
            zBooleanValue = false;
        }
        try {
            n.V = iCode.D.intValue();
            int iIntValue = iCode.F.intValue();
            if (iIntValue > 0) {
                int i6 = f3080d + 59;
                S = i6 % 128;
                int i7 = i6 % 2;
                cb.V(context, iIntValue);
                int i8 = f3080d + 95;
                S = i8 % 128;
                int i9 = i8 % 2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                B("\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{107, 39, 0, 19}, false).intern();
                ce.I(th.getMessage());
            } catch (Throwable th4) {
                try {
                    th4.printStackTrace();
                } finally {
                    Code(i2, new Code(z2, zBooleanValue));
                }
            }
        }
        z3 = z2;
        Code(i2, new Code(z3, zBooleanValue));
        int i42 = f3080d + 101;
        S = i42 % 128;
        int i52 = i42 % 2;
        a.I(context);
        br.I(context);
    }

    static synchronized by Code(Context context) {
        int i2 = 2 % 2;
        int i3 = S + 41;
        f3080d = i3 % 128;
        int i4 = i3 % 2;
        if (Code == null) {
            Code = new by(context);
            int i5 = S + 39;
            f3080d = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        return Code;
    }

    static String Code(String str) {
        int i2 = 2 % 2;
        String strIntern = B(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{58, 1, 0, 0}, true).intern();
        Locale locale = Locale.getDefault();
        String string = new StringBuilder().append(B("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{38, 20, 0, 19}, true).intern()).append(I).append(strIntern).append(str).append(strIntern).append(C).append(strIntern).append(Build.MODEL).append(strIntern).append(FaceTecSDK.version()).append(strIntern).append(locale.toString()).append(strIntern).append(locale.getLanguage()).append(strIntern).append(ad.V).toString();
        int i3 = S + 25;
        f3080d = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static synchronized void Code() {
        int i2 = 2 % 2;
        int i3 = f3080d;
        int i4 = i3 + 37;
        S = i4 % 128;
        int i5 = i4 % 2;
        Code = null;
        int i6 = i3 + 125;
        S = i6 % 128;
        int i7 = i6 % 2;
    }

    static void Code(Context context, I i2) {
        int i3 = 2 % 2;
        int i4 = f3080d + 1;
        S = i4 % 128;
        int i5 = i4 % 2;
        Code(context).I(context, i2);
        int i6 = f3080d + 11;
        S = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void Code(final I i2, final Code code) {
        int i3 = 2 % 2;
        int i4 = S + 21;
        f3080d = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != null) {
            AsyncTask.execute(new Runnable() { // from class: com.facetec.sdk.by.5
                @Override // java.lang.Runnable
                public final void run() {
                    i2.B(code);
                }
            });
        }
        int i6 = S + 81;
        f3080d = i6 % 128;
        int i7 = i6 % 2;
    }

    static ft I(Context context) {
        int i2 = 2 % 2;
        int i3 = S + 49;
        f3080d = i3 % 128;
        int i4 = i3 % 2;
        ft ftVar = Code(context).F;
        if (i4 == 0) {
            throw null;
        }
        int i5 = f3080d + 21;
        S = i5 % 128;
        if (i5 % 2 == 0) {
            return ftVar;
        }
        throw null;
    }

    static void I() {
        D = new char[]{Typography.less, 'R', 'Q', 't', 'l', 'k', 'O', 'I', 'i', 'g', 'e', 'j', 'i', 'c', 'b', 'd', 'l', 'l', 'd', 'H', 'P', 'k', 'g', 'L', 'O', 'q', 'k', 'e', 'l', 'P', 'V', Typography.degree, 181, 178, 179, '*', 'P', 'O', '2', 'f', 'l', 'p', 'k', 'i', 'g', 'n', 's', 'g', 'k', 'w', 'o', 'd', 'l', 'l', 'd', 'b', 'c', 'q', Typography.greater, 'm', 253, 254, 219, 255, 287, 282, 281, 249, 252, 279, 279, 286, 281, 279, 281, 278, 281, 287, 285, 284, 257, 223, 218, 243, 275, 279, 246, 255, 287, 282, 281, 274, 278, 287, 281, 246, 243, 276, 281, 249, 243, 275, 279, '0', 'g', 'i', 'l', '8', 'p', 'H', 'J', 'q', 'm', 'h', 'i', 'G', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'C', TokenParser.SP, '1', 'Y', 'r', 'p', 'h', 'B', 'G', 'n', 'q', 'J', 'K', 'k', 'f', 'j', 'f', 'b', 'j', 'l', 'B', '@', 'r', 227, 233, 238, 239, 227, 222, 234, 236, 235, 234, 231, 235, '0', 'd', 'j', 'n', 'q', 's', 'n', 'f', 'V', 'V', 'd', 'f', 142, 283, 278, 273, 282, 284, 275, 273, 263, 270, 273, 266, 280, 287, 283, 'O', 139, 136, 134, Ascii.MAX, 137, 139, 148, 146, 137, 137, 143, '2', 'd', 'm', 'o', 'f', 'd', '\\', 'K', 'G', 'P', AbstractJsonLexerKt.END_LIST, 'k', 'r', 'n', 'l', 'n', '=', 'l', 'q', 132, 130, 132, 128, 'x', '|', 128, 132, 134, '~', 192, 193, 193, 198, 164, Typography.paragraph, 180, 186, 199, Typography.paragraph, 181, 196, 154, 147, 146, 181, Typography.paragraph, 197, 195, '8', 'h', 'm', 'r', 'm', 'h', 'b', '=', 'q', 'f', 'k', 'p', 220, 213, 'U', 173, '3', 'd', 'k', 218, 'n', 222, 'U', 170, 172, 175, 'x', 242, '6', 'j', 'e', 'g', 'i', '9', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, '\\', 'k', 'f', 'n', 's', 'q', 'n', 'j', 'd', 'e', 'f', 'I', 'N', 'n', 'o', 't', 'T', '0', '1', '2', '3', '7', 'S', 'n', 'i', 'H', 'K', 'n', 't', 'k', 'g', 'n', 'o', 't', 'T', 'I', 'f', 'e', 'b', 'b', 'I', '/', '4', 'V', 'q', 'r', 't', 'n', 'u', 237, 240, 238, 240, 245, 238, 238, 211, 208, 240, 241, 246, 214, 178, Typography.plusMinus, Typography.plusMinus, 213, 212, 206, 238, 234, 202, 208, 240, 235, 202, 205, 240, 246, 237, 233, 240, 241, 246, 214, 205, 238, 234, 202, Typography.plusMinus, Typography.paragraph, 216, 243, 244, 246};
        L = 4610318652638952795L;
    }

    private synchronized void I(Context context, final I i2) {
        int i3 = 2 % 2;
        Class<?> cls = Class.forName(Qg.kd("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (C1633zX.Xd() ^ (-8660)), (short) (C1633zX.Xd() ^ (-17529))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-4020));
        short sXd2 = (short) (C1499aX.Xd() ^ (-27071));
        int[] iArr = new int["*'5\u0001/.)%\u001e\u001b-!&$w#!&\u0016(#".length()];
        QB qb = new QB("*'5\u0001/.)%\u001e\u001b-!&$w#!&\u0016(#");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            try {
                short sXd3 = (short) (C1633zX.Xd() ^ (-19812));
                int[] iArr2 = new int["ЮUTЫRQШЧЦХФУТСРGОНМЛBA@ЗЖ=<;В9АЏЎЍ4ЋЊ1ЈЇІЅ,+".length()];
                QB qb2 = new QB("ЮUTЫRQШЧЦХФУТСРGОНМЛBA@ЗЖ=<;В9АЏЎЍ4ЋЊ1ЈЇІЅ,+");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(sXd3 + i5 + xuXd2.CK(iKK2));
                    i5++;
                }
                this.F.I(com.facetec.sdk.Code.Z(context, B(new String(iArr2, 0, i5), new int[]{59, 44, 171, 16}, false).intern(), Boolean.FALSE).B(new fq.Z().Code()).Z()).Z(new cf.I() { // from class: com.facetec.sdk.by.1
                    @Override // com.facetec.sdk.cf.I
                    public final void B(fy fyVar) throws Throwable {
                        if (fyVar.V()) {
                            ga gaVarD = fyVar.D();
                            by.B(context2, gaVarD != null ? gaVarD.V() : "", i2);
                        } else if (fyVar.I() == 401) {
                            by.Z(i2, new Code(false, false));
                        } else {
                            by.Z(i2, (Code) null);
                        }
                    }

                    @Override // com.facetec.sdk.cf.I
                    public final void Z() {
                        by.Z(i2, (Code) null);
                    }
                });
                int i6 = f3080d + 47;
                S = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 27 / 0;
                }
            } catch (Code.V unused) {
                Code(i2, (Code) null);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static synchronized ft V() {
        ft ftVarI;
        int i2 = 2 % 2;
        try {
            X509TrustManager x509TrustManagerV = af.V();
            SSLContext sSLContext = SSLContext.getInstance(B("\u0000\u0000\u0001", new int[]{35, 3, 0, 0}, false).intern());
            sSLContext.init(null, new TrustManager[]{x509TrustManagerV}, null);
            ftVarI = new ft.Z().I(new bc(sSLContext.getSocketFactory()), x509TrustManagerV).I();
            ftVarI.f().B();
            int i3 = f3080d + 103;
            S = i3 % 128;
            int i4 = i3 % 2;
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
            throw new RuntimeException();
        }
        return ftVarI;
    }

    private static String Z(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = S + 109;
        int i5 = i4 % 128;
        f3080d = i5;
        int i6 = i4 % 2;
        Object charArray = str;
        if (str != null) {
            int i7 = i5 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            S = i7 % 128;
            if (i7 % 2 != 0) {
                str.toCharArray();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        int i8 = 0;
        while (i8 < cArr.length) {
            int i9 = S + 39;
            f3080d = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2[i8] = (char) (((long) (cArr[i8] ^ (i8 / i2))) - L);
                i8 += 50;
            } else {
                cArr2[i8] = (char) (((long) (cArr[i8] ^ (i8 * i2))) ^ L);
                i8++;
            }
        }
        return new String(cArr2);
    }

    static /* synthetic */ void Z(I i2, Code code) {
        int i3 = 2 % 2;
        int i4 = S + 77;
        f3080d = i4 % 128;
        int i5 = i4 % 2;
        Code(i2, code);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    final void Z(Context context, D d2, boolean z2, final B b2) {
        cm cmVarCode;
        bu buVarB;
        String strIntern;
        String strB;
        int i2 = 2 % 2;
        ck ckVarI = new cp().Code().I();
        cv cvVar = new cv();
        cv cvVar2 = d2.V;
        short sXd = (short) (C1580rY.Xd() ^ (-8731));
        int[] iArr = new int["㬸ꎅ".length()];
        QB qb = new QB("㬸ꎅ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        if (cvVar2 == null) {
            try {
                if (be.V(context).booleanValue()) {
                    int i4 = f3080d + 95;
                    S = i4 % 128;
                    if (i4 % 2 != 0) {
                        bu buVar = be.B;
                        throw null;
                    }
                    buVarB = be.B;
                } else {
                    buVarB = be.B();
                }
                if (j.V) {
                    a.I(context, buVarB);
                }
            } catch (bi e2) {
                e2.printStackTrace();
            }
            cvVar.Z(Z(C1561oA.Yd("ⅅ阑ᣑ软ሧ腗\ufe1e碴\uf777爽\ue95c昣\ue0cf往", (short) (Od.Xd() ^ (-25334))), 33997 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), d2.Code);
            ArrayList<String> arrayList = d2.I;
            if (arrayList == null) {
                int i5 = S + 25;
                f3080d = i5 % 128;
                if (i5 % 2 == 0) {
                    cmVarCode = cs.I;
                    int i6 = 37 / 0;
                } else {
                    cmVarCode = cs.I;
                }
            } else {
                Class<?> cls = arrayList.getClass();
                dx dxVar = new dx();
                ckVarI.V(arrayList, cls, dxVar);
                cmVarCode = dxVar.Code();
            }
            cvVar.I(Z(str, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37039).intern(), cmVarCode);
            if (z2) {
                co coVar = new co();
                int[] iArr2 = {146, 13, 129, 0};
                short sXd2 = (short) (C1633zX.Xd() ^ (-4066));
                short sXd3 = (short) (C1633zX.Xd() ^ (-3898));
                int[] iArr3 = new int["JKŉMŋOōQRSőŒV".length()];
                QB qb2 = new QB("JKŉMŋOōQRSőŒV");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr3[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) + sXd3);
                    i7++;
                }
                coVar.B(B(new String(iArr3, 0, i7), iArr2, true).intern());
                cvVar.I(Z(Jg.Wd("ઋӄ＆裍", (short) (C1607wl.Xd() ^ 5766), (short) (C1607wl.Xd() ^ 27550)), 64007 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), coVar);
            }
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14081;
            short sXd4 = (short) (C1499aX.Xd() ^ (-21035));
            short sXd5 = (short) (C1499aX.Xd() ^ (-18384));
            int[] iArr4 = new int["㩷ﺴꠁ噁ᄅ糔搚쮃국Ὂྈ皑恎\uf66d洮劃됙驍ጣ".length()];
            QB qb3 = new QB("㩷ﺴꠁ噁ᄅ糔搚쮃국Ὂྈ皑恎\uf66d洮劃됙驍ጣ");
            int i8 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr4[i8] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd5) + sXd4)));
                i8++;
            }
            cvVar.Z(Z(new String(iArr4, 0, i8), keyRepeatTimeout).intern(), d2.Z);
            cvVar.Z(Z(C1626yg.Ud("㗷즹䲇슽䩲뛍䁽磆\uec91捧\ud889弱\ud905圛얫䧻뿰㫿띤", (short) (C1607wl.Xd() ^ 28798), (short) (C1607wl.Xd() ^ 11579)), 49991 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern(), d2.F);
            int[] iArr5 = {159, 12, 0, 10};
            short sXd6 = (short) (C1607wl.Xd() ^ 15333);
            int[] iArr6 = new int["\u0011ߋ|\u001aܨT>Сў~Ď\u001f".length()];
            QB qb4 = new QB("\u0011ߋ|\u001aܨT>Сў~Ď\u001f");
            int i9 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr6[i9] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ (sXd6 + i9)));
                i9++;
            }
            cvVar.Z(B(new String(iArr6, 0, i9), iArr5, false).intern(), d2.L);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1721;
            short sXd7 = (short) (OY.Xd() ^ 5547);
            int[] iArr7 = new int["승ꍵ鞰跋臫盷焽欶".length()];
            QB qb5 = new QB("승ꍵ鞰跋臫盷焽欶");
            int i10 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr7[i10] = xuXd5.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i10)) + xuXd5.CK(iKK5));
                i10++;
            }
            cvVar.Z(Z(new String(iArr7, 0, i10), iResolveSizeAndState).intern(), C);
            cvVar.Z(Z(C1561oA.Qd("䚄줗䨺켷埍\udcdf巚\ue27f殛\uf0a7", (short) (FB.Xd() ^ 21466)), 31470 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), Build.MANUFACTURER);
            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9498;
            short sXd8 = (short) (OY.Xd() ^ 16360);
            short sXd9 = (short) (OY.Xd() ^ 2949);
            int[] iArr8 = new int["㾬᪕\uf18e쳩ꏍ纵巳䄏ᡬ\ueb55쩄".length()];
            QB qb6 = new QB("㾬᪕\uf18e쳩ꏍ纵巳䄏ᡬ\ueb55쩄");
            int i12 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr8[i12] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd8 + i12)) - sXd9);
                i12++;
            }
            cvVar.Z(Z(new String(iArr8, 0, i12), i11).intern(), Build.MODEL);
            cvVar.Z(B(C1561oA.od("̯R̭PON̨̧̩̦IHGF̡", (short) (C1607wl.Xd() ^ 17129)), new int[]{171, 15, 173, 2}, false).intern(), Build.VERSION.RELEASE);
            cvVar.Z(B(C1561oA.Kd("˂\\]˅ˆˇˈbcdef", (short) (C1580rY.Xd() ^ (-19185))), new int[]{186, 12, 37, 10}, true).intern(), Z(Wg.Zd("\uf729焅\udcc8媏웇䂌갼", (short) (C1580rY.Xd() ^ (-4592)), (short) (C1580rY.Xd() ^ (-3151))), (ViewConfiguration.getPressedStateDuration() >> 16) + 29587).intern());
            cvVar.Z(Z(C1561oA.Xd("ᔫ狈틕㊌銜\uf238刹뉝̄爭폃", (short) (C1607wl.Xd() ^ 7222)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40932).intern(), Build.BRAND);
            cvVar.Z(Z(Wg.vd("鼥廦Ἳ흶龦左ṇ홰麺愅ℱ\ud970ꆸ念‸\ud883", (short) (ZN.Xd() ^ 24810)), (ViewConfiguration.getLongPressTimeout() >> 16) + 16447).intern(), Build.BOOTLOADER);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 39703;
            short sXd10 = (short) (Od.Xd() ^ (-28044));
            short sXd11 = (short) (Od.Xd() ^ (-25401));
            int[] iArr9 = new int["ﾰ梙쵲⻥鏑ﲹ戂싽⟶酛\uf63f场몤ὦ裓\uedce什".length()];
            QB qb7 = new QB("ﾰ梙쵲⻥鏑ﲹ戂싽⟶酛\uf63f场몤ὦ裓\uedce什");
            int i13 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr9[i13] = xuXd7.fK(((sXd10 + i13) + xuXd7.CK(iKK7)) - sXd11);
                i13++;
            }
            cvVar.Z(Z(new String(iArr9, 0, i13), scrollDefaultDelay).intern(), Build.FINGERPRINT);
            int[] iArr10 = {198, 16, 0, 0};
            short sXd12 = (short) (C1499aX.Xd() ^ (-29710));
            short sXd13 = (short) (C1499aX.Xd() ^ (-23693));
            int[] iArr11 = new int["э$#\"щшч\u001e\u001d\u001c\u001b\u001a\u0019рп\u0016".length()];
            QB qb8 = new QB("э$#\"щшч\u001e\u001d\u001c\u001b\u001a\u0019рп\u0016");
            int i14 = 0;
            while (qb8.YK()) {
                int iKK8 = qb8.KK();
                Xu xuXd8 = Xu.Xd(iKK8);
                iArr11[i14] = xuXd8.fK(sXd12 + i14 + xuXd8.CK(iKK8) + sXd13);
                i14++;
            }
            cvVar.B(B(new String(iArr11, 0, i14), iArr10, false).intern(), Integer.valueOf(Build.VERSION.SDK_INT));
            int keyRepeatTimeout2 = 49991 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            short sXd14 = (short) (Od.Xd() ^ (-31275));
            int[] iArr12 = new int["\uebb8⳯樺ꍨ\udea5ᯇ崛驄핸ໆ䱲螦죞".length()];
            QB qb9 = new QB("\uebb8⳯樺ꍨ\udea5ᯇ崛驄핸ໆ䱲螦죞");
            int i15 = 0;
            while (qb9.YK()) {
                int iKK9 = qb9.KK();
                Xu xuXd9 = Xu.Xd(iKK9);
                iArr12[i15] = xuXd9.fK(sXd14 + i15 + xuXd9.CK(iKK9));
                i15++;
            }
            cvVar.Z(Z(new String(iArr12, 0, i15), keyRepeatTimeout2).intern(), I);
            cvVar.Z(Z(C1561oA.yd("㢑껈ⵤꆒ\u1ff5陆ᛱ蔔ঢ矈\uf665", (short) (OY.Xd() ^ 15256)), 34403 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), FaceTecSDK.version());
            cvVar.B(B(C1561oA.Yd("ںYZ[ھ]^ہۂaۄۅd", (short) (C1580rY.Xd() ^ (-4235))), new int[]{Mp4VideoDirectory.TAG_FRAME_RATE, 13, 22, 0}, true).intern(), Integer.valueOf(n.V));
            cvVar.Z(Z(Xg.qd("ᓾவ\uf057\ue170혡윿돞ꪹ鯈衝禑渴录䯾䊦㏅₃ʋอ\uf75d\ue414\udaad쮼롵ꦃ鸻軮簝狂揥傇䆚", (short) (ZN.Xd() ^ 28166), (short) (ZN.Xd() ^ 32731)), ((Process.getThreadPriority(0) + 20) >> 6) + 3803).intern(), be.I);
            cvVar.Z(B((String) null, new int[]{227, 19, 81, 11}, true).intern(), Arrays.toString(Build.SUPPORTED_ABIS));
            int i16 = S + 47;
            f3080d = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int[] iArr13 = {246, 7, 0, 0};
            short sXd15 = (short) (ZN.Xd() ^ 18712);
            short sXd16 = (short) (ZN.Xd() ^ 30719);
            int[] iArr14 = new int["ߘf\u0557\"\u0002ս=".length()];
            QB qb10 = new QB("ߘf\u0557\"\u0002ս=");
            int i18 = 0;
            while (qb10.YK()) {
                int iKK10 = qb10.KK();
                Xu xuXd10 = Xu.Xd(iKK10);
                iArr14[i18] = xuXd10.fK(xuXd10.CK(iKK10) - ((i18 * sXd16) ^ sXd15));
                i18++;
            }
            cvVar.I(B(new String(iArr14, 0, i18), iArr13, false).intern(), d2.V);
            cvVar.B(B(ZO.xd("ȽQ\"{", (short) (OY.Xd() ^ 13614), (short) (OY.Xd() ^ 5229)), new int[]{253, 4, 0, 0}, false).intern(), 1);
            int[] iArr15 = {257, 3, 103, 0};
            short sXd17 = (short) (C1633zX.Xd() ^ (-14823));
            short sXd18 = (short) (C1633zX.Xd() ^ (-19875));
            int[] iArr16 = new int["bݣ̹".length()];
            QB qb11 = new QB("bݣ̹");
            int i19 = 0;
            while (qb11.YK()) {
                int iKK11 = qb11.KK();
                Xu xuXd11 = Xu.Xd(iKK11);
                iArr16[i19] = xuXd11.fK((C1561oA.Xd[i19 % C1561oA.Xd.length] ^ ((sXd17 + sXd17) + (i19 * sXd18))) + xuXd11.CK(iKK11));
                i19++;
            }
            cvVar.B(B(new String(iArr16, 0, i19), iArr15, false).intern(), 1);
            cvVar.Z(Z(Ig.wd("㋇ʺ嫄壅", (short) (OY.Xd() ^ 9568)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64282).intern(), ad.V);
            cvVar.Z(Z(EO.Od("要㬗跭흠ఫ", (short) (FB.Xd() ^ 22252)), 45427 - View.getDefaultSize(0, 0)).intern(), d2.D);
            String strQd = C1561oA.Qd("ܜ\u0006", (short) (OY.Xd() ^ 23103));
            cvVar.Z(B(strQd, new int[]{260, 2, 73, 0}, false).intern(), n.I);
            cvVar.Z(B(C1593ug.zd("mܝ", (short) (C1499aX.Xd() ^ (-18622)), (short) (C1499aX.Xd() ^ (-2577))), new int[]{262, 2, 0, 0}, true).intern(), I);
            cvVar.Z(B(strQd, new int[]{264, 2, 114, 0}, false).intern(), Build.MODEL);
            cvVar.Z(B(C1561oA.od("˰˯", (short) (Od.Xd() ^ (-23718))), new int[]{266, 2, 102, 1}, false).intern(), FaceTecSDK.version());
            cvVar.Z(B(C1561oA.Kd("ՆՇDՉ", (short) (C1580rY.Xd() ^ (-2234))), new int[]{268, 4, 70, 1}, true).intern(), UUID.randomUUID().toString());
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15161;
            short sXd19 = (short) (FB.Xd() ^ 20532);
            short sXd20 = (short) (FB.Xd() ^ 27337);
            int[] iArr17 = new int["븯謊噪ᶨ\ue0ec뉂膞䳤".length()];
            QB qb12 = new QB("븯謊噪ᶨ\ue0ec뉂膞䳤");
            int i20 = 0;
            while (qb12.YK()) {
                int iKK12 = qb12.KK();
                Xu xuXd12 = Xu.Xd(iKK12);
                iArr17[i20] = xuXd12.fK(((i20 * sXd20) ^ sXd19) + xuXd12.CK(iKK12));
                i20++;
            }
            cvVar.Z(Z(new String(iArr17, 0, i20), touchSlop).intern(), "");
            cvVar.Z(B(strQd, new int[]{272, 2, 140, 1}, true).intern(), C);
            co coVar2 = new co();
            coVar2.B(bz.Code(bo.S));
            cvVar.I(Z(str, KeyEvent.keyCodeFromString("") + 37039).intern(), coVar2);
        }
        String strIntern2 = Z(C1561oA.Xd("忛툒䱊뺆㚭ꣶ⌲锯ሆ籕\uf692替\ue0f1孇쵬䨧둦", (short) (FB.Xd() ^ 13741)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 35401).intern();
        Class<?> cls2 = Class.forName(Wg.vd("'5(71,$n!.*1\u001f),f\u0019FBI7KD", (short) (FB.Xd() ^ 31650)));
        Class<?>[] clsArr = {Class.forName(Qg.kd("\b}\u0012{G\u0005x\u0005|Bf\u0007\u0004y}u", (short) (ZN.Xd() ^ 1553), (short) (ZN.Xd() ^ 518))), Integer.TYPE};
        Object[] objArr = {strIntern2, 0};
        short sXd21 = (short) (OY.Xd() ^ 3857);
        short sXd22 = (short) (OY.Xd() ^ 21718);
        int[] iArr18 = new int["fcqOc[k][FgYYWcU]QR_".length()];
        QB qb13 = new QB("fcqOc[k][FgYYWcU]QR_");
        int i21 = 0;
        while (qb13.YK()) {
            int iKK13 = qb13.KK();
            Xu xuXd13 = Xu.Xd(iKK13);
            iArr18[i21] = xuXd13.fK(sXd21 + i21 + xuXd13.CK(iKK13) + sXd22);
            i21++;
        }
        Method method = cls2.getMethod(new String(iArr18, 0, i21), clsArr);
        try {
            method.setAccessible(true);
            String string = ((SharedPreferences) method.invoke(context, objArr)).getString(B(C1561oA.ud("̺^̸̷̶ZY̳̲̱̰T̮R̬̫ON̨LKJIH̢̡EDCB", (short) (C1580rY.Xd() ^ (-29262))), new int[]{0, 30, 0, 12}, false).intern(), null);
            String strYd = C1561oA.yd("ʂ'ʄʃɾ", (short) (C1607wl.Xd() ^ 735));
            if (string != null) {
                int i22 = f3080d + 49;
                S = i22 % 128;
                cvVar.Z((i22 % 2 != 0 ? B(strYd, new int[]{274, 5, 0, 0}, false) : B(strYd, new int[]{274, 5, 0, 0}, true)).intern(), string);
            } else {
                cvVar.Z(B(strYd, new int[]{274, 5, 0, 0}, true).intern(), "");
            }
            String str2 = d2.B;
            if (str2 == null || str2.isEmpty()) {
                int[] iArr19 = {332, 46, 130, 1};
                short sXd23 = (short) (C1607wl.Xd() ^ 21037);
                short sXd24 = (short) (C1607wl.Xd() ^ 16864);
                int[] iArr20 = new int["Σݛ\"ɊȈȕΉϦ̟ۙͅɶ_N؍i~>dϽ\u0001]ԅڽߓ܅\u001aлő[ЉëӠ͠\u0016ïp*\rɈ̄,aCŭħ".length()];
                QB qb14 = new QB("Σݛ\"ɊȈȕΉϦ̟ۙͅɶ_N؍i~>dϽ\u0001]ԅڽߓ܅\u001aлő[ЉëӠ͠\u0016ïp*\rɈ̄,aCŭħ");
                int i23 = 0;
                while (qb14.YK()) {
                    int iKK14 = qb14.KK();
                    Xu xuXd14 = Xu.Xd(iKK14);
                    iArr20[i23] = xuXd14.fK((C1561oA.Xd[i23 % C1561oA.Xd.length] ^ ((sXd23 + sXd23) + (i23 * sXd24))) + xuXd14.CK(iKK14));
                    i23++;
                }
                strIntern = B(new String(iArr20, 0, i23), iArr19, true).intern();
            } else {
                int i24 = S + 55;
                f3080d = i24 % 128;
                if (i24 % 2 == 0) {
                    cvVar.Z(Z(C1561oA.Yd("仂\ue957艥❌쁍嶃\uf655鍴㱺텙橾ཱིꢆ䴘\ude16", (short) (FB.Xd() ^ 1055)), (ViewConfiguration.getPressedStateDuration() >>> 27) * 2490).intern(), str2);
                    strB = B(Xg.qd("ٜ:;ٟ=١٢٣AB٦DE٩٪HI٭ٮٯMNٲPQRٶTٸٹWٻټZپٿڀځ_ڃabcڇڈډڊhijڎڏڐ", (short) (C1633zX.Xd() ^ (-15689)), (short) (C1633zX.Xd() ^ (-3607))), new int[]{279, 53, 0, 0}, true);
                } else {
                    cvVar.Z(Z(Jg.Wd("ᣇ\ued48\ue756\ued39\ue73a\ue56c\ue73e\ue559\ue75f\ue54a\udf6f\ue560\udf73\ue501\udeff", (short) (OY.Xd() ^ 7009), (short) (OY.Xd() ^ 22039)), (ViewConfiguration.getPressedStateDuration() >> 16) + 25339).intern(), str2);
                    strB = B(ZO.xd("\u0557a,\u05f9A˃ėʹ4CȌ](ȳ\u008b:\u0018کǟɇl\u0017ܟ\u0007?2ݵmէǿ1؇è\u000bўչ͇ܓ\u0016٥\u0006V\u000fЪƷЙٹc\u00172À\u05edȹ", (short) (C1607wl.Xd() ^ 17593), (short) (C1607wl.Xd() ^ 26844)), new int[]{279, 53, 0, 0}, true);
                }
                strIntern = strB.intern();
            }
            try {
                try {
                    this.F.I(com.facetec.sdk.Code.Code(context, strIntern, cvVar)).Z(new cf.I() { // from class: com.facetec.sdk.by.4
                        @Override // com.facetec.sdk.cf.I
                        public final void B(fy fyVar) throws IOException {
                            if (!fyVar.V()) {
                                b2.B();
                            } else {
                                by.V++;
                                b2.Code();
                            }
                        }

                        @Override // com.facetec.sdk.cf.I
                        public final void Z() {
                            b2.B();
                        }
                    });
                } catch (Code.V e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } catch (Code.V e4) {
                e = e4;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
