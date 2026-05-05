package com.ticnow.sdk.idnowonboarding.model.step;

import com.google.gson.Gson;
import com.npmdavi.davinotification.Constant;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import java.io.Serializable;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0010nj?3LeV:ZS0\u0015s{J$c$wFCU0}*\tUX}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u0012Y\u0007\u0006*\u000f`P@WAN\b=gbKȉ1ڶ6.@ц\u001d\u0003 -V\u0014\u0017|IP\u001a\u0018\u0001X~Aj\r{\rpŎ\u0012̧$\r&ձ\u007fP<QzgZ1)\u000ewN\u001f?m=\u0015M;T+ܒ\u0019țe*3¨O7\u001b4a\u0013'TaP\u0011QBU\u0013{?'YQJɕBݼ\u0004 \u001dۀg\u000fc\u00074f%Sf!57 {Yf&(&\u0012RȥhǬ\u0012\u0012/ΞF/ ~\u0016'SvxmNkRvP\u001c\u0013ad4{ĵ_ڢ='nϟy=\u001flE\u001b%\u000f$C\u000f\u0010qsb0x\u0015IbNΊ=ҨDIPݐ\"[C\u0011\u0012\u0001\u0003\u00040(>YPG\n6F\u0017S?2ބ/\u074co\u000ePֳ\u007fx\u000b\u0007v]\nTNg0zޔ;S"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sQkKtr,YL", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "/bc6b5", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "5dc\u000eV;B]\"", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}}\u001euk@\u000eN(]y|", "Adc\u000eV;B]\"", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0014'\"rh@q_;QLj8", "3qa<e", "", "5dc\u0012e9H`", "u(I", "Adc\u0012e9H`", "uY\u0018#", "7mc2e5:Z\u0007\u000ezi\u0015x\u0011/", "", "5dc\u0016a;>`\"z\u0002L;|\u0014\u0018a\b(", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016a;>`\"z\u0002L;|\u0014\u0018a\b(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Ad[2V;>R", "5dc X3>Q(~y", "Adc X3>Q(~y", "AsT=7(MO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012P,_z'Y\"", "5dc g,I2\u0015\u000ev", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\rIz4)^L@'\u0016c7;v8KL`\u0002", "Adc g,I2\u0015\u000ev", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017QJk?gxGOH\u0007n\u0019N\b+G^$oM", "AsT=>0GR", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012I0Wu|", "5dc g,I9\u001d\by", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\rIz4)^L@'\u0016c74z0F\"", "Adc g,I9\u001d\by", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017QJk?gxGOH\u0007n\u0012R\u007f&\u001d\u0010?", "AsT=A(FS", "5dc g,I<\u0015\u0007z", "Adc g,I<\u0015\u0007z", "AtR0X:L", "5dc h*<S'\r", "Adc h*<S'\r", "Bn9@b5", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDNowStep implements Serializable {
    public EnrollPath action;
    private boolean error;
    private boolean selected;
    public IDStepReview stepData;
    public IDStepKind stepKind;
    private boolean success;
    private String stepName = "";
    private String internalStepName = "";

    public final EnrollPath getAction() {
        EnrollPath enrollPath = this.action;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constant.NOTIFICATION_DETAILS_ACTION);
        }
        return enrollPath;
    }

    public final boolean getError() {
        return this.error;
    }

    public final String getInternalStepName() {
        return this.internalStepName;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final IDStepReview getStepData() {
        IDStepReview iDStepReview = this.stepData;
        if (iDStepReview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepData");
        }
        return iDStepReview;
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

    public final void setAction(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.action = enrollPath;
    }

    public final void setError(boolean z2) {
        this.error = z2;
    }

    public final void setInternalStepName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.internalStepName = str;
    }

    public final void setSelected(boolean z2) {
        this.selected = z2;
    }

    public final void setStepData(IDStepReview iDStepReview) {
        Intrinsics.checkParameterIsNotNull(iDStepReview, "<set-?>");
        this.stepData = iDStepReview;
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
