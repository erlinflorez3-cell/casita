package androidx.compose.foundation;

import android.view.Surface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
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
/* JADX INFO: compiled from: AndroidExternalSurface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$\bCCU }*\t]TogtJb\u000bY\u000f\u000e\u0016\u0007j4Icތe\u0012%2JoE3UoS9hҚ>\u000562*8\u007f\f\u0007:@Ϻ@v)B{\f@0\u0001{JV\u001bN\u001d\u001a@\b̧$\u0001,_0jDc\u0005]h@S\u0007wNf'\u000e9-Q\u001bTl';\u0004\u0012\"9OO5C2\u001c\u001f\u0015ns?1P\"A\u0013t?'YR$[Df\u0018\u0014C8\u007f\u0011k\u0002>\\3^)\u00185Hgcya>,\u0006\u0007\u0014\rj\rVy5NF-Hw8rAz\u000b4FO\u0012`R\u007f)iF(5\u000fa4ݰ\u001fpWkK\u001fTB\f\u0007\u0013$I\r~2kc<mڠ\u001f^}[AWFHXP\u0010_c{\u0014\u0002r\u0011X\u0011ΥK\n5\u0006!4\u001d0G]?)Gz\u0012PTm\u0007\u0007ph\u0002z\u0001XP&~\u0018M)7\u001e\tK\u0081\tkVg\u001f@ҭQ\u001cb%FU!?twj2M\u0010|X\u0019)xluE51v7\bw{\u001fgH\r@̳Um\u0016kb|\u001aJLd\u000b^\rPc\u001djkV/ĘLt\u0016\u0002\fJT\u0017#4EwBC<3)\\CY14նE|\u000fr!|X\"bS<\u0003\u00185\u001d\t/Y\r\u0006}\b\u0011Z<~p\"[Ja7)&\u00043\u0017Lč'\u0007\u0005\u0007F[8ZUP\u0005\u0018\fT*%l֠Eֺ3=\u001bÁO\u001a@\bE(RquS]\u0012U\u0003\r\u000b\u001fJ\u00177Թ\ftv6ppPZd\u0019(|\u0005~3\u0019t\u000f(nâ~Qi^\u001baDT\u0003\u0005_BtF\r\u0016/-S\u000eȞ&\u0007;7S-#!\b\u00165\u001b\blyw>\u007fr\u00116t\u0014\u0015Zs&srSs1iJ_X-Eѐ(l\tU\u001f۶\u0004ڇF\u000b<\rA\\\u0012.~kP\u000b\u001b1\u000ef55\u001d\u0002fjh ̭\u0002>4i:yI\t$`I+7[cx}|yi\u05c8N\u0019\u0010\u0015\f7t\u001d,?&\\}q\u00192\u0016sFGW:\u0011\u001bØ\r$:?\u0013ލ\u0017ͲXi\u000e؋K\u001fTv'*BD\u0004;\u0005\u0017dzlVv\u0016vD\u000f9Ǆ\u0005~\u0015FtְA̰\tmN\u07bc\u007fr@\u0002k\u001d7\u001d˥S\u0005nއCFZR)B\u0098\u0005,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00021g}{@l#8QB\u001b~C\u001e\"q]@ts9Or%G:](kRH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;luA\\CHt0%\u0003xn:\u0003a,<t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0013Ef~\u001c5m\u0004,WN;A", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "=mBBe-:Q\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0013Ef~\u001c5ms8ZMKz8'\u0015V_C\u0012c\u0002", "\u001a`]1e6BRb\u0010~^>Fv?r\u0001$y@V", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Ata3T*>", "", "EhSA[", "6dX4[;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0005/", "=mBBe-:Q\u0019\\}Z5~\t.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "=mBBe-:Q\u0019]zl;\n\u0013Ce~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc V6IS", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "2hb=T;<V\u0007\u000f\b_(z\t\rh{1}@\u007f", "2hb=T;<V\u0007\u000f\b_(z\t\rr\u007f$\u000b@\u007f", "2hb=T;<V\u0007\u000f\b_(z\t\u000ee\u000e7\tJ\u0015\u0017\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>)Sc(", "=m25T5@S\u0018", "=m32f;K]-~y", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private Job job;
    private Function5<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> onSurface;
    private Function3<? super Surface, ? super Integer, ? super Integer, Unit> onSurfaceChanged;
    private Function1<? super Surface, Unit> onSurfaceDestroyed;
    private final CoroutineScope scope;

    public BaseAndroidExternalSurfaceState(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(Function5<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super Continuation<? super Unit>, ? extends Object> function5) {
        this.onSurface = function5;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, Function3<? super Surface, ? super Integer, ? super Integer, Unit> function3) {
        this.onSurfaceChanged = function3;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, Function1<? super Surface, Unit> function1) {
        this.onSurfaceDestroyed = function1;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidExternalSurface.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLa\u0002\u0015\bd\u0013\n\u0019\u0017\u0012\u000eo$!\u0013!\u001e\u0012\u001e\u0006)'\u001c\u0018\u001b\u001e\r/\u001d1#b$*53%9)/\u001b><1-03\u0012B63G99y\b", f = "\u000e:/<81+\u000b=8(4/!+\u00112.!\u001b\u001c\u001dd\u0017#\u0018%!\u001a\u0014\\\u0019!", i = {0}, l = {132, 137}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aNHKHI2"}, s = {"xQ^"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Surface surface, int i2, int i3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$surface = surface;
            this.$width = i2;
            this.$height = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BaseAndroidExternalSurfaceState.this.new AnonymousClass1(this.$surface, this.$width, this.$height, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Job job = BaseAndroidExternalSurfaceState.this.job;
                if (job != null) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState.this, coroutineScope);
            Function5 function5 = BaseAndroidExternalSurfaceState.this.onSurface;
            if (function5 != null) {
                Surface surface = this.$surface;
                Integer numBoxInt = Boxing.boxInt(this.$width);
                Integer numBoxInt2 = Boxing.boxInt(this.$height);
                this.L$0 = null;
                this.label = 2;
                if (function5.invoke(baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1, surface, numBoxInt, numBoxInt2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i2, int i3) {
        if (this.onSurface != null) {
            this.job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(surface, i2, i3, null), 1, null);
        }
    }

    public final void dispatchSurfaceChanged(Surface surface, int i2, int i3) {
        Function3<? super Surface, ? super Integer, ? super Integer, Unit> function3 = this.onSurfaceChanged;
        if (function3 != null) {
            function3.invoke(surface, Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        Function1<? super Surface, Unit> function1 = this.onSurfaceDestroyed;
        if (function1 != null) {
            function1.invoke(surface);
        }
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }
}
