package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4ߚ\u007f\u0007tvA0JoP.`\\2\u000fq{<$i*yCAU ԃ(\u001fѧ~g\u0016m\u000b\n\u001bG\u001d\u0006.x\u0019-Y_\u0007_*\u0015BD\u007f?aN\u001e@Ip\u0003:\u001d,B*H\u007f\u0015\u0003**v\u0015%}qNë\u00162FvHYUT\u0013'*\u0006l!Gɭ]0[DV\u0005cJ13\u0003\u0018C|*&ݥ}\u0016 Tc?\u0019\u0007i.1P9E\u0015SX1\n\u0001^\u0006ƨ@:t\u0013x?'Yɞ$]<X\u000e\u0014-+}\u000e\u000e~,\\\u0013Sx\u00127-_cyQ<+(\r\u0002\rJ\b&\u00127P>3*h\u0018\u000eay!VnSHߐAH\foG/%.E[?)yicQ\u0018|6B̳\u000ef*\u000f\u00039[\u0003#'۔\u001a\u001d~_Gi@kM\u0015̺X\u000e|\u0012pz\u0002X\u0005ΥK\u00067Ʌ)0\u001d-Ed\n8/m\u001aNTi\u0007\u0005\u000fi\u0002lʐLF*Â.90\u0013\u001ae\u0015\u007f\u0013oh`h4!S,V\u0017}6\u0018N_&?Ƽ)\u0016Vи\u0001kpYk\u0015ʁ3}"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}{\u001fplC\u0015c\u000fR\u0006\u0007XLW;2", "", "6hc\u000ee,:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=uT?_(I^\u0019}Vk,x\u0017", "", "Ad`BX5MW\u0015\u0006ab:\f", "", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FQ\u001f/W\u0019\"p0/\u00112qH\u000bju5z5V\"51Xcn\u0007$!^\u0015\u0018\u0012\u0011\u0013h\u0017g_", "5dc\u0015\\;\u001a`\u0019z", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|y7NM\u0011", "5dc\u001ci,KZ\u0015\n\u0006^+X\u0016/a\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc X8NS\"\u000e~Z3c\r=t", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ComposeHitEvent {
    private final LayoutInfo hitArea;
    private final List<LayoutInfo> overlappedAreas;
    private final List<List<String>> sequentialList;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeHitEvent(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        Intrinsics.checkNotNullParameter(hitArea, "hitArea");
        Intrinsics.checkNotNullParameter(overlappedAreas, "overlappedAreas");
        Intrinsics.checkNotNullParameter(sequentialList, "sequentialList");
        this.hitArea = hitArea;
        this.overlappedAreas = overlappedAreas;
        this.sequentialList = sequentialList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposeHitEvent copy$default(ComposeHitEvent composeHitEvent, LayoutInfo layoutInfo, List list, List list2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            layoutInfo = composeHitEvent.hitArea;
        }
        if ((2 & i2) != 0) {
            list = composeHitEvent.overlappedAreas;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            list2 = composeHitEvent.sequentialList;
        }
        return composeHitEvent.copy(layoutInfo, list, list2);
    }

    public final LayoutInfo component1() {
        return this.hitArea;
    }

    public final List<LayoutInfo> component2() {
        return this.overlappedAreas;
    }

    public final List<List<String>> component3() {
        return this.sequentialList;
    }

    public final ComposeHitEvent copy(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        Intrinsics.checkNotNullParameter(hitArea, "hitArea");
        Intrinsics.checkNotNullParameter(overlappedAreas, "overlappedAreas");
        Intrinsics.checkNotNullParameter(sequentialList, "sequentialList");
        return new ComposeHitEvent(hitArea, overlappedAreas, sequentialList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeHitEvent)) {
            return false;
        }
        ComposeHitEvent composeHitEvent = (ComposeHitEvent) obj;
        return Intrinsics.areEqual(this.hitArea, composeHitEvent.hitArea) && Intrinsics.areEqual(this.overlappedAreas, composeHitEvent.overlappedAreas) && Intrinsics.areEqual(this.sequentialList, composeHitEvent.sequentialList);
    }

    public final LayoutInfo getHitArea() {
        return this.hitArea;
    }

    public final List<LayoutInfo> getOverlappedAreas() {
        return this.overlappedAreas;
    }

    public final List<List<String>> getSequentialList() {
        return this.sequentialList;
    }

    public int hashCode() {
        return (((this.hitArea.hashCode() * 31) + this.overlappedAreas.hashCode()) * 31) + this.sequentialList.hashCode();
    }

    public String toString() {
        return "ComposeHitEvent(hitArea=" + this.hitArea + ", overlappedAreas=" + this.overlappedAreas + ", sequentialList=" + this.sequentialList + ')';
    }
}
