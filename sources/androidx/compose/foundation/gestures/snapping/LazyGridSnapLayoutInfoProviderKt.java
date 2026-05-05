package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: LazyGridSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!,o\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCC٥\"}8\tWNmg\u0007`h\u000e[\u000f4\u001a)n:Nmx\f\u0018?8HoM:eokAx\u0012D\u000e82PB*\t\u000f\u001fBH>|+IQ\f 7XphZSRŋ\u001e\u0012\u0014I8\u0013,h\u007fNdG\u0015]h<S\u0007wPf'\u000e?Cձ%Xb7%v\u0010\u001dS@eBE)a\u0011\u001fR\nNIӊ\u0012S\u0013ؒ?'YH\u001cWdX6RkہQոav>^\u000bRn\u000e˕/`"}, d2 = {"Ah]4_,\u001af\u001d\rkb,\u000f\u00149r\u000f\u0016\u007fU\u0001", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l` \u0003w6^\u0006\u000bPMX\u0002", "5dc \\5@Z\u0019Z\u000eb:m\r/w\u000b2\tOn\u001b,G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8m_@X\u00076+UO62\u0016V", "!mP=?(R])\u000e^g-\u0007s<o\u0011,z@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_75r;Q\\]\u0010eS|(!\u001ck\u0012M+\u001aZ", ":`iF:9BR\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0016_;NL", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "@d\\2`)>`\u0007\bvi\r\u0004\r8g\\(~<\u0012\u001b!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8tr(]v|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b%xT@\u001e\u0004;M\fD2\u0003\f$\u001dEwpP \u001ePu \u0001E2j\u0010GhuR,Op.s\u0010i&2!6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1tW\"\n<,>79PMz_Jt4t/_;x.as8~1\u0003Gs4n\rVq&>(y\u001f<e@#5:F\u001c\tMc\u0004{N\u001bh-+h\u0015f>3ueh_Y\u0013\u0011jl", "=eU@X;(\\\u0001z~g\b\u0010\r=", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c42\u007f(Q\"", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "Ahi2B5&O\u001d\bVq0\u000b", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridSnapLayoutInfoProviderKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 */
    /* JADX INFO: compiled from: LazyGridSnapLayoutInfoProvider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!4i\bӵLc\u0003\nI\u00066\f6B\u0015\"4\u0012}\bnjG5LeN0zRճ\u0015s\u0012éT[Rp\fQc\"\u0016\"7X~kuxbZ9L?\n$\u0004\u0003,w^?qZ\u001d@N\b?aV AGj\r63)x6\t\f\u0013\u00012*v\u0011-;\u001aź\u000eܘ4D\t<X\u000f[\bj$\u0014B8\u0001La\u001e\u000f\rԢnҺ>3;\u0005oH\\.ۨ4\n"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006x%Ch\u000e-7{_<V?Fv8'\u00172H5\u001cw\u000e[z&5UJ7CN\u0007G$!>\u0017O5w\u0012cR(mDD\u0005\u0017j7\u000b7sg\b*\u0018EyTKW\u001a2\u0007\u001f\u0007E(hS\u0018+", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_75r;Q\\]\u0010eS|(!\u001ck\u0012M+\u001aZ", "/uT?T.>7(~\u0003L0\u0012\t", "", "5dc\u000ei,KO\u001b~^m,\u0005v3z\u007f", "u(8", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l` \u0003w6^\u0006\u000bPMX\u0002", "5dc\u0019T@Hc(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u0018;QB\u0005R03)Jn=\u0006J(b\u00017V0W-f(", "1`[0h3:b\u0019Z\u0006i9\u0007\u0005-hi)|N\u0001&", "", "Dd[<V0Mg", "2dR.l\u0016?T'~\n", "1`[0h3:b\u0019l\u0004Z7f\n0s\u007f7", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements SnapLayoutInfoProvider {
        final /* synthetic */ SnapPosition $snapPosition;

        AnonymousClass1(SnapPosition snapPosition) {
            snapPosition = snapPosition;
        }

        private final LazyGridLayoutInfo getLayoutInfo() {
            return lazyGridState.getLayoutInfo();
        }

        private final int getAverageItemSize() {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            int iSizeOnMainAxis = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int size = layoutInfo.getVisibleItemsInfo().size();
            Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
            while (it.hasNext()) {
                iSizeOnMainAxis += LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((LazyGridItemInfo) it.next(), layoutInfo.getOrientation());
            }
            return iSizeOnMainAxis / size;
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateApproachOffset(float f2, float f3) {
            return RangesKt.coerceAtLeast(Math.abs(f3) - getAverageItemSize(), 0.0f) * Math.signum(f3);
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
        public float calculateSnapOffset(float f2) {
            List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
            SnapPosition snapPosition = snapPosition;
            int size = visibleItemsInfo.size();
            float f3 = Float.NEGATIVE_INFINITY;
            float f4 = Float.POSITIVE_INFINITY;
            for (int i2 = 0; i2 < size; i2++) {
                LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i2);
                float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPosition, getLayoutInfo().getTotalItemsCount());
                if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f3) {
                    f3 = fCalculateDistanceToDesiredSnapPosition;
                }
                if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f4) {
                    f4 = fCalculateDistanceToDesiredSnapPosition;
                }
            }
            return SnapFlingBehaviorKt.m864calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyGridState.getDensity$foundation_release(), f2), f3, f4);
        }
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPosition snapPosition, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPosition);
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(LazyGridState lazyGridState, SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            final /* synthetic */ SnapPosition $snapPosition;

            AnonymousClass1(SnapPosition snapPosition2) {
                snapPosition = snapPosition2;
            }

            private final LazyGridLayoutInfo getLayoutInfo() {
                return lazyGridState.getLayoutInfo();
            }

            private final int getAverageItemSize() {
                LazyGridLayoutInfo layoutInfo = getLayoutInfo();
                int iSizeOnMainAxis = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    iSizeOnMainAxis += LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((LazyGridItemInfo) it.next(), layoutInfo.getOrientation());
                }
                return iSizeOnMainAxis / size;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f2, float f3) {
                return RangesKt.coerceAtLeast(Math.abs(f3) - getAverageItemSize(), 0.0f) * Math.signum(f3);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f2) {
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i2);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f4) {
                        f4 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m864calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyGridState.getDensity$foundation_release(), f2), f3, f4);
            }
        };
    }

    public static final FlingBehavior rememberSnapFlingBehavior(LazyGridState lazyGridState, SnapPosition snapPosition, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -234434234, "C(rememberSnapFlingBehavior)118@4715L79,119@4806L41:LazyGridSnapLayoutInfoProvider.kt#ppz6w6");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-234434234, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:116)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 962531774, "CC(remember):LazyGridSnapLayoutInfoProvider.kt#9igjgp");
        boolean z2 = (((14 & i2) ^ 6) > 4 && composer.changed(lazyGridState)) || (-1) - (((-1) - i2) | ((-1) - 6)) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider(lazyGridState, snapPosition);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TargetedFlingBehavior targetedFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehaviorRememberSnapFlingBehavior;
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        return lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m6807getHeightimpl(lazyGridLayoutInfo.mo1158getViewportSizeYbymL2g()) : IntSize.m6808getWidthimpl(lazyGridLayoutInfo.mo1158getViewportSizeYbymL2g());
    }

    public static final int sizeOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? IntSize.m6807getHeightimpl(lazyGridItemInfo.mo1155getSizeYbymL2g()) : IntSize.m6808getWidthimpl(lazyGridItemInfo.mo1155getSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? IntOffset.m6767getYimpl(lazyGridItemInfo.mo1154getOffsetnOccac()) : IntOffset.m6766getXimpl(lazyGridItemInfo.mo1154getOffsetnOccac());
    }
}
