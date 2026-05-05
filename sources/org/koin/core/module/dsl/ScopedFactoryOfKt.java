package org.koin.core.module.dsl;

import com.dynatrace.android.agent.Global;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яı\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr9FDmH<R[*%k\u00044:[,qI;]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&ձoNLHtҗB/9\u0003qĩV'u0\u0005ձ\u0015Fj'\u0015Ǹi\u001eA@?ߎ\u001d%i\u0003\u000fѸc?\u0019?yܵ\rh='3ɞ{WLX\bϬ-\u0007]Օux6^\u0015Q'\fU*ogQִ\u001c(\u000ey$\rj\u0005>\u0012-J</2l\u0018\u0010Ct9SnS2\nH\b\teN<5\bC1I\u001dvQ(;GTG}\u0015\rL*\u0017mO`=\u0016p\u0017+T>QGP\u001fE˓R\n_F4ՕvŠ\u0001Ï\u001c\u001aUĉG\u0002!0'%}[g\"Ao\b҆Rg\r\u0004\u0001lYh`RV!\u0017\u0016e+9\u001e`Fr\u0007\u0004\\dZ<\u0011\u0014&d\t\u000e\bY \u000b|lL+\u0018\\S\u0001\u000fzUm\u001051v7 n\u001a\u0014g;n3cXy\u000f\u0010W_\u001cO>r\u0005\u001ffXRjbڅ,\"8Q1ݟ}մC\u0088$\u000b@ŭ\n\"D.A\u0019#\u0015v\u0002>FGґ\u0017_pg0\u0003Z22\r\u007f#\u0015\r\u0007Pj{\u0006f!IZ}\u0011:3C_718e$x4C-\u0017\u0001\u0004\u007f\u000er\\I\\l\\u\u0004\bPA A_3U8\u001f\u000798\u0012/UL9e\u007fS\")\u000b|(\u0016Qg\\lpr\u0001.pj\u0011Oj\u0016\u0001~݈v#\u000emFןgĸyò{ӂ\niŬax\u0013[LN~|3\u001e>)\u0007ǻ0|K,c+#\u0015\u0006\u001eE\u0014\u0002aoo<\u0005x\u000eFxk\u0005:p,n\u000bQ\f3kVO[\r@:<|\u0005RH1\u0002\u0018D\u00194S>XCtp\u001dE]\r?}-\u0007Z\u001b!\u0002aB!s\u0016Y>g:yS\u007f$^\n%?Sci}myc!I=\u000fs\u0004Ap\"\u001c\u0004 lVA\u0011ޘ\ns\u001e?\bݬhǖ;ɿ<ҟ+Jފ#Idk\u0016\u0010A\u007ft^/\u001b8߿\u0002;l\rt|bUV\u000fvD\u0001%0\u0001\r\u001aI\u001d\u001997\u0006{Sj.\u00046\u0007U+\u00181iw~\u0015&[hZ;)*p\u001f\u001bGmC\u0010\fF\u0006W)4v\u007f\u000eH\u0018C*R\u001a+9\u0018 ox@^QU\u0013^\u0015\"\u0018n`R:N\u000f\u0003\r\u0014L\f\u001f\u000b_O!ur/\\N&>Y\u0019/\u001c-1\u0017\u000e\rc\r\u001bC\u0005\u00145ִMj\u001a0B\u0080Yʅ|И8č&\u0012Ȍ9bg\u0010v\n$\u001bh\u0015\u0012\u001ahկ\u0017\u0013f\u001f$2Ps\u0001\u0014D\u0007VS\b3\u0010\u001etX\f{'A58\u0003\u0005bOnz\u0018r\u0003b\u000fY\u0011\u0006tBlx\u0017-~\u001e9QS0!Zr^!U0XW\n$\u00176\u001f|\u0013r+ O*u\u0001m_[S:?m:awAb \u000e\u001f@u2<\u0005S\u001bCdQV\n\u0019d|Hg\u0010njnd#\u00129\u0016\r~ve'\u0012bK[&t1G\u0019e[#F?\u000fʺII,*wģEن6ָ#Ò'\u0005֫\u001b@rv\u0010*\t\t!~\b03õb=0&y(sc\u00110aDXF\u000e,\u001f\u0019'.z<&?j'2:q7G\u001b\u001f\u0010+7&s\r\u001cC{gRE.\u0007\u0001\u000f UxYkhtg#)1\u001dq3\u0002v=55,V7\u000e\u0012e\u0011\n]ef\u000f(9Y7U\u001e@dP\u0002\u001a\u001fj5\u0016w3\u007f\fDX,o\\\u0007V\"k4Q0>|H;l|\u0001\u0004\u0010<k(s+[\u0010:Q|$\u0019rE@,\u001b\f.Ux{\u001bDSE*6m\u000eԠ7\u0017\u0003\u0019\u0016ƇF֭HלeӍ[k٪+y\u0014<Ba|yu?y.\fЌ Tyi\u000bqW^\u001eB(\f-\b}1`k\u0016_=\u001c-L\u0005SL[\u0019QGd\u0019O%#~2H\u000f\u0019\u0017,-h\u001b\b\u0002Xs+\u0012SKyFU'lzI\u001d?\\U<+ixIW\u0006\u0002ZM9y\u0015}Lh5,g\u0015W1K+8%\u0002z+tVf@**\u001f\u0017\u001eGtHVW\tF8mvE@R\u000fZ\n]/2Oh[\u001ds\u0003J\bGct\u0017;9gn\u0019UQ3\t\u0004\u0013\u0010o )\nLX\":3u\u001d1\u0005{\u001e[(]ߑqI\u0016\f(ĵ'ɋ\u0005ܚGУJzɟ}E)YO~R U#&\u0017*߬u\u0013\u007f\rBc\tKD`?Gk]\u0017fPu%y\u0015\u00104\rFb\u001c<&\u0015h\u001eCJu?L2v\fU`\u0001zJiuj\u0003lcDKy\u001fC?\u0007'boc\u001at_sn=?WTAC> \u001f4c\u0014~92'U*wzud`WdDm@d@\u007fvfNc\u0005KXn)f\u0016\u000f+STbOs\u0001JQ\u0010)\u0002<)FH10\u0011\u0003[a]\u0014e\\'Nm;H&yGce5MZ\b\u001ej(wC\u0002m5F\r\u001e3\u0013\u00143COz\u0014n\u0015Mv\u0004\u0002.\u0011N۾D\u001c3cmтnɒ)ă$к\u0004:̴kXaw/r+~Q\u001d:E]ٵU!)\u00029@\u000e1[b\u0011mx`+.\n\u00115\u0011b\u007f;mO\u0001\u00122wuU6k-?|\n{&\u0010y#\u001abj'Ump$s-m{\r^JnW\u0001*&/*\u0016,=\u0001h8P90<\u0017\u000e^\u0018xg\u001f;+\u000bs\u000eG1\u0006\u0010Bm\u0005}v_w4\bHe_\u000fEs<\u0002\n[I4\u000e;I\u001eI\\K_N}u\"Pd\u0018B\u00076\u0019A\u0012\u0004`\"Y'y\u0018bz\u0005J}W\u0003ZjyHJ\u0006lvzzh\u0007 E&\u0013$\u0007Nso#n+obw\u007fi\u0010\u0007\u001ceV.l\u001bF!('2T\u0011mPڹj\u000e!\u000bKĒjϽ\u0015˗]§?Yфs\nwea\".H\u001a'O\u000e}ןD\u001d\u00164Y\u0011yOl?}])Y)\u000e5ye\u0007\u001248Hkg6.{\f\u0014Lt[f\fa\u000br1\u0005\b\t\u0016_\u0019\b.S53B\u0006\u001dm\nD\u0002Q\\\tWj\u0001,\u0006qZG4\u0004\r/,W\u001e6\u0012*\u0010\u000e\u0010q3wu/Ax[\u0012\u001cQ0 V\u0015g\\\u0005{\u0014Q3OS7$;yo^\t\u0012\u001d'1(Q'8c|\u00136&8$S\u0013=.}\u000b \u001c\u0010:\u0019/avA1B\u00120UVX\u001a\u0015r^>\u001b1K@0:\t{h\u001e)4r}n\u0010\u0004 W\u0002Bm\u0001\b6\f(>,b=$b\u000bK=ZVI\u007f\u0016.!:$x\f\u0005/ydč\u0002o|[)ۆfГmκpל49Ĵ\u0019,\u0011\u0003\u0019#$+B=yYLł\u001df\rOc\u0016dsLs\u0013\u0007Q!\n\u0006YpH\u001bYM\u007f\"yAV!Jf\u001a&s\u001b#Kp1 9mM88\\\u001fy4\r*'?\u000bx\n4T&\t\b\u001158Oms5+~-vr\bHfQaQt7(2<7\u0002;)Ts?2D\u0010=w&E[%l\u001av\u001beEsl^pI\u0012\b4\u0014\t\nFrSj\u0005\u0003,6$thqy6>B)`:\u0018\"e\u0015:gst\u0013(I\u000e<]\u001aHuY\t\u001d&iF\u001b\u001d:\u0003\u0013_a5|c\u000er\u0007^\u001d\u000fw=\u0018e`w{\u0003\f J\u0017P\u007f\u0003g{8U\u007f^)rOA4\u0012\f~S\u0006{^NzT\u001bD\"\u0013x@4~y^ܥM4N~#ҥrӰCٟ\u0016ޚfD\u05cbV\u0012]Gf.L6K^\u000b\u0003yԃdf)>7\u0016\u001c{\rF\u0004d%i,#8Q\u0016RSe\u0002Xaw%G76j6P#5\n>.Z#\u0019\u001cefT\">P\u0007YdD\u0002\t4'(w>\fNtuVHo\u0017\\f=A$\u0002mv8\u0012d|_5k~66\u000fw;Qiu]A1e\u0015!i3R;S0R]'A9U[ &Vn\u0018.eOy!\u007f\u0005~yOMz\u0016mLgyk`pO\u0014\u00058\u0015\u000b16\u00147\r\u0005P.x$6m\u001a\u001bY`dH\nZ\u001c%k\u0017\"G\u0014U=\npp]\u0002;k{Z\u000e!%lN\u0019\u001c9g3&#5\u001f\u0010\u0012YGaHV`j\u001aoao zC\u001cb\u001c2[\"AD\"~ gLPQC7\u0014\u000e\u0017P\u0006}\u0010`\u05f8omhaZΦ\tѵBӸ\u0011ڶjf߱1\u0002hprFq_\\E9\u0014(\u07b68f\u000eOI=&av\u000b\fqyi\u001c^5}M\\\u001f\u0004uhSs]Dmi&w`\n2Xtp\u0015m\u0007e[;\u0005zH0P_\r\u001f,\u0010VkF4PJ\u001a,r.S@\u0007$|fPU_*'rz\u0001*\u0007nXT\u001c\u0014:\r$!_-y*u\u0013cF,\u000b5eQ_l/Sw9\u001dk/4Km\n\u0016=\u0016t0x~:u0\u0016<24C2L_'1\u0011iy\u001c9Y`A\tpc:CM\u00166\u0019W\u0001\u0011\u0007Xp\u0011@'\u0004f9X't\u000e\u0003\t3\f33$m`- \u0011v\u001fu8J\u001a#_Tb\u0013,!):-S=Z\u000b]I\u001a;_H<?A%aU\n)>\u0016\u0003\u0017B\u0001\u0010\u001e|utg\u0005e\b<sIsh9S\u001f<\u0016\u0011ZT9\u0004FzsTݒG\\W}KСJؑ\u001eד&ܖ\u0007>\u0088\u0015vuF=\u0002VfNpd\u0012Sߠ&na8Aeq\u0003\u0004\u007fmc7FQ\u0012)\u000bW\u0002R\u0004K)xt\u0005\bd\u001ay\u001eLjkk/R!9t/\\\u0011EQjr\u001c7!\u000frk@$L_\u0012FnMj\u0013z}r$lQz8@.\u0015\u0012c&\u0007GI:\u000eW\u0007E{m\tz=\u0012K~a\u0019\tT]K|i)?n>)LBWc\u001eH7\u0006\u0014&\u007f6!xx\u0007/\\4=\u001e{%\u0002\t\tzSQ~X/\u0002.yrbpR\u0017\t66\u000f1;\u0015=\u0011I\u0015r3dz0Z_\u001c%'\u000f@\u001f\u0018'm\u0017$m\u001aW?\u000elt G\u007f&\u0003[\u0014$(rL \u001f]h6I\u0007 =/\u00157\u000e \u0007q[J`&$2\u0019~+HhE.\n\"I4Bxk\f\u0012=RK;O\u000e|]\u0001\u0007A_#v\tdMWsIr\b\u000fA\u000f1/*0F\u0590vdJ4,öPܰ\u0011ٵGǡ)Hڔ\u0007?4e{\u0005?w\u0006f9g1ȅLa[CRF\f*\u0018\u0014&)x<\u001f;pbnm3r\u0005UWM~sbr\u000f\u0012?7#\u0012pnC>N_\u0015%\u0011/M1=\u00033(-\u0013\u001eZcK94\u0003G)GJ:\u00109)'\u001bS)\u0018 3b!\u0001\u0019\nW_M\u0001iI<o]\fo#:e_Jq\nSA&/>x]6M\t8,QyHi*C\u0017%\u007f\u001e\u001f!\u0018iz\u0014d]-\u000f\u000b7;_b]u^sQ\r35'{Qv~=9E0YC\u0018,o\u001b@Owx!2G\u0014Ai\u001eH|`\u0015\"+rA\" ^\b\u0018`h@\u007f0\u0017s\fa(\u0016|a\u0003FC[; \u000e&V{\u0011\u0005\u0007o\f>\u0012&$/\\R\u0001`\u0019\u0011aU;'C\u0003%QZ;M<=n)\r2c\u0002iKU\u0003gGxwFs\u0006Dp4uP\u0014\u007fQp)@B\u000fl\u007f\u0006#y k.C*\u001d́\b\fG\u007f\t̓rƀ+ԃgǳVH˹\u001d]k|%Rg6\u001f\u001fl\u001a+ܐ8.j*2\u0016XkKIUN MYJx\u001bG0As\u0013\u0013G\u0005\u001dVcY\fnSRS$(`pJ\u0006\u007f\u0015^KYjC,'\u0011>jchjTGz!6U*R.o\u0013STYJGZm%]cu\u000f>7b\u0006F\u0018\u0015J}Or5\u001aK?i\tt\u0005ED%\u00121GWFA\u0016R\u0018SN5\u0017/<Ns\u0016mW\u000f'lu\u001e#\nb:w\u0017yAyV\u0017M\u007fA3iky$.?0T)`l\u0004+4)\u0004u#`\u0005oI<Wi[uf|)\u0005E7X :\u0006^b0-|&|dwVLBO9cY\u0007\u0004|v\bt\u0005]$4[\b5F\f\u001f\u001deosZ\"ix\u0003Hw\u000bHTU\u0014jZPm\fLwe;g\u007f\u0006]#ln)er(n\r>.\u0001\rXofu`x)\u0001o\u007f7[%|Ax\u0013\\cB\u001b}\\0x]`1%\u0013sm\u0006?UO]3͙/}8~x΄w͓Rϗ2՞zsߑA\u0012yOP'P>=&7T'ܓ\u001cv\u001f\\X\u001c\u0002BXlxgh9l?\b{\u001em>$\u0003\u001aB$]a\u000ey9\u0005r\"A7TOu.gD;\u0014Cx\b@[o\u0019\u0002\np7K\u0016#A:j\fS\u000f_\u000fcB\fuaC_)G\u0001\n\u00106\u0019\u000674|t9G\u0005\u0003@\u000e7(\u0006!sV\tk\u0011F27;\u001eBe\rtPTND\u0016+\"^(`gt2O\b\u001a A\u001d\u000eOb~pi~~\u0010waF\u0002m9Zm6\u000f&aW\u0012sG\u0001\u001aQ`Hob]\n*Tx(>\u0007J!E&\fz<[A\f*tl/T\u0018q\rj\u0002cD:n9\u001c)\u0001lib`^\u000b4\t\u0015!M\u0005\\-:\f\u0004\u0016K\u001dG>O]o~[u3<\u0003$?=9Txz`N&\u0017wl\ngQS\u0011\\\u001auo\u0016\fs,[av\f<\u000e\u001e6BzX\u0012WQ+$\b\u0001O\nv\u0013\u0010=\u0018q~\n\u001e\u0013FZc\u0014m^6\u0016%\u0013Z;Np!\b\u001b\u000b\u0019E\u000fԴ\u001bS+\u000fpƵBڸLڹcх\u0017V͓]]3_\u0005~l\u0003\u001anOL\u0010ȓ;;c&N.:\u001b\u001e\u0013\u00023{\u0002z0b.\"-s6\u0016\u001f-\rl\u0016\b YEgl\u0001\"[\u0010mqd&>,M4\u0019(^0\u000b.\u0010)B7e8\u0019\"\u001e\u0001\u000e6g@/<}\u0015\u000b+Z;H\u0007\"U*5z\u0004\u0012\u000fM]JI\u001aBkW\u0016\u000e<l:\u0012\u0012]Dc\u0018+s,\u001eIm,*Bd^6y\u0017R7zH{]~H=J<T4\rCKtv\u0019'(ti>l68S\u0018fHcG\u0019/E\n\u001b5oA<5qap~_\u0003\u0019deD\u001f\nXu\u001d\u001c\u007f>(\u0018wm\u0005SUW\u0012=:A\u00118NrnG\"u1`/V:<oPtjV'\u001eBWB3T5nTTZ#\u000f\u0018K^^gwh\rwvG\u001dsT\u0010tdUQ=~\u001a-><<l7M\u0002<|v\u00021k7mH9v\u0016~]HQ\b|rxK8>`gt\u000f`\ro$\u001e\u0012<>,\u0003&R<D`H\u0007UB J\u0007n8w)_-\f@\u0018D$. q8 ٌ2/; iû\u0005ÓOڌ_Ȝ5yݳ\u001bj1!;Q@K^_\u001e\u0017\u000e˸Z\u0004hhCw\fO]\u0014.)p]KB\u001c/nW\u0018\r>\u0007\u0018a5AF'\u001cb4\u001bAi\u000fQJ[\bmXu\u0018R9\u0014.\f>\u001fh\u001amTxC(EMwx\u0011*\u001atm?KX\u00118&%O\u001eM3yDNLU$WMj\u0012~s\u00049^/N\u0005E\u0013\u001dI\u00194IjT1\u001e\bsFRqw\u001b]vUg&L[0q49H\u000f\u001a\b`[!uTbSP$E\u0013O\n\u0003\u000f=GY\t?$,\u0014oec\u0014fwZ\u0018։*\\/a){~a;j+\u0012Ym\n{H3\u001fH;_s\u0016n'L\u0011I\u001c20=OcN\u0001\u00024\\\fUCQo82pP-T\u001f.A3R9\t\u0017.mt\u0018\u0003Vj:\u0016\\+iJt__oj,\u0015_/\u0003ZfJA4G\u0015hx0zBto$\tmuE,kQNr\u001e4z\u0012\u001a%\u0007ly86\u001c\u0004\u001aMEt;:\u0012o\fuu;+df\u007f#^t4\b\u0004vn4V)*yT\u001d\u0012~X' \u0016c'\u00029=\u0002BhKH,MCO\u0014ѷ9I:{;͝$ތ`ԫ6Ʌ39˾\u0006\u0019 \u0006\u001c-9W\bT\u001a({ݭ\u0019(y]'-\u0003\ntad]!P<Fj\u000bJ\u001b@lxAVsi\u0005`|6\t;\u0010O[\u0017V>h/>\nm\u001d*\u0019le[=\r\u0007\u001d3*b6\u000b\u0013\u001c\u0011cF/\u001c\\P\u0006ioTh\u0003\\\f\u0018\u0015}31#*:<Tqy\u000fG h08@Hk\u0015I\u0001W7)8\u0005'WX\u0001\u000b\u0010\u0001\u007fYa\u000e12H|\u001bw\"[\u001fXV\u0003\r\u0006YW;*\u0011\u0002\u0015`2wD\"\fzMv>wO\u0004H\u001f\u0015E\u0004O\u0013`';PaO\u0014LV/Z\u0002Շ:G{:*[ܔbqo\u0014BT\u00011<)\nn[\u0018Z\u0004'<\u000ffa\\]4\"rHX\u000em\bl\u0001\u001c<J h#Wl,k5l\\quJ |+@g\u001e\u000b\u007fn7Z=\t42N^\u0005\"*\u0003T\u0010T\u0002y\u001c\"e\u0001\u0001!^ST\u007f W#FV\u0017D|\f\u0007ck*\n<J,\t\u0017+p-\u000f$@\u0003\u001c/\u001e\u0016\u000f\u001cD\u001fj\u001a\u0014D[f\u001d\b\u000e\u000b\u0002\u0014S\t\t`Qy\n\rUT%\u00153Gx\r\b[9\u0014Zx\u0002\u000f\r\u0004F&\u00067\u000fe3\n\u0010O~gLWɣp%5rx˥3ײIǤ\u0014լr}Α8R<\u0013AV\u0003?\ftug!٪\u0011Mo(\u0003|\u0011%\u001a\u0001\tEm\u0017\u00152P{D2O1+\u0018a\u0004W_#\u0002AI<$AW_\u001f6$\u0016{5n*]We{\u0002>:0o}d0BZ3[\u001c/[0\u0013Hy>EE78\u001f@\u0006&\u0011/lB3X]9\u00194[:W*\u0005w*=\r{\u001f\"4\u0005OU\u001c8\u0018u{-Am=u&\u007f.\u0007\u001f+w\u001c8gSQ!AoPN\u0013}~9}Sj~\u001aWYN9Z+\"c3\u0014\f\u00135.\u0011\u0006 \u001075P\u0004\u0005jEruY1(YTgd)}k\"Ԍ\b3\u0003\u001fhsܗa?N\t\tfGH#3lIPWjj\u0007\t\u0016C\u000e=CF0I\u0017\u000b\b0~J5Uf\u001aBkX=\u001430E)n%?[NX-\u0007g%`Szh8fkoX\u0012O4\bqyL\u001d\u001bp\u0015\"5\n\u0010\\6`p\u0005cowG\u0004\u0004Z5;\r\nJB=K\u001fu>o^\u0017!5\b\u001fKW NNH'9S#JNkl_9\u0010+p=@&Pnq\u0004X&9\u000e^\u0012a~B\u0016\nj30S8~\u001aX\\\u0014\fe\\l\u000bVs\u0019\rT0:0Z\u0003\u001f7q\u007f{ ܤT\u000eb\u0001o٠\fϣdа@̘Ypנi\u0017;zq|T?7\u0010),QҔ8\u001d}\n18ytbIs\u0006\u0002G\u0007\u0002nB.'\u001d:,;,xjm^\u001eW8\u0007\u0017&\u001eBiy'jh'`8 [\u000bdGj@\\Oe\u0012h_\u0007\f\u0012i\u000b5rJ^\u0002R\t\u00166(CX[\\*(v\u0013d]g{\fktd\bgDa)u#HJ\"\u000e{Wo\u0011|rsVO\u0016T\tg-\u0017\b:)e\u0006MO:\u000eoVqx\u007fut\fJ6oGj\u001d~\fx@gDB\u007fz\u0012\u000f[w&NpwxymIh\u0015\u000bu(ECQ~!(\u000fFq\u0011\u001cKR(36W2V^Fݔ\u0007'GP\u0002$ܭ\\y\u0013\u0012]z1\u0016p5sP\u000fcg\u007fp1\u0007c/\fci?T=H\u001ami7mG}h\u0017\u0014x\u0011J1bZQ}%Am\u000f#/\u0019vk@>(\nHEE\t@F\u0016\u0011tRb\u0015p\u001bs\u0001 >0Rz\u000b}qo\u0003wObU\\:\bc\u0004(I\r\u0011~p;BstY\u0016\\\bu\u0006\u0012l=\u0018h\n\n\"\u001fn\u0018\u0005'\u000e8vu\t 'z_e(dplG-)\u0018BZ{p\u00151\u001d:|mdlARKJ#\u007fk+5q\u0016Kur\u000f\nu\u0011 \u0016F\bVg8YQM\t:ɲy\f/\u00198ݬ`Ϡ\u0013ɋМ9.j.|ϰ1G`ģ,E"}, d2 = {"4`RAb9R=\u001a", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", Global.BLANK, "\u001ana4\"2HW\"Hyl3Fv-o\u000b(Z.gl", "1n]@g9NQ(\t\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=oc6b5L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J\u0016%N9l<w)>]\r$Av\u007f9\\GEtBs", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\"0", "\"1", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\"2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\"3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\"4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\"5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001386U", "\"6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001387U", "\"7", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001388U", "\"8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001389U", "\"0\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381J}", "\"0 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381K}", "\"0!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381L}", "\"0\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381M}", "\"0#", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381N}", "\"0$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381O}", "\"0%", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381P}", "\"0&", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381Q}", "\"0'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381R}", "\"0(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381S}", "\"1\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382J}", "\"1 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382K}", "\"1!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382L}", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScopedFactoryOfKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;!&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-zSX\u000f\u001c\u007fB%s$ E\u0002]۟\u0002$\u000fR\\k"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function0<R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends R> function0) {
            super(2);
            this.$constructor = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$constructor.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$10, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;*&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VobR;V5\u001e \u0010V /)#oߑ:JriH<"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass10<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
            super(2);
            this.$constructor = function9;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            return function9.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$11, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;+&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005f /(\rk\\A`l\fFu+ɨmDT4m>"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass11<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> function10) {
            super(2);
            this.$constructor = function10;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function10 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            return function10.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$12, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;,&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5pl\fE_'\u0011uZNUlv\u0005֔\u0011HZ5\u001b\u0006"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass12<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> function11) {
            super(2);
            this.$constructor = function11;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function11 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            return function11.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$13, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;-&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hjNUk`\u0001[\u001a^TU\u001b=iӿ/B=D#5"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass13<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> function12) {
            super(2);
            this.$constructor = function12;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function12 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            return function12.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$14, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;.&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\fnTU\u001a'e,9X7c$k[Ϋ\u000bTaO\u0011P"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass14<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass14(Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> function13) {
            super(2);
            this.$constructor = function13;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function13 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            return function13.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$15, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;/&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*h7c#UW\u0011\u0016j[m\u0013\u0006yݘ\tj-89["}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass15<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> function14) {
            super(2);
            this.$constructor = function14;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function14 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            return function14.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$16, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;0&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006z[m\u0012ouK\u0015\u0001'U<\u0010{ɱ:Z\u0006&#>"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass16<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass16(Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> function15) {
            super(2);
            this.$constructor = function15;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function15 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            return function15.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$17, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;1&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\u0011'U;yweGp\u007fB'qWոat,o\u0013e"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass17<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> function16) {
            super(2);
            this.$constructor = function16;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function16 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            return function16.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$18, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;2&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5\u0001\u007fB&[S\u001bo\u000b&\u000b\u0018\u0018hВ+-UwYe"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass18<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> function17) {
            super(2);
            this.$constructor = function17;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function17 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            return function17.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$19, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;3&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5x\u0004\u001a%9`#\\\u001b&\u000b\u0017\u0002d\u001a:CO\u0012_\u0017\u0016߭{|\u0002\"J\u001a"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass19<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> function18) {
            super(2);
            this.$constructor = function18;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function18 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            return function18.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;\"&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#\u0004$ DkY(\u007f:\t}Q.oĔN\\\u0011G\u001d\u000b"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function1<T1, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T1, ? extends R> function1) {
            super(2);
            this.$constructor = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<T1, R> function1 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            return function1.invoke((T1) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$20, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;4&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5x\u0004\u001a%9`#\\\u0013*b\u0016_r\"&SO\u0012^\u0001\u00126\f\u0013{;QJ\u0016Ν+J4C(}"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass20<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass20(Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> function19) {
            super(2);
            this.$constructor = function19;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function19 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            return function19.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$21, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;5&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5x\u0004\u001a%9`#\\\u0013*b\u0016_r\"&KSi]^!>v#{;P4\u0012\u0014<`.[0-\u0010ԧ7vxjNh"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass21<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass21(Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> function20) {
            super(2);
            this.$constructor = function20;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function20 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            return function20.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$22, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;6&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5x\u0004\u001a%9`#\\\u0013*b\u0016_r\"&KSi]^!>v\u001b\u007f\u0013O\u0012\"\u001c&p.[/\u0017\f\u001cI\rr\u0002W\u0017\nެF\u0002\u0001yD0"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\"1 ", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass22<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass22(Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> function21) {
            super(2);
            this.$constructor = function21;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function21 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            return function21.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) obj20, (T21) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$23, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;7&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u\u001bGQ\u0013 8VoZV\u0013U\u0013#(\u0005^$\u0007'jqd5hpcD=.\u0019hbR-j>\tc\ffX-\u0019\u0005n4*`;;\"3a\u0019\u0006r_E\u0011M\u0001S\u0004\t+-:W\u0004m5x\u0004\u001a%9`#\\\u0013*b\u0016_r\"&KSi]^!>v\u001b\u007f\u0013O\u0012\"\u001c&h23.t\u001d$2\u001dr\u0002V\u0001\u0006lY\u0018z\u0010N]-ő7-?4tk"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\"1 ", "\"1!", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass23<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> function22) {
            super(2);
            this.$constructor = function22;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function22 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            Object obj21 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T22");
            return function22.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) obj20, (T21) obj21, (T22) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;#&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|J\t}P\u0018k|Mr\u000bq\u0013L\u001eѱn.OZ\u0007c"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function2<T1, T2, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super T1, ? super T2, ? extends R> function2) {
            super(2);
            this.$constructor = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function2<T1, T2, R> function2 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            return function2.invoke((T1) obj, (T2) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;$&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005I\u0003\u000bq\u00126\u001a\u0007nDI\u0004}$\u001aƤ6DuEAT"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass4<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function3<T1, T2, T3, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
            super(2);
            this.$constructor = function3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function3<T1, T2, T3, R> function3 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            return function3.invoke((T1) obj, (T2) obj2, (T3) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$5, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;%&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiTI\u0004|\u000e\u0016\u001d7Zom9\u0014wެ=bz=\u0013("}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass5<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function4<T1, T2, T3, T4, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
            super(2);
            this.$constructor = function4;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function4<T1, T2, T3, T4, R> function4 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            return function4.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$6, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;&&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1jom8}sK?xtd\ff:ŕ<{\u000b\t(3"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass6<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function5<T1, T2, T3, T4, T5, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
            super(2);
            this.$constructor = function5;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function5<T1, T2, T3, T4, T5, R> function5 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            return function5.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$7, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;'&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\ttd\u000bP60?\u0012\u0005/\"pPǘz|IT\u001a\u001c"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass7<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function6<T1, T2, T3, T4, T5, T6, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
            super(2);
            this.$constructor = function6;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function6<T1, T2, T3, T4, T5, T6, R> function6 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            return function6.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$8, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;(&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\"\u0005/!ZL\u001e~\u0013Cy\u0015X8Ϯt<X\u0017[\u0010"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass8<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function7<T1, T2, T3, T4, T5, T6, T7, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
            super(2);
            this.$constructor = function7;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function7<T1, T2, T3, T4, T5, T6, T7, R> function7 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            return function7.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.core.module.dsl.ScopedFactoryOfKt$factoryOf$9, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;)&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007n?ӄRd^-rW0\u000ey{J#{(wCIV0|B\rUOui\u0005Iz\u000fI\u0011\u0014\u0019\u000fiLM[{k\u0016%1bsE7[tS8\u0001x<\n.887\u001a\t\u0007 8O&u#Cy\u0014B4NyRR;WK\"Ū\n@&\f,h"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass9<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
            super(2);
            this.$constructor = function8;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope factory, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            return function8.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) factory.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function0<? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function1<? super T1, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function2<? super T1, ? super T2, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function3<? super T1, ? super T2, ? super T3, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> factoryOf(ScopeDSL scopeDSL, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function0 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function10 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function11 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function12 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function13 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function14 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function15 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function16 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function17 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function18 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function19 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function1 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function20 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function21 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function22 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function2 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function3 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function4 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function5 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function6 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function7 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function8 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition factoryOf$default(ScopeDSL scopeDSL, Function9 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }
}
