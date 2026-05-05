package com.ticnow.sdk.idnowsecurity.security.crypto;

import com.ticnow.sdk.idnowsecurity.api.IDNowSettings;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes5.dex */
public class IDAesLegacy {
    public static String decrypt(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")), 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IDNowSettings.Companion.getv().getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String decryptV19(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8")), 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IDNowSettings.Companion.getv().getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String digestSHA256Message(String str) throws NoSuchAlgorithmException {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            sb.append(Integer.toString(((b2 + 255) - (b2 | 255)) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String encrypt(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")), 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IDNowSettings.Companion.getv().getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(str2.getBytes());
            System.out.println("encrypted string: " + Base64.toBase64String(bArrDoFinal));
            return Base64.toBase64String(bArrDoFinal);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] encryptData(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")), 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IDNowSettings.Companion.getv().getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            System.out.println("encrypted string: " + Base64.toBase64String(bArrDoFinal));
            return bArrDoFinal;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String newDecrypt(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")), 16), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IDNowSettings.Companion.getv().getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
