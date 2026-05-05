package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*\tUPog\u0005Jb\u000bY\u000f\u000e\u0016~q4Ikxe\u0012\u00154ZPM\u074ceok8\u0011~D\u0005882:\n\u0005/\u0019XI@|\u0001CY\u000e*0nsjX\u0013M\u0013\u001e*\u0006l%1$bg\\<`l\fA_)\tiPV?_^\u0006}\u0015LT5\u0017\u000fc4*nBe$3_\u001b\u0012b]O\u0003mpk\u0006ص+'1V:\\͏\\\u007f\"#C>\u001bl\u000b&\u000b\u0004\u0002d\u001a7CO\u0012P\u0001\u001e6\t\u0013\b\u001d>\u0014\u000e4,X0=\u001a\u0015\u0007<E%xY@^\u0004vB.}\u0012<\u001d%\u000e7C9Ik\u0002gA\u0019\\=\u0014\u0005;%S\u0007t!i\\&`C.\u0005\u007fW1_JUJd\t\bH\u001e\u0013~n\u001a5\u00142W\u007f]z?/ϲ)7aFi&Ƞ\u0006HR{\u000fen}ki\u0001Gp,|\u0016O0\u0019\u000ejD\u0013\u0004\u001aQ\u0005^2\u0011[\u001el\u0007,\u000bC&bwJ%=\u0010|T\u0019opMk\u0010=/\u0015>\ntq\u000eeAv3cZ\u0014\u0018gR\u0005\u001eW>x\u0004\u0007qrb\u001aft324Xj>v*E«\u0010\u00138L8!ٜ01'j-7\u00114ZA+\b\u0010^v \u0017Ta)3y2\u0006!\r`^\u0001o\u0016}Y.\r`P,oce\u001f,U0jL|Q\n/y\u0006GuP_L\u001b\u001b&[\u0002 $ QQ]DC\u0015\u0005)@\nEEz\u0006\u0016YS\u00125\u0005\u0015{%:\u00179\u0018\u0017x|DkzL_TE!%_ѓ'\bj\r@fâ~Gqh#2L`\u000b\u0003\b;~B\u000b\u00057$5\u0003\u007f\"+4[DW#\u001cw\"1-a\fl 4\u007fb\u001d*\re21\u0014\u001cub_eJ;fR\n\u0007D\"2v\u001bD^i&\u0013r\u0018B\u0019KSQf\u0001VfL90̱j\u00072\u001a7[ݍ>\u0013}\u0016L\u0013mC\fC,\u0013\u000fG3!eS\u0016r\u001e[j\u001cb\u001b\u001a\r\f1\u001d\u0017,?0V\u0006a7B6y\u001e6O=z\u0005j\fT:2<\u0016\u000f[T\u0018\u000b@\u0001\u0006Fm\u0017/2p\u0007k^\u0014T\u0007fnJ\u001b_skQ9\u000f\u000b'>.zE13ltUвg2\u0007`c\u000eƨnO\r\u0001=\u0018RoQ\u001bVW1\u0015S][O\u00128\u0014GWl\u001ap<>\u001e|+D0\u001bgTAe|0l\u000fmd|i'\u0018lR\\(A~)\u0004>B\u0010\u000f\u0019!gr\u001ek]TTwE_2\u0003-CW$<\u0005iF)7\u001e7C<wuD6\nckF\u000e\n0 U\u0003#\"Ǜ[\u000el\u0017$ Ɛ\u001aq$\u0001\u001a\u0004!o8\u0004\\I%v\u0018> 6}\u0007c\u0012!oqw\b#P'Yq\u0016D[h'\t\u0012~\u0014t[\u000b\u0011hIV(q]V#\t5QF\u0013\u0007_j\u0017Y f\u0017\u0018\u0014C-O<\u000eb7\u0018gc\u0017\u0004\u001cWa\r9K\u0004,w0^oN\u0006%y\u0004\u000eBV>\u0014ia}Mr\u0015twRY\u001e^\u0019'\u0013uצ-\u0014\u0003\f\u000fcǚ\u00174T\u0013ۦhP"}, d2 = {"\u0014h[9X+\"Q#\bWn;\f\u00138", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bZ0F| 7+MBuA,j", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>-UhxTKIa=.\ni%gDH$]y\u0015*h]2\u0006\u0003!ZVP\u0004pDW(\nB-\u001cwbPR}+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fe\u000f[p\u0017:m|\u001f5&E056I\u000f=Zg\u007fu\bux.]\u0005\u0015b\u0019:(er_F\u001e\u000bg I?ql~7(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f3m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#P%yW\u0014uK<9aw/@\u0007\u0011Vv\u0017/\u007fg", "\u0014h[9X+\"Q#\bih.~\u0010/B\u00107\u000bJ\n", "1gT0^,=", "=m25X*DS\u0018\\}Z5~\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z#?bl*9o\u001d.*SJz>'rrhC\u0014q\u0002", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_\u0010Bf{EZ\u000eUC\u0003x=4h\u001c@[\u0003FNOf)wU]'dED2\u0014;!\u0017wP;\u000ewZ^<6wqp6#|:+>JkUTy^\u001a~.)X\nMx.as8~1\u0003Gs4n\rVq&>(y\u001f<e@#5:F\u001c\tOl\u0005lK\nf.e\u0012\u0017,\u001dA(abjHr\u0010l\u0017h1_n\u0005A[sHY|\u0013'\u001ceHe\t\u001c\r\u0010mrvQ\r\u001cd\n\u0018\u007fH,h\u001fLcv!\u001a=\u001aGb[>\u0011[@L \u0013l7\u001fEWM\u001d{R\u001em\u0015\u007fk`~(>xZ'+;VF\u0005RPEsywq", "\u0014h[9X+-]\"z\u0002B*\u0007\u0012\fu\u000f7\u0006I", "\u0014h[9X+-]\"z\u0002B*\u0007\u0012\u001eo\u0002*\u0003@]'&Vy\u0017", "\u0017b^;5<Mb#\b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005p|\u001b\u0016\u001b9fw\u0010 sE\u0004\u001eRQ8wPb=\u0004NKRp\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d\u0012|b\u0003fcV\u001d\u0005AmBvjFRkSKx1(\u0015c\b!.U{+X6\u0013472b\u0014Oq!,h\t\"*\\\u0017\u000e,@K\u001aCT-z}FWi/j\u0006\u001df?:'/FsQ\r\u0016a!d\u00027F|@Q\u0013HMn(pD\tJf\u0004#\tP1}nXG#TJwzL-i\u001f\u0003\u0010<{\u007fq\u0007", "\u0017b^;G6@U ~Wn;\f\u00138", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\t\b%\u000eBnlI$Y+w\u001f~03jH`_VWPTl3B\u0016f'iH\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011\u001a\u0005H-=ijJOx\u001f@}6\u001fXwu!6b}t\\=\u00130'=dhTv\u0018KZv$0fJ\u00150FI\u0011?!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\u000b\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u000e*yS&g\u0011L`p '8$=fdL\u000e#(", "\u001dtc9\\5>R||\u0005g\t\r\u0018>o\t", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>-UhxTKIa=.\ni%gDH$]y\u0015*h]2\u0006\u0003!ZVP\u0004pDW(\nB-\u001cwbPR}+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fe\u000f[p\u0017:m|\u001f5&\u001e135< -Zp\u007fr>cO\u001bj\u0007\u001bl90,/cmP\u001a\u0011k\u0017%6ko\n6N\u0015BSx^+O\u000eBhu\u0013\u0018\u000b.v/1S*P}!p(+n\u0011\u0010~d' 8\u001f+c\u001fu(_\r4\u0019\u0013w?\u0010\u0005#H&x\u0012\u0011}Tpj[y-DBqY*1Z@\u0001[\u0010Ev\u0012=\u007f\u0018\t!r|\fw@\u001b0/KY\u0002op8\u001ak[\"bEB$*7?\u0002_\u0016RB;\u0018", "\u001dtc9\\5>R||\u0005g\u001b\u0007\u000b1l\u007f\u0005\fO\u0010! ", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_\u0010Bf{EZ\u000eUC\u0003x=4h\u001c@[\u0003FNOf)wU]'dED2\u0014;!\u0017wP;\u000ewZ^<6wqp6#|:+>JkUTy^\u001a~.)X\nMx.as8~1\u0003Gs4n\rVq&>(y\u001f<e@#5:F\u001c\t(m\u0003k>\u001bV.n\u0012\u0014b\u000b\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bERO?S\u007f\u001e&B\u000eFe\u0003^\r\u00103mrEA*X\u000b#:,2n\r\u007f\nf{%=\u0016JU\rw.i@;\u001d\u0019u6\fQ@I\u001f\u007fO\u0014v\u0015wl_9%F\u0002\u000fX%=TJ@3Sx\u000e%8\u000b\u0014KrZeKxC\u001d)$P#6lh:\u0015uSk&wA+#51K0Jvi\u00025\u0015\u000bcL`XN", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IconButtonKt {

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ IconButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function0<Unit> function0 = function0;
            Modifier modifier = modifier;
            boolean z2 = z;
            Shape shape = shape;
            IconButtonColors iconButtonColors = iconButtonColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function2<Composer, Integer, Unit> function2 = function2;
            int i3 = i;
            IconButtonKt.FilledIconButton(function0, modifier, z2, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06423 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ IconToggleButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06423(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            z = z3;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.FilledIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06453 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ IconButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06453(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.FilledTonalIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06483 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ IconToggleButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06483(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            z = z3;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.FilledTonalIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$IconButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06492 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ IconButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06492(Function0<Unit> function0, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$IconToggleButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06502 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ IconToggleButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06502(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            z = z3;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            boolean z2 = z;
            Function1<Boolean, Unit> function1 = function1;
            Modifier modifier = modifier;
            boolean z3 = z;
            IconToggleButtonColors iconToggleButtonColors = iconToggleButtonColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function2<Composer, Integer, Unit> function2 = function2;
            int i3 = i;
            IconButtonKt.IconToggleButton(z2, function1, modifier, z3, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06533 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ IconButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06533(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconButtonColors = iconButtonColors;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.OutlinedIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3 */
    /* JADX INFO: compiled from: IconButton.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06563 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ IconToggleButtonColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06563(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            z = z3;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            IconButtonKt.OutlinedIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    public static final void IconButton(Function0<Unit> function0, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconButtonColors iconButtonColors2 = iconButtonColors;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1142896114);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IconButton)P(5,4,2!1,3)85@4039L18,94@4366L5,102@4703L175,89@4160L944:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(iconButtonColors2)) ? 2048 : 1024;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i7 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192)));
        }
        if ((i3 & 32) != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536)));
        }
        if ((74899 + i4) - (74899 | i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if (i7 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1142896114, i4, -1, "androidx.compose.material3.IconButton (IconButton.kt:88)");
            }
            Modifier modifierM604clickableO2vRcR0$default = ClickableKt.m604clickableO2vRcR0$default(BackgroundKt.m573backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1063size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion), IconButtonTokens.INSTANCE.m3309getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), composerStartRestartGroup, 6)), iconButtonColors2.m2147containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6638constructorimpl(IconButtonTokens.INSTANCE.m3309getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z3, null, Role.m5926boximpl(Role.Companion.m5933getButtono7Vup1c()), function0, 8, null);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM604clickableO2vRcR0$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 782643754, "C110@5014L84:IconButton.kt#uh7d8r");
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(iconButtonColors2.m2148contentColorvNxB06k$material3_release(z3)));
            int i8 = ProvidedValue.$stable;
            int i9 = (i4 >> 12) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function2, composerStartRestartGroup, (i8 + i9) - (i8 & i9));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.IconButton.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ IconButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06492(Function0<Unit> function02, Modifier companion2, boolean z32, IconButtonColors iconButtonColors22, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    iconButtonColors = iconButtonColors22;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void IconToggleButton(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconToggleButtonColors iconToggleButtonColors2 = iconToggleButtonColors;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(692561811);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IconToggleButton)P(!1,6,5,3!1,4)150@7170L24,159@7503L5,160@7553L32,168@7909L175,154@7297L1028:IconButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = (i3 + 8) - (i3 | 8);
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i7 = composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(iconToggleButtonColors2)) ? 16384 : 8192)));
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i9 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i4)) != 599186 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i8 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(692561811, i4, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:153)");
            }
            Modifier modifierClip = ClipKt.clip(SizeKt.m1063size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion), IconButtonTokens.INSTANCE.m3309getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), composerStartRestartGroup, 6));
            int i11 = i4 >> 6;
            int i12 = ((i11 + 896) - (i11 | 896)) | ((-1) - (((-1) - ((i4 >> 9) & 14)) & ((-1) - ((i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            Modifier modifierM1274toggleableO2vRcR0 = ToggleableKt.m1274toggleableO2vRcR0(BackgroundKt.m573backgroundbw27NRU$default(modifierClip, iconToggleButtonColors2.containerColor$material3_release(z4, z2, composerStartRestartGroup, i12).getValue().m4188unboximpl(), null, 2, null), z2, mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6638constructorimpl(IconButtonTokens.INSTANCE.m3309getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z4, Role.m5926boximpl(Role.Companion.m5934getCheckboxo7Vup1c()), function1);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1274toggleableO2vRcR0);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -131204793, "C175@8190L30,176@8235L84:IconButton.kt#uh7d8r");
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(iconToggleButtonColors2.contentColor$material3_release(z4, z2, composerStartRestartGroup, i12).getValue().m4188unboximpl()));
            int i13 = ProvidedValue.$stable;
            int i14 = i4 >> 15;
            int i15 = (i14 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i14 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function2, composerStartRestartGroup, (i13 + i15) - (i13 & i15));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.IconToggleButton.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ IconToggleButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06502(boolean z22, Function1<? super Boolean, Unit> function12, Modifier companion2, boolean z42, IconToggleButtonColors iconToggleButtonColors22, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    iconToggleButtonColors = iconToggleButtonColors22;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    boolean z22 = z;
                    Function1<Boolean, Unit> function12 = function1;
                    Modifier modifier2 = modifier;
                    boolean z32 = z;
                    IconToggleButtonColors iconToggleButtonColors3 = iconToggleButtonColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i32 = i;
                    IconButtonKt.IconToggleButton(z22, function12, modifier2, z32, iconToggleButtonColors3, mutableInteractionSource3, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void FilledIconButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconButtonColors iconButtonColorsFilledIconButtonColors = iconButtonColors;
        Shape filledShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1594730011);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledIconButton)P(5,4,2,6!1,3)217@10330L11,218@10393L24,230@10821L320,222@10520L621:IconButton.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(filledShape)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(iconButtonColorsFilledIconButtonColors)) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i4)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    iconButtonColorsFilledIconButtonColors = IconButtonDefaults.INSTANCE.filledIconButtonColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if (i8 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594730011, i4, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:222)");
            }
            function02 = function02;
            SurfaceKt.m2564Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(companion, false, AnonymousClass1.INSTANCE, 1, null), z3, filledShape, iconButtonColorsFilledIconButtonColors.m2147containerColorvNxB06k$material3_release(z3), iconButtonColorsFilledIconButtonColors.m2148contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C231@10831L304:IconButton.kt#uh7d8r");
                    if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:231)");
                        }
                        Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledIconButtonTokens.INSTANCE.m3273getContainerWidthD9Ej5fM(), FilledIconButtonTokens.INSTANCE.m3272getContainerHeightD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1882507244, "C239@11116L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - (i4 & 8078)) & ((-1) - ((-1) - (((-1) - (i4 << 12)) | ((-1) - 1879048192))))), 6, 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ IconButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function0<Unit> function022, Modifier companion2, boolean z32, Shape filledShape2, IconButtonColors iconButtonColorsFilledIconButtonColors2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    function0 = function022;
                    modifier = companion2;
                    z = z32;
                    shape = filledShape2;
                    iconButtonColors = iconButtonColorsFilledIconButtonColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function03 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    IconButtonColors iconButtonColors2 = iconButtonColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i32 = i;
                    IconButtonKt.FilledIconButton(function03, modifier2, z22, shape2, iconButtonColors2, mutableInteractionSource3, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i10) {
            ComposerKt.sourceInformation(composer2, "C231@10831L304:IconButton.kt#uh7d8r");
            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:231)");
                }
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledIconButtonTokens.INSTANCE.m3273getContainerWidthD9Ej5fM(), FilledIconButtonTokens.INSTANCE.m3272getContainerHeightD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1882507244, "C239@11116L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }

    public static final void FilledTonalIconButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconButtonColors iconButtonColorsFilledTonalIconButtonColors = iconButtonColors;
        Shape filledShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-783937767);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledTonalIconButton)P(5,4,2,6!1,3)284@13478L11,285@13541L29,297@13974L330,289@13673L631:IconButton.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function02) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i9 = ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(filledShape)) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(iconButtonColorsFilledTonalIconButtonColors)) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((599187 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 16) != 0) {
                    iconButtonColorsFilledTonalIconButtonColors = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i10 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783937767, i4, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:289)");
            }
            int i12 = i4 & 8078;
            int i13 = (-1) - (((-1) - (i4 << 12)) | ((-1) - 1879048192));
            function02 = function02;
            SurfaceKt.m2564Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(companion, false, C06431.INSTANCE, 1, null), z3, filledShape, iconButtonColorsFilledTonalIconButtonColors.m2147containerColorvNxB06k$material3_release(z3), iconButtonColorsFilledTonalIconButtonColors.m2148contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06442(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C298@13984L314:IconButton.kt#uh7d8r");
                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1772884636, i14, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:298)");
                        }
                        Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledTonalIconButtonTokens.INSTANCE.m3289getContainerWidthD9Ej5fM(), FilledTonalIconButtonTokens.INSTANCE.m3288getContainerHeightD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -507423912, "C306@14279L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i12 + i13) - (i12 & i13), 6, 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ IconButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06453(Function0<Unit> function022, Modifier companion2, boolean z32, Shape filledShape2, IconButtonColors iconButtonColorsFilledTonalIconButtonColors2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    function0 = function022;
                    modifier = companion2;
                    z = z32;
                    shape = filledShape2;
                    iconButtonColors = iconButtonColorsFilledTonalIconButtonColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.FilledTonalIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06431 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C06431 INSTANCE = ;

        C06431() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06442 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06442(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i14) {
            ComposerKt.sourceInformation(composer2, "C298@13984L314:IconButton.kt#uh7d8r");
            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1772884636, i14, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:298)");
                }
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledTonalIconButtonTokens.INSTANCE.m3289getContainerWidthD9Ej5fM(), FilledTonalIconButtonTokens.INSTANCE.m3288getContainerHeightD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -507423912, "C306@14279L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }

    public static final void FilledIconToggleButton(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconToggleButtonColors iconToggleButtonColorsFilledIconToggleButtonColors = iconToggleButtonColors;
        Shape filledShape = shape;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708189280);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledIconToggleButton)P(!1,6,5,3,7!1,4)349@16472L11,350@16541L30,360@16890L32,361@16960L30,363@17050L320,354@16674L696:IconButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i9 = composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(filledShape)) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(iconToggleButtonColorsFilledIconToggleButtonColors)) ? 131072 : 65536;
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i11 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 |= 12582912;
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i4)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z4 = true;
                }
                if ((i3 & 16) != 0) {
                    filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    iconToggleButtonColorsFilledIconToggleButtonColors = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i10 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1708189280, i4, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:354)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, C06401.INSTANCE, 1, null);
            int i12 = i4 >> 9;
            int i13 = ((-1) - (((-1) - i12) | ((-1) - 14))) | ((-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i14 = (-1) - (((-1) - i12) | ((-1) - 896));
            int i15 = (i13 + i14) - (i13 & i14);
            SurfaceKt.m2563Surfaced85dljk(z2, function1, modifierSemantics$default, z4, filledShape, iconToggleButtonColorsFilledIconToggleButtonColors.containerColor$material3_release(z4, z2, composerStartRestartGroup, i15).getValue().m4188unboximpl(), iconToggleButtonColorsFilledIconToggleButtonColors.contentColor$material3_release(z4, z2, composerStartRestartGroup, i15).getValue().m4188unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconToggleButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06412(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    ComposerKt.sourceInformation(composer2, "C364@17060L304:IconButton.kt#uh7d8r");
                    if ((-1) - (((-1) - i16) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1235871670, i16, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:364)");
                        }
                        Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledIconButtonTokens.INSTANCE.m3273getContainerWidthD9Ej5fM(), FilledIconButtonTokens.INSTANCE.m3272getContainerHeightD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1295472936, "C372@17345L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 64638 & i4, (-1) - (((-1) - ((i4 >> 18) & 14)) & ((-1) - 48)), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconToggleButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ IconToggleButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06423(boolean z22, Function1<? super Boolean, Unit> function12, Modifier companion2, boolean z42, Shape filledShape2, IconToggleButtonColors iconToggleButtonColorsFilledIconToggleButtonColors2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    shape = filledShape2;
                    iconToggleButtonColors = iconToggleButtonColorsFilledIconToggleButtonColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.FilledIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06401 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C06401 INSTANCE = ;

        C06401() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5934getCheckboxo7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06412 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06412(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i16) {
            ComposerKt.sourceInformation(composer2, "C364@17060L304:IconButton.kt#uh7d8r");
            if ((-1) - (((-1) - i16) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1235871670, i16, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:364)");
                }
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledIconButtonTokens.INSTANCE.m3273getContainerWidthD9Ej5fM(), FilledIconButtonTokens.INSTANCE.m3272getContainerHeightD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1295472936, "C372@17345L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }

    public static final void FilledTonalIconToggleButton(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        IconToggleButtonColors iconToggleButtonColorsFilledTonalIconToggleButtonColors = iconToggleButtonColors;
        Shape filledShape = shape;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1676089246);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledTonalIconToggleButton)P(!1,6,5,3,7!1,4)420@19894L11,421@19963L35,431@20317L32,432@20387L30,434@20477L330,425@20101L706:IconButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(filledShape)) ? 16384 : 8192;
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(iconToggleButtonColorsFilledTonalIconToggleButtonColors)) ? 131072 : 65536;
        }
        int i7 = (i3 + 64) - (i3 | 64);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((1572864 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i4)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    iconToggleButtonColorsFilledTonalIconToggleButtonColors = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if (i7 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676089246, i4, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:425)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, C06461.INSTANCE, 1, null);
            int i9 = i4 >> 9;
            int i10 = i4 << 3;
            int i11 = (-1) - (((-1) - (i9 & 14)) & ((-1) - ((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            int i12 = (-1) - (((-1) - i9) | ((-1) - 896));
            int i13 = (i11 + i12) - (i11 & i12);
            int i14 = (64638 + i4) - (64638 | i4);
            int i15 = i4 >> 18;
            int i16 = (i15 + 14) - (i15 | 14);
            SurfaceKt.m2563Surfaced85dljk(z2, function1, modifierSemantics$default, z4, filledShape, iconToggleButtonColorsFilledTonalIconToggleButtonColors.containerColor$material3_release(z4, z2, composerStartRestartGroup, i13).getValue().m4188unboximpl(), iconToggleButtonColorsFilledTonalIconToggleButtonColors.contentColor$material3_release(z4, z2, composerStartRestartGroup, i13).getValue().m4188unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06472(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C435@20487L314:IconButton.kt#uh7d8r");
                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-58218680, i17, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:435)");
                        }
                        Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledTonalIconButtonTokens.INSTANCE.m3289getContainerWidthD9Ej5fM(), FilledTonalIconButtonTokens.INSTANCE.m3288getContainerHeightD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1171714300, "C443@20782L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i14, (i16 + 48) - (i16 & 48), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ IconToggleButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06483(boolean z22, Function1<? super Boolean, Unit> function12, Modifier companion2, boolean z42, Shape filledShape2, IconToggleButtonColors iconToggleButtonColorsFilledTonalIconToggleButtonColors2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    shape = filledShape2;
                    iconToggleButtonColors = iconToggleButtonColorsFilledTonalIconToggleButtonColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.FilledTonalIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06461 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C06461 INSTANCE = ;

        C06461() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5934getCheckboxo7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06472 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06472(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i17) {
            ComposerKt.sourceInformation(composer2, "C435@20487L314:IconButton.kt#uh7d8r");
            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-58218680, i17, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:435)");
                }
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, FilledTonalIconButtonTokens.INSTANCE.m3289getContainerWidthD9Ej5fM(), FilledTonalIconButtonTokens.INSTANCE.m3288getContainerHeightD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1065sizeVpY3zN4);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1171714300, "C443@20782L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }

    public static final void OutlinedIconButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        BorderStroke borderStrokeOutlinedIconButtonBorder = borderStroke;
        IconButtonColors iconButtonColorsOutlinedIconButtonColors = iconButtonColors;
        Shape outlinedShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1746603025);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedIconButton)P(6,5,3,7,1!1,4)491@23280L13,492@23345L26,493@23420L33,506@23882L190,497@23556L516:IconButton.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function02) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i8 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 & 3072) == 0) {
            int i10 = ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(outlinedShape)) ? 2048 : 1024;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(iconButtonColorsOutlinedIconButtonColors)) ? 16384 : 8192;
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i11 = ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(borderStrokeOutlinedIconButtonBorder)) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        int i12 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((1572864 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((4793491 + i4) - (4793491 | i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    outlinedShape = IconButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    iconButtonColorsOutlinedIconButtonColors = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    int i13 = i4 >> 6;
                    borderStrokeOutlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z3, composerStartRestartGroup, (-1) - (((-1) - ((i13 + 14) - (i13 | 14))) & ((-1) - 48)));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i12 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1746603025, i4, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:497)");
            }
            int i14 = i4 & 8078;
            int i15 = i4 << 9;
            function02 = function02;
            SurfaceKt.m2564Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(companion, false, C06511.INSTANCE, 1, null), z3, outlinedShape, iconButtonColorsOutlinedIconButtonColors.m2147containerColorvNxB06k$material3_release(z3), iconButtonColorsOutlinedIconButtonColors.m2148contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, borderStrokeOutlinedIconButtonBorder, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(582332538, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06522(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    ComposerKt.sourceInformation(composer2, "C507@23892L174:IconButton.kt#uh7d8r");
                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(582332538, i16, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:507)");
                        }
                        Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, OutlinedIconButtonTokens.INSTANCE.m3372getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1063size3ABfNKs);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1854043468, "C511@24047L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - (i14 | ((234881024 + i15) - (234881024 | i15)))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 1879048192))))), 6, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ IconButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06533(Function0<Unit> function022, Modifier companion2, boolean z32, Shape outlinedShape2, IconButtonColors iconButtonColorsOutlinedIconButtonColors2, BorderStroke borderStrokeOutlinedIconButtonBorder2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    function0 = function022;
                    modifier = companion2;
                    z = z32;
                    shape = outlinedShape2;
                    iconButtonColors = iconButtonColorsOutlinedIconButtonColors2;
                    borderStroke = borderStrokeOutlinedIconButtonBorder2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.OutlinedIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06511 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C06511 INSTANCE = ;

        C06511() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06522 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06522(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i16) {
            ComposerKt.sourceInformation(composer2, "C507@23892L174:IconButton.kt#uh7d8r");
            if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(582332538, i16, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:507)");
                }
                Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, OutlinedIconButtonTokens.INSTANCE.m3372getContainerSizeD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1063size3ABfNKs);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1854043468, "C511@24047L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void OutlinedIconToggleButton(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        BorderStroke borderStrokeOutlinedIconToggleButtonBorder = borderStroke;
        IconToggleButtonColors iconToggleButtonColorsOutlinedIconToggleButtonColors = iconToggleButtonColors;
        Shape outlinedShape = shape;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1470292106);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedIconToggleButton)P(1,7,6,4,8,2!1,5)555@26419L13,556@26490L32,557@26571L48,567@26938L32,568@27008L30,571@27123L190,561@26722L591:IconButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i8 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(outlinedShape)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((196608 & i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(iconToggleButtonColorsOutlinedIconToggleButtonColors)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(borderStrokeOutlinedIconToggleButtonBorder)) ? 1048576 : 524288;
        }
        int i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((38347923 + i4) - (38347923 | i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    outlinedShape = IconButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    iconToggleButtonColorsOutlinedIconToggleButtonColors = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    int i10 = i4 << 3;
                    borderStrokeOutlinedIconToggleButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z4, z2, composerStartRestartGroup, ((i4 >> 9) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | ((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 &= -458753;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470292106, i4, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:561)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, C06541.INSTANCE, 1, null);
            int i11 = i4 >> 9;
            int i12 = (-1) - (((-1) - i11) | ((-1) - 14));
            int i13 = i4 << 3;
            int i14 = (i13 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i13 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i15 = ((i12 + i14) - (i12 & i14)) | ((i11 + 896) - (i11 | 896));
            int i16 = i4 << 9;
            SurfaceKt.m2563Surfaced85dljk(z2, function1, modifierSemantics$default, z4, outlinedShape, iconToggleButtonColorsOutlinedIconToggleButtonColors.containerColor$material3_release(z4, z2, composerStartRestartGroup, i15).getValue().m4188unboximpl(), iconToggleButtonColorsOutlinedIconToggleButtonColors.contentColor$material3_release(z4, z2, composerStartRestartGroup, i15).getValue().m4188unboximpl(), 0.0f, 0.0f, borderStrokeOutlinedIconToggleButtonBorder, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06552(Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C572@27133L174:IconButton.kt#uh7d8r");
                    if ((i17 + 3) - (3 | i17) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1207657396, i17, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:572)");
                        }
                        Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, OutlinedIconButtonTokens.INSTANCE.m3372getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1063size3ABfNKs);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 278710712, "C576@27288L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((-1) - (((-1) - 64638) | ((-1) - i4))) | ((1879048192 + i16) - (1879048192 | i16)), ((i4 >> 21) & 14) | 48, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ IconToggleButtonColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06563(boolean z22, Function1<? super Boolean, Unit> function12, Modifier companion2, boolean z42, Shape outlinedShape2, IconToggleButtonColors iconToggleButtonColorsOutlinedIconToggleButtonColors2, BorderStroke borderStrokeOutlinedIconToggleButtonBorder2, MutableInteractionSource mutableInteractionSource22, Function2<? super Composer, ? super Integer, Unit> function22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    shape = outlinedShape2;
                    iconToggleButtonColors = iconToggleButtonColorsOutlinedIconToggleButtonColors2;
                    borderStroke = borderStrokeOutlinedIconToggleButtonBorder2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    IconButtonKt.OutlinedIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$1 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06541 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C06541 INSTANCE = ;

        C06541() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5934getCheckboxo7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2 */
    /* JADX INFO: compiled from: IconButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06552 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06552(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i17) {
            ComposerKt.sourceInformation(composer2, "C572@27133L174:IconButton.kt#uh7d8r");
            if ((i17 + 3) - (3 | i17) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1207657396, i17, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:572)");
                }
                Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(Modifier.Companion, OutlinedIconButtonTokens.INSTANCE.m3372getContainerSizeD9Ej5fM());
                Alignment center = Alignment.Companion.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1063size3ABfNKs);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 278710712, "C576@27288L9:IconButton.kt#uh7d8r");
                function22.invoke(composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
    }
}
