package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.fv;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes3.dex */
final class Code implements ZoomEncryptStrings {
    private static boolean B = false;
    private static char C = 0;
    private static boolean Code = false;
    private static int D = 0;
    private static int F = 1;
    private static int I = 0;
    private static int L = 0;
    private static long S = 0;
    private static char[] V = null;
    private static final fw Z;

    static class V extends Exception {
        V(String str) {
            super(str);
        }
    }

    static {
        Code();
        Z = fw.V(I("\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString("") - 606153020, "劕퍼䅤컩ൣ͑谚廝뱕珖̶罤뒔橘夨䫎z䇠䭔梔ᜩ\ue99eᏊꃞ\u1a8a颃\ue696퉏輯㶶㮨", (char) (21382 - TextUtils.indexOf((CharSequence) "", '0', 0)), "쓋\uded6蟛噓").intern());
        int i2 = L + 17;
        F = i2 % 128;
        int i3 = i2 % 2;
    }

    Code() {
    }

    static fv Code(Context context, String str, Object obj) throws V {
        int i2 = 2 % 2;
        fv fvVarZ = V(context, str).B(gb.V(Z, new cp().Code().I().I(obj))).Z();
        int i3 = L + 107;
        F = i3 % 128;
        if (i3 % 2 != 0) {
            return fvVarZ;
        }
        throw null;
    }

    static void Code() {
        I = 179;
        B = true;
        V = new char[]{267, 224, 244, 291, 263, 290, 286, 280, 289, 264, 294, 293, 282, 295, 248, 288, 276, 284, 287, 278, 283, 254, 300, 211, 297, 277, 246};
        Code = true;
        C = (char) 0;
        D = -1330460799;
        S = 0L;
    }

    private static String I(String str, int i2, String str2, char c2, String str3) {
        int i3 = 2 % 2;
        int i4 = L + 81;
        F = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            int i6 = L + 99;
            F = i6 % 128;
            if (i6 % 2 == 0) {
                str2.toCharArray();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            int i7 = F + 45;
            L = i7 % 128;
            int i8 = i7 % 2;
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) cArr.clone();
        char[] cArr4 = (char[]) ((char[]) charArray3).clone();
        cArr3[0] = (char) (c2 ^ cArr3[0]);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length = cArr2.length;
        char[] cArr5 = new char[length];
        for (int i9 = 0; i9 < length; i9++) {
            et.Z(cArr3, cArr4, i9);
            cArr5[i9] = (char) (((((long) (cArr2[i9] ^ cArr3[(i9 + 3) % 4])) ^ S) ^ ((long) D)) ^ ((long) C));
        }
        return new String(cArr5);
    }

    static fv.Z V(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 25;
        L = i3 % 128;
        int i4 = i3 % 2;
        fv.Z Z2 = Z(context, str, Boolean.TRUE);
        int i5 = F + 57;
        L = i5 % 128;
        int i6 = i5 % 2;
        return Z2;
    }

    private static String V(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = F + 3;
            L = i4 % 128;
            int i5 = i4 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        int i6 = 0;
        Object charArray = str;
        if (str != null) {
            int i7 = L + 77;
            F = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 82 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = V;
        int i9 = I;
        if (Code) {
            int length = bArr.length;
            char[] cArr3 = new char[length];
            while (i6 < length) {
                cArr3[i6] = (char) (cArr2[bArr[(length - 1) - i6] + i2] - i9);
                i6++;
            }
            return new String(cArr3);
        }
        if (B) {
            int length2 = cArr.length;
            char[] cArr4 = new char[length2];
            while (i6 < length2) {
                cArr4[i6] = (char) (cArr2[cArr[(length2 - 1) - i6] - i2] - i9);
                i6++;
            }
            return new String(cArr4);
        }
        int length3 = iArr.length;
        char[] cArr5 = new char[length3];
        while (i6 < length3) {
            cArr5[i6] = (char) (cArr2[iArr[(length3 - 1) - i6] - i2] - i9);
            i6++;
        }
        return new String(cArr5);
    }

    static fv.Z Z(Context context, String str, Boolean bool) throws Throwable {
        int i2 = 2 % 2;
        fv.Z Z2 = new fv.Z().I(str).Z(V(null, KeyEvent.getDeadChar(0, 0) + 127, null, C1561oA.Qd("¶´²°®ª«ª¨¦¤", (short) (C1580rY.Xd() ^ (-18019)))).intern(), n.I).Z(V(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, C1593ug.zd("ЅЁЁЇϾϾЉІЊЊ", (short) (C1633zX.Xd() ^ (-8054)), (short) (C1633zX.Xd() ^ (-14054)))).intern(), by.Code(n.I));
        int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        String strOd = C1561oA.od("ᄛﴢᵂ㲟", (short) (C1633zX.Xd() ^ (-3264)));
        String strKd = C1561oA.Kd("ӔӕӖӗ", (short) (C1499aX.Xd() ^ (-16230)));
        fv.Z Z3 = Z2.Z(I(strKd, i3, Wg.Zd("Ѝ譨\udbcd界\uecb7\ue14c\uf1fb此ᆒ파ﶏ鿚", (short) (OY.Xd() ^ 5778), (short) (OY.Xd() ^ 23310)), c2, strOd).intern(), by.Code(n.I));
        int iRed = 1921158755 - Color.red(0);
        char cBlue = (char) (Color.blue(0) + 39581);
        String strXd = C1561oA.Xd("릘\ud842\uf327셐", (short) (C1580rY.Xd() ^ (-16814)));
        short sXd = (short) (C1633zX.Xd() ^ (-31229));
        int[] iArr = new int["磰ጳ꾄ᬄ\ua63d걁偗\u009a滤쵝ﯗ撑\ud9bf뎟㺃".length()];
        QB qb = new QB("磰ጳ꾄ᬄ\ua63d걁偗\u009a滤쵝ﯗ撑\ud9bf뎟㺃");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((sXd ^ i4) + xuXd.CK(iKK));
            i4++;
        }
        String strIntern = I(strKd, iRed, new String(iArr, 0, i4), cBlue, strXd).intern();
        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 36130);
        String strKd2 = Qg.kd("肾锢䀷핀רּ\ued60籺넯㙣戞\u192d虲㑵\u2ddf髦\ue126璌裂籢\u0c3a맹乙ό碢릂㔢鑑ꑤត孈㚣䧟", (short) (OY.Xd() ^ 16342), (short) (OY.Xd() ^ 9537));
        String strVd = yg.hg.Vd("㵜쇝議嫰", (short) (ZN.Xd() ^ 21163), (short) (ZN.Xd() ^ 7375));
        fv.Z Z4 = Z3.Z(strIntern, I(strKd, scrollBarFadeDuration, strKd2, threadPriority, strVd).intern());
        Object[] objArr = {I(strKd, 1990431382 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), C1561oA.yd("京㻥픡⦘婟⏛偋ぺ忣騚孛\udd0e놾莞\ue630䷉慘", (short) (C1607wl.Xd() ^ 12638)), (char) (6083 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), C1561oA.ud("藍鎎덱\ue911", (short) (C1633zX.Xd() ^ (-29752)))).intern(), 0};
        Method method = Class.forName(C1561oA.Yd("7E<KID@\u000bANNUGQX\u0013)VV]Oc`", (short) (C1499aX.Xd() ^ (-19465)))).getMethod(Jg.Wd("U\u000e`ayM#9;!f\\}w'\u001dI:?p", (short) (C1580rY.Xd() ^ (-6478)), (short) (C1580rY.Xd() ^ (-26634))), Class.forName(Xg.qd("0(>*w7-;5|#ED<B<", (short) (C1633zX.Xd() ^ (-1779)), (short) (C1633zX.Xd() ^ (-5718)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
            char cNormalizeMetaState = (char) (3929 - KeyEvent.normalizeMetaState(0));
            short sXd2 = (short) (C1580rY.Xd() ^ (-20658));
            short sXd3 = (short) (C1580rY.Xd() ^ (-32706));
            int[] iArr2 = new int["\ud8ecﾛ\udfb1Ⲛ".length()];
            QB qb2 = new QB("\ud8ecﾛ\udfb1Ⲛ");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd3) + sXd2)));
                i5++;
            }
            String string = sharedPreferences.getString(I(strKd, pressedStateDuration, C1626yg.Ud("롚욷Ⴁ믐\ua8df㮵媑閭磓㥶삝섀怗䯊릘ｰႵ쐒ዢ瘞밬갪ࡊ꩝諢樾㔠罁⣛㽉", (short) (C1633zX.Xd() ^ (-24062)), (short) (C1633zX.Xd() ^ (-3779))), cNormalizeMetaState, new String(iArr2, 0, i5)).intern(), "");
            if (!string.equals("")) {
                int i6 = F + 7;
                L = i6 % 128;
                int i7 = i6 % 2;
                Z4.Z(V(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, Ig.wd("ܪۃ\u070fϭ߬ނ¶ۦڊƄǽɝ", (short) (C1633zX.Xd() ^ (-13718)))).intern(), string);
            }
            if (bool.booleanValue()) {
                if (by.Z == null) {
                    throw new V(V(null, View.resolveSizeAndState(0, 0, 0) + 127, null, C1561oA.od("ʤʮʴʪʫʩʧʮʥʫʠʗʙʧʥʕʢʓʟʝʙʛ", (short) (ZN.Xd() ^ 13060))).intern());
                }
                try {
                    String lowerCase = C1150r.I(new StringBuilder().append(I(strKd, Process.myTid() >> 22, strKd2, (char) (KeyEvent.getDeadChar(0, 0) + 36130), strVd).intern()).append(by.Z).toString()).toLowerCase();
                    int i8 = 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    short sXd4 = (short) (Od.Xd() ^ (-17974));
                    int[] iArr3 = new int["ۘ˦̨ȈύΟȺä¦ռ\u05fdыЙ".length()];
                    QB qb3 = new QB("ۘ˦̨ȈύΟȺä¦ռ\u05fdыЙ");
                    int i9 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i9] = xuXd3.fK((C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i9)) + xuXd3.CK(iKK3));
                        i9++;
                    }
                    Z4.Z(V(null, i8, null, new String(iArr3, 0, i9)).intern(), lowerCase);
                } catch (Exception unused) {
                    int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2960);
                    short sXd5 = (short) (OY.Xd() ^ 2976);
                    int[] iArr4 = new int["ᮖ썡虛\uf030".length()];
                    QB qb4 = new QB("ᮖ썡虛\uf030");
                    int i10 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i10] = xuXd4.fK(sXd5 + sXd5 + sXd5 + i10 + xuXd4.CK(iKK4));
                        i10++;
                    }
                    String str2 = new String(iArr4, 0, i10);
                    short sXd6 = (short) (FB.Xd() ^ 10374);
                    short sXd7 = (short) (FB.Xd() ^ 27137);
                    int[] iArr5 = new int["笂圀뿗똩ࠎ೦ꮝϣ䅲둿砢羯材岼\uf440ꮧ܆쬳伔魝栬ﲚܐᐊꄌ儔".length()];
                    QB qb5 = new QB("笂圀뿗똩ࠎ೦ꮝϣ䅲둿砢羯材岼\uf440ꮧ܆쬳伔魝栬ﲚܐᐊꄌ儔");
                    int i11 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i11] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i11)) - sXd7);
                        i11++;
                    }
                    throw new V(I(strKd, scrollDefaultDelay, new String(iArr5, 0, i11), keyRepeatTimeout, str2).intern());
                }
            }
            int i12 = F + 115;
            L = i12 % 128;
            int i13 = i12 % 2;
            return Z4;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
