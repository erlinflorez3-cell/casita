package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":0\u007f\u0007|jA0JnNÍRiճ?k*3d`*qٴ?U(}j+]O\u007fg\u001dL\u000b\u0015Q\u0012\u001e\u001c\tl<I\u0004}\f\u0016?6PuW3{qm=n{N\u0005N4jZ\b\r\u0019\u001aXJ@\u0001\tFc\u0012\"2PphW;Q5\u001e \u000fV / \rk\\=`l\f<wE\u0011sZNUa`\u0007[\u0010^Z7\u000f\u0007aL0n;e\u00193Y\u001b\u0007\u0001]o\u0007MxU\u0005\u0017)oMW~o6\u0007\u0002D\u001f9R%c\u0003(l\u0005\u007fe:+[SqTh\u000eVy+\u007f\u001bC\u001c\u000e4)\u0011P;&~\b<5%|aCh\bnD\u0010z\u0010;E)079?3f\u007fck\u001d\\>\u0014\u0005; k#|.sT<bE%bzi7aBMH|\u000f\bA\u001e\b~k\u001a*22w\u0004=\u0003).E'\u007f}G19k0Jtq\u0005\bxnckbHn'\u001d\u001ag.\u0017\u0012rD\u0013\u0007\u001cTb_D\u0011{\u001e\u001d)\f\u0017+ \u000byl+3\u0013fUxkzM\f\u000fS3\u0017;gw\u0004\u000e\u0006;\u000f7CX{\u0010\u0010Tρ\u0018O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7\\P?tB\"\u0013Pa5\u0015s9NS.QJT:2", "", "u(E", "\u0016na6m6Gb\u0015\u0006bZ?_\t3g\u00037", "", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "/uP6_(;Z\u0019p~];\u007f", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "\u0016na6m6Gb\u0015\u0006bZ?n\r.t\u0003", "/uP6_(;Z\u0019azb.\u007f\u0018", "\u0016na6m6Gb\u0015\u0006bb5_\t3g\u00037", "\u0016na6m6Gb\u0015\u0006bb5n\r.t\u0003", "$daA\\*:Z\u0001z\u000eA,\u0001\u000b2t", "$daA\\*:Z\u0001z\u000eP0{\u00182", "$daA\\*:Z\u0001\u0003\u0004A,\u0001\u000b2t", "$daA\\*:Z\u0001\u0003\u0004P0{\u00182", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMinWidth(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i2);
            if (weight == 0.0f) {
                i4 += iMinIntrinsicWidth;
            } else if (weight > 0.0f) {
                f2 += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f2) + i4 + ((list.size() - 1) * i3);
    }

    public final int VerticalMinWidth(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        int iRound;
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f2 += weight;
            }
        }
        if (f2 == 0.0f) {
            iRound = 0;
        } else {
            iRound = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMinHeight(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        int iRound;
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f2 += weight;
            }
        }
        if (f2 == 0.0f) {
            iRound = 0;
        } else {
            iRound = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMinHeight(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i2);
            if (weight == 0.0f) {
                i4 += iMinIntrinsicHeight;
            } else if (weight > 0.0f) {
                f2 += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f2) + i4 + ((list.size() - 1) * i3);
    }

    public final int HorizontalMaxWidth(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
            if (weight == 0.0f) {
                i4 += iMaxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f2 += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f2) + i4 + ((list.size() - 1) * i3);
    }

    public final int VerticalMaxWidth(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        int iRound;
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f2 += weight;
            }
        }
        if (f2 == 0.0f) {
            iRound = 0;
        } else {
            iRound = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMaxHeight(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        int iRound;
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f2 += weight;
            }
        }
        if (f2 == 0.0f) {
            iRound = 0;
        } else {
            iRound = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMaxHeight(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
            if (weight == 0.0f) {
                i4 += iMaxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f2 += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f2) + i4 + ((list.size() - 1) * i3);
    }
}
