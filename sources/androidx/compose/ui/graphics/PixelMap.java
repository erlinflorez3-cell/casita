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
/* JADX INFO: compiled from: PixelMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00198é6B\r(4\u0012}\u0011njO0LeN1hݷZ\u000f\u001aztOk(\u007fCSUH~2\r]P\u007fg\u001dMj\u000fQ\u0013\u001e\u0016'm<Mc}u\u0012=5RsM9eok<žx6\u0013'zJF\t\u001d\u0001H:x\u0016|yQ\\$\u0012^C!@X\f[\u00172\u00124AfҼ\u001eתfޮʝGkҺ>1)\u0016wV\u001f6m0\u0015M;Gù+\u0013~ѭ6-F?C\u001eub\u0011\fj[m\u0006ӭuC\rؒ?)1S\u0002b\u0007g\u000e\u0018-+}\u0010ǁv,dӤib\u001239Z4Z^\u0014@w)~Ɂ@\n\u0016ͺ?J4:(qX\u001dAv\u000bSnSؿbH\bЭy8\u001d3\u000e>ڂ9$nQgZ!Q=߈!;\u001dũ\u0005\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n ]\u0011 >U\u00129#", "", "0tU3X9", "", "EhSA[", "", "6dX4[;", "0tU3X9(T\u001a\rzm", "Asa6W,", "uZ8\u0016<\u0010\"\u0017\n", "5dc\u000fh-?S&", "u(J\u0016", "5dc\u000fh-?S&h{_:|\u0018", "u(8", "5dc\u0015X0@V(", "5dc g9BR\u0019", "5dc$\\+MV", "5dc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "F", "G", "5dcyJ(\u001a4\tRx", "uH8u=", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PixelMap {
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i2, int i3, int i4, int i5) {
        this.buffer = iArr;
        this.width = i2;
        this.height = i3;
        this.bufferOffset = i4;
        this.stride = i5;
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getStride() {
        return this.stride;
    }

    /* JADX INFO: renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m4475getWaAFU9c(int i2, int i3) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i3 * this.stride) + i2]);
    }
}
