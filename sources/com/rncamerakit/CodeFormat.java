package com.rncamerakit;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4D\u0007\":\u0018\u007f\u0007lx?ӋǑe^\u008cphZ\u0015{}D$\nҕ BsT/>/\u000fO^kunbZ9DǇ\n\u0016\u0007ltMc}u\u0012=8\u0013~M3eok:žx<\rړJ$>|\u0013\u0005\u0003*N\u0017_zISt\u00126IY:X\u00176\u0005 \u001dn>&\r\u0007\\m[\u001fHrk#/)\u0012RBT7H0\u0003^uFZ9uvg1\u0014@=Iտ)i"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]2z@a!$Ok\u001d\u0012", "", "1nS2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bn1.e*HR\u0019m\u000fi,", "", "\u0011N3\u0012Rw\u000b&", "\u0011N3\u0012Ry\u0012", "\u0011N3\u0012R\u007f\f", "\u0011N3\u000e5\b+", "\u0013@=,$y", "\u0013@=,+", "\u0017S5", "#O2,4", "#O2,8", "\u001fQ", "\u001eC5,'w\u0010", "\u000fYC\u00126", "\u0012@C\u000eR\u0014\u001aB\u0006bm", "#M:\u001bB\u001e'", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CodeFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CodeFormat[] $VALUES;
    public static final Companion Companion;
    private final String code;
    public static final CodeFormat CODE_128 = new CodeFormat("CODE_128", 0, "code-128");
    public static final CodeFormat CODE_39 = new CodeFormat("CODE_39", 1, "code-39");
    public static final CodeFormat CODE_93 = new CodeFormat("CODE_93", 2, "code-93");
    public static final CodeFormat CODABAR = new CodeFormat("CODABAR", 3, "codabar");
    public static final CodeFormat EAN_13 = new CodeFormat("EAN_13", 4, "ean-13");
    public static final CodeFormat EAN_8 = new CodeFormat("EAN_8", 5, "ean-8");
    public static final CodeFormat ITF = new CodeFormat("ITF", 6, "itf");
    public static final CodeFormat UPC_A = new CodeFormat("UPC_A", 7, "upc-a");
    public static final CodeFormat UPC_E = new CodeFormat("UPC_E", 8, "upc-e");
    public static final CodeFormat QR = new CodeFormat("QR", 9, "qr");
    public static final CodeFormat PDF_417 = new CodeFormat("PDF_417", 10, "pdf-417");
    public static final CodeFormat AZTEC = new CodeFormat("AZTEC", 11, "aztec");
    public static final CodeFormat DATA_MATRIX = new CodeFormat("DATA_MATRIX", 12, "data-matrix");
    public static final CodeFormat UNKNOWN = new CodeFormat("UNKNOWN", 13, "unknown");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0RqP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uh\u0007J\t\rs\u0015\f\u0015\u0007mDI\u0004|&\"\u001d7ZqU2{qm?nzN\u000761P?ѯ\t\t"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]2z@a!$Ok\u001dzT/=dy);w\u001f\u0004", "", "u(E", "4q^:5(KQ#}zM@\b\t", "\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]2z@a!$Ok\u001d\u0012", "0`a0b+>B-\nz", "", "4q^:A(FS", "<`\\2", "", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CodeFormat fromBarcodeType(int i2) {
            if (i2 == 1) {
                return CodeFormat.CODE_128;
            }
            if (i2 == 2) {
                return CodeFormat.CODE_39;
            }
            switch (i2) {
                case 4:
                    return CodeFormat.CODE_93;
                case 8:
                    return CodeFormat.CODABAR;
                case 16:
                    return CodeFormat.DATA_MATRIX;
                case 32:
                    return CodeFormat.EAN_13;
                case 64:
                    return CodeFormat.EAN_8;
                case 128:
                    return CodeFormat.ITF;
                case 256:
                    return CodeFormat.QR;
                case 512:
                    return CodeFormat.UPC_A;
                case 1024:
                    return CodeFormat.UPC_E;
                case 2048:
                    return CodeFormat.PDF_417;
                case 4096:
                    return CodeFormat.AZTEC;
                default:
                    return CodeFormat.UNKNOWN;
            }
        }

        public final CodeFormat fromName(String str) {
            for (CodeFormat codeFormat : CodeFormat.values()) {
                if (Intrinsics.areEqual(codeFormat.getCode(), str)) {
                    return codeFormat;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CodeFormat.values().length];
            try {
                iArr[CodeFormat.CODE_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CodeFormat.CODE_39.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CodeFormat.CODE_93.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CodeFormat.CODABAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CodeFormat.EAN_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CodeFormat.EAN_8.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CodeFormat.ITF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CodeFormat.UPC_A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CodeFormat.UPC_E.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CodeFormat.QR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CodeFormat.PDF_417.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CodeFormat.AZTEC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CodeFormat.DATA_MATRIX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CodeFormat.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CodeFormat[] $values() {
        return new CodeFormat[]{CODE_128, CODE_39, CODE_93, CODABAR, EAN_13, EAN_8, ITF, UPC_A, UPC_E, QR, PDF_417, AZTEC, DATA_MATRIX, UNKNOWN};
    }

    static {
        CodeFormat[] codeFormatArr$values = $values();
        $VALUES = codeFormatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(codeFormatArr$values);
        Companion = new Companion(null);
    }

    private CodeFormat(String str, int i2, String str2) {
        this.code = str2;
    }

    public static EnumEntries<CodeFormat> getEntries() {
        return $ENTRIES;
    }

    public static CodeFormat valueOf(String str) {
        return (CodeFormat) Enum.valueOf(CodeFormat.class, str);
    }

    public static CodeFormat[] values() {
        return (CodeFormat[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final int toBarcodeType() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 512;
            case 9:
                return 1024;
            case 10:
                return 256;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 16;
            case 14:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
