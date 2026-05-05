package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B$c$wDCU(\u0002*\tUNog|Pb\u000bI\u0011\fǝ\u000f̓J\\\u0006x\f\u0011G2U\u0004\u007f@]uK9xvL\u0004N3ŕ<y\u0013\u0003b0V\u0019\u000fzqUR$xF~Ej\r{\u000f`$Nd.\r6\\\u0016XfLzjR/Q\u0011\u001aF\\6w0+[=Jb7%v\u0010/[DEG-%\u0002\u0014MR,O\u0011B\nA3lw'YɞJɑ8ݼ\u0004\u0014\u001dۀ \u0019kw>\\3W7ϲ)˦ScSִ^4\u0006\u0002\u0014\rj\fdͽ)ρ2-\"Ǒۅ\u0012H"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~:\t.(q\u0016@#", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "4ob\u001ab5Bb#\fgn5\u0006\u0005,l\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~:\t.(q\u0016@\f$&Y\u001c(\u001elpC\u0014P<W\u007f#DSN\u0002", "4qP:X\n:Z {v\\2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0018x$\rM@Km\u0015+\u0011pa\u0017\u0003j3Kr%M\"", "BdgAI0>e", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "Adc\u0010h9KS\"\u000e[I\u001a", "1ta?X5M4\u0004l", "", "1ta?X5M8\u0007_eL", "2q^=c,=C|_\bZ4|\u0017", "", "Bnc._z)Z)\r[k(\u0005\t\u001dt\u00107\u000b@\u000e%", "\u0011n\\=T5B]\"", "\u0014OB\u001ab5Bb#\fgn5\u0006\u0005,l\u007f", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FpsView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    private static final int UPDATE_INTERVAL_MS = 500;
    private final FPSMonitorRunnable fpsMonitorRunnable;
    private final FpsDebugFrameCallback frameCallback;
    private final TextView textView;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~:\t.(q\u0016@\f!Es?\u001a\u001elkB\\", "", "u(E", "#O3\u000eG\f87\u0002mZK\u001dXo)Mm", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u0018\u007f\u0007ljA0ReP.XT0Ţm\u0012éT[Rp\u0004>ڈ\u001e}0\t\u0018Tum\u0007J\t\u0012\n#N\u001a\u0007rDI\u0004\u007f&\u0016\u001d;Zom:\u001e{K:xtd\u0007v݈.أ}\u0005\tɝzT\u001ey\u0013Cy\u0010hؖL¤>R\u0015˟U& \u000bV /\"3ɤZɇLleŽǫ'\r"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~:\t.(q\u0016@\f$&Y\u001c(\u001elpC\u0014P<W\u007f#DSN\u0002", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u007f\u0017(U\u007f\u0019G\u00012D#^+E^\u001a._\u0019~\\", "Ag^B_+,b#\n", "", "Bnc._z)Z)\r[k(\u0005\t\u001dt\u00107\u000b@\u000e%", "", "Bnc._\rKO!~\t=9\u0007\u0014:e~", "@t]", "", "AsP?g", "As^=", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class FPSMonitorRunnable implements Runnable {
        private boolean shouldStop;
        private int total4PlusFrameStutters;
        private int totalFramesDropped;

        public FPSMonitorRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.shouldStop) {
                return;
            }
            this.totalFramesDropped += FpsView.this.frameCallback.getExpectedNumFrames() - FpsView.this.frameCallback.getNumFrames();
            this.total4PlusFrameStutters += FpsView.this.frameCallback.get4PlusFrameStutters();
            FpsView fpsView = FpsView.this;
            fpsView.setCurrentFPS(fpsView.frameCallback.getFps(), FpsView.this.frameCallback.getJsFPS(), this.totalFramesDropped, this.total4PlusFrameStutters);
            FpsView.this.frameCallback.reset();
            FpsView.this.postDelayed(this, 500L);
        }

        public final void start() {
            this.shouldStop = false;
            FpsView.this.post(this);
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FpsView(ReactContext reactContext) {
        Intrinsics.checkNotNull(reactContext);
        ReactContext reactContext2 = reactContext;
        super(reactContext2);
        FrameLayout.inflate(reactContext2, R.layout.fps_view, this);
        View viewFindViewById = findViewById(R.id.fps_text);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.textView = (TextView) viewFindViewById;
        this.frameCallback = new FpsDebugFrameCallback(reactContext);
        this.fpsMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentFPS(double d2, double d3, int i2, int i3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d2), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d3)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.textView.setText(str);
        FLog.d(ReactConstants.TAG, str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.frameCallback.reset();
        FpsDebugFrameCallback.start$default(this.frameCallback, 0.0d, 1, null);
        this.fpsMonitorRunnable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.frameCallback.stop();
        this.fpsMonitorRunnable.stop();
    }
}
