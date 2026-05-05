package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007|jAӄLeVLZS0\u0015s{B*c$wICU(}*\tUOog|ϺbŏIƤ\u001cǝ!l2կcw\u000e\u0018\u001f4Ro\u00062{om=\u000fu\u001f\u0005~4R<(\bi\u001a\tLP\n\u000bMY\u0011*6PrJRC˟3 Ū\n@&\b,d0bDU\u0005]pǂS\u0007wPf'\u000e?Cֈ\rТX'\u001b\u0007*:9TO5KǬ\u0004\u0007\u0015`s?1N\"A\u0013}?'aɞ:ɥ6ݼ\u0004\u0014#A\u0018(k\n>\\3i\u0011\u001059gcy_>,\u0006\u0010\u0014\rrǉT\u001aόL.;3/\u001b\u001cM\rr\nó\u0001\u0006lP\u0018z\u0010E]9ő7+G+/WoV1Ne\u0018K\rn5\u000fs9ad\u0010p\u0015QƘ&W\b҈BףLN\u0012ԯ\u000e\f\u0012yz\b:\u0006@G6\u07fc*\u0017\u0005ϐ1ھ_E+ܩ\u0004\u0004NNu\u0002%bn_wZ\u0019R0\u007f.7X\u0018B/\u001b߶\u0007\u07fbTXp.\u0017_*gΞ\u0002%"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006^5DUz'7W\u001f ZGJk\u001b\"#w7", "\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7T\u001a<\\\u0019", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006d%B]y';\u0003\u0012+TC\u0011", "7l\\Bg(;Z\u0019e~l;", "", "\nh]6g\u0005", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", ";tc.U3>:\u001d\r\n", "5dc\u001ah;:P ~ab:\fGAi\r(uM\u0011 &Kw\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001ah;:P ~ab:\fGAi\r(uM\u0011 &Kw\u000e", "5dc", "7mS2k", "", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "Ahi2", "5dc \\A>", "u(8", "Adc", "3kT:X5M", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "/cS", "", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "@d\\<i,\u001ab", "EqXAX\u0019>^ zx^", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MutableOnWriteList<T> extends AbstractMutableList<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    private List<? extends T> mutableList;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(List<? extends T> immutableList) {
        Intrinsics.checkNotNullParameter(immutableList, "immutableList");
        this.immutableList = immutableList;
        this.mutableList = immutableList;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.mutableList);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, T t2) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) list).add(i2, t2);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.mutableList.get(i2);
    }

    public final List<T> getMutableList$wire_runtime() {
        return this.mutableList;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.mutableList.size();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i2) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).remove(i2);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i2, T t2) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).set(i2, t2);
    }

    public final void setMutableList$wire_runtime(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mutableList = list;
    }
}
