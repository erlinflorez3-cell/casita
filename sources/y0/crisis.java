package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class crisis extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final crisis DEFAULT_INSTANCE;
    public static final int FINGERPRINTALG_FIELD_NUMBER = 4;
    public static final int FINGERPRINT_FIELD_NUMBER = 3;
    public static final int ISSUERDN_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SUBJECTDN_FIELD_NUMBER = 1;
    private int bitField0_;
    private int fingerprintAlg_;
    private String subjectDn_ = "";
    private String issuerDn_ = "";
    private String fingerprint_ = "";

    static {
        crisis crisisVar = new crisis();
        DEFAULT_INSTANCE = crisisVar;
        GeneratedMessageLite.registerDefaultInstance(crisis.class, crisisVar);
    }

    public static muscle a() {
        return (muscle) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new crisis();
            case 2:
                return new muscle();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "subjectDn_", "issuerDn_", "fingerprint_", "fingerprintAlg_", calculation.f28466a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (crisis.class) {
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
