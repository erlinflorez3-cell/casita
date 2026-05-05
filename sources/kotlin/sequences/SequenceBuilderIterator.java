package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|\u0004O,8\u000bDB\u0007\":\u0012\u007f\u0007ljA0ZeP.X\\2\u000fy\u0002<$q$yّCU(~*ޛWNupvJ`\u000eK\u000f\u001c\u0016\u0001j2O[xs܈74HģM2}uM;pt|\u0004N2R>\n\u0007\u0011\u001apG>w+I[\u000e\"0nshTMPŋ\u001e\u0012\u0014Bh\u0007,p\u007fNd]3]\u000361\u0019\u0002B|>&ܵ|\u0016\u0019Tl?\r-ѭdѿ@˝9\u00153lK\u0012`uW\u0003uм\u0004\u0005ص+'9b<pDs\u0018\u0014C.\u007f\u0017k\u000f>b\u0015Sp\fU.}\u0001\u0012dˎ,w\t\u001aUP\u0012-\u001e'v1]\u001et(&3+Ɂ\u001aĊ\u000fؿbB\u000e\u001c*P%G\u00183Y<Kp_\u0005S\u001f^9\f\u0005C̔Q\u00025Ħ\u001aڍ\u0012`#?%\n_6i@kN\u0005^0ƴoձtf\u001a,\n7U\b\u007f\u0010\u001f7/-G]I#Wǽ\u0018GrhMݖlĈWiZ̲\u0011B| O2\u0019\u000ejD\u0013\b\u0002O\u0003Z\u0003ґYɟX\u0013\u0006ܱ+\"b\u0003J-E\u0012T\\vw;]k\u0019=1|6\u0010ʤBސcߍb5=Qq 2b\u0005%W@\u0011\u0017Af!fbȚh͈&2PКށ{!"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 EojLz,4Y\u000b\u0004Fm#*\\MHA", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "u(E", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "<dgA<;>`\u0015\u000e\u0005k", "<dgAF;>^", "5dc\u001bX?MA(~\u0006", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007u", "Adc\u001bX?MA(~\u0006", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc(", "<dgAI(Ec\u0019", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "AsPAX", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016\u000b<\u0010\u0017l", "3wR2c;B]\"z\u0002L;x\u0018/", "", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgAA6M@\u0019zyr", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "GhT9W", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "GhT9W\bEZ", "7sT?T;H`", "uKY.i(\bc(\u0003\u0002(\u0010\f\t<a\u000f2\t\u0016g\u001d!Vv\u0012E@#?f\b0Fq\u001f.[\r\u0019u=-\u0019qq5\u0016g6WLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
    private Iterator<? extends T> nextIterator;
    private Continuation<? super Unit> nextStep;
    private T nextValue;
    private int state;

    private final Throwable exceptionalState() {
        int i2 = this.state;
        return i2 != 4 ? i2 != 5 ? new IllegalStateException("Unexpected state of the iterator: " + this.state) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    private final T nextNotReady() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final Continuation<Unit> getNextStep() {
        return this.nextStep;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i2 = this.state;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw exceptionalState();
                }
                Iterator<? extends T> it = this.nextIterator;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            Continuation<? super Unit> continuation = this.nextStep;
            Intrinsics.checkNotNull(continuation);
            this.nextStep = null;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i2 = this.state;
        if (i2 == 0 || i2 == 1) {
            return nextNotReady();
        }
        if (i2 == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i2 != 3) {
            throw exceptionalState();
        }
        this.state = 0;
        T t2 = this.nextValue;
        this.nextValue = null;
        return t2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.state = 4;
    }

    public final void setNextStep(Continuation<? super Unit> continuation) {
        this.nextStep = continuation;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yield(T t2, Continuation<? super Unit> continuation) {
        this.nextValue = t2;
        this.state = 3;
        this.nextStep = continuation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yieldAll(Iterator<? extends T> it, Continuation<? super Unit> continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = continuation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
