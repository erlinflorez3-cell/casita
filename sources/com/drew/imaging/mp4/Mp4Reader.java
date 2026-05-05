package com.drew.imaging.mp4;

import com.drew.lang.StreamReader;
import com.drew.metadata.mp4.Mp4Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4Reader {
    private Mp4Reader() {
    }

    public static void extract(InputStream inputStream, Mp4Handler<?> mp4Handler) {
        StreamReader streamReader = new StreamReader(inputStream);
        streamReader.setMotorolaByteOrder(true);
        processBoxes(streamReader, -1L, mp4Handler, new Mp4Context());
    }

    private static void processBoxes(StreamReader streamReader, long j2, Mp4Handler<?> mp4Handler, Mp4Context mp4Context) {
        Mp4Handler<?> mp4HandlerProcessBox = mp4Handler;
        while (true) {
            if (j2 != -1) {
                try {
                    if (streamReader.getPosition() >= j2) {
                        return;
                    }
                } catch (IOException e2) {
                    mp4HandlerProcessBox.addError(e2.getMessage());
                    return;
                }
            }
            long uInt32 = streamReader.getUInt32();
            String string = streamReader.getString(4);
            boolean z2 = uInt32 == 1;
            if (z2) {
                uInt32 = streamReader.getInt64();
            }
            if (uInt32 > 2147483647L) {
                mp4HandlerProcessBox.addError("Box size too large.");
                return;
            }
            if (uInt32 < 8) {
                mp4HandlerProcessBox.addError("Box size too small.");
                return;
            }
            if (mp4HandlerProcessBox.shouldAcceptContainer(string)) {
                processBoxes(streamReader, (streamReader.getPosition() + uInt32) - 8, mp4HandlerProcessBox.processContainer(string, uInt32, mp4Context), mp4Context);
            } else if (mp4HandlerProcessBox.shouldAcceptBox(string)) {
                mp4HandlerProcessBox = mp4HandlerProcessBox.processBox(string, streamReader.getBytes(((int) uInt32) - 8), uInt32, mp4Context);
            } else if (!z2) {
                streamReader.skip(uInt32 - 8);
            } else if (uInt32 < 16) {
                return;
            } else {
                streamReader.skip(uInt32 - 16);
            }
        }
    }
}
