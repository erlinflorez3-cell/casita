package com.facebook.imagepipeline.producers;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.ImagePipelineConfigInterface;
import com.facebook.imagepipeline.request.ImageRequest;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004Oي8\u000b4C\u0007\":\u001e\u007f\u0007lkA0ZeP.XT2\u000f\u0002{<$a%yCI^\"}(\nWN}gvJ`\fK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HrG3[oEʠhtL\u0005(2(:\u007fi\u0017ɝZH>uCQY.*0n\u0014jV\u001bq\u001d\u001a@+\u0005DI.j\u000ef6v\u0010\u000e@=J\u001bkXMUdv!\u0016'Tz?\r%\u0005N1N^M\u0017;R1\f\u0003aM+WsS\u0004\u0017,mO\u001a\u0004e6p\u007fB\u0016\u0002̤\u000fǁv*t\u0007Wb\u001a*{_qOh\u000eV|Qԯ\u000fʀ\b\u0012\u001e)N4;!7\u0018\u001c;\rr\u0002I'ك`۰\u0004~y8\u001d/\u000e>{I)riai&%Ҁ}˿\u0011\";\u0003t/ic^p#+lw\u007fB(͜?˓R\u000eq?s\u0014~tR:\u0012C_\u007f]\rgѫ\u0019É;_Q%'~\u0010Z\u0015w\u0005\u0019xh\u0002~)͙Ḇr\u001aO,\u000f\"h[5\u0015yhlXZ*$ɣVΘ\u0002\f+\"b\u0012J<u \\k\u0001i\u0019j4ܪ'çj;qpq,eX/ECq{\u0012wQ%\u0019\u0016סdۖ\\jZU\u0012{j/Ϙ6q"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\t\u001b\u0016Fv\u000eNr25#`\u001cEM)=Z?\u001agC\u001aj", "1`[9X9\u001c]\"\u000ezq;", "", "5dc\u0010T3ES&\\\u0005g;|\u001c>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7c", "", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7lP4X\u0017B^\u0019\u0006~g,Z\u00138f\u0004*", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PZ0VL[-XPr\u0013", "5dc\u0016`(@S\u0004\u0003\u0006^3\u0001\u0012/C\n1|D\u0003", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9dm5Oz)+U],iSn;\u0014g", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "5dc\u0016`(@S\u0006~\u0007n,\u000b\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnBY\n07{%w1K7m4\u000b\u0015tq9\u0015r\u0002", "7r8;g,K[\u0019}~Z;|u/s\u0010/\u000b \u0014\"\u0017E~\u000e;", "", "u(I", "7r??X->b\u0017\u0002", ":nf2f;)S&\u0007~m;|\b\u001ce\f8{N\u0010}\u0017Xo\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoHEP,Z\u0007'U[5,mRy\u0013", "5dc\u0019b>>a(izk4\u0001\u0018>e~\u0015{L\u0011\u0017%VV\u000eMv,", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnBY\n07{%w1K7m4\u000b\u0015tq9\u0015rj;v3WL\\;CR\u0004=\u001bg", ">qX<e0Mg", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001X#2WP?zHs", "5dc\u001de0H`\u001d\u000e\u000f", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u0006(Av_\u0019ZGEx8-)>", ">q^1h*>`\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015uH=\u0015r,Wv4\u0014\"", "5dc\u001de6=c\u0017~\bE0\u000b\u0018/n\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faFmg:]v0GY\u001b\u0002", "Ch2<`7H\\\u0019\b\nB+", "5dc\"\\\nH[$\t\u0004^5\fl.", "/cS\u0010T3EP\u0015|\u0001l", "", "1`[9U(<Y'", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006\u0005CSU)XPxKi", ">tc\u001ce0@W\"^\u000em9x", "=qX4\\5", "AtQ0T;>U#\f\u000f", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ProducerContext extends HasExtraData {
    void addCallbacks(ProducerContextCallbacks producerContextCallbacks);

    Object getCallerContext();

    String getId();

    ImagePipelineConfigInterface getImagePipelineConfig();

    ImageRequest getImageRequest();

    ImageRequest.RequestLevel getLowestPermittedRequestLevel();

    Priority getPriority();

    ProducerListener2 getProducerListener();

    String getUiComponentId();

    boolean isIntermediateResultExpected();

    boolean isPrefetch();

    void putOriginExtra(String str);

    void putOriginExtra(String str, String str2);
}
