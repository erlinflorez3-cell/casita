package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.Syntax;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\u007feCU(\u0004*\teNo˧vJh\u0017KƤ\u000e\u0016\u000fj4I[\u0002e\u0012%2JoE6UoK9ht<\r(288\u0002ڎ\t\u001a8Ϻ\u0018v\u0001EQ\f(ؓh\u0003@ĥ\u001bL-&\"\bN G\u001dli^6\u000fm\f:W5\thPOOk@~]\r\rS7\u000f\u0007ad,n9e!5U\u0013\u0007\u0019ZO\u0005Oq\u0004\u0006\u0017*g\rY}e:p\u0006$\u0017;OCƞ!+l\u000f_f$-;QsK\u0007\rV~\u000b\u0006\u001bD\u001c\u0014\u0016)X.c\u0019\u0015\u0011\u001eO\u0003|kX`\u0004nB.\u0007qD'1\u00105;9QƘacK\u0019\u00056*\u0012;)3\u0007|/sV$_C*d{_Ai@kYݳ\u000e[C\u007f\u0012\u0004+\u00158 HG.L,\u0015<5=7\u0012ݽi5Ƞ\u0006HR\u0007?\u0018n\tki\u0001Tp&|4O*?ȱ!X\u0081\tk^u!G\u001fo4T5!8\u0017.z\u0010<Wط@R]\r\u0002j{iP9çj7g\u00144\u0019e_v3kP*$уVv\"f\u0005u\u0013\u0001~B\nێ\u000b`6KJH!\u000f>\u0010ΌR\f!\\\b\u001f*_D1G\u007fEL\u0011GZA3\b\u0010^v<\u0017Ta03m2\"!\u0001~\u000b!uu(a.\u0013_P]\beڤ\u001d&cS1G\u000bU\u001f~\"#wkZpdlLt\u001c\u0010°\u001a\u001aG\u0005\u007fU!\u0013\u0017/B\u0004=E\u0003ǩ\u0014V$ɓ)ϸ\u0001\u007f\u0017\u0090\u00010m\u001cx\u0006|rxPgZ'$\u0007^)\"6kVכcâ~GkҺ[mLQ\u000b\ti>^83\u0004M'{˝qݕ\u000155ξwG$\u0002,G%cmi\u001e:\np\u001f2\u0005g\u0014,\u001aܞ\u007fda]h:fV\b\n\u0015ф&к\u0007HP۳\u0010\nH\u001fB$\u0004\\Or\tXNL9>T֜\tՐ\u0011v^ܪR\u0015u\u0016BG0<\u0002S\u0016\u0014\rT{ݥOϬksuжt\rP)\u0018&ֳ5#"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006c5>h\u0002(7U\u0016<[?=k\u0011\"\u001egeB\t9", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006^%Cgy\"7J\u001a7LGDm\n", ";db@T.>B-\nz", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "0tX9W,KB-\nz", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "1qT.g,\u001bc\u001d\u0006y^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4hT9W:", "", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "Bx_2H9E", "", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "\nh]6g\u0005", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.t\nMrn<U\u0007\"\u0001K\u001d*[Q\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\fyUI30\u0004uY\u0011?oJs\u0012\u0019\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,`4lUm)l6G$$|b-l].Sig\u001a\u0002N\r=+8", "5dc\u001aX:LO\u001b~ir7|", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "5dc\u0013\\,ER'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc!l7>C&\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc l5MO,", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nn+ Vk!\u0012", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", ";db@T.>", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012:\f?_\u0002*\u0001J*=M1Jx8'\u0017>", "5dc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012:\t", "Adc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017", "", "Ahi2", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012Zh&", "<df\u000fh0ER\u0019\f", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nh\u0017%Uk\u0010<5\u0002E]\u0005\u001f7zk", "0tX9W", "0tX9W,K", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DCY\u0015KMC5B*%dn9\u0017nu`z4G\u00166,j`n?\u0014g", "/cS\"a2G]+\b[b,\u0004\b", "B`V", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "D`[BX", "", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DCy\u0015KMC5B*%dn9\u0017nu`z4G\u0016/0\\Yq\u001d\u001d\u0010d\rR4\u000fZ@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b.a", "1kT.e\u001cGY\"\t\rg\r\u0001\t6d\u000e", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DCY\u001f", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class RuntimeMessageBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> implements MessageBinding<M, B> {
    private final Class<B> builderType;
    private final Function0<B> createBuilder;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final KClass<M> messageType;
    private final Syntax syntax;
    private final String typeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeMessageBinding(KClass<M> messageType, Class<B> builderType, Function0<? extends B> createBuilder, Map<Integer, ? extends FieldOrOneOfBinding<M, B>> fields, String str, Syntax syntax) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        Intrinsics.checkNotNullParameter(createBuilder, "createBuilder");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.messageType = messageType;
        this.builderType = builderType;
        this.createBuilder = createBuilder;
        this.fields = fields;
        this.typeUrl = str;
        this.syntax = syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void addUnknownField(B builder, int i2, FieldEncoding fieldEncoding, Object obj) throws IOException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        builder.addUnknownField(i2, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public M build(B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return (M) builder.build();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void clearUnknownFields(B builder) throws EOFException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.clearUnknownFields();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public int getCachedSerializedSize(M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return message.getCachedSerializedSize$wire_runtime();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public KClass<M> getMessageType() {
        return this.messageType;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Syntax getSyntax() {
        return this.syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public String getTypeUrl() {
        return this.typeUrl;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public B newBuilder() {
        return this.createBuilder.invoke();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void setCachedSerializedSize(M message, int i2) {
        Intrinsics.checkNotNullParameter(message, "message");
        message.setCachedSerializedSize$wire_runtime(i2);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public ByteString unknownFields(M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return message.unknownFields();
    }
}
