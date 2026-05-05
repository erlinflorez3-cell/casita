package androidx.compose.material3.carousel;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: Carousel.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u0006\fnj?1Le^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmktтZ!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b#M?eokF\u0011xD\u001382PG*\u0011\u0007\u001a8X(|\u000bE[\f@9n\u0002j^\u0013M\u0013,*\fN\"\u0011\u001e\u000bp|I\u000fqҺ>/1\u00172M\\<w0+ZSKù+\r\u0005wfNNNM\u0015S`3\u000b`iW\u0003m\u0001m\u0011n'5=ayg8h\u007fB\u001eYbSbę*\\\u0013i1&5,gcyRdߋy¶zȞ˖\u0003\rΝ+P6-(k \u00109w\u0001W\u0011j\u0010dZ\u007f)c\rЎ'Ƨ2ٿ߆\u001aeЂeC!NE\u0001\u001d\u000f$*\u000frqgb\u0016x\u0015I]N΄\u0004ҨD=PݐZsKw\u001cp\u0011\u0004\u0001ʷ2ѓ~\u07fcʾ\u0010-ϲ)?c91&\u0004\u0004NOuzݖ`q[lX͔\\Pm\u001e70(ɚ^]"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cGa:\u0003s3]\u0005|", "", "u(E", "\u000fmR5b9,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000ea*A]&l~s,Dg\u0003E\u0005w|(?\u001f\u0013Vo\u001b@r,\u0003S\u000b >m\u0012<M", "u(5", "\u0014", "\u001b`g `(EZ|\u000ezf\u001a\u0001\u001e/", "5dc\u001aT?,[\u0015\u0006\u0002B;|\u0011\u001di\u0015(C\u001fTv\u001c\u0017puz~!DY\u000b$3tc(ZCBk0,\u0015", "\u001bdS6h4%O&\u0001zB;|\u0011\u000ei\u0001)jC\u000e\u0017%Jy\u0015;", "", "\u001bh] `(EZ|\u000ezf\u001a\u0001\u001e/", "5dc\u001a\\5,[\u0015\u0006\u0002B;|\u0011\u001di\u0015(C\u001fTv\u001c\u0017puz~!DY\u000b$3tc(ZCBk0,\u0015", ";t[A\\\tK]+\rz?3\u0001\u00121B\u007f+wQ\u0005!$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cVp5\u0016c\u0002", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oOH\u0003r,$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNUJ(v@F#\u00125\u0013\u007fEu\u0001Ut\u000e3f\u0005\u001e_\u0014Ou$yK2VQY]O.=Na7n\u0010^0&8D,\u001f{'\u001b2L7\u000e\u0004O v\\\u00031eQ&z\u0002\u007fGqcBTs_Eb2\u001fIQ^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bk\t\u001e;`I'o\u0014F\u001bJUquy\u0014qLbH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+`\u000bG[\u0005:Xs\u001f0\u0010\u0001Bi\t%\u0016\u000727TEP\u001dT\u0010\u001ao%)c\u001a\u0005_f\u001b\u0018?\u001aGfd", "<nB;T7\u001fZ\u001d\b|;,\u007f\u0005@i\n5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018-\r\u0013hQ1nR\u0001\u000e\u00049K\u0002Jh\u007fl\u001d\u0012>lMBY\fX}\u001f\u0003\u0017", "Ah]4_,\u001aR*z\u0004\\,]\u00103n\u0002\u0005{C|(\u001bQ|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oOH\u0003r,$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNUJ(v@F#\u00125\u0013\u007fEu\u0001Uq\u00179rlQZ\u001aPg u?~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"u5\u00056\u000309:n\u000e\u0015i\u0018Lm\t\",j\u000b\u0016\"C>\u0013NKbVsB\u0017j{a\u000b\ns9;&;", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CarouselDefaults {
    public static final int $stable = 0;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    public static final CarouselDefaults INSTANCE = new CarouselDefaults();
    private static final float MinSmallItemSize = Dp.m6638constructorimpl(40);
    private static final float MaxSmallItemSize = Dp.m6638constructorimpl(56);
    private static final float AnchorSize = Dp.m6638constructorimpl(10);

    private CarouselDefaults() {
    }

    public final TargetedFlingBehavior singleAdvanceFlingBehavior(CarouselState carouselState, AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        SpringSpec springSpecSpring$default = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, 1701587199, "C(singleAdvanceFlingBehavior)P(1)612@27409L174:Carousel.kt#dcf9yb");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1701587199, i2, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:611)");
        }
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3_release(), PagerSnapDistance.Companion.atMost(1), null, springSpecSpring$default, 0.0f, composer, ((i2 << 6) & 7168) | (PagerDefaults.$stable << 15), 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehaviorFlingBehavior;
    }

    public final TargetedFlingBehavior multiBrowseFlingBehavior(CarouselState carouselState, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        SpringSpec springSpecSpring$default = animationSpec;
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = decayAnimationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -1105043293, "C(multiBrowseFlingBehavior)P(2)642@29119L26,657@29722L217:Carousel.kt#dcf9yb");
        if ((i3 & 2) != 0) {
            decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105043293, i2, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:644)");
        }
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState$material3_release(), new PagerSnapDistance() { // from class: androidx.compose.material3.carousel.CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1
            @Override // androidx.compose.foundation.pager.PagerSnapDistance
            public int calculateTargetPage(int i4, int i5, float f2, int i6, int i7) {
                return i5;
            }
        }, decayAnimationSpecRememberSplineBasedDecay, springSpecSpring$default, 0.0f, composer, ((i2 << 3) & 8064) | (PagerDefaults.$stable << 15), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehaviorFlingBehavior;
    }

    public final TargetedFlingBehavior noSnapFlingBehavior(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -418415756, "C(noSnapFlingBehavior)674@30353L158,680@30528L75:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-418415756, i2, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:673)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1269150096, "CC(remember):Carousel.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f2) {
                    return 0.0f;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TargetedFlingBehavior targetedFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) objRememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehaviorRememberSnapFlingBehavior;
    }

    /* JADX INFO: renamed from: getMinSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m2899getMinSmallItemSizeD9Ej5fM$material3_release() {
        return MinSmallItemSize;
    }

    /* JADX INFO: renamed from: getMaxSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m2898getMaxSmallItemSizeD9Ej5fM$material3_release() {
        return MaxSmallItemSize;
    }

    /* JADX INFO: renamed from: getAnchorSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m2897getAnchorSizeD9Ej5fM$material3_release() {
        return AnchorSize;
    }
}
