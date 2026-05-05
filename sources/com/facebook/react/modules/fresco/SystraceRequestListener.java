package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.dynatrace.android.agent.Global;
import com.facebook.imagepipeline.listener.BaseRequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.systrace.Systrace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\":5\u007f\u0007tvA0ZeP.XS2\u000fy{<$a'yCIw\"}(\tWNuhvJ`\u000eK\u000f\u001c\u0016\u0001j2I]xk\u001b\u00172HoG3[ڎE9fuLӌP2P7:\bв\u001e*V\u0010?\u0019QS$\u0012^I!>`\u0017e\u0005H\u00176B.\f6\\\u0016SfLziR/Q\b0V\u0017Sm=\u0015M;O\u0005+\u001b\u0001y\u001eYEg9#0k\u00035W\fQ\u0011M\nK\u0015j7'YN\u0004YFX.\u0019+*}\u001c$\u0007n\u0011\u0013ax\fU4\u007fgYZ&(&\u007f,\u0011J\u000f&\u0006UM^1(w \u000ea\u0007#eN^\u001alR\u0002\u000bad\u001c5\u0002C+g |P\u0010J_b\u007f(\u0013 6#/wQ_b\u0018x\u0015IY(U?\\X=vS:kK{\u001c~r\u0004:\u0004^L\u00101\f\u0011\\\u001c;6\nHi54\u0018VX\u007fv3i\u0019Ww\\`@PsF;8\u0014$ZriK\u007f\u0019bfA)MJ]7\u0002\u0016\u001d8\\&Ag9Xt]~\u0002j{f:)=}OY\u001d\u0004>[GhK5\u007fh@e`\u0010,?jt5\\t\\k\f\twn6znx,\u0010{rW<\u0017@V\n\u001cbDa\u001dj2`\u0003L`q\u0001\u0017irh>\u0004\u000572\u001d\u0002$#$Gd%\u000f}\u0007\u0011IZ\u0006\u0011&;Xi5G>\u0006&v>\u0015#5\u0004$\u0004U\u0002dGz\b\\\n\u001e\n.629\u007fJm\u0017\u001d\tA202\f`Cq_N*')~PһGÿ2g\u0010ξAPnmbgd\u00192v\rw3\u0016t\f\ncVzued\rk>ww1_jR\u000fً\u0011ȷ\"%\tǻr!C4[?-\u0018\b\u0014]\u001aqky{>{r\u000fTvu\u0006<cDt\u0011W\f6\u0012ͲU˕\u0003>*غр\u0007c"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006w25g{*\u0001[*<\\P7i4\u000b\u0015tq9\u0015r\u0013R\u00056GUN92", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u000bIQ;X4*%hoHmg:]v0GY$", "u(E", "1ta?X5M7\u0018", "", ">q^1h*>`|}", "", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "@d`BX:Ma|}", "=m??b+NQ\u0019\fZo,\u0006\u0018", "", "@d`BX:M7\u0018", ">q^1h*>`\u0002z\u0003^", "3uT;g\u0015:[\u0019", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~\u001e| \u0015Gv\u00158\u0006)?b", "3wc?T\u0014:^", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~!|\u001b\u001eW|\u000e", "B", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~.\u0011\u0015\u0015G}\u001c", "=m??b+NQ\u0019\fhm(\n\u0018", "=mA2d<>a(\\vg*|\u00106a\u000f,\u0006I", "=mA2d<>a(_vb3\r\u0016/", "@d`BX:M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "Bga<j(;Z\u0019", "7r??X->b\u0017\u0002", "", "=mA2d<>a(l\nZ9\f", "1`[9X9\u001c]\"\u000ezq;", "", "=mA2d<>a(l\u000b\\*|\u0017=", "@d`B\\9>ax\u0012\nk(d\u0005:", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SystraceRequestListener extends BaseRequestListener {
    private int currentId;
    private Map<String, Pair<Integer, String>> producerId = new LinkedHashMap();
    private Map<String, Pair<Integer, String>> requestsId = new LinkedHashMap();

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerEvent(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (Systrace.isTracing(0L)) {
            Systrace.traceInstant(0L, "FRESCO_PRODUCER_EVENT_" + StringsKt.replace$default(requestId, AbstractJsonLexerKt.COLON, '_', false, 4, (Object) null) + Global.UNDERSCORE + StringsKt.replace$default(producerName, AbstractJsonLexerKt.COLON, '_', false, 4, (Object) null) + Global.UNDERSCORE + StringsKt.replace$default(eventName, AbstractJsonLexerKt.COLON, '_', false, 4, (Object) null), Systrace.EventScope.THREAD);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithCancellation(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (Systrace.isTracing(0L) && this.producerId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.producerId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithFailure(String requestId, String producerName, Throwable t2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t2, "t");
        if (Systrace.isTracing(0L) && this.producerId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.producerId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithSuccess(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (Systrace.isTracing(0L) && this.producerId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.producerId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerStart(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (Systrace.isTracing(0L)) {
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), "FRESCO_PRODUCER_" + StringsKt.replace$default(producerName, AbstractJsonLexerKt.COLON, '_', false, 4, (Object) null));
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Systrace.beginAsyncSection(0L, (String) second, this.currentId);
            Map<String, Pair<Integer, String>> map = this.producerId;
            Intrinsics.checkNotNull(pairCreate);
            map.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (Systrace.isTracing(0L) && this.requestsId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.requestsId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest request, String requestId, Throwable throwable, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Systrace.isTracing(0L) && this.requestsId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.requestsId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest request, Object callerContext, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (Systrace.isTracing(0L)) {
            StringBuilder sb = new StringBuilder("FRESCO_REQUEST_");
            String string = request.getSourceUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb.append(StringsKt.replace$default(string, AbstractJsonLexerKt.COLON, '_', false, 4, (Object) null));
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), sb.toString());
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Systrace.beginAsyncSection(0L, (String) second, this.currentId);
            Map<String, Pair<Integer, String>> map = this.requestsId;
            Intrinsics.checkNotNull(pairCreate);
            map.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest request, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (Systrace.isTracing(0L) && this.requestsId.containsKey(requestId)) {
            Pair<Integer, String> pair = this.requestsId.get(requestId);
            Intrinsics.checkNotNull(pair);
            Pair<Integer, String> pair2 = pair;
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair2.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Systrace.endAsyncSection(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public boolean requiresExtraMap(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }
}
