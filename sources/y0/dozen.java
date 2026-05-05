package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class dozen extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public dozen() {
        super(hay.DEFAULT_INSTANCE);
    }

    public final dozen a(String str) {
        copyOnWrite();
        hay hayVar = (hay) this.instance;
        hayVar.getClass();
        str.getClass();
        hayVar.bitField0_ |= 1;
        hayVar.key_ = str;
        return this;
    }

    public final dozen b(String str) {
        copyOnWrite();
        hay hayVar = (hay) this.instance;
        hayVar.getClass();
        str.getClass();
        int i2 = hayVar.bitField0_;
        hayVar.bitField0_ = (i2 + 2) - (i2 & 2);
        hayVar.value_ = str;
        return this;
    }
}
