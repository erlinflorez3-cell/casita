package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN3ZS8\u0015s{:,c$\u007fOC٥\"}0ޛWȞog|JbŏK\u000f\u001c\u0016\u0001j:Y]xc\u0012\u00172XoG3SpC]vҚT*HD(\u0600\b\u0004)&:J vAB[\u000e\"0\u0007phĥ5_\u000b\u0019 \u0006f,\u0011 lg\u00155Xnm:u#1jrNUah|q2\u0007q-\u000f\u0007k,.X=E\u00175S9ޗ\u0001_O\u0007MvU\u0005\u0017-ݳ/Ky^D`H\u001f#?g\r\u0014ql\u0001ԇU`\u001a<sXqah\u000e^»ߡ\u007f\rJ\u001bV\f5`F-H\u007fN\"{z\u0001mXP0y\t\u0002CmD3=\u007faHi\u001ftoy;Gm\u007f\u007f\u0013)6#/\u000fi_b/x\u0015IZ@]?mX=vk:]K\u0010\u001cp\u0011%z\u001b>J\u00185\f\u0013>\u0017[ڛ\n=YfȠ\u0006NLϙ\u000f\u0007fkar#bN'\u0007\u0016e0?a1ռfʰo\\\\А<\u0013S&b\u0012\u0016\n\u0019%j\u0004\r93\u001dfO\u0017wAܕiܦ);nŽqpq\u001deI~5;bq\"2b\u0005'W<\u0011\u0013\u000fh\u0001Ubȝh͈&2PКށ{\""}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u001b", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007As\u001a8\u0017 Oz4\f$ueB\t9o?", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "CmZ;b>G4\u001d~\u0002]:;\u00058n\n7wO\u0005! U", "u(E", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "1`R5X+,S&\u0003ve0\u0012\t.S\u0004={", "", "5dc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017UYs\u001b<p2Eb\r$?m", "u(8", "Adc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017UYs\u001b<p2Eb\r$?m", "uH\u0018#", "6`b566=S", "<df\u000fh0ER\u0019\f", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nh\u0017%Uk\u0010<5\u0002E]\u0005\u001f7zk", "Ehc5b<MC\"\u0005\u0004h>\u0006i3e\u0007'\n", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nh\u0017%Uk\u0010<L", "BnBAe0GU", "", "EqXAX\u0019>^ zx^", "", "3mR<W,", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "", "3mR<W,\u001bg(~hm9\u0001\u00121", "Asa2T4", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&˛\bDZc|İI\u0006>é6B\u0005#4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{J$c$wICU(\u0004*ޛWN}gvJ`\u000fK\u000f\u0014\u0016\u0001̓2mkތ\u0006$\u00152Png?]qM9'sF\u000702h9(\u0005),0I\u001ew#O[\u000e\"0\u0007oJT\u001dMK\u001b@ßn / \u001dnT8Ղp_@21\u00072Z\\>w<\rO\u001dF\u000b'\u001dxq\u001eaAeߎE)a\u001b\u001fR\nEKi\u007fV\u001dt7);I*WFZ\u0010\u0014K,}Օ\u000ev4v\u001dQ\u000f'W/]\u007fcP<E(\u0001\n+T\u0006$\u0005UJv=(\u0006 \u001aCv\u0003SvP\u0012`R\u007f1bdЍm\u0004AKQ\u001b\u0015W*F'oO{;\rdGъr!ivVf#>lw\u007fU\u0018@\u000e`\\\u000fq=\u001c\nGè\u000eò\b<OĉG}\u00175%-W]?,/uRbRr\u000f\u0007vg\u0002u)̳Ḻr\"?ѧ!\u000e`Qr\u0013\fRZg:!\u001e6b\u0018\u0016\n)\u001f\u000b\n\u0013ƚ1ŎR[pȉ\u0003Oc\u001d3C\u00079_\u0004y$Č=\u0004"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "", "\nh]6g\u0005", "u(E", "CmZ;b>G4\u001d~\u0002]:Y\u001d>em7\tD\n\u0019", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "5dc\"a2G]+\b[b,\u0004\b=B\u00147{.\u0010$\u001bPqLNz25S\u000b0@|\u001a6M", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "Adc\"a2G]+\b[b,\u0004\b=B\u00147{.\u0010$\u001bPqLNz25S\u000b0@|\u001a6M", "uK^8\\6\b0-\u000ezL;\n\r8gUkl", "CmZ;b>G4\u001d~\u0002]:Y\u00190f\u007f5", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\"a2G]+\b[b,\u0004\b=B\u0010)|@\u000eU)K|\u000e6\u00045>h\u0002(7", "u(;<^0H\u001du\u000f{_,\n^", "Adc\"a2G]+\b[b,\u0004\b=B\u0010)|@\u000eU)K|\u000e6\u00045>h\u0002(7", "uK^8\\6\b0)\u007f{^9RL ", "CmZ;b>G4\u001d~\u0002]:n\u00163t\u007f5", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "5dc\"a2G]+\b[b,\u0004\b=W\r,\u000b@\u000eU)K|\u000e6\u00045>h\u0002(7", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vy\u007fIz45fS", "Adc\"a2G]+\b[b,\u0004\b=W\r,\u000b@\u000eU)K|\u000e6\u00045>h\u0002(7", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/A\u0011", "/cS\"a2G]+\b[b,\u0004\b=", "CmZ;b>G4\u001d~\u0002]:", "/cS\"a2G]+\b[b,\u0004\b", "B`V", "", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "D`[BX", "1kT.e\u001cGY\"\t\rg\r\u0001\t6d\u000e", "0tX9W\u001cGY\"\t\rg\r\u0001\t6d\u000e", "0tX9W", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nh\u0017%Uk\u0010<L", ">qT=T9>4#\fc^>l\u00125n\n:\u0005!\u0005\u0017\u001eF}", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient Buffer unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        private transient ProtoWriter unknownFieldsWriter;

        protected Builder() {
        }

        private final void prepareForNewUnknownFields() throws IOException {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new Buffer();
                Buffer buffer = this.unknownFieldsBuffer;
                Intrinsics.checkNotNull(buffer);
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                Intrinsics.checkNotNull(protoWriter);
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.EMPTY;
            }
        }

        public final Builder<M, B> addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) throws IOException {
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            Intrinsics.checkNotNull(protoWriter);
            protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i2, obj);
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString unknownFields) throws IOException {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            if (unknownFields.size() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                Intrinsics.checkNotNull(protoWriter);
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                Intrinsics.checkNotNull(buffer);
                this.unknownFieldsByteString = buffer.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() throws EOFException {
            this.unknownFieldsByteString = ByteString.EMPTY;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        public final Buffer getUnknownFieldsBuffer$wire_runtime() {
            return this.unknownFieldsBuffer;
        }

        public final ByteString getUnknownFieldsByteString$wire_runtime() {
            return this.unknownFieldsByteString;
        }

        public final ProtoWriter getUnknownFieldsWriter$wire_runtime() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(Buffer buffer) {
            this.unknownFieldsBuffer = buffer;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "<set-?>");
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00126B\u0005\"2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,6\u007fESUH\u0001xޞ\"ɁkmvϺj\rI\u0013\u0014\u0017ѷn1"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u001a\u0001-@U\u0007$Avk", "", "\nh]6g\u0005", "u(E", "Ada6T3/S&\r~h5ll\u000e", "", "5dc X9BO ozk:\u0001\u00138Uc\u0007:<\n !Vk\u001d@\u0001.C", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }
    }

    protected Message(ProtoAdapter<M> adapter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(stream, this);
    }

    public final void encode(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(sink, this);
    }

    public final byte[] encode() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encode(this);
    }

    public final ByteString encodeByteString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i2) {
        this.cachedSerializedSize = i2;
    }

    public String toString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.toString(this);
    }

    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.EMPTY : byteString;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    protected final Object writeReplace() throws ObjectStreamException {
        byte[] bArrEncode = encode();
        Class<?> cls = getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<M of com.squareup.wire.Message>");
        return new MessageSerializedForm(bArrEncode, cls);
    }
}
