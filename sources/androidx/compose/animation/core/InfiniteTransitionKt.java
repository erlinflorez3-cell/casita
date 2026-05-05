package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bDJc|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007toA0JfP.hS2\u000fq~<$q$yّCU0}*\tUO\u007fr|Ϻr\u000bq\u000eL\u001bѱn,WU\u0011r ƁJB\u001e>cSu=Ga\r63\"x'أ}\u0005\u000f\u001dB{\u001ez\u0013I[\u000e\"0nvhW5M3\u0019B\nL'\u0019\u001e\u000bm~:Vtu:])3sPW?e@~]\rtZU\u0017=fӿ/@E@-ba\u0007\u001fXkA\u0013? C3mO'YH$[D_\u0018\u0014C1\u007f\u0011kz>\\3W\u0011\u001654gi[R\u001e(&\u0001*\u0017l\n\u0014\u00065IF-HhN\u0013\u07baxraLhYlO\u0018\u0001q8'%FAY>;hWĥI'n=\u0002\u0004\u001b-K\u0001\u001d1\u0004T<_E\u001fb~i1\u0018NmL\\\u0012q=4\u0012!r\u0010;\u001c<W\u0002?{W<''G[\u007f2O}2RRp\u000f\u000bpjci\u0019Vn,5\u001b֖.\t\u001am\\F\u0013xhZh.!Mbb5\u0003(\u0015&ο\u0006JA+\u0016M]w\u0012j{m2%]eg]|r&W\u007flc9_k(a\u0019\u0005DOJs\u001ddvDc\f!j8$BH1\u001f&\u000etX\u001a\u001cJE\u0002\u001eD,w'\u000b\u001fx\t$BO}!_\tjV\u0004Ձ7$\u0011}ˮx\u001e"}, d2 = {"@d\\2`)>`|\b{b5\u0001\u0018/T\r$\u0005N\u0005&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;ZA\u001a\u001eveH\u000bm5$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016J5`ZnL\u0018\u001ccWL5\u001a\u0005#%-oH@#\u0017,8\u000f7q\u000f\u0010%\u0012?sF", ":`Q2_", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+0\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e3(\f4E\u0011?r\nU\u0014\u0018Bj:&_\u0011K\u0003\u0019\u0005A\u0018uBbm}VEOk\u007f", "/mX:T;>4 \tvm", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;X4)\u0015dp5\u0004j,<\u0002'E\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\b(3J5[_|A\u0013%$\fX3\u0018\u000fgAmjM;'\u0004;M\fD2~\u0016#\u000e~NyCZ\u0019K\t\u0015bA4hBh[vNA3m*baF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<_\npvK!z\u0002\u0002HufPSob\u0012Xj\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015t(Gm|\u001d,&/6\"E<h", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\b(3J5[_|A\u0013%$\fX3\u0018\u000fgAmjM;'\u0004;M\fD2~\u0016#\u000e~NyCZ\u0019K\t\u0015bA4hBh[vNA3m*baF\"XK6m\u001bm\"\u001d2>=\u0017\u007f\\\u0013H9upfT#~77\bkeNPyc<>4/T\u000b{\u001a2\"R5|8\u000eB*C:h/+~:gw\"6`@:o4F\u001bJUqu6K\u001eq.e\u0010\u000e,#@\u0015te9", "/mX:T;>D\u0015\u0006\u000b^", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000f^3h\u0014[,`DCm\u0012{&\u001b2?@\u0014mO%P\\\u0003xgT(zEy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>'}1\f09:n\u000e\u0015e\"K^Bx5]E0*E<\u007f?Vcq{:\u000bo\u001fO\u0013\u000e`\u000b\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bEROKYx$+N~\f9\u0004\u001d\u0014\u00112mr\u001f'^;|#oQ,c\u0010\u0016Ld\"$9 KYXu:hFQ\u001b\t2&\u001bwhCj", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000f^3h\u0014[,`DCm\u0012{&\u001b2?@\u0014mO%P\\\u0003xgT(zEy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>'}1\f09:n\u000e\u0015e\"K^Bx5]E0*E<\u007f?Vcq{:\u000bo\u001fO\u0013\u000e`\u000b\u0018\u001eav_\u0012\u0016\u0003f\u0019%#pl\u0005@T[%Ex\u00144P\u0003AnC\u0013\u0013\u000f/wsI\r(d\n)tL\")n\r\u000bq\"*.#\u0013=r,\u0011[@L \u0013l7\u001fEWM\u001d{R\u001em\u0015\u007fk`~(>xZ70/Z<L", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InfiniteTransitionKt {
    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1013651573, "C(rememberInfiniteTransition)45@1981L38,46@2043L5:InfiniteTransition.kt#pdpnli");
        if ((i3 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1916602784, "CC(remember):InfiniteTransition.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        infiniteTransition.run$animation_core_release(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return infiniteTransition;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(final InfiniteTransition infiniteTransition, final T t2, final T t3, TwoWayConverter<T, V> twoWayConverter, final InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -1062847727, "C(animateValue)P(1,3,4)262@10743L151,268@10911L346,268@10900L357,280@11301L128,280@11263L166:InfiniteTransition.kt#pdpnli");
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            str2 = "ValueAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1444224427, "CC(remember):InfiniteTransition.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            t2 = t2;
            objRememberedValue = infiniteTransition.new TransitionAnimationState(t2, t3, twoWayConverter, infiniteRepeatableSpec, str2);
            composer.updateRememberedValue(objRememberedValue);
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1444229998, "CC(remember):InfiniteTransition.kt#9igjgp");
        int i4 = 1;
        int i5 = (-1) - (((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changedInstance(t2)) && (48 & i2) != 32) ? 0 : 1)) & ((-1) - (((((896 & i2) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changedInstance(t3)) && (384 & i2) != 256) ? 0 : 1)));
        if (((((57344 + i2) - (57344 | i2)) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec)) && (i2 + 24576) - (i2 | 24576) != 16384) {
            i4 = 0;
        }
        int i6 = (-1) - (((-1) - i5) & ((-1) - i4));
        Object objRememberedValue2 = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (Intrinsics.areEqual(t2, transitionAnimationState.getInitialValue$animation_core_release()) && Intrinsics.areEqual(t3, transitionAnimationState.getTargetValue$animation_core_release())) {
                        return;
                    }
                    transitionAnimationState.updateValues$animation_core_release(t2, t3, infiniteRepeatableSpec);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.SideEffect((Function0) objRememberedValue2, composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 1444242260, "CC(remember):InfiniteTransition.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(infiniteTransition);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    infiniteTransition.addAnimation$animation_core_release(transitionAnimationState);
                    final InfiniteTransition infiniteTransition2 = infiniteTransition;
                    final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            infiniteTransition2.removeAnimation$animation_core_release(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(transitionAnimationState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transitionAnimationState;
    }

    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f2, float f3, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -644770905, "C(animateFloat)P(1,3)316@12588L84:InfiniteTransition.kt#pdpnli");
        if ((i3 & 8) != 0) {
            str2 = "FloatAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - ((i2 + PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION) - (1022 | i2))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i4)))));
        int i6 = i4 & 458752;
        State<Float> stateAnimateValue = animateValue(infiniteTransition, fValueOf, fValueOf2, vectorConverter, infiniteRepeatableSpec, str2, composer, (i5 + i6) - (i5 & i6), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "5K\t:~v\u001aiAU.\u0004^\u001e@SP^\n5\u0018q [\u0006T.K>]7&v[{\u0002U]~>\u0006\u001frH\u0017m\f\u0006#ZMG%N5$\rT\u0019X \ts\u0003v\u0010t;i")
    @InterfaceC1492Gx
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -840193660, "C(rememberInfiniteTransition)324@12880L48:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition infiniteTransitionRememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return infiniteTransitionRememberInfiniteTransition;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001aMYS=\u007f\u0010u\u001c7o\f\u00176\u001c(\u0014S\rK.k\u000e\u0003)}(XeDRh(IG04G\u0017jQ\faYL?jB\u0002")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1695411770, "C(animateValue)P(1,2,3)338@13274L202:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:337)");
        }
        int i3 = (i2 >> 3) & 8;
        int i4 = ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 14)))) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE))) | (i3 << 3);
        int i5 = (i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2);
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = i3 << 6;
        int i8 = (-1) - (((-1) - ((i6 + i7) - (i6 & i7))) & ((-1) - (896 & i2)));
        int i9 = (i2 + 7168) - (7168 | i2);
        State stateAnimateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, ((i8 + i9) - (i8 & i9)) | (i2 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a=dV)\u000f\u0010u\u001c7o\f\u00176\u001c(\u0014S\rK.k\u000e\u0003)}(XeDRh(IG04G\u0017jQ\faYL?jB\u0002")
    @InterfaceC1492Gx
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f2, float f3, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 469472752, "C(animateFloat)P(1,2)357@13770L155:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        int i3 = (-1) - (((-1) - (i2 & 14)) & ((-1) - 24576));
        int i4 = (i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2);
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = 896 & i2;
        State<Float> stateAnimateFloat = animateFloat(infiniteTransition, f2, f3, infiniteRepeatableSpec, "FloatAnimation", composer, (-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - (i2 & 7168))), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateFloat;
    }
}
