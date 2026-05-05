package kotlin.comparisons;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<;%&i\u0016DLc\u000b\u0004I\u00066\f6B\r14\u0012}\b~0Gӄ\\e\u000f-rU0şyzd(i$\nC\u0002TJ\u00020\ngN.f\u001fNh\r[\u000fL\u0015)\u0003:Lm\rm\u0016\u0015˰Ro\u00062{s&Apx<ӌ02h7X\nG\u001fݵL\u0010\u0005\u0001[\t\u001a۵H@79r\u000fSĨ(\u00116B.\u00016\\.MfLz^R/i\u0002\u001aZ\\*wD\rQ\u0013Ͽd'Su\u0010\"\u0014HG9\u001bǬc\u0003MQ:DIDџA\u0005v.?tW֕o6\u001f~4\u00171˽\u001b\\#*j\u0005i`R&[_qSh\u00168{\u0001z\u001d<J\r40h.s\u0019\u0017 \u001c6\r\u0007cDV\u061cnBFy\u0010:\u007f-\u001071ݍ+f\u0018`\u001a\u001e\u0015<߉\t\r,-\u00194/fl\u000e'\u0014;V}\u0383?PpAVN\"Y\u0004l4tp\u0003B\u0004vF03\n\u0013F\u0017k6\fQ1$\u0004\u0016XHmϸ\u0015`/R\u0018V1H2r\u001cճ:\tRY#iKpÏXX:\u0017eYb\u0012\u0016\bY\u001f|yBƙ3\u000f~Svi\u0003M$\tU3t8qn2\r\bQl6Mes\u0014g\u05ec\u0007\u0014\u0006;\u0011\tAnRW\u0012ȗl(h1'oV|ԞHN\u001a\u001aJ\t\u007f'L,w\u0018|\u0017Nґ,Aq\u0001\u0017_rhV}\u0005C2\u000b\u0002,\u0005\r\u0007Olp6f'RL|'!]Y_81:e&nؔ\r#M}\"\u00040o\\KR˾&u\u001cz~\u001b`>ֺ3=!\u0019ɘ->"}, d2 = {";`g\u001cY", "\"", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<M#\u0016aW,5\u0015\u0010UN }NDtK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}.$lh\u0003dm4Yr4C[X92\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", "=sW2e", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g%we@PA6V\u0002#TH]6i(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", ";h]\u001cY", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:79)9/8315o\u0003.+-\u001d-#,'%)\u007f(")
class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
    public static final <T> T maxOf(T t2, T t3, T t4, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) ComparisonsKt.maxOf(t2, ComparisonsKt.maxOf(t3, t4, comparator), comparator);
    }

    public static final <T> T maxOf(T t2, T t3, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t2, t3) >= 0 ? t2 : t3;
    }

    public static final <T> T maxOf(T t2, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t3 : other) {
            if (comparator.compare(t2, t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    public static final <T> T minOf(T t2, T t3, T t4, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) ComparisonsKt.minOf(t2, ComparisonsKt.minOf(t3, t4, comparator), comparator);
    }

    public static final <T> T minOf(T t2, T t3, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t2, t3) <= 0 ? t2 : t3;
    }

    public static final <T> T minOf(T t2, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t3 : other) {
            if (comparator.compare(t2, t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }
}
