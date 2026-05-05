package io.sentry.android.replay.util;

import io.sentry.ISentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLeV:Zݷ2\u000fy\u0003<$a$yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\u001c\u0016\u0001̓D[cތu\u0012=1jom3}sK:xtd\u0007f݅:x\b\b\u0019 :H\u0016w\u0011By\u0010:0nujV\u001bN\u001d\u001a@\bn$\u000f$tg|=xpkBG#1rrR5iH|{\u0016vX5\u0018\u000faL7p;C\"=S1\u0015\u0019¹W+M\u0001U\u000bx'-,_r\u0006F\u0001\u007fB&[S\u001b^\u000b&\u000b\u0007\u0002d\u001a-CO\u0012R\u0001\u00126\u0005\u0013{;JJ\u05fa\u001eOV=E v\b\u00144\u000bq\u0002Px\u0002\rB0~o7/%.5[=)liai ~;\n\u0012%\u001eQ\u000f5ďƥX "}, d2 = {"5qP0X-NZ \u0013ha<\f\b9w\t", "", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "AbW2W<ESt\u000e[b?|\b\u001ca\u000f(i<\u0002\u0017\u001e[", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%4:\u000e/Gz\u0016\u0004", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "B`b8A(FS", "", "7mXA\\(E2\u0019\u0006vr", "", ">da6b+", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "B`b8", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "AtQ:\\;,O\u001a~\u0002r", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJw'V\u007f\u001b<L", "\u001ah^{f,Gb&\u0013DB\u001a|\u0012>r\u0014\b\u000f@~'&Q|{<\u000469W}u", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExecutorsKt {
    public static final void gracefullyShutdown(ExecutorService executorService, SentryOptions options) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            if (executorService.awaitTermination(options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                Unit unit = Unit.INSTANCE;
            } else {
                executorService.shutdownNow();
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public static final ScheduledFuture<?> scheduleAtFixedRateSafely(ScheduledExecutorService scheduledExecutorService, final SentryOptions options, final String taskName, long j2, long j3, TimeUnit unit, final Runnable task) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: io.sentry.android.replay.util.ExecutorsKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(task, options, taskName);
                }
            }, j2, j3, unit);
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAtFixedRateSafely$lambda$3(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    public static final Future<?> submitSafely(ISentryExecutorService iSentryExecutorService, final SentryOptions options, final String taskName, final Runnable task) {
        Intrinsics.checkNotNullParameter(iSentryExecutorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return iSentryExecutorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.ExecutorsKt$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.submitSafely$lambda$1(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    public static final Future<?> submitSafely(ExecutorService executorService, final SentryOptions options, final String taskName, final Runnable task) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "currentThread().name");
        Future<?> futureSubmit = null;
        if (StringsKt.startsWith$default(name, "SentryReplayIntegration", false, 2, (Object) null)) {
            task.run();
            return null;
        }
        try {
            futureSubmit = executorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.ExecutorsKt$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.submitSafely$lambda$2(task, options, taskName);
                }
            });
            return futureSubmit;
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return futureSubmit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$1(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$2(Runnable task, SentryOptions options, String taskName) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(taskName, "$taskName");
        try {
            task.run();
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to execute task " + taskName, th);
        }
    }
}
