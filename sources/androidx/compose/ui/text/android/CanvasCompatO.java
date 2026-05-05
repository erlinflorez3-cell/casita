package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{J$cҕyCIZ\"}(\nWNumvϺ`ƓC%إFx\u0019+\nZ~]ܫ\u00132Po\bI[pU9\u000fvf\t.5:8(\t1\u001e8M(v)I\u0012\u0011ZFNwRR;O5\u001e \tV /\"\rk\\>`l\fCu(K\u007fPU?_^~}\u0011TW?\r%eN/N?M\u0015S]I\f\u001b\nM\nWqk\u0007\u0019+5.as\u0006:\t\u0004\" CO;i#*j\u0012i`:3[SqYh\u000eV\u0004+\u007f\u001bK\u001c\u000e43\u000f3uHt\u000f&3#t\u0004D^\u0005vB.~\u0012:%0\u00183YIKj_nS\u0019|G,\t\u001b,;\u0001\u001d1\fX\u001co-\u001b\u0003\b\u00186ҮDN"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0015i\u001f?IQ\u0019u<)\u0011wK\u000f", "", "u(E", "1kX=B<M>\u0015\u000e}", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1kX=B<M@\u0019|\n", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class CanvasCompatO {
    public static final CanvasCompatO INSTANCE = new CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean clipOutRect(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public final boolean clipOutRect(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean clipOutRect(Canvas canvas, float f2, float f3, float f4, float f5) {
        return canvas.clipOutRect(f2, f3, f4, f5);
    }

    public final boolean clipOutRect(Canvas canvas, int i2, int i3, int i4, int i5) {
        return canvas.clipOutRect(i2, i3, i4, i5);
    }

    public final boolean clipOutPath(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }
}
