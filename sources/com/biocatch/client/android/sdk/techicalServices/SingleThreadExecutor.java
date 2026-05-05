package com.biocatch.client.android.sdk.techicalServices;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjG9L͜P.`S2şs{J$cҕyCI\\\"}(\fUȞ}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8SAT\b=gh%:\u0013)J\"f\u00045\u0005(5`\u0010%\u0007\fW\u001a\u001fH@\u001fB\u0003\u0011[\u000e2\u00124Hh\u0005,j\u007fNdP5aH>;\u0003\u0018J\u0017-m@\u0015M;N\u001b']\u0003o!C@e9kǯ\u007fΫ\u000bRcΪSK\u007fB\u001dhU-\u0002ɡ\u007fɱ:X\bϬe7]\rurT][ĬbВ++WҪ\u05c8T\u001f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "", "Bga2T+'O!~", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "7rBAT9MS\u0018", "", ">nbA7,EO-~y", "", "@t];T)ES", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[.l\u0014BZ \u0003\t", "", "@t]\u0016`4>R\u001dz\n^3\u0011", "AsP?g", "As^=", "Dda6Y@,b\u0015\f\n^+", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SingleThreadExecutor {
    private ScheduledExecutorService executor;
    private boolean isStarted;
    private final String threadName;

    public SingleThreadExecutor(String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.threadName = threadName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: start$lambda-0, reason: not valid java name */
    public static final Thread m7044start$lambda0(SingleThreadExecutor this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Thread(runnable, this$0.threadName);
    }

    private final void verifyStarted() {
        if (!this.isStarted) {
            throw new InvalidOperationException("Dispatcher thread is not started");
        }
    }

    public final void postDelayed(Runnable runnable, long j2) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        verifyStarted();
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            scheduledExecutorService = null;
        }
        scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    public final void runImmediately(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        verifyStarted();
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            scheduledExecutorService = null;
        }
        try {
            scheduledExecutorService.submit(runnable).get();
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed executing the data dispatcher task immediately.", e2);
        }
    }

    public final void start() {
        if (this.isStarted) {
            throw new InvalidOperationException("Dispatcher thread is already started");
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return SingleThreadExecutor.m7044start$lambda0(this.f$0, runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…> Thread(r, threadName) }");
        this.executor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.isStarted = true;
    }

    public final void stop() {
        if (this.isStarted) {
            this.isStarted = false;
            ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                scheduledExecutorService = null;
            }
            scheduledExecutorService.shutdownNow();
        }
    }
}
