package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u0003\u0016Iي8\u000b<G\u0007\"2\u0013\u007f\u0007tjAӄLe^.Zݷ2\u000fy\u0002<řc$\bCCU \u0001*\teNog\u0005Jb\u000bI\u000f\fǝ\u000f̓\\Oezm\u0012=2pn\u007fF]yK:xzF\u000702P:(\u0004в\u001e,N\u0013\u0005~\fk\u001a\u0017H@\u001f@\u0003\u0011[\f2\u00124FP\u0005,e\u007fNdR\u001dcH:;\u0005\u007fA|'&DEm\u001bKl';|\u0012\"9GO5C1\u0004\u0007\u0015[s?1I\"C\u0013s?)AH\"W|lH\"#8g\r\f|V`\u0013\\x\fU+\u0016w\u0014h\u001c6\u0010z*\u0017l\b\u001c\u000f?H\\7Jl\u0016\u0019Kv\tRnPHr\u000b\u0016\tpN\u0017S\u0006c/G\"~Q\u0010CIRE\u0007\u001d\rL#G\u0003iqb\u001dx\u0015IZ(U?XX=vZ:]Kx\u001cp\u0011\u0002p\u0018xU\u000e?\u0014\u0011\\\u0017U;iJ;!\u001a\u0014\u000fX0\u0005\u0013p\u0001S\u0018RxD0\u007f.7X\u001cRn\rr\u0013\u007fhT\u0007,AQ*_\u001f}6\u0013fpHN/&(T_jyj{_8$\u0006ό9֍rk\u0016ãߓbH"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\G\u000b\u0013&#|\u001b8\u000b\u0010Bc\r*\u0013l\u00129\\CHA", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "=qX4\\5:Zt}vi;|\u0016", "", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fSc(", "3mR<W,0W(\u0002iZ.", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "B`V", "", "D`[BX", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "3mR<W,=A\u001d\u0014z", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "3mR<W,", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FloatArrayProtoAdapter extends ProtoAdapter<float[]> {
    private final ProtoAdapter<Float> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatArrayProtoAdapter(ProtoAdapter<Float> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(float[].class), null, originalAdapter.getSyntax(), new float[0], null, 32, null);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, float[] value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (float f2 : value) {
            this.originalAdapter.encode(writer, Float.valueOf(f2));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, float[] value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int length = value.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(value[length]));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i2, float[] fArr) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i2, fArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i2, float[] fArr) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i2, fArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iEncodedSize = 0;
        for (float f2 : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Float.valueOf(f2));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i2, float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, fArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] redact(float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[0];
    }
}
