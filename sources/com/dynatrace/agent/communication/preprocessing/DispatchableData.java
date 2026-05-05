package com.dynatrace.agent.communication.preprocessing;

import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0RnP.X_2\u000fy\u0002<řc$\u007fOC٥ ԃ(\u001fѧ~g\u0016m\u000b}\u001bG\u001d\u0006.x\u0019-Y_\u0007_*\u0015BD\u007f?aQ\u001e@Id\u0003;\u001d `(أ}\u0007\u0007!8PX}\tQc\f@1\u0007È;\u001b\u001a[\u00142\u0018\u0016@0\u0001L`\u0016Q|զm&A=3\u001bipTm܆1Ex\u001bWl';Ǹ\u0012$1@E5-%\u0002\u00047^a?\u0011A\nC\u0015j7'YM\"Zf^\u0006\u0014#0g\r\fxlٟ\u0004\u001aq\u001a9CO\u0012Q\u0001\u00146\u000b\u0013}#;2\rLЀIv4(z \u000ea\n9ն?\u0019\tlX\u0018z\u0010M]Բ~\u0004:G\u001b~Q\u0010<ϭR=\u0004˜% )\n|+,i\u001cb-!dya1\u007fDkKݳ\u000e_EЧ\u001crh\r8\u0010\u0001V\u000e4\u0014\u0011\\\u001dÉ;aA\u05fa9m\bMRtС\tx"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PB0\\\u0002#VJQ(YYr\u001c\u0010!Vc", "", "3mS\u001db0Gb", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "2`c.", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "7r??\\6KW(\u0013YZ;x", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007f@l\u00018QLJO=\u001f\u001f>H>\u0003t(\u0018\u00076KS\u0018\u0013``\u0002\u0013\tUK", "5dc\u0012a+)]\u001d\b\n", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~Xzi\u0017v\u0015\u0019WGDz\u0018'\u0016r7", "5dc\u0011T;:", "u(;7T=:\u001d)\u000e~euc\r=tU", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DispatchableData {
    private final List<EventRecord> data;
    private final EndPointInfo endPoint;
    private final boolean isPriorityData;

    public DispatchableData(EndPointInfo endPoint, List<EventRecord> data, boolean z2) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(data, "data");
        this.endPoint = endPoint;
        this.data = data;
        this.isPriorityData = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DispatchableData copy$default(DispatchableData dispatchableData, EndPointInfo endPointInfo, List list, boolean z2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            endPointInfo = dispatchableData.endPoint;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            list = dispatchableData.data;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = dispatchableData.isPriorityData;
        }
        return dispatchableData.copy(endPointInfo, list, z2);
    }

    public final EndPointInfo component1() {
        return this.endPoint;
    }

    public final List<EventRecord> component2() {
        return this.data;
    }

    public final boolean component3() {
        return this.isPriorityData;
    }

    public final DispatchableData copy(EndPointInfo endPoint, List<EventRecord> data, boolean z2) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DispatchableData(endPoint, data, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchableData)) {
            return false;
        }
        DispatchableData dispatchableData = (DispatchableData) obj;
        return Intrinsics.areEqual(this.endPoint, dispatchableData.endPoint) && Intrinsics.areEqual(this.data, dispatchableData.data) && this.isPriorityData == dispatchableData.isPriorityData;
    }

    public final List<EventRecord> getData() {
        return this.data;
    }

    public final EndPointInfo getEndPoint() {
        return this.endPoint;
    }

    public int hashCode() {
        return (((this.endPoint.hashCode() * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.isPriorityData);
    }

    public final boolean isPriorityData() {
        return this.isPriorityData;
    }

    public String toString() {
        return "DispatchableData(endPoint=" + this.endPoint + ", data=" + this.data + ", isPriorityData=" + this.isPriorityData + ')';
    }
}
