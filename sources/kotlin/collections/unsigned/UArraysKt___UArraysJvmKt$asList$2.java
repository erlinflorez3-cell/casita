package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я)\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\rnj?1LeV7ZS0\u001b\u0014zé*c:ڎsAe\u001c\u000e\"7O|f\u0018rx[sCm\b^\u000fx3aU'eB\u0013@K\b?aM6ޠ9žx8\u000b*@-\u0001\u0013\u0013\r2*v\u0010'~QX$\u0012^D7ĄRԁLĨܨ\u0016\bD.\u000f-%|\\F`l\f>_'\u0011rZNU_v\u0011֔\u0011HZ8\u001b\t*$9SO5C-\u001a\u0017OgiS\u001b? A5l50CI\"W|lÿ\u0018\u00171d\u001boC8j\bi`:+a$:ֶRˎ,{\u0013}\u0013A\u0012\u0014ͽ'J6- \u0006ۅ\u0012I"}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eq\fI\u000f\u001b\u0019Po\r\u0006f\u0001Bfy4ES%(G=+GA+\u0011|o\u001e\u0018k\u0012]5#U3R:k\u0011?", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u001aj^A_0G\u001d\te\u0005g.R", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "Ahi2", "", "5dc \\A>", "u(8", "1n]AT0Ga", "", "3kT:X5M", "1n]AT0Ga`o`S\u001e\ro\u001b", "uI\u0018'", "5dc", "7mS2k", "5dcyfs/9\u0002dj", "uH\u0018\u0017", "7mS2k\u0016?", "7mS2k\u0016?\u001b\ndoP<ct", "uI\u0018\u0016", "7r4:c;R", ":`bA<5=S,h{", ":`bA<5=S,h{&\u001db}!uf\u0014", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {
    final /* synthetic */ long[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m9492containsVKZWuLQ(((ULong) obj).m9206unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m9492containsVKZWuLQ(long j2) {
        return ULongArray.m9210containsVKZWuLQ(this.$this_asList, j2);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i2) {
        return ULong.m9148boximpl(m9493getsVKNKU(i2));
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m9493getsVKNKU(int i2) {
        return ULongArray.m9214getsVKNKU(this.$this_asList, i2);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m9215getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m9494indexOfVKZWuLQ(((ULong) obj).m9206unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m9494indexOfVKZWuLQ(long j2) {
        return ArraysKt.indexOf(this.$this_asList, j2);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m9217isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m9495lastIndexOfVKZWuLQ(((ULong) obj).m9206unboximpl());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m9495lastIndexOfVKZWuLQ(long j2) {
        return ArraysKt.lastIndexOf(this.$this_asList, j2);
    }
}
