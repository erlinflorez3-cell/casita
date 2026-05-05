package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.`_2\u000fq{<$i*yّCU0}*\tUPog|Qb\u000bI\u0011\u001cǝ\u0017\u0001\\I\u0004w\u0016\u0011%rO\u007fCAM\b=gaҽ:\u0007&40;B\u0011\u000f\u001eBH>{+GY\u0012*0nw\u0003^\u001bU\u001d\u001a@\u000bn$\u000f$tg|?\u0011\u0001kDG#1nrR5jH|{\u0019vX5\u001a\u000faL9\tJC$=S1\f\u0003_M\tWqk\u0011/ѧݳ/Iyg~d\u000e%-+}\u0012\u000ev4b\u001dQ\u000f\u0018o7]ucP<-(~\n\u0013T\u0004<\u0019oT<A2f6\u0013cx\u0001YXP0j\u000b\f\tvN\u0017S\u0005c/G!~Q\u0010NiZE{\u001d\rL$W͜#ƟX\u000ehٽúX\u000f"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "\nh]6g\u0005", "uK^8\\6\b0)\u007f{^9|\b\u001di\t.Q\u0004q", "EqXAX\tRb\u0019\r", "", "D`[BX", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "EqXAX\u001aM`\u001d\b|", "", "EqXAX\u001b:U", "4hT9W\u0015N[\u0016~\b", "", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "EqXAX\u001aBU\"~yO(\n\r8tMt", "EqXAX\u001aBU\"~yO(\n\r8tMt:R\u0005$\u0017A|\u001eE\u0006)=Y", "EqXAX\u001d:`\u001d\b\n,x", "EqXAX\u001d:`\u001d\b\n/z", "", "EqXAX\rBf\u0019}H+", "EqXAX\rBf\u0019}K-", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProtoWriter {
    public static final Companion Companion = new Companion(null);
    private final BufferedSink sink;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?8LeV5ZS0\u0018qڛ5:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#&Q\u0011\u001e\u0016'm\\Mc|u\u0012=5rsM8eok?'Қȥ\t 8)\u0001\r\u0013\t2*v\u0013'~QT$\u0012^C7íň\u0011M\u000b$Z\u0019L+\u0019\u001e\u000bj~:Vxu:]&I݃ŌR'e=E`\u001bTl';y\u0012\"9LO5C(\u001aΈ\u07baV[E\u0012\b\u0005K\u0015\u0001'U.yweBp\u007fB&q˽ոar,nMdn\u001f?+}f{T\u001c<\u0010z*\u0010\u0003ǉ؝\n'NCu-t\u001e&3#u\u0004D^\u0016vB.}(اа)\u007f9B\u0002.tiy;G_g\u007f\u0013!6#/\u007fgżڍ\u0012`\u001b4\u001d\u000b_Ki@kY~\u000egQ\u0006\u0004\u001fsHÏ˙4G\u0006Jɮ\u0015J"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2s7\b(Bi\u001f2WL\u0011", "", "\nh]6g\u0005", "u(E", ";`Z2G(@", "", "4hT9W\u0015N[\u0016~\b", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", ";`Z2G(@\u0012+\u0003\b^&\n\u00198t\u00040{", "B`V \\A>", "B`V", "B`V \\A>\u0012+\u0003\b^&\n\u00198t\u00040{", "7mc\u007f%\u001aBh\u0019", "D`[BX", "7mc\u007f%\u001aBh\u0019=\rb9|\u0003<u\t7\u007fH\u0001", "D`a6a;\f \u0007\u0003\u0010^", "D`a6a;\f \u0007\u0003\u0010^j\u000f\r<ey5\fI\u0010\u001b\u001fG", "D`a6a;\u000f\"\u0007\u0003\u0010^", "", "D`a6a;\u000f\"\u0007\u0003\u0010^j\u000f\r<ey5\fI\u0010\u001b\u001fG", "3mR<W,3W\u001bsv`yI", "<", "3mR<W,3W\u001bsv`yIGAi\r(uM\u0011 &Kw\u000e", "2dR<W,3W\u001bsv`yI", "2dR<W,3W\u001bsv`yIGAi\r(uM\u0011 &Kw\u000e", "3mR<W,3W\u001bsv`|K", "3mR<W,3W\u001bsv`|KGAi\r(uM\u0011 &Kw\u000e", "2dR<W,3W\u001bsv`|K", "2dR<W,3W\u001bsv`|KGAi\r(uM\u0011 &Kw\u000e", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int decodeZigZag32$wire_runtime(int i2) {
            return (-(i2 & 1)) ^ (i2 >>> 1);
        }

        public final long decodeZigZag64$wire_runtime(long j2) {
            return (-(j2 & 1)) ^ (j2 >>> 1);
        }

        public final int encodeZigZag32$wire_runtime(int i2) {
            return (i2 >> 31) ^ (i2 << 1);
        }

        public final long encodeZigZag64$wire_runtime(long j2) {
            return (j2 >> 63) ^ (j2 << 1);
        }

        public final int int32Size$wire_runtime(int i2) {
            if (i2 >= 0) {
                return varint32Size$wire_runtime(i2);
            }
            return 10;
        }

        public final int makeTag$wire_runtime(int i2, FieldEncoding fieldEncoding) {
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            return (i2 << 3) | fieldEncoding.getValue$wire_runtime();
        }

        public final int tagSize$wire_runtime(int i2) {
            return varint32Size$wire_runtime(makeTag$wire_runtime(i2, FieldEncoding.VARINT));
        }

        public final int varint32Size$wire_runtime(int i2) {
            if ((-1) - (((-1) - i2) | ((-1) - (-128))) == 0) {
                return 1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - (-16384))) == 0) {
                return 2;
            }
            if (((-2097152) + i2) - ((-2097152) | i2) == 0) {
                return 3;
            }
            return (i2 & (-268435456)) == 0 ? 4 : 5;
        }

        public final int varint64Size$wire_runtime(long j2) {
            if (((-128) + j2) - ((-128) | j2) == 0) {
                return 1;
            }
            if ((-1) - (((-1) - (-16384)) | ((-1) - j2)) == 0) {
                return 2;
            }
            if (((-2097152) + j2) - ((-2097152) | j2) == 0) {
                return 3;
            }
            if (((-268435456) & j2) == 0) {
                return 4;
            }
            if (((-34359738368L) + j2) - ((-34359738368L) | j2) == 0) {
                return 5;
            }
            if (((-4398046511104L) & j2) == 0) {
                return 6;
            }
            if (((-562949953421312L) & j2) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & j2) == 0) {
                return 8;
            }
            return (-1) - (((-1) - j2) | ((-1) - Long.MIN_VALUE)) == 0 ? 9 : 10;
        }
    }

    public ProtoWriter(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
    }

    public final void writeBytes(ByteString value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.sink.write(value);
    }

    public final void writeFixed32(int i2) throws IOException {
        this.sink.writeIntLe(i2);
    }

    public final void writeFixed64(long j2) throws IOException {
        this.sink.writeLongLe(j2);
    }

    public final void writeSignedVarint32$wire_runtime(int i2) throws IOException {
        if (i2 >= 0) {
            writeVarint32(i2);
        } else {
            writeVarint64(i2);
        }
    }

    public final void writeString(String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.sink.writeUtf8(value);
    }

    public final void writeTag(int i2, FieldEncoding fieldEncoding) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        writeVarint32(Companion.makeTag$wire_runtime(i2, fieldEncoding));
    }

    public final void writeVarint32(int i2) throws IOException {
        while ((i2 - 128) - ((-128) | i2) != 0) {
            int i3 = i2 & 127;
            this.sink.writeByte((i3 + 128) - (i3 & 128));
            i2 >>>= 7;
        }
        this.sink.writeByte(i2);
    }

    public final void writeVarint64(long j2) throws IOException {
        while (((-128) + j2) - ((-128) | j2) != 0) {
            this.sink.writeByte((-1) - (((-1) - (((int) j2) & 127)) & ((-1) - 128)));
            j2 >>>= 7;
        }
        this.sink.writeByte((int) j2);
    }
}
