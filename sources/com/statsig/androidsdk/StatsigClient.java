package com.statsig.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.exifinterface.media.ExifInterface;
import com.statsig.androidsdk.DebugView;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import io.sentry.SentryEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Яģ\u0015D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017k\u00027,[:qKП]\u001a\f)\u0011ѧVg}nRZ\u0011D\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;ݹw=O`|6\u000b$:\"Ny\rЏ\"*^\u0010~ٙKK\u001a\u001e8ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>HrgB/9\u0003qĩV'u0\u0005ձ\u0015Fb0\u0015vg\u001f3@E5\u001d%Y\u0006\u000fRq?\u000bӊy=\u001bh/'1P{WLX\b\u0014\u001b,W\rsr.ؘ\rQv\f/+UgSP$(\u007f\u07be\u0004\rR\u0004\u0016ͺ/HD-\"f\u000e\u0011;t\tSHP\b_J\u007f\u0011a>\u0017+\u0002;+O\u001bnϟi;/N?{\u000b\r&#\u0017n)[j\u000eh\u0015!U\u007fQ?UH׀PN\u0018{Em\n\u0002j\u0002@\u00048G\u0016/\u0004\u0011D\u0017-ڛc91ܩs\u0002N^}ϸ5`\u0017R*U͕D\"|\u0016\u007f6\u0017IrD\u0013C\u001cTb\u0018D\u0011{C\u001d\u0013\fH+ \u000b6l%3OfO\u0017\u00113`kK=/\u0015y\nryQo9\rZ{ȡӒ\u0014aX;\\NJ(\u001dX\u0015\u0005\u001aە\u0019ۛ'ίĘLj\u001e>DH\\S+2m:d@:z1\\C\u00133\"P\r\u0015\t\u000e\u00021\u001c\r!K$14Tx\u0017Lh\\\u001f\u00170\u0007Wy\u0015`PwqUCd>UP\u0010z|k\u001d\rB\u0018G\u0016\u0017wPze\u000eU*GF ?Q=\u000e+\u000f-gz\u0018;\u0017dr\u0014\u001c}\u00165J\u0015y=b\u00192uX\u0003pZ\u001f1J\u0018j%t\u000f^!m8h\u000eIyF)n\u0014Z\u0011[L\u001a\u000b\u0003\bz\u0017D\u000bX7\u001eSU &\u000btECUD^\u0006\"\u0005-a\f> 2\b\"'&#\rJ,,\"}9i]`\u0010hMg>V\"R\u0014KFVB\u0010\bpa|#A\"Yd\u001f1hQ\u0019\u000b\u0016f5S=v\\[Hc\b}bl(J\u0002 \u0016\u0014\r\u001eU\u0017[1\u007fo\u0004J\u000b֥z\u0013\u0018f\u00141\u001d9LA.'ob7nLs`LO\u001az\u0005jcT8:\u0018 \u000bq{\u001a\f\u0016z\u000e\u0017w\u000fEp\u000byI6&T'\u0004\u001dHMxSA9*/`?7,[M13\u0015v\\5c@\u001ck\u001f\u001f\u001a\u00193Gq3\u0010\\Tg\u0001n߰܁\u000fEc*\u0012\u0006Dk_)\u001c\u00138\u0017F\u0001\u0015\u001dpRaʃݔ\u0015_|\u001a'BcOff\r\u0011\u0015>~&7\u007f\u0013|<>:\u0013\u0019?gr\u001e\n]TTwE~2\u0003-CWC<\u0003iF)H\u001e5[Y\u0010ݤRזzߺĺ?}\u0016\rh]\u0012b9\\\u0006P\u0017\u000ek\u001cR\u0016 \u0018\u0013\u0006\u00179h 2Uz|x\n<CNQ\u001820O\u000faqw//?-\u0003\u0005p;\u0019~\u0010cz~\u0007U9\u001f/5dj\u0007-~[QG[ +X\t|AW.K)\u007fBSV#D{z)>D\u0014n~ag]#*]bpayN`\u0016\u0016\u001f(84.b\u001c-;\u0005Bnp\u0017U\u0005Jm\r\rd\u0011f\u000b\u000b\b\u000fC~\u0011\u0018\u001f\u000fLF!`\u00153E\u00167[;n\u0011\u0010\nEW$94h>IΡ1;\u0006.v\u001fܝ9z\u0004\u0010,R\t!'w.=F\u0003d0&\bށl҉\u0007'Yԛ7\u000b6:\r&\u0011]\u001dh$LY2\u001cixcE'\u000f\u0019\u0015f- \u001d\u001f5xܐR=9\u0011~\u0011\rm!AmJse\u001a9.=\u0378\u001a \tI!Mezi<\u0006sG\u0017M\u0012}?s:ݻ4]+\nWP\u007f8F4&\u0016uQ'sʼGr\u0004jȃU\fW2hZ;|ޕ\"_l'\u001b:1wѩr|[\u0010~q\u0002\u001a\u0019Ró)El5\u0004\u0014hB/RԾD,7=HY8%ϊ\u000fgqnRyw[Җ[u<AH4A8aD̞FXYXDs\u0012\u001d\u000exݡli_>zB\u0012\u001bՈvIR\u000fZ\u0011\"&ýJ\u000fFd\u0004)TGb\u0019ڂ\u000e<^\\\u0001Rƅʲ\u001a/NǓ\u0001FXnŖ\u0012KG\"\u0004w\u0017dÁ 5\u0011\noN2u\u0080FWU \u001bm=AV\u0006J\u0007\\.j\u0013Ȉ cdYW0o9ʉFn>Ht!\u001b\u001cșc`\u0010r;t,{{H0~&\u000bGkQ4\u001fk\u0014]s\rƿaO[\u0013S[<e֢Qm#[MJ\u0010\u001eî\u0018+\u000bL\u0016i613%1l#PsWʢ{\u0006I>E\u0012O/ǝ\u0005W/o&\u001d[sǶ\u0018o?-3hE2ʹ\u0012<b\u0016U\u001a\u00120;\u001bLd}YMYÊ\u0010~B\u00196+x\u001a~$8\u0004D\u0006\u0017\u001fߝ\u001bM;\u000e|\\4~D_Q\u0001zX\"6f=`[ҫ*\u000e\u0019ls8%,Vm֑mi\\\u0007\u0001]knn!́\u00195&\u0010>x.>\u000bmd\u001cءr\u0005|\u0017YBZHz\ntvdl\"N>XlG)e|IтCK\fvo'ſ\u000f+\u0010:ɉ5`jGC1Oob,7r\u001eSyA8:o2Um%uq\u0016\u0011zb&Ĉz\fը5U\u0005:̳\u0014\u001d>\u001554p\u0013\rH\u0004\u001aVbJh>4-\te6\f\u0016ɫ\r$|3n\u001fW`\u001d\u000e\u001f!\f/5,\u0018YeII1\u00131@L\u000bBN\u0007؍m\u0007י$v\u0003\u0014ǆ\u0011Z{c/\bsD:eƒNL]LkDi@0\u001bܞ\u0011\u001ccxe\u0016ى!̜\\öנ{\u0007g\u0003\"^\u0010ܠ!A$6WW\nN4X!:%\u0017\u000ed\b\u0011է-ߩ$ߏà\u00100\u0003ҫ\rzrLԝeugb\u0004\u0006ck̇DE/ J{N{Ƞ*_\u000ew=\u0003VZӑts=\u0003Xx\u00078)?֯rx[pY(\rpԼjR{u*DnY,2Z\u0015\u00163®\u000f߆\u000fùԌ\u0011\u0018\u000b٪r7ʪ?m\rnݭ~S\t\u001fYgUSe#D?*\u00116L8'H\u0007\u000e>#\b\u0005Y 2\u0018OD'|{\u001ba\u0004u~i\"\u0016d2)w&\u0006؊55\u007fc%=w^\u001aMg\rE\u001c˲L\u0086mʳɎu48Й\\hʶ.$\r\u001cϣedP;\u0004O|<ׅu\u000b\u0017mWHȊ\u0004ܡ\u001cۻɛ\u001dg\u0013|5Kk՝R|zL1\"Аe߿|ւí\u0017A-\\V+\u0016لss4}8G@\u0011I\u001âBF\bBG\u0016R\u0013p\"CG>\u0002-IB}_lɐ\u0004%51*\u001b\u0018V\t|\u0016\u007f\u0016VɳB)uI˺\bV\u0096\b\u05f9\bըرz{(Ő\u000fh\f\u001eѬ\t+b\r:0'WkHu\u001fLz*.6poxfv\u0012epjM/\u000f<E6\u0558%jK$dlDU\u00038G'\u000fLҍ):1:ɜ/clvӡn\u000fR\u0011T'Ν-гWդ۬/#\u000flQ\r\u0017$u+B@0ɱrť\u0013f~\u05f7\u0014\u001elwVi+\f\bڰ0ךOe:Ղ\nU\b&\u00044n(\u0001Ƭ \u05f7i\f\u0015ّ!E(=w<PA\u0013Ҭ\u007fԵ\u0003#\u0019ք\u0003v\n8T\u001b\u0013\u000bv<@U0h-9v)\u001fyPϼ|\u07baEMvȅj#4Gy7Q[<ŕ(ȷk=QŚe\u0019-{$t1/\f\u058bhώ.?\nеt P\u0012Npq|\u0015؝(ŧ\u0018t*Ο:@<VzOX(hʒZʖ[qlݨ2@\fOe\u001a0t ܇9ռ'-\u0013ޭz\u000fZ[i3\u001b{\u001eۥ#͵\u0011\u000f9ް:U>e\u000e|\u0014\u001b`\f\u0017́~߲o6MįhKRdI20(\u0007Α.հ\u0007؏>χ\u000fT\u001aۨBB$\u001d)V~K:f\u0004{Vncd7\u001f^tD\u0010V\u000ecD\u0005Q\\ҏ)ԛn~{ԃ'r!c/\u0012D\"Uíoɵ\te.˰zR\u000eyKa*~*ן;̥\u001b2lȲ\u0013 -36*\u0003Iaۭ[܉8\u001e@ĺIR\\oy\u0005\\MpӵTɇ2pw®\u000bz\u000f\n^9iJ*ȩ\u001fӋHĮ#ʔ+bpޜ&\rw`QLw`'\\m;3L#\u0005!\u0006Rs;\u0006S7u~>ɠ\u0005Ň^ŭKѢm1wǶHpE\u007fx\u0016?A]-i\u0017JB\n:6M\u0015,4K?\rlwtɥ@ʶ+\u0005\u0013؏!p\u0010.b\u001aC('ВcɑI=K͒֝[sC%daß\u0015σ%"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.s\u000f<t93`}\u007fHm\u001f=4GIz4'\u0015u7", "u(E", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "2hP4a6Lb\u001d|\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "2hb=T;<V\u0019\fek6\u000e\r.e\r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "3qa<e\tHc\"}vk@", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'|\u001bF\u0004\u0002?i\u0007\u001f3z*\u0004", "5dc\u0012e9H`u\t\u000bg+x\u0016C${1zM\u000b\u001b\u0016A}\rBp25`}\u001cEm", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mI\u0004/B6\b0@l\u0012;a\u0019", "Adc\u0012e9H`u\t\u000bg+x\u0016C${1zM\u000b\u001b\u0016A}\rBp25`}\u001cEm", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001bI\u00012\u0012c\u000e)6i#B#\u0007,", "3wR2c;B]\"avg+\u0004\t<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0005HW}+Fq 70?Dj;\u001e\">", "7mXAG0FS", "", "7mXA\\(EW.~y", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7r1<b;Lb&z\u0006i,{", "7r8;\\;BO \u0003\u0010b5~", ":hU2V@<Z\u0019e~l;|\u0012/r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)75{/;~\u001a=a*?l4\u001c)fh9mg:]v0GY$", ":nV4X9", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7@\b\"9m#\u0004", "=m32i0<Sx\u0010ve\b{\u0005:t\u007f5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`1xl<\b)3Y]13tq-INJkAs", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "5dc\u001cc;B]\"\r9Z5{\u00169i~\"\n?\u0007\u0011$Gv\u000e8\u0005%sU\u0007)A|\u0012=QMDy", "5dc\u001cc;B]\"\r9Z5{\u00169i~\"\n?\u0007\u0011$Gv\u000e8\u0005%", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kr4C]\u007f\nB|\u001a8VQ\u0011", "Adc\u001cc;B]\"\r9Z5{\u00169i~\"\n?\u0007\u0011$Gv\u000e8\u0005%", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[g+Fq 7[\u0019~\\", ">n[9\\5@8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "@dc?l\u001a<]$~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "AcZ\u0018X@", "", "AsPAf0@8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,5>\b\u001d\r", "AsPAf0@;\u0019\u000ev](\f\u0005", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "AsPAf0@<\u0019\u000e\rh9\u0003", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4#", "5dc g(Ma\u001d\u0001c^;\u000f\u0013<k>$\u0005?\u000e!\u001bFi\u001c;|\u001fBY\u0005 3{\u0016lILDuC\u001a$lkB\u0015", "5dc g(Ma\u001d\u0001c^;\u000f\u0013<k>$\u0005?\u000e!\u001bFi\u001c;|\u001fBY\u0005 3{\u0016", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kr4C]\u007f\t7|(8ZI\u0011", "Adc g(Ma\u001d\u0001c^;\u000f\u0013<k>$\u0005?\u000e!\u001bFi\u001c;|\u001fBY\u0005 3{\u0016", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[f F\u007f ;S\u0019~\\", "AsPAf0@A\u0017\t\u0006^", "5dc g(Ma\u001d\u0001h\\6\b\tma\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7,\u00127VMJgC\"\u001fqo", "5dc g(Ma\u001d\u0001h\\6\b\tma\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "Adc g(Ma\u001d\u0001h\\6\b\tma\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", "As^?X", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0018Ivz", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "1gT0^\u000e:b\u0019", "", "5`c2A(FS", "1gT0^\u000e:b\u0019p~m/\\\u001c:o\u000e8\t@g!\u0019Is\u0017>U)CUz'7l", "3mU<e*>7\"\u0003\nb(\u0004\rDe~", "", "4t]0g0H\\\u0002z\u0003^", "3mU<e*>7\"\u0003\nb(\u0004\rDe~fwI\u007f$!Kn\bJu+/f}'7i$.", "4kd@[", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u000e_3(d\u0019\f\bb+|\u0017", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQ\u0011", "5dc\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "1n]3\\.'O!~", "5dc\u0010b5?W\u001bp~m/\\\u001c:o\u000e8\t@g!\u0019Is\u0017>U)CUz'7l", "5dc\u0011l5:[\u001d|Xh5}\r1E\u0011$\u0003P|&\u001bQx", "5dc\u0012k7>`\u001d\u0007zg;", "3w_2e0FS\"\u000ecZ4|", "9dT=7,OW\u0017~kZ3\r\t", "5dc\u0012k7>`\u001d\u0007zg;\\\u001a+l\u0010$\u000bD\u000b ", "5dc\u0012k7>`\u001d\u0007zg;n\r>h_;\u0007J\u000f'$GV\u0018>x)>[\\$Ei\u00135MB", "5dc\u0013X(Mc&~\\Z;|", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "5dc\u0013X(Mc&~\\Z;|h@a\u00078wO\u0005! ", "5dc\u0013X(Mc&~\\Z;|z3t\u0003\b\u000fK\u000b%'TotFx'9b\u007f~;{\u0012+TC:", "5dc\u0016a0MW\u0015\u0006~s,i\t=p\n1\n@e%!P", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015c\u0002", "5dc\u0019T@>`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", ":`h2e\u0015:[\u0019", "5dc\u0019T@>`x\u0010ve<x\u00183o\t", "1kX2a;", "5dc\u0019T@>`\u000b\u0003\na\f\u0010\u00149s\u00105{'\u000b\u0019\u0019Kx\u0010\u001bz31V\u0005 6", "5dc\u0019b*:Z\u0007\u000e\u0005k(~\t\u001dt{%\u0003@du", "5dc\u001dT9:[\u0019\u000ezk\u001a\f\u0013<e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.#", ">`a.`,MS&l\nh9|q+m\u007f", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.-T7rD\u001a$lkBpn;R\u00010U\"", "5dc [(KS\u0018i\b^-\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc [(KS\u0018i\b^-\u000bG+n~5\u0006D\u007f\u0011%Fu\bIv,5U\f ", "5dc g(;Z\u0019bY", "5dc g6KS", "5dc g6KSWz\u0004]9\u0007\r._\u000e'\u0002:\u000e\u0017\u001eGk\u001c<", "7mXA\\(EW.~", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013\u001cFq 7,CJg8%#>", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAPq;J\u00065KN\u0018(eQ\u007fG\u0018\u0011h\rTtz\u0014UP2rF'-\b9\u001fh9r\tU$\u001d1y~FXYC\u0003\u0014\u0003K-gTXeC5PAq8h\u000eI(k>D-\"G\u007f!r_5\u000e\u0005\u001d\u000f|_\u0004wvK\"zFm\u001cwdUIxe8\u0004+)TQ;x7T\u0006'>4\u007f=,\u007fN\u0002Pg\u0016M4", "7mXA\\(EW.~Vl@\u0006\u0007", "1`[9U(<Y", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+]\u001d8\u000639[[\u001c>t\u0013*KI\u0011", "7r8;\\;BO \u0003\u0010^+", ":nV\u0012a+\u001dW\u0015\u0001\u0004h:\f\r-s", "AtR0X:L", "1n]AX?M", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u0017Kv8DH\u0012+7C", "7mXAE,L^#\b\t^", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", ":nV\u0012a+\u001dW\u0015\u0001\u0004h:\f\r-sq+{I`*\u0015Gz\u001d@\u0001.", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", ":nV\u0012i,Gb", "3uT;g\u0015:[\u0019", "D`[BX", "", ";dc.W(MO", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0014c\u000e\u001d>mk\u0015R?Lg}.$lh\u0003n_7$:\u0018", ":nV\u0012k7Ha)\fz", "<`\\2", "1n]3\\.", "7r<.a<:Z", "5`c2", ":nV\u0019T@>`\u0004z\bZ4|\u0018/r_;\u0007J\u000f'$G", ":`h2e", ">`a.`,MS&gvf,", ":nV\u0019T@>`\u0004z\bZ4|\u0018/r_;\u0007J\u000f'$G.\nEu2?]|\u001aEl\u001c(ZCBk0,\u0015", ";`]BT3Eg\u007f\t|<6\u0006\n3g_;\u0007J\u000f'$G", ";`]BT3Eg\u007f\t|>?\b\t<i\b(\u0005O`*\"Q}\u001eIv", "3w_2e0FS\"\u000e", ";`]BT3Eg\u007f\t|@(\f\t\u000fx\u000b2\nP\u000e\u0017", ";`]BT3Eg\u007f\t|E(\u0011\t<P{5wH\u0001&\u0017TO!G\u00013Ef}", "<na:T3Bh\u0019n\t^9", "=m0=c\tEc&", "=m0=c\rHQ)\r", "=oT;7,;c\u001bo~^>", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010}3t\u001d+IAAA", "=uT?e0=Sv\t\u0004_0~", "", "=uT?e0=Szz\n^", "=uT?e0=S\u007fz\u000f^9", ">n[996KC$}vm,\u000b", ">n_B_(MS\u0007\u000evm:\u0001\u000b\u0017e\u000f$z<\u0010\u0013", "@dU?X:A1\u0015|}^", "@dU?X:A1\u0015|}^\b\u000b\u001d8c", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S{Kr4C]\u007f}3t\u001d+IAAA\u001b$\u001fwh=\u0010-*X\u00041W[R5\\`<\u001b\u001e\u001bi\u0012W;\t\u0014]K-D\b\u001e$\u0004=EKBd\n\u000e_w2op@ee", "@d\\<i,\u001aZ h\f^9\n\r.e\u000e", "@d\\<i,(d\u0019\f\bb+|", "@db2g\u001cLS&", "A`e2F;KW\"\u0001ih\u001a\u007f\u0005<e~\u0013\t@\u0002%", "9dh", "A`e2F;KW\"\u0001ih\u001a\u007f\u0005<e~\u0013\t@\u0002%UCx\rI\u0001)4S\f\u001f=g#.TC7y4", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "AdcBc", "AdcBc\bLg\"|", "AdcBc\bLg\"|9Z5{\u00169i~\"\n?\u0007\u0011$Gv\u000e8\u0005%", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[m.7zk\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "AgdAW6P\\", "AgdAW6P\\|\u0007\u0006e", "AgdAW6P\\\u0007\u000f\ti,\u0006\b", "CoS.g,,b\u001d|\u0001r\u001dx\u0010?e\u000e", "CoS.g,.a\u0019\f", "D`[BX:", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[m.7zk\u0015R?Lg}.$lh\u0003n_7$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "CoS.g,.a\u0019\fVl@\u0006\u0007", "CoS.g,.a\u0019\f^f7\u0004", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigClient implements LifecycleEventListener {
    private Application application;
    private Diagnostics diagnostics;
    private CoroutineExceptionHandler exceptionHandler;
    private StatsigActivityLifecycleListener lifecycleListener;
    private StatsigLogger logger;
    private OnDeviceEvalAdapter onDeviceEvalAdapter;
    public StatsigOptions options;
    private Job pollingJob;
    private final CoroutineScope retryScope;
    private String sdkKey;
    private StatsigMetadata statsigMetadata;
    public StatsigNetwork statsigNetwork;
    public CoroutineScope statsigScope;
    private Store store;
    private StatsigUser user;
    private long initTime = System.currentTimeMillis();
    private ErrorBoundary errorBoundary = new ErrorBoundary(null, 1, null);
    private CompletableJob statsigJob = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
    private CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private AtomicBoolean isBootstrapped = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$checkGate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;
        final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Ref.ObjectRef<FeatureGate> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.FeatureGate] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            ?? featureGateEvaluation = StatsigClient.this.getFeatureGateEvaluation(str);
            StatsigClient.logExposure$default(StatsigClient.this, str, (FeatureGate) featureGateEvaluation, false, 4, (Object) null);
            objectRef.element = featureGateEvaluation;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$checkGateWithExposureLoggingDisabled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11911 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;
        final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11911(String str, Ref.ObjectRef<FeatureGate> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.FeatureGate] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            objectRef.element = StatsigClient.this.getFeatureGateEvaluation(str);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$flush$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StatsigClient.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getAllOverrides$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11921 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.ObjectRef<StatsigOverrides> $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11921(Ref.ObjectRef<StatsigOverrides> objectRef, StatsigClient statsigClient) {
            super(0);
            objectRef = objectRef;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.StatsigOverrides] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            objectRef.element = statsigClient.getStore$android_sdk_release().getAllOverrides();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getConfig$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11931 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;
        final /* synthetic */ Ref.ObjectRef<DynamicConfig> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11931(String str, Ref.ObjectRef<DynamicConfig> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.DynamicConfig] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            ?? dynamicConfigEvaluation = StatsigClient.this.getDynamicConfigEvaluation(str);
            StatsigClient.logExposure$default(StatsigClient.this, str, (DynamicConfig) dynamicConfigEvaluation, false, 4, (Object) null);
            objectRef.element = dynamicConfigEvaluation;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getConfigWithExposureLoggingDisabled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11941 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;
        final /* synthetic */ Ref.ObjectRef<DynamicConfig> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11941(String str, Ref.ObjectRef<DynamicConfig> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, com.statsig.androidsdk.DynamicConfig] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            objectRef.element = StatsigClient.this.getDynamicConfigEvaluation(str);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getExperiment$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11951 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $experimentName;
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ Ref.ObjectRef<DynamicConfig> $res;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11951(Ref.ObjectRef<DynamicConfig> objectRef, StatsigClient statsigClient, String str, boolean z2) {
            super(0);
            objectRef = objectRef;
            statsigClient = statsigClient;
            str = str;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            objectRef.element = statsigClient.getExperimentEvaluation(str, z);
            if (z) {
                statsigClient.updateStickyValues();
            }
            StatsigClient.logExposure$default(statsigClient, str, objectRef.element, false, 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getExperimentWithExposureLoggingDisabled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11961 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.ObjectRef<DynamicConfig> $exp;
        final /* synthetic */ String $experimentName;
        final /* synthetic */ boolean $keepDeviceValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11961(String str, Ref.ObjectRef<DynamicConfig> objectRef, boolean z2) {
            super(0);
            str = str;
            objectRef = objectRef;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, com.statsig.androidsdk.DynamicConfig] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            objectRef.element = StatsigClient.this.getExperimentEvaluation(str, z);
            if (z) {
                StatsigClient.this.updateStickyValues();
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getFeatureGate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11971 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;
        final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11971(String str, Ref.ObjectRef<FeatureGate> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.FeatureGate] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            ?? featureGateEvaluation = StatsigClient.this.getFeatureGateEvaluation(str);
            StatsigClient.logExposure$default(StatsigClient.this, str, (FeatureGate) featureGateEvaluation, false, 4, (Object) null);
            objectRef.element = featureGateEvaluation;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getFeatureGateWithExposureLoggingDisabled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11981 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;
        final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11981(String str, Ref.ObjectRef<FeatureGate> objectRef) {
            super(0);
            str = str;
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.FeatureGate] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            objectRef.element = StatsigClient.this.getFeatureGateEvaluation(str);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getInitializeResponseJson$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11991 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.ObjectRef<ExternalInitializeResponse> $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11991(Ref.ObjectRef<ExternalInitializeResponse> objectRef, StatsigClient statsigClient) {
            super(0);
            objectRef = objectRef;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.ExternalInitializeResponse] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Ref.ObjectRef<ExternalInitializeResponse> objectRef = objectRef;
            Store store = statsigClient.store;
            if (store != null) {
                objectRef.element = store.getCurrentCacheValuesAndEvaluationReason();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLayer$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12001 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ Ref.ObjectRef<Layer> $layer;
        final /* synthetic */ String $layerName;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12001(Ref.ObjectRef<Layer> objectRef, StatsigClient statsigClient, String str, boolean z2) {
            super(0);
            objectRef = objectRef;
            statsigClient = statsigClient;
            str = str;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.Layer] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Ref.ObjectRef<Layer> objectRef = objectRef;
            StatsigClient statsigClient = statsigClient;
            objectRef.element = statsigClient.getLayerEvaluation(statsigClient, str, z);
            if (z) {
                statsigClient.updateStickyValues();
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLayerWithExposureLoggingDisabled$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12011 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ Ref.ObjectRef<Layer> $layer;
        final /* synthetic */ String $layerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12011(String str, Ref.ObjectRef<Layer> objectRef, boolean z2) {
            super(0);
            str = str;
            objectRef = objectRef;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.Layer] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            objectRef.element = StatsigClient.this.getLayerEvaluation(null, str, z);
            if (z) {
                StatsigClient.this.updateStickyValues();
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $stableID;
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<String> $stableID;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02621(StatsigClient statsigClient, Ref.ObjectRef<String> objectRef, Continuation<? super C02621> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$stableID = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02621(this.this$0, this.$stableID, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.saveStringToSharedPrefs$android_sdk_release("STABLE_ID", this.$stableID.element, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12021(Ref.ObjectRef<String> objectRef, Continuation<? super C12021> continuation) {
            super(2, continuation);
            this.$stableID = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12021(this.$stableID, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BuildersKt.withContext(StatsigClient.this.dispatcherProvider.getIo(), new C02621(StatsigClient.this, this.$stableID, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getParameterStore$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12031 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ParameterStoreEvaluationOptions $options;
        final /* synthetic */ Ref.ObjectRef<ParameterStore> $paramStore;
        final /* synthetic */ String $parameterStoreName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12031(String str, Ref.ObjectRef<ParameterStore> objectRef, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
            super(0);
            str = str;
            objectRef = objectRef;
            parameterStoreEvaluationOptions = parameterStoreEvaluationOptions;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, com.statsig.androidsdk.ParameterStore] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [T] */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.statsig.androidsdk.ParameterStore] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.addNonExposedCheck(str);
            Ref.ObjectRef<ParameterStore> objectRef = objectRef;
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            objectRef.element = store.getParamStore(StatsigClient.this, str, parameterStoreEvaluationOptions);
            Ref.ObjectRef<ParameterStore> objectRef2 = objectRef;
            OnDeviceEvalAdapter onDeviceEvalAdapter = StatsigClient.this.onDeviceEvalAdapter;
            ParameterStore paramStore = onDeviceEvalAdapter != null ? onDeviceEvalAdapter.getParamStore(StatsigClient.this, objectRef.element) : 0;
            if (paramStore == 0) {
                paramStore = objectRef.element;
            }
            objectRef2.element = paramStore;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getStableID$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12041 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.ObjectRef<String> $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12041(Ref.ObjectRef<String> objectRef, StatsigClient statsigClient) {
            super(0);
            objectRef = objectRef;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Ref.ObjectRef<String> objectRef = objectRef;
            StatsigMetadata statsigMetadata = statsigClient.statsigMetadata;
            if (statsigMetadata == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
                throw null;
            }
            String stableID = statsigMetadata.getStableID();
            T t2 = stableID;
            if (stableID == null) {
                t2 = "";
            }
            objectRef.element = t2;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initialize$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!4i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013\u001cFq 7,CJg8%#>"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12052 extends SuspendLambda implements Function1<Continuation<? super InitializationDetails>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ StatsigOptions $options;
        final /* synthetic */ String $sdkKey;
        final /* synthetic */ StatsigUser $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12052(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation<? super C12052> continuation) {
            super(1, continuation);
            this.$application = application;
            this.$sdkKey = str;
            this.$user = statsigUser;
            this.$options = statsigOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StatsigClient.this.new C12052(this.$application, this.$sdkKey, this.$user, this.$options, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super InitializationDetails> continuation) {
            return ((C12052) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StatsigUser upVar = StatsigClient.this.setup(this.$application, this.$sdkKey, this.$user, this.$options);
                this.label = 1;
                obj = StatsigClient.this.setupAsync$android_sdk_release(upVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InitializationDetails initializationDetails = (InitializationDetails) obj;
            initializationDetails.setDuration(System.currentTimeMillis() - StatsigClient.this.initTime);
            return initializationDetails;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initialize$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b<Ȑ\u0017\"Z\u0011(\u000ftjQ4rf1.1UpŪ*"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013\u001cFq 7,CJg8%#>", "7s", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Exception, Continuation<? super InitializationDetails>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = StatsigClient.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Exception exc, Continuation<? super InitializationDetails> continuation) {
            return ((AnonymousClass3) create(exc, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Exception exc = (Exception) this.L$0;
            StatsigClient.this.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            return new InitializationDetails(System.currentTimeMillis() - StatsigClient.this.initTime, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12061 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Application $application;
        final /* synthetic */ IStatsigCallback $callback;
        final /* synthetic */ StatsigOptions $options;
        final /* synthetic */ String $sdkKey;
        final /* synthetic */ StatsigUser $user;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ IStatsigCallback $callback;
            final /* synthetic */ StatsigUser $normalizedUser;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                final /* synthetic */ InitializationDetails $initDetails;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02641(IStatsigCallback iStatsigCallback, InitializationDetails initializationDetails, Continuation<? super C02641> continuation) {
                    super(2, continuation);
                    this.$callback = iStatsigCallback;
                    this.$initDetails = initializationDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02641(this.$callback, this.$initDetails, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigInitialize(this.$initDetails);
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        throw new ExternalException(e2.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02631(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Continuation<? super C02631> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$normalizedUser = statsigUser;
                this.$callback = iStatsigCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02631(this.this$0, this.$normalizedUser, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = this.this$0.setupAsync$android_sdk_release(this.$normalizedUser, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InitializationDetails initializationDetails = (InitializationDetails) obj;
                initializationDetails.setDuration(System.currentTimeMillis() - this.this$0.initTime);
                this.label = 2;
                if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02641(this.$callback, initializationDetails, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12061(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, IStatsigCallback iStatsigCallback) {
            super(0);
            application = application;
            str = str;
            statsigUser = statsigUser;
            statsigOptions = statsigOptions;
            iStatsigCallback = iStatsigCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() throws Throwable {
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02631(StatsigClient.this, StatsigClient.this.setup(application, str, statsigUser, statsigOptions), iStatsigCallback, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8Zdv/;U@\u000eJ}z,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12072 extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ IStatsigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12072(IStatsigCallback iStatsigCallback) {
            super(1);
            iStatsigCallback = iStatsigCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Exception exc) throws ExternalException {
            invoke2(exc);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Exception exc) throws ExternalException {
            StatsigClient.this.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            try {
                InitializationDetails initializationDetails = new InitializationDetails(System.currentTimeMillis() - StatsigClient.this.initTime, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
                IStatsigCallback iStatsigCallback = iStatsigCallback;
                if (iStatsigCallback == null) {
                    return;
                }
                iStatsigCallback.onStatsigInitialize(initializationDetails);
            } catch (Exception e2) {
                throw new ExternalException(e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEndDiagnosticsWhenException$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12083 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C12083(Continuation<? super C12083> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12083(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12083) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12091 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ Double $value;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1$2 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$event, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                        throw null;
                    }
                    this.label = 1;
                    if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12091(String str, Double d2, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            str = str;
            d = d2;
            map = map;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            LogEvent logEvent = new LogEvent(str);
            logEvent.setValue(d);
            logEvent.setMetadata(map);
            StatsigUser statsigUser = statsigClient.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            if (!statsigClient.getOptions$android_sdk_release().getDisableCurrentActivityLogging()) {
                StatsigActivityLifecycleListener statsigActivityLifecycleListener = statsigClient.lifecycleListener;
                if (statsigActivityLifecycleListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lifecycleListener");
                    throw null;
                }
                Activity currentActivity = statsigActivityLifecycleListener.getCurrentActivity();
                if (currentActivity != null) {
                    logEvent.setStatsigMetadata(MapsKt.mapOf(TuplesKt.to("currentPage", currentActivity.getClass().getSimpleName())));
                }
            }
            BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass2(statsigClient, logEvent, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12102 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ String $value;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$event, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                        throw null;
                    }
                    this.label = 1;
                    if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12102(String str, String str2, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            str = str;
            str = str2;
            map = map;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            LogEvent logEvent = new LogEvent(str);
            logEvent.setValue(str);
            logEvent.setMetadata(map);
            StatsigUser statsigUser = statsigClient.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(statsigClient, logEvent, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12113 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$event, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                        throw null;
                    }
                    this.label = 1;
                    if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12113(String str, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            str = str;
            map = map;
            statsigClient = statsigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            LogEvent logEvent = new LogEvent(str);
            logEvent.setValue(null);
            logEvent.setMetadata(map);
            StatsigUser statsigUser = statsigClient.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(statsigClient, logEvent, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogConfigExposure$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12121 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12121(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigClient.this.logExposure(str, store.getConfig(str), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogConfigExposure$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12132 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicConfig $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12132(DynamicConfig dynamicConfig) {
            super(0);
            dynamicConfig = dynamicConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigClient.this.logExposure(dynamicConfig.getName(), dynamicConfig, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogExperimentExposure$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12141 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;
        final /* synthetic */ boolean $keepDeviceValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12141(String str, boolean z2) {
            super(0);
            str = str;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigClient.this.logExposure(str, store.getExperiment(str, z), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogExperimentExposure$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12152 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicConfig $experiment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12152(DynamicConfig dynamicConfig) {
            super(0);
            dynamicConfig = dynamicConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigClient.this.logExposure(dynamicConfig.getName(), dynamicConfig, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogGateExposure$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12161 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12161(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigClient.this.logExposure(str, store.checkGate(str), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogGateExposure$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12172 extends Lambda implements Function0<Unit> {
        final /* synthetic */ FeatureGate $gate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12172(FeatureGate featureGate) {
            super(0);
            featureGate = featureGate;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigClient.this.logExposure(featureGate.getName(), featureGate, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogLayerParameterExposure$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12181 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ String $layerName;
        final /* synthetic */ String $parameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12181(String str, boolean z2, String str2) {
            super(0);
            str = str;
            z = z2;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigClient.this.logLayerParameterExposure$android_sdk_release(store.getLayer(null, str, z), str, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogLayerParameterExposure$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12192 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Layer $layer;
        final /* synthetic */ String $parameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12192(Layer layer, String str) {
            super(0);
            layer = layer;
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigClient.this.logLayerParameterExposure$android_sdk_release(layer, str, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$onAppBlur$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C12201(Continuation<? super C12201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$onAppFocus$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C12211(Continuation<? super C12211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigClient.this.getStatsigNetwork$android_sdk_release().apiRetryFailedLogs(StatsigClient.this.getOptions$android_sdk_release().getEventLoggingAPI(), StatsigClient.this.getOptions$android_sdk_release().getLogEventFallbackUrls(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$openDebugView$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12221 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12221(Context context, Function1<? super Boolean, Unit> function1) {
            super(0);
            context = context;
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("values", store.getCurrentValuesAsString());
            Store store2 = StatsigClient.this.store;
            if (store2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            pairArr[1] = TuplesKt.to("evalReason", store2.getReason());
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            pairArr[2] = TuplesKt.to("user", statsigUser.getCopyForEvaluation$android_sdk_release());
            pairArr[3] = TuplesKt.to(RRWebOptionsEvent.EVENT_TAG, StatsigClient.this.getOptions$android_sdk_release().toMap$android_sdk_release());
            Map<String, ? extends Object> mapMapOf = MapsKt.mapOf(pairArr);
            DebugView.Companion companion = DebugView.Companion;
            Context context = context;
            String str = StatsigClient.this.sdkKey;
            if (str != null) {
                companion.show(context, str, mapMapOf, function1);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("sdkKey");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12231 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;
        final /* synthetic */ Map<String, Object> $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02651(StatsigClient statsigClient, Continuation<? super C02651> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02651(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12231(String str, Map<String, ? extends Object> map) {
            super(0);
            str = str;
            map = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store.overrideConfig(str, map);
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02651(StatsigClient.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12241 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $gateName;
        final /* synthetic */ boolean $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02661(StatsigClient statsigClient, Continuation<? super C02661> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02661(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12241(String str, boolean z2) {
            super(0);
            str = str;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store.overrideGate(str, z);
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02661(StatsigClient.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12251 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $configName;
        final /* synthetic */ Map<String, Object> $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02671(StatsigClient statsigClient, Continuation<? super C02671> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02671(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12251(String str, Map<String, ? extends Object> map) {
            super(0);
            str = str;
            map = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store.overrideLayer(str, map);
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02671(StatsigClient.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$pollForUpdates$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/(:\u0012\u0010\t|ig1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12261 extends SuspendLambda implements Function2<InitializeResponse.SuccessfulInitializeResponse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C12261(Continuation<? super C12261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12261 c12261 = StatsigClient.this.new C12261(continuation);
            c12261.L$0 = obj;
            return c12261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, Continuation<? super Unit> continuation) {
            return ((C12261) create(successfulInitializeResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) this.L$0;
                if (successfulInitializeResponse != null) {
                    Store store = StatsigClient.this.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    StatsigUser statsigUser = StatsigClient.this.user;
                    if (statsigUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                        throw null;
                    }
                    this.label = 1;
                    if (store.save(successfulInitializeResponse, statsigUser, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCache$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12272 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C12272(Continuation<? super C12272> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StatsigClient.this.new C12272(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C12272) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                    throw null;
                }
                Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
                this.label = 1;
                if (StatsigClient.this.updateUserImpl(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12282 extends Lambda implements Function0<Unit> {
        final /* synthetic */ IStatsigCallback $callback;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ IStatsigCallback $callback;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02681(IStatsigCallback iStatsigCallback, Continuation<? super C02681> continuation) {
                    super(2, continuation);
                    this.$callback = iStatsigCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02681(this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigUpdateUser();
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        throw new ExternalException(e2.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$callback = iStatsigCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.updateUserImpl(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.label = 2;
                if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02681(this.$callback, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12282(IStatsigCallback iStatsigCallback) {
            super(0);
            iStatsigCallback = iStatsigCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Diagnostics diagnostics = StatsigClient.this.diagnostics;
            if (diagnostics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                throw null;
            }
            Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(StatsigClient.this, iStatsigCallback, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12291 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02691(StatsigClient statsigClient, Continuation<? super C02691> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02691(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        C12291() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store.removeAllOverrides();
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02691(StatsigClient.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12301 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $name;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02701(StatsigClient statsigClient, Continuation<? super C02701> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02701(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12301(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store.removeOverride(str);
            BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02701(StatsigClient.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$resetUser$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12311 extends Lambda implements Function0<Unit> {
        C12311() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.onUpdateUser();
            Job job = StatsigClient.this.pollingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Store store = StatsigClient.this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser != null) {
                store.resetUser(statsigUser);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdown$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdown$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02721(StatsigClient statsigClient, Continuation<? super C02721> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02721(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.shutdownSuspend(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        C12321(Continuation<? super C12321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Dispatchers dispatchers = Dispatchers.INSTANCE;
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new C02721(StatsigClient.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdownImpl$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C12331(Continuation<? super C12331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return StatsigClient.this.shutdownImpl(this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdownSuspend$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12342 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C12342(Continuation<? super C12342> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StatsigClient.this.new C12342(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C12342) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigClient.this.shutdownImpl(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateStickyValues$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C12351(Continuation<? super C12351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                this.label = 1;
                if (store.persistStickyValues(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUser$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12362 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ StatsigUser $user;
        final /* synthetic */ Map<String, Object> $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12362(StatsigUser statsigUser, Map<String, ? extends Object> map, Continuation<? super C12362> continuation) {
            super(1, continuation);
            this.$user = statsigUser;
            this.$values = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StatsigClient.this.new C12362(this.$user, this.$values, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C12362) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                    throw null;
                }
                Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
                StatsigClient statsigClient = StatsigClient.this;
                statsigClient.user = statsigClient.normalizeUser(this.$user);
                StatsigClient.this.resetUser();
                if (this.$values != null) {
                    Store store = StatsigClient.this.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    Map<String, ? extends Object> map = this.$values;
                    StatsigUser statsigUser = StatsigClient.this.user;
                    if (statsigUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                        throw null;
                    }
                    store.bootstrap(map, statsigUser);
                    StatsigClient.this.logEndDiagnostics(true, ContextType.UPDATE_USER, null);
                } else {
                    Store store2 = StatsigClient.this.store;
                    if (store2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    store2.loadCacheForCurrentUser();
                    this.label = 1;
                    if (StatsigClient.this.updateUserImpl(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12371 extends Lambda implements Function0<Unit> {
        final /* synthetic */ IStatsigCallback $callback;
        final /* synthetic */ StatsigUser $user;
        final /* synthetic */ Map<String, Object> $values;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ IStatsigCallback $callback;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02741(IStatsigCallback iStatsigCallback, Continuation<? super C02741> continuation) {
                    super(2, continuation);
                    this.$callback = iStatsigCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02741(this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigUpdateUser();
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        throw new ExternalException(e2.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02731(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, Continuation<? super C02731> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
                this.$callback = iStatsigCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02731(this.this$0, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.updateUserImpl(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.label = 2;
                if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02741(this.$callback, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12371(StatsigUser statsigUser, Map<String, ? extends Object> map, IStatsigCallback iStatsigCallback) {
            super(0);
            statsigUser = statsigUser;
            map = map;
            iStatsigCallback = iStatsigCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            Diagnostics diagnostics = StatsigClient.this.diagnostics;
            if (diagnostics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                throw null;
            }
            Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
            StatsigClient statsigClient = StatsigClient.this;
            statsigClient.user = statsigClient.normalizeUser(statsigUser);
            StatsigClient.this.resetUser();
            if (map == null) {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.loadCacheForCurrentUser();
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02731(StatsigClient.this, iStatsigCallback, null), 3, null);
                return;
            }
            Store store2 = StatsigClient.this.store;
            if (store2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            Map<String, ? extends Object> map = map;
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            store2.bootstrap(map, statsigUser);
            StatsigClient.this.logEndDiagnostics(true, ContextType.UPDATE_USER, null);
            IStatsigCallback iStatsigCallback = iStatsigCallback;
            if (iStatsigCallback == null) {
                return;
            }
            iStatsigCallback.onStatsigUpdateUser();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(StatsigClient statsigClient, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:128:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x002a  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 353
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigClient.C12382.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b<Ȑ\u0017\"Z\u0011(\u000ftjQ4rf1.1UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class C02752 extends SuspendLambda implements Function2<Exception, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02752(StatsigClient statsigClient, Continuation<? super C02752> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02752 c02752 = new C02752(this.this$0, continuation);
                c02752.L$0 = obj;
                return c02752;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Exception exc, Continuation<? super Unit> continuation) {
                return ((C02752) create(exc, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.logEndDiagnosticsWhenException(ContextType.UPDATE_USER, (Exception) this.L$0);
                return Unit.INSTANCE;
            }
        }

        C12382(Continuation<? super C12382> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigClient.this.new C12382(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigClient.this.getErrorBoundary$android_sdk_release().captureAsync(new AnonymousClass1(StatsigClient.this, null), new C02752(StatsigClient.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public StatsigClient() {
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.retryScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getIO()));
    }

    public final DynamicConfig getDynamicConfigEvaluation(String str) {
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        DynamicConfig config = store.getConfig(str);
        OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter == null) {
            return config;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            DynamicConfig dynamicConfig = onDeviceEvalAdapter.getDynamicConfig(config, statsigUser);
            return dynamicConfig == null ? config : dynamicConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        throw null;
    }

    public static /* synthetic */ DynamicConfig getExperiment$default(StatsigClient statsigClient, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return statsigClient.getExperiment(str, z2);
    }

    public final DynamicConfig getExperimentEvaluation(String str, boolean z2) {
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        DynamicConfig experiment = store.getExperiment(str, z2);
        OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter == null) {
            return experiment;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            DynamicConfig dynamicConfig = onDeviceEvalAdapter.getDynamicConfig(experiment, statsigUser);
            return dynamicConfig == null ? experiment : dynamicConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        throw null;
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return statsigClient.getExperimentWithExposureLoggingDisabled(str, z2);
    }

    public final FeatureGate getFeatureGateEvaluation(String str) {
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        FeatureGate featureGateCheckGate = store.checkGate(str);
        OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter == null) {
            return featureGateCheckGate;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            FeatureGate gate = onDeviceEvalAdapter.getGate(featureGateCheckGate, statsigUser);
            return gate == null ? featureGateCheckGate : gate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        throw null;
    }

    public static /* synthetic */ Layer getLayer$default(StatsigClient statsigClient, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return statsigClient.getLayer(str, z2);
    }

    public final Layer getLayerEvaluation(StatsigClient statsigClient, String str, boolean z2) {
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        Layer layer = store.getLayer(statsigClient, str, z2);
        OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter == null) {
            return layer;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            Layer layer2 = onDeviceEvalAdapter.getLayer(statsigClient, layer, statsigUser);
            return layer2 == null ? layer : layer2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        throw null;
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return statsigClient.getLayerWithExposureLoggingDisabled(str, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    private final String getLocalStorageStableID() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = getSharedPrefs$android_sdk_release().getString("STABLE_ID", null);
        if (objectRef.element == 0) {
            objectRef.element = UUID.randomUUID().toString();
            BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), null, null, new C12021(objectRef, null), 3, null);
        }
        return (String) objectRef.element;
    }

    public static /* synthetic */ void getOptions$android_sdk_release$annotations() {
    }

    public static /* synthetic */ ParameterStore getParameterStore$default(StatsigClient statsigClient, String str, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            parameterStoreEvaluationOptions = null;
        }
        return statsigClient.getParameterStore(str, parameterStoreEvaluationOptions);
    }

    public static /* synthetic */ void getStatsigNetwork$android_sdk_release$annotations() {
    }

    public static /* synthetic */ void getStatsigScope$android_sdk_release$annotations() {
    }

    public static /* synthetic */ Object initialize$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation continuation, int i2, Object obj) {
        StatsigOptions statsigOptions2 = statsigOptions;
        if ((i2 + 4) - (i2 | 4) != 0) {
            statsigUser = null;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
        }
        return statsigClient.initialize(application, str, statsigUser, statsigOptions2, continuation);
    }

    public static /* synthetic */ void initializeAsync$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i2, Object obj) {
        StatsigOptions statsigOptions2 = statsigOptions;
        StatsigUser statsigUser2 = statsigUser;
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            statsigUser2 = null;
        }
        IStatsigCallback iStatsigCallback2 = (i2 & 8) == 0 ? iStatsigCallback : null;
        if ((i2 + 16) - (i2 | 16) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
        }
        statsigClient.initializeAsync(application, str, statsigUser2, iStatsigCallback2, statsigOptions2);
    }

    public final void logEndDiagnostics(boolean z2, ContextType contextType, InitializeResponse initializeResponse) {
        Marker.ErrorMessage failedResponse;
        Diagnostics diagnostics = this.diagnostics;
        if (diagnostics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
            throw null;
        }
        KeyType keyType = KeyType.OVERALL;
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        EvaluationDetails globalEvaluationDetails$android_sdk_release = store.getGlobalEvaluationDetails$android_sdk_release();
        if (initializeResponse instanceof InitializeResponse.FailedInitializeResponse) {
            failedResponse = Diagnostics.Companion.formatFailedResponse((InitializeResponse.FailedInitializeResponse) initializeResponse);
        } else {
            failedResponse = null;
        }
        Diagnostics.markEnd$default(diagnostics, keyType, z2, null, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, globalEvaluationDetails$android_sdk_release, failedResponse, null, null, null, 950271, null), contextType, 4, null);
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger != null) {
            statsigLogger.logDiagnostics(contextType);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
            throw null;
        }
    }

    public final void logEndDiagnosticsWhenException(ContextType contextType, Exception exc) {
        Class<?> cls;
        try {
            Diagnostics diagnostics = this.diagnostics;
            if (diagnostics == null || this.logger == null) {
                return;
            }
            if (diagnostics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                throw null;
            }
            Diagnostics.markEnd$default(diagnostics, KeyType.OVERALL, false, null, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Marker.ErrorMessage(((Object) ((exc == null || (cls = exc.getClass()) == null) ? null : cls.getName())) + ": " + ((Object) (exc == null ? null : exc.getMessage())), null, null, 6, null), null, null, null, 983039, null), contextType, 4, null);
            StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            statsigLogger.logDiagnostics(contextType);
            BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), this.dispatcherProvider.getIo(), null, new C12083(null), 2, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, Double d2, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            d2 = null;
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, d2, (Map<String, String>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, String str2, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, str2, (Map<String, String>) map);
    }

    public final void logExposure(String str, DynamicConfig dynamicConfig, boolean z2) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(str, dynamicConfig, statsigUser, z2);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
    }

    public final void logExposure(String str, FeatureGate featureGate, boolean z2) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(str, featureGate, statsigUser, z2);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
    }

    static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, DynamicConfig dynamicConfig, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        statsigClient.logExposure(str, dynamicConfig, z2);
    }

    static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, FeatureGate featureGate, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        statsigClient.logExposure(str, featureGate, z2);
    }

    public static /* synthetic */ void logLayerParameterExposure$android_sdk_release$default(StatsigClient statsigClient, Layer layer, String str, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        statsigClient.logLayerParameterExposure$android_sdk_release(layer, str, z2);
    }

    public final StatsigUser normalizeUser(StatsigUser statsigUser) {
        StatsigUser statsigUser2 = new StatsigUser(null);
        if (statsigUser != null) {
            statsigUser2 = statsigUser.getCopyForEvaluation$android_sdk_release();
        }
        statsigUser2.setStatsigEnvironment$android_sdk_release(getOptions$android_sdk_release().getEnvironment());
        Function1<StatsigUser, Unit> userObjectValidator = getOptions$android_sdk_release().getUserObjectValidator();
        if (userObjectValidator != null) {
            userObjectValidator.invoke(statsigUser2);
        }
        return statsigUser2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openDebugView$default(StatsigClient statsigClient, Context context, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        statsigClient.openDebugView(context, function1);
    }

    public final void pollForUpdates() {
        if (getOptions$android_sdk_release().getEnableAutoValueUpdate()) {
            Job job = this.pollingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            StatsigNetwork statsigNetwork$android_sdk_release = getStatsigNetwork$android_sdk_release();
            String api = getOptions$android_sdk_release().getApi();
            StatsigUser statsigUser = this.user;
            if (statsigUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            StatsigMetadata statsigMetadata = this.statsigMetadata;
            if (statsigMetadata != null) {
                this.pollingJob = FlowKt.launchIn(FlowKt.onEach(statsigNetwork$android_sdk_release.pollForChanges(api, statsigUser, statsigMetadata, (long) (getOptions$android_sdk_release().getAutoValueUpdateIntervalMinutes() * ((double) 60) * ((double) 1000)), getOptions$android_sdk_release().getInitializeFallbackUrls()), new C12261(null)), getStatsigScope$android_sdk_release());
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
                throw null;
            }
        }
    }

    private final void populateStatsigMetadata() throws Throwable {
        StatsigMetadata statsigMetadata = this.statsigMetadata;
        String strKd = Qg.kd("AA-?=2/\u0014+9%'#5!", (short) (OY.Xd() ^ 2566), (short) (OY.Xd() ^ 10344));
        if (statsigMetadata == null) {
            Intrinsics.throwUninitializedPropertyAccessException(strKd);
            throw null;
        }
        statsigMetadata.overrideStableID$android_sdk_release(getOptions$android_sdk_release().getOverrideStableID());
        try {
            Application application = this.application;
            String strVd = hg.Vd("ftsnjc`rfki", (short) (C1633zX.Xd() ^ (-18498)), (short) (C1633zX.Xd() ^ (-26014)));
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strVd);
                throw null;
            }
            if (application.getPackageManager() == null || getOptions$android_sdk_release().getOptOutNonSdkMetadata()) {
                return;
            }
            Application application2 = this.application;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strVd);
                throw null;
            }
            PackageManager packageManager = application2.getPackageManager();
            Application application3 = this.application;
            if (application3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strVd);
                throw null;
            }
            String packageName = application3.getPackageName();
            Class<?> cls = Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG\t\u0005Deuv}rwt[nzlqnz", (short) (Od.Xd() ^ (-8681))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1580rY.Xd() ^ (-6093));
            int[] iArr = new int["D<N:\fK=KI\u00113UXPRL".length()];
            QB qb = new QB("D<N:\fK=KI\u00113UXPRL");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {packageName, 0};
            Method method = cls.getMethod(C1561oA.Yd("'&6\u0013%(1(/.\u001392<", (short) (ZN.Xd() ^ 7715)), clsArr);
            try {
                method.setAccessible(true);
                PackageInfo packageInfo = (PackageInfo) method.invoke(packageManager, objArr);
                Intrinsics.checkNotNullExpressionValue(packageInfo, Xg.qd(":JKHFA@TJQQ\u0012UGJSJQP9N\\PWVd![ZjGY\\e\\cbGmfp*dturpkj~t{{<\u007fqt}t{zdx\u0006~F;LF", (short) (FB.Xd() ^ 5756), (short) (FB.Xd() ^ 10860)));
                StatsigMetadata statsigMetadata2 = this.statsigMetadata;
                if (statsigMetadata2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(strKd);
                    throw null;
                }
                statsigMetadata2.setAppVersion(packageInfo.versionName);
                StatsigMetadata statsigMetadata3 = this.statsigMetadata;
                if (statsigMetadata3 != null) {
                    statsigMetadata3.setAppIdentifier(packageInfo.packageName);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(strKd);
                    throw null;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ Object refreshCacheAsync$default(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iStatsigCallback = null;
        }
        return statsigClient.refreshCacheAsync(iStatsigCallback, continuation);
    }

    public final void resetUser() {
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.resetUser.1
            C12311() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.onUpdateUser();
                Job job = StatsigClient.this.pollingJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                StatsigUser statsigUser = StatsigClient.this.user;
                if (statsigUser != null) {
                    store.resetUser(statsigUser);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
            }
        }, null, null, null, 14, null);
    }

    public final StatsigUser setup(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions) throws Throwable {
        if (!StringsKt.startsWith$default(str, "client-", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "test-", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Invalid SDK Key provided.  You must provide a client SDK Key from the API Key page of your Statsig console");
        }
        this.initTime = System.currentTimeMillis();
        Diagnostics diagnostics = new Diagnostics(statsigOptions.getDisableDiagnosticsLogging(), statsigOptions.getLoggingCopy$android_sdk_release());
        this.diagnostics = diagnostics;
        Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, null, 14, null);
        this.application = application;
        this.sdkKey = str;
        setOptions$android_sdk_release(statsigOptions);
        StatsigUser statsigUserNormalizeUser = normalizeUser(statsigUser);
        Map<String, ? extends Object> initializeValues = statsigOptions.getInitializeValues();
        this.user = statsigUserNormalizeUser;
        this.exceptionHandler = this.errorBoundary.getExceptionHandler();
        CoroutineContext coroutineContextPlus = this.statsigJob.plus(this.dispatcherProvider.getMain());
        CoroutineExceptionHandler coroutineExceptionHandler = this.exceptionHandler;
        if (coroutineExceptionHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exceptionHandler");
            throw null;
        }
        setStatsigScope$android_sdk_release(CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(coroutineExceptionHandler)));
        NetworkFallbackResolver networkFallbackResolver = new NetworkFallbackResolver(this.errorBoundary, getSharedPrefs$android_sdk_release(), getStatsigScope$android_sdk_release());
        this.store = new Store(getStatsigScope$android_sdk_release(), getSharedPrefs$android_sdk_release(), statsigUserNormalizeUser, str, statsigOptions);
        if (this.statsigNetwork == null) {
            Application application2 = application;
            ErrorBoundary errorBoundary = this.errorBoundary;
            SharedPreferences sharedPrefs$android_sdk_release = getSharedPrefs$android_sdk_release();
            CoroutineScope statsigScope$android_sdk_release = getStatsigScope$android_sdk_release();
            Store store = this.store;
            if (store == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            setStatsigNetwork$android_sdk_release(StatsigNetworkKt.StatsigNetwork(application2, str, errorBoundary, sharedPrefs$android_sdk_release, statsigOptions, networkFallbackResolver, statsigScope$android_sdk_release, store));
        }
        StatsigMetadata statsigMetadataCreateCoreStatsigMetadata = statsigOptions.getOptOutNonSdkMetadata() ? StatsigMetadataKt.createCoreStatsigMetadata() : StatsigMetadataKt.createStatsigMetadata();
        this.statsigMetadata = statsigMetadataCreateCoreStatsigMetadata;
        ErrorBoundary errorBoundary2 = this.errorBoundary;
        if (statsigMetadataCreateCoreStatsigMetadata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
            throw null;
        }
        errorBoundary2.setMetadata(statsigMetadataCreateCoreStatsigMetadata);
        this.onDeviceEvalAdapter = statsigOptions.getOnDeviceEvalAdapter();
        this.initialized.set(true);
        this.lifecycleListener = new StatsigActivityLifecycleListener(application, this);
        CoroutineScope statsigScope$android_sdk_release2 = getStatsigScope$android_sdk_release();
        String eventLoggingAPI = statsigOptions.getEventLoggingAPI();
        StatsigMetadata statsigMetadata = this.statsigMetadata;
        if (statsigMetadata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
            throw null;
        }
        StatsigNetwork statsigNetwork$android_sdk_release = getStatsigNetwork$android_sdk_release();
        Diagnostics diagnostics2 = this.diagnostics;
        if (diagnostics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
            throw null;
        }
        this.logger = new StatsigLogger(statsigScope$android_sdk_release2, str, eventLoggingAPI, statsigMetadata, statsigNetwork$android_sdk_release, statsigUserNormalizeUser, diagnostics2, statsigOptions.getLogEventFallbackUrls());
        populateStatsigMetadata();
        if (statsigOptions.getOverrideStableID() == null) {
            String localStorageStableID = getLocalStorageStableID();
            StatsigMetadata statsigMetadata2 = this.statsigMetadata;
            if (statsigMetadata2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
                throw null;
            }
            statsigMetadata2.overrideStableID$android_sdk_release(localStorageStableID);
        }
        if (!getOptions$android_sdk_release().getLoadCacheAsync()) {
            Diagnostics diagnostics3 = this.diagnostics;
            if (diagnostics3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                throw null;
            }
            Diagnostics.markStart$default(diagnostics3, KeyType.INITIALIZE, StepType.LOAD_CACHE, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 524287, null), null, 8, null);
            Store store2 = this.store;
            if (store2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            store2.syncLoadFromLocalStorage();
            Diagnostics diagnostics4 = this.diagnostics;
            if (diagnostics4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                throw null;
            }
            Diagnostics.markEnd$default(diagnostics4, KeyType.INITIALIZE, true, StepType.LOAD_CACHE, null, null, 24, null);
        }
        if (initializeValues != null) {
            Store store3 = this.store;
            if (store3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("store");
                throw null;
            }
            StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            store3.bootstrap(initializeValues, statsigUser2);
            this.isBootstrapped.set(true);
        }
        return statsigUserNormalizeUser;
    }

    static /* synthetic */ StatsigUser setup$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, int i2, Object obj) {
        StatsigOptions statsigOptions2 = statsigOptions;
        StatsigUser statsigUser2 = statsigUser;
        if ((i2 + 4) - (i2 | 4) != 0) {
            statsigUser2 = null;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, 4194303, null);
        }
        return statsigClient.setup(application, str, statsigUser2, statsigOptions2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shutdownImpl(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.statsig.androidsdk.StatsigClient.C12331
            if (r0 == 0) goto L6c
            r6 = r8
            com.statsig.androidsdk.StatsigClient$shutdownImpl$1 r6 = (com.statsig.androidsdk.StatsigClient.C12331) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L6c
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r4 = 0
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L4b
            if (r0 != r3) goto L78
            java.lang.Object r1 = r6.L$0
            com.statsig.androidsdk.StatsigClient r1 = (com.statsig.androidsdk.StatsigClient) r1
            kotlin.ResultKt.throwOnFailure(r5)
        L29:
            com.statsig.androidsdk.StatsigActivityLifecycleListener r0 = r1.lifecycleListener
            if (r0 == 0) goto L72
            r0.shutdown()
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isBootstrapped
            r0.set(r4)
            com.statsig.androidsdk.ErrorBoundary r0 = new com.statsig.androidsdk.ErrorBoundary
            r0.<init>(r2, r3, r2)
            r1.setErrorBoundary$android_sdk_release(r0)
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r2, r3, r2)
            r1.statsigJob = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isInitializing
            r0.set(r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4b:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.initialized
            r0.set(r4)
            kotlinx.coroutines.Job r0 = r7.pollingJob
            if (r0 != 0) goto L66
        L57:
            com.statsig.androidsdk.StatsigLogger r0 = r7.logger
            if (r0 == 0) goto L80
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = r0.shutdown(r6)
            if (r0 != r1) goto L6a
            return r1
        L66:
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r2, r3, r2)
            goto L57
        L6a:
            r1 = r7
            goto L29
        L6c:
            com.statsig.androidsdk.StatsigClient$shutdownImpl$1 r6 = new com.statsig.androidsdk.StatsigClient$shutdownImpl$1
            r6.<init>(r8)
            goto L13
        L72:
            java.lang.String r0 = "lifecycleListener"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r2
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigClient.shutdownImpl(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateStickyValues() {
        BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), this.dispatcherProvider.getIo(), null, new C12351(null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateUser$default(StatsigClient statsigClient, StatsigUser statsigUser, Map map, Continuation continuation, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            map = null;
        }
        return statsigClient.updateUser(statsigUser, map, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUserAsync$default(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map map, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            iStatsigCallback = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            map = null;
        }
        statsigClient.updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    public final Object updateUserImpl(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcherProvider.getIo(), new C12382(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean checkGate(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        enforceInitialized$android_sdk_release("checkGate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.checkGate.1
            final /* synthetic */ String $gateName;
            final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String gateName2, Ref.ObjectRef<FeatureGate> objectRef2) {
                super(0);
                str = gateName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                ?? featureGateEvaluation = StatsigClient.this.getFeatureGateEvaluation(str);
                StatsigClient.logExposure$default(StatsigClient.this, str, (FeatureGate) featureGateEvaluation, false, 4, (Object) null);
                objectRef.element = featureGateEvaluation;
            }
        }, "checkGate", null, gateName2, 4, null);
        FeatureGate error = (FeatureGate) objectRef2.element;
        if (error == null) {
            error = FeatureGate.Companion.getError(gateName2);
        }
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean checkGateWithExposureLoggingDisabled(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        enforceInitialized$android_sdk_release("checkGateWithExposureLoggingDisabled");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.checkGateWithExposureLoggingDisabled.1
            final /* synthetic */ String $gateName;
            final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11911(String gateName2, Ref.ObjectRef<FeatureGate> objectRef2) {
                super(0);
                str = gateName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                objectRef.element = StatsigClient.this.getFeatureGateEvaluation(str);
            }
        }, "checkGateWithExposureLoggingDisabled", null, gateName2, 4, null);
        FeatureGate error = (FeatureGate) objectRef2.element;
        if (error == null) {
            error = FeatureGate.Companion.getError(gateName2);
        }
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error.getValue();
    }

    public final void enforceInitialized$android_sdk_release(String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        if (!this.initialized.get()) {
            throw new IllegalStateException(Intrinsics.stringPlus("The SDK must be initialized prior to invoking ", functionName));
        }
    }

    public final Object flush(Continuation<? super Unit> continuation) {
        enforceInitialized$android_sdk_release("flush");
        return getErrorBoundary$android_sdk_release().captureAsync(new AnonymousClass2(null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StatsigOverrides getAllOverrides() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getAllOverrides.1
            final /* synthetic */ Ref.ObjectRef<StatsigOverrides> $result;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11921(Ref.ObjectRef<StatsigOverrides> objectRef2, StatsigClient this) {
                super(0);
                objectRef = objectRef2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.StatsigOverrides] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                objectRef.element = statsigClient.getStore$android_sdk_release().getAllOverrides();
            }
        }, null, null, null, 14, null);
        StatsigOverrides statsigOverrides = (StatsigOverrides) objectRef2.element;
        return statsigOverrides == null ? StatsigOverrides.Companion.empty() : statsigOverrides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final DynamicConfig getConfig(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        enforceInitialized$android_sdk_release("getConfig");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = DynamicConfig.Companion.getError(configName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getConfig.1
            final /* synthetic */ String $configName;
            final /* synthetic */ Ref.ObjectRef<DynamicConfig> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11931(String configName2, Ref.ObjectRef<DynamicConfig> objectRef2) {
                super(0);
                str = configName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                ?? dynamicConfigEvaluation = StatsigClient.this.getDynamicConfigEvaluation(str);
                StatsigClient.logExposure$default(StatsigClient.this, str, (DynamicConfig) dynamicConfigEvaluation, false, 4, (Object) null);
                objectRef.element = dynamicConfigEvaluation;
            }
        }, "getConfig", null, configName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (DynamicConfig) objectRef2.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final DynamicConfig getConfigWithExposureLoggingDisabled(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        enforceInitialized$android_sdk_release("getConfigWithExposureLoggingDisabled");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = DynamicConfig.Companion.getError(configName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getConfigWithExposureLoggingDisabled.1
            final /* synthetic */ String $configName;
            final /* synthetic */ Ref.ObjectRef<DynamicConfig> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11941(String configName2, Ref.ObjectRef<DynamicConfig> objectRef2) {
                super(0);
                str = configName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                objectRef.element = StatsigClient.this.getDynamicConfigEvaluation(str);
            }
        }, "getConfigWithExposureLoggingDisabled", null, configName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (DynamicConfig) objectRef2.element;
    }

    public final ErrorBoundary getErrorBoundary$android_sdk_release() {
        return this.errorBoundary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final DynamicConfig getExperiment(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        enforceInitialized$android_sdk_release("getExperiment");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = DynamicConfig.Companion.getError(experimentName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getExperiment.1
            final /* synthetic */ String $experimentName;
            final /* synthetic */ boolean $keepDeviceValue;
            final /* synthetic */ Ref.ObjectRef<DynamicConfig> $res;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11951(Ref.ObjectRef<DynamicConfig> objectRef2, StatsigClient this, String experimentName2, boolean z22) {
                super(0);
                objectRef = objectRef2;
                statsigClient = this;
                str = experimentName2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                objectRef.element = statsigClient.getExperimentEvaluation(str, z);
                if (z) {
                    statsigClient.updateStickyValues();
                }
                StatsigClient.logExposure$default(statsigClient, str, objectRef.element, false, 4, (Object) null);
            }
        }, "getExperiment", null, experimentName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (DynamicConfig) objectRef2.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final DynamicConfig getExperimentWithExposureLoggingDisabled(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        enforceInitialized$android_sdk_release("getExperimentWithExposureLoggingDisabled");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = DynamicConfig.Companion.getError(experimentName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getExperimentWithExposureLoggingDisabled.1
            final /* synthetic */ Ref.ObjectRef<DynamicConfig> $exp;
            final /* synthetic */ String $experimentName;
            final /* synthetic */ boolean $keepDeviceValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11961(String experimentName2, Ref.ObjectRef<DynamicConfig> objectRef2, boolean z22) {
                super(0);
                str = experimentName2;
                objectRef = objectRef2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                objectRef.element = StatsigClient.this.getExperimentEvaluation(str, z);
                if (z) {
                    StatsigClient.this.updateStickyValues();
                }
            }
        }, "getExperimentWithExposureLoggingDisabled", null, experimentName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (DynamicConfig) objectRef2.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FeatureGate getFeatureGate(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        enforceInitialized$android_sdk_release("getFeatureGate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getFeatureGate.1
            final /* synthetic */ String $gateName;
            final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11971(String gateName2, Ref.ObjectRef<FeatureGate> objectRef2) {
                super(0);
                str = gateName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                ?? featureGateEvaluation = StatsigClient.this.getFeatureGateEvaluation(str);
                StatsigClient.logExposure$default(StatsigClient.this, str, (FeatureGate) featureGateEvaluation, false, 4, (Object) null);
                objectRef.element = featureGateEvaluation;
            }
        }, "getFeatureGate", null, gateName2, 4, null);
        FeatureGate error = (FeatureGate) objectRef2.element;
        if (error == null) {
            error = FeatureGate.Companion.getError(gateName2);
        }
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FeatureGate getFeatureGateWithExposureLoggingDisabled(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        enforceInitialized$android_sdk_release("getFeatureGateWithExposureLoggingDisabled");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getFeatureGateWithExposureLoggingDisabled.1
            final /* synthetic */ String $gateName;
            final /* synthetic */ Ref.ObjectRef<FeatureGate> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11981(String gateName2, Ref.ObjectRef<FeatureGate> objectRef2) {
                super(0);
                str = gateName2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                objectRef.element = StatsigClient.this.getFeatureGateEvaluation(str);
            }
        }, "getFeatureGateWithExposureLoggingDisabled", null, gateName2, 4, null);
        FeatureGate error = (FeatureGate) objectRef2.element;
        if (error == null) {
            error = FeatureGate.Companion.getError(gateName2);
        }
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ExternalInitializeResponse getInitializeResponseJson() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        enforceInitialized$android_sdk_release("getInitializeResponseJson");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getInitializeResponseJson.1
            final /* synthetic */ Ref.ObjectRef<ExternalInitializeResponse> $result;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11991(Ref.ObjectRef<ExternalInitializeResponse> objectRef2, StatsigClient this) {
                super(0);
                objectRef = objectRef2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.ExternalInitializeResponse] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Ref.ObjectRef<ExternalInitializeResponse> objectRef2 = objectRef;
                Store store = statsigClient.store;
                if (store != null) {
                    objectRef2.element = store.getCurrentCacheValuesAndEvaluationReason();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
            }
        }, "getInitializeResponseJson", null, null, 12, null);
        ExternalInitializeResponse externalInitializeResponse = (ExternalInitializeResponse) objectRef2.element;
        return externalInitializeResponse == null ? ExternalInitializeResponse.Companion.getUninitialized() : externalInitializeResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.Layer] */
    public final Layer getLayer(String layerName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        enforceInitialized$android_sdk_release("getLayer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Layer.Companion.getError(layerName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getLayer.1
            final /* synthetic */ boolean $keepDeviceValue;
            final /* synthetic */ Ref.ObjectRef<Layer> $layer;
            final /* synthetic */ String $layerName;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12001(Ref.ObjectRef<Layer> objectRef2, StatsigClient this, String layerName2, boolean z22) {
                super(0);
                objectRef = objectRef2;
                statsigClient = this;
                str = layerName2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.Layer] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Ref.ObjectRef<Layer> objectRef2 = objectRef;
                StatsigClient statsigClient = statsigClient;
                objectRef2.element = statsigClient.getLayerEvaluation(statsigClient, str, z);
                if (z) {
                    statsigClient.updateStickyValues();
                }
            }
        }, "getLayer", null, layerName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (Layer) objectRef2.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.statsig.androidsdk.Layer] */
    public final Layer getLayerWithExposureLoggingDisabled(String layerName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        enforceInitialized$android_sdk_release("getLayerWithExposureLoggingDisabled");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Layer.Companion.getError(layerName);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getLayerWithExposureLoggingDisabled.1
            final /* synthetic */ boolean $keepDeviceValue;
            final /* synthetic */ Ref.ObjectRef<Layer> $layer;
            final /* synthetic */ String $layerName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12011(String layerName2, Ref.ObjectRef<Layer> objectRef2, boolean z22) {
                super(0);
                str = layerName2;
                objectRef = objectRef2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.Layer] */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                objectRef.element = StatsigClient.this.getLayerEvaluation(null, str, z);
                if (z) {
                    StatsigClient.this.updateStickyValues();
                }
            }
        }, "getLayerWithExposureLoggingDisabled", null, layerName2, 4, null);
        Function1<BaseConfig, Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef2.element);
        }
        return (Layer) objectRef2.element;
    }

    public final StatsigOptions getOptions$android_sdk_release() {
        StatsigOptions statsigOptions = this.options;
        if (statsigOptions != null) {
            return statsigOptions;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.statsig.androidsdk.ParameterStore] */
    public final ParameterStore getParameterStore(String parameterStoreName, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
        Intrinsics.checkNotNullParameter(parameterStoreName, "parameterStoreName");
        enforceInitialized$android_sdk_release("getParameterStore");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HashMap map = new HashMap();
        Store store = this.store;
        if (store == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
            throw null;
        }
        objectRef.element = new ParameterStore(this, map, parameterStoreName, Store.getEvaluationDetails$android_sdk_release$default(store, false, null, 2, null), parameterStoreEvaluationOptions);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getParameterStore.1
            final /* synthetic */ ParameterStoreEvaluationOptions $options;
            final /* synthetic */ Ref.ObjectRef<ParameterStore> $paramStore;
            final /* synthetic */ String $parameterStoreName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12031(String parameterStoreName2, Ref.ObjectRef<ParameterStore> objectRef2, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions2) {
                super(0);
                str = parameterStoreName2;
                objectRef = objectRef2;
                parameterStoreEvaluationOptions = parameterStoreEvaluationOptions2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, com.statsig.androidsdk.ParameterStore] */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [T] */
            /* JADX WARN: Type inference failed for: r1v6, types: [com.statsig.androidsdk.ParameterStore] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    throw null;
                }
                statsigLogger.addNonExposedCheck(str);
                Ref.ObjectRef<ParameterStore> objectRef2 = objectRef;
                Store store2 = StatsigClient.this.store;
                if (store2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                objectRef2.element = store2.getParamStore(StatsigClient.this, str, parameterStoreEvaluationOptions);
                Ref.ObjectRef<ParameterStore> objectRef22 = objectRef;
                OnDeviceEvalAdapter onDeviceEvalAdapter = StatsigClient.this.onDeviceEvalAdapter;
                ParameterStore paramStore = onDeviceEvalAdapter != null ? onDeviceEvalAdapter.getParamStore(StatsigClient.this, objectRef.element) : 0;
                if (paramStore == 0) {
                    paramStore = objectRef.element;
                }
                objectRef22.element = paramStore;
            }
        }, "getParameterStore", null, parameterStoreName2, 4, null);
        return (ParameterStore) objectRef2.element;
    }

    public final SharedPreferences getSharedPrefs$android_sdk_release() {
        Application application = this.application;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            throw null;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "application.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getStableID() {
        enforceInitialized$android_sdk_release("getStableID");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.getStableID.1
            final /* synthetic */ Ref.ObjectRef<String> $result;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12041(Ref.ObjectRef<String> objectRef2, StatsigClient this) {
                super(0);
                objectRef = objectRef2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Ref.ObjectRef<String> objectRef2 = objectRef;
                StatsigMetadata statsigMetadata = statsigClient.statsigMetadata;
                if (statsigMetadata == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("statsigMetadata");
                    throw null;
                }
                String stableID = statsigMetadata.getStableID();
                T t2 = stableID;
                if (stableID == null) {
                    t2 = "";
                }
                objectRef2.element = t2;
            }
        }, "getStableID", null, null, 12, null);
        return (String) objectRef2.element;
    }

    public final StatsigNetwork getStatsigNetwork$android_sdk_release() {
        StatsigNetwork statsigNetwork = this.statsigNetwork;
        if (statsigNetwork != null) {
            return statsigNetwork;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statsigNetwork");
        throw null;
    }

    public final CoroutineScope getStatsigScope$android_sdk_release() {
        CoroutineScope coroutineScope = this.statsigScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statsigScope");
        throw null;
    }

    public final Store getStore$android_sdk_release() {
        Store store = this.store;
        if (store != null) {
            return store;
        }
        Intrinsics.throwUninitializedPropertyAccessException("store");
        throw null;
    }

    public final Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation<? super InitializationDetails> continuation) {
        if (this.isInitializing.getAndSet(true)) {
            return null;
        }
        getErrorBoundary$android_sdk_release().setKey(str);
        return getErrorBoundary$android_sdk_release().captureAsync(new C12052(application, str, statsigUser, statsigOptions, null), new AnonymousClass3(null), continuation);
    }

    public final void initializeAsync(Application application, String sdkKey, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions options) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.isInitializing.getAndSet(true)) {
            return;
        }
        this.errorBoundary.setKey(sdkKey);
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.initializeAsync.1
            final /* synthetic */ Application $application;
            final /* synthetic */ IStatsigCallback $callback;
            final /* synthetic */ StatsigOptions $options;
            final /* synthetic */ String $sdkKey;
            final /* synthetic */ StatsigUser $user;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                final /* synthetic */ StatsigUser $normalizedUser;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
                static final class C02641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ IStatsigCallback $callback;
                    final /* synthetic */ InitializationDetails $initDetails;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02641(IStatsigCallback iStatsigCallback, InitializationDetails initializationDetails, Continuation<? super C02641> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                        this.$initDetails = initializationDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C02641(this.$callback, this.$initDetails, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C02641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws ExternalException {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        try {
                            IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigInitialize(this.$initDetails);
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            throw new ExternalException(e2.getMessage());
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02631(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Continuation<? super C02631> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$normalizedUser = statsigUser;
                    this.$callback = iStatsigCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02631(this.this$0, this.$normalizedUser, this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = this.this$0.setupAsync$android_sdk_release(this.$normalizedUser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    InitializationDetails initializationDetails = (InitializationDetails) obj;
                    initializationDetails.setDuration(System.currentTimeMillis() - this.this$0.initTime);
                    this.label = 2;
                    if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02641(this.$callback, initializationDetails, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12061(Application application2, String sdkKey2, StatsigUser statsigUser2, StatsigOptions options2, IStatsigCallback iStatsigCallback2) {
                super(0);
                application = application2;
                str = sdkKey2;
                statsigUser = statsigUser2;
                statsigOptions = options2;
                iStatsigCallback = iStatsigCallback2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() throws Throwable {
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02631(StatsigClient.this, StatsigClient.this.setup(application, str, statsigUser, statsigOptions), iStatsigCallback, null), 3, null);
            }
        }, null, new Function1<Exception, Unit>() { // from class: com.statsig.androidsdk.StatsigClient.initializeAsync.2
            final /* synthetic */ IStatsigCallback $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12072(IStatsigCallback iStatsigCallback2) {
                super(1);
                iStatsigCallback = iStatsigCallback2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) throws ExternalException {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Exception exc) throws ExternalException {
                StatsigClient.this.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
                try {
                    InitializationDetails initializationDetails = new InitializationDetails(System.currentTimeMillis() - StatsigClient.this.initTime, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
                    IStatsigCallback iStatsigCallback2 = iStatsigCallback;
                    if (iStatsigCallback2 == null) {
                        return;
                    }
                    iStatsigCallback2.onStatsigInitialize(initializationDetails);
                } catch (Exception e2) {
                    throw new ExternalException(e2.getMessage());
                }
            }
        }, null, 10, null);
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void logEvent(String eventName, Double d2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        enforceInitialized$android_sdk_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.logEvent.1
            final /* synthetic */ String $eventName;
            final /* synthetic */ Map<String, String> $metadata;
            final /* synthetic */ Double $value;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1$2 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LogEvent $event;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, this.$event, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        StatsigLogger statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                            throw null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12091(String eventName2, Double d22, Map<String, String> map2, StatsigClient this) {
                super(0);
                str = eventName2;
                d = d22;
                map = map2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                LogEvent logEvent = new LogEvent(str);
                logEvent.setValue(d);
                logEvent.setMetadata(map);
                StatsigUser statsigUser = statsigClient.user;
                if (statsigUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                logEvent.setUser(statsigUser);
                if (!statsigClient.getOptions$android_sdk_release().getDisableCurrentActivityLogging()) {
                    StatsigActivityLifecycleListener statsigActivityLifecycleListener = statsigClient.lifecycleListener;
                    if (statsigActivityLifecycleListener == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("lifecycleListener");
                        throw null;
                    }
                    Activity currentActivity = statsigActivityLifecycleListener.getCurrentActivity();
                    if (currentActivity != null) {
                        logEvent.setStatsigMetadata(MapsKt.mapOf(TuplesKt.to("currentPage", currentActivity.getClass().getSimpleName())));
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass2(statsigClient, logEvent, null), 3, null);
            }
        }, "logEvent", null, null, 12, null);
    }

    public final void logEvent(String eventName, String value, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(value, "value");
        enforceInitialized$android_sdk_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.logEvent.2
            final /* synthetic */ String $eventName;
            final /* synthetic */ Map<String, String> $metadata;
            final /* synthetic */ String $value;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LogEvent $event;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$event, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        StatsigLogger statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                            throw null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12102(String eventName2, String value2, Map<String, String> map2, StatsigClient this) {
                super(0);
                str = eventName2;
                str = value2;
                map = map2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                LogEvent logEvent = new LogEvent(str);
                logEvent.setValue(str);
                logEvent.setMetadata(map);
                StatsigUser statsigUser = statsigClient.user;
                if (statsigUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                logEvent.setUser(statsigUser);
                BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(statsigClient, logEvent, null), 3, null);
            }
        }, "logEvent", null, null, 12, null);
    }

    public final void logEvent(String eventName, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        enforceInitialized$android_sdk_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.logEvent.3
            final /* synthetic */ String $eventName;
            final /* synthetic */ Map<String, String> $metadata;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LogEvent $event;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$event, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        StatsigLogger statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                            throw null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12113(String eventName2, Map<String, String> metadata2, StatsigClient this) {
                super(0);
                str = eventName2;
                map = metadata2;
                statsigClient = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                LogEvent logEvent = new LogEvent(str);
                logEvent.setValue(null);
                logEvent.setMetadata(map);
                StatsigUser statsigUser = statsigClient.user;
                if (statsigUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                logEvent.setUser(statsigUser);
                BuildersKt__Builders_commonKt.launch$default(statsigClient.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(statsigClient, logEvent, null), 3, null);
            }
        }, "logEvent", null, null, 12, null);
    }

    public final void logLayerParameterExposure$android_sdk_release(Layer layer, String parameterName, boolean z2) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        if (isInitialized()) {
            Map<String, String>[] undelegatedSecondaryExposures$android_sdk_release = layer.getUndelegatedSecondaryExposures$android_sdk_release();
            Set<String> explicitParameters$android_sdk_release = layer.getExplicitParameters$android_sdk_release();
            boolean zAreEqual = Intrinsics.areEqual((Object) (explicitParameters$android_sdk_release == null ? null : Boolean.valueOf(explicitParameters$android_sdk_release.contains(parameterName))), (Object) true);
            String str = "";
            if (zAreEqual) {
                undelegatedSecondaryExposures$android_sdk_release = layer.getSecondaryExposures$android_sdk_release();
                String allocatedExperimentName = layer.getAllocatedExperimentName();
                if (allocatedExperimentName != null) {
                    str = allocatedExperimentName;
                }
            }
            StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                throw null;
            }
            String name = layer.getName();
            String ruleIDForParameter = layer.getRuleIDForParameter(parameterName);
            StatsigUser statsigUser = this.user;
            if (statsigUser != null) {
                statsigLogger.logLayerExposure(name, ruleIDForParameter, undelegatedSecondaryExposures$android_sdk_release, statsigUser, str, parameterName, zAreEqual, layer.getEvaluationDetails(), z2);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
        }
    }

    public final void manuallyLogConfigExposure(DynamicConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        enforceInitialized$android_sdk_release("logManualConfigExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogConfigExposure.2
            final /* synthetic */ DynamicConfig $config;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12132(DynamicConfig config2) {
                super(0);
                dynamicConfig = config2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigClient.this.logExposure(dynamicConfig.getName(), dynamicConfig, true);
            }
        }, "logManualConfigExposure", null, config2.getName(), 4, null);
    }

    public final void manuallyLogConfigExposure(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        enforceInitialized$android_sdk_release("logManualConfigExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogConfigExposure.1
            final /* synthetic */ String $configName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12121(String configName2) {
                super(0);
                str = configName2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                StatsigClient.this.logExposure(str, store.getConfig(str), true);
            }
        }, "logManualConfigExposure", null, configName2, 4, null);
    }

    public final void manuallyLogExperimentExposure(DynamicConfig experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        enforceInitialized$android_sdk_release("logManualExperimentExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogExperimentExposure.2
            final /* synthetic */ DynamicConfig $experiment;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12152(DynamicConfig experiment2) {
                super(0);
                dynamicConfig = experiment2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigClient.this.logExposure(dynamicConfig.getName(), dynamicConfig, true);
            }
        }, "logManualExperimentExposure", null, experiment2.getName(), 4, null);
    }

    public final void manuallyLogExperimentExposure(String configName, boolean z2) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        enforceInitialized$android_sdk_release("logManualExperimentExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogExperimentExposure.1
            final /* synthetic */ String $configName;
            final /* synthetic */ boolean $keepDeviceValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12141(String configName2, boolean z22) {
                super(0);
                str = configName2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                StatsigClient.this.logExposure(str, store.getExperiment(str, z), true);
            }
        }, "logManualExperimentExposure", null, configName2, 4, null);
    }

    public final void manuallyLogGateExposure(FeatureGate gate) {
        Intrinsics.checkNotNullParameter(gate, "gate");
        enforceInitialized$android_sdk_release("logManualGateExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogGateExposure.2
            final /* synthetic */ FeatureGate $gate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12172(FeatureGate gate2) {
                super(0);
                featureGate = gate2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigClient.this.logExposure(featureGate.getName(), featureGate, true);
            }
        }, "logManualGateExposure", null, gate2.getName(), 4, null);
    }

    public final void manuallyLogGateExposure(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        enforceInitialized$android_sdk_release("logManualGateExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogGateExposure.1
            final /* synthetic */ String $gateName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12161(String gateName2) {
                super(0);
                str = gateName2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                StatsigClient.this.logExposure(str, store.checkGate(str), true);
            }
        }, "logManualGateExposure", null, gateName2, 4, null);
    }

    public final void manuallyLogLayerParameterExposure(Layer layer, String parameterName) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        enforceInitialized$android_sdk_release("logManualLayerExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogLayerParameterExposure.2
            final /* synthetic */ Layer $layer;
            final /* synthetic */ String $parameterName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12192(Layer layer2, String parameterName2) {
                super(0);
                layer = layer2;
                str = parameterName2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                StatsigClient.this.logLayerParameterExposure$android_sdk_release(layer, str, true);
            }
        }, "logManualLayerExposure", null, layer2.getName(), 4, null);
    }

    public final void manuallyLogLayerParameterExposure(String layerName, String parameterName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        enforceInitialized$android_sdk_release("logManualLayerExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.manuallyLogLayerParameterExposure.1
            final /* synthetic */ boolean $keepDeviceValue;
            final /* synthetic */ String $layerName;
            final /* synthetic */ String $parameterName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12181(String layerName2, boolean z22, String parameterName2) {
                super(0);
                str = layerName2;
                z = z22;
                str = parameterName2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                StatsigClient.this.logLayerParameterExposure$android_sdk_release(store.getLayer(null, str, z), str, true);
            }
        }, "logManualLayerExposure", null, layerName2, 4, null);
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppBlur() {
        BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), null, null, new C12201(null), 3, null);
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppFocus() {
        if (getOptions$android_sdk_release().getDisableLogEventRetries()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), null, null, new C12211(null), 3, null);
    }

    public final void openDebugView(Context context, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.openDebugView.1
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C12221(Context context2, Function1<? super Boolean, Unit> function12) {
                super(0);
                context = context2;
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                Pair[] pairArr = new Pair[4];
                pairArr[0] = TuplesKt.to("values", store.getCurrentValuesAsString());
                Store store2 = StatsigClient.this.store;
                if (store2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                pairArr[1] = TuplesKt.to("evalReason", store2.getReason());
                StatsigUser statsigUser = StatsigClient.this.user;
                if (statsigUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                pairArr[2] = TuplesKt.to("user", statsigUser.getCopyForEvaluation$android_sdk_release());
                pairArr[3] = TuplesKt.to(RRWebOptionsEvent.EVENT_TAG, StatsigClient.this.getOptions$android_sdk_release().toMap$android_sdk_release());
                Map<String, ? extends Object> mapMapOf = MapsKt.mapOf(pairArr);
                DebugView.Companion companion = DebugView.Companion;
                Context context2 = context;
                String str = StatsigClient.this.sdkKey;
                if (str != null) {
                    companion.show(context2, str, mapMapOf, function1);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("sdkKey");
                    throw null;
                }
            }
        }, null, null, null, 14, null);
    }

    public final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(value, "value");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.overrideConfig.1
            final /* synthetic */ String $configName;
            final /* synthetic */ Map<String, Object> $value;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02651(StatsigClient statsigClient, Continuation<? super C02651> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02651(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Store store = this.this$0.store;
                        if (store == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("store");
                            throw null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12231(String configName2, Map<String, ? extends Object> value2) {
                super(0);
                str = configName2;
                map = value2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.overrideConfig(str, map);
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02651(StatsigClient.this, null), 3, null);
            }
        }, "overrideConfig", null, null, 12, null);
    }

    public final void overrideGate(String gateName, boolean z2) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.overrideGate.1
            final /* synthetic */ String $gateName;
            final /* synthetic */ boolean $value;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02661(StatsigClient statsigClient, Continuation<? super C02661> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02661(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Store store = this.this$0.store;
                        if (store == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("store");
                            throw null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12241(String gateName2, boolean z22) {
                super(0);
                str = gateName2;
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.overrideGate(str, z);
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02661(StatsigClient.this, null), 3, null);
            }
        }, "overrideGate", null, null, 12, null);
    }

    public final void overrideLayer(String configName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(value, "value");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.overrideLayer.1
            final /* synthetic */ String $configName;
            final /* synthetic */ Map<String, Object> $value;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02671(StatsigClient statsigClient, Continuation<? super C02671> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02671(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Store store = this.this$0.store;
                        if (store == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("store");
                            throw null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12251(String configName2, Map<String, ? extends Object> value2) {
                super(0);
                str = configName2;
                map = value2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.overrideLayer(str, map);
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02671(StatsigClient.this, null), 3, null);
            }
        }, "overrideLayer", null, null, 12, null);
    }

    public final Object refreshCache(Continuation<? super Unit> continuation) {
        enforceInitialized$android_sdk_release("refreshCache");
        return getErrorBoundary$android_sdk_release().captureAsync(new C12272(null), continuation);
    }

    public final Object refreshCacheAsync(IStatsigCallback iStatsigCallback, Continuation<? super Unit> continuation) {
        enforceInitialized$android_sdk_release("refreshCacheAsync");
        ErrorBoundary.capture$default(getErrorBoundary$android_sdk_release(), new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.refreshCacheAsync.2
            final /* synthetic */ IStatsigCallback $callback;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
                static final class C02681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ IStatsigCallback $callback;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02681(IStatsigCallback iStatsigCallback, Continuation<? super C02681> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C02681(this.$callback, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C02681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws ExternalException {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        try {
                            IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigUpdateUser();
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            throw new ExternalException(e2.getMessage());
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$callback = iStatsigCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.updateUserImpl(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.label = 2;
                    if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02681(this.$callback, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12282(IStatsigCallback iStatsigCallback2) {
                super(0);
                iStatsigCallback = iStatsigCallback2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                    throw null;
                }
                Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new AnonymousClass1(StatsigClient.this, iStatsigCallback, null), 3, null);
            }
        }, "refreshCacheAsync", null, null, 12, null);
        return Unit.INSTANCE;
    }

    public final void removeAllOverrides() {
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.removeAllOverrides.1

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02691(StatsigClient statsigClient, Continuation<? super C02691> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02691(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Store store = this.this$0.store;
                        if (store == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("store");
                            throw null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            C12291() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.removeAllOverrides();
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02691(StatsigClient.this, null), 3, null);
            }
        }, null, null, null, 14, null);
    }

    public final void removeOverride(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.removeOverride.1
            final /* synthetic */ String $name;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02701(StatsigClient statsigClient, Continuation<? super C02701> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02701(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Store store = this.this$0.store;
                        if (store == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("store");
                            throw null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12301(String name2) {
                super(0);
                str = name2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                store.removeOverride(str);
                BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02701(StatsigClient.this, null), 3, null);
            }
        }, null, null, null, 14, null);
    }

    public final Object saveStringToSharedPrefs$android_sdk_release(String str, String str2, Continuation<? super Unit> continuation) {
        Object objSaveStringToSharedPrefs$android_sdk_release = StatsigUtil.INSTANCE.saveStringToSharedPrefs$android_sdk_release(getSharedPrefs$android_sdk_release(), str, str2, continuation);
        return objSaveStringToSharedPrefs$android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveStringToSharedPrefs$android_sdk_release : Unit.INSTANCE;
    }

    public final void setErrorBoundary$android_sdk_release(ErrorBoundary errorBoundary) {
        Intrinsics.checkNotNullParameter(errorBoundary, "<set-?>");
        this.errorBoundary = errorBoundary;
    }

    public final void setOptions$android_sdk_release(StatsigOptions statsigOptions) {
        Intrinsics.checkNotNullParameter(statsigOptions, "<set-?>");
        this.options = statsigOptions;
    }

    public final void setStatsigNetwork$android_sdk_release(StatsigNetwork statsigNetwork) {
        Intrinsics.checkNotNullParameter(statsigNetwork, "<set-?>");
        this.statsigNetwork = statsigNetwork;
    }

    public final void setStatsigScope$android_sdk_release(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.statsigScope = coroutineScope;
    }

    public final Object setupAsync$android_sdk_release(StatsigUser statsigUser, Continuation<? super InitializationDetails> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.getIo(), new StatsigClient$setupAsync$2(this, statsigUser, null), continuation);
    }

    public final void shutdown() throws InterruptedException {
        enforceInitialized$android_sdk_release("shutdown");
        BuildersKt__BuildersKt.runBlocking$default(null, new C12321(null), 1, null);
    }

    public final Object shutdownSuspend(Continuation<? super Unit> continuation) {
        enforceInitialized$android_sdk_release("shutdownSuspend");
        return getErrorBoundary$android_sdk_release().captureAsync(new C12342(null), continuation);
    }

    public final Object updateUser(StatsigUser statsigUser, Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        enforceInitialized$android_sdk_release("updateUser");
        return getErrorBoundary$android_sdk_release().captureAsync(new C12362(statsigUser, map, null), continuation);
    }

    public final void updateUserAsync(StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map<String, ? extends Object> map) {
        enforceInitialized$android_sdk_release("updateUserAsync");
        ErrorBoundary.capture$default(this.errorBoundary, new Function0<Unit>() { // from class: com.statsig.androidsdk.StatsigClient.updateUserAsync.1
            final /* synthetic */ IStatsigCallback $callback;
            final /* synthetic */ StatsigUser $user;
            final /* synthetic */ Map<String, Object> $values;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
            static final class C02731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ IStatsigCallback $callback;
                int label;
                final /* synthetic */ StatsigClient this$0;

                /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
                static final class C02741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ IStatsigCallback $callback;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02741(IStatsigCallback iStatsigCallback, Continuation<? super C02741> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C02741(this.$callback, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C02741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws ExternalException {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        try {
                            IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigUpdateUser();
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            throw new ExternalException(e2.getMessage());
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02731(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, Continuation<? super C02731> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$callback = iStatsigCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C02731(this.this$0, this.$callback, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C02731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.updateUserImpl(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.label = 2;
                    if (BuildersKt.withContext(this.this$0.dispatcherProvider.getMain(), new C02741(this.$callback, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12371(StatsigUser statsigUser2, Map<String, ? extends Object> map2, IStatsigCallback iStatsigCallback2) {
                super(0);
                statsigUser = statsigUser2;
                map = map2;
                iStatsigCallback = iStatsigCallback2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diagnostics");
                    throw null;
                }
                Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
                StatsigClient statsigClient = StatsigClient.this;
                statsigClient.user = statsigClient.normalizeUser(statsigUser);
                StatsigClient.this.resetUser();
                if (map == null) {
                    Store store = StatsigClient.this.store;
                    if (store == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("store");
                        throw null;
                    }
                    store.loadCacheForCurrentUser();
                    BuildersKt__Builders_commonKt.launch$default(StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new C02731(StatsigClient.this, iStatsigCallback, null), 3, null);
                    return;
                }
                Store store2 = StatsigClient.this.store;
                if (store2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("store");
                    throw null;
                }
                Map<String, ? extends Object> map2 = map;
                StatsigUser statsigUser2 = StatsigClient.this.user;
                if (statsigUser2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                store2.bootstrap(map2, statsigUser2);
                StatsigClient.this.logEndDiagnostics(true, ContextType.UPDATE_USER, null);
                IStatsigCallback iStatsigCallback2 = iStatsigCallback;
                if (iStatsigCallback2 == null) {
                    return;
                }
                iStatsigCallback2.onStatsigUpdateUser();
            }
        }, "updateUserAsync", null, null, 12, null);
    }
}
