package com.drew.metadata.heif.boxes;

import com.drew.lang.SequentialReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class AuxiliaryTypeProperty extends FullBox {
    int[] auxSubtype;
    String auxType;

    public AuxiliaryTypeProperty(SequentialReader sequentialReader, Box box) throws IOException {
        super(sequentialReader, box);
        this.auxType = getZeroTerminatedString(((int) box.size) - 12, sequentialReader);
    }

    private String getZeroTerminatedString(int i2, SequentialReader sequentialReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append((char) sequentialReader.getByte());
            if (sb.charAt(sb.length() - 1) == 0) {
                break;
            }
        }
        return sb.toString().trim();
    }
}
