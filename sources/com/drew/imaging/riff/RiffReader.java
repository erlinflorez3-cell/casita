package com.drew.imaging.riff;

import com.drew.lang.SequentialReader;
import com.drew.metadata.avi.AviDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class RiffReader {
    public void processChunks(SequentialReader sequentialReader, int i2, RiffHandler riffHandler) throws IOException {
        while (sequentialReader.getPosition() < i2) {
            try {
                String str = new String(sequentialReader.getBytes(4));
                int int32 = sequentialReader.getInt32();
                if (int32 <= 0) {
                    riffHandler.addError("Invalid chunk size: " + int32);
                    return;
                }
                if (str.equals("LIST") || str.equals("RIFF")) {
                    String str2 = new String(sequentialReader.getBytes(4));
                    if (int32 < 4) {
                        riffHandler.addError("Chunk size too small.");
                    } else if (riffHandler.shouldAcceptList(str2)) {
                        processChunks(sequentialReader, int32 - 4, riffHandler);
                    } else {
                        sequentialReader.skip(int32 - 4);
                    }
                } else if (!str.equals(AviDirectory.CHUNK_DATETIME_ORIGINAL)) {
                    if (riffHandler.shouldAcceptChunk(str)) {
                        riffHandler.processChunk(str, sequentialReader.getBytes(int32));
                    } else {
                        sequentialReader.skip(int32);
                    }
                    if ((-1) - (((-1) - int32) | ((-1) - 1)) == 1) {
                        sequentialReader.skip(1L);
                    }
                } else if (int32 < 2) {
                    riffHandler.addError("Chunk size too small.");
                } else {
                    riffHandler.processChunk(str, sequentialReader.getBytes(int32 - 2));
                    sequentialReader.skip(2L);
                }
            } catch (IOException e2) {
                riffHandler.addError(e2.getMessage());
                return;
            }
        }
    }

    public void processRiff(SequentialReader sequentialReader, RiffHandler riffHandler) throws RiffProcessingException, IOException {
        sequentialReader.setMotorolaByteOrder(false);
        String string = sequentialReader.getString(4);
        if (!string.equals("RIFF")) {
            throw new RiffProcessingException("Invalid RIFF header: " + string);
        }
        int int32 = sequentialReader.getInt32() - 4;
        if (riffHandler.shouldAcceptRiffIdentifier(sequentialReader.getString(4))) {
            processChunks(sequentialReader, int32, riffHandler);
        }
    }
}
