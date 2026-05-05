package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class muscle extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public muscle() {
        super(crisis.DEFAULT_INSTANCE);
    }

    public final muscle a() {
        copyOnWrite();
        crisis crisisVar = (crisis) this.instance;
        crisisVar.getClass();
        crisisVar.fingerprintAlg_ = 1;
        int i2 = crisisVar.bitField0_;
        crisisVar.bitField0_ = (i2 + 8) - (i2 & 8);
        return this;
    }

    public final muscle a(String str) {
        copyOnWrite();
        crisis crisisVar = (crisis) this.instance;
        crisisVar.getClass();
        str.getClass();
        crisisVar.bitField0_ = (-1) - (((-1) - crisisVar.bitField0_) & ((-1) - 4));
        crisisVar.fingerprint_ = str;
        return this;
    }

    public final muscle b(String str) {
        copyOnWrite();
        crisis crisisVar = (crisis) this.instance;
        crisisVar.getClass();
        str.getClass();
        int i2 = crisisVar.bitField0_;
        crisisVar.bitField0_ = (i2 + 2) - (i2 & 2);
        crisisVar.issuerDn_ = str;
        return this;
    }

    public final muscle c(String str) {
        copyOnWrite();
        crisis crisisVar = (crisis) this.instance;
        crisisVar.getClass();
        str.getClass();
        int i2 = crisisVar.bitField0_;
        crisisVar.bitField0_ = (i2 + 1) - (i2 & 1);
        crisisVar.subjectDn_ = str;
        return this;
    }
}
