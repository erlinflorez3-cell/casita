package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class notice extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public notice() {
        super(personality.DEFAULT_INSTANCE);
    }

    public final notice a(dressing dressingVar) {
        copyOnWrite();
        personality personalityVar = (personality) this.instance;
        personalityVar.getClass();
        personalityVar.onCallType_ = dressingVar.f28472a;
        personalityVar.bitField0_ |= 2;
        return this;
    }

    public final notice a(pierce pierceVar) {
        copyOnWrite();
        personality personalityVar = (personality) this.instance;
        personalityVar.getClass();
        personalityVar.onCallStatus_ = pierceVar.f28495a;
        personalityVar.bitField0_ |= 1;
        return this;
    }
}
