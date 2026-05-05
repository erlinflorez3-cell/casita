package androidx.lifecycle;

import java.time.Duration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!,p\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$\u007fCCU(Ԃ*\teNogtLb\u000bY\u000f\u000e\u0016\u000fj4I[zuj\u001d2ZuO5]o\u0004;\u000fuV\u0007&݅0:*\t\u000f\u001dBH>z+IQ\f 5XphX=x\u0013!*-D\u001f\u0011&lm^8Xl$<],\u0013qRT7a@|{\u0018t^7\u0011\u0007c4*nCc\u001dȏW\u0003\r_\"DƄCqK\u0013\u0001\u00025+ayg8h\u007fZ\u0017YP-_x̦j\u0007\u0002f\u0012'9T{K~\u0014X}\u0001{\u001bK\u001c\u000e4&xY;!~/\u00142\u0005zcF`\u0004nBF|\u0010?'-\u00109;;+f\u007fli#^;\f\u0007#\u001dQ\r\u001d)ƟX\u000ef\"aYɐU1_PUr\\\u001bq=\u001c\u0016\u0011d\bÏ\u00122o\u0006?}!.]'eni-/\u007f\u001aNTi\u0007\u0005'j\u0002j\u0019̳~̱r\u0016E?)\u0018hե|\u0005\u001aO+Б~ҭQ\u001c\\͵&f\u0019\u05fej\u000eT#+ī\\Q\t\u0011pLm\u001255v9in2\u0010\u0006Bn;EWs\u0012qR%\u001fmFr\thhXR:f\u000b0ϒ6Hp\u001d(#JM\u001c\u001bBE\u0002\u001eD,w\u001b\u000b\u001eX\u000b.HQ~\u0019_\ts>\td74\u0005\u007f##\u0015/Xʷtom\u0006͋0\u0014"}, d2 = {"\u0012D5\u000eH\u0013-M\bbb>\u0016lw", "", ":he27(MO", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "\"", "Bh\\2b<M", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8d#?d}u", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016g\u001d!Vv\u0012E@#?f\b0Fq\u001f.[\r\u0019uA(%weB\u0007A6W\u0006'Z[$\u0013b\\\u0002D\u0018\u001b$\u0013_3V\u0006iJ\"}HA(\u0016u*\u0012Df\u0010\u0010 \u0017\u0002@4)R\u0019F\u0007\u001fy@<2M]`yEUCi*.rc.\\\u001963\u0010G", "Bh\\2b<M7\"f\t", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u00134IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ\u001d( wCD)\f+\\KBl\u0002\f\u0014\"3qp\f=\u0014XysqP%>", "/cS\u0011\\:I]'zwe,j\u0013?r}(", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E \t\u001b&Vo\r*\u00015BW}u", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E(\u0001\u0016\u001bC~\u0018I])FY\\\u001cFik", "And?V,", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nh\u0017\u0016Kk\u001dF\u0004\f9j}~3|\u0012\u00044?DjA(\u0019gt\u0003\u000eg-Nt;ESNuCV\u0004=r\u000ei\n$\u0012\u0013\u000fhH(w\u000e5)\u00156Y\u0011?q\u0001\u001a_k?s\u007fF_ C\t\u0019\u007fJ~,-^[\u000bC\u000bL^3fUI\u001aa:83i", "\u0010k^0^", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> LiveData<T> liveData(Duration timeout, Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default(timeout, (CoroutineContext) null, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(CoroutineContext context, Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default((CoroutineContext) null, 0L, block, 3, (Object) null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E \t\u001b&Vo\r*\u00015BW}u", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039xvtts\u000bu\u007fyCY\u0007\u000b\t\u0010\u0010\u0006\f\u0004k\n\u0018\bg\u0006\u001a\br\u001dM\f\u0010\u0011q\u0018#!!&\u0015\u0017\"\u001c\u000b(/-\u001f\"ap", f = "\u0010;=9><04*\u0010,8&\u0004 2\u001ei&.", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EmittedSource>, Object> {
        final /* synthetic */ LiveData<T> $source;
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_addDisposableSource, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EmittedSource> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1 */
        /* JADX INFO: compiled from: CoroutineLiveData.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJf\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u0013tkQ8bgp0hRp\u000f2{z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1<T> extends Lambda implements Function1<T, Unit> {
            final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
                super(1);
                mediatorLiveData = mediatorLiveData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(T t2) {
                mediatorLiveData.setValue(t2);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$this_addDisposableSource.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new Function1<T, Unit>() { // from class: androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource.2.1
                final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
                    super(1);
                    mediatorLiveData = mediatorLiveData;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2(obj2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(T t2) {
                    mediatorLiveData.setValue(t2);
                }
            }));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, Continuation<? super EmittedSource> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new AnonymousClass2(mediatorLiveData, liveData, null), continuation);
    }

    public static /* synthetic */ LiveData liveData$default(CoroutineContext coroutineContext, long j2, Function2 function2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        return liveData(coroutineContext, j2, function2);
    }

    public static final <T> LiveData<T> liveData(CoroutineContext context, long j2, Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new CoroutineLiveData(context, j2, block);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, coroutineContext, function2);
    }

    public static final <T> LiveData<T> liveData(Duration timeout, CoroutineContext context, Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
