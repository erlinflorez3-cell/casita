package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ReP.XS2\u000f\u0002{<$i)yCA[\"}8\tWNmkvJh\u0014K\u000f\f$\u0001jBI]xc\u001b\u00172XoG3coE9fy>\u000562*8\u007f\u000e\u0007ɝ@Ϻ.A+Cy\u000bJ/\u000b1ab\u0011[\u00052\u00124?0\t$\\uPNJ\u0003\\h23\u000foB\\+w6\rO\u001dF\u0003-;{Ґ\"+N>}\u00193\u0015\u001b\u0007\u0001a\b\u0007M4U\u0005\u0017-oIW7o6\u0007\u0006D\u00199\u0014%]!9\r\t_&$'YiԣJִˎ,y\u0001B\u001b\u0004L\u0012\u0014o`.[ /\f\u001c|\rr\u0002F!\u000elB\u0018z\u00107mӞ\u0002Ĵ/9#Ƙ\"\u0002I!f?\f\u0007\u001d\u001eQ\u000b\u0005 \n]dֲ!ôX\u0004YĸiBCS\\\u0016y?s\u0011~pRJ\u0012?_\b?}!.E/MZg,wȄ\u000eҩHs~ݓxjYy`T`$t'E8Y,hV|\u0005\u001ac+З8ԃLȼϺ\u0006|ݔ\u0017.dwJ9=\u0012Tcv~\u000bOc 3F7Egp\u0004\u0010m8\r6\fȤeߧeR~ܝ\u0010ep pfpm<^jA:2v\u0005F<:\u0005%܃Ɲ2Ɛu,<.78j5`\u0005$]O\u0019)a`\u0006\u001e\u001d%\\2$\u0002$##1Tj\n\bg'cbA\u001fb\u0004ے٪5Ԋ*e*j: 1'\u0017u\u0006huhgNr8\u0004sLI$>QQ]WC\u0013\rBJ\u0002[_\u00037$\u0012$Ƀ،z܃}\u001fCj4\u000e\u0016\u000b\t.f\u000fXkt\u0019(\u001cl\u0011s1r'\u0012at\u0015wgb$s>w\r9\u001ez\u000f\u000fُč\u001fǪ)\u0011w$\u0003^;c?\u001f\u001c\u001f\"K5cc\u0012}LJ~\u001dP\re2F\u0014\u001a}{i]`Uv\n0ˡJѐ(r\u000bܩ`l}2P%\u0005-AtYf\u0007Ufx;5\f\u007f\u001f.#o\u0005\u0007xSFϟ@ˀc0{ʕ\u0016\u0016dp3?\u001esu\u001d\u0006K\u000b\u001e!\u0601\u0016Гzς£\u0011\u001bݞ$d_b\u0017H\u001eu\u001efOP\u0003\u0007B:2K|N\u0016\u000f[Zy\b z.L\u000e\u0014mϫDǠ?V\u0016֊I\fdz\u001d`ssQ.\u000f\u0018'3L\fkuC.\u001d߃Оcӛ\u007fҵñ\b\u001a˥S\u000fn'1ybY3*^4\u0019Z}EO6D\u001b\u0018A{\"\b\u0018H\u001a\r\u001dp++;a\u0011\u000e/^\u0016a٠f͒hv\u001aצ#n0b\u0017\u0003\r\u0010L\n=\u001e/N!x9ΩXϸ{CK\u05ce\u0019\u0019Jc\u0015\u0018\u001deLV;\u0014\u0006MK\u0006\u0003\u0014U\u000f.ĞG״\u0007¶Ţ&\u0003ȯ%j_\u000et\"u\u001d@S\u007f+\u0003\u0004\u000fQ^7TFX4\u000b\u0016>\nFO0=\u0012\u0015nY\u001a8Ow}ߟnތFKpǍƀcukq[̥\u001f\u00150^ytLȉ!T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002A\u001e\u001b0", "", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "=m;.l,K>&\t\u0006^9\f\u001d\rh{1}@\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW08\t\u0010\\E\"|\"A(\u0017,\\\u0011\u0011O\u0007\u0016%\u00159s:Gg\u0018\u0011z%~?8lPbmC(QN`9h\u0016hg2}+", "4`S2<5,^\u0019|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "", "5dc\u0013T+>7\"l\u0006^*", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "Adc\u0013T+>7\"l\u0006^*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|\u000b=", "4`S2B<MA$~x", "5dc\u0013T+>=)\u000ehi,z", "Adc\u0013T+>=)\u000ehi,z", "4h]._\u0016?T'~\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u0013\\5:Z\u0003\u007f{l,\fP8O}&C<~", "u(9", "Adc\u0013\\5:Z\u0003\u007f{l,\fPvg\u0014<o\u001d\u000f", "uI\u0018#", "\u0018", "\nrTA \u0006\u0017", "", "7r0=c,:`\u0015\bx^\b\u0006\r7a\u000f,\u0006Id \u0002Ty\u0010Iv3C", "u(I", "Adc\u000ec7>O&z\u0004\\,X\u00123m{7\u007fJ\nz 2|\u0018>\u0004%Cg", "uY\u0018#", "7r0=c,:`\u0015\bx^\b\u0006\r7a\u000f,\u0006Id \u0002Ty\u0010Iv3C\u0018| >m\u0018*\\C", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7r36f(I^\u0019z\bZ5z\t\u000bn\u00040wO\u0005! (s\u0017@\u0005(5X", "Adc\u0011\\::^$~vk(\u0006\u0007/A\t,\u0004<\u0010\u001b!PP\u0012Ez38Y|", "7r36f(I^\u0019z\bZ5z\t\u000bn\u00040wO\u0005! (s\u0017@\u0005(5X<\u001f7t\u00160IR;", "7r36f(I^\u0019z\bZ5z\t\u000bn\u00040wO\u0005! +xxI\u0001'BY\f.", "Adc\u0011\\::^$~vk(\u0006\u0007/A\t,\u0004<\u0010\u001b!PS\u0017'\u0004/7f}.E", "7r36f(I^\u0019z\bZ5z\t\u000bn\u00040wO\u0005! +xxI\u0001'BY\f.ul\u00165ME7z4", "7r?9T*>[\u0019\b\n:5\u0001\u0011+t\u00042\u0005$\n\u0002$Qq\u001b<\u00053", "Adc\u001d_(<S!~\u0004m\b\u0006\r7a\u000f,\u0006Id \u0002Ty\u0010Iv3C", "7r?9T*>[\u0019\b\n:5\u0001\u0011+t\u00042\u0005$\n\u0002$Qq\u001b<\u00053sX}'7o\u0012=M", "7rABa5B\\\u001bf\u0005o0\u0006\u000b\u000bw{<WI\u0005\u001f\u0013Vs\u0018E", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ":`h2e", "5dc\u0019T@>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc9$", ":n^8T/>O\u0018h{_:|\u0018", "5dc\u0019b6DO\u001c~v]\u0016}\n=e\u000fo\u0005*~\u0015^Cm", "Adc\u0019b6DO\u001c~v]\u0016}\n=e\u000foCB\u0015+\u000b$}", ">kP0X4>\\(]ze;x", "5dc\u001d_(<S!~\u0004m\u000b|\u0010>aG1e>~^\u0013E", "Adc\u001d_(<S!~\u0004m\u000b|\u0010>aGo}T\u0015\u000bsU", ">kP0X4>\\(]ze;xG.e\u0007(}<\u0010\u0017", ">kP0X4>\\(]ze;xd8i\b$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", ">kP0X4>\\(l\u0006^*", "5dc\u001d_(<S!~\u0004m\u001a\b\t-", "Adc\u001d_(<S!~\u0004m\u001a\b\t-", "@`f\u001cY-LS(", "5dc\u001fT>(T\u001a\rzms\u0006r-cG$y", "Adc\u001fT>(T\u001a\rzmsD\u000bCys\u0005\n", "Dhb6U0EW(\u0013Vg0\u0005\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "/mX:T;>/$\nzZ9x\u0012-e", "/mX:T;>2\u001d\rvi7|\u0005<a\t&{", "/mX:T;>> zx^4|\u0012>D\u007f/\u000b<", "2d[AT", "7r<<i0GUt\u0011vr", "/mX:T;>> zx^4|\u0012>D\u007f/\u000b<H\u0013$\u0017miJ\u0001", "uIIuI", "1`]0X3)Z\u0015|zf,\u0006\u0018\u000bn\u00040wO\u0005! ", "@d[2T:>", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutItemAnimation {
    private final CoroutineScope coroutineScope;
    private FiniteAnimationSpec<Float> fadeInSpec;
    private FiniteAnimationSpec<Float> fadeOutSpec;
    private long finalOffset;
    private final GraphicsContext graphicsContext;
    private final MutableState isAppearanceAnimationInProgress$delegate;
    private final MutableState isDisappearanceAnimationFinished$delegate;
    private final MutableState isDisappearanceAnimationInProgress$delegate;
    private final MutableState isPlacementAnimationInProgress$delegate;
    private boolean isRunningMovingAwayAnimation;
    private GraphicsLayer layer;
    private long lookaheadOffset;
    private final Function0<Unit> onLayerPropertyChanged;
    private final MutableState placementDelta$delegate;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0<Unit> function0) {
        this.coroutineScope = coroutineScope;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = function0;
        this.isPlacementAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isDisappearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isDisappearanceAnimationFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        long j2 = NotInitialized;
        this.rawOffset = j2;
        this.finalOffset = IntOffset.Companion.m6776getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m6757boximpl(IntOffset.Companion.m6776getZeronOccac()), VectorConvertersKt.getVectorConverter(IntOffset.Companion), null, null, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.placementDelta$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6757boximpl(IntOffset.Companion.m6776getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$1 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, AnonymousClass1 anonymousClass1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (2 & i2) != 0 ? null : graphicsContext, (i2 + 4) - (i2 | 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final void setFadeInSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    public final void setFadeOutSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    public final boolean isRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void setPlacementAnimationInProgress(boolean z2) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final void setAppearanceAnimationInProgress(boolean z2) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final void setDisappearanceAnimationInProgress(boolean z2) {
        this.isDisappearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean) this.isDisappearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final void setDisappearanceAnimationFinished(boolean z2) {
        this.isDisappearanceAnimationFinished$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean) this.isDisappearanceAnimationFinished$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getRawOffset-nOcc-ac */
    public final long m1178getRawOffsetnOccac() {
        return this.rawOffset;
    }

    /* JADX INFO: renamed from: setRawOffset--gyyYBs */
    public final void m1181setRawOffsetgyyYBs(long j2) {
        this.rawOffset = j2;
    }

    /* JADX INFO: renamed from: getFinalOffset-nOcc-ac */
    public final long m1175getFinalOffsetnOccac() {
        return this.finalOffset;
    }

    /* JADX INFO: renamed from: setFinalOffset--gyyYBs */
    public final void m1179setFinalOffsetgyyYBs(long j2) {
        this.finalOffset = j2;
    }

    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: setPlacementDelta--gyyYBs */
    public final void m1173setPlacementDeltagyyYBs(long j2) {
        this.placementDelta$delegate.setValue(IntOffset.m6757boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPlacementDelta-nOcc-ac */
    public final long m1177getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m6775unboximpl();
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f'&4*-5\u001a7-03<5?F\u0014B>C8LBII\u007f\u000e", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {115}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05181(Continuation<? super C05181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C05181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyLayoutItemAnimation.this.placementDeltaAnimation.snapTo(IntOffset.m6757boximpl(IntOffset.Companion.m6776getZeronOccac()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LazyLayoutItemAnimation.this.m1173setPlacementDeltagyyYBs(IntOffset.Companion.m6776getZeronOccac());
            LazyLayoutItemAnimation.this.setPlacementAnimationInProgress(false);
            return Unit.INSTANCE;
        }
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C05181(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: getLookaheadOffset-nOcc-ac */
    public final long m1176getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* JADX INFO: renamed from: setLookaheadOffset--gyyYBs */
    public final void m1180setLookaheadOffsetgyyYBs(long j2) {
        this.lookaheadOffset = j2;
    }

    /* JADX INFO: renamed from: animatePlacementDelta-ar5cAso */
    public final void m1174animatePlacementDeltaar5cAso(long j2, boolean z2) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long jM6769minusqkQi6aY = IntOffset.m6769minusqkQi6aY(m1177getPlacementDeltanOccac(), j2);
        m1173setPlacementDeltagyyYBs(jM6769minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = z2;
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, jM6769minusqkQi6aY, null), 3, null);
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C05161(null), 3, null);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean zIsDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        boolean z2 = !zIsDisappearanceAnimationInProgress;
        if (!zIsDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass2(z2, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f%3/4)=/\f<=30B2@69x\u0007", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {182}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05161(Continuation<? super C05161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C05161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyLayoutItemAnimation.this.visibilityAnimation.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f%3/4)=/\f<=30B2@69x\b", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {195, 197}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ boolean $shouldResetValue;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;
        final /* synthetic */ LazyLayoutItemAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z2, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$shouldResetValue = z2;
            this.this$0 = lazyLayoutItemAnimation;
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$shouldResetValue) {
                        this.label = 1;
                        if (this.this$0.visibilityAnimation.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.setAppearanceAnimationInProgress(false);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.label = 2;
                if (Animatable.animateTo$default(this.this$0.visibilityAnimation, Boxing.boxFloat(1.0f), this.$spec, null, new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.animateAppearance.2.1
                    final /* synthetic */ LazyLayoutItemAnimation this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LazyLayoutItemAnimation lazyLayoutItemAnimation) {
                        super(1);
                        lazyLayoutItemAnimation = lazyLayoutItemAnimation;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                        graphicsLayer.setAlpha(animatable.getValue().floatValue());
                        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.this$0.setAppearanceAnimationInProgress(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.setAppearanceAnimationInProgress(false);
                throw th;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1 */
        /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ LazyLayoutItemAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LazyLayoutItemAnimation lazyLayoutItemAnimation) {
                super(1);
                lazyLayoutItemAnimation = lazyLayoutItemAnimation;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                graphicsLayer.setAlpha(animatable.getValue().floatValue());
                lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
            }
        }
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer != null && !isDisappearanceAnimationInProgress() && finiteAnimationSpec != null) {
            setDisappearanceAnimationInProgress(true);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C05171(finiteAnimationSpec, graphicsLayer, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f%3/4)=/\u000f5@/?@63E5C9<{\n", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {JfifUtil.MARKER_SOI}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05171(FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation<? super C05171> continuation) {
            super(2, continuation);
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C05171(this.$spec, this.$layer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(LazyLayoutItemAnimation.this.visibilityAnimation, Boxing.boxFloat(0.0f), this.$spec, null, new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.animateDisappearance.1.1
                        final /* synthetic */ LazyLayoutItemAnimation this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00371(LazyLayoutItemAnimation lazyLayoutItemAnimation) {
                            super(1);
                            lazyLayoutItemAnimation = lazyLayoutItemAnimation;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                            invoke2(animatable);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke */
                        public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                            graphicsLayer.setAlpha(animatable.getValue().floatValue());
                            lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
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
                LazyLayoutItemAnimation.this.setDisappearanceAnimationFinished(true);
                LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                throw th;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1$1 */
        /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00371 extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ LazyLayoutItemAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00371(LazyLayoutItemAnimation lazyLayoutItemAnimation) {
                super(1);
                lazyLayoutItemAnimation = lazyLayoutItemAnimation;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                graphicsLayer.setAlpha(animatable.getValue().floatValue());
                lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
            }
        }
    }

    public final void release() {
        GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C05191(null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C05202(null), 3, null);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass3(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        m1173setPlacementDeltagyyYBs(IntOffset.Companion.m6776getZeronOccac());
        this.rawOffset = NotInitialized;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f6*2,)</n|", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {231}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05191(Continuation<? super C05191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C05191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyLayoutItemAnimation.this.placementDeltaAnimation.stop(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f6*2,)</n}", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {237}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05202 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05202(Continuation<? super C05202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C05202(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyLayoutItemAnimation.this.visibilityAnimation.stop(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3 */
    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f6*2,)</n~", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {}, l = {243}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyLayoutItemAnimation.this.visibilityAnimation.stop(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0ղU\u0002e\u0015\u0015̒^\u001e>;Mu\\ˉdz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002A\u001e\u001b\u0019kX3\u0018\u0001bE.w\u001a", "", "u(E", "\u001cnc\u0016a0MW\u0015\u0006~s,{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u001bb;\"\\\u001d\u000e~Z3\u0001\u001e/dG1e>~^\u0013E", "u(9", "\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getNotInitialized-nOcc-ac */
        public final long m1182getNotInitializednOccac() {
            return LazyLayoutItemAnimation.NotInitialized;
        }
    }
}
