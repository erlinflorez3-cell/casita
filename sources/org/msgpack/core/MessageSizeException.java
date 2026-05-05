package org.msgpack.core;

/* JADX INFO: loaded from: classes2.dex */
public class MessageSizeException extends MessagePackException {
    private final long size;

    public MessageSizeException(long j2) {
        this.size = j2;
    }

    public MessageSizeException(String str, long j2) {
        super(str);
        this.size = j2;
    }

    public long getSize() {
        return this.size;
    }
}
