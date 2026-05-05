package okio;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.msgpack.core.MessagePack;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!,o\bDJf|\u0004O\t8é6B\r,4\u0012}\u0007njG9LeN0ZS8\u001fs{:%c$\bCCU(}*\tUPog|Vb\u000bI\u000f\u000e\u0016\u0007q4I[xu!\u001d;Zom=}sKDxtd\u0004f݆(P\t\u0013\r2*v\u001a'~QX$\u0012^E7îX%\u007f\u0013(*\u0006l\u001f)\u001e\u000bv~:V|u:]\"3mP_?_^{}\u001dTf?\u0019\u0007c.+n6E\u00175S1\u001b\u0001n\u0006ŢEҵ<ݛ\u0001Y5@as\u00065\u0001\u007fB$[S\u001bm\u000b&\u000b\u0004\u0002d\u001a8CO\u0012J\u0001\u001e6\n\u0013\b\u001d>\u0014\u000e4&X0=\u001a\u0015\u001c<F;ɂYŬO\u061cvt\u000e\u0011y6E$(3YHKj_qS\u0019|6,\t\u001b/;\u0001\u001d \fd\u001cr-'dya1\u007f?MJ^\n\bQ\u001c\u00177è\bň\u0003\u0382_2=\u0013).E9_[g2Qo\u0010X\\g%\u0004\u0011lazjHn!\u001f&E<!\u0018jFt\u0005\u001aWdZ<\u0011{0\u0003\u001aDܲ\u0019ٷ[ɼTS3(fO\u0017}\u0013M\f#U3tGqn\u001a\r\b=lDMQ\u0012\u000f\u0012b\u0005&WHr\u0007hfpX\u001c\\l(PFv}Vǯ\u0002ϢMۼ+dM\f44ZEA\\CW3\"PQ\u0015\t\u000eY\u0019\u0014\reK$1hT\u0005\u0017\u0013hh\u0001qwxw+\rb2-oec,lş(ش3ê;*\r\u000f\u0018G\u0016hoL\u001b/&[\u0002 $*QQ]<C\u0015\u0005)@\u0013EEzq,V̊\u0016'\u0001\u001a\u001a\u001bIÜFg6iGݛ3ʧNO\\ϟB\u0003lr;\b\u0013~PӔ\u0019یKc\\ެ{JWs\u001bYjM\u000fىWȷ\"%\tǻB\tC/['K\u0015NҢ\u0002ֵe]q۰N\u0006p\u0012>t\u0014\u0003\u0003Ϥh̔fQeЦ[DW]\u0017>P)CØ\u0015\u05f8nw\u0010ȷ)@\u001b9`A\u0013w-Ж ߵ3}n߿L\u0019~^s:AnTү\u0001ʡ.sK͟й^H-\u0014Sϣ\u0018\u001clџ`)"}, d2 = {"\u0016H6\u0015R\u001a.@\u0006h\\:\u001b\\\u0003\u0012E[\u0007[-", "", "\u001aN6,F\u001c+@\u0003`VM\fvk\u000fA^\bh", "\u001b@B\u0018Rx\u001bG\b^h", "\u001b@B\u0018Ry\u001bG\b^h", "\u001b@B\u0018Rz\u001bG\b^h", " D?\u00194\n\u001e;xgiX\tpw\u000f", "", " D?\u00194\n\u001e;xgiX\n_d\u001cA]\u0017[-", "", " D?\u00194\n\u001e;xgiX\nfg\u000f_j\u0012_)o", "7r8@b\nH\\(\f\u0005e", "", "1nS2C6B\\(", "7rDAY~\u001c]\"\u000e~g<x\u00183o\t", "0xc2", ">q^0X:L \t\u000e{1\t\u0011\u0018/s", "", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "GhT9W", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ">q^0X:L!\t\u000e{1\t\u0011\u0018/s", ">q^0X:L\"\t\u000e{1\t\u0011\u0018/s", ">q^0X:LC(\u007fF/\n\u007f\u0005<s", ">q^0X:LC(\u007fM;@\f\t=", "", ">q^0X:LC(\u007fM<6{\t\u001ao\u00041\u000bN", "CsU\u0005F0SS", "", "Ahi2", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i2) {
        return (i2 >= 0 && i2 < 32) || (127 <= i2 && i2 < 160);
    }

    public static final boolean isUtf8Continuation(byte b2) {
        return (-1) - (((-1) - b2) | ((-1) - 192)) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i4];
        if ((b3 + MessagePack.Code.NIL) - (192 | b3) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i5 = (b3 ^ 3968) ^ (b2 << 6);
        if (i5 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i5));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            int i5 = i2 + 1;
            if (i3 > i5) {
                byte b2 = bArr[i5];
                if ((b2 + MessagePack.Code.NIL) - (b2 | MessagePack.Code.NIL) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b3 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if ((-1) - (((-1) - b4) | ((-1) - 192)) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b5 = bArr[i4];
        if ((192 & b5) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i6 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b3 << Ascii.FF);
        if (i6 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i6 || i6 >= 57344) {
            yield.invoke(Integer.valueOf(i6));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i2 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            int i5 = i2 + 1;
            if (i3 <= i5 || (-1) - (((-1) - bArr[i5]) | ((-1) - 192)) != 128) {
                return 1;
            }
            int i6 = i2 + 2;
            if (i3 > i6) {
                byte b2 = bArr[i6];
                if ((b2 + MessagePack.Code.NIL) - (b2 | MessagePack.Code.NIL) == 128) {
                    return 3;
                }
            }
            return 2;
        }
        byte b3 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if ((192 & b4) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b5 = bArr[i2 + 2];
        if ((b5 + MessagePack.Code.NIL) - (192 | b5) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b6 = bArr[i4];
        if ((b6 + MessagePack.Code.NIL) - (192 | b6) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i7 = (((b6 ^ 3678080) ^ (b5 << 6)) ^ (b4 << Ascii.FF)) ^ (b3 << Ascii.DC2);
        if (i7 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i7 && i7 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i7 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i7));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(byte[] r14, int r15, int r16, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    public static final void processUtf8Bytes(String str, int i2, int i3, Function1<? super Byte, Unit> yield) {
        int i4;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i2 < i3) {
            char cCharAt2 = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i2++;
                while (i2 < i3 && Intrinsics.compare((int) str.charAt(i2), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i2)));
                    i2++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                    int i5 = cCharAt2 >> 6;
                    yield.invoke(Byte.valueOf((byte) ((i5 + 192) - (i5 & 192))));
                    yield.invoke(Byte.valueOf((byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128)))));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((-1) - (((-1) - (cCharAt2 >> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)))));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((-1) - (((-1) - (cCharAt2 & '?')) & ((-1) - 128)))));
                } else if (Intrinsics.compare((int) cCharAt2, 56319) > 0 || i3 <= (i4 = i2 + 1) || 56320 > (cCharAt = str.charAt(i4)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i4)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((-1) - (((-1) - (iCharAt >> 12)) | ((-1) - 63))) | 128)));
                    int i6 = (-1) - (((-1) - (iCharAt >> 6)) | ((-1) - 63));
                    yield.invoke(Byte.valueOf((byte) ((i6 + 128) - (i6 & 128))));
                    int i7 = (-1) - (((-1) - iCharAt) | ((-1) - 63));
                    yield.invoke(Byte.valueOf((byte) ((i7 + 128) - (i7 & 128))));
                    i2 += 2;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(byte[] r14, int r15, int r16, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, kotlin.jvm.functions.Function1):void");
    }

    public static final long size(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i2, 0, 2, null);
    }

    public static final long size(String str, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        long j2 = 0;
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    i4 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i4 = 3;
                } else {
                    int i5 = i2 + 1;
                    char cCharAt2 = i5 < i3 ? str.charAt(i5) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i2 = i5;
                    } else {
                        j2 += (long) 4;
                        i2 += 2;
                    }
                }
                j2 += (long) i4;
            }
            i2++;
        }
        return j2;
    }

    public static /* synthetic */ long size$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = str.length();
        }
        return size(str, i2, i3);
    }
}
