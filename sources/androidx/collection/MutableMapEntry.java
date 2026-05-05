package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
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
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006DLc\u0003)Iي8\u000b<Q\u0007\":ߚ\u007f\u0007ljA0RkP.Xd0\u000f\u0002ڔ\\&aҕ\u007fBcW |0\t\u007fZwi~J!\nS\u0011\u0016\u0016?jZJ\u0016$m\u001e\u001d4ZwO7]qS8\u000fxd\b0>0=\u0012\r\u0011\u001e:J&u)Gy\u000f\"4NvRR;Tŋ\u001e\u0012\u0014Fh\u0014,s\u007fNlG\u001daHG;\u0003 A\u0015;ۢ4|[&\u0017c5\u0013\u000faL2Ë;;\u001dǬk\u0005\r[iISW\u007fH\u001dh]ݐa\u001eJɥ8ݼ\u0004\u001e%-U\u0019k\u007f>^\u000b_n\u001bwD]ecX\u001e,\b|\u0012\fj\b<\tόL65\u001at\u001a&5z\u0003aQ!\u001alU\u0018z\u00185MyVĨ-ݰ\u001fpacA-\\D\u0014\u0007\u001331\u0010?:iY&h%\u001fdyg0\u007fDkKݳ\u000eaEm\u0012\u0003z\u00040\u001a>XĲ3\u0016"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<^!@9\u0007/D\u0002k", "\u0019", "$", "", "9dh@", "", "", "D`[BX:", "7mS2k", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#'~\\", "5dc\u0016a+>f", "u(8", "9dh", "5dc\u0018X@|O\"\b\u0005m(\f\r9n\u000e", "u(E", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0018X@L", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "D`[BX", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "5dc#T3NS", "5dc#T3NS'", "Adc#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public MutableMapEntry(Object[] keys, Object[] values, int i2) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i2;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v2) {
        Object[] objArr = this.values;
        int i2 = this.index;
        V v3 = (V) objArr[i2];
        objArr[i2] = v2;
        return v3;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }
}
