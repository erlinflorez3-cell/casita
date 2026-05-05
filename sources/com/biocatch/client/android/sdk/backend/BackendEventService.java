package com.biocatch.client.android.sdk.backend;

import com.biocatch.android.commonsdk.backend.IBackendEventListener;
import com.biocatch.android.commonsdk.backend.IConfigurationLoadedEventListener;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.WupInfoEvent;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012\u000e\u0007njO0L͜P.`S2\u000fq~<$i-yCAW\"}8\tWNmitϺpŏs\u000f4\u00159m߽MU\u0007]Z%@H\b?aT AGh\r63#b&F\u0003\u001d\u0001H/\u000f\u0010?~QU$\u0012^G9F`\u0018e\u0005H\u00196B.\r6\\\u0016[~TzkR/Q\n\u001aF\\6w0+PURb7%v\u0010%[DEF-%\u0002\u0015OhiR\u001b? J5l5/CI\"Zf\\\u000e\u001d-+}\u0012$rnh\u0013ex\fU2\u007fgYY&(&\u007fD\u0019J\u0019&\u0006UU^1(o \u000eayCqNQ\u001apR\u0002\u000bad\u001a5\bC1I\u001dvQ\u0010@GRe}[ٿ ţ\u0005n)żړ\u0012v"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8ft,W\u0006\u0015GY_0ZRH", "", "u(E", "3uT;g\u0013Ba(~\u0004^9\u000b", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u001fH0\u001c\u001bhj8ft,W\u0006\u000eKZ],eR\u007f\u0013", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", ":hbAX5>`", "1kT.e", ">tQ9\\:A1#\b{b.\r\u0016+t\u00042\u0005'\u000b\u0013\u0016Gn", "7rB\u0011>\fGO\u0016\u0006z]", "", ">tQ9\\:A<\u0019\u0011h^:\u000b\r9nm7wM\u0010\u0017\u0016", "Adb@\\6G7w", ">tQ9\\:AE)\n^g-\u0007", "Et_\u0016a-H3*~\u0004m", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007\u0006\"eqW,\u0017djA-}\u001a", "@d\\<i,%W'\u000ezg,\n", "AtQ@V9BP\u0019", "CmbBU:<`\u001d{z", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BackendEventService {
    private final HashMap<String, HashSet<IBackendEventListener>> eventListeners = new HashMap<>();

    private final void addListener(String str, IBackendEventListener iBackendEventListener) {
        if (!this.eventListeners.containsKey(str)) {
            this.eventListeners.put(str, new HashSet<>());
        }
        HashSet<IBackendEventListener> hashSet = this.eventListeners.get(str);
        Intrinsics.checkNotNull(hashSet);
        hashSet.add(iBackendEventListener);
    }

    private final boolean removeListener(String str, IBackendEventListener iBackendEventListener) {
        if (!this.eventListeners.containsKey(str)) {
            return false;
        }
        HashSet<IBackendEventListener> hashSet = this.eventListeners.get(str);
        Intrinsics.checkNotNull(hashSet);
        hashSet.remove(iBackendEventListener);
        return true;
    }

    public final void clear() {
        this.eventListeners.clear();
    }

    public final void publishConfigurationLoaded(boolean z2) {
        HashSet<IBackendEventListener> hashSet = this.eventListeners.get("IConfigurationLoadedEventListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof IConfigurationLoadedEventListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IConfigurationLoadedEventListener) it.next()).onConfigurationLoaded(z2);
            }
        }
    }

    public final void publishNewSessionStarted(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        HashSet<IBackendEventListener> hashSet = this.eventListeners.get("INewSessionStartedEventListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof INewSessionStartedEventListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((INewSessionStartedEventListener) it.next()).onNewSessionStarted(sessionID);
            }
        }
    }

    public final void publishWupInfo(WupInfoEvent wupInfoEvent) {
        Intrinsics.checkNotNullParameter(wupInfoEvent, "wupInfoEvent");
        HashSet<IBackendEventListener> hashSet = this.eventListeners.get("IWupInfoEventBackendListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof IWupInfoEventBackendListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IWupInfoEventBackendListener) it.next()).onWupInfoSent(wupInfoEvent);
            }
        }
    }

    public final void subscribe(IBackendEventListener listener) throws SDKException {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener instanceof IConfigurationLoadedEventListener) {
            str = "IConfigurationLoadedEven…er::class.java.simpleName";
            str2 = "IConfigurationLoadedEventListener";
        } else if (listener instanceof INewSessionStartedEventListener) {
            str = "INewSessionStartedEventL…er::class.java.simpleName";
            str2 = "INewSessionStartedEventListener";
        } else {
            if (!(listener instanceof IWupInfoEventBackendListener)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format("Unable to subscribe. Unsupported listener type %s", Arrays.copyOf(new Object[]{listener.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                throw new SDKException(str3);
            }
            str = "IWupInfoEventBackendList…er::class.java.simpleName";
            str2 = "IWupInfoEventBackendListener";
        }
        Intrinsics.checkNotNullExpressionValue(str2, str);
        addListener(str2, listener);
    }

    public final boolean unsubscribe(IBackendEventListener listener) throws SDKException {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener instanceof IConfigurationLoadedEventListener) {
            str = "IConfigurationLoadedEven…er::class.java.simpleName";
            str2 = "IConfigurationLoadedEventListener";
        } else if (listener instanceof INewSessionStartedEventListener) {
            str = "INewSessionStartedEventL…er::class.java.simpleName";
            str2 = "INewSessionStartedEventListener";
        } else {
            if (!(listener instanceof IWupInfoEventBackendListener)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format("Unable to unsubscribe. Unsupported listener type %s", Arrays.copyOf(new Object[]{listener.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                throw new SDKException(str3);
            }
            str = "IWupInfoEventBackendList…er::class.java.simpleName";
            str2 = "IWupInfoEventBackendListener";
        }
        Intrinsics.checkNotNullExpressionValue(str2, str);
        return removeListener(str2, listener);
    }
}
