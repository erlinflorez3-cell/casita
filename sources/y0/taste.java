package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public taste() {
        super(misplace.DEFAULT_INSTANCE);
    }

    public final taste a(String str) {
        copyOnWrite();
        misplace misplaceVar = (misplace) this.instance;
        misplaceVar.getClass();
        str.getClass();
        misplaceVar.bitField0_ |= 1;
        misplaceVar.packageName_ = str;
        return this;
    }
}
