package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLc\u0003\u0011Iي8\u000b<H\u0007\"2\u0012\u007f\u0007tsA0R͜P.XS2\u000f\u0002{<$a*w)Q٥J}P\b\u007fTwi~J\tŏq\u000fN%\u0007kDI\u0004z\u000e\u0016\u001d5Zom\u074c\u0014ڥ=\u0002q\u0003:\u001d `'h\u007f\u0013\u00042,^\u000f%\u0001\nƞ\fZ6NwRR;OK>Z\u001fL(\u0019\u001e\u000bp~:Vou:]݊IݪBŰ&ڿ݁\u0001O\u0013Pb2U\ro&C@eߎE)a\u000f\u001fR\nHIӡqݘ\tj-49W<mDg\u0018\u0014Cۀ\u007f\u0011k~>\\3Z'Ж'˦SeQ`\u001c6¾z}\u0015<\n-Σ+Y"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^uZ\u00137p{5w=\b\u0017\u0006Kw\u000e$r2;/", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7eg$\tFV", "", "1n\\=T9>B#", "", "=sW2e", "3pd._:", "", "", "6`b566=S", ";h]Bf", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", ";h]Bfs.e-hMi*", "uKZ<g3B\\b\u000e~f,Ff9m\u000b$\t<}\u001e\u00176s\u0016<^!B_Sc\u001c", "2ta.g0H\\", ";h]Bfs%@w\rdC6", "uI\u0018\u0019^6MZ\u001d\bDm0\u0005\txC\n0\u0007<\u000e\u0013\u0014No|@~%\u001dU\u000b&\r", ">kd@", ">kd@ \u0013+2'h_h", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m10305compareToLRDsOJo(comparableTimeMark.mo10298minusUwyO8pc(other), Duration.Companion.m10409getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static ComparableTimeMark m10301minusLRDsOJo(ComparableTimeMark comparableTimeMark, long j2) {
            return comparableTimeMark.mo10299plusLRDsOJo(Duration.m10359unaryMinusUwyO8pc(j2));
        }
    }

    int compareTo(ComparableTimeMark comparableTimeMark);

    boolean equals(Object obj);

    int hashCode();

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo10297minusLRDsOJo(long j2);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo10298minusUwyO8pc(ComparableTimeMark comparableTimeMark);

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo10299plusLRDsOJo(long j2);
}
