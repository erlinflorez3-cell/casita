package com.drew.imaging.png;

import com.drew.lang.SequentialReader;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class PngChunkReader {
    private static final byte[] PNG_SIGNATURE_BYTES = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    public Iterable<PngChunk> extract(SequentialReader sequentialReader, Set<PngChunkType> set) throws IOException, PngProcessingException {
        byte[] bytes;
        sequentialReader.setMotorolaByteOrder(true);
        byte[] bArr = PNG_SIGNATURE_BYTES;
        if (!Arrays.equals(bArr, sequentialReader.getBytes(bArr.length))) {
            throw new PngProcessingException("PNG signature mismatch");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            int int32 = sequentialReader.getInt32();
            if (int32 < 0) {
                throw new PngProcessingException("PNG chunk length exceeds maximum");
            }
            PngChunkType pngChunkType = new PngChunkType(sequentialReader.getBytes(4));
            boolean z4 = set == null || set.contains(pngChunkType);
            if (z4) {
                bytes = sequentialReader.getBytes(int32);
            } else {
                sequentialReader.skip(int32);
                bytes = null;
            }
            sequentialReader.skip(4L);
            if (z4 && hashSet.contains(pngChunkType) && !pngChunkType.areMultipleAllowed()) {
                throw new PngProcessingException(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", pngChunkType));
            }
            if (pngChunkType.equals(PngChunkType.IHDR)) {
                z3 = true;
            } else if (!z3) {
                throw new PngProcessingException(String.format("First chunk should be '%s', but '%s' was observed", PngChunkType.IHDR, pngChunkType));
            }
            if (pngChunkType.equals(PngChunkType.IEND)) {
                z2 = true;
            }
            if (z4) {
                arrayList.add(new PngChunk(pngChunkType, bytes));
            }
            hashSet.add(pngChunkType);
        }
        return arrayList;
    }
}
