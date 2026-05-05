package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,o\bDJh|\u0004O\u00158\u000b<Ȑ\u0007\"2\u0017\u007f\u0007|jA0RnP.XVB%y~L$\n#\"GIY2}P\b\u007fRul\u0007J\t\n\nƤ\u001eK\u0007pDQe|m\u0014%1pwm:mqCʠn}^\r062:\u0010\u0004/\"XO@z\tGc\f@/ptH\\%MK#X\u0006̧$\u0001,g\u007f\u0019DT\u0005]h.K\u000byF^)u/+U;M\u00053\u001b\u0004y&;DG7+$\u0002\u000b5Y\fE\t?\u007fK\u001dhU&[]yWDg\u0018\"%/_\u000fsqTd\u0015Sp\fU<}s\u0012ַ\u0014߭{z\n\u001fT+\u001c\u0019?P>1*h\u001e\ra|!ZhX\u0012bR\u0002\u0011`d\u001fS\u0007c/G/~Q\u0010:_NѼ\u007f\u0005\u001b3C\r|ďsT<_kÒ'ɐU1Y̵]T\\\nq=\u001c\u0003GèTò\b0OĉO\b\u001f//%eZ\u0010\u05fbsȠ\u0006HLϙ\u0017\u0011njki\u0001G\u0017̏Aގ;*\u0011ȱʗHz"}, d2 = {"\u001aN6,@\b1MukVG\n_l\u0018Gy\tW\u001eo\u0001\u0004", "", "\u001b@G,5\u0019\u001a<va^G\u000evi\u000bCn\u0012h", "\u001b@G,5\u0019\u001a<va^G\u000evi\u000bCn\u0012h:hz\u007f7]\b&_\u0005", "\u001b@G,F\u000f\"4\b", "7mS2k\u001a>U!~\u0004m", "7mS2k", "AgX3g", "/cS\u0012_,FS\"\u000eVm\u0010\u0006\b/x", "", "", "\u0013", "3kT:X5M", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u00071R9\u001a&d+@\u0003l.\u0018`$LLL;2", "4h[AX9-]", "<df\u000ee9:g", "<df\u000ee9:g\u0003\u007f{l,\f", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#'\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e%\u0017gR", "@d\\<i,\u001cS \u0006Vm\u0010\u0006\b/x", "1d[9<5=S,", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i2, int i3) {
        return (-1) - (((-1) - (i2 >> i3)) | ((-1) - 31));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i2, E e2) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2 + 1, i2, objArr.length);
        objArr2[i2] = e2;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }

    static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i2, Function1 function1, int i3, Object obj) {
        if ((2 & i3) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<Object, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.Companion.getEMPTY$runtime_release());
                }
            };
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < objArr.length) {
            CommonFunctionsKt.m3763assert(i5 <= i4);
            if (((Boolean) function1.invoke(objArr[i4])).booleanValue()) {
                objArr2[i2 + i5] = objArr[i4];
                i5++;
                CommonFunctionsKt.m3763assert(i2 + i5 <= objArr2.length);
            }
            i4++;
        }
        return i5;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i2, Function1<Object, Boolean> function1) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            CommonFunctionsKt.m3763assert(i4 <= i3);
            if (function1.invoke(objArr[i3]).booleanValue()) {
                objArr2[i2 + i4] = objArr[i3];
                i4++;
                CommonFunctionsKt.m3763assert(i2 + i4 <= objArr2.length);
            }
            i3++;
        }
        return i4;
    }
}
