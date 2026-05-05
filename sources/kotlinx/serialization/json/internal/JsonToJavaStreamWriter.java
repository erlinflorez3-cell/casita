package kotlinx.serialization.json.internal;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\"\u007fјnjGGL͜P.`Y2şs{B$c$wCCU(\n*\tUYog|Tb\u000bI\u000f\u000e\u0016\u0007q4I[|c܈%˰rom2\u000ezM=ntN\u0005N3ŕ<y\u0013\u0003b@V\u0019\u000fzqU<\u0016>K\t:\u0001\u0015}\t(\u001e\u001e>N\u000ed\\0]DV\u0005]h9S\u0007wQf'\u000e8Cմ\u0013\u000fj5\u001d\u000faL3p;C&=S1\u000f\u0003_M\u0015Wqk\r/'o1W\u0007o6\u0007\nZ\u0015sU\u001bq\u000b&\u000b\u000f\u0018tT.9d{K~\u0016n¾\u0001D\u001cJ\u001a&\u0006UR^1(} \u000ea|9ԢF\u0019\u0010lX\u0018z\u0010@G)\u000eKC9Is\u0018u\u0004'\\P\u0014\u0005;(S\u0005|;sT<{[/\u001d\u0006_Mi@kR~\u000egZ\u0006\u0004\u001f\u0001H>L>U\u001fG{?8G)EsQ#OxH\\\r}\u0005%xh\u0002s\u0003LN.\u0007\u0016e09\u0010he|\u0005\u001aX\u001bXt\u001f[>l\u0007,\u0012C$j\u001bT!S\u0018\u0015O9uxPu\nS3=ƀ[ˇo\u000e_ު/?CV{\u0010\u0010XMܠKםf\u0005`٨\u0013_\u001aat(P:\u001fН\u001cȑ\u007fDVۼc>Mq44Z2o¥\u0017Ƞ\u0007\u001eJˆҺ\r\u0004"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDZ>\u0003\u0011y]'\u0016p,J~\u0019TP],i(", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MD]A\"$hn\u000f", "Asa2T4", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "uKY.i(\bW#Hdn;\b\u0019>S\u000f5{<\tlZ8", "0tU3X9", "", "1gP?49KO-", "", "7mS2k\u0010G0)\u007f{^9", "", "/o_2a+,b&\u0003\u0004`\u001a\u0004\u0013AP{7~", "", "1ta?X5MA\u001d\u0014z", "Asa6a.", "", "3mbBe,", "0xc2f\nHc\"\u000e", "3mbBe,-](z\u0002<(\b\u0005-i\u000f<", "=kS \\A>", "/cS6g0H\\\u0015\u0006", "4kd@[", "@d[2T:>", "@dbA", "EqXAX", "0xc2", "BdgA", "EqXAX\nAO&", "1gP?", "", "EqXAX\u0013H\\\u001b", "D`[BX", "", "EqXAX\u0018N](~y", "EqXAX\u001cMTk", "1nd;g", "EqXAX\u001cMTk\\\u0005],g\u00133n\u000f", "1nS2C6B\\(", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonToJavaStreamWriter implements JsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final OutputStream stream;

    public JsonToJavaStreamWriter(OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int i2, String str) throws IOException {
        int length = str.length();
        for (int i3 = i2 - 1; i3 < length; i3++) {
            int iEnsureTotalCapacity = ensureTotalCapacity(i2, 2);
            char cCharAt = str.charAt(i3);
            if (cCharAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b2 = StringOpsKt.getESCAPE_MARKERS()[cCharAt];
                if (b2 == 0) {
                    i2 = iEnsureTotalCapacity + 1;
                    this.charArray[iEnsureTotalCapacity] = cCharAt;
                } else if (b2 == 1) {
                    String str2 = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str2.length());
                    str2.getChars(0, str2.length(), this.charArray, iEnsureTotalCapacity2);
                    i2 = iEnsureTotalCapacity2 + str2.length();
                } else {
                    char[] cArr = this.charArray;
                    cArr[iEnsureTotalCapacity] = '\\';
                    cArr[iEnsureTotalCapacity + 1] = (char) b2;
                    i2 = iEnsureTotalCapacity + 2;
                }
            } else {
                i2 = iEnsureTotalCapacity + 1;
                this.charArray[iEnsureTotalCapacity] = cCharAt;
            }
        }
        ensureTotalCapacity(i2, 1);
        char[] cArr2 = this.charArray;
        cArr2[i2] = '\"';
        writeUtf8(cArr2, i2 + 1);
        flush();
    }

    private final void ensure(int i2) throws IOException {
        if (this.buffer.length - this.indexInBuffer < i2) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int i2, int i3) {
        int i4 = i3 + i2;
        char[] cArr = this.charArray;
        if (cArr.length <= i4) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i4, i2 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(this, newSize)");
            this.charArray = cArrCopyOf;
        }
        return i2;
    }

    private final void flush() throws IOException {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void write(int i2) {
        byte[] bArr = this.buffer;
        int i3 = this.indexInBuffer;
        this.indexInBuffer = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    private final void writeUtf8(char[] cArr, int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("count < 0".toString());
        }
        if (i2 > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i2 + " > " + cArr.length).toString());
        }
        int i3 = 0;
        while (i3 < i2) {
            char c2 = cArr[i3];
            if (c2 < 128) {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr = this.buffer;
                int i4 = this.indexInBuffer;
                int i5 = i4 + 1;
                this.indexInBuffer = i5;
                bArr[i4] = (byte) c2;
                i3++;
                int iMin = Math.min(i2, (bArr.length - i5) + i3);
                while (i3 < iMin) {
                    char c3 = cArr[i3];
                    if (c3 < 128) {
                        byte[] bArr2 = this.buffer;
                        int i6 = this.indexInBuffer;
                        this.indexInBuffer = i6 + 1;
                        bArr2[i6] = (byte) c3;
                        i3++;
                    }
                }
            } else {
                if (c2 < 2048) {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    int i7 = c2 >> 6;
                    int i8 = (i7 + 192) - (i7 & 192);
                    byte[] bArr3 = this.buffer;
                    int i9 = this.indexInBuffer;
                    int i10 = i9 + 1;
                    this.indexInBuffer = i10;
                    bArr3[i9] = (byte) i8;
                    int i11 = (-1) - ((65535 - c2) | ((-1) - 63));
                    this.indexInBuffer = i9 + 2;
                    bArr3[i10] = (byte) ((i11 + 128) - (i11 & 128));
                } else if (c2 < 55296 || c2 > 57343) {
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    int i12 = (c2 >> '\f') | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
                    byte[] bArr4 = this.buffer;
                    int i13 = this.indexInBuffer;
                    int i14 = i13 + 1;
                    this.indexInBuffer = i14;
                    bArr4[i13] = (byte) i12;
                    int i15 = i13 + 2;
                    this.indexInBuffer = i15;
                    bArr4[i14] = (byte) ((-1) - (((-1) - ((c2 >> 6) & 63)) & ((-1) - 128)));
                    this.indexInBuffer = i13 + 3;
                    bArr4[i15] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - c2) | ((-1) - 63)))) & ((-1) - 128)));
                } else {
                    int i16 = i3 + 1;
                    char c4 = i16 < i2 ? cArr[i16] : (char) 0;
                    if (c2 > 56319 || 56320 > c4 || c4 >= 57344) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i17 = this.indexInBuffer;
                        this.indexInBuffer = i17 + 1;
                        bArr5[i17] = (byte) 63;
                        i3 = i16;
                    } else {
                        int i18 = ((-1) - (((-1) - (((c2 + 1023) - (c2 | 1023)) << 10)) & ((-1) - ((-1) - ((65535 - c4) | ((-1) - 1023)))))) + 65536;
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        byte[] bArr6 = this.buffer;
                        int i19 = this.indexInBuffer;
                        int i20 = i19 + 1;
                        this.indexInBuffer = i20;
                        bArr6[i19] = (byte) ((-1) - (((-1) - (i18 >> 18)) & ((-1) - 240)));
                        int i21 = i18 >> 12;
                        int i22 = i19 + 2;
                        this.indexInBuffer = i22;
                        bArr6[i20] = (byte) ((-1) - (((-1) - ((i21 + 63) - (i21 | 63))) & ((-1) - 128)));
                        int i23 = i19 + 3;
                        this.indexInBuffer = i23;
                        bArr6[i22] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (i18 >> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                        int i24 = (-1) - (((-1) - i18) | ((-1) - 63));
                        this.indexInBuffer = i19 + 4;
                        bArr6[i23] = (byte) ((i24 + 128) - (i24 & 128));
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    private final void writeUtf8CodePoint(int i2) throws IOException {
        if (i2 < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i3 = this.indexInBuffer;
            this.indexInBuffer = i3 + 1;
            bArr[i3] = (byte) i2;
            return;
        }
        if (i2 < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            byte[] bArr2 = this.buffer;
            int i4 = this.indexInBuffer;
            int i5 = i4 + 1;
            this.indexInBuffer = i5;
            bArr2[i4] = (byte) ((i2 >> 6) | 192);
            int i6 = (i2 + 63) - (i2 | 63);
            this.indexInBuffer = i4 + 2;
            bArr2[i5] = (byte) ((i6 + 128) - (i6 & 128));
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i7 = this.indexInBuffer;
            this.indexInBuffer = i7 + 1;
            bArr3[i7] = (byte) 63;
            return;
        }
        if (i2 < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            int i8 = (-1) - (((-1) - (i2 >> 12)) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
            byte[] bArr4 = this.buffer;
            int i9 = this.indexInBuffer;
            int i10 = i9 + 1;
            this.indexInBuffer = i10;
            bArr4[i9] = (byte) i8;
            int i11 = i2 >> 6;
            int i12 = i9 + 2;
            this.indexInBuffer = i12;
            bArr4[i10] = (byte) ((-1) - (((-1) - ((i11 + 63) - (i11 | 63))) & ((-1) - 128)));
            int i13 = (-1) - (((-1) - i2) | ((-1) - 63));
            this.indexInBuffer = i9 + 3;
            bArr4[i12] = (byte) ((i13 + 128) - (i13 & 128));
            return;
        }
        if (i2 > 1114111) {
            throw new JsonEncodingException("Unexpected code point: " + i2);
        }
        if (this.buffer.length - this.indexInBuffer < 4) {
            flush();
        }
        byte[] bArr5 = this.buffer;
        int i14 = this.indexInBuffer;
        int i15 = i14 + 1;
        this.indexInBuffer = i15;
        bArr5[i14] = (byte) ((i2 >> 18) | 240);
        int i16 = (-1) - (((-1) - (i2 >> 12)) | ((-1) - 63));
        int i17 = i14 + 2;
        this.indexInBuffer = i17;
        bArr5[i15] = (byte) ((i16 + 128) - (i16 & 128));
        int i18 = i2 >> 6;
        int i19 = (i18 + 63) - (i18 | 63);
        int i20 = i14 + 3;
        this.indexInBuffer = i20;
        bArr5[i17] = (byte) ((i19 + 128) - (i19 & 128));
        this.indexInBuffer = i14 + 4;
        bArr5[i20] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 63)))) & ((-1) - 128)));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void release() throws IOException {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void write(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeChar(char c2) throws IOException {
        writeUtf8CodePoint(c2);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeLong(long j2) throws IOException {
        write(String.valueOf(j2));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeQuoted(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        for (int i3 = 1; i3 < i2; i3++) {
            char c2 = cArr[i3];
            if (c2 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c2] != 0) {
                appendStringSlowPath(i3, text);
                return;
            }
        }
        cArr[i2] = '\"';
        writeUtf8(cArr, length + 2);
        flush();
    }
}
