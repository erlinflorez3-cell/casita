package com.drew.imaging.riff;

/* JADX INFO: loaded from: classes3.dex */
public interface RiffHandler {
    void addError(String str);

    void processChunk(String str, byte[] bArr);

    boolean shouldAcceptChunk(String str);

    boolean shouldAcceptList(String str);

    boolean shouldAcceptRiffIdentifier(String str);
}
