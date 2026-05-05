package com.ticnow.sdk.idnowsecurity.http.nodes;

import com.google.gson.Gson;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005T4\u0012\u000e\u0007nj?3LeV7ZS0\u000f\u0002ڔd$\n#2FтY\u001a\f\"QS\\$\u007fnx\u0018SG\u001dD.x\u0019.\u001am\u0007^*\u000f`DFЇ?ޜsIAś\r8\u000b#@&X{\u000b\u0006(0\u0019(\u0005\u0002[K:\u0014\u0007ϒ|ĐV\u0019UĨ2\u0014\fF.\u0005>^mWDN=uH9;\u0003\u0018D%ϒk݁\u0001Y\u0015Ͽl)\u0013\u0002o\"KB=A#+$\u001b\u0015_s?1AHܼ\u0011ص+33ɞ\fY<f\u000e\u00185-U\u001ckxvt\u0013ax\fU˃&ұwח\u00124\u007f\u07be\u0014\u000fB\u0015\u001c\u0018GJ4@(zX&A\n\u000bSnRXސNȸ~m>Ѝ=\u00029AG\u001f\u0007SgR'T\b\u0014\u0013%6#/͙wƃ\u0001\u05f8d!#Ƙ\u0010S7jNOhP\u0010sK\u0002T\tp\u001dB\u0004^IV\u0082\b 2#-ڛs;)=y\u0006hFm\u0014\u0013f9kwp`@Pplպ6Á\u0010fLߟ\u001dmVsf01O\"t\u0015\u0004X+.}\u0010<O'fʡ[ŹmvUΪ\"'5\tE]\u000fm\u0014zGd\u0004M_\b(a\u0001xj̺HИ\tdn̻k\u000e`\u00026&RJp6\u0006\u0002\u0015f\u001a:J? \u001e\u000bπ=Ǭ`!Pґ6DG%\u0017czj\u0016(b9t\u001bwN\r\t/R3ʠ{ς|U4ʉx$3l_99([Nv:M;\u0015,\f\u007fui#܈X̡\u001a\u0002]ݨ8\u0018 g_3]\u0015\u0015.78RES|\u000be\u007fOh\u0604\u0007܃}\u001bCÜFi\u000e\u001c~0\u0001lP\u0002b\u001dr\u000fl&;\b\u0013рPӚrیKo\\ެs@O'\u0011k\\P>2\u00133n=\u000f&:|cd\u001aڶIə{ 7֒y_o(<3\u0003\u0011,/s?УgU"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "3ma<_3\u001dS\u001a\u0003\u0004b;\u0001\u00138I~", "", "5dc\u0012a9HZ ]z_0\u0006\r>i\n1_?", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012a9HZ ]z_0\u0006\r>i\n1_?", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7c", "5dc\u0016W", "Adc\u0016W", ";`g\u001fX0Gb\u0019\b\n", "5dc\u001aT?+S\u001d\b\n^5\f", "Adc\u001aT?+S\u001d\b\n^5\f", ";h] V6KS", "5dc\u001a\\5,Q#\fz", "Adc\u001a\\5,Q#\fz", "<dgA4*MW#\b", "5dc\u001bX?M/\u0017\u000e~h5", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}}\u001euk@\u000eN(]y|", "Adc\u001bX?M/\u0017\u000e~h5", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0014'\"rh@q_;QLj8", "<dgA4*MW#\b^]", "5dc\u001bX?M/\u0017\u000e~h5`\b", "Adc\u001bX?M/\u0017\u000e~h5`\b", "=oc6b5:Z\u0007\u000ezi", "5dc\u001cc;B]\"z\u0002L;|\u0014", "Adc\u001cc;B]\"z\u0002L;|\u0014", "=oc6b5:Z\u0007\u000ezi\u0010{", "5dc\u001cc;B]\"z\u0002L;|\u0014\u0013d", "Adc\u001cc;B]\"z\u0002L;|\u0014\u0013d", ">n]1X9:b\u0019izk*|\u0012>", "5dc\u001db5=S&z\n^\u0017|\u0016-e\t7", "Adc\u001db5=S&z\n^\u0017|\u0016-e\t7", ">n]1X9:b\u0019kzl<\u0004\u0018", "5dc\u001db5=S&z\n^\u0019|\u0017?l\u000f", "Adc\u001db5=S&z\n^\u0019|\u0017?l\u000f", "@dX;g,Gb", "5dc\u001fX0Gb\u0019\b\n", "Adc\u001fX0Gb\u0019\b\n", "@d`B\\9>R", "5dc\u001fX8NW&~y", "Adc\u001fX8NW&~y", "Ab^?X", "5dc V6KS", "Adc V6KS", "AsPAh:", "5dc g(Mc'", "Adc g(Mc'", "AsT=", "5dc g,I", "Adc g,I", "AsT=B5\u001fO\u001d\u0006", "5dc g,I=\"_vb3", "Adc g,I=\"_vb3", "Bx_2", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005S4-\u0018r`\u0019\u0010p6U}|", "5dc!l7>", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}\u0006\u0015wdC\u0006C5[\u0001.N\"", "Adc!l7>", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u001c\u001e$kk8fl9X}.\u001d\u0010?", "7r=2k;\u001aQ(\u0003\u0005g\u0010\u0006\r>i{/\u007fU\u0001\u0016", "", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class EnrollPath implements Serializable {
    public EnrollPath nextAction;
    public EnrollPath optionalStep;
    public EnrollPath stepOnFail;
    public MethodEnroll type;
    private String enrollDefinitionId = "";
    private String id = "";
    private String maxReintent = "";
    private String minScore = "";
    private String nextActionId = "";
    private String optionalStepId = "";
    private String ponderatePercent = "";
    private String ponderateResult = "";
    private String reintent = "";
    private String required = "";
    private String score = "";
    private String status = "";
    private String step = "";

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath$isNextActionInitialized$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0 {
        AnonymousClass1(EnrollPath enrollPath) {
            super(enrollPath);
        }

        @Override // kotlin.reflect.KProperty0
        public Object get() {
            return ((EnrollPath) this.receiver).getNextAction();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "nextAction";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(EnrollPath.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getNextAction()Lcom/ticnow/sdk/idnowsecurity/http/nodes/EnrollPath;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(Object obj) {
            ((EnrollPath) this.receiver).setNextAction((EnrollPath) obj);
        }
    }

    public final String getEnrollDefinitionId() {
        return this.enrollDefinitionId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMaxReintent() {
        return this.maxReintent;
    }

    public final String getMinScore() {
        return this.minScore;
    }

    public final EnrollPath getNextAction() {
        EnrollPath enrollPath = this.nextAction;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextAction");
        }
        return enrollPath;
    }

    public final String getNextActionId() {
        return this.nextActionId;
    }

    public final EnrollPath getOptionalStep() {
        EnrollPath enrollPath = this.optionalStep;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionalStep");
        }
        return enrollPath;
    }

    public final String getOptionalStepId() {
        return this.optionalStepId;
    }

    public final String getPonderatePercent() {
        return this.ponderatePercent;
    }

    public final String getPonderateResult() {
        return this.ponderateResult;
    }

    public final String getReintent() {
        return this.reintent;
    }

    public final String getRequired() {
        return this.required;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStep() {
        return this.step;
    }

    public final EnrollPath getStepOnFail() {
        EnrollPath enrollPath = this.stepOnFail;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepOnFail");
        }
        return enrollPath;
    }

    public final MethodEnroll getType() {
        MethodEnroll methodEnroll = this.type;
        if (methodEnroll == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return methodEnroll;
    }

    public final boolean isNextActionInitialized() {
        return this.nextAction != null;
    }

    public final void setEnrollDefinitionId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enrollDefinitionId = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setMaxReintent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.maxReintent = str;
    }

    public final void setMinScore(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minScore = str;
    }

    public final void setNextAction(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.nextAction = enrollPath;
    }

    public final void setNextActionId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.nextActionId = str;
    }

    public final void setOptionalStep(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.optionalStep = enrollPath;
    }

    public final void setOptionalStepId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.optionalStepId = str;
    }

    public final void setPonderatePercent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ponderatePercent = str;
    }

    public final void setPonderateResult(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ponderateResult = str;
    }

    public final void setReintent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.reintent = str;
    }

    public final void setRequired(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.required = str;
    }

    public final void setScore(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.score = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.status = str;
    }

    public final void setStep(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.step = str;
    }

    public final void setStepOnFail(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.stepOnFail = enrollPath;
    }

    public final void setType(MethodEnroll methodEnroll) {
        Intrinsics.checkParameterIsNotNull(methodEnroll, "<set-?>");
        this.type = methodEnroll;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
