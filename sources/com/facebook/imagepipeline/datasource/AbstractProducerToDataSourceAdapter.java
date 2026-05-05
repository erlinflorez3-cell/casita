package com.facebook.imagepipeline.datasource;

import com.facebook.common.internal.Preconditions;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.BaseConsumer;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.request.HasImageRequest;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wHCU(\u0007*ޛWN}gvϺb\u000bQ1\u000e\u0016\u0007v4Icތe܈\u00172XoG\u074cUoK9ht<\u0005(209\u0002\u0005\u0007\u001b2H\u001e|\u0003CQ\f\u0018UV\u0081bT\u0013˟\u0013\u0019B\fN\"\u0011\u001e#f|6xl\f;oF\tkRX5aH\u0003]\u000fVT]˙%d./N;M\u0015SX\u0013\u000b`aW\u0003mxݘ\th5/sO\u0002hNX.&[?\u0018\u0019k\u0006>b\u0015Sp\f]˃}w\u0012PVD\u0006\u0010\u0014\u001bL\u0006\u001e\u0006U_>1*h\u001e\ra\r!ipT\u0010wZ\u007f){|\u0019m\u0006AFQ\u001b\u0015m(;a\\E\u0019\u001d\rL?1r/yl\u000e\u000f4aT@v?qX=vj:_K\u000f\u001crx\u0001`ʶ`K\u000eQ\u0014\u0011\\:U;iR;!\u001a\u001c\u000fVϼz\u0005n\r$}`QX$\u0005\u0015e4?`1ռfʰoTlZ2\u001c[(%\u0016\f\u000e+ \u000b~˶%+\u0018ʚgjow[kZ4=jOY\u001dpް[?fڨMSi\u001fobρ\u0018d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u!DU\f*Gz\u0014.\u0017\u001f8yC+\u0011fp$\u0014m+^t'T;X\u000bXan+\u001e\"g\fN\u0007\f\u0001dP${\u001a", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011K\u000bJ\u000621W\r~3|\u0012\u001cWSHi4s", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7x*['Cg6\u001e\u0002hmI\u0007q;$", ">q^1h*>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "AdcAT)ES\u0004\f\u0005]<z\t<C\n1\u000b@\u0014&", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w;CJz0\u001b\u001chLF\u0011b<Lv4%VW;\\e\u0002\u0013", "@d`BX:M:\u001d\r\n^5|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017.Hu3.\u0013hn\u000fma6V@(CJN)f\\x\u0007\u0018\u001aV\u0010N6\u0011\u0010YH(wD\u0001*\u00156H\u00129h\u000e\u001a_{5y\u007f>S\u0017Gd\"\u007f@9fFf=\u0004PPEu9:r]'d\u0004; \u0012q\u0016%rVw\u000e\u0004O\u0013r]}rgN\u001d\u00048mEqiUExUI>\u0014\u001fW\fw A?x9\u0004-\r47\u0003:H<", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "5dc\u0016`(@S\u0006~\u0007n,\u000b\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnBY\n07{%w1K7m4\u000b\u0015tq9\u0015r\u0002", "5dc\u001fX8NS'\u000eab:\f\t8e\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn<]\f/7v\u0016;\u00170;wD\u001e#wH=\u0015r,Wv4\u0014\"", "5dc X;MO\u0016\u0006zI9\u0007\b?c\u007f5YJ\n&\u0017Z~", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r)kC-\u0011eh9qp6M\u0007%GY,6earP#g", "1k^@X", "", "1qT.g,\u001c]\"\r\u000bf,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "5dc\u0012k;KO'", "", "", "", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "=m2.a*>Z z\nb6\u0006l7p\u0007", "", "=m5.\\3N`\u0019b\u0003i3", "Bga<j(;Z\u0019", "", "=m=2j\u0019>a)\u0006\nB4\b\u0010", "@dbB_;", "AsPAh:", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_'~!\u001f\u0011p\n:v\"?c\u0004i;u\u00120MN?v4%\u0019qa\u0003\u0012p6M\u0007%GY\\uG_|<$\u0010Z\u001b,5\u0016\u0014YT3D\b(", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractProducerToDataSourceAdapter<T> extends AbstractDataSource<T> implements HasImageRequest {
    private final RequestListener2 requestListener;
    private final SettableProducerContext settableProducerContext;

    protected AbstractProducerToDataSourceAdapter(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.settableProducerContext = settableProducerContext;
        this.requestListener = requestListener;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            setExtras(settableProducerContext.getExtras());
            FrescoSystrace frescoSystrace2 = FrescoSystrace.INSTANCE;
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.onRequestStart(settableProducerContext);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            } else {
                requestListener.onRequestStart(settableProducerContext);
            }
            FrescoSystrace frescoSystrace3 = FrescoSystrace.INSTANCE;
            if (!FrescoSystrace.isTracing()) {
                producer.produceResults(createConsumer(), settableProducerContext);
                return;
            }
            FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.produceResults(createConsumer(), settableProducerContext);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
            }
        }
        FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()");
        try {
            setExtras(settableProducerContext.getExtras());
            FrescoSystrace frescoSystrace4 = FrescoSystrace.INSTANCE;
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->onRequestStart");
                requestListener.onRequestStart(settableProducerContext);
                Unit unit3 = Unit.INSTANCE;
                FrescoSystrace.endSection();
            } else {
                requestListener.onRequestStart(settableProducerContext);
            }
            FrescoSystrace frescoSystrace5 = FrescoSystrace.INSTANCE;
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->produceResult");
                producer.produceResults(createConsumer(), settableProducerContext);
                Unit unit4 = Unit.INSTANCE;
                FrescoSystrace.endSection();
            } else {
                producer.produceResults(createConsumer(), settableProducerContext);
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    private final Consumer<T> createConsumer() {
        return new BaseConsumer<T>(this) { // from class: com.facebook.imagepipeline.datasource.AbstractProducerToDataSourceAdapter.createConsumer.1
            final /* synthetic */ AbstractProducerToDataSourceAdapter<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            protected void onCancellationImpl() {
                this.this$0.onCancellationImpl();
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            protected void onFailureImpl(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.this$0.onFailureImpl(throwable);
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            protected void onNewResultImpl(T t2, int i2) {
                AbstractProducerToDataSourceAdapter<T> abstractProducerToDataSourceAdapter = this.this$0;
                abstractProducerToDataSourceAdapter.onNewResultImpl(t2, i2, abstractProducerToDataSourceAdapter.getSettableProducerContext());
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            protected void onProgressUpdateImpl(float f2) {
                this.this$0.setProgress(f2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onCancellationImpl() {
        Preconditions.checkState(isClosed());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailureImpl(Throwable th) {
        if (super.setFailure(th, getExtras(this.settableProducerContext))) {
            this.requestListener.onRequestFailure(this.settableProducerContext, th);
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.isFinished()) {
            return true;
        }
        this.requestListener.onRequestCancellation(this.settableProducerContext);
        this.settableProducerContext.cancel();
        return true;
    }

    protected final Map<String, Object> getExtras(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    @Override // com.facebook.imagepipeline.request.HasImageRequest
    public ImageRequest getImageRequest() {
        return this.settableProducerContext.getImageRequest();
    }

    public final RequestListener2 getRequestListener() {
        return this.requestListener;
    }

    public final SettableProducerContext getSettableProducerContext() {
        return this.settableProducerContext;
    }

    protected void onNewResultImpl(T t2, int i2, ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zIsLast = BaseConsumer.isLast(i2);
        if (super.setResult(t2, zIsLast, getExtras(producerContext)) && zIsLast) {
            this.requestListener.onRequestSuccess(this.settableProducerContext);
        }
    }
}
