package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class survey extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APPS_FIELD_NUMBER = 1;
    public static final int CHECKSUM_FIELD_NUMBER = 3;
    public static final int CREATIONTIMESTAMP_FIELD_NUMBER = 11;
    private static final survey DEFAULT_INSTANCE;
    public static final int DEVICECONTEXT_FIELD_NUMBER = 14;
    public static final int DEVICEID_FIELD_NUMBER = 2;
    public static final int HTTPREQUEST_FIELD_NUMBER = 4;
    public static final int HTTPRESPONSE_FIELD_NUMBER = 5;
    public static final int LOCATION_FIELD_NUMBER = 6;
    public static final int META_FIELD_NUMBER = 10;
    public static final int MOBILEUID_FIELD_NUMBER = 7;
    public static final int MOCKLOCATION_FIELD_NUMBER = 12;
    private static volatile Parser PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 9;
    public static final int VPN_FIELD_NUMBER = 13;
    private int bitField0_;
    private long creationTimestamp_;
    private clean deviceContext_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        survey surveyVar = new survey();
        DEFAULT_INSTANCE = surveyVar;
        GeneratedMessageLite.registerDefaultInstance(survey.class, surveyVar);
    }

    public static match d() {
        return (match) DEFAULT_INSTANCE.createBuilder();
    }

    public final professor a() {
        return this.valueCase_ == 5 ? (professor) this.value_ : professor.DEFAULT_INSTANCE;
    }

    public final boolean b() {
        return this.valueCase_ == 4;
    }

    public final boolean c() {
        return this.valueCase_ == 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new survey();
            case 2:
                return new match();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\t<\u0000\n<\u0000\u000bဂ\u0000\f<\u0000\r<\u0000\u000eဉ\u0001", new Object[]{"value_", "valueCase_", "bitField0_", stain.class, dine.class, ethics.class, miracle.class, professor.class, occupy.class, constitutional.class, wage.class, inspire.class, "creationTimestamp_", free.class, litigation.class, "deviceContext_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (survey.class) {
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
