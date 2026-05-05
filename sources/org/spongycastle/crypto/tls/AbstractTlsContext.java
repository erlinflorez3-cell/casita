package org.spongycastle.crypto.tls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.DigestRandomGenerator;
import org.spongycastle.crypto.prng.RandomGenerator;
import org.spongycastle.util.Times;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractTlsContext implements TlsContext {
    private static long counter = Times.nanoTime();
    private RandomGenerator nonceRandom;
    private SecureRandom secureRandom;
    private SecurityParameters securityParameters;
    private ProtocolVersion clientVersion = null;
    private ProtocolVersion serverVersion = null;
    private TlsSession session = null;
    private Object userObject = null;

    AbstractTlsContext(SecureRandom secureRandom, SecurityParameters securityParameters) throws Throwable {
        Digest digestCreateHash = TlsUtils.createHash((short) 4);
        byte[] bArr = new byte[digestCreateHash.getDigestSize()];
        Object[] objArr = {bArr};
        Method method = Class.forName(Ig.wd("+Q\u0019#(9\u0017\\LXU~Q\u007f\t8}>b\u000e8\u0003qod&", (short) (OY.Xd() ^ 32551))).getMethod(EO.Od("!?\u0005(NS\u001a\u0003<", (short) (C1633zX.Xd() ^ (-27874))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(digestCreateHash);
            this.nonceRandom = digestRandomGenerator;
            digestRandomGenerator.addSeedMaterial(nextCounterValue());
            this.nonceRandom.addSeedMaterial(Times.nanoTime());
            this.nonceRandom.addSeedMaterial(bArr);
            this.secureRandom = secureRandom;
            this.securityParameters = securityParameters;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static synchronized long nextCounterValue() {
        long j2;
        j2 = counter + 1;
        counter = j2;
        return j2;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i2) {
        if (bArr != null && !TlsUtils.isValidUint16(bArr.length)) {
            throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
        }
        SecurityParameters securityParameters = getSecurityParameters();
        byte[] clientRandom = securityParameters.getClientRandom();
        byte[] serverRandom = securityParameters.getServerRandom();
        int length = clientRandom.length + serverRandom.length;
        if (bArr != null) {
            length += bArr.length + 2;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(clientRandom, 0, bArr2, 0, clientRandom.length);
        int length2 = clientRandom.length;
        System.arraycopy(serverRandom, 0, bArr2, length2, serverRandom.length);
        int length3 = length2 + serverRandom.length;
        if (bArr != null) {
            TlsUtils.writeUint16(bArr.length, bArr2, length3);
            int i3 = length3 + 2;
            System.arraycopy(bArr, 0, bArr2, i3, bArr.length);
            length3 = i3 + bArr.length;
        }
        if (length3 == length) {
            return TlsUtils.PRF(this, securityParameters.getMasterSecret(), str, bArr2, i2);
        }
        throw new IllegalStateException("error in calculation of seed for export");
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public ProtocolVersion getClientVersion() {
        return this.clientVersion;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public RandomGenerator getNonceRandomGenerator() {
        return this.nonceRandom;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public TlsSession getResumableSession() {
        return this.session;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public SecurityParameters getSecurityParameters() {
        return this.securityParameters;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public ProtocolVersion getServerVersion() {
        return this.serverVersion;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public Object getUserObject() {
        return this.userObject;
    }

    void setClientVersion(ProtocolVersion protocolVersion) {
        this.clientVersion = protocolVersion;
    }

    void setResumableSession(TlsSession tlsSession) {
        this.session = tlsSession;
    }

    void setServerVersion(ProtocolVersion protocolVersion) {
        this.serverVersion = protocolVersion;
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public void setUserObject(Object obj) {
        this.userObject = obj;
    }
}
