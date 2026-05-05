package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class personality extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final personality DEFAULT_INSTANCE;
    public static final int ONCALLSTATUS_FIELD_NUMBER = 1;
    public static final int ONCALLTYPE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private int onCallStatus_;
    private int onCallType_;

    static {
        personality personalityVar = new personality();
        DEFAULT_INSTANCE = personalityVar;
        GeneratedMessageLite.registerDefaultInstance(personality.class, personalityVar);
    }

    public static notice a() {
        return (notice) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new personality();
            case 2:
                return new notice();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "onCallStatus_", disclose.f28468a, "onCallType_", competence.f28467a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (personality.class) {
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
