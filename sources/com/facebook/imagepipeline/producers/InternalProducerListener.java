package com.facebook.imagepipeline.producers;

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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4G\u0007\":\u0012\u007fјnjO0L͜P.`_2\u000fq|<$iFyCAU\"}0\nWNmivJh\u0014K\u000f\f\u0016~~Bկ\u0006x\f\u0011OIRuM3eqS8\u000fuF\u000b.4::\u0010\u0004/\u0019ݵL\u0010\u0005}\fm\u001a\u001aH@\u001fC\u0003\u0011[\u000f2\u00124IP\u0007,h\u007fPLG\u001bjj51\u0011\u0002Dd&\u000e=CaUxb6%v\u0010'[DE?-%\u0002\u000e7XiK\u001bA\b<3uW=9Y\fiF\\\u0010\u0016+*}\u001amv6^\u001bP\u000f\u0019=*}t\u0012dVd\u0006\r\u0014\rj\r>\n5RF-Hq8\u0014A\u0001\u000bUVO0kr\u0006\ttN\u0019;~a?i1tayM)RG}\u001b\fL0\u0011r1]j\r\u000f\"1S&bwe\toVc\"Ykv4tp\fB\u0004^R05\n\u001dF\u0019;6\nFS7y\u0012`Vwz\u0015b~R\u0018_XD2p,6X\u0016\"YruK\u007f\u0019lfB)MJ]7\u0002\u0016\u001d8\\&GQ+\u001eZgj\u007fi{jP9w\u0007Ep\u0007k<`ibA?ic>l\u0003|\"KTd\u001bW\u0015O\u0004\u0010ht@\"`a1$@\u0014Rh$\u0013`X\" B6I\u0019\u000b x\t,NY~\u001f^\tuV\u0013%D2\u0003\u0002&\u000b\b/Qʷtuoծa.\u0003d02\u0012bC\u001b>W8gb{ɠ\u000b\u0005{Ò_iRMZsמyp"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w1LJkA'\u0011oLF\u0011b<Lv4.P\\;\\[rJi", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015uH=\u0015r,Wv4\u0014\"", ">q^1h*>`\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015uH=\u0015r,Wv4\u001d", ">q^1h*>`\u007f\u0003\tm,\u0006\t<2", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017.Hu3.\u0013hn \u000bq;N\u007f'T\"5*fZ<>\u0010\u0010Z\u000bX5\u0013N]I pDB#\u0013,P\u0006DhJ\u0017#\u00184znBc\u001e\u0011d\"\u007f@9fFfF}UPEk*qX5`M", "5dc\u001de6=c\u0017~\bE0\u000b\u0018/n\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faFmg:]v0GY$", "5dc\u001de6=c\u0017~\bE0\u000b\u0018/n\u007f5H", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faFmg:]v0GY\u001b\u0002", "=m??b+NQ\u0019\fZo,\u0006\u0018", "", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", ">q^1h*>`\u0002z\u0003^", "", "3uT;g\u0015:[\u0019", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~\u001e| \u0015Gv\u00158\u0006)?b", "3wc?T\u0014:^", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~!|\u001b\u001eW|\u000e", "B", "", "=m??b+NQ\u0019\f[b5\u0001\u00172W\u00047~.\u0011\u0015\u0015G}\u001c", "=m??b+NQ\u0019\fhm(\n\u0018", "=mD9g0FO(~ek6{\u0019-e\r\u0015{<~\u001a\u0017F", "AtR0X:LT)\u0006", "", "@d`B\\9>ax\u0012\nk(d\u0005:", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InternalProducerListener implements ProducerListener2 {
    private final ProducerListener producerListener;
    private final ProducerListener2 producerListener2;

    public InternalProducerListener(ProducerListener producerListener, ProducerListener2 producerListener2) {
        this.producerListener = producerListener;
        this.producerListener2 = producerListener2;
    }

    public final ProducerListener getProducerListener() {
        return this.producerListener;
    }

    public final ProducerListener2 getProducerListener2() {
        return this.producerListener2;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerEvent(ProducerContext context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onProducerEvent(context.getId(), str, str2);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onProducerEvent(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithCancellation(ProducerContext context, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onProducerFinishWithCancellation(context.getId(), str, map);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onProducerFinishWithCancellation(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithFailure(ProducerContext context, String str, Throwable th, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onProducerFinishWithFailure(context.getId(), str, th, map);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onProducerFinishWithFailure(context, str, th, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithSuccess(ProducerContext context, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onProducerFinishWithSuccess(context.getId(), str, map);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onProducerFinishWithSuccess(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerStart(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onProducerStart(context.getId(), str);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onProducerStart(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onUltimateProducerReached(ProducerContext context, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        if (producerListener != null) {
            producerListener.onUltimateProducerReached(context.getId(), str, z2);
        }
        ProducerListener2 producerListener2 = this.producerListener2;
        if (producerListener2 != null) {
            producerListener2.onUltimateProducerReached(context, str, z2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public boolean requiresExtraMap(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProducerListener producerListener = this.producerListener;
        Boolean boolValueOf = producerListener != null ? Boolean.valueOf(producerListener.requiresExtraMap(context.getId())) : null;
        if (!Intrinsics.areEqual((Object) boolValueOf, (Object) true)) {
            ProducerListener2 producerListener2 = this.producerListener2;
            boolValueOf = producerListener2 != null ? Boolean.valueOf(producerListener2.requiresExtraMap(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
