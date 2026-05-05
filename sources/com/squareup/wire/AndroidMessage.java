package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.ByteString;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{B$cҕyCQU\"Ԃ*\t]TogtL`/YƤ$(!|2կcw\u0006\u001e\u001f4Ro\u00062]qM9'ud\u0005HD(7\b\u0006)&:J vAB[\u000e\"0\u0007qhT=Y\u0015\u001c\"\u0006\u0005\u001f\u0011 lg\u00157vl\u000e:]&;iS`g|6~]\u0017TX?\u0013\u0007c.+vʺc\u001a5W\u0011\rj[m\nӭu?\u000bp50s_\u0002aNX.\u001fE/]\u0019urTi5Un\u001a?+}r\u0012dV.\u0006\u000b\u0014\rj\u0013T\u001aϒLA"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqWI\u007f$!Knu<\u000531[}u", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001l", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007As\u001a8\u0017 Oz4\f$ueB\t9o?", "EqXAX\u001bH>\u0015\fx^3", "", "2dbA", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "4kP4f", "", "2db0e0;Sv\t\u0004m,\u0006\u0018=", "\u001eq^Ab\b=O$\u000ezk\n\n\t+t\n5", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑ?ӋE{߉^R\u0002)Or\u00024ż_&wCIVb\u001e0\u000bgTwi~J!\u000fq\u0012&\u0018~j:M\u0006\u0003k\u0017'8RqO3\u0014sk?'yȫ\t'"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqWI\u007f$!Knu<\u000531[}^\u0015w\u001e9IL?u=s", "", "\nh]6g\u0005", "u(E", "<df\u0010e,:b#\f", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "\u0013", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            return new ProtoAdapterCreator(adapter);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?0LeV=Zݷ2\u000fy\u0002<$a$wCQ٥B\u007f(\t]M\u0018m~Lj\u000b\n\u000e4\u00169\u007f2կe\u0003k\u0013'8RqO3\u0004ok;žx8\u000b#@&\u0001\r\u0013\u00062*~\u0010'~QQ$\u0012^G7Nň\u0011M\u0013\"Z\u001fL)\u0019$li^6~l\fD_'\u0011tZNUkv\u0011֔\u0011Fb4]\to\u001fCFG7%%\n\u00035T2έ\u0005ӭu=\rؒҐ+9"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqWI\u007f$!Knu<\u000531[}^\"z =W\u001f:g?-\u0015u?F\u0007_;X\u0004|", "\u001b", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fSc(", "1qT.g,\u001f`#\u0007eZ9z\t6", "7m_Bg", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "uKP;W9HW\u0018H\u0005lug\u0005<c\u007f/Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "<df\u000ee9:g", "", "Ahi2", "", "uH\u0018(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        private final ProtoAdapter<M> adapter;

        public ProtoAdapterCreator(ProtoAdapter<M> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.adapter = adapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel input) {
            Intrinsics.checkNotNullParameter(input, "input");
            ProtoAdapter<M> protoAdapter = this.adapter;
            byte[] bArrCreateByteArray = input.createByteArray();
            Intrinsics.checkNotNullExpressionValue(bArrCreateByteArray, "createByteArray(...)");
            return protoAdapter.decode(bArrCreateByteArray);
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i2) {
            KClass<?> type = this.adapter.getType();
            Object objNewInstance = Array.newInstance((Class<?>) (type != null ? JvmClassMappingKt.getJavaObjectType(type) : null), i2);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<M of com.squareup.wire.AndroidMessage.ProtoAdapterCreator>");
            return (M[]) ((Object[]) objNewInstance);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AndroidMessage(ProtoAdapter<M> adapter, ByteString unknownFields) {
        super(adapter, unknownFields);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
    }

    @JvmStatic
    public static final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return Companion.newCreator(protoAdapter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(encode());
    }
}
