package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class miracle extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final miracle DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 4;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String method_ = "";
    private String url_ = "";
    private String content_ = "";
    private Internal.ProtobufList headers_ = GeneratedMessageLite.emptyProtobufList();

    static {
        miracle miracleVar = new miracle();
        DEFAULT_INSTANCE = miracleVar;
        GeneratedMessageLite.registerDefaultInstance(miracle.class, miracleVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new miracle();
            case 2:
                return new deal();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"bitField0_", "method_", "url_", "content_", "headers_", hay.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (miracle.class) {
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
