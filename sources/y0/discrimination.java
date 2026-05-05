package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class discrimination extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public discrimination() {
        super(professor.DEFAULT_INSTANCE);
    }

    public final discrimination a(int i2) {
        copyOnWrite();
        professor professorVar = (professor) this.instance;
        professorVar.bitField0_ = (-1) - (((-1) - professorVar.bitField0_) & ((-1) - 1));
        professorVar.code_ = i2;
        return this;
    }

    public final discrimination a(String str) {
        copyOnWrite();
        professor professorVar = (professor) this.instance;
        professorVar.getClass();
        str.getClass();
        professorVar.bitField0_ = (-1) - (((-1) - professorVar.bitField0_) & ((-1) - 2));
        professorVar.content_ = str;
        return this;
    }

    public final discrimination a(ArrayList arrayList) {
        copyOnWrite();
        ((professor) this.instance).a(arrayList);
        return this;
    }

    public final discrimination a(hay hayVar) {
        copyOnWrite();
        professor professorVar = (professor) this.instance;
        professorVar.getClass();
        hayVar.getClass();
        professorVar.b();
        professorVar.headers_.add(hayVar);
        return this;
    }

    public final discrimination b(String str) {
        copyOnWrite();
        professor professorVar = (professor) this.instance;
        professorVar.getClass();
        professorVar.bitField0_ = (-1) - (((-1) - professorVar.bitField0_) & ((-1) - 4));
        professorVar.requestUA_ = str;
        return this;
    }

    public final discrimination b(ArrayList arrayList) {
        copyOnWrite();
        ((professor) this.instance).b(arrayList);
        return this;
    }

    public final discrimination c(String str) {
        copyOnWrite();
        professor professorVar = (professor) this.instance;
        professorVar.getClass();
        str.getClass();
        professorVar.bitField0_ |= 8;
        professorVar.requestUri_ = str;
        return this;
    }
}
