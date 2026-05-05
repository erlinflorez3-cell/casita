package com.statsig.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
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
@Metadata(bv = {}, d1 = {"Яų\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~08\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013C\u0015\u0006\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMwމA`\u0003Y\rړ:\"Ny\r\u0001(LP\u0010|zKK\u001a\u00128ϋx:h\rU\u0005 \u0016\u000e>.\u001f&\\mQ>H\u0003]Bǂ+\u0003\u007fBVϋg0\u0013M\u0015Ͽ\\'\u001b|i\u001e1A?5+%[\u0003\rUc?\u0011Fy=\u000bi/'AI{Ɏ>X\u0016\u0014\u001d+U\rer<\\\rQf\f/+ecSP\u00141\u007fz\u0012\rD\u0004$\u0006/H4.\"f\u0016Ԅ;οzSVP\n^H\u0001\u0003aL\u0017-\u007fI+A\u001blTi;'W?{\u000b\u000f$ŀ\u0017͙Q[\u0003\r!X+X\u0006QIQn>XR\u0018[Um2sr\u00068\bHG.4\f\u0015<\u001d=7\n@3%y\n`D\u0016\u007f\u0015dv]\u0002RvK2r$CB\t:gTh\u0013yhT\u0007;ҭQ\u001cb\u0017F\u001f!=twj?U\u0014\\n\u0001i\u0019m$ܚcĽeŽ֍rk\u001cx\u0002\u0018AWic>\u007f\u0003z\"bTb3[\u0017Fa0r\\V%bNx5\u0010}ZM:\u0016bK\u007fBL4A\u001bl\u0015v\u00064Ao$Oݷ\u0019Չ\u000fзՁ7$\u0011\u0012l\u001c\u0017*h\\\u001f\u000e\u0018|WO\u0015`P0q]C?>]2jD|Q\n\u0015r.n.֍\u0006ǻkֵ\u0091Y{.@b\u0019_ZU\u0013=\u001dY8\u0010Y]N\td\u007fzB/\u0001|\b=SjDf6\u001a!0n\u001bbO\u0003HR|l%;\nz~(\u0015v\u0001U\u0018l\rq=wu3_J\u0004P~\u001b\u001eLX1w(|Cc[)3\u0015&K_\u001dg]w(F{x\u000eT(,\u0004Нg\u0016}\u001c\u001au@uPOi\u0001N\"R\r1ixt\u0006CZ\u000fD\u000fCHo\u0005\u001f}\u0001o\u0019i\u0016l\u0017.\u001dp\u0005{h: \bBiw0\u0004E\u000e\u0014\rcS8}Wu*\u0006K\u000bH\u0011#R \no\u0007\u0018,?0V\u0006\u00037WL֣V\u07b6@ݥك\t<\u0017c|\u001eJH#C\u0003+6\u0014\t#^_=\u001abF\u0002}n\u000e\u0003<\r\\VIxGv X>/\u0013Ac\u00115_K\u001eJb;{2/`M\r)2g~\u0015T[Jbe3*n\u007f9r\u000eGWJN\u0004ur\u001e{}VP$\r\u001fR\u0018I<a\u0013ov^a9p\u0015TrB*hhMP,EҪ;˓;߽۪\u000f\u0019]?8܂,Z\u001c\u00107q[1\u001bRL\u001f\f+fv\u001f;HM-k\r\u001b\u001a5@oUQ|6]P+\u0012:9\\\u0006T\u0017\u000ekbR\u0016 E\u0013\b\u0017?h\"\u001a-x\"#\u000e<VNO0f2\u001bdYy09B=*\u001b9rOvA\"c\u001b-\u001fe\u0019M~=f{~-~ \u0019)].A[\tUAY.$)\u0002*\u0014T\"f\u0016h)\u001eu{p\u0001m_[;.EjX\twÉ\u0011̭|Υݺy\u00060$6e\u0004܂LL6!\\\u001b\u0004\b\u0012l\u000e@d#\u000fY\u0018\u000bA`^?VdL\u0001b|1M\u0018M\u0019=KnL\u001cEwlQ5`\u000737`: .\u0005=\u001b<xs.Wr\u0011x\u007fudEHj<HZ\n*sd\u0011xcEfu80\u001fV)/\t\u0002PNjd4Ga5Q\u0019?\u0004%:\u0016o5\u001cc\u0006\u0002Y3u\u0019~\u0017\fm|ay@sE\u0019;7\u001fq+W\u0015>;4\u0014smڇ@˿IӭߚgV\u001d5t\bC\u001a6\u0002eD\u0010\f5#R\\$x0I?kB_\u000bC\u0007weF>*d2t'U2\u0011s8r\u001a\u001c\u0002<sab~+ 'jV2=n\u0017E{k\u0010\nr4\f(\u007fʯ\u00057\f/~&N8\u001aKQxى=6s;;s2\u0015beDU_@\b\u000761 x{j\u0019p\u0002c\u001e\u0007*\r;7(9X`\u000e(5\u001a=J%ufd~MO\u000f#B%#\r[r\u0014\u0011\u0006$\f`\u0019\u0018|x\u0014E\u001b9G\u0002f_\u0014lzO Ac+\u00063F\u0003IUT [m\\9\u000f{*pRuo\u0015f7J\u0013^܅\u0004t1\u0010W\\D|:Z\f\u0014k\u0017X\u0012TxrF\u001c\u0011vߦ\u0017۽Y֬\u05fc\u0005\u001c-!\u001eNscJbey\u0015\u00159Zon\u0001XS1\u0007!\u001b\u0010o9C\u0011,xQ49r;4n\b\u0016\u0003a]\roY\u00101d` ]-\u0006Ċ\u007f۔kɟ͑C\u0019e%G'.\u000e<\u0006A\f\u0013k!R&\"\u000e_|:d\u0013`K\b\u0014-ޞً\u0013zzv~\u0018Ff\u001e=4#9ɒ7ņc@4ȨA\u0015U[\u0003{XrFјvʡQE3ܲiJ?\u0005)c}sj\u05ecSƤ\\>\u001fϪvL!\u00062\u001dTfRŞ+݉\u001bUkݗ;\u007fbu)Yb\u0002\u0007ٜ{ܛjdF͔\u000f\tV\u00041'_\b+Yb{1b\u0007Go\u0013\u0011o<1FP\t2)\u0003a`E.e^\u0015<\u0010QJ,q*qvMI`\u0005<m\u0010z%\u0006m;T&\u0018.\u0013\u00143X\u0015\r\u001ak3h^\u001cB\u0378>ծ^@$ޏ+3{r *<\u0017Sۖ.͗WRY;o~r\u001b;\u001eHD.ٸI̹\u0017\u0003!ڽX>[`\u0013n\u0007e{ӯ}ރ#\u0012Jۭ\u0006xOu\u00143\u0006t&̧_Г-}qʰp\u0019y\u0018\u001ccx*&مdˆa.UǿWeJgY\u000281\u007fͦ\nƜ+\u0002Pϵϒ2$+\u0001\u0015MόNR"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#41KFr\n", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4#", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AcZ\u0018X@", "", "3qa<e\tHc\"}vk@", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'|\u001bF\u0004\u0002?i\u0007\u001f3z*\u0004", "AgP?X+)`\u0019\u007f\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "<dcDb9D@\u0019\r\u0005e=|\u0016", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`0o\u001dN\u00012;:y'>j\u0012,S0;y>%&hn\u000f", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "As^?X", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0018Ivz", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAPq;J\u00065KN\u0018(eQ\u007fG\u0018\u0011h\rTtl\u0012fK1KNG(\u0007(V\u0016\u0011O|\u0015\u0015\u001b?no\fT\u001aP\t\u0015~PrVIUlyF,Rb+d\u0019_&Z:Hyzo##2^=\u0006\u000ba\u0015t\u001cupfT#~72=s%4TkdJx)\tV\u000b{\u001c;fJ\u0012r7\f}8E`\u0014Yk\u001a\bZ\u0002\u00149fE&45B\\(Kr\bvK\u0014I\u001bh\u000f\u000b^37\u0006esmO \u0007jlB;kn\b;[\u0019\bGy\"1V\u000eFdy#Rd.zoYR\u001f]\u0001\bnN-_fi\u0001p e<%9h\u001dl,)3V\u0012\u0016r<\u000b\nXI^^W\u001azKH\u001fH", "1n];X*MW*\u0003\nr\u0013\u0001\u0017>e\t(\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4+MDt4\u001c$lr=\u0016w\u0013R\u00056GUN92", "2hb=T;<V\u0019\fek6\u000e\r.e\r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "5r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", "7mXA\\(EW.~g^8\r\t=t\u000e\u0010wK", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001aiPCTuGS(H]m;\bx\u001cL]2\u0005I\u0001\u0015&Ky\u0017\u0012", "", "=eU9\\5>:#\u0001\tD,\u0011y{", "/cS\u0013T0ES\u0018e\u0005`\u0019|\u0015?e\u000e7", "", "@d`BX:M", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C~!>q\u001f.:CG{4,$>", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[g!8t\u001a7M0;wD\u001e#w7 \rm;Uz0\u0011JX9fb\u0002A\u001d\u0012hW,5\u0016\u0014]J4jS;)\u0011\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "/oX\u001db:M:#\u0001\t", "/oX", "0nSFF;KW\"\u0001", "3uT;g:\u001c])\b\n", "4`[9U(<Y\t\f\u0002l", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<M#\u0016aW5/\u001b\u0014/(*xS>#\u0011uG\fHr\u0011\u001b\u001a\u00175x: `\u0019V}\u001e\u0006=8lPb5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "/oX\u001fX;Kgyz~e,{o9g\u000e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rT\u001c8\\J?t}\u001c\u001fukI\u0016g5N\u0005p%VW;`[\u00039#\u0016d\u0017$ns\nUR 8K3(\nu3~@h~\u001bk", "3mS\u0011\\(@\\#\r\nb*\u000b", "2hP4a6Lb\u001d|\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "2hP4a6Lb\u001d|\t<6\u0006\u0018/x\u000f", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u0017Kv8DH\u0012+7C", "9dh!l7>", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05/", "AsPAh:\u001c]\u0018~", "", "AcZ\u001fX.B]\"", "/sc2`7M", "3qa<e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2s9\u000b-Az}.[Q7m4s", "Bh\\2b<M;'", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011N\u00128x.?g\r$5{k\u0015KMC5B-\u0011wo=\t-(Wu4QPM:[X<\u001b\u001e\u001bi\u000ea:{\u0019dAyUBA'Q:X}Jv\u0005\u000e_\n>i}LZ\u000fUx\u001b?')|5mjy\u001d(J^;`Uf\u0019e<\u0004\b\u001d\u0001\u0019\u001dh]\u0004p\u0001O\"n\u001c\u0001cpIbhG1Bv]\u001c,tQMpp&G\u0005y[\u0016a\u0004+v-\u0011\n\u00114n\r\u0015u':m\u0007\u0019.&=0%CF\u0017>Yb{6&\nu%a\u0015LBB>#rMcV\u001d\u0003_\u00171\u001cf[\u00123\u001c\r:Rq^\u000bO\u000eB]y\"^J\u0015", "4h[AX9/O \u0003yE6~\u0017", "/k[", "1ta?X5MB\u001d\u0007z", "", "5dc T=>R\u007f\t|l", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "7mXA\\(EW.~", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "Ah]0X\u001bB[\u0019", ";dc.W(MO", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "1n]AX?MB-\nz", "6`b5H:>R", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`*k\u001c?R,7c\u000b$Fp\u001e\u0004", ">qTC\\6Naw~\bb=|\b\u0010i\u007f/zN", "4t[96/>Q\u001f\r\u000bf", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\f$dpG\u000be\u001c\\v4\u001d3S(mN<D\u0010\u001b\\W55\u0016\u0007/(\"xL\u0001-\u0017(X\u0010?jJ\b\u001f\rBttAd\u000fMC\u0003\u0005=8vJ[GyV=D^9`aF#fIA(\u001d\u0005b\u0019r]8\u001a\u000bW\u001ar`CEqT#\u000bG(GmIDOzU\u0012[%)SE\u0006!.g\u0003/vv\u007f=)Cn\tJu\u0017D(V\u001f5kA:5%P\u001e?!JsvFWv.]\u0017\u001cf7z\u0015ndpR\u0013\u0006k\u0016a~@c|9[\u0010LXs\u00135\u001ce@e\u0002^\u0017\u0016 |sMEdP\n\u0019}N&^\u001f\u0002\t0z\u0018<\u0019\u0019`\u0011r7cFP\u001b^O=\b\rU\r%\u007fL\u001773nf-V)2\n\r\u0013(/T>@@R|\u0014\u001f6Vq\u0005'\u0003pF\u0003\u007f\u0011/2GiGfi/\u001911,\"v<%/)@\u0006\\ID\"^,\u0011\u000f\n2\u0004\u0011f@\u0002k0FIh1\u0012", "7mXA\\(EW.~^f7\u0004", "@dc?\\,L", "7mXA\\(EW.~^f7\u0004G+n~5\u0006D\u007f\u0011%Fu\bIv,5U\f ", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\f$dpG\u000be\u001c\\v4\u001d3S(mN<D\u0010\u001b\\W55\u0016\u0007/(\"xL\u0001-\u0017(X\u0010?jJ\b\u001f\rBttAd\u000fMC\u0003\u0005=8vJ[GyV=D^9`aF\u001bfB\u00042#m()lRw\u0006\u0005R\u001e|VxufMbXB-MmnU4\u0004`<J\u000e\u001dU\u0004A AT\u00049x/M035q\u000fOf&=dBs0XC00DK\u0017=Y9YSC\ny\u001b+\u000f\nk7z|ntcJ\u000f\u00143}Y?i)\u000fFN\u0015LMq^#O}Oe}\u0014\u0017\u0006*7HEQ\u001e0\b\u001czQ&n\u0014\u000bXM\u001d\u0018?\u0012\u0007i\u001el1)\u001fI\u001e^O=\b\rU\r\u001clQ\u001279\u0002h[x&\f_\u0016E2/\u0015L\u0006VJ9v\u001aB\u0010`e#}xI}?\\#/JcHqd8\u000bu\u001d\u007f#pG (=-\u0011VJw4;\u000e\u001ay\u001fdF\u001cYG:K\u001d>Nj K9", "7mXA\\(EW.~^f7\u0004z3t\u0003\u0015{O\u000e+", "@dc?l\u0013B[\u001d\u000e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\f$dpG\u000be\u001c\\v4\u001d3S(mN<D\u0010\u001b\\W55\u0016\u0007/(\"xL\u0001-\u0017(X\u0010?jJ\b\u001f\rBttAd\u000fMC\u0003\u0005=8vJ[GyV=D^9`aF\u001bfB\u00042#m()lRw\u0006\u0005R\u001e|VxufMbXB-MmnU4\u0004`<J\u000e\u001dU\u0004A AT\u00049x/M035q\u000fOf&=dBs0XC00DK\u0017=Y9\\q:\u001fdhh\u0004\u0017d~\u0015\"teeH\u001c\\A}Y?i)\u000fFN\u0015LMq^#O}Oe}\u0014\u0017\u0006*7HEQ\u001e0\b\u001czQ&n\u0014\u000bXM\u001d\u0018?\u0012\u0007i\u001el1)\u001fI\u001e^O=\b\rU\r\u001clQ\u001279\u0002h[x&\f_\u0016E2/\u0015L\u0006VJ9v\u001aB\u0010`e#}xI}?\\#/JcHqd8\u000bu\u001d\u007f#pG (=-\u0011VJw4;\u000e\u001ay\u001fdF\u001cYG:K\u001d>Nj K9", ">n[996K1\u001cz\u0004`,\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "CoS.g,\"\\(~\bo(\u0004p=", ">nbAE,Jc\u0019\r\n", "\"", "", "Cq[\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`7|\u0015\u001a\u0001.6]\u007fu", "Bh\\2b<M", "@d`BX:M1\u0015|}^\u0012|\u001d", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011_\u001bCT/>Z\u0002\"\rT\u001b*^?\u0005r0'\u00172OH\u0014g5PL\u000b.JX4&`\u00029# ^\u0010\u0018'\u0016\u0004fK(mR6%Q\nS\u000bJh\u0014\u001b\u0005\"@jF)T\u001aOC#\u0005=8vJ[)uP@Rl.c\u001a^#&\u0019> \u0016z#)wT,\u0018Q:\u0016ncu1nC\"|\u0002\bG|[HE|+#y#0GE~\u000e;Z>\u0019\u0004:\b=,\fK\nGx\u0014\bet\u001e.&/63:E\u0015\u00152i\u007f{E\u0012qhf\u0019\u0016,6A\"ctgR\u0018\u0015'wk>_n\u0005A[Q\u00140u\u001f6M\u0003K%w\u001f\u0016\u00114|iRC)\u001e^$yS&h!~\u0012j\"%\u0004Y$^\u000by&)>I\u001c\u000b2\"\t\u0001YA$F", "@dc?l\bIW\u0004\t\tm\u0013\u0007\u000b=", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\f$dpG\u000be\u0016Ow.KUN\u0019\\^\u0003=\"!0tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>g\u0011\u0012\u001f14\u0001QZ\u0017\u0011`\u0019\u0004P~OLcn\u0001KJ\u000f`4q\u0016o,`C:2]O#$wT7\u001awb\u0015|[O+NL\u0015\f4mEidH\u000fYRAt%.!", "Ag^B_+\u001c]!\n\b^:\u000bo9g_9{I\u0010", "", "1n]3\\.", "Cq[", "Ag^B_+\u001c]!\n\b^:\u000bo9g_9{I\u0010U\u0013Pn\u001bFz$/g|&1z\u00165M?Ik", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigNetworkImpl implements StatsigNetwork {
    private final StatsigNetworkConnectivityListener connectivityListener;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatcherProvider dispatcherProvider;
    private final ErrorBoundary errorBoundary;
    private final Gson gson;
    private Map<String, HttpURLConnection> initializeRequestsMap;
    private final NetworkFallbackResolver networkResolver;
    private final String offlineLogsKeyV2;
    private final StatsigOptions options;
    private final String sdkKey;
    private final SharedPreferences sharedPrefs;
    private final Store store;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatsigOfflineRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(StatsigOfflineRequest statsigOfflineRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = statsigOfflineRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigNetworkImpl.this.new AnonymousClass2(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception unused) {
                this.label = 3;
                if (StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(StatsigNetworkImpl.this.sharedPrefs, StatsigNetworkImpl.this.offlineLogsKeyV2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = StatsigNetworkImpl.this.getSavedLogs(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List<StatsigOfflineRequest> mutableList = CollectionsKt.toMutableList((Collection) obj);
            mutableList.add(this.$request);
            List<StatsigOfflineRequest> listFilterValidLogs = StatsigNetworkImpl.this.filterValidLogs(mutableList);
            StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
            SharedPreferences sharedPreferences = StatsigNetworkImpl.this.sharedPrefs;
            String str = StatsigNetworkImpl.this.offlineLogsKeyV2;
            String json = StatsigNetworkImpl.this.gson.toJson(new StatsigPendingRequests(listFilterValidLogs));
            Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(StatsigPendingRequests(limitedLogs))");
            this.label = 2;
            if (statsigUtil.saveStringToSharedPrefs$android_sdk_release(sharedPreferences, str, json, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$apiRetryFailedLogs$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return StatsigNetworkImpl.this.apiRetryFailedLogs(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,\b\bDZc|\u0004W\u0006>éFH\u000f$<\u0012&\u0007\u0015ia0rf\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C~!>q\u001f.:CG{4,$>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12442 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends StatsigOfflineRequest>>, Object> {
        int label;

        C12442(Continuation<? super C12442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigNetworkImpl.this.new C12442(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends StatsigOfflineRequest>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<StatsigOfflineRequest>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<StatsigOfflineRequest>> continuation) {
            return ((C12442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:22:0x005d, B:28:0x0076, B:29:0x007b, B:25:0x006e), top: B:33:0x005d }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:22:0x005d, B:28:0x0076, B:29:0x007b, B:25:0x006e), top: B:33:0x005d }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:22:0x005d, B:28:0x0076, B:29:0x007b, B:25:0x006e), top: B:33:0x005d }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L1b
                if (r0 == r4) goto L38
                if (r0 != r5) goto L55
                kotlin.ResultKt.throwOnFailure(r8)
            L11:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L5d
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            L1b:
                kotlin.ResultKt.throwOnFailure(r8)
                com.statsig.androidsdk.StatsigUtil r3 = com.statsig.androidsdk.StatsigUtil.INSTANCE
                com.statsig.androidsdk.StatsigNetworkImpl r0 = com.statsig.androidsdk.StatsigNetworkImpl.this
                android.content.SharedPreferences r2 = com.statsig.androidsdk.StatsigNetworkImpl.access$getSharedPrefs$p(r0)
                com.statsig.androidsdk.StatsigNetworkImpl r0 = com.statsig.androidsdk.StatsigNetworkImpl.this
                java.lang.String r1 = com.statsig.androidsdk.StatsigNetworkImpl.access$getOfflineLogsKeyV2$p(r0)
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r7.label = r4
                java.lang.Object r8 = r3.getFromSharedPrefs$android_sdk_release(r2, r1, r0)
                if (r8 != r6) goto L3b
                return r6
            L38:
                kotlin.ResultKt.throwOnFailure(r8)
            L3b:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L5d
                com.statsig.androidsdk.StatsigUtil r3 = com.statsig.androidsdk.StatsigUtil.INSTANCE
                com.statsig.androidsdk.StatsigNetworkImpl r0 = com.statsig.androidsdk.StatsigNetworkImpl.this
                android.content.SharedPreferences r2 = com.statsig.androidsdk.StatsigNetworkImpl.access$getSharedPrefs$p(r0)
                r1 = r7
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r7.label = r5
                java.lang.String r0 = "StatsigNetwork.OFFLINE_LOGS"
                java.lang.Object r8 = r3.getFromSharedPrefs$android_sdk_release(r2, r0, r1)
                if (r8 != r6) goto L11
                return r6
            L55:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L5d:
                com.statsig.androidsdk.StatsigNetworkImpl r0 = com.statsig.androidsdk.StatsigNetworkImpl.this     // Catch: java.lang.Exception -> L86
                com.google.gson.Gson r1 = com.statsig.androidsdk.StatsigNetworkImpl.access$getGson$p(r0)     // Catch: java.lang.Exception -> L86
                java.lang.Class<com.statsig.androidsdk.StatsigPendingRequests> r0 = com.statsig.androidsdk.StatsigPendingRequests.class
                java.lang.Object r2 = r1.fromJson(r8, r0)     // Catch: java.lang.Exception -> L86
                com.statsig.androidsdk.StatsigPendingRequests r2 = (com.statsig.androidsdk.StatsigPendingRequests) r2     // Catch: java.lang.Exception -> L86
                if (r2 != 0) goto L6e
                goto L73
            L6e:
                java.util.List r0 = r2.getRequests()     // Catch: java.lang.Exception -> L86
                goto L74
            L73:
                r0 = 0
            L74:
                if (r0 != 0) goto L7b
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Exception -> L86
                goto L85
            L7b:
                com.statsig.androidsdk.StatsigNetworkImpl r1 = com.statsig.androidsdk.StatsigNetworkImpl.this     // Catch: java.lang.Exception -> L86
                java.util.List r0 = r2.getRequests()     // Catch: java.lang.Exception -> L86
                java.util.List r0 = r1.filterValidLogs(r0)     // Catch: java.lang.Exception -> L86
            L85:
                return r0
            L86:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.C12442.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initialize$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12452 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InitializeResponse>, Object> {
        final /* synthetic */ String $api;
        final /* synthetic */ ContextType $contextType;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ Diagnostics $diagnostics;
        final /* synthetic */ String $fullChecksum;
        final /* synthetic */ HashAlgorithm $hashUsed;
        final /* synthetic */ StatsigMetadata $metadata;
        final /* synthetic */ Map<String, String> $previousDerivedFields;
        final /* synthetic */ int $retry;
        final /* synthetic */ Long $sinceTime;
        final /* synthetic */ StatsigUser $user;
        Object L$0;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initialize$2$1, reason: invalid class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $api;
            final /* synthetic */ ContextType $contextType;
            final /* synthetic */ Diagnostics $diagnostics;
            final /* synthetic */ String $fullChecksum;
            final /* synthetic */ HashAlgorithm $hashUsed;
            final /* synthetic */ StatsigMetadata $metadata;
            final /* synthetic */ Map<String, String> $previousDerivedFields;
            final /* synthetic */ Ref.ObjectRef<InitializeResponse> $response;
            final /* synthetic */ int $retry;
            final /* synthetic */ Long $sinceTime;
            final /* synthetic */ StatsigUser $user;
            Object L$0;
            int label;
            final /* synthetic */ StatsigNetworkImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.ObjectRef<InitializeResponse> objectRef, StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, int i2, HashAlgorithm hashAlgorithm, Map<String, String> map, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = objectRef;
                this.this$0 = statsigNetworkImpl;
                this.$api = str;
                this.$user = statsigUser;
                this.$sinceTime = l2;
                this.$metadata = statsigMetadata;
                this.$contextType = contextType;
                this.$diagnostics = diagnostics;
                this.$retry = i2;
                this.$hashUsed = hashAlgorithm;
                this.$previousDerivedFields = map;
                this.$fullChecksum = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$response, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ref.ObjectRef<InitializeResponse> objectRef;
                T t2;
                Object obj2 = obj;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    objectRef = this.$response;
                    int initTimeoutMs = (int) this.this$0.options.getInitTimeoutMs();
                    List<String> initializeFallbackUrls = this.this$0.options.getInitializeFallbackUrls();
                    this.L$0 = objectRef;
                    this.label = 1;
                    Object objInitializeImplWithRetry = this.this$0.initializeImplWithRetry(this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, Boxing.boxInt(initTimeoutMs), this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, initializeFallbackUrls, this);
                    t2 = objInitializeImplWithRetry;
                    if (objInitializeImplWithRetry == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj2);
                    t2 = obj2;
                }
                objectRef.element = t2;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12452(CoroutineScope coroutineScope, StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, int i2, HashAlgorithm hashAlgorithm, Map<String, String> map, String str2, Continuation<? super C12452> continuation) {
            super(2, continuation);
            this.$coroutineScope = coroutineScope;
            this.this$0 = statsigNetworkImpl;
            this.$api = str;
            this.$user = statsigUser;
            this.$sinceTime = l2;
            this.$metadata = statsigMetadata;
            this.$contextType = contextType;
            this.$diagnostics = diagnostics;
            this.$retry = i2;
            this.$hashUsed = hashAlgorithm;
            this.$previousDerivedFields = map;
            this.$fullChecksum = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12452(this.$coroutineScope, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InitializeResponse> continuation) {
            return ((C12452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.statsig.androidsdk.InitializeResponse$FailedInitializeResponse] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                objectRef.element = new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, null, null);
                this.L$0 = objectRef;
                this.label = 1;
                if (BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, this.this$0.dispatcherProvider.getIo(), null, new AnonymousClass1(objectRef, this.this$0, this.$api, this.$user, this.$sinceTime, this.$metadata, this.$contextType, this.$diagnostics, this.$retry, this.$hashUsed, this.$previousDerivedFields, this.$fullChecksum, null), 2, null).join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return objectRef.element;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$initializeImplWithRetry$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12461 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C12461(Continuation<? super C12461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return StatsigNetworkImpl.this.initializeImplWithRetry(null, null, null, null, null, null, null, 0, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u001a\b\u000bvlO/rfv.\u0019ނh"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12471 extends SuspendLambda implements Function2<FlowCollector<? super InitializeResponse.SuccessfulInitializeResponse>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $api;
        final /* synthetic */ List<String> $fallbackUrls;
        final /* synthetic */ StatsigMetadata $metadata;
        final /* synthetic */ long $updateIntervalMs;
        final /* synthetic */ StatsigUser $user;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12471(StatsigUser statsigUser, StatsigNetworkImpl statsigNetworkImpl, StatsigMetadata statsigMetadata, long j2, String str, List<String> list, Continuation<? super C12471> continuation) {
            super(2, continuation);
            this.$user = statsigUser;
            this.this$0 = statsigNetworkImpl;
            this.$metadata = statsigMetadata;
            this.$updateIntervalMs = j2;
            this.$api = str;
            this.$fallbackUrls = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12471 c12471 = new C12471(this.$user, this.this$0, this.$metadata, this.$updateIntervalMs, this.$api, this.$fallbackUrls, continuation);
            c12471.L$0 = obj;
            return c12471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super InitializeResponse.SuccessfulInitializeResponse> flowCollector, Continuation<? super Unit> continuation) {
            return ((C12471) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:7|(2:46|8)|14|15|(1:17)|20|(3:22|(1:25)|24)|48|26|50|27|28|(1:30)(7:31|56|32|54|33|34|(1:36)(12:37|14|15|(0)|20|(0)|48|26|50|27|28|(0)(0)))) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:31|56|32|54|33|34|(1:36)(12:37|14|15|(0)|20|(0)|48|26|50|27|28|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x022a, code lost:
        
            r10 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0201 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0222 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0223  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0223 -> B:14:0x00db). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x022e -> B:14:0x00db). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instruction units count: 560
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.C12471.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLc\u000b\u0004OيH\rDAE!L\u001a}јtiO/lev.zSX\u00102ڟr"}, d2 = {"\n`]<a@F])\rS", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ String $bodyString;
        final /* synthetic */ Function1<Integer, Unit> $callback;
        final /* synthetic */ ContextType $contextType;
        final /* synthetic */ Diagnostics $diagnostics;
        final /* synthetic */ String $eventsCount;
        final /* synthetic */ String $requestCacheKey;
        final /* synthetic */ int $retries;
        final /* synthetic */ Integer $timeout;
        final /* synthetic */ UrlConfig $urlConfig;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ StatsigNetworkImpl this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3$4, reason: invalid class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003İI\u0006F\u000b<Ȑ\u0017\"Z\u0011\u0018\u000flʑG0Zdp.\u0001TR\u000f\u001a}zŤ\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.LongRef $end;
            final /* synthetic */ Ref.ObjectRef<String> $errorMessage;
            final /* synthetic */ long $start;
            final /* synthetic */ Integer $timeout;
            final /* synthetic */ UrlConfig $urlConfig;
            int label;
            final /* synthetic */ StatsigNetworkImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(Ref.LongRef longRef, long j2, Integer num, StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, Ref.ObjectRef<String> objectRef, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$end = longRef;
                this.$start = j2;
                this.$timeout = num;
                this.this$0 = statsigNetworkImpl;
                this.$urlConfig = urlConfig;
                this.$errorMessage = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$end, this.$start, this.$timeout, this.this$0, this.$urlConfig, this.$errorMessage, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j2 = (this.$end.element - this.$start) / ((long) 1000000000);
                    Integer num = this.$timeout;
                    boolean z2 = j2 > ((long) (num == null ? 0 : num.intValue()));
                    this.label = 1;
                    obj = this.this$0.networkResolver.tryFetchUpdatedFallbackInfo(this.this$0.sdkKey, this.$urlConfig, this.$errorMessage.element, z2, this.this$0.connectivityListener.isNetworkAvailable(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.$urlConfig.setFallbackUrl(this.this$0.networkResolver.getActiveFallbackUrlFromMemory(this.$urlConfig));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(UrlConfig urlConfig, StatsigNetworkImpl statsigNetworkImpl, String str, Integer num, String str2, ContextType contextType, Diagnostics diagnostics, int i2, Function1<? super Integer, Unit> function1, String str3, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$urlConfig = urlConfig;
            this.this$0 = statsigNetworkImpl;
            this.$requestCacheKey = str;
            this.$timeout = num;
            this.$eventsCount = str2;
            this.$contextType = contextType;
            this.$diagnostics = diagnostics;
            this.$retries = i2;
            this.$callback = function1;
            this.$bodyString = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$urlConfig, this.this$0, this.$requestCacheKey, this.$timeout, this.$eventsCount, this.$contextType, this.$diagnostics, this.$retries, this.$callback, this.$bodyString, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x040a  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x02c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x0419, Exception -> 0x0420, TRY_LEAVE, TryCatch #17 {Exception -> 0x0420, all -> 0x0419, blocks: (B:12:0x004a, B:15:0x006b, B:17:0x0077), top: B:172:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02e2 A[Catch: all -> 0x03bc, Exception -> 0x03be, TryCatch #16 {Exception -> 0x03be, all -> 0x03bc, blocks: (B:85:0x02c1, B:87:0x02cb, B:88:0x02e2, B:90:0x02e8, B:92:0x02ee, B:93:0x02f6, B:95:0x030c, B:96:0x030e, B:99:0x0335, B:113:0x03b8, B:114:0x03bb, B:97:0x0316), top: B:174:0x02c1 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1142
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x0414  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r42) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1050
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.AnonymousClass3.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12491 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C12491(Continuation<? super C12491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return StatsigNetworkImpl.this.retryApiPostLogs(null, null, null, null, this);
        }
    }

    public StatsigNetworkImpl(Context context, String sdkKey, ErrorBoundary errorBoundary, SharedPreferences sharedPrefs, StatsigOptions options, NetworkFallbackResolver networkResolver, CoroutineScope coroutineScope, Store store) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(errorBoundary, "errorBoundary");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(networkResolver, "networkResolver");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(store, "store");
        this.sdkKey = sdkKey;
        this.errorBoundary = errorBoundary;
        this.sharedPrefs = sharedPrefs;
        this.options = options;
        this.networkResolver = networkResolver;
        this.coroutineScope = coroutineScope;
        this.store = store;
        this.gson = StatsigUtil.INSTANCE.getGson$android_sdk_release();
        this.dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
        this.connectivityListener = new StatsigNetworkConnectivityListener(context);
        this.offlineLogsKeyV2 = Intrinsics.stringPlus("StatsigNetwork.OFFLINE_LOGS:", sdkKey);
        this.initializeRequestsMap = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endDiagnostics(Diagnostics diagnostics, ContextType contextType, KeyType keyType, Integer num, String str, Integer num2, Marker.ErrorMessage errorMessage, Integer num3) {
        if (diagnostics == null || contextType == null) {
            return;
        }
        diagnostics.markEnd(keyType, num != null && new IntRange(200, 299).contains(num.intValue()), StepType.NETWORK_REQUEST, new Marker(null, null, null, null, num, null, null, null, null, str, null, num2, null, null, null, null, errorMessage, Boolean.valueOf(this.connectivityListener.isNetworkAvailable()), num3, null, 587247, null), contextType);
    }

    static /* synthetic */ void endDiagnostics$default(StatsigNetworkImpl statsigNetworkImpl, Diagnostics diagnostics, ContextType contextType, KeyType keyType, Integer num, String str, Integer num2, Marker.ErrorMessage errorMessage, Integer num3, int i2, Object obj) {
        Marker.ErrorMessage errorMessage2 = errorMessage;
        ContextType contextType2 = contextType;
        if ((i2 & 2) != 0) {
            contextType2 = null;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            errorMessage2 = null;
        }
        statsigNetworkImpl.endDiagnostics(diagnostics, contextType2, keyType, num, str, num2, errorMessage2, (-1) - (((-1) - i2) | ((-1) - 128)) == 0 ? num3 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object initializeImpl$android_sdk_release$default(StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, int i2, Integer num, HashAlgorithm hashAlgorithm, Map map, String str2, List list, Continuation continuation, int i3, Object obj) {
        Integer num2 = num;
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            num2 = null;
        }
        return statsigNetworkImpl.initializeImpl$android_sdk_release(str, statsigUser, l2, statsigMetadata, contextType, diagnostics, i2, num2, hashAlgorithm, map, str2, (i3 + 2048) - (i3 | 2048) == 0 ? list : null, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:26:0x0157, B:36:0x0173], limit reached: 45 */
    /* JADX WARN: Path cross not found for [B:28:0x015a, B:30:0x0168], limit reached: 45 */
    /* JADX WARN: Path cross not found for [B:30:0x0168, B:28:0x015a], limit reached: 45 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01ba -> B:12:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeImplWithRetry(java.lang.String r38, com.statsig.androidsdk.StatsigUser r39, java.lang.Long r40, com.statsig.androidsdk.StatsigMetadata r41, com.statsig.androidsdk.ContextType r42, com.statsig.androidsdk.Diagnostics r43, java.lang.Integer r44, int r45, com.statsig.androidsdk.HashAlgorithm r46, java.util.Map<java.lang.String, java.lang.String> r47, java.lang.String r48, java.util.List<java.lang.String> r49, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse> r50) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.initializeImplWithRetry(java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.Long, com.statsig.androidsdk.StatsigMetadata, com.statsig.androidsdk.ContextType, com.statsig.androidsdk.Diagnostics, java.lang.Integer, int, com.statsig.androidsdk.HashAlgorithm, java.util.Map, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object initializeImplWithRetry$default(StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, Integer num, int i2, HashAlgorithm hashAlgorithm, Map map, String str2, List list, Continuation continuation, int i3, Object obj) {
        int i4 = i2;
        Integer num2 = num;
        if ((i3 & 64) != 0) {
            num2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 = 0;
        }
        return statsigNetworkImpl.initializeImplWithRetry(str, statsigUser, l2, statsigMetadata, contextType, diagnostics, num2, i4, hashAlgorithm, map, str2, (-1) - (((-1) - i3) | ((-1) - 2048)) == 0 ? list : null, continuation);
    }

    private final /* synthetic */ Object postRequest(UrlConfig urlConfig, String str, int i2, ContextType contextType, Diagnostics diagnostics, Integer num, String str2, String str3, Function1 function1, Continuation continuation) {
        CoroutineDispatcher io2 = this.dispatcherProvider.getIo();
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(urlConfig, this, str3, num, str2, contextType, diagnostics, i2, function1, str, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(io2, anonymousClass3, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    static /* synthetic */ Object postRequest$default(StatsigNetworkImpl statsigNetworkImpl, UrlConfig urlConfig, String str, int i2, ContextType contextType, Diagnostics diagnostics, Integer num, String str2, String str3, Function1 function1, Continuation continuation, int i3, Object obj) {
        C12482 c12482 = function1;
        String str4 = str2;
        Integer num2 = num;
        Diagnostics diagnostics2 = diagnostics;
        ContextType contextType2 = contextType;
        if ((i3 & 8) != 0) {
            contextType2 = null;
        }
        if ((i3 & 16) != 0) {
            diagnostics2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            num2 = null;
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            str4 = null;
        }
        String str5 = (i3 + 128) - (i3 | 128) == 0 ? str3 : null;
        if ((i3 & 256) != 0) {
            c12482 = new Function1<Integer, Unit>() { // from class: com.statsig.androidsdk.StatsigNetworkImpl.postRequest.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num3) {
                    invoke2(num3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num3) {
                }
            };
        }
        CoroutineDispatcher io2 = statsigNetworkImpl.dispatcherProvider.getIo();
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(urlConfig, statsigNetworkImpl, str5, num2, str4, contextType2, diagnostics2, i2, c12482, str, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(io2, anonymousClass3, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:64:0x0196, B:65:0x0199, B:27:0x00a0, B:30:0x00e5, B:34:0x00ef, B:36:0x00f9, B:45:0x0115, B:48:0x0123, B:52:0x013d, B:54:0x0147, B:58:0x0163, B:60:0x016a, B:51:0x012b, B:39:0x0101, B:44:0x0111, B:47:0x011f, B:33:0x00eb), top: B:78:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:64:0x0196, B:65:0x0199, B:27:0x00a0, B:30:0x00e5, B:34:0x00ef, B:36:0x00f9, B:45:0x0115, B:48:0x0123, B:52:0x013d, B:54:0x0147, B:58:0x0163, B:60:0x016a, B:51:0x012b, B:39:0x0101, B:44:0x0111, B:47:0x011f, B:33:0x00eb), top: B:78:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0161 -> B:24:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object retryApiPostLogs(java.lang.String r26, com.statsig.androidsdk.StatsigOfflineRequest r27, java.lang.String r28, java.util.List<java.lang.String> r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.retryApiPostLogs(java.lang.String, com.statsig.androidsdk.StatsigOfflineRequest, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object addFailedLogRequest(StatsigOfflineRequest statsigOfflineRequest, Continuation<? super Unit> continuation) {
        Object objWithContext;
        return (statsigOfflineRequest.getRetryCount() < 3 && (objWithContext = BuildersKt.withContext(this.dispatcherProvider.getIo(), new AnonymousClass2(statsigOfflineRequest, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object apiPostLogs(String str, String str2, String str3, List<String> list, Continuation<? super Unit> continuation) {
        Object objRetryApiPostLogs = retryApiPostLogs(str, new StatsigOfflineRequest(System.currentTimeMillis(), str2, 0), str3, list, continuation);
        return objRetryApiPostLogs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRetryApiPostLogs : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:14:0x004d). Please report as a decompilation issue!!! */
    @Override // com.statsig.androidsdk.StatsigNetwork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apiRetryFailedLogs(java.lang.String r15, java.util.List<java.lang.String> r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.apiRetryFailedLogs(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<StatsigOfflineRequest> filterValidLogs(List<StatsigOfflineRequest> all) {
        Intrinsics.checkNotNullParameter(all, "all");
        return filterValidLogs(all, System.currentTimeMillis());
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public List<StatsigOfflineRequest> filterValidLogs(List<StatsigOfflineRequest> all, long j2) {
        Intrinsics.checkNotNullParameter(all, "all");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((StatsigOfflineRequest) obj).getTimestamp() > j2 - StatsigNetworkKt.MAX_LOG_PERIOD) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((StatsigOfflineRequest) obj2).getRetryCount() < 3) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.takeLast(CollectionsKt.sortedWith(arrayList2, new Comparator<T>() { // from class: com.statsig.androidsdk.StatsigNetworkImpl$filterValidLogs$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(Long.valueOf(((StatsigOfflineRequest) t2).getTimestamp()), Long.valueOf(((StatsigOfflineRequest) t3).getTimestamp()));
            }
        }), 10);
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object getSavedLogs(Continuation<? super List<StatsigOfflineRequest>> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.getIo(), new C12442(null), continuation);
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object initialize(String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, CoroutineScope coroutineScope, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, String str2, Continuation<? super InitializeResponse> continuation) {
        int initRetryLimit = this.options.getInitRetryLimit();
        this.networkResolver.initializeFallbackInfo();
        return this.options.getInitTimeoutMs() == 0 ? initializeImplWithRetry$default(this, str, statsigUser, l2, statsigMetadata, contextType, diagnostics, null, initRetryLimit, hashAlgorithm, map, str2, this.options.getInitializeFallbackUrls(), continuation, 64, null) : TimeoutKt.withTimeout(this.options.getInitTimeoutMs(), new C12452(coroutineScope, this, str, statsigUser, l2, statsigMetadata, contextType, diagnostics, initRetryLimit, hashAlgorithm, map, str2, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:25:0x0139, B:27:0x013d, B:28:0x014c), top: B:53:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014c A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:25:0x0139, B:27:0x013d, B:28:0x014c), top: B:53:0x0139 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeImpl$android_sdk_release(java.lang.String r26, com.statsig.androidsdk.StatsigUser r27, java.lang.Long r28, com.statsig.androidsdk.StatsigMetadata r29, com.statsig.androidsdk.ContextType r30, com.statsig.androidsdk.Diagnostics r31, int r32, java.lang.Integer r33, com.statsig.androidsdk.HashAlgorithm r34, java.util.Map<java.lang.String, java.lang.String> r35, java.lang.String r36, java.util.List<java.lang.String> r37, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializeResponse> r38) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigNetworkImpl.initializeImpl$android_sdk_release(java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.Long, com.statsig.androidsdk.StatsigMetadata, com.statsig.androidsdk.ContextType, com.statsig.androidsdk.Diagnostics, int, java.lang.Integer, com.statsig.androidsdk.HashAlgorithm, java.util.Map, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Flow<InitializeResponse.SuccessfulInitializeResponse> pollForChanges(String api, StatsigUser user, StatsigMetadata metadata, long j2, List<String> list) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return FlowKt.flow(new C12471(user, this, metadata, j2, api, list, null));
    }

    public final boolean shouldCompressLogEvent$android_sdk_release(UrlConfig config, String url) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(url, "url");
        if (config.getEndpoint() != Endpoint.Rgstr || this.options.getDisableLoggingCompression()) {
            return false;
        }
        if (StringsKt.startsWith$default(url, StatsigOptionsKt.DEFAULT_EVENT_API, false, 2, (Object) null)) {
            return true;
        }
        if (!Intrinsics.areEqual(url, config.getCustomUrl())) {
            List<String> userFallbackUrls = config.getUserFallbackUrls();
            if (!Intrinsics.areEqual((Object) (userFallbackUrls == null ? null : Boolean.valueOf(userFallbackUrls.contains(url))), (Object) true)) {
                return false;
            }
        }
        Map<String, Object> sDKFlags = this.store.getSDKFlags();
        return Intrinsics.areEqual(sDKFlags != null ? sDKFlags.get("enable_log_event_compression") : null, (Object) true);
    }
}
