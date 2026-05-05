package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007ljA0RlP.XS2\u000f\u0002{<$i$yّCU0}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172PuG\u074cUoS9hҚ>\u0005.7*8\u007f\t\t\u001a@H\u0018v\u0001SQÈ(ؓ^#jR;L=\u0019DFI0\u0005,\\\u007fNdIǰa:=%K6P^?_^\b}\u0011Te?\r%sN/N:M\u0015SW3\u000b`nW\u0003m\u0006m\tv<?+w\n\b:f\u0017,\u0015Yg=a\u0001?t\u0005\u007fz<19X{Q`\u00108w)\u0007;Fɂ\rͺόL035t$VA\u0003\u0010k@~\r\u000fF\u000e}y6E)F3s=)\u0005iai$\u0017E\n$%\u001eQ\f\u001f%it&`C<\u001b\f\u001a__bUH|\u0015\nA{'\tb0.44U$G{?DG)E\u0001Q#O\u00022LR\u000e\u000f\u0005\u000f~\u0004m`oX\"\u001d,}<Q\"hl|\u0005\u001a[\u0005\\::e\u001c\u0003\u001d.\f!Jtwj7k\"\u0017Uv\u0015\u0003M\f\u0015kC/;g\u001b\u0004\u000e\u0006D'YC~{\u0010\u0010]'\u0018MOz\u0005\u0007zrW\u001aqt(PJxn\u001e\u0011\u0014D|&ȇ1ŭۇ 62_'\f]V\u0011NZA+\u0014\u0010^vA\u0017Ta(Iit\u0005\u0017\u0004h^\u0007n\u0016| ؖ\t˃&/IQC\u001eve0nL~9\u0006-zVûs֙KNt\u0016\u0004]L4$#QY??#\u000f-4H\u0001[O#Ǭq˛Q\u0012/ϕM\b\u001dG\u00010}\u0007\u0019}\u0003ߏvߝST\u001fǱGl\u00011 f\u0016x\u0010UQõoӝ\u000f[Fδ\u0382\u0003^DQ>٪!M\u001dݻ\u0005#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001euB-\u0006laK\\", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0nd;W,=", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", ":`bAE0I^ ~hm(\f\t\rh{1}@o\u001b\u001fGW\u0012C})C", "", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "=m8;i(EW\u0018z\n^\u0019\u0001\u0014:l\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@db2g\u0019B^$\u0006zK<\u0006\u0012+b\u0007(", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@h_=_,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i'v!;WH;iC\u001e\u0014UeD\u0012j,$", "/cS\u001f\\7IZ\u0019", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "@`S6h:", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/k_5T", "", "/cS\u001f\\7IZ\u0019F`H,\bz@A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001f+\u0015vo\u001d\u0010r,[r%VPX5\u001b=\u007f=\" 0\u00033\u000fqe@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0011/#j", "1qT.g,+W$\n\u0002^", "2hb=b:>@\u001d\n\u0006e,", "7me._0=O(~Yk(\u000f\u0005,l\u007f", "Eg^", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "@dU?X:A2&z\rZ)\u0004\t\u001dt{7{", "@d\\<i,+W$\n\u0002^", "Adc\u001f\\7IZ\u0019i\bh7|\u0016>i\u007f6", "Adc\u001f\\7IZ\u0019i\bh7|\u0016>i\u007f6C\u000bR(e\u0014\\\\", "uI9\u0013\u001c\u001d", "Adc\u001f\\7IZ\u0019l\nZ;|", ">qT@f,=", "\u0011n\\=T5B]\"", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private Function0<Unit> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    private static final int[] RestingState = new int[0];

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public RippleHostView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    private final void createRipple(boolean z2) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z2);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Function0<Unit> function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1759addRippleKOepWvA(PressInteraction.Press press, boolean z2, long j2, int i2, long j3, float f2, Function0<Unit> function0) {
        if (this.ripple == null || !Intrinsics.areEqual(Boolean.valueOf(z2), this.bounded)) {
            createRipple(z2);
            this.bounded = Boolean.valueOf(z2);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        Intrinsics.checkNotNull(unprojectedRipple);
        this.onInvalidateRipple = function0;
        unprojectedRipple.trySetRadius(i2);
        m1760setRippleProperties07v42R4(j2, j3, f2);
        if (z2) {
            unprojectedRipple.setHotspot(Offset.m3937getXimpl(press.m865getPressPositionF1C5BW0()), Offset.m3938getYimpl(press.m865getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: setRippleProperties-07v42R4, reason: not valid java name */
    public final void m1760setRippleProperties07v42R4(long j2, long j3, float f2) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.m1771setColorDxMtmZc(j3, f2);
        Rect rect = new Rect(0, 0, MathKt.roundToInt(Size.m4006getWidthimpl(j2)), MathKt.roundToInt(Size.m4003getHeightimpl(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    private final void setRippleState(boolean z2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l2 != null ? l2.longValue() : 0L);
        if (!z2 && jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.RippleHostView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f$0);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, ResetRippleDelayDuration);
        } else {
            int[] iArr = z2 ? PressedState : RestingState;
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":%\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004|4܋\u0011̓FoG\u074c\u001e{K>xtd\u0007v݈tأ}\u0005\tɝzT\u001e|\u0013Cy\u0010hؖB¤>R\u0015˟ő\u001e\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001euB-\u0006laKEA6V\u0002#PPX52", "", "u(E", "\u001bh]6`<F@\u001d\n\u0006e,j\u0018+t\u007f\u0006~<\n\u0019\u00176s\u0016<", "", "\u001eqT@f,=A(z\n^", "", " db2g\u0019B^$\u0006z=,\u0004\u0005CD\u00105wO\u0005! ", " dbA\\5@A(z\n^", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
