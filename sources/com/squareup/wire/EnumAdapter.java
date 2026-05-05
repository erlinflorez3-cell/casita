package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.hS2\u000fq\u007f<$i*yCAV\"}0\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xs\u0012\u0017˰JoU3UoC=f\u0019LӌH8(\u0600\b\u0004)\u001aXH@|\u000bE[\fX/nqzy\u0013O\u0015$ \bV&\u0011 lg\u0005Ȥvom>='\u001bipS7e>\u0003e\u000f\\S]˙țe 1GE=ULY\u0017\u0017\\iA\u001bE\u0002?\u0015h]ݐYR\u0004[D\\\u0018\u0014C0_\u0013kx>^\u001bP\u0017ϯˏ/QiR^\u0018h\r\u0001\u0010\u001dF\u0012\u0010\u001e-X0=\u001a\u001dڜ<<ϢvUFW\u0010i\u0003\u001d\u0001uF!3\u0002K1I\u001dvQ\u0018ݢGWG\u007f\u0013\u00116#/sĲ_V\u0014g#'\u0015\rWEaJKJf\u0010i?}\u0004'ç0-˙4I\u00066\n\u001en4+KkC1#\u0004\bXFwv;\u009b\u0017VyVVD:nD<Ҋ\r\u000e`Kr\u00134cbgD\u0011{,\u0005\u000b\f\u0019+ \u0013ɼ\u00035ٚ\u0014N]z2\u0006[p\"%]zg]|\u0001&Wgtc9_t(a\tΘZSםf\u0005f}\u000bn\u001amt(PFxn\u001e\r\u0014D|$C6M\u000344bջ_pČL\u0003,[\n\u0010\u0017yrhFз\u000572\u001e\u0002$#%Gdʷtou\u0016\u0012?\u000bz:-wٛe\u001d4p:hb\u001bi\u001bҋw\u007fU\u0007\u0015ZZ\r.u\fݨP\u001a(Ji/sПU\u0013Ȟ6\u0002;f\u0015\bsse\u0014=y3Ȫ??v?\u007f\b\u0019\u0001r\u0003ʧNOb:Țz\u0003"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq[I\u0011\u001frFk\u0019Kv2\u000b", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "7cT;g0Mg", "\nh]6g\u0005", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.m\u0018D@3Aiy-7}!w_GHk}\f)qp5\u001a9\u0013L\u0001/\u0011ZZ<X_rM\u001f[l\u0012[+Vv]N$NMG']o:", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fyJ\t`%S\u007f\nIv5@#\u0010$Dm_\u001caLJgGs{fkAPq8^r4G\\YunV\u007f=]\u0004^\u001bN\u000b\u0016\u0015a\u0017g_", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fyJ\t`%S\u007f\nIv5@#\u0010$Dm_\u001caLJgGsXY", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000b`", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.m\u0018D@3Aiy-7}!w_GHk}\f)qp5\u001a9o?", "3mR<W,=A\u001d\u0014z", "", "D`[BX", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017'x\u001eDLh\u0019", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/d\u001eAu_<YS7x4. 2s=\u0014cu@z4G,W<d(6.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "uKR<`uL_)z\b^<\bRAi\r(E-\u0001(\u0017T}\u000e'\u0004/Dco-;|\u0016;#*9u<g#tq5\u0014c<Y@9KYNuNV\u007f=s\u001bj\u0016$n}", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B/A\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018h+TL.5lZH", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B'JuzT\u00148U\rIwD\u001a\"hqDPu0[vp9P[,<[\u0003Ei", "@dS.V;", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017'x\u001eDLh\u001cW\b(\u0001{\">IP;{?g'ln9PU0[v\u0007P\\V\u0002", "4q^:I(Ec\u0019", "uH\u0018\u0019V6F\u001d'\u000b\u000bZ9|\u0019:/\u0012,\t@J\t\u001bTomE\u0007-\u000b", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type) {
        this((KClass<WireEnum>) JvmClassMappingKt.getKotlinClass(type), Syntax.PROTO_2, Internal.getIdentityOrNull(type));
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax) {
        this((KClass<WireEnum>) JvmClassMappingKt.getKotlinClass(type), syntax, Internal.getIdentityOrNull(type));
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax, E e2) {
        this(JvmClassMappingKt.getKotlinClass(type), syntax, e2);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(KClass<E> type) {
        this(type, Syntax.PROTO_2, Internal.getIdentityOrNull(JvmClassMappingKt.getJavaClass((KClass) type)));
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(KClass<E> type, Syntax syntax) {
        this(type, syntax, Internal.getIdentityOrNull(JvmClassMappingKt.getJavaClass((KClass) type)));
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected EnumAdapter(KClass<E> type, Syntax syntax, E e2) {
        super(FieldEncoding.VARINT, (KClass<?>) type, (String) null, syntax, e2);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader32 reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int varint32 = reader.readVarint32();
        E e2 = (E) fromValue(varint32);
        if (e2 != null) {
            return e2;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int varint32 = reader.readVarint32();
        E e2 = (E) fromValue(varint32);
        if (e2 != null) {
            return e2;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeVarint32(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeVarint32(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ProtoWriter.Companion.varint32Size$wire_runtime(value.getValue());
    }

    protected abstract E fromValue(int i2);

    @Override // com.squareup.wire.ProtoAdapter
    public E redact(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }
}
