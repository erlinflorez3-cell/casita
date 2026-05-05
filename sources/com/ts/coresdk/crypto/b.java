package com.ts.coresdk.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.logic.TSKeypairData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
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
public abstract class b extends a implements com.ts.coresdk.crypto.logic.a {
    private String a(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        try {
            a(context, iTSModuleInfo);
            Cipher cipher = Cipher.getInstance(C1561oA.Xd("38G$99;(JF?P5Oaeflrl", (short) (C1580rY.Xd() ^ (-26520))));
            cipher.init(1, b(context, iTSModuleInfo));
            byte[] bArrA = a(cipher, str.getBytes(Charset.forName(Wg.vd("\u0011\u0011\u007fgo", (short) (ZN.Xd() ^ 19985)))));
            Object[] objArr = {cipher.getIV(), 2};
            Method declaredMethod = Class.forName(Qg.kd("\u000b\u0017\f\u0019\u0015\u000e\bP\u0017\u0015\t\u000bK^|\u000e~NK", (short) (OY.Xd() ^ 4523), (short) (OY.Xd() ^ 993))).getDeclaredMethod(hg.Vd("EMAL@@.H+KH>B:", (short) (OY.Xd() ^ 23571), (short) (OY.Xd() ^ 17463)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                String str2 = (String) declaredMethod.invoke(null, objArr);
                Object[] objArr2 = {bArrA, 2};
                Method declaredMethod2 = Class.forName(C1561oA.ud("\u001e*\u001f,(!\u001bc*(\u001c\u001e^q\u0010!\u0012a^", (short) (C1580rY.Xd() ^ (-4392)))).getDeclaredMethod(C1561oA.yd(",4,7//!;\u001223)1)", (short) (Od.Xd() ^ (-7796))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod2.setAccessible(true);
                    return String.format(C1561oA.Yd("P R\"T$", (short) (OY.Xd() ^ 2441)), str2, Xg.qd("w", (short) (C1499aX.Xd() ^ (-28054)), (short) (C1499aX.Xd() ^ (-20260))), (String) declaredMethod2.invoke(null, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException | GeneralSecurityException e4) {
            TSLog.e(context, iTSModuleInfo, Jg.Wd("9t\u000f +@\u000ea{\u0007'<E_f|\u0004^)7XW+\u0015\u0015B<\u00064Ii", (short) (C1580rY.Xd() ^ (-2343)), (short) (C1580rY.Xd() ^ (-26730))), e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r5, com.ts.coresdk.ITSModuleInfo r6) {
        /*
            r4 = this;
            com.ts.coresdk.c.a r3 = com.ts.coresdk.c.a.f(r5)     // Catch: java.security.GeneralSecurityException -> L37 java.io.IOException -> L39
            java.lang.String r2 = r6.subSystemName()     // Catch: java.security.GeneralSecurityException -> L37 java.io.IOException -> L39
            java.lang.String r1 = "masterkey_alias"
            r0 = 0
            java.lang.String r3 = r3.b(r2, r1, r0)     // Catch: java.security.GeneralSecurityException -> L37 java.io.IOException -> L39
            monitor-enter(r4)     // Catch: java.security.GeneralSecurityException -> L37 java.io.IOException -> L39
            if (r3 == 0) goto L18
            boolean r0 = r4.d(r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L32
        L18:
            if (r3 != 0) goto L22
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L34
        L22:
            r4.c(r3)     // Catch: java.lang.Throwable -> L34
            com.ts.coresdk.c.a r2 = com.ts.coresdk.c.a.f(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r6.subSystemName()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "masterkey_alias"
            r2.a(r1, r0, r3)     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.security.GeneralSecurityException -> L37 java.io.IOException -> L39
        L37:
            r2 = move-exception
            goto L3a
        L39:
            r2 = move-exception
        L3a:
            java.lang.String r0 = "Could not generate master key "
            com.ts.coresdk.TSLog.e(r5, r6, r0, r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Could not generate master key"
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ts.coresdk.crypto.b.a(android.content.Context, com.ts.coresdk.ITSModuleInfo):void");
    }

    private byte[] a(Cipher cipher, byte[] bArr) throws GeneralSecurityException, IOException {
        int length = bArr.length / 1000;
        int length2 = bArr.length % 1000;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < length; i2++) {
            byteArrayOutputStream.write(cipher.update(bArr, i2 * 1000, 1000));
        }
        byteArrayOutputStream.write(cipher.doFinal(bArr, length * 1000, length2));
        return byteArrayOutputStream.toByteArray();
    }

    private String b(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        try {
            String[] strArrSplit = str.split(ZO.xd(")", (short) (C1499aX.Xd() ^ (-20814)), (short) (C1499aX.Xd() ^ (-19255))));
            if (strArrSplit.length != 2) {
                return null;
            }
            String str2 = strArrSplit[0];
            Class<?> cls = Class.forName(C1626yg.Ud(")\\vD~_36\t;&\u0002'wctcM]", (short) (FB.Xd() ^ 10915), (short) (FB.Xd() ^ 10542)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Ig.wd("b)P[pi:@eLw7\u0002\u0003[r", (short) (ZN.Xd() ^ 18807)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str2, 2};
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("?\u0017%NM#", (short) (Od.Xd() ^ (-12853))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                String str3 = strArrSplit[1];
                Class<?> cls2 = Class.forName(C1561oA.Qd("~\u000b\u007f\r\t\u0002{D\u000b\t|~?Rp\u0002rB?", (short) (Od.Xd() ^ (-1734))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1593ug.zd("-%;'t4*82y BA9?9", (short) (C1607wl.Xd() ^ 29230), (short) (C1607wl.Xd() ^ 16362)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str3, 2};
                Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.od("kkhsgg", (short) (ZN.Xd() ^ 7557)), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    Cipher cipher = Cipher.getInstance(C1561oA.Kd("5:I&;;=*LHAR7Qcghntn", (short) (ZN.Xd() ^ 24002)));
                    cipher.init(2, b(context, iTSModuleInfo), ivParameterSpec);
                    return new String(a(cipher, bArr2), Charset.forName(Wg.Zd("\u000f\u001cP5\u0003", (short) (OY.Xd() ^ 601), (short) (OY.Xd() ^ 16357))));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException | GeneralSecurityException unused) {
            return null;
        }
    }

    private SecretKey b(Context context, ITSModuleInfo iTSModuleInfo) throws Throwable {
        String strB = com.ts.coresdk.c.a.f(context).b(iTSModuleInfo.subSystemName(), C1561oA.Xd("latvhvpk\u0001gjvtm\u0001", (short) (Od.Xd() ^ (-1807))), (String) null);
        if (strB == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT != 28) {
            KeyStore keyStoreE = e();
            Object[] objArr = {strB, null};
            Method method = Class.forName(C1561oA.ud("\u0012\b\u001c\u0006Q\u0016\u0007\u0004\u0015\u0011\u0007\u0011\u0015Hd}\u0011i\n\u0004\u0006w", (short) (C1580rY.Xd() ^ (-23336)))).getMethod(Xg.qd("\u0007\u0006\u0016g\u0012\u0019\u0018 ", (short) (C1633zX.Xd() ^ (-13959)), (short) (C1633zX.Xd() ^ (-8054))), Class.forName(C1561oA.yd("\u001f\u0017-\u0019f&\u001c*\u0014[\u0002$#\u001b!\u001b", (short) (Od.Xd() ^ (-18035)))), Class.forName(C1561oA.Yd("B:P<\nPCBUSKW]\u00131La<^Z^R\u0012?b`fXWi_ffI[m]jcses", (short) (C1633zX.Xd() ^ (-11209)))));
            try {
                method.setAccessible(true);
                KeyStore.Entry entry = (KeyStore.Entry) method.invoke(keyStoreE, objArr);
                if (entry == null) {
                    c(context, iTSModuleInfo);
                    return null;
                }
                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) entry;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("kki]S(\u0005\fGK#9g#)T\u0012t~\u0003GAj#^kca\u001awr\u0010\u00057&5e", (short) (Od.Xd() ^ (-24128)), (short) (Od.Xd() ^ (-7107)))).getMethod(ZO.xd("?\u001850Ed{+t_^Q", (short) (ZN.Xd() ^ 31906), (short) (ZN.Xd() ^ 15111)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    return (SecretKey) method2.invoke(secretKeyEntry, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        KeyStore keyStoreE2 = e();
        short sXd = (short) (C1633zX.Xd() ^ (-6257));
        int[] iArr = new int[",\"6 s8)&/+!+7j\u0007 +\u0004$\u001e(\u001a".length()];
        QB qb = new QB(",\"6 s8)&/+!+7j\u0007 +\u0004$\u001e(\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr3 = {strB, null};
        Method method3 = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("30>\u0014-@", (short) (C1607wl.Xd() ^ 18782), (short) (C1607wl.Xd() ^ 11299)), Class.forName(Qg.kd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (C1607wl.Xd() ^ 26173), (short) (C1607wl.Xd() ^ 10443))), char[].class);
        try {
            method3.setAccessible(true);
            Key key = (Key) method3.invoke(keyStoreE2, objArr3);
            if (key != null) {
                return (SecretKey) key;
            }
            c(context, iTSModuleInfo);
            return null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private void c(Context context, ITSModuleInfo iTSModuleInfo) {
        com.ts.coresdk.c.a.f(context).a(iTSModuleInfo.subSystemName(), "masterkey_alias");
    }

    private void c(String str) throws Throwable {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(C1626yg.Ud("b|.", (short) (C1633zX.Xd() ^ (-15045)), (short) (C1633zX.Xd() ^ (-31687))), Ig.wd("\u0003hP;g<OF-E%`\t\u0016|", (short) (C1633zX.Xd() ^ (-8324))));
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
        short sXd = (short) (OY.Xd() ^ 6939);
        int[] iArr = new int["+p\t7k*\t\u001b3)=u!\nEpI\u0019;w4a\u0003\u0002\u0017,\u000e\u0002a#'\u0018K@\u0014:2\b\u0010t\u007f:\u001f 1\b]_#\b\u00117r".length()];
        QB qb = new QB("+p\t7k*\t\u001b3)=u!\nEpI\u0019;w4a\u0003\u0002\u0017,\u000e\u0002a#'\u0018K@\u0014:2\b\u0010t\u007f:\u001f 1\b]_#\b\u00117r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {256};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("m^lB[nG\\lV", (short) (OY.Xd() ^ 13932)), Integer.TYPE);
        try {
            method.setAccessible(true);
            KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr);
            Object[] objArr2 = {new String[]{C1593ug.zd("kkm", (short) (C1499aX.Xd() ^ (-7530)), (short) (C1499aX.Xd() ^ (-3024)))}};
            Method method2 = Class.forName(C1561oA.od("eqfsohb+o`]nj`jn\"^Wjcc]_Q\u00195Na.KS4DTBMDRBN.J>;z\u0018J=?66B", (short) (Od.Xd() ^ (-31607)))).getMethod(C1561oA.Kd("]P`/Z^S\\?bXZi", (short) (FB.Xd() ^ 16804)), String[].class);
            try {
                method2.setAccessible(true);
                KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr2);
                Object[] objArr3 = {new String[]{Wg.Zd("e'+A\u0015,\u0011\u0012\u0002\r\u001e\u001d", (short) (C1633zX.Xd() ^ (-30077)), (short) (C1633zX.Xd() ^ (-31089)))}};
                Method method3 = Class.forName(C1561oA.Xd("q\u007fv\u0006\u0004~zE\f~}\u0011\u000f\u0007\u0013\u0019N\r\b\u001d\u0018\u001a\u0016\u001a\u000eWu\u0011&t\u0014\u001e\u0001\u0013%\u0015\"\u001b+\u001d+\r+! a\u00015*.')7", (short) (Od.Xd() ^ (-11690)))).getMethod(Wg.vd("7*:\f.$4<<A7>6\u0019+/\u0018\u001e$\u001e#", (short) (C1499aX.Xd() ^ (-249))), String[].class);
                try {
                    method3.setAccessible(true);
                    KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr3);
                    short sXd2 = (short) (C1580rY.Xd() ^ (-24640));
                    short sXd3 = (short) (C1580rY.Xd() ^ (-3909));
                    int[] iArr2 = new int["gshuqjd-qb_plblp$`Ylee_aS\u001b7Pc0MU6FVDOFTDP0L@=|\u001aL?A88D".length()];
                    QB qb2 = new QB("gshuqjd-qb_plblp$`Ylee_aS\u001b7Pc0MU6FVDOFTDP0L@=|\u001aL?A88D");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                        i3++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(hg.Vd("\u000e \u0013\u0015\f", (short) (C1607wl.Xd() ^ 28485), (short) (C1607wl.Xd() ^ 32263)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        keyGenerator.init((KeyGenParameterSpec) method4.invoke(builder4, objArr4));
                        keyGenerator.generateKey();
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
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public TSKeypairData c(Context context, ITSModuleInfo iTSModuleInfo, String str) throws Exception {
        String strUd = C1561oA.ud("\u001482;r?i/15*d/(;`&.0\\0\u001c!rW", (short) (C1607wl.Xd() ^ 11624));
        String strYd = C1561oA.yd("Tvkmig&pex\"gkm\u001eqY^4\u0019", (short) (ZN.Xd() ^ 7117));
        try {
            KeyPair keyPair = getKeyPair(context, iTSModuleInfo, str);
            if (keyPair == null) {
                return null;
            }
            PublicKey publicKey = keyPair.getPublic();
            if (publicKey == null) {
                TSLog.d(context, iTSModuleInfo, strUd + str);
                return null;
            }
            TSLog.d(context, iTSModuleInfo, strYd + str);
            byte[] encoded = publicKey.getEncoded();
            short sXd = (short) (FB.Xd() ^ 22733);
            int[] iArr = new int[".<3B@;7\u0002JJ@D\u0007\u001c<OB\u0014\u0013".length()];
            QB qb = new QB(".<3B@;7\u0002JJ@D\u0007\u001c<OB\u0014\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr = {encoded, 2};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("XbXe[]MiNpogmg", (short) (C1633zX.Xd() ^ (-11713)), (short) (C1633zX.Xd() ^ (-21506))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return new TSKeypairData(str, new Encryptor.PublicKeyData((String) declaredMethod.invoke(null, objArr), publicKey.getAlgorithm()));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            TSLog.w(context, iTSModuleInfo, Jg.Wd("\b\u0017CWrg\u0016\u001d\u0019].4J~\u001c}j\u0011x3@fw\u001elhnF", (short) (C1633zX.Xd() ^ (-20319)), (short) (C1633zX.Xd() ^ (-18681))) + str);
            throw e3;
        }
    }

    protected boolean d(String str) throws Throwable {
        KeyStore keyStoreE = e();
        Object[] objArr = {str};
        Method method = Class.forName(ZO.xd("\u0001-,%L\u0005kM<I`VL!;\u0001j|d5Ys", (short) (C1607wl.Xd() ^ 7132), (short) (C1607wl.Xd() ^ 7198))).getMethod(Ig.wd("j(\u0015\b\u0015w\r*@@7t8", (short) (FB.Xd() ^ 18310)), Class.forName(C1626yg.Ud("P\u001d>#\u0001i$bn\u0002\u000bent1|", (short) (Od.Xd() ^ (-31425)), (short) (Od.Xd() ^ (-16275)))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(keyStoreE, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        return b(context, str, iTSModuleInfo);
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        return a(context, str, iTSModuleInfo);
    }
}
