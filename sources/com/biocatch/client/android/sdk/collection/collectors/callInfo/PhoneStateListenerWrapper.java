package com.biocatch.client.android.sdk.collection.collectors.callInfo;

import android.telephony.PhoneStateListener;
import com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener;
import java.util.HashSet;
import java.util.Iterator;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u000e\u0007njO0LeN/ZS8\u000fsڔ<$i*yّCU(\n*\tUOog\u0005Jb\u000bI\u000f\fǝ\u000f̓\\I\u0004w\u000e\u0012=2\u0003rУ7M}>\u0002x\u0003>\u001d `+h}\u0013\u000b2*v\u001b'\u0001QW$\u0014F?\u001fG\u0019!\u0016\u0013( \u001e>N\nN`u]NH\u001ba\u0001Ck\u0011wRf'\u000e9-Q\u001bPl';\b(2sNEG-%\u0002\f7ViN\u001b? AK|wF9K\fgFZ\u0010\u0014C/}\u0010Fx6^\u0015Q\u000f\u0010\u00060յgQXʫ@y\u0001\u0002\u001bCǲ\u0012\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[E\u0011X4\rrh=3n+;-\u0017,R\u0002HZ\u000e\b!\u00195wF", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qfC\u000b \u00175~\nKv\f9g\r @m#\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>|N2\r\u0010\\K-\u0003+;-\u0017,R\u0002H>", "u(E", "1`[9<5?]vz\u0002e)x\u00075s", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>kJ2\u0014hbB.NU7(\u0017\u000fE\u000b:o\u0001\u0019k", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "5dc\u0010T3E7\"\u007f\u0005<(\u0004\u0010,a}.\n", "u(;7T=:\u001d)\u000e~eu_\u0005=hm(\u000b\u0016", "=m2._3,b\u0015\u000ez</x\u00121e~", "", "AsPAX", "", "7mR<`0GU\u0002\u000f\u0003[,\n", "", "@dV6f;>`", "1`[9U(<Y", "@d_<e;\u001cO \u0006hm(\f\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[8\nU2z\u0014UP$D", "Cma2Z0Lb\u0019\f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PhoneStateListenerWrapper extends PhoneStateListener implements ITelephonyListener {
    private final HashSet<ICallInfoEventHandler> callInfoCallbacks = new HashSet<>();

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener
    public void callStateChanged(int i2) {
        ITelephonyListener.DefaultImpls.callStateChanged(this, i2);
    }

    public final HashSet<ICallInfoEventHandler> getCallInfoCallbacks() {
        return this.callInfoCallbacks;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i2, String str) {
        callStateChanged(i2);
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener
    public void register(ICallInfoEventHandler callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callInfoCallbacks.add(callback);
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener
    public void reportCallState(CallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<ICallInfoEventHandler> it = this.callInfoCallbacks.iterator();
        while (it.hasNext()) {
            it.next().handleMessage(state);
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener
    public void unregister(ICallInfoEventHandler callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callInfoCallbacks.remove(callback);
    }
}
