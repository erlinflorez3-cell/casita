package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
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
/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000f6B\r'4\u0012}\bnjO0LeN9jn8ş\u0004{b#\f(\u007fCSUH~R\r]P\u007fg\u001dK!\u0010ß\u0013\u0006${\u0003TWY\u0011]@\u000ebF}DKM\u001e<id\u0003<\u001d `!h}\u0013\b2*v\u0018=\u007fǈJÈܘ4BvC`\u0017e\"(\u001d\u001e>N\rF\\\u0016ZfLzjR/Q\u00020ıNф^ܞƊQ\u000fLb5\u001c\u000f~,6X7c!MS1\u0006\u0003_M\u0010Wqk\u0011/ѯ'ɛH֕ɱ:Z\u0006$#:g*k\u0004>\\3]\t\fU7\u007fgY]&(&yBȦ<ɂ\rͺόL03,t\u0017&P\u0003\u0004k@~\u000e\u0007B.y\u0012:%2\u00183YEaƠQƞ:ϊ\u05ee;}\u000b ,2\u0019\u0003/ol\u000e\u000f\u0014CT&]wVή<ʰݳ\u000e[C\u0003\u0012\u0007z\u00178\u001bHG.;$\u0011\\\u0016kڣa߶\"ܩȠ\u0006JJ\u007f\u0005\u001b\u009ehXqUNع>\u001d\u0015֜.\""}, d2 = {"\u0017mc\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "F", "", "G", "uH8u=", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "", ":da= ~\nH\u0006\u0012gh", "uI9\u0013\u001c\u0011", ";h]Bf", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=eU@X;", ";h]Bfs'd`\u000e]i*", "uI9u=", ";h]BfsH1 Onp\f", ">kd@", ">kd@ \u0015O\u001b(a\u0006\\", ">kd@ 6\u001cZir\r>", "@nd;W", "@nd;WsD\u001bg\u0006f)\u0014", "uI\u0018\u0017", "Bn>3Y:>b", "Bn>3Y:>b`F|r@pe=", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntOffsetKt {
    public static final long IntOffset(int i2, int i3) {
        long j2 = ((long) i2) << 32;
        long j3 = i3;
        long j4 = (j3 + 4294967295L) - (j3 | 4294967295L);
        return IntOffset.m6760constructorimpl((j4 + j2) - (j4 & j2));
    }

    /* JADX INFO: renamed from: lerp-81ZRxRo */
    public static final long m6777lerp81ZRxRo(long j2, long j3, float f2) {
        long jLerp = ((long) MathHelpersKt.lerp(IntOffset.m6766getXimpl(j2), IntOffset.m6766getXimpl(j3), f2)) << 32;
        long jLerp2 = MathHelpersKt.lerp(IntOffset.m6767getYimpl(j2), IntOffset.m6767getYimpl(j3), f2);
        return IntOffset.m6760constructorimpl((-1) - (((-1) - jLerp) & ((-1) - ((jLerp2 + 4294967295L) - (jLerp2 | 4294967295L)))));
    }

    /* JADX INFO: renamed from: toOffset--gyyYBs */
    public static final long m6783toOffsetgyyYBs(long j2) {
        return OffsetKt.Offset(IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
    }

    /* JADX INFO: renamed from: plus-Nv-tHpc */
    public static final long m6780plusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m3937getXimpl(j2) + IntOffset.m6766getXimpl(j3), Offset.m3938getYimpl(j2) + IntOffset.m6767getYimpl(j3));
    }

    /* JADX INFO: renamed from: minus-Nv-tHpc */
    public static final long m6778minusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m3937getXimpl(j2) - IntOffset.m6766getXimpl(j3), Offset.m3938getYimpl(j2) - IntOffset.m6767getYimpl(j3));
    }

    /* JADX INFO: renamed from: plus-oCl6YwE */
    public static final long m6781plusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m6766getXimpl(j2) + Offset.m3937getXimpl(j3), IntOffset.m6767getYimpl(j2) + Offset.m3938getYimpl(j3));
    }

    /* JADX INFO: renamed from: minus-oCl6YwE */
    public static final long m6779minusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m6766getXimpl(j2) - Offset.m3937getXimpl(j3), IntOffset.m6767getYimpl(j2) - Offset.m3938getYimpl(j3));
    }

    /* JADX INFO: renamed from: round-k-4lQ0M */
    public static final long m6782roundk4lQ0M(long j2) {
        int iRound = Math.round(Offset.m3937getXimpl(j2));
        int iRound2 = Math.round(Offset.m3938getYimpl(j2));
        return IntOffset.m6760constructorimpl((((long) iRound2) & 4294967295L) | (((long) iRound) << 32));
    }
}
