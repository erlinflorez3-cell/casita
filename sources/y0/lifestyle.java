package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class lifestyle extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BIDHEADER_FIELD_NUMBER = 18;
    private static final lifestyle DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 17;
    public static final int HOSTNAMEHEADER_FIELD_NUMBER = 21;
    public static final int PARENTIDHEADER_FIELD_NUMBER = 20;
    private static volatile Parser PARSER = null;
    public static final int SIDHEADER_FIELD_NUMBER = 19;
    private int bitField0_;
    private boolean enabled_;
    private String bidHeader_ = "";
    private String sidHeader_ = "";
    private String parentIdHeader_ = "";
    private String hostnameHeader_ = "";

    static {
        lifestyle lifestyleVar = new lifestyle();
        DEFAULT_INSTANCE = lifestyleVar;
        GeneratedMessageLite.registerDefaultInstance(lifestyle.class, lifestyleVar);
    }

    public static lifestyle a(byte[] bArr) {
        return (lifestyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final boolean a() {
        return this.enabled_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new lifestyle();
            case 2:
                return new wrap();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0011\u0015\u0005\u0000\u0000\u0000\u0011ဇ\u0000\u0012ဈ\u0001\u0013ဈ\u0002\u0014ဈ\u0003\u0015ဈ\u0004", new Object[]{"bitField0_", "enabled_", "bidHeader_", "sidHeader_", "parentIdHeader_", "hostnameHeader_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (lifestyle.class) {
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
