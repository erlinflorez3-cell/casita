package com.biocatch.client.android.sdk.backend;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.communication.IDataSender;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`Z2\u000fq\u007f<$q$yّCU(}*\tUUm˧\u0005Ϻ\u0003\rIƤ\u0014\u0015)jZI\u000ewvR@BF}@KM\u001e?Il\u00039\u001d(B&H{\u001b\u007fPݒv\u0014\u0007\u0005QP$\u0018@B\u0001:\t҈{\u000b*\u0016\u0014E8\u0001LdʄR6Vu&@=3\u001bip_m_x\u0003[\u001f^TU\u001e=af/NJM\u0015SdK\u000b`oW\u0003m\u0003\u0006\u000bv<?+w\u0005\u001eJ!\u0006\"+CO;n9&%\t_w$'Y`,O^&@w)\r]P\u0012\u0011\u001e/X2=\u001c|\u0007Dޗ#v*öRؿbB\bЭ2H%*\u00189;;+f\bĥi\u001f%ќ}˿\u0011\u001e+Ч?9i[&`C#+ȴ]śULEʰf\f_G{\u000f\u0011d\b6\u0012=\u0018\f=|).E'\u000eن;؝%k\n҆\u0015s\u0005\u0013xh\u0002x)̵Ḻr\u0016?ѧÇ\u0010t"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\"", "\"", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ah]4_,-V&~v]\f\u0010\t-u\u000f2\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "/fV?X.:b#\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005O\u0010 \u0017ua;\u0003r6[L", "2`c.F,GR\u0019\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110-(kN`=\u001d\u0011Z\u001b$", "2hb=T;<V\u0006z\n^", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iFm\u00141QA7r\"\u001e\"ye7\u0007qu<z0ISN\u001b__r9\u0013qm\u000eL;\u001c\u000ff\u0017\u000blN?h\u00050S\u007f7w~\u000f_\f<npKeYC\u0003\u0014\u0003K-g\u0010g^\u007f\u0011>A`0d\u0015^f@\u0016<&!q\u001b\u0017wZ;_bQ\u001bz\u001cvkqE\u0015\n6'\bkbJExd\u0006p0\u001eX\u0006{\u0011{fs1>*\u007f206m\u0004\u0015e\"Ff\t\u001e0Z=6*@E\\#*_\u0005h,\u000eq\u001ea\u0015cGx\"", "5dc\u0011\\:IO(|}K(\f\t", "u(9", "Adc\u0011\\:IO(|}K(\f\t", "uI\u0018#", "AsPAX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\u000b-0j]nL\u0012\u0015Z\u001b<:\t\u0014Y\u0017", "4kd@[", "", "7mc2e5:Z\u0007\u000evk;", ">`d@X", "@dbB`,", "@t]", "AbW2W<ESt\u0001|k,~\u0005>i\n1", "AsP?g", "As^=", "\u0012hb=T;<V\u0019\fhm(\f\t", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataDispatcher<T> implements Runnable {
    private final IAggregator<T> aggregator;
    private final IDataSender<T> dataSender;
    private long dispatchRate;
    private final SingleThreadExecutor singleThreadExecutor;
    private DispatcherState state;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gٍ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\u000b-0j]nL\u0012\u0015Z\u001b<:\t\u0014Y\u0017", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "!S>\u001dC\f\u001d", "!S0\u001fG\f\u001d", "\u001e@D 8\u000b", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private enum DispatcherState {
        STOPPED,
        STARTED,
        PAUSED
    }

    public DataDispatcher(SingleThreadExecutor singleThreadExecutor, IAggregator<T> aggregator, IDataSender<T> dataSender, long j2) {
        Intrinsics.checkNotNullParameter(singleThreadExecutor, "singleThreadExecutor");
        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
        Intrinsics.checkNotNullParameter(dataSender, "dataSender");
        this.singleThreadExecutor = singleThreadExecutor;
        this.aggregator = aggregator;
        this.dataSender = dataSender;
        this.dispatchRate = j2;
        this.state = DispatcherState.STOPPED;
    }

    private final void flush() {
        this.singleThreadExecutor.runImmediately(this);
    }

    private final void internalStart() {
        Log.Companion.getLogger().debug("Starting the data dispatcher");
        this.state = DispatcherState.STARTED;
        scheduleAggregation();
    }

    private final void scheduleAggregation() {
        this.singleThreadExecutor.postDelayed(this, this.dispatchRate);
    }

    public final long getDispatchRate() {
        return this.dispatchRate;
    }

    public final void pause() {
        Log.Companion.getLogger().debug("Pausing the data dispatcher");
        this.state = DispatcherState.PAUSED;
        flush();
    }

    public final void resume() {
        DispatcherState dispatcherState = this.state;
        if (dispatcherState == DispatcherState.STOPPED) {
            throw new InvalidOperationException("Data dispatcher is stopped. Unable to resume");
        }
        if (dispatcherState == DispatcherState.STARTED) {
            return;
        }
        internalStart();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Log.Companion.getLogger().debug("Collecting aggregated data from " + this.aggregator.getClass().getSimpleName());
            T tTake = this.aggregator.take();
            if (tTake != null) {
                this.dataSender.sendData(tTake);
            }
        } catch (Throwable th) {
            try {
                Log.Companion.getLogger().error("An error has occurred while dispatching data", th);
                if (this.state != DispatcherState.STARTED) {
                }
            } finally {
                if (this.state == DispatcherState.STARTED) {
                    scheduleAggregation();
                }
            }
        }
    }

    public final void setDispatchRate(long j2) {
        this.dispatchRate = j2;
    }

    public final void start() {
        if (this.state != DispatcherState.STOPPED) {
            throw new InvalidOperationException("Data Dispatcher is not stopped");
        }
        this.singleThreadExecutor.start();
        internalStart();
    }

    public final void stop() {
        DispatcherState dispatcherState = this.state;
        DispatcherState dispatcherState2 = DispatcherState.STOPPED;
        if (dispatcherState == dispatcherState2) {
            return;
        }
        Log.Companion.getLogger().debug("Stop the data dispatcher");
        this.state = dispatcherState2;
        flush();
        this.singleThreadExecutor.stop();
    }
}
