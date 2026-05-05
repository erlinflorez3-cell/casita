package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<řc$\bCC٥\"}0\u0012WȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&4*8\u0010\u0005\t\u001a0K(t\tŏc#\"2PphR\u001dO\u0015\u001a@\u0007N\"\u0011\u001e\u000bi|5Ղp]@2S\u0007wFf'\u000e5-W\u001bLl-\u001dxq\u001eYHe<E)a\f\u001fR\nI3C\u007fH\u001dhU3[M\u0002dNX.\"E/]\u001curTl5Un\u001d?+}s{T\u001c:\u0010z* l\b\u001c\u001a?H\\BJj\u0016$Kt!j\u0007Oڕ]ۍȸ~c</3\u0019KRG5~Q\u0010KANe\u00065\u0011,0\u0019nOi\u0005\u0012n 3T&]aUNX`N8u\u0004mձtb\u0010G\u001cWU\u001eG{?>?%eei'/x\u001aHru'\tnski\u0001Tp&|1O*7(!D\u0081\tk^qpK\u001fl4T5\u000e0\u0013Nf(@/2(N}v\u001an[x\"%]\u0003}Yˇo\u000eeYӗ3:Yf\u0016тn%\u0013͜@\u0004"}, d2 = {"@d\\2`)>`\u0007\u000ev`.|\u0016/da5\u007f?h\u0017\u0013U\u007f\u001b<a/<]{4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0011nRG&\u0017\u0002", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", "7sT:C9Hd\u001d}zk\u0013x\u0011,d{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015ofK5rC7,]", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1q^@f\bQW'l\u0006Z*\u0001\u00121", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_AbX4KK<;XTt=!\u0012Yo[/\fr`K3|/D)\u00190H\u0002H>", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "@d\\2`)>`\u0007\u000ev`.|\u0016/da5\u007f?h\u0017\u0013U\u007f\u001b<a/<]{4~y{3\u001c(<K", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<:\t\u0014Y\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb*O.=Na7n\u0010^0&8D,\u001f{'\u001b2Q8\u001a\u0005R\r\u0002V\u0004p1N\u0015\u000fB4M7FBDnYEv\u0018\u001bR\fw \bM['},\u0011>.5wNIq Ih\u0007\u0015u]K7/58\"CUl?n>\u001cw/n\b\u001c,\u001f>\u001denrD\u001e\u000bg 1\u0016BF\u0007Aa\rBR\u0003^%P\fLk\t\u0019\u0012\u000727CSP%d\u0010\u001eyD\u0010]\u001b\u000e\u0003<~\u00187\u0015Jc\u0013g=)5W\u001b\u0014rF\fEZM%yG\f|O|d!v K\rZW0/M>v_Cn\u0012#8\u007fTe\u0019\t}$\u0007:\u0012\u001349[:bm/\nI`&\u0018U?&.;\u001c\u000f\\Qr]w4jd\nq{\"gB7\u0015|?Sr-FqKNL^\u001c\u00129I 2dr$\f=\u00011Uq\u0012}\u0012\t\u0003\u001c+,9\u0005\u001d\u0006c$.s\u0016\u0010\t\u0003f-%\tcX$M\\{XQ)\u0002c/Nm,Ns\u001fZ\u00016\u0019\u001e\u0012/|)B\u000f\u0002]O7i?CdJ\u0004\u001f0E\u001c\u000f\u0016\u001ag/N\u0019j\u001a\u0004\u00019$", "/ec2e\u0017:R\u0018\u0003\u0004`", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0019IB:o= \u0006dhI\u0007q\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0004;v\u0010\u001c#\u000eC4ZOZ\u0010P\t\u0011\u0005E3q\u001cNFuP@Rl.c\u001f)\u001bfBE.\"qb+l\u001a>\u0013\u007fbZYN\u000eqwVw~E$<|_PNE\u0019\u001d", "0dU<e,)O\u0018}~g.", "AsP?g\u0017:R\u0018\u0003\u0004`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0019IB:o= \u0006dhI\u0007q\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0004;v\u0010\u001c#\u000eC4ZOZ\u0010P\t\u0011\u0005E3q\u001c@[\u0003FNOf)wU]'dED2\u0014;)\u001f2`7\u000e\u000b\u001dwnf\u0004wv&\u001d\b8\"MqeO\u001b36", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridMeasurePolicyKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m1230rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final Function0<? extends LazyStaggeredGridItemProvider> function0, final PaddingValues paddingValues, final boolean z2, final Orientation orientation, final float f2, float f3, final CoroutineScope coroutineScope, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1630140849, "C(rememberStaggeredGridMeasurePolicy)P(9,4!1,7,6,5:c#ui.unit.Dp,2:c#ui.unit.Dp!1,8)50@2173L2923:LazyStaggeredGridMeasurePolicy.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1650675918, "CC(remember):LazyStaggeredGridMeasurePolicy.kt#9igjgp");
        int i3 = (-1) - (((-1) - ((composer.changed(lazyStaggeredGridState) ? 1 : 0) | (((((112 & i2) ^ 48) <= 32 || !composer.changed(function0)) && (-1) - (((-1) - i2) | ((-1) - 48)) != 32) ? 0 : 1))) & ((-1) - ((((((i2 + 896) - (896 | i2)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(paddingValues)) && (384 & i2) != 256) ? 0 : 1)));
        int i4 = (((((-1) - (((-1) - i2) | ((-1) - 7168))) ^ 3072) <= 2048 || !composer.changed(z2)) && (i2 + 3072) - (3072 | i2) != 2048) ? 0 : 1;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = (((((-1) - (((-1) - 57344) | ((-1) - i2))) ^ 24576) <= 16384 || !composer.changed(orientation)) && (24576 & i2) != 16384) ? 0 : 1;
        int i7 = (-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - ((((((-1) - (((-1) - 458752) | ((-1) - i2))) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(f2)) && (i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) ? 0 : 1)));
        int i8 = (((((-1) - (((-1) - 3670016) | ((-1) - i2))) ^ 1572864) <= 1048576 || !composer.changed(f3)) && (i2 + 1572864) - (i2 | 1572864) != 1048576) ? 0 : 1;
        int i9 = ((-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - (((((234881024 & i2) ^ 100663296) > 67108864 && composer.changed(lazyGridStaggeredGridSlotsProvider)) || (-1) - (((-1) - i2) | ((-1) - 100663296)) == 67108864) ? 1 : 0)))) | (composer.changed(graphicsContext) ? 1 : 0);
        Object objRememberedValue = composer.rememberedValue();
        if (i9 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1231invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridMeasureResult m1231invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
                    long jIntOffset;
                    ObservableScopeInvalidator.m1192attachToScopeimpl(lazyStaggeredGridState.m1236getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m601checkScrollableContainerConstraintsK40F9xA(j2, orientation);
                    LazyStaggeredGridSlots lazyStaggeredGridSlotsMo1212invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1212invoke0kLqBqw(lazyLayoutMeasureScope, j2);
                    boolean z3 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                    int i10 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                    int i11 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                    int i12 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM6590getMaxHeightimpl = ((z3 ? Constraints.m6590getMaxHeightimpl(j2) : Constraints.m6591getMaxWidthimpl(j2)) - i10) - i11;
                    if (z3) {
                        jIntOffset = IntOffsetKt.IntOffset(i12, i10);
                    } else {
                        jIntOffset = IntOffsetKt.IntOffset(i10, i12);
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    int i13 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM1229measureStaggeredGridXtK8cYQ = LazyStaggeredGridMeasureKt.m1229measureStaggeredGridXtK8cYQ(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems$foundation_release(), lazyStaggeredGridState.getBeyondBoundsInfo$foundation_release()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo1212invoke0kLqBqw, Constraints.m6582copyZbe2FdA$default(j2, ConstraintsKt.m6608constrainWidthK40F9xA(j2, i13), 0, ConstraintsKt.m6607constrainHeightK40F9xA(j2, lazyLayoutMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(paddingValues3.mo971calculateTopPaddingD9Ej5fM() + paddingValues3.mo968calculateBottomPaddingD9Ej5fM()))), 0, 10, null), z3, z2, jIntOffset, iM6590getMaxHeightimpl, lazyLayoutMeasureScope.mo704roundToPx0680j_4(f2), i10, i11, coroutineScope, graphicsContext);
                    LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM1229measureStaggeredGridXtK8cYQ, false, 2, null);
                    return lazyStaggeredGridMeasureResultM1229measureStaggeredGridXtK8cYQ;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i2 == 2) {
            return paddingValues.mo971calculateTopPaddingD9Ej5fM();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.mo968calculateBottomPaddingD9Ej5fM() : paddingValues.mo971calculateTopPaddingD9Ej5fM();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.mo971calculateTopPaddingD9Ej5fM() : paddingValues.mo968calculateBottomPaddingD9Ej5fM();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
