package com.drew.metadata.mov.metadata;

import com.drew.imaging.quicktime.QuickTimeHandler;
import com.drew.lang.ByteUtil;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeMetadataHandler;
import com.drew.metadata.mov.atoms.Atom;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeDataHandler extends QuickTimeMetadataHandler {
    private int currentIndex;
    private ArrayList<String> keys;

    public QuickTimeDataHandler(Metadata metadata) {
        super(metadata);
        this.currentIndex = 0;
        this.keys = new ArrayList<>();
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected QuickTimeHandler<?> processAtom(Atom atom, byte[] bArr, QuickTimeContext quickTimeContext) throws IOException {
        if (bArr != null) {
            SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
            if (atom.type.equals("keys")) {
                processKeys(sequentialByteArrayReader);
            } else if (atom.type.equals("data")) {
                processData(bArr, sequentialByteArrayReader);
            }
        } else {
            int int32 = ByteUtil.getInt32(atom.type.getBytes(), 0, true);
            if (int32 > 0 && int32 < this.keys.size() + 1) {
                this.currentIndex = int32 - 1;
            }
        }
        return this;
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler
    protected void processData(byte[] bArr, SequentialByteArrayReader sequentialByteArrayReader) throws IOException {
        if (this.currentIndex >= this.keys.size()) {
            return;
        }
        int int32 = sequentialByteArrayReader.getInt32();
        sequentialByteArrayReader.skip(4L);
        Integer num = QuickTimeMetadataDirectory._tagIntegerMap.get(this.keys.get(this.currentIndex));
        if (num != null) {
            int length = bArr.length - 8;
            if (int32 == 1) {
                this.directory.setString(num.intValue(), sequentialByteArrayReader.getString(length, "UTF-8"));
                return;
            }
            if (int32 != 27) {
                if (int32 == 30) {
                    int i2 = length / 4;
                    int[] iArr = new int[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        iArr[i3] = sequentialByteArrayReader.getInt32();
                    }
                    this.directory.setIntArray(num.intValue(), iArr);
                    return;
                }
                if (int32 != 13 && int32 != 14) {
                    if (int32 != 22) {
                        if (int32 != 23) {
                            return;
                        }
                        this.directory.setFloat(num.intValue(), sequentialByteArrayReader.getFloat32());
                        return;
                    } else {
                        byte[] bArr2 = new byte[4];
                        sequentialByteArrayReader.getBytes(bArr2, 4 - length, length);
                        this.directory.setInt(num.intValue(), new SequentialByteArrayReader(bArr2).getInt32());
                        return;
                    }
                }
            }
            this.directory.setByteArray(num.intValue(), sequentialByteArrayReader.getBytes(length));
        }
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler
    protected void processKeys(SequentialByteArrayReader sequentialByteArrayReader) throws IOException {
        sequentialByteArrayReader.skip(4L);
        int int32 = sequentialByteArrayReader.getInt32();
        for (int i2 = 0; i2 < int32; i2++) {
            int int322 = sequentialByteArrayReader.getInt32();
            if (int322 < 8) {
                this.directory.addError("Key size too small: " + int322);
                return;
            }
            sequentialByteArrayReader.skip(4L);
            this.keys.add(sequentialByteArrayReader.getString(int322 - 8, "UTF-8"));
        }
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected boolean shouldAcceptAtom(Atom atom) {
        return atom.type.equals("hdlr") || atom.type.equals("keys") || atom.type.equals("data");
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected boolean shouldAcceptContainer(Atom atom) {
        return atom.type.equals("ilst") || ByteUtil.getInt32(atom.type.getBytes(), 0, true) <= this.keys.size();
    }
}
