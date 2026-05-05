package kotlin.collections;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D߬)\u001e\u007f\u007fLDq\u0011\fA\f1\u0013.P\u0005*ܥ\u001aw\u0015\u0005r96GmHDR[*%k\u00044*\\,qQZ]ڼ\u0006\"\u001fOVg}nRҙ\u0013C\u001d\u0015\u001exp/QU\u0007]\u001a\u000fHBwЀ;M}މA`zI\r H\"@y\u001b\u0001\"*N\u0010~zQX\u0014\u00126Ex:`\u0016U\u00050\u0012\u000e>&\u0003&\\}N>HraB/1\u001dqĩV'u0\u0005ձ%\bb0%|q ;@}:C+s\u0005\rѸiD3C\u007fG\u001dhU+[h\u0002bNs\u0010%%:}\u0011ǁv0b\u0012af\u00125;QiQv\u001d8y\u000b{SA2\u001aLαNό,Կ~I\u001cC\rxcB`\u0002%G.\f\u00028\u001dӛ\u000e8[=)piai\u001d~V\n\u0010%93\u0012~0\nX\u05f8d\u001f!a\bW7_P?NT0hMo\u0014p)\u0007X\u0010vϢ\u0006ôz߾F43IsI3#{\u0002\u000fI\u0016\nmfxUyR\u000fE\u0001\u0003690\u009e\u001a_\u000bߧ\u000b\u0004\u0004bjD!]\u001ed\u0007D\rA3E}L#5\u0010\u0015TG}\u000bOc܃34\u0017Gg\u0004\u0004\u0016g=d2EQ*\u0015\u0010h\u0017\u0014\u0006AИ\tXtYkXht@(BJz\u0010>\u0015rT,\u00158ŭ\u007f5d0?3t\u0015v\u0007N_G{\u0017zr\u007f \u0007d94\u0005y$;\"/alr\u007fg'eZ\t˃&-Gn{ӯ,Ǘ!ֻؗ|+\u000f\u0005y~WgZGjk.:c\u00148\u001c*;a/\u0004,=\u0005I4\bΏSe#\u0003WL B\u0013\u0014\n\u0017Kn>i\u0018j7E\u000f{ZQd\u0017P\u0013\r~ן\fd\u0006\u0017(Ç\u0001ūbҺޯ[FQx\tXLNF{#\u001e6D\u000f\u000e:\u0005E1S)3\u0015&3]+\u0012ew\u0010F}r\u000f,u\u0014\u0004rϣ݁sb_~JlFgq\u0005N$4lIGv\u0001\u0018\nHކB\u0012cPO\u0005\tZHM\u00110,f76\u001b\u0013naJ\u0015\u007f}z3\u000e@:ʕ\u0382\u0018^QH)]a\f\u0006s[^\u001bJU\u000f9\u0002Qp\u0018ΒK%njp.H\f\u0004\u001aFA\u0002g3B)&:ɶJ\rQ͗Z\u0002/\u001e \u0018Lo\u0011'2\txi\\.V~ִdM5pSu92\u0011\u0003\u00152.x{63\u0004fTuh҅\u0005S+/3\u000e]&~+;Fd9a-\u0007\u0007+KcŝW\u0007^\u0004uH\u001eq}4P\u001a\u0013\u001c\t\u001dê=Q\u001f\t\u000fal2mj^f\u0007\u0012-W|(I\u0005\u0001Մ\u001cA2\u000f98\u007f\u0007}wEV^}=B*\u0003-Co\f:\u0013\u0004H1,L:ϦAIx:?\u000fe}S\u0004\u0018\"0'JyOmw\u0010lŊk \u0001ϋw.\f\u00103+V0\u0006>J;w8?(8U\u05ceA\u0007Cng\u0001\u0010)P+1k\u0016B\u0012m' \u0004l*sό\u000f\u0003tWn\u001d|Xh\u001d7C}2!br:?WP\\\u001f,,\u0015T#f\fpV(O\u0012l7kϪ_\r1]\u00040o`HRL\u001aex\u000e\n8\u0005@\u0015ir\u0014=|,j\u001eZ]\u001e`z(+y:)4~\u0005Ĝl\u0016;<Vv$c?7_$\n#\u000e֜ԥ\bEWX9\u0003`r37`\u000f\u0010*|֫\u0011?\u000bz\u0010,R\t9\u0005\u00162]Jbe2' )\u001e|\u0011ZcYHF\u000eϴ!\u000eW4\tm\tFl\u001e\"ԝa3\b\u001eo7E>\fo\u0015EMj\u007fWU0\u0007|\u000f:Wy_oÂw7\u0001ZGK}Nofi)UgRھ\u001a\u0007\u000eP\u000fOsVUfZOeK$ycl\u0018\nM(T\f{#\u000erIHXc\rPd,o\u00106,Fn\u000b(Wn\ts80\u0018$\f(i\u0015LA)\u00189PDϠ;q/K]j\n\u000b\u000b\u0012sM_\u0017\u0016-C\u0019\u0013\u000f\u0016vn1yx[Wt_R\u0012:\tj8g6\bsXYX\n]\u0018Zcx\u0018\u0006Q\u000e\u0014١\u0016\r\u001b>\u0010\u0017`\u001c\u0018`K\u001cGM|˯Da\u0019YGa\u0019|7*n0R\fQBDgp\u001d\u0012\u007fZ`[\u0018aM$GUOn}7\u001cW\u0018U\f+gxsWU \\m?9\u000b{wp5\u0014`5i'Mri-\u000ez->G\u001dC*.h\b$D+\u0005>P?ث.ԋ/ߐ\u0085T~h\u0003u+*_UUC'\u001f9hۙiiʒ/7]1z[3/\t\u0002I\u0015o\u0019C\u0015,hQ83u\u001d1\u0005\u00016\\\u0010ʘ\u0003\u0006\u0003\u001eFyJgs&M5ϕY2~iO\u0019]@-\fH'jJ3&hf!.6\"&H|@do`Qi\u0013vB1S)<Rˠ\u0012\u0083T\u0381ܖ\n\u0011pdMRm\nD.\u001fJgQpɸ8j\u0018l\u0005[]EqzG>wީ\u0017{ym^\u0007Q\u000b\u001a^\u0019]ڴN\u0018*\"-(q{\u000f.F\u0016\u0004c4ؒy؆`\u001da>qžty\te|@i?J\u0091\u00055t\u001b\u0016!aFr\t'uvG0drԮ5;pp)\u0003\u0011K(\u001cB=\u000bԤ;\u0007A\u0007:g2Um%\u000eO4\u000e\u000bc}í\nb[>\u001dq<|[\nTe!\u00043ϾSH#y{JLjB,-!,\u001cn(,\u0014ۨ\u000b\nTvcTauewz}Q$`ѩ]Qk/`\u001b\u001fL\nBM\u001f\u007f\u001d^|'4ߖ\u0014$:H\f7|A:\u0001a&\"SB-6),:>%-\u0003 ˏ{JQN\u0012f!]4N&\u0007\u0010\u0001\u0590E\u0006\"$/%\u0016\u0017G!V7b2P'!\u0011<ΣXk\u0017~5\u000bu\fuy$\u0014h2Ӈwjui:HK]Ҿ~J52w۲{wlɃ/\u0019"}, d2 = {"7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "", "5dc\u0016a+BQ\u0019\r", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ.u\u0018K})>#\u000b\u001c@o\u0016<\u0017'Dz!\u001a\u001eja\u000f", ":`bA<5=S,", "", "\"", "", "5dc\u0019T:M7\"}zq", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\f", "\u001ahbA", "Ahi2", "7mXA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001btc.U3>:\u001d\r\n", "", "/qa.l\u0013Ba(h{", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#Y-Di*\u0015QQJA", "0tX9W\u0013Ba(", "\u0013", "1`_.V0Mg", "0tX9W,K/\u0017\u000e~h5", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n[9X*MW#\bih\b\n\u0016+y]2\u0004H\u000b zOz\u0015", "", "1n[9X*MW#\b", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=V\u00138\b!~`y)97\u007f+RC9z\n", "/qa.l", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0014{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", "3l_Al\u0013Ba(", ":hbAB-", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", ":hbAB-'](g\u000be3", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~@\u0002.FC", ";tc.U3>:\u001d\r\nH-", "@`]4X\nAS\u0017\u0005", "4q^:<5=S,", "Bn8;W,Q", "@`]4X\nAS\u0017\u00059<6\u0004\u0010/c\u000f,\u0006I\u000f|&AikF},5W\r$Av$\u0014\\", "Bga<j\nHc\"\u000edo,\n\n6o\u0012", "Bga<j\u0010GR\u0019\u0012do,\n\n6o\u0012", "/r2<_3>Q(\u0003\u0005g", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\n", "0h].e@,S\u0015\fxa", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u001b*^?\u0005{C\"\u001c2?C\u000fn([r6QY$\u0010@\u0016V", "1n\\=T9Ba#\b", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006T/=dy-3j\u001d.#'\u001f/\u0018", "0h].e@,S\u0015\fxa\t\u0011", "\u0019", "9dh", "Ad[2V;H`", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006T/=dy-3j\u001d.#'\u001fR:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry2(", "1n]AT0Gat\u0006\u0002", "", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/i1\u0003Td \"W~|P\u0002%C/", "7e4:c;R", Global.BLANK, "\u0011", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}My\u001dCz.~^\u000f(\u0001n&7KR?u=,^IqB\u0005r0X\u007fq\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D", "7r=<g\fF^(\u0013", "7r=B_3(`x\u0007\u0006m@", "=oc6`0SS\u0006~v]\u0016\u0006\u0010CL\u00046\u000b", "=q4:c;R", "Agd3Y3>R", "", "@`]1b4", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {

    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDJc|\u0004O\u00138\u000b4C\rӬD\u0012&\u0006\u0007l?ӄReh:XR8\u0010\u0014\u0002D&k$8DiWJ\u00020\fgN.g5RҼ\u000fE\u0015\n$}"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u0019", "", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function1<T, Integer> {
        final /* synthetic */ Comparable $key;
        final /* synthetic */ Function1<T, K> $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1 function1, Comparable comparable) {
            super(1);
            this.$selector = function1;
            this.$key = comparable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(T t2) {
            return Integer.valueOf(ComparisonsKt.compareValues((Comparable) this.$selector.invoke(t2), this.$key));
        }
    }

    private static final <T> List<T> List(int i2, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(init.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    private static final <T> List<T> MutableList(int i2, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(init.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    public static final <T> ArrayList<T> arrayListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new ArrayAsCollection(elements, true));
    }

    public static final <T> Collection<T> asCollection(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayAsCollection(tArr, false);
    }

    public static final <T> int binarySearch(List<? extends T> list, int i2, int i3, Function1<? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iIntValue = comparison.invoke(list.get(i5)).intValue();
            if (iIntValue < 0) {
                i2 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iCompareValues = ComparisonsKt.compareValues(list.get(i5), t2);
            if (iCompareValues < 0) {
                i2 = i5 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final <T> int binarySearch(List<? extends T> list, T t2, Comparator<? super T> comparator, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iCompare = comparator.compare(list.get(i5), t2);
            if (iCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, int i2, int i3, Function1 function1, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = list.size();
        }
        return CollectionsKt.binarySearch(list, i2, i3, function1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = list.size();
        }
        return CollectionsKt.binarySearch((List<? extends Comparable>) list, comparable, i2, i3);
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i2, int i3, int i4, Object obj2) {
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i3 = list.size();
        }
        return CollectionsKt.binarySearch(list, obj, comparator, i2, i3);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> list, K k2, int i2, int i3, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.binarySearch(list, i2, i3, new AnonymousClass1(selector, k2));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i2, int i3, Function1 selector, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = list.size();
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.binarySearch(list, i2, i3, new AnonymousClass1(selector, comparable));
    }

    private static final <E> List<E> buildList(int i2, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder(i2);
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final <E> List<E> buildList(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final Object[] collectionToArrayCommonImpl(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int i2 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    public static final <T> T[] collectionToArrayCommonImpl(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = 0;
        if (collection.isEmpty()) {
            return (T[]) CollectionsKt.terminateCollectionToArray(0, array);
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) ArraysKt.arrayOfNulls(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(collection.size(), objArr);
    }

    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.containsAll(elements);
    }

    public static final <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static final IntRange getIndices(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static final <T> int getLastIndex(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    private static final Object ifEmpty(Collection collection, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    private static final <T> List<T> listOf() {
        return CollectionsKt.emptyList();
    }

    public static final <T> List<T> listOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt.asList(elements) : CollectionsKt.emptyList();
    }

    public static final <T> List<T> listOfNotNull(T t2) {
        return t2 != null ? CollectionsKt.listOf(t2) : CollectionsKt.emptyList();
    }

    public static final <T> List<T> listOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.filterNotNull(elements);
    }

    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    public static final <T> List<T> mutableListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt.listOf(list.get(0)) : CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == 0 ? CollectionsKt.emptyList() : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == 0 ? CollectionsKt.emptyList() : list;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        }
        if (i4 > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
        }
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt.toMutableList(iterable);
        CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    public static final void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
