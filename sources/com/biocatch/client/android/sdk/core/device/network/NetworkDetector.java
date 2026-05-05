package com.biocatch.client.android.sdk.core.device.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN.ZS@\u000fsڔ<$q$yّCU(}*\tUSm˧\u0005Ϻ\u000b\u000bq\u000e>\u0015\f+?YY\u0007]*\u000f`C\u007fCAO\b=gcҽ:\u0005.6j>\b\u0011\u0019\u001aXUV\u000bCIY\u001a*0nv\u0001RU[\u0013)*\u0006l-1\"jwf6vw$Nw)\u0011zZNUlv\u0011\u0016\u0013Tf?\r%nd?\u0011CC\u0017=S1\n)¼AƄCqEݛ9950as\u0006<\u000fTjƚ-̠\u0011a\u000b(b\n_g\\99W{Qf\rV\u0001K{;ɝZ\u05fd\u0012όL.5Կ7\u0016\u001c=\rti?~\r5ې\fѐe6\u001fӛP?993f\u007fb\u0012ύPѼ\u007f\u0005\u0015̔ũ\u0005\u0003"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iXQ=#\u0012X\u001dX8b", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x\u001c\u0014!Z\f]5\u001aZ", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{dj8\u0014m0M@0G[\u0018\nf[{=\u0012!^\u001fR:!lUJ pDDtK\u001d", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", "", "u(I", "<dcDb9DA(z\nn:", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iXQ=#\u0012X\u001dX8KmYP6xQ=\r\u0017(X\u0012I>", "<dcDb9DA(z\nn:c\r=t\u007f1{M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x+#\u000ei\u001e\\\u0012\u0011\u0013hA-nQ\r", "1kT.e\u0013Ba(~\u0004^9", "", "5dc\u0016a0MW\u0015\u0006Xh5\u0006\t-t\u00042\u0005.\u0010\u0013&W}", "Adc\u0019\\:MS\"~\b", ":hbAX5>`", "AsP?g", "As^=", "\u001cdcDb9DA(z\nn:", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkDetector implements INetworkDetector {
    private final ConnectivityManager connectivityManager;
    private NetworkStatus networkStatus;
    private INetworkStatusListener networkStatusListener;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4E\u0007\":\u0012\u007fјnjO0LeN.Xݿ,%ӆ,4RZd|S?c\u001a\u0016\"7PɁkg|L#\u0019Q\u0015\u001e\u0016'q\\Mc\u0001u\u0012=;\t\u0004\bA[yU9\u000f{f\t.::8(\u000eG.zd\u001ez\u0013Cy\rB4NsRR;NCZhæJŋ\u0005$dɡf8Npk?ǫ'\u000e"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iXQ=#\u0012X\u001dX8KmYP6xQ=\r\u0017(X\u0012I>", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5f<\t7|(8ZI\u0019g;%\u0012d_?\\", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017B;|8\u001c\u00152j9\u0016u6[|p0L]>f_x\u001c\u0014!Z\f]5\u001aZN\u0005\u0015", "\nrTA \u0006\u0017", "7r0CT0EO\u0016\u0006z", "u(I", "=m0CT0EO\u0016\u0006z", "", "<dcDb9D", "\u001a`]1e6BRb\bzmue\t>w\n5\u0002\u0016", "=m;<f;", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class NetworkStatus extends ConnectivityManager.NetworkCallback {
        private boolean isAvailable;

        public NetworkStatus(boolean z2) {
            this.isAvailable = z2;
        }

        public final boolean isAvailable() {
            return this.isAvailable;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            this.isAvailable = true;
            NetworkStatusChanged networkStatusChanged = new NetworkStatusChanged(true);
            INetworkStatusListener iNetworkStatusListener = NetworkDetector.this.networkStatusListener;
            if (iNetworkStatusListener != null) {
                iNetworkStatusListener.handleNetworkChange(networkStatusChanged);
            }
            Log.Companion.getLogger().debug("Network Status has changed. Network became available.");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            this.isAvailable = false;
            NetworkStatusChanged networkStatusChanged = new NetworkStatusChanged(false);
            INetworkStatusListener iNetworkStatusListener = NetworkDetector.this.networkStatusListener;
            if (iNetworkStatusListener != null) {
                iNetworkStatusListener.handleNetworkChange(networkStatusChanged);
            }
            Log.Companion.getLogger().debug("Network Status has changed. Network was lost.");
        }
    }

    public NetworkDetector(Utils utils, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.utils = utils;
        this.connectivityManager = connectivityManager;
    }

    private final boolean getInitialConnectionStatus() {
        if (!this.utils.isVersionGreaterOrEqualTo(24)) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12);
        }
        return false;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void clearListener() {
        this.networkStatusListener = null;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public boolean isNetworkAvailable() {
        NetworkStatus networkStatus = this.networkStatus;
        if (networkStatus != null) {
            return networkStatus.isAvailable();
        }
        return false;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void setListener(INetworkStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.networkStatusListener = listener;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void start() {
        if (this.utils.isVersionGreaterOrEqualTo(24)) {
            NetworkStatus networkStatus = new NetworkStatus(getInitialConnectionStatus());
            this.networkStatus = networkStatus;
            ConnectivityManager connectivityManager = this.connectivityManager;
            Intrinsics.checkNotNull(networkStatus);
            connectivityManager.registerDefaultNetworkCallback(networkStatus);
            Log.Companion.getLogger().debug("Started the Network Detector");
        }
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void stop() {
        NetworkStatus networkStatus;
        if (this.utils.isVersionGreaterOrEqualTo(24) && (networkStatus = this.networkStatus) != null) {
            ConnectivityManager connectivityManager = this.connectivityManager;
            Intrinsics.checkNotNull(networkStatus);
            connectivityManager.unregisterNetworkCallback(networkStatus);
        }
    }
}
