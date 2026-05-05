package okhttp3.internal.concurrent;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,u\bӵLc\u0003\u000bIي8\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XU2\u000f\u0002{<$a&\nOI٥2}P\b\u007fRug\u0007J\t\f[-\u0014\u0018\u0011jZL\u0006|k\u0016'2pto7[uU9\u000f{f\t.::8(\u0004G\u001aB{\u001e\u007f\u0013C\u0012\u001622F\u0081H\\=Q\u0013\u001e*\u0006l%1\"jmf6vs\u000eD=.\u001boRP7_v\u0007{\u0019\r×-͒uѭӿ/@EB-Ma\u0011\u001fR\nB3C\u007fA\u001dhU,[M\u0002]NX.\u001bE5]\u001cux6^\u0015Q\u000f\u000bU7\u0016ҫQح\rߊ¾z\u0001\u0015?\nؔ6UGͼ1*"}, d2 = {"4na:T;\u001dc&z\nb6\u0006", "", "<r", "", ":nV", "", "B`b8", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "?tTBX", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", ";db@T.>", ":nV\u0012_(Ia\u0019}", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n\u0015'T|\u000eE\u0006n$U\f&\rT 4PRJv\u0002g\u0019qp9\u0014l(U@%QUL<i_rF#[I\n\\1x\u0015YQ$D+=)\u00173M\u000b\u0005m\u0012\u0014_\u000fEsnQZ\u001aP\b^VQ2fU]i\u0003\u0012\u0017\tI/`\u001d[fc6C&][\u0016 hN=_", "B`b8?6@", ";db@T.>0 \txd", "=jWAg7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TaskLoggerKt {
    public static final String formatDuration(long j2) {
        String str = j2 <= -999500000 ? ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s " : j2 <= -999500 ? ((j2 - ((long) 500000)) / ((long) 1000000)) + " ms" : j2 <= 0 ? ((j2 - ((long) 500)) / ((long) 1000)) + " µs" : j2 < 999500 ? ((j2 + ((long) 500)) / ((long) 1000)) + " µs" : j2 < 999500000 ? ((j2 + ((long) 500000)) / ((long) 1000000)) + " ms" : ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sbAppend = new StringBuilder().append(taskQueue.getName$okhttp()).append(TokenParser.SP);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        logger.fine(sbAppend.append(str2).append(": ").append(task.getName()).toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, Function0<? extends T> block) {
        long jNanoTime;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, Function0<String> messageBlock) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
