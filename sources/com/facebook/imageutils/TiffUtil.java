package com.facebook.imageutils;

import com.facebook.common.logging.FLog;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007loA0ZeP.XS2\u000fy\u0005<$a'yCQU\"}(\tUɟg}ñzZ9BG\u0005,9o2IǤ|] \u000fzP}GKM\u001eAid\u0003?\u001d `&~~M\u001f(4`\u0010%~sO\u001a\u001dH@\u001fF\u0003\u0011[\u00122\u00124BP\u0005,j\u007fNdW3]\u0003U1\u0013\u0002B|+\u00104\u000bX%F\u00033=zo+C@e9E)a\u0011\u001fR\nN3C\u007fN\u001dhU+qI<mDj\u0018\u0014C/\u007f\u0011k}>\\3]\u0011\u001058gcyTT-@\u0019\n T\u0004<\nWL<82f6\u001acx\u0001`XP0br\u0004\tuN\u0017S\u0015y+\n+tRy?)N=|3\u000ftŃ\u0003ͼ%[\\ו1!)W\u0010Q_U\u0017ׇ\u001bݳ\u000eYEЧT|p\u0007B\u0004^KV\u0082N 2\u0017-ڛ,E1'\u0004\u0002vH>ϿW¾lSqɭ\u0019L0u.7X\rbɵ\u0017\u0081\tkXӹй0("}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011^\u0012=w\u0015D]\u0005u", "", "u(E", "\"@6", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\"H5\u0013R\t2BxxdK\u000b\\u)Bc\nu iu", "", "\"H5\u0013R\t2BxxdK\u000b\\u)Lc\u0017j'`\u0011v0N", "\"H5\u0013R\u001b\u001a5\u0013hgB\few\u000bTc\u0012d", "\"H5\u0013R\u001b2>xxhA\u0016iw", "5dc\u000eh;H@#\u000evm,X\u00121l\u007f\t\tJ\t\u0001$Ko\u0017Kr49c\u0007", "=qX2a;:b\u001d\t\u0004", "5dc\u001ce0>\\(z\nb6\u0006i<o\b\u0017\u007fA\u0002v V|\"", "Asa2T4", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", ":d]4g/", "7r;6g;ESx\byb(\u0006", "", ";ne2G6-W\u001a\u007fZg;\n\u001d!i\u000f+j<\u0003", "B`V!b\rB\\\u0018", "@dP1B9BS\"\u000evm0\u0007\u0012\u0010r\n0j$aw", "@dP1G0?T{~v],\n", "BhU3;,:R\u0019\f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011^\u0012=w\u0015D]\u0005^&q\u0017/0C7j4+j", "\"hU3;,:R\u0019\f", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TiffUtil {
    public static final TiffUtil INSTANCE = new TiffUtil();
    private static final Class<?> TAG = TiffUtil.class;
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005(4\u0012\u0006\u0010nj?2Je^\u008c\u0003SX\u000e,~Č([2q\u0014Sc\u001b\u0016\"7Q%ʻsĔNf\u0013¼'\b\u001c{x0iW~b \u0015\u0003Z}FKM\u001e?\u0010Ţ\u0001ȥ\t,:ĲP{\u000b\t(.h\u0012|\u0004QQ\\*>J\t:\u0001\u0018$į&Ū\nJ(ҵ6^mXDT\r_@<1\u0011ݬF]"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011^\u0012=w\u0015D]\u0005^&q\u0017/0C7j4+j", "", "u(E", "0xc2B9=S&", "", "5dc\u000fl;>=&}zk", "u(8", "Adc\u000fl;>=&}zk", "uH\u0018#", "4ha@g\u0010?R\u0003\u007f{l,\f", "5dc\u0013\\9Lb|\u007fyH-}\u0017/t", "Adc\u0013\\9Lb|\u007fyH-}\u0017/t", "7r;6g;ESx\byb(\u0006", "", "u(I", "Adc\u0019\\;MZ\u0019^\u0004]0x\u0012", "uY\u0018#", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class TiffHeader {
        private int byteOrder;
        private int firstIfdOffset;
        private boolean isLittleEndian;

        public final int getByteOrder() {
            return this.byteOrder;
        }

        public final int getFirstIfdOffset() {
            return this.firstIfdOffset;
        }

        public final boolean isLittleEndian() {
            return this.isLittleEndian;
        }

        public final void setByteOrder(int i2) {
            this.byteOrder = i2;
        }

        public final void setFirstIfdOffset(int i2) {
            this.firstIfdOffset = i2;
        }

        public final void setLittleEndian(boolean z2) {
            this.isLittleEndian = z2;
        }
    }

    private TiffUtil() {
    }

    @JvmStatic
    public static final int getAutoRotateAngleFromOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int getOrientationFromTiffEntry(InputStream inputStream, int i2, boolean z2) throws IOException {
        if (i2 >= 10 && StreamProcessor.readPackedInt(inputStream, 2, z2) == 3 && StreamProcessor.readPackedInt(inputStream, 4, z2) == 1) {
            return StreamProcessor.readPackedInt(inputStream, 2, z2);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int moveToTiffEntryWithTag(java.io.InputStream r7, int r8, boolean r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 14
            r5 = 0
            if (r8 >= r0) goto L6
            return r5
        L6:
            r4 = 2
            int r0 = com.facebook.imageutils.StreamProcessor.readPackedInt(r7, r4, r9)
            int r3 = r8 + (-2)
        Ld:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L27
            r0 = 12
            if (r3 < r0) goto L27
            int r1 = com.facebook.imageutils.StreamProcessor.readPackedInt(r7, r4, r9)
            int r0 = r3 + (-2)
            if (r1 != r10) goto L1e
            return r0
        L1e:
            r0 = 10
            r7.skip(r0)
            int r3 = r3 + (-12)
            r0 = r2
            goto Ld
        L27:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.TiffUtil.moveToTiffEntryWithTag(java.io.InputStream, int, boolean, int):int");
    }

    @JvmStatic
    public static final int readOrientationFromTIFF(InputStream stream, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        TiffHeader tiffHeader = new TiffHeader();
        TiffUtil tiffUtil = INSTANCE;
        int tiffHeader2 = tiffUtil.readTiffHeader(stream, i2, tiffHeader);
        int firstIfdOffset = tiffHeader.getFirstIfdOffset() - 8;
        if (tiffHeader2 == 0 || firstIfdOffset > tiffHeader2) {
            return 0;
        }
        stream.skip(firstIfdOffset);
        return tiffUtil.getOrientationFromTiffEntry(stream, tiffUtil.moveToTiffEntryWithTag(stream, tiffHeader2 - firstIfdOffset, tiffHeader.isLittleEndian(), 274), tiffHeader.isLittleEndian());
    }

    private final int readTiffHeader(InputStream inputStream, int i2, TiffHeader tiffHeader) throws IOException {
        if (i2 <= 8) {
            return 0;
        }
        tiffHeader.setByteOrder(StreamProcessor.readPackedInt(inputStream, 4, false));
        if (tiffHeader.getByteOrder() != 1229531648 && tiffHeader.getByteOrder() != 1296891946) {
            FLog.e(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.setLittleEndian(tiffHeader.getByteOrder() == 1229531648);
        tiffHeader.setFirstIfdOffset(StreamProcessor.readPackedInt(inputStream, 4, tiffHeader.isLittleEndian()));
        int i3 = i2 - 8;
        if (tiffHeader.getFirstIfdOffset() >= 8 && tiffHeader.getFirstIfdOffset() - 8 <= i3) {
            return i3;
        }
        FLog.e(TAG, "Invalid offset");
        return 0;
    }
}
