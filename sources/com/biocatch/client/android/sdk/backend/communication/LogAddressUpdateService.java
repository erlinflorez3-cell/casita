package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.client.android.sdk.BuildConfig;
import com.biocatch.client.android.sdk.core.CidCache;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import com.biocatch.client.android.sdk.wrappers.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`_2şs{J$c$wCCU0}*ޛWNugvJ`\u000bIƤ\u001cǝ)jZH\u0016\u0014m\u0016\u001d2Zom4]sK;xtd\b060<\u0012\u0005/\u001fݵL\u0010\u0005\u0001\fQ\u001a\u001bH@\u001fD\u0019\r\u0016\t(\u001d\u001e>N\u000bfpuZNV|_J/Q\u000byF^)u/+U;S\u001b'U\u0003o,C@eDE)a\u0013\u001fR\nGSK\u007f?\u001dhU*\u0002ɡuɱ:X\bϬe7]\u0011urTa[ĬbВ++WҪ\u001c\\\u001c(\u0010z*\u000e\u0013ǌ\u0010Ν+H6Ʀjt\u0016\u0015Kv\tRnXXތNȸ~a>ЍԄ\u0004D"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.8QqJ\u0014 h}Y*\t\u0014Y/${U;\u001d\b\u0002", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1hS\u0010T*AS", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w+G:I0\u001c\u0018h7", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/(\"xL\u0001\u001c\f6G}Jf\u0004U\u0014\u00159jyQ \fPx\"\u007fE(2TXeCEKRbsB\u0010^zX8=$iX\u0017%p\u001a+\u000e\u0006Q\r\u0002P|1eN\u001dzA3\bidERyY;>5\u001eQEt\u000e0^t4sv\u0002>2>t\u000eOe\u0014Mb\u0003\u001eu:H+&?K\u0001?YqyvG{w\u001bp\bc&&", "4hg2W\u001cKZ", "", "@db<_=>0\u0015\rzN9\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5$\u000b{>", "@db<_=>:#\u0001V]+\n\t=s", "@db<_=>A\u0019\r\tb6\u0006s+r{0\n", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "Adc\u0013\\?>R\t\f\u0002", "", "Cq[", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogAddressUpdateService {
    private final CidCache cidCache;
    private final ClientSessionState clientSessionState;
    private final ConfigurationRepository configurationRepository;
    private String fixedUrl;

    public LogAddressUpdateService(ConfigurationRepository configurationRepository, CidCache cidCache, ClientSessionState clientSessionState) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(cidCache, "cidCache");
        Intrinsics.checkNotNullParameter(clientSessionState, "clientSessionState");
        this.configurationRepository = configurationRepository;
        this.cidCache = cidCache;
        this.clientSessionState = clientSessionState;
    }

    private final URL resolveBaseUrl() throws SDKException {
        String string = this.fixedUrl;
        if (string == null) {
            string = this.configurationRepository.getString("logAddress");
            if (string.length() == 0) {
                throw new SDKException("Did not receive the logAddress configuration.");
            }
        }
        return new URL(string);
    }

    private final HashMap<String, String> resolveSessionParams() {
        HashMap<String, String> map = new HashMap<>();
        String str = this.cidCache.get();
        if (str != null) {
            map.put("cid", str);
        }
        String sid = this.clientSessionState.getServerSession().getSid();
        if (sid != null) {
            map.put(com.biocatch.client.android.sdk.core.Constants.SID, sid);
        }
        String csid = this.clientSessionState.getCsid();
        if (csid != null) {
            map.put(com.biocatch.client.android.sdk.core.Constants.CSID, csid);
        }
        map.put(com.biocatch.client.android.sdk.core.Constants.DEVICE_SOURCE_META_FIELD, "android");
        map.put("sdkVer", BuildConfig.VERSION_NAME);
        String leanVersion = this.clientSessionState.getLeanVersion();
        if (leanVersion != null) {
            map.put(com.biocatch.client.android.sdk.core.Constants.LEAN_VERSION, leanVersion);
        }
        return map;
    }

    public final URL resolveLogAddress() throws MalformedURLException {
        return resolveBaseUrl().appendParameters(resolveSessionParams());
    }

    public final void setFixedUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.fixedUrl = url;
    }
}
