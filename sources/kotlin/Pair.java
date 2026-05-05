package kotlin;

import java.io.Serializable;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\u0005,4\u0012\u0006\u0010nʑA0R͜P\u008cZS8\u0015sڔ<$i0yّA٬ \u0014̝1STʴumhY3G\u0015\u0005$x\t+yY'^z\u000f\u0011D0RCQ}@Q`+Ȃ\u0015$@&Py;\u007fʀ.H\u001e{COY\u0016*0v\u0081\u0001Ŭ\u000ê\t\u001a \r\u0007,\u000f)tg\u00055\u000fȔ^Ơ3#\u0011p\u000bz5kH\t]\u000fVT]˙\u0007c.+v6cՖUY\t\u0007`^W\u0003uмm\u000bn'5/as\u000e5\u001fģ\u0013Ʀ/O\u001bj;7j\u0013i`:6[Uq[h\u0010>v)\rSʴ\u0005V\r5ZF-HyN՛2=xaTh\u0002\rWF\u000f2G%(\u00183aݍӸjYi;'VO}\u000b\u0013,*Q\u007f/_l\u000e\u0017\u0014ôX\u007fY1_HUJT\u0013gDѐ\b\u0007"}, d2 = {"\u001aj^A_0G\u001d\u0004z~k\u0002", "\u000f", "\u0010", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "4ha@g", "AdR<a+", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "5dc\u0013\\9Lb", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc X*H\\\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4IEz;\"\u001e2L5\u000bp\u0002", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a2, B b2) {
        this.first = a2;
        this.second = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i2, Object obj3) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            obj = pair.first;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            obj2 = pair.second;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final Pair<A, B> copy(A a2, B b2) {
        return new Pair<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.areEqual(this.first, pair.first) && Intrinsics.areEqual(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a2 = this.first;
        int iHashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b2 = this.second;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ')';
    }
}
