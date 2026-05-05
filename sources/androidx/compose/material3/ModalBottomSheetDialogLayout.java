package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
    	... 5 more
    */
/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RnP\u008cZS@\u000fs{B$cҕyCQU\"}0\u000eWN}gvϺb\u000bY\u000f\u000e\u0016~j4Icތe܈\u00172XoG3S\u0002E9vt>\u0005&4(8\u0010ڎ1\u001aXG@v)C\u0004\f=\\\u00016JV\u001bN\u001d\u001a@\bN$\u000f!tg|:Xpk?G#1oRX5fH\u0003]\u000fVTU\u0016%i.;NAM!5U\u0013\u0007\u0001gO\u0005Oqk\u0012\u001727/W\u0002o6\u0007\u000fЏ\u0019+]\u001d&}4~\u001dQ\u000f\u0015m@յgK^1p}\t %<2\u0017L'\u00114;?~\b<<;r\u001cF^(vB.\u0004(H_+\u000eZC9Io\u0018s\u0004=\\O\u0014\u0005;'S\u0005|IsT<\nE*b\ri<aBMH|\u0013\bEъ\bph\u0016ò\b0U*\u007f\n\u001f?/'MZg5wȀ\u000eҩHg~ݓ1(a~jSP$~\u0016e37\u0014ʑHd\u000b\u007f\u0001cf?)X,V\u0017}6\u001cNdʟ@!+$\u0005\u0010'*Aܗι\nɻ3v?[t\u0006\u001crQ`9K_z0cX\u000f\"X\rt\u0013_~Hc\u000ej\\V+`PAݛyԞHN\u0014Ǝ\u0003W\u007f&L8A\u001bl\u0015v\u000f.DQ|7l\tsfкVտ(\u0003q˅E\u0015\u000f^tp\u001evO̥.ʬd\"5ۋ\"Q'Bm\"\u0017:-'\u0015\u0012\f\u007fum\u000b\u0018#̓\"\u0091Y\u0002(چ2;WLK1_\u000e77\u001a-sRȌiWUȼ?|\u0003\u0019\u001dY9@u\u000b\u0003pZdAߑQݚ\u001b(~ܥ\u000b%\u000e\u0005\u000e\u001bӼJ("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-sl]@\u0011e\u0013J\u000b1W[$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\")q\u001f-WU&x>/\u0019gaF\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Eh]1b>", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e\u0016", "Ag^B_+\u001dW'\u0007~l:f\u0012\fa}.fM\u0001%%", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ">qT1\\*MW*~WZ*\u0003s<o\u00025{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001~\u001a._\r-o=\u001d\u001fz7.mi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011v\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b%qJa[\tKKN,(n\u0019_f8C>,\u0010\u0001\u0015\u0018oP\u0004p\u0002] yV\u0003z1E#\bB4MqdFS93F\u00021/Z\u007f\u0001\u0012 V~6t\u0003G%", "0`R86(EZ\u0016zxd", "", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n]AX5M", "5dc\u0010b5MS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010b5MS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "1n]AX5M\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u0011:o\u000e,\u000bD\u000b \u0001PK\u001dKr#8Y|\u000fA_\u001a7LMM", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0", "u(I", "5dc [6NZ\u0018]~l4\u0001\u0017=O\t\u0005w>\u0007\u0002$G}\u001c", "5dc$\\5=]+", "u(;.a+K]\u001d}Do0|\u001bxW\u00041zJ\u0013l", "\u0011n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", ";`h/X\u0019>U\u001d\r\n^9Y\u0005-k]$\u0003G}\u0013\u0015M", ";`h/X\u001cG`\u0019\u0001~l;|\u0016\fa}.Y<\b\u001e\u0014Cm\u0014", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@k]o:", "\u000foX\u007f&\u0010F^ ", "\u000foX\u007f'\u0010F^ ", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private Object backCallback;
    private final MutableState content$delegate;
    private final Function0<Unit> onDismissRequest;
    private final Animatable<Float, AnimationVector1D> predictiveBackProgress;
    private final CoroutineScope scope;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;
    private final Window window;

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z2, Function0<Unit> function0, Animatable<Float, AnimationVector1D> animatable, CoroutineScope coroutineScope) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z2;
        this.onDismissRequest = function0;
        this.predictiveBackProgress = animatable;
        this.scope = coroutineScope;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1990getLambda2$material3_release(), null, 2, null);
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content$delegate.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content$delegate.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(576708319);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)353@14383L9:ModalBottomSheet.android.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((3 & i3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576708319, i3, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = ModalBottomSheetDialogLayout.this;
                    int i5 = i2;
                    modalBottomSheetDialogLayout.Content(composer2, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)));
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    private final void maybeRegisterBackCallback() {
        OnBackAnimationCallback onBackAnimationCallbackCreateBackCallback;
        if (this.shouldDismissOnBackPress && Build.VERSION.SDK_INT >= 33) {
            if (this.backCallback == null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    onBackAnimationCallbackCreateBackCallback = Api34Impl.createBackCallback(this.onDismissRequest, this.predictiveBackProgress, this.scope);
                } else {
                    onBackAnimationCallbackCreateBackCallback = Api33Impl.createBackCallback(this.onDismissRequest);
                }
                this.backCallback = onBackAnimationCallbackCreateBackCallback;
            }
            Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
        }
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjAӄLe^.ZS8\u0014s{J$cҕyCQU\"Ԃ(ߟOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e)k\u0013'2pqo=[rU?pvF\u0005N7P<*\u0015\u000f BT x\u000bCy\u0014\"2Pph[;T5\u001e \u0010V /)#lߗ:T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-sl]@\u0011e\u0013J\u000b1W[\r\bgV@\fw\u001ae\u0015$", "", "u(E", "1qT.g,\u001bO\u0017\u0005XZ3\u0004\u0006+c\u0006", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007r Kw\nKz/>7y'>j\u0012,S\u0019", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ">qT1\\*MW*~WZ*\u0003s<o\u00025{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @JvmStatic
        public static final OnBackAnimationCallback createBackCallback(final Function0<Unit> function0, final Animatable<Float, AnimationVector1D> animatable, final CoroutineScope coroutineScope) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(animatable, backEvent, null), 3, null);
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(animatable, backEvent, null), 3, null);
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    function0.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(animatable, null), 3, null);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjA0JeP.hS2\u000fq|:Ɲ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u001fQ\u0010\u001e\u0016'l\\Sc{u\u0018\u001f4Rom8{s\u0004>)\rD\u000b82P=*\t\u000f!BH>~+IY\u0015*2VohQSRM2 \u0010V /#\rk\\=`l\fB_)\u0011rZP=^^{\u0014\u0012ШX2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-sl]@\u0011e\u0013J\u000b1W[\r\bgV@\u000bw\u001ae\u0015$", "", "u(E", "1qT.g,\u001bO\u0017\u0005XZ3\u0004\u0006+c\u0006", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007z Xy\u0014<u\u00031`\u0005\u001d3k\u001c\u0004", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ";`h/X\u0019>U\u001d\r\n^9Y\u0005-k]$\u0003G}\u0013\u0015M", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "0`R86(EZ\u0016zxd", ";`h/X\u001cG`\u0019\u0001~l;|\u0016\fa}.Y<\b\u001e\u0014Cm\u0014", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        public static final OnBackInvokedCallback createBackCallback(final Function0<Unit> function0) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    function0.invoke();
                }
            };
        }

        @JvmStatic
        public static final void maybeRegisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        @JvmStatic
        public static final void maybeUnregisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }
}
