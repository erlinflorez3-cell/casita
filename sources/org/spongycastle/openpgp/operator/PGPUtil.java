package org.spongycastle.openpgp.operator;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.bcpg.HashAlgorithmTags;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
class PGPUtil implements HashAlgorithmTags {
    PGPUtil() {
    }

    static byte[] makeKeyFromPassPhrase(PGPDigestCalculator pGPDigestCalculator, int i2, S2K s2k, char[] cArr) throws PGPException {
        int i3 = 256;
        switch (i2) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 11:
                i3 = 128;
                break;
            case 2:
            case 8:
            case 12:
                i3 = 192;
                break;
            case 6:
                i3 = 64;
                break;
            case 9:
            case 10:
            case 13:
                break;
            default:
                throw new PGPException("unknown symmetric algorithm: " + i2);
        }
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        int i4 = (i3 + 7) / 8;
        byte[] bArr = new byte[i4];
        if (s2k != null) {
            if (s2k.getHashAlgorithm() != pGPDigestCalculator.getAlgorithm()) {
                throw new PGPException("s2k/digestCalculator mismatch");
            }
        } else if (pGPDigestCalculator.getAlgorithm() != 1) {
            throw new PGPException("digestCalculator not for MD5");
        }
        OutputStream outputStream = pGPDigestCalculator.getOutputStream();
        int length = 0;
        int i5 = 0;
        while (length < i4) {
            if (s2k != null) {
                for (int i6 = 0; i6 != i5; i6++) {
                    try {
                        outputStream.write(0);
                    } catch (IOException e2) {
                        throw new PGPException("exception calculating digest: " + e2.getMessage(), e2);
                    }
                }
                byte[] iv = s2k.getIV();
                int type = s2k.getType();
                if (type == 0) {
                    outputStream.write(uTF8ByteArray);
                } else if (type == 1) {
                    outputStream.write(iv);
                    outputStream.write(uTF8ByteArray);
                } else {
                    if (type != 3) {
                        throw new PGPException("unknown S2K type: " + s2k.getType());
                    }
                    long iterationCount = s2k.getIterationCount();
                    outputStream.write(iv);
                    outputStream.write(uTF8ByteArray);
                    int length2 = iv.length + uTF8ByteArray.length;
                    while (true) {
                        long j2 = iterationCount - ((long) length2);
                        while (true) {
                            if (j2 > 0) {
                                if (j2 < iv.length) {
                                    outputStream.write(iv, 0, (int) j2);
                                } else {
                                    outputStream.write(iv);
                                    iterationCount = j2 - ((long) iv.length);
                                    if (iterationCount < uTF8ByteArray.length) {
                                        outputStream.write(uTF8ByteArray, 0, (int) iterationCount);
                                        j2 = 0;
                                    }
                                }
                            }
                        }
                        outputStream.write(uTF8ByteArray);
                        length2 = uTF8ByteArray.length;
                    }
                }
            } else {
                for (int i7 = 0; i7 != i5; i7++) {
                    outputStream.write(0);
                }
                outputStream.write(uTF8ByteArray);
            }
            outputStream.close();
            byte[] digest = pGPDigestCalculator.getDigest();
            int i8 = i4 - length;
            if (digest.length > i8) {
                System.arraycopy(digest, 0, bArr, length, i8);
            } else {
                System.arraycopy(digest, 0, bArr, length, digest.length);
            }
            length += digest.length;
            i5++;
        }
        for (int i9 = 0; i9 != uTF8ByteArray.length; i9++) {
            uTF8ByteArray[i9] = 0;
        }
        return bArr;
    }

    public static byte[] makeKeyFromPassPhrase(PGPDigestCalculatorProvider pGPDigestCalculatorProvider, int i2, S2K s2k, char[] cArr) throws PGPException {
        return makeKeyFromPassPhrase(s2k != null ? pGPDigestCalculatorProvider.get(s2k.getHashAlgorithm()) : pGPDigestCalculatorProvider.get(1), i2, s2k, cArr);
    }
}
