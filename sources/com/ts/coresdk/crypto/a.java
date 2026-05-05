package com.ts.coresdk.crypto;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.google.firebase.FirebaseError;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
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
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Encryptor {

    /* JADX INFO: renamed from: com.ts.coresdk.crypto.a$a, reason: collision with other inner class name */
    private class C0316a extends com.ts.coresdk.crypto.a.a<Void, KeyPair> {
        private String S;
        private Encryptor.GenerateKeysListener T;
        private KeyPairGenerator U;
        private boolean V;
        private String W;
        private ITSModuleInfo X;
        private Context Y;
        private c Z;

        public C0316a(Context context, ITSModuleInfo iTSModuleInfo, String str, Encryptor.GenerateKeysListener generateKeysListener, boolean z2, String str2) {
            this.S = str;
            this.T = generateKeysListener;
            this.V = z2;
            this.W = str2;
            this.X = iTSModuleInfo;
            this.Y = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ts.coresdk.crypto.a.a
        public KeyPair a(Void... voidArr) {
            try {
                return a.this.a(this.U, this.S);
            } catch (Exception e2) {
                TSLog.e(this.Y, this.X, "Failed to generate key pair", e2);
                this.Z = new c.a("Failed to generate key pair", e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ts.coresdk.crypto.a.a
        public void a(KeyPair keyPair) throws Throwable {
            if (keyPair == null) {
                this.T.onKeyGenerationFailure(this.Z);
                return;
            }
            byte[] encoded = keyPair.getPublic().getEncoded();
            short sXd = (short) (Od.Xd() ^ (-12639));
            short sXd2 = (short) (Od.Xd() ^ (-25689));
            int[] iArr = new int["HTIVRKE\u000eTRFH\t\u001c:K<\f\t".length()];
            QB qb = new QB("HTIVRKE\u000eTRFH\t\u001c:K<\f\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {encoded, 2};
            short sXd3 = (short) (FB.Xd() ^ 32652);
            short sXd4 = (short) (FB.Xd() ^ 13779);
            int[] iArr2 = new int["muithhVpSspfjb".length()];
            QB qb2 = new QB("muithhVpSspfjb");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                this.T.onKeyGenerated(new Encryptor.PublicKeyData((String) declaredMethod.invoke(null, objArr), keyPair.getPublic().getAlgorithm()));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // com.ts.coresdk.crypto.a.a
        protected void g() {
            try {
                this.U = a.this.a(this.S, this.W, this.V);
            } catch (Exception e2) {
                TSLog.e(this.Y, this.X, "Failed to initialize encryption key pair generator", e2);
                this.Z = new c.a("Failed to initialize encryption key pair generator", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public KeyPairGenerator a(String str, String str2, boolean z2) throws Throwable {
        int i2;
        int i3;
        String strQd = Xg.qd("uwf", (short) (ZN.Xd() ^ 15455), (short) (ZN.Xd() ^ 3292));
        short sXd = (short) (C1499aX.Xd() ^ (-21316));
        short sXd2 = (short) (C1499aX.Xd() ^ (-28445));
        int[] iArr = new int["\u000fG\u000bL\u0006D\u0002D\u00078upz3\u0006km\u0018\u0013\u001a\u001c\u0012\u001b\u000e\u0014_E".length()];
        QB qb = new QB("\u000fG\u000bL\u0006D\u0002D\u00078upz3\u0006km\u0018\u0013\u001a\u001c\u0012\u001b\u000e\u0014_E");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
            i4++;
        }
        String str3 = new String(iArr, 0, i4);
        String strXd = ZO.xd("k\u000b\b~[H\u0014]|\n-[8\u0017\u0019", (short) (OY.Xd() ^ 19657), (short) (OY.Xd() ^ 12990));
        short sXd3 = (short) (ZN.Xd() ^ 10699);
        short sXd4 = (short) (ZN.Xd() ^ 29121);
        int[] iArr2 = new int["\u0017p\u0017\u0012\u007fU\u0017\u0018\u001b\fgj\u0011fqGmMA~]'\u001d\u001b\u0003x\u0016\u000e58".length()];
        QB qb2 = new QB("\u0017p\u0017\u0012\u007fU\u0017\u0018\u001b\fgj\u0011fqGmMA~]'\u001d\u001b\u0003x\u0016\u000e58");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i5 * sXd4))) + xuXd2.CK(iKK2));
            i5++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr2, 0, i5));
            Class<?>[] clsArr = new Class[2];
            short sXd5 = (short) (OY.Xd() ^ 13045);
            int[] iArr3 = new int["|\u001f`\u0002T=T\u0010An\f\u0015C6e?".length()];
            QB qb3 = new QB("|\u001f`\u0002T=T\u0010An\f\u0015C6e?");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd5 + i6)));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i6));
            clsArr[1] = Class.forName(EO.Od("\u001dk\u0005\rDX\u001f\u0006B\u001a7|JEHh", (short) (ZN.Xd() ^ 5503)));
            Object[] objArr = {str2, strXd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("fcqEimmYeYZ", (short) (ZN.Xd() ^ 938)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                ArrayList arrayList = new ArrayList(1);
                boolean zEquals = str2.equals(strQd);
                String strZd = C1593ug.zd("\u0016\f\u0006rx|~", (short) (FB.Xd() ^ FirebaseError.ERROR_INVALID_CUSTOM_TOKEN), (short) (FB.Xd() ^ 15185));
                if (zEquals) {
                    arrayList.add(strZd);
                    i2 = 12;
                    i3 = 2048;
                } else {
                    if (!str2.equals(C1561oA.od("{x", (short) (Od.Xd() ^ (-23647))))) {
                        throw new RuntimeException(str3 + str2);
                    }
                    arrayList.add(strZd);
                    i2 = 4;
                    i3 = 256;
                }
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, i2);
                Object[] objArr2 = {(String[]) arrayList.toArray(new String[0])};
                Method method = Class.forName(C1561oA.Kd("\r\u001b\u0012!\u001f\u001a\u0016`'\u001a\u0019,*\".4i(#83515)r\u0011,A\u0010/9\u001c.@0=6F8F(F<;|\u001cPEIBDR", (short) (Od.Xd() ^ (-7247)))).getMethod(Wg.Zd("31L0blv\u0016#2", (short) (C1633zX.Xd() ^ (-6902)), (short) (C1633zX.Xd() ^ (-30114))), String[].class);
                try {
                    method.setAccessible(true);
                    KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.Xd("\u0016$\u001b*(#\u001fi0#\"53+7=r1,A<>:>2{\u001a5J\u00198B%7I9F?OAO1OED\u0006%YNRKM[", (short) (Od.Xd() ^ (-22885))));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr3 = {Integer.valueOf(i3)};
                    Method method2 = cls2.getMethod(Wg.vd("C6B\u001a9N%<R>", (short) (C1633zX.Xd() ^ (-3306))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr3);
                        short sXd6 = (short) (C1580rY.Xd() ^ (-16470));
                        short sXd7 = (short) (C1580rY.Xd() ^ (-5172));
                        int[] iArr4 = new int["\u001a&\u001b($\u001d\u0017_$\u0015\u0012#\u001f\u0015\u001f#V\u0013\f\u001f\u0018\u0018\u0012\u0014\u0006Mi\u0003\u0016b\u007f\bhx\tv\u0002x\u0007v\u0003b~ro/L~qsjjv".length()];
                        QB qb4 = new QB("\u001a&\u001b($\u001d\u0017_$\u0015\u0012#\u001f\u0015\u001f#V\u0013\f\u001f\u0018\u0018\u0012\u0014\u0006Mi\u0003\u0016b\u007f\bhx\tv\u0002x\u0007v\u0003b~ro/L~qsjjv");
                        int i7 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i7] = xuXd4.fK(((sXd6 + i7) + xuXd4.CK(iKK4)) - sXd7);
                            i7++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr4, 0, i7));
                        Class<?>[] clsArr3 = {Boolean.TYPE};
                        Object[] objArr4 = {Boolean.valueOf(z2)};
                        Method method3 = cls3.getMethod(hg.Vd("qbpPm^j8ki\\X`eYROaUZX;MX[NVHF", (short) (C1607wl.Xd() ^ 11759), (short) (C1607wl.Xd() ^ 26297)), clsArr3);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(builder3, objArr4);
                            Class<?> cls4 = Class.forName(C1561oA.ud("p|q~zsm6zkhyukuy-ibunnhj\\$@Yl9V^?O_MXO]MY9UIF\u0006#UHJAAM", (short) (ZN.Xd() ^ 20094)));
                            Class<?>[] clsArr4 = {Boolean.TYPE};
                            Object[] objArr5 = {Boolean.valueOf(z2)};
                            Method method4 = cls4.getMethod(C1561oA.yd("</?\u00153<(4*&$8\"\"\u00019z#*)\u001a*)!\u0014v!&\u001c\u001a\u001b\u001dNX_", (short) (OY.Xd() ^ 15668)), clsArr4);
                            try {
                                method4.setAccessible(true);
                                KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method4.invoke(builder, objArr5);
                                Class<?> cls5 = Class.forName(C1561oA.Yd(".<3B@;7\u0002H;:MKCOU\u000bIDYTVRVJ\u00142Mb1PZ=OaQ^WgYgIg]\\\u001e=qfjces", (short) (ZN.Xd() ^ 2544)));
                                Class<?>[] clsArr5 = {Boolean.TYPE};
                                Object[] objArr6 = {Boolean.valueOf(z2)};
                                Method method5 = cls5.getMethod(Xg.qd("OBR(NWCOMIG[MM,d.V]\\Ued\\W:digefhakr", (short) (ZN.Xd() ^ 17500), (short) (ZN.Xd() ^ 5766)), clsArr5);
                                try {
                                    method5.setAccessible(true);
                                    method5.invoke(builder4, objArr6);
                                    if (str2.equals(strQd)) {
                                        String[] strArr = new String[3];
                                        strArr[0] = Jg.Wd("`7l", (short) (C1499aX.Xd() ^ (-3798)), (short) (C1499aX.Xd() ^ (-29476)));
                                        strArr[1] = ZO.xd("m\u001dI", (short) (Od.Xd() ^ (-20085)), (short) (Od.Xd() ^ (-28803)));
                                        short sXd8 = (short) (Od.Xd() ^ (-22447));
                                        short sXd9 = (short) (Od.Xd() ^ (-725));
                                        int[] iArr5 = new int["M(S".length()];
                                        QB qb5 = new QB("M(S");
                                        int i8 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i8] = xuXd5.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + (i8 * sXd9))) + xuXd5.CK(iKK5));
                                            i8++;
                                        }
                                        strArr[2] = new String(iArr5, 0, i8);
                                        short sXd10 = (short) (C1607wl.Xd() ^ 836);
                                        int[] iArr6 = new int["!^R=i\u000e1\u001b\u001dow_\r\u0002\u001d|[#e\u001eT\u001e~}=eaB(djL\u000eyIq#;10=5\f\u0003^'04:X0|i".length()];
                                        QB qb6 = new QB("!^R=i\u000e1\u001b\u001dow_\r\u0002\u001d|[#e\u001eT\u001e~}=eaB(djL\u000eyIq#;10=5\f\u0003^'04:X0|i");
                                        int i9 = 0;
                                        while (qb6.YK()) {
                                            int iKK6 = qb6.KK();
                                            Xu xuXd6 = Xu.Xd(iKK6);
                                            iArr6[i9] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ (sXd10 + i9)));
                                            i9++;
                                        }
                                        Object[] objArr7 = {strArr};
                                        Method method6 = Class.forName(new String(iArr6, 0, i9)).getMethod(EO.Od("\tI,W\u0013Sa\u000b(<1\u000eK", (short) (OY.Xd() ^ 23905)), String[].class);
                                        try {
                                            method6.setAccessible(true);
                                            KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method6.invoke(builder, objArr7);
                                            String[] strArr2 = new String[3];
                                            strArr2[0] = C1561oA.Qd("}wn}Zx\t\u000b\n\u000e\u0012\n", (short) (OY.Xd() ^ 9597));
                                            strArr2[1] = C1593ug.zd("\"\u0015\u001a&'9=>DJD", (short) (Od.Xd() ^ (-2098)), (short) (Od.Xd() ^ (-12446)));
                                            strArr2[2] = C1561oA.od("uofuXp\u0001\u0003\u0002\u0006\n\u0002", (short) (OY.Xd() ^ 10880));
                                            Object[] objArr8 = {strArr2};
                                            Method method7 = Class.forName(C1561oA.Kd(".<3B@;7\u0002H;:MKCOU\u000bIDYTVRVJ\u00142Mb1PZ=OaQ^WgYgIg]\\\u001e=qfjces", (short) (C1499aX.Xd() ^ (-4396)))).getMethod(Wg.Zd("C\u0003\b5X\u001a\u001f\u0017cT'&zAD$\u001atjA:", (short) (FB.Xd() ^ 5385), (short) (FB.Xd() ^ 19373)), String[].class);
                                            try {
                                                method7.setAccessible(true);
                                                KeyGenParameterSpec.Builder builder6 = (KeyGenParameterSpec.Builder) method7.invoke(builder5, objArr8);
                                                Object[] objArr9 = {new String[]{strZd}};
                                                Method method8 = Class.forName(C1561oA.Xd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\u001c\u000f\u000e!\u001f\u0017#)^\u001d\u0018-(*&*\u001eg\u0006!6\u0005$.\u0011#5%2+;-;\u001d;10q\u0011E:>79G", (short) (ZN.Xd() ^ 3275))).getMethod(Wg.vd(":+9\b,)&3CA", (short) (OY.Xd() ^ 22768)), String[].class);
                                                try {
                                                    method8.setAccessible(true);
                                                    KeyGenParameterSpec.Builder builder7 = (KeyGenParameterSpec.Builder) method8.invoke(builder6, objArr9);
                                                    String[] strArr3 = new String[1];
                                                    strArr3[0] = Qg.kd("EGF", (short) (ZN.Xd() ^ 28724), (short) (ZN.Xd() ^ 6133));
                                                    Object[] objArr10 = {strArr3};
                                                    Method method9 = Class.forName(hg.Vd("v\u0003w\u0005\u0001ys<\u0001qn\u007f{q{\u007f3oh{ttnpb*F_r?\\dEUeS^UcS_?[OL\f)[NPGGS", (short) (FB.Xd() ^ 280), (short) (FB.Xd() ^ 9982))).getMethod(C1561oA.ud("vguShek]ook]GWYX\\`Xc", (short) (C1633zX.Xd() ^ (-5549))), String[].class);
                                                    try {
                                                        method9.setAccessible(true);
                                                        KeyGenParameterSpec.Builder builder8 = (KeyGenParameterSpec.Builder) method9.invoke(builder7, objArr10);
                                                        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
                                                        Class<?> cls6 = Class.forName(C1561oA.yd("\u0006\u0012\u0007\u0014\u0010\t\u0003K \u0011\u000e\u001f\u001b\u0011\u001b\u001fb\u001f\u0018+$$\u001e \"i\u0006\u001f2~\u001c$Tdtbmdrb~^znk+Hz}\u007fvv\u0003", (short) (C1499aX.Xd() ^ (-6837))));
                                                        Class<?>[] clsArr6 = new Class[1];
                                                        clsArr6[0] = Class.forName(C1561oA.Yd("ph~j8xm\u0002v=Rzy\\\u0003\n{~}\f", (short) (Od.Xd() ^ (-18578))));
                                                        Object[] objArr11 = {bigIntegerValueOf};
                                                        short sXd11 = (short) (OY.Xd() ^ 6881);
                                                        short sXd12 = (short) (OY.Xd() ^ 32429);
                                                        int[] iArr7 = new int["m`p@cqtjhlgfzl[n|tmy\\\u0005}sw\u0006".length()];
                                                        QB qb7 = new QB("m`p@cqtjhlgfzl[n|tmy\\\u0005}sw\u0006");
                                                        int i10 = 0;
                                                        while (qb7.YK()) {
                                                            int iKK7 = qb7.KK();
                                                            Xu xuXd7 = Xu.Xd(iKK7);
                                                            iArr7[i10] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd11 + i10)) + sXd12);
                                                            i10++;
                                                        }
                                                        Method method10 = cls6.getMethod(new String(iArr7, 0, i10), clsArr6);
                                                        try {
                                                            method10.setAccessible(true);
                                                            KeyGenParameterSpec.Builder builder9 = (KeyGenParameterSpec.Builder) method10.invoke(builder8, objArr11);
                                                            X500Principal x500Principal = new X500Principal(Jg.Wd("kz.}b\u0014uCo*y1\nH\u0011V k;", (short) (FB.Xd() ^ 8633), (short) (FB.Xd() ^ 208)));
                                                            short sXd13 = (short) (C1607wl.Xd() ^ 5650);
                                                            short sXd14 = (short) (C1607wl.Xd() ^ 15274);
                                                            int[] iArr8 = new int["56]\u0010Xl\u0018\\\u0004$p\u001a\f^8o0k|gZwl\u0017\u007fB\u001f$#D\u00032jfMF(\u00072\u0019CktN\u0005t[\u0001jP@\\[".length()];
                                                            QB qb8 = new QB("56]\u0010Xl\u0018\\\u0004$p\u001a\f^8o0k|gZwl\u0017\u007fB\u001f$#D\u00032jfMF(\u00072\u0019CktN\u0005t[\u0001jP@\\[");
                                                            int i11 = 0;
                                                            while (qb8.YK()) {
                                                                int iKK8 = qb8.KK();
                                                                Xu xuXd8 = Xu.Xd(iKK8);
                                                                iArr8[i11] = xuXd8.fK(xuXd8.CK(iKK8) - (C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((i11 * sXd14) + sXd13)));
                                                                i11++;
                                                            }
                                                            Class<?> cls7 = Class.forName(new String(iArr8, 0, i11));
                                                            Class<?>[] clsArr7 = new Class[1];
                                                            clsArr7[0] = Class.forName(C1626yg.Ud("OL`W\u000fMUwkKx?+}\u001d7\u0005|\u0019v8<\u0012X8a1\u001d!of1I5KoBA", (short) (ZN.Xd() ^ 12638), (short) (ZN.Xd() ^ 13640)));
                                                            Object[] objArr12 = {x500Principal};
                                                            Method method11 = cls7.getMethod(Ig.wd("y\u001b\\G\"Qs\u0011B:2\u0012QD.7Jl R(", (short) (C1499aX.Xd() ^ (-5001))), clsArr7);
                                                            try {
                                                                method11.setAccessible(true);
                                                                method11.invoke(builder9, objArr12);
                                                            } catch (InvocationTargetException e2) {
                                                                throw e2.getCause();
                                                            }
                                                        } catch (InvocationTargetException e3) {
                                                            throw e3.getCause();
                                                        }
                                                    } catch (InvocationTargetException e4) {
                                                        throw e4.getCause();
                                                    }
                                                } catch (InvocationTargetException e5) {
                                                    throw e5.getCause();
                                                }
                                            } catch (InvocationTargetException e6) {
                                                throw e6.getCause();
                                            }
                                        } catch (InvocationTargetException e7) {
                                            throw e7.getCause();
                                        }
                                    }
                                    Object[] objArr13 = new Object[0];
                                    Method method12 = Class.forName(EO.Od("\u0005h\"\u000e\u00143PC< u,xcl\u0019\u0013P\u0014\u001e[:YZPS\u0014[(\tIym\u001e2X\u0010\"6;B<\u0001]\u0010B7!\u0005f7|4", (short) (C1580rY.Xd() ^ (-1430)))).getMethod(C1561oA.Qd("Yk^`W", (short) (Od.Xd() ^ (-24775))), new Class[0]);
                                    try {
                                        method12.setAccessible(true);
                                        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method12.invoke(builder, objArr13);
                                        Class<?> cls8 = Class.forName(C1593ug.zd("um\u0004o=\u0004vu\t\u0007~\u000b\u0011Fd\u007f\u0015l~\b\u0012g\u0007\u0011\t\u0017\u0007\u001b\u0017\u001b", (short) (Od.Xd() ^ (-9395)), (short) (Od.Xd() ^ (-17760))));
                                        Class<?>[] clsArr8 = new Class[1];
                                        clsArr8[0] = Class.forName(C1561oA.od("wm\u0002k7{lizvlvz.rnb_);e_fh^h[_AQaOZQ_O[;WKH", (short) (Od.Xd() ^ (-24714))));
                                        Object[] objArr14 = {keyGenParameterSpec};
                                        Method method13 = cls8.getMethod(C1561oA.Kd("4:6B81=;M9", (short) (FB.Xd() ^ 4247)), clsArr8);
                                        try {
                                            method13.setAccessible(true);
                                            method13.invoke(keyPairGenerator, objArr14);
                                            return keyPairGenerator;
                                        } catch (InvocationTargetException e8) {
                                            throw e8.getCause();
                                        }
                                    } catch (InvocationTargetException e9) {
                                        throw e9.getCause();
                                    }
                                } catch (InvocationTargetException e10) {
                                    throw e10.getCause();
                                }
                            } catch (InvocationTargetException e11) {
                                throw e11.getCause();
                            }
                        } catch (InvocationTargetException e12) {
                            throw e12.getCause();
                        }
                    } catch (InvocationTargetException e13) {
                        throw e13.getCause();
                    }
                } catch (InvocationTargetException e14) {
                    throw e14.getCause();
                }
            } catch (InvocationTargetException e15) {
                throw e15.getCause();
            }
        } catch (Exception e16) {
            throw new RuntimeException(Wg.Zd("8+\"L#\u0013R\u0007n\u000e\tm\u001b\u0016@\u0018\u001a&\u001c7`_:Bo\u007fwi\"xz\u0019\u0013\u001f\u0016\rU", (short) (C1607wl.Xd() ^ 32618), (short) (C1607wl.Xd() ^ 21765)) + f(), e16);
        }
    }

    protected KeyPair a(KeyPairGenerator keyPairGenerator, String str) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1561oA.Xd("\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u0006!6\u000e )3\t(2*8(<8<", (short) (ZN.Xd() ^ 2509)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 3234);
            int[] iArr = new int["\u000e\r\u0013\u000b\u0015\u0005\u0015\u0007i\u0005\u0016m{\u0005\u000b".length()];
            QB qb = new QB("\u000e\r\u0013\u000b\u0015\u0005\u0015\u0007i\u0005\u0016m{\u0005\u000b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (KeyPair) method.invoke(keyPairGenerator, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            throw new RuntimeException(Qg.kd("\u000505+\"\\**.X\u001f\u001c$\u001a&\u0014&\u0016O\u001a\u0013&\u001feI", (short) (OY.Xd() ^ 32550), (short) (OY.Xd() ^ 29028)) + f(), e3);
        }
    }

    protected PrivateKey a(Context context, ITSModuleInfo iTSModuleInfo, String str) throws Throwable {
        if (Build.VERSION.SDK_INT != 28) {
            KeyStore.PrivateKeyEntry privateKeyEntryB = b(context, iTSModuleInfo, str);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("%{)$\u0017p7G\u0002\u000f\u001e<e.a\fHt*9`e<xALm+fge\u0012J+j\u0001'>", (short) (Od.Xd() ^ (-10124)), (short) (Od.Xd() ^ (-14680)))).getMethod(ZO.xd("o:}9l1=\u0004m=wG\u0006", (short) (C1607wl.Xd() ^ 27342), (short) (C1607wl.Xd() ^ 20662)), new Class[0]);
            try {
                method.setAccessible(true);
                return (PrivateKey) method.invoke(privateKeyEntryB, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        KeyStore keyStoreE = e();
        Object[] objArr2 = {str, null};
        Method method2 = Class.forName(hg.Vd("lbv`,pa^okako#?XkDd^`R", (short) (Od.Xd() ^ (-25740)), (short) (Od.Xd() ^ (-27025)))).getMethod(C1561oA.yd("\u0006\u0003\u0011f\b\u001b", (short) (C1499aX.Xd() ^ (-21025))), Class.forName(C1561oA.ud("i_s])fZf^$Hhe[_W", (short) (C1633zX.Xd() ^ (-1679)))), char[].class);
        try {
            method2.setAccessible(true);
            Key key = (Key) method2.invoke(keyStoreE, objArr2);
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            short sXd = (short) (C1499aX.Xd() ^ (-3406));
            int[] iArr = new int["k\u000e\u0014@\u0003\u0011C\u000e\u0014\u001a\u001c\n\u0018\u000e\u0011L\u001d\u0015O\u0012Q\u0003&\u001e,\u0018,\u001e\u0005 5".length()];
            QB qb = new QB("k\u000e\u0014@\u0003\u0011C\u000e\u0014\u001a\u001c\n\u0018\u000e\u0011L\u001d\u0015O\u0012Q\u0003&\u001e,\u0018,\u001e\u0005 5");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            TSLog.w(context, iTSModuleInfo, new String(iArr, 0, i2));
            throw new RuntimeException(Xg.qd("a\u000f\u0016\u000e\u0007C\u0013\u0015\u001bG\u0010\u000f\u001fK\u001d \u0018&\u0012&\u0018S \u001b0", (short) (C1580rY.Xd() ^ (-27897)), (short) (C1580rY.Xd() ^ (-17413))));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected String b(String str) {
        if ("ec".equalsIgnoreCase(str)) {
            return "SHA256withECDSA";
        }
        if ("rsa".equalsIgnoreCase(str)) {
            return "SHA256withRSA/PSS";
        }
        throw new IllegalArgumentException("Unknown key algorithm");
    }

    protected KeyStore.PrivateKeyEntry b(Context context, ITSModuleInfo iTSModuleInfo, String str) throws Throwable {
        KeyStore keyStoreE = e();
        Class<?> cls = Class.forName(C1626yg.Ud("z\r\u0006P,d<{\u000bdLWw4\u0019\u0011\u0017.ksac", (short) (C1633zX.Xd() ^ (-3607)), (short) (C1633zX.Xd() ^ (-23426))));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(Ig.wd("\u0012W>\rH:G\fF\\\b\u0003VOH\u001f", (short) (C1633zX.Xd() ^ (-15069))));
        short sXd = (short) (C1633zX.Xd() ^ (-11896));
        int[] iArr = new int["9_V%\"-GT:v\u0004x-S!!Z:\u0003i0Jr#)&L\u0017\u0013Ur /6y@Z\u0007\u0018\u0019\n.".length()];
        QB qb = new QB("9_V%\"-GT:v\u0004x-S!!Z:\u0003i0Jr#)&L\u0017\u0013Ur /6y@Z\u0007\u0018\u0019\n.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str, null};
        short sXd2 = (short) (ZN.Xd() ^ 24288);
        int[] iArr2 = new int["ro}Muzw}".length()];
        QB qb2 = new QB("ro}Muzw}");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            KeyStore.Entry entry = (KeyStore.Entry) method.invoke(keyStoreE, objArr);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry;
            }
            TSLog.w(context, iTSModuleInfo, C1593ug.zd("Fhn\u001b]k\u001ehntvdrhk'wo*l,]\u0001x\u0007r\u0007x_z\u0010\\\u0007\u000e\r\u0015", (short) (ZN.Xd() ^ 29430), (short) (ZN.Xd() ^ 24166)));
            throw new RuntimeException(C1561oA.od("l\u0018\u001d\u0013\nD\u0012\u0012\u0016@\u0007\u0004\u0012<\f\r\u0003\u000fx\u000bz4~w\u000b0t|\u0002~\u0005", (short) (C1607wl.Xd() ^ 10607)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.ts.coresdk.crypto.Encryptor
    public void clearKey(String str) {
        try {
            KeyStore keyStoreE = e();
            Class<?> cls = Class.forName(C1561oA.Kd("NF\\H\u0016\\ONa_Wci\u001f=XmHjfj^", (short) (C1607wl.Xd() ^ 16077)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd("\u00192YfeFM|(\u0011H\f<Ul\b", (short) (OY.Xd() ^ 1374), (short) (OY.Xd() ^ 30956)));
            Object[] objArr = {str};
            short sXd = (short) (C1499aX.Xd() ^ (-17638));
            int[] iArr = new int["#%-'7)\n4;:B".length()];
            QB qb = new QB("#%-'7)\n4;:B");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(keyStoreE, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException | GeneralSecurityException e3) {
            throw new RuntimeException(Wg.vd("s\u000e\u0019\u001b\u000f\rK\u000e\u0012\n\t\u0019\u000b\u000f\u000bB)\"9", (short) (ZN.Xd() ^ OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather)), e3);
        }
    }

    protected KeyStore e() throws Throwable {
        Object[] objArr = {Qg.kd("n\u001b\u0010\u001d\u0019\u0012\fq\u000b\u001ev\u0017\u0011\u0013\u0005", (short) (Od.Xd() ^ (-9784)), (short) (Od.Xd() ^ (-1569)))};
        Method declaredMethod = Class.forName(hg.Vd("?5I3~C41B>4>Bu\u0012+>\u0017713%", (short) (C1499aX.Xd() ^ (-31356)), (short) (C1499aX.Xd() ^ (-12263)))).getDeclaredMethod(C1561oA.yd("qn\u0001Ttx|h\u0001ty", (short) (C1580rY.Xd() ^ (-17916))), Class.forName(C1561oA.ud("(\u001e2\u001cg%\u0019%\u001db\u0007'$\u001a\u001e\u0016", (short) (C1633zX.Xd() ^ (-2776)))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {null};
            Method method = Class.forName(C1561oA.Yd("~v\rxF\r\u007f~\u0012\u0010\b\u0014\u001aOm\t\u001ex\u001b\u0017\u001b\u000f", (short) (C1607wl.Xd() ^ 16141))).getMethod(Jg.Wd("0\u0011bG", (short) (C1607wl.Xd() ^ 13144), (short) (C1607wl.Xd() ^ 6678)), Class.forName(Xg.qd("vn\u0005p>\u0005wv\n\b\u007f\f\u0012Ge\u0001\u0016p\u0013\u000f\u0013\u0007Fo\u0014\u0007\u000bz\u001d\u0019\u001d\u0011|\u000f!\u0011\u001e\u0017'\u0019'", (short) (FB.Xd() ^ 31827), (short) (FB.Xd() ^ 26719))));
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr2);
                return keyStore;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    protected String f() throws Throwable {
        try {
            e();
            return "Could load keystore";
        } catch (Exception e2) {
            return "Could not load keystore; " + e2.toString();
        }
    }

    @Override // com.ts.coresdk.crypto.Encryptor
    public final void generateKeys(final Context context, final ITSModuleInfo iTSModuleInfo, final String str, final boolean z2, final String str2, final Encryptor.GenerateKeysListener generateKeysListener) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("6\u0017|o<`)Pfxch(E*Nd", (short) (C1607wl.Xd() ^ 24758), (short) (C1607wl.Xd() ^ 19328))).getDeclaredMethod(C1626yg.Ud("?6&`BN@i\n:\\\u000e\t", (short) (FB.Xd() ^ 5288), (short) (FB.Xd() ^ 15268)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new Runnable() { // from class: com.ts.coresdk.crypto.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.new C0316a(context, iTSModuleInfo, str, generateKeysListener, z2, str2).b(new Void[0]);
                }
            }};
            Method method = Class.forName(Ig.wd(" _\u00066h=\u00166Dz93x\u000e\nn\u001e+", (short) (C1580rY.Xd() ^ (-18186)))).getMethod(C1561oA.Qd("OMPP", (short) (OY.Xd() ^ 15179)), Class.forName(EO.Od("\u00197|\t@L'\u0006>2R\u001a>>[\u007f70", (short) (OY.Xd() ^ 8956))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.ts.coresdk.crypto.Encryptor
    public KeyPair getKeyPair(Context context, ITSModuleInfo iTSModuleInfo, String str) throws Throwable {
        KeyStore keyStoreE = e();
        Class<?> cls = Class.forName(C1593ug.zd("RJ`L\u001a`SRec[gm#A\\qLnjnb", (short) (FB.Xd() ^ 15213), (short) (FB.Xd() ^ 15887)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (FB.Xd() ^ 30866);
        int[] iArr = new int["I?S=\tF:F>\u0004(HE;?7".length()];
        QB qb = new QB("I?S=\tF:F>\u0004(HE;?7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = char[].class;
        Object[] objArr = {str, null};
        short sXd2 = (short) (ZN.Xd() ^ 585);
        int[] iArr2 = new int["NM]5Pe".length()];
        QB qb2 = new QB("NM]5Pe");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            PrivateKey privateKey = (PrivateKey) ((Key) method.invoke(keyStoreE, objArr));
            if (Build.VERSION.SDK_INT != 28) {
                Object[] objArr2 = {str, null};
                Method method2 = Class.forName(Jg.Wd("\u0001Q d+JuMi puTB9]+^yN\u000bW", (short) (ZN.Xd() ^ 13582), (short) (ZN.Xd() ^ 2686))).getMethod(Ig.wd("kBaK*c?4", (short) (C1607wl.Xd() ^ 20114)), Class.forName(ZO.xd("n\u0006\u0004L\b!xX\n[qs\u0019AQs", (short) (Od.Xd() ^ (-21934)), (short) (Od.Xd() ^ (-27475)))), Class.forName(C1626yg.Ud("\u001cvf*i/J|\t\u0017\u001d=`r9R\u0005ls\u0013tBm\u0011\u000f3f%\u0011l\\s\u0006\u0001~\u000e@q\u0019\u001e3\u007f", (short) (Od.Xd() ^ (-4762)), (short) (Od.Xd() ^ (-7882)))));
                try {
                    method2.setAccessible(true);
                    KeyStore.Entry entry = (KeyStore.Entry) method2.invoke(keyStoreE, objArr2);
                    if (entry == null) {
                        return null;
                    }
                    if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                        TSLog.w(context, iTSModuleInfo, C1561oA.Kd("c\u0006\f8z\t;\u0006\f\u0012\u0014\u0002\u0010\u0006\tD\u0015\rG\nIz\u001e\u0016$\u0010$\u0016|\u0018-y$+*2", (short) (FB.Xd() ^ 28537)));
                        throw new RuntimeException(Wg.Zd("#\u007f0\u00199f_R\u0004`\u0013B:\u0017R\u0005m%A=_\u0005\u0002h.", (short) (FB.Xd() ^ 12754), (short) (FB.Xd() ^ 477)));
                    }
                    KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(EO.Od("f\u0006\t\\o\u0012\u00186\u0017hYF\u0016Xa^/\u001fx\fMx\u0011AR5!DM\rFCgY\\%9d", (short) (Od.Xd() ^ (-31563)))).getMethod(C1561oA.Qd("EBP\u001e?KL@<>74F6", (short) (ZN.Xd() ^ 20110)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        Certificate certificate = (Certificate) method3.invoke(privateKeyEntry, objArr3);
                        Class<?> cls2 = Class.forName(C1593ug.zd("H@VB\u0010VIH[YQ]c\u0019OR`c\u001e4Weh^\\`[Zn`", (short) (Od.Xd() ^ (-19538)), (short) (Od.Xd() ^ (-14206))));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr4 = new Object[0];
                        short sXd3 = (short) (Od.Xd() ^ (-22335));
                        int[] iArr3 = new int["KHV1UAJF?&?R".length()];
                        QB qb3 = new QB("KHV1UAJF?&?R");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        Method method4 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                        try {
                            method4.setAccessible(true);
                            return new KeyPair((PublicKey) method4.invoke(certificate, objArr4), privateKey);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            short sXd4 = (short) (C1607wl.Xd() ^ 4671);
            short sXd5 = (short) (C1607wl.Xd() ^ 26930);
            int[] iArr4 = new int["_\\M\u001fK$\ra>eC;}4\u0003u\u0010jB7>-Df\u0014r\u0004\u0001R$\u0016n\rk\u0003\u0017".length()];
            QB qb4 = new QB("_\\M\u001fK$\ra>eC;}4\u0003u\u0010jB7>-Df\u0014r\u0004\u0001R$\u0016n\rk\u0003\u0017");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(((i5 * sXd5) ^ sXd4) + xuXd4.CK(iKK4));
                i5++;
            }
            TSLog.d(context, iTSModuleInfo, new String(iArr4, 0, i5));
            if (privateKey == null) {
                TSLog.d(context, iTSModuleInfo, Xg.qd("[^VdPdV\u0012^Yn\u0016`k\u0019hphi", (short) (FB.Xd() ^ 16209), (short) (FB.Xd() ^ 25648)));
                return null;
            }
            Class<?> cls3 = Class.forName(C1561oA.Xd("%\u001d3\u001fl3&%86.:@u\u0014/D\u001fA=A5", (short) (C1580rY.Xd() ^ (-1676))));
            Class<?>[] clsArr3 = {Class.forName(Wg.vd("KAU?\u0013PDPP\u0016:Z_UYQ", (short) (FB.Xd() ^ 28335)))};
            Object[] objArr5 = {str};
            short sXd6 = (short) (C1499aX.Xd() ^ (-13332));
            short sXd7 = (short) (C1499aX.Xd() ^ (-22908));
            int[] iArr5 = new int["&#1~ ,-!\u001d\u001f\u0018\u0015'\u0017".length()];
            QB qb5 = new QB("&#1~ ,-!\u001d\u001f\u0018\u0015'\u0017");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(((sXd6 + i6) + xuXd5.CK(iKK5)) - sXd7);
                i6++;
            }
            Method method5 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
            try {
                method5.setAccessible(true);
                Certificate certificate2 = (Certificate) method5.invoke(keyStoreE, objArr5);
                if (certificate2 == null) {
                    TSLog.d(context, iTSModuleInfo, C1561oA.yd("a\u000f\u0016\u000e\u0007\u0012K\u001aF\u000f\u000e\u001eJ\u0017\u0012'N\u0013\u0016$'\u001d\u001b\u001f\u001a\u0019-\u001f", (short) (ZN.Xd() ^ 20656)));
                    throw new GeneralSecurityException(C1561oA.Yd("W\u0005\f\u0004|9\t\u000b\u0011=\u0006\u0005\u0015A\u0013\u0019\u0007\u0012\u0010\u000bH\u0015\u0010%", (short) (OY.Xd() ^ 26424)));
                }
                short sXd8 = (short) (C1499aX.Xd() ^ (-27502));
                short sXd9 = (short) (C1499aX.Xd() ^ (-31203));
                int[] iArr6 = new int["$\u001a.\u0018c(\u0019\u0016'#\u0019#'Z\u000f\u0010\u001c\u001dUi\u000b\u0017\u0018\f\b\n\u0003\u007f\u0012\u0002".length()];
                QB qb6 = new QB("$\u001a.\u0018c(\u0019\u0016'#\u0019#'Z\u000f\u0010\u001c\u001dUi\u000b\u0017\u0018\f\b\n\u0003\u007f\u0012\u0002");
                int i7 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i7] = xuXd6.fK(sXd8 + i7 + xuXd6.CK(iKK6) + sXd9);
                    i7++;
                }
                Object[] objArr6 = new Object[0];
                Method method6 = Class.forName(new String(iArr6, 0, i7)).getMethod(C1561oA.ud("b_mHlXa]V=Vi", (short) (Od.Xd() ^ (-22838))), new Class[0]);
                try {
                    method6.setAccessible(true);
                    return new KeyPair((PublicKey) method6.invoke(certificate2, objArr6), privateKey);
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }
}
