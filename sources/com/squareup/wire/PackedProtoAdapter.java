package com.squareup.wire;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004O$8\u000b4D\u0007\":\u0012\u007fјnjO0L͜P.`Y2şs{J$c$wFCU0}*\teNogtJ`ŏYƤ.\u0018~̓:H\u0006\u0005m\u001a\u001f8RqO3\u0014nk:\u000ftv\u00180<0:\u0012\u000b\u0011\u001c:HF͌)Cƚ\u0010\u00146C~>\u001b3[\n2\u00124DP\u0005,c\u007fNdP\u001daH8;\u0003\u0018L~3m;\u0015U\u001dHd'CǸw\u001dYA}I]Ka\b\u001fR\nE3C\u007fD\u001dhU3[M\u0002`NX.\u001eE7]\u0018uz6^\u0015Q\u0017ϯ=*}d\u0012dV<\u0006\b\u0014\rj\u000e>\u00105SF3*h\u0018\u000eiο!T\u0007dJ|P\u000e\u0013ad!U\u0004A4Q\u001b\u0015[\u0012G'YO\u0004\u0015\u000f.#7͙7Z\u0003\u000f')cp\u0006`IQnCxR\u0018`Um2x\u0013\f8\u000fHM\u00101\f\u0011dϏS8\"Mk=y\u0011`D\u0016|5dvZ\u0002RvLRx$BB\u000f\u001c\\Td;ߘ~U\u001f@Ya*d\u001f\u0004\u0018\u00150\\.˓O&@R]y\u0002j{oP9wzEi\u0007q\u001eYI^i̐\u007fd@e`\b,?juKl/\\a rb8$BH!ݘ&|tX\u001a\u001eJE\u0002\u001eD,gǉ\u000b\u0016\u000f\u0017nTO~!ejj ~\u000b՜R\u0003@ˈv֊\u0005Pdʙ\u05fak\u000e"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqf<~\u001d\u0017FZ\u001bF\u0006/\u0011Xy+Fm#\u0004", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "=qX4\\5:Zt}vi;|\u0016", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fSc(", "3mR<W,0W(\u0002iZ.", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "B`V", "", "D`[BX", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "3mR<W,=A\u001d\u0014z", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "3mR<W,", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class PackedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackedProtoAdapter(ProtoAdapter<E> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(List.class), null, originalAdapter.getSyntax(), CollectionsKt.emptyList(), null, 32, null);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> decode(ProtoReader32 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return CollectionsKt.listOf(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return CollectionsKt.listOf(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, List<? extends E> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.originalAdapter.encode(writer, value.get(i2));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, List<? extends E> value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int size = value.size() - 1; -1 < size; size--) {
            this.originalAdapter.encode(writer, value.get(size));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i2, List<? extends E> list) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i2, List<? extends E> list) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i2, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(List<? extends E> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        int iEncodedSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iEncodedSize += this.originalAdapter.encodedSize(value.get(i2));
        }
        return iEncodedSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i2, List<? extends E> list) {
        if (list == 0 || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> redact(List<? extends E> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CollectionsKt.emptyList();
    }
}
