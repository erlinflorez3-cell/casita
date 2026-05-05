package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d̉=!4i\bDRo|\u0004W\u00068\u000bDB\u0007\"2\u0014\u007f\u0007|jAӄLe^.Zݷ2\u000fy\f<řc$\bCC٥\"}0\u000fWNmgvJh\"KƤ\u000e\u0016\u0007}4I[xe\u0012%2JoE:UoKBht<\u0006(20C\u0002\u0005\u0007\"2H\u001e\u0006\u0003CYÈ\u001a0FwBR\u001bW\r\u001a\u0018\u0015F \u000f<dɡV6^le:5/\u001bxPS?_^|}\u0011TZ?\r%hdѰFOD#*k\u00035R\fC\u0011G\n=3qmݘ1a\u0003e;p\u007fB\u0015[S\u001bg\u000b&\u000b\u0010\u0018Ө\u0012?B]hcP<((~\n\u0017T\u0004<\u0011WL<92f6\u001byχxk_^\u0007vB.z\u0012:%/\u00183YDKj_oS\u0019|F,\t\u001b.;\u0001\u001d0\"ٲ\u0014x<)Y\u0010Q_QpAVX\"Ykx4tp\u0010B\u0004^V03\n!F\u0017SF\f=1-\u0004\u0002vQ.Ѐ\u000bxwanjHn\"\u001f\u001aE;!\f\tV+ʕqhsf1)MJT7\u0002\u0016$8\\&NQ)\u001e\\gh\u0018y}a\u00185Gfeh5\u0090\u0014oXl8MQ\u0012\u0010\u0012V\u0005'W<\u0011\u0019\tjPa$Z\u000b7R6Vz(w*S\u0015܄\u0019JI\u007f1L,_\u0019\u0005\u0015v\u0003dGY\u000f\u0017trh>~|3R\u0003\u001a(\u0003\u001f\u0019P\u000b\b6l\u0011\\:\u0015x\"[Py5G&\u0006&vM\u0015#5\u000e:ÚM\u007f_Uf\u0005\u0016$d$ D\u001aiU=V+\u000f-8xĐ3]g\u0001\u0001iM@6#|(\u000fkl<\u0004 j\u001f;\u0011nXll\u0017P\u0006%и) ~\u000e\u0018yF)V\fT9[nM\u0001\"q<|8-\u000b%\u001e3!\b\"+VEM5?.wB/=a\f{63\u0012\u0001\u001dH\re2,\f\u0016\u001et\u0002c8;Flq~l1Tr\tBV\b\u0010\bp\u0018z\u0012K_O\t\tVfn31\u0014e5Q=vdzR\u0015\u0006|bS&͐u[\u001c\"\u0003[%?n{i\u0004ly\u0002;P\u001d)#}Gm@Am$dwz\t^':\u001dNTI\u0007\u001d<7E\\,j\b;Gbq\u001e\u0010)\u0007\rܲ\u0015/EP\u0018SV<u!\\\u0005H5dS\u00079*/$Uʄ$\u0011??,\u0006F\u0003/\f2/Sc\u000e3|]&~%YD|9I(\t\u0005\u0019[uCw\u0019|\t_3{\u0014\b\ff\u0018%\u001dp#a>i9m\u001fH^9U\rN\u0013\u0002BlXN0L\u0017z+\u001dl\u0010\u0015\u000b'l\u000bo\u0011<|T}7QC\u0019\u0017rJM\u0011\u0015mTEE\u0006c8eI\u0019\u0014m\u0001o{I(  N2,tO\\\b\u0014l\nk>R\u0016 %\u0013\b\u000f\u0013^=\u001c.x\u0004#\u00104\bDx\u001a304%^\u0004\u0012/k?+\u001b'jK\u0017x:gz\u0010\u0007U9\u0003\u00177\\y|Mh\u001d7HeL!\u0006r:?tHZ'~B\u0015V%D'z+&N\u0012h!qU[\u001bKGkX\u0003Ib`L\u0016\u001f(u,*\u0003(EAdcVf\u001f[\u001bY\b\"l\u001a@n\u0005\u0012/\u0013\r\u0001^]?Dbv\u0013 z.eJe˂\u0013Ӵd\u0007\u0012waN/_j?I7Z\u000b\u001e('%\u0011iz~\u00100H\b\u0003\u0002}+[w\u0003m:)o#\u001c\u0016I\u0381QԺ<B\u0016_)H\u001f]r8N>\u0005\u001aJ=\u00029O/)\u0003+74\u00077\u001dC\u0019iSS*1\u0011\u000f<W\u0004Aq@rGt9.=!I\b\u0007=;4\u0014}mڌ\bʩN~[\u0018n?oZa5s\u001e\"Un\u0002:#2R\u001euQ\u007fuEVYwfP\\yV\u0014(@5\u001duQw\rz\n\tZ\u001b^Ľjպe4O0,$RtB-\u001b\u0007mM\u0017yQޕ\u0013]\u001cEF\u001e)a8%\u0010}\u0017X6W+e/\u000b]d\u0013\"\u0004\u0001ߙgN\rUxq*4-:T\u0012j\u001bq_u(8@$SՅ}Imn9x\u001dF6svt6\r|[{z\u000bnJTb<~$\u000b4%tЅ\u001d\u001a\u0019X\u001a-\u0013aV\u001cAu\u0012\u0007\u007f/Z)[S\u0006Ukx\u0004WU g\u0004ؼ9#\tX\u0017Me\u000b\u0014}!yd[\u0019\u000e%C.u\u0012n\u001e8\u0015\u001e\u000ess\u000fϣJ\u0011_6,H0^_'Zq]1 -zm\u0015\u0014~bfE\u0018|\u0011YF\u001e֛Xm>;8\u001a\u0003>PA\u00139\u001e\u0004=@<\f\r_M,\fj\nm|\u001cXV½gbS=GW/ol\u0015V\u0014dI[MA$ U36\u00172\u0002\u007f\u0013\u00183Rc\u0011\u0010NVWW{]\u001fvZj=\n%\u00124\fFu\u001e=42zNC|w@ZO\u0019\tuO\u001b\u007f8(\bf#h}I9\u00151>_qAg]#,n\u007fk\tB%g>@A\u0011J#,a\nhA0Ev{}x8l`?Y\\k^\n*vt*VclK`\u000f'-g}IQlb7`!LOWzlZbfLxa\u0019\u0001y\u001dG\u001a=D\u0005C\u007f3hCyDa$=Gx\u00066j\u0010wE\u007fk|N\r\u001e,-\u0019\u0013\t~r2l5S6\u0004yOJF\ta4Ohr\u0006h6*6\f+\u0005\\ra\u001aiuM.\u0015\u00031f2A\u0006tw'\u0019\u0003'\\ 2{y\u0013\u0011f(=.*\u0006G\u0012p{epO=\u00143\u0006q\u007f8khA}\u0018wP\u0013q\u0012\u0012\u0004b#}\u000bz1kze}\u0017[LYo\u00028oQ$6:W\u0006V\u0003b2Pr1\u0015<\u0018X7\u0007xS\u0018}&=F\u000e\u000e`\u000ffs\u0015]\u00188O\u0010m]-E]5w\bYi\u0006~Yh&k$\fgL\u001c\u0017\u0004=\u0003\u0016b\u000b}VI\u0010\"`\fF%\u001b bbzj\u0002M\u0003\"\u000bc.H{~\u0002zJha>=>\rB\u0005nw7FX%\u000eo.\u0558A!\f+\u000biE\u0013\u000bl\u0011V`bB 2`X\u0015\u001dK\u0006\u0013h|\u001aDH\f߆Fc*iX\u007fc\u007f-\u0010H\u001a(_\u0010}\u0016D)\u00185g\u001a:ϭdMrl^m#<9\u0017O6qv\u07b5Mu\f.\u0005s\b<\\\u000fL~\rq\u000bz\u0005\u000fv!)o\u001b\b*Sy5C\u0014(\u0018\u000b<lI\u0001\u0001S\u0013\nNta[5M\u0016\u0006O\"\b܄\u001c&B\u0016U\r[ba\u001e\u0001nHC\u0012 C<+,\u0005\u0014[5;\u0010A?\\kpG:>dvM\u0013e=!V\u000b@(\u0010lYӦ\u001b@5Qk\u000f\u001b\u001c\t8\u001cw%91_\r\u0013\u001a`'fڞ\u0016W\u001f!<vw.pq0^s9SRm\f\t\u0003o\u0019\u0007%ƋU\nGkZ\u00106s(8&\u0001;Z\u07bdb\\:i\u0004\\\u0017<\u001eG*R2<r>1th,\u0007=Ǡh*kBKMXn5S#/&G˘\u000f;p9pVY\u0004F\r\u000f\u0015v\u0001G t\r>\u0018\u0014NӚ#$)YьJ,IK\n!\u001a4n!\u0013h$&u\f;L/.B6\u000e>X}˒\u001fwH\u0001\u001d\u0014Nn߿\b\r"}, d2 = {"\u0011@B\u0012R\u0010'AxghB\u001b`y\u000f_i\u0015Z m", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "\u001aj^A_0G\u001d\u0007\u000e\bb5~G\ro\b3wI\u0005! \u001d", "5dc\u00104\u001a\u001eM|gh>\u0015jl\u001eIp\bu*muv4", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJ\u0005&Ts\u0017>T/=dy);w\u001f\u0018JH;iCsXOf5\u0018_u^\u0006+N\u0016,6d]nJ\u0010!d\u001b$", "!sa6a.", "Asa6a.\u001bc\u001a\u007fzk", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8|A\u0001$l", "Asa6a.\u001bc\u001d\u0006y^9", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "0xc2f", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "=eU@X;", "", ":d]4g/", "1gP?f", "", "1nS2C6B\\(\r", "", "1`_6g(EW.~", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "1nS2C6B\\(Z\n", "7mS2k", "1nS2C6B\\([z_6\n\t", "1nS2C6B\\(\\\u0005n5\f", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1n\\=T9>B#", "=sW2e", "7f]<e,\u001cO'~", "", "1n]0T;-]\u0007\u000e\bb5~", "AsP?g\u0010GR\u0019\u0012", "1n]AX5M3%\u000fve:", "", "1gP?F,Jc\u0019\bx^", "2dR.c0MO \u0003\u0010^", "2dR<W,-]\u0007\u000e\bb5~", "Bga<j\u0016G7\"\u0010ve0{v/q\u0010(\u0005>\u0001", "3mR<W,-]u\u0013\n^\b\n\u0016+y", "3mS@J0MV", "AtU3\\?", "3pd._:", "4na:T;", "/qV@", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001cc{\u001c>mk$4H7|0g\u001cdj;PM)Sv%V\"\u0012\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJ\u0005&Ts\u0017>T/=dy);w\u001f\u0018JH;iCs{m]J\u0003-<]z.\u00113X*XYr\u0013z\u0017V\u001fJt\u0014\u0001bCm\\SD#\u0011.\u001fw\"m|\u001d\u0012W<fyD yD~\u0015sP~,-^[\u000bC\u000bL^3fUM,i>C&i", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJ\u0005&Ts\u0017>T/=dy);w\u001f\u0018JH;iCs{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013\nx_\n_'V\fUJ&8.4$\b*XW~O\u0006\b'\n~qlKXY5\t\"yJ+>", "7mc2e5", "7r19T5D", ":nf2e*:a\u0019", "<`c6i,\"\\\u0018~\u000eH-", "1g", "", "4q^:<5=S,", "Asa", "<`c6i,%O'\u000e^g+|\u001c\u0019f", "=eU@X;\u001bgv\ty^\u0017\u0007\r8t\u000e", "1nS2C6B\\(h{_:|\u0018", "@dV6b5&O(|}^:", "BgX@B-?a\u0019\u000e", "=sW2e\u0016?T'~\n", "@d_2T;", "<", "@d_9T*>", "=kS\u0010[(K", "<df\u0010[(K", "=kS#T3NS", "<df#T3NS", "@d_9T*>4\u001d\f\tm", "Ao[6g", "", "@dV2k", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", ":h\\6g", "AsP?g:0W(\u0002", ">qT3\\?", "AtQ@g9B\\\u001b", "Bn1Fg,\u001a`&z\u000f", "Bn25T9\u001a`&z\u000f", "2dbA\\5:b\u001d\t\u0004", "2dbA\\5:b\u001d\t\u0004H-}\u0017/t", "Bn;<j,K1\u0015\rz", "Bn?.g;>`\"", "4kP4f", "BnD=c,K1\u0015\rz", "Co_2e*:a\u0019", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    private static final String String(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    private static final String String(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    private static final String String(byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, i2, i3, Charsets.UTF_8);
    }

    private static final String String(byte[] bytes, int i2, int i3, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, i2, i3, charset);
    }

    private static final String String(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    private static final String String(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    private static final String String(char[] chars, int i2, int i3) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, i2, i3);
    }

    private static final String String(int[] codePoints, int i2, int i3) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, i2, i3);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y%cYJ-`Y'?b?T\n9Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final String capitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return StringsKt.capitalize(str, locale);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y%cYJ-`Y'?b?T\n9Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final String capitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final int codePointAt(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i2);
    }

    private static final int codePointBefore(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i2);
    }

    private static final int codePointCount(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i2, i3);
    }

    public static final int compareTo(String str, String other, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return z2 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.compareTo(str, str2, z2);
    }

    public static final String concatToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static final String concatToString(char[] cArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, cArr.length);
        return new String(cArr, i2, i3 - i2);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = cArr.length;
        }
        return StringsKt.concatToString(cArr, i2, i3);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt.contentEqualsImpl(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        return z2 ? StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2) : StringsKt.contentEquals(charSequence, charSequence2);
    }

    private static final boolean contentEquals(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    private static final boolean contentEquals(String str, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y%cYJ-`Y'?b?T\n9Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final String decapitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        StringBuilder sbAppend = sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return sbAppend.append(strSubstring2).toString();
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y%cYJ-`Y'?b?T\n9Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final String decapitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        StringBuilder sbAppend = sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return sbAppend.append(strSubstring2).toString();
    }

    public static final String decodeToString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final String decodeToString(byte[] bArr, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, bArr.length);
        if (!z2) {
            return new String(bArr, i2, i3 - i2, Charsets.UTF_8);
        }
        String string = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i2, i3 - i2)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i3 = bArr.length;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.decodeToString(bArr, i2, i3, z2);
    }

    public static final byte[] encodeToByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final byte[] encodeToByteArray(String str, int i2, int i3, boolean z2) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        if (!z2) {
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        ByteBuffer byteBufferEncode = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i2, i3));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((2 & i4) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.encodeToByteArray(str, i2, i3, z2);
    }

    public static final boolean endsWith(String str, String suffix, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : StringsKt.regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return StringsKt.endsWith(str, str2, z2);
    }

    public static final boolean equals(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return StringsKt.equals(str, str2, z2);
    }

    private static final String format(String str, Locale locale, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private static final String format(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private static final String format(StringCompanionObject stringCompanionObject, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String format(StringCompanionObject stringCompanionObject, Locale locale, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    private static final String intern(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strIntern = str.intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        return strIntern;
    }

    public static final boolean isBlank(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable indices = StringsKt.getIndices(charSequence);
            if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                Iterator it = indices.iterator();
                while (it.hasNext()) {
                    if (!CharsKt.isWhitespace(charSequence.charAt(((IntIterator) it).nextInt()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static final String lowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final String lowercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final int nativeIndexOf(String str, char c2, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c2, i2);
    }

    private static final int nativeIndexOf(String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i2);
    }

    private static final int nativeLastIndexOf(String str, char c2, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    private static final int nativeLastIndexOf(String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i2);
    }

    private static final int offsetByCodePoints(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i2, i3);
    }

    public static final boolean regionMatches(CharSequence charSequence, int i2, CharSequence other, int i3, int i4, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? StringsKt.regionMatches((String) charSequence, i2, (String) other, i3, i4, z2) : StringsKt.regionMatchesImpl(charSequence, i2, other, i3, i4, z2);
    }

    public static final boolean regionMatches(String str, int i2, String other, int i3, int i4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z2 = false;
        }
        return StringsKt.regionMatches(charSequence, i2, charSequence2, i3, i4, z2);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i2, String str2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 + 16) - (i5 | 16) != 0) {
            z2 = false;
        }
        return StringsKt.regionMatches(str, i2, str2, i3, i4, z2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.IntIterator] */
    public static final String repeat(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i2);
        ?? it = new IntRange(1, i2).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(charSequence);
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static final String replace(String str, char c2, char c3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z2) {
            String strReplace = str.replace(c2, c3);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        String str2 = str;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char cCharAt = str2.charAt(i2);
            if (CharsKt.equals(cCharAt, c2, z2)) {
                cCharAt = c3;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String replace(String str, String oldValue, String newValue, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String str2 = str;
        int i2 = 0;
        int iIndexOf = StringsKt.indexOf(str2, oldValue, 0, z2);
        if (iIndexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str2, i2, iIndexOf).append(newValue);
            i2 = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = StringsKt.indexOf(str2, oldValue, iIndexOf + iCoerceAtLeast, z2);
        } while (iIndexOf > 0);
        String string = sb.append((CharSequence) str2, i2, str.length()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replace$default(String str, char c2, char c3, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.replace(str, c2, c3, z2);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.replace(str, str2, str3, z2);
    }

    public static final String replaceFirst(String str, char c2, char c3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default(str2, c2, 0, z2, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt.replaceRange((CharSequence) str2, iIndexOf$default, iIndexOf$default + 1, (CharSequence) String.valueOf(c3)).toString();
    }

    public static final String replaceFirst(String str, String oldValue, String newValue, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default(str2, oldValue, 0, z2, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt.replaceRange((CharSequence) str2, iIndexOf$default, oldValue.length() + iIndexOf$default, (CharSequence) newValue).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c2, char c3, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.replaceFirst(str, c2, c3, z2);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.replaceFirst(str, str2, str3, z2);
    }

    public static final List<String> split(CharSequence charSequence, Pattern regex, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt.requireNonNegativeLimit(i2);
        if (i2 == 0) {
            i2 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i2);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return ArraysKt.asList(strArrSplit);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return StringsKt.split(charSequence, pattern, i2);
    }

    public static final boolean startsWith(String str, String prefix, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z2 ? str.startsWith(prefix, i2) : StringsKt.regionMatches(str, i2, prefix, 0, prefix.length(), z2);
    }

    public static final boolean startsWith(String str, String prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : StringsKt.regionMatches(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(str, str2, i2, z2);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return StringsKt.startsWith(str, str2, z2);
    }

    private static final String substring(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final String substring(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    private static final char[] toCharArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }

    public static final char[] toCharArray(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        char[] cArr = new char[i3 - i2];
        str.getChars(i2, i3, cArr, 0);
        return cArr;
    }

    private static final char[] toCharArray(String str, char[] destination, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i3, i4, destination, i2);
        return destination;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = str.length();
        }
        return StringsKt.toCharArray(str, i2, i3);
    }

    static /* synthetic */ char[] toCharArray$default(String str, char[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            i3 = 0;
        }
        if ((i5 + 8) - (i5 | 8) != 0) {
            i4 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i3, i4, destination, i2);
        return destination;
    }

    @Deprecated(message = "\u0018Y\u0001t}\u0004,\\jJ)\u000eU\\t\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final String toLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Deprecated(message = "\u0018Y\u0001t}\u0004,\\jJ)\u000eU\\t\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final String toLowerCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final Pattern toPattern(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i2);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    static /* synthetic */ Pattern toPattern$default(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i2);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0007\u0005%\\jJ)\u000eU\\t\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final String toUpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0007\u0005%\\jJ)\u000eU\\t\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final String toUpperCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final String uppercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final String uppercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
