package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007fјnjO0Le^.ZS@\u000fsڔ<$q$yCAU\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j:R]ތe\u0012%2JoEWUoKʠhҚ>\u0005.8*\u0600\u0002\u0005\u000f&2Ϻ\u0018v\tCS\f\u00180HpPR\u0015˟\u000b܈\u0018\u001c̄P\u0007.^wNdH\u001b\\zǜ\"\u0013sPO?e@~]\rtWU\u000f\u0007},/XOE\u00175S1\rb]O\u0003mxS\u0004\u0017,w1Yug6\u0007\u0003B\u0017;k\u001be\u000b>l\u0007a`:0;QsK~\u0015>v)\u0001]B\u0014\u0010\u0016'v1[\u001cv$\u001c=\r\u000bcB`\u0002\rK\u0010|q6E,\u00162Y>klacK\u0019|:*\u0007\u001d\"1\f\u0007!\n`\u001ed#(lw\u007f?aJKWf\u0010i?}\u0004\u001fs0:\u00144U\u0012G{?Aϲ)7iMk.y0`Jwx\u0015`\u0017V\u0018T\u000fٞ#75EY!$jFt\u0005\u001aVdZ<\u0011{#j\u0006,\rc&lyL!S\u0013|Q/ɐk\u0016|\u0018UG~G[~k<`I`C5\u007fj&`\u0001{dELd\u0015X\u0015E\u0002\u000e!ک)jQV\u001c(\u0010\fF^\fA;Os,4Z8/[CMS$RC\r\t\u000e]\u0017\u0012Eե4l\nwV\r\t/\\#ˠp0\u007fW_\u0015`P;\bڢ6a3cV\u0001:\r%\u0017~\"\u0011uw\u0013݈M5\u001d\u0004\u000b\u0014 D-\u007fמ0\u0006э\u000e\r_J\u0002[զ|~kQ[\u0013?\u0001\r{\u001f;\u00171\u0016\n\u001b\u000f2`xNgl'$\u0007^!)\u0018f\u0010y\u0010M\u0011F\u0012Y[aNK\u0003\u0003\b?|:-#%\u001e3\t\b:\r7=CU&&y$/Chsh\u001e3Jh\u001f(\u0005e2/\u0012\u0018 \u0001W]@EPai\u0001N\"Ru\u0013DXj&\u000fX\bb\u0012\u0004NQf\u0001VfP91.l\r,\u001b{n[h\u001f \u0004:.m7\fC,\"\u000fO+\u0011[b\u007fs}Ml\u000bx 8\u001b,7t\u0012*O8V\u0006uO\u07bc\u0005<\u001eDxSb3<O8|=J@#C\u0003z6\u0016\t9^a%\u0016`|:ƀWV[\u0007\u0018nH3\u001d\fɎ r\b\rLK\u001e'swݡl\u000fb=#J\u0001\u0002]9\u001fx\u0011\u0017fS+\u000bh\u0002%6\u001b\u0019\u000bs\u001ekI0yJ[y\u0006yz$8F\ts´$ê=]\u0019٣\u000f2d cznf|)tj\u001f:7\f\u0013|<J`ێ\u0017ĢS~wۮENT\u0011E]:\u0003\u001d_7#\\\u0015qX3-4H\u0004֘Uހ\u00183\u0004ߺk=\u0004%.>G\u0006z@jw^\u0005\u0018l3@&s&b0\u001aA`vɓ:ؠx~\u0012ڔ 8U\u0011A#3`_\u000e\u0006D\u0011W9t\u001eZ[j\t\n\u0012uspe\u000b1mGU(s}V-\u000b7M\\\u0016\u0007\\\u0011Õ_ޓ\\\u001d\bǴ-(%Z\u0016\bI\u0012U\nv\u0018<\u007fi\u0011CG{,q1^X.\u007f/y$\u000b@SV\u001a\f\\]@t\t\u000bopYdߣv܍h\u0001\u0014É,~\u0005pl636L\u001c,\f\u007fg')s%Wb\u0017\u0004sR6#ARm\"M19tx|!\u0005Jb#\u0003XD_ۉ\f\u05ff09N§U\u001c-\u00042\u0013\u0005\u0005,vS_\u0013\u001d:\u0012&\u0017?\\H l_H\u001eՀU9I˒)\u0003\u001bd\u0014\u001d߇\u001dy"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001dZ?Dy8-\u0019rj\u0019\u000ec4N\u007f6\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001dZ?Dy8-\u0019rj!\u0011b0Oz'T5X+\\(", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "Ahi245B[\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "=eU@X;\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AkX1X\bGW!z\nb6\u0006", "3mc2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "3wXA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "7r4;T)ES\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5qP=[0<a\u007fz\u000f^9Y\u00109c\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006X21d\u0001$5{|*aCHH;(\u0013nBC\u0014C5]v4'_R;2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u001bV}Dv\u0005\u001b\u001a\u0018>)OBW\u0010T\u0007\u0015t\u001d2lNUn}QJ\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>7JSAxc@\u0004+)T:V\u00123X\u00028t,_=.>`\u0014Oq!\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wd(e\u0010\nq9;\"/cmU\u000fPL$W>oc\u0010;\\\u000f|(o\u0016'S\fBZU\u001e\r\u000f |iSLp;|#oQ,c\u0010\u0016Ld\"$9 KYXd3c?I\"\rrAU[bR\u0015}7\u001diT\u0001_fs.?NwE*2XFzQV9\u000e <\f\u0015\r\u001d=eK}>\u000f4)Gb\u0002Bs3\u001aV`\u001e\"u<+#7:W9Fxm~+\u001eG\u0013y\u0005^^NA\u007fBESs0\u0006D[\u000e:iV\u001a5\u0018j\u0016\\}\u0015Oew4]8\f\n\f6\u0003!\u001cu\"~K'c*3p\u0015Uk|\u0019:\u001e\u0005V\\|I'nU%!\bY5e\u001a/&q$L\u000e\tV>]\u001e:\u0010", "5dc\u0012a;>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0015b\r D\\#*VQ?z8(\u001e>", "Adc\u0012a;>`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-&z\u00127[GJo>'j,R", "5dc\u0012k0M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0015l\u0002/&z\u00127[GJo>'j", "Adc\u0012k0M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005H]\r\u000fDi\u001f<QR?u=sXY", "5dc\u0014e(IV\u001d|\tE(\u0011\t<B\u00072yF", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0017fy+:q\u0014<4?OkAz\u001cr_?gm9.\u007f6GY.?`aH", "Adc\u0014e(IV\u001d|\tE(\u0011\t<B\u00072yF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0007BU\t#;k$\u0015IW;x\u0011%\u001ffg\u001a\u0011p\fW\u0006'T,a0k(6.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0012a(;Z\u0019}", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc\u001cY-LS(Z\u0004b4x\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'@9\bc9[v&#UR4XavG\u001dg", "Adc\u001cY-LS(Z\u0004b4x\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SGa:\u0007p9Nu\u0003PPV(kV|FiUK", "5dc \\A>/\"\u0003\u0003Z;\u0001\u00138", "Adc \\A>/\"\u0003\u0003Z;\u0001\u00138", "5dc _0=St\b~f(\f\r9n", "Adc _0=St\b~f(\f\r9n", "5dc!e(Ga\u001d\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private Function0<Boolean> isEnabled;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private final Transition<EnterExitState> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement enterExitTransitionElement, Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i2, Object obj) {
        if ((1 & i2) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        if ((32 & i2) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        if ((64 & i2) != 0) {
            function0 = enterExitTransitionElement.isEnabled;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        return enterExitTransitionElement.copy(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition, exitTransition, function0, graphicsLayerBlockForEnterExit);
    }

    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    public final EnterTransition component5() {
        return this.enter;
    }

    public final ExitTransition component6() {
        return this.exit;
    }

    public final Function0<Boolean> component7() {
        return this.isEnabled;
    }

    public final GraphicsLayerBlockForEnterExit component8() {
        return this.graphicsLayerBlock;
    }

    public final EnterExitTransitionElement copy(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Boolean> function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        return new EnterExitTransitionElement(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition, exitTransition, function0, graphicsLayerBlockForEnterExit);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.areEqual(this.transition, enterExitTransitionElement.transition) && Intrinsics.areEqual(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && Intrinsics.areEqual(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && Intrinsics.areEqual(this.slideAnimation, enterExitTransitionElement.slideAnimation) && Intrinsics.areEqual(this.enter, enterExitTransitionElement.enter) && Intrinsics.areEqual(this.exit, enterExitTransitionElement.exit) && Intrinsics.areEqual(this.isEnabled, enterExitTransitionElement.isEnabled) && Intrinsics.areEqual(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((((iHashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final Function0<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Function0<Boolean> function0) {
        this.isEnabled = function0;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public EnterExitTransitionElement(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Boolean> function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = function0;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.setTransition(this.transition);
        enterExitTransitionModifierNode.setSizeAnimation(this.sizeAnimation);
        enterExitTransitionModifierNode.setOffsetAnimation(this.offsetAnimation);
        enterExitTransitionModifierNode.setSlideAnimation(this.slideAnimation);
        enterExitTransitionModifierNode.setEnter(this.enter);
        enterExitTransitionModifierNode.setExit(this.exit);
        enterExitTransitionModifierNode.setEnabled(this.isEnabled);
        enterExitTransitionModifierNode.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }
}
