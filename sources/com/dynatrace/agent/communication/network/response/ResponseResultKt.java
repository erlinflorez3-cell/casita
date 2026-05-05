package com.dynatrace.agent.communication.network.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,o\bDJk|\u0004O\u000f8\u000bDB\u0007\"2\u0015\u0010\u0011tsQ0rop.\u0001^pş\u0004\u0006B0s$ McUH\thޛgXut\u0007J\t\u0015k\u000f4!?̓DSc\u0007u\u0012=<jom>\u0014ڎUCn\u0004N\u0005N<J8(\u0010GɝJT\u001e͌\u0013Cy\u000bhؖ\u0013¤>R\u0015˟%& \u0006V /\u001d3ɤ!ɇLleŽO/\u0011jZNU^\u0007Ū ϘJT/˙\u0017m,-X7c\u0014{وU\u07baV[Gš_}K\b\u0001'U* ֘*͏\\\u007f\u001cƃK[\u001ba\u000b&\u000b\u0004(ӣ^ˏ/Ok֟p\u001a6|\u0013{;;Z\u05fdXόL.5Կ\u0007\u0014\u001c9\rr\u0002?'؟1۰\u0004ziا71\u000e:C9Ie(Ĩ\u000eϭR7\u0004˜-*1\t\u0007!\nSd֮gôXwYĸҮDM"}, d2 = {"\u001dJN\u001f8\u001a)=\u0002lZX\nfg\u000f", "", "\"N>,@\b'G\u0013kZJ\u001c\\v\u001eSy\u0015[.k\u0001\u007f5O\b\u001a`\u0004\u0015", "\u001bDC\u0015B\u000b8<\u0003mt:\u0013cr!E^\"h n\u0002\u00010]m6T\u000f\u00149", "!DA#<\n\u001eM\tgVO\b`o\u000bBf\bu-`\u0005\u00021X{\u001cp\u0003\u001f8]", "\u0017MC\u0012E\u0015\u001a:\u0013^gK\u0016i\u0003\u001cEm\u0013e)nv\u0011%Yl\u001c", "\u001aD=\u0014G\u000f8@xjjB\u0019\\g)R_\u0016f*i\u0005vAMw\u001bV", "\u0011N=!8\u0015-M\bhdX\u0013Xu\u0011Ey\u0015[.k\u0001\u007f5O\b\u001a`\u0004\u0015", "\u0014NA\u000f<\u000b\u001d3\u0002xg>\u001agr\u0018S_\"Y*_v", "\u0010@3,E\f*CxliX\u0019\\v\u001aOh\u0016[:^\u0001u'", "\u000fB2\u0012C\u001b\u001e2\u0013kZL\u0017fq\u001dEy\u0006e\u001f`", "7rC<b\u0014:\\-kzj<|\u0017>", "", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "7r<2g/HR\u0002\t\n:3\u0004\u0013Ae~", "7rBBV*>a'", "7rD;^5He\"\\\u0005],", "7rD;X?IS\u0017\u000ez]\f\n\u00169r", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ResponseResultKt {
    private static final int ACCEPTED_RESPONSE_CODE = 202;
    private static final int BAD_REQUEST_RESPONSE_CODE = 400;
    private static final int CONTENT_TOO_LARGE_RESPONSE_CODE = 413;
    private static final int FORBIDDEN_RESPONSE_CODE = 403;
    private static final int INTERNAL_ERROR_RESPONSE_CODE = 500;
    private static final int LENGTH_REQUIRED_RESPONSE_CODE = 411;
    private static final int METHOD_NOT_ALLOWED_RESPONSE_CODE = 405;
    private static final int OK_RESPONSE_CODE = 200;
    private static final int SERVICE_UNAVAILABLE_RESPONSE_CODE = 503;
    private static final int TOO_MANY_REQUESTS_RESPONSE_CODE = 429;

    public static final boolean isMethodNotAllowed(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.code() == 405;
    }

    public static final boolean isSuccess(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.code() == 200;
    }

    public static final boolean isTooManyRequest(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.code() == TOO_MANY_REQUESTS_RESPONSE_CODE;
    }

    public static final boolean isUnexpectedError(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return isMethodNotAllowed(response) || isUnknownCode(response);
    }

    public static final boolean isUnknownCode(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return (response.code() == 405 || response.code() == TOO_MANY_REQUESTS_RESPONSE_CODE || response.code() == 200 || response.code() == 503 || response.code() == 500 || response.code() == 411 || response.code() == 413 || response.code() == 403 || response.code() == 400 || response.code() == 202) ? false : true;
    }
}
