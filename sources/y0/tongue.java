package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final tongue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PACKAGENAME_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String permission_ = "";
    private String name_ = "";
    private String packageName_ = "";

    static {
        tongue tongueVar = new tongue();
        DEFAULT_INSTANCE = tongueVar;
        GeneratedMessageLite.registerDefaultInstance(tongue.class, tongueVar);
    }

    public static superior a() {
        return (superior) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new tongue();
            case 2:
                return new superior();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "permission_", "name_", "packageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (tongue.class) {
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
