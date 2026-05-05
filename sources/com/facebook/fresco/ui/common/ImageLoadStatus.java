package com.facebook.fresco.ui.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4D\u0007\":\u001e\u007f\u0007ls?ӋC{߉Lb\u00040\u001fm\f4RӋRp{:eZ\u000b(\t_Rug\u0007J\t\fß\u0013\u0006$z32WZ\u0011]@\u0015xV@NAM\b=gaҽ:\u000b(݅::\u007f\b\u000f\u001e\u0013H\u0016}cCQ\u0014z0Fy#R\u0013Wm\u001a\u0018\u0011' \u0007*EgTC1lcH\u0018#\txŒR8"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m|8IB)z0-%v7", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "BnBAe0GU", "", "#M:\u001bB\u001e'", " D@\"8\u001a-3w", "\u0017MC\u0012E\u0014\u001e2|Zi>&Xy\u000bIf\u0004X'`", "!T2\u00108\u001a,", "\u0011@=\u00108\u0013\u001e2", "\u0013QA\u001cE", "\u0012Q0$", "\u0013L?!L&\u001eDxgi", " D;\u00124\u001a\u001e2", "\u0011n\\=T5B]\"", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum ImageLoadStatus {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    CANCELED(4),
    ERROR(5),
    DRAW(6),
    EMPTY_EVENT(7),
    RELEASED(8);

    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final ImageLoadStatus[] VALUES = values();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\bnjG6L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0017]S\u007fi\u0005I\t\u000es\u0013\u0014\u001c\u0011jZP&\rk\u0013'8RqO3{rk;7ҝ8ӯ$4*8\b\tи\u001e2"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m|8IB)z0-%v \u0017\u0011k7J\u007f+QU$", "", "u(E", "$@;\"8\u001a", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m|8IB)z0-%v7", ")KR<`u?O\u0017~wh6\u0003R0r\u007f6yJJ'\u001b\u0011m\u0018D~/>#a(3o\u0016\u0015W?:YC\u001a$xo\u000f", "4q^:<5M", "D`[BX", "", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageLoadStatus fromInt(int i2) {
            for (ImageLoadStatus imageLoadStatus : ImageLoadStatus.VALUES) {
                if (imageLoadStatus.getValue() == i2) {
                    return imageLoadStatus;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageLoadStatus.values().length];
            try {
                iArr[ImageLoadStatus.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageLoadStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageLoadStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageLoadStatus.INTERMEDIATE_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageLoadStatus.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageLoadStatus.RELEASED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    ImageLoadStatus(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "requested";
            case 2:
                return FirebaseAnalytics.Param.SUCCESS;
            case 3:
                return "canceled";
            case 4:
                return "intermediate_available";
            case 5:
                return "error";
            case 6:
                return "released";
            default:
                return "unknown";
        }
    }
}
