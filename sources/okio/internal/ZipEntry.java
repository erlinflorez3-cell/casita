package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4ߚ\u007f\u0007tvAӄLeV5ZS0\u0010s{B*c$wNCU(\u001d*\tUnm˧\u0005Ϻ\u000b\u000bq\u000eFȍwz0WU\u0011]@\u0010BHu?AO\b=gc\u0005<\u000b @&Py3\u0006*0N\u0010\u0005\u0001[K:\u0019@Fv:`\u0015e\u0005H\u0019\u0016D&\u0001,e\u007fNdO|c@/1\r\u0002B|2o6\u0003M\u001bRl';}q$1@EB-%\u0002\u000e\u0017Xa?\u0011M\n=3s7/1I\u0002fNZ\u0016\u0013C2_\u0015cr4l\u001dSv\u000bU2_kQP\u001c9\u0010|\u0012\fj\u000b\u001e\u000e-H<?2h\u001e\ra\u007f\u0003[FP\u0010qZ\u0002\u0011`d\"5\b9+G/~Sw:GYѼ\u007f\u0005\u001b3k,|YsT<֫E!b\ni3g?kS~\u0010gP\u0006\u0006\u0007a0546U\u0014G}'-E0}كޠ'#q;V~8\u0006\u0013`\u0001S\u0018S͕D(vݫO,\u000f\"h[5\u001ayhl^<\u0013]\u001c\u0003\b,!˙$b\u007f˓9'\u0016h]\u0004:y[a\"%]kƠ]tsލo;dOCn4\u001foZ\u000f\u0014mCИ\t^n̻k\u000e`z6A\u0003Wx\u001a\u0010{rYܟ\u00178Gڤ462Q'}eW\u0011$ZA+\u0010ރ^n\u0018зl5*%wCE\u001d\u000fstr\u0006f'Pb;7ö/ۮU91([FvYM2\u0015\f\f\u007fur֙KRtֵ\u000eW\u0002F$;\n`=K+\u000f-4ɨ\u00063Mɣ\u000bgWt HK\u0010\b#SjDf6uҔ0hrJ]~/$|\u0007\u0001LXw\u000e\ryH\u0011F\u0012_ߏ_FQr\u0011\u0004TP>(\u0013Hn8\u000f\u0002:~K,q2ޗ\u001a\u007f\u001c/#\fukuZ\b\f_5\u0003g\u001c,\u0012\u0019̔fWeЦS:O[\rkr8z1ZJ\u0001v6I?rcΊJыhtn:S:=#7\u001b:=\tXq9Av4r\u0005ɿ,ϵG\u0002,`IV\u001fr$z{~c^!I=\u0011ν\u007f9v\u0012*p8X]\u0015\u0017UV\u0007&FY=x\u0004j\u0010Ӻ84D\b\u0019vlk\fD\t%\u0017r\u001d&JD\n:\u0005\u0015֭|d^H\u0013\u0014]b'_\u000f$_B,\u0005M13tܑX5kѢ\u0019U#?)\n \u000et.CD\u0003@Ь,^\tՊ]_I\u0001\u0010U\u008cKd"}, d2 = {"\u001anZ6buB\\(~\bg(\u0004R$i\u000b\b\u0005O\u000e+l", "", "1`]<a0<O ivm/", "\u001anZ6bu)O(\u0002P", "7r36e,<b#\f\u000f", "", "1n\\:X5M", "", "1qR", "", "1n\\=e,La\u0019}hbA|", "Ahi2", "1n\\=e,La\u001d\t\u0004F,\f\f9d", "", "=eU@X;", "2nb\u0019T:M;#}~_0|\b\u000bt^$\u000b@", "2nb\u0019T:M;#}~_0|\b\u000btn,\u0004@", "<sU@?(Lb\u0001\tyb-\u0001\t.A\u000f\t\u007fG\u0001&\u001bOo", "<sU@?(Lbt|x^:\u000b\t.A\u000f\t\u007fG\u0001&\u001bOo", "<sU@69>O(~y:;]\r6e\u000f,\u0004@", "3wc2a+>R\u007fz\tm\u0014\u0007\b3f\u0004(z\u001c\u0010\u0005\u0017Ey\u0017;\u0005", "3wc2a+>R\u007fz\tm\bz\u0007/s\u000e(z\u001c\u0010\u0005\u0017Ey\u0017;\u0005", "3wc2a+>Rv\fzZ;|\b\u000btm(yJ\n\u0016%", "uK^8\\6\b>\u0015\u000e}4!c\u000e+v{q\u0003<\n\u0019`5~\u001b@\u007f'\u000b>b\u0005\u001bRy\u00124H7|0g\u001cdj;PJ6Wx|.QJ=X\u001cy9\u001d\u0014$tX4\u000fZ@F \u007f@\u0001&\u00045KK\"r\n\u000ekt:f\u0002> \u0017C\u0003\u0017?%2wF[_\u0007\u001d(J^;`Uf\u0019e<\u0004\b\u001d\u0001\u0019\u001dh]\u0004p\u0001O\"n\u001c\u0001cpIb^A3>o[S\u001b3F", "5dc\u0010T5H\\\u001d|ve\u0017x\u00182", "u(;<^0H\u001d\u0004z\na\u0002", "1gX9W9>\\", "", "5dc\u0010[0ER&~\u0004", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010b4FS\"\u000e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b4I`\u0019\r\t^+j\rDe", "u(9", "5dc\u0010b4I`\u0019\r\tb6\u0006p/t\u00032z", "u(8", "5dc\u0010e*", "1qT.g,=/(f~e3\u0001\u0017", "5dc\u0010e,:b\u0019}Vm\u0014\u0001\u00106i\u000ef\u0006F\u0005!", "u(;7T=:\u001d z\u0004`uc\u00138gU", "5dc\u0011b:%O'\u000ebh+\u0001\n3e~\u0004\u000b\u001f|&\u0017", "5dc\u0011b:%O'\u000ebh+\u0001\n3e~\u0004\u000b/\u0005\u001f\u0017", "5dc\u0012k;>\\\u0018~y<9|\u0005>e~\u0004\u000b.\u0001\u0015!Pn\u001c", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012k;>\\\u0018~yE(\u000b\u0018\u000bc}(\nN\u0001\u0016rV]\u000e:\u0001.4g", "5dc\u0012k;>\\\u0018~yE(\u000b\u0018\u0017o~,|D\u0001\u0016rV]\u000e:\u0001.4g", "u(I", ":`bA4*<S'\rz]\b\fp3l\u0007,\n", "5dc\u0019T:M/\u0017|zl:|\b\u000btg,\u0003G\u0005%UQu\u0012F", ":`bA@6=W\u001a\u0003z]\b\fp3l\u0007,\n", "5dc\u0019T:M;#}~_0|\b\u000btg,\u0003G\u0005%UQu\u0012F", "5dc\u001bg-L1&~vm,{d>F\u0004/{O\u0005\u001f\u0017", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u001bg-L:\u0015\r\n:*z\t=s\u007f'WOa\u001b\u001eG~\u0012Dv", "5dc\u001bg-L:\u0015\r\nF6{\r0i\u007f'WOa\u001b\u001eG~\u0012Dv", "5dc\u001cY-LS(", "5dc \\A>", "1n_F", "1n_F\u00176DW#", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#*@gE\u001a^o]B\t-\u0010W\u0006'IL[\u0002 9|C\u0018\u001c$\u0012W:\r\u0012b=+89;*g5X\u000fO>", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ZipEntry {
    private final Path canonicalPath;
    private final List<Path> children;
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;
    private final Integer extendedCreatedAtSeconds;
    private final Integer extendedLastAccessedAtSeconds;
    private final Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;
    private final Long ntfsCreatedAtFiletime;
    private final Long ntfsLastAccessedAtFiletime;
    private final Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(Path canonicalPath, boolean z2, String comment, long j2, long j3, long j4, int i2, long j5, int i3, int i4, Long l2, Long l3, Long l4, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z2;
        this.comment = comment;
        this.crc = j2;
        this.compressedSize = j3;
        this.size = j4;
        this.compressionMethod = i2;
        this.offset = j5;
        this.dosLastModifiedAtDate = i3;
        this.dosLastModifiedAtTime = i4;
        this.ntfsLastModifiedAtFiletime = l2;
        this.ntfsLastAccessedAtFiletime = l3;
        this.ntfsCreatedAtFiletime = l4;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    public /* synthetic */ ZipEntry(Path path, boolean z2, String str, long j2, long j3, long j4, int i2, long j5, int i3, int i4, Long l2, Long l3, Long l4, Integer num, Integer num2, Integer num3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i5 + 2) - (i5 | 2) != 0 ? false : z2, (i5 + 4) - (i5 | 4) != 0 ? "" : str, (i5 + 8) - (i5 | 8) != 0 ? -1L : j2, (i5 + 16) - (i5 | 16) != 0 ? -1L : j3, (i5 & 32) != 0 ? -1L : j4, (i5 & 64) != 0 ? -1 : i2, (i5 + 128) - (i5 | 128) == 0 ? j5 : -1L, (i5 & 256) != 0 ? -1 : i3, (i5 + 512) - (i5 | 512) == 0 ? i4 : -1, (-1) - (((-1) - i5) | ((-1) - 1024)) != 0 ? null : l2, (-1) - (((-1) - i5) | ((-1) - 2048)) != 0 ? null : l3, (i5 + 4096) - (i5 | 4096) != 0 ? null : l4, (i5 + 8192) - (i5 | 8192) != 0 ? null : num, (i5 & 16384) != 0 ? null : num2, (-1) - (((-1) - i5) | ((-1) - 32768)) != 0 ? null : num3);
    }

    public final ZipEntry copy$okio(Integer num, Integer num2, Integer num3) {
        return new ZipEntry(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, num, num2, num3);
    }

    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<Path> getChildren() {
        return this.children;
    }

    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final Long getCreatedAtMillis$okio() {
        Long l2 = this.ntfsCreatedAtFiletime;
        if (l2 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l2.longValue()));
        }
        Integer num = this.extendedCreatedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final int getDosLastModifiedAtDate() {
        return this.dosLastModifiedAtDate;
    }

    public final int getDosLastModifiedAtTime() {
        return this.dosLastModifiedAtTime;
    }

    public final Integer getExtendedCreatedAtSeconds() {
        return this.extendedCreatedAtSeconds;
    }

    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.extendedLastAccessedAtSeconds;
    }

    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.extendedLastModifiedAtSeconds;
    }

    public final Long getLastAccessedAtMillis$okio() {
        Long l2 = this.ntfsLastAccessedAtFiletime;
        if (l2 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l2.longValue()));
        }
        Integer num = this.extendedLastAccessedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long getLastModifiedAtMillis$okio() {
        Long l2 = this.ntfsLastModifiedAtFiletime;
        if (l2 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l2.longValue()));
        }
        Integer num = this.extendedLastModifiedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i2 = this.dosLastModifiedAtTime;
        if (i2 != -1) {
            return ZipFilesKt.dosDateTimeToEpochMillis(this.dosLastModifiedAtDate, i2);
        }
        return null;
    }

    public final Long getNtfsCreatedAtFiletime() {
        return this.ntfsCreatedAtFiletime;
    }

    public final Long getNtfsLastAccessedAtFiletime() {
        return this.ntfsLastAccessedAtFiletime;
    }

    public final Long getNtfsLastModifiedAtFiletime() {
        return this.ntfsLastModifiedAtFiletime;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }
}
