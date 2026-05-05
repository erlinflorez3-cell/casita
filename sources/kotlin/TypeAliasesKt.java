package kotlin;

import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UڎE9vt>ӌ(288\u0002ڎ\t\u001a@H\u0018͌\u0003Ca\f\u001aؓh\t@W\u001b˟%\u001a@\u0005n /\u001d\u001dqT6Xrc;?%\tohPOw6\u0002[\u0010fTU\u0011'aL/\u0001A;\u00155Y\t\bb]E\teve\u001dn,51is\u0006=\t\u007fB\u001ckY\u0013]\u0003,b\u0006ab\u0012-QT\fuV\u00136\u007f\u0013}\u0013ɝ\u0012\u0017&-X0=\u001a-\u0011<=%xcB`\u0002%K.\u0005\"@\u001d%\u001091:+hWga\u001evO\u0002\n\u001b)C\u0001\u001d-\fT<lU%Zwa7WAMJT\u0010\u007f?\u0016\u001cvg\u00107$0u\u000e_{?<W/=[I)'l\u0012JJm\u001d\n\t\u0001Yn`W`\"\u001d&g*7\u001c\u001bNj\u0005{VZY<\u0013S\"z\f& \u0019%j\t\\!S\"~O\u0017{+Wc\n55l8ipq\u0014}>\u0007K;Vq#\u0002R%(o<\u0011\u0019\u0019pHS\u001c`b)24Np6|$\\T\u0011!G_qJJ\\1GrUR\t\u001eRG\u0003\no\\n\u0016%Y[<\tn2\f)\u0001~t!o\u0016\u0011\n6\u0003`23GRE\u001b,[Hm\\\u0015)\f\r\r G\u0016fwL\u001b06_\u0002 & ?R??\u0019\u0015%.Z\u001a3JZ\u000e\u0006Q{.Wz+\u0016OEn.w\u000epq<bpPuY?:|c\u0001@(d.\u0018\u0012F)e$^\u0011[NOx\u0004i>T>#\nG6+\u0006}A\u001d5[cW\u001dD\u0018T9\u001bamou/\nd\u0015,\u001bjצ0\u0005"}, d2 = {"\u000fqXA[4>b\u001d|Zq*|\u0014>i\n1", "\u001aiPCTuEO\"\u0001D:9\u0001\u00182m\u007f7\u007f>`*\u0015Gz\u001d@\u0001.\u000b", "\u001aj^A_0G\u001d\u0007\u0003\u0004\\,b\u0013>l\u00041Q", "Dda@\\6G", "~-\"", "\u000frb2e;B]\"^\bk6\n", "\u001aiPCTuEO\"\u0001D::\u000b\t<t\u00042\u0005 \u000e$!TE", "~- ", "\u0011kP@f\n:a(^\u000e\\,\b\u00183o\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=C{6\u000b \u0014\u0015\u0017R~\u0012F\u007fz", "\u0011n\\=T9:b#\f", "\"", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u0011n]0h9KS\"\u000ebh+\u0001\n3c{7\u007fJ\nv*Eo\u0019Kz/>", "\u001aiPCTuNb\u001d\u0006D<6\u0006\u0007?r\r(\u0005Oh!\u0016Kp\u0012:r49c\u0007\u007fJk\u00169\\GEt\n", "\u0013qa<e", "\u001aiPCTuEO\"\u0001D>9\n\u0013<;", "\u0013wR2c;B]\"", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u0017k[2Z(E/&\u0001\u000bf,\u0006\u0018\u000fx}(\u0007O\u0005! ", "\u001aiPCTuEO\"\u0001DB3\u0004\t1a\u0007\u0004\tB\u0011\u001f\u0017P~mOt%@h\u0002*@C", "\u0017k[2Z(EA(z\n^\f\u0010\u0007/p\u000f,\u0006I", "\u001aiPCTuEO\"\u0001DB3\u0004\t1a\u0007\u0016\u000b<\u0010\u0017vZm\u000eG\u0006)?bS", "\u0017mS2k\u0016Nb\u0003\u007fWh<\u0006\b=E\u0013&{K\u0010\u001b!P", "\u001aiPCTuEO\"\u0001DB5{\tBO\u00107eA]!'Pn\u001c\u001c\n#5d\r$Avk", "\u001cnBBV/\u001eZ\u0019\u0007zg;\\\u001c-e\u000b7\u007fJ\n", "\u001aiPCTuNb\u001d\u0006DG6j\u0019-h_/{H\u0001 &'\u0003\f<\u000249c\u0007u", "\u001ct[9C6B\\(~\b>?z\t:t\u00042\u0005", "\u001aiPCTuEO\"\u0001DG<\u0004\u0010\u001ao\u00041\u000b@\u000ev*Eo\u0019Kz/>/", "\u001ct\\/X9\u001f]&\u0007vm\f\u0010\u0007/p\u000f,\u0006I", "\u001aiPCTuEO\"\u0001DG<\u0005\u0006/r`2\tH|&vZm\u000eG\u0006)?bS", " t]A\\4>3,|zi;\u0001\u00138", "\u001aiPCTuEO\"\u0001DK<\u0006\u00183m\u007f\b\u000f>\u0001\"&Ky\u0017\u0012", "#mbBc7H`(~yH7|\u0016+t\u00042\u0005 \u0014\u0015\u0017R~\u0012F\u007f", "\u001aiPCTuEO\"\u0001DN5\u000b\u0019:p\n5\u000b@\u007f\u0001\"G|\nKz/>9\u0011\u001e7x%2WL\u0011", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TypeAliasesKt {
    public static /* synthetic */ void ArithmeticException$annotations() {
    }

    public static /* synthetic */ void AssertionError$annotations() {
    }

    public static /* synthetic */ void ClassCastException$annotations() {
    }

    public static /* synthetic */ void Comparator$annotations() {
    }

    public static /* synthetic */ void ConcurrentModificationException$annotations() {
    }

    public static /* synthetic */ void Error$annotations() {
    }

    public static /* synthetic */ void Exception$annotations() {
    }

    public static /* synthetic */ void IllegalArgumentException$annotations() {
    }

    public static /* synthetic */ void IllegalStateException$annotations() {
    }

    public static /* synthetic */ void IndexOutOfBoundsException$annotations() {
    }

    public static /* synthetic */ void NoSuchElementException$annotations() {
    }

    public static /* synthetic */ void NullPointerException$annotations() {
    }

    public static /* synthetic */ void NumberFormatException$annotations() {
    }

    public static /* synthetic */ void RuntimeException$annotations() {
    }

    public static /* synthetic */ void UnsupportedOperationException$annotations() {
    }
}
