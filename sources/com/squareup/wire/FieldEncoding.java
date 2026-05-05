package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4I\u0007\"B\u0012\u007f\u0007lj?ӋǑe^\u008cp_Z\u0015{}D$\nҕ BsT&>1\u000fO^kunbZ9DǇ\n\u0018~l:L\u001e\u0001k\u001c'6RoE4{z\u000eKntN\u0005N3x\u0601{ڱ\u0005 2Ϻ(x\u0001GY\u0011z0Fv#R\u0013Tm\u001a\u0018\u000e' \u0007'֚k["}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "", "D`[BX", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NSW\u0011~k,v\u0016?n\u000f,\u0004@", "u(8", "$@A\u0016A\u001b", "\u0014HG\u00127|\r", "\u001aD=\u0014G\u000f82xe^F\u0010kh\u000e", "\u0014HG\u00127y\u000b", "@`f\u001de6M]t}vi;|\u0016", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FieldEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FieldEncoding[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final FieldEncoding VARINT = new FieldEncoding("VARINT", 0, 0);
    public static final FieldEncoding FIXED64 = new FieldEncoding("FIXED64", 1, 1);
    public static final FieldEncoding LENGTH_DELIMITED = new FieldEncoding("LENGTH_DELIMITED", 2, 2);
    public static final FieldEncoding FIXED32 = new FieldEncoding("FIXED32", 3, 5);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lj?ӋE{߉^R\u0002)Or\u00024ż_&wCIVb\u00120\u000bgN\u0016j\u001fNh\u000f[\u000f4\u001b?̕,֒Yxc\u0018ƪ6I"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[<}Au!*VGEt\n", "", "\nh]6g\u0005", "u(E", "5dc", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "D`[BX", "", "5dcpj0KS\u0013\f\u000bg;\u0001\u0011/", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FieldEncoding get$wire_runtime(int i2) throws IOException {
            if (i2 == 0) {
                return FieldEncoding.VARINT;
            }
            if (i2 == 1) {
                return FieldEncoding.FIXED64;
            }
            if (i2 == 2) {
                return FieldEncoding.LENGTH_DELIMITED;
            }
            if (i2 == 5) {
                return FieldEncoding.FIXED32;
            }
            throw new ProtocolException("Unexpected FieldEncoding: " + i2);
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FieldEncoding[] $values() {
        return new FieldEncoding[]{VARINT, FIXED64, LENGTH_DELIMITED, FIXED32};
    }

    static {
        FieldEncoding[] fieldEncodingArr$values = $values();
        $VALUES = fieldEncodingArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fieldEncodingArr$values);
        Companion = new Companion(null);
    }

    private FieldEncoding(String str, int i2, int i3) {
        this.value = i3;
    }

    public static EnumEntries<FieldEncoding> getEntries() {
        return $ENTRIES;
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) Enum.valueOf(FieldEncoding.class, str);
    }

    public static FieldEncoding[] values() {
        return (FieldEncoding[]) $VALUES.clone();
    }

    public final int getValue$wire_runtime() {
        return this.value;
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i2 == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i2 == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i2 == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
