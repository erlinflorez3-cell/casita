package kotlin.collections.builders;

import com.dynatrace.android.agent.Global;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яį\u0014D57\u001eq\u007fJDkt\u0012d\u000e0!.J~8,\u001aw\rfr9>JmH4R[*\u001dz\u00044*[,qQN]\u001a\u0004(\u0011O\\\tonX\u007f\u0013C\u0015\u0007\u001ex\u0001,QU~_\u001a\u000f@Kw?9Rw=O`|6\u000b\":\"F\u0017\r\u0001 +P\u0010\rzKK\u0012\u00178@~\\Z҈U\u0005(\u0012\u000e>&\u0004&\\uj>Hr^B/1'qBT1g0\u0013M\u0015FZ'\u0015voӜ3@=;\u001d%i\u0003\u000fRaX\u000b?\u007fI\rؒ/'AI{W<_\u0006Ϭ+ۀmՖ\\\u001b(bӤ__4)1NqK\u0001\u001a8y\u000b{S;\u0014\u0010\u0016'\u000f.[\u001b\u0017\f<5]r2C\t\fފAȗyʫ5Б$ĳ2څ8[kWuޅ\u001dNE\u007fE\u001a$7\u0011r/`l\u000e\u000f\u001bôXw_8\u0012\u0004CH^\u0014gE\u0006\n\u0001d\u0012*:\u0382u\t?\b\u001f8/-G]I#Wj\u0018Grp\u0007\tnski\u0001TP&|#O*7\u0018jHr\u0013\u0004P\u0003^<\u0015[+l\u0007,\u000e˙$\\\u0006Li:\u001e\u007fgh\u0018p}a\u0018WGfmժ5\u0088ް[;dfC\u0006,!o\b\u000f\u001aO>r\u0005\u000fep\\RZڅ,\"@~3 \u00063\\Z\u001c\u0015B?(ʉD.A\u0019\u0013\u0014v;fMO6!_\t#VзՁ7$\t%lz\u0017=h\\\u001f*.\r\u00122\u000b\u001e:-o\f{\u0019nl0'L|Q&/{\u000e\u0007\u007fPWLr\u0017$\u0016B\u008dک\u001e9Wp\u00062\u001dAA20Lu\\\u0001)iY\")\u000b|0ҸKj>g>i\u001fp'ʄߝST\u001dg?q\u0001i d.\u0019\u0012J\ty{TAϵ\u0005]\u03a2\u0007YJ\u0016\u0001\u0010\u0013g6%/\u000fR\u0001Cv['S\u0015>(ڏ\u0019ak18D\b-'&#\u000548qa\bja]8<HI_\u007flZjlKPV7\u0010\bpCd\u0011A\u0016Yd\u001f\\~MS=\f5\u001f,;+\u0007_Hb\b}b4&*<Z\fdvO5\u0013]S\u001eƚ}Ml\u000b\u0001\u000e8\\Bςߎ\u0016\u001cCr\u001fhp\\H\u0006\"7fGI.\u001d>\u001f#b\u0001\u0003ޡ\u000b\fgw[(z.L\u0010\u0013%dZsqٙTTܢ`VV9)XnwB\u0001-\u0015c\"\u0007~I\u0005$E\u001b/ҕ6\u0001aQQ1x'\u0017h;*zSi\u001f6\u000b\u0019\u000b{؏\n͉\u0002\u0530\bG7F4\u0003\u001a\u00120|KHH\u001fG\u0004)_-Ѫ%\u000bڀhNr+Zl`):)-\u0001C\"\u0005\u0010\u001df1O!\u000f)A\u0015e\u0006\u0014[&\u0011\u0019T)=љ\reV\u001bc\u0005c\u000b\u0004Ɩހ\u0018'\u00026\u001cX\fg8\"=\u0003+ \r[\u001c\u0019\"]QŭFu$,\u001a\tIOf\u0018̛Nt\u0001jv$D1\u001a30M\u000fkyZ9N7/r\u0005RK\u001fǍ\u001ae|c%T9;-E\u001f\u001a|\u0011h\u001d7F}D!;rL!a0d!\u0002$\u0015\\˿F\nr)FN\u0012-\u001f,\u0016[UE=PBa_O\u0003.\fb\u0012\u0002\u0014,d(K͇fONd?[\u001b\u0007\u001e\u000e'x6J\r\fW3-\u0003VE)\u0013bL9\u001e-5E\u00017[;\u0002'\u0007LSW\u000f91\u0001yK;@t\b(%\u0017I:+\n\u000e\u0015Z\u000b\t~\u001e+]Jbo2'\u0010ݾ4x݁*KS\u0011\u000b':|&\u0011]yh0L 2(KSCAOֆ\u0011\u0017H\u0006&\u0006Gy1\u070eƽ)*\u0007iI\u001bMgIkh.gv1\u001e'oI]-;mJs<?\f0kz\u0003[\u0016n\u000f\u0018β\u0010ʿ¹\"{[1\u000e>g22w\u000e#.\u007faL8Rt@\u0005y\u001e\u0004n?Db\\#u\f)w\u0018!\u0002\u0018*c\"ȥƍE|\u001a\u000fR\u0006r;z}]M\u0017\u0019;H\u001b=,7=\fo3_\u0003\u001eH\n@YC9awsk7+\u007f\u0014<Bal̖WBi*<,@P*ÅݺqQe\r\u0001\u0018\u001b\u000b\u001cw_''\u007f1/&8cvt<\u00137$ڪd\u07b4D\u0013<`4T\u001a\u001eV:<\\/\u0014\u000eXp!#5Wswڧ\"X\f!S\u0010\n;4:\u001e?\u001eʻW߱\\AQ5\u0011\u0005Xp\u0006\u007fj\u001em/[f;\u00156ӭ;0WVt\u0019@W4(\u001cļTЄHxL٪><>=h~\tO4Ӡ(؞AU\u001d֧O>pRsd?1\u000eǝzדY#5ҼR\u0015\u001e]1\u00139$\ny\tׂuԿ5B\u0014\nbfc\u0010>e\u001e#yJON6C=_cl\u0005\u0005}Y.â\u000bǮ$-,ʧ+&h\t!\f^:m&d<f+XK\u0010˴\u0015W!cQǵ\u000e˻\u0010<m\bC*\u001fzlIIgX2>r\u0019G\u0006Ǫ*3<ݘrڱ]OM+\u0004>\u000fE\u007f7{Wo\u0016~Q\u0013ЙT\u0016\u0006M\u0017Ȁ\u000eÊ!&i҅\u00195>&mc\u001cpJ؆lؕ]4sž5\u0006\u0001t|>\u0012D\u0013\u0094xæjO\u0006ܮ\"Pp1xpvGfأxՑ+6PУi\r\u000fVy\u0017BC\u001bԧ/ת7:*ڣrokN_J4\u0014\u001be\u00063\u0014]a<K@\u0003̮!҂BlzØ\u0005\u0007SZ\u0012~\u007fJT\u0006X\"=\\7m\u001f\u0007X:BQ[ؒp֪VU\u000e!x\u0012\rQn0OaQO1\u0015\u0013\u0019r\u0007HL\u0007\u0004Eˌhï2}\u000e\u001f gLIzp\f\u0004CY\u0002Oj\\4(,\u001aN߀\u0019ܡ\u0016\u0004kˈјSىa"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "\u0019", "$", "", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "u(E", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "9dh@49KO-", "", "D`[BX:\u001a`&z\u000f", ">qT@X5<St\f\bZ@", "", "6`b549KO-", ";`g\u001de6;Sw\u0003\tm(\u0006\u0007/", ":d]4g/", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#9\u001fa\u0018\u0002x,R", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "u(8", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "3mc?\\,LD\u001d~\r", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z#DzA\"\u0015v7", "6`b5F/BT(", "6`b5F0SS", "5dc\u0015T:AA\u001d\u0014z", "\nrTA \u0006\u0017", "", "7rA2T+(\\ \u0013", "7rA2T+(\\ \u00139d6\f\u00103ny6\u000b?\b\u001b\u0014", "u(I", "9dh@", "5dc\u0018X@L", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "9dh@I0>e", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z);\u007fBs", ";nS\u0010b<Gb", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "D`[BX:/W\u0019\u0011", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z47rD\u001e#>", "/cS\u0018X@", "9dh", "/cS\u0018X@|Y#\u000e\u0002b5v\u0017>d\u0007,x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "/k[<V(MS\nz\u0002n,\u000bd<r{<", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "0tX9W", "", "1gT0^\u0010L;)\u000ev[3|", "", "1gT0^\u0010L;)\u000ev[3|G5o\u000f/\u007fIz%&Fv\u00129", "1kT.e", "1n\\=T*M", "1n]AT0Gat\u0006\u0002>5\f\u00163e\u000e", Global.SEMICOLON, "", "1n]AT0Gat\u0006\u0002>5\f\u00163e\u000ef\u0002J\u0010\u001e\u001bPi\u001cKu,9V", "1n]AT0Gax\b\nk@", "3mc?l", "", "1n]AT0Gax\b\nk@;\u000f9t\u0007,\u0005:\u000f&\u0016Ns\u000b", "1n]AT0Ga~~\u000f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1n]AX5M3%\u000fve:", "=sW2e", "3mbBe,\u001cO$zxb;\u0011", ";h]\u0010T7:Q\u001d\u000e\u000f", "3mbBe,\u001ef(\fv<(\b\u0005-i\u000f<", "<", "3mc?\\,L7(~\bZ;\u0007\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001btC+\u0019ho\u001d\u0016p\u0002", "3mc?\\,L7(~\bZ;\u0007\u0016mk\n7\u0003D\n\u0011%Vn\u0015@s", "3pd._:", "", "4h]1>,R", "4h]1I(Ec\u0019", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "6`b5", "6`b566=S", "7r4:c;R", "9dh@<;>`\u0015\u000e\u0005k", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002!kH,xwn\u000f", "9dh@<;>`\u0015\u000e\u0005kj\u0003\u0013>l\u00041uN\u0010\u0016\u001eKl", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", ">tc\u000e_3\u001e\\(\f~^:", ">tc\u0012a;Kg", ">tc\u001fX/:a\u001c", "7", "@dV6f;>`\u0001\tyb-\u0001\u0007+t\u00042\u0005", "@dW.f/", "<df\u0015T:AA\u001d\u0014z", "@d\\<i,", "@d\\<i,\u001e\\(\f\u000f", "@d\\<i,\u001e\\(\f\u000f\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "@d\\<i,!O'\u0002Vm", "@d\\<i,=6\u0015\r}", "@d\\<i,$S-", "@d\\<i,$S-=\u0001h;\u0004\r8_\u000e7zG\u0005\u0014", "@d\\<i,$S-Z\n", "7mS2k", "@d\\<i,/O \u000fz", "3kT:X5M", "@d\\<i,/O \u000fz\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "Ag^B_+\u001c]!\nv\\;", "3wc?T\n:^\u0015|~m@", "BnBAe0GU", "", "D`[BX:\"b\u0019\fvm6\n", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002,g;.\u0015vEH\u00149", "D`[BX:\"b\u0019\fvm6\nG5o\u000f/\u007fIz%&Fv\u00129", "EqXAX\u0019>^ zx^", "\u0011n\\=T5B]\"", "\u0013mc?\\,L7(\f", "\u0013mc?l\u0019>T", "\u0017sa", "\u0019dh@<;K", "$`[BX:\"b&", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final Companion Companion = new Companion(null);
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private MapBuilderEntries<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private MapBuilderKeys<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private MapBuilderValues<V> valuesView;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4\u0012}\bnjG6LeN4Xݸ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\ur\u0007J\t\u0012s\u0013\u0014\"\u0011jZP\u001cx& \u001d?Zom:}sKGxtd\ff2rV\b\u0006\u0019&:J v)F[\u000e\"0nshTcˠ\u0007ܨ\u0016\fFĨ\u0019 bk\\;\u0019xk@G#1p\u0019úyۢ4|Uε\u0017`5\u0015\u000faL2\u0017ʽ\bչ)S\u000bޗ#gM\fWqk\f?ѪyȅMs_̬)\f\"\u001fCO;dI̩/ԇU`\u0014ʬˬSr"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u0013l_Al", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "", "5dc\u0012`7MgW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}", "u(;8b;EW\"Hxh3\u0004\t-t\u00042\u0005NJ\u0014'Kv\r<\u00043~Ay+\u0014}\u001a5LCHA", "\u0017M8!<\b%MvZe:\n`w#", "", "\u0017M8!<\b%M\u0001ZmX\u0017ir\fEy\u0007_.or\u007f%O", "\u001b@6\u00166", "\"N<\u000fF\u001b(<x", "1n\\=h;>6\u0015\r}L0\u0012\t", "1`_.V0Mg", "1n\\=h;>A\u001c\u0003{m", "6`b5F0SS", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i2) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(i2, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i2) {
            return Integer.numberOfLeadingZeros(i2) + 1;
        }

        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.Empty;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>26B\rG4ߚ\u007f\u0007|jA0JeP.hS2şs{B$cҕyCQU\"}8\tWȞog|Pb\u000bI\u000f\fǝ\u000f̓TK[xk\u001174HpM3}{M;pt|\u00040428@\u0005/\u001bZZ \u0005\u000bO[\u000e\"0\u0007oJT\u001dMK\u001a@\tl\"A5lw\\:`xm<?#9iRP7_f}{\u0012ТX'\u001b|*19GOA%'c\u0003=RkA\u0013?(>3pmݧ+\u0012\u0004e?p\u007fB\u001f[W\u001bh\u000b*\u000b\u0011:`j4sZqYh\u000eV\u0007AԈɁ@\u0004\u0014\u0016ϒL?"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001btC+\u0019ho\u001d\u0016p\u0002", "\u0019", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001fzAs", "", "", ";`_", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001dU\t|Gq\u001d-MP\u0011/%", "<dgA", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001btC+)Ua:\\", "<dgA47IS\"}hm9\u0001\u00121", "", "Aa", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "<dgA;(LVv\ty^", "", "<dgA;(LVv\ty^j\u0003\u0013>l\u00041uN\u0010\u0016\u001eKl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public EntryRef<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            EntryRef<K, V> entryRef = new EntryRef<>(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return entryRef;
        }

        public final void nextAppendString(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            if (obj == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0006DLc\u0003)Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?5LeV7Zݷ2\u000fyڔ<$a'yCIa\"Ԃ(ޛeȞ\u0010itJh\nk\u0011\f\u0017\u0007j\\Uezm\u0012U1RqO3\u0014ok:!\u0014F\u0015.4:D\n\u0007\u0011\u001a`H x\u000bC\u0002\r@3PtHV%M3\u001fŪ\n>.\u0007fmuZNH\u001bjj51\u0011\u0002Dd&\u000e?Cֈ\r\u000fZ5\u001d\u000faL0\u0007K}(3d\u001b\u0007\t\\o\u0007M\u0004U\u0005\u001f(m?ʁwWDkH\u001a#?g\r\f\blpU]n\u0010?+}h\"ַ\u0010߭{z\u0004Ȟ\r\u0016\u001c\r?Hd-P;^ԛ5ϢvWXR\bfP\tKyD\u0019=\fC-I\u001b\u001dQq=)Nm|3\u0010tŃ\u0003ͼ%[\\ו1')^\u0010QgRv\u0012\u001fݧ\fՒAq\u001crh\r8\rΫK\u0016"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001btC+)Ua:\\", "\u0019", "$", "", ";`_", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "7mS2k", "", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001dU\t|Gq\u001d-MP\u0011Ow\u000f", "9dh", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "D`[BX", "5dc#T3NS", "3pd._:", "", "=sW2e", "", "6`b566=S", "Adc#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final int index;
        private final MapBuilder<K, V> map;

        public EntryRef(MapBuilder<K, V> map, int i2) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.map).valuesArray;
            Intrinsics.checkNotNull(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] objArrAllocateValuesArray = this.map.allocateValuesArray();
            int i2 = this.index;
            V v3 = (V) objArrAllocateValuesArray[i2];
            objArrAllocateValuesArray[i2] = v2;
            return v3;
        }

        public String toString() {
            return new StringBuilder().append(getKey()).append('=').append(getValue()).toString();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0006DLc\u0003İIي8\u000bDB\u0007\"2\u0012\u007f\u0007tpA0JnP.`S2\u000fq{<$i-yCAW \f8ޛwPmg|I\u0003\rI\u0010\u0014\u0016)jZJ\u0016\u0010m\"\u001d4Z{O5]os9pvF\u0005V3P;ѩ\t\u0001(.\u0011\u001b\u0005\f[K:$vϋ¤>R\u0013`M\u001e \u001aV /3%r\\L`l\fLu݊ɨmBT>(4\u000be%F\u00039]\u0003o#C@e;kǯ_Ϋ\u000bRcΪSW\u007fD\u001dhU-\u0002ɟ\u007fɱ:d\bϬ--U\u0015k{F^\u000b[n\u0017wC]ocP<.N\u07bf\bɁ@\u0010\u0016ͺ?J4:(o(\u00109\u0003\u0001^\u0011n\u0010`Z\f\u000bcF\u0017[\u007fC-I\u001b\u001dR\u0010>o\u05cc9߉\t\u0013&ŀ\u0019p'jb\u001eה\u00194"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001fzAs", "\u0019", "$", "", ";`_", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001dU\t|Gq\u001d-MP\u0011/%", "3w_2V;>R\u0001\ty<6\r\u0012>", "", "7mS2k", "5dc\u0016a+>fW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}", "u(8", "Adc\u0016a+>fW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}", "uH\u0018#", ":`bA<5=S,", "5dc\u0019T:M7\"}zqj\u0003\u0013>l\u00041uN\u0010\u0016\u001eKl", "Adc\u0019T:M7\"}zqj\u0003\u0013>l\u00041uN\u0010\u0016\u001eKl", "5dc\u001aT7|Y#\u000e\u0002b5v\u0017>d\u0007,x", "u(;8b;EW\"Hxh3\u0004\t-t\u00042\u0005NJ\u0014'Kv\r<\u00043~Ay+\u0014}\u001a5LCHA", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\n", "", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\nU\u001dQ~\u0015@\u007f\u001fCh|';j", "6`b\u001bX?M", "", "7mXAA,Qb", "7mXAA,QbW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}", "@d\\<i,", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static class Itr<K, V> {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final MapBuilder<K, V> map;

        public Itr(MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) map).modCount;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < ((MapBuilder) this.map).length) {
                int[] iArr = ((MapBuilder) this.map).presenceArray;
                int i2 = this.index;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.index = i2 + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeKeyAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) this.map).modCount;
        }

        public final void setIndex$kotlin_stdlib(int i2) {
            this.index = i2;
        }

        public final void setLastIndex$kotlin_stdlib(int i2) {
            this.lastIndex = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>26Ȑ\u0007\"B\u0012\u007f\u0007ll?ӄZ͜p0XS8\u000e\u0014}:%i$\"OKW*}h\b_Pwg5J\t\fs\u0015\u0016\u0018\tjrH\u0004z\u001e)\u001fBPrW?]qM9\u0017tF\u000702X9(\tв\u001e*V\u0015?\u0007QQ$\u0012f@7ĄRҫQ\u0005(\u0019ĈB("}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002!kH,xwn\u000f", "\u0019", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001fzAs", "", ";`_", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001dU\t|Gq\u001d-MP\u0011/%", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            K k2 = (K) ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return k2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>26Ȑ\u0007\"B\u0012\u007f\u0007ll?ӄZ͜p0XS8\u000e\u0014}:%i$\"OKW*}h\b_Pwg5J\t\fs\u0015\u0016\u0018\tjrI\u0004z\u001e)\u001fBPrW?]qM9\u0017tF\u000702X9(\tв\u001e*V\u0015?\u0007QQ$\u0012fA7ĄRҫQ\u0005(\u0019ĈB("}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002,g;.\u0015vEH\u00149", "\u0019", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0002\u001fzAs", "", ";`_", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\r1dZ0;t\u0015.Z\u0019", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001dU\t|Gq\u001d-MP\u0011/%", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            V v2 = (V) objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return v2;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i2) {
        this(ListBuilderKt.arrayOfUninitializedElements(i2), null, new int[i2], new int[Companion.computeHashSize(i2)], 2, 0);
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i2, int i3) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i2;
        this.length = i3;
        this.hashShift = Companion.computeShift(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact() {
        int i2;
        V[] vArr = this.valuesArray;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.length;
            if (i3 >= i2) {
                break;
            }
            if (this.presenceArray[i3] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i4] = kArr[i3];
                if (vArr != null) {
                    vArr[i4] = vArr[i3];
                }
                i4++;
            }
            i3++;
        }
        ListBuilderKt.resetRange(this.keysArray, i4, i2);
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, i4, this.length);
        }
        this.length = i4;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i2) {
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        if (i2 > getCapacity$kotlin_stdlib()) {
            int iNewCapacity$kotlin_stdlib = AbstractList.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i2);
            this.keysArray = (K[]) ListBuilderKt.copyOfUninitializedElements(this.keysArray, iNewCapacity$kotlin_stdlib);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) ListBuilderKt.copyOfUninitializedElements(vArr, iNewCapacity$kotlin_stdlib) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iComputeHashSize = Companion.computeHashSize(iNewCapacity$kotlin_stdlib);
            if (iComputeHashSize > getHashSize()) {
                rehash(iComputeHashSize);
            }
        }
    }

    private final void ensureExtraCapacity(int i2) {
        if (shouldCompact(i2)) {
            rehash(getHashSize());
        } else {
            ensureCapacity(this.length + i2);
        }
    }

    private final int findKey(K k2) {
        int iHash = hash(k2);
        int i2 = this.maxProbeDistance;
        while (true) {
            int i3 = this.hashArray[iHash];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (Intrinsics.areEqual(this.keysArray[i4], k2)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final int findValue(V v2) {
        int i2 = this.length;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.presenceArray[i2] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual(vArr[i2], v2)) {
                    return i2;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k2) {
        return ((k2 != null ? k2.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z2 = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i2 = (-iAddKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), vArrAllocateValuesArray[i2])) {
            return false;
        }
        vArrAllocateValuesArray[i2] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i2) {
        int iHash = hash(this.keysArray[i2]);
        int i3 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iHash] == 0) {
                iArr[iHash] = i2 + 1;
                this.presenceArray[i2] = iHash;
                return true;
            }
            i3--;
            if (i3 < 0) {
                return false;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void rehash(int i2) {
        registerModification();
        if (this.length > size()) {
            compact();
        }
        int i3 = 0;
        if (i2 != getHashSize()) {
            this.hashArray = new int[i2];
            this.hashShift = Companion.computeShift(i2);
        } else {
            ArraysKt.fill(this.hashArray, 0, 0, getHashSize());
        }
        while (i3 < this.length) {
            int i4 = i3 + 1;
            if (!putRehash(i3)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i3 = i4;
        }
    }

    private final void removeHashAt(int i2) {
        int iCoerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int i3 = 0;
        int i4 = i2;
        do {
            i2 = i2 == 0 ? getHashSize() - 1 : i2 - 1;
            i3++;
            if (i3 > this.maxProbeDistance) {
                this.hashArray[i4] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i2];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                int iHash = hash(this.keysArray[i6]) - i2;
                int hashSize = getHashSize() - 1;
                if ((iHash + hashSize) - (iHash | hashSize) >= i3) {
                    this.hashArray[i4] = i5;
                    this.presenceArray[i6] = i4;
                }
                iCoerceAtMost--;
            }
            i4 = i2;
            i3 = 0;
            iCoerceAtMost--;
        } while (iCoerceAtMost >= 0);
        this.hashArray[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeKeyAt(int i2) {
        ListBuilderKt.resetAt(this.keysArray, i2);
        removeHashAt(this.presenceArray[i2]);
        this.presenceArray[i2] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final boolean shouldCompact(int i2) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i3 = this.length;
        int i4 = capacity$kotlin_stdlib - i3;
        int size = i3 - size();
        return i4 < i2 && i4 + size >= i2 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k2) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iHash = hash(k2);
            int iCoerceAtMost = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.hashArray[iHash];
                if (i3 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        this.keysArray[i4] = k2;
                        this.presenceArray[i4] = iHash;
                        this.hashArray[iHash] = i5;
                        this.size = size() + 1;
                        registerModification();
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i3 - 1], k2)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > iCoerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        Intrinsics.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.IntIterator] */
    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        ?? it = new IntRange(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i2 = iArr[iNextInt];
            if (i2 >= 0) {
                this.hashArray[i2] = 0;
                iArr[iNextInt] = -1;
            }
        }
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        for (Object obj : m2) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual(vArr[iFindKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int iFindKey = findKey(obj);
        if (iFindKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[iFindKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.entriesView;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.entriesView = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    public Set<K> getKeys() {
        MapBuilderKeys<K> mapBuilderKeys = this.keysView;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.keysView = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        MapBuilderValues<V> mapBuilderValues = this.valuesView;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.valuesView = mapBuilderValues2;
        return mapBuilderValues2;
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += entriesItrEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr<>(this);
    }

    @Override // java.util.Map
    public V put(K k2, V v2) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k2);
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = v2;
            return null;
        }
        int i2 = (-iAddKey$kotlin_stdlib) - 1;
        V v3 = vArrAllocateValuesArray[i2];
        vArrAllocateValuesArray[i2] = v2;
        return v3;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int iRemoveKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (iRemoveKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v2 = vArr[iRemoveKey$kotlin_stdlib];
        ListBuilderKt.resetAt(vArr, iRemoveKey$kotlin_stdlib);
        return v2;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual(vArr[iFindKey], entry.getValue())) {
            return false;
        }
        removeKeyAt(iFindKey);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k2) {
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(k2);
        if (iFindKey < 0) {
            return -1;
        }
        removeKeyAt(iFindKey);
        return iFindKey;
    }

    public final boolean removeValue$kotlin_stdlib(V v2) {
        checkIsMutable$kotlin_stdlib();
        int iFindValue = findValue(v2);
        if (iFindValue < 0) {
            return false;
        }
        removeKeyAt(iFindValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i2 = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            entriesItrEntriesIterator$kotlin_stdlib.nextAppendString(sb);
            i2++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr<>(this);
    }
}
