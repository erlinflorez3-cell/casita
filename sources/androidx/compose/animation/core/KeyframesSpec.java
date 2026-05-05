package androidx.compose.animation.core;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:%a)\bّcW Ԃ0\b\u007fTwi~J!\nq\u000f>\u0016\u0005wlZe\u0003k\u0013'8RqO3\u0004ڎk;žx6\u0013#zLF\u007f\u001d\u0007*,X\u0010=\u0003qR,\u00186?~Bz\r{\u000eJ\"\u0014H8\r.^wNlԟ|_J/i\u000b\u0018M\u0015;0E\u000bN%Ld)\u001dv\u0018ӜYB˝9\u001b-م\u001b\tX_M\bӳuK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f7", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/GZ<7\\PPG\u001d\u0013^\u0010$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001dm*/Z?CkB\f h_wlc@O\u0004#OL\\\u001agRp\u001b\u001e\u001b[\u0012P\u0001Pu", "5dc\u0010b5?W\u001b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001S\u0016BNP7s4,\u0003sa7EI,bw4CTN:J]r;q\u001cc\u000fR-b", "DdRAb9Bh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u0004\u0015|bF\u0003k,\\d2GJ$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "\u0019dh3e(FSx\b\nb;\u0011", "\u0019dh3e(FS'l\u0006^*Z\u00138f\u0004*", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4G\u0007\":\u0018\u007f\u0007lkA0RjP.XT2\u000f\u0002{<$a%yCIU\"Ԃ*\teNo˧tOpŏk\u0011\f\u0015\u0007i\\[ezm\u0012U1RwO9]qM9'sd\u0006N2b;ѩ\t\u0001(,\u0011+\u0005}[Q\u001c\u0014@@'9\u0001\u000e}\t(\u0016\u001e>V\u007fdjʄR8Nqk@wC\u0011pZT7a@|\u0004\ftUO\r-`N1F6C\u001d=S1\u0010\u0019ÐAƄCqK\u000f1G56ayg8h\u007fJ\u0014YP5])%\r\u000bW_\u001a3CO\u0012X\u0017˂*Þ~{\u001bJL7\u00146`4=\u001cv\bD2#s{F`\u0004nB6y\u00107G)\u000eCC9Iw\u0018ĭ=уMљ߉\t\u000f$5\u000f\u0002itb\"x\u0015Ii WASP=~M8Zmq\u0012\u0007z\u0002X\u001bvϢ\u0002߿{\u00166\u001a+ڽwg\"ݒo\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/GZ<7\\PPG\u001d\u0013^\u0010$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f>5\u0015c\nX\u007f(KN$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/G,W;`a\u0007\u0013", "u(E", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016", "D`[BX", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016ma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wIL?s0-\u0019rj\u0003\u0005m9N@\rG`O9XZrK\u0002\u001dZ\f\r\u0011\r\u0019ZN vD\u0017(\u00170X\u0016\u0011", "/s", "Bh\\2F;:[$", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017?Do<\u001a$lkBPa6[vp-Lb-iNz=\"\u007fe\u000eLir\u0005mB1jL7~\u0011;M\u0011O>", "/s5?T*MW#\b", "4qP0g0H\\", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017?Do<\u001a$lkBPa6[vp-Lb-iNz=\"\u007fe\u000eLir\u0005mB1jL7~\u0011;M\u0011O>", "CrX;Z", "/qR\u001ab+>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk}8LC\u0011", "CrX;ZsGU.a\u000br\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001dm*/Z?CkB\f h_wlc@O\u0004#OL.5kV\u0002Qiu\u001etJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2|\u0015\u001a\u00161ytL_YE\u0004\"u\u000b\u000fhZZluOASP5d\n\u001e\u0003\\N;1\u0010y\u0019zq_2\u0019\u0010)", "Ehc5", "", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core_release(T t2) {
            return new KeyframeEntity<>(t2, null, 0, 6, null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> at(T t2, int i2) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t2, null, 0, 6, null);
            getKeyframes$animation_core_release().set(i2, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> atFraction(T t2, float f2) {
            return at((Object) t2, Math.round(getDurationMillis() * f2));
        }

        @Deprecated(message = "\u0018Y\u0001t\by'jaV6:d\u001d-b\u001c^\u000e;\u001az\u001ae6G|*W\u00037ziZgG\rknxZ&8y\u0017d`\u00036q\bNt}=&KJ\u0015RZx9A\u0005\u0011<L/P\u0002;f0G\u000b\\\u0018D\r\u00019-JY\u0002<`!.}5~.H\u00158\u0012h", replaceWith = @ReplaceWith(expression = "this using easing", imports = {}))
        @InterfaceC1492Gx
        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }

        /* JADX INFO: renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m494usingngzHuyU(KeyframeEntity<T> keyframeEntity, int i2) {
            keyframeEntity.m493setArcModeRur9ykg$animation_core_release(i2);
            return keyframeEntity;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedKeyframesSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> r20) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.KeyframesSpec.vectorize(androidx.compose.animation.core.TwoWayConverter):androidx.compose.animation.core.VectorizedKeyframesSpec");
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?5LeV7Zݷ2\u000fyڔ<řc$\u007fIC٥ \u00038ޛwPmf|I\u000b\u0011S\u0011\u0016\u0016?iZI\u0016\u001ac܈\u001f6PpW3\u0004nM?ftD\u000782P;\n\u000b\u0007\u001a8L(v)Hƚ\u0010\u0012>F9K`\u0019e\u0005H\u001f6D.\u000f6^}MdW3Ү:w)\u0011yZNUpv\u0011\u001e-TX?\r%ftѩL̳4ՖɥR\u0002\u07baViG\u0003M|U\u0007n.53iu]?f\nϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/G,W;`a\u0007\u0013", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;H0,\u0015HjH\u000br@$", "D`[BX", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "/qR\u001ab+>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk}8LC\u0011", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018V#UPW.26YC\u001e!a\u0012Wt\u0012\u0016a\u000b(wS7,\u0011(PK\u001ah\u0002\b&\u0015DHzKd\u001fT\n\u0013\u0005K6PBfeyT\u0017\tS", "5dc\u000ee*&]\u0018~B&\u007fkP\u0017qNfwI\u0005\u001f\u0013Vs\u0018Ep#?f}\u001aDm\u001d.IQ;", "u(8", "Adc\u000ee*&]\u0018~BK<\n\\Ck\u0002fwI\u0005\u001f\u0013Vs\u0018Ep#?f}\u001aDm\u001d.IQ;", "uH\u0018#", "\u0017", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, easing, i2);
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? EasingKt.getLinearEasing() : easing, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? ArcMode.Companion.m489getArcLinear9TMq4() : i2, null);
        }

        /* JADX INFO: renamed from: getArcMode--9T-Mq4$animation_core_release, reason: not valid java name */
        public final int m492getArcMode9TMq4$animation_core_release() {
            return this.arcMode;
        }

        /* JADX INFO: renamed from: setArcMode-Rur9ykg$animation_core_release, reason: not valid java name */
        public final void m493setArcModeRur9ykg$animation_core_release(int i2) {
            this.arcMode = i2;
        }

        private KeyframeEntity(T t2, Easing easing, int i2) {
            super(t2, easing, null);
            this.arcMode = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return Intrinsics.areEqual(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && Intrinsics.areEqual(keyframeEntity.getEasing$animation_core_release(), getEasing$animation_core_release()) && ArcMode.m483equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + ArcMode.m484hashCodeimpl(this.arcMode)) * 31) + getEasing$animation_core_release().hashCode();
        }
    }
}
