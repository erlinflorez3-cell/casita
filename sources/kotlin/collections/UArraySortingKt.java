package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
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
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\r6B\u0015\"4\u0012}\u0007njO0LeN.ZS@\u000fs{:%c$\u007fCCU \f:.]Ȟ\u007fg\u001dI\u000b\u000fQ\u000f\u001e\u0016'k\\Mczu\u0012=1rsM6eok8'uȥ\t\"8&F~\u001d&(ݒ`\u0010%ysO\u001a\u0012H@\u001f@\u0003\u0011[\u00072\u00124=P\u0005,_\u007fNdG3^Ơ3%\tpPV?\u0005>ŧe\rtSW\u0011\u0005a6+n@e\u00193U\u001b\u0007\u0001Zo\u0007MtU\u0005\u0017&m,ʁwY<b\u000e\u001f-P]ՕurT[5Un\f?+}o{T\u001c*\u0010z*\fl\b\u001c\t?H\\,`gڿ\u00125z\u007faNh'lQ\u0018z\u0010FG)\u000e3C9Ig\u0002eI\u001bf7*\u0004=\"1\u0004\u0007!\nSTaڠ\u001fV}b?cXbV]\"Yk}4tp\u0002B\u0004^M03\n\u0013F\u0017S6\f=1$\u0004\u0002vC.wݶdjY|`\\XG|%O*7\u001c\u000bHr\u0005\u0004P\u0003a\\\u0015[\u001el\u0007,\u0007C$jzT!S\u000f\u0015PŹmlSr\u0018;G\fEh\u0007k<gibA5ic>m\u0003z\"ATb3W\u0017Fa\u000fr\\V!xIн\u0014y\u0002[\\$+WM\u000b44ZAI`#H\u001b\u001epB-\rmt\u0001\u0010-Sc(\u0011\u0005<t7\u007f\u0017[ʼsi~e:\u000fxG;Zi5G6\u0006&v4\u0015#5\u0005$\u0004U\u0002dGzkFyc\u00178\u0016H8\u0018.ˮ\u0017\u0011\u0005F@\u0016EjZ\f}Q{\"W~\u000by';\u00177\u0018\fx\u000bD`\u0019I\u007fX%=\u000f^!\"Ncѣ}cL\u0019Uyl0iWar1ilRF|\u001d\u001fL11s0\u0017M-q&M\u001a\u0006/G\u0015\u0010\\0nЦ}d\u0015E\u0003}צ0\u0004"}, d2 = {">`aA\\;B]\"", "", "/qa.l", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", ":dUA", "@hV5g", ">`aA\\;B]\"FIN*Zl{c", "uZ1\u0016<o\"", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", ">`aA\\;B]\"F\u0005;\u0012GY g", "uZ8\u0016<o\"", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", ">`aA\\;B]\"FBg9\u0007v.4", "uZ9\u0016<o\"", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", ">`aA\\;B]\"FVZ{\u000e\u001e\u0001o", "uZB\u0016<o\"", "?tX0^\u001aH`(", "", "?tX0^\u001aH`(FIN*Zl{c", "uZ1\u0016<o/", "?tX0^\u001aH`(F\u0005;\u0012GY g", "uZ8\u0016<o/", "?tX0^\u001aH`(FBg9\u0007v.4", "uZ9\u0016<o/", "?tX0^\u001aH`(FVZ{\u000e\u001e\u0001o", "uZB\u0016<o/", "AnaA49KO-", "4q^:<5=S,", "Bn8;W,Q", "AnaA49KO-FIN*Zl{c", "AnaA49KO-F\u0005;\u0012GY g", "AnaA49KO-FBg9\u0007v.4", "AnaA49KO-FVZ{\u000e\u001e\u0001o", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition--nroSd4 */
    private static final int m9435partitionnroSd4(long[] jArr, int i2, int i3) {
        long jM9214getsVKNKU = ULongArray.m9214getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Long.compareUnsigned(ULongArray.m9214getsVKNKU(jArr, i2), jM9214getsVKNKU) < 0) {
                i2++;
            }
            while (Long.compareUnsigned(ULongArray.m9214getsVKNKU(jArr, i3), jM9214getsVKNKU) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long jM9214getsVKNKU2 = ULongArray.m9214getsVKNKU(jArr, i2);
                ULongArray.m9219setk8EXiF4(jArr, i2, ULongArray.m9214getsVKNKU(jArr, i3));
                ULongArray.m9219setk8EXiF4(jArr, i3, jM9214getsVKNKU2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: partition-4UcCI2c */
    private static final int m9436partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i4;
        byte bM9056getw2LRezQ = UByteArray.m9056getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                i4 = (-1) - (((-1) - bM9056getw2LRezQ) | ((-1) - 255));
                if (Intrinsics.compare(UByteArray.m9056getw2LRezQ(bArr, i2) & 255, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (true) {
                byte bM9056getw2LRezQ2 = UByteArray.m9056getw2LRezQ(bArr, i3);
                if (Intrinsics.compare((bM9056getw2LRezQ2 + 255) - (bM9056getw2LRezQ2 | 255), i4) <= 0) {
                    break;
                }
                i3--;
            }
            if (i2 <= i3) {
                byte bM9056getw2LRezQ3 = UByteArray.m9056getw2LRezQ(bArr, i2);
                UByteArray.m9061setVurrAj0(bArr, i2, UByteArray.m9056getw2LRezQ(bArr, i3));
                UByteArray.m9061setVurrAj0(bArr, i3, bM9056getw2LRezQ3);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o */
    private static final int m9437partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i4;
        short sM9319getMh2AYeg = UShortArray.m9319getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                i4 = sM9319getMh2AYeg & 65535;
                if (Intrinsics.compare(UShortArray.m9319getMh2AYeg(sArr, i2) & 65535, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare((-1) - (((-1) - UShortArray.m9319getMh2AYeg(sArr, i3)) | ((-1) - 65535)), i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short sM9319getMh2AYeg2 = UShortArray.m9319getMh2AYeg(sArr, i2);
                UShortArray.m9324set01HTLdE(sArr, i2, UShortArray.m9319getMh2AYeg(sArr, i3));
                UShortArray.m9324set01HTLdE(sArr, i3, sM9319getMh2AYeg2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: partition-oBK06Vg */
    private static final int m9438partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int iM9135getpVg5ArA = UIntArray.m9135getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Integer.compareUnsigned(UIntArray.m9135getpVg5ArA(iArr, i2), iM9135getpVg5ArA) < 0) {
                i2++;
            }
            while (Integer.compareUnsigned(UIntArray.m9135getpVg5ArA(iArr, i3), iM9135getpVg5ArA) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int iM9135getpVg5ArA2 = UIntArray.m9135getpVg5ArA(iArr, i2);
                UIntArray.m9140setVXSXFK8(iArr, i2, UIntArray.m9135getpVg5ArA(iArr, i3));
                UIntArray.m9140setVXSXFK8(iArr, i3, iM9135getpVg5ArA2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4 */
    private static final void m9439quickSortnroSd4(long[] jArr, int i2, int i3) {
        int iM9435partitionnroSd4 = m9435partitionnroSd4(jArr, i2, i3);
        int i4 = iM9435partitionnroSd4 - 1;
        if (i2 < i4) {
            m9439quickSortnroSd4(jArr, i2, i4);
        }
        if (iM9435partitionnroSd4 < i3) {
            m9439quickSortnroSd4(jArr, iM9435partitionnroSd4, i3);
        }
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c */
    private static final void m9440quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int iM9436partition4UcCI2c = m9436partition4UcCI2c(bArr, i2, i3);
        int i4 = iM9436partition4UcCI2c - 1;
        if (i2 < i4) {
            m9440quickSort4UcCI2c(bArr, i2, i4);
        }
        if (iM9436partition4UcCI2c < i3) {
            m9440quickSort4UcCI2c(bArr, iM9436partition4UcCI2c, i3);
        }
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o */
    private static final void m9441quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int iM9437partitionAa5vz7o = m9437partitionAa5vz7o(sArr, i2, i3);
        int i4 = iM9437partitionAa5vz7o - 1;
        if (i2 < i4) {
            m9441quickSortAa5vz7o(sArr, i2, i4);
        }
        if (iM9437partitionAa5vz7o < i3) {
            m9441quickSortAa5vz7o(sArr, iM9437partitionAa5vz7o, i3);
        }
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg */
    private static final void m9442quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int iM9438partitionoBK06Vg = m9438partitionoBK06Vg(iArr, i2, i3);
        int i4 = iM9438partitionoBK06Vg - 1;
        if (i2 < i4) {
            m9442quickSortoBK06Vg(iArr, i2, i4);
        }
        if (iM9438partitionoBK06Vg < i3) {
            m9442quickSortoBK06Vg(iArr, iM9438partitionoBK06Vg, i3);
        }
    }

    /* JADX INFO: renamed from: sortArray--nroSd4 */
    public static final void m9443sortArraynroSd4(long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9439quickSortnroSd4(array, i2, i3 - 1);
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c */
    public static final void m9444sortArray4UcCI2c(byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9440quickSort4UcCI2c(array, i2, i3 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o */
    public static final void m9445sortArrayAa5vz7o(short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9441quickSortAa5vz7o(array, i2, i3 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg */
    public static final void m9446sortArrayoBK06Vg(int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m9442quickSortoBK06Vg(array, i2, i3 - 1);
    }
}
