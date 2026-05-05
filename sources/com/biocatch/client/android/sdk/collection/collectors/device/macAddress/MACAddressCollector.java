package com.biocatch.client.android.sdk.collection.collectors.device.macAddress;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.wrappers.NetworkInterface;
import com.biocatch.client.android.sdk.wrappers.NetworkInterfaceFactory;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\u000eUȞ}˧\u001fPj\rS\u000f4\u0016'ilde|k\u0013'2pqO7[rU9\u000fxF\t.7:8(\u000bв\u001e*V\u0017?\u0003Q^$\u0014F?\u001f:\u0019!\u001e\u0017(\u001a\u001e>N\nT1>߅8ՂpaR1)\rwM\u001f9m<\u0015M;S\u000b{cȏcӿ/DO7\u001b3a\u0012WdiO\u001b? ?;=}ݧ-ʁw[NZ\u0006%#= \u0019ku>\\3U7ϲ)˦ScSִ^4\u0006\u007f\u0014\rj\ndͽ)ρ2-\"ǑX\u001aAu\u000bSnRXތDȸ~a>ЍԄ\u0004G"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u001c\u000eXiM*\u001a\u0005gOmV \u0015z\u0007+V\u0002Iv^\u0016\u001d\u00155h\u007fLce", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u001c\u000eXiM*\u001a\u0005gOmV \u0015z\u0007+V\u0002Ivh\u0016\u0015\u000e<@", "EhU6<5MS&\u007fv\\,e\u00057e", "", "<dcDb9D7\"\u000ezk-x\u0007/F{&\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u001d\u001e$zkF\rG5]v4HHL,=NpL\u001e\u001fnc", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Ds\u0018:r43\\G\u001e>q\u00167\\\r7t3+\u001fl`\u0003\u0015b2\u0018\t4CWY,i`<&\u0014!l\u0018[1p\u000ehA1o@5\u001fh(G\u0011Eu\u0015a|\f?r:?Z\u001aEu$sDrdOXl\u0004K@\u000f`4l\u0014i&j9@m\u0012{&\u001b2@=\u000e\u0003af6C", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class MACAddressCollector extends OnDemandCollector<MACAddressModel> {
    private final NetworkInterfaceFactory networkInterfaceFactory;
    private final Utils utils;
    private final String wifiInterfaceName;

    public MACAddressCollector(String wifiInterfaceName, NetworkInterfaceFactory networkInterfaceFactory, Utils utils) {
        Intrinsics.checkNotNullParameter(wifiInterfaceName, "wifiInterfaceName");
        Intrinsics.checkNotNullParameter(networkInterfaceFactory, "networkInterfaceFactory");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.wifiInterfaceName = wifiInterfaceName;
        this.networkInterfaceFactory = networkInterfaceFactory;
        this.utils = utils;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.MACAddress;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableMACAddressFeature;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "mac_address";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public MACAddressModel runCollection() throws SocketException {
        for (NetworkInterface networkInterface : this.networkInterfaceFactory.getNetworkInterfaces()) {
            if (StringsKt.equals(networkInterface.getName(), this.wifiInterfaceName, true)) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                return new MACAddressModel(hardwareAddress != null ? this.utils.byteArrayToHexString(hardwareAddress, AbstractJsonLexerKt.COLON) : "");
            }
        }
        return null;
    }
}
