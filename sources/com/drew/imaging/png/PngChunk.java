package com.drew.imaging.png;

/* JADX INFO: loaded from: classes3.dex */
public class PngChunk {
    private final byte[] _bytes;
    private final PngChunkType _chunkType;

    public PngChunk(PngChunkType pngChunkType, byte[] bArr) {
        this._chunkType = pngChunkType;
        this._bytes = bArr;
    }

    public byte[] getBytes() {
        return this._bytes;
    }

    public PngChunkType getType() {
        return this._chunkType;
    }
}
