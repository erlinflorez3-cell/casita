package com.drew.imaging.png;

import com.drew.lang.SequentialByteArrayReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class PngHeader {
    private final byte _bitsPerSample;
    private final PngColorType _colorType;
    private final byte _compressionType;
    private final byte _filterMethod;
    private final int _imageHeight;
    private final int _imageWidth;
    private final byte _interlaceMethod;

    public PngHeader(byte[] bArr) throws PngProcessingException {
        if (bArr.length != 13) {
            throw new PngProcessingException("PNG header chunk must have 13 data bytes");
        }
        SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
        try {
            this._imageWidth = sequentialByteArrayReader.getInt32();
            this._imageHeight = sequentialByteArrayReader.getInt32();
            this._bitsPerSample = sequentialByteArrayReader.getInt8();
            this._colorType = PngColorType.fromNumericValue(sequentialByteArrayReader.getInt8());
            this._compressionType = sequentialByteArrayReader.getInt8();
            this._filterMethod = sequentialByteArrayReader.getInt8();
            this._interlaceMethod = sequentialByteArrayReader.getInt8();
        } catch (IOException e2) {
            throw new PngProcessingException(e2);
        }
    }

    public byte getBitsPerSample() {
        return this._bitsPerSample;
    }

    public PngColorType getColorType() {
        return this._colorType;
    }

    public byte getCompressionType() {
        return this._compressionType;
    }

    public byte getFilterMethod() {
        return this._filterMethod;
    }

    public int getImageHeight() {
        return this._imageHeight;
    }

    public int getImageWidth() {
        return this._imageWidth;
    }

    public byte getInterlaceMethod() {
        return this._interlaceMethod;
    }
}
