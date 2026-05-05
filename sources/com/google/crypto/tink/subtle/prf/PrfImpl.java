package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf prfStreamer) {
        this.prfStreamer = prfStreamer;
    }

    private static byte[] readBytesFromStream(InputStream stream, int outputLength) throws GeneralSecurityException {
        try {
            byte[] bArr = new byte[outputLength];
            int i2 = 0;
            while (i2 < outputLength) {
                int i3 = stream.read(bArr, i2, outputLength - i2);
                if (i3 <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i2 += i3;
            }
            return bArr;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static PrfImpl wrap(StreamingPrf prfStreamer) {
        return new PrfImpl(prfStreamer);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException {
        if (input == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        }
        if (outputLength > 0) {
            return readBytesFromStream(this.prfStreamer.computePrf(input), outputLength);
        }
        throw new GeneralSecurityException("Invalid outputLength specified.");
    }
}
