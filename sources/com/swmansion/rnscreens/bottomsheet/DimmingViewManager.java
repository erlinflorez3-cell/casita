package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN/ZS@\u000fsڔ<$i)yCAY\"}0\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[ys܈?2pnw2g0PId\u00036\u001d `#H}\u0013\u00032*v\u0013ͯ~CY\u0010Z>N\u0002RR;S5\u001e \bV /!#g\u0017PV~u:]63mPP?_^\u007f}\u0017Th?\u0013\u0007c.+n:c*mg\u0011\u001dj[m\u0016ouK\u0007\u0001'U.yweMp\u007fB-s]\u001bv\u000b&\u000b\u000f\u0002d\u001a)CO\u0012N\u0017\u000ex\n\t\u0001%<2\u0014\\ΪJͶ1 nڜ&5zyaH!\u0010lK\u0018|w5E/VĔ7ݰ\u001ffYĥ\f+\\B\u0014\u0005;*yШ1Ĳ_Z\u0016֫-\u001dZ\u0005_?\"OKHf\n\b>ъ\bvj̣B\u00066V\u000e?ɮ\u0015I"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laKn_5Jx'T\"", "", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~H\u0001 ?m\u0015\u001bM?9z\u0012(\u001ewaL\u00169\u0013L\u0001/\u0011Z`4X[\u0001A\u001e\u001b$\u001bW9\u000b\u0012YA-|\u000e%\u001d\u0015,I\u000b\u0011,q", "2h\\:\\5@D\u001d~\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laK\\", "5dc\u0011\\4FW\"\u0001kb,\u000fG<e{&\u000b:\n\u0013&K\u0001\u000e6\u0005#BY})Eg#.TC7y4", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W9\u00014Dc\u0006.:m\u0016=\u0017\"?s<\"\u001ejR=\u0007u\u0002", "2h\\:\\5@D\u001d~\r<(\u0004\u0010,a}.", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_1\u001a\u001e!i\u0018V\u0019\u0010\u0005YP\u0002jK>\u001c\u0004*OW", ";`g\u000e_7AO", "", "5dc\u001aT?\u001aZ$\u0002v\u001d9|\u0005-ty1wO\u0005(\u0017A}\fIv%>gw-7t\u0016*[C", "u(5", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#l#7u\u0016-:C7iC{\u001fqp9\u001ar\u0002", "1qT.g,\u001dW!\u0007~g.m\r/w", "=m12[(OW#\u000f\b:;\f\u0005-h\u007f'", "", "0dW.i0H`", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_H", "=mE6X>!W\u0019\fvk*\u007f\u001d\rr\u007f$\u000b@\u007f", "@n^A", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "@d`B\\9>0#\u000e\nh4j\f/e\u000f\u0006wG\b\u0014\u0013Eu", "\u000fmX:T;>2\u001d\u0007\u0003b5~y3e\u0012\u0006wG\b\u0014\u0013Eu", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DimmingViewManager {
    private final DimmingView dimmingView;
    private BottomSheetBehavior.BottomSheetCallback dimmingViewCallback;
    private final float maxAlpha;
    private final ThemedReactContext reactContext;

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007toA0JeP.hS2\u000fq\u0006<$i*yّCU(}*\tUQmg\u0005Ϻ\u000b\u000bq\u000eF1\tn:Imx\f\u0013\u001f6PqW3{rM=nxN\u0005N7ŕ<y\u0013\u0007b8V#\u000fzqP<\u0016>T\t:\u0001\"\u0014\u0005b(\u0014T8\u0001Ls\u0018RD`\u0005]h2S\u0007w[f'\u000e5CaU\\bA%v\u00105[DEM-%\u0002\u00067ViZ\u001b? RK|w;9P\f_Ta(\u0016+*}\u0015\fz|؛\u0007Ōd\f/˃ oYZ&(&\u007fRȡHǬ\u0012\u0006/Ξ~9(q \u000eayIԢLг\u0006^JȕKmD#=\u007fa0\u0010ӘrЂe;!\u05cb\b\u000b\u0013\u00116#/sĲ_Z\u0016֫-\u001dZ\u0005_?\"OKHf\n\b>ъ\bvj̣B\u00066V\u000e?L <\u0019=7\n<؝%q\n҆\\i|\u0016nz\u05eemn"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laKn_5Jx'T\u000b*5`ZnL\u0014p^\u0016V/\u0016\u0007JE$\u0001\"3&\u000f)E\u007fA>", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@\"?h\r*?{\u0019.MR\u0005H>-$ri'\nc,]S'JH_0f_1\u001a\u001e!i\u0018V\u0019\u0010\u0005YP\u0002jK>\u001c\u0004*OW", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "DhTDG6\u001a\\\u001d\u0007vm,", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ";`g\u000e_7AO", "", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bS\u00073v\u0015;WG:5E\"\u0015z+*\u000bc>$Wj8", "/mX:T;H`", "\u001a`]1e6BRbz\u0004b4x\u00183o\tql<\b'\u0017#x\u0012Dr4?fS", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "4ha@g\u000bB[!~yH-}\u0017/t", "7mc2e=:Z\u007f~\u0004`;\u007f", ":`a4X:MC\"}~f4|\b\u0019f\u00016{O", "5dc\u001aT?\u001aZ$\u0002v", "u(5", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "5dc#\\,PB#Z\u0004b4x\u0018/", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1n\\=h;>=\u001a\u007f\t^;]\u00169m^(\u000b@\n&zPn\u000eO", "7mS2k", "", "=mB9\\+>", "", "0ncAb4,V\u0019~\n", "AkX1X\u0016?T'~\n", "=mBAT;>1\u001cz\u0004`,{", "<df g(MS", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnimateDimmingViewCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final ValueAnimator animator;
        private float firstDimmedOffset;
        private float intervalLength;
        private float largestUndimmedOffset;
        private final float maxAlpha;
        private final Screen screen;
        private final View viewToAnimate;

        public AnimateDimmingViewCallback(Screen screen, View viewToAnimate, float f2) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
            this.screen = screen;
            this.viewToAnimate = viewToAnimate;
            this.maxAlpha = f2;
            this.largestUndimmedOffset = computeOffsetFromDetentIndex(screen.getSheetLargestUndimmedDetentIndex());
            float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(RangesKt.coerceIn(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().size() - 1));
            this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
            this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f2);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.DimmingViewManager$AnimateDimmingViewCallback$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DimmingViewManager.AnimateDimmingViewCallback.animator$lambda$1$lambda$0(this.f$0, valueAnimator);
                }
            });
            this.animator = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animator$lambda$1$lambda$0(AnimateDimmingViewCallback this$0, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            View view = this$0.viewToAnimate;
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float computeOffsetFromDetentIndex(int i2) {
            int size = this.screen.getSheetDetents().size();
            if (size != 1) {
                if (size != 2) {
                    if (size == 3 && i2 != -1) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                BottomSheetBehavior<Screen> sheetBehavior = this.screen.getSheetBehavior();
                                Intrinsics.checkNotNull(sheetBehavior);
                                return sheetBehavior.getHalfExpandedRatio();
                            }
                            if (i2 == 2) {
                                return 1.0f;
                            }
                        }
                        return 0.0f;
                    }
                } else if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1.0f;
                        }
                    }
                    return 0.0f;
                }
            } else if (i2 != -1 && i2 == 0) {
                return 1.0f;
            }
            return -1.0f;
        }

        public final float getMaxAlpha() {
            return this.maxAlpha;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final View getViewToAnimate() {
            return this.viewToAnimate;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float f2) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            float f3 = this.largestUndimmedOffset;
            if (f3 >= f2 || f2 >= this.firstDimmedOffset) {
                return;
            }
            this.animator.setCurrentFraction((f2 - f3) / this.intervalLength);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int i2) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i2 == 1 || i2 == 2) {
                this.largestUndimmedOffset = computeOffsetFromDetentIndex(this.screen.getSheetLargestUndimmedDetentIndex());
                float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(RangesKt.coerceIn(this.screen.getSheetLargestUndimmedDetentIndex() + 1, 0, this.screen.getSheetDetents().size() - 1));
                this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
                this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            }
        }
    }

    public DimmingViewManager(ThemedReactContext reactContext, Screen screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.reactContext = reactContext;
        this.dimmingView = createDimmingView(screen);
        this.maxAlpha = 0.3f;
    }

    private final DimmingView createDimmingView(final Screen screen) {
        DimmingView dimmingView = new DimmingView(this.reactContext, this.maxAlpha);
        dimmingView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dimmingView.setOnClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.bottomsheet.DimmingViewManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DimmingViewManager.m8767x2fa1e2d5(screen, view);
            }
        });
        return dimmingView;
    }

    private static final void createDimmingView$lambda$1$lambda$0(Screen screen, View view) {
        Intrinsics.checkNotNullParameter(screen, "$screen");
        if (screen.getSheetClosesOnTouchOutside()) {
            Fragment fragment = screen.getFragment();
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((ScreenStackFragment) fragment).dismissSelf$react_native_screens_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createDimmingView$-Lcom-swmansion-rnscreens-Screen--Lcom-swmansion-rnscreens-bottomsheet-DimmingView-, reason: not valid java name */
    public static /* synthetic */ void m8767x2fa1e2d5(Screen screen, View view) {
        Callback.onClick_enter(view);
        try {
            createDimmingView$lambda$1$lambda$0(screen, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private final BottomSheetBehavior.BottomSheetCallback requireBottomSheetCallback(Screen screen) {
        if (this.dimmingViewCallback == null) {
            this.dimmingViewCallback = new AnimateDimmingViewCallback(screen, this.dimmingView, this.maxAlpha);
        }
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.dimmingViewCallback;
        Intrinsics.checkNotNull(bottomSheetCallback);
        return bottomSheetCallback;
    }

    public final DimmingView getDimmingView$react_native_screens_release() {
        return this.dimmingView;
    }

    public final float getMaxAlpha$react_native_screens_release() {
        return this.maxAlpha;
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final void onBehaviourAttached(Screen screen, BottomSheetBehavior<Screen> behavior) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        behavior.addBottomSheetCallback(requireBottomSheetCallback(screen));
    }

    public final void onViewHierarchyCreated(Screen screen, ViewGroup root) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(root, "root");
        root.addView(this.dimmingView, 0);
        if (screen.getSheetInitialDetentIndex() <= screen.getSheetLargestUndimmedDetentIndex()) {
            this.dimmingView.setAlpha(0.0f);
        } else {
            this.dimmingView.setAlpha(this.maxAlpha);
        }
    }
}
