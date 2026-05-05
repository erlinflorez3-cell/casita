package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjGGL͜P.`Y2\u000fq}<$i)yCAU\"}0\u0012WȞog\u0005Jb\u000bQ\u001a\u000e\u0016~m2ֳU\u000fزB\u000f`A0D9MڱA9nt~[.3:8(\u00071\u001e8K(v)G{\u0010 5XphX=Q\u0013!*\u0006l(1\"jpf6vt\u000e>=-\u001bipVWc>\be\rt\\W\u0011\u0005m6+nDe\u00193a\u001b\u0007\u0001ho\u0007M\u0001U\u0005\u00177W/W\u0005o6\u0007\u0012Z\u001as&\u001b^\u000b&\u000b\u0007\u0002d\u001a*CO\u0012O\u0001\u00126|\u0013{;O4\u0012\u0014;`.[\"\u0017\f\u001cH\rr\u0002H\u0001\u0006lX\u0018z\u0010>G)\u000eJC9In\u0002eI%f7*\u0012=\"1\u000f\u0007!\na>d#*lw\u007fA\u0002DKYf\n\bO4\t\u0378f\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0015i\u001f?IQ\u0019u<)\u0011wI\u000f", "", "u(E", "2qPDG,Qb\u0006\u000f\u0004", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "BdgA", "", "7mS2k", "", "1nd;g", "1n]AX?M7\"}zq", "1n]AX?M1#\u000f\u0004m", "F", "", "G", "7rAA_", "", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "", "AsP?g", "3mS", "1n]AX?MA(z\bm", "1n]AX?M3\"}", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class CanvasCompatM {
    public static final CanvasCompatM INSTANCE = new CanvasCompatM();

    private CanvasCompatM() {
    }

    public final void drawTextRun(Canvas canvas, char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        canvas.drawTextRun(cArr, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    public final void drawTextRun(Canvas canvas, CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        canvas.drawTextRun(charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
    }
}
