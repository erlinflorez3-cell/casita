package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class abundant extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public abundant() {
        super(close.DEFAULT_INSTANCE);
    }

    public final abundant a(String str) {
        copyOnWrite();
        close closeVar = (close) this.instance;
        closeVar.getClass();
        str.getClass();
        int i2 = closeVar.bitField0_;
        closeVar.bitField0_ = (i2 + 1) - (i2 & 1);
        closeVar.name_ = str;
        return this;
    }

    public final abundant a(boolean z2) {
        copyOnWrite();
        close closeVar = (close) this.instance;
        closeVar.bitField0_ |= 2;
        closeVar.granted_ = z2;
        return this;
    }
}
