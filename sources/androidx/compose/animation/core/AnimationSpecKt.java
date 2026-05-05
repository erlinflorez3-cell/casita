package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D߬)\u001e\u007f\u007fLDiu\fA\u00147\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[*rK;k\u001a\u0006̝\u0011Odgon`Z\u0013C\u001d\u0006\u001ex\u0001,Qǁ\u0001](\u000f:B\u0006?;ݹw=Ge|Ȃ\r H\"@ц\r\u0001(0P\u0010|{KK\"\u00128@v:Z\rc\u0005\"\u0012\fA(\u00014\\oN<Ht]P/+\u0003oBV'u0\u0005M#F\\'\u0013wyF9¨O;%'c\u0003MR\n>#Awܵ\u0013hW19J\f]FZ\u0010\u0014[+}\f\u000ev4^\u001dQ\u000f\u000fm*g\u000eYT&.\b|\f\r\u0003\u0004<\u000bGJ4Ʀ(f8\u0018Az\u000bYPR\u0012^\t\u007f)hf\u001d+\u007fA3Q\u001b\u0015Z(@1\rE\u007f\u001d\u0013.%\u0011ng[\u0003\u0013\u0001\u0017!Ƙ\u0006Qa[NC`T\u001a[MmJp\u0011\tZ\n6G\u000e7\u0014\u0011\\ U=a91+\u0004\u0002vO.{ߌ_åרmTNL0{.h8\u0017$`Tf\u0015k\u0017T\u0007;1O\"\u0381\u0015}8..l\u0010S1- T_jyj\u0014]87?hGY\u001d~<hߍb3;e*\u0015y\u0004\u0005)WBr\u0007hf\tS:p|*(õVj@\u0013\nTf##:Ow,6<1_\\C_\u0013 RA+\u001c\u000ekӳ\u0014~ZGj\b\u0002_\u0003\u001e\u0019Vlr\u007fg?IZ\u0013\u0001$3ۋ_5I,[!vL\u0015#5\u0018$\u001bUwd^\\t&{e}0\u0016`9\u007fFM\u0015\u001f~WE0>։Prke\u0014\u0017?-\u000b\u0014'Ax0w\b1pZ{\u000bLUܷ%\"'b\u0001? d.\u0017\u0012P\tM{Z\u001b]NI9\u0003\bC~>\u0003\u0005-&=\u0001\u001e+C:E\n57.}$1%a$i\u001eI\u001ad\u0015ծ\u0003e40q2\bb\u007fzbEFOq\u0005N$4lIBvq(\u000eH\tB\u0015KHom!\\>M\u00199\u0016f57SuĜZƥ݇s\u007f:LmI\f_\f4vI5\u0013]S.m\u001cl|\rP\u05fa\u0018\u000b,7t\u0012*_8V\u0006\u007fO5\u001e+&YYAr\u0007L\tj4Z`(\rIҍw\u0006@\u0001\u0006Fm4/2p\rk\\\u0014T\u0007\u0003nH3yuh'*\u000f&'54w{1KrܑX/qZ\u0019\u0004+23p_\u0001v%qD\u0003c;*^۞\u0019E\u000eIO\u0002D/_)\u001c\t \u0012>\u0018\u000b?Z\u0018IV\u0002\u0017ev>\u000b#U\u0013{+{*\u001e`|:+\u0015yC=\\\f\u0015ԥ'O\u0013uh,Z} 7qJ)#T+\u0017\fCcV\u001d=\u0006{\\kz\u001b\u001a5.oUQ|N f'ؗx!j\u000bʭf\u000fe\u001e@ϥ\u000eDa֘\rG"}, d2 = {"2d[.l,=", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "\"", "/mX:T;B]\"l\u0006^*", "AsP?g\u000b>Z\u0015\u0013cZ5\u0007\u0017", "", "7mU6a0MS\u0006~\u0006^(\f\u0005,l\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;X4)\u0015dp5\u0004j,<\u0002'E\"", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", "@d_2T;&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\+Ej4s", "7mXA\\(EA(z\bm\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "7mU6a0MS\u0006~\u0006^(\f\u0005,l\u007foO$\u0005th\u0012y", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016}#*\\GEt\u0011\u001a#h`\u0015\u0010g4J\u0006+QU<7\\PH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buE\u000b?p|\u001b\u001a\u0018>4nLc\u0010\u0011f\u0015\u0001A%w.c^y\u001d&\tI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>7?OFs^@\u0004'\fK\u0007w\u000eATq2t\u001b\u000f4(\f", "9dh3e(FS'", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f7", "7mXA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/GZ<7\\PPG\u001d\u0013^\u0010$", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "9dh3e(FS'p~m/j\u00146i\t(", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ\r\u0012\\fsJ\u0010\u001aZ\u001c@/\u001c\bGL+rM7\r\u0013,G_Eq\u0002\u0010\u0018c", ">da6b+BQu\u0003vl", "", "@d_2T;:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\?8r4\f h_\u000f", "7sT?T;B]\"\r", "", "@d_2T;:P ~B2w`S:co", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L&;IR?u=z\u0011va8bl0Vr6KVW\u001agRp\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013}Dl\t\b%\u0012?s:@`\u001dGC\u0002uL)dUAixG\u0017*&\u0011`\u0015^*f>97]o##sZ<\nEO\u001avZuvkQ\"D6.Km%3EzU8\u0004#\u001cR{e\u001d2VJ", "AmP=", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e@i!\u001cXC9A", "2d[.l\u0014BZ \u0003\t", "Aoa6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "2`\\=\\5@@\u0015\u000e~h", "AsX3Y5>a'", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'", "uE5\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D}\u0013Pn\u001bFz$H#{*?x <M\r7t8&\u0011weC\u0010-*X\u0004'\u0011:Y9`[t+\u001f\u0012Xc", "BvT2a", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "1n]CX9M", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "2`c.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&\u007f  IW\u0019u=/\u0015up9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001PkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016W1stJR\u001fK\u0004\u001e??3uF#;\u0003KIAq.n\u0015P\u001dZID1i", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationSpecKt {
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t2) {
        if (t2 == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t2);
    }

    public static /* synthetic */ TweenSpec tween$default(int i2, int i3, Easing easing, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 300;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i2, i3, easing);
    }

    public static final <T> TweenSpec<T> tween(int i2, int i3, Easing easing) {
        return new TweenSpec<>(i2, i3, easing);
    }

    public static /* synthetic */ SpringSpec spring$default(float f2, float f3, Object obj, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = 1500.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            obj = null;
        }
        return spring(f2, f3, obj);
    }

    public static final <T> SpringSpec<T> spring(float f2, float f3, T t2) {
        return new SpringSpec<>(f2, f3, t2);
    }

    public static final <T> KeyframesSpec<T> keyframes(Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, Unit> function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> function1) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(float f2, Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> function1) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f2);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU$default */
    public static /* synthetic */ RepeatableSpec m478repeatable91I0pcU$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, Object obj) {
        if ((4 & i3) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            j2 = StartOffset.m511constructorimpl$default(0, 0, 2, null);
        }
        return m477repeatable91I0pcU(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU */
    public static final <T> RepeatableSpec<T> m477repeatable91I0pcU(int i2, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new RepeatableSpec<>(i2, durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i2, durationBasedAnimationSpec, repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1\u0002\u001ak`V,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&qZ$HNrwK\u0006-9y&^Q94]X@fR5\u0014\u0018LSJ0\u00057\u0016{\u001b}v0S~\u0010\u001d#\u000b~M S\u000e\u0001A<2e\u0004zb\"t\u000f%\no")
    @InterfaceC1492Gx
    public static final /* synthetic */ RepeatableSpec repeatable(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i2, durationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o$default */
    public static /* synthetic */ InfiniteRepeatableSpec m476infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = StartOffset.m511constructorimpl$default(0, 0, 2, null);
        }
        return m475infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j2);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o */
    public static final <T> InfiniteRepeatableSpec<T> m475infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1\u0002\u001ak`V,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&qZ$HNrwK\u0006-9y&^Q9+fNDsGH\u0017KY\u0019T wH\u0003t\u0018tv\"`\f~q+\u0017\n\b$G{Um)4VtKg/.\u000f4v4XO5\u0005!(\u0010M ")
    @InterfaceC1492Gx
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static final <T> SnapSpec<T> snap(int i2) {
        return new SnapSpec<>(i2);
    }

    public static /* synthetic */ SnapSpec snap$default(int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return snap(i2);
    }

    public static final <T> AnimationSpec<T> delayed(AnimationSpec<T> animationSpec, long j2) {
        return new StartDelayAnimationSpec(animationSpec, j2);
    }
}
