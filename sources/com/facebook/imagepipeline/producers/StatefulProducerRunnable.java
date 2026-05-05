package com.facebook.imagepipeline.producers;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.executors.StatefulRunnable;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`_2\u000fq{<$iFyCAV\"}0\tWNmivJp\u000bK\u000f\f\u001b~\u000fBկ}zc܈\u001d1ruO5]o\u00048\u000ftv.0<09\u0012\u000b\u0011\u001c:HF͌)E[\u0010 3XphV\u001dQ\u0013\u001f*\u0006l&\u0011\"jnf6vtҺ>/1\f2W\\5w0+\\=Lb7%xw\u001da¨}Wչ)S\u0011\u0018\u001byM\u0015W\u007fM\u0007x'U3Yug6\u0007\b*\u0014YZ=c\u00019t\u0007g_:;qa,r^#@\n\u000b\u007f\u001d>\u001a\r4/X2=\u001c|\u0007<;\u000bq\u0002K\u0001\blR\u0018|w5MӛFEڢ=\u001btg*A'eO{3\u001cd5I|/sl\u000e\u000f$KX\u0006jIQnQ\u000f`RnK\b\u001cp\u0011\u0011Z\n>W\u00181\u0012\u0010dϏkI٦=#/|RZRh\u000f\u000bpjci\t̲n$Eݮ9Ҋ\r\fbե5%yZlf<\u0013]\u001c\u0003\u000f\u000e\n# \u000b\u007fR S\u001b\u0005\"?Ȟlܷa\u000e=1lCg{<\u001ae>v3cW:߇c؏z\u0014Gֺ3\u0011fiZS:^3̨$ĘLj\u0018ǮLP\\\u0013+2myrؼ.֞\u001d\\\u001dǽҺ\"]"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w;R7z4\u001f%oLF\u0011b<Lv44\\W5XOy=i", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0001*\u0017E\u007f\u001dF\u00043~G\r\u001cFm\u0017>T0Kt=\u001a\u0012oa\u000f", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", ">q^1h*>`\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015uH=\u0015r,Wv4\u0014\"", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", ">q^1h*>`\u0002z\u0003^", "", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017!EtB.\u001dhn\u000fma6V@(CJN)f\\x\u0007\u0018\u001aV\u0010N6\u0011\u0010YH(wD\u0001*\u00156H\u00129h\u000e\u001a_xBtoRT\u0010T`\u0019\u0004P)qFf,O.?Ojse\b]\u001dYDD*]u!\u0017jP9\u000e\u0007S\u0018v[y1rT#yH\">zi\u00100|_;\u0005%\u001fXY\u0002\u001bAX\b:J\u0014\t0;2.\fGp\u001a\bL\b\"0eC|i'", "3wc?T\u0014:^\u0003\bXZ5z\t6l{7\u007fJ\n", "", "5dc\u0012k;KO\u0001z\u0006H5Z\u00058c\u007f/\u0003<\u0010\u001b!P", "u(;7T=:\u001d)\u000e~eud\u0005:;", "2hb=b:>@\u0019\r\u000be;", "", "@dbB_;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc\u0012k;KO\u0001z\u0006H5]\u00053l\u00105{", "3wR2c;B]\"", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "5dc\u0012k;KO\u0001z\u0006H5j\u0019-c\u007f6\n", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~Ay+\r", "=m2.a*>Z z\nb6\u0006", "=m5.\\3N`\u0019", ExifInterface.GPS_MEASUREMENT_3D, "=mBBV*>a'", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class StatefulProducerRunnable<T> extends StatefulRunnable<T> {
    private final Consumer<T> consumer;
    private final ProducerContext producerContext;
    private final ProducerListener2 producerListener;
    private final String producerName;

    public StatefulProducerRunnable(Consumer<T> consumer, ProducerListener2 producerListener, ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.consumer = consumer;
        this.producerListener = producerListener;
        this.producerContext = producerContext;
        this.producerName = producerName;
        producerListener.onProducerStart(producerContext, producerName);
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    protected abstract void disposeResult(T t2);

    protected Map<String, String> getExtraMapOnCancellation() {
        return null;
    }

    protected Map<String, String> getExtraMapOnFailure(Exception exc) {
        return null;
    }

    protected Map<String, String> getExtraMapOnSuccess(T t2) {
        return null;
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    protected void onCancellation() {
        ProducerListener2 producerListener2 = this.producerListener;
        ProducerContext producerContext = this.producerContext;
        String str = this.producerName;
        producerListener2.onProducerFinishWithCancellation(producerContext, str, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnCancellation() : null);
        this.consumer.onCancellation();
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    protected void onFailure(Exception e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        ProducerListener2 producerListener2 = this.producerListener;
        ProducerContext producerContext = this.producerContext;
        String str = this.producerName;
        Exception exc = e2;
        producerListener2.onProducerFinishWithFailure(producerContext, str, exc, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnFailure(e2) : null);
        this.consumer.onFailure(exc);
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    protected void onSuccess(T t2) {
        ProducerListener2 producerListener2 = this.producerListener;
        ProducerContext producerContext = this.producerContext;
        String str = this.producerName;
        producerListener2.onProducerFinishWithSuccess(producerContext, str, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnSuccess(t2) : null);
        this.consumer.onNewResult(t2, 1);
    }
}
