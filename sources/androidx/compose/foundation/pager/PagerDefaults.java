package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
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
/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$\u007fHC٥\"}8\tWNmhvJp\u000bKƤ\u000e\u0016\u000fj4I[xcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2j\u007f\b\b\u0019\u001aXL@z\tHc\f@6pv@R\u001bT\u001d\u001a@\u000en,\u0007\u001ejpf<Xnm:].1srZ-_>\te\u0013VV7\r%lL8p=;\u00163a\u001b\u0007\u0001f\u0006\bӭu=\u0013woB9Y\fWdi0\u0018#0g\r\fxV`\u0013cx\fU>\u0016hׂT\u000e6\fK\b\u001b=\u001c\u000e4)\u001f͚\u007fբj\b\u0016ޗϨvh"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\u001ak5\u001a%opG\\", "", "u(E", "\u0010dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", "", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", ">`V2e\u001aGO$]~l;x\u0012-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)t0)sloH\u0003l*NL", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "AmP=C6LW(\u0003\u0005g(\u0004w2r\u007f6~J\b\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001*\u0004.I\u000f\u0005S|\u000e\u0016\u001b#slM5\u0014U\t\u0011~?)>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1&\u0019x48\u001av_NA~YF}\u0015*KyMx.as8~1\u0003Gs4n\rVq&>(t\u001e0d=6*@E\\=Upu6\u001a\u0017l']\u0017\u0012l>\u001f$ec9)u\u0003f\u0016h?e^\u0014\u0001P\u0010FTy#'\u0010\fRd\t\u0019\u0011\u0007mKoQN%b\u0001'F(\u0006#w~\fe%&2\u0015P#\rr2jA[\u0013RiB\u001c\u0005X?$tR\u00197Mrif\u007f16\u0007Z8\u001d@M<\u0006RBP\u0017\u001a=\u0003g~ ozF\u0004Ch", ">`V2A,Lb\u0019}h\\9\u0007\u00106C\n1\u0005@~&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001!\b:X\u0012Hh\u000fU\u007f\u001b9jyQR\u001fK\u0004\u001eK(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\f\u0014\u0004^\u001b\u0001R\u0007=K\u000b\u007fvA#Kw_EX9SF|2)Y{A\"6\"x4\u007f=\u0013}36r\u0014Kf&<k\u0003\u001c3&*'4E<\u0012-Ip\u007fsEkr(j\b\fq9;\";", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    public final TargetedFlingBehavior flingBehavior(final PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, final float f2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1559769181, "C(flingBehavior)P(4,1)295@16853L26,306@17415L7,307@17474L7,308@17497L1053:Pager.kt#g6yjnt");
        int i4 = 1;
        if ((i3 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.Companion.atMost(1);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 1, null);
        }
        if ((i3 & 16) != 0) {
            f2 = 0.5f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1559769181, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2).toString());
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object obj = (Density) objConsume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
        ComposerKt.sourceInformationMarkerStart(composer, -1107496563, "CC(remember):Pager.kt#9igjgp");
        int i5 = (((((14 & i2) ^ 6) <= 4 || !composer.changed(pagerState)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1) | (composer.changed(decayAnimationSpec) ? 1 : 0) | (composer.changed(animationSpec) ? 1 : 0);
        if ((((112 & i2) ^ 48) <= 32 || !composer.changed(pagerSnapDistance)) && (i2 + 48) - (i2 | 48) != 32) {
            i4 = 0;
        }
        int i6 = (-1) - (((-1) - ((i5 + i4) - (i5 & i4))) & ((-1) - (composer.changed(obj) ? 1 : 0)));
        boolean zChanged = composer.changed(layoutDirection);
        int i7 = (i6 + (zChanged ? 1 : 0)) - (i6 & (zChanged ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i7 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, new Function3<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Float invoke(Float f3, Float f4, Float f5) {
                    return invoke(f3.floatValue(), f4.floatValue(), f5.floatValue());
                }

                public final Float invoke(float f3, float f4, float f5) {
                    return Float.valueOf(PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(pagerState, layoutDirection, f2, f3, f4, f5));
                }
            }), decayAnimationSpec, animationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehavior;
    }

    public final NestedScrollConnection pageNestedScrollConnection(PagerState pagerState, Orientation orientation, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 877583120, "C(pageNestedScrollConnection)P(1)351@19018L107:Pager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877583120, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1511248710, "CC(remember):Pager.kt#9igjgp");
        int i3 = ((((14 & i2) ^ 6) <= 4 || !composer.changed(pagerState)) && (6 & i2) != 4) ? 0 : 1;
        int i4 = ((((112 & i2) ^ 48) > 32 && composer.changed(orientation)) || (i2 + 48) - (i2 | 48) == 32) ? 1 : 0;
        int i5 = (i3 + i4) - (i3 & i4);
        Object objRememberedValue = composer.rememberedValue();
        if (i5 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultPagerNestedScrollConnection;
    }
}
