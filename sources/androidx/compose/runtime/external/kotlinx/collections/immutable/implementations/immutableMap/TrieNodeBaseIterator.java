package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0006ELc\u0003*I\u00066\u000b6B\r14\u0012\u0006јnj?3LeV4ZS0\u0015s{J$cҕyCI^\"}(\nWNugvJ`\u000eI-\u001cǝ!n2կcw{\u001176HnM3kne=ftD\u0006>1R>\n\u0007\u0011\u001apI>x;Fƚ\u0010\u0012>C9C`\u001fe\u0005PŇĂB \u000f1%{\\J`|m>5\"\u0013ix÷7c6{]\r|SU\"?h,AX7c,kٜ\u0003OViW\u001b? TMl5@CI\"n~\\\u000e.-+}(&v4x\u001dQ\u000f'oL]\u0001cP<C(\u0007\n\u0014T\f\u001e\n7JD,Hl6\u0013cx\u0001^XP0j۰\u0004zoT_N\u000ePC9I\u0002\u0002mI f?\f\t\u001d 9\u007f\u001d'\nY>d#&lw\u007f=\u0002DKUf\n\bIъ\bpp!z2>N\u00187\f\u0015>\u0019;6\n?Q&\u001c\u000eVH\u007f~\u0015dxU\u007fQvFPsTw\u0001£\u0018ʑHl\rk^^p.\u0017U*]W\n\u0016\u001e8\\&Hwغ\u001cʽShqҔ\u001eu\u00182GfeeE\u008d\u001aĆ=j;̐ie\u0016o`\u00064ABr\u0013iڑFs"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY<uUA)q*q\bn'i\u0010", "\u0019", "$", "\"", "", "u(E", "\nrTA \u0006\u0017", "", "", "0tU3X9", "5dc\u000fh-?S&", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "2`c.F0SS", "", "7mS2k", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "1ta?X5M9\u0019\u0013", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1ta?X5M<#}z", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "6`b\u001bX?M", "", "6`b\u001bX?M9\u0019\u0013", "6`b\u001bX?M<#}z", ";ne2G6'S,\u000e`^@", "", ";ne2G6'S,\u000ech+|", "@db2g", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\b", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ\b", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final Object[] getBuffer() {
        return this.buffer;
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final void setIndex(int i2) {
        this.index = i2;
    }

    public final void reset(Object[] objArr, int i2, int i3) {
        this.buffer = objArr;
        this.dataSize = i2;
        this.index = i3;
    }

    public final void reset(Object[] objArr, int i2) {
        reset(objArr, i2, 0);
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final K currentKey() {
        CommonFunctionsKt.m3763assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m3763assert(hasNextKey());
        this.index += 2;
    }

    public final boolean hasNextNode() {
        CommonFunctionsKt.m3763assert(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m3763assert(hasNextNode());
        Object obj = this.buffer[this.index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m3763assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }
}
