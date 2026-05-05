package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class dine extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AGENTCONFIGURATION_FIELD_NUMBER = 8;
    public static final int AGENTVERSION_FIELD_NUMBER = 7;
    public static final int ALLOWSMOCKLOCATION_FIELD_NUMBER = 21;
    public static final int CORDOVA_FIELD_NUMBER = 17;
    private static final dine DEFAULT_INSTANCE;
    public static final int DEVELOPEROPTIONSENABLED_FIELD_NUMBER = 19;
    public static final int DEVICENAME_FIELD_NUMBER = 20;
    public static final int ISVIRTUAL_FIELD_NUMBER = 18;
    public static final int MANUFACTURER_FIELD_NUMBER = 4;
    public static final int MODEL_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int SECUREMETHOD_FIELD_NUMBER = 9;
    public static final int SERIAL_FIELD_NUMBER = 5;
    public static final int UUID_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 6;
    private boolean allowsMockLocation_;
    private int bitField0_;
    private boolean developerOptionsEnabled_;
    private boolean isVirtual_;
    private int secureMethod_;
    private String model_ = "";
    private String platform_ = "";
    private String uuid_ = "";
    private String manufacturer_ = "";
    private String serial_ = "";
    private String version_ = "";
    private String agentVersion_ = "";
    private String agentConfiguration_ = "";
    private String cordova_ = "";
    private String deviceName_ = "";

    static {
        dine dineVar = new dine();
        DEFAULT_INSTANCE = dineVar;
        GeneratedMessageLite.registerDefaultInstance(dine.class, dineVar);
    }

    public static fling a() {
        return (fling) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new dine();
            case 2:
                return new fling();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u0015\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t᠌\b\u0011ဈ\t\u0012ဇ\n\u0013ဇ\u000b\u0014ဈ\f\u0015ဇ\r", new Object[]{"bitField0_", "model_", "platform_", "uuid_", "manufacturer_", "serial_", "version_", "agentVersion_", "agentConfiguration_", "secureMethod_", loop.f28490a, "cordova_", "isVirtual_", "developerOptionsEnabled_", "deviceName_", "allowsMockLocation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (dine.class) {
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
