package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public superior() {
        super(tongue.DEFAULT_INSTANCE);
    }

    public final superior a(String str) {
        copyOnWrite();
        tongue tongueVar = (tongue) this.instance;
        tongueVar.getClass();
        str.getClass();
        tongueVar.bitField0_ = (-1) - (((-1) - tongueVar.bitField0_) & ((-1) - 2));
        tongueVar.name_ = str;
        return this;
    }

    public final superior b(String str) {
        copyOnWrite();
        tongue tongueVar = (tongue) this.instance;
        tongueVar.getClass();
        tongueVar.bitField0_ |= 4;
        tongueVar.packageName_ = str;
        return this;
    }

    public final superior c(String str) {
        copyOnWrite();
        tongue tongueVar = (tongue) this.instance;
        tongueVar.getClass();
        int i2 = tongueVar.bitField0_;
        tongueVar.bitField0_ = (i2 + 1) - (i2 & 1);
        tongueVar.permission_ = str;
        return this;
    }
}
