package com.biocatch.client.android.sdk.techicalServices;

import android.webkit.URLUtil;
import com.biocatch.client.android.sdk.contract.BCProtocolType;
import com.biocatch.client.android.sdk.core.exceptions.URLFormatException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007nj?0LeV7ZS0\u000fqە4:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7fh\u0010[\u000f4\u0018)n:Omx\f\u0014?6PvW3{wm=n}N\u0005N4jF\b\u000f\u0019\u001aXS@z\tOc\f@2\u0007p\u000b^\u001bN\u001d\u001a@\b\u0015ī\rɉ`gVȤ\u0019xk=G#1k\u0019úyۢ4|Uε\u0017`5\u0011\u000faL-\u0017ʽ\bչ)S\u000bޗҡ_L"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001c;]\u0004WPU+\\_H", "", "u(E", ">q^Ab*HZ", "", "@ndAX\u001d\f", "@ndAX\u001d\r", "0tX9W", "AdaCX9.@\u007f", "AdaCX9\u001a^\u001dezo,\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{\u007fukH\u0011a6Ue;RL$", "1hS", "6`b\u001de6M]\u0017\t\u0002", "", "Cq[", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class URLBuilder {
    public static final URLBuilder INSTANCE = new URLBuilder();
    private static String protocol = "https";
    private static final String routeV3 = "/client/v3.1/web/wup";
    private static final String routeV4 = "/api/v4/wup";

    private URLBuilder() {
    }

    private final boolean hasProtocol(String str) {
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public final String build(String serverURL, BCProtocolType serverApiLevel, String cid) throws URLFormatException {
        Intrinsics.checkNotNullParameter(serverURL, "serverURL");
        Intrinsics.checkNotNullParameter(serverApiLevel, "serverApiLevel");
        Intrinsics.checkNotNullParameter(cid, "cid");
        if (serverURL.length() == 0) {
            throw new URLFormatException("Invalid server URL. Parameter is empty", null, 2, null);
        }
        String string = (hasProtocol(serverURL) ? new StringBuilder() : new StringBuilder().append(protocol).append("://")).append(serverURL).append(serverApiLevel == BCProtocolType.V3 ? routeV3 : routeV4).append("?cid=").append(cid).toString();
        try {
            new URL(string);
            return string;
        } catch (Exception unused) {
            throw new URLFormatException("Invalid wup server url structure, Invalid Address field " + serverURL, null, 2, null);
        }
    }
}
