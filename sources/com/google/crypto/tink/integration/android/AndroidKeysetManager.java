package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import java.io.CharConversionException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private static final Object lock = new Object();
    private KeysetManager keysetManager;
    private final Aead masterAead;
    private final KeysetWriter writer;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
        private KeysetManager keysetManager;
        private Context context = null;
        private String keysetName = null;
        private String prefFileName = null;
        private String masterKeyUri = null;
        private Aead masterAead = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;

        private KeysetManager generateKeysetAndWriteToPrefs() throws GeneralSecurityException, IOException {
            if (this.keyTemplate == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
            KeysetManager primary = keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
            SharedPrefKeysetWriter sharedPrefKeysetWriter = new SharedPrefKeysetWriter(this.context, this.keysetName, this.prefFileName);
            if (this.masterAead != null) {
                primary.getKeysetHandle().write(sharedPrefKeysetWriter, this.masterAead);
            } else {
                CleartextKeysetHandle.write(primary.getKeysetHandle(), sharedPrefKeysetWriter);
            }
            return primary;
        }

        private static byte[] readKeysetFromPrefs(Context context, String keysetName, String prefFileName) throws Throwable {
            SharedPreferences defaultSharedPreferences;
            if (keysetName == null) {
                throw new IllegalArgumentException(EO.Od("3\u0005\u001b5`\u0014QM\f(R}KLJ3}\u001d)&$L;8{", (short) (Od.Xd() ^ (-9298))));
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (FB.Xd() ^ 29847))).getMethod(Xg.qd("[Zj8hifd_^rhooErryk\u007f|", (short) (FB.Xd() ^ 4854), (short) (FB.Xd() ^ 18637)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                if (prefFileName == null) {
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                } else {
                    short sXd = (short) (Od.Xd() ^ (-31282));
                    short sXd2 = (short) (Od.Xd() ^ (-16453));
                    int[] iArr = new int[" Y9j\u0012>$\u0010qp\u001a\u0003^Y\u000b((G0Yt:#".length()];
                    QB qb = new QB(" Y9j\u0012>$\u0010qp\u001a\u0003^Y\u000b((G0Yt:#");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = {Class.forName(ZO.xd("&D2m\b}\u0017\tb\t\u0015i\b\u0017do", (short) (C1499aX.Xd() ^ (-25768)), (short) (C1499aX.Xd() ^ (-12112)))), Integer.TYPE};
                    Object[] objArr2 = {prefFileName, 0};
                    short sXd3 = (short) (C1580rY.Xd() ^ (-24177));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-3568));
                    int[] iArr2 = new int["_q\u0004bC\u0013\b1\"xXB,.\u0007\u00134\\ja".length()];
                    QB qb2 = new QB("_q\u0004bC\u0013\b1\"xXB,.\u0007\u00134\\ja");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method2.setAccessible(true);
                        defaultSharedPreferences = (SharedPreferences) method2.invoke(context2, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                try {
                    String string = defaultSharedPreferences.getString(keysetName, null);
                    if (string == null) {
                        return null;
                    }
                    return Hex.decode(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format(Ig.wd(";\nb\u0002\\:?@\u0011f\"M\u00180\u0004V0j&\u0011I\u001d\u0007Y\u0001\u0006\"\u0013\u001e\u0014AkqOu\u0004M12R\u001b1\b7\\\r|\u0018Su\u001e-O\"VoG$WNI\u001e", (short) (C1607wl.Xd() ^ 17904)), keysetName));
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        private KeysetManager readKeysetInCleartext(byte[] serializedKeyset) throws GeneralSecurityException, IOException {
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(serializedKeyset)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.security.GeneralSecurityException] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v6, types: [com.google.crypto.tink.KeysetManager] */
        private KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] serializedKeyset) throws GeneralSecurityException, IOException {
            try {
                this.masterAead = new AndroidKeystoreKmsClient().getAead(this.masterKeyUri);
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(BinaryKeysetReader.withBytes(serializedKeyset), this.masterAead));
                } catch (IOException | GeneralSecurityException e2) {
                    e = e2;
                    try {
                        e = readKeysetInCleartext(serializedKeyset);
                        return e;
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e3) {
                try {
                    KeysetManager keysetInCleartext = readKeysetInCleartext(serializedKeyset);
                    String unused2 = AndroidKeysetManager.TAG;
                    return keysetInCleartext;
                } catch (IOException unused3) {
                    throw e3;
                }
            }
        }

        private Aead readOrGenerateNewMasterKey() throws Throwable {
            C1561oA.Qd("\u001d\u001a&%%)S(%\u0016Oo\u001c\u0011\u001e\u001a\u0013\rGq\u000b\u001e\u0017\u0017\u0011\u0013\u0005J=\u0006\u0010A\u0006\u00057xz4w{\u0005qqzrp", (short) (Od.Xd() ^ (-23076)));
            if (!AndroidKeysetManager.isAtLeastM()) {
                String unused = AndroidKeysetManager.TAG;
                short sXd = (short) (OY.Xd() ^ 9790);
                short sXd2 = (short) (OY.Xd() ^ 22849);
                int[] iArr = new int["Cqhwupl)Up\u0006\u0001\u0003~\u0003v2\u0006y\u0007\f\u0001\u000b~\u000e;}\u0012>\f\u0006\u0003\u0016\u0018Df\u0015\f\u001b\u0019\u0014\u0010Lz".length()];
                QB qb = new QB("Cqhwupl)Up\u0006\u0001\u0003~\u0003v2\u0006y\u0007\f\u0001\u000b~\u000e;}\u0012>\f\u0006\u0003\u0016\u0018Df\u0015\f\u001b\u0019\u0014\u0010Lz");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                new String(iArr, 0, i2);
                return null;
            }
            AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
            try {
                boolean zGenerateKeyIfNotExist = AndroidKeystoreKmsClient.generateKeyIfNotExist(this.masterKeyUri);
                try {
                    return androidKeystoreKmsClient.getAead(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException e2) {
                    if (zGenerateKeyIfNotExist) {
                        String unused2 = AndroidKeysetManager.TAG;
                        return null;
                    }
                    Object[] objArr = {String.format(C1561oA.od("}pl&revvfr\u001fibu\u001b\u001fl\u0018\\n^gge\u0011Rdb\rU^\n^V\\YFFOG", (short) (OY.Xd() ^ 4323)), this.masterKeyUri), e2};
                    Constructor<?> constructor = Class.forName(C1561oA.Kd("\u0014\f\"\u000e[\"\u0015\u0014'%\u001d)/d\u0003\u001e3\u000e0,0$\u00059%(49/66", (short) (C1607wl.Xd() ^ 21663))).getConstructor(Class.forName(Wg.Zd("\b+\u0006ugYD~;\tA\u0017,N\tv", (short) (C1499aX.Xd() ^ (-17029)), (short) (C1499aX.Xd() ^ (-16057)))), Class.forName(C1561oA.Xd("c[q]+j`nh0Wlwu~ikvp", (short) (C1580rY.Xd() ^ (-27674)))));
                    try {
                        constructor.setAccessible(true);
                        throw ((KeyStoreException) constructor.newInstance(objArr));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } catch (GeneralSecurityException | ProviderException e4) {
                String unused3 = AndroidKeysetManager.TAG;
                return null;
            }
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManager;
            if (this.keysetName == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (AndroidKeysetManager.lock) {
                byte[] keysetFromPrefs = readKeysetFromPrefs(this.context, this.keysetName, this.prefFileName);
                if (keysetFromPrefs == null) {
                    if (this.masterKeyUri != null) {
                        this.masterAead = readOrGenerateNewMasterKey();
                    }
                    this.keysetManager = generateKeysetAndWriteToPrefs();
                } else if (this.masterKeyUri == null || !AndroidKeysetManager.isAtLeastM()) {
                    this.keysetManager = readKeysetInCleartext(keysetFromPrefs);
                } else {
                    this.keysetManager = readMasterkeyDecryptAndParseKeyset(keysetFromPrefs);
                }
                androidKeysetManager = new AndroidKeysetManager(this, null);
            }
            return androidKeysetManager;
        }

        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        public Builder withKeyTemplate(KeyTemplate val) {
            this.keyTemplate = val;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate val) {
            this.keyTemplate = KeyTemplate.create(val.getTypeUrl(), val.getValue().toByteArray(), AndroidKeysetManager.fromProto(val.getOutputPrefixType()));
            return this;
        }

        public Builder withMasterKeyUri(String val) {
            if (!val.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = val;
            return this;
        }

        public Builder withSharedPref(Context context, String keysetName, String prefFileName) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (keysetName == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.context = context;
            this.keysetName = keysetName;
            this.prefFileName = prefFileName;
            return this;
        }
    }

    private AndroidKeysetManager(Builder builder) {
        this.writer = new SharedPrefKeysetWriter(builder.context, builder.keysetName, builder.prefFileName);
        this.masterAead = builder.masterAead;
        this.keysetManager = builder.keysetManager;
    }

    /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i2 == 1) {
            return KeyTemplate.OutputPrefixType.TINK;
        }
        if (i2 == 2) {
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i2 == 3) {
            return KeyTemplate.OutputPrefixType.RAW;
        }
        if (i2 == 4) {
            return KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private boolean shouldUseKeystore() {
        return this.masterAead != null && isAtLeastM();
    }

    private void write(KeysetManager manager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                manager.getKeysetHandle().write(this.writer, this.masterAead);
            } else {
                CleartextKeysetHandle.write(manager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int keyId) throws GeneralSecurityException {
        KeysetManager keysetManagerDelete = this.keysetManager.delete(keyId);
        this.keysetManager = keysetManagerDelete;
        write(keysetManagerDelete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int keyId) throws GeneralSecurityException {
        KeysetManager keysetManagerDestroy = this.keysetManager.destroy(keyId);
        this.keysetManager = keysetManagerDestroy;
        write(keysetManagerDestroy);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int keyId) throws GeneralSecurityException {
        KeysetManager keysetManagerDisable = this.keysetManager.disable(keyId);
        this.keysetManager = keysetManagerDisable;
        write(keysetManagerDisable);
        return this;
    }

    public synchronized AndroidKeysetManager enable(int keyId) throws GeneralSecurityException {
        KeysetManager keysetManagerEnable = this.keysetManager.enable(keyId);
        this.keysetManager = keysetManagerEnable;
        write(keysetManagerEnable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int keyId) throws GeneralSecurityException {
        return setPrimary(keyId);
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerRotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = keysetManagerRotate;
        write(keysetManagerRotate);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int keyId) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(keyId);
        this.keysetManager = primary;
        write(primary);
        return this;
    }
}
