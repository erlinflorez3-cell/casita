package com.squareup.wire;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>-6B\u0005%4\u0012\u000e\u0007nʑA0RkP.XU2\u000fy{<řc$\bCCU0}*\tUOog\u0005Jb\u000bY\u000f\u000e\u0016~j2կkތ\u0006\u0014\u0015˰Png5SnK9\u0011\u0007F\u00130>2:\n\u0005G\u0019:J vACy\u000e@1\u0001\u0014@ĥ\u001dW\u0013\u001d*\fN\"\u0011\u001e\u0013ɡ|7Xvk>G)\u0013kRN]^^}֔\u0011HZ,\u001b|*89IO5C/\u0004\u0013\u0015]sK\u0013A\u0002=;ؒ7);I*VdZF(]O]\u0019urTf5Un\u0019?+}m{b\u001c3\u0010\t\f\u000fL\u0004Dͺ7J>-Pe\u001e\rav9g\tr\u0010lZ\u007f)pf\u001b3\u0010K+g,\u0017aoF1ZG}\u0015\rTŀ\u0011p1[\u000b\r\u000f\u0017ah@s?_X=v]:]K}\u001cp\u0011\u0014Z\u0014>R\u0018;\f\u0013>\u0017[ڛk;3!\"\u0001vF.\u000bM\rvf\u0002RvORr$GB\t:kth\u0013xhT\u00076A_*_\u001f\f\u0018\u00150\\.˓1' N\u0006g\u007fi{_P9w\u0013El\u0007k<fibAEic>s\u0003z\"LTb3b\u0017Ta\u0017rj8$BH!ݘ\b}TNB\u0012H> \u001ez@y3j)`\u000f.DQ|?ݠjj ~\u000b2R\u0005\u001a(\u0003\u001e\u0019P\u000b\u00076{Ac:\u0011x.=Ca5Oğe$x43\"5\u0001$\u0004U|dGz\u0004\\\n\u001e\"..2Ea1M\u0013Eȯ94\u0012-{K!g\u0002] 2\u0013\t\n\u0011KhdԖ\u0018l\u0001,\u0017ixQ\u001b+r\u000fly;\u0014t\u0002\na|کWed\u000b\u0012=wzYʞ>ҡ<|\rȔǰ)\u001a"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc<\f\u0002$Q~\u0018\u0018u!@h}-\r", "\u0019", "$", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "9dh\u000eW(Ib\u0019\f", "D`[BX\b=O$\u000ezk", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018a4Q[X\b[N}L\u0014\u001f0Q?", "3mc?l\b=O$\u000ezk", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc<\fv V|\"'\u0004/DcY\u001f3x%.Z\u0019", "3mR<W,=A\u001d\u0014z", "", "D`[BX", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "B`V", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "3mR<W,0W(\u0002iZ.", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, ? extends V>> {
    private final MapEntryProtoAdapter<K, V> entryAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapProtoAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), null, valueAdapter.getSyntax(), MapsKt.emptyMap(), null, 32, null);
        Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        this.entryAdapter = new MapEntryProtoAdapter<>(keyAdapter, valueAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader32 reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        int iBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                break;
            }
            if (iNextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (iNextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(iBeginMessage);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key".toString());
        }
        if (identity2 != null) {
            return MapsKt.mapOf(TuplesKt.to(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value".toString());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                break;
            }
            if (iNextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (iNextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(jBeginMessage);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key".toString());
        }
        if (identity2 != null) {
            return MapsKt.mapOf(TuplesKt.to(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value".toString());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i2, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(writer, i2, it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i2, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        ArraysKt.reverse(entryArr);
        for (Map.Entry entry : entryArr) {
            this.entryAdapter.encodeWithTag(writer, i2, entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i2, Map<K, ? extends V> map) {
        int iEncodedSizeWithTag = 0;
        if (map == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            iEncodedSizeWithTag += this.entryAdapter.encodedSizeWithTag(i2, it.next());
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> redact(Map<K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return MapsKt.emptyMap();
    }
}
