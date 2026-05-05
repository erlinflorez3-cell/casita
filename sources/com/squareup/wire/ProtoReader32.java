package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jA0JgP.hS2şs{B$c$wCCU(\u0007*ޛWNusvJ`\u000bK\u000f\u0014\u001d\u0001j2P[]s܈?2pn\b9[oU9\u000fu|)h80:\u0012\u0005/\u001dplX\u0005\tGc\f@5ptHX%M3\u001dX*\u0007&\u000f%tg|9\u000f\u0011&@=+\u001bipQm\u0004x\u0005[\u0016^V=\f%kdO\t=C =S1\u0013\u0019\u007f\b\tM~U\u0005\u0017,mO\u0012yeDp\u007fB$qsUc\u00016t\u0005\u007fqRKsUq]h\u000eVzA UB\u0012!\u001e'vBs>/\u000e\u001cH\rr\u0002C\u0017&'H\u000e\u0011y6E9FWsG)}iai%~;\n\u001d%\u001eQ\u00045E$t\u001cy-\u001b\u0003\u0004\u00025_XUH|\r\nA{\u001e\tb0446U\u001bG}'-E$}\u007f\u0002)/\b\u001aHrj=)Ĕgׅ֢RLH$t5e)Ç\u0010w֦h\u0004"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "", "/r??b;H@\u0019zy^9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "0dV6a\u0014>a'z|^", "", "3mS\u001aX:LO\u001b~Vg+^\t>U\t.\u0005J\u0013 wKo\u0015;\u0005", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "BnZ2a", "<dgA?,GU(\u0002Y^3\u0001\u00113t\u007f'", "<dgAG(@", ">dT890>Z\u0018^\u0004\\6{\r8g", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "AjX=", "", "@dP15@MS'", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|", "", "@dP1F;KW\"\u0001", "", "@dP1I(KW\"\u000eH+", "@dP1I(KW\"\u000eK-", "", "@dP190QS\u0018LG", "@dP190QS\u0018OI", "@dP1H5D\\#\u0011\u0004?0|\u0010.", "B`V", "/cS\"a2G]+\b[b,\u0004\b", "4hT9W\fGQ#}~g.", "D`[BX", "<dgA90>Z\u0018f~g\u0013|\u00121t\u0003\f\u0005\u001d\u0015&\u0017U", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface ProtoReader32 {
    void addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj);

    ProtoReader asProtoReader();

    boolean beforePossiblyPackedScalar() throws IOException;

    int beginMessage() throws IOException;

    ByteString endMessageAndGetUnknownFields(int i2) throws IOException;

    int nextFieldMinLengthInBytes();

    int nextLengthDelimited() throws IOException;

    int nextTag() throws IOException;

    FieldEncoding peekFieldEncoding();

    ByteString readBytes() throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    String readString() throws IOException;

    void readUnknownField(int i2);

    int readVarint32() throws IOException;

    long readVarint64() throws IOException;

    void skip() throws IOException;
}
