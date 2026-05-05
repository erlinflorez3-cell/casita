package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class reporter extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public reporter() {
        super(free.DEFAULT_INSTANCE);
    }

    public final reporter a() {
        copyOnWrite();
        free freeVar = (free) this.instance;
        int i2 = freeVar.bitField0_;
        freeVar.bitField0_ = (i2 + 8) - (i2 & 8);
        freeVar.isMock_ = true;
        return this;
    }

    public final reporter a(double d2) {
        copyOnWrite();
        free freeVar = (free) this.instance;
        int i2 = freeVar.bitField0_;
        freeVar.bitField0_ = (i2 + 4) - (i2 & 4);
        freeVar.altitude_ = d2;
        return this;
    }

    public final reporter b(double d2) {
        copyOnWrite();
        free freeVar = (free) this.instance;
        int i2 = freeVar.bitField0_;
        freeVar.bitField0_ = (i2 + 1) - (i2 & 1);
        freeVar.latitude_ = d2;
        return this;
    }

    public final reporter c(double d2) {
        copyOnWrite();
        free freeVar = (free) this.instance;
        freeVar.bitField0_ = (-1) - (((-1) - freeVar.bitField0_) & ((-1) - 2));
        freeVar.longitude_ = d2;
        return this;
    }
}
