package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.math.MathUtils;
import com.swmansion.rnscreens.bottomsheet.SheetUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"2\u0013\u007f\u0007tsA0JfP.XV2\u000fy\u0002<$a$yCIZ\"}(\u0010WN}gvJ`\fK\u000f\u001c\u0016\u0001j2J]xk\u0012\u00172H\u0006g3QzC>vҚTAP2P72\u0004=Z5X\u0014\u0005z[K:\u0013ضDpHTUs\u0013>*\u0006lE1\"j\u000ef6v|\u000e>=J\u001bip^Wc>%e\rtdW\u0013|a,TX7c%mY\u00111j[m(\u0006\u0004\u0006\u000bvR?+w\u0019\u001eH!.\"ACO;\u0003#*j2i`:.[Sqyh\u000eV\b+\u007f\u001bk\u001c\u000e47x2;J~\b<C%vaqh\u0002\rRF\r*j%W\u00183Y^Kj_\u000fS\u0019|>,\t\u001bL;\u0001\u001d1\fX\u001c\u0010-\u001b\u0003\b\u00025_pUH|\u001a\nA{5\tb0:44U&G{?>_7E\u000fQ#O\u00112RR\u001c\u000f\u000bpjci\u0001enC7\u001cE_!\f\ta+\u00054\\b\u000fD\u0017]\u001ed\u0007,%AA#w\u0005/3GfO\u0017y\u001bQkB=/\u0015G n4\u001cerv3ca\u0014\u0014o\r\u000f\u0014mO)\u0005!xP\u000f$Z\u000bMR<V\u001f(}\fF^\fAOm\u0013lB:41\\CLYٟN˩\u0001\u000bgZv\u0015OfA*\u001biR{?A'ʗr״k|a.\u0003h06\u0012_C#>UPs\u000bí%ȷ\u0003u\bGuX\u0018Xz#\u000eU*'l֠Eֺ3=\u001bÁO5@\u0010EEzy<ʻYɟ+z\u0005Ȫ_Gv=\u007f\b\u0019\u0001\u0003ߏvߝST\u001fǱGj\u00014 d.\n8Â\u0007ĕgT\u0013ϵ\u000fU\u0001\u0015q<|KSā+Ǫ)\u0001wܲMA;W?\u001dD\bjٯ!˸aiwЃJq\u001d&\re2-І\u001aujГu4AMWoOP0;\u0005\u0003pX!8^Ⱥ\u000bΌ\u00117`Cj\tdQ\u001e\u001d=\u0018~\u0007Z\u001d'\u00172ƨ\u0015̭\u00028Fa0\u000fQ\u0017drQA)Oif\u001c\u000b\u0002\u001daͪ\u0011ϻ\u000f\u007fIp\u0018:K?'qp)H\u000e\u0004\u001aFAi\u007f\u001b;7Ejl\u0013ލ\rͲXm\u001e\u0012\u0001\"T\u0003ʾ\u001bo"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\b*Fm#\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "4n^AX9\u001cO \u0006wZ*\u0003", "1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.\u0016c\b/7zT/WMJkA{\u0011oh6\u0003a2\rB", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\b*Fm#lNMEz4+rdh@\u0004_*T5r\u001d", "6`b\u001fX*>W*~yB5\u0001\u00183a\u0007\u000fwT\u000b'&(|\u0018Da!BY\u0007/", "", "5dc\u0015T:+S\u0017~~o,{l8i\u000f,wGg\u0013+Q\u007f\u001d\u001d\u0004/=Dy-7v%", "u(I", "7mb2g:\u001a\\\u001d\u0007vm0\u0007\u0012", "1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.\u0016c\b/7zT2VQ;zBy\u001eli5\u0016g6W5r", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\b*Fm#lQLIkC,pqeA\u0003r0X\u007fe\u0013\"", "7r0;\\4:b\u001d\t\u0004<6\u0006\u0018<o\u0007/{?]+|G\u0004\u000bFr24", "7r2._3;O\u0017\u0005g^.\u0001\u0017>e\r(z", ":`bA56Mb#\u0007^g:|\u0018", "", ":`bA66Gb\u0015\u0003\u0004^9_\t3g\u00037", ":`bAF3BR\u0019h{_:|\u0018", "", ":`bAF;:P ~ha,|\u0018\u001dt{7{", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U{/\u0015w\u001f=MVJA", "@dP0g\u000f>W\u001b\u0002\n", "5dc\u001fX(<b{~~`/\f", "u(8", "@dP0g\u001eBR(\u0002", "5dc\u001fX(<b\u000b\u0003ym/", "Aba2X5)O&~\u0004m", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "5dc V9>S\"ivk,\u0006\u0018", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "AgT2g\t>V\u0015\u0010~h9", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "5dc [,>bu~}Z=\u0001\u0013<", "u(;0b4\bU#\t|e,F\u00058d\r2\u007f?J\u001f\u0013Vo\u001b@r,~V\b/Fw\u001e<PC;z}z\u001fwpC\u000fQ/Nv6$LQ(mV|Ji", ":`h<h;\u001f]#\u000ezk\u0016\u0006|\u000bx\u00046", "", "1n]AT0GS&azb.\u007f\u0018", "4n^AX9!S\u001d\u0001}m", "AgT2g\u001bH^", "0ncAb4\"\\'~\n", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m;.l6Nb", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "=m?.e,Gb\u007fz\u000fh<\f", "@dV6f;>`\u000b\u0003\na\u001a\u007f\t/t\\(~<\u0012\u001b!T", "0dW.i0H`", "@d`B\\9>A\u0017\fz^5g\u0005<e\t7", "@d`B\\9>A\u001c~zm\t|\f+v\u00042\t", "AgT2g\u001bH^|\bhm(y\u0010/S\u000f$\u000b@", "AsPAX", "AgT2g\u001bH^\u000b\u0002~e,[\u0016+g\u0002,\u0005B", "AkX1X\u0016?T'~\n", "Cma2Z0Lb\u0019\flb;\u007fv2e\u007f7X@\u0004\u0013(Ky\u001b", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenFooter extends ReactViewGroup {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenFooter";
    private ScreenFooter$footerCallback$1 footerCallback;
    private final ScreenFooter$insetsAnimation$1 insetsAnimation;
    private boolean isAnimationControlledByKeyboard;
    private boolean isCallbackRegistered;
    private int lastBottomInset;
    private int lastContainerHeight;
    private float lastSlideOffset;
    private int lastStableSheetState;
    private final ReactContext reactContext;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\b*Fm#l+MCv0'\u0019rj\u000f", "", "u(E", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.swmansion.rnscreens.ScreenFooter$footerCallback$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.swmansion.rnscreens.ScreenFooter$insetsAnimation$1] */
    public ScreenFooter(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.lastStableSheetState = 5;
        ?? r2 = new WindowInsetsAnimationCompat.Callback() { // from class: com.swmansion.rnscreens.ScreenFooter$insetsAnimation$1
            {
                super(0);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void onEnd(WindowInsetsAnimationCompat animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.isAnimationControlledByKeyboard = false;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
                this.this$0.lastBottomInset = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom - insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                ScreenFooter screenFooter = this.this$0;
                int i2 = screenFooter.lastContainerHeight;
                int reactHeight = this.this$0.getReactHeight();
                ScreenFooter screenFooter2 = this.this$0;
                screenFooter.layoutFooterOnYAxis(i2, reactHeight, screenFooter2.sheetTopWhileDragging(screenFooter2.lastSlideOffset), this.this$0.lastBottomInset);
                return insets;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                this.this$0.isAnimationControlledByKeyboard = true;
                WindowInsetsAnimationCompat.BoundsCompat boundsCompatOnStart = super.onStart(animation, bounds);
                Intrinsics.checkNotNullExpressionValue(boundsCompatOnStart, "onStart(...)");
                return boundsCompatOnStart;
            }
        };
        this.insetsAnimation = r2;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter".toString());
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewCompat.setWindowInsetsAnimationCallback(decorView, (WindowInsetsAnimationCompat.Callback) r2);
        this.footerCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.swmansion.rnscreens.ScreenFooter$footerCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float f2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                this.this$0.lastSlideOffset = Math.max(f2, 0.0f);
                if (this.this$0.isAnimationControlledByKeyboard) {
                    return;
                }
                ScreenFooter screenFooter = this.this$0;
                int i2 = screenFooter.lastContainerHeight;
                int reactHeight = this.this$0.getReactHeight();
                ScreenFooter screenFooter2 = this.this$0;
                screenFooter.layoutFooterOnYAxis(i2, reactHeight, screenFooter2.sheetTopWhileDragging(screenFooter2.lastSlideOffset), this.this$0.lastBottomInset);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int i2) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (SheetUtils.INSTANCE.isStateStable(i2)) {
                    if (i2 == 3 || i2 == 4 || i2 == 6) {
                        ScreenFooter screenFooter = this.this$0;
                        screenFooter.layoutFooterOnYAxis(screenFooter.lastContainerHeight, this.this$0.getReactHeight(), this.this$0.sheetTopInStableState(i2), this.this$0.lastBottomInset);
                    }
                    this.this$0.lastStableSheetState = i2;
                }
            }
        };
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.lastContainerHeight > 0;
    }

    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final Screen getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        return requireScreenParent().getSheetBehavior();
    }

    public static /* synthetic */ void layoutFooterOnYAxis$default(ScreenFooter screenFooter, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        screenFooter.layoutFooterOnYAxis(i2, i3, i4, i5);
    }

    private final Screen requireScreenParent() {
        Screen screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final BottomSheetBehavior<Screen> requireSheetBehavior() {
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final int sheetTopInStableState(int i2) {
        BottomSheetBehavior<Screen> bottomSheetBehaviorRequireSheetBehavior = requireSheetBehavior();
        if (i2 == 3) {
            return bottomSheetBehaviorRequireSheetBehavior.getExpandedOffset();
        }
        if (i2 == 4) {
            return this.lastContainerHeight - bottomSheetBehaviorRequireSheetBehavior.getPeekHeight();
        }
        if (i2 == 5) {
            return this.lastContainerHeight;
        }
        if (i2 == 6) {
            return (int) (this.lastContainerHeight * (1 - bottomSheetBehaviorRequireSheetBehavior.getHalfExpandedRatio()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    public final int sheetTopWhileDragging(float f2) {
        Screen screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) MathUtils.lerp(sheetTopInStableState(4), sheetTopInStableState(3), f2);
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    public final void layoutFooterOnYAxis(int i2, int i3, int i4, int i5) {
        int iMax = ((i2 - i3) - i4) - Math.max(i5, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            registerWithSheetBehavior(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            unregisterWithSheetBehavior(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (getHasReceivedInitialLayoutFromParent()) {
            layoutFooterOnYAxis(this.lastContainerHeight, i5 - i3, sheetTopInStableState(requireSheetBehavior().getState()), this.lastBottomInset);
        }
    }

    public final void onParentLayout(boolean z2, int i2, int i3, int i4, int i5, int i6) {
        this.lastContainerHeight = i6;
        layoutFooterOnYAxis$default(this, i6, getReactHeight(), sheetTopInStableState(requireSheetBehavior().getState()), 0, 8, null);
    }

    public final void registerWithSheetBehavior(BottomSheetBehavior<Screen> behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.isCallbackRegistered) {
            return;
        }
        behavior.addBottomSheetCallback(this.footerCallback);
        this.isCallbackRegistered = true;
    }

    public final void unregisterWithSheetBehavior(BottomSheetBehavior<Screen> behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.isCallbackRegistered) {
            behavior.removeBottomSheetCallback(this.footerCallback);
            this.isCallbackRegistered = false;
        }
    }
}
