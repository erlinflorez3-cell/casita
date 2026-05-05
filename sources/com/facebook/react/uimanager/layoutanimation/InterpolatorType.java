package com.facebook.react.uimanager.layoutanimation;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ\u001d(\\\u0018\b\tvjgӄrd\u0001-X\u0014/\u0015kڷ8$i$ZCAV\u0003}(\u000b8NmjWJ`\u000f,\u000f\f\u001bѷn3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2EB\u0016c9Y\u0001.C[X9Kf}=i", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001aH=\u00124\u0019", "\u0013@B\u0012R\u0010'", "\u0013@B\u0012R\u0016.B", "\u0013@B\u0012R\u0010'MxZh>&fx\u001e", "!OA\u0016A\u000e", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InterpolatorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InterpolatorType[] $VALUES;
    public static final Companion Companion;
    public static final InterpolatorType LINEAR = new InterpolatorType("LINEAR", 0);
    public static final InterpolatorType EASE_IN = new InterpolatorType("EASE_IN", 1);
    public static final InterpolatorType EASE_OUT = new InterpolatorType("EASE_OUT", 2);
    public static final InterpolatorType EASE_IN_EASE_OUT = new InterpolatorType("EASE_IN_EASE_OUT", 3);
    public static final InterpolatorType SPRING = new InterpolatorType("SPRING", 4);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2EB\u0016c9Y\u0001.C[X9Kf}=Rod\u0016Y'\u0016\tcJy", "", "u(E", "4q^:F;KW\"\u0001", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2EB\u0016c9Y\u0001.C[X9Kf}=i", "<`\\2", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        public final InterpolatorType fromString(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1965056864:
                    if (lowerCase.equals("easeout")) {
                        return InterpolatorType.EASE_OUT;
                    }
                    break;
                case -1310315117:
                    if (lowerCase.equals("easein")) {
                        return InterpolatorType.EASE_IN;
                    }
                    break;
                case -1102672091:
                    if (lowerCase.equals("linear")) {
                        return InterpolatorType.LINEAR;
                    }
                    break;
                case -895679987:
                    if (lowerCase.equals("spring")) {
                        return InterpolatorType.SPRING;
                    }
                    break;
                case 1164546989:
                    if (lowerCase.equals("easeineaseout")) {
                        return InterpolatorType.EASE_IN_EASE_OUT;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported interpolation type : " + name);
        }
    }

    private static final /* synthetic */ InterpolatorType[] $values() {
        return new InterpolatorType[]{LINEAR, EASE_IN, EASE_OUT, EASE_IN_EASE_OUT, SPRING};
    }

    static {
        InterpolatorType[] interpolatorTypeArr$values = $values();
        $VALUES = interpolatorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(interpolatorTypeArr$values);
        Companion = new Companion(null);
    }

    private InterpolatorType(String str, int i2) {
    }

    @JvmStatic
    public static final InterpolatorType fromString(String str) {
        return Companion.fromString(str);
    }

    public static EnumEntries<InterpolatorType> getEntries() {
        return $ENTRIES;
    }

    public static InterpolatorType valueOf(String str) {
        return (InterpolatorType) Enum.valueOf(InterpolatorType.class, str);
    }

    public static InterpolatorType[] values() {
        return (InterpolatorType[]) $VALUES.clone();
    }
}
