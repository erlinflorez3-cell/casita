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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4E\u0007\":\u0018\u007f\u0007lm?0Z͜p0Xݷ8\u000e\u001c\fD&k$8BiU\u0003\u00042\u000b_N.fMK\u001b&S#\u0014\u0018\u0011z<Kex\u0014܈=2+uO5]osʠ?uȥ\t @%\u0001\u0015\u0013\u00072*v\u0017'~QS$\u0012fϋ!>`\u0016e\u0005PŇLRŋ\u0005\u001ejq\u0017JVwuJ?%\u0013ix÷U_\u0019\u0003]\u000fVT]˙UbnJN9M%5U\u0013\u0007\t¹m\u0003(wM\u0007x']Ǣ(tɱ:^\bϬ--U\u0011kw͏`\u0011"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0003i(\n\r=o\t6E-\u0001(\u0017T}\u000e;T/=dy-3| ;#", "\"", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "1n\\=T9:b#\f", "uKY.i(\bc(\u0003\u0002(\n\u0007\u0011:a\r$\u000bJ\u000elZ8", "5dc\u0010b4IO&z\nh9", "u(;7T=:\u001d)\u000e~euZ\u00137p{5wO\u000b$l", "1n\\=T9>", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1", "@de2e:>R", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class ReversedComparator<T> implements Comparator<T> {
    private final Comparator<T> comparator;

    public ReversedComparator(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        return this.comparator.compare(t3, t2);
    }

    public final Comparator<T> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    public final Comparator<T> reversed() {
        return this.comparator;
    }
}
