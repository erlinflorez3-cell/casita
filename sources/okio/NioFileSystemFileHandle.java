package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u0007njG0LeN.ZS8\u0015sڔ<$i+yّCU(\u000e*\tUSm˧\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M&@'Py3\u0007`<\u0011\u0016\u0005\u0002[K:\u0018vR9``\u0015e\u0005H\u001b6B.\u000b6\\\u0016YfLziR/Q\u0010\u001aF\\5w0+V=Jb6%v\u0010'qR\u007fC#5k\u00035X\fC\u0011P\n=3sm9sO\u0002iNX.\u001f[=\u00183k\u0006>\\3W\u0011\u001055gcy[>,\u0006\u0007\u0014\rj\u0011>\n5VF-Ho8\u0012A\u0004\u000bSnYHp\u0013\f\tcN\u0017S\u0003\nڂ;ӸjQiݢϳRK"}, d2 = {"\u001anZ6bu'W#_~e,j\u001d=t\u007f0\\D\b\u0017yCx\rCvz", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "@dP1J9Bb\u0019", "", "4h[26/:\\\"~\u0002", "\u001aiPCTuGW#Hxa(\u0006\u0012/l\u000eq\\D\b\u0017tJk\u0017Ev,\u000b", "uY;7T=:\u001d\"\u0003\u0005(*\u007f\u00058n\u007f/\n\na\u001b\u001eGM\u00118\u007f.5`Sc(", ">q^AX*MS\u0018\\\u0002h:|", "", ">q^AX*MS\u0018_\u0002n:\u007f", ">q^AX*MS\u0018kzZ+", "", "4h[2B-?a\u0019\u000e", "", "/qa.l", "", "/qa.l\u0016?T'~\n", "0xc266N\\(", ">q^AX*MS\u0018kzl0\u0012\t", "Ahi2", ">q^AX*MS\u0018l~s,", ">q^AX*MS\u0018p\bb;|", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z2, FileChannel fileChannel) {
        super(z2);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // okio.FileHandle
    protected synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long j2, byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(j2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i2, i3);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = this.fileChannel.read(byteBufferWrap);
            if (i5 != -1) {
                i4 += i5;
            } else if (i4 == 0) {
                return -1;
            }
        }
        return i4;
    }

    @Override // okio.FileHandle
    protected synchronized void protectedResize(long j2) {
        long size = size();
        long j3 = j2 - size;
        if (j3 > 0) {
            int i2 = (int) j3;
            protectedWrite(size, new byte[i2], 0, i2);
        } else {
            this.fileChannel.truncate(j2);
        }
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    protected synchronized void protectedWrite(long j2, byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(j2);
        this.fileChannel.write(ByteBuffer.wrap(array, i2, i3));
    }
}
