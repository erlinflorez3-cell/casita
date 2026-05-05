package org.spongycastle.crypto.tls;

import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.RSABlindedEngine;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public class TlsRSAUtils {
    public static byte[] generateEncryptedPreMasterSecret(TlsContext tlsContext, RSAKeyParameters rSAKeyParameters, OutputStream outputStream) throws Throwable {
        byte[] bArr = new byte[48];
        SecureRandom secureRandom = tlsContext.getSecureRandom();
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.Qd("5+?)t9*'84*48k\u0010!\u001e/+\u001d\t\u0017#\u0018\"\u001f", (short) (C1607wl.Xd() ^ 27745))).getMethod(C1593ug.zd(":2FC\u0012JF8G", (short) (Od.Xd() ^ (-14674)), (short) (Od.Xd() ^ (-26895))), byte[].class);
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
        Method method = Class.forName(C1561oA.od("7-A+v;,):6,6:m\u0012# 1-\u001f\u000b\u0019%\u001a$!", (short) (FB.Xd() ^ 20847))).getMethod(C1561oA.Kd("\u0018\u0010$!o($\u0016%", (short) (FB.Xd() ^ 14096)), byte[].class);
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
            int majorVersion = clientVersion.getMajorVersion() ^ ((-1) - (((-1) - bArrClone[0]) | ((-1) - 255)));
            int minorVersion = clientVersion.getMinorVersion();
            byte b2 = bArrClone[1];
            int i2 = (-1) - (((-1) - majorVersion) & ((-1) - (minorVersion ^ ((b2 + 255) - (b2 | 255)))));
            int i3 = (-1) - (((-1) - i2) & ((-1) - (i2 >> 1)));
            int i4 = i3 >> 2;
            int i5 = (i3 + i4) - (i3 & i4);
            int i6 = ~((((-1) - (((-1) - i5) & ((-1) - (i5 >> 4)))) & 1) - 1);
            for (int i7 = 0; i7 < 48; i7++) {
                int i8 = (-1) - (((-1) - bArrClone[i7]) | ((-1) - (~i6)));
                int i9 = (-1) - (((-1) - bArr2[i7]) | ((-1) - i6));
                bArrClone[i7] = (byte) ((i8 + i9) - (i8 & i9));
            }
            return bArrClone;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
