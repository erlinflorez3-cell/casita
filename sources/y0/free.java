package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class free extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALTITUDE_FIELD_NUMBER = 3;
    private static final free DEFAULT_INSTANCE;
    public static final int ISMOCK_FIELD_NUMBER = 4;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    private double altitude_;
    private int bitField0_;
    private boolean isMock_;
    private double latitude_;
    private double longitude_;

    static {
        free freeVar = new free();
        DEFAULT_INSTANCE = freeVar;
        GeneratedMessageLite.registerDefaultInstance(free.class, freeVar);
    }

    public static reporter a() {
        return (reporter) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new free();
            case 2:
                return new reporter();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "latitude_", "longitude_", "altitude_", "isMock_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (free.class) {
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
