package okio.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import okio.C1458SegmentedByteString;
import okio.Segment;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
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
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!,o\bDRv|\u0004G\b8\u000b<B\u0007\"B\u0012\u007f\u0007ljA0RuP.XT2\u000fy\u0005<řc$\u007fّCU ~*\t]QogtKb\u000bY\u000f\u000e\u0016~n4Ikxe\u0012\u00152JoU3UoS9ht<\u00078T0\u0600\u0012\u0005/\u0019RH>v+GY\r*0nojV\u001bO\u001d\u001a@\u0005n$\u000f!tg|5\u000fǍue='\u001bipSO_^\u0003}\u0011T[?\r%`N/N?M\u0015S\\3\u000b`eW\u0003mpm\tv2?+wr\u001ḙ^\u0018)#7g\r\f\u007fN\\3W\u0011\u001259geaO<7>\u07bf\u0002%G\u0012\u001e\u001e'v-U\u001a\u0015\u000eTޘz\u000b^Na\u001a^p~#ad\u001dkį9CL)xiai,v7*\u000b=\"1\u0015\u0007!\nST֬\u001b3\u007f\u0006fIQnJpN8_mq\u0012wz\u0002X\u0003`K\u000e=\u0014\u0011\\ U;iO;!\u001a\u0001xHu\u0002\u001d`\u0017R0ɮNXM|+O*7\u0019\u0003D\u0013\u000b\u001cTb_D\u0011{\u001b\u0005\u000b\f\u0016+ \u000b\u000fl%3&fO\u0017h\u001bQk\u0015=/\u00156 ʥq&rGvK5\u007fz8a\u0001|DCJ{\u001dX\u0015A\u0004\u0010hv@\"`G1ݙ}\u0014O\\'+2mzD4Z7_£\u001b`&,^Y|7d\u0003h>\u0005\u000572 \u0002$#'1Tjw\bg'H\\\u0001n-EA\u007f4_Ġ[:DB\u001c;\u0007-x(G\u0016Rw\u0016z6\u000e\u001b\f1&)gZȠA\u001d\u0015!98\bPUNxkwq\"8\u000b\f(\u000e³l8m*zv2\u0004zLUZ=)\u0007o\u000326cѣ}kL\u001dWiZ.k@Ox)dLPH|3$LFGǼ(ƕ4Ԇ[\u0010+5\u0010\u0014]\u001a\n]\u0018u^}p(>t\u0014\u0003\\g$\nzQ\f1k\u0002Wy\u0017\u000425|\u0012pQܖ{\u0012H+D\u00139kQfv\\^q\u001b@\u000eu5+ޛt`a\\#u\u0004W>a0yi\u0005$oS4?LϬkwsml\u0011P2\u001a\r\u00027\u0015\u001d,?0V\u0006g7QL֏\u001eNSI\b\u001d<7#\\,j\u000e;Gb}\u001e\u0010)~\rܪʘ\u00177JvAٳ>\u0003wםZn"}, d2 = {"0h].e@,S\u0015\fxa", "", "", "D`[BX", "4q^:<5=S,", "Bn8;W,Q", "1n\\:b5\u001c]$\u0013^g;\u0007", "", "\u001anZ6bu,S\u001b\u0007zg;|\b\fy\u000f(iO\u000e\u001b IE", "=eU@X;", "B`a4X;", "", "B`a4X;(T\u001a\rzm", "0xc266N\\(", "1n\\:b5\u001e_)z\u0002l", "", "=sW2e", "", "1n\\:b5 S(l~s,", "1n\\:b5!O'\u0002Xh+|", "1n\\:b5\"\\(~\bg(\u0004j/t", "", ">nb", "1n\\:b5+O\"\u0001z>8\r\u00056s", "=sW2e\u0016?T'~\n", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "1n\\:b5,c\u0016\r\nk0\u0006\u000b", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1n\\:b5-]u\u0013\n^\b\n\u0016+y", "1n\\:b50`\u001d\u000ez", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "4na\u0012T*AA\u0019\u0001\u0003^5\f", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c.", "AdV:X5M", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final void commonCopyInto(C1458SegmentedByteString c1458SegmentedByteString, int i2, byte[] target, int i3, int i4) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j2 = i4;
        okio.SegmentedByteString.checkOffsetAndCount(c1458SegmentedByteString.size(), i2, j2);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i3, j2);
        int i5 = i4 + i2;
        int iSegment = segment(c1458SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i7 = c1458SegmentedByteString.getDirectory$okio()[iSegment] - i6;
            int i8 = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            int i9 = i8 + (i2 - i6);
            ArraysKt.copyInto(c1458SegmentedByteString.getSegments$okio()[iSegment], target, i3, i9, i9 + iMin);
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C1458SegmentedByteString c1458SegmentedByteString, Object obj) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        if (obj == c1458SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1458SegmentedByteString.size() && c1458SegmentedByteString.rangeEquals(0, byteString, 0, c1458SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C1458SegmentedByteString c1458SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        return c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C1458SegmentedByteString c1458SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        int hashCode$okio = c1458SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c1458SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = c1458SegmentedByteString.getDirectory$okio()[length + i2];
            int i6 = c1458SegmentedByteString.getDirectory$okio()[i2];
            byte[] bArr = c1458SegmentedByteString.getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        c1458SegmentedByteString.setHashCode$okio(i3);
        return i3;
    }

    public static final byte commonInternalGet(C1458SegmentedByteString c1458SegmentedByteString, int i2) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length - 1], i2, 1L);
        int iSegment = segment(c1458SegmentedByteString, i2);
        return c1458SegmentedByteString.getSegments$okio()[iSegment][(i2 - (iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C1458SegmentedByteString c1458SegmentedByteString, int i2, ByteString other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c1458SegmentedByteString.size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iSegment = segment(c1458SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i7 = c1458SegmentedByteString.getDirectory$okio()[iSegment] - i6;
            int i8 = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!other.rangeEquals(i3, c1458SegmentedByteString.getSegments$okio()[iSegment], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(C1458SegmentedByteString c1458SegmentedByteString, int i2, byte[] other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c1458SegmentedByteString.size() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iSegment = segment(c1458SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i7 = c1458SegmentedByteString.getDirectory$okio()[iSegment] - i6;
            int i8 = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!okio.SegmentedByteString.arrayRangeEquals(c1458SegmentedByteString.getSegments$okio()[iSegment], i8 + (i2 - i6), other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C1458SegmentedByteString c1458SegmentedByteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        C1458SegmentedByteString c1458SegmentedByteString2 = c1458SegmentedByteString;
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c1458SegmentedByteString2, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c1458SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c1458SegmentedByteString.size() + ')').toString());
        }
        int i4 = iResolveDefaultParameter - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i2).toString());
        }
        if (i2 == 0 && iResolveDefaultParameter == c1458SegmentedByteString.size()) {
            return c1458SegmentedByteString2;
        }
        if (i2 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c1458SegmentedByteString, i2);
        int iSegment2 = segment(c1458SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c1458SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (iSegment <= iSegment2) {
            int i5 = iSegment;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(c1458SegmentedByteString.getDirectory$okio()[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + i5];
                if (i5 == iSegment2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iSegment != 0 ? c1458SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (i2 - i8);
        return new C1458SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C1458SegmentedByteString c1458SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1458SegmentedByteString.size()];
        int length = c1458SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = c1458SegmentedByteString.getDirectory$okio()[length + i2];
            int i6 = c1458SegmentedByteString.getDirectory$okio()[i2];
            int i7 = i6 - i3;
            ArraysKt.copyInto(c1458SegmentedByteString.getSegments$okio()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public static final void commonWrite(C1458SegmentedByteString c1458SegmentedByteString, Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i4 = i2 + i3;
        int iSegment = segment(c1458SegmentedByteString, i2);
        while (i2 < i4) {
            int i5 = iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i6 = c1458SegmentedByteString.getDirectory$okio()[iSegment] - i5;
            int i7 = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            Segment segment = new Segment(c1458SegmentedByteString.getSegments$okio()[iSegment], i8, i8 + iMin, true, false);
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

    private static final void forEachSegment(C1458SegmentedByteString c1458SegmentedByteString, int i2, int i3, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c1458SegmentedByteString, i2);
        while (i2 < i3) {
            int i4 = iSegment == 0 ? 0 : c1458SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i5 = c1458SegmentedByteString.getDirectory$okio()[iSegment] - i4;
            int i6 = c1458SegmentedByteString.getDirectory$okio()[c1458SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i3, i5 + i4) - i2;
            function3.invoke(c1458SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i6 + (i2 - i4)), Integer.valueOf(iMin));
            i2 += iMin;
            iSegment++;
        }
    }

    public static final void forEachSegment(C1458SegmentedByteString c1458SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c1458SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = c1458SegmentedByteString.getDirectory$okio()[length + i2];
            int i5 = c1458SegmentedByteString.getDirectory$okio()[i2];
            action.invoke(c1458SegmentedByteString.getSegments$okio()[i2], Integer.valueOf(i4), Integer.valueOf(i5 - i3));
            i2++;
            i3 = i5;
        }
    }

    public static final int segment(C1458SegmentedByteString c1458SegmentedByteString, int i2) {
        Intrinsics.checkNotNullParameter(c1458SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c1458SegmentedByteString.getDirectory$okio(), i2 + 1, 0, c1458SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }
}
