package com.biocatch.client.android.sdk.core.lifecycle;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.collection.CollectorsController;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.StateChangedEvent;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq}<$i$yCAW Ԃ8ޛ\u007fN\u0016f/ej\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5RsM7eok>žx6\u0013&z&F\u0006\u001d\u0001H7\u0011\u0014\u0005\t[K:\u001fxL~Ij\r{\u0012J\u0016\u0014N8\u0001Ld8ZDL\u0005]h4yɈkŌR'gܞMY\u001bHl';y8ӟ-Ë;5\u001dǬ$\u000f\u0015Rs?1@Hܸ\u0007ص+'3ɞDsDa\u0018\u0014C3\u007f\u0011ky>\\3Y\u001fL}ˊ[ӍOV\u0016ߊ\u0010|\u0002\u0017J\u000fأ\n8"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v\u0015GY_0ZRH", "", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "1n[9X*M]&\rXh5\f\u00169l\u0007(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u00045%VW;i\\yD\u0014\u001f0", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4k\u0013_\u001bk>D-]O#\"oP,\u0019\u0006`\u001fP\\\u0003vtQ \u000281\u0014TYPM9R@~%\u001bZyz[0_x+}<M035q\u000fOfaL]~^)X?-&?;\\\u001cGa{lG\rV\u001fn\u0019\u0012`5\u0007\\V", "\nrTA \u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v|", "AsPAX", "5dc g(MS", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\rBo5\u001e\u0013|_@\u0007-\u001a]r6G\"", ">`d@X", "", "@dbB`,", "CoS.g,,b\u0015\u000ez", "<df g(MS", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class StateService {
    private final BackendService backendService;
    private final CollectorsController collectorsController;
    private final EventBusService eventBusService;
    private State state;

    public StateService(EventBusService eventBusService, CollectorsController collectorsController, BackendService backendService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(collectorsController, "collectorsController");
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        this.eventBusService = eventBusService;
        this.collectorsController = collectorsController;
        this.backendService = backendService;
        this.state = State.STOPPED;
    }

    public final State getState() {
        return this.state;
    }

    public final void pause() {
        Log.Companion companion = Log.Companion;
        companion.getLogger().info("Pausing the library");
        if (this.state != State.STARTED) {
            companion.getLogger().error("Unable to pause. State is " + this.state);
            throw new InvalidOperationException("Unable to pause. State is " + this.state);
        }
        this.backendService.pauseDispatchers();
        this.collectorsController.onSdkPaused();
        updateState(State.PAUSED);
    }

    public final void resume() throws Throwable {
        Log.Companion companion = Log.Companion;
        companion.getLogger().info("Resuming the library");
        if (this.state != State.PAUSED) {
            companion.getLogger().error("Unable to resume. State is " + this.state);
            throw new InvalidOperationException("Unable to resume. State is " + this.state);
        }
        this.collectorsController.onSdkResumed();
        this.backendService.resumeDispatchers();
        updateState(State.STARTED);
    }

    public final void updateState(State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.state = newState;
        this.eventBusService.publish(new StateChangedEvent(newState));
    }
}
