package com.valid.security.managers;

import com.valid.security.entities.EncryptionType;
import com.valid.security.entities.TransformRsa;
import com.valid.security.utils.SecurityUtils;
import java.security.Key;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RsaCrypto extends CommonCryptoManager implements VsshCryptoManager<TransformRsa>, VsshCryptoLargeManager {

    /* JADX INFO: renamed from: com.valid.security.managers.RsaCrypto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$valid$security$entities$TransformRsa;

        static {
            int[] iArr = new int[TransformRsa.values().length];
            $SwitchMap$com$valid$security$entities$TransformRsa = iArr;
            try {
                iArr[TransformRsa.ECB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$valid$security$entities$TransformRsa[TransformRsa.OAEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$valid$security$entities$TransformRsa[TransformRsa.PKCS1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class ParseException extends RuntimeException {
    }

    private static EncryptionType getEncryptionType(TransformRsa transformRsa) {
        try {
            int i2 = AnonymousClass1.$SwitchMap$com$valid$security$entities$TransformRsa[transformRsa.ordinal()];
            return i2 != 1 ? i2 != (1353491302 ^ 1353491300) ? i2 != ((1963414797 ^ 2090824780) ^ 160964930) ? EncryptionType.RSA_ECB0AEP_SHA : EncryptionType.RSA_PKCS1 : EncryptionType.RSA_OAEP : EncryptionType.RSA_ECB;
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.valid.security.managers.CommonCryptoManager
    public byte[] decrypt(EncryptionType encryptionType, String str, Key key) {
        return (str == null || str.isEmpty()) ? new byte[0] : getValidSecurity().decryptRsa(SecurityUtils.getByteArrayFromHexString(str), key, getCipherHelper().getCipher(encryptionType));
    }

    public byte[] decrypt(TransformRsa transformRsa, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return decrypt(getEncryptionType(transformRsa), str, key);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] decrypt(Enum r2, String str, Key key) {
        try {
            return decrypt((TransformRsa) r2, str, key);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.valid.security.managers.VsshCryptoLargeManager
    public byte[] decryptLargeRsa(TransformRsa transformRsa, List<String> list, Key key) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    return getValidSecurity().decryptLargeRsa(list, key, getCipherHelper().getCipher(getEncryptionType(transformRsa)));
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    @Override // com.valid.security.managers.CommonCryptoManager
    public byte[] encrypt(EncryptionType encryptionType, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return getValidSecurity().encryptRsa(str.getBytes(), key, getCipherHelper().getCipher(encryptionType));
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    public byte[] encrypt(TransformRsa transformRsa, String str, Key key) {
        return (str == null || str.isEmpty()) ? new byte[0] : encrypt(getEncryptionType(transformRsa), str, key);
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] encrypt(Enum r2, String str, Key key) {
        try {
            return encrypt((TransformRsa) r2, str, key);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.valid.security.managers.VsshCryptoLargeManager
    public List<String> encryptLargeRsa(TransformRsa transformRsa, String str, Key key) {
        try {
            return getValidSecurity().encryptLargeRsa(str.getBytes(), key, getCipherHelper().getCipher(getEncryptionType(transformRsa)));
        } catch (ParseException unused) {
            return null;
        }
    }
}
