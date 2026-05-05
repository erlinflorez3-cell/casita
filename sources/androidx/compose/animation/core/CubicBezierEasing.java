package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
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
/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4G\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B$c$wCCU(\n*\tUNml\u0005Ϻ\u000b\u000bq\u000eF9\tn:Imx\f\u0013\u001f6PqW3{pM=nwN\u0005N32<\b\t\u0019\u001aXIǘzzQPT#>H\t:\u0001\u0016}\u000b(\u001c\u001e@6\u007fLg.߅6\u0011rkFG#1v\tbom>\u000be\rtcW\u0011\u0005q6+n8{\u0015mY\u0011\u0018j[m\u0015\u0006\u0006\u0006\u0013v:?+wt\b:f\u0010,\u0015YPSqC2j\u0005i`:(\u0002ՕeׂT\u000e0»K\b\u001b>\u001c\u000e4(\u001f͖/բj\b\u0016ޗE~aCh\u0002\rCVаcي\u001b%\bđ{E)jiai\u001a%ќ}˿\u0011\u001e+Ч?-iZ&`C\u001c+ȰSśU@Eʰ\u001f\u0016gD\u0006\u0004\u001fcXÒ\u0006ΥK\u007f7Ʌ¦2+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Gj\u001a,*CPo4+tdo=\u0010e\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, "uE5\u00139o/", ";`g", ";h]", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "Bga<j\u0015HA#\u0006\u000bm0\u0007\u0012", "", "4qP0g0H\\", "BnBAe0GU", "", "BqP;f-H`!", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f95a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f96b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f97c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f98d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        this.f95a = f2;
        this.f96b = f3;
        this.f97c = f4;
        this.f98d = f5;
        if (!((Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '.');
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f3, f5, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) ((jComputeCubicVerticalBounds + 4294967295L) - (jComputeCubicVerticalBounds | 4294967295L)));
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return f2;
        }
        float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - f2, this.f95a - f2, this.f97c - f2, 1.0f - f2);
        if (Float.isNaN(fFindFirstCubicRoot)) {
            throwNoSolution(f2);
        }
        float fEvaluateCubic = BezierKt.evaluateCubic(this.f96b, this.f98d, fFindFirstCubicRoot);
        float f3 = this.min;
        float f4 = this.max;
        if (fEvaluateCubic < f3) {
            fEvaluateCubic = f3;
        }
        return fEvaluateCubic > f4 ? f4 : fEvaluateCubic;
    }

    private final void throwNoSolution(float f2) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f95a + ", " + this.f96b + ", " + this.f97c + ", " + this.f98d + ") has no solution at " + f2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            if (this.f95a == cubicBezierEasing.f95a && this.f96b == cubicBezierEasing.f96b && this.f97c == cubicBezierEasing.f97c && this.f98d == cubicBezierEasing.f98d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f95a) * 31) + Float.hashCode(this.f96b)) * 31) + Float.hashCode(this.f97c)) * 31) + Float.hashCode(this.f98d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f95a + ", b=" + this.f96b + ", c=" + this.f97c + ", d=" + this.f98d + ')';
    }
}
