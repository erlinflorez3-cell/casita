package com.facebook.fresco.ui.common;

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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4H\u0005ӳ+(Մ%n\u001b?@FuH\\ɟ\u0002)Gj\u0004t1a$\u0002GIU2}P\nҊRgup\u001bi\u0019C'\u0006Dy̶0O]ތu\u0014\u00155Ps(3St&9fz\u001f\u0005&9ś<\u0003"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~J\u0002.;j\u001a5QROYC\u001a$h7", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "#M:\u001bB\u001e'", "$HB\u00165\u0013\u001e", "\u0017ME\u0016F\u0010\u001b:x", "\u0011n\\=T5B]\"", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum VisibilityState {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);

    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final VisibilityState[] VALUES = values();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\bnjG6L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0017]S\u007fi\u0005I\t\u000es\u0013\u0014\u001c\u0011jZP&\rk\u0013'8RqO3{rk;7ҝ8ӯ$4*8\b\tи\u001e2"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~J\u0002.;j\u001a5QROYC\u001a$h \u0017\u0011k7J\u007f+QU$", "", "u(E", "$@;\"8\u001a", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~J\u0002.;j\u001a5QROYC\u001a$h7", ")KR<`u?O\u0017~wh6\u0003R0r\u007f6yJJ'\u001b\u0011m\u0018D~/>#n$Eq\u00132TGJ\u007f\"-\u0011wa\u000f", "4q^:<5M", "D`[BX", "", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VisibilityState fromInt(int i2) {
            for (VisibilityState visibilityState : VisibilityState.VALUES) {
                if (visibilityState.getValue() == i2) {
                    return visibilityState;
                }
            }
            return null;
        }
    }

    VisibilityState(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }
}
