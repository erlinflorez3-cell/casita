package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class gregarious extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public gregarious() {
        super(fabricate.DEFAULT_INSTANCE);
    }

    public final gregarious a(String str) {
        copyOnWrite();
        fabricate fabricateVar = (fabricate) this.instance;
        fabricateVar.getClass();
        str.getClass();
        fabricateVar.bitField0_ |= 2;
        fabricateVar.digest_ = str;
        return this;
    }

    public final gregarious b(String str) {
        copyOnWrite();
        fabricate fabricateVar = (fabricate) this.instance;
        fabricateVar.getClass();
        str.getClass();
        fabricateVar.bitField0_ |= 1;
        fabricateVar.name_ = str;
        return this;
    }
}
