package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>/6B\u0005(4\u0012\u0006\rnj?0LeV.Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWNmgtJpŏk\u0011\fǝ\u0007iTK[wk\u0012?DR}O?]qM9'sF\u000702h8(\u0007/\u001bjk\u0016͌\u000bMY\u000f*6PrJRC˟3\u001b\"\u0010L$\u0019$li^6~k\f;ǥ'\u0005oG\\-(J\u000bW%F\u00032=\u0007o*CLG7%%\nΈ\u0017Tk?9> ?K|oI9V\fWdf0\u0018#:g\r\f\u0003Vl\u0013]x\u00187-_c\u0002ִ\u001e*\bz2\fj\u0006T\u001aoj<:2f6\u001ccx\u0001bXP0or\u0010\tmN#5\u0002C+oӕvSq;OMe}K!f=\u000f\u00019gd\u0010p\u0015QƘ\bSAQv<vP:]K\u0001\u001cp\u0011\u0016p\u0018xm\u000eD\u0014\u001d>\u001957\u0012ݽ3#{\u0002~C\u0016x5pv_\u0002^XB2nLճ:\u000b\u001cZzc3m\u0017h)D\u001fP4Z\u0017\u007f\u0018\u0013Vο&=wظ\u0012ʽSnqҔe_\u0010,=n\bq|o&]I`C5\bb>b)Ι\u0016͖@h\r֚~DY\u0015hd͎&H"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc<\fv V|\"'\u0004/DcY\u001f3x%.Z\u0019", "\u0019", "$", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "9dh\u000eW(Ib\u0019\f", "D`[BX\b=O$\u000ezk", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018a4Q[X\b[N}L\u0014\u001f0Q?", "5dc\u0018X@\u001aR\u0015\n\n^9;\u001b3r\u007f\"\tP\n&\u001bOo", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "5dc#T3NSt}vi;|\u0016mw\u00045{:\u000e' Vs\u0016<", "3mR<W,=A\u001d\u0014z", "", "D`[BX", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {
    private final ProtoAdapter<K> keyAdapter;
    private final ProtoAdapter<V> valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntryProtoAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.Entry.class), null, valueAdapter.getSyntax(), null, null, 48, null);
        Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        this.keyAdapter = keyAdapter;
        this.valueAdapter = valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Map.Entry<? extends K, ? extends V> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        this.keyAdapter.encodeWithTag(writer, 1, value.getKey());
        this.valueAdapter.encodeWithTag(writer, 2, value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Map.Entry<? extends K, ? extends V> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        this.valueAdapter.encodeWithTag(writer, 2, value.getValue());
        this.keyAdapter.encodeWithTag(writer, 1, value.getKey());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map.Entry<? extends K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.keyAdapter.encodedSizeWithTag(1, value.getKey()) + this.valueAdapter.encodedSizeWithTag(2, value.getValue());
    }

    public final ProtoAdapter<K> getKeyAdapter$wire_runtime() {
        return this.keyAdapter;
    }

    public final ProtoAdapter<V> getValueAdapter$wire_runtime() {
        return this.valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> redact(Map.Entry<? extends K, ? extends V> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }
}
