package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: OwnedLayer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeN/ZS@\u000fs{:%c$\u007fLC٥\"}8\tWNmivJp\u000bK\u000f\f\u001a\u0001jBI]xc\u0014\u00172XoG3SpE9vt>\u000562*8\u007f\u0005\t\u001a@H\u0018v\u0001FS\f(0H\u0081@1#˟5\u001a@\u0005\u0007&\u000f\u001etg|7\u000f\u0011&R=%\u001bipOWc>\u007fe\rtXW\u0013\u0005f6-V6c\u001bkwK\r`bW\u0003mr\u0004)1?53as\u00067\t\u0004\"\u001eCO;g9Jڑ\u0004ĩԃ\u0010)1ZqW\u0019&6\u0005\u0013{;J4\u0012\u00146`.[*-,ս2οɤWBV\u0013lTH\u0011oI/%.4[=)ziai.~;\n\u001b%\u001eQ\u000f5E$t\u001cw-\u001b\u0003\b\u00025_XUH|\u001a\nA{\u001a\tb08JTѓ~\u07fcɨ\u00150\u001d>Eu\u0002;/\u0007\u001aHrh'\tnwki\u0001d\u0007FĻ\u0015ճҊ\r\u000e`ar#4hbwD\u0011{\u001d\u0005\u000b\f(+ \u000b\u0019\u0003Eڰ\u000fʚћlkpok(m}tZqn\u001a\u000f\bolWM\u0004s!qa%\u0018͖@l\u000b~vHY3j^.(XKz#\b\rZM:\u0019\u0558C{\"Z<7\u001f\u0004%J\t$hF\r\u000boZ\u0017\u0011-yc.\u0011\u0012<z\u0019\u0003`\\\u001fp\u0016\"\u0010PEx0WYQc\u001aVY0qL|Q\u0011E\u0018ŋFх֙KNrA\u0004aD&$FQQ]>Y3G7@/EEzs\u0016U[@?z+)U_ŕ-fŐj{4cpߜk\u0003\u0016*xd\u0012Q\u0007ܖ\u0004*ԔJy"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "", "2dbAe6R", "", "2qPD?(RS&", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", ">`a2a;%O-~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "7me._0=O(~", "7me2e:>B&z\u0004l-\u0007\u00167", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "7me2e:>B&z\u0004l-\u0007\u00167-Ozx&}\t\u0015", "uZ5uI", "7r8;?(RS&", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7r8;?(RS&F\u0001&z\u0004tyM", "uI\u0018'", ";`_\u000fb<GR'", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "7me2e:>", ";`_\u001cY-LS(", ">nX;g", ";`_\u001cY-LS(FML\u007fml>k", "uIIu=", ";ne2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";ne2 s@g-rWl", "uI\u0018#", "@db6m,", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "@db6m,\u0006].\u0007\u0010S\u0017`", "@dd@X\u0013:g\u0019\f", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "BqP;f-H`!", "BqP;f-H`!FJ1)b\u0006!c", "CoS.g,\u001dW'\n\u0002Z@c\r=t", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo5796inverseTransform58bKbWc(float[] fArr);

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo5797isInLayerk4lQ0M(long j2);

    void mapBounds(MutableRect mutableRect, boolean z2);

    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo5798mapOffset8S9VItk(long j2, boolean z2);

    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    void mo5799movegyyYBs(long j2);

    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo5800resizeozmzZPI(long j2);

    void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0);

    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    void mo5801transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
