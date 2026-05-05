package org.bouncycastle.crypto.prng.drbg;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Hashtable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes6.dex */
class Utils {
    static final Hashtable maxSecurityStrengths;

    static {
        Hashtable hashtable = new Hashtable();
        maxSecurityStrengths = hashtable;
        hashtable.put("SHA-1", Integers.valueOf(128));
        hashtable.put("SHA-224", Integers.valueOf(192));
        hashtable.put("SHA-256", Integers.valueOf(256));
        hashtable.put("SHA-384", Integers.valueOf(256));
        hashtable.put("SHA-512", Integers.valueOf(256));
        hashtable.put(MessageDigestAlgorithms.SHA_512_224, Integers.valueOf(192));
        hashtable.put(MessageDigestAlgorithms.SHA_512_256, Integers.valueOf(256));
    }

    Utils() {
    }

    static int getMaxSecurityStrength(Digest digest) {
        return ((Integer) maxSecurityStrengths.get(digest.getAlgorithmName())).intValue();
    }

    static int getMaxSecurityStrength(Mac mac) {
        String algorithmName = mac.getAlgorithmName();
        return ((Integer) maxSecurityStrengths.get(algorithmName.substring(0, algorithmName.indexOf(RemoteSettings.FORWARD_SLASH_STRING)))).intValue();
    }

    static byte[] hash_df(Digest digest, byte[] bArr, int i2) {
        int i3 = (i2 + 7) / 8;
        byte[] bArr2 = new byte[i3];
        int digestSize = i3 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 <= digestSize; i6++) {
            digest.update((byte) i4);
            digest.update((byte) (i2 >> 24));
            digest.update((byte) (i2 >> 16));
            digest.update((byte) (i2 >> 8));
            digest.update((byte) i2);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i7 = i6 * digestSize2;
            int i8 = i3 - i7;
            if (i8 > digestSize2) {
                i8 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i7, i8);
            i4++;
        }
        int i9 = i2 % 8;
        if (i9 != 0) {
            int i10 = 8 - i9;
            int i11 = 0;
            while (i5 != i3) {
                int i12 = (-1) - (((-1) - bArr2[i5]) | ((-1) - 255));
                int i13 = i12 >>> i10;
                int i14 = i11 << (8 - i10);
                bArr2[i5] = (byte) ((i14 + i13) - (i14 & i13));
                i5++;
                i11 = i12;
            }
        }
        return bArr2;
    }

    static boolean isTooLarge(byte[] bArr, int i2) {
        return bArr != null && bArr.length > i2;
    }
}
