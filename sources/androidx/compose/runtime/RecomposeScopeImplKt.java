package androidx.compose.runtime;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDJh|\u0004Oي8\u000b4F\u00170:\u001d\u0010\u0007\u0015ii4Rq`.\u0001Rp\u000e\f\bBřs$ B\u0012٨lԥ&\tWȞ\bs|Jr\u000bq\u000e\\ǠK̶0I]ތ}\u001e\u001d3Zom2$ڑ\u0010˃dt>ӌ@>0:\u0012\u0005/\u0019\u0001Ͻbͯ~CSÈ2<NsRR;L[܈dĂB \tȦ|s\\:`l\f9\u0006ݍUݦFN/ڿP\t[\u0012^TU\fMѰpҋD7=ՖE_\u0011\rj[m\n\u0016п?ݾl'/Ǣi\u007fe>p\u007fB\u0014\u0002̀_ǁv&dӤql\u001a0CO\u0012J'ʮzÞ~{\u0015ɝ$\u001a\u00141`.[\u0019=ڟ`\u07baxr[óй\u0006k"}, d2 = {"\u0012dU.h3Ma|\bh\\6\b\t\u0010l{*", "", "\u0012dU.h3Ma|\b\fZ3\u0001\b\u0010l{*", "\u0014na0X++S\u0017\t\u0003i6\u000b\t\u0010l{*", " d`B\\9>a\u0006~xh4\b\u0013=e`/wB", " da2T+B\\\u001b_\u0002Z.", "!jX=c,=4 z|", "#rT193:U", "1`[9U(<Y\u007f\txd", "", "1gP;Z,=6\u001d\u0001};0\fp+s\u0006", "1gP;Z,=:#\u0011Wb;d\u0005=k", "1gP;Z,=;\u0015\r\u0001", "CoS.g,\u001cV\u0015\b|^+]\u0010+g\u000e", "4kP4f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int ForcedRecomposeFlag = 64;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final Object callbackLock = new Object();
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i2) {
        int i3 = changedLowBitMask & i2;
        int i4 = (-1) - (((-1) - changedHighBitMask) | ((-1) - i2));
        int i5 = i4 >> 1;
        int i6 = (i2 & changedMask) | ((i5 + i3) - (i5 & i3));
        int i7 = (i3 << 1) & i4;
        return (i6 + i7) - (i6 & i7);
    }
}
