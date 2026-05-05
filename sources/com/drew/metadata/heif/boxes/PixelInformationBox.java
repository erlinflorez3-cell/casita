package com.drew.metadata.heif.boxes;

import com.drew.lang.SequentialReader;
import com.drew.metadata.heif.HeifDirectory;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class PixelInformationBox extends FullBox {
    int[] channels;
    int numChannels;

    public PixelInformationBox(SequentialReader sequentialReader, Box box) throws IOException {
        super(sequentialReader, box);
        int uInt8 = sequentialReader.getUInt8();
        this.numChannels = uInt8;
        this.channels = new int[uInt8];
        int i2 = 0;
        while (true) {
            int[] iArr = this.channels;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = sequentialReader.getUInt8();
            i2++;
        }
    }

    public void addMetadata(HeifDirectory heifDirectory) {
        if (heifDirectory.containsTag(7)) {
            return;
        }
        heifDirectory.setIntArray(7, this.channels);
    }
}
