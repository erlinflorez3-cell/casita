package com.facebook.react.modules.network;

import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes3.dex */
class ProgressiveStringDecoder {
    private static final String EMPTY_STRING = "";
    private final CharsetDecoder mDecoder;
    private byte[] remainder = null;

    public ProgressiveStringDecoder(Charset charset) {
        this.mDecoder = charset.newDecoder();
    }

    public String decodeNext(byte[] bArr, int i2) {
        byte[] bArr2 = this.remainder;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.remainder.length, i2);
            i2 += this.remainder.length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i2);
        boolean z2 = false;
        int i3 = 0;
        CharBuffer charBufferDecode = null;
        while (!z2 && i3 < 4) {
            try {
                charBufferDecode = this.mDecoder.decode(byteBufferWrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i3++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i2 - i3);
            }
        }
        if (!z2 || i3 <= 0) {
            this.remainder = null;
        } else {
            byte[] bArr4 = new byte[i3];
            this.remainder = bArr4;
            System.arraycopy(bArr, i2 - i3, bArr4, 0, i3);
        }
        if (z2) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        FLog.w(ReactConstants.TAG, "failed to decode string from byte array");
        return "";
    }
}
