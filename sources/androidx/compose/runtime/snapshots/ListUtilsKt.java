package androidx.compose.runtime.snapshots;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njG;LeN.ZS8\u0018s{BBc$wDCU0}*\t]Tog\u0005Jb\u000bI\u0013\u000e\u0016\u0007\r4I[\u0003e\u0012\u001d>JoE5UoKYhҚN<.݅:8(\u0004!\u001c0Ϻ\u001ev#Gy\rz0\u001frjV\u001bP\u001d\u001aX\u0006n2\u000f\"tu^8Xl$:?%\u0013ipT=^^\u0002\u0014\rТX'\u001b}yT9HO5C.s\u0005\rѸi?+E\u0002?\u0015hm'YS$gDc\u0018 %-_\r$r6^\u0015Q\u000f\u0015U0\u0016ҫQַ\u000e.\u007f~\u0002\fL\u0004\u001c\u0005?~<92f6\u0017SvxԟNP*dR\u0002\u000ba|\u0017S\nc;G&~]q=)N}{\u0015\u000f.#/wO`\u001bזfڀ\u001bZ\u007fU7PP=VM\"+Kz\u001cvr\u0004:\u0004vG.9\u001c\u00134Ϗ37\u0004?3#{\u0002\u000fD\u0016\u00015\u0006v^\u0002sXQ2}DFҊ\r\u0016`Tt\u000bqadZ2\u0017s.d\t\u000e\bY lyL!S\u0019|]/Ȋpܗ]\u0010-3l6iny\roolFMQ\u0012\u000f\u0002T|ܝM<\u000b\u000bhhRSRZ\u000b2RBV~(\u0004\fF^\fY2Os,4Z0Ga[Ǿ\tٟBG\u0005\reYx\u0010\rSK`\u0011~<t7\u007fp^vבuxq2\rb2-\bQc#Vk0|L\u000f3\t\u000fs.VwNWL3\u0016\u0006W\f D\u0019g_uˌ\u0019Ä~/:\u00063D\\rsPe`5\u0011\u0015\f\u001f=x.. zx<fzL_T]\"%h!:(f\u0006טoF\u001bIiS\u0019sfO\u0003\u0005i<\u00158+\u000fO.3\u001a\b.\r7=Cm\u001d&y$/[y\fn6Є\u007fʯ\u000f,|i\n+s\u0016}aiY@UPI \u001a^$*З\u0011Bht}\u0007P$\\\u0011aI*dOX`S\u001b1\u000efM,;z\u0007_H/\b}zI\u00100yC\f1vCS\u0017}Ymm{it\u000bx\u0015:\u0011\u00021|14=N\\\bh\u000f0\u0014\u001406oJ\u0013\u000bB\t2UD<6\u0011sho\u0006\u001e~\u0018To\u0011'2\tsKX\u001eT'blG3e\f`Ճ.\u0001\r1K~\u0007XI\u0005\u001cjt1iѢ\u000fSE\u000f+l_~-%YN\u0005?!(f\u001e#E\fIy\b<\u0004UG\u0006k\u001e\u0012h\u001e\u0003\u001dP739\u007f\u0017\u0010|6^\u0019u|N\u0013\u0006BlXN0J\u0017z+\u0014l\u001e\u0015\u000b'S\u000b}r/\\N>7S\u001c\u0011\u0017r/\u001d\u000b+h\rɑEHCRUOz\u00167{\u001eyi\b(\"&ٴ\u0012tA^]\rt0\u0006!J\u0018\u0002\u0016)\u00027\u001d\u00010\u00122b\u0001\u0003\f>\b|O\u00125\u0012\u0013%\u007f\u001a|g̹-ߟl\fJOnw\u001aczb\u0007\u001a\u0019*~7f{~-\u0017C71m0\u0019̽h:1U&W\u001f&<\u001b6!F\b))>Y\u0014z~ogi\u001d-?kpaA4b \u0014\u001e@\u001c2/\u001bӐ\u001b͊VSFh\u000f[|Be\rv\u00076\r\r\u00129\u0016\r~\u000f^?<THxڽr/_\u001f/]\u001dG'\u00072O\u0010\u008eМ5|"}, d2 = {"/o_2a+\u001eZ\u0019\u0007zg;", "", "\"", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "3kT:X5M", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKY.i(\bZ\u0015\b|(\b\b\u0014/n~$xG\u0001l}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry25", "4`bA43E", "", "", ">qT1\\*:b\u0019", "4`bA45R", "4`bA90Eb\u0019\f^g+|\u001c/d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "4`bA96K3\u0015|}", "/bc6b5", "4`bA96K3\u0015|}B5{\tBe~", "4`bA:9Hc$[\u000f", "", "\u0019", "9dh X3>Q(\t\b", "4`bA=6B\\\b\t", "\u000f", "0tU3X9", "Ad_.e(M]&", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006R0@Y\u0007\u001f3j\u001d.#*@gE\u001a^o]B\t-\nQr45LZ<\\[p=ix_\n_'V\fUJ&8\":\u001b\u0015\u001aI\u000eKh\n\n\u0016c\u001colSRYNu\u001ew\u000b\u0007kBfMySQEk(daC\u0004a6K ]x\u0015$j\u001a\f\rw`~r^\ngpE\u0019P\u001f*H|bJN9ZM|p [\u0005u!6b}9>\u000e\u0014=(Eh\u000fT3m\u0002E}\u0011=X\u000b.\"?>\\\u001bVnuu=\ne&a]", "4`bA=6B\\\b\thm9\u0001\u00121", "", "4`bA@(I", Global.BLANK, "4`bA@(I<#\u000ecn3\u0004", "4`bAG6,S(", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function1.invoke(list.get(i2));
        }
    }

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(list.get(i2));
        }
        return hashSet;
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function2.invoke(Integer.valueOf(i2), list.get(i2));
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(function1.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, Function1<? super T, ? extends K> function1) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            K kInvoke = function1.invoke(t2);
            HashMap map2 = map;
            Object arrayList = map2.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t2);
        }
        return map;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((1 & i3) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence2;
        Function1 function12 = function1;
        int i4 = i2;
        CharSequence charSequence7 = charSequence;
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
        }
        CharSequence charSequence8 = (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? "" : charSequence3;
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i4 = -1;
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            function12 = null;
        }
        return fastJoinTo(list, appendable, charSequence7, charSequence6, charSequence8, i4, charSequence5, function12);
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            T t2 = list.get(i4);
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            appendElement(a2, t2, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t2, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t2));
            return;
        }
        if (!(t2 == 0 ? true : t2 instanceof CharSequence)) {
            if (t2 instanceof Character) {
                appendable.append(((Character) t2).charValue());
                return;
            } else {
                appendable.append(String.valueOf(t2));
                return;
            }
        }
        appendable.append((CharSequence) t2);
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = function1.invoke(list.get(i2));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, Function2<? super Integer, ? super T, Boolean> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (function2.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (function1.invoke(list.get(i2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> boolean fastAll(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!function1.invoke(list.get(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
