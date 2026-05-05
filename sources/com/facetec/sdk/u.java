package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class u implements ZoomEncryptStrings {
    private static long B = 5610564986093355631L;
    private static int Code = 0;
    private static long I = 6666765044498084772L;
    private static int V = 1;
    private static char[] Z = {4299, 41854, 30610, 2575, 56926, 25582, 17092, 61795, 9611, 22586, 35911, 49380, 30495, 43949, 'y', 46045, 26417, 6805, 52925, 33401, 13717, 59729, 40260, 20640, 47017, 1113, 53409, 44301, 31099, 13782, 33285, 24231, 10946, 59164, 45969, 4067, CharCompanionObject.MIN_LOW_SURROGATE, 43161, 25894, 12617, 36347, 23065, 5676, 58013, 49021, AbstractJsonLexerKt.COMMA, 'M', 46050, 26403, 6811, 52949, 33347, 13697, 59700, 40299, 20651, 1074, 47173, 27594, 7998, 53960, 34527, 14849, 60853, 41425, 21861, 2203, 48155, 28738, 9205, 55066, 35694, 16024, 61960, 42417, 22981, 3419, 49304, 29905, 10307, 56201, 36649, 17248, 63186, 43616, 23954, 4500, 50461, 30894, 11469, 57350, 37792, 18210, 64328, 44686, 25139, 5724, 51708, 32101, 12419, 58569, 38986, 19380, 65513, 45948, 26265, 6697, 52826, 33224, 13581, 59658, 40180, 20521, 952, 47101, 27518, 7820, 53772, 34378, 14762, 60707, 41321, 21706, 2157, 48025, 28669, 9018, 54953, 35547, 15901, 61831, 42262, 22878, 3326, 49206, 29802, 10137, 56092, 36548, 17116, 63088, 43451, 23983, 4370, 50331, 30791, 11390, 57316, 37678, 18056, 64152, 44586, 25018, 5563, 51582, 31916, 12328, 58488, 38839, 19217, 65407, 45795, 26138, 6599, 52714, 33104, 13463, 59632, 40057, 20465, 845, 46878, 'S', 46060, 26377, 6878, 52901, 33282, 13743, 59669, 40276, 20652, 1069, 47183, 27636, 7943, 53945};

    enum I {
        NOT_PRESENT,
        INVALID,
        VALIDATED
    }

    u() {
    }

    private static boolean B(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        String strIntern = V(126 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getOffsetBefore("", 0), 46 - Color.red(0)).intern();
        Class<?> cls = Class.forName(C1561oA.Kd("\u007f\u000e\u0005\u0014\u0012\r\tS\u001c\u001c\u0012\u0016Xm\u000e!\u0014ed", (short) (C1607wl.Xd() ^ 16444)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-13574));
        short sXd2 = (short) (C1580rY.Xd() ^ (-21902));
        int[] iArr = new int["\r\u0017rp\u0004U!t\u0001\u0016F>~\u0005`d".length()];
        QB qb = new QB("\r\u0017rp\u0004U!t\u0001\u0016F>~\u0005`d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strIntern, 0};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("\u000e\u0010\u000f\u001c\u0012\u0014", (short) (C1499aX.Xd() ^ (-27649))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr3 = (byte[]) declaredMethod.invoke(null, objArr);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 40933;
            short sXd3 = (short) (C1607wl.Xd() ^ 29806);
            int[] iArr2 = new int["婶\uee14".length()];
            QB qb2 = new QB("婶\uee14");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
                i4++;
            }
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(I(new String(iArr2, 0, i4), threadPriority).intern()).generatePublic(new X509EncodedKeySpec(bArr3));
            Signature signature = Signature.getInstance(V(14 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 172 - Color.alpha(0)).intern());
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArr);
            boolean zVerify = signature.verify(bArr2);
            int i5 = Code + 117;
            V = i5 % 128;
            int i6 = i5 % 2;
            return zVerify;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static I I(Context context, String str, String str2) {
        int i2 = 2 % 2;
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(str));
            int i3 = V + 33;
            Code = i3 % 128;
            int i4 = i3 % 2;
            String property = properties.getProperty(I("숊볈㾡뺛㥡롍㬑먗㓣럝", 32480 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), "");
            String strReplaceAll = properties.getProperty(V(((byte) KeyEvent.getModifierMetaStateMask()) + 6, (char) ((Process.myPid() >> 22) + 4266), (-1) - ExpandableListView.getPackedPositionChild(0L)).intern(), "").replaceAll(V(1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (25547 - ImageFormat.getBitsPerPixel(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4).intern(), "");
            String property2 = properties.getProperty(I("숄溗鬬", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44189).intern(), "");
            if (!property.isEmpty() && !strReplaceAll.isEmpty()) {
                int i5 = V + 61;
                Code = i5 % 128;
                int i6 = i5 % 2;
                if (!property2.isEmpty()) {
                    String property3 = properties.getProperty(V(9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17058), 6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern(), "");
                    if (!V(context, strReplaceAll)) {
                        return I.INVALID;
                    }
                    try {
                        if (new Date().after(new SimpleDateFormat(V(9 - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14).intern()).parse(property))) {
                            return I.INVALID;
                        }
                        byte[] bArrV = V(property2);
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrV, 1, bArrV.length);
                        try {
                            boolean zB = B(C1150r.I(V(21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (46984 - (ViewConfiguration.getTouchSlop() >> 8)), Color.rgb(0, 0, 0) + 16777240).intern().getBytes(), new StringBuilder().append(str2).append(strReplaceAll).append(property).append(property3).toString()), bArrCopyOfRange);
                            if (zB) {
                                int i7 = V + 5;
                                Code = i7 % 128;
                                if (i7 % 2 != 0) {
                                    property3.isEmpty();
                                    throw null;
                                }
                                if (!property3.isEmpty() && Arrays.asList(property3.split(V((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 45 - (Process.myPid() >> 22)).intern())).contains(I("숝㦌㔞", 64399 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                                    int i8 = Code + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                                    V = i8 % 128;
                                    int i9 = i8 % 2;
                                    cb.Z = true;
                                }
                            }
                            if (!zB) {
                                return I.INVALID;
                            }
                            I i10 = I.VALIDATED;
                            int i11 = V + 27;
                            Code = i11 % 128;
                            int i12 = i11 % 2;
                            return i10;
                        } catch (Exception unused) {
                            return I.INVALID;
                        }
                    } catch (ParseException unused2) {
                        return I.INVALID;
                    }
                }
            }
            return I.INVALID;
        } catch (IOException unused3) {
            return I.NOT_PRESENT;
        }
    }

    private static String I(String str, int i2) {
        int i3 = 2 % 2;
        Object charArray = str;
        if (str != null) {
            int i4 = V + 35;
            Code = i4 % 128;
            int i5 = i4 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        for (int i6 = 0; i6 < cArr.length; i6++) {
            int i7 = V + 1;
            Code = i7 % 128;
            int i8 = i7 % 2;
            cArr2[i6] = (char) (((long) (cArr[i6] ^ (i6 * i2))) ^ B);
        }
        return new String(cArr2);
    }

    private static String V(int i2, char c2, int i3) {
        char[] cArr;
        int i4;
        int i5 = 2 % 2;
        int i6 = V + 13;
        Code = i6 % 128;
        if (i6 % 2 != 0) {
            cArr = new char[i2];
            i4 = 1;
        } else {
            cArr = new char[i2];
            i4 = 0;
        }
        while (i4 < i2) {
            int i7 = V + 125;
            Code = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[i4] = (char) ((((long) Z[i3 * i4]) + (((long) i4) / I)) - ((long) c2));
                i4 += 81;
            } else {
                cArr[i4] = (char) ((((long) Z[i3 + i4]) ^ (((long) i4) * I)) ^ ((long) c2));
                i4++;
            }
        }
        return new String(cArr);
    }

    private static boolean V(Context context, String str) throws Throwable {
        String[] strArrSplit;
        int length;
        boolean zEquals;
        int i2 = 2 % 2;
        int i3 = V + 17;
        Code = i3 % 128;
        if (i3 % 2 != 0) {
            Color.alpha(0);
            strArrSplit = str.split(V(0, (char) View.MeasureSpec.getMode(0), 17 >> (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1))).intern());
            length = strArrSplit.length;
        } else {
            strArrSplit = str.split(V(Color.alpha(0) + 1, (char) View.MeasureSpec.getMode(0), 45 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            length = strArrSplit.length;
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = V + 107;
            Code = i5 % 128;
            int i6 = i5 % 2;
            String str2 = strArrSplit[i4];
            if (str2.endsWith(I(Qg.kd("\ue8f4", (short) (OY.Xd() ^ 7623), (short) (OY.Xd() ^ 13110)), 24359 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                String strSubstring = str2.substring(0, str2.length() - 1);
                Object[] objArr = new Object[0];
                Method method = Class.forName(yg.hg.Vd("'3(51*$l!,*/\u001f',dx$\"'\u0017)$", (short) (ZN.Xd() ^ FirebaseError.ERROR_REQUIRES_RECENT_LOGIN), (short) (ZN.Xd() ^ 204))).getMethod(C1561oA.ud("khvQabi^c`HZe\\", (short) (FB.Xd() ^ 27972)), new Class[0]);
                try {
                    method.setAccessible(true);
                    zEquals = ((String) method.invoke(context, objArr)).startsWith(strSubstring);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                short sXd = (short) (C1607wl.Xd() ^ 4534);
                int[] iArr = new int["R`Wf\\WS\u001eLYY`JT[\u0016Dqqxbvs".length()];
                QB qb = new QB("R`Wf\\WS\u001eLYY`JT[\u0016Dqqxbvs");
                int i7 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i7] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i7));
                    i7++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i7)).getMethod(C1561oA.Yd("54D!36?6=<&:G@", (short) (C1633zX.Xd() ^ (-29713))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    zEquals = str2.equals((String) method2.invoke(context, objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if ((zEquals ? '+' : 'I') == '+') {
                int i8 = V + 41;
                Code = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return false;
    }

    private static byte[] V(String str) {
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = Code + 81;
        V = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            length = str.length();
            i2 = length * 4;
        } else {
            length = str.length();
            i2 = length / 2;
        }
        byte[] bArr = new byte[i2];
        while (i5 < length) {
            int i6 = Code + 55;
            V = i6 % 128;
            if (i6 % 2 == 0) {
                bArr[i5 >>> 2] = (byte) ((Character.digit(str.charAt(i5), 110) << 3) << Character.digit(str.charAt(i5 << 1), 58));
                i5 += 50;
            } else {
                bArr[i5 / 2] = (byte) ((Character.digit(str.charAt(i5), 16) << 4) + Character.digit(str.charAt(i5 + 1), 16));
                i5 += 2;
            }
        }
        return bArr;
    }
}
