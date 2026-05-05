package com.biocatch.client.android.sdk.collection.collectors.application;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ApplicationMaximizedEvent;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0016s{:$c$\bCCU ~*\teNogtKb\u000bQ\u001b\u000e\u0016~k4Ikxe܈\u00172PoG3SoE9vt>\u0005&4(\u0600\u0010ڎ1 :J v)Cy\u000bJ/_1]b\u0011[\u00062\u00124@0\u0005,_\u007fNdL|aH4;\u0003\u0018H^+m7\u0015M;Nù+\r\u0005jf1NOM\u0015SlI\u0007\u001bkM\u001dWqk\u001e\u0019-5Faum5\u0007\u001cZ\u001asU\u001bz\u000b&\u000b\u001e\u0018tT-9m{K~'n\fK\b\u001b?\u001c\u000e4+\u001f͖/բj\b\u0016ޗE\u0005aJh\u0002\rM6O8ؾ\u0019Ӿ\u00047C;!r_n\f+\\E\u0014\u0005;-YUEĦ]ڍ\u0012d-\u001dZ\b_B\"LKOf\n\bEDՑrĊ\u0006*\f\u0382\u0018\f=|).E'\u000eن;؝%k\n҆\u0015y\u0005\u0017xh\u0002|\t\u001d\u0017̥pގ;.!\u000e`Xr\u001a<\\bnD\u0011{3+\u0378\nݔ\u0017 dɼ\r-3\u0015fO\u0017oAܗ_ܦ)/nŽ֓r\f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\n\r\u0016]?$JOB&\f*E\u0011?r\n\u001as\u0018<qp@e\u001aTO", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\n\r\u0016]?$JOB&\f*E\u0011?r\ns \r5qF", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "/o_9\\*:b\u001d\t\u0004l\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011:7\u0002Hy\u0005\n\u0016c", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "2de6V,\u001a^$[v\\2~\u00169u\t'Z@\b\u0013+/s\u0015Cz3", "", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4k\u0013_\u001bk>D-]o#\"oP,\u0019\u0006`\u001f<N\u0005rnK\u0017vG(Hv%\"Pz\\@r#.O\u0006\u0001  X\u0002<x+\u0004\n\u00114n\r\u0015d\u001cH\\t$*_\u000b#/5I\u001dCJ-svF\u0016r(o\u0007\u0014,3;&e/SW\u0013\u000ekl@xR", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ah]4_,-V&~v]\f\u0010\t-u\u000f2\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "1n[9X*M2\u0019\u0010~\\,X\u0014:l\u0004&wO\u0005! U", "", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0017v?%\u0019f]H\u000bm56r:KTRA\\QRN\u0014\u001bic", "AsP?g", "As^=", "\u0011n[9X*M2\u0019\u0010~\\,X\u0014:sl8\u0005I|\u0014\u001eG", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DeviceApplicationsCollector extends ContinuousCollector<DeviceApplicationModel> {
    private final ApplicationsService applicationsService;
    private final long deviceAppBackgroundDelayMillis;
    private final EventBusService eventBusService;
    private SingleThreadExecutor singleThreadExecutor;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0005ӳ.(Մ7f\u00198pGͿL.`Sr\u0015y|L$\n&8WшY\u001d"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\n\r\u0016]?$JOB&\f*E\u0011?r\n\u001as\u0018<qp@e\u001aT8r\u007fH0hDh>yXECb\u0006o\u0017m\nlCC \u0011x\u0019p", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016J7gYv;\u0010!^\u0018Wtk\u0005jE\"n B*\u000f0G}Jl\u000b\u0015$k?qwBT\u001fQ\u0007j92", "@t]", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class CollectDeviceAppsRunnable implements Runnable {
        public CollectDeviceAppsRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceApplicationsCollector.this.collectDeviceApplications();
        }
    }

    public DeviceApplicationsCollector(EventBusService eventBusService, ApplicationsService applicationsService, Utils utils, long j2) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(applicationsService, "applicationsService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.eventBusService = eventBusService;
        this.applicationsService = applicationsService;
        this.utils = utils;
        this.deviceAppBackgroundDelayMillis = j2;
        this.singleThreadExecutor = new SingleThreadExecutor("BC_CollectDeviceApplicationsThread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectDeviceApplications() {
        try {
            Log.Companion.getLogger().debug("collecting " + getFriendlyName());
            for (Map.Entry<ApplicationMetadata, ApplicationInstallationState> entry : this.applicationsService.getApplicationChanges().entrySet()) {
                ApplicationMetadata key = entry.getKey();
                addToQueue(new DeviceApplicationModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), key.getName(), key.getPackageName(), entry.getValue(), key.getPermissions(), key.getFirstInstallTime()));
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("An error occurred while collecting installed applications", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.DeviceApplications;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableDeviceApplicationsCollection;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "deviceApplications";
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public final void handle(ApplicationMaximizedEvent applicationMaximizedEvent) {
        collectDeviceApplications();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Applications collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Applications Events collector is already started. Aborting the start operation.");
        }
        this.eventBusService.subscribe(this);
        this.singleThreadExecutor.start();
        this.singleThreadExecutor.postDelayed(new CollectDeviceAppsRunnable(), this.deviceAppBackgroundDelayMillis);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.eventBusService.unsubscribe(this);
        this.singleThreadExecutor.stop();
        setStarted(false);
    }
}
