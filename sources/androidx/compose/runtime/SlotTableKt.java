package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,o\bDJv|\u0004O\u00068\u000bDB\u0007\"B\u0012\u007f\u0007ljA0RxP.XT2\u000fy\u0005<$a%yCIs\"}(\nWN}gvJp\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012%2JoE5UoS9ht<\u0019(20R\u0002\u0005\u0007\u001a2H\u001e\u0003\u0003CQ\u0014*>N\u0003RR;L5\u001e \u0019V /\u001d#gfVV\u0001u:]8+oRP7_^\u0014{#vX5%\u000faL*p;C(=S1\u0006\u0019[W\u0015M\u000bU\u0005\u0017<O+w\u000e\b:f\u001b,\u0015YNS]\u000b8j!i`:&SO\u0012e\u0001\u00126\u0013\u0013{;;J\u000e\u001e9VKE\u001a\u0015&63#\r\u0004D^\u001dvB.y(6/7\u000eRC9I\u0005yai3~;\n %\u001eQ\u007f5!sf\u001c\u0001-\u001b\u0003vy1\u007fZmL\\%q=\u001c\u00037b\u001aD\u0012Q_\u0006?}!.E$e}a#O\u00062NJg\u0005(xh\u0002h\u0019HXW|:O*7\u000bzFjʍyu|h<\u0013]\u001c\u001b,,.{&lyL!k5-v\u0019yxuu\u001651v7 \u0014{\u0010g9\rQcz*߇gj3\"iTd\u001bW-gs\u000e`٢6GZXz\u0012\b{\u000bs:9\u001bE\u0002\u001eD,w>;<x\u0013,jY\t\u0019ajhV$d54\u0003\u0018B#2Gˉbʼsg\u0007tD)nNECg4GS}2x6\r#5,\"&0m\\I\\lD#4#P\u001a(gi/k\u0012?\u00037a\u001a-sK9ei\u0007 W\u0013|(<cx>i\u0018j\u001fY\u000f\u00113Ud\u00192v\r \u0002/\u0015\u0004\b\u0010^zub\u0005\u000fimar1XlXF.\u001d%.'\u0011oP*c_\nڲ#.\n\"b-a\fh\u0018.(|?*\u0003\u0001\u001c,\u0012\u00156bio@oPI\b}f\"R\u00073FV\u0006\u0010\bp\bz\rKbO\u001a\t\\HO\u001b/,e5N5p\u0005uj\u0019u}BQw*\"BD\u0014vU3GeS\u0016\f\u0016K\u000b%z\u0013\u0018&\u00141\u001d\u0011b=8he\u001a!04\u0012@6oU\u0013\tJ$<4Z;N\u000b[fw>(z.d\b\u000fELrwIq&T'[\u001dH\u001d#S\u001a9*/\u001473L\u0013e5\u0013\t^T]bb\u0005a5!\u001b\u0019N/j3e\\Tg9X\\\u000fF]]qg2:\u0012\u0004Am\u001a\u000e<<&:5BF\u001aiU\u001f\u007f\u000f0\r\n\u001cdfv\u0005L~R|@Q~)\u0017>@\u0018*#\u0019}q6bE^\\\u0010OCH\u007f?DW!<\u0001qa3-44s=a\u0005\"e\u0014]c=\u000e\bN\u001fU&\u001d!\u000bq>l\u0010])].qDaH\t+z.CFJ#q2>\u00188_\u0002a/A\u0005Bq\b#P'Y\u001adi{l\u00078{l\u0012m\u0006\u000f\u0011\u0016IV(msP5\u001b5\u000eF\u0013\u0007Yb\u0011\u0002:\t\u0015\u000e/-&M5NbA*]%\u0001v{Qk\rY.\u001aL\n1^lN\u0004%y\u0004'BTV\u0014\u0002VePrKtlpV6^\u0019B\u0015x\u001aD,|-G%\u0011+FT66d]6A\u001f\n'wd\u0015\u001f]IT wRW-Eo#oVu9\u0003h|%\u00048]!r.fr-^nK^?_4ot\u0003TJsZj\bZ+>\u00175ZFCV\\H\u001b\u0002QKk'V\u0019\u0015f\u0005\u0018\u0017)7zQ\u0002RX'e\u0007\u001dA\n1\u001agR^#'=U\b\u001b\u0006ek)C\u0015d':\u0001,J\u0017kq\u001e'g<KEELx\u0004b(\nM>T\u0010\u0004k\u0018KAJ:_\u000b?\u0005=\u001e\u0004><D9\\#uk!s8F\u001a\u001c\u0002\u007fsab@A\u00141VLuEl5\u0012uh(Wt\u0011SaO\u000f4(y\u0017\u0015*]@X+w\bu/\u000bwl\u0017\u0002\u001fR2\u00105*KNlB\u0006[0\u001bc\u0003\u0005{!w\u0010f'5\r2\u0012aVn\u001bx\u001dF&{zT\u0007tx{@)\u000bX)20FB: .\u0016\\bG\u0006\fex\u0015A2wwO_*V* c\u0011s?\u0014w\u007fjuT}q\u0007Wi7\u0019\tbXcd\r\tc4cdY\u0014FjCHU*V\u001aXm.\u000es~x\u0014R\u0014\\(\u001c/`4^\u0012rC\f\u001fb\u001fUo#:\u00172\u0011L\u0004d?Eg[|mm#[w2\u0007\u001eT1\u00139\u001d\u001a9J=\u0002bI>*\u001d\u0005I\u0004\u0017\u001eM\u001e\u001eyJO.6C=Tcl\u0005d\u0006\u0019wK\rǋ8'R\u0005iڤ5ԝ\u0017i\u0016݁\u007f\u000fZ6n)vJ0˷9߁n\u000f\u0003Ǟ,:\u001a9m\u0006k\u0005gߍnް?_HٺN|\u0017Igj*)<ݘ9ڱ]MMΎ\u0016%L4\n\u0011\u0012N6տAӐ`XF܂w2N\u0017\u001a\u001aK%8҈\u001bׅ4\u0017]ۀ\u000ev\u0002Yx\u0011\b3BƁ7Әvflت\u0004JJN\u0005\u0019\u0015NTܱ$ɥf\th͟hM\u001ei\u0005,U5\u001fЦkʑ\u0005Ki߫4CR~;ga9xڦt̏a%O͆&\u001axj\u0010\u0015*\\\nͮ_҈0|\u001dџ^r\u0001\u000e\u0005\u0005{/ZΒ\u0002ȭJZH˸Mf5x\u0001\bX\rbϡW؞rSZރ\u0016+\u0001p\u0017#L\u0019\u0018\u0091\fݦ%\u0013\u000bƅ\\\u0014@Zpz\u001dW3Ï\u0001߹\n\u001f\u001a܀\u001cAzO\f{aVHؽ\u0007ߚ\")\u0006\u0093\u0018,\u001bz*\u0004\u0012IyӾ<ϔ\u0015]6ֽ\u0018\u0013gLqA0\txʹvǬ\u0019'\nؖTV@3;\u0001=5nɚ9ó|%\u0011½ױ3K"}, d2 = {"\u000ftg,@(LY", "", "\u000ftg,F/BT(", "\u0011n]AT0Ga\u0001z\bd&d\u0005=k", "\u0012`c.45<V#\ftH-}\u0017/t", "\u0015q^Bc\u0010GT#xd_-\u000b\t>", "\u0015q^Bc&\u001fW\u0019\u0006yl&j\rDe", "\u0019dh,B-?a\u0019\u000e", "\u001aHE\u0012R\f\u001d7\bx^G\u001dXo\u0013Dy\u000e[4", "\u001b`a8R\u0014:a\u001f", "\u001bh]\u0014e6N^z\f\u0005p;\u007fv3z\u007f", "\u001bh] _6Maz\f\u0005p;\u007fv3z\u007f", "\u001cnS250MM\u0001z\td", "\u001cnS266N\\(xbZ:\u0003", "\u001daY2V;$S-xbZ:\u0003", "\u001daY2V;$S-xha0}\u0018", "\u001e`a2a;\u001a\\\u0017\u0002\u0005k&f\n0s\u007f7", "!hi2R\u0016?T'~\n", "!k^Af&,V\u001d\u007f\n", ">`a2a;\u001a\\\u0017\u0002\u0005k\u0017\u0001\u001a9t", "1nd;g\u0016GSu\u0003\nl", "D`[BX", "/cS", "", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "9dh", "/cS\u000eh?", "", "/cS?X:L", "/tg\u0016a+>f", "1n]AT0Gat\b\u000fF(\n\u000f", "", "1n]AT0Ga\u0001z\bd", "2`c.45<V#\f", "2`c.45<V#\f\t", "", ":d]", "4`bA<5=S,h{", "\"", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4`bA?(Lb\u0003\fcn3\u0004", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOV}\u001dQ~\u0015@\u007fn:j\u0006i8}\u001f,\\GEtBguxj7\u0016g6WB|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "4h]1", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "7mS2k", "3eU2V;Bd\u0019l~s,", "5dc\u001ce\b=R", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5q^Bc\u0010GT#", "5q^Bc\u001aBh\u0019", "5q^Bc\u001aBh\u0019\r", "6`b\u000eh?", "6`b\u001aT9D", "6`b\u001cU1>Q(dzr", "7mXA:9Hc$", "7r=<W,", "6`b\u0011T;:9\u0019\u0013", "6`b\u0011T;:", ">`a2a;\u001a\\\u0017\u0002\u0005k", "9dh@", ":nR.g0H\\\u0003\u007f", "<nS266N\\(", "<nS266N\\(\r", "<nS2<5=S,", "=aY2V;$S-b\u0004],\u0010", ">`a2a;\u001a\\\u0017\u0002\u0005k:", "AdP?V/", ":nR.g0H\\", "AkX0X", "7mS6V,L", "", "Ak^A45<V#\f", "At\\:T9Bh\u0019", "", "Ahi2", "CoS.g,\u001c]\"\u000evb5\u000bp+r\u0006", "CoS.g,\u001dO(zVg*\u007f\u0013<", "/mR5b9", "CoS.g, `#\u000f\u0006D,\u0011", "CoS.g, `#\u000f\u0006L0\u0012\t", "CoS.g,&O&\u0005", "CoS.g,']\u0018~Xh<\u0006\u0018", "CoS.g,)O&~\u0004m\b\u0006\u00072o\r", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final int countOneBits(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t2 = arrayList.get(size);
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (function1.invoke(arrayList.get(i2)).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static final String summarize(String str, int i2) {
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i2, strReplace$default.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int groupInfo(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1];
    }

    public static final boolean isNode(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public static final int nodeIndex(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final boolean hasObjectKey(int[] iArr, int i2) {
        int i3 = iArr[(i2 * 5) + 1];
        return (i3 + 536870912) - (i3 | 536870912) != 0;
    }

    public static final int objectKeyIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 30);
    }

    public static final boolean hasAux(int[] iArr, int i2) {
        int i3 = iArr[(i2 * 5) + 1];
        return (i3 + Aux_Mask) - (i3 | Aux_Mask) != 0;
    }

    public static final void addAux(int[] iArr, int i2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = (-1) - (((-1) - iArr[i3]) & ((-1) - Aux_Mask));
    }

    public static final boolean hasMark(int[] iArr, int i2) {
        return (-1) - (((-1) - iArr[(i2 * 5) + 1]) | ((-1) - Mark_Mask)) != 0;
    }

    public static final void updateMark(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        if (z2) {
            int i4 = iArr[i3];
            iArr[i3] = (i4 + Mark_Mask) - (i4 & Mark_Mask);
        } else {
            int i5 = iArr[i3];
            iArr[i3] = (i5 - 134217729) - (i5 | (-134217729));
        }
    }

    public static final boolean containsMark(int[] iArr, int i2) {
        return (-1) - (((-1) - iArr[(i2 * 5) + 1]) | ((-1) - 67108864)) != 0;
    }

    public static final void updateContainsMark(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        if (z2) {
            iArr[i3] = (-1) - (((-1) - iArr[i3]) & ((-1) - 67108864));
        } else {
            int i4 = iArr[i3];
            iArr[i3] = (i4 - 67108865) - (i4 | (-67108865));
        }
    }

    public static final boolean containsAnyMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 201326592) != 0;
    }

    public static final int auxIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
    }

    public static final int slotAnchor(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 28);
    }

    public static final int key(int[] iArr, int i2) {
        return iArr[i2 * 5];
    }

    static /* synthetic */ List keys$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = iArr.length;
        }
        return keys(iArr, i2);
    }

    public static final List<Integer> keys(int[] iArr, int i2) {
        return slice(iArr, RangesKt.step(RangesKt.until(0, i2), 5));
    }

    public static final int nodeCount(int[] iArr, int i2) {
        int i3 = iArr[(i2 * 5) + 1];
        return (i3 + NodeCount_Mask) - (i3 | NodeCount_Mask);
    }

    public static final void updateNodeCount(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0 && i3 < NodeCount_Mask);
        int i4 = (i2 * 5) + 1;
        iArr[i4] = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - iArr[i4]) | ((-1) - (-67108864))))));
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = iArr.length;
        }
        return nodeCounts(iArr, i2);
    }

    public static final List<Integer> nodeCounts(int[] iArr, int i2) {
        List<Integer> listSlice = slice(iArr, RangesKt.step(RangesKt.until(1, i2), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Integer.valueOf(listSlice.get(i3).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    public static final int parentAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    public static final void updateParentAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 2] = i3;
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = iArr.length;
        }
        return parentAnchors(iArr, i2);
    }

    public static final List<Integer> parentAnchors(int[] iArr, int i2) {
        return slice(iArr, RangesKt.step(RangesKt.until(2, i2), 5));
    }

    public static final int groupSize(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    public static final void updateGroupSize(int[] iArr, int i2, int i3) {
        ComposerKt.runtimeCheck(i3 >= 0);
        iArr[(i2 * 5) + 3] = i3;
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return groupSizes(iArr, i2);
    }

    public static final List<Integer> groupSizes(int[] iArr, int i2) {
        return slice(iArr, RangesKt.step(RangesKt.until(3, i2), 5));
    }

    public static final int dataAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final void updateDataAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = i3;
    }

    static /* synthetic */ List dataAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return dataAnchors(iArr, i2);
    }

    public static final List<Integer> dataAnchors(int[] iArr, int i2) {
        return slice(iArr, RangesKt.step(RangesKt.until(4, i2), 5));
    }

    public static final void initGroup(int[] iArr, int i2, int i3, boolean z2, boolean z3, boolean z4, int i4, int i5) {
        int i6 = z2 ? 1073741824 : 0;
        int i7 = z3 ? 536870912 : 0;
        int i8 = z4 ? Aux_Mask : 0;
        int i9 = i2 * 5;
        iArr[i9] = i3;
        int i10 = (i6 + i7) - (i6 & i7);
        iArr[i9 + 1] = (i10 + i8) - (i10 & i8);
        iArr[i9 + 2] = i4;
        iArr[i9 + 3] = 0;
        iArr[i9 + 4] = i5;
    }

    public static final void updateGroupKey(int[] iArr, int i2, int i3) {
        iArr[i2 * 5] = i3;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i2, int i3, Function0<Anchor> function0) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchorInvoke = function0.invoke();
        arrayList.add(-(iSearch + 1), anchorInvoke);
        return anchorInvoke;
    }

    public static final Anchor find(ArrayList<Anchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    public static final int search(ArrayList<Anchor> arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int location$runtime_release = arrayList.get(i5).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i3;
            }
            int iCompare = Intrinsics.compare(location$runtime_release, i2);
            if (iCompare < 0) {
                i4 = i5 + 1;
            } else {
                if (iCompare <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int locationOf(ArrayList<Anchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i2, int i3) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i2);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i2, mutableIntSet);
        }
        mutableIntSet.add(i3);
    }
}
