package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0005ӬBߚ\u0016\r\u0017jg/|dNnaY?\u001fq\u000242[<qq<ڈ\u001e}0\u000b\u0018\\uk\u0007J\t\fs\u0013\u0014\u001b\u0011jZJ\u001c\r.\u001e\u001d5Zom4$ڑ?˃dt>ӌڼ6)"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2O=\u000fn3Nd2TPW.@[\u0002=!\u001dd\u0015J:\u0017\u0012/", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `+x\u001d<\u00040?`y/Azk", "Aoa6a.\u001dO!\n~g.", "", "uE\u0018#", "-r_?\\5@2\u0015\u0007\u0006b5~", "5dc\u0016a;>`$\t\u0002Z;\u0001\u00138", "7m_Bg", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SimpleSpringInterpolator implements Interpolator {
    public static final Companion Companion = new Companion(null);
    private static final float FACTOR = 0.5f;
    public static final String PARAM_SPRING_DAMPING = "springDamping";
    private final float _springDamping;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\":\u001e\u007f\u0007ljA0ZeP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\ul\u0007J\t\rs\u0013\u0014\u001c\u0011jZP\u001c}.\u001e\u001d3Zom5$ڑ\u0010˃dt>ӌp>0;\u0012\u0005/\u001e\u0001Ёbͯ~CSÈܞ4H"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2O=\u000fn3Nd2TPW.@[\u0002=!\u001dd\u0015J:\u0017\u0012\u0018\u001f.vO3(\f6RW", "", "u(E", "\u0014@2!B\u0019", "", "\u001e@A\u000e@&,>\u0006bc@&[d\u0017Pc\u0011]", "", "5dc c9B\\\u001b]vf7\u0001\u00121", ">`a.`:", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final float getSpringDamping(ReadableMap params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params.getType(SimpleSpringInterpolator.PARAM_SPRING_DAMPING) == ReadableType.Number) {
                return (float) params.getDouble(SimpleSpringInterpolator.PARAM_SPRING_DAMPING);
            }
            return 0.5f;
        }
    }

    public SimpleSpringInterpolator() {
        this(0.0f, 1, null);
    }

    public SimpleSpringInterpolator(float f2) {
        this._springDamping = f2;
    }

    public /* synthetic */ SimpleSpringInterpolator(float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.5f : f2);
    }

    @JvmStatic
    public static final float getSpringDamping(ReadableMap readableMap) {
        return Companion.getSpringDamping(readableMap);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        double dPow = Math.pow(2.0d, (-10) * f2);
        float f3 = this._springDamping;
        return (float) (((double) 1) + (dPow * Math.sin(((((double) (f2 - (f3 / 4))) * 3.141592653589793d) * ((double) 2)) / ((double) f3))));
    }
}
