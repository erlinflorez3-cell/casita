package y0;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class professor extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CERTS_FIELD_NUMBER = 5;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final professor DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int REQUESTUA_FIELD_NUMBER = 17;
    public static final int REQUESTURI_FIELD_NUMBER = 18;
    private int bitField0_;
    private int code_;
    private String content_ = "";
    private Internal.ProtobufList headers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList certs_ = GeneratedMessageLite.emptyProtobufList();
    private String requestUA_ = "";
    private String requestUri_ = "";

    static {
        professor professorVar = new professor();
        DEFAULT_INSTANCE = professorVar;
        GeneratedMessageLite.registerDefaultInstance(professor.class, professorVar);
    }

    public static discrimination d() {
        return (discrimination) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a() {
        Internal.ProtobufList protobufList = this.certs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.certs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void a(ArrayList arrayList) {
        a();
        AbstractMessageLite.addAll(arrayList, this.certs_);
    }

    public final void b() {
        Internal.ProtobufList protobufList = this.headers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.headers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void b(ArrayList arrayList) {
        b();
        AbstractMessageLite.addAll(arrayList, this.headers_);
    }

    public final String c() {
        return this.requestUA_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new professor();
            case 2:
                return new discrimination();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0012\u0006\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003\u001b\u0005\u001b\u0011ဈ\u0002\u0012ဈ\u0003", new Object[]{"bitField0_", "code_", "content_", "headers_", hay.class, "certs_", crisis.class, "requestUA_", "requestUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (professor.class) {
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
