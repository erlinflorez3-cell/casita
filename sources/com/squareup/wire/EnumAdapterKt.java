package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\f6B\r\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0018\u0011\t:կmx\f\u0011/8HģM3uok:\u0011xD\u000782h8@ڏ\u0007ʀ.H\u001ey\u0013iY\u0010*0nuZX\u0013˟\u0013\u001a:\u0006l!1\"jmf6vs\u000e>=%\u001bi\tNmۀ6ƊQ\rT\\?3\u0005e6+n<U\u001b+م\u0011\u0007z[m\u0004ouK\u000b\u0001'U4ywe8p\u007fZ\u0015q˾\u0013ǁv&j\u000fi\"\u001a2CO*Kp\u0014.»\t{5<2\u000f.-X0=\u001a-\b<?%vaMh\u0002\rP0\roE/3\u00105;9IeaeK\u001bd6B\u0005;.iШtƈZ٪\u05f8d\u0015)e\u0010\u0013?\\X=\u000fN*_CЧ\u0012p\u000b\u0002X\u0005XM\u00101\f\u0011t\u0017SC\f=1.\u0004\u0002vV\u0018\t\u0013o\u0001ayTX@Pm&;:\u000b\"Y\u000bd3{\u0017Ӻ^ą\u0010۳ɟX\u0007\f\u001b+>j\fT!k\u0010nUnȉxM\u0006\nS0\u0017;gp\u0004\u000e\u001e9%ک;Ʉg\u0010ogΛ\u0014DDe\u000bִ\u0017pR۷^r"}, d2 = {"1n\\:b5\u001e\\\u0017\ty^+j\rDe", "", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "D`[BX", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017'x\u001eDLh\u0019", "1n\\:b5\u001e\\\u0017\ty^", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/d\u001eAu_<YS7x4. 2s=\u0014cu@z4G,W<d(6.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "uKR<`uL_)z\b^<\bRAi\r(E-\u0001(\u0017T}\u000e'\u0004/Dco-;|\u0016;#*9u<g#tq5\u0014c<Y@9KYNuNV\u007f=s\u001bj\u0016$n}", "1n\\:b5\u001dS\u0017\ty^", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq[I\u0011\u001frFk\u0019Kv2\u000b", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "4q^:I(Ec\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKR<`uL_)z\b^<\bRAi\r(E \n'\u001f#n\nG\u0006%B/d\u001eAu_<YS7x4. 2s=\u0014cu9\u00041VV;,XQrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0013OX\\?3p\u0010gk\nCNEr5.\u001ec*\\\u0004,(!qx$xX\u0004", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "uKR<`uL_)z\b^<\bRAi\r(E \n'\u001f#n\nG\u0006%B/d\u001eAu_<YS7x4. 2s=\u0014cu9\u00041VV;,XQrJa^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K\u0005\u0010fPa)\bSQAo*t\u0017)/`G:m\u0006u&\u001bHY>\u0012Q", "1n\\:b5+S\u0018zxm", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017'x\u001eDLh\u001cW\b(\u0001{\">IP;{?g'ln9PU0[v\u0007P\\V\u0002", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EnumAdapterKt {
    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader32 reader, Function1<? super Integer, ? extends E> fromValue) throws IOException {
        Intrinsics.checkNotNullParameter(enumAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(fromValue, "fromValue");
        int varint32 = reader.readVarint32();
        E eInvoke = fromValue.invoke(Integer.valueOf(varint32));
        if (eInvoke != null) {
            return eInvoke;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader reader, Function1<? super Integer, ? extends E> fromValue) throws IOException {
        Intrinsics.checkNotNullParameter(enumAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(fromValue, "fromValue");
        int varint32 = reader.readVarint32();
        E eInvoke = fromValue.invoke(Integer.valueOf(varint32));
        if (eInvoke != null) {
            return eInvoke;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> void commonEncode(ProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeVarint32(value.getValue());
    }

    public static final <E extends WireEnum> void commonEncode(ReverseProtoWriter writer, E value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeVarint32(value.getValue());
    }

    public static final <E extends WireEnum> int commonEncodedSize(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ProtoWriter.Companion.varint32Size$wire_runtime(value.getValue());
    }

    public static final <E extends WireEnum> E commonRedact(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }
}
