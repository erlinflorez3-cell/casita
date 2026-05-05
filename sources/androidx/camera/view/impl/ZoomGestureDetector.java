package androidx.camera.view.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: ZoomGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njO0LeN/ZS8\u0014s{:'c$\u007fLC٥\"}0\u0010WNmhvJp\u000bK\u000f\f'\u0001jBI]xc\u0014%˰`\u001bo3{nu:\f!cEI8'H}\u0013\u00012*v\u0011\u0007\u0001IL\u001a\u0014H@\u001f=b\u0013S\u0006(\u0016\u001e>N\u0004.`uSNH\u001bcƠ3#\u0011p\u000bT5\u0006H|{\u0017\rTo\u0013\u0005\t6+nG{\u0015ma\u0011/j[m\u0013ouK.\u0001'UU\u0010x(Bf\b,\u0015YRcơ~͉`\u0005YӠ\\39X{K~\u0018~¾\u0007ԫ\u0011<\f\u05faV3V9E\u001a\u0015\u0012dޚ\u0001ɤW@X\u061c/N\u000ezy6E&VĔ-ݰ\u001ffYĥ\f%\\C\u0014\u0005;(yЪzĲ_T\u0016֫e'b\u0005i1\u007fJ\u0014ʳZ̆]=uՎAn\u00108\u001c0u\n\u0006Ɉ\u001dѧ\u001b%?ك\n//z\u001aHrwMݖlĈWiZ̲\u0011.|'O*7\u001e1ըpʰoP\\А|![/l\u0007,\u000bI \u001bw\u0013Ɲ1ŎROpȉ;]k\u001e=/\u0015:\u0010n*\u000e.ޮjۋ9Qk߄2^\u0005)W<\u0011\u001b/٫Nΐ\u0010Zd̥r>V\u0002(w*N%ۿ\u001f\u0558Cq$ع|='t-H1.\u0019ˉ\tȤcZpɭOlA=\u001biR\u0005_ɝ\\ʷt{oծa.\u0003y0GaS;44qr\u0001B\u001a;\u0007-\u0004Vÿs֙KXtֵ\u000eW\u0002=$4YS5[!+O5@\u0007EEzx<ʻOɟ+z\u0005Ȫ_Gv2\u007f\b\u0019s\u0003ߏlߝST\u001fǱGj\u0001B d.\f8Â\u0007ĕgT\u0013ϵ\u000fU\u0001#q<|BSā+Ǫ)\u0001wܲMA;d?\u001dD\u0002jٯ!˸aiwЃJn\u001dH\re26:ܡ{͈U]:ծ\tUg\u0001V\"RoYܬJܖ{\bJކ\u0005\u001cAkYd\u001fhn\u0012ߵ3\u0002~\t21~{ݓ>A"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu7", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AoP;F3H^", "", ";h] c(G", ":hbAX5>`", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu #\u0010X6X~\tGZ]<iRYA\"!Z\u0017N8b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq ]!>X\u000b*;l)wK?CkA\u001a^ye9\u0019-0V\u0002.\u0011AX6d4rK#\"g\u000e-+\u001c\u0005WP.{\u0003!(|6S\n\u001dh\u000f\u001b&\u001b5QtPe\u0010Py\"K\u0005\u001a", "/mR5b9>R\u000e\t\u0005f\u0014\u0007\b/", "/mR5b9>R\u000e\t\u0005f\u001a\f\u0005<tr", "", "/mR5b9>R\u000e\t\u0005f\u001a\f\u0005<ts", "1ta?X5MA$z\u0004", "1ta?X5MA$z\u0004Q", "1ta?X5MA$z\u0004R", "3uT;g\t>T#\fzH9X\u00069v\u007f\u0016\u000b<\u000e&\u001bPqo<\u00054Ef}\u007fHm\u001f=", "", "3uT;g\u001bB[\u0019", "", "4nRBf\u001f", "4nRBf ", "5dbAh9>2\u0019\u000ez\\;\u0007\u0016", "\u001a`]1e6BRb\u0010~^>Fj/s\u000f8\t@_\u0017&Gm\u001dF\u0004z", "7mXA\\(EA$z\u0004", "7r8;C9HU&~\tl", "7r@B\\*DH#\t\u0003>5x\u00066e~", "u(I", "Adc\u001eh0<Y\u000e\t\u0005f\f\u0006\u0005,l\u007f'", "uY\u0018#", "7rBAl3Na\u000e\t\u0005f\f\u0006\u0005,l\u007f'", "Adc g@Ec's\u0005h4\\\u0012+b\u0007(z", ">qTCG0FS", ">qTC\\6Na\u0007\nvg", ">qTC\\6Na\u0007\nvg\u001f", ">qTC\\6Na\u0007\nvg ", "Bh\\27,Eb\u0015", "5dc!\\4>2\u0019\u0006\nZ", "u(9", "5dc\u0016a*KS!~\u0004m(\u0004v-a\u0007(\\<~&!T", "7m0;V/H`\u0019}oh6\u0005p9d\u007f", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "\u0011n\\=T5B]\"", "\u001dmI<b4 S'\u000e\u000bk,c\r=t\u007f1{M", "(n^:8=>\\(", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;
    private int focusX;
    private int focusY;
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    /* JADX INFO: compiled from: ZoomGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h.ӠMʴ˪nNb\rI.4\u0015ѷn0ְYw"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu #\u0010X6X~\tGZ]<iRYA\"!Z\u0017N8b", "", "=mI<b4\u001ed\u0019\b\n", "", "Hn^:8=>\\(", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[$", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface OnZoomGestureListener {
        boolean onZoomEvent(ZoomEvent zoomEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(Context context, int i2, OnZoomGestureListener listener) {
        this(context, i2, 0, listener, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(Context context, OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public ZoomGestureDetector(Context context, int i2, int i3, OnZoomGestureListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.spanSlop = i2;
        this.minSpan = i3;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                this.this$0.anchoredZoomStartX = e2.getX();
                this.this$0.anchoredZoomStartY = e2.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i2, int i3, OnZoomGestureListener onZoomGestureListener, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 + 2) - (2 | i4) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i2, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? 0 : i3, onZoomGestureListener);
    }

    /* JADX INFO: compiled from: ZoomGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r(4\u0012}\u0010l\u000fOӄtev-\u000bT5\u001bx<W*[4wI:c\u001a\u0016\"7P^mmmX\\#C=\t&~p+WY\u0011]@\u0012̓FoM8\u001e~K9xtd\u0006ڶ6(@ц\u001d\u0003 0V\u0017G\nQM$\u0012^C¤>X\u0015˟\u001d\u001c\u0018\u000eL)Q-jkf6voҺ>5+Ʌ\u0002DT1m9ƐQ\u001b"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[$", "", "3uT;g\u001bB[\u0019", "", "4nRBf\u001f", "", "4nRBf ", "uI8\u0016\u001c\u001d", "5dc\u0012i,Gb\b\u0003\u0003^", "u(9", "5dc\u0013b*Na\f", "u(8", "5dc\u0013b*Na\r", "\u0010dV6a", "\u0013mS", "\u001bne2", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        public /* synthetic */ ZoomEvent(long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, i2, i3);
        }

        private ZoomEvent(long j2, int i2, int i3) {
            this.eventTime = j2;
            this.focusX = i2;
            this.focusY = i3;
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r(4\u0012}\b|ʑi0rd\tObY0\u000ey{L$\n%\u0002IAT(\u007f:\t}QwmtIh\u000f[\u000f4\u0019ѱn,WZ\u07b5a\u0018"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[\r\t\\TvFi", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[$", "3uT;g\u001bB[\u0019", "", "4nRBf\u001f", "", "4nRBf ", "uI8\u0016\u001c\u001d", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Begin extends ZoomEvent {
            public Begin(long j2, int i2, int i3) {
                super(j2, i2, i3, null);
            }
        }

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r(4\u0012}\u0007njG5LeN0hݷZ\u000f\u001aztOk*wBIU2}P\n_Tmf|Lr\u000bq\u0012\u0016\u001c~i:Mmx\f\u0015\u001f8HnM8eok?žx6\u0013'\u00031F~\u001d\u0001H0Н\u0014|\u0003ŏc\u000e\u00188NyĖV\u0017"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[\r\u0014fcr\u0013", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[$", "3uT;g\u001bB[\u0019", "", "4nRBf\u001f", "", "4nRBf ", "7mR?X4>\\(z\u0002L*x\u0010/F{&\u000bJ\u000e", "", "uI8\u00169o/", "5dc\u0016a*KS!~\u0004m(\u0004v-a\u0007(\\<~&!T", "u(5", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }

            public Move(long j2, int i2, int i3, float f2) {
                super(j2, i2, i3, null);
                this.incrementalScaleFactor = f2;
            }
        }

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r(4\u0012}\u0007njG5LeN0hݷZ\u000f\u001aztOk*wBIU2}P\n_Tmf|Lr\u000bq\u0012\u0016\u001c~i:Mmx\f\u0015\u001f8HnM8eok?žx6\u0013'\u00031F~\u001d\u0001H0Н\u0014|\u0003ŏc\u000e\u00188NyĖV\u0017"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[\r\feQH", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu .\u0011m4.\b'P[$", "3uT;g\u001bB[\u0019", "", "4nRBf\u001f", "", "4nRBf ", "7mR?X4>\\(z\u0002L*x\u0010/F{&\u000bJ\u000e", "", "uI8\u00169o/", "5dc\u0016a*KS!~\u0004m(\u0004v-a\u0007(\\<~&!T", "u(5", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }

            public End(long j2, int i2, int i3, float f2) {
                super(j2, i2, i3, null);
                this.incrementalScaleFactor = f2;
            }
        }
    }

    public final boolean isQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final void setQuickZoomEnabled(boolean z2) {
        this.isQuickZoomEnabled = z2;
    }

    public final boolean isStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    public final void setStylusZoomEnabled(boolean z2) {
        this.isStylusZoomEnabled = z2;
    }

    public final boolean onTouchEvent(MotionEvent event) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z2 = (-1) - (((-1) - event.getButtonState()) | ((-1) - 32)) != 0;
        boolean z3 = this.anchoredZoomMode == 2 && !z2;
        boolean z4 = actionMasked == 1 || actionMasked == 3 || z3;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z4) {
            if (this.isInProgress) {
                this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else if (inAnchoredZoomMode() && z4) {
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            }
            if (z4) {
                return true;
            }
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z4 && z2) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z5 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z3;
        boolean z6 = actionMasked == 6;
        int actionIndex = z6 ? event.getActionIndex() : -1;
        int i2 = z6 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f2 = this.anchoredZoomStartX;
            f3 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f3;
        } else {
            float x2 = 0.0f;
            float y2 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x2 += event.getX(i3);
                    y2 += event.getY(i3);
                }
            }
            float f4 = i2;
            f2 = x2 / f4;
            f3 = y2 / f4;
        }
        float fAbs2 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                fAbs += Math.abs(event.getX(i4) - f2);
                fAbs2 += Math.abs(event.getY(i4) - f3);
            }
        }
        float f5 = i2;
        float f6 = fAbs / f5;
        float f7 = fAbs2 / f5;
        float f8 = 2;
        float f9 = f6 * f8;
        float f10 = f7 * f8;
        float fHypot = inAnchoredZoomMode() ? f10 : (float) Math.hypot(f9, f10);
        boolean z7 = this.isInProgress;
        this.focusX = MathKt.roundToInt(f2);
        this.focusY = MathKt.roundToInt(f3);
        if (!inAnchoredZoomMode() && this.isInProgress && (fHypot < this.minSpan || z5)) {
            this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z5) {
            this.currentSpanX = f9;
            this.previousSpanX = f9;
            this.currentSpanY = f10;
            this.previousSpanY = f10;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i5 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i5 && (z7 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f9;
            this.previousSpanX = f9;
            this.currentSpanY = f10;
            this.previousSpanY = f10;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.prevTime = this.eventTime;
            this.isInProgress = this.listener.onZoomEvent(new ZoomEvent.Begin(this.eventTime, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f9;
            this.currentSpanY = f10;
            this.currentSpan = fHypot;
            if (this.isInProgress ? this.listener.onZoomEvent(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : true) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return true;
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    private final float getIncrementalScaleFactor() {
        if (inAnchoredZoomMode()) {
            boolean z2 = this.eventBeforeOrAboveStartingGestureEvent;
            boolean z3 = (z2 && this.currentSpan < this.previousSpan) || (!z2 && this.currentSpan > this.previousSpan);
            float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
            if (this.previousSpan <= this.spanSlop) {
                return 1.0f;
            }
            return z3 ? 1.0f + fAbs : 1.0f - fAbs;
        }
        float f2 = this.previousSpan;
        if (f2 > 0.0f) {
            return this.currentSpan / f2;
        }
        return 1.0f;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    /* JADX INFO: compiled from: ZoomGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005$4\u0012\u0006\fnʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004z4܋a̓FoG\u074c\u001e{K=xtd\u0007v݈tأ}\u0005\tɝzT\u001e{\u0013Cy\u000ehؖ\u0013¤>R\u0015˟U& \fV /%3ɤ!ɇLleŽǫ'\u000b"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u001b\u001fRvW1\u0001/=;}.F}#.,CJk2-\u001fu \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u000fM2\u0015B\u0019\u001e2\u0013sdH\u0014vp\u0019D_\"Z*ps}'i|\u0018a", "", "\u000fM2\u0015B\u0019\u001e2\u0013sdH\u0014vp\u0019D_\"d*iv", "\u000fM2\u0015B\u0019\u001e2\u0013sdH\u0014vp\u0019D_\"i/t}\u00075", "\u0012D5\u000eH\u0013-M\u0001bcX\u001agd\u0018", "!B0\u00198&\u001f/vmdK", "", "1`\\2e(\u0006d\u001d~\rX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
