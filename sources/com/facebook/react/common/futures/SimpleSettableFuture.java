package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|\u0004G\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0LeN/ZS8\u0018s{:$c$\u007fCCU ~*\t]Uo˧vJp\u000bK\u000f\f\u001c\u000f̓TK[ތk\u0011?:RsO5cn\u00048\u000ftv\bڶ6\"FzM\u000f(3`\u0010%\u0005sO\u001a\u001dH@\u001fD\u0019!\u0016\u000b(\u001e\u001e>N\u000ed\\0[DV\u0005_P.YɅ0VĚ+_>\f\u0016+Tb?\u000f\r`TѨp;C%=S1\u0018\u0003_M\u0015Wqk\u0018/Ѿ'ȅMseJ!\u000b\"*CQ#\\)̦ػ\tQn\u001boF]xcR$'.\u07be,\u0011J\u0014&\u0006UY^1(x \u000ea\bɤW@^\u0016'H\u000e\u0011y6E/FGs?)}iai#\u0015KD\u0018\u001b6;\u0001\u001d.\fZ\u001cg-\u001djv\bĸҨD=VgRiK\b\u001cp\u0011\u000fZ\f>I\u00183*\u0014\u0017\u0017\u0004;,M1#\u0004\n^C\u0016ymb~RHV\u001fؚ.å\u001a72\u009e\\fRi\u001dk~Z/\u008f\u0013ܖ T\u000fâX#.c\u0010>7$Fʚ&řuҷQ_\u0012%=nƦ]\n"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW=\u00074Ef}.\u0001[\u001a6XJ;Y4-$d^@\u0007D<]\u00074G\"", "\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJw'V\u007f\u001b<L", "u(E", "3wR2c;B]\"", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "@dP1l\u0013:b\u0017\u0002", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Wx\u001d\u001b\u00017>@y/5pk", "@dbB_;", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1`]0X3", "", ";`h\u0016a;>`&\u000f\u0006m\u0010}u?n\t,\u0005B", "1gT0^\u0015Hb\u0007~\n", "", "5dc", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Bh\\2b<M", "", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uI;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`6s\u0016<f.9hSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u001ce\u001bA`#\u0011", "7r2.a*>Z ~y", "7r3<a,", "Adc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "Adc\u0012k*>^(\u0003\u0005g", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SimpleSettableFuture<T> implements Future<T> {
    private Exception exception;
    private final CountDownLatch readyLatch = new CountDownLatch(1);
    private T result;

    private final void checkNotSet() {
        if (this.readyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        this.readyLatch.await();
        if (this.exception == null) {
            return this.result;
        }
        throw new ExecutionException(this.exception);
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!this.readyLatch.await(j2, unit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.exception == null) {
            return this.result;
        }
        throw new ExecutionException(this.exception);
    }

    public final T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final T getOrThrow(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            return get(j2, unit);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.readyLatch.getCount() == 0;
    }

    public final void set(T t2) {
        checkNotSet();
        this.result = t2;
        this.readyLatch.countDown();
    }

    public final void setException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        checkNotSet();
        this.exception = exception;
        this.readyLatch.countDown();
    }
}
