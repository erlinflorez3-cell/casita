package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0RqP.XT2\u000f\u0002{<řc$\bCCU0}*\teNog\u0005Jb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0014'jPģW9]qM9\u000ftd\u0004H2P9*\t\u000f\u001cBH>v+GY\u000f*0npj\\\u001bQ\u001d \"\bN /\u001e\u000bl\u0015;֘kҗƠ3%\toPU?\">ŧe\u0013VV7\r%aL*h7c\u0016UW\u0011\tj[m\u0003ouK\b\u0001'U+y}e:p\u0006$\u0017;O;]!+\r\u000bW`\u001a/CO\u0012T\u0017\u0013Âv\u07beԫ\u0011>\n\u0018\u00142`͖,(Ǒ \u0014Cv\u0003SnP0]b\u0002\u0001ʨD#M\u0006C-I\u001b-]\u0010HIv=\u0004\u0013\u001b6E\u0011v1ad\u0010p\u0015a`&aAYPCXP\u001aYkm2\u0002\u0011\u0011ò\b0M\u0012\u009e\u007f\u00114*U=a91)\u0004\u0002vM\u0018\u001b\u0013t\u0001sycXOhzގ;4\u000f!jJj\u001b{RZ^R(]\u001ed\u0007,\bA/Ϣ{<'7VʢUŹmj[u܆%4n:_ˆ\b<VߓbL"}, d2 = {"/mX:T;>1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;ZA\u001a\u001eveH\u000bm5$", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;X4)\u0015dp5\u0004j,<\u0002'E\"", "/mX:T;>1#\u0006\u0005ksil\u001bo\n;\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\f,3J5[_|A\u0013%$\fX3\u0018\u000fgAmjM;'\u0004;M\fD2~\u0016#\u000e~NyCZ\u0019K\t\u0015bA4hBh[vNA3m*baF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<_\npvK!z\u0002\u0002HufPSob\u0012Xj\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015t(Gm|\u001d,&/6\"E<h", ":`Q2_", "", "/mX:T;>1#\u0006\u0005ks[w-f\u0011\u000f\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\f,3J5[_|A\u0013%$\fX3\u0018\u000fgAmjM;'\u0004;M\fD2~\u0016#\u000e~NyCZ\u0019K\t\u0015bA4hBh[vNA3m*baF\"XK6m\u001bm\"\u001d2>=\u0017\u007f\\\u0013H9upfT#~77\bkeNPyc<>4/T\u000b{\u001a2\"R5|8\u000eB*C:h/+~:gw\"6`@:o4F\u001bJUqu6K\u001eq.e\u0010\u000e,#@\u0015te9", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BqP;f0MW#\bhi,z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "B`a4X;/O \u000fz;@j\u0018+t\u007f", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0005tn1E\u001372\b\b\u001f\u0010~X\u007fOZ\u0019IO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fI\u00050.O\u0004w[\u0010b|6~;\u0004A\u007f\u001aHH2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQ{q1@\u0019;", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransitionKt {
    public static final <S> State<Color> animateColor(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Color> function32, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>() { // from class: androidx.compose.animation.TransitionKt.animateColor.1
                public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    composer2.startReplaceGroup(-1457805428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457805428, i4, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str2 = "ColorAnimation";
        }
        ColorSpace colorSpaceM4182getColorSpaceimpl = Color.m4182getColorSpaceimpl(function32.invoke(transition.getTargetState(), composer, Integer.valueOf((i2 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)).m4188unboximpl());
        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean zChanged = composer.changed(colorSpaceM4182getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM4182getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = (i5 + 896) - (896 | i5);
        int i7 = (-1) - (((-1) - ((i4 + i6) - (i4 & i6))) & ((-1) - ((i5 + 7168) - (7168 | i5))));
        int i8 = (i5 + 57344) - (i5 | 57344);
        int i9 = (i7 + i8) - (i7 & i8);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        S currentState = transition.getCurrentState();
        int i10 = i9 >> 9;
        int i11 = (i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        State<Color> stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, function32.invoke(currentState, composer, Integer.valueOf(i11)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i11)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), (TwoWayConverter) objRememberedValue, str2, composer, (-1) - (((-1) - ((-1) - (((-1) - i9) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - (i9 << 6)) | ((-1) - 458752))))));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCreateTransitionAnimation;
    }

    /* JADX INFO: renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m463animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, 1901963533, "C(animateColor)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color)102@4596L72,105@4680L72:Transition.kt#xbi5r1");
        if ((i3 & 8) != 0) {
            str2 = "ColorAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1918449973, "CC(remember):Transition.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4182getColorSpaceimpl(j3));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i2 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m4168boximpl(j2), Color.m4168boximpl(j3), (TwoWayConverter) objRememberedValue, infiniteRepeatableSpec, str2, composer, ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (InfiniteTransition.$stable | ((-1) - (((-1) - i2) | ((-1) - 14))))) & ((-1) - (112 & i2))))) & ((-1) - (896 & i2))))) & ((-1) - (InfiniteRepeatableSpec.$stable << 12)))) | (57344 & i4) | ((i4 + 458752) - (i4 | 458752)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a:gS7\r\u0010u\u001c7o\f\u00176\u001c(\u0014S\rK.k\u000e\u0003)}(XeDRh(IG04G\u0017jQ\faYL?jB\u0002")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m464animateColorRIQooxk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1400583834, "C(animateColor)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color)117@5040L143:Transition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        int i3 = (-1) - (((-1) - (InfiniteTransition.$stable | 24576)) & ((-1) - (14 & i2)));
        int i4 = (-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = 896 & i2;
        State<Color> stateM463animateColorDTcfvLk = m463animateColorDTcfvLk(infiniteTransition, j2, j3, infiniteRepeatableSpec, "ColorAnimation", composer, ((-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - (InfiniteRepeatableSpec.$stable << 9)))) | ((-1) - (((-1) - i2) | ((-1) - 7168))), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM463animateColorDTcfvLk;
    }
}
