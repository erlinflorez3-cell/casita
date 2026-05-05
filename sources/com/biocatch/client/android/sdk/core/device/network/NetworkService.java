package com.biocatch.client.android.sdk.core.device.network;

import com.biocatch.android.commonsdk.logging.Log;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjO0L͜P.hS2şs{B$c$wCCU(\n*\tUOog\u0005Jb\u000bI\u0017\fǝ\u000f̓\\I\u0004w\u001e\u001d\u001f6PoW3{pެ=`\u00038M+@+Py3\u000b`ݒН\u0014v\u0001N\u0014\u001a <Xph_=Q\u0013(*\u0006l$G\u001e%u\\E`l\fD_'\u0011yZNUpv\u0011\u0016\u0018Tf?\r%kdѨË;5\u001b8\u001c\u0007\u0015fs?1I:P\u0013}?'YS$[Dn\u0018\u0014C/\u0016Օǁv&b\u001c\u001ad\u001a?CO\u0012U\u0019\u00126\u0011\u0013{;FL\u0012\u0014A`.[$7\u0014\u001c6\rr\u0002D'؟j۰\u0004ziاg1\u000e8C9Il(Ĩ=ϭR7\u0004˜]*1\b\u0007!\n\\d֮\u0017ôXwYĸ\"LKHf\n\b>DՑrĊ\u0006*\f\u0382Ѓ\u0004J"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iX`=!#^\fN\u0001", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x+#\u000ei\u001e\\\u0012\u0011\u0013hA-nQ\r", "<dcDb9D2\u0019\u000ez\\;\u0007\u0016\u0010a}7\u0006M\u0015", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iXQ=#\u0012X\u001dX8m\u0001WP.{X\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017B;|8\u001c\u00152j9\u0016u6[|p0L]>f_x\u001c\u0014!Z\f]5\u001aeU?3xQKtK\u001d", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", "", ":nR8", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "<dcDb9D2\u0019\u000ez\\;\u0007\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u000b0L]>f_x\u001c\u0014!Z\f]5\u001aZ", "/vP6g", "", "/vP6gjLR\u001fxHXyvS)9MxuM\u0001\u001e\u0017C}\u000e", "5dc\u0010h9KS\"\u000ec^;\u000f\u0013<km7wO\u0011%\u0005V|\u0012Ex", "", "7r2<a5>Q(~y", "6`]1_,'S(\u0011\u0005k2Z\f+n\u0002(", "<dcDb9DA(z\nn:Z\f+n\u0002(z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iX`L\u0010!j\u001c,.\t\u000e[A#D", "<nc6Y@\u001ae\u0015\u0003\n^9\u000b", "<nc6Y@\u001ae\u0015\u0003\n^9\u000bG=d\u0006\"I:N\u0011aAC[\rp25`}\u001cEm", "@d[2T:>", "Adc\u0016f\u0015>b+\t\bd\b\u000e\u00053l{%\u0003@", "D`[BX", "Adc\u0016f\u0015>b+\t\bd\b\u000e\u00053l{%\u0003@?%\u0016Mi[6D\u001f\u007fSQm\bg#.TC7y4", "AsP?g", "As^=", "E`XA96K<\u0019\u000e\rh9\u0003", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkService implements INetworkStatusListener {
    private boolean isNetworkAvailable;
    private final Object lock;
    private final INetworkDetector networkDetector;
    private final NetworkDetectorFactory networkDetectorFactory;

    public NetworkService(NetworkDetectorFactory networkDetectorFactory) {
        Intrinsics.checkNotNullParameter(networkDetectorFactory, "networkDetectorFactory");
        this.networkDetectorFactory = networkDetectorFactory;
        this.networkDetector = networkDetectorFactory.create();
        this.lock = new Object();
    }

    private final String getCurrentNetworkStatusString(boolean z2) {
        return z2 ? Device.JsonKeys.ONLINE : "offline";
    }

    public final void await$sdk_3_3_0_936_release() throws InterruptedException {
        this.lock.wait();
    }

    @Override // com.biocatch.client.android.sdk.core.device.network.INetworkStatusListener
    public void handleNetworkChange(NetworkStatusChanged networkStatusChanged) {
        Intrinsics.checkNotNullParameter(networkStatusChanged, "networkStatusChanged");
        try {
            synchronized (this.lock) {
                setIsNetworkAvailable$sdk_3_3_0_936_release(networkStatusChanged.isConnected());
                Log.Companion.getLogger().info("Network Status has changed. Current Network Status is " + getCurrentNetworkStatusString(this.isNetworkAvailable));
                if (this.isNetworkAvailable) {
                    notifyAwaiters$sdk_3_3_0_936_release();
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error on network state change", th);
        }
    }

    public final void notifyAwaiters$sdk_3_3_0_936_release() {
        this.lock.notifyAll();
    }

    public final void release() {
        synchronized (this.lock) {
            notifyAwaiters$sdk_3_3_0_936_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setIsNetworkAvailable$sdk_3_3_0_936_release(boolean z2) {
        this.isNetworkAvailable = z2;
    }

    public final void start() {
        Log.Companion companion = Log.Companion;
        companion.getLogger().debug("Starting Network Service to monitor for network activity");
        this.networkDetector.setListener(this);
        this.networkDetector.start();
        setIsNetworkAvailable$sdk_3_3_0_936_release(this.networkDetector.isNetworkAvailable());
        companion.getLogger().info("Current Network Status is " + getCurrentNetworkStatusString(this.isNetworkAvailable));
    }

    public final void stop() {
        this.networkDetector.clearListener();
        this.networkDetector.stop();
        Log.Companion.getLogger().debug("Stopped Network Service");
    }

    public final void waitForNetwork() {
        synchronized (this.lock) {
            if (!this.isNetworkAvailable) {
                await$sdk_3_3_0_936_release();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
