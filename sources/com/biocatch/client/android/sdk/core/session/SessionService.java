package com.biocatch.client.android.sdk.core.session;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.backend.BackendException;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.backend.INewSessionStartedEventListener;
import com.biocatch.client.android.sdk.backend.IWupInfoEventBackendListener;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.WupInfoEvent;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import com.biocatch.client.android.sdk.events.NewSessionStartedEvent;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG<LeN/ZS8\u000fsڔ<$q$yCAV Ԃ8ޛ\u007fN\u0016f/]j\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5Բs?AQ8KGi\r63*b&F\u0005\u001d\u0001H6\u000f$?\tQX$\u0012^J!@`\u001be\u00070\u00114Dp\r,\\\u007fNdICҚ<ǥ'\u0003qĩ\u001f3m2\u0015M;I+\u070e\u000fțe\u001e3¨\bF#*k\u0005\u001dQ\nE9\u0004џA\t\u0001)-2W{ɷ:g"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u0015GY_0ZRH", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005O&. Lj:\u0011C=N\u007f6$HL2\\[q$\u0018 i\u000eW+\u001aZ", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:5\u0011\u001a\u0013naB\u0006Q,[\b+EL$\u0013Z\\z\u0007\u0011\u0016d\fJ:\u000b\b#=-mQA#\u0007uG\fCp\u000b\u0015$\r;4\u007fBT\u0013P}\u0013qH\u0017hSjcwGO\u000fb;d\u0015n+&\u001aK$\u001d\u0001u+v>.\u0017\rW\u000fr(=X", "Adb@\\6G7w", "", "5dc X:LW#\b^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=mFBc\u0010GT#lzg;", "", "Et_\u0016a-H", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007\u0006\"eqW,\u0017djA-}\u001a", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "1rX1", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SessionService implements IWupInfoEventBackendListener {
    private final BackendService backendService;
    private final EventBusService eventBusService;

    public SessionService(BackendService backendService, EventBusService eventBusService) throws SDKException, BackendException {
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        this.backendService = backendService;
        this.eventBusService = eventBusService;
        backendService.addEventListener(new INewSessionStartedEventListener() { // from class: com.biocatch.client.android.sdk.core.session.SessionService.1
            @Override // com.biocatch.client.android.sdk.backend.INewSessionStartedEventListener
            public void onNewSessionStarted(String sessionID) {
                Intrinsics.checkNotNullParameter(sessionID, "sessionID");
                SessionService.this.eventBusService.publish(new NewSessionStartedEvent(sessionID));
            }
        });
        backendService.addEventListener(this);
    }

    public final synchronized String getSessionID() {
        return this.backendService.getSessionID();
    }

    @Override // com.biocatch.client.android.sdk.backend.IWupInfoEventBackendListener
    public void onWupInfoSent(WupInfoEvent wupInfo) {
        Intrinsics.checkNotNullParameter(wupInfo, "wupInfo");
        this.eventBusService.publish(wupInfo);
    }

    public final void startNewSession(String str) {
        Log.Companion.getLogger().debug("starting a new session. CSID = " + (str == null ? "null" : str));
        this.backendService.startNewSession(str);
    }
}
