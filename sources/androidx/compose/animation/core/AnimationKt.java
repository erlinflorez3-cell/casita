package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,p\bDJc|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007toA0ZeP\u008cZS@\u000fs{:%c$\bCCU }*\teNog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HrW][tUEpvF\u0005N92:\n\u0005/\"XN@z\tLc\f@:ptH]%M3!B\fD \u000f*tg|=`LkGG/\u0013kRNmn@~]\r\rdU\u001b\u0017c$ѨNFU\u001b+R\u0011\u0017z[m\u0014o{K\u000e\u0001-7-Ys\u001eE\u0007\u0012D%9b%i\u0003(l\u0005\u0018o\u001c);O*[~\"X{\t\u0007%<J\u001d6+VCE\u001a-\u0017>7\u0003~k@\u0017\u0011ެF\u007f\twNZ3\u0017K7I\u001dvQ(K)PG{K\u001dL1!t'żb\u001e\t\u0015Ie WASP=\u000f^8qmq\u0012{z\u0002p\u0014`K\u000eD\u0014\u0011t'U;iE;!2\u0012\u000fIϼz\u0005n\u0002k\u001b`bX\"5%W,\u000fȱhS\u0005\u000bqObhT\u0011{-|\u0013\u000e\n# #\u0007L#5\u0010\u0015_\u0017k\u001bQk%=/\u00156֍rk\u001csYjA̐ic>`)Ιf͖@b\r֚\u0007Na\fr\\V!\tʌ=ݻ{{L\u0088,1@@\n\u001cb+Y!l\u0015N\u0004.BG}7a\u0011'fиVտ(\u0007\u0002&z\f\u000fTʽt\r"}, d2 = {"\u001bh[9\\:-]\u0002z\u0004h:", "", "!dR<a+LB#f~e3\u0001\u0017", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=sXM", "\u0012dR.l\bGW!z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "\"`a4X;\u001bO'~y:5\u0001\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000f3z\u0018.\\ 7y4\u001dpqeA\u0003r0X\u007f|", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "B`a4X;/O \u000fz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f h_\u000fm_5M\u00041KKauZ\\zH\u001e ZWJ4\u0011\rUP(xM\u0001\u001d\u00129IK*z\u000b}\u0012\"\u0013tySV\u001dVy\"K(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=.\u001evI \btWOG9?9y'\u001dZQ;x.as8~1\u0003Gs4n\rVq&>(t\u001e0d=6*@E\\=Upu6-\nu!a\u0017j^C1\u0018AngP\u000b\u0016a!d\u000b", "1qT.g,\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001\u001b\u00110Q}Jl\u000b\u0015_\f?wp\f2\u0019K\u0002\u0011\u0005E3q7Y]\tQN\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>77OIwQKx1(<{u!<eJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&=0*>8\"CUl?jH\u001bhh=\u0011\u0012j1@\u001donTH\r\u0016g$1xH[\n6_\u0010BH\u0003^%P\u0007Me\b\u0015R\u0003-qmER\u001f^\ncnN/_Zq~s\u001a\u001c=r9g\u000fg\u0006h;U\u000f\u0018lB\u0015Q", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", ">kPFG0FS\u0002z\u0004h:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=sy,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    public static final long getDurationMillis(Animation<?, ?> animation) {
        return animation.getDurationNanos() / MillisToNanos;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j2) {
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j2));
    }

    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v2, V v3, V v4) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new Function1<V, V>() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // kotlin.jvm.functions.Function1
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }, new Function1<V, V>() { // from class: androidx.compose.animation.core.AnimationKt.createAnimation.2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // kotlin.jvm.functions.Function1
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }), v2, v3, v4);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, T t3, T t4) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t2, t3, twoWayConverter.getConvertToVector().invoke(t4));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f3 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f2, f3);
    }

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f2, float f3) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3));
    }
}
