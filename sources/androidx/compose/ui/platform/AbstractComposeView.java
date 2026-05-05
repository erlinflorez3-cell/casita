package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0JeP.hS2\u000f\u0002{<řc$\bCC٥\"}0\u0012WȞog\u0005Jb\u000bQ\u000f\u000e\u0016~r4Ikxe\u0012\u0015@JoU3UڎE9vt>\u0005&P*8\u0010\u0005\t\u001a0I\u0016\u001c\u0011ŏ{\f@/\u0001\u0014@W\u001dQ\u0013\u001a*\u0006l!\u0011&bg\\8`ns9]&\u0013oHN5cH|{\u0012ТX'\u001b|*)9hO5C5\u001a(\u07baV[M,\b\u0002K/\u0001'U;yyeap\u0002*\u0014Y{Sq;@j/i`:7[Uqvh\u0010>v)(=B\u0012;\u001e)^-[H-\u001cVK\u0003\u001dk@~\u0012\u000fH\u000e&y8-$._[=)\u0016iai\u001e\u0015KD'\u001bH;\u0001\u001d1\fZ\u001c\f-\u001djv\u007f]\u0002DKwf\n\bB\u001e\n~\u0010\u001a,\u001a/u.u\u0010YN%OO[g3Qq\u0010s\\i\r\u0004\u000f\u0015\u0004m`xX\"\u001d\u001bg.\u0017=rD\u0013\n2d\u001dz:Ce\u001c\u0003\u0014.\u000e!KtyR S<~Sv\u0019\u0003M\f\u000fU5tdqp\u0002\r\u0006g%E}{qByR%!oBp0phXR:\u0007\r,0a`j>|,J\\9+4UpJb\\5'\u0010-H1+\tSE\u000fm\u000f\u0001\u0010-dy$Km2*!\u0001~l9su/a,+pj3O\tM\u0019Tehh|01?\u0017s.W\u0018PU\u0006\u0005\u0016$b,$$TQQ]BC\u0013\rdJ\u0002[J|vs\u000ee\u0012U\u007f-}\u001dx\u0001.\u0016\r1~ݽdjP\u000e\u001d206vrQ\u0018\u0015\u0004\b\"^zuh\u0005\u000fi\u007far1^\u0003\\̞\u0001\u0005%`m\u0007}e\u00155[Pm1^}\"s-a\fy6@B\u0011\u001dk\re2<\u0014\u001a}\u001ci]`HhMg9V\"Rq3FV&\u0010\bp\u000ed\u0011A\u0005Yd\u001f[hQ\u0019l\u0016f51Sr\u001fqHY\b}b>\u0010.\u0002\u0004\u0016\u0014\rHU\u0015[\u0015\u007fm\u001cP#\r\u0013\u001d\u0018R\u00141\u001d\"LA.\u001fob75L\b`<O\u0005z\u0005j\u0012j4tJ\u0016U[T\u0018\u0016@\u0001\u000e\u0012w\u0011-1p|\u0004d\u001c!\u0011\\\u0005X5dS$9*/\fUGf\u0005C~\u001dmtd_g@Ok\u001d7j3U\r7=+ra\u007f/pb\u000f\\]]qR*62Pom<\u0004\u001a?0\u0005-D(\u001bgZ'^%85Κa͇Rd~ԣ7`\\,A\u0001\u0011{<G`ۊ\u0017ĢSrwۮ}X\\\u0004OCH\u000emװ5ܰ\u0010|k˪kG\u0014CEEYl$'*gi:,\u0017vì3ؗx'dަ\u001eh\u0010n)Lf\u0001$u\u001a\tA]VH̛Nx\u000b\f4\u001cDdR?\u0010)vY\u001a\u0005w̻3߿p\u0006JŮ9\u0019\u0018{\u0005e\u0005T9\f\u00177d\u0011\u0007/f\u001c70\fnìfϳ\u0015Y(ǅ1\u0002\u001a.49\u0007(pE(Qyg\u001f\u0007\u007fa\u001bBGm@`_K\u0011^TΨ\u0006Ȅ\b0\\ӏ5=\\jL\u0003Ynzao\u000e\rw^7Kט+ِ\u0001\u0003``\u00173B[CHrPO\u0019Mh=Kn\u001e\u001cEw3Wu\u0011\u0004qΨ>цs:~֫\u0013<h\u0017\u000e<Z\u000bx#uAMHZa(L*:{\u000b\u001b&yR`B65GNg˒\\ߣ$Bt\u001c\"a_Z§\u001dc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "2dU g@ESt\u000e\nk", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]L\u000b\u000b=", "1`R5X+/W\u0019\u0011ik,|f9m\u000b2\nD\u0010\u001b!PM\u0018E\u0006%Hh", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "1qT.g0GUv\t\u0003i6\u000b\r>i\n1", "", "2hb=b:>D\u001d~\r<6\u0005\u00149s\u00047\u007fJ\n\u0005&Tk\u001d<x9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u0011\\:I]'~kb,\u000ff9m\u000b2\nD\u0010\u001b!P]\u001dIr45[\u0012^3v\u001f8\\?Jo>'#", "u(E", "6`b\u0010b4I]'\u0003\nb6\u0006", "5dc\u0015T:\u001c]!\n\u0005l0\f\r9n", "u(I", "7rC?T5LW(\u0003\u0005g\u000e\n\u0013?pm(\u000b", "D`[BX", ">`a2a;\u001c]\"\u000ezq;", "Adc\u001dT9>\\(\\\u0005g;|\u001c>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>%*", "\u001a`]1e6BRb\t\t(\u0010Y\r8d\u007f5Q", ">qTC\\6Nat\u000e\nZ*\u007f\t.W\u00041zJ\u0013\u0006!Mo\u0017", "Adc\u001de,OW#\u000f\t:;\f\u0005-h\u007f'mD\n\u0016!Y^\u0018Bv.", "uKP;W9HW\u0018H\u0005lu`e3n~(\t\u0016D\b", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u0011:o\u000e,\u000bD\u000b \u0001PK\u001dKr#8Y|\u000fA_\u001a7LMM", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0", "Ag^D?(R])\u000eWh<\u0006\b=", "5dc [6P:\u0015\u0013\u0005n;Y\u0013?n~6:<\n !Vk\u001d@\u0001.C", "5dc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "Adc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "uY\u0018#", "7r09\\=>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>%.", "\u0011n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "/cS#\\,P", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ">`a.`:", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "7mS2k", "EhSA[", "6dX4[;", "/cS#\\,P7\"evr6\r\u0018", ">qTCX5M@\u0019\u000b\u000b^:\fo+y\n8\u000b", "1gT0^\b=R\n\u0003zp", "1qT.g,\u001c]!\n\u0005l0\f\r9n", "2hb=b:>1#\u0007\u0006h:\u0001\u00183o\t", "3mbBe,\u001c]!\n\u0005l0\f\r9n]5{<\u0010\u0017\u0016", "7mc2e5:Z\u0003\baZ@\u0007\u0019>", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "7mc2e5:Z\u0003\baZ@\u0007\u0019>$\u0010,uM\u0001\u001e\u0017C}\u000e", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e>8\u007f:\u000e\u0017\u001eGk\u001c<", "7rC?T5LW(\u0003\u0005g\u000e\n\u0013?p", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m;.l6Nb", "=m<2T:N`\u0019", "=mAA_\u0017K]$~\bm0|\u0017\rh{1}@\u007f", ":`h<h;\u001dW&~xm0\u0007\u0012", "@db<_=>>\u0015\fzg;Z\u00137p\n6\u007fO\u0005! %y\u0017Kv8D", "Adc\u001dT9>\\(\\\u0005f7\u0007\u00173t\u00042\u0005\u001e\u000b &G\u0003\u001d", ">`a2a;", "Adc!e(Ga\u001d\u000e~h5^\u00169u\u000b", "Adc#\\,P1#\u0007\u0006h:\u0001\u00183o\t\u0016\u000bM|&\u0017I\u0004", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001e9WQ?z8(\u001eVpF\u0003r,P\u000b|", "Ag^B_+\u001dS z\u000f</\u0001\u0010.P\r(\nN\u0001\u0016\u0005Vk\u001d<", "1`R5X\u0010?/ \u0003\f^", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private Composition composition;
    private boolean creatingComposition;
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void Content(Composer composer, int i2);

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 + 2) - (2 | i3) != 0 ? null : attributeSet, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? 0 : i2);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.showLayoutBounds = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z2);
        }
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        ensureCompositionCreated();
    }

    private final void checkAddView() {
        if (!this.creatingComposition) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer) compositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = isAlive(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 != null) {
            return compositionContext2;
        }
        AbstractComposeView abstractComposeView = this;
        CompositionContext compositionContextFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(abstractComposeView);
        CompositionContext compositionContext3 = null;
        CompositionContext compositionContextCacheIfAlive = compositionContextFindViewTreeCompositionContext != null ? cacheIfAlive(compositionContextFindViewTreeCompositionContext) : null;
        if (compositionContextCacheIfAlive != null) {
            return compositionContextCacheIfAlive;
        }
        WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (compositionContext = weakReference.get()) != null && isAlive(compositionContext)) {
            compositionContext3 = compositionContext;
        }
        return compositionContext3 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(abstractComposeView)) : compositionContext3;
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i2) {
                        ComposerKt.sourceInformation(composer, "C258@11181L9:ComposeView.android.kt#itgzvw");
                        if ((i2 & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-656146368, i2, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                        }
                        AbstractComposeView.this.Content(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i2, i3);
    }

    public void internalOnMeasure$ui_release(int i2, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        internalOnLayout$ui_release(z2, i2, i3, i4, i5);
    }

    public void internalOnLayout$ui_release(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i4 - i2) - getPaddingRight(), (i5 - i3) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i2);
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.isTransitionGroupSet = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        checkAddView();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        checkAddView();
        super.addView(view, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        checkAddView();
        return super.addViewInLayout(view, i2, layoutParams, z2);
    }
}
