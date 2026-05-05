package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.react.ExtensionsKt;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005$4\u0012\u000e\u0007nj?0LeV.ZS0\u000fs{J$c$wRQ٥8\u0015R\u000f_Pwg\u001dϺ\t\n{\u0014\u001d.\u0012\u0005Ger9`ܫ\u00132Po\b9[xU9\u000f~|\u0017hH0C\u0012\u0005/$ZL\u001e\u0003\u0013Cy\u0019B4N~RR;ZK,Z\fL/\u0019\u001e\u000bq\u0015H\u0011rkJG#1s\t`oe>\u000ee\rt^m!?m,=X7cՖUW\u0011\nj[m\u0005\b}K\u0018\u0001'UǢywe>p\u007fB\u0017sa\u001bq\u000b&\u000b\u0007\u0002h\u001a<CSsKV\u000fVvA\u0010UN\u0012$\u001e'v0]\"t\u001d&7\u0005rYA~\u0001%VP\u0017o9/%.5[=)giai\u001b\rwRˣ\u0019̷'\u0007vďsV\u0014d# %\u0004_7i@kO%˦eǀq\u0004xçR6\u00128_\u007f]}gч#É;[A\u05faݒo "}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i(", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "\nrTA \u0006\u0017", "", "2hb._3He|\b\n^9\n\u0019:t\u00042\u0005", "5dc\u0011\\::Z \t\rB5\f\t<r\u00103\u000bD\u000b ", "u(I", "6n^8", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "Ag^B_+\u001aQ(\u0003\fZ;|r8S\u000f$\tO", "=m2.a*>Z", "", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=m??X7:`\u0019", "=mA2f,M", "@db2g\nH\\\u001a\u0003|", "Adc\u0011\\::Z \t\rB5\f\t<r\u00103\u000bD\u000b ", "Adc [6NZ\u0018Zxm0\u000e\u0005>ei1iO|$&", "Ag^B_+\u001bSvz\u0004\\,\u0004\u0010/d\\<", "6`]1_,K", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "\u0011n\\=T5B]\"", "\u0013cXAG,Qb{\t\u0005d", "\u001c`c6i,/W\u0019\u0011\\^:\f\u0019<eb$\u0005?\b\u0017$*y\u0018B", " dP0g\u001dBS+`\bh<\bk9o\u0006", "!ba<_3/W\u0019\u0011]h6\u0003", "!vX=X\u0019>T&~\ta\u0013x\u001d9u\u000f\u000b\u0006J\u0007", "\"dgAI0>e{\t\u0005d", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class NativeViewGestureHandler extends GestureHandler<NativeViewGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final NativeViewGestureHandler$Companion$defaultHook$1 defaultHook = new NativeViewGestureHandlerHook() { // from class: com.swmansion.gesturehandler.core.NativeViewGestureHandler$Companion$defaultHook$1
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent motionEvent) {
            NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.afterGestureEnd(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent motionEvent) {
            NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.handleEventBeforeActivation(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.shouldCancelRootViewGestureHandlerIfNecessary(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.shouldRecognizeSimultaneously(this, gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.wantsToHandleEventBeforeActivation(this);
        }
    };
    private boolean disallowInterruption;
    private NativeViewGestureHandlerHook hook = defaultHook;
    private boolean shouldActivateOnStart;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я'\u001d<K!&i\u000eӵLcz\u0004I\u00066\f6B\r+4ߚ\u007f\u0007|jAӄLe^.ZݷR\u000em\u0002ð%qҕ\"CiTZ\u0003(\tҊRgun\u0013p\u0019G'\u0006D}\u001b0W[\u0011]@\u0016bF}GKM\u001eF\u007f`ED\u0013!J\"f{[В\u001cݵL\u0012~zQNñ\u0016:"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "2dU.h3M6#\t\u0001", "1n\\{f>FO\"\r~h5F\u000b/s\u000f8\t@\u0004\u0013 Fv\u000eI@#?f}i i%2^C,o40vhoH\u0017p,1r0FSN9\u001b0|E\u001f\u000ec\u0012X4K\u0004YB ~KF\u0002\u00126O@\u0007", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011PG\u001c\u001dV\u0017R5\u0016CXA%jT>.j6S\by4V", "Bqh\u0016a;>`\u0017~\u0006m", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tryIntercept(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG5LeN.ZS8\u0015sڔ<$i$yّCU0}*\tUNog|SbŏK\u000f\u001c\u0016\u0001j2J[xs܈?2pn\u007fF]sK9xtd\u0006060:\u0012\u0005/\u001dݵL\u0010\u0005~\fY\u001a\u001cH@\u001fE\u0003\u0011[\u00112\u00124Kf\u0015fju\\NH\u001bhj31\u000f\u0002B|4&DES\u001bUl';\u0007(2sWEF-%\u0002\u00137Zi?\u001bC\u0002=\u000biU9q]ָ[6f\u0013\\\u001b9c%]!6#\u0019\"l\u001a)CO\u0012N'ʮ*Þ~{\u0015ɝT\u001a\u0014'`.[\u001b=ڟ\u0010\u07baxr[ó!\u000elG\u0018z\u0010<mӞ\fĴ/9#Ƙ\"mI f7*\u000bc̗/ъr!c٪^l##lw\u007f:(̸I˓R\naƝѐ\b\u0006"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011R<\u0018!I\u000ea:o\u000fcGy", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i(", "3cXAG,Qb", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n49b\t0F7\u0003.IAJK3\"$WaL\u00169", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77~*\\GLk%\"\u0015zC9\u0015r<[v\nCUM3\\_H$\u0012\u001cbWO'\u000b\u0005VK.t\u000eD\u001f\u0004*XKLl\u0001\u001e$WDj\u0004QZ\u0019R\n$?.)dDh?xKP4b=sa#\u000e", "AsP?g\u001f", "", "AsP?g ", "Bnd0[\u001aE]$l\u0007n(\n\t.", "", "/ec2e\u000e>a(\u000f\b^\f\u0006\b", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "6`]1_,\u001ed\u0019\b\n;,}\u0013<e[&\u000bD\u0012\u0013&Ky\u0017", "Ag^B_+\u001cO\"|ze\u0019\u0007\u0013>V\u0004(\u000e\"\u0001%&W|\u000e\u001fr.4`}-\u001bn~.KCIy0+)", "", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012],C]JucN{?]nd\u0018U+\t\u000e/", "E`]Af\u001bH6\u0015\bye,\\\u001a/n\u000f\u0005{A\u000b$\u0017#m\u001d@\b!D]\b)", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class EditTextHook implements NativeViewGestureHandlerHook {
        private final ReactEditText editText;
        private final NativeViewGestureHandler handler;
        private float startX;
        private float startY;
        private int touchSlopSquared;

        public EditTextHook(NativeViewGestureHandler handler, ReactEditText editText) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(editText, "editText");
            this.handler = handler;
            this.editText = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.touchSlopSquared = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (((event.getX() - this.startX) * (event.getX() - this.startX)) + ((event.getY() - this.startY) * (event.getY() - this.startY)) < this.touchSlopSquared) {
                this.editText.requestFocusFromJS();
            }
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.handler.activate();
            this.editText.onTouchEvent(event);
            this.startX = event.getX();
            this.startY = event.getY();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.getTag() > 0 && !(handler instanceof NativeViewGestureHandler));
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return true;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u0014s{J$c$wDA:0ԂR\t}M0u|Jr\u000bq\u00106\u001a\u0007lDI\u0004{$&W@PsW3{tm=nzN\u0005N9hLB\u0013\u000f\"BH>{+GY\u000e*0ns\u0001fU[\u0013#*\u0006l!1\"jif6vo$NwB\u0011sZP=^^\u0002}\u0013TZ?\u000f\r`L2p;C\u0017=S1\n\u0019oύ\u0007?\u007fHMn53CI\"\\|lH-#8g\u000fsqTa5Yn\u001a?/_cQQ<7>\u000fԫ\u0011<\u0012\u001eN-V?E\u001a\u0015\rTGϨve"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "", "/ec2e\u000e>a(\u000f\b^\f\u0006\b", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "1`]\u000eV;Bd\u0015\u000ez", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1`]\u000fX.B\\", "6`]1_,\u001ed\u0019\b\n;,}\u0013<e[&\u000bD\u0012\u0013&Ky\u0017", "Ad]1G6NQ\u001c^\f^5\f", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;@69Y\u0010i\u001fw%2WL\u001b|4'$>% \f_=J@.CUPu9\\|D\u0014\u000ecc", "Ag^B_+\u001cO\"|ze\u0019\u0007\u0013>V\u0004(\u000e\"\u0001%&W|\u000e\u001fr.4`}-\u001bn~.KCIy0+)", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012],C]JucN{?]nd\u0018U+\t\u000e/", "E`]Af\u001bH6\u0015\bye,\\\u001a/n\u000f\u0005{A\u000b$\u0017#m\u001d@\b!D]\b)", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface NativeViewGestureHandlerHook {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            public static void afterGestureEnd(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static boolean canActivate(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return view.isPressed();
            }

            public static boolean canBegin(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            }

            public static void handleEventBeforeActivation(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static Boolean sendTouchEvent(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, View view, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            public static boolean shouldCancelRootViewGestureHandlerIfNecessary(NativeViewGestureHandlerHook nativeViewGestureHandlerHook) {
                return false;
            }

            public static Boolean shouldRecognizeSimultaneously(NativeViewGestureHandlerHook nativeViewGestureHandlerHook, GestureHandler<?> handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            }

            public static boolean wantsToHandleEventBeforeActivation(NativeViewGestureHandlerHook nativeViewGestureHandlerHook) {
                return false;
            }
        }

        void afterGestureEnd(MotionEvent motionEvent);

        boolean canActivate(View view);

        boolean canBegin(MotionEvent motionEvent);

        void handleEventBeforeActivation(MotionEvent motionEvent);

        Boolean sendTouchEvent(View view, MotionEvent motionEvent);

        boolean shouldCancelRootViewGestureHandlerIfNecessary();

        Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler);

        boolean wantsToHandleEventBeforeActivation();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0LeN.XS@ş\u001c{b#\u001c'ڱG;c\u001aFA\u0017Pfi}mx\\;I\u001d\t.z\u0001+wY)a \u0014JB\u001eEyaڱA9n{ȫ\t("}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011_=\u0010\u0010i~R+\u001fffK4y'A)\u000e\u0002", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "u(E", "Ad]1G6NQ\u001c^\f^5\f", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;@69Y\u0010i\u001fw%2WL\u001b|4'$>% \f_=J@.CUPu9\\|D\u0014\u000ecc", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ReactViewGroupHook implements NativeViewGestureHandlerHook {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.afterGestureEnd(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.handleEventBeforeActivation(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldCancelRootViewGestureHandlerIfNecessary(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldRecognizeSimultaneously(this, gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return NativeViewGestureHandlerHook.DefaultImpls.wantsToHandleEventBeforeActivation(this);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0005\"Bߚ(\u0007\u0015iy3ǲiH<R\u001c0\u001dl\u00144R]j\u0006ٺ?X"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011`;!\u001ca\u0015?/\r\u0017<K.t\u001a", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "u(E", "Ag^B_+\u001cO\"|ze\u0019\u0007\u0013>V\u0004(\u000e\"\u0001%&W|\u000e\u001fr.4`}-\u001bn~.KCIy0+)", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ScrollViewHook implements NativeViewGestureHandlerHook {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.afterGestureEnd(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.handleEventBeforeActivation(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldRecognizeSimultaneously(this, gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return NativeViewGestureHandlerHook.DefaultImpls.wantsToHandleEventBeforeActivation(this);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.hS2şs{B-cҕwCQ٥J}P\b\u0010awk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004{ٕ\u0016\u000f@F8MAR\b=gf%:\u0013'J\"f\u0002K\u0015b0V\u0019\u000fzqUR&\u0001L~:j\r{\u0006pŊ\b̧$\u0001&ձ8ZDJ\u0005]h2yɈkŌR'gܞƐQ\u0018"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011`O\u0018\u001dZzN,\u001a\u0005gD\u000bjXA/\u0017\u000fS\fA>", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i(", "AvX=X\u0019>T&~\ta\u0013x\u001d9u\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001cNz05f}!Dm$1\u00170;g2-\u0003zeD\u0007P,O\u0004'UO5(p\\\u0003Li", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77~*\\GLk%\"\u0015zC9\u0015r<[v\nCUM3\\_H$\u0012\u001cbWO'\u000b\u0005VK.t\u000eD\u001f\u0004*XKLl\u0001\u001e$WC|tMV\u001dGz\"uO,23Y[wV/Wf5dx_\u001ei:H'zm-%x_\u0004Ml", "6`]1_,\u001ed\u0019\b\n;,}\u0013<e[&\u000bD\u0012\u0013&Ky\u0017", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "E`]Af\u001bH6\u0015\bye,\\\u001a/n\u000f\u0005{A\u000b$\u0017#m\u001d@\b!D]\b)", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class SwipeRefreshLayoutHook implements NativeViewGestureHandlerHook {
        private final NativeViewGestureHandler handler;
        private final ReactSwipeRefreshLayout swipeRefreshLayout;

        public SwipeRefreshLayoutHook(NativeViewGestureHandler handler, ReactSwipeRefreshLayout swipeRefreshLayout) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
            this.handler = handler;
            this.swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.afterGestureEnd(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent event) {
            ArrayList<GestureHandler<?>> handlersForView;
            Intrinsics.checkNotNullParameter(event, "event");
            View childAt = this.swipeRefreshLayout.getChildAt(0);
            GestureHandler gestureHandler = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            GestureHandlerOrchestrator orchestrator = this.handler.getOrchestrator();
            if (orchestrator != null && (handlersForView = orchestrator.getHandlersForView(scrollView)) != null) {
                Iterator<T> it = handlersForView.iterator();
                while (it.hasNext()) {
                    gestureHandler = (GestureHandler) it.next();
                    if (gestureHandler instanceof NativeViewGestureHandler) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (gestureHandler == null || gestureHandler.getState() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.handler.fail();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldCancelRootViewGestureHandlerIfNecessary(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldRecognizeSimultaneously(this, gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return true;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS0\u000f\u0002ڔd$\n#2FтY\u001a\f\"Q]\\h\u007fnx\\;G\u001d\t.x\u00190\u0010iAt \u0014JB\u001eAcU}CQd\u00056\u000b!`)~\u000eڱ\u0005\u001a8PǞz\u0004"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011a='!K\u0012N=o\u000fcGy", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "u(E", "1`]\u000eV;Bd\u0015\u000ez", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012],C]JucN{?]nd\u0018U+\t\u000e/", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class TextViewHook implements NativeViewGestureHandlerHook {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.afterGestureEnd(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view instanceof ReactTextView;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.canBegin(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent motionEvent) {
            NativeViewGestureHandlerHook.DefaultImpls.handleEventBeforeActivation(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return NativeViewGestureHandlerHook.DefaultImpls.shouldCancelRootViewGestureHandlerIfNecessary(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return NativeViewGestureHandlerHook.DefaultImpls.wantsToHandleEventBeforeActivation(this);
        }
    }

    public NativeViewGestureHandler() {
        setShouldCancelWhenOutside(true);
    }

    public final boolean getDisallowInterruption() {
        return this.disallowInterruption;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onCancel() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        NativeViewGestureHandlerHook nativeViewGestureHandlerHook = this.hook;
        View view = getView();
        Intrinsics.checkNotNull(motionEventObtain);
        nativeViewGestureHandlerHook.sendTouchEvent(view, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        View view = getView();
        Intrinsics.checkNotNull(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zIsScreenReaderOn = ExtensionsKt.isScreenReaderOn(context);
        if ((view instanceof RNGestureHandlerButtonViewManager.ButtonViewGroup) && zIsScreenReaderOn) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (getState() != 0 || this.hook.canBegin(event)) {
                this.hook.sendTouchEvent(view, event);
                if ((getState() == 0 || getState() == 2) && this.hook.canActivate(view)) {
                    activate();
                }
                if (getState() == 0) {
                    cancel();
                } else {
                    end();
                }
            } else {
                cancel();
            }
            this.hook.afterGestureEnd(event);
            return;
        }
        if (getState() != 0 && getState() != 2) {
            if (getState() == 4) {
                this.hook.sendTouchEvent(view, event);
                return;
            }
            return;
        }
        if (this.shouldActivateOnStart) {
            Companion.tryIntercept(view, event);
            this.hook.sendTouchEvent(view, event);
            activate();
        } else if (Companion.tryIntercept(view, event)) {
            this.hook.sendTouchEvent(view, event);
            activate();
        } else if (this.hook.wantsToHandleEventBeforeActivation()) {
            this.hook.handleEventBeforeActivation(event);
        } else {
            if (getState() == 2 || !this.hook.canBegin(event)) {
                return;
            }
            begin();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onPrepare() {
        KeyEvent.Callback view = getView();
        if (view instanceof NativeViewGestureHandlerHook) {
            this.hook = (NativeViewGestureHandlerHook) view;
            return;
        }
        if (view instanceof ReactEditText) {
            this.hook = new EditTextHook(this, (ReactEditText) view);
            return;
        }
        if (view instanceof ReactSwipeRefreshLayout) {
            this.hook = new SwipeRefreshLayoutHook(this, (ReactSwipeRefreshLayout) view);
            return;
        }
        if (view instanceof ReactScrollView) {
            this.hook = new ScrollViewHook();
            return;
        }
        if (view instanceof ReactHorizontalScrollView) {
            this.hook = new ScrollViewHook();
        } else if (view instanceof ReactTextView) {
            this.hook = new TextViewHook();
        } else if (view instanceof ReactViewGroup) {
            this.hook = new ReactViewGroupHook();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        this.hook = defaultHook;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetConfig() {
        super.resetConfig();
        this.shouldActivateOnStart = false;
        this.disallowInterruption = false;
    }

    public final NativeViewGestureHandler setDisallowInterruption(boolean z2) {
        this.disallowInterruption = z2;
        return this;
    }

    public final NativeViewGestureHandler setShouldActivateOnStart(boolean z2) {
        this.shouldActivateOnStart = z2;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean shouldBeCancelledBy(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return !this.disallowInterruption;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean shouldRecognizeSimultaneously(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Boolean boolShouldRecognizeSimultaneously = this.hook.shouldRecognizeSimultaneously(handler);
        if (boolShouldRecognizeSimultaneously != null) {
            return boolShouldRecognizeSimultaneously.booleanValue();
        }
        if (super.shouldRecognizeSimultaneously(handler)) {
            return true;
        }
        if ((handler instanceof NativeViewGestureHandler) && handler.getState() == 4 && ((NativeViewGestureHandler) handler).disallowInterruption) {
            return false;
        }
        boolean z2 = this.disallowInterruption;
        return !(getState() == 4 && handler.getState() == 4 && !z2) && getState() == 4 && !z2 && (!this.hook.shouldCancelRootViewGestureHandlerIfNecessary() || handler.getTag() > 0);
    }
}
