package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjO0L͜P.`W2\u000fq|<$i-yCAW\"}0\u0010WNmovJh\u000bK\u000f\f\u001d~̓Bկs\u001c\u000e\u0012=1zobW\u000ezM=ntN\u0005N3ŕ<y\u0013\u0003b8V+\u000fzqg<\u0016>]\t:\u0001\u0015\u0014\u0005b \u0014\\8\u0001Ld\u0018RDg\u0005]h5i\u00032P\\Gw0+i=Jb'%v\u0010\u001fqT\u007fC#Fk\u00035n\fC\u0011a\n=3ym;{U\u0002ZNX.\u0018kۃ[ոar.ؘU]n\u0011?+}i\"ַ\u0010߭{z\u0004Ȟ\r\u0010\u001c\r?H\\5pǔ\u0014ԧ7tzԟ\u0011\\\u0010gZ\u007f)i\rА1ő7+Aӕ7]oE1Ne\u0004[ٿ*ţ\u0005n)ż% n 3T&]g\u0012\u0017׃Jݳ\u000e]Uo\n{p\u000fz\u0016>U\u0018/*\u001ddW{ڞ]ޠ'%\u0004\u0004NRu\u0004Ulvb\u0002RvDxÅ\"֖.\t\u0014ɮ\u0015p\u0013{hT\u0007=g۶(Τ\u000b}\u0010ʶph\u0006N9%>V&řuҷQ]\u0012ɘ\u007frEl\u0007k<c\u0010ӗ?̳Uc\u0018Р#\u0003\"STb3`=̾_۱^\\0ί\u0003Tx%\u0010{rVbƑ>Ɛu\u001c<ι\u0002%j+`\u0003LJ\u0018Ҕ\u0015ރ^h\u0018з%?2\u001a\u0002$#\u0015Wˉhʼsg\u0001̢|\tn:EA\u007f=oĢaɋl4\u0005ȽW\u000b\u0002\u0019_gzO#́\"\u0091Y{(چjE_IU\u0013=\u0007\u007fɈ\u000eβILzόˡQ7"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0013@f\u0002)9I\u001f2U?Jo>'j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFq 7,P?|4+j", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "1ta?X5M:#\t\u0006", "", "1ta?X5MA(z\n^", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0013@f\u0002)9I\u001f2U?Jo>'SSdM\u0015g*\\d6C[N\u0002", "2hb=_(<S!~\u0004m\r\n\u00137R\u007f6\u000b/\u0004$\u0017Ur\u0018Cu", "", "3mS#T3NS", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "7r0AE,Lb", "", "u(I", "7r>CX9LV#\t\nb5~", "7sT?T;B]\"\r", ":`bAG0FS", "", "=qX4\\5:Z\nz\u0002n,", "=uT?f/H](\\\u0002Z4\b\r8g_1w=\b\u0017\u0016", "@dbAF7>S\u0018m}k,\u000b\f9l~", "Aoa6a.\u001dO!\n~g.", "Aoa6a.&O'\r", "Aoa6a.,b\u0015\f\n^+", "Aoa6a.,b\u001d\u007f{g,\u000b\u0017", "AsP?g\u001d:Z)~", "Bh\\24*<c!\u000f\u0002Z;\u0007\u0016", "/ce.a*>", "", "@dP97,Eb\u0015m~f,", "5dc\u0011\\:IZ\u0015|zf,\u0006\u0018\u000ei\u000e7wI~\u0017wQ|{Kr45", "AsPAX", "@db2g\nH\\\u001a\u0003|", "@t]\u000ea0FO(\u0003\u0005g\u001a\f\t:", "4qP:X\u001bB[\u0019gvg6\u000b", "\u0011n\\=T5B]\"", "\u001egh@\\*LA(z\n^", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SpringAnimation extends AnimationDriver {
    public static final Companion Companion = new Companion(null);
    private static final double MAX_DELTA_TIME_SEC = 0.064d;
    private int currentLoop;
    private final PhysicsState currentState;
    private double displacementFromRestThreshold;
    private double endValue;
    private double initialVelocity;
    private int iterations;
    private long lastTime;
    private double originalValue;
    private boolean overshootClampingEnabled;
    private double restSpeedThreshold;
    private double springDamping;
    private double springMass;
    private boolean springStarted;
    private double springStiffness;
    private double startValue;
    private double timeAccumulator;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0013@f\u0002)9I\u001f2U?Jo>'SFkA\u0012_5R\u00010\u001d", "", "u(E", "\u001b@G,7\f%BtxiB\u0014\\\u0003\u001dE]", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4L\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ŝa:ڎs;\u0004\u0019>9\u0019UTgunbZ9D\u001f\f\u001cxx.aU'^ܫ\u00132Pr\b:[yU9\u000fu|ԓ!z)F\u0005\u001d\u0001H+\u000fǼwC^Y\u0018*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\4w0+[=Lb6%xw\u001dY?}¤\u0016mZ\u0011\u0017j[m\u0014\u0006ғ<Mo59CI\"j|ް~d-9O%]!'3ӫ]ԃ\u001033Ւ{MV\u00126|\u001b}\u0013B\u0012\u0015V?V0E\u001a\u0015\tdޞ\u0001ɤWLX\u061cvD\u0006\u0003o;7'\u0006<9@Ӿje"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0013@f\u0002)9I\u001f2U?Jo>'SSdM\u0015g*\\d6C[N\u0002", "", ">nb6g0H\\", "", "Dd[<V0Mg", "uC3uI", "5dc\u001db:Bb\u001d\t\u0004", "u(3", "Adc\u001db:Bb\u001d\t\u0004", "uC\u0018#", "5dc#X3HQ\u001d\u000e\u000f", "Adc#X3HQ\u001d\u000e\u000f", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class PhysicsState {
        private double position;
        private double velocity;

        public PhysicsState() {
            this(0.0d, 0.0d, 3, null);
        }

        public PhysicsState(double d2, double d3) {
            this.position = d2;
            this.velocity = d3;
        }

        public /* synthetic */ PhysicsState(double d2, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 0.0d : d2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.0d : d3);
        }

        public static /* synthetic */ PhysicsState copy$default(PhysicsState physicsState, double d2, double d3, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                d2 = physicsState.position;
            }
            if ((i2 & 2) != 0) {
                d3 = physicsState.velocity;
            }
            return physicsState.copy(d2, d3);
        }

        public final double component1() {
            return this.position;
        }

        public final double component2() {
            return this.velocity;
        }

        public final PhysicsState copy(double d2, double d3) {
            return new PhysicsState(d2, d3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhysicsState)) {
                return false;
            }
            PhysicsState physicsState = (PhysicsState) obj;
            return Double.compare(this.position, physicsState.position) == 0 && Double.compare(this.velocity, physicsState.velocity) == 0;
        }

        public final double getPosition() {
            return this.position;
        }

        public final double getVelocity() {
            return this.velocity;
        }

        public int hashCode() {
            return (Double.hashCode(this.position) * 31) + Double.hashCode(this.velocity);
        }

        public final void setPosition(double d2) {
            this.position = d2;
        }

        public final void setVelocity(double d2) {
            this.velocity = d2;
        }

        public String toString() {
            return "PhysicsState(position=" + this.position + ", velocity=" + this.velocity + ")";
        }
    }

    public SpringAnimation(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        PhysicsState physicsState = new PhysicsState(0.0d, 0.0d, 3, null);
        this.currentState = physicsState;
        physicsState.setVelocity(config.getDouble("initialVelocity"));
        resetConfig(config);
    }

    private final void advance(double d2) {
        double dSin;
        double dSin2;
        if (isAtRest()) {
            return;
        }
        double d3 = MAX_DELTA_TIME_SEC;
        if (d2 <= MAX_DELTA_TIME_SEC) {
            d3 = d2;
        }
        this.timeAccumulator += d3;
        double d4 = this.springDamping;
        double d5 = this.springMass;
        double d6 = this.springStiffness;
        double d7 = -this.initialVelocity;
        double dSqrt = d4 / (((double) 2) * Math.sqrt(d6 * d5));
        double dSqrt2 = Math.sqrt(d6 / d5);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d8 = this.endValue - this.startValue;
        double d9 = this.timeAccumulator;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d9);
            double d10 = dSqrt * dSqrt2;
            double d11 = d7 + (d10 * d8);
            double d12 = d9 * dSqrt3;
            dSin = this.endValue - ((((d11 / dSqrt3) * Math.sin(d12)) + (Math.cos(d12) * d8)) * dExp);
            dSin2 = ((d10 * dExp) * (((Math.sin(d12) * d11) / dSqrt3) + (Math.cos(d12) * d8))) - (((Math.cos(d12) * d11) - ((dSqrt3 * d8) * Math.sin(d12))) * dExp);
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d9);
            dSin = this.endValue - (((((dSqrt2 * d8) + d7) * d9) + d8) * dExp2);
            dSin2 = dExp2 * ((d7 * ((d9 * dSqrt2) - ((double) 1))) + (d9 * d8 * dSqrt2 * dSqrt2));
        }
        this.currentState.setPosition(dSin);
        this.currentState.setVelocity(dSin2);
        if (isAtRest() || (this.overshootClampingEnabled && isOvershooting())) {
            if (this.springStiffness > 0.0d) {
                double d13 = this.endValue;
                this.startValue = d13;
                this.currentState.setPosition(d13);
            } else {
                double position = this.currentState.getPosition();
                this.endValue = position;
                this.startValue = position;
            }
            this.currentState.setVelocity(0.0d);
        }
    }

    private final double getDisplacementDistanceForState(PhysicsState physicsState) {
        return Math.abs(this.endValue - physicsState.getPosition());
    }

    private final boolean isAtRest() {
        return Math.abs(this.currentState.getVelocity()) <= this.restSpeedThreshold && (getDisplacementDistanceForState(this.currentState) <= this.displacementFromRestThreshold || this.springStiffness == 0.0d);
    }

    private final boolean isOvershooting() {
        return this.springStiffness > 0.0d && ((this.startValue < this.endValue && this.currentState.getPosition() > this.endValue) || (this.startValue > this.endValue && this.currentState.getPosition() < this.endValue));
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.springStiffness = config.getDouble("stiffness");
        this.springDamping = config.getDouble("damping");
        this.springMass = config.getDouble("mass");
        this.initialVelocity = this.currentState.getVelocity();
        this.endValue = config.getDouble("toValue");
        this.restSpeedThreshold = config.getDouble("restSpeedThreshold");
        this.displacementFromRestThreshold = config.getDouble("restDisplacementThreshold");
        this.overshootClampingEnabled = config.getBoolean("overshootClamping");
        int i2 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i2;
        this.hasFinished = i2 == 0;
        this.currentLoop = 0;
        this.timeAccumulator = 0.0d;
        this.springStarted = false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j2) {
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null".toString());
        }
        long j3 = j2 / ((long) 1000000);
        if (!this.springStarted) {
            if (this.currentLoop == 0) {
                this.originalValue = valueAnimatedNode.nodeValue;
                this.currentLoop = 1;
            }
            this.currentState.setPosition(valueAnimatedNode.nodeValue);
            this.startValue = this.currentState.getPosition();
            this.lastTime = j3;
            this.timeAccumulator = 0.0d;
            this.springStarted = true;
        }
        advance((j3 - this.lastTime) / 1000.0d);
        this.lastTime = j3;
        valueAnimatedNode.nodeValue = this.currentState.getPosition();
        if (isAtRest()) {
            int i2 = this.iterations;
            if (i2 != -1 && this.currentLoop >= i2) {
                this.hasFinished = true;
                return;
            }
            this.springStarted = false;
            valueAnimatedNode.nodeValue = this.originalValue;
            this.currentLoop++;
        }
    }
}
