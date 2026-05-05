package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class colorful extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public colorful() {
        super(constitutional.DEFAULT_INSTANCE);
    }

    public final colorful a(String str) {
        copyOnWrite();
        constitutional constitutionalVar = (constitutional) this.instance;
        constitutionalVar.getClass();
        str.getClass();
        constitutionalVar.bitField0_ |= 4;
        constitutionalVar.iccid_ = str;
        return this;
    }

    public final colorful b(String str) {
        copyOnWrite();
        constitutional constitutionalVar = (constitutional) this.instance;
        constitutionalVar.getClass();
        str.getClass();
        int i2 = constitutionalVar.bitField0_;
        constitutionalVar.bitField0_ = (i2 + 1) - (i2 & 1);
        constitutionalVar.imei_ = str;
        return this;
    }

    public final colorful c(String str) {
        copyOnWrite();
        constitutional constitutionalVar = (constitutional) this.instance;
        constitutionalVar.getClass();
        str.getClass();
        int i2 = constitutionalVar.bitField0_;
        constitutionalVar.bitField0_ = (i2 + 2) - (i2 & 2);
        constitutionalVar.imsi_ = str;
        return this;
    }

    public final colorful d(String str) {
        copyOnWrite();
        constitutional constitutionalVar = (constitutional) this.instance;
        constitutionalVar.getClass();
        str.getClass();
        constitutionalVar.bitField0_ |= 8;
        constitutionalVar.mac_ = str;
        return this;
    }
}
