package com.biocatch.client.android.sdk.techicalServices.events;

import com.biocatch.client.android.sdk.contract.State;
import com.biocatch.client.android.sdk.contract.events.IEventListener;
import com.biocatch.client.android.sdk.contract.events.INewSessionStartedEventListener;
import com.biocatch.client.android.sdk.contract.events.IStateChangedEventListener;
import com.biocatch.client.android.sdk.contract.events.NewSessionStartedEvent;
import com.biocatch.client.android.sdk.contract.events.StateChangedEvent;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.BCWupInfoEvent;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.IWupInfoEventListener;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012\u000e\u0007njO0L͜P.`b2\u000f\u0002{<$a$yCIU\"}(\u000eWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ic\u0002e\u0012\u00153HģU\u074c}ok8!wȥ\t @\"\u0001\u0010\u0013\u000b2*v\u001b'~QW$\u0012^C!>`\u001ae\u0005H\u0017L>h\u0005,j\u007fNdS5iH>;\u0003\u0018M~+m@\u0015M;I\u001d3\u001b\by\u001eYKg9#7k\u00035e$K\u0011S\n=3sW+9^\fWdnH*#Bg\r\f\u000bV`\u0013]x\fU.\u007fgY]&(&\u007fB\r\u0005\u0010\u001c\u001f?H\\8Jj\u0016\u001bKt!X\t\\\u0010xZ\u007f)yf\u001b3\rK+g 7oo<1`G}\u0015\rL&\u0011v1ad\u0010p\u0015IY&U_S\u0017׃Jݳ\u000eYEЧT\rp\bB\u0012@Q\u00107\f\u00154\u001657\n>Q)\u001a\t\u001fֶiЛ\tbpSw[͛D="}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-,_v0VZ\u0018\ncVrF#qk\u000eW:z\u0005fR(lD\r", "", "u(E", "3uT;g\u0013Ba(~\u0004^9\u000b", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPG\f_v0V3R:kR{=!g", "At_=b9MS\u0018e~l;|\u0012/r\u000e", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ")KY.i(\bZ\u0015\b|(\n\u0004\u0005=sU", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", ":hbAX5>`", "1kT.e", ">tQ9\\:A<\u0019\u0011h^:\u000b\r9nm7wM\u0010\u0017\u0016", "Adb@\\6G7w", ">tQ9\\:AA(z\n^\n\u007f\u00058g\u007f'", "AsPAX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\"-\u0011wa\u000f", ">tQ9\\:AE)\n^g-\u0007", "0bFBc\u0010GT#^\f^5\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007poL\u001eY\u000f\u0016\u0006c!5nMFt", "@d\\<i,%W'\u000ezg,\n", "", "AtQ@V9BP\u0019", "CmbBU:<`\u001d{z", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ClientEventService {
    private final Class<? extends IEventListener>[] supportedListeners = {IStateChangedEventListener.class, INewSessionStartedEventListener.class, IWupInfoEventListener.class};
    private final HashMap<String, HashSet<IEventListener>> eventListeners = new HashMap<>();

    private final void addListener(String str, IEventListener iEventListener) {
        if (!this.eventListeners.containsKey(str)) {
            this.eventListeners.put(str, new HashSet<>());
        }
        HashSet<IEventListener> hashSet = this.eventListeners.get(str);
        Intrinsics.checkNotNull(hashSet);
        hashSet.add(iEventListener);
    }

    private final boolean removeListener(String str, IEventListener iEventListener) {
        if (!this.eventListeners.containsKey(str)) {
            return false;
        }
        HashSet<IEventListener> hashSet = this.eventListeners.get(str);
        Intrinsics.checkNotNull(hashSet);
        hashSet.remove(iEventListener);
        return true;
    }

    public final void clear() {
        this.eventListeners.clear();
    }

    public final void publishNewSessionStarted(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        HashSet<IEventListener> hashSet = this.eventListeners.get("INewSessionStartedEventListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof INewSessionStartedEventListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((INewSessionStartedEventListener) it.next()).onNewSessionStarted(new NewSessionStartedEvent(sessionID));
            }
        }
    }

    public final void publishStateChanged(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HashSet<IEventListener> hashSet = this.eventListeners.get("IStateChangedEventListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof IStateChangedEventListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IStateChangedEventListener) it.next()).onStateChanged(new StateChangedEvent(state));
            }
        }
    }

    public final void publishWupInfo(BCWupInfoEvent bcWupInfoEvent) {
        Intrinsics.checkNotNullParameter(bcWupInfoEvent, "bcWupInfoEvent");
        HashSet<IEventListener> hashSet = this.eventListeners.get("IWupInfoEventListener");
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (obj instanceof IWupInfoEventListener) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IWupInfoEventListener) it.next()).onWupInfoSent(bcWupInfoEvent);
            }
        }
    }

    public final void subscribe(IEventListener listener) throws SDKException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        boolean z2 = false;
        for (Class<? extends IEventListener> cls : this.supportedListeners) {
            if (cls.isAssignableFrom(listener.getClass())) {
                String simpleName = cls.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "supportedListener.simpleName");
                addListener(simpleName, listener);
                z2 = true;
            }
        }
        if (z2) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Unable to subscribe. Unsupported listener type %s", Arrays.copyOf(new Object[]{listener.getClass().getSimpleName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        throw new SDKException(str);
    }

    public final boolean unsubscribe(IEventListener listener) throws SDKException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        boolean z2 = false;
        boolean z3 = false;
        for (Class<? extends IEventListener> cls : this.supportedListeners) {
            if (cls.isAssignableFrom(listener.getClass())) {
                String simpleName = cls.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "supportedListener.simpleName");
                z3 = removeListener(simpleName, listener) || z3;
                z2 = true;
            }
        }
        if (z2) {
            return z3;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Unable to unsubscribe. Unsupported listener type %s", Arrays.copyOf(new Object[]{listener.getClass().getSimpleName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        throw new SDKException(str);
    }
}
