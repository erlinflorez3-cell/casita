package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,x\bDJc|\u0004O\f8\u000b4F\u0007\":\u0012\u007f\u0007loA0RnP.XT2\u000fy\u001a<$a&yCIa\"Ԃ*\t]jogtJr*QƤ\u001e\u001c\tl<I\u001cx\f\u0011/4HģM3}sK:xtd\u0007f݅ŕ<y\u0013\u00042SV\u0014\u000f\u0001SM\u001c\u0012vE\u001f9r\u000fSĨ(\u0017.D0\u0003.\\.SdG\u001daH5;\u0003\u0018D\u0015ϋۢ4|[\u0014^w5\u0015\u000faL4`9;Ֆ3S+\rb]O\u0003\u0006qk\u0004\u0019+55as\u00068\u001fÜЏ\u0019+]\u0018u\u001e4h\u001dQ\u000f\u0015G-UҪYP6.\b|\f\r\u0003\u0004<\u0005WL<:2f6\u0010cx\u0001aXP0`\tȕѐe6%4\u0018j9I3f\u007fr[\u001bTљ\n\n5$3\u0003~!\"Y<_E\u001fb\ni1\u007fBmL\\\u001dq=\u001c\u0006!j\u0010>\u001c4W\u007f5|?C]%ھ_917\u0004-V[\u007fv3b\tUoɭVEJt&9:\tR_rc5o^fp,?OLX\u0015\u0011 \u0013N^><Ƽ)\u0010\\g\u0001%xfu\nSI\u00079_ʤy\u0013\u007fAn7;Ps\u0010(W%\u0013o@p\u0017pfpU<^j;:2vl@\u0002\n_f\u0012#4Oqb9ZM_\\ČL\u0003,_˯\u0001'"}, d2 = {"/qa.l\u0016?C\"\u0003\u0004b;\u0001\u00056i\u0015(z \b\u0017\u001fGx\u001dJ", "", "\u0013", "Ahi2", "", "uH\u0018(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "1n_FB-.\\\u001d\b~m0x\u00103z\u007f'[G\u0001\u001f\u0017P~\u001c", "\"", "<df \\A>", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "@db2g\bM", "", "7mS2k", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\b", "@db2g\u0019:\\\u001b~", "4q^:<5=S,", "Bn8;W,Q", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ\b", "AtQ.e9:gv\t\u0004m,\u0006\u0018\u000fq\u0010$\u0003N", "", "=eU@X;", ":d]4g/", "=sW2e", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006\u000749`G\u0007;{%\u0004\u00118", "AtQ.e9:gv\t\u0004m,\u0006\u0018\u0012a\u000e+YJ\u007f\u0017", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZz", "AtQ.e9:gv\t\u0004m,\u0006\u0018\u001eom7\tD\n\u0019", "", "BgX@66EZ\u0019|\nb6\u0006", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006\u000749`G}At\u001d.KR?u=sXOf5\u0018_uUr0I\u0016<;iV{?i", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i2) {
        if (i2 >= 0) {
            return (E[]) new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i2) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i2] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i2 < i3) {
            resetAt(eArr, i2);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i2, int i3, List<?> list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Intrinsics.areEqual(tArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i2, int i3) {
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            T t2 = tArr[i2 + i4];
            iHashCode = (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i2, int i3, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            T t2 = tArr[i2 + i4];
            if (t2 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t2);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
