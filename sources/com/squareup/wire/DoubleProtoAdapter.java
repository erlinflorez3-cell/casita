package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u0003\bI\u00066\f6B\r(4\u0012}\u0007njG0L͜P.hS2\u000f\u0002{<$a$yCQU\"Ԃ*\teNogtL`ŏYƤ6\u001c\tl<I\u0004x\f\u0011O7ԲsA9N}?\u0002n\u00039\u001d `&h}\u0013\u00062*v\u0010=\u000f\fa\u001a\u0018H@\u001fA\u0003\u0011[\r2\u00124GP\u0005,a\u007fNdH3q\u0003E1\t\u0002B|.\u00104\u000bU%F\u00031=zo#C@e5[9\u001c\u0016\u0015]s?1?\"A\u0013t?'YV:k͏\\\u007f\"#sb\u001bh\u000b&\u000b\u0005\u0002d\u001a3CO\u0012Z\u0017\"߭{z\n\u001d\u0005\u0017\u001c\u0017?H\\-Jj\u0016\u0013Kt!S\u0007dؿbB\u000e\rˑ:*"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZJ\u0011\u0014\u001eGZ\u001bF\u0006/\u0011Xy+Fm#\u0004", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "\nh]6g\u0005", "u(E", "3mR<W,=A\u001d\u0014z", "", "D`[BX", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B/A\u0007<i'*\u0017J7t6gsrq6\u000ec\u0002", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B'JuzT\u001b*^?\u0005r0'\u00172@C\u0017`3NL", "@dS.V;", "uC\u0018\u0019](OOb\u0006vg.Fg9u|/{\u0016", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Double.TYPE), null, Syntax.PROTO_2, Double.valueOf(0.0d), null, 32, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    public void encode(ProtoWriter writer, double d2) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(d2));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d2) throws IOException {
        encode(protoWriter, d2.doubleValue());
    }

    public void encode(ReverseProtoWriter writer, double d2) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(d2));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d2) throws IOException {
        encode(reverseProtoWriter, d2.doubleValue());
    }

    public int encodedSize(double d2) {
        return 8;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Double d2) {
        return encodedSize(d2.doubleValue());
    }

    public Double redact(double d2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Double redact(Double d2) {
        return redact(d2.doubleValue());
    }
}
