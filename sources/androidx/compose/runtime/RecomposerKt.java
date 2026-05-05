package androidx.compose.runtime;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,˛\bDJc|\u0004O\f8\u000b4C\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000fq{<$q$yCQU\"}(\tWNupvJ`\u000bK\u000f\u00149\u0001j:h]xc\u0016'\u0003PrW3\u0014s];fҚD\tPl0=\u0012;\u0007\u0019:J v)J[\u001d\"?nxĐV\u0017S\u000e*\u0018\fH0\u0003$b\u000eYFP|cJ13\u00030F|3o4\rO#E\u0003&;|Ґ\"+FD{՝c٨\u0007\u0007`iW@M\u0001U\u0005\u00177G-O֕eGx\u0002\u001a\u00149a5o\u0003(l\u0005\u0018q\u001c/;UsM`\u000en\n)\u0010;O4\u0012\u0014<`.s+\u0017\f\u001cI\rr\u001aR\u0017\u061cެF\u007f\txNN3\u0018K-O\u001a-c\u0002=\u001f\u05cbE\r%\u000f$\"\u000f\u0001Imd\u0010p\u0015ae\bYAWP?XNPkk\u00022\u0004\u0013\u00068\u0019HGF@B߾ѧ\u001b%EtY//ǽ\u001aHrfMݖbĈWiZ̲`.|\u0016O*7\u000b1ըfʰoP\\АL\u001d[\u001dl\u0007,\ni\u0601/ʟ@!-ī˃S\u0003"}, d2 = {"\u0014qP:X\u0017>\\\u0018\u0003\u0004`", "", "\u001eq^1h*>/\"\t\na,\ni<a\b(", " dR<`7Ha\u0019\fXh4\b\u0013?n~\u000bwN\u0004|\u0017[", "", "Ehc5E<G\\\u001d\b|K,z\u00137p\n6{M", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zk", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@dR<`7Ha\u0019\f", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "/cS\u001ah3MW\nz\u0002n,", "", "\u0019", "$", "", "", "9dh", "D`[BX", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u001c", "@d\\<i,%O'\u000ebn3\f\r a\u00078{", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d<;!&i\u0016DRш\r\u0004\b\u0005P\r4Ȑ\r!T\u0012&\u0007-ʜw"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018q\u001cL!\u0014 \u0015\u007f$\u001e\u001f\u001b!\u001b\u0007\u001b\u001a'&**/\"0bq", f = "\u001f1.96869*6p-5", i = {0}, l = {76, 78}, m = "8>GA>9(KJH>H?", n = {"a[eU_fQZ;L"}, s = {"xQ^"})
    static final class AnonymousClass2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function3<CoroutineScope, Recomposer, Continuation<? super R>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Recomposer recomposer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                recomposer = new Recomposer(coroutineScope.getCoroutineContext());
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(recomposer, null), 3, null);
                Function3<CoroutineScope, Recomposer, Continuation<? super R>, Object> function3 = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = function3.invoke(coroutineScope, recomposer, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                recomposer = (Recomposer) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == coroutine_suspended ? coroutine_suspended : obj;
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018q\u001cL!\u0014 \u0015\u007f$\u001e\u001f\u001b!\u001b\u0007\u001b\u001a'&**/\"0bqdr", f = "\u001f1.96869*6p-5", i = {}, l = {75}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Recomposer recomposer, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$recomposer = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$recomposer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$recomposer.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final <R> Object withRunningRecomposer(Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(function3, null), continuation);
    }

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k2) {
        List<V> list = map.get(k2);
        if (list == null) {
            return null;
        }
        V v2 = (V) CollectionsKt.removeFirst(list);
        if (!list.isEmpty()) {
            return v2;
        }
        map.remove(k2);
        return v2;
    }

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k2, V v2) {
        ArrayList arrayList = map.get(k2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(k2, arrayList);
        }
        return arrayList.add(v2);
    }
}
