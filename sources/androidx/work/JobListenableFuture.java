package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import com.dynatrace.android.agent.Global;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ReP\u008cZS@\u000fs{:$c$\bCC٥\"}0\u0012WNmjvJh\u0012K\u000f\u001c\u0016\u0001j2K[ތs܈74HģM2}uM;pt|\u0004N2bS\n\t\u000f\u001bBH>x\u000bOQ\f 3XvJT\u001dM;܅@\ņ$\u0001,a0uDN\u0005]h6S\u000fwJf/}:%O#E\u00030;\u007f\u0012*9KO=3/{\u0005\u001dQ\nK1K8\u074c\u00041658as\u0006D\t\u0004\"\u001dCO;k9̽[Mbn\u001b?+}j{T\u001c8\u0010z2Ȟʀ\b\u000e\u00148\u0011B;,~\u0010,=\u001dti?\u0007\u061c\u0015ۍFф`ي\u001b%\u000eFse)xiiY#v9\u0012\u0004C̔YЧ\u001f%i\\&`C/\u0005\u0004_<iH[Rv\fo<\u001c\u0019\u001fwHæ\u0005ΥK\u007f=\u0012Y5%<O[g1gȔ\u0001\u0011Ku\u000f\u001d`\u0017a0ʄG\u0011.|\u0017O*7\u000e1ըfʰoP\\А|#[\u001fl\r\u000e\n# \u0013ɼj%{ĮPћlirܔϓ\u000e>"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u0014o|\u000f\u007fN\u0010\u0017 Cl\u0015<W5Di\u000b \r", Global.BLANK, "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "CmS2e3RW\"\u0001", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u000fL\u00065BY\fi%m%=I@Bk\u0015.$xn9\\", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001dV\nEu2?]|3\u0001\u007f ;S\r?s?%^xp=\u000equO\u00076WYN:&@rL#\u000eW\u0015N\f\u001d\u0014iN$D\b(", "/cS\u0019\\:MS\"~\b", "", ">/", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", ">0", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "1`]0X3", "", "1n\\=_,MS", "@dbB_;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uI;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`6s\u0016<f.9hSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "7r2.a*>Z ~y", "7r3<a,", "Ena8 9N\\(\u0003\u0003^s\u0003\u0018B_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JobListenableFuture<R> implements ListenableFuture<R> {
    private final Job job;
    private final SettableFuture<R> underlying;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.underlying.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) {
        return this.underlying.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    public JobListenableFuture(Job job, SettableFuture<R> underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.job = job;
        this.underlying = underlying;
        job.invokeOnCompletion(new Function1<Throwable, Unit>(this) { // from class: androidx.work.JobListenableFuture.1
            final /* synthetic */ JobListenableFuture<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th == null) {
                    if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    if (th instanceof CancellationException) {
                        ((JobListenableFuture) this.this$0).underlying.cancel(true);
                        return;
                    }
                    SettableFuture settableFuture = ((JobListenableFuture) this.this$0).underlying;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    settableFuture.setException(th);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(Job job, SettableFuture settableFuture, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            settableFuture = SettableFuture.create();
            Intrinsics.checkNotNullExpressionValue(settableFuture, "create()");
        }
        this(job, settableFuture);
    }

    public final void complete(R r2) {
        this.underlying.set(r2);
    }
}
