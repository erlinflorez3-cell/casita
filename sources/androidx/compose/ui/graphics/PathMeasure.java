package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: PathMeasure.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\"B\u0012\u007f\u0007llA0RnP.XT2\u000f\u0002{<$a&yCIU\"}(\nU3}˧\u001fJ\t\n\f*\u0014\u001a\u0011jZN\u0006|k\u0018'2pp\u0006W߲nމ̙_sȥ\t\"8)F\u0002M)(3`\u0010%\u0005sO\u001a\u001dH@\u001f;\u0003\u0011[\u00112\u00124?P\u0005,i\u007fNdV\u001dc@/1\u0012\u0002B|1&TEh\u001bVl';{\u0012\"9FO5C&\u001a'\u008fQ¹У\u0002>џA\u0007n853\u0012\feHp\u007fB([U\u001bq\u000b(r\u0004\u007fn<+9d{K~\u0018n\u001cK\f\u001b<\u001c\u000e4(\u001fͺ/բj\f&5ztaC҉\u0001^ې\u007f\ni6\u001dD\b61ݯ7\u0015Pi=\u001fmez̅\u00114Ɓ\u0005o"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001fm\u0012<]P;A", "", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(5", "5dc\u001db:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "2hbAT5<S", "5dc\u001db:Bb\u001d\t\u0004&;\ru\u001fv\u0005\u0014", "uE\u0018\u0017", "5dc X.FS\"\u000e", "", "AsP?g\u000bBa(z\u0004\\,", "As^=70Lb\u0015\bx^", "2dbA\\5:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g\u001eBb\u001cf\u0005o,k\u0013", "5dc!T5@S\"\u000e", "5dc!T5@S\"\u000eBm<ix@jk", "Adc\u001dT;A", "", ">`c5", "4na0X\nE]'~y", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PathMeasure {
    float getLength();

    /* JADX INFO: renamed from: getPosition-tuRUvjQ */
    long mo4076getPositiontuRUvjQ(float f2);

    boolean getSegment(float f2, float f3, Path path, boolean z2);

    /* JADX INFO: renamed from: getTangent-tuRUvjQ */
    long mo4077getTangenttuRUvjQ(float f2);

    void setPath(Path path, boolean z2);

    /* JADX INFO: compiled from: PathMeasure.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f2, float f3, Path path, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return pathMeasure.getSegment(f2, f3, path, z2);
    }
}
