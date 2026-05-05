package com.facebook.imagepipeline.listener;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLcz\u0004I\u0006>.6B\u0015\"4\u0012\u0006\u0013njG7LeN.ZS8\u000fs{:'c$\u007feCU }*\t]OogtMb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0012\u00172PģG3StSʠ~\u0017f\u0005N1Z7\u001cE\u0004ʀ.H\u001evCaY\u0013*0nxjV\u001bV\u001d\u001a@\nn$\u000f(tg|:xpkEG#1m\tbo\f>\te\rt\\W\u0011\u0005j6+n;e\u00193]\u001b\u0007\u0001_o\u0015M~U\u0013x)7+wwg8h\u007fB\u0019AN;k9:%9_o$'YW\u0014O^\u0017@w)\u007f=@\u0012\u0018\u001e'v2]\u001et\u0018&3#\u0004\u0004R^\u000fvP\u0010|q6E)\u00105;9Ijg`i'\u0015KD1\u001b0;\u0001\u001d)\fX\u001ci-\u001b\u0003{\u00025_JUH|\u000e\nO{\u0011\tp\u0012,\u00140u\u0004?}!.E)MZg1g\u007fJ^Rz\u000f\u0005\u000fp\u0004m`QX\"\u001d\u001ag.\u0017\u0016rD\u0013\t2d\u001df:%e\u001c\u0003\u000f.\f!)twj%k$\u0017uv~\u0003M\f\u0012U3tMqn\u001a%\b=l<MQ\u0012\u0014\u0012V\u0005$W<\u0011\u0016\tjPk$Z\u000bAhF\u0011\u0011\u001e\u0012\u0014D|\u0014C6M\b44ZHI`#c\u001b\u001ep]-\rmc\u0001\u0010-Xc(\u0011\u0002<t7\u001a\u0017p9\u000eu\u0016a,+hR1OgM\u0019TlRlB\u0006;\u0007-w0Kud_L\u001b/<iD>$8QQ]EC\u0013\r2J\u0002[I|vs[e\u0012U~-}\u001dZ\u0001.\u0016!1\u0005tnxjgTE;'b\u0001D d.}(ZKmqU#sNW\u0003\u000fi>^8+\t/ 5\u0001\u001e&+8=E7\u001dD|B1Ka4ɔqЦ}b\u0017ծE\u007f\u00122{\"\u007fda]`?HKi~l'Rn9B\u001f۷yڇF\t<ؿβLd"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{rc;\u000bl.5z5VLW,i(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "u(E", ">q^1h*>`\u0007\u000evk;k\r7eg$\u0007", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "", "", "@d`BX:MA(z\bm\u001b\u0001\u0011/M{3", "=m??b+NQ\u0019\fZo,\u0006\u0018", "", "@d`BX:M7\u0018", ">q^1h*>`\u0002z\u0003^", ">q^1h*>`x\u0010zg;e\u00057e", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~\u001e| \u0015Gv\u00158\u0006)?b", "3wc?T\u0014:^", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~!|\u001b\u001eW|\u000e", "Bga<j(;Z\u0019", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~.\u0011\u0015\u0015G}\u001c", "=m??b+NQ\u0019\fhm(\n\u0018", "=mA2d<>a(\\vg*|\u00106a\u000f,\u0006I", "=mA2d<>a(_vb3\r\u0016/", "@d`BX:M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "7r??X->b\u0017\u0002", "", "=mA2d<>a(l\nZ9\f", "1`[9X9\u001c]\"\u000ezq;f\u00064e}7", "", "=mA2d<>a(l\u000b\\*|\u0017=", "=mD9g0FO(~ek6{\u0019-e\r\u0015{<~\u001a\u0017F", "AtR0X:LT)\u0006", "@d`B\\9>ax\u0012\nk(d\u0005:", "7c", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RequestLoggingListener implements RequestListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RequestLoggingListener";
    private final Map<Pair<String, String>, Long> producerStartTimeMap = new HashMap();
    private final Map<String, Long> requestStartTimeMap = new HashMap();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0019\u007f\u0007lo?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004r(\u0005:\t}R\u0018m|Rr\rY\u000e4\u001a)n:Rmx\f\u0016U2Բs?AW@IGa\r63\"\tĵ\u000bѩ\t\u0001\"ݒ\u0019\"\u0005}[K:\u0016f\u0001GðTҫQ\t2\u0014\fC.\u0007ɏ`r"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{rc;\u000bl.5z5VLW,i\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "\"@6", "", "Bh\\2", "", "5dc!\\4>", "u(9", "5dc\u0012_(Ia\u0019}ib4|", "AsP?g\u001bB[\u0019", "3mS!\\4>", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;dk`", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getElapsedTime(Long l2, long j2) {
            if (l2 != null) {
                return j2 - l2.longValue();
            }
            return -1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getTime() {
            return SystemClock.uptimeMillis();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onProducerEvent(String requestId, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        if (FLog.isLoggable(2)) {
            Long l2 = this.producerStartTimeMap.get(Pair.create(requestId, producerName));
            Companion companion = Companion;
            FLog.v(TAG, "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(companion.getTime()), requestId, producerName, producerEventName, Long.valueOf(companion.getElapsedTime(l2, companion.getTime())));
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onProducerFinishWithCancellation(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (FLog.isLoggable(2)) {
            Long lRemove = this.producerStartTimeMap.remove(Pair.create(requestId, producerName));
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.v(TAG, "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(time), requestId, producerName, Long.valueOf(companion.getElapsedTime(lRemove, time)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onProducerFinishWithFailure(String requestId, String producerName, Throwable throwable, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (FLog.isLoggable(5)) {
            Long lRemove = this.producerStartTimeMap.remove(Pair.create(requestId, producerName));
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.w(TAG, throwable, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", Long.valueOf(time), requestId, producerName, Long.valueOf(companion.getElapsedTime(lRemove, time)), map, throwable.toString());
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onProducerFinishWithSuccess(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (FLog.isLoggable(2)) {
            Long lRemove = this.producerStartTimeMap.remove(Pair.create(requestId, producerName));
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.v(TAG, "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(time), requestId, producerName, Long.valueOf(companion.getElapsedTime(lRemove, time)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onProducerStart(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (FLog.isLoggable(2)) {
            Pair<String, String> mapKey = Pair.create(requestId, producerName);
            long time = Companion.getTime();
            Long lValueOf = Long.valueOf(time);
            Map<Pair<String, String>, Long> map = this.producerStartTimeMap;
            Intrinsics.checkNotNullExpressionValue(mapKey, "mapKey");
            map.put(mapKey, lValueOf);
            FLog.v(TAG, "time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(time), requestId, producerName);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public synchronized void onRequestCancellation(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (FLog.isLoggable(2)) {
            Long lRemove = this.requestStartTimeMap.remove(requestId);
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.v(TAG, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(time), requestId, Long.valueOf(companion.getElapsedTime(lRemove, time)));
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public synchronized void onRequestFailure(ImageRequest request, String requestId, Throwable throwable, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (FLog.isLoggable(5)) {
            Long lRemove = this.requestStartTimeMap.remove(requestId);
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.w(TAG, "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(time), requestId, Long.valueOf(companion.getElapsedTime(lRemove, time)), throwable.toString());
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public synchronized void onRequestStart(ImageRequest request, Object callerContextObject, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContextObject, "callerContextObject");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (FLog.isLoggable(2)) {
            Companion companion = Companion;
            FLog.v(TAG, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", Long.valueOf(companion.getTime()), requestId, callerContextObject, Boolean.valueOf(z2));
            this.requestStartTimeMap.put(requestId, Long.valueOf(companion.getTime()));
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public synchronized void onRequestSuccess(ImageRequest request, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (FLog.isLoggable(2)) {
            Long lRemove = this.requestStartTimeMap.remove(requestId);
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.v(TAG, "time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(time), requestId, Long.valueOf(companion.getElapsedTime(lRemove, time)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public synchronized void onUltimateProducerReached(String requestId, String producerName, boolean z2) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (FLog.isLoggable(2)) {
            Long lRemove = this.producerStartTimeMap.remove(Pair.create(requestId, producerName));
            Companion companion = Companion;
            long time = companion.getTime();
            FLog.v(TAG, "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(time), requestId, producerName, Long.valueOf(companion.getElapsedTime(lRemove, time)), Boolean.valueOf(z2));
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public boolean requiresExtraMap(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FLog.isLoggable(2);
    }
}
