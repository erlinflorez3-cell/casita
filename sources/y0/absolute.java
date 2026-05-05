package y0;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class absolute extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final absolute DEFAULT_INSTANCE;
    private static volatile Parser PARSER = null;
    public static final int PROBE_FIELD_NUMBER = 1;
    private Internal.ProtobufList probe_ = GeneratedMessageLite.emptyProtobufList();

    static {
        absolute absoluteVar = new absolute();
        DEFAULT_INSTANCE = absoluteVar;
        GeneratedMessageLite.registerDefaultInstance(absolute.class, absoluteVar);
    }

    public static loss c() {
        return (loss) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a() {
        Internal.ProtobufList protobufList = this.probe_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.probe_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void a(List list) {
        a();
        AbstractMessageLite.addAll(list, this.probe_);
    }

    public final Internal.ProtobufList b() {
        return this.probe_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new absolute();
            case 2:
                return new loss();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"probe_", survey.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (absolute.class) {
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
