package io.cobrowse;

/* JADX INFO: loaded from: classes3.dex */
class StreamFrameMessage extends StreamMessage {
    private static final String MESSAGE_KEY = "frame";

    public StreamFrameMessage(int i2, int i3, byte[] bArr, String str) {
        super("frame");
        put("type", "Frame");
        put("id", Integer.valueOf(i3));
        put("data", bArr);
        put("display", String.valueOf(i2));
        put("mime_type", str);
    }
}
