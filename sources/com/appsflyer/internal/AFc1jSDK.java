package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u0003\nI\u00066\u000b6B\r)4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fsڔ<$q$yCAV\"}0\nWNugvJ`\u000fYƤ6\u0016'il\re|k\u0013'2poO7[qU9\u000ftF\t.6:8(\b\u0011\u001e8N(v)H[\u0016 9XvJT\u001dM3\"@\rN,\u0007\u001ejrf<Xnm:]+1sŌR)e<\u000bZUeb7%v\u0010-[DE6-%\u0002\u000b7XiA\u001bA\b<3vm9ȅMu]Ff\u0011\\\"9a%]!5#\u0005Ōd\u000e-=]v\u001ch\u001c:\u0010\u0001\f\u000fL\u0004<\u000eURd-pǕ\nԧ7xzUFd\u0010s"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b{\u0013\u0014?S", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;a/?`]37k&=WP\u0011", "", ">/", ">0", "", ">1", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", ">2", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJs\u001eQm\u0014@\u007f'!i}07C", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", ">3", "\u001aiPCTuNb\u001d\u0006DJ<|\u0019/;", ">4", "\nh]6g\u0005", "uH8\u0017?1:d\u0015H\u000bm0\u0004R-o\t&\fM\u000e\u0017 V9|@~%%b\u0002/\rT\u001b*^?\u0005{C\"\u001c2_C\u0010a<[\u0004'P[\u0018\tc\\pC\u0018\u001b\\y^+\u001d\u0005/()jU3h\u0018;M\t\u0005T\u0011\f&\u000e\u000b.a", "", "", "/ec2e\fQS\u0017\u000f\n^", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016g\u001c\u0013XkWCr.7#l#Dw(*JJ;Aw\u000f", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "u(E", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u001aiPCTuNb\u001d\u0006DJ<|\u0019/;"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFc1jSDK extends ThreadPoolExecutor {
    private final Queue<Runnable> getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFc1jSDK(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, final Queue<Runnable> queue) {
        super(i2, i3, j2, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFc1jSDK$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1jSDK.getMonetizationNetwork(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getMonetizationNetwork = queue;
    }

    public /* synthetic */ AFc1jSDK(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, timeUnit, blockingQueue, (i4 + 32) - (i4 | 32) != 0 ? new ConcurrentLinkedQueue() : queue);
    }

    private final void getCurrencyIso4217Code() {
        synchronized (this) {
            int size = this.getMonetizationNetwork.size();
            for (int i2 = 0; i2 < size; i2++) {
                Runnable runnablePoll = this.getMonetizationNetwork.poll();
                if (runnablePoll == null) {
                    break;
                }
                execute(runnablePoll);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        Intrinsics.checkNotNullParameter(runnable, "");
        super.afterExecute(runnable, th);
        Intrinsics.checkNotNullParameter(runnable, "");
        if (th != null) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing task: " + runnable, th, true, true, true, false, 64, null);
        } else {
            try {
                getCurrencyIso4217Code();
            } catch (Throwable th2) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing rejected tasks", th2, true, true, true, false, 64, null);
            }
        }
    }
}
