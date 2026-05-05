package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class profile extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public profile() {
        super(stain.DEFAULT_INSTANCE);
    }

    public final profile a(ArrayList arrayList) {
        copyOnWrite();
        ((stain) this.instance).a(arrayList);
        return this;
    }

    public final profile a(guilt guiltVar) {
        copyOnWrite();
        stain stainVar = (stain) this.instance;
        stainVar.getClass();
        stainVar.reason_ = guiltVar.f28489a;
        stainVar.bitField0_ |= 1;
        return this;
    }

    public final profile a(proposal proposalVar) {
        copyOnWrite();
        stain stainVar = (stain) this.instance;
        stainVar.getClass();
        proposalVar.getClass();
        stainVar.a();
        stainVar.app_.add(proposalVar);
        return this;
    }
}
