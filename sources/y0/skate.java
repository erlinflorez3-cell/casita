package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class skate extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public skate() {
        super(sea.DEFAULT_INSTANCE);
    }

    public final skate a(String str) {
        copyOnWrite();
        sea seaVar = (sea) this.instance;
        seaVar.getClass();
        str.getClass();
        int i2 = seaVar.bitField0_;
        seaVar.bitField0_ = (i2 + 2) - (i2 & 2);
        seaVar.name_ = str;
        return this;
    }

    public final skate b(String str) {
        copyOnWrite();
        sea seaVar = (sea) this.instance;
        seaVar.getClass();
        seaVar.bitField0_ |= 4;
        seaVar.packageName_ = str;
        return this;
    }

    public final skate c(String str) {
        copyOnWrite();
        sea seaVar = (sea) this.instance;
        seaVar.getClass();
        seaVar.bitField0_ = (-1) - (((-1) - seaVar.bitField0_) & ((-1) - 1));
        seaVar.permission_ = str;
        return this;
    }
}
