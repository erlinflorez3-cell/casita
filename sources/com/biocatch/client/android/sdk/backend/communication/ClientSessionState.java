package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.contract.BCAgentType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4N\u0007\":\u001b\u007f\u0007ltA0RlP.hS2\u000fq~<$i$yCAY Ԃ8ޛ\u007fN\u0016f/Wj\u0011I\u000f\u0014\u0016\u0011jZJǤ|] \u0011zF}aKM\u001eZ\u0002d\u0003Y\u001d `F\u0001}\u0013&2*v4?\u0001Qq$\u0012^d7:\u001b\u0013[,2\u00124bf\u0001fbuvNH\u001b\u0002\u0001/k\u0007wkf'\u000eTMe\u001bFl';w8ӣ7Ë;A\u001dǬk\u0005\rUiC#AwB\u0013jwA9O\fYLW.\u0015kۇ[ոa~.ؘ\u001dSf\u00135/oeQX\u001c*H\u0015\n\u0016T\u0006$\u0005UI\u0005ƭ&Ǵ\f\u001a;ο\u000bUFZ\u0010bb\u0002\u0001lD\u0019u\u001aA7Q\u001d|P\u0010<oגC߉\t\u0019&ŀ\u0019p'hb\u0012\u0001\u0017!b\u0006S\u0002mNN`N8imq\u0012\u007fz\u0002X\u0014n\bV\u0082\b 2\u001d-ڛs;)3y\u0015\u0019`u\u000b\u001d`\u0017c\u001aVVO:nDGhIbɵP\u0081\tqXӹp.\u0017b*gW\u0018\u0016)8^\u000e;O&fʡ[ŹmvUΪ\"'5}E]\u000fm\u0014oG`\u0004O_|(chuB@\u0013ϼ\u0011ֽjN[ێr^.<@L\u000b\u0012}\u0017RP\\\u001f@[\n\u001cbI\bǌhČL\u0003&Փ\u0012\u0019\u0017~rh>\u001d\u000572\u0012\u0002$#'?\u00113ʠ{ς|O4ʉx$3a_VԐ*\u007f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "", "/fT;g\u001bR^\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u000eZ,Gb\b\u0013\u0006^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eZ,Gb\b\u0013\u0006^", "0qP;W", "5dc\u000fe(GR", "Adc\u000fe(GR", "1n]AX?M<\u0015\u0007z", "5dc\u0010b5MS,\u000ecZ4|", "Adc\u0010b5MS,\u000ecZ4|", "1rX1", "5dc\u0010f0=", "Adc\u0010f0=", "\nrTA \u0006\u0017", "", "6`b\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "5dc\u0015T:\u001c]\"\u007f~`<\n\u0005>i\n1", "u(I", "6`b\u001dX5=W\"\u0001Xh5}\r1u\r$\u000bD\u000b \u0004G{\u001e<\u00054", "5dc\u0015T:)S\"}~g.Z\u00138f\u0004*\fM|&\u001bQxz<\u000355g\r", ":dP;I,Ka\u001d\t\u0004", "5dc\u0019X(GD\u0019\f\tb6\u0006", "Adc\u0019X(GD\u0019\f\tb6\u0006", ";tX1", "5dc\u001ah0=", "Adc\u001ah0=", "@d`BX:M7w", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "AdaCX9,S'\r~h5", "5dc X9OS&lzl:\u0001\u00138", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001j\u0012,SCDj}\u001c\u001fpiI\u0010g*J\u0006+QU\u0018\u001a\\_\u0004=!\u007fZ\u001c\\/\u0017\u000e/", "5dc\u000ea+\"\\\u0017\fzf,\u0006\u0018\u001ce\f8{N\u0010zu", ";`a866GT\u001d\u0001\u000bk(\f\r9nl(y@\u0005(\u0017F", "", ";`a866GT\u001d\u0001\u000bk(\f\r9nl(\bP\u0001%&Gn", "@db2g", "@db2g\tKO\"}", "@db2g\u0019>_)~\tm\u0010[", "AsP?g\u0015>e\u0007~\bo,\nv/s\u000e,\u0006I", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ClientSessionState {
    private String agentType;
    private String brand;
    private String contextName;
    private String csid;
    private boolean hasConfiguration;
    private boolean hasPendingConfigurationRequest;
    private String leanVersion;
    private String muid;
    private long requestID;
    private ServerSession serverSession;

    public ClientSessionState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClientSessionState(String agentType) {
        Intrinsics.checkNotNullParameter(agentType, "agentType");
        this.agentType = agentType;
        this.serverSession = new ServerSession();
        reset();
    }

    public /* synthetic */ ClientSessionState(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BCAgentType.PRIMARY.getType() : str);
    }

    private final void reset() {
        this.csid = null;
        this.muid = null;
        this.contextName = null;
        this.leanVersion = null;
        resetBrand();
        startNewServerSession();
    }

    private final void resetBrand() {
        this.brand = null;
    }

    private final void resetRequestID() {
        this.requestID = 0L;
    }

    public final String getAgentType() {
        return this.agentType;
    }

    public final long getAndIncrementRequestID() {
        long j2 = this.requestID;
        this.requestID = 1 + j2;
        return j2;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getContextName() {
        return this.contextName;
    }

    public final String getCsid() {
        return this.csid;
    }

    public final boolean getHasConfiguration() {
        return this.hasConfiguration;
    }

    public final boolean getHasPendingConfigurationRequest() {
        return this.hasPendingConfigurationRequest;
    }

    public final String getLeanVersion() {
        return this.leanVersion;
    }

    public final String getMuid() {
        return this.muid;
    }

    public final ServerSession getServerSession() {
        return this.serverSession;
    }

    public final void markConfigurationReceived() {
        Log logger;
        String str;
        if (!this.hasConfiguration) {
            if (!this.hasPendingConfigurationRequest) {
                logger = Log.Companion.getLogger();
                str = "Marking that we received configurations although we didn't have a pending request for configurations.";
            }
            this.hasPendingConfigurationRequest = false;
            this.hasConfiguration = true;
        }
        logger = Log.Companion.getLogger();
        str = "Marking that we received configuration although we already received configuration from the server. We shouldn't have received it again.";
        logger.warning(str);
        this.hasPendingConfigurationRequest = false;
        this.hasConfiguration = true;
    }

    public final void markConfigurationRequested() {
        if (this.hasConfiguration) {
            Log.Companion.getLogger().warning("We already have configuration. Ignoring the attempt to mark a pending configuration request.");
        } else {
            this.hasPendingConfigurationRequest = true;
        }
    }

    public final void setAgentType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentType = str;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setContextName(String str) {
        this.contextName = str;
    }

    public final void setCsid(String str) {
        this.csid = str;
    }

    public final void setLeanVersion(String str) {
        this.leanVersion = str;
    }

    public final void setMuid(String str) {
        this.muid = str;
    }

    public final void startNewServerSession() {
        resetRequestID();
        resetBrand();
        this.serverSession = new ServerSession();
    }
}
