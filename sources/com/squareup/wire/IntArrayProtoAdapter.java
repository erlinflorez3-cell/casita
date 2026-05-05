package com.squareup.wire;

import java.io.IOException;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u0003\u0017Iي8\u000b<H\u0007\"2\u0013\u007f\u0007tjAӄLe^.ZS0\u000fs{J$c$wFCU0}*\teNogtJ`ŏYƤ6\u001c\tl<I\u0004x\f\u0011OERyM4euM;ptd\u0007N1ŕ<{\u000b\u0004(.\u00110\u0005\u007f[K:\u0018`D~Aj\r{\rJ\u0016\u0014G8\u0001L^\u0018TDR\u0005_P.Q\u00030V\u0017Gm5\u0015M;L\u0005+\u001b}y\u001eYKg9#.k\u00035T\fE\u0011I\n?\u001bgU'q]<eDd\u0018\u0014C-\u007f\u0011k|>\\3Q' oC]pcP<*(~\n\u0016T\u0004<\bWN<72h\u001e\rat9g\tf\u0010lZ\u007f)gf\u001b3\u0007K+g#\u0017UoE1Ne{K!f9\u000f|9[\u0003\u0014\u0011\u0019)[\u0010Q_\\pAVX\"YkmJ\u0005+\u00108\u0013HG./,\u0015<'=7\nJi54\u0010VS\u007fv3`\u0019Wwb`@P\u0001\\Kr\u0017\u001am\\d3k\u0001Xf6)MJTM\u0012X%.]\u0010B1' N}j\u0018i$έ\fɻ3f?ժˍo\""}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq_I\u0010r$Tk\"'\u0004/DcY\u001f3x%.Z\u0019", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "=qX4\\5:Zt}vi;|\u0016", "", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fSc(", "3mR<W,0W(\u0002iZ.", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "B`V", "D`[BX", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "3mR<W,=A\u001d\u0014z", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "3mR<W,", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class IntArrayProtoAdapter extends ProtoAdapter<int[]> {
    private final ProtoAdapter<Integer> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntArrayProtoAdapter(ProtoAdapter<Integer> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(int[].class), null, originalAdapter.getSyntax(), new int[0], null, 32, null);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] decode(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return new int[]{this.originalAdapter.decode(reader).intValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return new int[]{this.originalAdapter.decode(reader).intValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, int[] value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int i2 : value) {
            this.originalAdapter.encode(writer, Integer.valueOf(i2));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, int[] value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int length = value.length - 1; -1 < length; length--) {
            this.originalAdapter.encode(writer, Integer.valueOf(value[length]));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i2, int[] iArr) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iArr != null) {
            if (iArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i2, iArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i2, int[] iArr) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iArr != null) {
            if (iArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i2, iArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(int[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iEncodedSize = 0;
        for (int i2 : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Integer.valueOf(i2));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i2, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, iArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] redact(int[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[0];
    }
}
