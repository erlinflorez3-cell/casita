package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r.4\u0012}\u000enjG9L͜P.`ݷ2şs{B*cҕyCIU\"}(\tWN}gvϺ`\u0019YƤ6\u001c\tl<I\u0004x\f\u0011O7ԲsA9N}?\u0002f\u0003B\u001d `\"~\u000eM\u0012(7`\u0010%\tsQ\u001a!HB\u00079\u0001\u001d\u0014Ŀ\u001aZ\fL1\u0019\u001e\u000by\u0015J\u0011zkMG#1}rR5tH|{\r\rho\u0017\u0005w6+nK]\u0015SjI\u001b#uM\u0006WsS\u0004\u0017+}ǩUָ[B`Ü,\u00171T\u001bc\u0013(b\f_h\\A9X{Mf\rV{Qԏ\u0019ʀ\b\u001a\u000eΩ`03$t\u000e.5z}aHй\u0006v"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}|\u0004Xo9\u0014G5]v4CJ]0f[\u0001%\u001e\u0011^\u000fR+\u001aZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}|)q]H\u0014_*Nf\u000b#5X+\\(", "\nh]6g\u0005", "u(E", "1tbAb4\"R", "", "5dc\u0010h:M]!by", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010h:M]!by", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1tbAb4'O!~", "5dc\u0010h:M]!gvf,", "Adc\u0010h:M]!gvf,", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class DTUserInteractionsModifier extends ModifierNodeElement<DynatraceUIANode> {
    private String customId;
    private String customName;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DynatraceUIANode create() {
        return new DynatraceUIANode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.model.DTUserInteractionsModifier");
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) obj;
        return Intrinsics.areEqual(this.customId, dTUserInteractionsModifier.customId) && Intrinsics.areEqual(this.customName, dTUserInteractionsModifier.customName);
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final String getCustomName() {
        return this.customName;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        String str = this.customId;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.customName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("DTUserInteractionsModifier");
    }

    public final void setCustomId(String str) {
        this.customId = str;
    }

    public final void setCustomName(String str) {
        this.customName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DynatraceUIANode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }
}
