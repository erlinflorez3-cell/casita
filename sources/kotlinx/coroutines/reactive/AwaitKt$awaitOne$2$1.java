package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import com.hbisoft.hbrecorder.Constants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [T] */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я;\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\f6B\r+4\u0012}\u0007njG0LeN3ZS8\u0010s{:$c$\u007fOCU }*\teNo˧\u0017Iҙ\u0011K%إF~z.YU/ز@\u000ezP}FKM\u001eEid\u0003?\u001d `#~\u000eM\u0014(4`\u0010%\u0003sO\u001a\u001dH@'í\u0019!̂\t\u001a \u0012\u0007&\u000f+tg|>\u000f\u0001&H=1\u001bipVWc>\fe\rtdm!?o,<X7c\u001aUW\u0011\u0019j[m\u0016\u0006q\u0006\u0019v;?+w{\b@f\u0015,\u001b;Q\u001d]!.\u000b\u001b\u0018`\\59O{Mf\rVxQԋ\u0019ʀ\b\u000e\u000eΩ\u0019>;\u001c~\n$2+Ɂ*ö\\ؿbD\bzo9g1\u000e7C9Ik(ĨGϭR7\u0004˜]*1\u0007\u0007!\nYd֮!ôXwYĸҮDT"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq\t@|\u0015&K\u0001\u000e\u0006R71]\r\u0006F,\u0012@IGJU=\u001eS5 \u0005", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@s%B/", "AtQ@V9B^(\u0003\u0005g", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@\u000249c\u0007u", "D`[BX", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "AdT;I(Ec\u0019", "", "7mC2e4B\\\u0015\u0006hm(\f\t", "=mBBU:<`\u001d{z", "", "AtQ", "=m=2k;", "B", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m2<`7ES(~", "=m4?e6K", ExifInterface.GPS_MEASUREMENT_3D, "", "Bqh\u0012a;>`\b~\bf0\u0006\u00056S\u000f$\u000b@", "AhV;T3'O!~", "", "Ehc5F<;a\u0017\f~i;\u0001\u00138L\n&\u0002", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AwaitKt$awaitOne$2$1<T> implements Subscriber<T> {
    final /* synthetic */ CancellableContinuation<T> $cont;
    final /* synthetic */ T $default;
    final /* synthetic */ Mode $mode;
    private boolean inTerminalState;
    private boolean seenValue;
    private Subscription subscription;
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
            try {
                iArr[Mode.SINGLE_OR_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AwaitKt$awaitOne$2$1(CancellableContinuation<? super T> cancellableContinuation, Mode mode, T t2) {
        this.$cont = cancellableContinuation;
        this.$mode = mode;
        this.$default = t2;
    }

    private final boolean tryEnterTerminalState(String str) {
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(this.$cont.getContext(), str);
            return false;
        }
        this.inTerminalState = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void withSubscriptionLock(Function0<Unit> function0) {
        function0.invoke();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (tryEnterTerminalState(Constants.ON_COMPLETE_KEY)) {
            if (this.seenValue) {
                if (this.$mode == Mode.FIRST_OR_DEFAULT || this.$mode == Mode.FIRST || !this.$cont.isActive()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = this.$cont;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(this.value));
                return;
            }
            if (this.$mode == Mode.FIRST_OR_DEFAULT || this.$mode == Mode.SINGLE_OR_DEFAULT) {
                CancellableContinuation<T> cancellableContinuation2 = this.$cont;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m8980constructorimpl(this.$default));
            } else if (this.$cont.isActive()) {
                CancellableContinuation<T> cancellableContinuation3 = this.$cont;
                Result.Companion companion3 = Result.Companion;
                cancellableContinuation3.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + this.$mode))));
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (tryEnterTerminalState("onError")) {
            CancellableContinuation<T> cancellableContinuation = this.$cont;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t2) {
        final Subscription subscription = this.subscription;
        CancellableContinuation<T> cancellableContinuation = this.$cont;
        if (subscription == null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(cancellableContinuation.getContext(), new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(cancellableContinuation.getContext(), "onNext");
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (this.seenValue) {
                AwaitKt.moreThanOneValueProvidedException(this.$cont.getContext(), this.$mode);
                return;
            }
            this.seenValue = true;
            withSubscriptionLock(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    subscription.cancel();
                }
            });
            CancellableContinuation<T> cancellableContinuation2 = this.$cont;
            Result.Companion companion = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m8980constructorimpl(t2));
            return;
        }
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if ((this.$mode != Mode.SINGLE && this.$mode != Mode.SINGLE_OR_DEFAULT) || !this.seenValue) {
            this.value = t2;
            this.seenValue = true;
            return;
        }
        withSubscriptionLock(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                subscription.cancel();
            }
        });
        if (this.$cont.isActive()) {
            CancellableContinuation<T> cancellableContinuation3 = this.$cont;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation3.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + this.$mode))));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(final Subscription subscription) {
        if (this.subscription != null) {
            withSubscriptionLock(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    subscription.cancel();
                }
            });
            return;
        }
        this.subscription = subscription;
        this.$cont.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                AwaitKt$awaitOne$2$1 awaitKt$awaitOne$2$1 = this.this$0;
                final Subscription subscription2 = subscription;
                awaitKt$awaitOne$2$1.withSubscriptionLock(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2.1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        subscription2.cancel();
                    }
                });
            }
        });
        final Mode mode = this.$mode;
        withSubscriptionLock(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$3
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                subscription.request((mode == Mode.FIRST || mode == Mode.FIRST_OR_DEFAULT) ? 1L : Long.MAX_VALUE);
            }
        });
    }
}
