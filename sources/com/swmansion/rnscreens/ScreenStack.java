package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.events.StackFinishTransitioningEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":3\u007f\u0007|jAӄLeVMZS@\u000fs{:$c$\bCCU0}*\tUOog|Sb\u000bI\u0013\u000e\u0016\u0007p4I[ye\u0012%2JoE:UoK9ht<\u0006(288\u0002\u0005\u0007\u001c2H&v\u0003ŏS\f 7Hp@T\u0015M\u001b\u001a\u001a\u0006D.\u0017Ȧz+~6vk\u0016:rgCvRT5_H~c\ftUܮ\u0011vo sNEW-%\u0002\b7Vib\u001b? XKzo39m\fWd}0\u0018#Qg\r\fwnj\u0013xx\fUP\u007fgYx&(&$B\u001f\u0005\n\u001c0?H\\R`fP\u0014A \u000bSnuH^\u000b\u001e\t\u000eN\u0017S\u0010c/GC~Q\u0010dIRE)\u001d\rLQ1r/\u000bl\u000e\u000fEaf@_?\u0003X=vs:]K \u001cp\u00110p\u0018xW\u000eb\u0014\u0011\\'U=im;#\u0002\u0001vy.\u000bMfv\n\u0002Rveh\u0001^A8@$^rlUk~ӹ\u001f,YS*\r\u001f}68fp@@/^(N}\u000e2|[\u0018\"%]\fga|'&[gf\u00045\u007fүVa\u001b|\"{Tb3}-V\u001c\u001ah\u001a@\"`m\u001b\u0014\u0006:\\N:*xS:*BkI\u0019\u000b:x\u0007,tY|7\u000e!|X\rbs<\u0003\u0018I%\r\u000f\u0003tp\u001e\u0016?]t\rncEA\u007fZI,cd\u00016\u0013\"54:\u007f\u0018yZJdr&we{N\u001bH=(Ȁ?т\u0013~1ɅRCSR\u000boaS\"+)\u0005J\u000fiÜ\\n^ρrݽdjR֢%-0\u007fv|3\u000et\u0004(i\u0017zuϊ\u0003\u00122ůU\u03a2\u0007YDѾ\t\u001c\u0013)65\u0011q2|c2q2\u0006\u001c\b\u0016?\u0015\u0010bH{d>ˏ\u0013*\rg\n9q$@z_lJ;fY0ˡJѐ(x\u000bܩ`l}\u0019P\u001bT\u000f9[OxAbFb#/,v]\u0530\u0019\u0080Z[Bܤ@\nBDw*\"ZTйjǜ)\u0011Uω8y{ct\u000bx\u001f`Ν\bϥr\u0012$ܻpbe{!04\u0004n݀Mވf\u0005DɿtC:V \u000bqo Jخ~\u0004^a\u00153@_DWd,l\tlXX\u0005\u000fJ\u000f,\u0013\u0007\u000f\u0011C\u001e':\u0010\u0011D۱Vвg2\tҵm\u001d)\ng\u0001|$Y_\u000b\u000eqϐZ܁\u000fIuEO\"D!\u00187{\r\b\u000eN\u0017+\"\u0019ȳ'ʦU\u0011gڻғbP"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sk", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "2hb:\\:LS\u0018p\bZ7\b\t<s", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-\u0007u]D\u0012c9$", "2qPD\\5@=$i\u0005h3", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sT\rZ?Mo= ~s7", "2qPD\\5@=$\r", "4qP4`,Gb'", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0013e(@[\u0019\b\nl", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "5nX;Z\rH`+z\b]", "", "5dc\u0014b0GUy\t\bp(\n\b", "u(I", "Adc\u0014b0GUy\t\bp(\n\b", "uY\u0018#", "7r32g(<V\u001d\b|<<\n\u0016/n\u000f\u0016yM\u0001\u0017 ", ">qTC\\6Nav\u0002~e+\n\t8C\n8\u0005O", "", "@d\\<i(EB&z\u0004l0\f\r9nm7wM\u0010\u0017\u0016", "@de2e:>:\u0015\r\nM>\u0007f2i\u0007'\t@\n", "@n^AF*KS\u0019\b", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "5dc\u001fb6MA\u0017\fz^5", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "AsP0^", "Bn_ V9>S\"", "5dc!b7,Q&~zg", "Bn_ V9>S\"p\bZ7\b\t<", "/cP=g", "Aba2X5", "2hb:\\:L", "", "Aba2X5\u001f`\u0015\u0001\u0003^5\f", "2hb=T;<Vw\fvp", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2hb=T;<V\u0003\b[b5\u0001\u00172T\r$\u0005N\u0005&\u001bQx\u0012Ex", "2qPD45=@\u0019\u0006zZ:|", "2qPD6/BZ\u0018", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2qPD\\5@B\u001d\u0007z", "", "3mS#\\,PB&z\u0004l0\f\r9n", "DhTD", "6`b V9>S\"", "Aba2X5\u001f`\u0015\u0001\u0003^5\fz<a\u000b3{M", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "<nc6Y@\u001c]\"\u000evb5|\u0016\u001fp~$\u000b@", "=ac.\\5\u001d`\u0015\u0011~g.f\u0014", "=mD=W(MS", "=mE6X>\u001a^$~vk\u001b\n\u00058s\u00047\u007fJ\nv F", ">da3b9F2&z\r", "=o", "@d\\<i,\u001aZ lxk,|\u0012=", "@d\\<i,,Q&~zg\b\f", "7mS2k", "@d\\<i,/W\u0019\u0011", "AsP?g\u001dBS+m\bZ5\u000b\r>i\n1", "Bta;B-?/dJ\u000fN5{\t<T\r$\u0005N\f\u0013$Gx\u001d*t25Y\u0007", "Dhb6U3>0#\u000e\nh4", "\u0011n\\=T5B]\"", "\u0012qPD\\5@=$", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenStack extends ScreenContainer {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenStack";
    private final Set<ScreenStackFragmentWrapper> dismissedWrappers;
    private final List<DrawingOp> drawingOpPool;
    private List<DrawingOp> drawingOps;
    private boolean goingForward;
    private boolean isDetachingCurrentScreen;
    private int previousChildrenCount;
    private boolean removalTransitionStarted;
    private boolean reverseLastTwoChildren;
    private final ArrayList<ScreenStackFragmentWrapper> stack;
    private ScreenStackFragmentWrapper topScreenWrapper;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u001b\u007fјnjO0L͜P.hS2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7bh\u000e[\u000f4\u001a)n:Nmx\f\u0018?8PvW5cnkA't\u0007\u0011.3:8(\u0007Wɤ|Н\u0014v\u0003ŏƠ\u0010\u001b"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sT\fWKFg=\"\u001fq7", "", "u(E", "\"@6", "", "<dT1f\u000bKO+kzh9{\t<i\t*", "", "4qP4`,Gb\u000b\fvi7|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "@db<_=>R\u0007\u000ev\\2X\u00123m{7\u007fJ\n", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018k/3k\u001c\nVGCgC\"\u001fq7", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean needsDrawReordering(ScreenFragmentWrapper screenFragmentWrapper, Screen.StackAnimation stackAnimation) {
            if (stackAnimation == null) {
                stackAnimation = screenFragmentWrapper.getScreen().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || stackAnimation == Screen.StackAnimation.SLIDE_FROM_BOTTOM || stackAnimation == Screen.StackAnimation.FADE_FROM_BOTTOM || stackAnimation == Screen.StackAnimation.IOS_FROM_RIGHT || stackAnimation == Screen.StackAnimation.IOS_FROM_LEFT) && stackAnimation != Screen.StackAnimation.NONE;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3LeV5ZS0\u0012s{B$cҕwٔ=kڼ.\"7N\u000fj̊rJh\u000b\f\u0013\u0014)\u0011jZ]&\u0013k\u0013'4Xnm5$ڕI˃d\u0001>ӌ84(;\b\t!\u001c0M\u001e|K]Y\u0013*2VohZc˦\u0011ܨ\u0016\u0012FĨ\u0019 bp\\@hncE=/S\u0002P[?_^\u000b$μRù+\u0019~ѭ6-FFC%EU\t\u0018`mϓ\u0007T"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sT\rZ?Mo= ~s7", "", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bk/3k\u001c\u0004\u00114", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "5dc\u0010T5OO'", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001e| (C}c", "Adc\u0010T5OO'", "uKP;W9HW\u0018H|k(\b\f3c\u000eqY<\n(\u0013UEQ-", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0010[0ER", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "Adc\u0010[0ER", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "2qPD\\5@B\u001d\u0007z", "", "5dc\u0011e(PW\"\u0001ib4|", "u(9", "Adc\u0011e(PW\"\u0001ib4|", "uI\u0018#", "2qPD", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class DrawingOp {
        private Canvas canvas;
        private View child;
        private long drawingTime;

        public DrawingOp() {
        }

        public final void draw() {
            ScreenStack.this.performDraw(this);
            this.canvas = null;
            this.child = null;
            this.drawingTime = 0L;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final View getChild() {
            return this.child;
        }

        public final long getDrawingTime() {
            return this.drawingTime;
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setChild(View view) {
            this.child = view;
        }

        public final void setDrawingTime(long j2) {
            this.drawingTime = j2;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Screen.StackPresentation.values().length];
            try {
                iArr[Screen.StackPresentation.FORM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Screen.StackAnimation.values().length];
            try {
                iArr2[Screen.StackAnimation.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Screen.StackAnimation.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Screen.StackAnimation.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Screen.StackAnimation.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Screen.StackAnimation.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Screen.StackAnimation.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Screen.StackAnimation.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Screen.StackAnimation.IOS_FROM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Screen.StackAnimation.IOS_FROM_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ScreenStack(Context context) {
        super(context);
        this.stack = new ArrayList<>();
        this.dismissedWrappers = new HashSet();
        this.drawingOpPool = new ArrayList();
        this.drawingOps = new ArrayList();
    }

    private final void dispatchOnFinishTransitioning() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new StackFinishTransitioningEvent(surfaceId, getId()));
        }
    }

    private final void drawAndRelease() {
        List<DrawingOp> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (DrawingOp drawingOp : list) {
            drawingOp.draw();
            this.drawingOpPool.add(drawingOp);
        }
    }

    private final DrawingOp obtainDrawingOp() {
        if (this.drawingOpPool.isEmpty()) {
            return new DrawingOp();
        }
        List<DrawingOp> list = this.drawingOpPool;
        return list.remove(CollectionsKt.getLastIndex(list));
    }

    public static final void onUpdate$lambda$4$lambda$2(ScreenFragmentWrapper screenFragmentWrapper) {
        Screen screen;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            return;
        }
        screen.bringToFront();
    }

    public final void performDraw(DrawingOp drawingOp) {
        Canvas canvas = drawingOp.getCanvas();
        Intrinsics.checkNotNull(canvas);
        super.drawChild(canvas, drawingOp.getChild(), drawingOp.getDrawingTime());
    }

    private final void turnOffA11yUnderTransparentScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        if (this.screenWrappers.size() > 1 && screenFragmentWrapper != null && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.getScreen().isTransparent()) {
            for (ScreenFragmentWrapper screenFragmentWrapper2 : CollectionsKt.asReversed(CollectionsKt.slice((List) this.screenWrappers, RangesKt.until(0, this.screenWrappers.size() - 1)))) {
                screenFragmentWrapper2.getScreen().changeAccessibilityMode(4);
                if (Intrinsics.areEqual(screenFragmentWrapper2, screenFragmentWrapper)) {
                    break;
                }
            }
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public ScreenStackFragmentWrapper adapt(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return WhenMappings.$EnumSwitchMapping$0[screen.getStackPresentation().ordinal()] == 1 ? new ScreenStackFragment(screen) : new ScreenStackFragment(screen);
    }

    public final void dismiss(ScreenStackFragmentWrapper screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.dismissedWrappers.add(screenFragment);
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.drawingOps.size() < this.previousChildrenCount) {
            this.reverseLastTwoChildren = false;
        }
        this.previousChildrenCount = this.drawingOps.size();
        if (this.reverseLastTwoChildren && this.drawingOps.size() >= 2) {
            Collections.swap(this.drawingOps, r2.size() - 1, this.drawingOps.size() - 2);
        }
        drawAndRelease();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List<DrawingOp> list = this.drawingOps;
        DrawingOp drawingOpObtainDrawingOp = obtainDrawingOp();
        drawingOpObtainDrawingOp.setCanvas(canvas);
        drawingOpObtainDrawingOp.setChild(child);
        drawingOpObtainDrawingOp.setDrawingTime(j2);
        list.add(drawingOpObtainDrawingOp);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        if (this.removalTransitionStarted) {
            this.removalTransitionStarted = false;
            dispatchOnFinishTransitioning();
        }
    }

    public final ArrayList<ScreenStackFragmentWrapper> getFragments() {
        return this.stack;
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    public final Screen getRootScreen() {
        Object next;
        Screen screen;
        Iterator<T> it = this.screenWrappers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!CollectionsKt.contains(this.dismissedWrappers, (ScreenFragmentWrapper) next)) {
                break;
            }
        }
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screen;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public Screen getTopScreen() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper = this.topScreenWrapper;
        if (screenStackFragmentWrapper != null) {
            return screenStackFragmentWrapper.getScreen();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public boolean hasScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        return super.hasScreen(screenFragmentWrapper) && !CollectionsKt.contains(this.dismissedWrappers, screenFragmentWrapper);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    protected void notifyContainerUpdate() {
        Iterator<T> it = this.stack.iterator();
        while (it.hasNext()) {
            ((ScreenStackFragmentWrapper) it.next()).onContainerUpdate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01ac A[PHI: r2 r6
  0x01ac: PHI (r2v4 com.swmansion.rnscreens.ScreenFragmentWrapper) = 
  (r2v3 com.swmansion.rnscreens.ScreenFragmentWrapper)
  (r2v3 com.swmansion.rnscreens.ScreenFragmentWrapper)
  (r2v5 com.swmansion.rnscreens.ScreenFragmentWrapper)
 binds: [B:165:0x001e, B:167:0x002a, B:171:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r6v3 com.swmansion.rnscreens.ScreenFragmentWrapper) = 
  (r6v2 com.swmansion.rnscreens.ScreenFragmentWrapper)
  (r6v2 com.swmansion.rnscreens.ScreenFragmentWrapper)
  (r6v5 com.swmansion.rnscreens.ScreenFragmentWrapper)
 binds: [B:165:0x001e, B:167:0x002a, B:171:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0272 A[LOOP:4: B:293:0x026c->B:295:0x0272, LOOP_END] */
    @Override // com.swmansion.rnscreens.ScreenContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onUpdate() {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenStack.onUpdate():void");
    }

    public final void onViewAppearTransitionEnd() {
        if (this.removalTransitionStarted) {
            return;
        }
        dispatchOnFinishTransitioning();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeAllScreens() {
        this.dismissedWrappers.clear();
        super.removeAllScreens();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeScreenAt(int i2) {
        Set<ScreenStackFragmentWrapper> set = this.dismissedWrappers;
        TypeIntrinsics.asMutableCollection(set).remove(getScreenFragmentWrapperAt(i2));
        super.removeScreenAt(i2);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isDetachingCurrentScreen) {
            this.isDetachingCurrentScreen = false;
            this.reverseLastTwoChildren = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z2) {
        this.goingForward = z2;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.startViewTransition(view);
        this.removalTransitionStarted = true;
    }
}
