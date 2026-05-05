package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: PagerMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0Le^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}0\u0012WȞog\u0005JbŏK\u000f\u0014\u001c\u0001̓4Ikxe܈\u00172XoG\u074cUoS9hҚ>\u000562*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00182X£9`҈e\u001c*\u0014\u0016>N\u0001.^wNdI|_J/Q\u0005\u0018AĚ+_6\u007f}\u0017TX?\u0013\u0007c.+n=c\u001aUW\u0011\u000ej[m\u000bouK\u000e\u0001'U5yweAp\u007fB![S\u001bj\u000b&\u000b\u0013\u0002d\u001a6CO\u0012[\u0001\u00126\t\u0013{;N4\u0012\u0014:`.[.\u0017\u000e\u001cH\rti?~\u0018\u000fH\u000e\u0012y8-$.K[=)\u007fiai3~;\n %\u001eQ\u001d\u001f+iq&f%\u001ddw\u007fA\u007fE\u0004G߉\tԯǀq\u0006v\u0001\u0010Iʹ0L\b2\u0002\u009fJE$ۄ_Y"}, d2 = {"@d\\2`)>`\u0004z|^9d\t+s\u00105{+\u000b\u001e\u001bE\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7sT:C9Hd\u001d}zk\u0013x\u0011,d{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gI2{duC\u0017r\u0010]v/2YX=`QrJi", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "0dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", "", ">`V2F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">`V2F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120M1?\u00014s", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">`V266N\\(", "@d\\2`)>`\u0004z|^9d\t+s\u00105{+\u000b\u001e\u001bE\u0004U\u000f\u0007o\u001eFK&", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007\u001f\u000e\\\u000e[tw\u0001[A1\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHG`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000648Et\u0012Kua(k|\u00155k=6*@Eh#,Jqu=\u001br#`\u001bW`?9$osc\u0012\u0010\u0011m Z1pc\u000b@\u001c\u0011:Ko\"p1zD[g\u0019\u001e\u0007yTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e>\u001a\u00075\u0016l,h?M\u001c\u0018'\u001b\u0016\t]X\u001fyW\ft!YW`n1@|\u0010\\j1UD\u0002\\QoY&8Jf\u0006!urJy?\"c\u0016=fGf^+\u0012=:\u001e\"fE&#,DKPJvi\u00025\u0015G\u000fr\r\u001e\\:G\u0006=J\u0013l\"Jr[\u0012<h\u001c\u001e5I :d}\u0018\fI|1UY\u0018\u000e\b:|\u001d%\u0002\r{Q.n\u001f8yU\n\u0014|'?*\u0005aN$\u0017pxUR*\r_8\u0005} Ps\u0015\"g/MIUL\u007fh8\u0019\u0006\u001e\u0007Ba5\tgD\u0004/j\"\"\u000f\u0006_\u000b)Ne1|u\u0001k[9eP5Ur`G!XI\u0015\u0002-*\ndI}kL2n\u0012\f6${FDVr\u007f\u001b`\u007f,8z53Lxu@\"L\u0015&b\u0002%>~2\u0005\u0016pd\u0002x\\\r\\\u0001", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerMeasurePolicyKt {
    /* JADX INFO: renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m1261rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z2, final Orientation orientation, final int i2, final float f2, final PageSize pageSize, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function02, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1391419623, "C(rememberPagerMeasurePolicy)P(4,11,1,9,5!1,8:c#ui.unit.Dp,7,3,12,10)56@2301L6278:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i3, i4, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 35232261, "CC(remember):PagerMeasurePolicy.kt#9igjgp");
        int i5 = (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - (((((((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3)) ^ 48) <= 32 || !composer.changed(pagerState)) && (-1) - (((-1) - i3) | ((-1) - 48)) != 32) ? 0 : 1) | (((((896 & i3) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(paddingValues)) && (-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) ? 0 : 1))) & ((-1) - (((((7168 & i3) ^ 3072) <= 2048 || !composer.changed(z2)) && (-1) - (((-1) - i3) | ((-1) - 3072)) != 2048) ? 0 : 1))))) & ((-1) - ((((((57344 + i3) - (57344 | i3)) ^ 24576) <= 16384 || !composer.changed(orientation)) && (i3 + 24576) - (24576 | i3) != 16384) ? 0 : 1)))) | (((((234881024 & i3) ^ 100663296) <= 67108864 || !composer.changed(horizontal)) && (i3 & 100663296) != 67108864) ? 0 : 1))) & ((-1) - ((((((-1) - (((-1) - 1879048192) | ((-1) - i3))) ^ 805306368) <= 536870912 || !composer.changed(vertical)) && (-1) - (((-1) - i3) | ((-1) - 805306368)) != 536870912) ? 0 : 1)));
        int i6 = (((((-1) - (((-1) - 3670016) | ((-1) - i3))) ^ 1572864) <= 1048576 || !composer.changed(f2)) && (-1) - (((-1) - 1572864) | ((-1) - i3)) != 1048576) ? 0 : 1;
        int i7 = ((((((i4 + 896) - (896 | i4)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(function02)) && (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 256) ? 0 : 1) | ((-1) - (((-1) - ((-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - (((((29360128 & i3) ^ 12582912) <= 8388608 || !composer.changed(pageSize)) && (-1) - (((-1) - 12582912) | ((-1) - i3)) != 8388608) ? 0 : 1))))) & ((-1) - ((((((i4 + 14) - (14 | i4)) ^ 6) <= 4 || !composer.changed(snapPosition)) && (-1) - (((-1) - i4) | ((-1) - 6)) != 4) ? 0 : 1)))) | (((((458752 & i3) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(i2)) && (i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) ? 0 : 1);
        boolean zChanged = composer.changed(coroutineScope);
        int i8 = (i7 + (zChanged ? 1 : 0)) - (i7 & (zChanged ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i8 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1262invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m1262invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                    int i9;
                    int i10;
                    int iM6591getMaxWidthimpl;
                    long jIntOffset;
                    ObservableScopeInvalidator.m1192attachToScopeimpl(pagerState.m1263getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z3 = orientation == Orientation.Vertical;
                    CheckScrollableContainerConstraintsKt.m601checkScrollableContainerConstraintsK40F9xA(j2, z3 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z3) {
                        i9 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo969calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i9 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z3) {
                        i10 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo970calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i10 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i11 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo971calculateTopPaddingD9Ej5fM());
                    int i12 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo968calculateBottomPaddingD9Ej5fM());
                    final int i13 = i11 + i12;
                    final int i14 = i9 + i10;
                    int i15 = z3 ? i13 : i14;
                    if (z3 && !z2) {
                        i12 = i11;
                    } else if (!z3 || !z2) {
                        i12 = (z3 || z2) ? i10 : i9;
                    }
                    int i16 = i15 - i12;
                    long jM6610offsetNN6EwU = ConstraintsKt.m6610offsetNN6EwU(j2, -i14, -i13);
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    int i17 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(f2);
                    if (z3) {
                        iM6591getMaxWidthimpl = Constraints.m6590getMaxHeightimpl(j2) - i13;
                    } else {
                        iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2) - i14;
                    }
                    if (z2 && iM6591getMaxWidthimpl <= 0) {
                        if (!z3) {
                            i9 += iM6591getMaxWidthimpl;
                        }
                        if (z3) {
                            i11 += iM6591getMaxWidthimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i9, i11);
                    } else {
                        jIntOffset = IntOffsetKt.IntOffset(i9, i11);
                    }
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, iM6591getMaxWidthimpl, i17), 0);
                    pagerState.m1267setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6591getMaxWidthimpl(jM6610offsetNN6EwU) : iCoerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6590getMaxHeightimpl(jM6610offsetNN6EwU) : iCoerceAtLeast, 5, null));
                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                    Snapshot.Companion companion = Snapshot.Companion;
                    PagerState pagerState2 = pagerState;
                    SnapPosition snapPosition2 = snapPosition;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                        int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition2, iM6591getMaxWidthimpl, iCoerceAtLeast, i17, i12, i16, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        int i18 = iM6591getMaxWidthimpl;
                        PagerMeasureResult pagerMeasureResultM1260measurePagerbmk8ZPk = PagerMeasureKt.m1260measurePagerbmk8ZPk(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i18, i12, i16, i17, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM6610offsetNN6EwU, orientation, vertical, horizontal, z2, jIntOffset, iCoerceAtLeast, i2, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages$foundation_release(), pagerState.getBeyondBoundsInfo$foundation_release()), snapPosition, pagerState.m1264getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i19, int i20, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6608constrainWidthK40F9xA(j2, i19 + i14), ConstraintsKt.m6607constrainHeightK40F9xA(j2, i20 + i13), MapsKt.emptyMap(), function1);
                            }
                        });
                        PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM1260measurePagerbmk8ZPk, false, 2, null);
                        return pagerMeasureResultM1260measurePagerbmk8ZPk;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }
}
