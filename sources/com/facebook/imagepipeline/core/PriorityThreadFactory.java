package com.facebook.imagepipeline.core;

import android.os.Process;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r.4ߚ\u007f\u0007tsA0JeP.hS2şs{J$cҕyCQU\"Ԃ8ޛ\u007fN\u0016f/k`\u0010S\u0013\u0014\u0016\u0011jZJe~c\u0012\u001d4Zom6]uC9nxN\u0005N7ŕ<y\u0013\u0007b8V\u0019\u000fzqU<\u0016>K\t:\u0001\u0019\u0014\u0019j\u001e\u0014B8\u0001La>ޱ8Ղp]Bǂs\u000fwDf'\u000e3Sմ\u000fТX'\u0015Ǹ2*9GO5C-*\u038b\tқ_?\u000bӊBI\u0013h?'YJJɑ8ݼ\u0004\u0014\u001dۀ̦\u0011j"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDq ;QROZ7+\u0015d`\u001a\u0003a;X\u0004;\u001d", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "Bga2T+)`\u001d\t\bb;\u0011", "", ">qT3\\?", "", "/cS![9>O\u0018g\u000bf)|\u0016", "", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q5D\b", "Bga2T+'c!{zk", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Q\u001f=ME;x\n", "<df![9>O\u0018", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "@t];T)ES", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PriorityThreadFactory implements ThreadFactory {
    private final boolean addThreadNumber;
    private final String prefix;
    private final AtomicInteger threadNumber;
    private final int threadPriority;

    public PriorityThreadFactory(int i2) {
        this(i2, null, false, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriorityThreadFactory(int i2, String prefix) {
        this(i2, prefix, false, 4, null);
        Intrinsics.checkNotNullParameter(prefix, "prefix");
    }

    public PriorityThreadFactory(int i2, String prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.threadPriority = i2;
        this.prefix = prefix;
        this.addThreadNumber = z2;
        this.threadNumber = new AtomicInteger(1);
    }

    public /* synthetic */ PriorityThreadFactory(int i2, String str, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 + 2) - (2 | i3) != 0 ? "PriorityThreadFactory" : str, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? true : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newThread$lambda$0(PriorityThreadFactory this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.threadPriority);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: com.facebook.imagepipeline.core.PriorityThreadFactory$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PriorityThreadFactory.newThread$lambda$0(this.f$0, runnable);
            }
        };
        if (this.addThreadNumber) {
            str = this.prefix + Global.HYPHEN + this.threadNumber.getAndIncrement();
        } else {
            str = this.prefix;
        }
        return new Thread(runnable2, str);
    }
}
