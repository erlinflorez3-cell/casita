package y0;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class stain extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APP_FIELD_NUMBER = 2;
    private static final stain DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private Internal.ProtobufList app_ = GeneratedMessageLite.emptyProtobufList();
    private int bitField0_;
    private int reason_;

    static {
        stain stainVar = new stain();
        DEFAULT_INSTANCE = stainVar;
        GeneratedMessageLite.registerDefaultInstance(stain.class, stainVar);
    }

    public static profile b() {
        return (profile) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a() {
        Internal.ProtobufList protobufList = this.app_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.app_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void a(ArrayList arrayList) {
        a();
        AbstractMessageLite.addAll(arrayList, this.app_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new stain();
            case 2:
                return new profile();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"bitField0_", "reason_", blackmail.f28465a, "app_", proposal.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (stain.class) {
                    defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = defaultInstanceBasedParser;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
