package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000e6B\r)4\u0012}\u000bnjG<LeV9ZS0\u0011\u0004\rBřs$ BkY(}:\t}O˗knX\\#\\\u001dإ.x\u0019+yY\u0007`*\u000f`C CAQ\b=gaҽ:\u0005.7:N\b\u000b\u0019\u001aXO@z\tFc\f@1ptHV%M3\u001bX\u0006VB\u000f&tg|5pl\f9_'\u0011rZNU``\u0001[\u0017^TU\u000eɱ`ӜҋD9; 3_\u001b!`hW\u0003m\u007fe\u0005\u00176W/W\u0004o6\u0007~ѥ\u0014ۀ̠\u0011_x7j\u0017Ĭ`\u0011/.Uӌg~\r߳{\u000e"}, d2 = {"\"dgAE(GU\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "7mS2k", "", "uH\u0018\u0017", "AsP?g", "3mS", "uH8u=", ">`R8J0MVv\u0002z\\2", "", "1nT?V,\"\\", ";h]6`<FD\u0015\u0006\u000b^", ";`g6`<FD\u0015\u0006\u000b^", "1nT?V,\"\\`Q{_1MS\u001b", "uI8\u0016\u001c\u0011", "AtQ@g9B\\\u001b", "", "", "@`]4X", "AtQ@g9B\\\u001bF[=9\u0004\b\u0011o", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dTQ#{!FUG'3v\u0018w;RHo= j", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextRangeKt {
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m6130substringFDrldGo(CharSequence charSequence, long j2) {
        return charSequence.subSequence(TextRange.m6121getMinimpl(j2), TextRange.m6120getMaximpl(j2)).toString();
    }

    public static final long TextRange(int i2, int i3) {
        return TextRange.m6112constructorimpl(packWithCheck(i2, i3));
    }

    public static final long TextRange(int i2) {
        return TextRange(i2, i2);
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m6129coerceIn8ffj60Q(long j2, int i2, int i3) {
        int iCoerceIn = RangesKt.coerceIn(TextRange.m6123getStartimpl(j2), i2, i3);
        int iCoerceIn2 = RangesKt.coerceIn(TextRange.m6118getEndimpl(j2), i2, i3);
        if (iCoerceIn == TextRange.m6123getStartimpl(j2) && iCoerceIn2 == TextRange.m6118getEndimpl(j2)) {
            return j2;
        }
        return TextRange(iCoerceIn, iCoerceIn2);
    }

    private static final long packWithCheck(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ", end: " + i3 + AbstractJsonLexerKt.END_LIST).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i2 + ", end: " + i3 + AbstractJsonLexerKt.END_LIST).toString());
        }
        return ((-1) - (((-1) - ((long) i3)) | ((-1) - 4294967295L))) | (((long) i2) << 32);
    }
}
