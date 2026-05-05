package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ServerSRPParams {
    protected BigInteger B;
    protected BigInteger N;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f27620g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte[] f27621s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.N = bigInteger;
        this.f27620g = bigInteger2;
        this.f27621s = Arrays.clone(bArr);
        this.B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f27620g, outputStream);
        TlsUtils.writeOpaque8(this.f27621s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.B, outputStream);
    }

    public BigInteger getB() {
        return this.B;
    }

    public BigInteger getG() {
        return this.f27620g;
    }

    public BigInteger getN() {
        return this.N;
    }

    public byte[] getS() {
        return this.f27621s;
    }
}
