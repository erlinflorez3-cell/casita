package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class wardrobe extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public wardrobe() {
        super(inspire.DEFAULT_INSTANCE);
    }

    public final wardrobe a(String str) {
        copyOnWrite();
        inspire inspireVar = (inspire) this.instance;
        inspireVar.getClass();
        str.getClass();
        int i2 = inspireVar.bitField0_;
        inspireVar.bitField0_ = (i2 + 1) - (i2 & 1);
        inspireVar.key_ = str;
        return this;
    }

    public final wardrobe b(String str) {
        copyOnWrite();
        inspire inspireVar = (inspire) this.instance;
        inspireVar.getClass();
        str.getClass();
        int i2 = inspireVar.bitField0_;
        inspireVar.bitField0_ = (i2 + 2) - (i2 & 2);
        inspireVar.value_ = str;
        return this;
    }
}
