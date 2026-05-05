package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    RawMessageInfo(MessageLite defaultInstance, String info, Object[] objects) {
        this.defaultInstance = defaultInstance;
        this.info = info;
        this.objects = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i2 = (-1) - ((65535 - cCharAt) | ((-1) - 8191));
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = info.charAt(i4);
            if (cCharAt2 < 55296) {
                this.flags = i2 | (cCharAt2 << i3);
                return;
            }
            int i6 = ((-1) - ((65535 - cCharAt2) | ((-1) - 8191))) << i3;
            i2 = (i2 + i6) - (i2 & i6);
            i3 += 13;
            i4 = i5;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    Object[] getObjects() {
        return this.objects;
    }

    String getStringInfo() {
        return this.info;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return (-1) - (((-1) - this.flags) | ((-1) - 1)) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
