package com.facebook.react.uimanager.layoutanimation;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\tGָً\u000bDȐ\u001d'\\\u0018\b\tvjgӄrd\u0001-W\u0014/\u0015kڷ8$i$ZCAV\u0003}(\u000b8NmjWJ`\u000få\u0013\f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2=B\u000bk(]v&2YX7\\_\u0002Q\u0003&e\u000e$", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001dO0\u0010<\u001b2", "!B0\u00198&1", "!B0\u00198&2", "!B0\u00198&1G", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AnimatedPropertyType extends Enum<AnimatedPropertyType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimatedPropertyType[] $VALUES;
    public static final Companion Companion;
    public static final AnimatedPropertyType OPACITY = new AnimatedPropertyType("OPACITY", 0);
    public static final AnimatedPropertyType SCALE_X = new AnimatedPropertyType("SCALE_X", 1);
    public static final AnimatedPropertyType SCALE_Y = new AnimatedPropertyType("SCALE_Y", 2);
    public static final AnimatedPropertyType SCALE_XY = new AnimatedPropertyType("SCALE_XY", 3);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2=B\u000bk(]v&2YX7\\_\u0002Q\u0003&e\u000e\r\t\u0017\rd=-rN@t", "", "u(E", "4q^:F;KW\"\u0001", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n<U\u0012*G|\u00127QK7z8(\u001e2=B\u000bk(]v&2YX7\\_\u0002Q\u0003&e\u000e$", "<`\\2", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        public final AnimatedPropertyType fromString(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            switch (name.hashCode()) {
                case -1267206133:
                    if (name.equals(ViewProps.OPACITY)) {
                        return AnimatedPropertyType.OPACITY;
                    }
                    break;
                case -908189618:
                    if (name.equals("scaleX")) {
                        return AnimatedPropertyType.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (name.equals("scaleY")) {
                        return AnimatedPropertyType.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (name.equals("scaleXY")) {
                        return AnimatedPropertyType.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + name);
        }
    }

    private static final /* synthetic */ AnimatedPropertyType[] $values() {
        return new AnimatedPropertyType[]{OPACITY, SCALE_X, SCALE_Y, SCALE_XY};
    }

    static {
        AnimatedPropertyType[] animatedPropertyTypeArr$values = $values();
        $VALUES = animatedPropertyTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(animatedPropertyTypeArr$values);
        Companion = new Companion(null);
    }

    private AnimatedPropertyType(String str, int i2) {
        super(str, i2);
    }

    @JvmStatic
    public static final AnimatedPropertyType fromString(String str) {
        return Companion.fromString(str);
    }

    public static EnumEntries<AnimatedPropertyType> getEntries() {
        return $ENTRIES;
    }

    public static AnimatedPropertyType valueOf(String str) {
        return (AnimatedPropertyType) Enum.valueOf(AnimatedPropertyType.class, str);
    }

    public static AnimatedPropertyType[] values() {
        return (AnimatedPropertyType[]) $VALUES.clone();
    }
}
