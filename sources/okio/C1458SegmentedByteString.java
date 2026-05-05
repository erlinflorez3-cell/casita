package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.SegmentedByteString */
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLш|\u0004O\u00158\u000b<R\u0007Ӭ4\u0012\u0006\u001anj?5Le^.Zݷ2\u000fy\b<$a$yCIU\"Ԃ*\t]TogtOb\u000bQ\u0018\u000eǝ\u0001j:կ]xc\u001c\u00172PrG3StE9vt>\u0005&:*8\u0010\u0005\tɝ2H&v\u0003CQ\f\u001a0VpBĥ\u0013˟\u001b܅B\u0006l\u001fA9bɡ^@Vlu@?%\u0013ipPU`@\u0001[\u0010^TU\u0011țe\u001e9E\u007f;#0k\u00035^\"SKE\u007fJ\u001dhU5q]<]Dg\u0018\u0014C9\u0016!&\u00194l\u001dQ\u000f\u001dW/]ucP<;(~\n!T\u0004<\bWL<B2f6!cx\u0001iXP0q\t\u0014CtD.=\u007fa*i\u001ftiy;G\\}\n˿\u0011\u001e)\u001a72in&`C6\u0005}_MiBSG|' ƴmL{p B\u0004^ZF=ɨ\u0015.\u001dD\u007faGC9k0[\u000b{?\u000bn\nki\u0001V\u0007671EL!\f\tC\u0015\tyhlXZ\u001f} b*\u0016\bA\u001f#\u0006˶%%\u0016r\u0018~w\u0010e]88_jEu\u0007k<YibA[ic>t\u0019\u000b\\JJ\n\u001dX\u0015D\u001a\u001aȺ`((Z\u0011}\u001e!\u0014D|6C6M\u001d44ZD_jČL\u0003$n\n\u0013\u0017\rrh>\u0012\u000572\u001f\u0002$#\u000b1Tj\u0017\bg'\\r\u0011)H;oi5GA\u0006&vF\u0015#5\u0012$\u0004U\u0004dGznFyc+8\u0016HL\u00023K)'~WEHA\u000er\u0001\u0014iM@B+\u0001\b!Sh\\z8n~HxjxN\u0005\u001b0&vrQ\u001b\u0015\u0004\bw^zuv\u001b\u001f$LW#\u001bYj\\h\u0001\u0013P6%/\"h\u0011}CQZ5\u0016&\u0013_\u0019o\u0012\u0002o\\\r\u0013\u00134*}\u0004Zv\\\u0004+WkhS8wXERj*z:ZH\u0019vNVQ:\u001bk`A\u0013r\u001dL\u0016\u0011=7~\u0007Z\f7V$@!*\u00164\\mp\b\f\f\"\u001a[%?^\u0004k{*c\\9\bU\u001eS\u001f?**\u001ck1\u0007[pGH\u0006\"WfEIt\u001d<77d0J\u001e#C\u0003|L\u001eĢ\u0004FeO_8P5SV<\u0017?\\'Z\u0013c]`O.Wϔ\u0011ʟ\"~=̍\u001doLZ=j\u0003\u001ba\u001d!!zQ\u000ffS-rU\u0010Њ*\u0092\u0005\u0013M]QS\u001a8\nO7vÉsO"}, d2 = {"\u001anZ6bu,S\u001b\u0007zg;|\b\fy\u000f(iO\u000e\u001b IE", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "AdV:X5Ma", "", "", "2ha2V;H`-", "", "uZJ\u000fN\u0010\u0002D", "5dc\u0011\\9>Q(\t\brj\u0007\u000f3o", "u(J\u0016", "5dc X.FS\"\u000e\t\u001d6\u0003\r9", "u(J(5", ")Z1", "/r1Fg,\u001bc\u001a\u007fzk", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "0`b2)z", "", "0`b2)z.` ", "1n_F<5M]", "", "=eU@X;", "", "B`a4X;", "B`a4X;(T\u001a\rzm", "0xc266N\\(", "2hV2f;", "/kV<e0MV!", "2hV2f;|]\u001f\u0003\u0005", "3pd._:", "", "=sW2e", "", "5dc \\A>", "5dc \\A>\u0012#\u0005~h", "6`b566=S", "6dg", "6lP0", "9dh", "6lP0\u00176DW#", "7mS2k\u0016?", "4q^:<5=S,", "7mc2e5:Zt\f\bZ@", "7mc2e5:Zt\f\bZ@;\u00135i\n", "7mc2e5:Zz~\n", "", ">nb", "7mc2e5:Zz~\n\u001d6\u0003\r9", ":`bA<5=S,h{", "@`]4X\fJc\u0015\u0006\t", "=sW2e\u0016?T'~\n", "Asa6a.", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "AtQ@g9B\\\u001b", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "Bn0@V0B:#\u0011zk*x\u0017/", "Bn0@V0BC$\nzk*x\u0017/", "Bn1Fg,\u001a`&z\u000f", "Bn1Fg,,b&\u0003\u0004`", "BnBAe0GU", "EqXAX", "=tc", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "EqXAXjHY\u001d\t", "EqXAX\u0019>^ zx^", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class C1458SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        Intrinsics.checkNotNull(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i2, byte[] target, int i3, int i4) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j2 = i4;
        SegmentedByteString.checkOffsetAndCount(size(), i2, j2);
        SegmentedByteString.checkOffsetAndCount(target.length, i3, j2);
        int i5 = i4 + i2;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i7 = getDirectory$okio()[iSegment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            int i9 = i8 + (i2 - i6);
            ArraysKt.copyInto(getSegments$okio()[iSegment], target, i3, i9, i9 + iMin);
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            messageDigest.update(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int length = getSegments$okio().length;
            int i2 = 0;
            hashCode$okio = 1;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory$okio()[length + i2];
                int i5 = getDirectory$okio()[i2];
                byte[] bArr = getSegments$okio()[i2];
                int i6 = (i5 - i3) + i4;
                while (i4 < i6) {
                    hashCode$okio = (hashCode$okio * 31) + bArr[i4];
                    i4++;
                }
                i2++;
                i3 = i5;
            }
            setHashCode$okio(hashCode$okio);
        }
        return hashCode$okio;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory$okio()[length + i2];
                int i5 = getDirectory$okio()[i2];
                mac.update(getSegments$okio()[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return toByteString().indexOf(other, i2);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i2) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i2, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        return getSegments$okio()[iSegment][(i2 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return toByteString().lastIndexOf(other, i2);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, ByteString other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i7 = getDirectory$okio()[iSegment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!other.rangeEquals(i3, getSegments$okio()[iSegment], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, byte[] other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i7 = getDirectory$okio()[iSegment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], i8 + (i2 - i6), other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i2, int i3) {
        C1458SegmentedByteString c1458SegmentedByteString = this;
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(c1458SegmentedByteString, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + size() + ')').toString());
        }
        int i4 = iResolveDefaultParameter - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i2).toString());
        }
        if (i2 == 0 && iResolveDefaultParameter == size()) {
            return c1458SegmentedByteString;
        }
        if (i2 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(getSegments$okio(), iSegment, iSegment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (iSegment <= iSegment2) {
            int i5 = iSegment;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(getDirectory$okio()[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = getDirectory$okio()[getSegments$okio().length + i5];
                if (i5 == iSegment2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (i2 - i8);
        return new C1458SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            int i7 = i6 - i3;
            ArraysKt.copyInto(getSegments$okio()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            out.write(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i4 = i2 + i3;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i4) {
            int i5 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i6 = getDirectory$okio()[iSegment] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            Segment segment = new Segment(getSegments$okio()[iSegment], i8, i8 + iMin, true, false);
            if (buffer.head == null) {
                segment.prev = segment;
                segment.next = segment.prev;
                buffer.head = segment.next;
            } else {
                Segment segment2 = buffer.head;
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i2 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i3));
    }
}
