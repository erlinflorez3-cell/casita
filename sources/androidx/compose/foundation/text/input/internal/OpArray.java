package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: OffsetMappingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":%\u007f\u0007lpA0RnP.XU2\u000fy{<$a%yCQU\"}8\tWNmrvJh\u0017K\u000f\f\u0018~̗j_ǁ\u0017\u0007B\u000f`A(>\\\u000e~CMpxD\u000582P9ѩ\t\u0003 ,V\u00137\nIK\u001c\u0016>D\t:\u0001\u0012̂\t\u001c\u0018\bL&I7jpf6vǍ\u000e>=-\u001bipOф^ܞǠL\fТX)\u0013\u0002o*sXEB-%\u0002\u00117XiN\u001bA\b<3gmާ,ʁwY<h\u000e%]\u0019]\u001furTo5Un ?+}d{V\u0014(\u0006\u0010\u0014\rj\u0012>O5^Fr*w\u0018\u001dauɤWJV\u001anH\u0006\u0014q8\u001d+&M;J+u\u007fbޅ\u001dX=\u0014\u0015\u0013$<\u0011p'az)p&+c&RśUJC`^\u0010_V}\u0006vh(F\u00142W\u007f]\u000f?E]\u00ad=٦=%'\t\u0010f\ru\u0005$xh\u0002j\u0019Ή?̱r\u0018=J\u0017\u0014#or&\u0004P\u0003k\\\u0015[>l\u0007,\tC$j\u0012T!S\u0011~Sv\u0005\u0003M\f\u000bU3tSqn\u001a\u000fĆ=`9X_\bXo`\u001c,?j\tKױe͞W\u000e`\u00046J\u0003Wx\u0010\u0010{rOBW\u0558Cu4628'deT\u0011\"ZA+\u000e6ʶjʐ\u0003T;ɴѹh(ڢ\b\u0001~aʜop\u0001I2\u001ch%3ۭmc\u0018ňYL"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM7*\u00044C`$", "", "Ahi2", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018(<", "D`[BX:", "", "uZ8uN\u0010", "5dc \\A>\u001b\u001d\u0007\u0006e", "uZ8u<", "1n_FB-", "<df \\A>", "1n_FB-\u0006^\u0007\u0007yZ+\u000b", "uZ8\u0016\u001c\"\"", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uZ8\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "4na\u0012T*A", "", ";`g", "@de2e:>R", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU@X;", "AqR\u0019X5", "2dbA?,G", "4na\u0012T*A\u001b\u001d\u0007\u0006e", "uZ8\u0016M\u0013D](\u0006~gu\u0002\u001a7/\u00018\u0005>\u0010\u001b!P}W\u001d\u0007.3h\u0002*@;kq>", "6`b566=S", "6`b566=S`\u0003\u0003i3", "Adc", "7mS2k", "Adcy\\4IZ", "uZ8\u0016<\u0010\"\u0017\n", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZ8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
final class OpArray {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ElementSize = 3;
    private final int[] values;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1519boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1521constructorimpl(int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1523equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && Intrinsics.areEqual(iArr, ((OpArray) obj).m1531unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1524equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1528hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1530toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1523equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1528hashCodeimpl(this.values);
    }

    public String toString() {
        return m1530toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1531unboximpl() {
        return this.values;
    }

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1520constructorimpl(int i2) {
        return m1521constructorimpl(new int[i2 * 3]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m1527getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1529setimpl(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = i2 * 3;
        iArr[i6] = i3;
        iArr[i6 + 1] = i4;
        iArr[i6 + 2] = i5;
    }

    /* JADX INFO: renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m1522copyOfpSmdads(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2 * 3);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        return m1521constructorimpl(iArrCopyOf);
    }

    /* JADX INFO: renamed from: forEach-impl, reason: not valid java name */
    public static final void m1525forEachimpl(int[] iArr, int i2, boolean z2, Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        if (i2 < 0) {
            return;
        }
        if (z2) {
            for (int i3 = i2 - 1; -1 < i3; i3--) {
                int i4 = i3 * 3;
                function3.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 * 3;
            function3.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr[i6 + 1]), Integer.valueOf(iArr[i6 + 2]));
        }
    }

    /* JADX INFO: renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1526forEachimpl$default(int[] iArr, int i2, boolean z2, Function3 function3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if (i2 < 0) {
            return;
        }
        if (!z2) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 * 3;
                function3.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
            }
            return;
        }
        for (int i6 = i2 - 1; -1 < i6; i6--) {
            int i7 = i6 * 3;
            function3.invoke(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr[i7 + 1]), Integer.valueOf(iArr[i7 + 2]));
        }
    }

    /* JADX INFO: compiled from: OffsetMappingCalculator.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PM7*\u00044C`\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "\u0013kT:X5MA\u001d\u0014z", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
