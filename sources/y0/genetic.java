package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class genetic extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public genetic() {
        super(card.DEFAULT_INSTANCE);
    }

    public final void a(double d2) {
        copyOnWrite();
        card cardVar = (card) this.instance;
        cardVar.bitField0_ = (-1) - (((-1) - cardVar.bitField0_) & ((-1) - 1));
        cardVar.latitude_ = d2;
    }

    public final void a(boolean z2) {
        copyOnWrite();
        card cardVar = (card) this.instance;
        int i2 = cardVar.bitField0_;
        cardVar.bitField0_ = (i2 + 4) - (i2 & 4);
        cardVar.isMock_ = z2;
    }

    public final void b(double d2) {
        copyOnWrite();
        card cardVar = (card) this.instance;
        cardVar.bitField0_ |= 2;
        cardVar.longitude_ = d2;
    }
}
