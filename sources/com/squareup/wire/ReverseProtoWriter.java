package com.squareup.wire;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Utf8;
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
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0RuP\u008cZS8\u0015s{:(c$\bCCU \u0003*\t]No˧vJp\u000bK\u000f\f\u0019\u0001jBI]xs\u0012\u00172HqG3coEʠhtD\u0011(2(9\u0002\u0005\u0017\u001a2H\u0016x\u0003CY\u0013\u001a0FrPĥ+\u00035\u001a@\u0005v\u001f6^aʄR8Nlk;w/\u0011\u0002ZNUx`\u0001['^TU(?o,GX7c.UW\u0011$j[m\r\u0006q\u0006\u000bvE?+w\r\u001e6!.\"4CO;v#Ej%i{\u001c8;^\u0012\\ח\u00122}\u001d\f\u0013B'\u001e\b-NT=*h\u0018\u000ea\u000e!t\u0007АؿbB\u0006\u001f*B%J\u00183YRKj_\bS\u0019|^D\u0011\u001bF;\u0001\u001d:\fX\u001c\u0007-\u001b\u0003!\u001aE_jUH|#\nA{/\tb0444U,G{?[_8E\nQ#O\u00052LR\u000e\u000f\u0005\u000fr\u001a֟ʐL@(\u001e^C89$Zr}5o^zp,?Wd`\u0015/ \u0013Nu(@/K(N}\u001b2v[\u0011\"%]\u007fg]|\u0012&Wgh{A_\u0018(a\u0001\u0010DCJ\t\u001dX\u0015t$\u0018h^@\"`KAݛ\u0004ԞHN\u0014Ǝ\u0003K\u007f L,_\u001c3ìTҴ\"BIґYkhm(~\u00039zѳk˨x\t\tˆ-|}n\u0011IZ\u00057ø9ۮU5!ğ&.v=\u0015#5\tJÕSѨPGT˾f\u000fc\u00078\u0016H<\bo\u0014ТÆ~Ȟ6\f5GR\u0001s`e\u0014-\u0007\u000b\u0007_Tv>\u007f\b\u0019\u0002b!A\u07bd֧TЂ&\u0001ft)\u001cr\u000f\u0012cL\rUv%\u001aiSar1cr\u0013̞\u0001\t7 +\u0017}9Ņ9c"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "", "\nh]6g\u0005", "u(E", "B`X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "6dP1", "1ta@b9", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "/qa.l", "", "/qa.l\u0013B[\u001d\u000e", "", "4naDT9=0)\u007f{^9", "5dc\u0013b9PO&}Wn-}\t<", "u(;<^0H\u001du\u000f{_,\n^", "4naDT9=0)\u007f{^9;\b/l\u007f*wO\u0001", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "4naDT9=E&\u0003\n^9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "5dc\u0013b9PO&}lk0\f\t<", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vy\u007fIz45fS", "4naDT9=E&\u0003\n^9;\b/l\u007f*wO\u0001", "0xc266N\\(", "5dc\u000fl;>1#\u000f\u0004m", "u(8", "EqXAX\u001bH", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "@d`B\\9>", ";h]\u000fl;>1#\u000f\u0004m", "3lXA6<K`\u0019\b\nL,~\u0011/n\u000f", "EqXAX\rH`+z\b]", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "EqXAX\rH`+z\b]j\u000f\r<ey5\fI\u0010\u001b\u001fG", "EqXAX\tRb\u0019\r", "D`[BX", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "EqXAX\u001aM`\u001d\b|", "", "EqXAX\u001b:U", "4hT9W\u0015N[\u0016~\b", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "EqXAX\u001aBU\"~yO(\n\r8tMt", "EqXAX\u001aBU\"~yO(\n\r8tMt:R\u0005$\u0017A|\u001eE\u0006)=Y", "EqXAX\u001d:`\u001d\b\n,x", "EqXAX\u001d:`\u001d\b\n/z", "", "EqXAX\rBf\u0019}H+", "EqXAX\rBf\u0019}K-", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;
    private Buffer tail = new Buffer();
    private Buffer head = new Buffer();
    private final Buffer.UnsafeCursor cursor = new Buffer.UnsafeCursor();
    private byte[] array = EMPTY_ARRAY;
    private final Lazy forwardBuffer$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
        }
    });
    private final Lazy forwardWriter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.squareup.wire.ReverseProtoWriter$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReverseProtoWriter.forwardWriter_delegate$lambda$1(this.f$0);
        }
    });

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u001b6Ȑ\u0005ӯ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅ$\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#l+MCv0'\u0019rj\u000f", "", "\nh]6g\u0005", "u(E", "\u0013L?!L&\u001a@\u0006Zn", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void emitCurrentSegment() throws IOException {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.writeAll(this.tail);
        Buffer buffer = this.tail;
        this.tail = this.head;
        this.head = buffer;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    public static final Buffer forwardBuffer_delegate$lambda$0() {
        return new Buffer();
    }

    public static final ProtoWriter forwardWriter_delegate$lambda$1(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final Buffer getForwardBuffer() {
        return (Buffer) this.forwardBuffer$delegate.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter$delegate.getValue();
    }

    private final void require(int i2) throws IOException {
        if (this.arrayLimit >= i2) {
            return;
        }
        emitCurrentSegment();
        this.head.readAndWriteUnsafe(this.cursor);
        this.cursor.expandBuffer(i2);
        if (this.cursor.offset == 0) {
            int i3 = this.cursor.end;
            byte[] bArr = this.cursor.data;
            Intrinsics.checkNotNull(bArr);
            if (i3 == bArr.length) {
                byte[] bArr2 = this.cursor.data;
                Intrinsics.checkNotNull(bArr2);
                this.array = bArr2;
                this.arrayLimit = this.cursor.end;
                return;
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int getByteCount() {
        return ((int) this.tail.size()) + (this.array.length - this.arrayLimit);
    }

    public final void writeBytes(ByteString value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        while (size != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, size);
            int i2 = this.arrayLimit - iMin;
            this.arrayLimit = i2;
            size -= iMin;
            value.copyInto(size, this.array, i2, iMin);
        }
    }

    public final void writeFixed32(int i2) throws IOException {
        require(4);
        int i3 = this.arrayLimit;
        int i4 = i3 - 4;
        this.arrayLimit = i4;
        byte[] bArr = this.array;
        bArr[i4] = (byte) (255 & i2);
        bArr[i3 - 3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 - 2] = (byte) ((-1) - (((-1) - (i2 >>> 16)) | ((-1) - 255)));
        bArr[i3 - 1] = (byte) ((i2 >>> 24) & 255);
    }

    public final void writeFixed64(long j2) throws IOException {
        require(8);
        int i2 = this.arrayLimit;
        int i3 = i2 - 8;
        this.arrayLimit = i3;
        byte[] bArr = this.array;
        bArr[i3] = (byte) (j2 & 255);
        bArr[i2 - 7] = (byte) ((-1) - (((-1) - (j2 >>> 8)) | ((-1) - 255)));
        long j3 = j2 >>> 16;
        bArr[i2 - 6] = (byte) ((j3 + 255) - (j3 | 255));
        bArr[i2 - 5] = (byte) ((j2 >>> 24) & 255);
        long j4 = j2 >>> 32;
        bArr[i2 - 4] = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = j2 >>> 40;
        bArr[i2 - 3] = (byte) ((j5 + 255) - (j5 | 255));
        bArr[i2 - 2] = (byte) ((-1) - (((-1) - (j2 >>> 48)) | ((-1) - 255)));
        bArr[i2 - 1] = (byte) ((-1) - (((-1) - (j2 >>> 56)) | ((-1) - 255)));
    }

    public final void writeForward$wire_runtime(Function1<? super ProtoWriter, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().readByteString());
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
        int length = value.length() - 1;
        while (length >= 0) {
            int i2 = length - 1;
            char cCharAt = value.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i3 = this.arrayLimit;
                byte[] bArr = this.array;
                int i4 = i3 - 1;
                bArr[i4] = (byte) cCharAt;
                int iMax = Math.max(-1, i2 - i4);
                length = i2;
                while (length > iMax) {
                    char cCharAt2 = value.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i4--;
                    bArr[i4] = (byte) cCharAt2;
                }
                this.arrayLimit = i4;
            } else {
                if (cCharAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i5 = this.arrayLimit;
                    int i6 = i5 - 1;
                    this.arrayLimit = i6;
                    bArr2[i6] = (byte) ((-1) - (((-1) - 128) & ((-1) - ((-1) - ((65535 - cCharAt) | ((-1) - 63))))));
                    int i7 = i5 - 2;
                    this.arrayLimit = i7;
                    int i8 = cCharAt >> 6;
                    bArr2[i7] = (byte) ((i8 + 192) - (i8 & 192));
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i9 = this.arrayLimit;
                    int i10 = i9 - 1;
                    this.arrayLimit = i10;
                    bArr3[i10] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt) | ((-1) - 63)))) & ((-1) - 128)));
                    int i11 = i9 - 2;
                    this.arrayLimit = i11;
                    int i12 = (-1) - (((-1) - 63) | ((-1) - (cCharAt >> 6)));
                    bArr3[i11] = (byte) ((128 + i12) - (128 & i12));
                    int i13 = i9 - 3;
                    this.arrayLimit = i13;
                    int i14 = cCharAt >> '\f';
                    bArr3[i13] = (byte) ((i14 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (i14 & CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
                } else {
                    char cCharAt3 = i2 >= 0 ? value.charAt(i2) : CharCompanionObject.MAX_VALUE;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i15 = this.arrayLimit - 1;
                        this.arrayLimit = i15;
                        bArr4[i15] = Utf8.REPLACEMENT_BYTE;
                    } else {
                        length -= 2;
                        int i16 = ((-1) - (((-1) - (((-1) - ((65535 - cCharAt3) | ((-1) - 1023))) << 10)) & ((-1) - ((cCharAt + 1023) - (cCharAt | 1023))))) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i17 = this.arrayLimit;
                        int i18 = i17 - 1;
                        this.arrayLimit = i18;
                        int i19 = i16 & 63;
                        bArr5[i18] = (byte) ((i19 + 128) - (i19 & 128));
                        int i20 = i17 - 2;
                        this.arrayLimit = i20;
                        bArr5[i20] = (byte) ((-1) - (((-1) - ((i16 >> 6) & 63)) & ((-1) - 128)));
                        int i21 = i17 - 3;
                        this.arrayLimit = i21;
                        int i22 = 63 & (i16 >> 12);
                        bArr5[i21] = (byte) ((128 + i22) - (128 & i22));
                        int i23 = i17 - 4;
                        this.arrayLimit = i23;
                        int i24 = i16 >> 18;
                        bArr5[i23] = (byte) ((i24 + 240) - (i24 & 240));
                    }
                }
                length = i2;
            }
        }
    }

    public final void writeTag(int i2, FieldEncoding fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        writeVarint32(ProtoWriter.Companion.makeTag$wire_runtime(i2, fieldEncoding));
    }

    public final void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        emitCurrentSegment();
        sink.writeAll(this.tail);
    }

    public final void writeVarint32(int i2) {
        int iVarint32Size$wire_runtime = ProtoWriter.Companion.varint32Size$wire_runtime(i2);
        require(iVarint32Size$wire_runtime);
        int i3 = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i3;
        while (((-128) & i2) != 0) {
            this.array[i3] = (byte) (((i2 + 127) - (127 | i2)) | 128);
            i2 >>>= 7;
            i3++;
        }
        this.array[i3] = (byte) i2;
    }

    public final void writeVarint64(long j2) throws IOException {
        int iVarint64Size$wire_runtime = ProtoWriter.Companion.varint64Size$wire_runtime(j2);
        require(iVarint64Size$wire_runtime);
        int i2 = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i2;
        while (((-128) + j2) - ((-128) | j2) != 0) {
            this.array[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        this.array[i2] = (byte) j2;
    }
}
