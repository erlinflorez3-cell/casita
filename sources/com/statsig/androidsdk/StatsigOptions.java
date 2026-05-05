package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007f\u0007lkA0RlP\u008cZS8\u0015s{:$c$\u007fGCU ~*\t]pogtKb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012\u00152JoM3UڎE9n\u0013>\u0005&2*8\u0010\u0005\tɝ2H&v\u0003CQ\r\u001a0VpBR\u0013j\r\u001a )F \u0007Jdgd6Plc;E݊3ipMg܂0\rS\u0013Fb'%v\u0010\u001f;F=5#'k\u00035SkE\t?\u007f@\u001dhU+;OyWD]\u0018\u0014C/_\u0013cr4b\u001dQ\u000f\u001071UcYW&(&\u0003\f\u0013B\u0004\u001c\u000f?H\\7*l\u000e\u000eA\u007f\u000bSnT\u0012dH\u007f\tmN\u0017S\rC3?\u001bt_y=/Me|\u0015\u0013$#\u000f}9[\u0003\u0012p)!T\u0006aI_P?XN8ZMo\u0014p\u0011\u0001@\u0003^X\u00105\u0002\u0011<)=7\n=3)q\u0002VW\u007fx\u001b_\u0017WyuN@0\u0003.T:\u001a\u001cirzʰoZZo<\u0017S4d\t\u0004\u000e99lyL!S*dN\u0017~z[c\n3J~?ip{\u000e\u0006:t2cms\u001egR\u00051WDr\u0007hfpT\"Y\u000bD2FNj\u001e\u0016\u0014R^\u000e#2m\u0011,6<1Gv+G13RY\u0003\tmz\u0001\"\u000fVC$1j4v\u0019\u0001~r\u0001qwxw-+\u000223GQC;>UPlD\u0003)\u0007\r\u0017\u0018G\u0016PWTr\u0016\u0004y\u0014\",\u0019gvȠA\u0013\u001d%qD\u0010\u001a]Z\u0003gaM@(\u000b~\n\u000fiiDf609EnXb]d\u00192v\rs3\ft\u0002\u0010`tyut\u001bެИBIxq\"P\\(\u0015\u0005M8U\u0005}\u0013\u00155[DW!$i,/Cb&u}!\u0012b=@%i\u0012 {\u0016\u001eW\u001av@1PWi\u0001N\"Rm\u0013FXl\u000e\u0007p\bb\u001eyǥыhp\\/\u001e'=}~\u0007Z\u000e'Z\u001a>i̒\nӑ2k2ϒ[\u007f\u001a\u0006QM1OY\u0011{\u0018\u001cx\u0019V'\n9\tgrP \u0014պb͓f\u00158ү\f\u001a<lI\u000f%>\u000fQBZ\r2\u0019cl{\u0016\u0012\u000b\u007ft`\u001f\u0019BB\"Qf\u0010dx\u000bWv&7ѫlՃ.\r\u0007۰K ~d?5\u000eHZ`qdQo+\f3j}\u0003\u001d)iH+ګ'Ϝ\\\r\u0013ԵuEO5D8g+s!}B\t4\u000b\"Z\u0018I=\b\u0015\u001ez\u0007ͤ\u0017ڀhZlɺ*hX\u00060]\u001f|\u0003FJ@_+'b\u000bqx,zR.;\u0002\u001eWӇPͫ\u000b\u001a\u0005cTXE\b;fK\u0004\u000b\u0016-7e\u0010\f\u0016\u0016B8'2xwƿcˍj\u0016eͩR\u0018wTp6)\u0015V_\u0012d\u001b\u0011\u0001\u0010F\bdS87@\u00175̗w֏%L/ߜ\u0005\bH\fv-*er%|\f[\u001ft<ny\u001d1\u0007!G+$ܠ\u001f͠^F\u0019֦8Z\u0017B\"IF!<Kp_`iq-\ty_]\u001d+]l:cA0\u0001\u001f\u0014\u001e(;Zա`Ӳ\u0019;^צ\u000f\u000b\u0017z\u0005Pg\u0010njV\u0004\u0005\u000e9\u0014+\u0019^]?(\u000bП~۠h;?؟7]\u0013\u000enN$GOn/z#[)9J\u000b\u001e)-\u0015A>9ߕ\f̂F\u0015zυ\u007f.3\u0011be:)_o{\u000fSBYNPB66G\u0012O31߈,ۋ`&$ԝi5Ge\u001fN5:\f>\u0015h\u0006\u0007_Z=*/\u00057\u0011}}\bˑFތ;~+˄'q!(t\rE7k\u001f5_R\nX\u001aekf\u0011q,w6[\u001d(qv\u0004H#zږ\u0012Ñ'\fMʹ`,e1N,\u0014Y\n|8\u000e?`1Y\u0005x\"\u000ebmVw;՟mƍE\u0007\u001cԌ\\@0\u0006z;eOnS\u0019z]o\"G'\u001495'|>P\u0002B;I!LE[\fMIwB>\t\u074bB̹KLaآ\u001e/\u0018/qF\u000boW<\u001e\u0016b)\u001b\u0013\u00101\u0001d6d[\u001c}֗\u0003̒:h\u0001\u0090Yd\u0011\u001f\u001dX~0Hk\u0019<fRV4\u001a\u0006Zb%\u0013aH\n@u.\r\u007f_!g؋1͘)srޯWWw9K\u000fS\rs,f\r6v\u0013y9Mz*C%Aݣ:ܻZJ\"߭p\b\u0014(r,0F~)6S\u0001H>s\u0017ZqaW\u07fc+ߚY!mۿJd=BrEK9]V`\fsK\u0007\u0010\u001b\u0012W\u0018A\fTWw6yљ\u0019жB\b\u0010֟aW\u0003VW8#cP\u000b=0\u0010hO_\u0005suP)fm\u0015Ǯ$1*\u001d#*h\u007f#k\u0014(\u0006\u001c\\8f)veo\u0010\u0015W!\u00139xbˠ\u0018ޮY\u0012Eڽ)d\" I'`.4\\\u0017\u0011ۋns"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "", "/oX", "", "3uT;g\u0013HU\u001b\u0003\u0004`\bgl", "2hb.U3>1)\f\b^5\fd-t\u00049\u007fO\u0015}!Iq\u0012Ex", "", "2hb.U3>2\u001dz|g6\u000b\u00183c\u000e\u000f\u0006B\u0003\u001b I", "2hb.U3>:#\u0001|b5~f9m\u000b5{N\u000f\u001b!P", "7mXAG0FS#\u000f\nF:", "", "7mXAE,M`-e~f0\f", "", "3mP/_,\u001ac(\tkZ3\r\t\u001fp~$\u000b@", "/tc<I(Ec\u0019n\u0006](\f\t\u0013n\u000f(\tQ|\u001e~Kx\u001eKv3", "", "=uT?e0=S\u0007\u000ev[3|l\u000e", ":nP16(<V\u0019Z\tr5z", "7mXA\\(EW.~kZ3\r\t=", "", "7mXA\\(EW.~d_-\u0004\r8e", "2hb.U3>6\u0015\r}b5~", "CrT?B)CS\u0017\u000ekZ3\u0001\b+t\n5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "CrT?", "", "7mXA\\(EW.~[Z3\u0004\u0006+c\u0006\u0018\tG\u000f", "", ":nV\u0012i,Gbyz\u0002e)x\u00075U\r/\n", "3uP9h(MW#\bXZ3\u0004\u0006+c\u0006", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$k\u001c<T/>Z\u0002\"\r", "1tbAb4\u001cO\u0017\u0002zD,\u0011", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "2hb.U3>:#\u0001Zo,\u0006\u0018\u001ce\u000f5\u007f@\u000f", "=oc\u001ch;']\"lyd\u0014|\u0018+d{7w", "=m32i0<Sx\u0010ve\b{\u0005:t\u007f5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`1xl<\b)3Y]13tq-INJkAs", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#B8 O)|{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013\tx_\n_'V\u0015hE+8,3*]!0\u00077y|U\u001d\n>l:\u001f`\u001aNy\u0011~\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001a>(`lcX\u0015DH3Bt%-I}d\u0012[,\u001b\\wA\"A\\{t[1\u0012C\u007f\u001dj\u000fZn\u001cG(}&4&B7/4K\u0017ITq?MN\u0017f.e\u0012\u0017.\u000b\u0018\u001fotjL\u0018Pb(c~bo\n5a\nHR}^\bV\b@j}\u001f\u0012SybZ0A%\\J(\u007f@1m\u0015\u0005Lb!\u001b; AX\u001dg0)!Vq\ty<\n{9T\u0011w$\u000fiV\u0002[dEg'", "5dc\u000ec0", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ec0", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u000eh;HD\u0015\u0006\u000b^\u001c\b\b+t\u007f\f\u0005O\u0001$(Cvu@\u007f5DY\f", "u(3", "Adc\u000eh;HD\u0015\u0006\u000b^\u001c\b\b+t\u007f\f\u0005O\u0001$(Cvu@\u007f5DY\f", "uC\u0018#", "5dc\u0010h:M]!\\v\\/|n/y", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010h:M]!\\v\\/|n/y", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "5dc\u0011\\::P ~Xn9\n\t8t[&\u000bD\u0012\u001b&[V\u0018>x)>[", "u(I", "Adc\u0011\\::P ~Xn9\n\t8t[&\u000bD\u0012\u001b&[V\u0018>x)>[", "uY\u0018#", "5dc\u0011\\::P ~Yb(~\u00129s\u000f,yNg!\u0019Is\u0017>", "Adc\u0011\\::P ~Yb(~\u00129s\u000f,yNg!\u0019Is\u0017>", "5dc\u0011\\::P ~]Z:\u007f\r8g", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u0011\\::P ~]Z:\u007f\r8g", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u0011\\::P ~ah.\\\u001a/n\u000f\u0015{O\u000e\u001b\u0017U", "Adc\u0011\\::P ~ah.\\\u001a/n\u000f\u0015{O\u000e\u001b\u0017U", "5dc\u0011\\::P ~ah.~\r8g]2\u0004K\u000e\u0017%Us\u0018E", "Adc\u0011\\::P ~ah.~\r8g]2\u0004K\u000e\u0017%Us\u0018E", "5dc\u0012a(;Z\u0019Z\u000bm6m\u00056u\u007f\u0018\u0007?|&\u0017", "Adc\u0012a(;Z\u0019Z\u000bm6m\u00056u\u007f\u0018\u0007?|&\u0017", "3me6e6G[\u0019\b\n", "", "5dc\u0012i(Ec\u0015\u000e~h5Z\u00056l|$yF", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0012i(Ec\u0015\u000e~h5Z\u00056l|$yF", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u0012i,Gb\u007f\t|`0\u0006\u000b\u000bPc", "Adc\u0012i,Gb\u007f\t|`0\u0006\u000b\u000bPc", "5dc\u0016a0M@\u0019\u000e\br\u0013\u0001\u00113t", "u(8", "Adc\u0016a0M@\u0019\u000e\br\u0013\u0001\u00113t", "uH\u0018#", "5dc\u0016a0MB\u001d\u0007zh<\fp=", "u(9", "Adc\u0016a0MB\u001d\u0007zh<\fp=", "uI\u0018#", "5dc\u0016a0MW\u0015\u0006~s,]\u00056l|$yFp$\u001eU", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0016a0MW\u0015\u0006~s,]\u00056l|$yFp$\u001eU", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0016a0MW\u0015\u0006~s,f\n0l\u00041{", "Adc\u0016a0MW\u0015\u0006~s,f\n0l\u00041{", "5dc\u0016a0MW\u0015\u0006~s,m\u00056u\u007f6", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u0016a0MW\u0015\u0006~s,m\u00056u\u007f6", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "5dc\u0019b(=1\u0015|}^\b\u000b\u001d8c", "Adc\u0019b(=1\u0015|}^\b\u000b\u001d8c", "5dc\u0019b.\u001ed\u0019\b\n?(\u0004\u0010,a}.kM\b%", "Adc\u0019b.\u001ed\u0019\b\n?(\u0004\u0010,a}.kM\b%", "5dc\u001ca\u000b>d\u001d|z>=x\u0010\u000bd{3\u000b@\u000e", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9wEU%F]{ \u0017~\u00125)B7vC\u001e\">", "Adc\u001ca\u000b>d\u001d|z>=x\u0010\u000bd{3\u000b@\u000e", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011Y\u0017\u001bv69W}\u007fHi\u001d\nL?Fz4+j,R", "5dc\u001cc;(c(g\u0005g\u001a{\u000f\u0017e\u000f$z<\u0010\u0013", "Adc\u001cc;(c(g\u0005g\u001a{\u000f\u0017e\u000f$z<\u0010\u0013", "5dc\u001ci,K`\u001d}zL;x\u00066ec\u0007", "Adc\u001ci,K`\u001d}zL;x\u00066ec\u0007", "5dc\"f,K=\u0016\u0004z\\;m\u00056i~$\u000bJ\u000e", "Adc\"f,K=\u0016\u0004z\\;m\u00056i~$\u000bJ\u000e", "5dc\u0012a=B`#\b\u0003^5\f", "5dc\u0019b.@W\"\u0001Xh7\u0011", "5dc\u0019b.@W\"\u0001Xh7\u0011G+n~5\u0006D\u007f\u0011%Fu\bIv,5U\f ", "Adc\u0012a=B`#\b\u0003^5\fs+r{0{O\u0001$", "9dh", "D`[BX", "Adc!\\,K", "BhT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`6s\u000eIL", "Bn<.c", "Bn<.cj:\\\u0018\f\u0005b+v\u0017.ky5{G\u0001\u0013%G", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigOptions {

    @SerializedName(alternate = {}, value = "\b\u0016\u000e")
    @InterfaceC1492Gx
    private String api;

    @SerializedName(alternate = {}, value = "\b\u001b\u0019\u0013x\u0003\r\u0015\u0004r\r\u007f{\u000e}`\u0005\ny\u0006\tr|\\w{\u0002\u007fo|")
    @InterfaceC1492Gx
    private double autoValueUpdateIntervalMinutes;
    private Function2<? super String, ? super StatsigUser, String> customCacheKey;

    @SerializedName(alternate = {}, value = "\u000b\u000f\u0018\u0005\u0005\u000e\u0006b\u0014\u0010\u000f\u0001\t\u000eYz\u000b~\u000b|\u0007\u000b\\~utuyq")
    @InterfaceC1492Gx
    private boolean disableCurrentActivityLogging;

    @SerializedName(alternate = {}, value = "\u000b\u000f\u0018\u0005\u0005\u000e\u0006c\b~\u0004\n\n\r\r\u0001y\t`\u0003yxy}u")
    @InterfaceC1492Gx
    private boolean disableDiagnosticsLogging;

    @SerializedName(alternate = {}, value = "\u000b\u000f\u0018\u0005\u0005\u000e\u0006g\u007f\u0011\u0005\u0005\t\u0001")
    @InterfaceC1492Gx
    private Boolean disableHashing;
    private boolean disableLogEventRetries;

    @SerializedName(alternate = {}, value = "\u000b\u000f\u0018\u0005\u0005\u000e\u0006k\u000e\u0005\u0004\u0005\t\u0001[\u0007\u0004\u0006\u0007x\u0006\u0005y~|")
    @InterfaceC1492Gx
    private boolean disableLoggingCompression;

    @SerializedName(alternate = {}, value = "\f\u0014\u0006\u0006\u000f\u0007a\u0015\u0013\rr|\u0007\u000f}l\u0007yu\bw")
    @InterfaceC1492Gx
    private boolean enableAutoValueUpdate;
    private Map<String, String> environment;
    private Function1<? super BaseConfig, Unit> evaluationCallback;

    @SerializedName(alternate = {}, value = "\f\u001c\n\u0012\u0017m\u0010\u0007\u0006\u0007\u000b\u0003[ia")
    @InterfaceC1492Gx
    private String eventLoggingAPI;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u000e\u0018t\u0007\u0015\u0012\u0018i\u0006\t\u0004\u000e")
    @InterfaceC1492Gx
    private int initRetryLimit;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u000e\u0018v\u000b\u000e\u0005\u000e\u0013\u0011h\u000e")
    @InterfaceC1492Gx
    private long initTimeoutMs;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u000e\u0018\f\u0003\r\t\u0019\u0003b|\u0007\u0006zxy\u0001i\u0006~\u0005")
    @InterfaceC1492Gx
    private List<String> initializeFallbackUrls;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u000e\u0018\f\u0003\r\t\u0019\u0003k\u0002\u0001\u0006\u0002\u0006{")
    @InterfaceC1492Gx
    private boolean initializeOffline;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u000e\u0018\f\u0003\r\t\u0019\u0003r|\u0007\u000f}\u000b")
    @InterfaceC1492Gx
    private Map<String, ? extends Object> initializeValues;

    @SerializedName(alternate = {}, value = "\u0013\u0015\u0006\be\u0003\u0004\b\u0004^\u0010\u0015\t|")
    @InterfaceC1492Gx
    private boolean loadCacheAsync;

    @SerializedName(alternate = {}, value = "\u0013\u0015\fh\u0019\u0007\u000f\u0014d~\t\b|z{\u0003k\b\u0001\u0007")
    @InterfaceC1492Gx
    private List<String> logEventFallbackUrls;
    private OnDeviceEvalAdapter onDeviceEvalAdapter;
    private boolean optOutNonSdkMetadata;

    @SerializedName(alternate = {}, value = "\u0016\u001c\n\u0016\u0015\u000b\u0005\u0005q\u0012}}\u0007~a[")
    @InterfaceC1492Gx
    private String overrideStableID;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016q\u0004\u000b\u0005\u0002\u0012r|\u0007\u0003|x\u000b\u0005\u0007")
    @InterfaceC1492Gx
    private Function1<? super StatsigUser, Unit> userObjectValidator;

    public StatsigOptions() {
        this(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
    }

    public StatsigOptions(String api, String eventLoggingAPI, boolean z2, boolean z3, boolean z4, long j2, int i2, boolean z5, double d2, String str, boolean z6, Map<String, ? extends Object> map, boolean z7, Boolean bool, Function1<? super StatsigUser, Unit> function1, List<String> list, List<String> list2, Function1<? super BaseConfig, Unit> function12, Function2<? super String, ? super StatsigUser, String> customCacheKey, boolean z8, boolean z9, OnDeviceEvalAdapter onDeviceEvalAdapter) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(eventLoggingAPI, "eventLoggingAPI");
        Intrinsics.checkNotNullParameter(customCacheKey, "customCacheKey");
        this.api = api;
        this.eventLoggingAPI = eventLoggingAPI;
        this.disableCurrentActivityLogging = z2;
        this.disableDiagnosticsLogging = z3;
        this.disableLoggingCompression = z4;
        this.initTimeoutMs = j2;
        this.initRetryLimit = i2;
        this.enableAutoValueUpdate = z5;
        this.autoValueUpdateIntervalMinutes = d2;
        this.overrideStableID = str;
        this.loadCacheAsync = z6;
        this.initializeValues = map;
        this.initializeOffline = z7;
        this.disableHashing = bool;
        this.userObjectValidator = function1;
        this.initializeFallbackUrls = list;
        this.logEventFallbackUrls = list2;
        this.evaluationCallback = function12;
        this.customCacheKey = customCacheKey;
        this.disableLogEventRetries = z8;
        this.optOutNonSdkMetadata = z9;
        this.onDeviceEvalAdapter = onDeviceEvalAdapter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatsigOptions(String str, String str2, boolean z2, boolean z3, boolean z4, long j2, int i2, boolean z5, double d2, String str3, boolean z6, Map map, boolean z7, Boolean bool, Function1 function1, List list, List list2, Function1 function12, Function2 function2, boolean z8, boolean z9, OnDeviceEvalAdapter onDeviceEvalAdapter, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z10 = z8;
        AnonymousClass1 anonymousClass1 = function2;
        Function1 function13 = function12;
        OnDeviceEvalAdapter onDeviceEvalAdapter2 = onDeviceEvalAdapter;
        List list3 = list;
        boolean z11 = z7;
        Map map2 = map;
        boolean z12 = z6;
        String str4 = str3;
        double d3 = d2;
        boolean z13 = z5;
        boolean z14 = z3;
        boolean z15 = z4;
        boolean z16 = z9;
        Function1 function14 = function1;
        int i4 = i2;
        boolean z17 = z2;
        List list4 = list2;
        Boolean bool2 = bool;
        long j3 = j2;
        String str5 = str2;
        String str6 = (i3 + 1) - (i3 | 1) != 0 ? StatsigOptionsKt.DEFAULT_INIT_API : str;
        str5 = (i3 + 2) - (i3 | 2) != 0 ? StatsigOptionsKt.DEFAULT_EVENT_API : str5;
        z17 = (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? false : z17;
        z14 = (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? false : z14;
        z15 = (i3 & 16) != 0 ? false : z15;
        j3 = (-1) - (((-1) - i3) | ((-1) - 32)) != 0 ? 5000L : j3;
        i4 = (i3 + 64) - (i3 | 64) != 0 ? 0 : i4;
        z13 = (-1) - (((-1) - i3) | ((-1) - 128)) != 0 ? false : z13;
        d3 = (-1) - (((-1) - i3) | ((-1) - 256)) != 0 ? 1.0d : d3;
        str4 = (i3 & 512) != 0 ? null : str4;
        z12 = (-1) - (((-1) - i3) | ((-1) - 1024)) != 0 ? false : z12;
        map2 = (i3 & 2048) != 0 ? null : map2;
        z11 = (-1) - (((-1) - i3) | ((-1) - 4096)) != 0 ? false : z11;
        if ((-1) - (((-1) - i3) | ((-1) - 8192)) != 0) {
            bool2 = false;
        }
        this(str6, str5, z17, z14, z15, j3, i4, z13, d3, str4, z12, map2, z11, bool2, (i3 + 16384) - (i3 | 16384) != 0 ? null : function14, (i3 + 32768) - (i3 | 32768) != 0 ? null : list3, (i3 & 65536) != 0 ? null : list4, (i3 & 131072) != 0 ? null : function13, (-1) - (((-1) - i3) | ((-1) - 262144)) != 0 ? new Function2<String, StatsigUser, String>() { // from class: com.statsig.androidsdk.StatsigOptions.1
            @Override // kotlin.jvm.functions.Function2
            public final String invoke(String sdkKey, StatsigUser user) {
                Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
                Intrinsics.checkNotNullParameter(user, "user");
                return user.getCacheKey() + AbstractJsonLexerKt.COLON + sdkKey;
            }
        } : anonymousClass1, (i3 + 524288) - (i3 | 524288) != 0 ? false : z10, (i3 + 1048576) - (i3 | 1048576) != 0 ? false : z16, (i3 + 2097152) - (i3 | 2097152) != 0 ? null : onDeviceEvalAdapter2);
    }

    public final String getApi() {
        return this.api;
    }

    public final double getAutoValueUpdateIntervalMinutes() {
        return this.autoValueUpdateIntervalMinutes;
    }

    public final Function2<String, StatsigUser, String> getCustomCacheKey() {
        return this.customCacheKey;
    }

    public final boolean getDisableCurrentActivityLogging() {
        return this.disableCurrentActivityLogging;
    }

    public final boolean getDisableDiagnosticsLogging() {
        return this.disableDiagnosticsLogging;
    }

    public final Boolean getDisableHashing() {
        return this.disableHashing;
    }

    public final boolean getDisableLogEventRetries() {
        return this.disableLogEventRetries;
    }

    public final boolean getDisableLoggingCompression() {
        return this.disableLoggingCompression;
    }

    public final boolean getEnableAutoValueUpdate() {
        return this.enableAutoValueUpdate;
    }

    public final Map<String, String> getEnvironment() {
        return this.environment;
    }

    public final Function1<BaseConfig, Unit> getEvaluationCallback() {
        return this.evaluationCallback;
    }

    public final String getEventLoggingAPI() {
        return this.eventLoggingAPI;
    }

    public final int getInitRetryLimit() {
        return this.initRetryLimit;
    }

    public final long getInitTimeoutMs() {
        return this.initTimeoutMs;
    }

    public final List<String> getInitializeFallbackUrls() {
        return this.initializeFallbackUrls;
    }

    public final boolean getInitializeOffline() {
        return this.initializeOffline;
    }

    public final Map<String, Object> getInitializeValues() {
        return this.initializeValues;
    }

    public final boolean getLoadCacheAsync() {
        return this.loadCacheAsync;
    }

    public final List<String> getLogEventFallbackUrls() {
        return this.logEventFallbackUrls;
    }

    public final Map<String, Object> getLoggingCopy$android_sdk_release() {
        return MapsKt.mapOf(TuplesKt.to("api", this.api), TuplesKt.to("eventLoggingApi", this.eventLoggingAPI), TuplesKt.to("disableCurrentActivityLogging", Boolean.valueOf(this.disableCurrentActivityLogging)), TuplesKt.to("disableDiagnosticsLogging", Boolean.valueOf(this.disableDiagnosticsLogging)), TuplesKt.to("initTimeoutMs", Long.valueOf(this.initTimeoutMs)), TuplesKt.to("enableAutoValueUpdate", Boolean.valueOf(this.enableAutoValueUpdate)), TuplesKt.to("autoValueUpdateIntervalMinutes", Double.valueOf(this.autoValueUpdateIntervalMinutes)), TuplesKt.to("overrideStableID", this.overrideStableID), TuplesKt.to("loadCacheAsync", Boolean.valueOf(this.loadCacheAsync)), TuplesKt.to("initializeValues", "SET"), TuplesKt.to("disableHashing", this.disableHashing), TuplesKt.to("environment", this.environment), TuplesKt.to("initializeFallbackUrls", this.initializeFallbackUrls), TuplesKt.to("logEventFallbackUrls", this.logEventFallbackUrls), TuplesKt.to("disableLogEventRetries", Boolean.valueOf(this.disableLogEventRetries)), TuplesKt.to("initRetryLimit", Integer.valueOf(this.initRetryLimit)), TuplesKt.to("initializeOffline", Boolean.valueOf(this.initializeOffline)));
    }

    public final OnDeviceEvalAdapter getOnDeviceEvalAdapter() {
        return this.onDeviceEvalAdapter;
    }

    public final boolean getOptOutNonSdkMetadata() {
        return this.optOutNonSdkMetadata;
    }

    public final String getOverrideStableID() {
        return this.overrideStableID;
    }

    public final Function1<StatsigUser, Unit> getUserObjectValidator() {
        return this.userObjectValidator;
    }

    public final void setApi(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.api = str;
    }

    public final void setAutoValueUpdateIntervalMinutes(double d2) {
        this.autoValueUpdateIntervalMinutes = d2;
    }

    public final void setCustomCacheKey(Function2<? super String, ? super StatsigUser, String> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.customCacheKey = function2;
    }

    public final void setDisableCurrentActivityLogging(boolean z2) {
        this.disableCurrentActivityLogging = z2;
    }

    public final void setDisableDiagnosticsLogging(boolean z2) {
        this.disableDiagnosticsLogging = z2;
    }

    public final void setDisableHashing(Boolean bool) {
        this.disableHashing = bool;
    }

    public final void setDisableLogEventRetries(boolean z2) {
        this.disableLogEventRetries = z2;
    }

    public final void setDisableLoggingCompression(boolean z2) {
        this.disableLoggingCompression = z2;
    }

    public final void setEnableAutoValueUpdate(boolean z2) {
        this.enableAutoValueUpdate = z2;
    }

    public final void setEnvironmentParameter(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> map = this.environment;
        if (map == null) {
            this.environment = MapsKt.mutableMapOf(TuplesKt.to(key, value));
        } else {
            map.put(key, value);
        }
    }

    public final void setEvaluationCallback(Function1<? super BaseConfig, Unit> function1) {
        this.evaluationCallback = function1;
    }

    public final void setEventLoggingAPI(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventLoggingAPI = str;
    }

    public final void setInitRetryLimit(int i2) {
        this.initRetryLimit = i2;
    }

    public final void setInitTimeoutMs(long j2) {
        this.initTimeoutMs = j2;
    }

    public final void setInitializeFallbackUrls(List<String> list) {
        this.initializeFallbackUrls = list;
    }

    public final void setInitializeOffline(boolean z2) {
        this.initializeOffline = z2;
    }

    public final void setInitializeValues(Map<String, ? extends Object> map) {
        this.initializeValues = map;
    }

    public final void setLoadCacheAsync(boolean z2) {
        this.loadCacheAsync = z2;
    }

    public final void setLogEventFallbackUrls(List<String> list) {
        this.logEventFallbackUrls = list;
    }

    public final void setOnDeviceEvalAdapter(OnDeviceEvalAdapter onDeviceEvalAdapter) {
        this.onDeviceEvalAdapter = onDeviceEvalAdapter;
    }

    public final void setOptOutNonSdkMetadata(boolean z2) {
        this.optOutNonSdkMetadata = z2;
    }

    public final void setOverrideStableID(String str) {
        this.overrideStableID = str;
    }

    public final void setTier(Tier tier) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        String string = tier.toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        setEnvironmentParameter("tier", lowerCase);
    }

    public final void setUserObjectValidator(Function1<? super StatsigUser, Unit> function1) {
        this.userObjectValidator = function1;
    }

    public final Map<String, Object> toMap$android_sdk_release() {
        return MapsKt.mapOf(TuplesKt.to("api", this.api), TuplesKt.to("disableCurrentActivityLogging", Boolean.valueOf(this.disableCurrentActivityLogging)), TuplesKt.to("disableDiagnosticsLogging", Boolean.valueOf(this.disableDiagnosticsLogging)), TuplesKt.to("initTimeoutMs", Long.valueOf(this.initTimeoutMs)), TuplesKt.to("enableAutoValueUpdate", Boolean.valueOf(this.enableAutoValueUpdate)), TuplesKt.to("autoValueUpdateIntervalMinutes", Double.valueOf(this.autoValueUpdateIntervalMinutes)), TuplesKt.to("overrideStableID", this.overrideStableID), TuplesKt.to("loadCacheAsync", Boolean.valueOf(this.loadCacheAsync)), TuplesKt.to("initializeValues", this.initializeValues), TuplesKt.to("disableHashing", this.disableHashing), TuplesKt.to("environment", this.environment));
    }
}
