package com.statsig.androidsdk;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĥ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(0\u001aw\u0015orˎ8DsT6RY*\u0017k\n4,[*sK;k\u001a\u0006̝\u0011OdgonP_\u0013C%\u0006\u001exp,QU\u000f]\u001aƁ:B\u0006?;Mu>A`\u000b6\r 8\"@y\u001b\u0001\"*N\u0010~zYK\u0014۵8@\u0007:Z\rS\u0005\"\u0012\u001c>(\u00014\\oN<It]P/+\u0003oDV'm4\u0005ձ\u0015FbI\u0015vg(3@M5\u001d%i\u0003\u000fRq?\u000b?wK\u000bٙ'=Ǣys\u00065\u0019\u0005\u001a\u0015ۣS\rkrnj\u0013Yx\fU4\u007fgYZ&(&\u0006B\u0012\u0005\u0012\u001c\u0012?H\\6Jj\u0016\u0018Kt!^\u0007UJlP\r\u0013ad%U\u0004A:Q\u001b\u0015\\(;a]E\f\u001d\rL1G͡_ǵSו\u05ce\u0019\u001bb\t\u001a7_RUH|\u001d B6\u0012~v\u001a*2Ew\u0004=\u0012).E0}`\u00021/\u0003\u001aHr|'\tn~ki\u0001S\u0007'7.EB!\f\tY\u0015\tyilXZ\u001c}\"Z\u0007\f\"+ \u000b\u0001\u0003&m(\\j\u0001i\u0019b\u000e\u000e3H~7\by\u001c\u0014]9lMMQ\u0012\u0019(W?\"MXz\u0005\u0007\u0004rW\u001adt(P=\u000foX\u0006\nbf\fAOou*>D1Gg[MK\"P`\u0015\t\u000ez1(\ruK$1\fTx\u0017$h\\\u001fz\u0018~O,\u000bz:-oZ{\u001enm0\rL|Q)/w\u000ej\u007fLuW\u001d\u001c{U\n:.\u001agZuB[)\rNJ\u0002[k|vsxe\u0012U\u0006-\u0002\u0015;vV\u007f\n\u0001oZ\n1O\u0018Z%L\u000f^!.NiH1oq\u0013IyS9\bnM\u00010q<|f-\t-M=\u0001\u001e--=3C5M.y*.C\u0013\u000eou.\b\u000b'&#\u0018JЁ\"ޗn̥жa2Ik\u0012\u0012\rr:$\u001b\u0011rLx% B7b=7Vp|p\u0005C}\u00135}t7D\u000f\u0007U\nkCw\u00044<\u0015BuY|B\u0015s+\u0017Ma\u0010\u0006my\u000fQOW\u0010\u00193In@%\u0004%\u001f\u000fpAH\u0006\"&fEI\u001c\u001d<7/d4B\b\u0019}lk\u001c\u000f);vs\u0015\u0017@~\fIf\u0010dx\u000baX\u0007pE\u000f,@\u007f-Ly#א91\u0013,\u000f\u0003=\u001cJ\u0001\u0002+9\u001fx\t\u0017fS6tXGU@X/\u0016uqII\u0010r\u001cU9o{o:C(~-BF&OP?\u001d=5'-c\u001dfd% \u0017V\\[A~)\b>L\u0018K#%_t\u007fb[W^yGCH\fE\u0002o\fT\u000bq\u00063-4C]AW+,'*l\u001a@F\u0016._?\u0004#/\r[\u001c|\"]IE\\v^p\u0010J+PN\u0012^N\u00035\".6K\u0016\u0007{\u001a! qk&/p+9\u0006\u001eBys)\u0010ilq\tm\u000b1ow[B|;\u00145\tU[^\u0017f\u001fR\u0011\u0002=\u001f\u0016H\"#i766pY\u0014]m\u0001p\u001aZ\"\u0012sEyoy1^`N\u0002-@\u000e\u0004XvX\u0019I\u001ee>\u0013\u0014#q\u000bw\u001c$\u0003(\u0013\u0003<-\" \u0017H\r\u001cC8T:6d]BI%a\rUz\u001f\u0004sRl&yvMcO29}Xz\u001fLRb#JZV\u0017(\u0018w</VTk#7[4m\u0013\u0011T\u0017.8!Tt3\u001c^GZf.n`(2SQaLI!\u000fOP\u0012\u007f\t)5\u0019\\c':\u0001+\u007f;|@64P\u0002\u0006\u000b#]\u001d \u001fepS%cp|+\u001a<}J-V*[W\u0004:\u0019MEL\b\u0006D\u000e-7$R\u0011&3\u000e\u007fIT:al@\u0005~g\u00066*dmr`\u000eqA\u0003\u0018|\u0002\u0018\"r\"ȬrҚy߭ԯH>8>5\"S\u001f\u0001y9R=M\u001a7\u001d;A5-{>\u00068˧iÈqىҰ`]Je<\nH\u0006y6(U\u0007^r\u0014;flc\u0019x\u001eUmeP\u0012;\u0018J|yXnVx\u001dF5\u0012{\u000fEjPeA\u0011\u0019\u0007Ǌb݄-˷ՠ\u000f\u0006$?\u0011H\u0010Vb`C!cM\u0002q_\u0014lzONAo+\u00063A\u0003UOW\u0002XkDC\r}J\u00074{[3\u0013gʆ#Ȍ\u0014ɸԐ/.U1\u0007N84\u001e\u000esrx\u0016R)\\*\u0004/^a\u0001\u0007`Ck64!STC\u001c/Fh7i>)9GY~R\u0004.=z\u0012\u0003>@/\u00129[\u001a>\u0003E\u0002\u000eI>*\n\u0013ų\u0014ޮD۠\u001cØe\\)ǒ\u0016A5DYlngE\u001deD\u001f\u000e&-2\r٣$do\u0013o%ݪc_"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7/", "", "u(E", "1kX2a;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", "5dc\u0010_0>\\(=vg+\n\u00133dy6zFz$\u0017No\nJvc1b\u0007*Fi%2WLI", "5dc\u0010_0>\\(=vg+\n\u00133dy6zFz$\u0017No\nJv", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kr4C]\u007f}>q\u00167\\\u0019", "Adc\u0010_0>\\(=vg+\n\u00133dy6zFz$\u0017No\nJv", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[[';m\u001f=#\u0007,", "1gT0^\u000e:b\u0019", "", "5`c2A(FS", "", "1gT0^\u000e:b\u0019p~m/\\\u001c:o\u000e8\t@g!\u0019Is\u0017>U)CUz'7l", "3mU<e*>7\"\u0003\nb(\u0004\rDe~", "", "4t]0g0H\\\u0002z\u0003^", "4kd@[", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u000e_3(d\u0019\f\bb+|\u0017", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQ\u0011", "5dc\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "1n]3\\.'O!~", "5dc\u0010b5?W\u001bp~m/\\\u001c:o\u000e8\t@g!\u0019Is\u0017>U)CUz'7l", "5dc\u0012k7>`\u001d\u0007zg;", "3w_2e0FS\"\u000ecZ4|", "9dT=7,OW\u0017~kZ3\r\t", "5dc\u0012k7>`\u001d\u0007zg;n\r>h_;\u0007J\u000f'$GV\u0018>x)>[\\$Ei\u00135MB", "5dc\u0013X(Mc&~\\Z;|", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "5dc\u0013X(Mc&~\\Z;|z3t\u0003\b\u000fK\u000b%'TotFx'9b\u007f~;{\u0012+TC:", "5dc\u0016a0MW\u0015\u0006~s,i\t=p\n1\n@e%!P", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015c\u0002", "5dc\u0019T@>`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", ":`h2e\u0015:[\u0019", "5dc\u0019T@>`\u000b\u0003\na\f\u0010\u00149s\u00105{'\u000b\u0019\u0019Kx\u0010\u001bz31V\u0005 6", "5dc\u001dT9:[\u0019\u000ezk\u001a\f\u0013<e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.#", ">`a.`,MS&l\nh9|q+m\u007f", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.-T7rD\u001a$lkBpn;R\u00010U\"", "5dc g(;Z\u0019bY", "7mXA\\(EW.~", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013\u001cFq 7,CJg8%#>", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "AcZ\u0018X@", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAPq;J\u00065KN\u0018(eQ\u007fG\u0018\u0011h\rTtz\u0014UP2rF'-\b9\u001fh9r\tU$\u001d1y~FXYC\u0003\u0014\u0003K-gTXeC5PAq8h\u000eI(k>D-\"G\u007f!r_5\u000e\u0005\u001d\u000f|_\u0004wvK\"zFm\u001cwdUIxe8\u0004+)TQ;x7T\u0006'>4\u007f=,\u007fN\u0002Pg\u0016M4", "7mXA\\(EW.~Vl@\u0006\u0007", "1`[9U(<Y", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+]\u001d8\u000639[[\u001c>t\u0013*KI\u0011", "7r8;\\;BO \u0003\u0010^+", ":nV\u0012i,Gb", "3uT;g\u0015:[\u0019", "D`[BX", "", ";dc.W(MO", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0014c\u000e\u001d>mk\u0015R?Lg}.$lh\u0003n_7$:\u0018", ";`]BT3Eg\u007f\t|<6\u0006\n3g_;\u0007J\u000f'$G", "1n]3\\.", ";`]BT3Eg\u007f\t|>?\b\t<i\b(\u0005O`*\"Q}\u001eIv", "3w_2e0FS\"\u000e", ";`]BT3Eg\u007f\t|@(\f\t\u000fx\u000b2\nP\u000e\u0017", "5`c2", ";`]BT3Eg\u007f\t|E(\u0011\t<P{5wH\u0001&\u0017TO!G\u00013Ef}", ":`h2e", ">`a.`,MS&gvf,", "=oT;7,;c\u001bo~^>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010}3t\u001d+IAAA", "=uT?e0=Sv\t\u0004_0~", "=uT?e0=Szz\n^", "=uT?e0=S\u007fz\u000f^9", "@dU?X:A1\u0015|}^", "@dU?X:A1\u0015|}^\b\u000b\u001d8c", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S{Kr4C]\u007f}3t\u001d+IAAA\u001b$\u001fwh=\u0010-*X\u00041W[R5\\`<\u001b\u001e\u001bi\u0012W;\t\u0014]K-D\b\u001e$\u0004=EKBd\n\u000e_w2op@ee", "@d\\<i,\u001aZ h\f^9\n\r.e\u000e", "@d\\<i,(d\u0019\f\bb+|", "<`\\2", "AgdAW6P\\", "AgdAW6P\\\u0007\u000f\ti,\u0006\b", "CoS.g,.a\u0019\f", "D`[BX:", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[m.7zk\u0015R?Lg}.$lh\u0003n_7$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "CoS.g,.a\u0019\fVl@\u0006\u0007", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Statsig {
    public static final Statsig INSTANCE = new Statsig();
    private static StatsigClient client = new StatsigClient();

    /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdown$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdown$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C02611(Continuation<? super C02611> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02611(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Statsig.INSTANCE.shutdownSuspend(this) == coroutine_suspended) {
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

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
                Dispatchers dispatchers = Dispatchers.INSTANCE;
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new C02611(null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Statsig$shutdownSuspend$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11901(Continuation<? super C11901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return Statsig.this.shutdownSuspend(this);
        }
    }

    private Statsig() {
    }

    @JvmStatic
    public static final boolean checkGate(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        return client.checkGate(gateName);
    }

    @JvmStatic
    public static final boolean checkGateWithExposureLoggingDisabled(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        return client.checkGateWithExposureLoggingDisabled(gateName);
    }

    private final void enforceInitialized(String str) {
        client.enforceInitialized$android_sdk_release(str);
    }

    @JvmStatic
    public static final Object flush(Continuation<? super Unit> continuation) {
        Statsig statsig = INSTANCE;
        statsig.enforceInitialized("flush");
        Object objFlush = statsig.getClient$android_sdk_release().flush(continuation);
        return objFlush == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlush : Unit.INSTANCE;
    }

    @JvmStatic
    public static final StatsigOverrides getAllOverrides() {
        return client.getAllOverrides();
    }

    public static /* synthetic */ void getClient$android_sdk_release$annotations() {
    }

    @JvmStatic
    public static final DynamicConfig getConfig(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        return client.getConfig(configName);
    }

    @JvmStatic
    public static final DynamicConfig getConfigWithExposureLoggingDisabled(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        return client.getConfigWithExposureLoggingDisabled(configName);
    }

    @JvmStatic
    public static final DynamicConfig getExperiment(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        return getExperiment$default(experimentName, false, 2, null);
    }

    @JvmStatic
    public static final DynamicConfig getExperiment(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        return client.getExperiment(experimentName, z2);
    }

    public static /* synthetic */ DynamicConfig getExperiment$default(String str, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return getExperiment(str, z2);
    }

    @JvmStatic
    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        return getExperimentWithExposureLoggingDisabled$default(experimentName, false, 2, null);
    }

    @JvmStatic
    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        return client.getExperimentWithExposureLoggingDisabled(experimentName, z2);
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return getExperimentWithExposureLoggingDisabled(str, z2);
    }

    @JvmStatic
    public static final FeatureGate getFeatureGate(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        return client.getFeatureGate(gateName);
    }

    @JvmStatic
    public static final FeatureGate getFeatureGateWithExposureLoggingDisabled(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        return client.getFeatureGateWithExposureLoggingDisabled(gateName);
    }

    @JvmStatic
    public static final Layer getLayer(String layerName) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        return getLayer$default(layerName, false, 2, null);
    }

    @JvmStatic
    public static final Layer getLayer(String layerName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        return client.getLayer(layerName, z2);
    }

    public static /* synthetic */ Layer getLayer$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return getLayer(str, z2);
    }

    @JvmStatic
    public static final Layer getLayerWithExposureLoggingDisabled(String layerName) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        return getLayerWithExposureLoggingDisabled$default(layerName, false, 2, null);
    }

    @JvmStatic
    public static final Layer getLayerWithExposureLoggingDisabled(String layerName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        return client.getLayerWithExposureLoggingDisabled(layerName, z2);
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return getLayerWithExposureLoggingDisabled(str, z2);
    }

    @JvmStatic
    public static final ParameterStore getParameterStore(String parameterStoreName) {
        Intrinsics.checkNotNullParameter(parameterStoreName, "parameterStoreName");
        return getParameterStore$default(parameterStoreName, null, 2, null);
    }

    @JvmStatic
    public static final ParameterStore getParameterStore(String parameterStoreName, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
        Intrinsics.checkNotNullParameter(parameterStoreName, "parameterStoreName");
        return client.getParameterStore(parameterStoreName, parameterStoreEvaluationOptions);
    }

    public static /* synthetic */ ParameterStore getParameterStore$default(String str, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            parameterStoreEvaluationOptions = null;
        }
        return getParameterStore(str, parameterStoreEvaluationOptions);
    }

    @JvmStatic
    public static final String getStableID() {
        return client.getStableID();
    }

    public static /* synthetic */ Object initialize$default(Statsig statsig, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation continuation, int i2, Object obj) {
        StatsigOptions statsigOptions2 = statsigOptions;
        if ((i2 & 4) != 0) {
            statsigUser = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
        }
        return statsig.initialize(application, str, statsigUser, statsigOptions2, continuation);
    }

    @JvmStatic
    public static final void initializeAsync(Application application, String sdkKey) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, null, null, null, 28, null);
    }

    @JvmStatic
    public static final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, statsigUser, null, null, 24, null);
    }

    @JvmStatic
    public static final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser, IStatsigCallback iStatsigCallback) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        initializeAsync$default(application, sdkKey, statsigUser, iStatsigCallback, null, 16, null);
    }

    @JvmStatic
    public static final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions options) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(options, "options");
        client.initializeAsync(application, sdkKey, statsigUser, iStatsigCallback, options);
    }

    public static /* synthetic */ void initializeAsync$default(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i2, Object obj) {
        StatsigOptions statsigOptions2 = statsigOptions;
        StatsigUser statsigUser2 = statsigUser;
        if ((i2 + 4) - (i2 | 4) != 0) {
            statsigUser2 = null;
        }
        IStatsigCallback iStatsigCallback2 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? iStatsigCallback : null;
        if ((i2 + 16) - (i2 | 16) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
        }
        initializeAsync(application, str, statsigUser2, iStatsigCallback2, statsigOptions2);
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return client.isInitialized();
    }

    @JvmStatic
    public static final void logEvent(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        logEvent$default(eventName, (Double) null, (Map) null, 6, (Object) null);
    }

    @JvmStatic
    public static final void logEvent(String eventName, Double d2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        logEvent$default(eventName, d2, (Map) null, 4, (Object) null);
    }

    @JvmStatic
    public static final void logEvent(String eventName, Double d2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        client.logEvent(eventName, d2, map);
    }

    @JvmStatic
    public static final void logEvent(String eventName, String value) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(value, "value");
        logEvent$default(eventName, value, (Map) null, 4, (Object) null);
    }

    @JvmStatic
    public static final void logEvent(String eventName, String value, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(value, "value");
        client.logEvent(eventName, value, map);
    }

    @JvmStatic
    public static final void logEvent(String eventName, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        client.logEvent(eventName, (Double) null, metadata);
    }

    public static /* synthetic */ void logEvent$default(String str, Double d2, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            d2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            map = null;
        }
        logEvent(str, d2, (Map<String, String>) map);
    }

    public static /* synthetic */ void logEvent$default(String str, String str2, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = null;
        }
        logEvent(str, str2, (Map<String, String>) map);
    }

    @JvmStatic
    public static final void manuallyLogConfigExposure(DynamicConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        client.manuallyLogConfigExposure(config);
    }

    @JvmStatic
    public static final void manuallyLogConfigExposure(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        client.manuallyLogConfigExposure(configName);
    }

    @JvmStatic
    public static final void manuallyLogExperimentExposure(DynamicConfig experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        client.manuallyLogExperimentExposure(experiment);
    }

    @JvmStatic
    public static final void manuallyLogExperimentExposure(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        client.manuallyLogExperimentExposure(experimentName, z2);
    }

    public static /* synthetic */ void manuallyLogExperimentExposure$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        manuallyLogExperimentExposure(str, z2);
    }

    @JvmStatic
    public static final void manuallyLogGateExposure(FeatureGate gate) {
        Intrinsics.checkNotNullParameter(gate, "gate");
        client.manuallyLogGateExposure(gate);
    }

    @JvmStatic
    public static final void manuallyLogGateExposure(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        client.manuallyLogGateExposure(gateName);
    }

    @JvmStatic
    public static final void manuallyLogLayerParameterExposure(Layer layer, String parameterName) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        client.manuallyLogLayerParameterExposure(layer, parameterName);
    }

    @JvmStatic
    public static final void manuallyLogLayerParameterExposure(String layerName, String parameterName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        client.manuallyLogLayerParameterExposure(layerName, parameterName, z2);
    }

    public static /* synthetic */ void manuallyLogLayerParameterExposure$default(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        manuallyLogLayerParameterExposure(str, str2, z2);
    }

    @JvmStatic
    public static final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(value, "value");
        client.overrideConfig(configName, value);
    }

    @JvmStatic
    public static final void overrideGate(String gateName, boolean z2) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        client.overrideGate(gateName, z2);
    }

    @JvmStatic
    public static final void overrideLayer(String layerName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(value, "value");
        client.overrideLayer(layerName, value);
    }

    @JvmStatic
    public static final Object refreshCacheAsync(IStatsigCallback iStatsigCallback, Continuation<? super Unit> continuation) {
        Object objRefreshCacheAsync = INSTANCE.getClient$android_sdk_release().refreshCacheAsync(iStatsigCallback, continuation);
        return objRefreshCacheAsync == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRefreshCacheAsync : Unit.INSTANCE;
    }

    public static /* synthetic */ Object refreshCacheAsync$default(IStatsigCallback iStatsigCallback, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iStatsigCallback = null;
        }
        return refreshCacheAsync(iStatsigCallback, continuation);
    }

    @JvmStatic
    public static final void removeAllOverrides() {
        client.removeAllOverrides();
    }

    @JvmStatic
    public static final void removeOverride(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        client.removeOverride(name);
    }

    @JvmStatic
    public static final void shutdown() throws InterruptedException {
        INSTANCE.enforceInitialized("shutdown");
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
    }

    public static /* synthetic */ Object updateUser$default(Statsig statsig, StatsigUser statsigUser, Map map, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            map = null;
        }
        return statsig.updateUser(statsigUser, map, continuation);
    }

    @JvmStatic
    public static final void updateUserAsync(StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map<String, ? extends Object> map) {
        client.updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    public static /* synthetic */ void updateUserAsync$default(StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            iStatsigCallback = null;
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    public final StatsigClient getClient$android_sdk_release() {
        return client;
    }

    public final ExternalInitializeResponse getInitializeResponseJson() {
        return client.getInitializeResponseJson();
    }

    public final /* synthetic */ Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation continuation) {
        return getClient$android_sdk_release().initialize(application, str, statsigUser, statsigOptions, continuation);
    }

    public final void openDebugView(Context context, Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        client.openDebugView(context, callback);
    }

    public final /* synthetic */ Object refreshCache(Continuation continuation) {
        Object objRefreshCache = getClient$android_sdk_release().refreshCache(continuation);
        return objRefreshCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRefreshCache : Unit.INSTANCE;
    }

    public final void setClient$android_sdk_release(StatsigClient statsigClient) {
        Intrinsics.checkNotNullParameter(statsigClient, "<set-?>");
        client = statsigClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object shutdownSuspend(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.statsig.androidsdk.Statsig.C11901
            if (r0 == 0) goto L4c
            r4 = r6
            com.statsig.androidsdk.Statsig$shutdownSuspend$1 r4 = (com.statsig.androidsdk.Statsig.C11901) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L4c
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L52
            java.lang.Object r1 = r4.L$0
            com.statsig.androidsdk.Statsig r1 = (com.statsig.androidsdk.Statsig) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L2d:
            com.statsig.androidsdk.StatsigClient r0 = new com.statsig.androidsdk.StatsigClient
            r0.<init>()
            r1.setClient$android_sdk_release(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L38:
            kotlin.ResultKt.throwOnFailure(r3)
            com.statsig.androidsdk.StatsigClient r0 = r5.getClient$android_sdk_release()
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.shutdownSuspend(r4)
            if (r0 != r2) goto L4a
            return r2
        L4a:
            r1 = r5
            goto L2d
        L4c:
            com.statsig.androidsdk.Statsig$shutdownSuspend$1 r4 = new com.statsig.androidsdk.Statsig$shutdownSuspend$1
            r4.<init>(r6)
            goto L19
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.Statsig.shutdownSuspend(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final /* synthetic */ Object updateUser(StatsigUser statsigUser, Map map, Continuation continuation) {
        Object objUpdateUser = getClient$android_sdk_release().updateUser(statsigUser, map, continuation);
        return objUpdateUser == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateUser : Unit.INSTANCE;
    }
}
