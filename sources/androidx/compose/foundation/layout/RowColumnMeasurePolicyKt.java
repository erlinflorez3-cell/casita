package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: RowColumnMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDZc|İI\u0006>\u00116B\u0005%4\u0012\u000e\u0007nʑA0R\u0004P.hS2şs{B3c$\bCCU ~*\t]aogtKrŕB\u001dإ.x\u0019+qU']B\u0013@C\b?aO AGc\r63\"b&F}\u001d\u0001H,x\u0014\u0005\u007f[K:\u0014`D~@j\r{\u0007J\u0016\u0014E8\u0001Ld\u0018XDQ\u0005cJ13\u0003\u0018M|1\u0010<\u000bY%Nd+\u001dxw\u001dYNeBE)a\u0012\u001fR\nA3C\u007fM\u001dhU)[QyWDi\u0018\u0016+*}\u001f\u000ex,\\\u0013dx\fU-\u0016ҪׂT\u000e6\fߧ\u007f\""}, d2 = {";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001ePa5\u0015s9Na1NPL@2", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "/qa.a.>[\u0019\b\nL7x\u00073n\u0002\f\u0005O", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1q^@f\bQW'h{_:|\u0018", "", "1ta?X5M:\u001d\bzB5{\tB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u001bWU\u0019u;.\u001dqI9\u0003q<[v\u0012QSR*p(V!wu>tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_\u00151~zReY/y\u0011\u0004Q6h4Wi\u0005G\u0017,g&u\b)-k>Amzu'*>F\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9\\8\t1/ZEb\u0019.Vt'q4\u0004\n\u000e\u001aZh/+~:gw\"6`@:o4F\u001bJUqu6N\u00122&]\u001c\u0018rDz\u0001eaqX\u001c\u0007J\u0017iEhnV", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RowColumnMeasurePolicyKt {
    public static /* synthetic */ MeasureResult measure$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, int i6, MeasureScope measureScope, List list, Placeable[] placeableArr, int i7, int i8, int[] iArr, int i9, int i10, Object obj) {
        if ((-1) - (((-1) - i10) | ((-1) - 1024)) != 0) {
            iArr = null;
        }
        if ((-1) - (((-1) - i10) | ((-1) - 2048)) != 0) {
            i9 = 0;
        }
        return measure(rowColumnMeasurePolicy, i2, i3, i4, i5, i6, measureScope, list, placeableArr, i7, i8, iArr, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [long] */
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, int i6, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i7, int i8, int[] iArr, int i9) throws Throwable {
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        RowColumnMeasurePolicy rowColumnMeasurePolicy3;
        FlowLayoutData flowLayoutData;
        int iMax;
        int iMax2;
        FlowLayoutData flowLayoutData2;
        long j2 = i6;
        int i10 = i8 - i7;
        int[] iArr2 = new int[i10];
        int i11 = i7;
        float f2 = 0.0f;
        int iMin = 0;
        int i12 = 0;
        int i13 = 0;
        int iMax3 = 0;
        boolean z2 = false;
        while (true) {
            Integer numValueOf = null;
            int iCoerceAtLeast = Integer.MAX_VALUE;
            rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
            if (i11 >= i8) {
                break;
            }
            Measurable measurable = list.get(i11);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            z2 = z2 || RowColumnImplKt.isRelative(rowColumnParentData);
            if (weight > 0.0f) {
                f2 += weight;
                i13++;
            } else {
                if (i5 != Integer.MAX_VALUE && rowColumnParentData != null && (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) != null) {
                    numValueOf = Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i5));
                }
                int i14 = i4 - i12;
                Placeable placeableMo5514measureBRTryo0 = placeableArr[i11];
                if (placeableMo5514measureBRTryo0 == null) {
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    if (i4 != Integer.MAX_VALUE) {
                        iCoerceAtLeast = RangesKt.coerceAtLeast(i14, 0);
                    }
                    placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(RowColumnMeasurePolicy.m1043createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy2, 0, iIntValue, iCoerceAtLeast, numValueOf != null ? numValueOf.intValue() : i5, false, 16, null));
                }
                int iMainAxisSize = rowColumnMeasurePolicy2.mainAxisSize(placeableMo5514measureBRTryo0);
                int iCrossAxisSize = rowColumnMeasurePolicy2.crossAxisSize(placeableMo5514measureBRTryo0);
                iArr2[i11 - i7] = iMainAxisSize;
                iMin = Math.min(i6, RangesKt.coerceAtLeast(i14 - iMainAxisSize, 0));
                i12 += iMainAxisSize + iMin;
                iMax3 = Math.max(iMax3, iCrossAxisSize);
                placeableArr[i11] = placeableMo5514measureBRTryo0;
            }
            i11++;
        }
        int iCoerceIn = 0;
        if (i13 == 0) {
            i12 -= iMin;
            rowColumnMeasurePolicy3 = rowColumnMeasurePolicy2;
        } else {
            int i15 = i4 != Integer.MAX_VALUE ? i4 : i2;
            long j3 = j2 * ((long) (i13 - 1));
            long jCoerceAtLeast = RangesKt.coerceAtLeast(((long) (i15 - i12)) - j3, 0L);
            float f3 = jCoerceAtLeast / f2;
            long jRound = jCoerceAtLeast;
            for (int i16 = i7; i16 < i8; i16++) {
                float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list.get(i16)));
                float f4 = f3 * weight2;
                try {
                    jRound -= (long) Math.round(f4);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i4).append("mainAxisMin ").append(i2).append("targetSpace ").append(i15).append("arrangementSpacingPx ").append(j2).append("weightChildrenCount ").append(i13).append("fixedSpace ").append(i12).append("arrangementSpacingTotal ").append(j3).append("remainingToTarget ").append(jCoerceAtLeast).append("totalWeight ").append(f2).append("weightUnitSpace ").append(f3).append("itemWeight ").append(weight2).append("weightedSize ");
                    sb.append(f4);
                    throw new IllegalArgumentException(sb.toString()).initCause(e2);
                }
            }
            int i17 = 0;
            for (int i18 = i7; i18 < i8; i18++) {
                if (placeableArr[i18] == null) {
                    Measurable measurable2 = list.get(i18);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    Integer numValueOf2 = (i5 == Integer.MAX_VALUE || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(flowLayoutData.getFillCrossAxisFraction() * i5));
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(jRound);
                    jRound -= (long) sign;
                    float f5 = f3 * weight3;
                    int iMax4 = Math.max(0, Math.round(f5) + sign);
                    try {
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                    }
                    try {
                        rowColumnMeasurePolicy2 = rowColumnMeasurePolicy2;
                        sign = rowColumnMeasurePolicy2.mo933createConstraintsxF2OJ5Q((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == Integer.MAX_VALUE) ? 0 : iMax4, numValueOf2 != null ? numValueOf2.intValue() : 0, iMax4, numValueOf2 != null ? numValueOf2.intValue() : i5, true);
                        Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(sign);
                        int iMainAxisSize2 = rowColumnMeasurePolicy2.mainAxisSize(placeableMo5514measureBRTryo02);
                        int iCrossAxisSize2 = rowColumnMeasurePolicy2.crossAxisSize(placeableMo5514measureBRTryo02);
                        iArr2[i18 - i7] = iMainAxisSize2;
                        i17 += iMainAxisSize2;
                        iMax3 = Math.max(iMax3, iCrossAxisSize2);
                        placeableArr[i18] = placeableMo5514measureBRTryo02;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                        sb2.append(i4).append("mainAxisMin ").append(i2).append("targetSpace ").append(i15).append("arrangementSpacingPx ").append(j2).append("weightChildrenCount ").append(i13).append("fixedSpace ").append(i12).append("arrangementSpacingTotal ").append(j3).append("remainingToTarget ").append(jCoerceAtLeast).append("totalWeight ").append(f2).append("weightUnitSpace ").append(f3).append("weight ").append(weight3).append("weightedSize ");
                        sb2.append(f5).append("crossAxisDesiredSize ").append(numValueOf2).append("remainderUnit ").append(sign).append("childMainAxisSize ").append(iMax4);
                        throw new IllegalArgumentException(sb2.toString()).initCause(e);
                    }
                }
            }
            rowColumnMeasurePolicy3 = rowColumnMeasurePolicy2;
            iCoerceIn = RangesKt.coerceIn((int) (((long) i17) + j3), 0, i4 - i12);
        }
        if (z2) {
            iMax2 = 0;
            iMax = 0;
            for (int i19 = i7; i19 < i8; i19++) {
                Placeable placeable = placeableArr[i19];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable));
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int iCrossAxisSize3 = rowColumnMeasurePolicy3.crossAxisSize(placeable);
                    iMax2 = Math.max(iMax2, iIntValue2 != Integer.MIN_VALUE ? numCalculateAlignmentLinePosition$foundation_layout_release.intValue() : 0);
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = iCrossAxisSize3;
                    }
                    iMax = Math.max(iMax, iCrossAxisSize3 - iIntValue2);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int iMax5 = Math.max(RangesKt.coerceAtLeast(i12 + iCoerceIn, 0), i2);
        int iMax6 = Math.max(iMax3, Math.max(i3, iMax + iMax2));
        int[] iArr3 = new int[i10];
        for (int i20 = 0; i20 < i10; i20++) {
            iArr3[i20] = 0;
        }
        rowColumnMeasurePolicy3.populateMainAxisPositions(iMax5, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy2.placeHelper(placeableArr, measureScope, iMax2, iArr3, iMax5, iMax6, iArr, i9, i7, i8);
    }
}
