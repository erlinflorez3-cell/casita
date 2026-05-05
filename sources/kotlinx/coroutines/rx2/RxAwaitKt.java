package kotlinx.coroutines.rx2;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!,i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0015\u007f\u0007|jA0JeP.hS2\u000fq\u007f<$q$yCAV\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[xu\"\u001d˰Zom2uok9'ҡtӯ$209\u0012#\u000f\u001cBJ&uAFk\u000e\u0018ؓNsbX\u001dO\u0015\u001aX\tl$Gȭ\u001bʄR6VquV=)\u001bi\tQGa6ŧ[\u0010nZ7\u000f\u0007ad.n;{՝c٨\u0007\u0007``W!MмU\u0007~&m.iu]̬f\u0003<\u001b;Q\u001d]9)\u000b\t\u0018ӨJˏ/OqPh26~\u0013{S?$\u0010\fΩV1U v\n\u001e3;u\u0002D\u0001\u0006lJ\u0018z(9]ӣ>Ĵ/9)oi}Iϊf7B\b- )Ч|$\u0004Z\u001eb%\u001b\u001bz\u007f;\u0018̼{˓R\ngH\u0006 ~n\u001a*J3g\u00025Ʌ\u001f1?+G]I#gn0U\u000bϠ5ݶdhawjlN1\u0007\u0016}-)\u000e`եr\b\u0014VdZ<\u0011\u0014\u001f\u0003\u0014.\f!(tw\u0003$kĲ\rћlix]u(3@~9om2\u0011w;dڨCT\f\u0016qT\u0007\u0014\u0006?\u0011\u0012\u001fٯ\u0001ΐ\u0010Zj6:\\V|(wBGn\u000e\u0019ԵMtD:<3)\\[K1+rK\u000b\u001cw`x\u0012\u000fTy'1}jږGɹT\\~\u0005\u007f\u0015WB\u0015`h0aS;ӧ4XJnD~3\u0007Ev.T.ս\u0006ƥp\u0016\u0004c\u0014<$ QQu@3\u0011\u0005ǻ@\u0005UK\\tuQ\u0014\u0015U\bCȱM³l.u\u0016\u0003\u0007:w\u0003J}S?&\u0007^x$6|0}o_\u0013G\u0012nQϵVy\u0001\u001eq<\u0015;\u001d\u0007%Ǉ3\u0004\u0018(\r7=Cm D\u0005D3#}ui\u001eK*j\u0015&\u0003m\u001c.y\u00156e\u0018Ϥp֑<Ig\u001dп&C"}, d2 = {"/vP6g", "", "\u001ah^{e,:Q(\u0003\f^?Ff9m\u000b/{O|\u0014\u001eG]\u0018L\u0004#5/", "uKX<\"9>O\u0017\u000e~o,\u0010R\ro\b3\u0003@\u0010\u0013\u0014No{F\u000723YS\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "/vP6g\u001aB\\\u001b\u0006zH9e\u00196l", "\"", "\u001ah^{e,:Q(\u0003\f^?Fp+y|(iJ\u0011$\u0015GE", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0017a\u0014%{.\u000b'$Eoc#|/D`\u0002)\u0001k ;WSJo=\u001e#2?C\u0010r0W\u0007#VPX52\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", "/vP6g\u001aB\\\u001b\u0006z", "/vP6g\u0016K2\u0019\u007fvn3\f", "2dU.h3M", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0017a\u0014%{.\u000b'$Eoc#{!FUG'3v\u0018w7@@k2-jOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "\u001ah^{e,:Q(\u0003\f^?Fv3n\u0002/{.\u000b'$Eoc", "uKX<\"9>O\u0017\u000e~o,\u0010R\u001di\t*\u0003@n!'Tm\u000e\u0012]+?h\u0005$@7\u00148ZMKz8'\u0015v+\u0017\u0011l;R\u007f7C[R6e(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "/vP6g\rB`'\u000e", "\u001ah^{e,:Q(\u0003\f^?Fr,s\u007f5\r<}\u001e\u00175y\u001eIt%\u000b", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0019b\u000e(\tQ|\u0014\u001eG]\u0018L\u0004#5/d&A|\u001d2V\r9uA(%weB\u0007qu,\u00010VPW<XavG\u001dg\u001etS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>", "/vP6g\rB`'\u000edk\u000b|\n+u\u00077", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0019b\u000e(\tQ|\u0014\u001eG]\u0018L\u0004#5/d%3~\u0012wT?Dm}\b\u0012ma7\u00169\u0013T\u00016NPWuZ\\\u007fG$!^\u0017N9VbcJ3rMG\u001b\u00170S\u000b\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "/vP6g\rB`'\u000edk\u0015\r\u00106", "/vP6g\rB`'\u000edk\f\u0004\u0017/", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0019b\u000e(\tQ|\u0014\u001eG]\u0018L\u0004#5/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^gA\u0014X:\u0014\tb\u000b\"xQA/\u00170R\u0002I2^\u0016\u001f\u001d9s\u0001>e\u0014Q\u0003j9(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010", "/vP6g\u0013:a(", "2hb=b:>=\"\\vg*|\u00106a\u000f,\u0006I", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", ExifInterface.GPS_MEASUREMENT_2D, "\u001ah^{e,:Q(\u0003\f^?F\b3s\u000b2\n<}\u001e\u0017U9l@\u00050?gy\u001d>mk", "/vP6g\u0016GS", ";nS2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`/y\r<L", "uKX<\"9>O\u0017\u000e~o,\u0010R\u0019b\u000e(\tQ|\u0014\u001eG]\u0018L\u0004#5/d&A|\u001d2VV\u0005i>+\u001fxp=\u0010c:\u0018\u0004:\u0014\u001666[RH$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\bEw\b\u0010\u001fW3t}Lf\u001fK\u0003\u0015\u0004\u000b\u0007rOhc\u0003W=Tf4ma#\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RxAwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return RxAwaitKt.awaitFirstOrElse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14431<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14431(Continuation<? super C14431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxAwaitKt.awaitOrDefault(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14441<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C14441(Continuation<? super C14441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxAwaitKt.awaitSingle((MaybeSource) null, this);
        }
    }

    public static final Object await(CompletableSource completableSource, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        completableSource.subscribe(new CompletableObserver() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$2$1
            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl2, disposable);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final <T> Object await(SingleSource<T> singleSource, Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        singleSource.subscribe(new SingleObserver<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$5$1
            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl2, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t2) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(t2));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object awaitFirst(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return awaitOne$default(observableSource, Mode.FIRST, null, continuation, 2, null);
    }

    public static final <T> Object awaitFirstOrDefault(ObservableSource<T> observableSource, T t2, Continuation<? super T> continuation) {
        return awaitOne(observableSource, Mode.FIRST_OR_DEFAULT, t2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object awaitFirstOrElse(io.reactivex.ObservableSource<T> r9, kotlin.jvm.functions.Function0<? extends T> r10, kotlin.coroutines.Continuation<? super T> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.rx2.RxAwaitKt.AnonymousClass1
            if (r0 == 0) goto L42
            r6 = r11
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r6 = (kotlinx.coroutines.rx2.RxAwaitKt.AnonymousClass1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r3 = r6.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L48
            java.lang.Object r10 = r6.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            if (r3 != 0) goto L2d
            java.lang.Object r3 = r10.invoke()
        L2d:
            return r3
        L2e:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.rx2.Mode r4 = kotlinx.coroutines.rx2.Mode.FIRST_OR_DEFAULT
            r6.L$0 = r10
            r6.label = r0
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r9
            java.lang.Object r3 = awaitOne$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L27
            return r2
        L42:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r6 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1
            r6.<init>(r11)
            goto L13
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitFirstOrElse(io.reactivex.ObservableSource, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object awaitFirstOrNull(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return awaitOne$default(observableSource, Mode.FIRST_OR_DEFAULT, null, continuation, 2, null);
    }

    public static final <T> Object awaitLast(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return awaitOne$default(observableSource, Mode.LAST, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitOne(ObservableSource<T> observableSource, final Mode mode, final T t2, Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        observableSource.subscribe(new Observer<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1
            private boolean seenValue;
            private Disposable subscription;
            private T value;

            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[Mode.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Mode.LAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Mode.SINGLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.seenValue) {
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m8980constructorimpl(this.value));
                        return;
                    }
                    return;
                }
                if (mode == Mode.FIRST_OR_DEFAULT) {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m8980constructorimpl(t2));
                } else if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<T> cancellableContinuation3 = cancellableContinuationImpl2;
                    Result.Companion companion3 = Result.Companion;
                    cancellableContinuation3.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + mode))));
                }
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }

            @Override // io.reactivex.Observer
            public void onNext(T t3) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                Disposable disposable = null;
                if (i2 == 1 || i2 == 2) {
                    if (this.seenValue) {
                        return;
                    }
                    this.seenValue = true;
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m8980constructorimpl(t3));
                    Disposable disposable2 = this.subscription;
                    if (disposable2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("subscription");
                    } else {
                        disposable = disposable2;
                    }
                    disposable.dispose();
                    return;
                }
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (mode != Mode.SINGLE || !this.seenValue) {
                    this.value = t3;
                    this.seenValue = true;
                    return;
                }
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + mode))));
                }
                Disposable disposable3 = this.subscription;
                if (disposable3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subscription");
                } else {
                    disposable = disposable3;
                }
                disposable.dispose();
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(final Disposable disposable) {
                this.subscription = disposable;
                cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        disposable.dispose();
                    }
                });
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static /* synthetic */ Object awaitOne$default(ObservableSource observableSource, Mode mode, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        return awaitOne(observableSource, mode, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKS\u000eGw~A}2mtQST;qtE\u000ef", replaceWith = @kotlin.ReplaceWith(expression = "this.awaitSingleOrNull() ?: default", imports = {}))
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitOrDefault(io.reactivex.MaybeSource r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxAwaitKt.C14431
            if (r0 == 0) goto L3b
            r4 = r7
            kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1 r4 = (kotlinx.coroutines.rx2.RxAwaitKt.C14431) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L3b
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L41
            java.lang.Object r6 = r4.L$0
            kotlin.ResultKt.throwOnFailure(r3)
        L28:
            if (r3 != 0) goto L2b
        L2a:
            return r6
        L2b:
            r6 = r3
            goto L2a
        L2d:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.L$0 = r6
            r4.label = r0
            java.lang.Object r3 = awaitSingleOrNull(r5, r4)
            if (r3 != r2) goto L28
            return r2
        L3b:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1 r4 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1
            r4.<init>(r7)
            goto L16
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitOrDefault(io.reactivex.MaybeSource, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object awaitSingle(io.reactivex.MaybeSource<T> r5, kotlin.coroutines.Continuation<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.rx2.RxAwaitKt.C14441
            if (r0 == 0) goto L38
            r4 = r6
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r4 = (kotlinx.coroutines.rx2.RxAwaitKt.C14441) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L38
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L44
            kotlin.ResultKt.throwOnFailure(r3)
        L29:
            if (r3 == 0) goto L3e
            return r3
        L2c:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.label = r0
            java.lang.Object r3 = awaitSingleOrNull(r5, r4)
            if (r3 != r2) goto L29
            return r2
        L38:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r4 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1
            r4.<init>(r6)
            goto L19
        L3e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitSingle(io.reactivex.MaybeSource, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object awaitSingle(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return awaitOne$default(observableSource, Mode.SINGLE, null, continuation, 2, null);
    }

    public static final <T> Object awaitSingleOrNull(MaybeSource<T> maybeSource, Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        maybeSource.subscribe(new MaybeObserver<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitSingleOrNull$2$1
            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(null));
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl2, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t2) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(t2));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, final Disposable disposable) {
        cancellableContinuation.invokeOnCancellation(new Function1() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RxAwaitKt.disposeOnCancellation$lambda$3(disposable, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disposeOnCancellation$lambda$3(Disposable disposable, Throwable th) {
        disposable.dispose();
        return Unit.INSTANCE;
    }
}
