package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D߬)\u001ew\u0005LDit\fA\u001c0\u0013.H\u0006*, }\u000ffp<8DsH6ɟ[*%k\u0004é,[:qK;c#\u0006̝\u0011Odgon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;Mu>A`\u000b6\rړ:\"Ny\r\u00010*P\u0010\rzKK\"\u00128@v<Z\rc\u0005\"\u0012\fA(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'e1\u0005M#F\\'\u0013yyӣ*NHM\u0015Se3\u000b`nW\u0003m\u0006m\u000fv<?1Yug6\u0007\u0017B+[Y\u001bu\u000b,l\u0007a`:AYh\u0014O^)@w)\u0018=@\u0012+\u001e'vL]\u001et'&3#\u0013\u0004D^#vB.|\u0012:%G\u00183Y;Kl_\u0005S\u001bd6*)=81&\u00077kV\u001e`CBdya1\u007fRknݳ\u000eYC\u0016ձtb\bSJ/ѓ~\u07fcɨ\u00150\u001dOE\u0007Q\u05fd y.`D\u0016\t5ov\u0001\u0002]XB2nDIX7ɔ^Dj-\u001cZb\bD\u0017]\u001ed\u0007,\u001aAN\r{J4=\u0010|c\u0019zx}u\u001751v7\b\u0001\u0002\r\u0006gӷ75W\f@r`(,LLd\u0015X\u0015Ti\u000b\t\u000b͈&2N\u0013@{\nvf\fAIou*gD1G\u0011EL\u0011SZA+?\u0010`vG\u0017VI#1\"js֊\u0005Pj*\b\u0003\u0007\u0004D|\u000f<]E_p1&\u0004^\u00198\u000b`\u001f~\"<\u000eх֙KLzT\u0016a\n\u008d.\u001agP\u0006ˌeä\u0003):ĈMQZr}Q{\u0011}ϖOɍ\u0013;p֫\b\u0016xqD`\u0019L&ܺ\u0019Ȕz`z#\u0016g \boJ\u0013G\u0012Vaϸ@ϗv\u0005a<\\;\u001d\u0013-#=\u0001\u001e$Sމ/ϡ+\u001f\u001ew\"25uko\b.(deկvФ\b4k\u0016}ei_8BFQy\u000bL+<l1A\u001f۴JڇF\t<ؿSTOn\tVfLaɁP֨\u000b,\u0015ߞvgH\u001e\b}b:6͉Fʸ\u0002\u0014fƹE\u001f[`\u007fm\u001cM3֨L؝\u000e\r\u00041|\u0015<Q.dob72\\֍\u001aݠECj\u0005J\f<62K\u0016\u0013c`w\u0016(z.R6ʖiЋFsCٙ\u0558T}dYNϕ|s_Չ.@І\u0013;,9M13l\u001d߇Дcҕ\u0005[+J3j}}=ޒłD"}, d2 = {"\u0011k^@X+\u001aZ$\u0002vM(\n\u000b/t", "", "\u0011k^@X+,Q\u0015\u0006zM(\n\u000b/t", "\u0012q^=W6P\\\u0001~\u0004n\u0010\f\t7D\u007f)wP\b&~C\u0003\u007f@u48", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0012q^=W6P\\\u0001~\u0004n\u0010\f\t7D\u007f)wP\b&~Kx\u007f@u48", "\u0012q^=W6P\\\u0001~\u0004n\u0010\f\t7H\n5\u007fU\u000b &Cvx8u$9b\u007f", "\u0012q^=W6P\\\u0001~\u0004n\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010", "5dc\u0011e6IR#\u0011\u0004F,\u0006\u0019 e\r7\u007f>|\u001e\u0002Cn\r@\u007f'", "u(5", "\u0013w_.a+>Rt\u0006\u0006a(k\u0005<g\u007f7", "\u0013w_.a+>R\u0007|ve,k\u0005<g\u007f7", "\u0017mC?T5LW(\u0003\u0005g\u000b\r\u0016+t\u00042\u0005", "", "\u001bd]B?0Lb|\u000ezf\n\u0007\u0012>a\u00041{Mc\u0017\u001bIr\u001d", "\u001bd]BI,Kb\u001d|ve\u0014x\u00161i\t", "5dc\u001aX5ND\u0019\f\nb*x\u0010\u0017a\r*\u007fI", "\u001dtc!e(Ga\u001d\u000e~h5[\u0019<a\u000f,\u0006I", "\u0012q^=W6P\\\u0001~\u0004n\n\u0007\u0012>e\t7", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3w_.a+>R\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", "", "BqP;f-H`!h\bb.\u0001\u0012\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bn]._\fES*z\nb6\u0006", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0012q^=W6P\\\u0001~\u0004n\n\u0007\u0012>e\t7C,\u0006a\fK:\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9P_5R~#VPX5&P|J\u0014[B\u001e]'\n\fY01jME#\u00170S\u000b)w|\u001b\u0016c\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_fDJI \u0011x\u0019\twL=\nQ:\r{Q\u0007qkF,D6.FxeTE9VF\u00050\u001eG\u000b{\u001c;\"b)\u00027\u000b;\u0018E`\u0014K=~:gw\"6`@:o4F\u001bJUqu6N\u00122!n\u0004\u0019e9/'/SfD\u001a\u00073{<\u0016H[\n6_\u0010BH\u0003^%P\u0007Me\b\u0015R\b.}nH?*X\u000b#:!,l\u0010\u0003\u0010T')8\u001c=/un4n>Q\u001cRmI\u0014EZS\u001enW\u0014wT\u0001%8\u007f-4\b\u0015S*\u0001!#r[B|\u001a\u001a3\u0014T|'{tL\b6\\25Fh<j`xhq[-#u8)t\u0011tr", "\u0012q^=W6P\\\u0001~\u0004n\u0010\f\t7C\n1\u000b@\n&", "BdgA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=m29\\*D", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>ia/7us8TMHy\n", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003x\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fD\u000fNKpyhE[2\u0007a\u0011\u001eFD1!CojR\u001c\u00153}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%z\u001f\u0019\u0010#itMM$\u001e\b\u0016\u0005N2nZm~e\u0017 7\u0018.U\u0016x*m\r4\u000f\u0012gE\u0016\u007fXV^nR\u0018xU\u0001[!p.F\u0002\u0010E07UE@VL~\u0010#0~\u001a\u0003'|3*\nE\u000f\",==Aq`<\u0007eb&#p&&/:/\u0002('jgv4\u001f\u0002\r{F\u0013gFC\fAA\u0013w2ErO\r<$0\u001a4X\u001f=`\u0002k&\u001fd", "1`[0h3:b\u0019m\bZ5\u000b\n9r\b\u0012\tD\u0003\u001b ", "/mR5b9\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", ";d]B56N\\\u0018\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<!\u001d!G\u000eL:bH>", ";`c2e0:Zfx\b^3|\u0005=e", "AbP9X", "/k_5T"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    public static final int InTransitionDuration = 120;
    private static final float MenuListItemContainerHeight;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m6638constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = Dp.m6638constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m6638constructorimpl(PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m6638constructorimpl(280);

    /* JADX INFO: renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$2 */
    /* JADX INFO: compiled from: Menu.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MenuItemColors $colors;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Function2<Composer, Integer, Unit> $text;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2) {
            super(2);
            function2 = function2;
            function0 = function0;
            modifier = modifier;
            function2 = function22;
            function2 = function23;
            z = z2;
            menuItemColors = menuItemColors;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            MenuKt.DropdownMenuItemContent(function2, function0, modifier, function2, function2, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: DropdownMenuContent-Qj0Zi0g */
    public static final void m2259DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final ScrollState scrollState, final Shape shape, final long j2, final float f2, final float f3, final BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-151448888);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenuContent)P(4,3,9,5,7,1:c#ui.graphics.Color,8:c#ui.unit.Dp,6:c#ui.unit.Dp)376@17481L47,379@17566L531,394@18135L460,408@18640L7,411@18715L587,428@19474L276,409@18652L1098:Menu.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableState) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            int i5 = composerStartRestartGroup.changed(scrollState) ? 2048 : 1024;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i6 = composerStartRestartGroup.changed(shape) ? 16384 : 8192;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(borderStroke) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((i3 + 306783379) - (306783379 | i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-151448888, i3, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            int i8 = MutableTransitionState.$stable;
            Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", composerStartRestartGroup, ((i8 + 48) - (i8 & 48)) | ((-1) - (((-1) - (i3 >> 3)) | ((-1) - 14))), 0);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i9) {
                    TweenSpec tweenSpecTween$default;
                    composer2.startReplaceGroup(1033023423);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1033023423, i9, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
                    }
                    if (segment.isTransitioningTo(false, true)) {
                        tweenSpecTween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                    } else {
                        tweenSpecTween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(2139028452);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(2139028452);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f5), menuKt$DropdownMenuContent$scale$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i9) {
                    TweenSpec tweenSpecTween$default;
                    composer2.startReplaceGroup(-1355418157);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355418157, i9, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
                    }
                    if (segment.isTransitioningTo(false, true)) {
                        tweenSpecTween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                    } else {
                        tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-249413128);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-249413128);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f7), menuKt$DropdownMenuContent$alpha$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final boolean zBooleanValue5 = ((Boolean) objConsume).booleanValue();
            Modifier.Companion companion = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 526637745, "CC(remember):Menu.kt#9igjgp");
            int i9 = (-1) - (((-1) - (composerStartRestartGroup.changed(zBooleanValue5) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(stateCreateTransitionAnimation) ? 1 : 0))) != 1 ? 0 : 1;
            int i10 = ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) == 32 || ((-1) - (((-1) - i3) | ((-1) - 64)) != 0 && composerStartRestartGroup.changedInstance(mutableTransitionState))) ? 1 : 0;
            int i11 = ((i9 + i10) - (i9 & i10)) | (composerStartRestartGroup.changed(stateCreateTransitionAnimation2) ? 1 : 0) | ((i3 & 896) == 256 ? 1 : 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        float fDropdownMenuContent_Qj0Zi0g$lambda$1;
                        float fDropdownMenuContent_Qj0Zi0g$lambda$12 = 0.8f;
                        float fDropdownMenuContent_Qj0Zi0g$lambda$3 = 1.0f;
                        if (!zBooleanValue5) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$1 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$1(stateCreateTransitionAnimation);
                        } else {
                            fDropdownMenuContent_Qj0Zi0g$lambda$1 = mutableTransitionState.getTargetState().booleanValue() ? 1.0f : 0.8f;
                        }
                        graphicsLayerScope.setScaleX(fDropdownMenuContent_Qj0Zi0g$lambda$1);
                        if (!zBooleanValue5) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$12 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$1(stateCreateTransitionAnimation);
                        } else if (mutableTransitionState.getTargetState().booleanValue()) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$12 = 1.0f;
                        }
                        graphicsLayerScope.setScaleY(fDropdownMenuContent_Qj0Zi0g$lambda$12);
                        if (!zBooleanValue5) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$3 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$3(stateCreateTransitionAnimation2);
                        } else if (!mutableTransitionState.getTargetState().booleanValue()) {
                            fDropdownMenuContent_Qj0Zi0g$lambda$3 = 0.0f;
                        }
                        graphicsLayerScope.setAlpha(fDropdownMenuContent_Qj0Zi0g$lambda$3);
                        graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(mutableState.getValue().m4568unboximpl());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1573559053, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C429@19484L260:Menu.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1573559053, i12, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m1020paddingVpY3zN4$default(modifier, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i12 = i3 >> 9;
            int i13 = (-1) - (((-1) - ((-1) - (((-1) - i12) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 12582912));
            int i14 = (-1) - (((-1) - i12) | ((-1) - 896));
            int i15 = i3 >> 6;
            int i16 = (-1) - (((-1) - (((i14 + i13) - (i14 & i13)) | ((-1) - (((-1) - 57344) | ((-1) - i15))))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i15)))));
            int i17 = i15 & 3670016;
            SurfaceKt.m2561SurfaceT9BRK9s(modifierGraphicsLayer, shape, j2, 0L, f2, f3, borderStroke, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i16 + i17) - (i16 & i17), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i18) {
                    MenuKt.m2259DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    public static final void DropdownMenuItemContent(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z2, final MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1564716777);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DropdownMenuItemContent)P(7,6,5,4,8,2)459@20361L36,452@20118L2520:Menu.kt#uh7d8r");
        final Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        if ((i2 & 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function24) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024)));
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((196608 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i3 |= composerStartRestartGroup.changed(menuItemColors) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            int i6 = composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((100663296 & i2) == 0) {
            int i7 = composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i3, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m1067sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m604clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z2, null, null, function0, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuListItemContainerHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1949444430, "C472@20996L10,472@21019L1613,472@20965L1667:Menu.kt#uh7d8r");
            function24 = function24;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1065051884, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C482@21484L763,482@21405L842,506@22429L179,504@22304L304:Menu.kt#uh7d8r");
                    if ((-1) - (((-1) - i8) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1065051884, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
                        }
                        composer2.startReplaceGroup(1264683960);
                        ComposerKt.sourceInformation(composer2, "476@21201L177,474@21076L302");
                        if (function22 != null) {
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(menuItemColors.m2256leadingIconColorvNxB06k$material3_release(z2)));
                            final Function2<Composer, Integer, Unit> function25 = function22;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2035552199, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    ComposerKt.sourceInformation(composer3, "C477@21223L137:Menu.kt#uh7d8r");
                                    if ((3 & i9) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2035552199, i9, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                                    }
                                    Modifier modifierM1048defaultMinSizeVpY3zN4$default = SizeKt.m1048defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m3324getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                    Function2<Composer, Integer, Unit> function26 = function25;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1048defaultMinSizeVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 601834023, "C478@21325L13:Menu.kt#uh7d8r");
                                    function26.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            int i9 = ProvidedValue.$stable;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, composableLambdaRememberComposableLambda, composer2, (i9 + 48) - (i9 & 48));
                        }
                        composer2.endReplaceGroup();
                        ProvidedValue<Color> providedValueProvides2 = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(menuItemColors.m2257textColorvNxB06k$material3_release(z2)));
                        final RowScope rowScope = rowScopeInstance;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1728894036, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                float fM6638constructorimpl;
                                float fM6638constructorimpl2;
                                ComposerKt.sourceInformation(composer3, "C483@21502L731:Menu.kt#uh7d8r");
                                if ((i10 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1728894036, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                                    }
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null);
                                    if (function26 != null) {
                                        fM6638constructorimpl = MenuKt.DropdownMenuItemHorizontalPadding;
                                    } else {
                                        fM6638constructorimpl = Dp.m6638constructorimpl(0);
                                    }
                                    if (function27 != null) {
                                        fM6638constructorimpl2 = MenuKt.DropdownMenuItemHorizontalPadding;
                                    } else {
                                        fM6638constructorimpl2 = Dp.m6638constructorimpl(0);
                                    }
                                    Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(modifierWeight$default, fM6638constructorimpl, 0.0f, fM6638constructorimpl2, 0.0f, 10, null);
                                    Function2<Composer, Integer, Unit> function29 = function28;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1022paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 602710734, "C500@22209L6:Menu.kt#uh7d8r");
                                    function29.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54);
                        int i10 = ProvidedValue.$stable;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, composableLambdaRememberComposableLambda2, composer2, (i10 + 48) - (i10 & 48));
                        if (function23 != null) {
                            ProvidedValue<Color> providedValueProvides3 = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(menuItemColors.m2258trailingIconColorvNxB06k$material3_release(z2)));
                            final Function2<Composer, Integer, Unit> function29 = function23;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides3, ComposableLambdaKt.rememberComposableLambda(580312062, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    ComposerKt.sourceInformation(composer3, "C507@22451L139:Menu.kt#uh7d8r");
                                    if ((-1) - (((-1) - i11) | ((-1) - 3)) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(580312062, i11, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                                    }
                                    Modifier modifierM1048defaultMinSizeVpY3zN4$default = SizeKt.m1048defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m3332getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                    Function2<Composer, Integer, Unit> function210 = function29;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1048defaultMinSizeVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 603053222, "C508@22554L14:Menu.kt#uh7d8r");
                                    function210.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt.DropdownMenuItemContent.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ MenuItemColors $colors;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Function2<Composer, Integer, Unit> $text;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(final Function2<? super Composer, ? super Integer, Unit> function242, Function0<Unit> function02, Modifier modifier2, final Function2<? super Composer, ? super Integer, Unit> function222, final Function2<? super Composer, ? super Integer, Unit> function232, final boolean z22, final MenuItemColors menuItemColors2, PaddingValues paddingValues2, MutableInteractionSource mutableInteractionSource2, int i22) {
                    super(2);
                    function2 = function242;
                    function0 = function02;
                    modifier = modifier2;
                    function2 = function222;
                    function2 = function232;
                    z = z22;
                    menuItemColors = menuItemColors2;
                    paddingValues = paddingValues2;
                    mutableInteractionSource = mutableInteractionSource2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    MenuKt.DropdownMenuItemContent(function2, function0, modifier, function2, function2, z, menuItemColors, paddingValues, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            int r2 = r6.getLeft()
            int r0 = r5.getRight()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r2 < r0) goto L58
        Ld:
            r3 = r4
        Le:
            int r2 = r6.getTop()
            int r0 = r5.getBottom()
            if (r2 < r0) goto L1e
        L18:
            r1 = r4
        L19:
            long r0 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r3, r1)
            return r0
        L1e:
            int r2 = r6.getBottom()
            int r0 = r5.getTop()
            if (r2 > r0) goto L29
            goto L19
        L29:
            int r0 = r6.getHeight()
            if (r0 != 0) goto L30
            goto L18
        L30:
            int r1 = r5.getTop()
            int r0 = r6.getTop()
            int r2 = java.lang.Math.max(r1, r0)
            int r1 = r5.getBottom()
            int r0 = r6.getBottom()
            int r0 = java.lang.Math.min(r1, r0)
            int r2 = r2 + r0
            int r1 = r2 / 2
            int r0 = r6.getTop()
            int r1 = r1 - r0
            float r1 = (float) r1
            int r0 = r6.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L19
        L58:
            int r2 = r6.getRight()
            int r0 = r5.getLeft()
            if (r2 > r0) goto L64
            r3 = r1
            goto Le
        L64:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L6b
            goto Ld
        L6b:
            int r2 = r5.getLeft()
            int r0 = r6.getLeft()
            int r3 = java.lang.Math.max(r2, r0)
            int r2 = r5.getRight()
            int r0 = r6.getRight()
            int r0 = java.lang.Math.min(r2, r0)
            int r3 = r3 + r0
            int r2 = r3 / 2
            int r0 = r6.getLeft()
            int r2 = r2 - r0
            float r3 = (float) r2
            int r0 = r6.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float DropdownMenuContent_Qj0Zi0g$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float DropdownMenuContent_Qj0Zi0g$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f2 = 48;
        MenuVerticalMargin = Dp.m6638constructorimpl(f2);
        MenuListItemContainerHeight = Dp.m6638constructorimpl(f2);
    }
}
