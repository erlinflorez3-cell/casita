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
/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&˛\bDRш|\u0004G\b8\u000b<B\u0007\"2\u0015\u007f\u0007tpA0JoN\u0013hݷR\u0011qڔB#\f$ C\u0004[(\u0002:\t}S.\f7]h\u0011[\u000f4\u001b)n:Pmx\u0014܈UVԲs?AU8XGi\r63%b&F\u0004\u001d\u0001H5x\u0014\u0005\u0007[KB۵vd¤>R\u001bZM5 \u0014V /#\rk\\@`l\fE_'\u0011uZN]ڿv!֔\u0011Fb4U\u0015o-C@e:E)a\u0013\u001fR\nJ3C\u007fN\u001dhU2[M\u0002iNX.\u001f[O\u0018\u0013k\u0006>\\3V' o1]wcP<->\u000fD#J\u0019&\u0006UM^1(p \u000ea\u007f#WNb\u001a^p\u000bA\u0006~\u001d3\u0016K+g -u2K'OO{;ټtŧ\u0003ͼ%_l\u0010f\u0017)WʦPĸ҈@APP\u0010xklշtyͤ.\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "\u001c", "", "1ta?X5M", "5dc\u0010h9KS\"\u000e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1kT.e", "", "2nf;", "<nS2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "7mb2e;\u001b](\u000e\u0005f\u001c\b", "7mS2k", "", "7mbAT5<S", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "7mb2e;-]$]\u0005p5", ";ne2", "4q^:", "Bn", "1nd;g", "=m12Z0G1\u001cz\u0004`,\u000b", "=m4;W\nAO\"\u0001zl", "@d\\<i,", "Co", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Applier<N> {
    void clear();

    void down(N n2);

    N getCurrent();

    void insertBottomUp(int i2, N n2);

    void insertTopDown(int i2, N n2);

    void move(int i2, int i3, int i4);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i2, int i3);

    void up();

    /* JADX INFO: compiled from: Applier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
            Applier.super.onEndChanges();
        }
    }
}
