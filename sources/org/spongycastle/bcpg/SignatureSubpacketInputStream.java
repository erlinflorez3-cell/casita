package org.spongycastle.bcpg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.bcpg.sig.Exportable;
import org.spongycastle.bcpg.sig.IssuerKeyID;
import org.spongycastle.bcpg.sig.KeyExpirationTime;
import org.spongycastle.bcpg.sig.KeyFlags;
import org.spongycastle.bcpg.sig.NotationData;
import org.spongycastle.bcpg.sig.PreferredAlgorithms;
import org.spongycastle.bcpg.sig.PrimaryUserID;
import org.spongycastle.bcpg.sig.Revocable;
import org.spongycastle.bcpg.sig.SignatureCreationTime;
import org.spongycastle.bcpg.sig.SignatureExpirationTime;
import org.spongycastle.bcpg.sig.SignerUserID;
import org.spongycastle.bcpg.sig.TrustSignature;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureSubpacketInputStream extends InputStream implements SignatureSubpacketTags {
    InputStream in;

    public SignatureSubpacketInputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    private byte[] checkData(byte[] bArr, int i2, int i3, String str) throws EOFException {
        if (i3 == i2) {
            return Arrays.copyOfRange(bArr, 0, i2);
        }
        throw new EOFException("truncated " + str + " subpacket data.");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.in.read();
    }

    public SignatureSubpacket readPacket() throws IOException {
        boolean z2;
        int i2 = read();
        if (i2 < 0) {
            return null;
        }
        if (i2 < 192) {
            z2 = false;
        } else if (i2 <= 223) {
            i2 = ((i2 - 192) << 8) + this.in.read() + 192;
            z2 = false;
        } else {
            if (i2 != 255) {
                throw new IOException("unexpected length header");
            }
            int i3 = (-1) - (((-1) - ((-1) - (((-1) - (this.in.read() << 24)) & ((-1) - (this.in.read() << 16))))) & ((-1) - (this.in.read() << 8)));
            int i4 = this.in.read();
            i2 = (i3 + i4) - (i3 & i4);
            z2 = true;
        }
        int i5 = this.in.read();
        if (i5 < 0) {
            throw new EOFException("unexpected EOF reading signature sub packet");
        }
        int i6 = i2 - 1;
        byte[] bArrCheckData = new byte[i6];
        int fully = Streams.readFully(this.in, bArrCheckData);
        boolean z3 = (128 & i5) != 0;
        int i7 = (-1) - (((-1) - i5) | ((-1) - 127));
        if (fully != i6) {
            if (i7 == 2) {
                bArrCheckData = checkData(bArrCheckData, 4, fully, "Signature Creation Time");
            } else if (i7 == 3) {
                bArrCheckData = checkData(bArrCheckData, 4, fully, "Signature Expiration Time");
            } else if (i7 == 9) {
                bArrCheckData = checkData(bArrCheckData, 4, fully, "Signature Key Expiration Time");
            } else {
                if (i7 != 16) {
                    throw new EOFException("truncated subpacket data.");
                }
                bArrCheckData = checkData(bArrCheckData, 8, fully, "Issuer");
            }
        }
        if (i7 == 2) {
            return new SignatureCreationTime(z3, z2, bArrCheckData);
        }
        if (i7 == 3) {
            return new SignatureExpirationTime(z3, z2, bArrCheckData);
        }
        if (i7 == 4) {
            return new Exportable(z3, z2, bArrCheckData);
        }
        if (i7 == 5) {
            return new TrustSignature(z3, z2, bArrCheckData);
        }
        if (i7 == 7) {
            return new Revocable(z3, z2, bArrCheckData);
        }
        if (i7 == 9) {
            return new KeyExpirationTime(z3, z2, bArrCheckData);
        }
        if (i7 != 11) {
            if (i7 == 16) {
                return new IssuerKeyID(z3, z2, bArrCheckData);
            }
            if (i7 == 25) {
                return new PrimaryUserID(z3, z2, bArrCheckData);
            }
            if (i7 == 27) {
                return new KeyFlags(z3, z2, bArrCheckData);
            }
            if (i7 == 28) {
                return new SignerUserID(z3, z2, bArrCheckData);
            }
            switch (i7) {
                case 20:
                    return new NotationData(z3, z2, bArrCheckData);
                case 21:
                case 22:
                    break;
                default:
                    return new SignatureSubpacket(i7, z3, z2, bArrCheckData);
            }
        }
        return new PreferredAlgorithms(i7, z3, z2, bArrCheckData);
    }
}
