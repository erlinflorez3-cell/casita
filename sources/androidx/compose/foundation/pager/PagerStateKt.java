package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яo\u001d̉=!4i\bDJe|\u0004W\u00068\u000b4C\u0007\":\u0018\u007f\u0007ljA0JfP.hS2\u000fq{<$i)yّCU0}*ޛWNugvϺb\u000bQ\u001b\u000e\u0016~m4Ikxe\u0012\u00153JoU3UڎE9vt>\u000562*8\u0010\u0005\t\u001a0K\u0018v\tJS\f(0Hp@R5L\u001028\u0014K8\u0001Lj\u0018T<HzlR/Q\u000b\u001aHT(m@\u0015M;W\u00051\u001b\ty$;BG5C-\u0002\u0016\u001fgiS\u001b? R5r5=CO\u0004YFX.+C>\u0016\u0558c\u000bSj\u001di`:5[UiK^'@w)\u0004=B\n\u000f\u0014A`.[+\u0017\u0012\u001cE\rxcB`\u0002\rJ.\u000e(;а)\u007fAFQhtmy;Gc_{3*N'\u000f\r9[\u0003\u0016\u0011\u0019)s\u0010Q_bpGVn\"_Mo\u0014p\u0011\u0013X%`b\u000eQ\u0014(>\u001957\n]3#{\u0002vLwx\u0015`\u0017h\u0018u͕D\"t;}ѪGɔ^Dr+\u0004`b\u007fD\u0011{1|\u0007,\u0016Y\u05ff\u001bʟ@!38f_v\u0013\u0003M\f\u001fM/\u0015E ʥ*ް[9l[Mcq:yR%?g<\u00111\tjPe$Z\u000b0hõ`|\u001e%\u0014D|7;2muL8:C1\\CPI\u001ebU\u000bȁwZ\u0017\u000fUԟ5ʗ\u0007q,t\u0017\u0003h^vouyi>\u000bc:-oU\fӨ(Ɓ&n<ê;\t\u0005x\u000eM\bXUS\u0005\u0016$]R\u0090h׀=Q7ˋ3\u001b\r2J\u0002[M#Ǫ8˛Q\u0012/ϕ\u001d\b\u001dE\u0001.\u0016\u0013AѴ.߯nLWT%.\u0557b!"}, d2 = {"\u0012dU.h3M>#\r~m0\u0007\u0012\u001eh\r(\nC\u000b\u001e\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0011X-:c \u000eeh:\u0001\u00183o\t\u0017~M\u0001%\u001aQv\r", "u(5", "\u0014", "\u0013l_Al\u0013:g#\u000f\nB5}\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP#k0,%ua&\u0007q<U\u0006|", "5dc\u0012`7Mg\u007fz\u000fh<\fl8f\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0019IE;x\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", "\u001b`g\u001dT.>ay\t\b:5\u0001\u0011+t\u007f\u0016yM\u000b\u001e\u001e", "", "\u001e`V2f\u001bH>&~{^;z\f", "#mXA7,Ga\u001d\u000e\u000f", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0002!7Y\u000bi\"i\u0018.Z1JgC\u001ezw )\u0010g;-v0UP]@\u001b\u001e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015Npwvl0]U'PZR;p\u0011>\u0013", "\u001e`V2e\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "1ta?X5M>\u0015\u0001z", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "", ">`V266N\\(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2dQBZ\u0013HU", "", "5d]2e(MS\u0001\r|", "", "@d\\2`)>`\u0004z|^9j\u0018+t\u007f", "7mXA\\(E>\u0015\u0001z", "7mXA\\(E>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "uH5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007j\rT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=%gU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fW\u001aW\u0003\u0014qP-rO#juIAR,\u0015`\u000e_*JI63\u0014G", "/mX:T;>A\u0017\f\u0005e3k\u0013\u001aa\u0002(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],JP\u007fG\u001b\u0019H\fX6\rZ", "B`a4X;)O\u001b~", "B`a4X;)O\u001b~d_-\u000b\t>T\n\u0016\u0005<\f\"\u0017FZ\u0018Jz49c\u0007", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "CoS.g,-O&\u0001zm\u0017x\u000b/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]R0KTJ;\\@pJ\u001e\u0019a{L5\u0018\u0005/%\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fR\u0019K\u0002\u0011\u0005E3q\u0010Wi\u0007G\u000b!k.l\bn!fC(/\u0014on\u0002nZ=\u0011\u007f\\Zwc\u00021hW\"xG(Hvi\u0010&\u007f^:\u0004+)THMx8b\u00042x6M24Cn\u0015Zk!>lBr6eP+/F8\"CUlK0%\u0013d0]Q\u0015^>3bObhH\r\u00163", "/mX:T;>B#gzq;g\u00051e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \rm;Uz0\u0011JX9fb\u0002A\u001d\u0012hW,5\u0016\u0014]J4jS;)\u0011\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "/mX:T;>B#i\b^=\u0001\u0013?sj$}@", "1`[0h3:b\u0019gzp\u0014x\u001c\u001dc\r2\u0003Gj\u0018\u0018Uo\u001d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gH(%wEB\bm\u0002", "1`[0h3:b\u0019gzp\u0014\u0001\u0012\u001dc\r2\u0003Gj\u0018\u0018Uo\u001d", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerStateKt {
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = Dp.m6638constructorimpl(56);
    private static final PagerMeasureResult EmptyLayoutInfo = new PagerMeasureResult(CollectionsKt.emptyList(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final Map<AlignmentLine, Integer> alignmentLines = MapsKt.emptyMap();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }
    }, false, null, null, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), 393216, null);
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        PagerStateKt$UnitDensity$1() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };

    private static final void debugLog(Function0<String> function0) {
    }

    public static final PagerState rememberPagerState(final int i2, final float f2, final Function0<Integer> function0, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -1210768637, "C(rememberPagerState)*87@3977L130,87@3927L180:PagerState.kt#g6yjnt");
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            f2 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i3, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 17132194, "CC(remember):PagerState.kt#9igjgp");
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i3) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(i2)) && (i3 + 6) - (6 | i3) != 4) ? 0 : 1)) & ((-1) - (((((112 & i3) ^ 48) <= 32 || !composer.changed(f2)) && (48 & i3) != 32) ? 0 : 1))))) & ((-1) - (((((896 & i3) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function0)) || (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i5 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<DefaultPagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i2, f2, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultPagerState;
    }

    public static /* synthetic */ PagerState PagerState$default(int i2, float f2, Function0 function0, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        return PagerState(i2, f2, function0);
    }

    public static final PagerState PagerState(int i2, float f2, Function0<Integer> function0) {
        return new DefaultPagerState(i2, f2, function0);
    }

    public static final Object animateToNextPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 < pagerState.getPageCount()) {
            Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
            return objAnimateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToPage$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 >= 0) {
            Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
            return objAnimateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToPage$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo pagerLayoutInfo, int i2) {
        long pageSpacing = (((long) i2) * ((long) (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize()))) + ((long) pagerLayoutInfo.getBeforeContentPadding()) + ((long) pagerLayoutInfo.getAfterContentPadding());
        int iM6808getWidthimpl = pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? IntSize.m6808getWidthimpl(pagerLayoutInfo.mo1257getViewportSizeYbymL2g()) : IntSize.m6807getHeightimpl(pagerLayoutInfo.mo1257getViewportSizeYbymL2g());
        return RangesKt.coerceAtLeast(pageSpacing - ((long) (iM6808getWidthimpl - RangesKt.coerceIn(pagerLayoutInfo.getSnapPosition().position(iM6808getWidthimpl, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i2 - 1, i2), 0, iM6808getWidthimpl))), 0L);
    }

    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i2) {
        int iM6808getWidthimpl = pagerMeasureResult.getOrientation() == Orientation.Horizontal ? IntSize.m6808getWidthimpl(pagerMeasureResult.mo1257getViewportSizeYbymL2g()) : IntSize.m6807getHeightimpl(pagerMeasureResult.mo1257getViewportSizeYbymL2g());
        return RangesKt.coerceIn(pagerMeasureResult.getSnapPosition().position(iM6808getWidthimpl, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i2), 0, iM6808getWidthimpl);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2 */
    /* JADX INFO: compiled from: PagerState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Ru\b\u000f\u000e\u001c} \u000e\"\u0014z%U\u0014\"\u001e#\u0018,\u001e\r\u001e.,*+\u00140\u0012$+*ix", f = "\u001d-2/;\u001b;'9)p-5", i = {}, l = {953}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ int $targetPage;
        final /* synthetic */ float $targetPageOffsetToSnappedPosition;
        final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToPage;
        final /* synthetic */ Function2<ScrollScope, Integer, Unit> $updateTargetPage;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super ScrollScope, ? super Integer, Unit> function2, int i2, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$updateTargetPage = function2;
            this.$targetPage = i2;
            this.$this_animateScrollToPage = lazyLayoutAnimateScrollScope;
            this.$targetPageOffsetToSnappedPosition = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$updateTargetPage, this.$targetPage, this.$this_animateScrollToPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iCoerceAtMost;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                this.$updateTargetPage.invoke(scrollScope, Boxing.boxInt(this.$targetPage));
                boolean z2 = this.$targetPage > this.$this_animateScrollToPage.getFirstVisibleItemIndex();
                int lastVisibleItemIndex = (this.$this_animateScrollToPage.getLastVisibleItemIndex() - this.$this_animateScrollToPage.getFirstVisibleItemIndex()) + 1;
                if (((z2 && this.$targetPage > this.$this_animateScrollToPage.getLastVisibleItemIndex()) || (!z2 && this.$targetPage < this.$this_animateScrollToPage.getFirstVisibleItemIndex())) && Math.abs(this.$targetPage - this.$this_animateScrollToPage.getFirstVisibleItemIndex()) >= 3) {
                    if (z2) {
                        iCoerceAtMost = RangesKt.coerceAtLeast(this.$targetPage - lastVisibleItemIndex, this.$this_animateScrollToPage.getFirstVisibleItemIndex());
                    } else {
                        iCoerceAtMost = RangesKt.coerceAtMost(this.$targetPage + lastVisibleItemIndex, this.$this_animateScrollToPage.getFirstVisibleItemIndex());
                    }
                    this.$this_animateScrollToPage.snapToItem(scrollScope, iCoerceAtMost, 0);
                }
                float fCalculateDistanceTo = this.$this_animateScrollToPage.calculateDistanceTo(this.$targetPage) + this.$targetPageOffsetToSnappedPosition;
                Ref.FloatRef floatRef = new Ref.FloatRef();
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, fCalculateDistanceTo, 0.0f, this.$animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerStateKt.animateScrollToPage.2.3
                    final /* synthetic */ ScrollScope $$this$scroll;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(ScrollScope scrollScope2) {
                        super(2);
                        scrollScope = scrollScope2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2, float f3) {
                        floatRef.element += scrollScope.scrollBy(f2 - floatRef.element);
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2$3 */
        /* JADX INFO: compiled from: PagerState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rfx2`UB\u000f\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "1ta?X5MD\u0015\u0006\u000b^", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass3 extends Lambda implements Function2<Float, Float, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ScrollScope scrollScope2) {
                super(2);
                scrollScope = scrollScope2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                invoke(f2.floatValue(), f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, float f3) {
                floatRef.element += scrollScope.scrollBy(f2 - floatRef.element);
            }
        }
    }

    public static final Object animateScrollToPage(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, float f2, AnimationSpec<Float> animationSpec, Function2<? super ScrollScope, ? super Integer, Unit> function2, Continuation<? super Unit> continuation) {
        Object objScroll = lazyLayoutAnimateScrollScope.scroll(new AnonymousClass2(function2, i2, lazyLayoutAnimateScrollScope, f2, animationSpec, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
