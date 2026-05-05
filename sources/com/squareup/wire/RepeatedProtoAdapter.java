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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004O$8\u000b4D\u0007\":\u0018\u007f\u0007llA0ReP\u008cZS@\u000fs{J$c$wDCU0}*\teNogtJ`ŏYƤ.\u0018~̓:H\u0006\u0005m\u001a\u001f8RqO3\u0014nk:\u000ftv\u00180<0:\u0012\u000b\u0011\u001c:HF͌)Cƚ\u0010\u00146C~>\u001b![\n2\u00124DP\u000b,c\u007fTFJ|]pǂQ\u00040V\u0017Em8\u0015M;L\u0005+\u001b\u007fy\u001eYFgA#,k\u000b\u0017Tk?9ӊ\b<3im;se\u0002aNX.\u001fE/]\u0019urTi5[n\u0013?1_e[PDߊ&{B!\u0005 \u001c\u0010?H\\8Jj\u0016\u001aKt!apZ\u0010eZ\u0006\u000bcF\u0017[Įa,\u007f//woJ1Ne\u00075\u0011,/\u0019nOh\u0005\u0012n\u001e3T&Wa]ND`V\u001a[Mm:͏x\u0001X\u0005v[HU\n F\u0017SB\f=1-\u0004\u0002vR\u0018z\u0013i\u0001S\u0018XxL0u.?:\u000b\u001cZzߟ\u001bj~U\u001f@Ya*d\u001f\u0004\u0018\u00150\\.˓O&@R]y\u0002j{oP9wzEi\u0007q\u001eYI^i̐\u007fd@e`\b,?juKl/\\a rb8$BH!ݘ&|tX\u001a\u001aJE\u0002\u001eD,gǉ\u000b\u0016\u000f\u0017nTO~!ejj ~\u000b՜R\u0003@ˈv֊\u0005Pdʙ\u05fak\u000e"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\f\u0017\u0013Vo\r'\u0004/DcY\u001f3x%.Z\u0019", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "=qX4\\5:Zt}vi;|\u0016", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fSc(", "3mR<W,=A\u001d\u0014z", "", "D`[BX", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "B`V", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "3mR<W,0W(\u0002iZ.", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "@dS.V;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RepeatedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatedProtoAdapter(ProtoAdapter<E> originalAdapter) {
        super(originalAdapter.getFieldEncoding$wire_runtime(), Reflection.getOrCreateKotlinClass(List.class), null, originalAdapter.getSyntax(), CollectionsKt.emptyList(), null, 32, null);
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
    public void encode(ProtoWriter writer, List<? extends E> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, List<? extends E> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i2, List<? extends E> list) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.originalAdapter.encodeWithTag(writer, i2, list.get(i3));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i2, List<? extends E> list) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; -1 < size; size--) {
            this.originalAdapter.encodeWithTag(writer, i2, list.get(size));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(List<? extends E> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i2, List<? extends E> list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int iEncodedSizeWithTag = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iEncodedSizeWithTag += this.originalAdapter.encodedSizeWithTag(i2, list.get(i3));
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> redact(List<? extends E> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CollectionsKt.emptyList();
    }
}
