package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>-6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XT2\u000f\u0002{<$a&yCI[\"Ԃ*\t]NogtJb\u000bQ5\u000e\u0016\u0007\u000f4I[\u007fc\u0011%˰jqE\u074c[ne;fsD\u0005Pr2:\n\u0005G\u0019:J vAC[\u001a\"<PrJRSL\u0015\u001c\"\u0006\u0005 / l\u0006^RXnm:u\"\u0013kRNm_^\u007f6\u0019VV7\r=`.-P7{\u0015\u0004W1\b\u0013zO\rMvU\u000bx)7+\u007f֕\u0006<h\n\"\u001cCU\u001d_\u0003&\u0013\u0004\u007ffВ++]k\u0014r\u001c5\u0010\u0017\f\u000fL\u0004Dͺ7J>-Pe6\u0011\u001c\u0001\u0003UPP8މR\u0002\u000bal\u0016\u0004\u0004y=\u0002At_y;G]_\u0018\u0015\u000f.#7͙1]d\u000e\u0017\u0014IW`]ASP=~ݐ\u001a[Mm:oA\u0006p\u0016xu\u000e?\u0014\u0011\\(MSk;3!\"ȵXFwv;_\u0017VR^XB2nLճ:\u000b\u001cZzcco\u0001Xf>)MJcM\u0010P;.o\u0010N13 Z_jyj\u0004Ϊ\u001a'?fmX\u001d\u0001<kajC7acFРbx$?ra3Z-T\u001c\"hr@\"`W\u0013\u001c\b}TNBƎBA\u0002\u001cj+_\u001b#'\u0011F,YY|7p\u0003\u0005 \u0001d3ZѰy&\u0005\t7O\u000bsXs\tK<|\u0017õ=Ca5O%4&\u00198\u000b;\u001f~\"\u000fwkZ`dlL߯\u0006\u007f.029\b.\u0004%ä\u0003)@\u001duwZ\u000f}m]\u00147z3Ȫ\u001f=x.\u001e\u0007\u0019s\u0015lzL_TMǱ\u0007`\u0003#>c^}\nR\u000bIsTAϵNK\u0003\u0003\u0010;|:C\u0017gP3\u001e\b.\r7=C]ݴ&y$/K`\fk\u0018J\nd\u001f&+Ё\u0014.s\u0016&a\u007f`\u001bGHKi~tЭ4n\u0013B~iV\f\t\u001b\u0005\u001fAQYd\u001f`\u000fԞ\rɣ\u0002l\u000fԭ%r\\fH\u001f̳\u0002R"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#`\u001cEp}*X1;x8\u001a\u001clv9\u00149", "\u0019", "$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#e\u001cBT\u001a4M1;x8\u001a\u001clv9\u00149", "", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "9RT?\\(EW.~\b", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "DRT?\\(EW.~\b", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DC|4WRBo=1^vaF\u000b_3R\f#VPX5&8`=!\u0016V\u0015R@\r\u0012/\u0005\u0015", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0011X:<`\u001d\n\nh9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "0tX9W,K", "0tX9W,KA\u001d\u0014z", "", "1gT0^\n:^\u0015|~m@", "", "Ahi2", "1n[9X*MW#\b^m,\n\u0005>o\r", "", "", "1n[9X*MW#\bhbA|", "7mb2e;$S-ove<|s+i\r", "7mS2k", "9dh", "D`[BX", "uKY.i(\bc(\u0003\u0002(\u000fx\u00172M{3Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*@gE\u001a^o]B\t-\u0016K{'E[$oM", "Bn1B\\3=S&", "BnA2f<Eb", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(KSerializer<K> kSerializer, KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.descriptor = new HashMapClassDesc(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashMap<K, V> builder() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(HashMap<K, V> map, int i2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Map.Entry<K, V>> collectionIterator(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.serialization.internal.MapLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.MapLikeSerializer
    public void insertKeyValuePair(HashMap<K, V> map, int i2, K k2, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put(k2, v2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashMap<K, V> toBuilder(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Map<K, V> toResult(HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map;
    }
}
