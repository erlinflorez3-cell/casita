package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final misplace DEFAULT_INSTANCE;
    public static final int PACKAGENAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private String packageName_ = "";

    static {
        misplace misplaceVar = new misplace();
        DEFAULT_INSTANCE = misplaceVar;
        GeneratedMessageLite.registerDefaultInstance(misplace.class, misplaceVar);
    }

    public static taste a() {
        return (taste) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new misplace();
            case 2:
                return new taste();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "packageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (misplace.class) {
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
