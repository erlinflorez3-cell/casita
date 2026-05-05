package com.facebook.imageutils;

import com.drew.metadata.webp.WebpDirectory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0010nʑA0RuP.XS2\u000fy\u0002<řc$\bCCU \u007f*\teNogtN`ƖC%إFx\u0019+\nZ~]ܫ\u00132Po\bI[tU9\u000fzf\t.9:8(\r1\u001e8Q(v)E\u0012\fZ>NzRR;X5\u001e \u0012V /+#l\u0017DVzu:]%3mP]?_^\u0005\u0014\r\u000fb5\u001d\u000faL6p;C!=S1\u0014\u0019[\b\u001fM\u0003U\u0013x)7+w~g8h\u007fB AN;o#*j\u0011i`:4qT,g^!@\u0006\u000b}\u001d<2\u0019\u0016)X.[%|\u0007<E%vaLh\u0002\rOFz*R%9\u0018A;;+f\u007flK\u001b^7*\u0010#\u001dQ\u0013\u001f%i`&`C(\u001bw\u001aK_UUT^\fi=\u001c\u000f\u0001d\u0012*2;u\u0012_\u007f\u001f:/%eh\u007f#iy\u0010^\\g%\u0010\u0011laujHn/5\u0016\u007f4\u0017#rD\u0013\u0010\u0014P\u0003er\u0011\u001e(b\b\u0016\bA\"3ɿ\u000fƼ)\u0010Vи9uxPu\nS1=ƀ,ˇo\u000e_ު/?CU{\u0010\u0010TMܠ\u0012םf\u0005`٨ͤW$"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011a\u000e9\u0002\u0015D]\u0005u", "", "u(E", "$O'\u0019R\u000f\u001e/w^g", "", "$O'%R\u000f\u001e/w^g", "$O',;\f\u001a2xk", "1n\\=T9>", "", "EgPA", "", "Ehc5", "5dc~5@MS'Z\tB5\f", "", "Asa2T4", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "5dc\u0015X(=S&", "6dP1X9", "5dc\u0016a;", "5dc \\A>", "\u001aj^A_0G\u001d\u0004z~k\u0002", "5dc#C~\u001dW!~\u0004l0\u0007\u0012", "5dc#C~%2\u001d\u0007zg:\u0001\u00138", "5dc#C~12\u001d\u0007zg:\u0001\u00138", "@dP1&\tRb\u0019\r", "5dc\u001bX?M0-\u000ez::`\u0012>", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebpUtil {
    public static final WebpUtil INSTANCE = new WebpUtil();
    private static final String VP8L_HEADER = "VP8L";
    private static final String VP8X_HEADER = "VP8X";
    private static final String VP8_HEADER = "VP8 ";

    private WebpUtil() {
    }

    private final boolean compare(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(bArr);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                    return false;
                }
            }
        }
        return true;
    }

    @JvmStatic
    public static final int get2BytesAsInt(InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        WebpUtil webpUtil = INSTANCE;
        int nextByteAsInt = webpUtil.getNextByteAsInt(stream);
        int nextByteAsInt2 = webpUtil.getNextByteAsInt(stream) << 8;
        return (nextByteAsInt2 + nextByteAsInt) - (nextByteAsInt2 & nextByteAsInt);
    }

    private final String getHeader(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) (UShort.m9261constructorimpl(b2) & 65535));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
        return string;
    }

    private final int getInt(InputStream inputStream) throws IOException {
        int nextByteAsInt = getNextByteAsInt(inputStream);
        int nextByteAsInt2 = getNextByteAsInt(inputStream);
        int nextByteAsInt3 = getNextByteAsInt(inputStream);
        int nextByteAsInt4 = getNextByteAsInt(inputStream) << 24;
        int i2 = nextByteAsInt3 << 16;
        int i3 = (nextByteAsInt4 + i2) - (nextByteAsInt4 & i2);
        int i4 = nextByteAsInt2 << 8;
        return (-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - nextByteAsInt));
    }

    private final int getNextByteAsInt(InputStream inputStream) throws IOException {
        return inputStream.read() & 255;
    }

    @JvmStatic
    public static final Pair<Integer, Integer> getSize(InputStream stream) {
        WebpUtil webpUtil;
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    stream.read(bArr);
                    webpUtil = INSTANCE;
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                stream.close();
            }
            if (!webpUtil.compare(bArr, "RIFF")) {
                try {
                    stream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return null;
            }
            webpUtil.getInt(stream);
            stream.read(bArr);
            if (!webpUtil.compare(bArr, WebpDirectory.FORMAT)) {
                try {
                    stream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return null;
            }
            stream.read(bArr);
            String header = webpUtil.getHeader(bArr);
            int iHashCode = header.hashCode();
            if (iHashCode != 2640674) {
                if (iHashCode != 2640718) {
                    if (iHashCode == 2640730 && header.equals("VP8X")) {
                        Pair<Integer, Integer> vP8XDimension = webpUtil.getVP8XDimension(stream);
                        try {
                            stream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        return vP8XDimension;
                    }
                } else if (header.equals("VP8L")) {
                    Pair<Integer, Integer> vP8LDimension = webpUtil.getVP8LDimension(stream);
                    try {
                        stream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    return vP8LDimension;
                }
            } else if (header.equals("VP8 ")) {
                return webpUtil.getVP8Dimension(stream);
            }
            stream.close();
            return null;
        } finally {
            try {
                stream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    private final Pair<Integer, Integer> getVP8Dimension(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int nextByteAsInt = getNextByteAsInt(inputStream);
        int nextByteAsInt2 = getNextByteAsInt(inputStream);
        int nextByteAsInt3 = getNextByteAsInt(inputStream);
        if (nextByteAsInt == 157 && nextByteAsInt2 == 1 && nextByteAsInt3 == 42) {
            return new Pair<>(Integer.valueOf(get2BytesAsInt(inputStream)), Integer.valueOf(get2BytesAsInt(inputStream)));
        }
        return null;
    }

    private final Pair<Integer, Integer> getVP8LDimension(InputStream inputStream) throws IOException {
        getInt(inputStream);
        if (getNextByteAsInt(inputStream) != 47) {
            return null;
        }
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read();
        int i4 = inputStream.read() & 255;
        int i5 = inputStream.read();
        int i6 = ((-1) - (((-1) - i3) | ((-1) - 63))) << 8;
        return new Pair<>(Integer.valueOf(((i2 + i6) - (i2 & i6)) + 1), Integer.valueOf(((-1) - (((-1) - ((-1) - (((-1) - (((i5 + 15) - (i5 | 15)) << 10)) & ((-1) - (i4 << 2))))) & ((-1) - ((i3 & 192) >> 6)))) + 1));
    }

    private final Pair<Integer, Integer> getVP8XDimension(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(read3Bytes(inputStream) + 1), Integer.valueOf(read3Bytes(inputStream) + 1));
    }

    private final int read3Bytes(InputStream inputStream) throws IOException {
        int nextByteAsInt = getNextByteAsInt(inputStream);
        int nextByteAsInt2 = getNextByteAsInt(inputStream);
        int nextByteAsInt3 = (-1) - (((-1) - (getNextByteAsInt(inputStream) << 16)) & ((-1) - (nextByteAsInt2 << 8)));
        return (nextByteAsInt3 + nextByteAsInt) - (nextByteAsInt3 & nextByteAsInt);
    }
}
