package com.biocatch.android.commonsdk.logging;

import com.biocatch.android.commonsdk.core.JsonBuffer;
import com.biocatch.android.commonsdk.core.performance.PerfCounterEntry;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007f\u0007ljA0ZeP.XU2\u000fy\b<$a&yCQU\"}(\tWNumvϺb\u000bY\u000f\u000eǝ\u000f̓\\I\u0004w\u001e\u0015Ƥ6B}?{Q}@Q`#:M.@'Py3\u0005J.V\u0016\u000fzqRR&xD~Bj\r{\u0007b:\u0014G8\u0001L`\u0018RDR\u0005]h6S\u0007wMf'\u000e<-Q\u001bSl';\u0003\u0012$9NO7+$\u0002\u000fMf$M\u0011N\n=3lW+9Y\fWdiF(]9]\u001furT`5Un\u001f?+}w\u0012dV,\u0006\u0010\u0014\rj\u001a^\u00125IF-Hh^ԇ?ϢvSHАمbY"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r)kA/\u0015uHC\tA3Rv0V\"", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6{\u001claB\u00169", "u(E", "0tU3X9", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u0013[MDHD\u001f\u0016hn\u000f", "1kT.e", "", "1kT.e\u0013HUx\b\nk0|\u0017\fyf(\r@\b", ":nV\u0019X=>Z", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", "5dc\u000fh-?S&", "=m;<Z\u0014>a'z|^", ":de2_", ";db@T.>", "", "AsP0^\u001bKO\u0017~", "1n]AX?M<\u0015\u0007z", "=m?2e-\u001c])\b\n^9\\\u0012>r\u0014", ">da366N\\(~\b>5\f\u0016C", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_RF#\u001fnc", "Adc\u001aT?,W.~", "0tU3X9,W.~", "", "B`Z2", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ServerLogClient extends LogClient {
    private JsonBuffer buffer = new JsonBuffer(0, 1, null);

    public final void clear() {
        this.buffer.clear();
    }

    @Override // com.biocatch.android.commonsdk.logging.LogClient, com.biocatch.android.commonsdk.logging.ILogClient
    public void clearLogEntriesByLevel(ELogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        for (Object obj : this.buffer.toCollection()) {
            if ((obj instanceof LogEntry) && !logLevel.isLowerOrEqual(((LogEntry) obj).getLevel())) {
                this.buffer.remove(obj);
            }
        }
    }

    public final JsonBuffer getBuffer() {
        return this.buffer;
    }

    @Override // com.biocatch.android.commonsdk.logging.ILogClient
    public void onLogMessage(ELogLevel level, String message, String stackTrace, String str) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.buffer.add(new LogEntry(level, message + TokenParser.SP + stackTrace, str));
    }

    @Override // com.biocatch.android.commonsdk.logging.LogClient, com.biocatch.android.commonsdk.logging.ILogClient
    public void onPerfCounterEntry(PerfCounterEntry perfCounterEntry) {
        Intrinsics.checkNotNullParameter(perfCounterEntry, "perfCounterEntry");
        this.buffer.add(perfCounterEntry);
    }

    @Override // com.biocatch.android.commonsdk.logging.LogClient, com.biocatch.android.commonsdk.logging.ILogClient
    public void setMaxSize(int i2) {
        this.buffer.setMaxSize(i2);
    }

    public final JSONArray take() {
        return this.buffer.get();
    }
}
