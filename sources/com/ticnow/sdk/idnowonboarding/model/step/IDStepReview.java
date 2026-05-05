package com.ticnow.sdk.idnowonboarding.model.step;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.io.Serializable;
import java.util.ArrayList;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u000e\u0007njO0Le^.ZS0\u0018s{J$c$wICU(\u0007*\tUR}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u0012Y\u0007\u0005*\u000f`D@WAN\b=gbKȉ\u0011ڶ6.@ц\u001d\u0003 -V\u0014\u0017|IP\u001a\u0018\u0001X~Aj\r{\u0007pŎ\u0012̧$\r&ձ\u007fP<PzaZ1)\fwH\u001fOm:\u0015]\u001dHd';\u0003\u0010)\u0014FG7%%\u0002\u000fe_2α/ӭuI\rؒ?)1W\u0002fVZ\u0006$#< %k\u0005>\\3S7϶3˦SoSִ&*}\u000e\n\u0011\\\u0006\u0014\u001a5N~E({ \u000eavIԦLг\u0006jJȕ\u0013c<-3\u0004S-?2tW2S'fO{3&tŇ-ͼ%g\\וx\u0017!n\u0006lQSFYVkZqK\f\u001cp\u0011\u0004\u0001ʽ<Ͻ\u0004;\u0004߾F\u0019+Vi=C#q\"VJ8\u000f\u0013\u0002\u0001S\u0018t\u001f؞.å\u001aC2\u009e$\\J\b\u0013\u0010pV^Q\u001fsɥX/"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012P,_z'Y\"", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "7mc2e5:Z\u0007\u000ezi\u0015x\u0011/", "", "5dc\u0016a;>`\"z\u0002L;|\u0014\u0018a\b(", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016a;>`\"z\u0002L;|\u0014\u0018a\b(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ";dc.7(MO", "5dc\u001aX;:2\u0015\u000ev", "Adc\u001aX;:2\u0015\u000ev", ";dc.W(MO", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u001aX;:R\u0015\u000ev", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u001aX;:R\u0015\u000ev", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "Ab^?X", "5dc V6KS", "Adc V6KS", "AsT=<+", "5dc g,I7\u0018", "Adc g,I7\u0018", "AsT=>0GR", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012I0Wu|", "5dc g,I9\u001d\by", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\rIz4)^L@'\u0016c74z0F\"", "Adc g,I9\u001d\by", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017QJk?gxGOH\u0007n\u0012R\u007f&\u001d\u0010?", "AsT=A(FS", "5dc g,I<\u0015\u0007z", "Adc g,I<\u0015\u0007z", "AtR0X:L", "", "5dc h*<S'\r", "u(I", "Adc h*<S'\r", "uY\u0018#", "Bn9@b5", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDStepReview implements Serializable {
    public ArrayList<KeyValue> metadata;
    public IDStepKind stepKind;
    private boolean success;
    private String stepId = "";
    private String score = "";
    private String stepName = "";
    private String internalStepName = "";
    private String metaData = "";

    public final String getInternalStepName() {
        return this.internalStepName;
    }

    public final String getMetaData() {
        return this.metaData;
    }

    public final ArrayList<KeyValue> getMetadata() {
        ArrayList<KeyValue> arrayList = this.metadata;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metadata");
        }
        return arrayList;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final IDStepKind getStepKind() {
        IDStepKind iDStepKind = this.stepKind;
        if (iDStepKind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepKind");
        }
        return iDStepKind;
    }

    public final String getStepName() {
        return this.stepName;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setInternalStepName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.internalStepName = str;
    }

    public final void setMetaData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.metaData = str;
    }

    public final void setMetadata(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.metadata = arrayList;
    }

    public final void setScore(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.score = str;
    }

    public final void setStepId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.stepId = str;
    }

    public final void setStepKind(IDStepKind iDStepKind) {
        Intrinsics.checkParameterIsNotNull(iDStepKind, "<set-?>");
        this.stepKind = iDStepKind;
    }

    public final void setStepName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.stepName = str;
    }

    public final void setSuccess(boolean z2) {
        this.success = z2;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
