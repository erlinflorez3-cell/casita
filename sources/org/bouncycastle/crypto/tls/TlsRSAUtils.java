package org.bouncycastle.crypto.tls;

import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import yg.C1561oA;
import yg.C1593ug;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class TlsRSAUtils {
    public static byte[] generateEncryptedPreMasterSecret(TlsContext tlsContext, RSAKeyParameters rSAKeyParameters, OutputStream outputStream) throws Throwable {
        byte[] bArr = new byte[48];
        SecureRandom secureRandom = tlsContext.getSecureRandom();
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.Qd("mcwa-qb_plblp$HYVgcUAO[PZW", (short) (OY.Xd() ^ 12897))).getMethod(C1593ug.zd("[Sgd3kgYh", (short) (ZN.Xd() ^ 12515), (short) (ZN.Xd() ^ 17462)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            TlsUtils.writeVersion(tlsContext.getClientVersion(), bArr, 0);
            PKCS1Encoding pKCS1Encoding = new PKCS1Encoding(new RSABlindedEngine());
            pKCS1Encoding.init(true, new ParametersWithRandom(rSAKeyParameters, tlsContext.getSecureRandom()));
            try {
                byte[] bArrProcessBlock = pKCS1Encoding.processBlock(bArr, 0, 48);
                if (TlsUtils.isSSL(tlsContext)) {
                    outputStream.write(bArrProcessBlock);
                } else {
                    TlsUtils.writeOpaque16(bArrProcessBlock, outputStream);
                }
                return bArr;
            } catch (InvalidCipherTextException e2) {
                throw new TlsFatalAlert((short) 80, e2);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static byte[] safeDecryptPreMasterSecret(TlsContext tlsContext, RSAKeyParameters rSAKeyParameters, byte[] bArr) throws Throwable {
        ProtocolVersion clientVersion = tlsContext.getClientVersion();
        byte[] bArr2 = new byte[48];
        SecureRandom secureRandom = tlsContext.getSecureRandom();
        Object[] objArr = {bArr2};
        Method method = Class.forName(C1561oA.od("\u0010\u0006\u001a\u0004O\u0014\u0005\u0002\u0013\u000f\u0005\u000f\u0013Fj{x\n\u0006wcq}r|y", (short) (OY.Xd() ^ 2116))).getMethod(C1561oA.Kd("@8LI\u0018PL>M", (short) (OY.Xd() ^ 8432)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            byte[] bArrClone = Arrays.clone(bArr2);
            try {
                PKCS1Encoding pKCS1Encoding = new PKCS1Encoding(new RSABlindedEngine(), bArr2);
                pKCS1Encoding.init(false, new ParametersWithRandom(rSAKeyParameters, tlsContext.getSecureRandom()));
                bArrClone = pKCS1Encoding.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
            }
            int majorVersion = clientVersion.getMajorVersion();
            byte b2 = bArrClone[0];
            int i2 = majorVersion ^ ((b2 + 255) - (b2 | 255));
            int minorVersion = clientVersion.getMinorVersion();
            byte b3 = bArrClone[1];
            int i3 = (-1) - (((-1) - i2) & ((-1) - (minorVersion ^ ((b3 + 255) - (b3 | 255)))));
            int i4 = i3 >> 1;
            int i5 = (i3 + i4) - (i3 & i4);
            int i6 = i5 >> 2;
            int i7 = (i5 + i6) - (i5 & i6);
            int i8 = ~(((-1) - (((-1) - (i7 | (i7 >> 4))) | ((-1) - 1))) - 1);
            for (int i9 = 0; i9 < 48; i9++) {
                bArrClone[i9] = (byte) (((-1) - (((-1) - bArrClone[i9]) | ((-1) - (~i8)))) | (bArr2[i9] & i8));
            }
            return bArrClone;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
