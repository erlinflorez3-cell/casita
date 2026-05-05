package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172XoG\u074cS\u001eSʠ\u0011td\u0004X2:Q:\n\u0007\u001cݵL\u0010\u0005z\fr\u001a\u0017H@7@r\u000fSĨ(\u00186H.\b6bwPFH3ch7S\u0007wKf'\u000e:CqϘJT5\u0018?s,7X=E\u00175S1\u0006\u0001ho\u0007M\u007fU\u0005\u00176oZW\u0004o6\u0007\u00114\u00171˽\u001bc#*j\u0017i`::[Yq_h\u00148y\u000b{SB2#6+VDE\u001a-\u000eTWϢvSNgRnP\u0001\u0013ad\u0019{œ5ڢ=\u001f~Sg>'Rќz\u0005'9ũ\u0005\u000b"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "", "u(E", "4na:T;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128}\u0006?f\u0006\u001cFC", "5dc\u0013b9FO(", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011]\u000eIz!<:\b-?i%\u0004", "4q^:E,L^#\b\t^\t\u0007\bC", "\"", ":nP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmm2Q\u00066R\u001a\u0018\u0019\\`}G\u001d ZjX*!Z\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "Bx_2", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", "BnA2d<>a([\u0005]@", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "A`e2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uK^8[;M^fHb^+\u0001\u0005\u001ey\u000b(Q'\u0007!&Ns\u0017O@35f\u0002\u001c>q+*\\GEt}\f\u0015ue5\u000egAJ\u0006+QU<;iN\u0002=\u0016&0tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>Dr \u00148y\u007fM$Y4y!\u0006A7w#c^\u000e\u001d", "\u0014q^:5@MS'", "\u0014q^:F;KW\"\u0001", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aC:N.v!K.\b:\u001f", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aC:N.v2F,\f5KW", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Serializer {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4F\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*\tUO}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8fAR\b=\u007ff\u00158\u000bړ@(h\u0004\u0013\b20X\u0012\u0007z\nQ:\u001a`D~Cj\r{\u000f`&ĂB \u000f)%\u0017\\B`l\fGO%\t݃PTWc>\u000be\rtcW\u0017\u0005q61P9E\u0015kY1\u0018\u0003_M\u0015Wq\u0004\u000b/;ݳ/I\u0002j\u0007j\u000e\u0014-+}\u000e4ċ(ػ\tWhϯ?-UfYT˔,\f"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aC:N.v!K.\b:\u001f", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "4na:T;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`sKx\nI\u000b\u0006?f\u0006\u001cFC", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `$s\u00178\u00049\u0016c\u000b(3|kq>", "5dc\u0013b9FO(", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011L\u0012Er2I:\b-?i%\u0004", "4q^:E,L^#\b\t^\t\u0007\bC", "\"", ":nP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmm2Q\u00066R\u001a\u0018\u0019\\`}G\u001d ZjX*!Z\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "BnA2d<>a([\u0005]@", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "A`e2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uK^8[;M^fHb^+\u0001\u0005\u001ey\u000b(Q'\u0007!&Ns\u0017O@35f\u0002\u001c>q+*\\GEt}\f\u0015ue5\u000egAJ\u0006+QU<;iN\u0002=\u0016&0tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>Dr \u00148y\u007fM$Y4y!\u0006A7w#c^\u000e\u001d", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FromBytes extends Serializer {
        private final BinaryFormat format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromBytes(BinaryFormat format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.format = format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> T fromResponseBody(DeserializationStrategy<? extends T> loader, ResponseBody body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            byte[] bArrBytes = body.bytes();
            Intrinsics.checkNotNullExpressionValue(bArrBytes, "body.bytes()");
            return (T) getFormat().decodeFromByteArray(loader, bArrBytes);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public BinaryFormat getFormat() {
            return this.format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> RequestBody toRequestBody(MediaType contentType, SerializationStrategy<? super T> saver, T t2) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            RequestBody requestBodyCreate = RequestBody.create(contentType, getFormat().encodeToByteArray(saver, t2));
            Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "create(contentType, bytes)");
            return requestBodyCreate;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4F\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*\tUO}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8fAR\b=\u007ff\u00158\u000bړ@(h\u0004\u0013\b20X\u0012\u0007z\nQ:\u001a`D~Cj\r{\u000f`&ĂB \u000f)%\u0017\\B`l\fGO%\t݃PTWc>\u000be\rtcW\u0017\u0005q61P9E\u0015kY1\u0018\u0003_M\u0015Wq\u0004\u000b/;ݳ/I\u0002j\u0007j\u000e\u0014-+}\u000e4ċ(ػ\tWhϯ?-UfYT˔,\f"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aC:N.v2F,\f5KW", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "4na:T;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005V|\u0012Ex\u0006?f\u0006\u001cFC", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5~\u001b@\u007f'\u0016c\u000b(3|kq>", "5dc\u0013b9FO(", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011]\u001dIz.7:\b-?i%\u0004", "4q^:E,L^#\b\t^\t\u0007\bC", "\"", ":nP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmm2Q\u00066R\u001a\u0018\u0019\\`}G\u001d ZjX*!Z\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "BnA2d<>a([\u0005]@", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "A`e2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uK^8[;M^fHb^+\u0001\u0005\u001ey\u000b(Q'\u0007!&Ns\u0017O@35f\u0002\u001c>q+*\\GEt}\f\u0015ue5\u000egAJ\u0006+QU<;iN\u0002=\u0016&0tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>Dr \u00148y\u007fM$Y4y!\u0006A7w#c^\u000e\u001d", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FromString extends Serializer {
        private final StringFormat format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromString(StringFormat format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.format = format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> T fromResponseBody(DeserializationStrategy<? extends T> loader, ResponseBody body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            String strString = body.string();
            Intrinsics.checkNotNullExpressionValue(strString, "body.string()");
            return (T) getFormat().decodeFromString(loader, strString);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public StringFormat getFormat() {
            return this.format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> RequestBody toRequestBody(MediaType contentType, SerializationStrategy<? super T> saver, T t2) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            RequestBody requestBodyCreate = RequestBody.create(contentType, getFormat().encodeToString(saver, t2));
            Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "create(contentType, string)");
            return requestBodyCreate;
        }
    }

    private Serializer() {
    }

    public /* synthetic */ Serializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T> T fromResponseBody(DeserializationStrategy<? extends T> deserializationStrategy, ResponseBody responseBody);

    protected abstract SerialFormat getFormat();

    public final KSerializer<Object> serializer(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(getFormat().getSerializersModule(), type);
    }

    public abstract <T> RequestBody toRequestBody(MediaType mediaType, SerializationStrategy<? super T> serializationStrategy, T t2);
}
