package y0;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class proposal extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTIVITIES_FIELD_NUMBER = 23;
    public static final int APPATTRIBUTE_FIELD_NUMBER = 22;
    public static final int APPLICATIONHASH_FIELD_NUMBER = 10;
    public static final int APPLICATIONINFO_FIELD_NUMBER = 26;
    public static final int CERTIFICATE_FIELD_NUMBER = 5;
    public static final int DEBUG_FIELD_NUMBER = 20;
    private static final proposal DEFAULT_INSTANCE;
    public static final int DEXES_FIELD_NUMBER = 6;
    public static final int FIRSTINSTALLTIME_FIELD_NUMBER = 17;
    public static final int ICONHASH_FIELD_NUMBER = 27;
    public static final int INSTALLERPACKAGENAME_FIELD_NUMBER = 8;
    public static final int INTERNALVERSION_FIELD_NUMBER = 9;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int LASTUPDATETIME_FIELD_NUMBER = 18;
    public static final int PACKAGENAME_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 7;
    public static final int PLATFORM_FIELD_NUMBER = 19;
    public static final int RECEIVERS_FIELD_NUMBER = 24;
    public static final int SERVICES_FIELD_NUMBER = 25;
    public static final int SYSTEMAPP_FIELD_NUMBER = 21;
    public static final int VERSIONCODE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 3;
    private misplace applicationInfo_;
    private int bitField0_;
    private boolean debug_;
    private long firstInstallTime_;
    private long lastUpdateTime_;
    private boolean systemApp_;
    private int versionCode_;
    private String label_ = "";
    private String packageName_ = "";
    private String version_ = "";
    private String internalVersion_ = "";
    private Internal.ProtobufList certificate_ = GeneratedMessageLite.emptyProtobufList();
    private String applicationHash_ = "";
    private Internal.ProtobufList dexes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList permission_ = GeneratedMessageLite.emptyProtobufList();
    private String installerPackageName_ = "";
    private String platform_ = "";
    private Internal.ProtobufList appAttribute_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList activities_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList receivers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList services_ = GeneratedMessageLite.emptyProtobufList();
    private String iconHash_ = "";

    static {
        proposal proposalVar = new proposal();
        DEFAULT_INSTANCE = proposalVar;
        GeneratedMessageLite.registerDefaultInstance(proposal.class, proposalVar);
    }

    public static slide h() {
        return (slide) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a() {
        Internal.ProtobufList protobufList = this.activities_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.activities_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void a(ArrayList arrayList) {
        a();
        AbstractMessageLite.addAll(arrayList, this.activities_);
    }

    public final void a(List list) {
        c();
        AbstractMessageLite.addAll(list, this.certificate_);
    }

    public final void b() {
        Internal.ProtobufList protobufList = this.appAttribute_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.appAttribute_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void b(ArrayList arrayList) {
        b();
        AbstractMessageLite.addAll(arrayList, this.appAttribute_);
    }

    public final void c() {
        Internal.ProtobufList protobufList = this.certificate_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.certificate_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void c(ArrayList arrayList) {
        e();
        AbstractMessageLite.addAll(arrayList, this.permission_);
    }

    public final void d() {
        Internal.ProtobufList protobufList = this.dexes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dexes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void d(ArrayList arrayList) {
        f();
        AbstractMessageLite.addAll(arrayList, this.receivers_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (pair.f28491a[methodToInvoke.ordinal()]) {
            case 1:
                return new proposal();
            case 2:
                return new slide();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u001b\u0015\u0000\u0007\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005\u001a\u0006\u001b\u0007\u001b\bဈ\u0006\tဈ\u0004\nဈ\u0005\u0011ဂ\u0007\u0012ဂ\b\u0013ဈ\t\u0014ဇ\n\u0015ဇ\u000b\u0016\u001b\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\f\u001bဈ\r", new Object[]{"bitField0_", "label_", "packageName_", "version_", "versionCode_", "certificate_", "dexes_", fabricate.class, "permission_", close.class, "installerPackageName_", "internalVersion_", "applicationHash_", "firstInstallTime_", "lastUpdateTime_", "platform_", "debug_", "systemApp_", "appAttribute_", civilian.class, "activities_", tongue.class, "receivers_", tongue.class, "services_", sea.class, "applicationInfo_", "iconHash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (proposal.class) {
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

    public final void e() {
        Internal.ProtobufList protobufList = this.permission_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.permission_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void e(ArrayList arrayList) {
        g();
        AbstractMessageLite.addAll(arrayList, this.services_);
    }

    public final void f() {
        Internal.ProtobufList protobufList = this.receivers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.receivers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void g() {
        Internal.ProtobufList protobufList = this.services_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.services_ = GeneratedMessageLite.mutableCopy(protobufList);
    }
}
