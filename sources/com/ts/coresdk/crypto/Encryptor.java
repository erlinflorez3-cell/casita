package com.ts.coresdk.crypto;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;

/* JADX INFO: loaded from: classes5.dex */
public interface Encryptor {

    public interface GenerateKeysListener {
        void onKeyGenerated(PublicKeyData publicKeyData);

        void onKeyGenerationFailure(c cVar);
    }

    public static class PublicKeyData {
        private String ac;
        private String ad;

        public PublicKeyData(String str, String str2) {
            this.ac = str;
            this.ad = str2.toLowerCase();
        }

        public String getData() {
            return this.ac;
        }

        public String getType() {
            return this.ad;
        }
    }

    void clearKey(String str);

    void generateKeys(Context context, ITSModuleInfo iTSModuleInfo, String str, boolean z2, String str2, GenerateKeysListener generateKeysListener);

    KeyPair getKeyPair(Context context, ITSModuleInfo iTSModuleInfo, String str) throws GeneralSecurityException, IOException;
}
