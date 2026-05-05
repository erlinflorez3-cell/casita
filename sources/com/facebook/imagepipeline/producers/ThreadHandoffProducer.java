package com.facebook.imagepipeline.producers;

import android.os.Looper;
import com.facebook.imagepipeline.instrumentation.FrescoInstrumenter;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.C1626yg;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDZc|\u0004G\u00068\u000bDB\u0007\"2\u0016\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<$a$\bّYdB\u007f(ޛ]M\u0018m~Lj\u000b\n\u000e4\u00161i;\nn\tg \u0010JH\u007fACM&މg`\u0005:\u0013\"J\"f|ڱ\u0005\u001a8LX\u0013\tLc\f@:pzH]%S\u0015\u001c\"\u0006tĨ/*\rk\\C`l\fHu7S~PO?e@~]\r|ÖU\rțe$3¨O7\u001b*a\tWaiA\u001b? @ݾl-/Ǣau]=f\bЕ\u0019;"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FHk0\u001dwdj8\u0011d-9\u00041F\\L,i(", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "7m_Bg\u0017K]\u0018\u000fx^9", "Bga2T+!O\"}\u0005_-g\u00169d\u0010&{Ml'\u0017Wo", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FHk0\u001dwdj8\u0011d-9\u00041F\\L,i>\u0003=$\u00120", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017.Hu3.\u0013hn\u000fma6V@(CJN)f\\x\u0007\u0018\u001aV\u0010N6\u0011\u0010YH(wD\u0001*\u00156H\u00129h\u000e\u001a_|8wp>UrC\u0003\u0014\u007fB*SSc^\nEARN:d\u001c_r +", "5dc\u0016a7Nb\u0004\f\u0005]<z\t<", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faF\\", "5dc![9>O\u0018avg+\u0007\n0P\r2zP~\u0017$3\u007f\u000eLv", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r*nA\u001e\u0011gD5\u0010b6Ow\u0012TVM<ZR\u007f)$\u0012j\u000e$", ">q^1h*>@\u0019\r\u000be;\u000b", "", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ThreadHandoffProducer<T> implements Producer<T> {
    public static final Companion Companion = new Companion(null);
    public static final String PRODUCER_NAME = "BackgroundThreadHandoffProducer";
    private final Producer<T> inputProducer;
    private final ThreadHandoffProducerQueue threadHandoffProducerQueue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0RnP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018^uj\u0007Lp\nq\u00116\u001a\u0007nDI\u0004}$\u0012W@PuW3{vm=nxN\u0005N7h8J\u0011\u000f\u001bBH>xQŖ\u001eë\u00160H\u0081ĖV\u0015"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FHk0\u001dwdj8\u0011d-9\u00041F\\L,i\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "\u001eQ>\u0011H\n\u001e@\u0013gVF\f", "", "5dc\u0016a:M`)\u0007zg;x\u00183o\t\u0017wB", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "Ag^B_++c\"b\u0003f,{\r+t\u007f/\u0010", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getInstrumentationTag(ProducerContext producerContext) {
            if (!FrescoInstrumenter.isTracing()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + producerContext.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldRunImmediately(ProducerContext producerContext) throws Throwable {
            if (!producerContext.getImagePipelineConfig().getExperiments().getHandOffOnUiThreadOnly()) {
                return false;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(ZO.xd("\u0012RB<sI\"8+.Y2-\u001b!#\u0002", (short) (Od.Xd() ^ (-13269)), (short) (Od.Xd() ^ (-3732)))).getDeclaredMethod(C1626yg.Ud("!/&[;>\u0019BCGw3:", (short) (C1580rY.Xd() ^ (-13004)), (short) (C1580rY.Xd() ^ (-27737))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                return ((Looper) declaredMethod.invoke(null, objArr)).getThread() != Thread.currentThread();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public ThreadHandoffProducer(Producer<T> inputProducer, ThreadHandoffProducerQueue threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.inputProducer = inputProducer;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
    }

    public final Producer<T> getInputProducer() {
        return this.inputProducer;
    }

    public final ThreadHandoffProducerQueue getThreadHandoffProducerQueue() {
        return this.threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<T> consumer, final ProducerContext context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            final ProducerListener2 producerListener = context.getProducerListener();
            Companion companion = Companion;
            if (companion.shouldRunImmediately(context)) {
                producerListener.onProducerStart(context, PRODUCER_NAME);
                producerListener.onProducerFinishWithSuccess(context, PRODUCER_NAME, null);
                this.inputProducer.produceResults(consumer, context);
                return;
            } else {
                final StatefulProducerRunnable<T> statefulProducerRunnable = new StatefulProducerRunnable<T>(consumer, producerListener, context, this) { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer$produceResults$1$statefulRunnable$1
                    final /* synthetic */ Consumer<T> $consumer;
                    final /* synthetic */ ProducerContext $context;
                    final /* synthetic */ ProducerListener2 $producerListener;
                    final /* synthetic */ ThreadHandoffProducer<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(consumer, producerListener, context, ThreadHandoffProducer.PRODUCER_NAME);
                        this.$consumer = consumer;
                        this.$producerListener = producerListener;
                        this.$context = context;
                        this.this$0 = this;
                    }

                    @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                    protected void disposeResult(T t2) {
                    }

                    @Override // com.facebook.common.executors.StatefulRunnable
                    protected T getResult() throws Exception {
                        return null;
                    }

                    @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                    protected void onSuccess(T t2) {
                        this.$producerListener.onProducerFinishWithSuccess(this.$context, ThreadHandoffProducer.PRODUCER_NAME, null);
                        this.this$0.getInputProducer().produceResults(this.$consumer, this.$context);
                    }
                };
                context.addCallbacks(new BaseProducerContextCallbacks() { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer$produceResults$1$1
                    @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                    public void onCancellationRequested() {
                        statefulProducerRunnable.cancel();
                        this.getThreadHandoffProducerQueue().remove(statefulProducerRunnable);
                    }
                });
                this.threadHandoffProducerQueue.addToQueueOrExecute(FrescoInstrumenter.decorateRunnable(statefulProducerRunnable, companion.getInstrumentationTag(context)));
                return;
            }
        }
        FrescoSystrace.beginSection("ThreadHandoffProducer#produceResults");
        try {
            final ProducerListener2 producerListener2 = context.getProducerListener();
            Companion companion2 = Companion;
            if (companion2.shouldRunImmediately(context)) {
                producerListener2.onProducerStart(context, PRODUCER_NAME);
                producerListener2.onProducerFinishWithSuccess(context, PRODUCER_NAME, null);
                this.inputProducer.produceResults(consumer, context);
            } else {
                final StatefulProducerRunnable<T> statefulProducerRunnable2 = new StatefulProducerRunnable<T>(consumer, producerListener2, context, this) { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer$produceResults$1$statefulRunnable$1
                    final /* synthetic */ Consumer<T> $consumer;
                    final /* synthetic */ ProducerContext $context;
                    final /* synthetic */ ProducerListener2 $producerListener;
                    final /* synthetic */ ThreadHandoffProducer<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(consumer, producerListener2, context, ThreadHandoffProducer.PRODUCER_NAME);
                        this.$consumer = consumer;
                        this.$producerListener = producerListener2;
                        this.$context = context;
                        this.this$0 = this;
                    }

                    @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                    protected void disposeResult(T t2) {
                    }

                    @Override // com.facebook.common.executors.StatefulRunnable
                    protected T getResult() throws Exception {
                        return null;
                    }

                    @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
                    protected void onSuccess(T t2) {
                        this.$producerListener.onProducerFinishWithSuccess(this.$context, ThreadHandoffProducer.PRODUCER_NAME, null);
                        this.this$0.getInputProducer().produceResults(this.$consumer, this.$context);
                    }
                };
                context.addCallbacks(new BaseProducerContextCallbacks() { // from class: com.facebook.imagepipeline.producers.ThreadHandoffProducer$produceResults$1$1
                    @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                    public void onCancellationRequested() {
                        statefulProducerRunnable2.cancel();
                        this.getThreadHandoffProducerQueue().remove(statefulProducerRunnable2);
                    }
                });
                this.threadHandoffProducerQueue.addToQueueOrExecute(FrescoInstrumenter.decorateRunnable(statefulProducerRunnable2, companion2.getInstrumentationTag(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            FrescoSystrace.endSection();
        }
    }
}
