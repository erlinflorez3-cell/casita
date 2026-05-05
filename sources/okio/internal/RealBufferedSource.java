package okio.internal;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d̉=!,i\bDZc|İI\u0006>\u00146Ȑ\u0007\":\u0019\u007fјnjG3LeN/ZS@\u000fs{:%c$\bCCU ~*\t]TogtKb\u000bQ\u001f\u000e\u0016\u000fj4կ]xs\u0012\u00172HxG3[wE9ft>\u0005.>*8\u007f\u000b\t\u001a@H\u0018v\u0001CS\f(0Hp@R%X\u0013܅*\u0006l\u001f)\u001e\u000bg\u0015ȥN\u0005hH0;\u0003\u0018Dv'\u000e0Cղ\u0013^w5\u0010\u000faL/h7c\u0015UW\u0011\fj[m\touK\f\u0001'U/ywe>p\u007fB\u0019q˾\u0013u\u000e4_\u001dQ\u000f\u0010O+}c{T\u001c1\u0010z*\u0017l\b\u001c\r?H\\1`ǒ\u000e&N\u0003}k@~\u0006\u0007B.z\u0012:%1\u00183YCKj_hS\u0019|;B˝\u00136.\u000f{9[\u0003\u001c\t\u0015IT>΄7ikKWf\n\b?\u0016\u0004\u001fb2.\u0012@_\u007f]\u007fA2%.O[g-Qo\u0010Y\\g%\u0017\u0011la|jHn45ݬ=B,\u001an\\d3}xT\u0007,AQ*i\u001f}6)P`\u0006L9%>`\u007flw}e]87uϊ=q\ny\"o9\r7]Q\u0012\u0010\u0012V\u0005)W<\u0011\u001c\tjPf$Z\u000b,höN\u0003#\u0006\u0014\\N:\u0017Z? \u001cd0?.t\u0015v\u001cdՔG\u0015\u0014mt\u0001\u0010-Z[$1ijڐ\u000f\u0019[j\f\bg'_T|\u000f\"sیWM,4p:hb\u0013K\u0007-s0Ku__L\u001b\u001a<ɞ\u00028!(Ui/k\u001d7~W2HΐKd\u0006sme\u0012U\u0005%y=;\u00192u\u001b\u0003pZd1\u07bbUl\"0\u0014vrQ\f\r\u007f(a\rڪM{g\u0019yVI!\u0002\u0002<|8-\t-3=\u0001\u001e8Cއ3[B+4\u0010\u0014]\u0014\n]\u0018o^}p$>t\u0014\u001b\\g$\u0003zQ\f6\u0002ͰOq\nLA<l1Fpj&\b\tއ:%>Va|p\u0005Ju\u000b]}-\u00002%{d|R\u0013\u001e\u0010\\.\u000e*:ʖ\u0004,iQG)M\u0002k\u0016my\\Qͨ\u0015\"\u0016\nT\u0007\u0012JAHV\u0006bOݶ\f\f#DeSb3a1$b,\u0003ދ\u0011[_w,(z.k\b\u000fE2\tƾAn\u0019b tVv-\tE\u000f!p܁\u0005'F, M13\u0016nT]cb\u0005a0!\u001b\u0019SEܻ+CObb3(\u0007\u00133E\fC\u0010ͺ<\u001cT7\u0018\u0004q\"7F%EBF\u001b\u007fܲ\u0017w\n>\n#U\u0013v\rv@f\u0003R0U\u0017z+\u0012\u0003߾\u0015#,] \bb[NvweCJ\u0005%WA\u0007:\u0001*˫!E\u0019C[UI\u0019\u0013O{\u0006Sk\u0002\u001638'2xgƹ]&y\u0018\r3:D\u0004>b0\tCT.4FJ#$Pڕ\u000eNb\u0010e\u001a\u0013\rX\u0014wO@W/z\u0019ZK\u0017|Pɩr{yc>\u001bf_\u000b\"n[Pcԕ-e9!\u000er:?{HX?\u007fZݼ,̨:>"}, d2 = {"1n\\:b5\u001cZ#\rz", "", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u0006P\u000e\u0015\u0017\u001d", "1n\\:b5\u001ef\u001cz\u000bl;|\b", "", "1n\\:b5\"\\\u0018~\u000eH-", "", AdkSettings.PLATFORM_TYPE_MOBILE, "", "4q^:<5=S,", "Bn8;W,Q", "0xc2f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "1n\\:b5\"\\\u0018~\u000eH-\\\u0010/m\u007f1\u000b", "B`a4X;\u001bg(~\t", "1n\\:b5)S\u0019\u0005", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "1n\\:b5+O\"\u0001z>8\r\u00056s", "=eU@X;", "0xc2f\u0016?T'~\n", "", "0xc266N\\(", "1n\\:b5+S\u0015}", "Ah]8", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "1n\\:b5+S\u0015}Ve3", "\u001anZ6bu,W\"\u0005P", "1n\\:b5+S\u0015}Wr;|", "1n\\:b5+S\u0015}Wr;|d<r{<", "1n\\:b5+S\u0015}Wr;|v>r\u00041}", "1n\\:b5+S\u0015}Y^*\u0001\u0011+lf2\u0005B", "1n\\:b5+S\u0015}[n3\u0004\u001d", "1n\\:b5+S\u0015}]^?x\b/c\u00040wGp %Kq\u0017<u\f?b\u007f", "1n\\:b5+S\u0015}^g;", "1n\\:b5+S\u0015}^g;c\t", "1n\\:b5+S\u0015}ah5~", "1n\\:b5+S\u0015}ah5~o/", "1n\\:b5+S\u0015}ha6\n\u0018", "", "1n\\:b5+S\u0015}ha6\n\u0018\u0016e", "1n\\:b5+S\u0015}jm-O", "", "1n\\:b5+S\u0015}jm-Of9d\u007f\u0013\u0006D\n&", "1n\\:b5+S\u0015}jm-Oo3n\u007f", "1n\\:b5+S\u0015}jm-Oo3n\u007f\u0016\u000bM\u0005\u0015&", ":h\\6g", "1n\\:b5+S%\u000fzl;", "1n\\:b5+S%\u000f~k,", "1n\\:b5,S ~xm", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "1n\\:b5,Y\u001d\n", "1n\\:b5-W!~\u0005n;", "\u001anZ6bu-W!~\u0005n;R", "1n\\:b5-]\u0007\u000e\bb5~", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b2, long j2, long j3) {
        long jMax = j2;
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > jMax || jMax > j3) {
            throw new IllegalArgumentException(("fromIndex=" + jMax + " toIndex=" + j3).toString());
        }
        while (jMax < j3) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(b2, jMax, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j3 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
        }
        return -1L;
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString bytes, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j2);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j2);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    public static final BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j2, ByteString bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 < 0 || i2 < 0 || i3 < 0 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            long j3 = ((long) i4) + j2;
            if (!realBufferedSource.request(1 + j3) || realBufferedSource.bufferField.getByte(j3) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] sink, int i2, int i3) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(sink.length, i2, j2);
        if (realBufferedSource.bufferField.size() == 0) {
            if (i3 == 0) {
                return 0;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return realBufferedSource.bufferField.read(sink, i2, (int) Math.min(j2, realBufferedSource.bufferField.size()));
    }

    public static final long commonRead(okio.RealBufferedSource realBufferedSource, Buffer sink, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSource.bufferField.size() == 0) {
            if (j2 == 0) {
                return 0L;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j2, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j2 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j2;
        }
        long size = j2 + realBufferedSource.bufferField.size();
        sink.write(realBufferedSource.bufferField, realBufferedSource.bufferField.size());
        return size;
    }

    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j2);
        return realBufferedSource.bufferField.readByteArray(j2);
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j2);
        return realBufferedSource.bufferField.readByteString(j2);
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) {
        byte b2;
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!realBufferedSource.request(j3)) {
                break;
            }
            b2 = realBufferedSource.bufferField.getByte(j2);
            if ((b2 < 48 || b2 > 57) && !(j2 == 0 && b2 == 45)) {
                break;
            }
            j2 = j3;
        }
        if (j2 == 0) {
            StringBuilder sb = new StringBuilder("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b2, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new NumberFormatException(sb.append(string).toString());
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, Buffer sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(j2);
            realBufferedSource.bufferField.readFully(sink, j2);
        } catch (EOFException e2) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e2;
        }
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e2) {
            int i2 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                int i3 = realBufferedSource.bufferField.read(sink, i2, (int) realBufferedSource.bufferField.size());
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
            throw e2;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) {
        byte b2;
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!realBufferedSource.request(i3)) {
                break;
            }
            b2 = realBufferedSource.bufferField.getByte(i2);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b2, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new NumberFormatException(sb.append(string).toString());
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j2);
        return realBufferedSource.bufferField.readUtf8(j2);
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b2 = realBufferedSource.bufferField.getByte(0L);
        if ((b2 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (224 | b2) == 192) {
            realBufferedSource.require(2L);
        } else if ((b2 + 240) - (240 | b2) == 224) {
            realBufferedSource.require(3L);
        } else if ((-1) - (((-1) - b2) | ((-1) - 248)) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j3);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j3 < Long.MAX_VALUE && realBufferedSource.request(j3) && realBufferedSource.bufferField.getByte(j3 - 1) == 13 && realBufferedSource.request(1 + j3) && realBufferedSource.bufferField.getByte(j3) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j3);
        }
        Buffer buffer = new Buffer();
        realBufferedSource.bufferField.copyTo(buffer, 0L, Math.min(32, realBufferedSource.bufferField.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j2) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j2) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (realBufferedSource.bufferField.size() < j2) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j2)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j2 -= jMin;
        }
    }

    public static final Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }
}
