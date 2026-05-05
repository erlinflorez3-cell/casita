package com.facebook.react.uimanager;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.style.CornerRadii;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007f\u0007loA0RnP.XS2\u000fy\u0002<řc$\bCCU ~*\t]ZogtJ`ŖI%إ4\u000f\u001b,wT1\\(O7H\u0004У7M}=ys\u0005:\u0013!J\"f{\u0015\u0005(-`\u0010%~ŲO\f 5\twHZ%M3\u001cXĢ?h\b,e\u007fNdL3Ӟ;w>\u0011sZNUڿ`\u0003S\rTU?\r%cN1F7C\u0018=S1\u000b\u0019Ā>KP\u007fH\u001dhU3[O\u0002dNZ\u0016\u0013C*\u0016֬^;-j\u0013i`:6q֩b\u0014d\u001c8\u0010z*\u001el\b\u001c\u0018?H\\/Jj\u0016!Kt!U\tW\u0010rZ\u007f)v|Ѥ$PB9<3f\u007feޅ\u001dT?ަ\u001d\u000f$)\u000fuqgb\u000fx\u0015IVNΆ3ҨD=Pݐ̌]T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017h7", "", "u(E", "D`[BX", "", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017hPM\u0012c\u0002", "uE;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#d @o%18CHi4'$dc9uw7NLj8", "5dc!l7>", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#d @o%18CHi4'$dc9uw7NL", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "@db<_=>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8ZL;x!\u001a\u0014le\u000f", "EhSA[", "6dX4[;", "BnBAe0GU", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LengthPercentage {
    public static final Companion Companion = new Companion(null);
    private final LengthPercentageType type;
    private final float value;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017h \u0017\u0011k7J\u007f+QU$", "", "u(E", "Adc\u0013e6F2-\bvf0z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017h7", "2x].`0<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LengthPercentage setFromDynamic(Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i2 = WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()];
            LengthPercentage lengthPercentage = null;
            if (i2 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new LengthPercentage((float) dAsDouble, LengthPercentageType.POINT);
                }
                return null;
            }
            if (i2 != 2) {
                FLog.w(ReactConstants.TAG, "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (!StringsKt.endsWith$default(strAsString, "%", false, 2, (Object) null)) {
                FLog.w(ReactConstants.TAG, "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                float f2 = Float.parseFloat(strSubstring);
                if (f2 < 0.0f) {
                    return null;
                }
                lengthPercentage = new LengthPercentage(f2, LengthPercentageType.PERCENT);
                return lengthPercentage;
            } catch (NumberFormatException unused) {
                FLog.w(ReactConstants.TAG, "Invalid percentage format: " + strAsString);
                return lengthPercentage;
            }
        }
    }

    public LengthPercentage() {
        this(0.0f, LengthPercentageType.POINT);
    }

    public LengthPercentage(float f2, LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = f2;
        this.type = type;
    }

    private final float component1() {
        return this.value;
    }

    public static /* synthetic */ LengthPercentage copy$default(LengthPercentage lengthPercentage, float f2, LengthPercentageType lengthPercentageType, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = lengthPercentage.value;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            lengthPercentageType = lengthPercentage.type;
        }
        return lengthPercentage.copy(f2, lengthPercentageType);
    }

    @JvmStatic
    public static final LengthPercentage setFromDynamic(Dynamic dynamic) {
        return Companion.setFromDynamic(dynamic);
    }

    public final LengthPercentageType component2() {
        return this.type;
    }

    public final LengthPercentage copy(float f2, LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new LengthPercentage(f2, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) obj;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    public final LengthPercentageType getType() {
        return this.type;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + this.type.hashCode();
    }

    public final CornerRadii resolve(float f2, float f3) {
        if (this.type != LengthPercentageType.PERCENT) {
            float f4 = this.value;
            return new CornerRadii(f4, f4);
        }
        float f5 = this.value;
        float f6 = 100;
        return new CornerRadii((f5 / f6) * f2, (f5 / f6) * f3);
    }

    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + ")";
    }
}
