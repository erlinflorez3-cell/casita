package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public apparatus() {
        super(civilian.DEFAULT_INSTANCE);
    }

    public final apparatus a() {
        copyOnWrite();
        civilian civilianVar = (civilian) this.instance;
        civilianVar.getClass();
        int i2 = civilianVar.bitField0_;
        civilianVar.bitField0_ = (i2 + 1) - (i2 & 1);
        civilianVar.key_ = "taskAffinity";
        return this;
    }

    public final apparatus a(String str) {
        copyOnWrite();
        civilian civilianVar = (civilian) this.instance;
        civilianVar.getClass();
        str.getClass();
        civilianVar.bitField0_ = (-1) - (((-1) - civilianVar.bitField0_) & ((-1) - 2));
        civilianVar.value_ = str;
        return this;
    }
}
