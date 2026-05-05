package com.biocatch.client.android.sdk.collection.collectors.callInfo;

import android.telephony.TelephonyCallback;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0Le^.Zݷ2\u000fy{<řc$\u007fICU ~*\teNogtJ`\nYƤ6\u0016'i\\I\u0004x\u000e\u0012=3\u0003rУ7M}?\u0002n\u0003=\u001d `*h}\u0013\n2*v\u001a=\u000f\fY\u001a\u001dH@\u001fB\u0003\u0011[\u00112\u00124Cf\u0015fju[NH\u001bej31\f\u0002B|5&DE[\u001bUl';~\u0012\"9LO5C*\u001a\u0017WniB\u001bO\u0002?\u0015hU,YM\\]FZ\u0010\u0014C0.\u00134ù(ػ\tQhϯ˕/_"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[I\u000eU+\u0018\bcJ8L@>&\u0005(G\b-u|\u0017!\u000eB@", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017PT!<`z\u001c5sk", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017PT!<`z\u001c5sT\fIJBYC\u001a$hH=\u0015r,Wv4\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>|N2\r\u0010\\K-\u0003+;-\u0017,R\u0002H>", "u(E", "1`[9<5?]vz\u0002e)x\u00075s", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>kJ2\u0014hbB.NU7(\u0017\u000fE\u000b:o\u0001\u0019k", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "=m2._3,b\u0015\u000ez</x\u00121e~", "", "AsPAX", "", "@dV6f;>`", "1`[9U(<Y", "@d_<e;\u001cO \u0006hm(\f\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[8\nU2z\u0014UP$D", "Cma2Z0Lb\u0019\f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TelephonyCallbackWrapper extends TelephonyCallback implements TelephonyCallback.CallStateListener, ITelephonyListener {
    private final HashSet<ICallInfoEventHandler> callInfoCallbacks = new HashSet<>();

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener
    public void callStateChanged(int i2) {
        ITelephonyListener.DefaultImpls.callStateChanged(this, i2);
    }

    @Override // android.telephony.TelephonyCallback.CallStateListener
    public void onCallStateChanged(int i2) {
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
