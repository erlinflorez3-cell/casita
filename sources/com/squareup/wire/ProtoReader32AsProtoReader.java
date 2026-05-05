package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0007\":\u0019\u007fјnjO0LeN.ZS8\u0015s{:$c$\bCC٥\"}0\tWNmgvJh\u0014K\u000f\f\u0016\u0001j:U]xc\u0019\u00172PģG3SoCʠvҚf\u0005N1bE\n\t\u000f\u001aBH>wټGM\u0012\u0014>C9@`\u0013e\u0005H\u0019LRh\u000f,d\u007fNdQ\u001daH9;\u0003\u0018I\u0015;(6\u000bX%F\u00033S\u000b*$9MO5C1\u001a\u0017OZiM\u001bA\b<3wm;sO\u0002gNX.%[?\u0018\u0013k\u0005>\\3Z' o6]vcP<<>\tԫ\u0011<\n#N-VDE\u001a\u0015\u001fTG=xaXh\u0002\rNF\u000f*<%>\u00183Y@az\u001agI3f7*\u0011S2k\u0007|<sT<g[/\u001d\u0006_Mi@kY~\u000egZ\u0006\u0004\u001fnH>LPU\u001eG{??G)ExQ#Ow2LR\u0007\u000f\u0005\u000fw\u0004o`hX$\u0005\u0015eKO #Jr'\u0004P\u0003_r%\u001e+b\u0007\u0016\bA!Ϣ{B)ط(PUlwoܽa-"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&Y.\"z =W0;g3\u001e\">", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "2d[2Z(MS", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B'Juz^", "5dc\u0011X3>U\u0015\u000ez", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyz<r$5fKl\r", "0dV6a\u0014>a'z|^", "", "3mS\u001aX:LO\u001b~Vg+^\t>U\t.\u0005J\u0013 wKo\u0015;\u0005", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "BnZ2a", "<dgA?,GU(\u0002Y^3\u0001\u00113t\u007f'", "", "<dgAG(@", ">dT890>Z\u0018^\u0004\\6{\r8g", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "AjX=", "", "@dP15@MS'", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|", "", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|LNz25S\u000b0@|\u001a6M", "@dP1F;KW\"\u0001", "", "@dP1I(KW\"\u000eH+", "@dP1I(KW\"\u000eK-", "@dP190QS\u0018LG", "@dP190QS\u0018OI", "@dP1H5D\\#\u0011\u0004?0|\u0010.", "B`V", "/cS\"a2G]+\b[b,\u0004\b", "4hT9W\fGQ#}~g.", "D`[BX", "", "<dgA90>Z\u0018f~g\u0013|\u00121t\u0003\f\u0005\u001d\u0015&\u0017U", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProtoReader32AsProtoReader extends ProtoReader {
    private final ProtoReader32 delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoReader32AsProtoReader(ProtoReader32 delegate) {
        super(new Buffer());
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.wire.ProtoReader
    public void addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        this.delegate.addUnknownField(i2, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.ProtoReader
    public boolean beforePossiblyPackedScalar$wire_runtime() {
        return this.delegate.beforePossiblyPackedScalar();
    }

    @Override // com.squareup.wire.ProtoReader
    public long beginMessage() {
        return this.delegate.beginMessage();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString endMessageAndGetUnknownFields(long j2) {
        return this.delegate.endMessageAndGetUnknownFields((int) j2);
    }

    public final ProtoReader32 getDelegate() {
        return this.delegate;
    }

    @Override // com.squareup.wire.ProtoReader
    public long nextFieldMinLengthInBytes() {
        return this.delegate.nextFieldMinLengthInBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextLengthDelimited() {
        return this.delegate.nextLengthDelimited();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextTag() {
        return this.delegate.nextTag();
    }

    @Override // com.squareup.wire.ProtoReader
    public FieldEncoding peekFieldEncoding() {
        return this.delegate.peekFieldEncoding();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString readBytes() {
        return this.delegate.readBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readFixed32() {
        return this.delegate.readFixed32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readFixed64() {
        return this.delegate.readFixed64();
    }

    @Override // com.squareup.wire.ProtoReader
    public String readString() {
        return this.delegate.readString();
    }

    @Override // com.squareup.wire.ProtoReader
    public void readUnknownField(int i2) {
        this.delegate.readUnknownField(i2);
    }

    @Override // com.squareup.wire.ProtoReader
    public int readVarint32() {
        return this.delegate.readVarint32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readVarint64() {
        return this.delegate.readVarint64();
    }

    @Override // com.squareup.wire.ProtoReader
    public void skip() throws IOException {
        this.delegate.skip();
    }
}
