package kotlin.math;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.comparisons.UComparisonsKt;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!4i\bDJe|\u0004W\u00068\u000b4F\u0017@:ߚ\u0010\u0007\u0015ii4Re`.\u0001RZ\u0013y|L$\n#8ٙAڈ\u001e\u007f(\u000b]Q\u007f\u0006|Ϻr\u000bq\u00136\u001a\u0007jDI\u0004|\u000e\u0016\u001d3Zom7\u0014ږC˃dv<\n.8:V\b\f\u0019\u001aXG@z\tCc\f@/ptHS%M3\u0019XçDŋ\u0005 bo\\9`\u000bkAG#1mrR5_H|{\u0011vX5\u000e\u000faL/\u0007˂;չ)U\t\u0010`aϓ\u0007I"}, d2 = {";`g", "\u001aj^A_0G\u001d\tb\u0004m\u0002", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";`gy=w&3d[j", "uH8u<", "\u001aj^A_0G\u001d\te\u0005g.R", ";`gyX)\f2{^^", "uI9u=", ";h]", ";h]y=w&3d[j", ";h]yX)\f2{^^", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UMathKt {
    /* JADX INFO: renamed from: max-J1ME1BU, reason: not valid java name */
    private static final int m10190maxJ1ME1BU(int i2, int i3) {
        return UComparisonsKt.m10162maxOfJ1ME1BU(i2, i3);
    }

    /* JADX INFO: renamed from: max-eb3DHEI, reason: not valid java name */
    private static final long m10191maxeb3DHEI(long j2, long j3) {
        return UComparisonsKt.m10170maxOfeb3DHEI(j2, j3);
    }

    /* JADX INFO: renamed from: min-J1ME1BU, reason: not valid java name */
    private static final int m10192minJ1ME1BU(int i2, int i3) {
        return UComparisonsKt.m10174minOfJ1ME1BU(i2, i3);
    }

    /* JADX INFO: renamed from: min-eb3DHEI, reason: not valid java name */
    private static final long m10193mineb3DHEI(long j2, long j3) {
        return UComparisonsKt.m10182minOfeb3DHEI(j2, j3);
    }
}
