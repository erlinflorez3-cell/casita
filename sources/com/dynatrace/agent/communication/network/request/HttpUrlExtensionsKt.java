package com.dynatrace.agent.communication.network.request;

import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!,u\bDJe|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG7LeN.ZS@\u000fs{:$c$\u007fSC٥\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001j:O]xc\u0012\u00172XoG3SoU[nwN\u0005N6J8(\t1\u001e8M(v)I{\u0010 7XphQ=Q\u0013\"*\u0006l)GȦt}\\@`l\f>W#1mrV-_>\be\u000f\\SU\u0019=ѭ6]NDM\u0015SW+\u0007\u0001_o\u0007M\u007fU\u0005\u00176W/W\u0004o6\u0007\u0011D\u001b9a%_\t%\u000b\u0004\u0002j\u001a:CUsM`\u000eV\u0001)\u0010Sɝ\u001c)\u0014<`.[\u001e\u000f\b<7%zY@^\u0018vD\u0016y\u0010M]ӛő7+G3~[oT1Ne\u0016-\rL'G͙9eb)x\u0015IS Q_`\u0007׀hZ\u0018ԯUm2o9̦|˙4G\b\u07fc\u001c\u001d<\u0017=7\n8yܬ>ɘLDoϸ%lvT\u0002Rv?xÅh֖.\t\u0014ɮdp\u0013mhT\u0007+g۶nΤ\u000b}\u0010ʶا`\u0014"}, d2 = {"\u0010D0\u0010B\u00158B\riZ", "", "\u001eQ>!B\n(:\u0013oZK\u001a`r\u0018", "\"D2\u0015A\u0016%=zrtM gh", "\u0011N=!8\u0015-M\bre>", "/cS\u000fT:>?)~\br\u0017x\u0016+m\u007f7{M\u000f", "\u001anZ5g;I!ba\nm7l\u00166$\\8\u007fG\u007f\u0017$\u001d", "3mS\u001db0Gb|\b{h", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "Dda@\\6G", "@de6f0H\\", "", "/cS\u001fX;Kg\u0005\u000fzk@g\u0005<a\b(\u000b@\u000e%", "@dc?l\u0010GT#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}&\u001fga@PP,]\u0004;+UO62", "/cS\u000fb+R?)~\br\u0017x\u0016+m\u007f7{M\u000f", "0nSF", "", "1n\\=e,La\u001d\t\u0004", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015tq9\u0015ru,\u0001/RYN:jV|Fi", ">qX<e0Mg", "Bh\\2F;:[$`zg,\n\u0005>o\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/cS X9OS&byI(\n\u00057e\u000f(\t", "AdaCX9\"R", "", "uK^8[;M^fH]m;\bx<l>\u0005\fD\b\u0016\u0017TEtAr61#\u0005\u001c@o_\u0012VR;m4+j,HC\rf;]\u0002t\u0011/];gB\u007fDRnj\u0012U*\r\u0012/", "0tX9W\u001eBb\u001cj\u000b^9\u0011f2e}.\nP\t", "\u001anZ5g;I!ba\nm7l\u00166;", "5d]2e(MSv\fx</|\u00075s\u00100", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class HttpUrlExtensionsKt {
    private static final String BEACON_TYPE = "mb";
    private static final String CONTENT_TYPE = "event";
    private static final String PROTOCOL_VERSION = "4";
    private static final String TECHNOLOGY_TYPE = "android";

    public static final HttpUrl.Builder addBaseQueryParameters(HttpUrl.Builder builder, EndPointInfo endPointInfo, String version, long j2) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(endPointInfo, "endPointInfo");
        Intrinsics.checkNotNullParameter(version, "version");
        builder.addQueryParameter("ty", BEACON_TYPE);
        builder.addQueryParameter("pv", PROTOCOL_VERSION);
        builder.addQueryParameter("tt", "android");
        builder.addQueryParameter("av", version);
        builder.addQueryParameter("ai", endPointInfo.getApplicationId());
        builder.addQueryParameter("cr", String.valueOf(j2));
        return builder;
    }

    public static final HttpUrl.Builder addBodyQueryParameters(HttpUrl.Builder builder, byte[] body, Compression compression, String str, Function0<Long> timeStampGenerator) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(compression, "compression");
        Intrinsics.checkNotNullParameter(timeStampGenerator, "timeStampGenerator");
        builder.addQueryParameter("cy", "event");
        if (str != null) {
            builder.addQueryParameter("pr", str);
        }
        builder.addQueryParameter("bc", generateCrcChecksum(body));
        if (compression != Compression.UNCOMPRESSED) {
            builder.addQueryParameter(Constants.COLLATION_EXTENSION_KEY_SHORT, compression.getDescription());
        }
        builder.addQueryParameter("st", String.valueOf(timeStampGenerator.invoke().longValue()));
        return builder;
    }

    public static final HttpUrl.Builder addRetryQueryParameters(HttpUrl.Builder builder, RetryInfo retryInfo) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (retryInfo == null) {
            return builder;
        }
        builder.addQueryParameter("rc", String.valueOf(retryInfo.getCount()));
        if (retryInfo.getReason() != null) {
            builder.addQueryParameter("rr", retryInfo.getReason());
        }
        return builder;
    }

    public static /* synthetic */ HttpUrl.Builder addRetryQueryParameters$default(HttpUrl.Builder builder, RetryInfo retryInfo, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            retryInfo = null;
        }
        return addRetryQueryParameters(builder, retryInfo);
    }

    public static final HttpUrl.Builder addServerIdParameter(HttpUrl.Builder builder, Integer num) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (num != null) {
            builder.addQueryParameter("si", String.valueOf(num.intValue()));
        }
        return builder;
    }

    public static /* synthetic */ HttpUrl.Builder addServerIdParameter$default(HttpUrl.Builder builder, Integer num, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            num = null;
        }
        return addServerIdParameter(builder, num);
    }

    public static final HttpUrl buildWithQueryChecksum(HttpUrl.Builder builder) {
        byte[] bArrEncodeToByteArray;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        HttpUrl httpUrlBuild = builder.build();
        String strEncodedQuery = httpUrlBuild.encodedQuery();
        return httpUrlBuild.newBuilder().addQueryParameter("qc", (strEncodedQuery == null || (bArrEncodeToByteArray = StringsKt.encodeToByteArray(strEncodedQuery)) == null) ? null : generateCrcChecksum(bArrEncodeToByteArray)).addQueryParameter(ViewProps.END, "1").build();
    }

    public static final String generateCrcChecksum(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return String.valueOf(crc32.getValue());
    }
}
