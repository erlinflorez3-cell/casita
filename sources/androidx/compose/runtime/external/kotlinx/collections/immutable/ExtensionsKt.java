package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
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
/* JADX INFO: compiled from: extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d̉=!4i\bDJd|\u0004O\u00158\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JgP.hS2\u000fq\u0003<$q$yCIo\"}(\u000bWN}gvJ`\u0014K\u000f\u001c\u0016\u0001j:h]xk\u0012\u00172P\u0013G3[\u0011E9fv>\u0005.T*8\u007f\u0005\t\u001a@H\u0018v\tMS\f ;H\u0081BR#M\r܅\u001a\u0006T \t\u001ebkf\u0006VǍuF?%\u0013i\tN7a@|\u0014\u000etSG\u000f|ѭ,+`9;\u00143T3/`]W\u0017O\u0002C\u0004x37-Ys\u001e6h\u0002$\u0015qP;a!)|\u0011ab\u001c'qOsM`\u000enx)\u007fS;Ǭ\u0012\u00065MFX(l \u0014Cv\u0003S\u0007X0eb\u0002\u0001ʨD\u001fU\u0010A4Q#vUg:)N}\u00043\u0010>#GvgZڍ\u0012`#%l\n_<iFMJ^\n E\u001c\u0010\u0011d\bÏ\u00128\u000e~G'\u001f9/+G]I#gs0Tdi|ݓnp\u0004y`QX*~\u001a=)\u0019\f!L\u0013\b\fP\u001b`r\u0010ܖ T\u0015\u000b b.j\u0010H1' N\u0016hyl]]P&]eW[t\u0088\u001cWY`94_d@\n`x,SLr\u000bWvNc\u000ej\\n\"BJz\u0010>|rR:\u0016RK\u0002\u001eD,w\u0019l\u0017X\u0003dCo\u0001O^˖l\u0010\rYK6\u0011x<z\u0019\u0003`\\7w\u0016\u007fi.\u0003ʠ05\bPMD4d:nD~3\u0007E{.N\bNMƂz\u001e&e\n).\"IU5<#\u000fE1`\u0005ME\u0013z,P̊\u0016'\t\u0007\u0012-IxFs\u0018l\u0001,'jZQd\u0017hw\rqC\njр\baf|Mbb\f\"ŬaB\u0011iTZH~\u0015\u001fd%\u0011q2|{.q&=\u0018}ҡ=\u0015\u0002_on<z\u001374v}\u0018<s\u001cnr]m4K8\u0010Y\u000f@2$3\u0004pL\u0019z(N\u00196\u001d3\u000fAtrf8\u0014\f]\u0002-߿Ր\u0011pd`R%}\u000fL4o,\u0004CD\u001c\rJE\u0013Sωuu4жt6X \"\u0011\f3~\u0012bEN]wd\u000fݵ\u0014{HFODz\rL\r*3<<N\u0013qW\n\u0006V\u0003Fʋݍ\u0013\u0017@L\fMd l~lXX\u0005'M\u000f-J\u0003\u0005۰A&?߶I0{Xl5s4\u0011Sc\u0011Ivo\u0001lއ9L\u0005I)1p\t\u001bIcBY\u0002|\fu,\u000ek6\u0014~\u008eԠ!B&(Qo\u001fr\u000f<n\red\u0015d\u0007\u0014vR\u0015#W}\u001b~\u0014ڳ\u0018\u000f+\u001bUq}csًfGEV2\r'F9\u0007R|sH+-L6[<il\u001a՝\nWs=\u0004\u0007.!W,\u0003#tk\u001ev\u0010\\+F&s&bH\t#R0\u0004tK#v81(B_\u0004C\u0002Y^im\b!\u0007(YpLלƑlx\u0018h\u0005u|i#\tv3fy55~$))Sܘ!`!ϐ)~.l)\u0006$\u00176\u001f|\u0010\u001100Qi֬~s\u007fk\u001b4Gs:e7/b\u001eD'(x$*\u001b0[ܑ͇Q>r\u0013t\u0018Pl&dz*ttR1B\u0004\u001fJdƷ!<nx.f?7_'\n#wj\u0015\r]O6#AR\u0006#eIQ¡*\u000f<\u0011Ozz\u0010,R\t9\b\u00163MHZش(/\u0002*}f\u0013&\u0012MfI86\u001f\u0017)5j:0>#\"JR\u0018߃C1;\u000f-P\f\u007f\t)51Y\u0002;J\u0003\u0003ӕ\u001bG\"7{<\u000479+]% \u001fe\u007fS%{m\u0013ڿ\u0014֮iJ\rg{\t\u001dyDOEG.y\u001cH. ?&*Ԗ\u0004+(KAJ:_#H\u0005\n\b\u001043NvT'Mk\tsP4\u0018\u001b:߫[Ɉ8A\t/1oLBEr\u0017G]h@\u0013r#e\u0016=ʔ\u00141[\u001d\r\u0012_q\u00073w\t}9jfT\u0019\u0004\u0006J2(>(^\u0007î*\u001eX l{pzoa_V@@#-\u0006}ٚ`h(f-\u001a7K=Ndr)WOk#F\u001f&n.\t\u00149\"\\ǛH/,\fbx\u001b#5Ws\bO@b\u001c##ǎi-.+wlW?\u001cy\u0007Ii7\u0019\u0007bX{m#ձ]٠Od92\u0018\u001d9F_\\N\u001c:XL\u0016sph\u0012JэR0\u00166@2`~!K\f\rL+K^-m\u000f6h6kdW3eZ5ֱUǍ1x\u0010!(l'+#$c;B#:\u0015_J\u001c\nbųc\u0005\u0016O \u0005qJg74K_KYunkO\u001bg?E\u0014N>jʨ\u0013<\u000eu+\u0002\u00142a\u0013L|^WTk[\u0017ޯPr7\u0001\u0005\u000e>\f~]4I6\u001bp%MAoB<.7\u0011uk1ɹ*}.t\rqYU-\u0006\u0019\u00051\u0002\u0013sO&\u0015\u001dP|ZD܂e&`\u0015\b\u0019+'\n\nX-6\u0016ec4j\u0004Vp\u0011 5\u001a/\u0015}\u0001\u0006|>*>\u0003\u0092læjO\f;i\u000bp!x|XC b3,78Xj_\u0002/J\u0002\u0019\u001aεRvCi990bJam)MI\u0016\u000e1a\b\u0017\f]y7;n\\\t#&Vn\u0003\br\u0004]0Jk]5\rۜ@̛1Z5\u0010\u0001G8&$\t\u0015.~S\u0019Q\u0006!\u0003dE$L\u0019aY?݃/\u0013#\u001bB\u0007@N\u0001\t~\\b$>{L\u001f\"D\f53B\"zca\u007fpLc.+\u000ei> ;\u0003Xːcbb]\u0002z\u001dm0]wMYL[Q\u0002P#W#(\u0017-ܝV4j4(\"\u000f\u0010^&Zjtw5\t,\f?v\u0006\u000exnlr\u0017guUYCe_\u000fEs/ $\u0012ɖm\u0017UU&a\u001cJQ\\m<ck[64\r\u0605\u001298yp]R\u0017>\u0010\u0011;\u001c>\n`\u001b\u00141Stߏbɼrl\u0005syBK.%\u001a\u0015@\u0004)iHSf\u0001i\u0006ã\u0017xE=aGt\u000b\u000b\u0019VgbJ \u0018``v\u0012!\u0001\u0015K+\"D<\f\u07bf@ѽ\u0019[\u0012\f{|0\u007f`q81\u001aw\\>K\u0007U;\u0013߿^f]mn\u000be#T/\u001dV8{>;_cj\"?[N\u0016x}\u0013Ȣ\rY2zF\u000f|\u0003\u0019O\u0015H2s)=Ekޢu\r^rK_xS+\u0003Lu\fe59\u0016\f1\u0015Q\u001f\\\u0016R$Fݹ[L\u0007\u0004&XN#\u000e*Ct.B\u0011\u0006N\u000bĖ\u0018gYEcr)+>\u0006\rN5#3H@\u001d(0qr#q%(hiA +o\u0019\u0010JsS1s؏|\u0013k@58a A\u001a\u0013)^\b\u00021Iv1\"\bmNsߎ<j\u0010l}]\u001eP\u001aJm\u0003}5U(V&b=$b#EUZX`%567:2B\u0018~2+\\/}\u007fxbbXab\u001aEZP5YM/NGˑ\u000f;\u001599V_eHt\u000f-\u001d~J2`zɠw#07-\u0006\u0016K,XJ@y\u0010/\u0013LR22r\u001a4g\u001c\r\u0013v[FFaL\"gfI\u001cvߝ\u001d)jx\"\u001c5V\u0013\u0003\t79`_\u007f^%ݜl1\u0019q\n1`R\bU\u001dEJ\u001b4Qy7iS,œ$ȷk=W?-?-\u0018$z\u0013\u001fEq#fXU\"\b*۽P\u0007^vSlNub<B\u000bRnw=FJrS0\u0015\"e\u0015/\u0006t+ݩaߞ\u0002:[5\u001a\nW4%,3/\u001b\u001bp\u000bzZq5r˶U]\u001fb\u001d\u0011A=0O^b&\u0005\f%JwPy\u0003a2>s\u0017^ѳDa\\@/$V\\q\r0\u0010\u001az!b\u0014\u0019սN&(!fhY4\u000f}\u000bL\u001dgR2\u0016\u0014v8}>RUsrtƔ65\nx,\f|fh#?]\u001aD\t\u001f>sɒ\u0013mN):H\u0010Syi*c\u0004n\u001da/2+<\tǆ'Ĳ\"*b=#=]\u0015L$HN\tF\u0015M\u0010\u0011N$ Ӳ6\u0015Vv\u007fRJXGetEk)\u0002]xA\u0002d|V7P/?D\u000e8ٌCֻc^/Kw6!w5Y#U\u0012QsZiCg[\u000eɠTt04/Gy\u001f6\rfzoUx\u001f?Egyk`pH2\u001anرD8Q T%DM \u0007\u0014|/3\u0017wRjخ\u0001RB\u001b{R\u00197XMkO\u0006jizS+nL\u001c\u0011k.]%`Ԣg\u0005x\u0003B\u0007p\u001cSI]v1`d\u001ai\u0018n>y\u001d\u001e:ζ0Y2C\u001c\u001av\"aUwM94\u0014\u000e\u0017P\u007f\u0001AX;l\u001ca\t,@\u00056WJ\t\u000eihp)}hn)F;a>F_\u0011P1Xi>у1߉$bv/\u000e8g\u0013.j7tG]E\u007f\u007fiUf\u000eF{d@wX҈*Ytn\u0015i\u0007UmJtzH+RL= \u001c\u000e`f~ hJ*8zW]5\u0001'lb\u0011Na\u0013!s!}R\u0003'ɝF5?D43\u001fR\u0019\u000b\n8\ri:\u001dt|F{X\u0002#8َHt\f\u00039\u001a!\u0005<=$`ag\r*<i\u001c.@$\nloNU7\u001f%\u0005\u001eGWp\u0007\nbq*\n\u0007\u0015('GGK\"L\u001d\u0018\u0007ߟvn~VTF\u0003\u0003\t3\f3\u001a$m`- v\u0015\u001c\u0006:\n\u0000!]ddR\f\u001f(R;\u001d P\b]I\u001a;A(\u001c\u0014\u0002\u001e\u0002P\"\u0016<>\u000b\u001fB\u0003\u0006\u001dFu\ra\u0005e\b<\fC\f\u001bQҨ>LQ\u001dwl~\u00142\f\u0015\u0013\u0011S^atK_r\\?)\u0014۴\u00150=~vdR.*\u001ev$wC\u001eMN\u0018~MI!(l2t&mr\u0019Z]\")\u0010M\u00134\u0010Enjwp\u0019D\\tJB\nq3ןV3`tK^\u00185OtnT,9\u0017ri@ԱLR$M^Kt\r3n\u000b,|Q\u0003JJ\u0015E\u001b\nљ\tԙ?\u001f\u0006{~s\u0004\u0012\u0013c7\u0015;z\"\u0017)<gNbԐ1<\t##O2S$\u001ah\u001b !\f\t (X\u001c\u0007,^2kK\u001a&8\u07bcBѿGO||\u0001\",%zh:G\u0017\u0007l>v)K\u00153՟\u0011\f\u000b7d|yG\u0016\"C.x5\u001d\u001f/s`\u000fm\u0018\u000eGuj+ޡ7\u0018\u000bux*\u001a8.?\u0010cU\u0017vJx$֖=V>\u0004.x\u0002\u0015mXR\u001bb\\\r\u0006<>**\u0012\u0014\f$K\u0005*ǧ\fE\"Im!\u001a^Y\u0001\u0005w_\u0005q\u0003eeS9@\u0003\b\u0005ǠV19-W=-s\rR;i8IS\u0012d/@+J\t5:Rb\u001c\u001d\u0007yo{)s1rNmUFBBL+\u001a\f *\u001f9G?\u0011Z\u001fֺȚr~bwX3\u0003t\u0007\u0015 38\rYPz?K@\u0015\u007fToKI3ݣ}\u001dI\u000f\u0015\u0017cV^1EfI\"Q<iyJ\u000b3\u0015\u0013\u001c-\tdX+|)\u000eLW^luECa\u0007u\u0001\u0005F_\u001c=\u0001w\u00038hׂK1JRftD(UkkS;%#\u001f9\u0011(\n9C\u0001üq-f\u000b\u000f(GH*[\u0004Ry\n\u0013#y\u0017\f\r{n\u0002*sh|E$L\bbAC{g1k|\u0004O[.\u00020QACqҌD\\,\u0001 ]YZNovPj}o\u0018\\7tqd5aʮ\u0011}DH\u0002Isw\u0016\nNO\u000b\u0013=L\u0019:M\u000b\u001fQ\u001cu021+_\u0016S1&\u001bS/\u0015&oi\u000b;]tq7=ht1421ߓ\fP\"\u0005b`:\u0014M&\u0013%2G\"Y\u001aN\u000bƻ-=\u0012?Y|R\n|-rU}-v<bѽe\u0002#\u001bb#FpfrD<VǕFp9E*X|?O?\u0016&w\bjl\u0016څ?G\u0018\u0013\";\b\u0007\u001ei\u0004\"3ɾ[k3?tvWy~~&+efO\u001eZ{m\u0003\u007fdkɃ@dB\u0018W#Z!\u0001\td6eD\u0007Ld\u0011nC8\ndZ\u000e˴_\b\u001f}\rGe!++i\u0019-m\u000e/s;TƆTe3d/8$OR':?kh\u0010\u0012fƅw7\u0016[*\u001f\fTY\bFh\bÕm\u0003n3W+wU#\u0014rU^H?Rpɩ9\u0014Fy\u0004\u0015p>)_hc0Ϥ~\u0005\tT\u001d\u000b6J.*L\u0018_\";ll7}ft>HԎ0Swx\n5kx\u001b\u0001m_)KL%VG\u0012\r*`\"EIľ\u000f\u0003Vm\u0002>bG$$eu\u001a\u0003t1na,Я\u001e3\n\u0019\u0005\u001fu.8@+41\u0002%Lq§^v\u0019\u001f\u000ba\u000e'\"\u0005+*9џroP)\u000fLALhwo;?j\u000eAE߇^%Sy;\u007fBux\n i\u001aϗ26\t#\u0010/\u001ck]@U?l\u001bO\u0017~W3ՙ\u000f%ku0\u0002SLrb/ncr_{vǫ|DH\u0003)6'G)\u0014$JI՞+GFqcu;[C%[I#\u000e\\Obʃ\u0011\u0010\u00157V\n\u001e+\u0002p6iOϛ\u0010{Q*\ngLS 1Hi\u001c2!wb\u001f,SUC\u0002ұ1wX\n\b\u001awI\u0012a\"(>1v\u00101Q\u001eT\u0013Opg9Ⱦ;N2\u001arl\u001d;\u0019yJp=\u0007PL.\u0007,خ\b\u001e\\\u000b__}\ri=\n/RZu{\rˢ\r0y NapMP\nw\u007flӂ\u001f \"t<\u0002\u000bw\\1P@#->F\u001cȝ\u001bJ\u0017YR,~rM?-x0ƔؒRI"}, d2 = {"7l\\Bg(;Z\u0019avl/d\u0005:O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013\u0002", "\u0019", "$", ">`X?f", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;8b;EW\"HeZ0\n^rL{1zM\u000b\u001b\u0016Z9\fF~0?g}iD}\u001f=QK;541$hnB\u0003juT\u00016NPW?&P|D\u001b\u0012X\u001dR5\u0016\u0013#E,vTF\u001b\u00053IK&h\u000e\u001a\u001a\u001cDjyQ>\fRO", "7l\\Bg(;Z\u0019avl/j\t>O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "\u0013", "3kT:X5Ma", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_x5w~Fd\u001fG\u0003$cA8>", "7l\\Bg(;Z\u0019e~l;f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\u001f", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_x5w~Fd\u001fG\u0003$\\E7w\u001c", "7l\\Bg(;Z\u0019fvi\u0016}", "7l\\Bg(;Z\u0019lzm\u0016}", ">da@\\:MS\"\u000e]Z:\u007fp+pi)", ">da@\\:MS\"\u000e]Z:\u007fv/ti)", ">da@\\:MS\"\u000eab:\fr0", ">da@\\:MS\"\u000ebZ7f\n", ">da@\\:MS\"\u000eh^;f\n", "7mc2e:>Q(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u0015)\u000f3I\u007fJl\u000b\u0015k", "", ";h]Bf", "3kT:X5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF|\u00123P\u00029w\u0005\u0016\u001fc\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d\u0005,^3c\u0019i![M\u0004\"\u001ey$%vPw\u0017\f\\ vZy1gZ(zE-:t%LO~\\@}:hI\u0006~\u00192V\u0004/~6\u0012}.>l\u0015Zc\u0015E^B\u007f,iO+4E<\u001cN)m|s>\fw#k\u0011c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF|\u00123P\u00029w\u0005\u0016\u001fc+Qu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017\tI&m\u000bl'`9Mm\u0012{!&r^.S\tc\u001a\u0002V\u0002g1G,\n81Gib\u0010KydCx02\u0015y\u0002\u00199Xr:x7\rBs:l\r[v\u0014;ex^\u0017\\N5*DK\u0013HZA\u007fsE\u000ef.e\u0012\u00178", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0006\f:XW\"m|\u001d\u0012W<fyD yD~\u0015sP~,-UhxTKIa=.\ni%gDH$]~)$wT6\nES$\u0002R\u0007pcNb\u0001B3EqdY\u000fm_C{'\u001dZ\u007f\u0002\u001b@\"x3|=\u00130'=dN6g%Lb\u0007$,eP\u000e*DKh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0006\f:XW1O\u0006\b'\n~qlKXY1v\u001au?8>\n@[\u0003FNOf)wU]'dED2\u0014;&+q_2\u0012{\u001d\u0011\u0006aytpC D>.Mt_OX9SF{.\u001fI\u000b{\u001c;f>/|5\u0014C&3k\u0005\u0015R\u0018Kl|#;\\J6\r:J\"\u0015", "9dh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0007\u00047\u001fh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017lOBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.S{f r_\u0003cn\u0011\u001f\u0005G+Bvn\u0010Cy\\Ct%.O\u0006\u0001 {\\|3\u0005<\u007f116.oKt&Bl\b\u00155k)#1\f", "9dh@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0007\u00047\u001fw\"m|\u001d\u0012W<fyD yD~\u0015sP~,-UhxTKIa=.\ni%gDH$]~)$wT6\nES$\u0002R\u0007pcNb\u0001B3EqdY\u000fm_C{'\u001dZ\u007f\u0002\u001b@\"x3|=\u00130'=dN6g%Lb\u0007$,eP\u000f\"A\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\r\b;\u001fh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017lOBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.S{f r_\u0003cn\u0011\u001f\u0005G+Bvn\u0010Cy\\Ct%.O\u0006\u0001 {\\|3\u0005<\u007f116.oKt&Bl\b\u00155k/'5\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\r\b;\u001fw\"m|\u001d\u0012W<fyD yD~\u0015sP~,-UhxTKIa=.\ni%gDH$]~)$wT6\nES$\u0002R\u0007pcNb\u0001B3EqdY\u000fm_C{'\u001dZ\u007f\u0002\u001b@\"x3|=\u00130'=dN6g%Lb\u0007$,eP\u0015&E\u0012", ";tc.g,", "\"", ";tc.g6K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "", "", ">kd@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0007\u00047\u001fw\"n\u000b\u001b\u001d\u0012>4[>Z\u001d\u001d={qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dhc=\n\t\\\ry\u001c\u007fqvN\u001d\u0004Km<wbMEmd@~0-\u0015\u007f\u007f\u001aBgp({-M\u001f*Cr\tYv\u0018Gm`\u001172", ">`X?", ";`_", "", ">tc\u000e_3", "Bn8:`<MO\u0016\u0006zE0\u000b\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n+;-\u0017\u0002", "", "", "Bn8:`<MO\u0016\u0006zF(\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n,3*]", "Bn8:`<MO\u0016\u0006zL,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n27.]", "Bn?2e:Ba(~\u0004m\u000fx\u00172M{3", "Bn?2e:Ba(~\u0004m\u000fx\u00172S\u007f7", "Bn?2e:Ba(~\u0004m\u0013\u0001\u0017>", "Bn?2e:Ba(~\u0004m\u0014x\u0014", "Bn?2e:Ba(~\u0004m\u001a|\u0018", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExtensionsKt {
    public static final <T> PersistentSet<T> mutate(PersistentSet<? extends T> persistentSet, Function1<? super Set<T>, Unit> function1) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <T> PersistentList<T> mutate(PersistentList<? extends T> persistentList, Function1<? super List<T>, Unit> function1) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> mutate(PersistentMap<? extends K, ? extends V> persistentMap, Function1<? super Map<K, V>, Unit> function1) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        function1.invoke(builderBuilder2);
        return builderBuilder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E e2) {
        return persistentCollection.add((Object) e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E e2) {
        return persistentCollection.remove((Object) e2);
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, Sequence<? extends E> sequence) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, Sequence<? extends E> sequence) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E e2) {
        return persistentList.add((Object) e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E e2) {
        return persistentList.remove((Object) e2);
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E e2) {
        return persistentSet.add((Object) e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E e2) {
        return persistentSet.remove((Object) e2);
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.addAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.removeAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> intersect(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.retainAll(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> intersect(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((Object) pair.getFirst(), (Object) pair.getSecond());
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return putAll(persistentMap, iterable);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Pair<? extends K, ? extends V>[] pairArr) {
        return putAll(persistentMap, pairArr);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        return putAll(persistentMap, sequence);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K k2) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((Object) k2);
    }

    public static final <E> PersistentList<E> persistentListOf(E... eArr) {
        return UtilsKt.persistentVectorOf().addAll((Collection) ArraysKt.asList(eArr));
    }

    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> PersistentSet<E> persistentSetOf(E... eArr) {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll((Collection) ArraysKt.asList(eArr));
    }

    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf(E... eArr) {
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll((Collection) ArraysKt.asList(eArr));
    }

    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf(Pair<? extends K, ? extends V>... pairArr) {
        PersistentOrderedMap<K, V> persistentOrderedMapEmptyOf$runtime_release = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull(persistentOrderedMapEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builderBuilder2 = persistentOrderedMapEmptyOf$runtime_release.builder2();
        MapsKt.putAll(builderBuilder2, pairArr);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(Pair<? extends K, ? extends V>... pairArr) {
        PersistentHashMap<K, V> persistentHashMapEmptyOf$runtime_release = PersistentHashMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull(persistentHashMapEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builderBuilder2 = persistentHashMapEmptyOf$runtime_release.builder2();
        MapsKt.putAll(builderBuilder2, pairArr);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u0018Wo`w-Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    @InterfaceC1492Gx
    public static final <E> PersistentList<E> immutableListOf(E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u0018Wo`w-Dq\u001ae\u000bKon\u001c", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {}))
    @InterfaceC1492Gx
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u001fSp;\u000ff\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    @InterfaceC1492Gx
    public static final <E> PersistentSet<E> immutableSetOf(E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u001fSp;\u000ff\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {}))
    @InterfaceC1492Gx
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u0014OoT{,\u0019W\u0012\u0012\u007fT\u0002~Su(4", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    @InterfaceC1492Gx
    public static final <E> PersistentSet<E> immutableHashSetOf(E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u0019Ol;\u000ff\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    @InterfaceC1492Gx
    public static final <K, V> PersistentMap<K, V> immutableMapOf(Pair<? extends K, ? extends V>... pairArr) {
        return persistentMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Deprecated(message = "\u0018Y\u0001t\u0002y'jaZ<\u007f^)\u0014OoTu(\u0015W\u0012\u0012\u007fT\u0002~Su(4", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @InterfaceC1492Gx
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(Pair<? extends K, ? extends V>... pairArr) {
        return persistentHashMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <T> ImmutableList<T> toImmutableList(Sequence<? extends T> sequence) {
        return toPersistentList(sequence);
    }

    public static final ImmutableList<Character> toImmutableList(CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    public static final <T> PersistentList<T> toPersistentList(Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> persistentListBuild = builder != null ? builder.build() : null;
        return persistentListBuild == null ? plus(persistentListOf(), (Iterable) iterable) : persistentListBuild;
    }

    public static final <T> PersistentList<T> toPersistentList(Sequence<? extends T> sequence) {
        return plus(persistentListOf(), (Sequence) sequence);
    }

    public static final PersistentList<Character> toPersistentList(CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet == null) {
            PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
            PersistentSet persistentSetBuild = builder != null ? builder.build() : null;
            return persistentSetBuild != null ? persistentSetBuild : plus(persistentSetOf(), (Iterable) iterable);
        }
        return immutableSet;
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Sequence<? extends T> sequence) {
        return toPersistentSet(sequence);
    }

    public static final PersistentSet<Character> toImmutableSet(CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    public static final <T> PersistentSet<T> toPersistentSet(Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> persistentSetBuild = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return persistentSetBuild == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), (Iterable) iterable) : persistentSetBuild;
    }

    public static final <T> PersistentSet<T> toPersistentSet(Sequence<? extends T> sequence) {
        return plus(persistentSetOf(), (Sequence) sequence);
    }

    public static final PersistentSet<Character> toPersistentSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet persistentHashSetBuild = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        if (persistentHashSetBuild != null) {
            return persistentHashSetBuild;
        }
        return plus(PersistentHashSet.Companion.emptyOf$runtime_release(), (Iterable) iterable);
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Sequence<? extends T> sequence) {
        return plus(persistentHashSetOf(), (Sequence) sequence);
    }

    public static final PersistentSet<Character> toPersistentHashSet(CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        StringsKt.toCollection(charSequence, builder);
        return builder.build();
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap = map instanceof ImmutableMap ? (ImmutableMap) map : null;
        if (immutableMap == null) {
            PersistentMap.Builder builder = map instanceof PersistentMap.Builder ? (PersistentMap.Builder) map : null;
            PersistentMap<K, V> persistentMapBuild2 = builder != null ? builder.build2() : null;
            return persistentMapBuild2 != null ? persistentMapBuild2 : persistentMapOf().putAll((Map) map);
        }
        return immutableMap;
    }

    public static final <K, V> PersistentMap<K, V> toPersistentMap(Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap = map instanceof PersistentOrderedMap ? (PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof PersistentOrderedMapBuilder ? (PersistentOrderedMapBuilder) map : null;
        PersistentMap<K, V> persistentMapBuild2 = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build2() : null;
        return persistentMapBuild2 == null ? PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll((Map) map) : persistentMapBuild2;
    }

    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
        PersistentHashMap<K, V> persistentHashMapBuild2 = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        if (persistentHashMapBuild2 != null) {
            return persistentHashMapBuild2;
        }
        return PersistentHashMap.Companion.emptyOf$runtime_release().putAll((Map) map);
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, Sequence<? extends E> sequence) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, Sequence<? extends E> sequence) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.addAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, Sequence<? extends E> sequence) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.addAll(builder, sequence);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.removeAll(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, Sequence<? extends E> sequence) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        CollectionsKt.removeAll(builder, sequence);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        MapsKt.putAll(builderBuilder2, iterable);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        MapsKt.putAll(builderBuilder2, pairArr);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        MapsKt.putAll(builderBuilder2, sequence);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends K> iterable) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        CollectionsKt.removeAll(builderBuilder2.keySet(), iterable);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K[] kArr) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        CollectionsKt.removeAll(builderBuilder2.keySet(), kArr);
        return builderBuilder2.build2();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, Sequence<? extends K> sequence) {
        Intrinsics.checkNotNull(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builderBuilder2 = persistentMap.builder2();
        CollectionsKt.removeAll(builderBuilder2.keySet(), sequence);
        return builderBuilder2.build2();
    }
}
