package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class constitutional extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final constitutional DEFAULT_INSTANCE;
    public static final int ICCID_FIELD_NUMBER = 3;
    public static final int IMEI_FIELD_NUMBER = 1;
    public static final int IMSI_FIELD_NUMBER = 2;
    public static final int MAC_FIELD_NUMBER = 4;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private String imei_ = "";
    private String imsi_ = "";
    private String iccid_ = "";
    private String mac_ = "";

    static {
        constitutional constitutionalVar = new constitutional();
        DEFAULT_INSTANCE = constitutionalVar;
        GeneratedMessageLite.registerDefaultInstance(constitutional.class, constitutionalVar);
    }

    public static colorful a() {
        return (colorful) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new constitutional();
            case 2:
                return new colorful();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "imei_", "imsi_", "iccid_", "mac_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (constitutional.class) {
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
