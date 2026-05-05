package androidx.compose.animation.core;

import kotlin.Metadata;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\":\u0016\u007f\u0007lrA0RnP.XY2\u000fy{<řc$\bCC٥\"}0\u0010WNmhtϺpŏs\u000f4\u00159u<Mcxu\u0012=3Բs?AO8QGt\r63!b&F\u000f\u001d\u0001H+x\u0014\u0005\u0011[K:\u0013xF~Qj\r{\u001d`\u0012Ni.\u001a6\\\u0016hfLzrR/Q\u0004\u001aF\\=w0+N=JbB%v\u0010:q¨̳4ՖɥR\u0002\u07baV]E M\u0010\u000e\u0011v*?+ww.̯dÿ\u0018\u00153˽]\u007f\u0001,t\u0005\u007fa<+9T{K~\u000ff<Qԏ\u0019ʀ\b\u001a\u000eΩ`03!t\u0010.5z{aB!\u001alB\u0018z\u00107mӢ\fĴ/E#ƘicA#\\?\u001c\u0007\u0013)1\u0003?-i`&`C\u001f+Ȱ]śU@Eʰ\u001f\u0016gJ\u0006\u0004\u001ffXÒ\u0010ΥK\u007f7Ʌa:%3O[g2wȀ\u000eҩHg~ݓ1tayjHn&EݮCҊ\r\fbե5'yalXZ\u0012} b\f\u0016\bA!\u0013<ze{ĲZћls\u0003Oc\u001c37\u00079_\u0002y\u0010æ9g;5W\u0003\u0018dXκ0m;О\tw"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1?sD%\u0011weC\u00109", "", "4h]._\u0017Ha\u001d\u000e~h5", "", "uE\u0018#", "2`\\=X+\u001f`\u0019\u000b", "", "D`[BX", "2`\\=\\5@@\u0015\u000e~h", "5dc\u0011T4IW\"\u0001gZ;\u0001\u0013", "u(5", "Adc\u0011T4IW\"\u0001gZ;\u0001\u0013", "5dc\u0013\\5:Z\u0004\t\tb;\u0001\u00138", "Adc\u0013\\5:Z\u0004\t\tb;\u0001\u00138", "5`\\:T\u0014B\\)\r", "5`\\:T\u0017Ec'", "7mXA\\(EW.~y", "", "<`cBe(E4&~\u0007", "AsX3Y5>a'", "5dc g0?T\"~\tl", "Adc g0?T\"~\tl", "5dc\u000eV*>Z\u0019\fvm0\u0007\u0012", ":`bA70L^ zx^4|\u0012>", ":`bAI,E]\u0017\u0003\nr", "7mXA", "", "CoS.g,/O \u000fzl", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bA|\u001a8V\u0019", "Bh\\283:^'~y", "", "CoS.g,/O \u000fzls`m$e~7J~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "uE5\u0017\u001c\u0011", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpringSimulation {
    public static final int $stable = 8;
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f2) {
        this.finalPosition = f2;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final void setFinalPosition(float f2) {
        this.finalPosition = f2;
    }

    public final void setStiffness(float f2) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f2);
        this.initialized = false;
    }

    public final float getStiffness() {
        double d2 = this.naturalFreq;
        return (float) (d2 * d2);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final void setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f2;
        this.initialized = false;
    }

    public final float getAcceleration(float f2, float f3) {
        float f4 = f2 - this.finalPosition;
        double d2 = this.naturalFreq;
        return (float) (((-(d2 * d2)) * ((double) f4)) - (((d2 * 2.0d) * ((double) this.dampingRatio)) * ((double) f3)));
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f2 = this.dampingRatio;
        double d2 = ((double) f2) * ((double) f2);
        if (f2 > 1.0f) {
            double d3 = -f2;
            double d4 = this.naturalFreq;
            double d5 = d2 - ((double) 1);
            this.gammaPlus = (d3 * d4) + (d4 * Math.sqrt(d5));
            double d6 = -this.dampingRatio;
            double d7 = this.naturalFreq;
            this.gammaMinus = (d6 * d7) - (d7 * Math.sqrt(d5));
        } else if (f2 >= 0.0f && f2 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(((double) 1) - d2);
        }
        this.initialized = true;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m507updateValuesIJZedt4$animation_core_release(float f2, float f3, long j2) {
        double dExp;
        double dCos;
        init();
        float f4 = f2 - this.finalPosition;
        double d2 = j2 / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d3 = f4;
            double d4 = this.gammaMinus;
            double d5 = f3;
            double d6 = this.gammaPlus;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            dExp = (Math.exp(d4 * d2) * d7) + (Math.exp(this.gammaPlus * d2) * d8);
            double d9 = this.gammaMinus;
            double dExp2 = d7 * d9 * Math.exp(d9 * d2);
            double d10 = this.gammaPlus;
            dCos = dExp2 + (d8 * d10 * Math.exp(d10 * d2));
        } else if (f5 == 1.0f) {
            double d11 = this.naturalFreq;
            double d12 = f4;
            double d13 = ((double) f3) + (d11 * d12);
            double d14 = d12 + (d13 * d2);
            dExp = Math.exp((-d11) * d2) * d14;
            double dExp3 = d14 * Math.exp((-this.naturalFreq) * d2);
            double d15 = this.naturalFreq;
            dCos = (dExp3 * (-d15)) + (d13 * Math.exp((-d15) * d2));
        } else {
            double d16 = ((double) 1) / this.dampedFreq;
            double d17 = this.naturalFreq;
            double d18 = f4;
            double d19 = d16 * ((((double) f5) * d17 * d18) + ((double) f3));
            dExp = Math.exp(((double) (-f5)) * d17 * d2) * ((Math.cos(this.dampedFreq * d2) * d18) + (Math.sin(this.dampedFreq * d2) * d19));
            double d20 = this.naturalFreq;
            float f6 = this.dampingRatio;
            double d21 = (-d20) * dExp * ((double) f6);
            double dExp4 = Math.exp(((double) (-f6)) * d20 * d2);
            double d22 = this.dampedFreq;
            double dSin = (-d22) * d18 * Math.sin(d22 * d2);
            double d23 = this.dampedFreq;
            dCos = d21 + (dExp4 * (dSin + (d19 * d23 * Math.cos(d23 * d2))));
        }
        return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
