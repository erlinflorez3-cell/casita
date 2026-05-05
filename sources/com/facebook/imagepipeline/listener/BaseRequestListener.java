package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007f\u0007llA0R\bP.XS2\u000fy|<$a'yCQU\"}(\tWNupvJ`\u000bK\u000f\u0014ǝ\u0001j2L[\rs܈?2pn\u007f6ޜs=G`=T\u0013!J\"f{5\u0005(-`\u0010%~sO\u001a\u0017H@\u001f>\u0003\u0011[\u000b2\u00124Bf\u0015f\tuUNH\u001b_j31\u0006\u0002B|+\u00104\u000bR%F\u0003+=\to&CNG7%%\u0002\u0007\u0017Tk?1C\b<3qm;s}\u0002aNX.\u0016E/]\u0010urT`5Un\u0011?+}g{T\u001c3\u0010z*\u0019l\u0016\u001c\u000e?V>/*f6\u0012Cv\u0003SnT\u0018]p\tAu~C3\rK+g\u001d\u0017Uo>1Ne\u007f5\u0011,(\u0019nO_\u0005 n\u001d3b\bSAQnAXP\u001aYkq\u001ao\u0011\u000bp\u0018x]\u000e=\u0014\u0011\\\u0019U;i<;!\u001a\u0006xHu{\u001d`\u0017W0f\u0011N0}.7X\u000b<^Rg\u001dk~X\u001f@Ys*d\u001f}6\u0015P`\u0006M9%>`\u007flwme]8)_jEl\u0007k<cibAIic>v\u0019\u000b\\eJx\u001dX\u0015D\u0004\u0010hm@\"`Z\u001b\u0014\u0006\u0013\\N:+bC\u007f\u001fL,_\u001d\r\u0019V\u00176Bo\u0012Os#\u0007\u001e\u0018l3R\u0005\u001a(\u0003\u001a\u0019P\u000b\u0003 k\u0007LD|\u000f&]E_I1&\u00047/HEA\u0015\u0019\f\u007fui|KZo.u\u0004\u007fP\u001a(>i/k\u0017?\u00037M\u001a-sa9y\u001a[ C\u0013|($kl<j j\u001f0'~ߣSq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u000bIQ;X4*%hoHmg:]v0GY$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "u(E", "=m??b+NQ\u0019\fZo,\u0006\u0018", "", "@d`BX:M7\u0018", "", ">q^1h*>`\u0002z\u0003^", "3uT;g\u0015:[\u0019", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~\u001e| \u0015Gv\u00158\u0006)?b", "3wc?T\u0014:^", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~!|\u001b\u001eW|\u000e", "B", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~.\u0011\u0015\u0015G}\u001c", "=m??b+NQ\u0019\fhm(\n\u0018", "=mA2d<>a(\\vg*|\u00106a\u000f,\u0006I", "=mA2d<>a(_vb3\r\u0016/", "@d`BX:M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "Bga<j(;Z\u0019", "7r??X->b\u0017\u0002", "", "=mA2d<>a(l\nZ9\f", "1`[9X9\u001c]\"\u000ezq;", "", "=mA2d<>a(l\u000b\\*|\u0017=", "=mD9g0FO(~ek6{\u0019-e\r\u0015{<~\u001a\u0017F", "AtR0X:LT)\u0006", "@d`B\\9>ax\u0012\nk(d\u0005:", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BaseRequestListener implements RequestListener {
    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerEvent(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithCancellation(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithFailure(String requestId, String producerName, Throwable t2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t2, "t");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithSuccess(String requestId, String producerName, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerStart(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest request, String requestId, Throwable throwable, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest request, Object callerContext, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest request, String requestId, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onUltimateProducerReached(String requestId, String producerName, boolean z2) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public boolean requiresExtraMap(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }
}
