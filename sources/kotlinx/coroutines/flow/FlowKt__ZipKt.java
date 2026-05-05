package kotlinx.coroutines.flow;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!4i\bDJf|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0R͜P.XU2\u000f\u0002{<$q$yCIU\"}8\tWNmjvJp\u000bK\u000f\f\u0018\u0001jBI]xc\u0014\u00172XoG3SpE9n\u0004>\u000562*8\u007f\n\t\u001a@H\u0018͌\u0003CY&\u001a0FsRĭ\f[Ĩ2\u0018\u0016@0\u0001d\\\u0016MVJrҗH0C\u0005oA\\)\u007f2\u0003M\u001bF|-\u001dxq\u001eqAe4E/a\u0006\u001fXkA\u0013?8?3gWk9M\f\u0018<W\u0010%%:\u0016\u000eǁv0b\u000baf\u0012.;QiQv\u00168\t\u000b\u000bS>Ǭ\u0012\u0010-N>3 m\u0018\u00109z\u0019\\PX\u0012dR\u0002\u000ba|\u0017S\nC/I\u001d|P\u0010FGS}\u0001˿\u0011 )\r|.sٲ\rnٽ3Z\bSAQ\u0007=vM*[CЧ\u0012q\u0003\u00040\u0003>I 1\u0002\u0011<\u0017UAi<;'{\u0004XD.w3_\u0019]w``F2p&7p\u000b:Yt)\u0013oh\u0015^+!^,cM~ݔ\u0017*b}L'+\u0017^Qno\u0011Um\u001b5>-9֍ru\u0014]Id9<ae\u0016gx\u007f$GLh\u0015ZvB\u001a\f\tf8&BJ\u0001\u000f&\u0007rSܟ\u00172M~4ٔ+?(t\u001bX\u0005.B\b|7^zj\u0016зb4D\u0005o#\u0003\u000b!Rbp}g!O<~p\"sB\u007f4I0c%\u0001:\r%\u0017~:\u0002uf|\u001fRk$ymM&\u0015*Aa5M\u0015\u001f~o20>U]\u0003t\u0018Nɟ+\u0005\u0003\u007f\u001fAn5w\npvRhz[_c]$Ցb|)\u000et\u0006\u007fhV|Miz\u0014kFYx\u0013[LNf\u000f3).)\u0011q8{c8q7ޗ\u001aw\u001aB[fԃmq4\u000ep$>܄d\u0012;{\u001c\u007fda]x;fHy\u0001DЭ2m#DNi\u0006\nb\u000b:\rAHqn~YPS\u001b1\u000efM-;o\u0007eH!\b\u0004D0o*:E,\u0013\u000f\u001b+\u0010[W\u007f?sJl\u0013Z\u0015\u001a\r\f15\u0012JN0ggqO1Ӓw\"<GKh\u000bC\u0019&:2b\u0010\u001bTdxL\u0012Ģ\u0004Pe\u0015'8HzKX\u0014Z\u001fefP\u0015fUb1*/\u0011==.|E3\u001blt_]s҅\u0005S#\u001cƨnO\r{=ŃCbڣ3.h\u0003\u001bE$Cw\u0001V\u0006Mӣ{l\u0010\u000e>\u0017\u000b\u001fb\u001a!9_'\u007fx6_\u0019U\u0015Xry*lbP2)E{+\rl\u0014\u001d\u00191U\u0003qr-\u0013P&6s$\u000f.\\/\u0017\u000e\rc\r1[\u0005e[CHx\u0018?$]RK\u007f\u0018 f(\u0014v1\\\u001e\u0010v\fm\u001b\u0001,\u0002\u001er\b\u0019\u0015` J.x~\u0003\u000e>\nLN0>0#Ȩ]k\u00069XӦ*z\u0015ZQxz\u001ac3c\u001dT+\u0005l۲dz\u000f/V\u001c\u0017)m0\u0019XhP1U&Y\u001f\u007fD\u001f4\"N\u000er+ O*i\u001fj\u007fe\u001b9Gq:cA0\u0019 ,\u001e*\u007f\u0012Al.%=fM\u0005z7[\u001d\u0002]\rln@\u001ez\u000b9\u001c\r\u0005X`!\u0013zF!/t1G\u0019e\\\u001dIp\u0007JGY(11\u0019U+?B\u0011\u007f*\u0007\u00111L\u0011~\u0010.R\u000b\t~\u00167[_ÊA\u001a-lޡqd\u0011@cԵ7P݊D\u0017\u001e\u0013?Z~ l[:\u001eAǛAB9\u0013\u0007\u0014F\b\u0010\t\u001f5xgs'0\u0002\u000b\u001c-A\u007f3y:$A\u0001&G\u0015\u007f\u001dgf\u0002&cd|1\u001a\u0010}P\u000fOsVUcZHeO,\u0011mF\u0010\f/$j\u001c$\"0O?dBelBfs\u001e\u001fT)f!R'_\u001b~r\u001a.y\u0018:ekcDAA\u0016)FN*s\u0003\u0017G]h@&T\u0015U\u001aG\u0011\u0016)y\u0017+\u001a_uP-_q{:\u000bvڍ\u0017s\u0012WJݴ5\bVX_:\b=\u0012\u001bc\u0019i\u000eSeݐF\u0013-\u000f\nv?T\u0001\u0002f\u001d&=kxL7j\u0014mCh\rN\u000fTh<E$\u0011\u0016\u0018>H]\u0003,I\u0011\u001f!A_yQI\"VB#K\u0010\f/\u0014<\u007fpWAeq\u001fSg2;wXtMkl\u0007e!\u0012\u007fY\u0014001-UZVY0W\u0016\u0016UjX\u0012Tx\u000b(\u001cA@2`~!Dm\u0003,\u001f\u0004W%g\u000f2)Mkf!+}r~Ze)=z\u0012\u0003>SG\u001d\u001b\"c;H\"\"\u0018_\\ϳ\f\\OhߑqI\u001e\"yŦ =ΦW5QM|V,?GV_\u0001\u0012Ԍ5%&\u0015*au\u0015\n\u0010(_\u0011bVX/IYt1hHl\u001d\u001b\u0015\u000e4\u000fFU6G\u0014\u0014z\"E=o@r/\u001f\bwYx\nBk\u007fh\u0005Y\u0014GYtIH?\t)i_a$n\u0018r\u0007=Ga4\\+\b*\u001f6aBcW/G_q\u000f\u0003ydb!Yz\f^c*+thV\u0018D;Xn)f\u0016~+STbOb\u0001JQ\u0010)\u0003<)FH14\u0011\u0003[a]4GL\u0007)w5J\"(\"\u0002g5KZ\b$i\u0010\u0003C\u001aׁ76\u001b\u0012D͢\u0014\u0013M~x\u0014n\u0015Mv\u0004\u001a.RH`ݰ*.z)sg\u0016,.\u000e\u0003\u0005:\u0005sTWv-\u000e\u0005\u0001) (aw;M$!\u0003IF\u00165e^\u000bph\\k/*\u0005O\u001cP\nMrQu\f3\u001es}3\u000e(7\u0015\u0002}0\u000f{\u0012Jyx\"\u007fsp-u4]y\u0017Y\u0003to\u0001:,7E \u001b7\u0004X4\u0011RP\"1Z<\u0017Xj\u0007>+\bu\u0014?z\u0006\u0010Bm\u0005s\u0015nw6Q=\u001c^\u000fG=/8\n[K}~q]\u001eK&:\u0016g}wk=\u001b6B\u000f\u007f\nA\u0012\u0004`\nTE\u0002\u0018fDmPzu\u000eB\u000eץ2\u001a`y\u061cpv^\u0006(*$ǩ,\u000bNu9#\u0007%\u000e_\b\u0004Aˀ~BMPef\u0011C\u001f(\u0011NL8'Vhp\u0014\u001a\u0012\u000b[f*\u0016\u007fj'?y<{\nwea\".m\u001a'_2}\u0018D!\u0018W?\f\u0004Xn;w`\u0019Ui3U\u0016_\u0010\u00026BImZf/\n\u0012\u001eNvNf\fo\u0012\u001bV=Ɩx́C\u0015\u0010S] +R}\u001fw\u0007Fl\u0002]\u0017R\u0005~$ɮi\u0001=/\u001e\b'\u0012O\u001fF*2.\u0018\u0003k>Ut\u0011FX\u0015\u001c\u001a\nS6\u00133\rl\u000bE\fQ1\u0006x\u001f\u0018[1eaP\t%X''\u001b 8g|\u0015\u007f\u0015n\"q$\u0007#}\u000f \u001eY%OR\u007f\u001e\u000b\"B\u00160W ?8%\u0011h\b\u00041KF/\"\u0014{Qʸ\u0002.p\u00031ádƦSqJ\b\u0017fDp@\u00166TK\u0014)\\r&{,Jܱ\u001cC5)D4\u0012m>\u001b\r\u0005\f\u0016\u000f`r\u001cf3~;hBE+i&T\u007f/0Cc;\u0016NY\u001ck\u0013\u000e\u0017\u001fVE b\r`o{\u00189-\n\u0016Mu2b^w!1sDF2,r\u0014je:\u0017\\T=\u001cL^j-gdaʬ6߿\u001b\u0013F\u0017\u0003-Gذ\u0010\u00016\t7BKo\\e,\r(\u0011o\u007fϹ^wWL\u000f1 \u001648\u0012S1q}0,Om<Y+%\u000f/jR\u001a1\u001cc\u0019|d:A\u0012\u0006j9p}f*ImLy4g\u001as2jy:>DrOp\u0016@v^/gwt\u0015q4D_{A\u0012fY\r\u001d(3-9-X\r\\Ha5\u0003bu`%aɋ\u00131C|\u000eͯRۀ~\u007f\"`\u007fj\u0010\u0012o\u001bNS\u0010\"9LY3B\u0002Rubn+WwBl\rH¥!W\u0007\u001eǸ\u001fVlzL)\u0004ƷNrmF9}Tfdl^\u0010SğdS\u001c5=ap}\u0002v\u0007v!e/\u001e&\u0005\u000fB}g\u0015elHXE.\u0006c\n\u0002Yan'j\u001d1t<R\u001a/\r.*\u001bE92_oD$HN\tF\u0015E\u0010\u000f>&*d>\f\\{\u001ex\u0001ַ\u0007ӌJ9IP\fFnH\nf\u0007Y7P/7D\n\u00126I֘m\u00047,\u007f\r\u0019I+SCc\u0010wE^K?W_\u0018YVlNSMD\u0018Q >>qMO\u0003I->g\u007fkf:B\u0014\u0003n\u0015r16\u001a7\u0013N?.vZ[U,\u001b_`j\u0012tZ\u001aC}~\u0013G\u0016U?YT\u000ff @ŜbJ\u0012$kܭ5Û\u001e)u!>X#$|\u0012a;m0wP\u0011\t\nSsʽ\t}<6\u001c!g\u0014a\u0018!h/9omY5E\u0004TQ~n/;f+\u0004srZ$2I q9).x\\|;\u0002W~dV+&/V\u001b \"s,v\u007f`/I\"rhGu!cu\u001an)\t6\f\n.tƗIfURڻiW"}, d2 = {"1n\\/\\5>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", Global.BLANK, "\"0", "\"1", "4k^D", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "4k^D66FP\u001d\bz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK$e\u000b`\u001b\u007fP0lOl)wQNOr9h\u0015_+&;A.&;y\"rb\u0004", "4k^D%", "1n\\/\\5>B&z\u0004l-\u0007\u00167", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "4k^D66FP\u001d\bzM9x\u0012=f\n5\u0004", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK%e\u000b`\u001b\u007fP0lOl)wQNOr9h\u0015_+&;A.&;y\"rb\u0004", "\"2", "4k^D&", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$7&qp\u0002] yV\u0003z1E#\bB4MqdFS9VC~9h,\u0003\u0002$\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$8&qp\u0002] yV\u0003z1E#\bB4MqdFS9VC~9h,\u0003\u0002$\b", "\"3", "4k^D'", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJ<2Dcl\u0004WPIk*rU`$fL\u0004\u0005\u001b{+pOV8\u0019\u0003W\u001a<W\u000bo1H)\u000463BwdT\u000fPeEr6#U\u0005Ggu?z5\u00044\b==\u007fb\u000fXq(Mb\u0002\u0015:&B.0H\u0006sFUuK", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001386U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJ<2Dcl\u0004WPIk*rU`$fL\u0004\u0005\u001b{+pOV8\u0019\u0003W\u001a<W\u000bo1H)\u000463BwdT\u000fPeEr6#U\u0005Hgu?z5\u00044\b==\u007fb\u000fXq(Mb\u0002\u0015:&B.0H\u0006sFUuK", "\"4", "4k^D(", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJ<2Dcl\u0004WPIk*rU`$fL\u0004\u0005\u001b{+pOV8\u0019\u0003W\u001a\u0006\u001cwqtQ)\n<->{%GLyg\u0006U.)]Q^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u001c99SD\u0018w&e\u0011!,3;&ourL\u0018\u0007k`\\<kqJ\u0018Y\u0010P\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001387U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007quO}1Y\u0016/3fdH$\u001a\u001ci\u0015R4 NWK1xTF#\u0011,WK<o\u000b\u001e_n<t\u0003\u0018=\u0016Q\t\u001cyJ<2Dcl\u0004WPIk*rU`$fL\u0004\u0005\u001b{+pOV8\u0019\u0003W\u001a\u0006\u001cwqtQ)\n<->{%GLyg\u0006U.)]Q^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u001d99SD\u0018w&e\u0011!,3;&ourL\u0018\u0007k`\\<kqJ\u0018Y\u0010P\u001f", "\"", "4k^Df", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uZ;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F`g\u001etT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fU\u0017\u0015?|:#]\u001aYO", "uZ;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|Fag\u001etT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fU\u0017\u0015?|:#]\u001aYO", "1n\\/\\5>C\"\rv_,", "1n\\/\\5>C\"\rv_,;i6o\u0012\u000e\u000b:z\f\u001bRU\u001d", "1n\\/\\5>B&z\u0004l-\u0007\u00167U\t6wA\u0001", "1n\\/\\5>B&z\u0004l-\u0007\u00167U\t6wA\u0001UwNy \"\u0006\u001f/N\u0002+\u001d|", "<t[949KO-_v\\;\u0007\u0016C", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "<t[949KO-_v\\;\u0007\u0016C$`/\u0006Rf&\u0011Ad\u0012G\\4", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001bLj.RX;cV{P]\u0010d\u001bX;\u001c\tbA28E>)\u001au*\tEzV", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001cLj.RX;cV{P]\u0010d\u001bX;\u001c\tbA28E>)\u001au*\tEzV", "Hh_", "=sW2e", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass6<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
        public static final class AnonymousClass1<T> implements Function0<T[]> {
            final /* synthetic */ Flow<T>[] $flows;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr) {
                this.$flows = flowArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T[] invoke() {
                int length = this.$flows.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r1:ߚ\u0010\u0007\u0015iY2J͜V.rW0\u000ey|J#\u0004*\u0002EKU`}P\u000b\u007fXuj\u0007Pj\rS\u000fL\u0017'nrQ"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
        public static final class AnonymousClass2<T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$transform = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, Continuation<? super Unit> continuation) {
                Intrinsics.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, continuation);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = tArr;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector<? super R> flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (function3.invoke(flowCollector, objArr, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Flow<? extends T>[] flowArr, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$flows = flowArr;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$flows, this.$transform, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T>[] flowArr = this.$flows;
                Intrinsics.needClassReification();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows);
                Intrinsics.needClassReification();
                this.label = 1;
                if (CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new AnonymousClass2(this.$transform, null), this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flows;
            Intrinsics.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows);
            Intrinsics.needClassReification();
            InlineMarker.mark(0);
            CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new AnonymousClass2(this.$transform, null), this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass7<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T>[] $flowArray;
        final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1 */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
        public static final class AnonymousClass1<T> implements Function0<T[]> {
            final /* synthetic */ Flow<T>[] $flowArray;

            public AnonymousClass1(Flow<T>[] flowArr) {
                this.$flowArray = flowArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T[] invoke() {
                int length = this.$flowArray.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r1:ߚ\u0010\u0007\u0015iY2J͜V.rW0\u000ey|J#\u0004*\u0002EKU`}P\u000b\u007fXuj\u0007Pj\rS\u000fL\u0017'nrQ"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
        public static final class AnonymousClass2<T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$transform = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, Continuation<? super Unit> continuation) {
                Intrinsics.needClassReification();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, continuation);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = tArr;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector<? super R> flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (function3.invoke(flowCollector, objArr, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Flow<T>[] flowArr, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$flowArray = flowArr;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$flowArray, this.$transform, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T>[] flowArr = this.$flowArray;
                Intrinsics.needClassReification();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
                Intrinsics.needClassReification();
                this.label = 1;
                if (CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new AnonymousClass2(this.$transform, null), this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flowArray;
            Intrinsics.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
            Intrinsics.needClassReification();
            InlineMarker.mark(0);
            CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new AnonymousClass2(this.$transform, null), this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        Flow[] flowArr = (Flow[]) CollectionsKt.toList(iterable).toArray(new Flow[0]);
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(flowArr, function2);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt.flowCombine(flow, flow2, function3);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r14ߚ\u0006ј~jg/dgN\u008c`SJ\u0013qzB%q#\u001aIKW*}h\t}P\u0018q|Mr\u0011S\u0011\u0016\u0016?kZM\u001c\u0001ٛ\u0016\u0014"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", "", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/Sr$BS%lKMCh8'\u0015XjG\u0003d,\rBe\u0013"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function4 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function4 function4) {
                    super(3, continuation);
                    this.$transform$inlined = function4;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function4 function4 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function4.invoke(obj2, obj3, obj4, this);
                        InlineMarker.mark(7);
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
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, function4), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r14ߚ\u0006ј~jg/dgN\u008c`SJ\u0013qzB%q#\u001aIKW*}h\t}P\u0018q|Mr\u0011S\u0011\u0016\u0016?kZM\u001c\u0001ٛ\u0016\u0014"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", "", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/Sr$BS%lKMCh8'\u0015XjG\u0003d,\rBe\u0013"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function5 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.$transform$inlined = function5;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function5 function5 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                        InlineMarker.mark(7);
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
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, function5), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r14ߚ\u0006ј~jg/dgN\u008c`SJ\u0013qzB%q#\u001aIKW*}h\t}P\u0018q|Mr\u0011S\u0011\u0016\u0016?kZM\u001c\u0001ٛ\u0016\u0014"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "7s", "", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/Sr$BS%lKMCh8'\u0015XjG\u0003d,\rBe\u0013"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function6 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function6 function6) {
                    super(3, continuation);
                    this.$transform$inlined = function6;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Function6 function6 = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        InlineMarker.mark(6);
                        obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                        InlineMarker.mark(7);
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
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, function6), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(flowArr, function2);
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        Flow[] flowArr = (Flow[]) CollectionsKt.toList(iterable).toArray(new Flow[0]);
        Intrinsics.needClassReification();
        return FlowKt.flow(new AnonymousClass7(flowArr, function3, null));
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, function4));
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function5<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, function5));
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function6<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, function6));
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Function7<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, function7));
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        Intrinsics.needClassReification();
        return FlowKt.flow(new AnonymousClass6(flowArr, function3, null));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        Intrinsics.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransformUnsafe$1(flowArr, function3, null));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(flowArr, function2);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, new Flow[]{flow, flow2}, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new FlowKt__ZipKt$combine$1$1(function3, null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, function4));
    }

    public static final <T> Function0<T[]> nullArrayFactory$FlowKt__ZipKt() {
        return new Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return CombineKt.zipImpl(flow, flow2, function3);
    }
}
