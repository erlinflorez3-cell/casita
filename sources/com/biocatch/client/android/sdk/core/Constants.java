package com.biocatch.client.android.sdk.core;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000572\u009aw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\А|\u001d[/l\u0007,\ni\u0605/ʟ@!-ī\u001f[v}\u0003M\f\f{Ë9Ơ]nsލ(ElHMQ\u0012\u00128׳I݀C<jڳ)rPi$Z\u000b*xü\u001bн\u0014w\u0004ͩ\u001f\u0018!IWqJ6\u0003ւkÅ\u0019H\u000bٜ\u0013M\u000b!wZ\u0017\u0012Uԥ\u0006ʗ\u0007i,ڏ\u0590\u0005i"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w+MDyC\u001a\u001ewo\u000f", "", "u(E", "\u000fF4\u001bG&\"2", "", "\u000fF4\u001bG&-G\u0004^", "\u0011H3", "\u0011K8\u0012A\u001b84\u007fnhA&jr\u001fR]\b", "\u0011N=\u0013<\u000e", "\u0011N=!8\u001f-M\u0002Zb>&dh\u001eAy\t_ gu", "\u0011R8\u0011", "\u0012DE\u00166\f8A\u0003ng<\f", "\u0012DE\u00166\f8A\u0003ng<\fvp\u000fT[\"\\$`}u", "\u0012X=\u000e@\u0010\u001cM\u0007^gO\fi\u0003\u001dT[\u0017[", "\u0014KD ;&$3\r", "\u0014KD ;&,=\tkX>", "\u001aD0\u001bR\u001d\u001e@\u0007bdG", "\u001aN6,6\u0016'BxgiX\u001bps\u000f", "\u001bT8\u0011", "\u001c@C\u0016I\f81\u0003g[B\u000evn\u000fY", "\u001dSC", " D@\"8\u001a-M|]tF\fkd)Fc\bb\u001f", "!C:,9\u0013.A{xhH\u001cif\u000f", "!H3", "!S0!<\n8Axkk>\u0019vv\u001eAn\b", "%T?,6\u0016'BxgiX\u001bps\u000f", "%T?,7\b-/\u0013lZ<\u001b`r\u0018_e\bo", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Constants {
    public static final String AGENT_ID = "agent_id";
    public static final String AGENT_TYPE = "agent_type";
    public static final String CID = "cid";
    public static final String CLIENT_FLUSH_SOURCE = "c";
    public static final String CONFIG = "c";
    public static final String CONTEXT_NAME_META_FIELD = "context_name";
    public static final String CSID = "csid";
    public static final String DEVICE_SOURCE = "android";
    public static final String DEVICE_SOURCE_META_FIELD = "ds";
    public static final String DYNAMIC_SERVER_STATE = "std";
    public static final String FLUSH_KEY = "f";
    public static final String FLUSH_SOURCE = "source";
    public static final Constants INSTANCE = new Constants();
    public static final String LEAN_VERSION = "sdk_lean_version";
    public static final String LOG_CONTENT_TYPE = "binary/octet-stream";
    public static final String MUID = "muid";
    public static final String NATIVE_CONFIG_KEY = "android";
    public static final String OTT = "ott";
    public static final String REQUEST_ID_META_FIELD = "requestId";
    public static final String SDK_FLUSH_SOURCE = "sdk";
    public static final String SID = "cdsnum";
    public static final String STATIC_SERVER_STATE = "sts";
    public static final String WUP_CONTENT_TYPE = "application/json";
    public static final String WUP_DATA_SECTION_KEY = "d";

    private Constants() {
    }
}
