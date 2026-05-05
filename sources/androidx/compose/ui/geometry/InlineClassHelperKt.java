package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,p\bDJi|\u0004O\u00068é6B\r+4ߚ\u007f\u0007|jA0RqP.XTB7y\u0003L$\n,\"GI^2}P\u0013\u007fXur\u0007Pj\rS\u000f4#'vrհ[ޏ]\u0018\u00176HģW3[nUGn\u0003N\u0005N:R<\b\u0014\u0019\u001aXUV͌\u001bOYÈ*0no\u0011Ħ_̂\t\u001a\u001aß^,\u000f\u001etg|5\u001fǎ0Ơ3#\u000b݃bZ5`H|{\f\u001d×y˼za&Ѩ`CC\u0017=S1\u0006)º\u0012ƄCqEݛ\t35.as\u00065/ÝfƦ/O\u0015ƞ\u00132j\ti`:&\u0002Փ6ׂT\u000e0»\u001b\b\u001bA\u001c\u000e4&\u001f͔\u007fբj\b\u0016ޗ\u0015~aFh\u0002\rAVЮ4ي\u001b%\bđڨ=+"}, d2 = {"\u0012tP990Ka(gvG", "", "\u0012tP993HO(b\u0004_0\u0006\r>y\\$\n@", "\u0012tP993HO(l~`5Y\r>", "\u0012tP9H5LW\u001b\bz]\r\u0004\u0013+tg$\nF", "\u0014k^.g\u0010GT\u001d\b~m@Y\u0005=e", "#h]A)z!W\u001b\u0002H+", "#h]A)z%]+LG", "#mb=X*BT\u001d~yI(z\u000f/d`/\u0006<\u0010%", "1gT0^\u0017KS\u0017\t\u0004]0\f\r9n", "", "D`[BX", "", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "Bga<j\u0010EZ\u0019\u0001ve\u001a\f\u0005>e_;y@\f&\u001bQx", ";db@T.>", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InlineClassHelperKt {
    public static final long DualFirstNaN = 9187343246269874177L;
    public static final long DualFloatInfinityBase = 9187343241974906880L;
    public static final long DualFloatSignBit = -9223372034707292160L;
    public static final long DualUnsignedFloatMask = 9223372034707292159L;
    public static final long FloatInfinityBase = 2139095040;
    public static final long Uint64High32 = -9223372034707292160L;
    public static final long Uint64Low32 = 4294967297L;
    public static final long UnspecifiedPackedFloats = 9205357640488583168L;

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z2, Function0<String> function0) {
        if (z2) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }
}
