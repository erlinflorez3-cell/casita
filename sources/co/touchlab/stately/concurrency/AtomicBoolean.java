package co.touchlab.stately.concurrency;

import com.dynatrace.android.agent.AdkSettings;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JhP.`Y2\u000fq~Jř\f$ B{`*\u00020\tgN\u0016hĔNZ\u0019EW\u0014$\u0003\u0003,w`)a \u001bJB\u001e@yM8QGm\r63!b&F\b\u001d\u0001H+x\u0014\u0005\n[K:\u0013\u0001P~=j\u0011{\t\u0003\u0012dCvҸ ֔kN>ԟ=\u007fH5;\u0003\u0018C~+m6\u0015M;G\u000bkK;8ӣ7Ë;?-'Y\n\u0015Z{A\tH\u007f?ބl7"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG{Fw\u001e2K Eu;\u001e\u0011q7", "", "D`[BX&", "", "uY\u0018#", "/s^:", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Q\u001f=ME;x\n", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG{Fw\u001e2K'Dz\n", "D`[BX", "5dc#T3NS", "u(I", "Adc#T3NS", "0n^9G6\"\\(", "", AdkSettings.PLATFORM_TYPE_MOBILE, "1n\\=T9>/\"}h^;", "3w_2V;>R", "<df", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n}<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AtomicBoolean {
    private final AtomicInteger atom;

    public AtomicBoolean(boolean z2) {
        this.atom = new AtomicInteger(boolToInt(z2));
    }

    private final int boolToInt(boolean z2) {
        return z2 ? 1 : 0;
    }

    public final boolean compareAndSet(boolean z2, boolean z3) {
        return this.atom.compareAndSet(boolToInt(z2), boolToInt(z3));
    }

    public final boolean getValue() {
        return AtomicIntKt.getValue(this.atom) != 0;
    }

    public final void setValue(boolean z2) {
        AtomicIntKt.setValue(this.atom, boolToInt(z2));
    }
}
