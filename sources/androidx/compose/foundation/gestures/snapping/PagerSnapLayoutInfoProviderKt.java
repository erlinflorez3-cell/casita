package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: PagerSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG5L͜P.hS2\u000fq~<$i$yّCU0}*\t]ZogtJb\u000bQ\u0018\u000e\u0016~jD\u007fcތu\u0012=1rsM3eok:\u0011xD\u000782P;*!\u000f\u001eB` x\u000bCy\u0012\"2PphX\u001dO\u0015\u001a@\fN\"\u0011\u001e\u000bm|;\u000fǍup='\u001bipTWc>|e\rtUW\u0011\u0005h6+n?e\u00193\\\u001b\u0007\u0001ao\u0007M{U\u0005\u0017-W/W~o6\u0007\u0006D\u00199[%]!,#Ӥiu\u001a4CO\u0012Y\u0001\u00186\u0007\u0013\u0002\u001d>\u0014\u000e48v>sՂl \u0018A\u0007\u000bSnV*^p\u0001AaN!3\u0013K+g/\u000fQ\u0010<_NO\u0006\u0013\"6#/\u0003I[\u0003\u000f'\u0015úX\u000e"}, d2 = {"!mP=?(R])\u000e^g-\u0007s<o\u0011,z@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_75r;Q\\]\u0010eS|(!\u001ck\u0012M+\u001aZ", ">`V2e\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", ">`V2e\u001aGO$]~l;x\u0012-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)t0)sloH\u0003l*NL", "1`[0h3:b\u0019_~g(\u0004v8a\u000b3\u007fI\u0003s!Wx\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "AmP=C6LW(\u0003\u0005g(\u0004w2r\u007f6~J\b\u0016", "4kX;Z\u001d>Z#|~m@", ":nf2e\tHc\"}d_-\u000b\t>", "Co_2e\tHc\"}d_-\u000b\t>", "2dQBZ\u0013HU", "", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "2qP4:,Lb)\fz=,\u0004\u0018+", "7r;Ae\u000bKO\u001b\u0001~g.", "", "7rB0e6EZ\u001d\b|?6\n\u001b+r~", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerSnapLayoutInfoProviderKt {
    private static final void debugLog(Function0<String> function0) {
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3<? super Float, ? super Float, ? super Float, Float> function3) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            public final boolean isValidDistance(float f2) {
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f2) {
                Pair<Float, Float> pairSearchForSnappingBounds = searchForSnappingBounds(pagerState.getLayoutInfo().getSnapPosition());
                float fFloatValue = pairSearchForSnappingBounds.component1().floatValue();
                float fFloatValue2 = pairSearchForSnappingBounds.component2().floatValue();
                float fFloatValue3 = function3.invoke(Float.valueOf(f2), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
                }
                if (isValidDistance(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f2, float f3) {
                int firstVisiblePage$foundation_release;
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                if (pageSize$foundation_release == 0) {
                    return 0.0f;
                }
                if (f2 < 0.0f) {
                    firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release() + 1;
                } else {
                    firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release();
                }
                int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, RangesKt.coerceIn(((int) (f3 / pageSize$foundation_release)) + firstVisiblePage$foundation_release, 0, pagerState.getPageCount()), f2, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                if (iCoerceAtLeast == 0) {
                    return iCoerceAtLeast;
                }
                return Math.signum(f2) * iCoerceAtLeast;
            }

            private final Pair<Float, Float> searchForSnappingBounds(SnapPosition snapPosition) {
                float f2;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = pagerState;
                int size = visiblePagesInfo.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                int i2 = 0;
                while (true) {
                    f2 = 0.0f;
                    if (i2 >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i2);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f4) {
                        f4 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i2++;
                }
                if (f3 == Float.NEGATIVE_INFINITY) {
                    f3 = f4;
                }
                if (f4 == Float.POSITIVE_INFINITY) {
                    f4 = f3;
                }
                boolean z2 = PagerSnapLayoutInfoProviderKt.dragGestureDelta(pagerState) == 0.0f;
                if (!pagerState.getCanScrollForward()) {
                    if (z2 || !PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState)) {
                        f4 = 0.0f;
                    } else {
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                }
                if (!pagerState.getCanScrollBackward()) {
                    if (!z2 && !PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState)) {
                        f4 = 0.0f;
                    }
                } else {
                    f2 = f3;
                }
                return TuplesKt.to(Float.valueOf(f2), Float.valueOf(f4));
            }
        };
    }

    private static final boolean isLtrDragging(PagerState pagerState) {
        return dragGestureDelta(pagerState) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        return (isLtrDragging(pagerState) && reverseLayout) || !(isLtrDragging(pagerState) || reverseLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Offset.m3937getXimpl(pagerState.m1266getUpDownDifferenceF1C5BW0$foundation_release()) : Offset.m3938getYimpl(pagerState.m1266getUpDownDifferenceF1C5BW0$foundation_release());
    }

    public static final float calculateFinalSnappingBound(PagerState pagerState, LayoutDirection layoutDirection, float f2, float f3, float f4, float f5) {
        boolean zIsScrollingForward;
        if (pagerState.getLayoutInfo().getOrientation() == Orientation.Vertical || layoutDirection == LayoutDirection.Ltr) {
            zIsScrollingForward = isScrollingForward(pagerState);
        } else {
            zIsScrollingForward = !isScrollingForward(pagerState);
        }
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        float fDragGestureDelta = pageSize == 0 ? 0.0f : dragGestureDelta(pagerState) / pageSize;
        float f6 = fDragGestureDelta - ((int) fDragGestureDelta);
        int iCalculateFinalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState.getDensity$foundation_release(), f3);
        if (FinalSnappingItem.m857equalsimpl0(iCalculateFinalSnappingItem, FinalSnappingItem.Companion.m861getClosestItembbeMdSM())) {
            if (Math.abs(f6) > f2) {
                if (!zIsScrollingForward) {
                    return f4;
                }
            } else if (Math.abs(fDragGestureDelta) >= Math.abs(pagerState.getPositionThresholdFraction$foundation_release())) {
                if (zIsScrollingForward) {
                    return f4;
                }
            } else if (Math.abs(f4) < Math.abs(f5)) {
                return f4;
            }
        } else if (!FinalSnappingItem.m857equalsimpl0(iCalculateFinalSnappingItem, FinalSnappingItem.Companion.m862getNextItembbeMdSM())) {
            if (FinalSnappingItem.m857equalsimpl0(iCalculateFinalSnappingItem, FinalSnappingItem.Companion.m863getPreviousItembbeMdSM())) {
                return f4;
            }
            return 0.0f;
        }
        return f5;
    }
}
