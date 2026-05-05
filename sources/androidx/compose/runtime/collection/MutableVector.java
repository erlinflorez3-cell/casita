package androidx.compose.runtime.collection;

import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
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
/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r14ߚ\u007f\u0007tpA0JlP.hS2\u000fq\u007f<$iCyCAV\"}0\u0012WNmgvJh\u000bK\u000f\f\u0019\u0001j:e]xk0\u00172HoG3coE9f\u0003>\u000562*8\u0010\u0005\t\u001a0J\u0018v\u0011CS\f\u0018ZHpPR\u0015M\u001b\u001a\u001a\u0006D!\t\u001ejfV6Nnc?E݊+kH÷5^`\u0001{\r/T\u0006\u000e/b\u0010\u001e4wR\u001b$c\u000f\u0015TsG\u0013C\u0002?\u001bg]ݐYL\u0004[D\\\u0018\u0014C0̠\u0011]\u0001,%\u0016_y$'Yi\u0014O^)@w1ԈɁ@\u0004\u001c\"oa<F2f6+cx\u0001qXP0cr\u0004\t|N\u0017[ĮĴ/9)\u0006\u001avI9f7*\u001f=(1\"\u0007'kV\u001e`KÑ\u0003ȭ\u0018ĿW\tTVn\"Yk\b4zp#B\n@I\u0010/2߾\\\u001aÉ;[GEi\u0006\u0010h\\g%\u001f\u0011la\bjHn'\u001f EK!\u0012jFt\u0005\"¬\u0003Аt+[<l\u0007,\"C$j\u0016T!S\u0015~Yv\u000b\u0003Sm\f5/\u001dŽ\b\u00124(eYv3ck\u0014\u0014op\u000f\u0014mA\u0013\u000ff\bZY\u001c\\l(Xõv\u000fX\n\ndf\fALo{*UD7)^%H9ٜpdE\u001emz\u0001\u0010-nc.\u0011\u000b<z\u0019\u0003`\\'ב\u0016\u001d\u0010ؚ\u0003)H;fi5G@\u00062vZ\u0015/\u0017\u0001\u0004\u007f}х\\I\\lD\u0010\u0004#fڍ ߜQ5E\u0017\u0015}92\u0010,\u000eV\u0001\u000eiS\")\u000b|0Ҹi~vk\u0016\u0014\t,\u000f\b\u0013cbA:v\r\rS\fr\u001b\u0012a|ک\u000eϑTߏ_>W\u000fKkJyP|39N/\u000f\u0011:\u0003E/S'Sȶ&ҡw'o\t\u0002o\\\u0014\u0013\u00194\u0016}\n<e&o\u0019Г\fU\u0004JW\u0005\u0017>P>\u001d\rPi\u0003}\u0018D\u00194CΉve-\u0003dde\u000b]\u0018\u0017\u0011::\t\\k<#o4Ү\\ɾr\u007fQ,,^qBAQa\u0017\u0006myaSS\u001d:#{gޫ݁ =.\b \u000e\u0017`\u001esNܽqKp+T\u001546<<>ՁSVy\u0006>\u0015.m&ʜ\u001dϫByCZ\u0014S\t\\dGϖdEnSr\u000f\rBK \u000f4g܊4۵Zвg2\u000f\u0005e6)\u001eg\u0001|$aל\u0005I)Np\r\u001bGmC\u007f\u0379F\u0006W)\u001c\u0006\u001e3~\u0095\u0003܋B\u001e#=W\u0010ov>]κYd\\\u0017?`t\u0007f\"o4\u001b~\u0014;\u0018D;\u001d])\bbs\u0002~\u001dEz2\"'U9\u0016R2ސJ%3?E3C\u0004z\u0016-\u0002}\u000fK\u007f\u0018 Vٴ\u0014v1\\\u001eC\u0015B$Ͱ@φq\u001cj\u0006\u000f\u0012` \u0012.ؠxr\u0018jP\u001a]?K\u0002Y\u0014ym} N\\[p\u0014xch??\u0014'q&mA\u0013wAe(s\u0094T'\u000f`]4\u0019\u0013j<\u0017YFv!\u0011$$lT߱\fl/I_in+{Qa\u0013Qj{,q1fܼ.\u007f/y<9X\u0013nׄA۱MDl\rbkRW\u001c^Ɉ,d\u0003Kqb\u000b?`^WHTHx\u001drdg\u001d-\u0012%G'<4jW]9RbA+7hУ\u007f9\u0007 IoŪx\n0{\u0019x\u0006\"</LZcU7[4m+8T\u0004\fжHݍ,\u0017\u0016\u00155YH L\\ӭ ;_o\n|\u001fB-8L%'\u001b;i_\tU.\u000f3\u0019\r\u0006/a&H+O)3@\u001f~I\\ǃ?/;\u001f\\-\u0012<uL\u0005S\nt\u001fc<Ik\u0096.\u000beOF?ڍ(.\f/3\u0006KkX,ebf\u0012\u0004Y\u0014&pk\u001d\u0003iؠr\u0530s\u00104m\u001ert[o4ф~\u0014'\u0004\u0007P;/\u001fE{\u0006*\u001bRP] G\u0011\u0016)iٚ\r\u0012_qnHw\u001a\u0014Ҕbѱ<\u0019{\b@1q6\bF\t\u00068JE\u0012\u0003\u0001\u001b\u0001{\u0015w\"H\u0014\u001d\r2|ATp\u007f\u0017߷()[vtS\u000b1\u0014ڰhޔ@\u0015,b4A\u001c\u000b\u0014\u0015vn%G\u0016J\u000f2CCU7YS\"X\f!Sǎk'\u0016%\u0016\buf\u001cߕ^װ99\u0013qPWEej\u0004\u001eMY+C\u0015.\b[DU\u001aV,:Z\u0016\u000esiX\u0012Txz٪}2@0~\u001c\t{$Ӥ\"\u05fe=[\u001di\u00051r7icY?E\u001f\u0007R\fƪ]|\u0010!(AG\u0018Q͂[և6#\u0002UyO\nQtI\u0004\u0002\u001eM\u001e\u001eyJWǒωC/O\u00165|s\u000b1Wm\u0004<05J\u001e\u001f4dw\u0013 پ2a\u0013LdpWo\u0012Å\u0017\u07b2Bp\u0017~z\u000b>\fFTNc\u0014]z\u001cc@\u0010P:T\t\u0015WQz{`ڜ\u007fh\u0005Y{_Y\u001d_ѩ7ޤ\u0011iWc\u001ama\\f=_[4\u000e+\u0002H7ne\n\u0017A0Eo,vxCl`Gמۨo0r+;\u0012r\u000e{>r\u0091\u001d)tu\u0016'aFr\t\u0017͟XC b\u001bFU]\u000fЪ\u001fɱ\u0001Qi\u001b\u001a6Tv1fˋ>\"oT\u001cn3\u0018b\u0006<o\u0012{#\u0017u3lŧ҈0|#O\u0007t\u0001U\u0005\u0007c/:ΏuȑL۾D\u001c;\fo\u001bvYB\u0010\"{;\u05fb\u001fc`w\u000e+\u0003f\u000f#T֦QYIGO-1@\u0003·8ÏX\u0001v\\b$>{\u0014\u001eˬF{C\u001f\n-\n\u0006ow_6m\u001eo3\u0018z@\u0011q\u0011\u0012\u0019`\"\u007fypdu:]y\u0017YrխQ\u0004\u001a\"oY6<mܤNϸJ8*'\u0007\u000eF\u0018Xeó|%\u0017:T}\u0003K&8}@\u0004f$\u001dbD]Yc}SbEp8pWA\u0017LW\u001fY%hTٜq\u007favd\u001c8A\u007f\u00067\u0016\u001a~kD'w>ңDmJ{\u000e8B#\u0012Ӡ ʿfttzV` =$\fн\t>\u0002\u007fk\f37xm\u0010=\u0019pcl\u007fќ\u0005\u000fJ\u00106\u0016H=B6V,~1+\u0013\u0015Z\u0013\u001fӔ=O~y[\u001ba>weW(\u000ef{*?\n.ןF!\u00107O\f:\u0006\rm.ϯ\u000f\u0530#\u0014/rU\u0007\u00020@F&\u0011.\bs\u000e\u001eLvL\u0017Bo\u05f5\r2|u\u0001LU\u00142<Su5Qu\u001bw\u0005lɓKaxUzyd$\n\u0003mލ\u0004օ!\u0019I#\u001c\r4\b\u000es$H]O\u0019@v0<\u001eQI \u0014;ߥ\u0013ג=ȍE1M.9-9Sw^p\"=)/C#\u0018^\u07b93ıwɜ,\"Qm?,{e(\u001cw?91_\u0012\u0013\u001ahԃ٣Y\u0010M&[tlU\u0018!wJ`}\u0017nds\u000e0zo!Ú\rƃ\u0018\u0004J;\u0017wd_X\u001a4sS\u001ar^T'\u0012ϸr:V0-\b<2:\t`%j\n\u0016u\u0007Tr\u0012\u0017Κ\u001dY!QC\n;\u0001\\ݨ1\r1{C\u0014l^ʑJd\u001d/?kQqvtl\u0007-\u0018?C\u001c\u0012[gB\u001coȩ\n#{4n<X\nZכkT!Z1E\u001ad|l&G\u001e3s^\u0004G\u0015NM\r\u0004]KY\u0005\u0017TI2wy\r):\u007fAv{{?P\tү{\u0012w@%\u000bPae={u0B]sMK5\u0015C\u07b9z\u000e\u0005\u0003KO \u0004%ɾEڌ\u0006*\u001cF\u00055\u0001Cx=>8By\r\"\u0019ܲd2P\u0001g*D\u0017\u0016R5r\ndIʱz΅:Π\u001e\u0002l0O\u001b4\u000bE\u000bIG3PR:Kl\u0012L\u001cu%)\u001d\u001bUiuM|\n\th4B\u0002B\br\u0018ڝd1h\u001e9FY1hݬj=\u0015\u0016\u000b\u001ea\u0012z\u0010r\"!!X*\u0010\u001dff\u007fִXwl6\u001bbrPDޛlɜmD\u0014QKU>\u0006D\u001c(p\rc\u000fV\u0015\u0004\u0006\u0016bB\u000b\u0001Tuu\tu(9)|ƴ\u00026\u0018Ͻ\u0016ޠAțTׯ6x<B\",\u001b 0[.\u0013#Qm=,BlzLYSmU>0(z(;='ںP̷\\\u0005uH?K+\u0005%pG\u0004xv\u0006,\u0007ʌ7΅\u000fuJERrl5}s\u0019(b%c\u0015c\u0002\bӪh:e]0܇cϠp\b6\u0604\u0016\u0006-s\u001d8\u001dD{n$>WW&`\u001fj\u0017ֲ\u000fΘ\u0019J(̊*)\u0013VK2ʋ\u0018+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\"", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "1n]AX5M", "", "Ahi2", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\b", "5dc\u0010b5MS\"\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u0010b5MS\"\u000e", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "Adc\u0010b5MS\"\u000e", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u0016a+BQ\u0019\r", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ":`bA<5=S,", "5dc\u0019T:M7\"}zq", "u(8", ":hbA", "", "\nrTA \u0006\u0017", "5dc \\A>", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "", "", "/mh", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/r<Bg(;Z\u0019e~l;", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "1n]AX5M3%\u000fve:", "=sW2e", "3mbBe,\u001cO$zxb;\u0011", "1`_.V0Mg", "4ha@g", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "4ha@g\u0016K<)\u0006\u0002", "4n[1", Global.BLANK, "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/bR", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "4n[1E0@V(", "4n[1E0@V(b\u0004],\u0010\t.", "4na\u0012T*A", "0k^0^", "4na\u0012T*A7\"}zq,{", "4na\u0012T*A@\u0019\u0010zk:|\b", "4na\u0012T*A@\u0019\u0010zk:|\b\u0013n~(\u000f@\u007f", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", "7r4:c;R", "7r=<g\fF^(\u0013", ":`bA", ":`bA<5=S,h{", ":`bAB9'c \u0006", ";`_", "BqP;f-H`!", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc-T\u001b*^?\u0005r0'\u00172K6\fc*]L", ";`_\u0016a+>f\u0019}", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc-T\u001b*^?\u0005r0'\u00172K6\fc*]L", ";`_\u0016a+>f\u0019}ch;e\u00196l", ";`_\u001bb;'c \u0006", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,\"T", "@d\\<i,+O\"\u0001z", "AsP?g", "3mS", "@dc.\\5\u001aZ ", "@de2e:>Rt\b\u000f", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "Adc \\A>", "<df \\A>", "AnaAJ0MV", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "At\\\u000fl", "Ad[2V;H`", "Bga<j\u0015HA)|}>3|\u0011/n\u000f\b\u000f>\u0001\"&Ky\u0017", "", "\u001btc.U3>D\u0019|\nh9c\r=t", "!tQ\u0019\\:M", "$dRAb9%W'\u000e^m,\n\u0005>o\r", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    private T[] content;
    private List<T> list;
    private int size;

    public static /* synthetic */ void getContent$annotations() {
    }

    public MutableVector(T[] tArr, int i2) {
        this.content = tArr;
        this.size = i2;
    }

    public final T[] getContent() {
        return this.content;
    }

    public final void setContent(T[] tArr) {
        this.content = tArr;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final IntRange getIndices() {
        return new IntRange(0, getSize() - 1);
    }

    public final boolean add(T t2) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = t2;
        this.size = i2 + 1;
        return true;
    }

    public final void add(int i2, T t2) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i3 = this.size;
        if (i2 != i3) {
            ArraysKt.copyInto(tArr, tArr, i2 + 1, i2, i3);
        }
        tArr[i2] = t2;
        this.size++;
    }

    public final boolean addAll(int i2, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + list.size());
        T[] tArr = this.content;
        if (i2 != this.size) {
            ArraysKt.copyInto(tArr, tArr, list.size() + i2, i2, this.size);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            tArr[i2 + i3] = list.get(i3);
        }
        this.size += list.size();
        return true;
    }

    public final boolean addAll(int i2, MutableVector<T> mutableVector) {
        if (mutableVector.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + mutableVector.size);
        T[] tArr = this.content;
        int i3 = this.size;
        if (i2 != i3) {
            ArraysKt.copyInto(tArr, tArr, mutableVector.size + i2, i2, i3);
        }
        ArraysKt.copyInto(mutableVector.content, tArr, i2, 0, mutableVector.size);
        this.size += mutableVector.size;
        return true;
    }

    public final boolean addAll(List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(T[] tArr) {
        if (tArr.length == 0) {
            return false;
        }
        ensureCapacity(this.size + tArr.length);
        ArraysKt.copyInto$default(tArr, this.content, this.size, 0, 0, 12, (Object) null);
        this.size += tArr.length;
        return true;
    }

    public final boolean addAll(int i2, Collection<? extends T> collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + collection.size());
        T[] tArr = this.content;
        if (i2 != this.size) {
            ArraysKt.copyInto(tArr, tArr, collection.size() + i2, i2, this.size);
        }
        for (T t2 : collection) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i3 + i2] = t2;
            i3 = i4;
        }
        this.size += collection.size();
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }

    public final boolean any(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            while (!function1.invoke(content[i2]).booleanValue()) {
                i2++;
                if (i2 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        int i2 = size - 1;
        T[] content = getContent();
        while (!function1.invoke(content[i2]).booleanValue()) {
            i2--;
            if (i2 < 0) {
                return false;
            }
        }
        return true;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        for (int size = getSize() - 1; -1 < size; size--) {
            tArr[size] = null;
        }
        this.size = 0;
    }

    public final boolean containsAll(List<? extends T> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!contains(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i2 = 0; Intrinsics.areEqual(mutableVector.getContent()[i2], getContent()[i2]); i2++) {
                if (i2 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i2) {
        T[] tArr = this.content;
        if (tArr.length < i2) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i2, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[0];
    }

    public final T first(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                T t2 = content[i2];
                if (function1.invoke(t2).booleanValue()) {
                    return t2;
                }
                i2++;
            } while (i2 < size);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    public final T firstOrNull(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        T[] content = getContent();
        int i2 = 0;
        do {
            T t2 = content[i2];
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
            i2++;
        } while (i2 < size);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r2, Function2<? super R, ? super T, ? extends R> function2) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                r2 = function2.invoke(r2, content[i2]);
                i2++;
            } while (i2 < size);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r2, Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                r2 = function3.invoke(Integer.valueOf(i2), r2, content[i2]);
                i2++;
            } while (i2 < size);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r2, Function2<? super T, ? super R, ? extends R> function2) {
        int size = getSize();
        if (size > 0) {
            int i2 = size - 1;
            T[] content = getContent();
            do {
                r2 = function2.invoke(content[i2], r2);
                i2--;
            } while (i2 >= 0);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r2, Function3<? super Integer, ? super T, ? super R, ? extends R> function3) {
        int size = getSize();
        if (size > 0) {
            int i2 = size - 1;
            T[] content = getContent();
            do {
                r2 = function3.invoke(Integer.valueOf(i2), content[i2], r2);
                i2--;
            } while (i2 >= 0);
        }
        return r2;
    }

    public final void forEach(Function1<? super T, Unit> function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                function1.invoke(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super T, Unit> function2) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                function2.invoke(Integer.valueOf(i2), content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    public final void forEachReversed(Function1<? super T, Unit> function1) {
        int size = getSize();
        if (size > 0) {
            int i2 = size - 1;
            T[] content = getContent();
            do {
                function1.invoke(content[i2]);
                i2--;
            } while (i2 >= 0);
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super T, Unit> function2) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                function2.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i2) {
        return getContent()[i2];
    }

    public final int indexOf(T t2) {
        int i2 = this.size;
        if (i2 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i3 = 0;
        while (!Intrinsics.areEqual(t2, tArr[i3])) {
            i3++;
            if (i3 >= i2) {
                return -1;
            }
        }
        return i3;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        T[] content = getContent();
        int i2 = 0;
        while (!function1.invoke(content[i2]).booleanValue()) {
            i2++;
            if (i2 >= size) {
                return -1;
            }
        }
        return i2;
    }

    public final int indexOfLast(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i2 = size - 1;
        T[] content = getContent();
        while (!function1.invoke(content[i2]).booleanValue()) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[getSize() - 1];
    }

    public final T last(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size > 0) {
            int i2 = size - 1;
            T[] content = getContent();
            do {
                T t2 = content[i2];
                if (function1.invoke(t2).booleanValue()) {
                    return t2;
                }
                i2--;
            } while (i2 >= 0);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T t2) {
        int i2 = this.size;
        if (i2 <= 0) {
            return -1;
        }
        int i3 = i2 - 1;
        T[] tArr = this.content;
        while (!Intrinsics.areEqual(t2, tArr[i3])) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
        }
        return i3;
    }

    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    public final T lastOrNull(Function1<? super T, Boolean> function1) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i2 = size - 1;
        T[] content = getContent();
        do {
            T t2 = content[i2];
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
            i2--;
        } while (i2 >= 0);
        return null;
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> function1) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            rArr[i2] = function1.invoke(getContent()[i2]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> function2) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            rArr[i2] = function2.invoke(Integer.valueOf(i2), getContent()[i2]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> function2) {
        int size = getSize();
        int i2 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i3 = 0;
            do {
                R rInvoke = function2.invoke(Integer.valueOf(i2), content[i2]);
                if (rInvoke != null) {
                    objArr[i3] = rInvoke;
                    i3++;
                }
                i2++;
            } while (i2 < size);
            i2 = i3;
        }
        return new MutableVector<>(objArr, i2);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> function1) {
        int size = getSize();
        int i2 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i3 = 0;
            do {
                R rInvoke = function1.invoke(content[i2]);
                if (rInvoke != null) {
                    objArr[i3] = rInvoke;
                    i3++;
                }
                i2++;
            } while (i2 < size);
            i2 = i3;
        }
        return new MutableVector<>(objArr, i2);
    }

    public final void plusAssign(T t2) {
        add(t2);
    }

    public final void minusAssign(T t2) {
        remove(t2);
    }

    public final boolean remove(T t2) {
        int iIndexOf = indexOf(t2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(List<? extends T> list) {
        int i2 = this.size;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            remove(list.get(i3));
        }
        return i2 != this.size;
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        int i2 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                remove(mutableVector.getContent()[i3]);
                if (i3 == size) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.size;
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.size;
    }

    public final T removeAt(int i2) {
        T[] tArr = this.content;
        T t2 = tArr[i2];
        if (i2 != getSize() - 1) {
            ArraysKt.copyInto(tArr, tArr, i2, i2 + 1, this.size);
        }
        int i3 = this.size - 1;
        this.size = i3;
        tArr[i3] = null;
        return t2;
    }

    public final void removeRange(int i2, int i3) {
        if (i3 > i2) {
            int i4 = this.size;
            if (i3 < i4) {
                T[] tArr = this.content;
                ArraysKt.copyInto(tArr, tArr, i2, i3, i4);
            }
            int i5 = this.size - (i3 - i2);
            int size = getSize() - 1;
            if (i5 <= size) {
                int i6 = i5;
                while (true) {
                    this.content[i6] = null;
                    if (i6 == size) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.size = i5;
        }
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    public final void removeIf(Function1<? super T, Boolean> function1) {
        int size = getSize();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (function1.invoke(getContent()[i3]).booleanValue()) {
                i2++;
            } else if (i2 > 0) {
                getContent()[i3 - i2] = getContent()[i3];
            }
        }
        int i4 = size - i2;
        ArraysKt.fill(getContent(), (Object) null, i4, size);
        setSize(i4);
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        int i2 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        return i2 != this.size;
    }

    public final T set(int i2, T t2) {
        T[] tArr = this.content;
        T t3 = tArr[i2];
        tArr[i2] = t2;
        return t3;
    }

    public final void sortWith(Comparator<T> comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> function1) {
        int size = getSize();
        int iIntValue = 0;
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                iIntValue += function1.invoke(content[i2]).intValue();
                i2++;
            } while (i2 < size);
        }
        return iIntValue;
    }

    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDR\r|İI\u0006>*6Ȑ\u0007\":\u0018\u007f\u0007ljA0ReP.XT2\u000fy\u0005<$a+wCQ٥B\u007f(\b]M\u0018m~Lj\u000b\n\u000e4\u00169\u0004<Scyu\u0018\u001f4Rou2{qM=nwN\u0005N6ŕ<y\u0013\u0006b=V\u0016\u000fzqR<\u0016>H\t:\t\f\u0014\u0019ܨ\u0016\u0006L)I%jqf6vw$Ɣ/k\twNf'\u000e;CaURb4%v\u0018\u001dq¿7߱\u0019%a\u0011OXiN\u001b? AK|o29Y\fWlWF(Ʀ/O\u001bk;,j\u0016i`:+qc,Q^ @w)\u0003SPL!\u0014:`.[!\u0017\f\u001c;\rr\n?\u0017\u0016ެF\u007f\tj\u0007#3\u0003K+g\u001f=Ϣmޅ\u001dN?ަU\u001f,$\u0019t1]d\u000e\u0017\u0014IVNΆ3ҨD=Pݐ̌]Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011pj?v%VV[\u0013``\u0002!#\u0012g\n]5\u001aZ", "\"", "", ":hbA", "", "7mS2k", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;ckl", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", ">qTC\\6Na", ">qTC\\6Na|\by^?", "@d\\<i,", "Adc", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i2) {
            this.list = list;
            this.index = i2;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i2 = this.index;
            this.index = i2 + 1;
            return list.get(i2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            this.list.remove(i2);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i2 = this.index - 1;
            this.index = i2;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            this.list.add(this.index, t2);
            this.index++;
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            this.list.set(this.index, t2);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDR\u0003|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1LeV7ZS0\u000fs{B$c$wECU(\u001a*\tUUog|qb\u000bI\u000f\u000e\u0016\u0007\u00144I[\u0001c\u0012%˰jqE2[nm?pvF\u0005f1P8:\u0016\u0011$8I(|\u000bE[\fH/nrĐV\r[\bb%\u0014F8\u0001Le\u0018RDR\u0005]p.i\u0017ݦFN5jx\u0018[\u0015^TU\u0019'e,8X7c\u001aUW\u0011\u0011j[u\u0002\u0006\u0006ݘ\th55se\u0002fNX.\u001dE/]\u001aurTa5[n\u001c?1_e[PD'&\fB!\u0005\u0018\u001c\u0015?H\\6Jp\u0016\u001eKz\u0003UPP8]p\u0011Au~\u001d3\u0012K+g'-e*O'aO{3\u0016N'\u000fx9[\u000b\r'ڔ\u001bƻ{Q?\\\tQVb\"Ykv4zp\u0012B\n@I\u0010/2\u0010\\(kK$M16\u0004\u0002~C\u0018z\u0013m\u0001S\u0018W\u000fخ\"å\u001a78\u001fTmR{\u001dk~Y\t0\u001fW4T=|N'ء`wJ9m\u0016\\h\u0001i\u0019V$\u001em<tQqt{\u0010g9\u00152cl*ߛa\u001b\n\"[Tb3]\u0017Fa\u0016r\\^!x\\н\u0014w\n\\\u0017\u0018!OWw,6<1O[CfI2\u000bU\u000b&w`x\u0012\u000fTi#1\bTx\u0017\u000eh\\\u001ft.\r\u0012?\u000b\u007f:-oZe\u001d4_:hj{i\u001bҋw\u007fUr\u0015[Z\r.u\u0004\u0005P (Ii5M\u0015\u001f~_10>\f`;x_n*'1{*\u0013IuFg6o7@߯nJ]j_6\u0005\u0001\u000b#6m0\u0004oV\u0013MsV\u001b[tH!\u0014 P\u0017T\u000b(7\u001e[\u007f &\u000bBECU\"F{\"9-a\u0014h6Кyˏ\u0013&\u0003\nLHq;\bha_B;nH\b~n&2\u0013\u001bBvo(\fP0L\raM\bxAhFQ#/,k=\u0001cߵXݍ>\u0017\b\u007f:4m1DU\f\u0015vI5\u0013]S\u001el\u001cM3֨L؝\u000e\u000b\u0004ςߔ\u0016D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011pj6\u00076CIU,MRpL\u001e\u001fA\u0012\\:b", "\"", "", "DdRAb9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:\u0001,<Y{/;w\u001fw5SJg1%\u0015Ya7\u0016m9$:\u0018", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector<T> vector;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.getContent()[i2];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t2) {
            return this.vector.add(t2);
        }

        @Override // java.util.List
        public void add(int i2, T t2) {
            this.vector.add(i2, t2);
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            return this.vector.addAll(i2, collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i2, T t2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.vector.set(i2, t2);
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            MutableVectorList<T> mutableVectorList = this;
            MutableVectorKt.checkSubIndex(mutableVectorList, i2, i3);
            return new SubList(mutableVectorList, i2, i3);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDR\u0003|\u0004G\u00068\u000b<H\u0007\"2\u0016\u007f\u0007tsA0JeP.`S2\u000fq}<$i@yCA\\\"}00WNmgvJh4K\u000f\f\u001e~jBկ}zc\u0011\u001d1ruO5]o\u00048\u000ftv&0<09\u0012\u000b\u0011\u001c:HFu)C[\u0010 2XphU\u001dQ\u0013\u001e*\u0006l#Ә\"\\uS~[zfR/Q\r\u001aF\\2w03LSZù+\r\u0005mfFN@M\u0015S`3\u000b`iW\u0003mtm\tv2?+\u007fr\u001eJݼ\u0004\u0014#:\u0018)k\u0003>\\3[\u0011\u001059gcyS>2\u0006\f\u0014\u0013L\u0006\u001e\u0006]G\\?`zP\"A\u0005\u000bSnZ2hP\u0011\u0013gF\u00195\u007fi*g--e*A'aO{3\u001ad7I\u0003/ol\u000e\u000f\u001fKX\u0006\\IQv<\u000fݧ\nՒAm\u0012|+\u00168\u0019HG.9,\u001b<(==k;3!\"\u0001vV.\u000bMtvi\u0002R~?Rr$EB\t:]\u000b߶\u0005\u07fbTTfCY`*l\u001f}6\u0016P`\u0006G9%FM\u0016|ȬnMk#m5tQqn\u001a\u0018\u001eM'@Cl{\u0016qT\u0007\u0014u;\u0011!\u001fٿB\u001c\u001fhy@\"`K\u001b\u0014\u0006\u0007\\NB\u0012xSۇ 4:Jah#f\u001b$RC\r\t\u0016Y\u0017/Eh{8\u0011\b<z\u0019\u0003`\\'n\u0016\u0018y0\u000bn:-oT{-nh0\tL|Q\u0011/w\u000eR\u007fL}K3*\u0091Y{.\"bM_PU\u0013=\tY<\u0010>]R\u0003gaMH&)\u000f@#\u0004{<\n j'+\u0011nX]l\u0017Py%\u0007ן\fd\u000e\u0011*Z\tj{T9enS\u0001\u0014qB^:\r\u0005U\u001dS\u001366EQ;g?\u001dLvD3#oui\u001e1*f\u001d1\re:+*ܵo͈U]@`\u0001eg%V(4n\u0013B~i&\br\rB4KHog!ZFu#/,iM@]|d_R\u0013\u001e\u0001\u000bʠkͫwC\u0006ж/U3\u0012eYwo}K\u0013\nx\u000f`Ν}ϥr\u0012$ܻpheh!04vN\u000b\u0018ݼdƀ@\r<62C\u0016\u0013\u0014`w\b(z.I6ʘ\u0019ЋFsCٙվX\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011pj<\u0007$.P\\;2", "\"", "", ":hbA", "AsP?g", "", "3mS", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\f?1", "Ahi2", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        public SubList(List<T> list, int i2, int i3) {
            this.list = list;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.list.get(i2 + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    return i3 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t2) {
            List<T> list = this.list;
            int i2 = this.end;
            this.end = i2 + 1;
            list.add(i2, t2);
            return true;
        }

        @Override // java.util.List
        public void add(int i2, T t2) {
            this.list.add(i2 + this.start, t2);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            this.list.addAll(i2 + this.start, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    this.list.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    this.list.remove(i3);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            int i2 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        public T removeAt(int i2) {
            MutableVectorKt.checkIndex(this, i2);
            this.end--;
            return this.list.remove(i2 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            int i2 = this.end;
            int i3 = i2 - 1;
            int i4 = this.start;
            if (i4 <= i3) {
                while (true) {
                    if (!collection.contains(this.list.get(i3))) {
                        this.list.remove(i3);
                        this.end--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.end;
        }

        @Override // java.util.List
        public T set(int i2, T t2) {
            MutableVectorKt.checkIndex(this, i2);
            return this.list.set(i2 + this.start, t2);
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            SubList<T> subList = this;
            MutableVectorKt.checkSubIndex(subList, i2, i3);
            return new SubList(subList, i2, i3);
        }
    }

    public final boolean contains(T t2) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i2 = 0; !Intrinsics.areEqual(getContent()[i2], t2); i2++) {
                if (i2 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (contains(mutableVector.getContent()[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }
}
