package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
    	... 4 more
    */
/* JADX INFO: compiled from: TextAndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яš\u0014D57\u001eq\u007fZDkt\nB\u000e0\u00197Jչ*,(w\u000ffp98D{H6Ri*\u0017ӆ\u000442`,qI<]\u001a\f(\u0011OTgon`Z\u0013C\u0015\u0006\u001exx,Qǁ\u0001](\u000f:BuI;M\u0006=A`z6\r H\"@y\u000b\u0002\"*V#~zIT\u0014\u0012>Rx:X\u0014U\u00050\u0012\u000e>6\u0001&\\uU>HrkB/9\u0003qBT1g0\u0013M\u0015FZ(\u0015vw\u001e3@=7\u001d%a\u001a\u000fRa?\u000b?\u007fI\rh-)3I\nW>X\u0006\u0016\u001d+]\u0018er,`\rQv\f/+UgSP$(\u007fz\u0002\u000fD\u0004\u001c\u001b/H42\"f\u001e\u000e;tx[HP\u0018^J\u007f\u0001y<Ѝ;Įc+g\u001a'Tň?\u0019\\7D\u0013\u001b ;\u0001\u001d$\fX\u001cd-\u001b\u0003|\u0018F\u001aNKNf\n\b@\u001e\b~i\u001a*28\u000e\u0015w\n\u001f4/%e^i'/r\u001aHrp=\u001a)\u000faojHn%\u001f\u001aE4!\f\tO\u0015\ty\\lXZ\u001c} b\u0014\u0016\bA+\r{J/=\u0010|Z/~3sk\u0010=/\u0015:\nry\u0018o9\rBeUq\u001cyR%#o@p\u0012pfpb<^j6:2vyV\rDR\\\u001c+2mtL8:51\\CMI2\u000bW\u000b\u0019wZ\u0017\u0013/XA(\u001biRy9\u0005^m\to\u0016\u000b\u0010AEn0@YQc\u001cVY0oL|Q\u000fE\bH]u__L\u001b\u0019&Y\n'.\u001agY_A! \u0017)`\u0014sZ\u0015\u0001sde\u0012U}-}\u001dB\u0001.\u0016\u00111\u0005tvx]gTE%'b\u0001* d.\u0003\u0012J\tX{T9m\u0005^;)gOf8+\bO\"3\u000b\b\"+@]G5).wB:Eekv\b.(m?*\u0003s\u001c,\u0012!6v\u001a\f@NPI\b\u0002n&2v\u001bBvu(\fP\u0015L\raSqh~cPM9:.j\u0015:%p\u0005fj\u0017}\u000fL.\u000e<:XF:lV=\u0011{V\u0018q{Ut\u000bx\u001e:\u000f\n=\u0007\u0012JLPZeo!04\u0003H:OIz\u0005j\u0018jHtL\u0016\u001f[T\u0018\u001b@\u0001\u000e\\w\u0011-1p\u000b\u0002jVZ\u0007tnH3u\fuiP\u000f\u0018'3L\u000ee5\u0013\b^T]rb\u0005a8!\u001b\u0019^/j3G\\Tg*X\\\u000f(]]qXHJLu7\f\u0004o:MH\u0001+a0\u001bgZAc\u0005Pv\u000b\u0004o~h\u00053~R|-Y\u0003\t\u001f&<8\u0012;\u001d]\u0016\bb[p\u0015\f\u007f\n(\u001f/DW\u001c<\u0001qP3-4@]AWv,'*b\u0004?\f\u00158 U\u000f%%je&f8hK>$\u0012.b0\u0014CT.%FJ#}:2\u0016Xg\u0002a\u0005Cbg\u000f\u0010!nKq\u0001NbY\u000e\u0011\n\u0012\u0002\u0014rc1\u001bf_}*r;f5\tUd^\u0019f}R\u0013i\u001f\u00075F(]P-[ bW%\u007fgv\u0017\u0004O\n4[5yRy3FQL\u0006O}\u0004-BTV\u001dk\\[a|\u000brkp{Tr3Rr\u001a$)B\u0012/Ll7+4t\u001aNj=_1!q\fuh7\bSr>!_[o!EU#q>u?'\u0001v=(8g!r.|\\1TzU\u001aU\u0001Tqr\r>KsCr\f:\u001d&\u0011]eh&L\u007f2\u001eQPae_%IeF+\b\u0007GJ\u001bUaOB\u0001+,=C\b]\u0004:\"F#'=<\b\u001b\u0006uk)C\u0014d':\r\u0016N\r|{V=l\\MCu6y\u0004O0\u000e-U<\u0006$20I?zB_\u000bC\u0007ye'>,LmrG\u000e\u0002AD\u0018Q\u0002\u0018\"y\feBk\u0013\u0014Gon.;\u0019\u001fE{w*\u000fR:]\u0014e\u001e6-AE\u0015\u0010}\u0001p/W\"e/\u000bll\u0017\u00024R2\u0010E*KN\u000bB\u0006[!\u0005gx\u001d\u0006Q\u000e\u0013h\u0018\u001b0\u001cyGQ\u000f$'2`qY*^6\u000b\u000e}Ep1X\u000fR\u0006^F\u001a?\u001e\u0016\\WG\u0006\f\u007fx\u0015ABwwO}*V*XM\u0015i]\u001e%\u0016ywEc\u001cp?O29\u0019z\\C\u001ft\u0005\u00040{j98\u0018lA-uz\u0005.r~\u0014H]dv%t|Rc\u00060^;\u0001\u0003h\u007fu\u0001J*mY##\u00172\u0011B\fh\u001fNOW\u001dv\u001c7u\u0007\u0010A(AG(;\"axJ#\"\u001cwRD\u001ej\bm|\u001c^@\u0007o\n9/4N_EY-nemZ\u001eTG\".e<\u0006A9\u0013k!)&\"\u000e\u0012|:di`K\bS-V3\u001d\t3$.:M\u0006\nKE)bJx\u0002t\tB</!G}\u007f,.s/~t\b\u0011u/\u0004YV1 R*d(R|\u0016tXl,\b*NX\u001a\u001aK/\u0012\u007fVoH\u0017\u0004n\u001en\u0002\u001cx\u0011\b?\u001c4rB\u000bf\u0013G\u0014BJ\u0012\u0005\u0019\u0015Z.\u001f_\u000fz\t\u000f{xE\u001e\u0006\u0005,UZ\u000f\u007fa/\u000f\u0010y\u0017BLtz1-K:PjRWkp_J4E\u001be\u0006]\u0014]a?=s:I-\u0005l\u001e#\bz(e02\u0010uG\u000f\u0019NiEZU\u0003\u0019\f8\\$|3W\u001fW`!\u000e\u001f!s/',jYWg~Q\u0017\u0011jT\b`\\\t~|+t%\\\u000b6# \u0016\u00145\u001b\u0016$\u007fAz\nOb\u0002d>F\u0018\u0006u%k@\u0019\u0014N1&\u0002b?h^Q\u0006^q<\bL2\u000e0\u0002<\bC22LB$J\"Q\f?:&m~n'IOyTE\u0003P&2\u001cS$jkCLAk\r\u000e\u0003SPGq6o\u0010\u0002GQUha\u0016hd|q\u00047UTDi7s\u0012](s\u000fjr\u001b\u0006dz4\u001aI,K\u00117\u0003K\\>!z7\u0003\u0005.y\u0010k+=\u0018\u0013]\f)QIUcn\u000b\u0018;7\u0015cK\u001asrh\\\u0011VubB \u0019`X\u0015\u0019K\u0006\u0013W|\u001aDDu|NX-[2r\u0014U0u`kV::{$Y5\u007fc]S\b\u0019lCFv\t\u00048>+|r q^V\u000eq#@=; \u000ex{|T\u001b\"\u001fl\\X'v%h-\u0002XMR#Q\t1i\u001b5\u001b_$}\u001c\u0005\t}\u0007[\n<`\u0002\u0014\u0002+AMw>(\u0016)\r[bX&\u0007Nk+\u000e0B\\,Z\u001a.b\u0013\u0018\"A_T\u0004t'/\u0010_\rG5\u00113D@\u000bFL(\u0001[}#\f:CA\fKq\u0017t4ISnse?\u0011(\u0016( \u0004%o\u000e!Gvw.\u0007y4>\u001d!MzuDB3\u0006x[v\u0010}\u0007la\r\\NEVuVVI=z\\r0\"<\r5\u001c\u00057*RG<r>Ith,z'VpAx4\u001d@\tDCN;\u0001T%G\u001dks9{VY\u0004[\u0015\u0013tRhC@\u0016%Bw  1K(L_.Z*!ayO\u0001dF0\u0006z\u0016:d:D|T;FN_j1i@)PH~E pn\u0003'GF?\u0017O\u0005y`WHt\u001fZsYtycGP\u0001,}r=\u0006/&fpg'YB:\u001csvmM3\u0002%\u001f\u0019C%\u0007+X\n\\\rN\u0006\u0017NB\"+\u00176\u001fX\u001bB\u0004\u0006L\u0014#\u0010\u0013mB\u001bZb}aF\u0016sq?W \tYv|\u001cH<2\u0002\r^7\u00114>E\u000bI93PRmKl\u0012V\u0006zj*'1kx\u000eD\u0015\f\tm42 U(vo\u0007NE. YHWTJ\u0002:t\u0013\u0004EFW\u0002d\u000bp'C6N%\u0018\u001b\u0005oy8V\u0019t6\u001b\u0002\u000b=F<t&\u0006>:buZ<\u0010N\u001d\u000eu/w\u0005b~\u0013m\"B\u001a\u000b\fTm\u0014\u0010\u0016*18^\u007f\u0002>\u0012\u007fev\u0003\u000fv;xx|P\"\u0010#\u001eXiP\u000f\u0019A\u007f4L+\u0013\u000e\u000ftSU\u001d.P/\u0013,\u001b5\to~C\t\u0005k;Q;K~\u0005dGgxv\u00062\u0001lE9#q`g\u0013s'_;S#\u0013x2\u0004\u0017a\fi-\u0001FgKg\u0014oF\u001b\u0013^#Sv7o3C\u001fCYx.'mb(_n\u001fX\u000413EH.\u001c*';Im\"\u00057N'3/\u001ed-8\u0001A2\u0015\u001ae9; /UC\u0004K\fuI\u0011vJ: U*=e2)\u0016{Vx#\u001d|\f\u007fD\u000e4?\u007fz\n\u0018\\\u001e\u0014\t 44DF &\nL)_99u|y7Cm&P~g/5fm\u0004m\u0011gD6\u0011\u0018[:'\u0017\u001b\\rG\u0014X\u001dmv/m]^\u0019>-].t\u001bh)gD)|I\u001c\u0001P}\u0016\r<#;kh\u0018o\u00163\u0017KS{} $]+ g\u0004\u0005\u000f\u0019\u0004\u0005IJ\b\u000fBZf\u0013\u000bhB\u001aG~8MO{}6V@EW^U`pCfQ? $^\u000b\u001e\u0017`kMMwD53\u0013p\"+\u000e\u007f<q8;\u007ffI[|y!`\u0006\u0001\t4?A\u0016+\u0004BDD`iR\u0015*$T<0>\u0010[ko^U%\u001f\u007f\u0005\feX\u0011~\bdy*q\f5*%C\u0019J\"S\u001f\u0005N]\u0007VeSW2\u0005\u0016\u001f#:\u0011`(4~;T\u000efKzh\b\u000b|uD\u0011:=\u00155.E\rJO9QWOS1T\u0017D?+Piq29>v\u001fU\u0017\u007fLZ<Z*GquTEpr\u001a\u0010\\ L\u0007=λS#\b>t-L?R\rU\u0003~vD\f.W\u0013\t\u0092/5|\u001ftt2\u0010ӛe8qr\u001d}\f&\u001dc9Ol\u001c\b\u0004%odEM{\u0017)پ@\u001b2.HXnu\u0012!DD\u0018bS$'z\rf\u001bd{NJ \u000fed\u001dxT\u000f\u001e>\u007f:MMz\u007fU+ad;{\u0017a3ϰL\r1`$/\u0018Qў\u007fW;M\u0007\tjO$|z\f2C/\t\u000b'zcR|as\u009e3x\u001dAPRWk5R\u0014\u001e9D\u0015PqV\u0016\u0019-|GUGy\r\n\tphsS|Q\u0001vL\u0007\u0013f8?\u001f\u0007TEx'9Ƹ,)\u00032qaY\tߜFg\u001aC6x/\u001dD/m~\u0018\u000e\u001cUn_S\u0013)g\u0005mʊJ*\u0014V/_\u0014+p\u0001oX\u001bdBwD$Ԁ\u001d\u000fqC<\u0001)\"rj\u007f+ߞ7J-\u0010ۗD4\u001d\u0017r,\u0010;\u0007S;7E~[~=I_#~#l-ͥ\nYd\u001c}o\u007fa\u001e9\u05c8=7r\u0013S[k@t[\u00144.^Tj\r|r<c\u001a\u0014)\u007feѻ\u0018{.\n=\u0010ϱCbG\u0014Ģ\t\"\u0010Xgh\u001eIѬVpnA}/XWc\u0001tp\u0013O$y/\u001bÆO\u0003=iU\u0015\u0014n\u00019Ӑ,GoK,=\u0014&ۣTN#cj\n7\nC1Դ9!#C[a\u0013R>Pۿy)~RH|֬d\nG*G\u0004ǫ\u0002N_\u0004K\u0019\b\u001d10י2\u0003<Nc\u001994ȵj=SY:Y4;\u0017\bĦ\u0018Yz\u0014rsZQ\u00107ڕF\u001aM\"]:\u001fK*AЕz#k\u001dJoY2SAΠ\u001b\bT_N<|irDؓ>q\u001e0l\u0017'Z::̽\u00116N6Ty\\LsHP\t\u0001&-^OTϢCK[#\u0006.(T\u007fbe%r,DYݏ\u0013EM\u0001ґ<O$\u001ad\u0003Ў2\u0019\u0015\u007f\u0017k#$\u0014[#3-&~\rT[،`Ov\u0016I]\n$q<sn\u001d\u0002Phٓ\u0011U'\u0013ح\u0003Y\u000f\"\u0013&ϋJ-!2\u000fqzP\u0012\u0005-Z:\u007f|dFt\u0005\u0006f+\u0019`.NpNWF)\u001e8FTY\u001dXg5nMƱN\u0018I\u0002M\u001b\u0014?;9o;\u001di{\u0015c[U4wuGK2 \\\u0019R(r\rmCU\u0013JN\u001a\tũIwc\u0014ɣ1+7^X2Ի\u001fp|\u0003I\u001cX\t\\bܷ][q7KYL}Ͼv)D#P\u001c3c;Iۮ}~e]Z5\u00139قH=+E=Za\u000b.\u0002ʱ<Fo>o\u0010}Y\nc݅\u001c\u0014TApHXOçT~b\u0010>Sp\u0004\u0019\"OG2$\u001e~\u000f:?6C\u0002Կ\u0012x>\u0011HjNw϶en|/\u0004-/x$8)0Q6*\u001bJfTuƤ;Z\tPb\u001e\fLgkЍq\r]\f({\n3P]\u0002;n\u0010w\"\u000fqv!SamF_]\u0014RBpo\nZI@Yp \f%\u001ftn/dZL\u0007xV=\tҚI\u0004N~_!\u001d\ti\u0016'\ni-\u0017\u0001\u000frSpw'J?WpwW Ag{MW?~\n[y9!JwHb q\u0004_(Ժy}wW\u001b0b\tB\u0018߷\u000e?\u0017~0\u001d\u0015\u0005Ӹ\\P\u001a\u0012Bxk\u0013mVъeWy\u001f\u001752h!'ʵ\u0016_b\u001c\u0005c\nrۺ*P6anYbc*#ذs\u001a<{k3\bwڏ0^\b<:\u0002_P}\u0017ЄveC\u001a\u0001\f@_\u001aI\u0002\u0018\u0017`\u0015\u0006(6}\u0003@q\u007f\u00030\u001086\rKmVwm\u0012T9a5\u001eړN&Tz]\tJ;N1ȕ#rZ\u0015\u001ci\r\b&S\u000f.3|\u0004^q\u0011o0Y{Kgz#YkN9(ac\u0012\u0007e\n:V(Ҵ^xM8rym4Ӫ\u0006\u001c\u0014c3B\u0010>e?½\u0019\r&LYFf\u001bϚmkBXy#\f'Ӭ[\u0002\u001cwYO8Q_\u0016Ǌ\u0002d-\"\u0006$\u001aIC\u0019#UZ\u000e&[jkH\u0001ԟw4)\u0001}+\u001f9ʯ\u0014\u007flqA\na\u000fՉRf_B\u0011$j@ʝs\u0014<u-N,\u0013@\u001aֱB?\f\u0011\u0006w\u0002~ߪ\rE\u001bA}\nˑ\u0002\u000b^,vtߎ6\u007f Xg[Rn7Y\u001d\u000b\u0019\u0015\u001eU+\u001c>\u0014ɏLT7{\u0005{~%\u008d}]WQh%\u00044Њj\b/v\u0015TA\u0004f5˽)L\u001c>\u001e\u001c9i\u008bsHTQ\u0017^X@ߘ\u001d7\u007f\u0005\".0$Og^\u0003#i\u000b>ʚ\u0003Ԟ,-5܆Ɲ(ȝ\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=)L:x>\"\u0014F]B\u0018_:$", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "u(E", "<`c6i,\u001cO\"\u0010vl", "1kX=B<M>\u0015\u000e}", "", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1kX=B<M@\u0019|\n", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "", "1kX=C(MV", "=o", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{B\u0005! \u0006Y\u0019\u0012", "1kX=E,<b", "1n]0T;", "", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "2hb.U3>H", "2qPD4\u0019 0", RemoteSettings.FORWARD_SLASH_STRING, "@", "5", AdkSettings.PLATFORM_TYPE_MOBILE, "2qPD49<", "=uP9", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "2qPD50M[\u0015\n", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "AqR", "2rc", "1n[<e:", "", "=eU@X;", "Asa6W,", "F", "G", "EhSA[", "6dX4[;", "6`b\u000e_7AO", "2qPD50M[\u0015\nb^:\u007f", ";db5J0=b\u001c", ";db5;,BU\u001c\u000e", "DdaAf", "", "DdaAB-?a\u0019\u000e", "1n[<e\u0016?T'~\n", "2qPD60KQ ~", "1w", "1x", "@`S6h:", "2qPD66E]&", "1n[<e", ";nS2", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u0003@\n\u0016~Qn\u000e\u0012", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006M\u0010\u0017$&\u007f\u000f=5\r?X}u", "", "2qPD76NP ~gh<\u0006\b\u001ce}7", "=tc2e", "=tc2e\u0019Q", "=tc2e\u0019R", "7m]2e", "7m]2e\u0019Q", "7m]2e\u0019R", "=tc2e\u0019:R\u001d\u0003", "7m]2e\u0019:R\u001d\u0003", "2qPD:3R^\u001c\r", "5kh=[\u0010=a", "5kh=[\u0010==\u001a\u007f\t^;", ">nb6g0H\\'", ">nb6g0H\\\u0003\u007f{l,\f", "5kh=[\nHc\"\u000e", "4n]A", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI)\u0006I\u0010%`(y\u0017KL", "2qPD?0GS", "AsP?g\u001f", "AsP?g ", "As^=K", "As^=L", "2qPD?0GS'", ">sb", "1nd;g", "2qPDB=:Z", "2qPDC(B\\(", "2qPDC(MQ\u001c", ">`c0[", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0011\u007fI\u0001\u0002\u0013Vm\u0011\u0012", "2qPDC(MV", "2qPDC0<b)\fz", ">hRAh9>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u007f>\u0010'$GE", "2qPDC6B\\(", "2qPDC6B\\(\r", "2qPDC6LB\u0019\u0012\n", "BdgA", "", "7mS2k", ">nb", "", "2qPDE\u000e\u001b", "2qPDE,<b", "2qPDE,GR\u0019\fch+|", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$0y\r<L", "2qPDE6N\\\u0018kz\\;", "@w", "@x", "2qPDG,Qb", "", "AsP?g", "3mS", "2qPDG,Qb\u0003\beZ;\u007f", "6NU3f,M", "DNU3f,M", "2qPDG,Qb\u0006\u000f\u0004", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI7{S\u0010`~Gk\u001cL\u0004%4H}3FC", "1n]AX?MA(z\bm", "1n]AX?M3\"}", "7rAA_", "1n]AX?M7\"}zq", "1n]AX?M1#\u000f\u0004m", "2qPDI,Kb\u001d|zl", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u0006`\u000eI\u0006%HA\b\u001f7C", "DdaAX?\u001c])\b\n", "Bdg@", "Bdg\u001cY-LS(", "7mS6V,L", "", "7mS2k\u0016?T'~\n", "7mS2k\nHc\"\u000e", "3mP/_,3", "5dc\u0010_0I0#\u000f\u0004]:", "0nd;W:", "5dc\u0011X5LW(\u0013", "5dc\u0011e(P4\u001d\u0006\n^9", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0007\t<\u0013w\u001bN~\u000eIL", "5dc\u0015X0@V(", "5dc\u001aT;KW,", "1s\\", "5dc\u001aT?B[)\u0007Wb;\u0005\u0005:H\u007f,}C\u0010", "5dc\u001aT?B[)\u0007Wb;\u0005\u0005:W\u0004'\u000bC", "5dc T=>1#\u000f\u0004m", "5dc$\\+MV", "7r>=T8NS", "?tX0^\u0019>X\u0019|\n", "Bx_2", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u0006O\r>v\u0014Id}u", "@dbAb9>", "@dbAb9>B#\\\u0005n5\f", "A`e266N\\(", "@nc.g,", "2dV?X,L", "A`e2", "A`e2?(RS&", "A`e293:U'", "A`e2?(RS&Z\u0002i/x", "/k_5T", "AbP9X", "Aw", "Ax", "Adc\u000f\\;FO$", "Adc\u0010T5OO'", "1`]CT:", "Adc\u0011X5LW(\u0013", "2d]@\\;R", "Adc\u0011e(P4\u001d\u0006\n^9", "4h[AX9", "Adc\u001aT;KW,", "AjTD", "BqP;f3:b\u0019", "2w", "2x", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    public final void setCanvas(Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.enableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.disableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i2);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public int saveLayer(RectF rectF, Paint paint, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i2);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public int saveLayer(float f2, float f3, float f4, float f5, Paint paint, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f2, f3, f4, f5, paint, i2);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f2, f3, f4, f5, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public int saveLayerAlpha(RectF rectF, int i2, int i3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i2, i3);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i2);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2, int i3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2, i3);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i2);
    }

    @Override // android.graphics.Canvas
    public void translate(float f2, float f3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f2, f3);
    }

    @Override // android.graphics.Canvas
    public void scale(float f2, float f3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f2, f3);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f2);
    }

    @Override // android.graphics.Canvas
    public void skew(float f2, float f3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f2, f3);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean clipRect(float f2, float f3, float f4, float f5, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f2, f3, f4, f5, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f2, float f3, float f4, float f5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f2, f3, f4, f5);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i2, i3, i4, i5);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f2, float f3, float f4, float f5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, f2, f3, f4, f5);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i2, int i3, int i4, int i5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, i2, i3, i4, i5);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutPath(canvas, path);
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, path);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public boolean quickReject(float f2, float f3, float f4, float f5, Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f2, f3, f4, f5, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f2, float f3, float f4, float f5) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, f2, f3, f4, f5);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f2, float f3, boolean z2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f2, f3, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f2, f3, f4, f5, f6, f7, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i2, i3, i4, i5);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public void drawBitmap(int[] iArr, int i2, int i3, float f2, float f3, int i4, int i5, boolean z2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i2, i3, f2, f3, i4, i5, z2, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public void drawBitmap(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i2, i3, i4, i5, i6, i7, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i2, int i3, float[] fArr, int i4, int[] iArr, int i5, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i2, i3, fArr, i4, iArr, i5, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i2);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j2) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j2);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i2, PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i2, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, i2, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j2, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f2, f3, f4, f5, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i2, i3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f2, f3, f4, f5, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i2, i3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public void drawPosText(char[] cArr, int i2, int i3, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i2, i3, fArr, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
    @InterfaceC1492Gx
    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f2, f3, f4, f5, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i2, int i3, int i4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, f2, f3, rectF2, f4, f5, paint);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawGlyphs(canvas, iArr, i2, fArr, i3, i4, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i2, i3, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i2, i3, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i2, i3, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i2, int i3, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i2, i3, path, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, cArr, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawTextRun(canvas, measuredText, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i3, float[] fArr2, int i4, int[] iArr, int i5, short[] sArr, int i6, int i7, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i2, fArr, i3, fArr2, i4, iArr, i5, sArr, i6, i7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawRenderNode(canvas, renderNode);
    }
}
