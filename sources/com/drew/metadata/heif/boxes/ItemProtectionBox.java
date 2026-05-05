package com.drew.metadata.heif.boxes;

import com.drew.lang.SequentialReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ItemProtectionBox extends FullBox {
    int protectionCount;
    ArrayList<ProtectionSchemeInfoBox> protectionSchemes;

    static class ProtectionSchemeInfoBox extends Box {

        class OriginalFormatBox extends Box {
            String dataFormat;

            public OriginalFormatBox(SequentialReader sequentialReader, Box box) throws IOException {
                super(sequentialReader);
                this.dataFormat = sequentialReader.getString(4);
            }
        }

        public ProtectionSchemeInfoBox(SequentialReader sequentialReader, Box box) throws IOException {
            super(box);
        }
    }

    public ItemProtectionBox(SequentialReader sequentialReader, Box box) throws IOException {
        super(sequentialReader, box);
        this.protectionCount = sequentialReader.getUInt16();
        this.protectionSchemes = new ArrayList<>(this.protectionCount);
        for (int i2 = 1; i2 <= this.protectionCount; i2++) {
            this.protectionSchemes.add(new ProtectionSchemeInfoBox(sequentialReader, box));
        }
    }
}
