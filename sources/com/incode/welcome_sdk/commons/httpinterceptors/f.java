package com.incode.welcome_sdk.commons.httpinterceptors;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.SessionConfig;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: b */
    private static int f5208b = 1;

    /* JADX INFO: renamed from: d */
    private static int f5209d = 0;

    public static final JSONObject a(j jVar) throws JSONException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encryptedKey", com.incode.welcome_sdk.commons.extensions.a.c(jVar.d()));
        jSONObject.put("encryptedIv", com.incode.welcome_sdk.commons.extensions.a.c(jVar.a()));
        int i3 = f5208b + 53;
        f5209d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return jSONObject;
    }

    public static /* synthetic */ SecretKey e() throws NoSuchAlgorithmException {
        int i2 = 2 % 2;
        int i3 = f5209d + 71;
        f5208b = i3 % 128;
        int i4 = i3 % 2;
        SecretKey secretKeyC = c(256);
        int i5 = f5209d + 41;
        f5208b = i5 % 128;
        int i6 = i5 % 2;
        return secretKeyC;
    }

    private static SecretKey c(int i2) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator;
        int i3;
        int i4 = 2 % 2;
        int i5 = f5208b + 71;
        f5209d = i5 % 128;
        if (i5 % 2 != 0) {
            keyGenerator = KeyGenerator.getInstance("AES");
            i3 = 3839;
        } else {
            keyGenerator = KeyGenerator.getInstance("AES");
            i3 = 256;
        }
        keyGenerator.init(i3);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        int i6 = f5209d + 11;
        f5208b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return secretKeyGenerateKey;
    }

    public static /* synthetic */ byte[] d() {
        int i2 = 2 % 2;
        int i3 = f5208b + 19;
        f5209d = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrB = b(16);
        int i5 = f5209d + 83;
        f5208b = i5 % 128;
        int i6 = i5 % 2;
        return bArrB;
    }

    public static final byte[] b(int i2) {
        int i3 = 2 % 2;
        byte[] bArr = new byte[i2];
        new SecureRandom().nextBytes(bArr);
        int i4 = f5209d + 79;
        f5208b = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public static final j e(SecretKey secretKey, byte[] bArr, PublicKey publicKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        MGF1ParameterSpec mGF1ParameterSpec;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(secretKey, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        if (IncodeWelcome.Companion.getInstance().getInternalConfig().getE2eEncryptionAlgorithm() == SessionConfig.E2eEncryptionAlgorithm.SHA1) {
            int i4 = f5208b + 79;
            f5209d = i4 % 128;
            int i5 = i4 % 2;
            mGF1ParameterSpec = MGF1ParameterSpec.SHA1;
            i2 = f5208b + 61;
            f5209d = i2 % 128;
        } else {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            i2 = f5209d + 87;
            f5208b = i2 % 128;
        }
        int i6 = i2 % 2;
        OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT);
        Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWITHSHA-256ANDMGF1PADDING");
        cipher.init(1, publicKey, oAEPParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(secretKey.getEncoded());
        byte[] bArrDoFinal2 = cipher.doFinal(bArr);
        Intrinsics.checkNotNull(bArrDoFinal);
        Intrinsics.checkNotNull(bArrDoFinal2);
        j jVar = new j(bArrDoFinal, bArrDoFinal2);
        int i7 = f5208b + 63;
        f5209d = i7 % 128;
        int i8 = i7 % 2;
        return jVar;
    }
}
