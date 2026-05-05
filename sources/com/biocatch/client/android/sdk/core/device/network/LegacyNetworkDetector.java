package com.biocatch.client.android.sdk.core.device.network;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN.ZS@\u000fsڔ<$q$yّCU(}*\tURm˧\u0005Ϻ\u000b\u000bq\u000e>\u0015\u000b+?YY\u0007]*\u000f`C\u007fCAO\b=gcҽ:\u0005.6j>\b\u0011\u0019\u001aXUV\u000bCQY\u001a*0n}jV\u001b\\\u001d\u001a@\u0011\u00054I$jwf6vy$Nw)\u0011zZNUlv\u0011\u001e\u0019TT?\r%btѫB˝9\u0015-مS\u0013`]W\u0003mt\u0014ݞjҊ++Q֕(Hf\u0005,\u0015YUC2I̽^ԇUd$)1TqR! 6\u007f\u0013\u0002#;2\u0017V'v͓\u0004Ղrڿ\u00123|Ɂ$N^\fvD\u0016y\u0010AmӞ\fĴ/9#ƘЈeN"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000eGNJ*p;rL&\u001cg\u0014-+\u001c\u0005WP.{\u001a", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x\u001c\u0014!Z\f]5\u001aZ", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5(eQ\u007fG\u0018\u0011$\u0017N:VbcJ-nBF#\u00190X\u0016#d\n\b\u0018\u000eB@43", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", "", "u(I", ":dV.V@'S(\u0011\u0005k2j\u0018+t\u00106", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000eGNJ*p;rL&\u001cg\u0014-+\u001c\u0005WP.{\u0003\u001e\u001f\n(G\u0016$h\u0010\u001e \u001b;X\u007f>e UO", "<dcDb9DA(z\nn:c\r=t\u007f1{M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x+#\u000ei\u001e\\\u0012\u0011\u0013hA-nQ\r", "1kT.e\u0013Ba(~\u0004^9", "", "Adc\u0019\\:MS\"~\b", ":hbAX5>`", "AsP?g", "As^=", "\u001adV.V@'S(\u0011\u0005k2j\u0018+t\u00106", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LegacyNetworkDetector implements INetworkDetector {
    private final ApplicationCache applicationCache;
    private final ConnectivityManager connectivityManager;
    private LegacyNetworkStatus legacyNetworkStatus;
    private INetworkStatusListener networkStatusListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Tiճ?k*3d^ҸuCIUb\u00140\ngN\u0016i\u001fNh\u000e[\u000f4\u001a)n:Nmx\f\u0018UFԸsF"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000eGNJ*p;rL&\u001cg\u0014-+\u001c\u0005WP.{\u0003\u001e\u001f\n(G\u0016$h\u0010\u001e \u001b;X\u007f>e UO", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017B;|8\u001c\u00152j9\u0016u6[|p.LP(Zf[=#$d\u001bT\n\r\u0014Y?3xQ\rbx", "=mA2V,Bd\u0019", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class LegacyNetworkStatus extends BroadcastReceiver {
        public LegacyNetworkStatus() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            NetworkStatusChanged networkStatusChanged = new NetworkStatusChanged(LegacyNetworkDetector.this.isNetworkAvailable());
            INetworkStatusListener iNetworkStatusListener = LegacyNetworkDetector.this.networkStatusListener;
            if (iNetworkStatusListener != null) {
                iNetworkStatusListener.handleNetworkChange(networkStatusChanged);
            }
            Log.Companion.getLogger().debug("Network status changed. IsNetworkAvailable=" + LegacyNetworkDetector.this.isNetworkAvailable());
        }
    }

    public LegacyNetworkDetector(ApplicationCache applicationCache, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.applicationCache = applicationCache;
        this.connectivityManager = connectivityManager;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void clearListener() {
        this.networkStatusListener = null;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void setListener(INetworkStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.networkStatusListener = listener;
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void start() {
        Application application = this.applicationCache.get();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
        LegacyNetworkStatus legacyNetworkStatus = new LegacyNetworkStatus();
        this.legacyNetworkStatus = legacyNetworkStatus;
        application.registerReceiver(legacyNetworkStatus, intentFilter);
        Log.Companion.getLogger().debug("Started the Legacy Network Detector");
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkDetector
    public void stop() {
        Application applicationTryGet;
        if (this.legacyNetworkStatus == null || (applicationTryGet = this.applicationCache.tryGet()) == null) {
            return;
        }
        applicationTryGet.unregisterReceiver(this.legacyNetworkStatus);
    }
}
