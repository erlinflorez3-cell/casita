package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8DsQ6ɟ[*%k\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRZ!C\u0017\u0006,xr,OX\u0001](\u000f:ԏw?IMw=?b|6\u0013/:Ĳ@y\u001b\u0001\"*N\u0010~zQŷ\u0014\u00126@x:h\rU\u00050\u0012\u000e>6\u0001&\\mN>Hz{B/)\u0004qB\\-gܞ\u0005M#F\\'\u0013yy\t9¨O5C$\u0004\t\rRi?\u001b? >5n-'9K\fWd[0\u001a\u001b+]\u0011urTa5Wf\f51gcyW>.}z\n\u0015T\u0004<\u000fWN4-(p \u000ea\u007f#YFP\u0010jZ\u007f)nf,3\u000eK<I\u001dvQ\u0010K)PG{3\fL2ъr!aeTeڠ\u001fT\u0006cIFN׀`N8Xms\npp\u0002B\u0004^H05\u0002\u0011<\u0019=7\n<S'q\u0002VH\u007fv3e\u0019YoRVF:nD>Z\u000f\u0012ZRl\u001dk~]\t2\u0017M*^\u001f}6\u001ePb}</1(N}u\u001apS]\u00188Gfe`\u001f\u0001\u001ceQoC7ac>qbx$?ja3gڋFS\u0012k#-ϒ6Hx$\u0010fRc$\u0013`>\"\":,?\u0019t\u0015v\u0004NHG|\u0017arh>\u0002\u00059*\u0003w(\r\t/U\rvug\u0007OD|\u000f)]GW5'<m\"\u0017K-)\r~\u0002\u0018_gz`|r\u001cuc\b8\u0016HF\u0002DK!'\u001094\u0012-s\\\u0003gaM@&)\fɍ\u0013;n?.\rϡt,n\u0005bDb,:v\rqS\u000ej\u007f\ba^zud\u0005\u0011a>Wt\u001bYjQh\u0003\u000b\u001f,)\u0019oP\u0002e3I'+\u001c\u0010\u0014]\u001c\u0012coo<\u0010z\u000fT\f\u0016\n2c$\bzQ\fKk>OY\rJ:$\u001b\u0010rNpw\u0016U!4;:xVr~nI]\r?}\u0015\u0017<\u000f\u0001V\n9A~ϻ8.e;:H\u0382\u0018^Q@)ߧRu\n\u0006K\u000b\nj\u0011\u0010Κ\nN\u0017\u0012JMP`e~!6\u0016u(6\bX\u0011#l,*<:[ (Sey\u0015V\u0018ķJi\u00157BHy\\f\u0010Z~\u0003xX\u0007pE\u000fD@\u007f-\u001ecA~=?)\u0006cd@sAGp\u009b\r%po\u000fl+LTV?!Nz\u0011\u000fU_YH0Y2VY\u001fqq\u001a]0(-D(\u001bgx!p\u0007?%(ڀhXj\u0017\"lXo2+\u0005\u0001#0L\f\u001f\u000bGN!\u0016ܑ1LT ̢G\u001a\u0007(\u000b͏\rѼ\u0001cTDEݥ4;YajB&\u001cYYȌ\f%H U\u0014%+js&l\u001a_+:\\\u000fD\u00012,\u0019X.#Fg\u0005\u0004\u001a=NSс\u0006=\b3n_q\u00191B-1\u0013(RMxx8\u0007\u0003b\u001dd;4l3d\u001f\u0007X`\u001f\u0019'{U#ijIWpޓ\\\u001b\u00064%,%W\u0018d/\u0016u\u0006xr{O\n\fYU֗.a7Xݟ\"}%\u000b<ê0ķ,\u0015I\u0001ęc\u0017x\u0005B\u0006\r~l.˯\u0003)Q\u0014+\u000fxh\u001f/LL\u0003 t/}6M\u0007=jf\u000f\u0012daC1BbNaTכ\u000fy.\u0017!\t@\u0004\u0005\u00020H/\u0015\u0010i<-twS\u0019UhT\u0011j\u000b4o]UR\u0019< T.˲^B&^l \"\\a5G\u001f7#%<\u0016q\u001d\u0018c\u000e\u007fbU[\u0007~\u000f2W%AmJse\u001a3@\u001f~atǃ?/;\u0006\\-\u0012#uL\u0005S\nx\u001fc<IcDL ߝD\u007f\u0010G\u009d(\u0006{4Fӡ7؝._jln؞V\u0012BB6\u001dCCIrԭ\u0002'TiF\u0004\u0015eoPY\u0001$\u001bT>pJ\u001b2upn\u0002\u0019c%b$H\u001f\u0015oPٽ\u0001\u001aU\u0012P1O\u0014]1bcb5\u0004\u0006J2\u0010Y\u0010FnhZ73\u0014b\t\u0003\u0016}So\u0010f9\u001d\u001e\u0014\u0007woϵ\u0004j#87Q|gF^~Sg\u0005\u001bB\u001f$\r-p2ƨ\n\u00164pǩ\u0006}Pq[ͽ9˝wAU?nģ +?s%4$\blMʤc\u000f\u0001=gC;wXtMkl\u0007e!\u0012\u0002Y30#16UuVL:i\u0016\u001ds\u0014э\u0014N~d8s6Q@R\u0005`i\u000e\u0011-/L\u001c2\u05ca\u0003<hWkj\u0017LGYtX{E=z\u0012\u0003>d/\u00129D\u0004q8'\u00021Ip\f\u0019lX\u0004,̚M\u001a\t\u0002Z'5'O1GQ\u0013\u0007uP)f\u0006\u001cǮ$1*&#*h\t#k\u0014(\u0006%\\:f+^J\b4\u0015h\u001bU\u0001v\u001aS$xe\bM\u0006?\n,FKnn[ɋt\u0013Moz\u00020\u0007\u007fhz_su;\u0007)Mw\u000fÔgYe4~WbyN\u0019],f5\u0012\u001c-&\u0010zvZ݉\u001bUi\u0016حwTf\" یqơhy\u0001\u0019|ٗbLj`lGeo\u007f!ЪR\u007f1`\u001fXq\u001ap\tD-FJz\u0019G\u001ey\u007fGL=L\u0005B\u007feJ3q1\u0002\rծKT\f.zg}6\f_9<3 <\u000e%\u0014\u0005\u0004̴\bv\u000bm@\nqPBH`FBOj)}h6M$\u000b++\\5YT_\u001b73t\u00013\u001eHhgJW0A2ƨ@\u00128mh\u0001tyl'4\u0002,O\"S\fD3^ѡ\u007f=]\u0012_:c?9\u007fo}F/{\u0014\u0014cx\"}\u001bϔ\u0015]4uȢ\u000bYBj\bӐ\u0010߉-$\u0016H?ކGBxJ\"Q\u007f/8\u001eɗt\f!%7u<9\u0003\u0012&8}@\u0004f$\u0005blm\u000ec\u0007SLG$\u0018\\Y|-ZÚ\u0012S\u001cZ_Rs\u0017k?Z\u001cX7\u007f\u0015A\u001f:}ݖF!}(r:q[\fI\t\u001a\u0011m>\u001cjf\u001d\u0010\rO\u00106mN\u0013\u0018\u0013b\f[3Q5n\u000f\u0017ճ?\u0013v=GWK\u0006\u001bF\u0017.\u0007bN#\u001fW\u001f\u0004Ý\u001f\f\u000bkt \u001cZUzFQ;}\u0014ksS8fv\u000fVU:>\u001c8+%My\u001du`^c\u000fn\u001ae2<VӮS\u0012wPBMc{01a\u000e4zv]`\u001c\b$ؼ2\u0001|\u0013'E\u001b#:G(#i\b)i\u00156\u001b:\f\u001aǒhz$\u0017ǽ_'6\u000fLÑ\u0019Ֆ#\u0016\u001cX ـsibgu/?h\u0015\u0012ːQK0\u00143u|\u000fC&Y7OU\u0001\u0019q\u0015\u000e\nr=\u0013-/G#J8r|\"\u001eDܹ&M\u0019\u0017+s\u000f1,K+\u000fS\u0002\u0007\f*AV=ڹ\u0014I\u00103rd}!1K66\u001a+]N}}\\\u000e\u0006i&\u0005@\u0016w>k$\u0010vU* &\u0001b$slSU\u000bЛH!\u0014>/0*S\u001cp6!\u0003\u0019\u000e\u0001\u0007a)/ī8x;xP;1D\u0011(\u0007\u0007/Em-$>\bTt\u0016ޒjvVkؾbtDzCϔ7ې\b\u0006Y\u001b۟ o"}, d2 = {"\u001a`iF66Ec!\b", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$tJ@!k]O3\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHG`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000b0>@t\u0014\u0015C%KZ\u0002\u0017,dA05t-\u0013LZgshEcO\u001bj\u0007\u001bl90,/cmP\u001a\u0011k\u0017%Ee)\\>V\bGQo\u001e6\u0005aLh}*\u0013\u00103il\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007Z\u0019x3^3\\\u0017\u0013q\u0002\u000e{gR%}H\u001e7,y_`q\u00016{\rZ%=X\u0012]XM~\u0017\u001a=J\u0010\u0010%=jR\u00034\")/Fg\u0002Cp8\tvW,\"3\u000e\u0003\u001b60\u000f\\DmqA%\u001f\u0006\u0019r\u000b\u0015'KH\u000bBEQjk\u001amS\u0010FhR\u001d\u00021xrQ", "CrT?F*K] \u0006Zg(y\u0010/d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$tJ@!k]O3\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHG`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000b0>@t\u0014\u0015C%KZ\u0002\u0017,dA05t-\u0013LZgshEcO\u001bj\u0007\u001bl90,/cmP\u001a\u0011k\u0017%Ee)\\>V\bGQo\u001e6\u0005aLh}*\u0013\u00103il\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007Z\u0019x3^3\\\u0017\u0013q\u0002\u000e{gR%}H\u001e7,y_`q\u00016{\rZ%=X\u0012k9Iy\u001f\u001d8\nT\u0004.{3C\n?\u00114)GbF,A?\u0014eb&#p\u0004q\u0006):\u0001_Jr]\u000bp\u0013\b\u0016s\u0007#]\bE\u0012<PMr\"\u0006AU\rGd`\u00109#x\u0013$e", "\u001a`iFE6P", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$tJ@!k]O3\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHG`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000b0>@t\u0014\u0015C%KZ\u0002\u0017,dA05t\u001f\u001dLOx\u007fuM\notH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+o\u0005\u0001.\rBKx\u001d'O\u000e\u0001Ly\"\u0018\u000b\"il\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007Z\u0019x3^3\\\u0017\u0013q\u0002\u000e{gR%}H\u001e7,y_`q\u00016{\rZ%=X\u0012]XM~\u0017\u001a=J\u0010\u0010%=jR\u00034\")/Fg\u0002Cp8\tvW,\"3\u000e\u0003\u001b60\u000f\\DmqA%\u001f\u0006\u0019r\u000b\u0015'KH\u000bBEQjk\u001amS\u0010FhR\u001d\u00021xrQ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$tJ@!k]O3\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHG`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000b0>@t\u0014\u0015C%KZ\u0002\u0017,dA05t\u001f\u001dLOx\u007fuM\notH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+o\u0005\u0001.\rBKx\u001d'O\u000e\u0001Ly\"\u0018\u000b\"il\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007Z\u0019x3^3\\\u0017\u0013q\u0002\u000e{gR%}H\u001e7,y_`q\u00016{\rZ%=X\u0012k9Iy\u001f\u001d8\nT\u0004.{3C\n?\u00114)GbF,A?\u0014eb&#p\u0004q\u0006):\u0001_Jr]\u000bp\u0013\b\u0016s\u0007#]\bE\u0012<PMr\"\u0006AU\rGd`\u00109#x\u0013$e", "7sT:f", "\"", "", "9dh", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7sT:", "", "1n]AX5MB-\nz", "7sT:66Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\Y\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[E=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0005:H<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\Y\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[H=+8", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\J1J\b#\u0011\\]0c\u001cYA\"!0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\\\H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6R\nm'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\J1J\b#\u0011\\]0c\u001cYA\"!0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\_H\u0016j", "7sT:f\u0010GR\u0019\u0012z]", "", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\Y\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJu>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[F=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0006:H<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\Y\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJu>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[I=+8", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\J1J\b#\u0011\\]0c\u001cYA\"!0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6S\nm'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f\u0013rl9\\J1J\b#\u0011\\]0c\u001cYA\"!0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\`H\u0016j", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<LazyListScope, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
        final /* synthetic */ boolean $reverseLayout;
        final /* synthetic */ LazyListState $state;
        final /* synthetic */ boolean $userScrollEnabled;
        final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, Function1<? super LazyListScope, Unit> function1, int i2, int i3) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z2;
            vertical = vertical;
            horizontal = horizontal;
            flingBehavior = flingBehavior;
            z = z3;
            function1 = function1;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            LazyListState lazyListState = lazyListState;
            PaddingValues paddingValues = paddingValues;
            boolean z2 = z;
            Arrangement.Vertical vertical = vertical;
            Alignment.Horizontal horizontal = horizontal;
            FlingBehavior flingBehavior = flingBehavior;
            boolean z3 = z;
            Function1<LazyListScope, Unit> function1 = function1;
            int i3 = i;
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z2, vertical, horizontal, flingBehavior, z3, function1, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<LazyListScope, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
        final /* synthetic */ boolean $reverseLayout;
        final /* synthetic */ LazyListState $state;
        final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i2, int i3) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z2;
            vertical = vertical;
            horizontal = horizontal;
            flingBehavior = flingBehavior;
            function1 = function1;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            LazyListState lazyListState = lazyListState;
            PaddingValues paddingValues = paddingValues;
            boolean z2 = z;
            Arrangement.Vertical vertical = vertical;
            Alignment.Horizontal horizontal = horizontal;
            FlingBehavior flingBehavior = flingBehavior;
            Function1<LazyListScope, Unit> function1 = function1;
            int i3 = i;
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z2, vertical, horizontal, flingBehavior, function1, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04901 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<LazyListScope, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ boolean $reverseLayout;
        final /* synthetic */ LazyListState $state;
        final /* synthetic */ boolean $userScrollEnabled;
        final /* synthetic */ Alignment.Vertical $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04901(LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, Function1<? super LazyListScope, Unit> function1, int i2, int i3) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z2;
            horizontal = horizontal;
            vertical = vertical;
            flingBehavior = flingBehavior;
            z = z3;
            function1 = function1;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04912 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<LazyListScope, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ boolean $reverseLayout;
        final /* synthetic */ LazyListState $state;
        final /* synthetic */ Alignment.Vertical $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04912(LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i2, int i3) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z2;
            horizontal = horizontal;
            vertical = vertical;
            flingBehavior = flingBehavior;
            function1 = function1;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,h\bDJe\u0003İY\bF\n\\A\u001f$2ߚ\u0006\u0007\u0017nG1\\e\u000f.\u0019[֖\u0013m\u000262^"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~J\b$6C"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04921 extends Lambda implements Function1 {
        public static final C04921 INSTANCE = new C04921();

        public C04921() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T t2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,h\bDJe\u0003İY\bF\n\\A\u001f$2ߚ\u0006\u0007\u0017nG1\\e\u000f.\u0019[֖\u0013m\u000262^"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~J\b$6C"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass5 extends Lambda implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T t2) {
            return null;
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function12, Function4 function4, int i2, Object obj) {
        if ((2 & i2) != 0) {
            function1 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function12 = C04921.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new C04932(function1, list) : null, new AnonymousClass3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04932 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04932(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$key.invoke((T) this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$contentType.invoke((T) this.$items.get(i2));
        }
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new C04932(function1, list) : null, new AnonymousClass3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca'Jk<\f\u0013rl9\\G\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ&"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
            if ((i3 + 6) - (6 | i3) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 + 48) - (i3 | 48) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            this.$itemContent.invoke(lazyItemScope, (T) this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,h\bDJc|\u0004O\f8\u000b4C\rӬD\u0014\u000e\u0006\u0015iY2J͜V.\u0003W8\u0010\u0004{b&\f(\u007fFSU`}h\u0011ҊRimrX_"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#n*;lk"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04941 extends Lambda implements Function2 {
        public static final C04941 INSTANCE = ;

        public final Void invoke(int i2, T t2) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function2 function22, Function5 function5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = null;
        }
        if ((i2 & 4) != 0) {
            function22 = C04941.INSTANCE;
        }
        lazyListScope.items(list.size(), function2 != null ? new C04952(function2, list) : null, new C04963(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C04974(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04952 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04952(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), (T) this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04963 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04963(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), (T) this.$items.get(i2));
        }
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new C04952(function2, list) : null, new C04963(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C04974(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca'Jk<\f\u0013rl9\\G\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ&"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04974 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04974(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C188@8866L26:LazyDsl.kt#428nma");
            if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                i4 = (-1) - (((-1) - (composer.changed(lazyItemScope) ? 4 : 2)) & ((-1) - i3));
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 = (-1) - (((-1) - i4) & ((-1) - (composer.changed(i2) ? 32 : 16)));
            }
            if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), (T) this.$items.get(i2), composer, Integer.valueOf((i4 + 126) - (i4 | 126)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function12, Function4 function4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function12 = AnonymousClass5.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new AnonymousClass6(function1, objArr) : null, new AnonymousClass7(function12, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass6 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i2) {
            return this.$key.invoke(this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items[i2]);
        }
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new AnonymousClass6(function1, tArr) : null, new AnonymousClass7(function12, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca'Jk<\f\u0013rl9\\G\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ&"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C224@10590L22:LazyDsl.kt#428nma");
            if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                int i5 = composer.changed(i2) ? 32 : 16;
                i4 = (i4 + i5) - (i4 & i5);
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:224)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i2], composer, Integer.valueOf((i4 + 14) - (i4 | 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,h\bDJc|\u0004O\f8\u000b4C\rӬD\u0014\u000e\u0006\u0015iY2J͜V.\u0003W8\u0010\u0004{b&\f(\u007fFSU`}h\u0011ҊRimrX_"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#n*;lk"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04985 extends Lambda implements Function2 {
        public static final C04985 INSTANCE = ;

        public final Void invoke(int i2, T t2) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function2 function22, Function5 function5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function22 = C04985.INSTANCE;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C04996(function2, objArr) : null, new C05007(function22, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05018(function5, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0tiV/jSX\u00112\u0004Č([*t"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C04996 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04996(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,˛\bDJc|\u0004O\f8é<Ȑ\u0017$B\u0011&\u0006\u0007l?ӄRex2`TB\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7mS2k", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05007 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05007(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new C04996(function2, tArr) : null, new C05007(function22, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05018(function5, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8 */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u0006ј~jg/dgN\u008c`SR\u000f\u001a|d(i&\nCiX`\u0007̀\rQTkus"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca'Jk<\f\u0013rl9\\G\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ&"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C05018 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05018(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            ComposerKt.sourceInformation(composer, "C260@12387L26:LazyDsl.kt#428nma");
            if ((i3 + 6) - (6 | i3) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 + 147) - (147 | i4) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:260)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((-1) - (((-1) - i4) | ((-1) - 126))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, Function1<? super LazyListScope, Unit> function1, Composer composer, int i2, int i3) {
        int i4;
        boolean z4;
        boolean z5 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        Arrangement.Horizontal start = horizontal;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyListState lazyListStateRememberLazyListState = lazyListState;
        Alignment.Vertical top = vertical;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyRow)P(4,6,1,5,3,8,2,7)301@14811L23,307@15162L15,311@15264L389:LazyDsl.kt#428nma");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 2)) == 0 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) ? 32 : 16;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128)));
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(start)) ? 16384 : 8192)));
        }
        int i9 = (i3 + 32) - (i3 | 32);
        if (i9 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(top) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288)));
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i11 = composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i3 & 256) != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if (i6 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                z4 = i7 == 0 ? z2 : false;
                if ((i3 + 16) - (i3 | 16) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    start = !z4 ? arrangement.getStart() : arrangement.getEnd();
                    i4 &= -57345;
                }
                if (i9 != 0) {
                    top = Alignment.Companion.getTop();
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
                if (i10 != 0) {
                    z5 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 2) - (i3 | 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                z4 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i4, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
            }
            int i12 = (-1) - (((-1) - ((i4 + 14) - (14 | i4))) & ((-1) - 24576));
            int i13 = (-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (i4 + 896) - (896 | i4);
            int i16 = (i14 + i15) - (i14 & i15);
            int i17 = 7168 & i4;
            int i18 = (i16 + i17) - (i16 & i17);
            int i19 = i4 >> 3;
            int i20 = i18 | (458752 & i19) | ((-1) - (((-1) - i19) | ((-1) - 3670016)));
            int i21 = i4 >> 15;
            int i22 = i4 >> 9;
            int i23 = ((i21 + 14) - (i21 | 14)) | ((i22 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i22 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i24 = (-1) - (((-1) - (i4 >> 18)) | ((-1) - 896));
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM1011PaddingValues0680j_4, z4, false, flingBehavior2, z5, 0, null, null, top, start, function1, composerStartRestartGroup, i20, (i23 + i24) - (i23 & i24), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function1<LazyListScope, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ FlingBehavior $flingBehavior;
                final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                final /* synthetic */ boolean $reverseLayout;
                final /* synthetic */ LazyListState $state;
                final /* synthetic */ boolean $userScrollEnabled;
                final /* synthetic */ Alignment.Vertical $verticalAlignment;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C04901(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM1011PaddingValues0680j_42, boolean z42, Arrangement.Horizontal start2, Alignment.Vertical top2, FlingBehavior flingBehavior22, boolean z52, Function1<? super LazyListScope, Unit> function12, int i25, int i32) {
                    super(2);
                    lazyListState = lazyListStateRememberLazyListState2;
                    paddingValues = paddingValuesM1011PaddingValues0680j_42;
                    z = z42;
                    horizontal = start2;
                    vertical = top2;
                    flingBehavior = flingBehavior22;
                    z = z52;
                    function1 = function12;
                    i = i25;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i25) {
                    LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z, function1, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, Function1<? super LazyListScope, Unit> function1, Composer composer, int i2, int i3) {
        int i4;
        boolean z4;
        boolean z5 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        Arrangement.Vertical top = vertical;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyListState lazyListStateRememberLazyListState = lazyListState;
        Alignment.Horizontal start = horizontal;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyColumn)P(4,6,1,5,8,3,2,7)357@17743L23,363@18097L15,367@18199L388:LazyDsl.kt#428nma");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128;
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z2) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i8 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(top)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (i3 + 32) - (i3 | 32);
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(start) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288)));
        }
        int i10 = i3 & 128;
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i11 = composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if (i6 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                z4 = i7 == 0 ? z2 : false;
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    top = !z4 ? arrangement.getTop() : arrangement.getBottom();
                    i4 &= -57345;
                }
                if (i9 != 0) {
                    start = Alignment.Companion.getStart();
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if (i10 != 0) {
                    z5 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 &= -113;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                z4 = z2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i4, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
            }
            int i13 = ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 24576))) | ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4));
            int i14 = (-1) - (((-1) - i4) | ((-1) - 896));
            int i15 = (i13 + i14) - (i13 & i14);
            int i16 = (-1) - (((-1) - i4) | ((-1) - 7168));
            int i17 = (i15 + i16) - (i15 & i16);
            int i18 = i4 >> 3;
            int i19 = (458752 + i18) - (458752 | i18);
            int i20 = (i17 + i19) - (i17 & i19);
            int i21 = (i18 + 3670016) - (i18 | 3670016);
            int i22 = i4 >> 18;
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM1011PaddingValues0680j_4, z4, true, flingBehavior2, z5, 0, start, top, null, null, function1, composerStartRestartGroup, ((-1) - (((-1) - ((i20 + i21) - (i20 & i21))) & ((-1) - ((-1) - (((-1) - (i4 << 9)) | ((-1) - 234881024)))))) | ((i4 << 15) & 1879048192), (i22 + 896) - (i22 | 896), 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function1<LazyListScope, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ FlingBehavior $flingBehavior;
                final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                final /* synthetic */ boolean $reverseLayout;
                final /* synthetic */ LazyListState $state;
                final /* synthetic */ boolean $userScrollEnabled;
                final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM1011PaddingValues0680j_42, boolean z42, Arrangement.Vertical top2, Alignment.Horizontal start2, FlingBehavior flingBehavior22, boolean z52, Function1<? super LazyListScope, Unit> function12, int i23, int i32) {
                    super(2);
                    lazyListState = lazyListStateRememberLazyListState2;
                    paddingValues = paddingValuesM1011PaddingValues0680j_42;
                    z = z42;
                    vertical = top2;
                    horizontal = start2;
                    flingBehavior = flingBehavior22;
                    z = z52;
                    function1 = function12;
                    i = i23;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i23) {
                    Modifier modifier2 = modifier;
                    LazyListState lazyListState2 = lazyListState;
                    PaddingValues paddingValues2 = paddingValues;
                    boolean z22 = z;
                    Arrangement.Vertical vertical2 = vertical;
                    Alignment.Horizontal horizontal2 = horizontal;
                    FlingBehavior flingBehavior3 = flingBehavior;
                    boolean z32 = z;
                    Function1<LazyListScope, Unit> function12 = function1;
                    int i32 = i;
                    LazyDslKt.LazyColumn(modifier2, lazyListState2, paddingValues2, z22, vertical2, horizontal2, flingBehavior3, z32, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017fV6:T\u001a<`aO\n;\nlKa\rK\u0001v]u(")
    @InterfaceC1492Gx
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1 function1, Composer composer, int i2, int i3) {
        int i4;
        Alignment.Horizontal start = horizontal;
        Arrangement.Vertical top = vertical;
        boolean z3 = z2;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyListState lazyListStateRememberLazyListState = lazyListState;
        FlingBehavior flingBehavior2 = flingBehavior;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-563353797);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyColumn)P(4,6,1,5,7,3,2)385@18761L23,391@19115L15,394@19178L350:LazyDsl.kt#428nma");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) ? 32 : 16)));
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128)));
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 & 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(top)) ? 16384 : 8192;
        }
        int i9 = (i3 + 32) - (i3 | 32);
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(start) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i10 = ((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 & 12582912) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if (i6 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 & 16) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    top = !z3 ? arrangement.getTop() : arrangement.getBottom();
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if (i9 != 0) {
                    start = Alignment.Companion.getStart();
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i4, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
            }
            int i12 = ((-1) - (((-1) - ((i4 & 14) | 12582912)) & ((-1) - (112 & i4)))) | ((-1) - (((-1) - i4) | ((-1) - 896))) | ((-1) - (((-1) - i4) | ((-1) - 7168)));
            int i13 = (-1) - (((-1) - 57344) | ((-1) - i4));
            int i14 = i4 << 3;
            LazyColumn(companion, lazyListStateRememberLazyListState, paddingValuesM1011PaddingValues0680j_4, z3, top, start, flingBehavior2, true, function1, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (((i12 + i13) - (i12 & i13)) | (458752 & i4))) & ((-1) - ((3670016 + i4) - (3670016 | i4)))))) & ((-1) - ((i14 + 234881024) - (i14 | 234881024)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function1<LazyListScope, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ FlingBehavior $flingBehavior;
                final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                final /* synthetic */ boolean $reverseLayout;
                final /* synthetic */ LazyListState $state;
                final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM1011PaddingValues0680j_42, boolean z32, Arrangement.Vertical top2, Alignment.Horizontal start2, FlingBehavior flingBehavior22, Function1<? super LazyListScope, Unit> function12, int i22, int i32) {
                    super(2);
                    lazyListState = lazyListStateRememberLazyListState2;
                    paddingValues = paddingValuesM1011PaddingValues0680j_42;
                    z = z32;
                    vertical = top2;
                    horizontal = start2;
                    flingBehavior = flingBehavior22;
                    function1 = function12;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Modifier modifier2 = modifier;
                    LazyListState lazyListState2 = lazyListState;
                    PaddingValues paddingValues2 = paddingValues;
                    boolean z22 = z;
                    Arrangement.Vertical vertical2 = vertical;
                    Alignment.Horizontal horizontal2 = horizontal;
                    FlingBehavior flingBehavior3 = flingBehavior;
                    Function1<LazyListScope, Unit> function12 = function1;
                    int i32 = i;
                    LazyDslKt.LazyColumn(modifier2, lazyListState2, paddingValues2, z22, vertical2, horizontal2, flingBehavior3, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017fV6:T\u001a<`aO\n;\nlKa\rK\u0001v]u(")
    @InterfaceC1492Gx
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1 function1, Composer composer, int i2, int i3) {
        int i4;
        FlingBehavior flingBehavior2 = flingBehavior;
        Alignment.Vertical top = vertical;
        Arrangement.Horizontal start = horizontal;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        LazyListState lazyListStateRememberLazyListState = lazyListState;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(407929823);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyRow)P(4,6,1,5,3,7,2)411@19699L23,417@20050L15,420@20113L347:LazyDsl.kt#428nma");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) ? 32 : 16)));
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128;
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(start)) ? 16384 : 8192;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i9 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(top) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i4 &= -113;
                }
                if (i6 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    Arrangement arrangement = Arrangement.INSTANCE;
                    start = !z3 ? arrangement.getStart() : arrangement.getEnd();
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if (i9 != 0) {
                    top = Alignment.Companion.getTop();
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 &= -3670017;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i4, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
            }
            int i10 = (-1) - (((-1) - i4) | ((-1) - 14));
            int i11 = ((i10 + 12582912) - (i10 & 12582912)) | ((-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i12 = (-1) - (((-1) - i4) | ((-1) - 896));
            int i13 = i4 << 3;
            LazyRow(companion, lazyListStateRememberLazyListState, paddingValuesM1011PaddingValues0680j_4, z3, start, top, flingBehavior2, true, function1, composerStartRestartGroup, (-1) - (((-1) - (((-1) - (((-1) - (((-1) - (((-1) - ((i11 + i12) - (i11 & i12))) & ((-1) - (7168 & i4)))) | ((57344 + i4) - (57344 | i4)))) & ((-1) - (458752 & i4)))) | ((3670016 + i4) - (3670016 | i4)))) & ((-1) - ((i13 + 234881024) - (i13 | 234881024)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function1<LazyListScope, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ FlingBehavior $flingBehavior;
                final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                final /* synthetic */ boolean $reverseLayout;
                final /* synthetic */ LazyListState $state;
                final /* synthetic */ Alignment.Vertical $verticalAlignment;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C04912(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM1011PaddingValues0680j_42, boolean z32, Arrangement.Horizontal start2, Alignment.Vertical top2, FlingBehavior flingBehavior22, Function1<? super LazyListScope, Unit> function12, int i22, int i32) {
                    super(2);
                    lazyListState = lazyListStateRememberLazyListState2;
                    paddingValues = paddingValuesM1011PaddingValues0680j_42;
                    z = z32;
                    horizontal = start2;
                    vertical = top2;
                    flingBehavior = flingBehavior22;
                    function1 = function12;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new C04932(function1, list) : null, new AnonymousClass3(C04921.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new C04952(function2, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C04974(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new AnonymousClass6(function1, objArr) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C04996(function2, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C05018(function5, objArr)));
    }
}
