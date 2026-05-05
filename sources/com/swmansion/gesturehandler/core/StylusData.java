package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4R\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS@\u000fsڔ<$i0yCAU ԉ(\u001fѧl\u0004\u0018nxYCB+FK\tp2Icxu\u0012=3RuE3[qU9\u000fuF\u000b&20;\u0012\u0005/\u001b:N\u0016v\tGc\f@1Pv@R\u001bR\u001d\u001a@\u0007̧$\u0001,b0UDU\u0005]h0iʌj\u000bU5mH|{\u000e\rĝ(U}o-C@e6[ȳTK\u000e`kW\u0003mr\u0004ޢio.9Z\fWdYFг\u0016s\t\u001bo\u000b&\u000bӤ\u0002f\u0012'9O{K~\u000fX}\u0001{\u001b>\u001c\u000e4(x43\u001at\u000b&3#s\u0004FV\u0002lF\u0018z\u00107G+\u000639>3f\u007fb\u0002БM\u007f\r\u0013 6#/\u0003Qab#x\u00171S&PwӜA\u0006O\\ q=\u001c\u001b7ľ\u0001r\b>_\u0018/**v\u001e3Qs9Q<2ʌG\u0015v\u0005\bxh\u0002jʐLF*Â.90\u0010\u001ab\u0015s\u0013ohT\u0007-ҭQ\"\\͵\u0016\n\u0019)j\u007f\r03\u0015fO\u0017jҷQc\u0012ɘGh=c|s^fG^K5\u007fdߧeX~ܝW>h\u0010fn\u0013b\u001a\\t(P3ʮn\u0016\u007fӻ\\P\u0012\u001f@Gۍ Q"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[%BTSIJ0-\u0011>", "", "Bh[AK", "", "Bh[AL", "/kc6g<=St\b|e,", "/yX:h;A/\"\u0001\u0002^", ">qT@f<KS", "uC3\u00117\u000b\u0002D", "5dc\u000e_;Bb)}z:5~\u0010/", "u(3", "5dc\u000em0Fc(\u0002Vg.\u0004\t", "5dc\u001de,La)\fz", "5dc!\\3MF", "5dc!\\3MG", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnA2T+:P ~bZ7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class StylusData {
    public static final Companion Companion = new Companion(null);
    private final double altitudeAngle;
    private final double azimuthAngle;
    private final double pressure;
    private final double tiltX;
    private final double tiltY;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeV2ZS0\u0010qڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7Vh\f[\u000f4\u0018)n:Lmx\f\u0016WTPtW?]qM9\u000f{F\u000702P?(\u000b1\u001e8P(v)J{\u0010 9XphYSMő\u001e\u001c"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[%BTSIJ0-\u0011'?C\u000fn(Wz1P\"", "", "u(E", "4q^:8=>\\(", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[%BTSIJ0-\u0011>", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "AoW2e0<O K\nb3\f", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "/kc6g<=St\b|e,", "/yX:h;A/\"\u0001\u0002^", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<Double, Double> spherical2tilt(double d2, double d3) {
            double dAtan;
            double dAtan2;
            if (d2 < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d4 = (d3 < 1.0E-9d || Math.abs(d3 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d5 = d3 - 1.5707963267948966d;
                double d6 = Math.abs(d5) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d7 = d3 - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d7) < 1.0E-9d) {
                    d4 = -1.5707963267948966d;
                }
                double d8 = d3 - 4.71238898038469d;
                if (Math.abs(d8) < 1.0E-9d) {
                    d6 = -1.5707963267948966d;
                }
                if (d3 > 1.0E-9d && Math.abs(d5) < 1.0E-9d) {
                    d6 = 1.5707963267948966d;
                    d4 = 1.5707963267948966d;
                }
                if (Math.abs(d5) > 1.0E-9d && Math.abs(d7) < 1.0E-9d) {
                    d6 = 1.5707963267948966d;
                    d4 = -1.5707963267948966d;
                }
                if (Math.abs(d7) > 1.0E-9d && Math.abs(d8) < 1.0E-9d) {
                    d6 = -1.5707963267948966d;
                    d4 = -1.5707963267948966d;
                }
                if (Math.abs(d8) <= 1.0E-9d || Math.abs(d3 - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d6;
                    dAtan = d4;
                }
            } else {
                double dTan = Math.tan(d2);
                dAtan = Math.atan(Math.cos(d3) / dTan);
                dAtan2 = Math.atan(Math.sin(d3) / dTan);
            }
            return new Pair<>(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }

        public final StylusData fromEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
            double pressure = event.getPressure(0);
            double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            Pair<Double, Double> pairSpherical2tilt = spherical2tilt(axisValue, orientation);
            return new StylusData(pairSpherical2tilt.getFirst().doubleValue(), pairSpherical2tilt.getSecond().doubleValue(), axisValue, orientation, pressure);
        }
    }

    public StylusData() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public StylusData(double d2, double d3, double d4, double d5, double d6) {
        this.tiltX = d2;
        this.tiltY = d3;
        this.altitudeAngle = d4;
        this.azimuthAngle = d5;
        this.pressure = d6;
    }

    public /* synthetic */ StylusData(double d2, double d3, double d4, double d5, double d6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? 0.0d : d2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.0d : d3, (i2 & 4) != 0 ? 0.0d : d4, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? d5 : 0.0d, (i2 & 16) != 0 ? -1.0d : d6);
    }

    public static /* synthetic */ StylusData copy$default(StylusData stylusData, double d2, double d3, double d4, double d5, double d6, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            d2 = stylusData.tiltX;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            d3 = stylusData.tiltY;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            d4 = stylusData.altitudeAngle;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            d5 = stylusData.azimuthAngle;
        }
        if ((i2 & 16) != 0) {
            d6 = stylusData.pressure;
        }
        return stylusData.copy(d2, d3, d4, d5, d6);
    }

    public final double component1() {
        return this.tiltX;
    }

    public final double component2() {
        return this.tiltY;
    }

    public final double component3() {
        return this.altitudeAngle;
    }

    public final double component4() {
        return this.azimuthAngle;
    }

    public final double component5() {
        return this.pressure;
    }

    public final StylusData copy(double d2, double d3, double d4, double d5, double d6) {
        return new StylusData(d2, d3, d4, d5, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusData)) {
            return false;
        }
        StylusData stylusData = (StylusData) obj;
        return Double.compare(this.tiltX, stylusData.tiltX) == 0 && Double.compare(this.tiltY, stylusData.tiltY) == 0 && Double.compare(this.altitudeAngle, stylusData.altitudeAngle) == 0 && Double.compare(this.azimuthAngle, stylusData.azimuthAngle) == 0 && Double.compare(this.pressure, stylusData.pressure) == 0;
    }

    public final double getAltitudeAngle() {
        return this.altitudeAngle;
    }

    public final double getAzimuthAngle() {
        return this.azimuthAngle;
    }

    public final double getPressure() {
        return this.pressure;
    }

    public final double getTiltX() {
        return this.tiltX;
    }

    public final double getTiltY() {
        return this.tiltY;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.tiltX) * 31) + Double.hashCode(this.tiltY)) * 31) + Double.hashCode(this.altitudeAngle)) * 31) + Double.hashCode(this.azimuthAngle)) * 31) + Double.hashCode(this.pressure);
    }

    public final ReadableMap toReadableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.tiltX);
        writableMapCreateMap.putDouble("tiltY", this.tiltY);
        writableMapCreateMap.putDouble("altitudeAngle", this.altitudeAngle);
        writableMapCreateMap.putDouble("azimuthAngle", this.azimuthAngle);
        writableMapCreateMap.putDouble("pressure", this.pressure);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public String toString() {
        return "StylusData(tiltX=" + this.tiltX + ", tiltY=" + this.tiltY + ", altitudeAngle=" + this.altitudeAngle + ", azimuthAngle=" + this.azimuthAngle + ", pressure=" + this.pressure + ")";
    }
}
