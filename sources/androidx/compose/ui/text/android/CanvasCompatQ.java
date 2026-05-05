package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: TextAndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RkP\u008cZS@\u000fs{B+c$wCCU0}*ޛWNulvJ`\u000eK\u000f\u001c\u0016\u0001̓4Ic\u000be\u0012\u00153JoU3UoC9htL\u0005(2(=\u0002\u0005\u000f#2H\u0016v\u0001ƓK\"۵`@\u001f9\u0013\u0012S\u0005ܨ\u0016\u0006L I,jhf6vn\u000e>=&\u001bipRmdx\u001b[\u0012^TU\u000f'e,.X7c\u0019UW\u0011\rj[m\nouK\r\u0001'U4\u0010x Lf\u0005,\u0015YQ=a\u0001)t\u0005\u007fd<+9U{K~\u0018n|C\u001a\u001bA\u001c\u000e4)x2;\u001d~\b<7%vaFh\u0002\rL0~o>/%.<q>c-_lS\u0019|9,\t\u001b!;\u0001\u001d%\fX\u001cl-\u001b\u0003\u0005\u00025_NUH|\u0019\nA{\u0014\tb0944U\u0011G{?;G)EmQ#Oz2LRz\u000f\u0005\u000fw\u0004m`\\X\"\u001d+}/QBhO|\u0005\u001aR\u0005\\:\u0014e\u001c\u0003\u000b.\f!,twj.U\u0014\\e\u0001i\u0019d\u000e\u000e3@~7\b{\u001c\u0012eQv3ch\u0014\u0014of\u000f\u0014mQ)\n!|Pl$Z\u000b*R6Vm(w*H~\u0010!LWqJOr6a3#d\u001b\u001epC-\rm]\u0001\u0010-Xc(\u0011\u0007<t7\u001f\u0001`~\u000f\u007fxw3-d0MYQc VY0\nL|Q\u000e/w\u000ei\u007fLuS\u001d\u001a\u0004x\u0014 D)iU=a+\u000f-8b\u0006;jdr\u0014w}\u00165\u000f\u0015y=P/30\u0016x\u0018D`\u0019L\u007fX%%\u000f^!'Niѩ}\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0015i\u001f?IQ\u0019u<)\u0011wM\u000f", "", "u(E", "2hb.U3>H", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPD66E]&", "1n[<e", "", ";nS2", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u0003@\n\u0016~Qn\u000e\u0012", "", "2qPD76NP ~gh<\u0006\b\u001ce}7", "=tc2e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "=tc2e\u0019Q", "", "=tc2e\u0019R", "7m]2e", "7m]2e\u0019Q", "7m]2e\u0019R", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "=tc2e\u0019:R\u001d\u0003", "", "7m]2e\u0019:R\u001d\u0003", "2qPDE,GR\u0019\fch+|", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$0y\r<L", "2qPDG,Qb\u0006\u000f\u0004", "BdgA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI7{S\u0010`~Gk\u001cL\u0004%4H}3FC", "AsP?g", "3mS", "1n]AX?MA(z\bm", "1n]AX?M3\"}", "F", "G", "7rAA_", "", "3mP/_,3", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class CanvasCompatQ {
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void enableZ(Canvas canvas) {
        canvas.enableZ();
    }

    public final void disableZ(Canvas canvas) {
        canvas.disableZ();
    }

    public final void drawColor(Canvas canvas, long j2) {
        canvas.drawColor(j2);
    }

    public final void drawColor(Canvas canvas, int i2, BlendMode blendMode) {
        canvas.drawColor(i2, blendMode);
    }

    public final void drawColor(Canvas canvas, long j2, BlendMode blendMode) {
        canvas.drawColor(j2, blendMode);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f2, f3, rectF2, f4, f5, paint);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void drawTextRun(Canvas canvas, MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        canvas.drawTextRun(measuredText, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    public final void drawRenderNode(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }
}
