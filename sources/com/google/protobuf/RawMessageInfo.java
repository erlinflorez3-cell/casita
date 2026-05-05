package com.google.protobuf;

/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
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
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = info.charAt(i4);
            if (cCharAt2 < 55296) {
                this.flags = (-1) - (((-1) - i2) & ((-1) - (cCharAt2 << i3)));
                return;
            }
            int i6 = ((cCharAt2 + 8191) - (cCharAt2 | 8191)) << i3;
            i2 = (i2 + i6) - (i2 & i6);
            i3 += 13;
            i4 = i5;
        }
    }

    @Override // com.google.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    Object[] getObjects() {
        return this.objects;
    }

    String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        int i2 = this.flags;
        return (-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? ProtoSyntax.PROTO2 : (-1) - (((-1) - i2) | ((-1) - 4)) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
