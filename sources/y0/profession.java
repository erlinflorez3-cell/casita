package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class profession extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public profession() {
        super(wage.DEFAULT_INSTANCE);
    }

    public final profession a(boolean z2) {
        copyOnWrite();
        wage wageVar = (wage) this.instance;
        int i2 = wageVar.bitField0_;
        wageVar.bitField0_ = (i2 + 1) - (i2 & 1);
        wageVar.isRooted_ = z2;
        return this;
    }
}
