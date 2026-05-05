package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class cooperative extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public cooperative() {
        super(clean.DEFAULT_INSTANCE);
    }

    public final cooperative a(accurate accurateVar) {
        copyOnWrite();
        clean cleanVar = (clean) this.instance;
        remedy remedyVar = (remedy) accurateVar.build();
        cleanVar.getClass();
        remedyVar.getClass();
        cleanVar.humanDetection_ = remedyVar;
        int i2 = cleanVar.bitField0_;
        cleanVar.bitField0_ = (i2 + 2) - (i2 & 2);
        return this;
    }

    public final cooperative a(genetic geneticVar) {
        copyOnWrite();
        clean cleanVar = (clean) this.instance;
        card cardVar = (card) geneticVar.build();
        cleanVar.getClass();
        cardVar.getClass();
        cleanVar.geolocation_ = cardVar;
        int i2 = cleanVar.bitField0_;
        cleanVar.bitField0_ = (i2 + 4) - (i2 & 4);
        return this;
    }

    public final cooperative a(notice noticeVar) {
        copyOnWrite();
        clean cleanVar = (clean) this.instance;
        personality personalityVar = (personality) noticeVar.build();
        cleanVar.getClass();
        personalityVar.getClass();
        cleanVar.onCall_ = personalityVar;
        int i2 = cleanVar.bitField0_;
        cleanVar.bitField0_ = (i2 + 1) - (i2 & 1);
        return this;
    }
}
