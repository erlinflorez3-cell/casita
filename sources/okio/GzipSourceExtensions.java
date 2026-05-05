package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
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
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,o\bDJe|\u0004O\t8\u000b4D\u0007\":\u001b\u007f\u0007ljA0ZeP.hS2ş\u0004\u000fB,s$ LcUH|R\r]X\u007fg\u001dI!ŒI'\u0011$\u0004\u0003,wa!]@\u001cxԖu_?[ڎU9\u000fs\rӏrݨ&8\u0002ڎ!&8H(v)B\"ËdضDpBĥ-Y\u0013\u001b*\u0006l\u001fWȩ/ʄR6PǍ}F=%\u001bipM}ۂ\u0003ƊQ\rNÖG\u0019\u0005d6+n;\fՙw٨\u0007\u0007Z¹_\u000fMvU\u0005\u0017+}ǥ\u001cָ[6`Ü4!9U%]!*3ӧ$ԃ\u0010'3Ւ\u0004W^\u0015@w)\u007fcɠV؝\n'P͓Ǐ\u001et"}, d2 = {"\u0014B>\u001a@\f'B", "", "\u0014DG!E\b", "\u0014G2\u001f6", "\u0014M0\u001a8", "!D2!<\u0016'MuhYR", "", "!D2!<\u0016'Mwhc>", "!D2!<\u0016'M{^V=\fi", "!D2!<\u0016'M\bkVB\u0013\\u", "5dc\u000f\\;", "", "0hc", "5yX=", "\u001anZ6bu h\u001d\nhh<\n\u0007/;", "\u001anZ6bu,])\fx^\u0002", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i2, int i3) {
        return ((i2 >> i3) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new GzipSource(source);
    }
}
