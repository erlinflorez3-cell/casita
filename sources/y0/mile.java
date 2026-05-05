package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class mile extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BROWSERID_FIELD_NUMBER = 1;
    public static final int CONFIG_FIELD_NUMBER = 17;
    private static final mile DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private String browserId_ = "";
    private lifestyle config_;

    static {
        mile mileVar = new mile();
        DEFAULT_INSTANCE = mileVar;
        GeneratedMessageLite.registerDefaultInstance(mile.class, mileVar);
    }

    public static mile a(byte[] bArr) {
        return (mile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final String a() {
        return this.browserId_;
    }

    public final lifestyle b() {
        lifestyle lifestyleVar = this.config_;
        return lifestyleVar == null ? lifestyle.DEFAULT_INSTANCE : lifestyleVar;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new mile();
            case 2:
                return new design();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0011\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0011ဉ\u0001", new Object[]{"bitField0_", "browserId_", "config_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (mile.class) {
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
