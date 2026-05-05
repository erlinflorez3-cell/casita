package com.ticnow.sdk.idnowsecurity.http.nodes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u000e\u0007nj?]Z͜x.\u0001Rj\u0012ө\u007f42[t\nQ<m\u001a,$_ѮZ˗kzRҙ#E\u0015\t$|\u000b.OZ\u0007cb'@I\b?aOFސEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014c\u001a\u001cH@\u001fE)ҏyŋ\u001e\u001e\u000ē8\u0003$hu[VJrkH>s\u001bwRf'\u000e2Sո\u0019ТX3\u0015Ǹy 1QE95'Y\u0015\u0015X,W\u0011R\n=3j}ݗ7ʁwc>ݙ\u0018\u0016\u001b?]\u0011}t,q\u0013W1$5AgcyRdߑ\u0004ߡ\u007f\u0019Dǉ&\b-_<1:h\u000e&AzCkNi\u001a^p\u0002QʯBа)\f;ٿQ\u001dlko?9P=\u0017\u0013\u0013n;\u000f\u000b9[\u0003\u00107ڄ'ƻ{]9҅X?Nk\u0018]]o\n\u000fp\bz\u001c>f\u0018/*\u0013\u0005ϖ1ھ_E+ܩ\u0004\u0004Nduz%bntwX\u0019X0\u0011.7X\u000bbɵP\u0081\twXӹp.\u0017p*X'\u007f\u000e7.bHT/J(N}j@қYύ\u000e17ωO[t\u0012\u001c[Y`9\\_i`y`\u001f,?jd[֡r͞W\u0018b٢@$8qx\u0014\u0018}Jx\u001a\u0019\u0003W\u007fGL,_\u001b3ðTҴ\"NIґ!a`\u0015\u001e\u0003t5*0w*E!\u000f~tp\u001eiO̩8ʬd.5ۋi7\u001fUc&\t6\u0003S\u0015\u0005D\u0018U\u0019dGznl߶aދ$\"\"ߙi1CE\u001d\u0003I4\b`SRC}_\u0002*')~PҿGÿ2s\u0010ξ\t.f XSt\u0019(-lxs r7\u0012at|\u001eϑ`ߏ_JQͿ\u001b[B\u0007F\u0001%!$^\u000fuݛ\u0001o"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh\u0018\u0007d0Wz6KVW\u0002", "", "u(E", "0k^0^\u000b>d\u001d|z", "", "5dc\u000f_6<Yw~\fb*|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000f_6<Yw~\fb*|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2dU6a0MW#\bcZ4|", "5dc\u0011X-B\\\u001d\u000e~h5e\u00057e", "Adc\u0011X-B\\\u001d\u000e~h5e\u00057e", "2dU6a0MW#\blh9\u0003\n6o\u0012", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "5dc\u0011X-B\\\u001d\u000e~h5n\u0013<k\u0001/\u0006R", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}}\u001euk@\u000eN(]y|", "Adc\u0011X-B\\\u001d\u000e~h5n\u0013<k\u0001/\u0006R", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0014'\"rh@q_;QLj8", "2dU6a0MW#\blh9\u0003\n6o\u0012\fz", "5dc\u0011X-B\\\u001d\u000e~h5n\u0013<k\u0001/\u0006Rd\u0016", "Adc\u0011X-B\\\u001d\u000e~h5n\u0013<k\u0001/\u0006Rd\u0016", "3ma<_3\u001dS\u001a\u0003\u0004b;\u0001\u00138I\t6\u000bD\u0010'&Ky\u0017", "5dc\u0012a9HZ ]z_0\u0006\r>i\n1_I\u000f&\u001bV\u007f\u001d@\u0001.", "Adc\u0012a9HZ ]z_0\u0006\r>i\n1_I\u000f&\u001bV\u007f\u001d@\u0001.", "3ma<_3FS\"\u000eir7|", "5dc\u0012a9HZ \u0007zg;k\u001d:e", "Adc\u0012a9HZ \u0007zg;k\u001d:e", "7c", "5dc\u0016W", "Adc\u0016W", ";h] V6KS", "5dc\u001a\\5,Q#\fz", "Adc\u001a\\5,Q#\fz", ";t[A\\\u000b>d\u001d|z", "5dc\u001ah3MWw~\fb*|", "Adc\u001ah3MWw~\fb*|", "<nc6Y@\u001e\\&\t\u0002e", "5dc\u001bb;BT-^\u0004k6\u0004\u0010", "Adc\u001bb;BT-^\u0004k6\u0004\u0010", "<nc6Y@&S'\rv`,", "5dc\u001bb;BT-fzl:x\u000b/", "Adc\u001bb;BT-fzl:x\u000b/", "<nc6Y@(Yx\b\bh3\u0004", "5dc\u001bb;BT-h\u0001>5\n\u00136l", "Adc\u001bb;BT-h\u0001>5\n\u00136l", ">nbAH:>`v\fzZ;\u0001\u00138", "5dc\u001db:MC'~\b<9|\u0005>i\n1", "Adc\u001db:MC'~\b<9|\u0005>i\n1", "?tX0^\fG`#\u0006\u0002f,\u0006\u0018", "5dc\u001eh0<Yx\b\bh3\u0004\u0011/n\u000f", "Adc\u001eh0<Yx\b\bh3\u0004\u0011/n\u000f", "AdV:X5\"R", "5dc X.FS\"by", "Adc X.FS\"by", "Bh\\2b<M", "5dc!\\4>])\u000e", "Adc!\\4>])\u000e", "CrT?69>O(\u0003\u0005g", "5dc\"f,K1&~vm0\u0007\u0012", "Adc\"f,K1&~vm0\u0007\u0012", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class EnrollDefinition {
    public EnrollPath definitionWorkflow;
    private String blockDevice = "";
    private String definitionName = "";
    private String enrollmentType = "";
    private String id = "";
    private String minScore = "";
    private String multiDevice = "";
    private String notifyEnroll = "";
    private String notifyMessage = "";
    private String postUserCreation = "";
    private String quickEnrollment = "";
    private String timeout = "";
    private String userCreation = "";
    private String enrollDefinitionInstitution = "";
    private String segmenId = "";
    private String notifyOkEnroll = "";
    private String definitionWorkflowId = "";

    public final String getBlockDevice() {
        return this.blockDevice;
    }

    public final String getDefinitionName() {
        return this.definitionName;
    }

    public final EnrollPath getDefinitionWorkflow() {
        EnrollPath enrollPath = this.definitionWorkflow;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("definitionWorkflow");
        }
        return enrollPath;
    }

    public final String getDefinitionWorkflowId() {
        return this.definitionWorkflowId;
    }

    public final String getEnrollDefinitionInstitution() {
        return this.enrollDefinitionInstitution;
    }

    public final String getEnrollmentType() {
        return this.enrollmentType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMinScore() {
        return this.minScore;
    }

    public final String getMultiDevice() {
        return this.multiDevice;
    }

    public final String getNotifyEnroll() {
        return this.notifyEnroll;
    }

    public final String getNotifyMessage() {
        return this.notifyMessage;
    }

    public final String getNotifyOkEnroll() {
        return this.notifyOkEnroll;
    }

    public final String getPostUserCreation() {
        return this.postUserCreation;
    }

    public final String getQuickEnrollment() {
        return this.quickEnrollment;
    }

    public final String getSegmenId() {
        return this.segmenId;
    }

    public final String getTimeout() {
        return this.timeout;
    }

    public final String getUserCreation() {
        return this.userCreation;
    }

    public final void setBlockDevice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.blockDevice = str;
    }

    public final void setDefinitionName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.definitionName = str;
    }

    public final void setDefinitionWorkflow(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.definitionWorkflow = enrollPath;
    }

    public final void setDefinitionWorkflowId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.definitionWorkflowId = str;
    }

    public final void setEnrollDefinitionInstitution(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enrollDefinitionInstitution = str;
    }

    public final void setEnrollmentType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enrollmentType = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setMinScore(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minScore = str;
    }

    public final void setMultiDevice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.multiDevice = str;
    }

    public final void setNotifyEnroll(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.notifyEnroll = str;
    }

    public final void setNotifyMessage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.notifyMessage = str;
    }

    public final void setNotifyOkEnroll(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.notifyOkEnroll = str;
    }

    public final void setPostUserCreation(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.postUserCreation = str;
    }

    public final void setQuickEnrollment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.quickEnrollment = str;
    }

    public final void setSegmenId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.segmenId = str;
    }

    public final void setTimeout(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.timeout = str;
    }

    public final void setUserCreation(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userCreation = str;
    }
}
