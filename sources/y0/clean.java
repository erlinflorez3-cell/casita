package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class clean extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final clean DEFAULT_INSTANCE;
    public static final int GEOLOCATION_FIELD_NUMBER = 3;
    public static final int HUMANDETECTION_FIELD_NUMBER = 2;
    public static final int ONCALL_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private card geolocation_;
    private remedy humanDetection_;
    private personality onCall_;

    static {
        clean cleanVar = new clean();
        DEFAULT_INSTANCE = cleanVar;
        GeneratedMessageLite.registerDefaultInstance(clean.class, cleanVar);
    }

    public static cooperative a() {
        return (cooperative) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new clean();
            case 2:
                return new cooperative();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "onCall_", "humanDetection_", "geolocation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (clean.class) {
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
