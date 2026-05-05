package kotlin.sequences;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!4i\bDJc|\u0004W\u00068\u000b<h\u0007\"2\u0016\u007f\u0007|jA0RkP.hS2şs{Břc$wGCU(\r*\tUQog|db\u000bI\u0013\u000e\u0016\u000fj4կ]xs\u0012\u00172P\u000eG\u074ce\u001cKʠxzF\u000702h8(\u0004!\u001c0Ϻ\u001ev+UQ\u000e 1X|JZ\u001dS\u0015\u001c\"\u0006\u0005 /!\u000bi\u0015ȬNɆ\\ŽG3\u0011mZT7a@|\u0014\rtSG\u000f|ѭ,+X\u0018C\u001a=Y\u0013\tb[\u0006\tmp]\u0007nѧ5+iu]5f\u00074\u00171O\u001bc#0j\rif\u001c);O*K~\rX\u000e\t\u0005%N\u0014\u0010\u0016'v9=\u001cv\bT3\u0005tc@\u0017\t\rL0\u0011o7/7\u00105;9amaiK\u001f^9\f\u0005S$Q\u0004\u001d-\"٪&\u0005#(l}a3a@\u0004H|\tyCsՎ~b**2>w\f=\u000b)6')G]O\"gk0J\\\"\u0005\u0012xnckbH\u0007\"\u001d\u0015W0\u000fȱhD\r\u0005\u001a^\u0005d:!e$d\u000b\u000e\n)\u001f#wj#U\"\\^\u0001wzOm\nk/v;ip\u0002\r\u001e9\r?M\rq\u001dyX\u0007\u0016O<)\u0005\u0007ebY\u0012ȗj(J2vx@}\nUf\u000e)1\u0006qLF:@1j%J\u0013\u001e\tA\r\ro\\~\u000fETa0In˨x\t\u000fbt\u001a}z\u0011O<~p\"sA\u007f49([Ȩv4-3\u0015\u0013\f\bWkRF\\l\\u\u0004\u0011@\u0016`9ֺ3=!%\u0017C@\u0019EK\\tuQ\u0014\u0012Uy\u001d{\u0015\u0090v.\u0010\u000ezr<`1J}W/<\u0005v\u000b)\u0018f\u0010y(F)F\u0004V\u0011ϵLI\u001b\ti>^8C\u0005M\u001d=B};\u0015;=E7\u001d\\}B.5ccɐ}.\u001ad\u0015%\u0003k,2s\u0018\u007fb\u0018]`:h_g\u007fV44n\u0013B\u000fj\b\u0010R\u000fD\u000fCH\bj\u001fYfYQ/̱j\u00072'\t}iS+u\u000e6>_psq|4`Iљ\u001fM{s}u[b\u001bL\u001f\nQ{_\n@\u001b\u0004%ݫ[b\u000fL\u001e\u0014&OYAr\u0007L\tj4Z;(\rIҍw\u00068\u0007\u0010No\u0015'4Rs\u0002V<S'[nx\u0013}]f1,\u0011~U3LwU3\u000bևTTWiB\u0003c\u001dO\u001b\u0019N/v3I\\`I#8^\u0011\rU]\nI052Ior\u0004\u000f\u001aW0\u0003-D(\u001b\u007fQ?^\u00172dΗcdvl\u0007\u0014vR\u0015\"?}){Tڻ\u0010'''o\u000bur/\\N>7q\u0019!\u0019J͈\u0015\f%iV\u001d=\u0006{-kH1\u0019? esS\u0004\u0018\"0'JtO[w\u0010lŊk\u001bb\u001c\u0002\u0018r\u0002O\u0013~\u001f42X\u0016\u000b\n\\*|T\u001aq\u00106vq{\u007f1F7-|\u0006\tK\u0017\u001e\u001ak|i~W\u001b\u0003-7\u0005\u001f\u001dQp\u001f\u000fް[.3Z`9\u001fYHj!\u000e$!6!F\b)) Qsh7q}\u007f;*ԝk/i46ݖN,\u001eހy*"}, d2 = {"!d`BX5<S", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\"", "7sT?T;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "3l_Al\u001a>_)~\u0004\\,", "4kPA@(I7\"}zq,{", Global.BLANK, "\u0011", "And?V,", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5d]2e(MS\u0007~\u0007n,\u0006\u0007/", "", "<dgA9<GQ(\u0003\u0005g", "AdT19<GQ(\u0003\u0005g", "AdT1", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012]-Q[U0e\u001c\u0001= \"Z\u0017L+\u001bNGA0~D@\u001d\b\u0002", "Ad`BX5<S\u0003\u007f", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001d!Vv\u0012E@35e\u000e @k\u0016<\u00171;wD\u001e\u001efa\u000f", "/rB2d<>\\\u0017~", "1n]@g9:W\"h\u0004\\,", "4kPAg,G", "4kPAg,G\u0012\u0007~\u0007n,\u0006\u0007/se7u:n\u0017#Wo\u0017:v3\u001bh", "", "4kPAg,GA\u0019\u000b\u000b^5z\t\u0019fc7{M|\u0014\u001eG", "7e4:c;R", "2dU.h3MD\u0015\u0006\u000b^", "=q4:c;R", "Agd3Y3>R", "@`]1b4", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "Cmi6c", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{?0;>-5)*7q\u0015&14#+\u001f -\u0004,")
public class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$Sequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003*IيX\nǞH\u00078ܥB}\u0017hz9fǏ\u0014Gv_a*'q\f64[Zڎq<\u001cۓ}͆\rQ"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/m(\bP\u0001 \u0015G}sKp\u001f#Y\n07v\u0014.[)J*\"\u001e!xaB\u0005cj\u001a", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> implements Sequence<T> {
        final /* synthetic */ Function0<Iterator<T>> $iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends Iterator<? extends T>> function0) {
            function0 = function0;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return function0.invoke();
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJd|\u0004W\u0006>éFB-!L\u0014}јtjY2JdV/rU0\u000fy}\\*k&\u0002C\u0002WH\u0001hަ\u000e"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u0011", Global.BLANK, "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13531<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<C, Iterator<R>> $iterator;
        final /* synthetic */ Sequence<T> $source;
        final /* synthetic */ Function2<Integer, T, C> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13531(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends C> function2, Function1<? super C, ? extends Iterator<? extends R>> function1, Continuation<? super C13531> continuation) {
            super(2, continuation);
            this.$source = sequence;
            this.$transform = function2;
            this.$iterator = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13531 c13531 = new C13531(this.$source, this.$transform, this.$iterator, continuation);
            c13531.L$0 = obj;
            return c13531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C13531) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Iterator it;
            int i2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                it = this.$source.iterator();
                i2 = 0;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                it = (Iterator) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Integer, T, C> function2 = this.$transform;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object objInvoke = function2.invoke(Boxing.boxInt(i2), (T) next);
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.I$0 = i4;
                this.label = 1;
                if (sequenceScope.yieldAll(this.$iterator.invoke((C) objInvoke), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = i4;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatten$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,\u0010\bDJc|\u0004W\u00068é<Ȑ\u0017(<\u0014\b\u0007-jg/dgN\u008c`SZ\u0019y|L*k&\u0002C\u0002UH\u007fh\u0011ҊRgmq"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13541<T> extends Lambda implements Function1<Sequence<? extends T>, Iterator<? extends T>> {
        public static final C13541 INSTANCE = ;

        C13541() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Iterator<T> invoke(Sequence<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatten$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,\u0010\bDJc|\u0004O 8é<Ȑ\u0017(<\u0014\b\u0007-jg/dgN\u008c`SZ\u0019y|L*k&\u0002C\u0002UH\u007fh\u0011ҊRgmq"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<T> extends Lambda implements Function1<Iterable<? extends T>, Iterator<? extends T>> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Iterator<T> invoke(Iterable<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatten$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0006\u001d<;%,˛\u0018D\u000bb\u0015\u0006Gي>\nND\u0005!:\u0012(\u000btkQ0\u000bd\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "\"", Global.BLANK, "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<T> extends Lambda implements Function1<T, T> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t2) {
            return t2;
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLcz\u0005OيH\rDAE!L\u0018}јtia0rex2`TB\u000f2zz,Ӯ(sI=c\u001d"}, d2 = {"\n`]<a@F])\rS", "\"", "", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13551<T> extends Lambda implements Function1<T, T> {
        final /* synthetic */ Function0<T> $nextFunction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13551(Function0<? extends T> function0) {
            super(1);
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return function0.invoke();
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLcz\u0004OيH\rDAE!L\u0018}јtia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "", "7me<^,", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13562<T> extends Lambda implements Function0<T> {
        final /* synthetic */ T $seed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13562(T t2) {
            super(0);
            t = t2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return t;
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001TpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13571<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Sequence<T>> $defaultValue;
        final /* synthetic */ Sequence<T> $this_ifEmpty;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13571(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> function0, Continuation<? super C13571> continuation) {
            super(2, continuation);
            this.$this_ifEmpty = sequence;
            this.$defaultValue = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13571 c13571 = new C13571(this.$this_ifEmpty, this.$defaultValue, continuation);
            c13571.L$0 = obj;
            return c13571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super T> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C13571) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope = (SequenceScope) this.L$0;
                Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                if (it.hasNext()) {
                    this.label = 1;
                    if (sequenceScope.yieldAll(it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (sequenceScope.yieldAll(this.$defaultValue.invoke(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001TpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13581<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Random $random;
        final /* synthetic */ Sequence<T> $this_shuffled;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13581(Sequence<? extends T> sequence, Random random, Continuation<? super C13581> continuation) {
            super(2, continuation);
            this.$this_shuffled = sequence;
            this.$random = random;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13581 c13581 = new C13581(this.$this_shuffled, this.$random, continuation);
            c13581.L$0 = obj;
            return c13581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super T> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C13581) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableList;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
                mutableList = SequencesKt.toMutableList(this.$this_shuffled);
                sequenceScope = sequenceScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = (List) this.L$1;
                SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceScope = sequenceScope3;
            }
            while (!mutableList.isEmpty()) {
                int iNextInt = this.$random.nextInt(mutableList.size());
                Object objRemoveLast = CollectionsKt.removeLast(mutableList);
                if (iNextInt < mutableList.size()) {
                    objRemoveLast = mutableList.set(iNextInt, objRemoveLast);
                }
                this.L$0 = sequenceScope;
                this.L$1 = mutableList;
                this.label = 1;
                if (sequenceScope.yield(objRemoveLast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final <T> Sequence<T> Sequence(Function0<? extends Iterator<? extends T>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.Sequence.1
            final /* synthetic */ Function0<Iterator<T>> $iterator;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function0<? extends Iterator<? extends T>> iterator2) {
                function0 = iterator2;
            }

            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return function0.invoke();
            }
        };
    }

    public static final <T> Sequence<T> asSequence(final Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return SequencesKt.constrainOnce(new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return it;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Sequence<T> constrainOnce(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    public static final <T> Sequence<T> emptySequence() {
        return EmptySequence.INSTANCE;
    }

    public static final <T, C, R> Sequence<R> flatMapIndexed(Sequence<? extends T> source, Function2<? super Integer, ? super T, ? extends C> transform, Function1<? super C, ? extends Iterator<? extends R>> iterator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return SequencesKt.sequence(new C13531(source, transform, iterator, null));
    }

    public static final <T> Sequence<T> flatten(Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return flatten$SequencesKt__SequencesKt(sequence, C13541.INSTANCE);
    }

    private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).flatten$kotlin_stdlib(function1) : new FlatteningSequence(sequence, AnonymousClass3.INSTANCE, function1);
    }

    public static final <T> Sequence<T> flattenSequenceOfIterable(Sequence<? extends Iterable<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return flatten$SequencesKt__SequencesKt(sequence, AnonymousClass2.INSTANCE);
    }

    public static final <T> Sequence<T> generateSequence(T t2, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t2 == null ? EmptySequence.INSTANCE : new GeneratorSequence(new Function0<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.generateSequence.2
            final /* synthetic */ T $seed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13562(T t22) {
                super(0);
                t = t22;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return t;
            }
        }, nextFunction);
    }

    public static final <T> Sequence<T> generateSequence(Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return SequencesKt.constrainOnce(new GeneratorSequence(nextFunction, new Function1<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.generateSequence.1
            final /* synthetic */ Function0<T> $nextFunction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13551(Function0<? extends T> nextFunction2) {
                super(1);
                function0 = nextFunction2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return function0.invoke();
            }
        }));
    }

    public static final <T> Sequence<T> generateSequence(Function0<? extends T> seedFunction, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new GeneratorSequence(seedFunction, nextFunction);
    }

    public static final <T> Sequence<T> ifEmpty(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return SequencesKt.sequence(new C13571(sequence, defaultValue, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Sequence<T> orEmpty(Sequence<? extends T> sequence) {
        return sequence == 0 ? SequencesKt.emptySequence() : sequence;
    }

    public static final <T> Sequence<T> sequenceOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? SequencesKt.emptySequence() : ArraysKt.asSequence(elements);
    }

    public static final <T> Sequence<T> shuffled(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.shuffled(sequence, Random.Default);
    }

    public static final <T> Sequence<T> shuffled(Sequence<? extends T> sequence, Random random) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return SequencesKt.sequence(new C13581(sequence, random, null));
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
