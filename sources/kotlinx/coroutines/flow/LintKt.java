package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000e0\u0011.J~8,\u001aՄ\u000ff\u000198DkH6Ra3\u0017k\u00124,[*sK;c\u001a\u0006̝\u0011Odgon`Z\u0013C\u0015\u000b\u001ex\u0001,QU\u0007^\u001a\u000fHBwЀ;M\u0006=A`\u0003Ȃ\r H\"@y\u000b\u0002\"*V\u0017~ٙKK\"\u00128@v:Z\rc\u0005\"\u0012\f?(\u0001,zoޮ>Hz\\Bǂ+\u0003waV'e0\u0005M\u001bf\\'\u001b\u0018i\u001e1@?5#+[Έ\u001fniΪ\u001bE\u0002?\u0015hm'YH\u0014Y<ݙ\u000e\u0014=1_\u000fmrl\\3R'\u0011?O]ecV\u001e*\bzB\rj\u0003.\b-Ξ<-Bl\u0018\u0010Ct9SnQ2bP\u0003\u0013ad\u001bk\u0005KGG ~Wq=)N}{3\f>%\u0007͙/[|\u0014p\u0017+T>Q_W\u0007B`j\u0018`Us\u0014rr\u0002p\u0004^F 1\u0002߾<\u0017M=k;3!2\u0002vJ.{\u001d\u0006va\u0002RvOJr&70\n:dtr\u000bk^dp4'LJfo\u007f\u001e\u0012~m>AƼ)\u0010\\b\u0001Rxeu\u001051v7 n\u001a\rw;dڨCQ\f\u0016qT\u0007\u0014\u0006<\u0011\u0006\t)HY\u001astd(1Xr }\fF^\fY2m{,E<@GwČL\r$^Q\u0003\u000f|jj\u0016\u0005zC4\u000by*\u0005\u000b\u0011P\u000b\u007f\u001e\u0006\tM<~v![`\u007fOԊ*U(\tzò)ȷ\u0003s\u000eh\u007f.Un\u0005\u001c\u0006W\f \\\u001agPO?\u0019Á\r)Z\b=G\\r,Q{\u0013W\u0001\u0003y\u001d^\u0001.\u0016,\u001b\"2hxog\u007f\u001d!\u0007o\u000326\u007fѣ}kL\u0017WiZ(k@Ox)iLVH\u0003\u0015!.%/xP\u001bE1S)3\u0015&3];(Өoܓ2yp6>rs,Di&qrQ$2i7i[\u0005Ж0$\u0015\tRJzwNB75=\u000bNGr\u0016n\nS\n?\u0006v\r<\u000f\u0001V\":Ay\u000eE>nX\u000fʸ\u0002\u001ed_5\u0017SpwosQ\u0003\u001bZ \u001a\u001a*Uߎ\u0016&C<f]h&@\by\u001e\\kKj\u0015B\u0019&D,j\u00119adm\u0016\u0012\u0011~t~=@ЋFsAvT֒~חZH\u0013\f]\u0003/V\u0019\u0005\u001f5.x{13\u001bfV5Ѳ@\u0001{#\u0019\u001dzOEfS,\u000bǼ\u007fЬ,X\u000f9]\bQu\u001a62vIoqƑ\u001a8@\u0003-D(\u001b\u007fQ?`':l;mj^f\u0007\u0012-R|SoͮAէ\u0012<\u0018A#;]&\bh=N^w}CH57F/܍\u001a|\fL+/\u00165s=wkZեB\u009cW;\f68J57\r!\u000b\u0007.h\u0010܁):>w&d\u0012\tYPN\u0005^T\u0003#\"4\u00188_\u0002y\u0002A\u0014 ŝ>̝D'9#\u001e^Y \u0011\n\u0012%\u0004p[̃\u0011fY\\\np=Pc\tUNt\u0085\u001fŷ>\u0011aNx1\u000e\u001c-&M?0f9\u0010Ud\u0017z\"\u00142Æ-Խo4q36],\n7{{\f8aH5Ije>\u0013\r\u0005pRW\u0014_\u00192\u001b9bÑ\u0016μ\u0003Rn\u0013\u0019IT~6f5M'6ˣ\u0011\u0001"}, d2 = {"1`]0X3EO\u0016\u0006z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IC", "4k^DB5", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n]3_(MS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "2hbA\\5<b\t\b\nb3Z\f+n\u0002(z", "7r00g0OS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7r00g0OSWz\u0004g6\f\u0005>i\n1\n", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019~\\", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019~`", "1`]0X3", "", "1`d@X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"p0/\u00112qH\u000bjuL\u00010E\\[9\\[\u0002\u0007q\u000ec\fN2\u0014\u0001hE.w$J\u001d\b7X\u0006EqVO\u0007", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137:<\n !Vk\u001d@\u0001.C", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019~R:($oeBPa6[\u00017VPW,j\u001cPG!\u001cj\u001dR4\rbcJ3nWFt", "1`c0[", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbH@G.}K;(\u001buG\fHr\u0011\u001b\u001a\u00175x:C]\u001aYCu|K;>", "@dc?l", "@dc?\\,L", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u00134IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ\u001d(*xS>#\u0011?\u0013\u007fEu\u000b\u001c%\u0012>j~\fW\u0017Q\f^VH3z\u001c", "@dc?l\u001eAS\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "/sc2`7M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WybH@G.}K;(\u001buG\fHr\u0011\u001b\u001a\u00175x:C]\u001aYCu|K;>", "Bn;6f;", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "", "2dbA\\5:b\u001d\t\u0004", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015R?Lg}.$lh\u0003mg:]L\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "BnB2g", "", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015R?Lg}.$lh\u0003tc;$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "1nd;g", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LintKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,r\bӵLc\u0003\u0005I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015iiCRe`=\u0001T֖\u0013u\u000264a*tS=[ $&OW"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "&G\n8v\u0001\\ \u0018P;:b\u001a?]hb\u000e+Dq\u001af\u0006\u0006\u0003rS4)~|QrUVkvxU$rI'jQ\fa;WMtSH\u001b\u001aL\u0007G*\u00079A\n\u0014x:$\u000b\u0007\u000f\u001d.\u0011\u0007M\u001cX:U=g3X/<a[s\u000e2\u00054\u0012\u00059\u0004Z\u0018 Kd\u0017.3!Fw\n,:JI[@Z?0TQF6m.6\u0019\u000e\b\t;,4WMej\u001e$#~w\ff<\nT#,\u0004n\n\nsh3K\u0001m\u000fo!Dm`\"\u0004n\u001bQ\u001dUiN%\"p^e]G\u0018J4Q`.t", replaceWith = @ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    @InterfaceC1492Gx
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0004V\fA\u000b}#^\u0018\u000e+{^\u00181ZhM\u000b3\n/Kf\u0006\u0006o*A|%xmPJN\\s(AG1rH!\u0016Q\u007f(]KO3}'\u0017\u0011\u0007(L 6'\ns\u001et;\u0002W\r\u0013\u001d&\u0017~]\u001dD\tU/<:b}zb*.j0z4E$5\u0011Zz L[!.l", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002\\lmKG2BLQje\n+[IGqWs\u001a\rZSR*\u000bs\u0007x\u0012t:0\u0017=\u0005qa\u000b|VON\tMGg4T\u0004>[[s\u0014#z2X\u00195\r.T\u0011Ka\u001f_eMEX\u0010\u00199DM__Pw[^I7\u0001&tB*", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m10534catch(SharedFlow<? extends T> sharedFlow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return FlowKt.m10520catch(sharedFlow, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0004V\fA\u000b}#^\u0018\u000e+\n^\u001b8OpQOf\u0019wKE\u000bG\u0003o4\u00013}(TeU\rjwxK$9?\u0015j\u001a9\u0015]MzyF9Q~[\u0015X \\@\u0011\nKsF\u001f`\u000b\u0001k6\t\u0010Q\u001fM:P<g ctMT0}\u000e_[7W\u00195\rh", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002aazFO,4FQe\\~4Y\\DtLs \u0011]\u0019VZyC\u000f\u0003\u0018tK!^K")
    @InterfaceC1492Gx
    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, Continuation<? super Integer> continuation) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        InlineMarker.mark(0);
        Object objCount = FlowKt.count(sharedFlow, continuation);
        InlineMarker.mark(1);
        return objCount;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0004V\fA\u000b}#^\u0018\u000e,\u0004c)5\\_`}5\u0019q\u00185~G|qSxj&|[$5a]|>,*BQQ^M\rafWzjD:\u0017\u000f[a\u0004\u000e{9A\u0007\u0014tv\u000f_~\u0010b\b\u0014\u000b_OC\nDC56a\u0004<g%}\n_\u00050\u0004~6\u0004-\u0016\u001fHdQ\u00064Q@t\td", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0004V\fA\u000b}#^\u0018\u000e.\u0007_,\u001b\\#\f\u001d6D[\u0014S\tKrPZ\u0004;&pMw\u0002[k(>L$8=&$\fl']\bOmCs\u0005\u0014H&I\u001f\\@\u0011\nKsF\u001f`\u000b\u0001k6\t\u0010Q\u001fM:P<g ctMT0}\u000e_[7W\u00195\rh", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final CoroutineContext getCoroutineContext(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "&U\u000eD\u0007\t\u001ee]*7\td\u001aDb\u001cU\u001cf\u0017m\u001fa\u0003\\sn\u000e}2zw\fxJR\u001cxKU.8L&o\f\t(\u0018WPyCFQnV&S0\u000b=\u0010w~rF,P=\u0013e+\u000b\u0004\b\u0019R:M736_\tzg+.}%5#RO+\u0011-$\u001d\u0007G%%^ALw\r\u001c4U\u001eeoZF0XG7Q4nG\u001d\u0018\u0019Kw$t&Wk\\\u000b#a\nJ<g\r{G'/\u0014(\u0005Rd @\u0011qm\u0015\u0001\u001d@(]h4kj`+\\zR'_\u000b.nY<$UpMd2gT#8a,\"", replaceWith = @ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = ",Y\\8\u0006}+\\\u0018P;:b\u001a?]hb\u000e+Dq\u001af\u0006\u0006\u0003rS4)~|QrUVkvxU$rI'jQ\fa;WMtSH\u001b\u001aL\u0007G*\u00079A\n\u0014x:$\u000b\u0007\u000f\u001d.\u0011\u0007M\u001cX:U=g3X/<a[s\u000e2\u00054\u0012\u00059\u0004Z\u0018 Kd\u0017.3!Fw\n,:JI[@Z?0TQF6m.<+`\b\u00188zpWSi\u0017\r 0}=\t`}xP#pC(\u007fZdr/ }zKs&A|Scx(j`[ZvN\u001cc.8 Y?\u0011\u0001CMO'da%A\r/\u000f'kIHtgx<9\u00139,y2\u0007\"\u000e64\u0018OC\u0014\u0002I>{:S\"\u001cWk$>zw\u0012\u0014\u001aa>\u0018S\u001ce7Y\u001c_rYnj#)Ri\t\u00116\u0014:Iet1*z1(\rT\u0016/T\u00188B\u001c\u001cj R4O\n| ", replaceWith = @ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002\\lmKG2BLQ^M\rafWzjD:\u0017\u000f[a", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j2, function2);
    }

    static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j2, Function2 function2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = new AnonymousClass1(null);
        }
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j2, function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002\\lmKG2BLQ^M\rafWzjD:\u0017\u000f[a", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @InterfaceC1492Gx
    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, Function4<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return FlowKt.retryWhen(sharedFlow, function4);
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, Continuation<?> continuation) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        InlineMarker.mark(0);
        FlowKt.toList(sharedFlow, list, continuation);
        InlineMarker.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002aazFO,4FQe\\~4Y\\DtLs \u0011]\u0019VZyC\u000f\u0003\u0018tK!^K")
    @InterfaceC1492Gx
    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, Continuation<? super List<? extends T>> continuation) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        InlineMarker.mark(0);
        Object list$default = FlowKt__CollectionKt.toList$default(sharedFlow, null, continuation, 1, null);
        InlineMarker.mark(1);
        return list$default;
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, Continuation<?> continuation) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        InlineMarker.mark(0);
        FlowKt.toSet(sharedFlow, set, continuation);
        InlineMarker.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0016N|Gvxzcg^g\tU+1`\u001cO\u00184\u0015t\u0011f{Y:*a\u0004czpUw\u0002aazFO,4FQe\\~4Y\\DtLs \u0011]\u0019VZyC\u000f\u0003\u0018tK!^K")
    @InterfaceC1492Gx
    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Continuation<? super Set<? extends T>> continuation) {
        Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        InlineMarker.mark(0);
        Object set$default = FlowKt__CollectionKt.toSet$default(sharedFlow, null, continuation, 1, null);
        InlineMarker.mark(1);
        return set$default;
    }
}
