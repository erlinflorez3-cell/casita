package com.drew.metadata.mov.metadata;

import com.drew.imaging.quicktime.QuickTimeHandler;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.QuickTimeMetadataHandler;
import com.drew.metadata.mov.atoms.Atom;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeDirectoryHandler extends QuickTimeMetadataHandler {
    private String currentData;

    public QuickTimeDirectoryHandler(Metadata metadata) {
        super(metadata);
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected QuickTimeHandler<?> processAtom(Atom atom, byte[] bArr, QuickTimeContext quickTimeContext) throws IOException {
        if (bArr != null) {
            SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
            if (!atom.type.equals("data") || this.currentData == null) {
                this.currentData = new String(sequentialByteArrayReader.getBytes(4));
            } else {
                processData(bArr, sequentialByteArrayReader);
            }
        } else if (QuickTimeMetadataDirectory._tagIntegerMap.containsKey(atom.type)) {
            this.currentData = atom.type;
        } else {
            this.currentData = null;
        }
        return this;
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler
    protected void processData(byte[] bArr, SequentialByteArrayReader sequentialByteArrayReader) throws IOException {
        sequentialByteArrayReader.skip(8L);
        String str = new String(sequentialByteArrayReader.getBytes(bArr.length - 8));
        Integer num = QuickTimeMetadataDirectory._tagIntegerMap.get(this.currentData);
        if (num != null) {
            this.directory.setString(num.intValue(), str);
        }
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler
    protected void processKeys(SequentialByteArrayReader sequentialByteArrayReader) throws IOException {
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected boolean shouldAcceptAtom(Atom atom) {
        return atom.type.equals("data");
    }

    @Override // com.drew.metadata.mov.QuickTimeMetadataHandler, com.drew.imaging.quicktime.QuickTimeHandler
    protected boolean shouldAcceptContainer(Atom atom) {
        return QuickTimeMetadataDirectory._tagIntegerMap.containsKey(atom.type) || atom.type.equals("ilst");
    }
}
