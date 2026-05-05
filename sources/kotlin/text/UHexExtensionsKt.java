package kotlin.text;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDRo|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0Le^.ZS0\u000fs{J$c$wCCU0}*\tUQog|Pb\u000bI\u0019\u001e0\u0007̓DI\u0004w\u0006\u0012=2ruE3[pU9\u000fv|Ӕ&ݨ&8\b\b\u001948L(v)Hs\f@0pv@R\u001bN\u001d\u001a@\b\u0005İ\u0007ɉ`g\\<`\u0007kAG#1qjNU_`\u0003S\rTU?\r%cdѰF˝9\u00153\\\u001b!`eW\u0003m|e\u0005\u0017'W1Ose7p\u007fB\u0017q̅\u0013ǁv&j\u0011iz\u001a4CO\u0012Yx\u000eVw+\u0002\u0013<\u0012\u000f\u001e'v0sՇlڿ\u00123\u0003\u0002k\\^\u0012vB.z\n6E$0919)giai\u001b\u0015ѡ\u0002˿\u0011 )\u0012|3s\u0005\u001cp-\u001b\u0003wy1\u007fEmNT\ngP\u0006\u0004\u001fv20\n0U\u0015G{?BG+=[G$9k0J\u000bϡ|ݶdjY\u007f`_X>|&O*7\f\u0003D\u0013\n\u001cVZX:\u0012e\u001c\u0003\tDܹ\u0019ء`yB93)fkvy\u0003M\f\nM/\u0015?\ntq\u000ee:v3cS*ߌg؏z\u0016EVp p\u0003Pc$Z\u000b(J2vu@}\u0002D\\\r+2msbف2֞\u001d^\u001bd\u0011;Z]\u000b\u0019wZ\u0017\u0010'Ta23o*t\u0017\u0002h\\\u001fq.նOض\u0001b(KOpڪ\u001dF"}, d2 = {"6dg!b\u001c\u001bg(~", "\u001aj^A_0G\u001d\t[\u000fm,R", "", "4na:T;", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010l", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#` JN ;U?JAwz", "6dg!b\u001c\u001bg(~Vk9x\u001d", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#` JN ;U?JAw\u0014q", "6dg!b\u001c\"\\(", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#` JN ;U?JAw\u0002", "6dg!b\u001c%]\"\u0001", "\u001aj^A_0G\u001d\te\u0005g.R", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#` JN ;U?JAw\u0003", "6dg!b\u001c,V#\f\n", "\u001aj^A_0G\u001d\tl}h9\f^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#` JN ;U?JAw\f", "Bn72k\u001aM`\u001d\b|", "Bn72k\u001aM`\u001d\b|&!h\u0006+RJr", "uA;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u001d3tAr61#\u0005\u001c@o_\u001c\\P?t6s", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "Bn72k\u001aM`\u001d\b|&3qf3F\r\u0004", "uZ1\u0016<\u0013D](\u0006~gu\f\tBtI\u000b{Sa!$Ok\u001d\u0012:\f:U\u000f\u001c\u0001t\u00127O\r)zA\"\u001ej7", "Bn72k\u001aM`\u001d\b|&A_\u0019 2\u0012\u0018", "uZ1\u0019^6MZ\u001d\bDm,\u0010\u0018xH\u007f;\\J\u000e\u001f\u0013VEQ#{!FUG'3v\u0018w;RHo= j", "Bn72k\u001aM`\u001d\b|&~dZ\u0016xb:", "uH;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u001d3tAr61#\u0005\u001c@o_\u001c\\P?t6s", "Bn72k\u001aM`\u001d\b|&~lm\rmG\f", "uI;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u001d3tAr61#\u0005\u001c@o_\u001c\\P?t6s", "Bn72k\u001aM`\u001d\b|&9J\u0013B__r", "uR;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u001d3tAr61#\u0005\u001c@o_\u001c\\P?t6s", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UHexExtensionsKt {
    private static final byte hexToUByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m8998constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    static /* synthetic */ byte hexToUByte$default(String str, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m8998constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    private static final byte[] hexToUByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m9051constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    static /* synthetic */ byte[] hexToUByteArray$default(String str, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m9051constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    private static final int hexToUInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m9075constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    static /* synthetic */ int hexToUInt$default(String str, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m9075constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    private static final long hexToULong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m9154constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    static /* synthetic */ long hexToULong$default(String str, HexFormat format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m9154constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    private static final short hexToUShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m9261constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    static /* synthetic */ short hexToUShort$default(String str, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m9261constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m10280toHexString8M7LxHw(int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i2, format);
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ String m10281toHexString8M7LxHw$default(int i2, HexFormat format, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i2, format);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m10282toHexString8UJCmI(long j2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j2, format);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ String m10283toHexString8UJCmI$default(long j2, HexFormat format, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j2, format);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m10284toHexStringZQbaR00(byte b2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b2, format);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ String m10285toHexStringZQbaR00$default(byte b2, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b2, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m10286toHexStringlZCiFrA(byte[] toHexString, int i2, int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i2, i3, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ String m10287toHexStringlZCiFrA$default(byte[] toHexString, int i2, int i3, HexFormat format, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = UByteArray.m9057getSizeimpl(toHexString);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i2, i3, format);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m10288toHexStringr3ox_E0(short s2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s2, format);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ String m10289toHexStringr3ox_E0$default(short s2, HexFormat format, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s2, format);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m10290toHexStringzHuV2wU(byte[] toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ String m10291toHexStringzHuV2wU$default(byte[] toHexString, HexFormat format, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }
}
