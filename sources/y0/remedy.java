package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class remedy extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final remedy DEFAULT_INSTANCE;
    public static final int HASACCELERATIONCHANGED_FIELD_NUMBER = 1;
    public static final int HASROTATIONCHANGED_FIELD_NUMBER = 2;
    public static final int HASTOUCHOCCURRED_FIELD_NUMBER = 5;
    public static final int ISDEVICECLOSETOSURFACE_FIELD_NUMBER = 4;
    public static final int ISENVIRONMENTDARK_FIELD_NUMBER = 3;
    public static final int ISTOUCHFROMUNKNOWNSOURCE_FIELD_NUMBER = 6;
    private static volatile Parser PARSER = null;
    private int bitField0_;
    private boolean hasAccelerationChanged_;
    private boolean hasRotationChanged_;
    private boolean hasTouchOccurred_;
    private boolean isDeviceCloseToSurface_;
    private boolean isEnvironmentDark_;
    private boolean isTouchFromUnknownSource_;

    static {
        remedy remedyVar = new remedy();
        DEFAULT_INSTANCE = remedyVar;
        GeneratedMessageLite.registerDefaultInstance(remedy.class, remedyVar);
    }

    public static accurate a() {
        return (accurate) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new remedy();
            case 2:
                return new accurate();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "hasAccelerationChanged_", "hasRotationChanged_", "isEnvironmentDark_", "isDeviceCloseToSurface_", "hasTouchOccurred_", "isTouchFromUnknownSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (remedy.class) {
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
