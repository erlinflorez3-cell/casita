package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172XoG3coE9fxNӜ\u001f@ĲPy3\u007fJ4V\u0010\u000f\u0001SM\u001c\u0012^?\u001f;\u0003\u0013S\u0005(\u0014\u001e>N\u0004NbmNDL\u0005]h4S\toB\\-w0+T=LZ'\u001b~y\u001eYIg=\u001b%a\r\u001fTq>1J\"E\u000bh53CK\nVde0\u001a\u001b+]\u001burTk5Yf\f5;geaO<9(\u0015\n\u001fT\u001a\u001e\b7H\\A*h\u0018\u000eas!fĖT\u0002dWȸ~a<-k\u0005Ĵ/9)}iĵ:'fO{3\fN-\u000fn9ad\u0010p\u0015IS&RaWF=VP\"Ykp4vh\u00028\bHG.4,\u00174\u00173=s9Q(\u001c\bNDu~\u001d`\u0017\\\u001aZN@0x.9@\b:etl\u000bk^`p.'LJa7\u0004\u000e\u0013.j\u0010<O4@VUhwze_ $]wgs|}&mI`C5\u007fw cbvB>juۖ\\fHh۱^\\.8xMн\u0014w\n[f܌\u0012@X\n\u001cb+a#j\u0015`\t.DQ|7^\ti@\u0005Z32\u0005\u0002$#\f1Vbp}k\u0011IZ\u0002\u0011(3A_;1&\u0004)\u0019:\u0003#\u0015\u0007\f\u007fup|ORl$\u007fm}6\u0015HD\u00027C\u0013\u001d\u000bA4\u0018,sY#kWM 5\u0013|(\u001ekp4g\u0016z\t.vix`\u000510\tv\t3\nt\u007f(uV|Wc\u0003\n\nQϗv\u0003_Qҡ<|\u000b5d*˽s\"\u000bLEώ&+0\u0010\u0014]\u0014\u0012gwoF\u007fr\u00116t\u0014\u0003ZdFuhQk4S8w\\/D($z\u0007ZH\u0019|8H\u000f4\u001b9`A\u0013w\u0007>S\u000b=\u0006~\u0007Z\u0016!^a:!y\u00166D^X~s\u0006\u001a^Q1)Oif\u001cz{b\u0011J\u001d\u0018#{_}B$C dgz\u000bF\u0005\")f[It\u001dR\u0019&D,j\u001c\u001bEdi4\u000f)\u0013ʮc\u000f\u001dG¡w;\\$\u001b}חZH\u0013w]ȇ 8\u001c\u0017\u000fa\u001d)??\u0005\u0006Ld1s2/RK\nKpU~t'CD\u0003<K.^\u0001\u0019IuCw\u0007f\nM){q\b\ff\u001f-#H\u0018)Ai\u0011\u000e\u007f`f\u0011UrX|x(e\u0001YR1\u0005z\u000b\u001aT\f%\nG\\#uh-Z\\\u00107q)1\u001fJ)\u0015\u001c\u0015e\\\u001a[\u0017eGK[\u0003*7}gSi\u0012\u0018\"0'2sOo߉\u0012f\u0010rΌ>\u0016w,)\u0007Ƥ\u0017P.\u001b̡N\u0011"}, d2 = {"\u0010tcAb5", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0015w\u001d8ZQ\u0011", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0017t\u0016?IR?u=s", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>-UhxTKIa=.\ni%gDH$]y\u0015*h]2\u0006\u0003!ZOb\tvqPv\u0005?.K{1-AxTI~+\u001e^Eu\u001c:c~9tv\f096q\tGne\b;\t$;fJ\u0007-6M\u000fNOm~B%\nq\u001en\u0012\u0012aHz\u0017omnR\u001d\u0007'\u0018eEj^|FV\u0010G\u0013L\u001f4E~OI\t\"\u0013\r$CLEL\u001aa\u000b\u001eoWk]\u001b\u000b\u000ep&\u001cw\u0017Gi\u0018g&n;W\u001cRo4 \u0006iR^[D\u000flO{]Hk+Fx\u001f\u001f\b/T;\u0004\\Gn#_2\u000b\u0013\n'\u0002i\fz@#.$9h<lix\u000fpb\"&c6+#7:K:P}Zt.\u0015a\u0017w|\"Y<G\u0006=J7t2IaKZ#`\\\u001f3Q\u001exe\u0006\u001e\f\\\u0004>H}\u0012\n\r9Bs,5$\u0005K)ph\u0005M\b\u0015\t|'3\u001a\u0014\"L U\u001exVHc\u000bk8\u0014\u0014*F2rV\t4MHNUL\u0003\u0017Kn", "\u0013kTCT;>Ru\u000f\nm6\u0006", "\u0014h[9X+-]\"z\u0002;<\f\u00189n", "\u001dtc9\\5>Ru\u000f\nm6\u0006", "\"dgA5<Mb#\b", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ButtonKt {

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$Button$3 */
    /* JADX INFO: compiled from: Button.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ ButtonElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
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
            ButtonColors buttonColors = buttonColors;
            ButtonElevation buttonElevation = buttonElevation;
            BorderStroke borderStroke = borderStroke;
            PaddingValues paddingValues = paddingValues;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            ButtonKt.Button(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$ElevatedButton$1 */
    /* JADX INFO: compiled from: Button.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06041 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ ButtonElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06041(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
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
            ButtonColors buttonColors = buttonColors;
            ButtonElevation buttonElevation = buttonElevation;
            BorderStroke borderStroke = borderStroke;
            PaddingValues paddingValues = paddingValues;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            ButtonKt.ElevatedButton(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$FilledTonalButton$1 */
    /* JADX INFO: compiled from: Button.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06051 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ ButtonElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06051(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
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
            ButtonColors buttonColors = buttonColors;
            ButtonElevation buttonElevation = buttonElevation;
            BorderStroke borderStroke = borderStroke;
            PaddingValues paddingValues = paddingValues;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            ButtonKt.FilledTonalButton(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$OutlinedButton$1 */
    /* JADX INFO: compiled from: Button.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06061 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ ButtonElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06061(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
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
            ButtonColors buttonColors = buttonColors;
            ButtonElevation buttonElevation = buttonElevation;
            BorderStroke borderStroke = borderStroke;
            PaddingValues paddingValues = paddingValues;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            ButtonKt.OutlinedButton(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$TextButton$1 */
    /* JADX INFO: compiled from: Button.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06071 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ButtonColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ ButtonElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06071(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ButtonKt.TextButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Button(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        State<Dp> stateShadowElevation$material3_release;
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
        ButtonColors buttonColors2 = buttonColors;
        PaddingValues contentPadding = paddingValues;
        ButtonElevation buttonElevationM1827buttonElevationR_JCAzs = buttonElevation;
        Modifier.Companion companion = modifier;
        Shape shape2 = shape;
        Object obj = borderStroke;
        Composer composerStartRestartGroup = composer.startRestartGroup(650121315);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Button)P(8,7,5,9,1,4!1,3,6)111@5461L5,112@5510L14,113@5575L17,134@6467L587,124@6130L924:Button.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i7 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i9 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(shape2)) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i10 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(buttonColors2)) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i11 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(buttonElevationM1827buttonElevationR_JCAzs)) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        int i12 = (i3 + 64) - (i3 | 64);
        if (i12 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((1572864 & i2) == 0) {
            int i13 = composerStartRestartGroup.changed(obj) ? 1048576 : 524288;
            i4 = (i4 + i13) - (i4 & i13);
        }
        int i14 = (i3 + 128) - (i3 | 128);
        if (i14 != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
        }
        int i15 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i15 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        if ((306783379 + i4) - (306783379 | i4) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                z3 = i9 == 0 ? z2 : true;
                if ((i3 + 8) - (i3 | 8) != 0) {
                    shape2 = ButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(composerStartRestartGroup, 6);
                    i5 = (i4 - 57345) - (i4 | (-57345));
                } else {
                    i5 = i4;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    mutableInteractionSource2 = null;
                    buttonElevationM1827buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1827buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i5 &= -458753;
                } else {
                    mutableInteractionSource2 = null;
                }
                if (i12 != 0) {
                    obj = mutableInteractionSource2;
                }
                if (i14 != 0) {
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                }
                if (i15 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                i5 = i4;
                z3 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650121315, i5, -1, "androidx.compose.material3.Button (Button.kt:118)");
            }
            composerStartRestartGroup.startReplaceGroup(-239156623);
            ComposerKt.sourceInformation(composerStartRestartGroup, "120@5882L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -239155972, "CC(remember):Button.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endReplaceGroup();
            long jM1819containerColorvNxB06k$material3_release = buttonColors2.m1819containerColorvNxB06k$material3_release(z3);
            long jM1820contentColorvNxB06k$material3_release = buttonColors2.m1820contentColorvNxB06k$material3_release(z3);
            composerStartRestartGroup.startReplaceGroup(-239150048);
            ComposerKt.sourceInformation(composerStartRestartGroup, "123@6067L43");
            if (buttonElevationM1827buttonElevationR_JCAzs == null) {
                stateShadowElevation$material3_release = null;
            } else {
                int i16 = i5 >> 6;
                stateShadowElevation$material3_release = buttonElevationM1827buttonElevationR_JCAzs.shadowElevation$material3_release(z3, mutableInteractionSource3, composerStartRestartGroup, ((i16 + 14) - (i16 | 14)) | ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 896))));
            }
            composerStartRestartGroup.endReplaceGroup();
            SurfaceKt.m2564Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, AnonymousClass1.INSTANCE, 1, null), z3, shape2, jM1819containerColorvNxB06k$material3_release, jM1820contentColorvNxB06k$material3_release, 0.0f, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m6652unboximpl() : Dp.m6638constructorimpl(0), obj, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ long $contentColor;
                final /* synthetic */ PaddingValues $contentPadding;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(long jM1820contentColorvNxB06k$material3_release2, PaddingValues contentPadding2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                    super(2);
                    j = jM1820contentColorvNxB06k$material3_release2;
                    paddingValues = contentPadding2;
                    function3 = function32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C137@6586L10,138@6618L430,135@6477L571:Button.kt#uh7d8r");
                    if ((i17 + 3) - (3 | i17) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(956488494, i17, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                        }
                        ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer2, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
                            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                super(2);
                                function3 = function32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                ComposerKt.sourceInformation(composer3, "C139@6632L406:Button.kt#uh7d8r");
                                if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), paddingValues);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                        }, composer2, 54), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$Button$2$1 */
                /* JADX INFO: compiled from: Button.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                        super(2);
                        function3 = function32;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i18) {
                        ComposerKt.sourceInformation(composer3, "C139@6632L406:Button.kt#uh7d8r");
                        if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), paddingValues);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 + 8078) - (8078 | i5)) | ((-1) - (((-1) - 234881024) | ((-1) - (i5 << 6)))), 6, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ButtonColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ ButtonElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function0<Unit> function02, Modifier companion2, boolean z32, Shape shape22, ButtonColors buttonColors22, ButtonElevation buttonElevationM1827buttonElevationR_JCAzs2, BorderStroke obj2, PaddingValues contentPadding2, MutableInteractionSource mutableInteractionSource42, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = shape22;
                    buttonColors = buttonColors22;
                    buttonElevation = buttonElevationM1827buttonElevationR_JCAzs2;
                    borderStroke = obj2;
                    paddingValues = contentPadding2;
                    mutableInteractionSource = mutableInteractionSource42;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape3 = shape;
                    ButtonColors buttonColors3 = buttonColors;
                    ButtonElevation buttonElevation2 = buttonElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    ButtonKt.Button(function02, modifier2, z22, shape3, buttonColors3, buttonElevation2, borderStroke2, paddingValues2, mutableInteractionSource5, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$Button$1 */
    /* JADX INFO: compiled from: Button.kt */
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

    /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$Button$2 */
    /* JADX INFO: compiled from: Button.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ PaddingValues $contentPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(long jM1820contentColorvNxB06k$material3_release2, PaddingValues contentPadding2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
            super(2);
            j = jM1820contentColorvNxB06k$material3_release2;
            paddingValues = contentPadding2;
            function3 = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i17) {
            ComposerKt.sourceInformation(composer2, "C137@6586L10,138@6618L430,135@6477L571:Button.kt#uh7d8r");
            if ((i17 + 3) - (3 | i17) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(956488494, i17, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                }
                ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer2, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
                    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                        super(2);
                        function3 = function32;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i18) {
                        ComposerKt.sourceInformation(composer3, "C139@6632L406:Button.kt#uh7d8r");
                        if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), paddingValues);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                }, composer2, 54), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: renamed from: androidx.compose.material3.ButtonKt$Button$2$1 */
        /* JADX INFO: compiled from: Button.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                super(2);
                function3 = function32;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i18) {
                ComposerKt.sourceInformation(composer3, "C139@6632L406:Button.kt#uh7d8r");
                if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, ButtonDefaults.INSTANCE.m1835getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1834getMinHeightD9Ej5fM()), paddingValues);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
        }
    }

    public static final void ElevatedButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        PaddingValues contentPadding = paddingValues;
        BorderStroke borderStroke2 = borderStroke;
        ButtonColors buttonColorsElevatedButtonColors = buttonColors;
        Shape elevatedShape = shape;
        ButtonElevation buttonElevationM1829elevatedButtonElevationR_JCAzs = buttonElevation;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1466887385);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedButton)P(8,7,5,9,1,4!1,3,6)204@9975L13,205@10032L22,206@10105L25,212@10343L314:Button.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i7 = (i3 + 4) - (i3 | 4);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i8 = ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(elevatedShape)) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i9 = ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(buttonColorsElevatedButtonColors)) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(buttonElevationM1829elevatedButtonElevationR_JCAzs)) ? 131072 : 65536;
        }
        int i10 = (i3 + 64) - (i3 | 64);
        if (i10 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i11 = composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            int i14 = composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((i3 + 512) - (i3 | 512) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    elevatedShape = ButtonDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    buttonColorsElevatedButtonColors = ButtonDefaults.INSTANCE.elevatedButtonColors(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                } else {
                    i5 = i4;
                }
                if ((i3 & 32) != 0) {
                    buttonElevationM1829elevatedButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1829elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i4 = (i5 - 458753) - (i5 | (-458753));
                } else {
                    i4 = i5;
                }
                if (i10 != 0) {
                    borderStroke2 = null;
                }
                if (i12 != 0) {
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                }
                if (i13 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466887385, i4, -1, "androidx.compose.material3.ElevatedButton (Button.kt:212)");
            }
            Button(function0, companion, z3, elevatedShape, buttonColorsElevatedButtonColors, buttonElevationM1829elevatedButtonElevationR_JCAzs, borderStroke2, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 2147483646)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.ElevatedButton.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ButtonColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ ButtonElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06041(Function0<Unit> function02, Modifier companion2, boolean z32, Shape elevatedShape2, ButtonColors buttonColorsElevatedButtonColors2, ButtonElevation buttonElevationM1829elevatedButtonElevationR_JCAzs2, BorderStroke borderStroke22, PaddingValues contentPadding2, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = elevatedShape2;
                    buttonColors = buttonColorsElevatedButtonColors2;
                    buttonElevation = buttonElevationM1829elevatedButtonElevationR_JCAzs2;
                    borderStroke = borderStroke22;
                    paddingValues = contentPadding2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    ButtonColors buttonColors2 = buttonColors;
                    ButtonElevation buttonElevation2 = buttonElevation;
                    BorderStroke borderStroke3 = borderStroke;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    ButtonKt.ElevatedButton(function02, modifier2, z22, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void FilledTonalButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        boolean z3 = z2;
        Shape filledTonalShape = shape;
        PaddingValues contentPadding = paddingValues;
        BorderStroke borderStroke2 = borderStroke;
        ButtonElevation buttonElevationM1831filledTonalButtonElevationR_JCAzs = buttonElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        ButtonColors buttonColorsFilledTonalButtonColors = buttonColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717924381);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledTonalButton)P(8,7,5,9,1,4!1,3,6)277@13636L16,278@13696L25,279@13772L28,285@14013L314:Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(filledTonalShape)) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(buttonColorsFilledTonalButtonColors)) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i7 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(buttonElevationM1831filledTonalButtonElevationR_JCAzs)) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i8 != 0) {
            i4 |= 1572864;
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i9 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304)));
        }
        int i10 = (i3 + 256) - (i3 | 256);
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    filledTonalShape = ButtonDefaults.INSTANCE.getFilledTonalShape(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    buttonColorsFilledTonalButtonColors = ButtonDefaults.INSTANCE.filledTonalButtonColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    buttonElevationM1831filledTonalButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1831filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    borderStroke2 = null;
                }
                if (i9 != 0) {
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
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
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717924381, i4, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:285)");
            }
            Button(function0, companion, z3, filledTonalShape, buttonColorsFilledTonalButtonColors, buttonElevationM1831filledTonalButtonElevationR_JCAzs, borderStroke2, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i4 & 2147483646, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.FilledTonalButton.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ButtonColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ ButtonElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06051(Function0<Unit> function02, Modifier companion2, boolean z32, Shape filledTonalShape2, ButtonColors buttonColorsFilledTonalButtonColors2, ButtonElevation buttonElevationM1831filledTonalButtonElevationR_JCAzs2, BorderStroke borderStroke22, PaddingValues contentPadding2, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = filledTonalShape2;
                    buttonColors = buttonColorsFilledTonalButtonColors2;
                    buttonElevation = buttonElevationM1831filledTonalButtonElevationR_JCAzs2;
                    borderStroke = borderStroke22;
                    paddingValues = contentPadding2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    ButtonColors buttonColors2 = buttonColors;
                    ButtonElevation buttonElevation2 = buttonElevation;
                    BorderStroke borderStroke3 = borderStroke;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    ButtonKt.FilledTonalButton(function02, modifier2, z22, shape2, buttonColors2, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void OutlinedButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues contentPadding = paddingValues;
        BorderStroke borderStrokeOutlinedButtonBorder = borderStroke;
        ButtonElevation buttonElevation2 = buttonElevation;
        ButtonColors buttonColorsOutlinedButtonColors = buttonColors;
        Shape outlinedShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694808287);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedButton)P(8,7,5,9,1,4!1,3,6)349@17203L13,350@17260L22,352@17367L29,357@17575L314:Button.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(outlinedShape)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(buttonColorsOutlinedButtonColors)) ? 16384 : 8192;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i9 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i10 = ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(borderStrokeOutlinedButtonBorder)) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = i3 & 128;
        if (i11 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i12 = composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
            i4 = (i4 + i12) - (i4 & i12);
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i13 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 + 512) - (i3 | 512) != 0) {
            i4 |= 805306368;
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((i4 + 306783379) - (306783379 | i4) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    outlinedShape = ButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 16) != 0) {
                    buttonColorsOutlinedButtonColors = ButtonDefaults.INSTANCE.outlinedButtonColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                mutableInteractionSource2 = null;
                if (i9 != 0) {
                    buttonElevation2 = null;
                }
                if ((i3 & 64) != 0) {
                    int i15 = i4 >> 6;
                    borderStrokeOutlinedButtonBorder = ButtonDefaults.INSTANCE.outlinedButtonBorder(z3, composerStartRestartGroup, (-1) - (((-1) - ((i15 + 14) - (i15 | 14))) & ((-1) - 48)), 0);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if (i11 != 0) {
                    contentPadding = ButtonDefaults.INSTANCE.getContentPadding();
                }
                if (i13 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694808287, i4, -1, "androidx.compose.material3.OutlinedButton (Button.kt:357)");
            }
            Button(function0, companion, z3, outlinedShape, buttonColorsOutlinedButtonColors, buttonElevation2, borderStrokeOutlinedButtonBorder, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i4 & 2147483646, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.OutlinedButton.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ButtonColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ ButtonElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06061(Function0<Unit> function02, Modifier companion2, boolean z32, Shape outlinedShape2, ButtonColors buttonColorsOutlinedButtonColors2, ButtonElevation buttonElevation22, BorderStroke borderStrokeOutlinedButtonBorder2, PaddingValues contentPadding2, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = outlinedShape2;
                    buttonColors = buttonColorsOutlinedButtonColors2;
                    buttonElevation = buttonElevation22;
                    borderStroke = borderStrokeOutlinedButtonBorder2;
                    paddingValues = contentPadding2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Shape shape2 = shape;
                    ButtonColors buttonColors2 = buttonColors;
                    ButtonElevation buttonElevation3 = buttonElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    ButtonKt.OutlinedButton(function02, modifier2, z22, shape2, buttonColors2, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void TextButton(Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues textButtonContentPadding = paddingValues;
        BorderStroke borderStroke2 = borderStroke;
        ButtonElevation buttonElevation2 = buttonElevation;
        ButtonColors buttonColorsTextButtonColors = buttonColors;
        Shape textShape = shape;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2106428362);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextButton)P(8,7,5,9,1,4!1,3,6)422@20900L9,423@20953L18,430@21234L314:Button.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(z3) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(textShape)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(buttonColorsTextButtonColors)) ? 16384 : 8192)));
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i9 = composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288)));
        }
        int i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(textButtonContentPadding) ? 8388608 : 4194304)));
        }
        int i12 = (i3 + 256) - (i3 | 256);
        if (i12 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 = (i4 + 805306368) - (i4 & 805306368);
        } else if ((i2 & 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456)));
        }
        if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    textShape = ButtonDefaults.INSTANCE.getTextShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 & 16) != 0) {
                    buttonColorsTextButtonColors = ButtonDefaults.INSTANCE.textButtonColors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                mutableInteractionSource2 = null;
                if (i8 != 0) {
                    buttonElevation2 = null;
                }
                if (i10 != 0) {
                    borderStroke2 = null;
                }
                if (i11 != 0) {
                    textButtonContentPadding = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
                }
                if (i12 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2106428362, i4, -1, "androidx.compose.material3.TextButton (Button.kt:430)");
            }
            Button(function0, companion, z3, textShape, buttonColorsTextButtonColors, buttonElevation2, borderStroke2, textButtonContentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 2147483646)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.TextButton.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ButtonColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ ButtonElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06071(Function0<Unit> function02, Modifier companion2, boolean z32, Shape textShape2, ButtonColors buttonColorsTextButtonColors2, ButtonElevation buttonElevation22, BorderStroke borderStroke22, PaddingValues textButtonContentPadding2, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    shape = textShape2;
                    buttonColors = buttonColorsTextButtonColors2;
                    buttonElevation = buttonElevation22;
                    borderStroke = borderStroke22;
                    paddingValues = textButtonContentPadding2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ButtonKt.TextButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }
}
