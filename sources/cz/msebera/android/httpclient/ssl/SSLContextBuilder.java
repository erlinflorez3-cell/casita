package cz.msebera.android.httpclient.ssl;

import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import cz.msebera.android.httpclient.util.Args;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509TrustManager;
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

/* JADX INFO: loaded from: classes5.dex */
public class SSLContextBuilder {
    static final String TLS = "TLS";
    private String keyManagerFactoryAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
    private final Set<KeyManager> keyManagers;
    private String keyStoreType;
    private String protocol;
    private Provider provider;
    private SecureRandom secureRandom;
    private String trustManagerFactoryAlgorithm;
    private final Set<TrustManager> trustManagers;

    static class KeyManagerDelegate extends X509ExtendedKeyManager {
        private final PrivateKeyStrategy aliasStrategy;
        private final X509ExtendedKeyManager keyManager;

        KeyManagerDelegate(X509ExtendedKeyManager x509ExtendedKeyManager, PrivateKeyStrategy privateKeyStrategy) {
            this.keyManager = x509ExtendedKeyManager;
            this.aliasStrategy = privateKeyStrategy;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.aliasStrategy.chooseAlias(getClientAliasMap(strArr, principalArr), socket);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.aliasStrategy.chooseAlias(getClientAliasMap(strArr, principalArr), null);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.aliasStrategy.chooseAlias(getServerAliasMap(str, principalArr), null);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return this.aliasStrategy.chooseAlias(getServerAliasMap(str, principalArr), socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.keyManager.getCertificateChain(str);
        }

        public Map<String, PrivateKeyDetails> getClientAliasMap(String[] strArr, Principal[] principalArr) {
            HashMap map = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.keyManager.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        map.put(str2, new PrivateKeyDetails(str, this.keyManager.getCertificateChain(str2)));
                    }
                }
            }
            return map;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.keyManager.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.keyManager.getPrivateKey(str);
        }

        public Map<String, PrivateKeyDetails> getServerAliasMap(String str, Principal[] principalArr) {
            HashMap map = new HashMap();
            String[] serverAliases = this.keyManager.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    map.put(str2, new PrivateKeyDetails(str, this.keyManager.getCertificateChain(str2)));
                }
            }
            return map;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.keyManager.getServerAliases(str, principalArr);
        }
    }

    static class TrustManagerDelegate implements X509TrustManager {
        private final X509TrustManager trustManager;
        private final TrustStrategy trustStrategy;

        TrustManagerDelegate(X509TrustManager x509TrustManager, TrustStrategy trustStrategy) {
            this.trustManager = x509TrustManager;
            this.trustStrategy = trustStrategy;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.trustManager.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (this.trustStrategy.isTrusted(x509CertificateArr, str)) {
                return;
            }
            this.trustManager.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.trustManager.getAcceptedIssuers();
        }
    }

    public SSLContextBuilder() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u0006!6\u00113/3'", (short) (C1607wl.Xd() ^ 25102))).getDeclaredMethod(Xg.qd("vu\u0006Vxzv\f\u0004\rm\u0014\f\u0002", (short) (Od.Xd() ^ (-31902)), (short) (Od.Xd() ^ (-13748))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.keyStoreType = (String) declaredMethod.invoke(null, objArr);
            this.trustManagerFactoryAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            this.keyManagers = new LinkedHashSet();
            this.trustManagers = new LinkedHashSet();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static SSLContextBuilder create() {
        return new SSLContextBuilder();
    }

    public SSLContext build() throws NoSuchAlgorithmException, KeyManagementException {
        String str = this.protocol;
        if (str == null) {
            str = "TLS";
        }
        Provider provider = this.provider;
        SSLContext sSLContext = provider != null ? SSLContext.getInstance(str, provider) : SSLContext.getInstance(str);
        initSSLContext(sSLContext, this.keyManagers, this.trustManagers, this.secureRandom);
        return sSLContext;
    }

    protected void initSSLContext(SSLContext sSLContext, Collection<KeyManager> collection, Collection<TrustManager> collection2, SecureRandom secureRandom) throws KeyManagementException {
        sSLContext.init(!collection.isEmpty() ? (KeyManager[]) collection.toArray(new KeyManager[collection.size()]) : null, collection2.isEmpty() ? null : (TrustManager[]) collection2.toArray(new TrustManager[collection2.size()]), secureRandom);
    }

    public SSLContextBuilder loadKeyMaterial(File file, char[] cArr, char[] cArr2) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        return loadKeyMaterial(file, cArr, cArr2, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(File file, char[] cArr, char[] cArr2, PrivateKeyStrategy privateKeyStrategy) throws Throwable {
        Args.notNull(file, Jg.Wd("jS*p:\bG\rPc)|B", (short) (Od.Xd() ^ (-9770)), (short) (Od.Xd() ^ (-14728))));
        Object[] objArr = {this.keyStoreType};
        Method declaredMethod = Class.forName(ZO.xd("\u001e\u0018B$a\u00042\fx\u0001/-\u0018\u001b3ju6xpf\u0005", (short) (OY.Xd() ^ IptcDirectory.TAG_CONTACT), (short) (OY.Xd() ^ 2110))).getDeclaredMethod(Ig.wd("p()Z \u007f\u0019\u0016oX`", (short) (OY.Xd() ^ 8287)), Class.forName(C1626yg.Ud("'=w\u001cP\u0017\u0013\u0017WN):B<\n\u0018", (short) (C1580rY.Xd() ^ (-16554)), (short) (C1580rY.Xd() ^ (-25813)))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Class<?> cls = Class.forName(EO.Od("xG*qf\u0001R!y\u0017\u00109\tC4hY-\u0017.\b/", (short) (OY.Xd() ^ 3462)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Qd("\u0014\n\u001e\bS\u000e\u0013Pj\u000f\u0010\u0014\u0012o\u0010\r~y\u0005", (short) (C1607wl.Xd() ^ 21150)));
                clsArr[1] = char[].class;
                Object[] objArr2 = {fileInputStream, cArr};
                Method method = cls.getMethod(C1593ug.zd("\u000b\u000f\u0002\u0006", (short) (FB.Xd() ^ 25591), (short) (FB.Xd() ^ 11141)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    fileInputStream.close();
                    return loadKeyMaterial(keyStore, cArr2, privateKeyStrategy);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public SSLContextBuilder loadKeyMaterial(URL url, char[] cArr, char[] cArr2) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        return loadKeyMaterial(url, cArr, cArr2, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(URL url, char[] cArr, char[] cArr2, PrivateKeyStrategy privateKeyStrategy) throws Throwable {
        Args.notNull(url, C1561oA.od("\u00192E>>8:,e\u001a\u0016\u000f", (short) (OY.Xd() ^ 31068)));
        String str = this.keyStoreType;
        Class<?> cls = Class.forName(C1561oA.Kd("[SiU#i\\[nldpv,JezUwswk", (short) (Od.Xd() ^ (-14293))));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("\u0005\u0006\u001c\u0012 `Zj$w\u001b}\u0003~\u000bG", (short) (C1607wl.Xd() ^ 29307), (short) (C1607wl.Xd() ^ 2707)))};
        Object[] objArr = {str};
        short sXd = (short) (FB.Xd() ^ 4809);
        int[] iArr = new int["_^nDjpr`ndg".length()];
        QB qb = new QB("_^nDjpr`ndg");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            InputStream inputStreamOpenStream = url.openStream();
            try {
                Class<?> cls2 = Class.forName(Wg.vd("SI]G\u001b_PMfbXbn\">WrKkeoa", (short) (OY.Xd() ^ 13812)));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(Qg.kd("\u0014\n\u001e\bS\u000e\u0013Pj\u000f\u0010\u0014\u0012o\u0010\r~y\u0005", (short) (ZN.Xd() ^ 8363), (short) (ZN.Xd() ^ 15174)));
                clsArr2[1] = char[].class;
                Object[] objArr2 = {inputStreamOpenStream, cArr};
                short sXd2 = (short) (ZN.Xd() ^ 29289);
                short sXd3 = (short) (ZN.Xd() ^ 13718);
                int[] iArr2 = new int["<>/1".length()];
                QB qb2 = new QB("<>/1");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                Method method = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    inputStreamOpenStream.close();
                    return loadKeyMaterial(keyStore, cArr2, privateKeyStrategy);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                inputStreamOpenStream.close();
                throw th;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        return loadKeyMaterial(keyStore, cArr, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr, PrivateKeyStrategy privateKeyStrategy) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        String defaultAlgorithm = this.keyManagerFactoryAlgorithm;
        if (defaultAlgorithm == null) {
            defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (privateKeyStrategy != null) {
                for (int i2 = 0; i2 < keyManagers.length; i2++) {
                    KeyManager keyManager = keyManagers[i2];
                    if (keyManager instanceof X509ExtendedKeyManager) {
                        keyManagers[i2] = new KeyManagerDelegate((X509ExtendedKeyManager) keyManager, privateKeyStrategy);
                    }
                }
            }
            for (KeyManager keyManager2 : keyManagers) {
                this.keyManagers.add(keyManager2);
            }
        }
        return this;
    }

    public SSLContextBuilder loadTrustMaterial(TrustStrategy trustStrategy) throws NoSuchAlgorithmException, KeyStoreException {
        return loadTrustMaterial((KeyStore) null, trustStrategy);
    }

    public SSLContextBuilder loadTrustMaterial(File file) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return loadTrustMaterial(file, (char[]) null);
    }

    public SSLContextBuilder loadTrustMaterial(File file, char[] cArr) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return loadTrustMaterial(file, cArr, (TrustStrategy) null);
    }

    public SSLContextBuilder loadTrustMaterial(File file, char[] cArr, TrustStrategy trustStrategy) throws Throwable {
        Args.notNull(file, C1561oA.ud("v\u0014\u0016\u0013\u0013\u0011\u0011\u000b\r~8}\u007f\u0002y", (short) (Od.Xd() ^ (-32027))));
        String str = this.keyStoreType;
        short sXd = (short) (FB.Xd() ^ 22302);
        int[] iArr = new int["\t~\u0017\u0001H\r\u0002~\f\b\u0002\f\f?_x(\u0001%\u001f\u001d\u000f".length()];
        QB qb = new QB("\t~\u0017\u0001H\r\u0002~\f\b\u0002\f\f?_x(\u0001%\u001f\u001d\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("@?O%KQSAOEH", (short) (C1499aX.Xd() ^ (-17242)), (short) (C1499aX.Xd() ^ (-3569))), Class.forName(C1561oA.Yd("~v\rxF\u0006{\n\u0004Kq\u0014\u0013\u000b\u0011\u000b", (short) (C1499aX.Xd() ^ (-8110)))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Class<?> cls = Class.forName(Jg.Wd("=\u0007#hksL\t\u0012a^D@3~\u0018^\u00173L\u0006w", (short) (FB.Xd() ^ 7640), (short) (FB.Xd() ^ 31929)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(ZO.xd(" akG\u007f\f\u0013T6h\u0019R\n\u0004\u0017PXMS", (short) (C1580rY.Xd() ^ (-20066)), (short) (C1580rY.Xd() ^ (-14766))));
                clsArr[1] = char[].class;
                Object[] objArr2 = {fileInputStream, cArr};
                Method method = cls.getMethod(C1626yg.Ud("\t,<z", (short) (C1607wl.Xd() ^ QuickTimeMetadataDirectory.TAG_MODEL), (short) (C1607wl.Xd() ^ 8720)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    fileInputStream.close();
                    return loadTrustMaterial(keyStore, trustStrategy);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public SSLContextBuilder loadTrustMaterial(URL url, char[] cArr) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return loadTrustMaterial(url, cArr, (TrustStrategy) null);
    }

    public SSLContextBuilder loadTrustMaterial(URL url, char[] cArr, TrustStrategy trustStrategy) throws Throwable {
        Args.notNull(url, Ig.wd("L\u0018\rf5^E'b\u0004:\u0018I;", (short) (FB.Xd() ^ 5071)));
        Object[] objArr = {this.keyStoreType};
        Method declaredMethod = Class.forName(EO.Od("Ow;F\u0004\u0016k2\u00034%R\u00024}:zb,\u000fPk", (short) (Od.Xd() ^ (-95)))).getDeclaredMethod(C1593ug.zd("+*:\u00106<>,:03", (short) (OY.Xd() ^ 4294), (short) (OY.Xd() ^ 18349)), Class.forName(C1561oA.Qd("ZPdN\u001aWKWO\u00159YVLPH", (short) (FB.Xd() ^ 11489))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            InputStream inputStreamOpenStream = url.openStream();
            short sXd = (short) (FB.Xd() ^ 32357);
            int[] iArr = new int["xn\u0003l8|mj{wmw{/KdwPpjl^".length()];
            QB qb = new QB("xn\u0003l8|mj{wmw{/KdwPpjl^");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            try {
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Kd("SKaM\u001bW^\u001e:`ciiIkj^[h", (short) (OY.Xd() ^ 20759)));
                clsArr[1] = char[].class;
                Object[] objArr2 = {inputStreamOpenStream, cArr};
                Method method = cls.getMethod(Wg.Zd("\u001f]k\u0017", (short) (C1633zX.Xd() ^ (-24292)), (short) (C1633zX.Xd() ^ (-26696))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    inputStreamOpenStream.close();
                    return loadTrustMaterial(keyStore, trustStrategy);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                inputStreamOpenStream.close();
                throw th;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public SSLContextBuilder loadTrustMaterial(KeyStore keyStore, TrustStrategy trustStrategy) throws NoSuchAlgorithmException, KeyStoreException {
        String defaultAlgorithm = this.trustManagerFactoryAlgorithm;
        if (defaultAlgorithm == null) {
            defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (trustStrategy != null) {
                for (int i2 = 0; i2 < trustManagers.length; i2++) {
                    TrustManager trustManager = trustManagers[i2];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i2] = new TrustManagerDelegate((X509TrustManager) trustManager, trustStrategy);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.trustManagers.add(trustManager2);
            }
        }
        return this;
    }

    public SSLContextBuilder setKeyManagerFactoryAlgorithm(String str) {
        this.keyManagerFactoryAlgorithm = str;
        return this;
    }

    public SSLContextBuilder setKeyStoreType(String str) {
        this.keyStoreType = str;
        return this;
    }

    public SSLContextBuilder setProtocol(String str) {
        this.protocol = str;
        return this;
    }

    public SSLContextBuilder setProvider(String str) {
        this.provider = Security.getProvider(str);
        return this;
    }

    public SSLContextBuilder setProvider(Provider provider) {
        this.provider = provider;
        return this;
    }

    public SSLContextBuilder setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }

    public SSLContextBuilder setTrustManagerFactoryAlgorithm(String str) {
        this.trustManagerFactoryAlgorithm = str;
        return this;
    }

    public String toString() {
        return "[provider=" + this.provider + ", protocol=" + this.protocol + ", keyStoreType=" + this.keyStoreType + ", keyManagerFactoryAlgorithm=" + this.keyManagerFactoryAlgorithm + ", keyManagers=" + this.keyManagers + ", trustManagerFactoryAlgorithm=" + this.trustManagerFactoryAlgorithm + ", trustManagers=" + this.trustManagers + ", secureRandom=" + this.secureRandom + "]";
    }

    @Deprecated
    public SSLContextBuilder useProtocol(String str) {
        this.protocol = str;
        return this;
    }
}
