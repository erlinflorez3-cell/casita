package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>é6B\u0005\"4\u0012\u000e\u0007nj?1LeV:ZS0\u000fs{J$c$wDCU0}*\tUOog|Sb\u000bI\u001c\u000e\u0016\u000fj4I[\u000ee\u0012%2JoE3UoS9hҚ>\u000562*8\b\u0005\t\u001a@H\u0018v\u0001CS\f(0Hp@R\u0015M\u001b\u001a\u001a\u0006D#\t\u001ergV6Nrc?E݊+kH÷5^X\u0003S\fTTO\r%bN+n9uB+h\u0013\u000b`^W\u0003uмM\u0015v+?7Yug6\u000fÜ$\u0017;OC\\!+l\rW`\u001a-CQyJ\u0007ʫ߭{z\n\u0014|9\u001e\n5KF-PǑ\u0018\u001eAx\u000b_PR\u0012^xȕ\u000bcF\u0017[~a0I#lQoA1PMz;ټ.)\u0007n/cl\u000e\u000f\u001eôXw_;\u001a\u0018K\u0004f\u0016i?}\u0004'ç\u0012,\u00140}~]8A2%bO[o\u05faQu\u0010\u0007\\m\u0007\u0007ph\n֟\u0001\bpGt\u0016Ej!+jRt\u0011{RdXbҊ]\u001ed\u00074\u0007A\u05felyL!SRdN\u0017+ҷQ]\u0010huϐu֍rk\u001c\u001c\u0002BAzio cbvJ̳Ld\u0015X\u001dA\u0002H\u000b`6LJH!ݘ(\bJN\u001aQJE\u0002\u001eD,gǉ\u000b[x\t$BO:!_\u0011Ӑ@$Z32C\u0002C\u0005\u0017\u0011\\lr\u007fg/̢<~p\"c@\u007fځ)(e\"\u0017v\u0013\"5@\u0381\u0004Gm\u0010\u000eƉ+טyU\ng^$G\u001aGC#\u0011\u000f)hĈ[\u000f\u0015\u0006s\u001ce\u0012]ϕ-}\u001do\u0001.\u001eō1pݽdjX\u001b\u001d\u001d0CvrQJ+\u007fB=TH_od\rk>\u007fͿ\u0013[LNn{3[N5\u000f>:\tE/S'Sȶ\b\u0016?\u0015\u0018\\\u0018?^}pL>t\u001cֽ\\\u0007$0zpm@KDY[\u000f>Xغ|\u0005RH!v6ȷ\u00196\u001d3v\u0004zo\u0005yԪ\u000f/\u0004*M\u0530K\u0080Z[Hc8\u0012B\u007fw*\"\u0006.\u0018lm=\u0011\u0004ω.ơ,љ`\u000bXaR\u0017\n\u0005\u0007\u0012J\u007ffݏ\u0016ť\r0\u0014H`WO\u0011z\u0005jKT<2<\u0016([V\u007f\u0005Fÿ0Ne\u000f%cZuQUD֊ܢ`VV[1]n,B\u0007\u000f\u0011C\u001e/߶_\u0011DۯVвg8\tҵ5\u000b!w]\r7C9SlE+*h\u0001AԵmEY\u0002l\u0003u9D¡qɒ<\u001e\u0005܈Z\u001a!J_#0 >s#U\u0013b\u0015z yjNP=5?;N\u0013\u0083ۖ\u000bĢS\u0003wd3e\\\u0012OE \u0016%ZI\t\u0012\u0014q^k<\u0014=E=ws͂+\u0002_ėS\u007f\u000e;.CT\u0017/yo\u0010|\t\u0014ͩj\u001c\u007f)z\u0004\u001f\u0012\u0007܀Bn!ƚ~˹2\u0010>O\u0010S\u001a\u0015dwy\u0017qN5L\u0005\u0006xJ?ǐ\u0016ʋpevU\u0019%7=d\u001d\u0007-~A_\u07b3Oܻ\u0017Xbϐag.})\u007fJ\u0014|̂8ʭf1\u0018Oq\u000b\u0001mU\u0002\u001bR\u007f\u007f8\nI0\t\u001dTΨ{Ȅ\b2\\(#]fOD\u000e\u0017\u0004=ke8vj^˯%\u00107'\u0015~~՝GWr\u0007IۄҚ/ё\u001d/c\u000fM\u000f\u0015\u001e]K,L?q_\u001d=^\u0019\u001dx\u0012\u001f\u0007Rn\u0005\u0002:B?ۂ\u0010i<-|Sk\u001fž]*uѦ\u001b(QtFrXN\u001f?)1p7Vڨ\r *Ni5W\u0018G۴Sx\\˖\u0013ص9rYS3J\u0019~\u0007?M\u0019\u0002yH'OrY.e\u0378'˓j=-5snw\u001b\u0010\u001ab~\u0004ޏ\rSˋ0MMG$/c_P\u0019-Z<\u0006,߿6\n˜L.w^F\u000e\u0002vT58n\u0007DYF#=ݨ\u000e0\u0002\u001ay\u001ei\u001c\u0005Q\t\u001a1FT)cì]ŸO˫}\rL\rS4ʇ\u0013]"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "", "7mXA\\(ED\u0015\u0006\u000b^", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018e9Q>J@:\\{N\u0014\u001fi\u000e[\u0001s\nUR 8K3(\nu3~@h~\u001bkQ&", ":`Q2_", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018e9Q>J@:\\{N\u0014\u001fi\u000e[\u0001s\nUR 8K3(\nu3~@h~\u001bkt:f\u0002> \u0017C\u0003\u0017?/8uJbaO\u000b2", "2dU.h3MA$\f~g.j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "5dc\u0011X-:c \u000ehi9\u0001\u00121S\u000b(y~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001[!;QL=Y?\u001e\u0013>", "7mc2e5:Z\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "5dc\u0016a;>`\"z\u0002L;x\u0018/${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003w]H\u00079", "\nrTA \u0006\u0017", "", "7rABa5B\\\u001b", "u(I", "Adc\u001fh5GW\"\u0001", "uY\u0018#", "7rABa5B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":nf2e\tHc\"}", "5dc\u0019b>>`u\t\u000bg+", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ":nf2e\tHc\"}k^*\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", ";tc.g6K;)\u000ezq", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012=WP#{C\u001e(>", "<dV.g0OS|\b{b5\u0001\u0018CB\n8\u0005?\u000f", "5dc\u001bX.:b\u001d\u0010zB5}\r8i\u000f<XJ\u0011 \u0016U.\nE\u007f/DU\r$Av$", "u(E", ">nb6g0OS|\b{b5\u0001\u0018CB\n8\u0005?\u000f", "5dc\u001db:Bb\u001d\u0010zB5}\r8i\u000f<XJ\u0011 \u0016U.\nE\u007f/DU\r$Av$", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "Adc!T9@S(ove<|", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "B`a4X;/O \u000fz\u001d+|\u0010/g{7{", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "Co_2e\tHc\"}", "5dc\"c7>`u\t\u000bg+", "Co_2e\tHc\"}k^*\f\u0013<", "D`[BX", "5dc#T3NS", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f", "Dd[<V0Mg\n~xm6\n", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u0002", "/mX:T;>2\u0019|vr", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt!\u001e#xhH\\", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018U'EHb\beVz9#\u0016d\u0017<6\r\u0003/(*xS>#\u0011uN\u0013C2\u0002\u001c\u001f\fDnzKdY(\n\u001esP-rO%5`MKTi.mU]'iDJ3\u0018z\u0019)2.8\u0013\u000bW\u001a\u0003N\tkqPn>\u001f):~W\u0010Lk^>>\u0011\u001cP{u!\b", "/mX:T;>B#", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018R0KTJ;`\\{+\u001f\u0012Xc50\t\u0016U\u000b+jM9hq)N\u00029wVr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010\u000b\u001a{(\"lYw\b\u0006`\u001b\u0003a}pgUbXB-MqdVA~YF}|b2\u0001s#.\"{'}/M\u001e';d\u0003Z=", "/rBAT;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "1kP:c\u001bH0#\u000f\u0004]:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mS\u000ea0FO(\u0003\u0005g", "@t]\u000ea0FO(\u0003\u0005g", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=s{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013z\u0018d\u001dU/\u0016N^R,8EG(\u0006;M\fDvJl&\u00173ytL_[\u001d`\u001b\u007fP0lO#]\u0004TKUq.m\fmf:DC3\u0018z)\u0017wT8\u0013Q\u0017wwN\u000bc1N\u0015\u0004:m(j`FC~+", "AmP=G6", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "As^=", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "CoS.g,\u001b])\byl", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    public Animatable(T t2, TwoWayConverter<T, V> twoWayConverter, T t3, String str) {
        AnimationVector4D animationVector4D;
        AnimationVector4D animationVector4D2;
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t3;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t2, null, 0L, 0L, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t3, 3, null);
        AnimationVector velocityVector = getVelocityVector();
        if (velocityVector instanceof AnimationVector1D) {
            animationVector4D = AnimatableKt.negativeInfinityBounds1D;
        } else {
            animationVector4D = velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        }
        Intrinsics.checkNotNull(animationVector4D, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = animationVector4D;
        AnimationVector velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof AnimationVector1D) {
            animationVector4D2 = AnimatableKt.positiveInfinityBounds1D;
        } else {
            animationVector4D2 = velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        }
        Intrinsics.checkNotNull(animationVector4D2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = animationVector4D2;
        this.lowerBoundVector = animationVector4D;
        this.upperBoundVector = animationVector4D2;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (4 & i2) != 0 ? null : obj2, (i2 & 8) != 0 ? "Animatable" : str);
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 + 4) - (i2 | 4) != 0 ? null : obj2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final void setRunning(boolean z2) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z2));
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setTargetValue(T t2) {
        this.targetValue$delegate.setValue(t2);
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 + 1) - (1 | i2) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final void updateBounds(T t2, T t3) {
        V vInvoke;
        V vInvoke2;
        if (t2 == null || (vInvoke = this.typeConverter.getConvertToVector().invoke(t2)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (t3 == null || (vInvoke2 = this.typeConverter.getConvertToVector().invoke(t3)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = vInvoke.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            if (!(vInvoke.get$animation_core_release(i2) <= vInvoke2.get$animation_core_release(i2))) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i2);
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = t3;
        this.lowerBound = t2;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (Intrinsics.areEqual(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i2, Object obj3) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        if ((4 & i2) != 0) {
            obj2 = animatable.getVelocity();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec, obj2, function1, continuation);
    }

    public final Object animateTo(T t2, AnimationSpec<T> animationSpec, T t3, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t2, t3), t3, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    public final Object animateDecay(T t2, DecayAnimationSpec<T> decayAnimationSpec, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t2)), t2, function1, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    /* JADX INFO: compiled from: Animatable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDJc|\u0004W\u0006>éFN\u000f$<\u0012>\u0007vlI0\u000bfv-rU0şy{T*a#\u007fDcUH\u007fhަ\u000e"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt!\u001e#xhH\\", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pd\u0013\u000f\u0014\t\u001d\u000b\r\u0018\u0012Q!%\u001fr!\u001d\"\u0017+!((^m", f = "\u000e:47*<((1)p-5", i = {0, 0}, l = {312}, m = "8>GA>9(KJH>H?", n = {"Tdf9fWVL", "RbcSb_PN$?K.<>"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Animatable<T, V> animatable, T t2, Animation<T, V> animation, long j2, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$initialVelocity = t2;
            this.$animation = animation;
            this.$startTime = j2;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<T, V>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationState animationStateCopy$default;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    booleanRef = new Ref.BooleanRef();
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = booleanRef;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, this.$animation, this.$startTime, new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
                        final /* synthetic */ Ref.BooleanRef $clampingNeeded;
                        final /* synthetic */ AnimationState<T, V> $endState;
                        final /* synthetic */ Animatable<T, V> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Animatable<T, V> animatable, AnimationState<T, V> animationStateCopy$default2, Function1<? super Animatable<T, V>, Unit> function1, Ref.BooleanRef booleanRef2) {
                            super(1);
                            animatable = animatable;
                            animationState = animationStateCopy$default2;
                            function1 = function1;
                            booleanRef = booleanRef2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animationScope) {
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (Intrinsics.areEqual(objClampToBounds, animationScope.getValue())) {
                                Function1<Animatable<T, V>, Unit> function1 = function1;
                                if (function1 != null) {
                                    function1.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationState.setValue$animation_core_release((T) objClampToBounds);
                            Function1<Animatable<T, V>, Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            booleanRef.element = true;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef2 = (Ref.BooleanRef) this.L$1;
                    animationStateCopy$default2 = (AnimationState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationEndReason animationEndReason = booleanRef2.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationStateCopy$default2, animationEndReason);
            } catch (CancellationException e2) {
                this.this$0.endAnimation();
                throw e2;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1 */
        /* JADX INFO: compiled from: Animatable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.rY0\u000ey|\\$\n&\u001aOKW*}h\t_Pwg5K\t\u000e\n\u0017و\u001axp0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
            final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
            final /* synthetic */ Ref.BooleanRef $clampingNeeded;
            final /* synthetic */ AnimationState<T, V> $endState;
            final /* synthetic */ Animatable<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Animatable<T, V> animatable, AnimationState<T, V> animationStateCopy$default2, Function1<? super Animatable<T, V>, Unit> function1, Ref.BooleanRef booleanRef2) {
                super(1);
                animatable = animatable;
                animationState = animationStateCopy$default2;
                function1 = function1;
                booleanRef = booleanRef2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                invoke((AnimationScope) obj2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(AnimationScope<T, V> animationScope) {
                SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                if (Intrinsics.areEqual(objClampToBounds, animationScope.getValue())) {
                    Function1<Animatable<T, V>, Unit> function1 = function1;
                    if (function1 != null) {
                        function1.invoke(animatable);
                        return;
                    }
                    return;
                }
                animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                animationState.setValue$animation_core_release((T) objClampToBounds);
                Function1<Animatable<T, V>, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(animatable);
                }
                animationScope.cancelAnimation();
                booleanRef.element = true;
            }
        }
    }

    public final Object runAnimation(Animation<T, V> animation, T t2, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, t2, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    public final T clampToBounds(T t2) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t2;
        }
        V vInvoke = this.typeConverter.getConvertToVector().invoke(t2);
        int size$animation_core_release = vInvoke.getSize$animation_core_release();
        boolean z2 = false;
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            if (vInvoke.get$animation_core_release(i2) < this.lowerBoundVector.get$animation_core_release(i2) || vInvoke.get$animation_core_release(i2) > this.upperBoundVector.get$animation_core_release(i2)) {
                vInvoke.set$animation_core_release(i2, RangesKt.coerceIn(vInvoke.get$animation_core_release(i2), this.lowerBoundVector.get$animation_core_release(i2), this.upperBoundVector.get$animation_core_release(i2)));
                z2 = true;
            }
        }
        return z2 ? this.typeConverter.getConvertFromVector().invoke(vInvoke) : t2;
    }

    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    /* JADX INFO: compiled from: Animatable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJc|\u0004W\u0006>éFB-!L\u0014}јtjY6JdV/zSX\u00112ڟr"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pd\u0013\u000f\u0014\t\u001d\u000b\r\u0018\u0012Q\"\u001e\u0012\"\u0007#Xg", f = "\u000e:47*<((1)p-5", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04052 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04052(Animatable<T, V> animatable, T t2, Continuation<? super C04052> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$targetValue = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C04052(this.this$0, this.$targetValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C04052) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.endAnimation();
                Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
                this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                this.this$0.setTargetValue(objClampToBounds);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object snapTo(T t2, Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C04052(this, t2, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    /* JADX INFO: compiled from: Animatable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJc|\u0004W\u0006>éFB-!L\u0014}јtjY6JdV/zSX\u00112ڟr"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pd\u0013\u000f\u0014\t\u001d\u000b\r\u0018\u0012Q\"$ \"Ve", f = "\u000e:47*<((1)p-5", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04062 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04062(Animatable<T, V> animatable, Continuation<? super C04062> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C04062(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C04062) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.endAnimation();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object stop(Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C04062(this, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final State<T> asState() {
        return this.internalState;
    }
}
