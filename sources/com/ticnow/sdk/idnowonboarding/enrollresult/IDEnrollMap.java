package com.ticnow.sdk.idnowonboarding.enrollresult;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepReview;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007njO0Le^.ZS0\u0013\u0002ڔd$\n#2FтY\u001a\f\"QS\\v\u007fnx\\[[\u001d\u0007.x\u0019. ǈ\u0005ٕ\u0016\u001b:ԏ\bA9P}AYbz;\u0013&\u0003JF\u0001\u001d\u0011*,X\u0010%\u0004qSt\u0018@B\u0001:\u0001\u0016,\u000fpŎ2̧$\r&ձ\u007fP<SziZ1)\u0010wPĠ+o"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#})Dw\u001d5ZCI{;-^L@\u0019\u0010p6U}\u000fCW$", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "5d]2e(EA\u0017\t\bb5~", "", "5dc\u0014X5>`\u0015\u0006h\\6\n\r8g", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0014X5>`\u0015\u0006h\\6\n\r8g", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "AsT=G9:W ", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012P,_z'Y\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc g,IB&z~e", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc g,IB&z~e", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "Bn9@b5", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDEnrollMap implements Serializable {
    private String generalScoring = "";
    public ArrayList<IDStepReview> stepTrail;

    public final String getGeneralScoring() {
        return this.generalScoring;
    }

    public final ArrayList<IDStepReview> getStepTrail() {
        ArrayList<IDStepReview> arrayList = this.stepTrail;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepTrail");
        }
        return arrayList;
    }

    public final void setGeneralScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.generalScoring = str;
    }

    public final void setStepTrail(ArrayList<IDStepReview> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.stepTrail = arrayList;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
