package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŝ\u0014D57\u001eq\u007fZDkt\nA\u000e0\u00193J~(-\u001aw\u001dfr96EmHDR[*\u0015m\u00044:[,qI<]\u001a\u0014\"\u0011OTjon`Z\u0013¼\u0017\u0006,xr,OU\u0001](\u000f:ԏw?IMwމA`\u000b6\r 8#@y\u001b\u0001\"*N\u0014~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>&\u0004&\\uN>H\u0003]Bǂ+\u0003\u007fBVϋg0\u0013M\u0015Ͽ\\'#vi\u001eA@?5\u001b)[\u0003\u0015[cΪ\u000b?\b=\rh-23I\nW>X\u0006\u0015\u001d+e\reö.\\\u001bQh\f-=WcaP\u0016(}~\u0004\rJ\"\u0016ͺ/HD-\"f\u000e\u0015;t\tSHP\biXȕ+ad\u0016]\u007fĤ*y\u001eƻUaI\u0019\u0017\u007f\n\u001c%\u001eQ\u0010\u001f'il&b+\u001a\u0003\u0011\u00025_ZUH|%\nCs\u0003~~\u001a*22w\u0006=\u0019)0-$eyi'/\u000b\u001aHr\b'\u000bfha\u000bjHnD5\u0016\u05ec)\u009eɔ^Fj(yt\u001d\u001f:(e\u001c\u0003\u0016.\f!EtwjGU\u0014\\i\u0001i\u0019h\u000e\u0010+.tSqn\u001a\u0010\b?lPMSy\u000f\u0010p'\u0018M[z\u0005\u0007\u0007rY\u0012ZjI:2v\rVwմC\u0088ܟ\u00174E\u0019*\\t\u001c'\u0006-H1-rG\u000b!w\\~\u000f-mc(\u0011\u0014<t7\u0003\u0001`~\u001b\u007fxw.-d0YYQcFVY0\u0017L|Q6/y\u000ew\u007fN]K\u001bG&[\u0002\u001f$6QQ]?C\u0015\rFJ\u0004CDz\u0011\u0016U[1?z+\u001a?An.u)\u0003pZ\u00031J؛SϟȔz`xU\u0016\u0018Hboo\u0013G\u0012c;_Ln\u000b\u0003\bb~<\u000b/7\u001eS\u0003 &\u000b`ECU\u001fF{\"[-a\f\u0017 2\b\u0011'&#\u001542qF\bdg\\`lhO_}L><l1Dxp\u0006%Z\u000bJ\fafqh~uPM9O.l\r,\u001b\u0012n[h56}ԧ-ɾͫwE\u0004Hlxm[[\n\u007fm\u001c\u0003\r\u000fX\u0010\"\u000b*i\u001f\u0016*O8V\u0006u94\u0014-06ou\u0013\tJD<4Zx8 Q\u0012\u0002\u0017 |\u0010F\u000e\u000e'4Rsi\u000e<\u0013ܢ`VND'ѫf֙)܀϶\u00135$9CrMRT\u0017Gc`8\u0004!\u00173\u0003O-\u007fU/R\u0018Q\u001bVZ1\u000fS\"[I084K73\u0004o:~H\u0001+\n0\u001bg\u001aAc\u0005kv\u000b\u0004!~j|\u0011tnf\"W\u0001+\u0001\u001cV\"\u000f94\u007fx}\u007fENdveaJ\u0005%cA\u0007:\u001d*Zˊ,ݢ\u05f91?O4\"qD<a}\u0016\bNWW\b\u0003FtW<\r:a)}.qDd2\r!\u00158\u0004\\L%v\u0018s 6}Hc\u0006!&qk&ip+9(\u001eBy%)\u0010ikq\u000bm\u000b1haZ\b\tEPK$WS<0p\\P\u0010\u0002>\t\u0015\u000e3-&MVNvѣ\u000f˖ʍlrq\u001biYs{ywy1^\nN\u0002-\u0012\u000e\u0004XmX\u0019I%e>\u0013\u000b\rpP'&^\u0019p\u0015z\u0012(\"\u0019\u0017H\r\u0013C8T\r6d]RI%i*_b\u001d\u0003sgV%?qW\u001beRQ\u0004Ƃuܾ֫>dzP8\u0014Q?\u000e5D-t\fm\u001e5~<m\u0013)VOS\u0007Z\bZ\u0013>\u0015=*P l%J\"APA]1\u0011/\u0017h\n}!15\u0019l\u0004+8\u001e\u0015\u0003#>(O\u001c>\u0002V\u000b#]/6/̩eծć9gRy\u001aU.\u000f\r\"{V=\u0019\\MC\u001b6y\u0004\u00170\u000e-k<\u0006$k0K7G8{t@\u0005u\b\b4DNnr>wr\u0007\u0011\".\u007f\u0017\"\u0003\feB`\u0013\u0014Gd\u0005>ͮk؋ƘQj\u007fbRe\u000epEc\u001e)aN-\u0014]GX+wI}3j7T\u0013\"^j6o\u0012\u0012Gn6Z\n;olc\u0019E\u001eUmnP\u0012;i4}7Qn\u001cx\u001dF){zTPtx{\\\u0013\u0011N,<`DA:)6\u001a<g/\u0002,j'*Ϯ2ʺضEI\u00186\n\u0002euiy\u001e%\u0016\"wCcGp=g\n;qX2Me\u000b_\u0006%Y@C\u0015.G[2U4V\u001aX36\u0012SC`\u0010rUt.s/>Lh~\tE\u000e\u0005*9UUC\u0001/8pTsf'*eu\u001fVcBEx0#@E'4#\u001e\u0002[x7ӊ\fГĨ\u007f\nb+c_6(\u001efyJOf6C=Ycl\u0005~o\u001de$\u0017\fNoT\n!\nzgA2>&m-d6\u0005+xOg=~B\u0019<+z\u001a^$:k\u0005k7Ah\"4I{X,\\r9M]\b\u0014,{n\u0015\u0013\nQSJ\u000e\u0019lQ8%ͧNǰ֟rSb?L~ \u0005Nv\u001a\u001aK]\u0012\u007fVNH\u0017\u0004\n\u001en\u00029x\u0011\b|\u001c4r_\u000bf\u0013\u0007\u0014BJr\u0005\u0019\u0015Q.\u001f_pz\t\u000f\u001exG\u001e\u0013\u0005.=5v\u001cI\u0007\u0007Jo3,7rxSmAW:c8R\fCwN\u0014-\u0003a&5Bqמ5ŧ҈0~\u001bmLP;Pzoe02#_6TrX\u001c[sWqvOB\u000e:E50|\u000fjQ$[#j\u0005\",6YWgIQ\u0017\u00113T\b`h\t\u0001|ut'Dz4=BF\nT\u0005A\"\u001cykǬN̤ߚ\"+\u0004U\u0006\rU8 n{JQ\u0007\u001af\u001f\u0003FM&-\n@g\t\u001a\nPqT\f#b\u001aHb\u0007b()\u007f\u001dR0J\u0015p))\u0017\u007f$/#\u0011>8{[\fhsfb_mYk\u001e]-]\u0012N_ˎlȚ֖K\u0010O\u0004H>\u00152\u0004KUTDi7s\u0012\"(s\u000fMr\u001b\u0006 z4\u001aS,M\t\u0013xgF\u001a\th\u001fp\u0005jy\u0010k1=\u001a\u0013[\f+9?S}\u0011k\u000eZ!pKW\u0018Yܑ\nҾګ,b81 \u0003\u0011\u001dt}3\u00023\u0003\u0015\u001e$*]xn=E_\u0012\r{QP\u000exq..\u0018\u0014.6K\u0002e=\u001b\u000eh^c\u0003\u000f\u000fc@&)\u0005N6\u0010`6U|r ]{N\"ЮeǝɄ\u0011C\ra<l?W%6-\u0002X|R'Q]1m\u00158|;\f1\u0002]+\"|Us'^x6%!Y7\u0016<=8\u0004\u0003\u0006LO$\u0003pL!82C\\5D\u000bs|\u001d7 @_p\u0004v\u001f*\u0006{vB3\u000fU'6(0*wkA\u000eE,0b+vI\u000eO$ĈHրï1S|v(/X\u0006c\u0007W\nA\u001a\u000f\u0002\u000e\u0019a6@u\u0019Mz6,'\u001bsxqv\u0010}lla\r\u001dNEV6VVI>z\\r)\f,RC&\u001eMWT8\u001a\u001fH\u001drg,!'Xh\u0011nP\u00075\u0007Be11\u001e>\u0003\u0017\bQ{[\u0018LxmF\u0013/-\u000bٰB؛\u0087xAoz\u0016ӓ\u001cLTYю149w1QoBX:*\u0011-Ti\u001aTdP[bfcJ]Q<I0`\u0005\u001d\u0010N\u0007\r\u0004]HAv\u0017\u000bI2wz\r%:{Ar\u0002x]n\u0003E[\u000eG\u001aEF~ų\"Ƨӱ&\u001fKӕ<W\u0012][-\u0380\u000b\r\u0003Kl\"`lOW\u00024JDF\r}\tC\u0019\u0007& BO\r\"\u0011&d4Ha]F.\u0012\u0014PW[\u007f~+ab\u0019jS(\u001fvK\u001d\fTA]\u000f)I\u001bLrqy\u0001ͯFۢя`\u0010\u0015ޕ<w6x&\u0004֪|42 w(vo\u0004NE.1YHWxJ\u0002:\u0019|s\u000bka\u0012zGr\u0018!փ?6\u0001Iޙey:NtjR\u0005]r+.\u0012tP\u0006>:hu\\<#N\u001fui-\u0012'Zt2W\u0017@6C\u0013ţlɒԞi*)ڋE\u000eո2*Ueޥi'HEi\u00158P97\u000bLP\u0005$\u0019RggbfhP\u0007\u0002fE\u0010A^((Ӹ'%/\u001fٺOj\\\u000fw^9i8$Zf8\u007f|\u000fWUR\u0019=$(\n4YK\u000e|Q1m*+JKsYgՆPӪȷ?;M˹\u0007eψkP5-ыh7o3G5?\u0014q$ˋ>ow\nop@L\u00136ؾC8&@6=CKؾu,6U QW\u0019\u0004\u0010ƇI2\u0015\u001av17@kmGc|sqi'%Jį\u0010Ό݉3\r Բfz˷se\u0001r\ri9\f2g%9̌k̯q\u0014\u0013~\"7$&*$O\u001b3hO?\u001eωKڮ9\n\u0016ėhq\u00058f|<\bpa,21(yӸOڤl۷h%\u0004Ҿ~dL6m.^\u001b\u0016.;77\u0006^7Q\"xg/\u0005I҆qҕb'zƏ.\u0011\u000e\u007f\u007fE\u0015I{\"<ëwء~ qVr x|%WJv\u000fBZU\u0003Kvʹ\u000eûj<7<Q\u000e6\u0002xS7\u0007=^xI|`gؖ\u007f˨\u0001$\u0007ʍɟ>\"{9\rډ/p\u0016݃\u000e³\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "u(E", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "2qPD66Gb\u0019\u0012\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00rrjH\u0007v;$", "5dc\u0011e(P1#\b\n^?\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011z?C\u0010r,a\u0006|", "2qPDC(KO!\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\u000b-9Xd]9!\u000eb\u001c$", "5dc\u0011e(P>\u0015\fvf:;\u00058n\n7wO\u0005! U", "5dc\u0011e(P>\u0015\fvf:", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0012\u001a\u001ey]Gep(`d%QWNj;_nO~\u000eg\nV9b", "4h[9C(B\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Asa<^,)O\u001d\b\n", "1n]3\\.N`\u0019ivb5\f", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "/k_5T", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "1n]3\\.N`\u0019ivb5\fP=w~\r\u0005@`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Ru^_nH\u0017\u0016X\u001c\u0018*\u001a\u0001kO\"xO7hf9E\u0014)w\u0015\u0013\u0016c\u0016QlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfsf\u0019[(_>82]O#\"r]\u000f\u000e\u0003b\u0011\u007f(]K+.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{Z\u0002'\u007f0\b28\u007fO\u0001Op'\u0014", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]3\\.N`\u0019ivb5\fP{qj\u001aa<K", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011zOH\u001bj,$W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2^\u0016\u001d\u0018BKtIe\u0010TOxY\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZ]N}pv\u001d", "1n]3\\.N`\u0019l\nk6\u0003\t\u001aa\u00041\u000b", "Asa<^,0W\u0018\u000e}", ";hc2e", "1`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "8nX;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", ">`c58-?S\u0017\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "1n]3\\.N`\u0019l\nk6\u0003\t\u001aa\u00041\u000b\b\u0004!e\\}\u001b$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f.'\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, }G\u0017 \t,G\u0011\u0011Ig\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCINAm-h\nmf:DA.!R\u001d\"wP;__7TYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hM\ts\u001d5\\r9>\u0018\u007f83E:", "1n]3\\.N`\u0019l\nk6\u0003\t\u001aa\u00041\u000b\bl\u0011a%d} ", "uI5\u0013<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsW>\u0004!@\\\u0002\u001eE7\u0001*\\F\u001bl5\u001e\u0013w7\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q\nS\tEua\u0010\u001d\u001d5wF&:S.u\u001etN3lEl)wQIPl8dUo!&<G \u001ft\u001d\u0019v\u001a\u0019\u0006\u007f\\ H", "2qPD", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qPD @Sf\n}kh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b+uBdb}EO\u000f@&m\u001d[+2\u001f!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0012\u0003[wvkQ\"\t\u0002\u0005NvYUIy^\bJj\u0010", "2qPD49<", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "2qPD49<\u001b\u001d\u0006\u0002>\u007fHl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f.8 P\u0015\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[\\\u001bJ6\u0010\tWOmmQ31\u0016*S\r;2_\u0019\u0012 #y\u0005IVe.u\u001etN3lEl)wQIPl8dUo!&<G \u001ft\u001d\u0019v\u001a\f\u0014\u0003]\u001eSV\u0001vgTn^{\u0015", "2qPD49<\u001b-]H@\u001cb\u0013", "uI5\u0013M\u0011#4\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@'BU\t#;k$wLP7}B\u001c\u001fsa\u0003ep(`d6[SN\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuK\u000f7s\u0004\u0010\u0014\u001c~HzI`\u001d(}\u001c\u0005A6>*\u001dP", "2qPD60KQ ~", "@`S6h:", "1d]AX9", "2qPD60KQ ~BO\u007fY\u0013\u001as\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPD60KQ ~BO(ff\u0003B\u0002", "uI5\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "2qPD<4:U\u0019F|[\u001day\u00128", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003uO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WP8\t\u0010\\E\"|\u000e6,\u0004>W\u007fEs\u0001Ut\u001b1|^Qj\u0017GO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004&!m$\u001elN<SY]\u0018|_ZknV\u0019\b\u000e\b\u0002^", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019FNc\u000e\b\u000f\u001fE", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "2qPD<4:U\u0019FVSx}h\u0017s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?*\t`", "2qPD?0GS", "AsP?g", "3mS", "2qPD?0GS`JgM4\fq-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, }G\u0017 \t,G\u0011\u0011Ig\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCINAm-h\nmf:DA.!R\u001d\"wP;__\u0017\u0002", "2qPD?0GS`g\\F|`\u0006y", "uI9\u00179\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsW>\u0004!@\\\u0002\u001eE7\u0001*\\F\u001bl5\u001e\u0013w7\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q\nS\tEua\u0010\u001d\u001d5wF&\u001a\u0001", "2qPDB=:Z", "2qPDB=:Z`Z\tN4KUA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPDB=:Z`\bBC\u007ffjy", "uI9\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPDC(MV", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPDC(MV``WF>\u0002s\u001f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)xT=Wp(n\u0017_f;G66\u0002\u0001-\"h&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[\u0010b{5\u0002\u000e\b;96qZ/+\t", "2qPDC(MV`e\\.xPf\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cz\u000f4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\t\f\u0012US2lNB\u001fQ\u000bV}MV\u0010 \u001d\u000e\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfsf\u0019[(_>82]O#\"r]\u000f\u000e\u0003b\u0011\u007f(]+X", "2qPDC6B\\(\r", ">nX;g:", "", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", "2qPDC6B\\(\rB@:}\u0018yW\u000e", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003cp<\\y|(05(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_x1ys\"W\u0011Gw$K\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "2qPDC6B\\(\rB?~q\u001b\u0017PR", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\r\\$g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu9r6J,O-\\P\u0002\u0013txV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dY%\u0004\u001c\u007fN\nlMh_\u0007\u001d%\tS", "2qPDE,<b", "2qPDE,<b`Z\tN4KUA", "2qPDE,<b`\bBC\u007ffjy", "2qPDE6N\\\u0018kz\\;", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "2qPDE6N\\\u0018kz\\;D}?i\f\u0019\u000b,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132(\u001cR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#@1jVE\u001d\u00127IK\u001au|\u001e\u0004\u001dIqp\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001fi6E'\u0018o'dFZ5\u0014\t4\u0015yayt=+\\k", "2qPDE6N\\\u0018kz\\;D\u0019vA\u0012w_\u001c", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d-5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_k?qzO7\u0014N\t\u0015\u0003\u0017\r,7", "=ac.\\5\u001fW \u0006eZ0\u0006\u0018", "=ac.\\5,b&\t\u0001^\u0017x\r8t", "Ad[2V;)O\u001d\b\n", "2qPDF;RZ\u0019", ";nSB_(MS", ";nSB_(MS`N\fH,I\u0017#", "uI5u=", "\u0012qPDC(KO!\r", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo4655getSizeNHjbRc() {
            return this.this$0.getDrawParams().m4653getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo4656setSizeuvyYCjk(long j2) {
            this.this$0.getDrawParams().m4654setSizeuvyYCjk(j2);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }
    };

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo4638drawLine1RTmtNc(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo4037drawLineWko1d7g(j2, j3, m4628configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i2, StrokeJoin.Companion.m4542getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo4639drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo4037drawLineWko1d7g(j3, j4, m4626configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i2, StrokeJoin.Companion.m4542getMiterLxFBmk8(), pathEffect, f3, colorFilter, i3, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo4646drawRectAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawRect(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3), Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3), m4624configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo4647drawRectnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawRect(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), Offset.m3937getXimpl(j3) + Size.m4006getWidthimpl(j4), Offset.m3938getYimpl(j3) + Size.m4003getHeightimpl(j4), m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo4637drawImagegbVJVH8(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4035drawImaged4ec7I(imageBitmap, j2, m4624configurePaintswdJneE$default(this, null, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e`^\n>mu\rY{\u0006\u0003rO\tciwZwWZa{xG,rI\"jU\t0YTzKG@&\u0011Y\u0005Y\u001c\u0003=\u0016\fK\u007f8.L\u000b\u0001q'\u001a", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo4635drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4036drawImageRectHPBpro0(imageBitmap, j2, j3, j4, j5, m4624configurePaintswdJneE$default(this, null, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo4636drawImageAZ2fEMs(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.drawParams.getCanvas().mo4036drawImageRectHPBpro0(imageBitmap, j2, j3, j4, j5, m4623configurePaintswdJneE(null, drawStyle, f2, colorFilter, i2, i3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo4648drawRoundRectZuiqVtQ(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3), Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3), CornerRadius.m3912getXimpl(j4), CornerRadius.m3913getYimpl(j4), m4624configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo4649drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawRoundRect(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), Offset.m3937getXimpl(j3) + Size.m4006getWidthimpl(j4), Offset.m3938getYimpl(j3) + Size.m4003getHeightimpl(j4), CornerRadius.m3912getXimpl(j5), CornerRadius.m3913getYimpl(j5), m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo4633drawCircleV9BoPsw(Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4034drawCircle9KIMszo(j2, f2, m4624configurePaintswdJneE$default(this, brush, drawStyle, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo4634drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo4034drawCircle9KIMszo(j3, f2, m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f3, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo4640drawOvalAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawOval(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3), Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3), m4624configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo4641drawOvalnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawOval(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), Offset.m3937getXimpl(j3) + Size.m4006getWidthimpl(j4), Offset.m3938getYimpl(j3) + Size.m4003getHeightimpl(j4), m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo4631drawArcillE91I(Brush brush, float f2, float f3, boolean z2, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawArc(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3), Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3), f2, f3, z2, m4624configurePaintswdJneE$default(this, brush, drawStyle, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo4632drawArcyD3GUKo(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawArc(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), Offset.m3937getXimpl(j3) + Size.m4006getWidthimpl(j4), Offset.m3938getYimpl(j3) + Size.m4003getHeightimpl(j4), f2, f3, z2, m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f4, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo4643drawPathLG529CI(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawPath(path, m4622configurePaint2qPWKa0$default(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo4642drawPathGBMwjPU(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().drawPath(path, m4624configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo4644drawPointsF8ZwMP8(List<Offset> list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.drawParams.getCanvas().mo4038drawPointsO7TthRY(i2, list, m4626configureStrokePaintQ_0CZUI$default(this, j2, f2, 4.0f, i3, StrokeJoin.Companion.m4542getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo4645drawPointsGsft0Ws(List<Offset> list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.drawParams.getCanvas().mo4038drawPointsO7TthRY(i2, list, m4628configureStrokePaintho4zsrM$default(this, brush, f2, 4.0f, i3, StrokeJoin.Companion.m4542getMiterLxFBmk8(), pathEffect, f3, colorFilter, i4, 0, 512, null));
    }

    /* JADX INFO: renamed from: draw-yzxVdVo */
    public final void m4630drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, Function1<? super DrawScope, Unit> function1) {
        DrawParams drawParams = getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM4651component4NHjbRc = drawParams.m4651component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4654setSizeuvyYCjk(j2);
        canvas.save();
        function1.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m4654setSizeuvyYCjk(jM4651component4NHjbRc);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4061setStylek9PVt8s(PaintingStyle.Companion.m4445getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4061setStylek9PVt8s(PaintingStyle.Companion.m4446getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof Stroke) {
            Paint paintObtainStrokePaint = obtainStrokePaint();
            Stroke stroke = (Stroke) drawStyle;
            if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
                paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m4527equalsimpl0(paintObtainStrokePaint.mo4053getStrokeCapKaPHkGw(), stroke.m4803getCapKaPHkGw())) {
                paintObtainStrokePaint.mo4059setStrokeCapBeK7IIE(stroke.m4803getCapKaPHkGw());
            }
            if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m4537equalsimpl0(paintObtainStrokePaint.mo4054getStrokeJoinLxFBmk8(), stroke.m4804getJoinLxFBmk8())) {
                paintObtainStrokePaint.mo4060setStrokeJoinWw9F2mQ(stroke.m4804getJoinLxFBmk8());
            }
            if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
                return paintObtainStrokePaint;
            }
            return paintObtainStrokePaint;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE$default */
    static /* synthetic */ Paint m4624configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((i4 + 32) - (i4 | 32) != 0) {
            i3 = DrawScope.Companion.m4737getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4623configurePaintswdJneE(brush, drawStyle, f2, colorFilter, i2, i3);
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE */
    private final Paint m4623configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo4125applyToPq9zytI(mo4734getSizeNHjbRc(), paintSelectPaint, f2);
        } else {
            if (paintSelectPaint.getShader() != null) {
                paintSelectPaint.setShader(null);
            }
            if (!Color.m4179equalsimpl0(paintSelectPaint.mo4051getColor0d7_KjU(), Color.Companion.m4204getBlack0d7_KjU())) {
                paintSelectPaint.mo4057setColor8_81llA(Color.Companion.m4204getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != f2) {
                paintSelectPaint.setAlpha(f2);
            }
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4089equalsimpl0(paintSelectPaint.mo4050getBlendMode0nO6VwU(), i2)) {
            paintSelectPaint.mo4056setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m4273equalsimpl0(paintSelectPaint.mo4052getFilterQualityfv9h1I(), i3)) {
            paintSelectPaint.mo4058setFilterQualityvDHp3xo(i3);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0$default */
    static /* synthetic */ Paint m4622configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            i3 = DrawScope.Companion.m4737getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4621configurePaint2qPWKa0(j2, drawStyle, f2, colorFilter, i2, i3);
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0 */
    private final Paint m4621configurePaint2qPWKa0(long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        long jM4629modulate5vOe2sY = m4629modulate5vOe2sY(j2, f2);
        if (!Color.m4179equalsimpl0(paintSelectPaint.mo4051getColor0d7_KjU(), jM4629modulate5vOe2sY)) {
            paintSelectPaint.mo4057setColor8_81llA(jM4629modulate5vOe2sY);
        }
        if (paintSelectPaint.getShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4089equalsimpl0(paintSelectPaint.mo4050getBlendMode0nO6VwU(), i2)) {
            paintSelectPaint.mo4056setBlendModes9anfk8(i2);
        }
        if (!FilterQuality.m4273equalsimpl0(paintSelectPaint.mo4052getFilterQualityfv9h1I(), i3)) {
            paintSelectPaint.mo4058setFilterQualityvDHp3xo(i3);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI$default */
    static /* synthetic */ Paint m4626configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        if ((i6 & 512) != 0) {
            i5 = DrawScope.Companion.m4737getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4625configureStrokePaintQ_0CZUI(j2, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, i5);
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI */
    private final Paint m4625configureStrokePaintQ_0CZUI(long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM4629modulate5vOe2sY = m4629modulate5vOe2sY(j2, f4);
        if (!Color.m4179equalsimpl0(paintObtainStrokePaint.mo4051getColor0d7_KjU(), jM4629modulate5vOe2sY)) {
            paintObtainStrokePaint.mo4057setColor8_81llA(jM4629modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4089equalsimpl0(paintObtainStrokePaint.mo4050getBlendMode0nO6VwU(), i4)) {
            paintObtainStrokePaint.mo4056setBlendModes9anfk8(i4);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f2) {
            paintObtainStrokePaint.setStrokeWidth(f2);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f3) {
            paintObtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m4527equalsimpl0(paintObtainStrokePaint.mo4053getStrokeCapKaPHkGw(), i2)) {
            paintObtainStrokePaint.mo4059setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m4537equalsimpl0(paintObtainStrokePaint.mo4054getStrokeJoinLxFBmk8(), i3)) {
            paintObtainStrokePaint.mo4060setStrokeJoinWw9F2mQ(i3);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m4273equalsimpl0(paintObtainStrokePaint.mo4052getFilterQualityfv9h1I(), i5)) {
            paintObtainStrokePaint.mo4058setFilterQualityvDHp3xo(i5);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM$default */
    static /* synthetic */ Paint m4628configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        if ((i6 + 512) - (i6 | 512) != 0) {
            i5 = DrawScope.Companion.m4737getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4627configureStrokePaintho4zsrM(brush, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, i5);
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM */
    private final Paint m4627configureStrokePaintho4zsrM(Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo4125applyToPq9zytI(mo4734getSizeNHjbRc(), paintObtainStrokePaint, f4);
        } else if (paintObtainStrokePaint.getAlpha() != f4) {
            paintObtainStrokePaint.setAlpha(f4);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m4089equalsimpl0(paintObtainStrokePaint.mo4050getBlendMode0nO6VwU(), i4)) {
            paintObtainStrokePaint.mo4056setBlendModes9anfk8(i4);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f2) {
            paintObtainStrokePaint.setStrokeWidth(f2);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f3) {
            paintObtainStrokePaint.setStrokeMiterLimit(f3);
        }
        if (!StrokeCap.m4527equalsimpl0(paintObtainStrokePaint.mo4053getStrokeCapKaPHkGw(), i2)) {
            paintObtainStrokePaint.mo4059setStrokeCapBeK7IIE(i2);
        }
        if (!StrokeJoin.m4537equalsimpl0(paintObtainStrokePaint.mo4054getStrokeJoinLxFBmk8(), i3)) {
            paintObtainStrokePaint.mo4060setStrokeJoinWw9F2mQ(i3);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m4273equalsimpl0(paintObtainStrokePaint.mo4052getFilterQualityfv9h1I(), i5)) {
            paintObtainStrokePaint.mo4058setFilterQualityvDHp3xo(i5);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY */
    private final long m4629modulate5vOe2sY(long j2, float f2) {
        return f2 == 1.0f ? j2 : Color.m4177copywmQWz5c$default(j2, Color.m4180getAlphaimpl(j2) * f2, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0(s{B-c$wCCU(\u0004*ޛWNusvϺ`őI%إFx\u0019+\n\u0001\tc\u0018\u000f@B\b?aN\u007fC?`\u00038\u001d `%H\u007f\u000b\u0001(.`\u0010%\u007fSQ\u0012\u0012>F\t:\u0001\u0014̂\t\u001a \u000e\u0007'\u000f8tg|7\u000fȔ^\u000361\u001e\u0002B|*&ݥ}\u0016\u0014Tp?\r%fdүA\u007fI#Bk\u00035Y\"ϱ\u0004Ճp<ߔgѧݳ/KyuDnHM#Jg\r\föVb\u000bQn\f?+}d{V\u0014(\u0006|\u0014\rj\u0007>\f-H<12f6\u0013czxSNV\u001a^p\u0007A˯5҆$ĮĴ/;!\u0007_\u0003\u0004*\\Y\u0014\u0005;AS\u0007|EsV$_C\u001a\u001bʄRyXNb`N8\u007f\u0004Ѿ\u00039i\u0010Q\u001c0u(uʜ\u0010~/3;s9Q&BȼTזk\u0003\r\u009b\u0001Uo[VJBp\u001cB8\u0015\\rRd\u001dk~U/\u0093\u001dܖ `\u000fâ \u0015&i\u0006JA'\u0016]]x:\u0003[_\"%]i\u000eձz«\u0012cAӔK7Wt\u001esrx\u001aRJvUxtHk\f\tc~ζ>̄iݘɧzC«\u0010!:?\u007f5L.7.j+h\u0005$YO\u0015Ȅ_cp\u0013\u0005ՀOR\u0002q$z(ɿT\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\u000b-9Xd]9!\u000eb\u001c$", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b+uBdb}EO\u000f@&m\u001d[+2\u001f!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0015{aytpC D\u0017$?ikMTM_E\u00036,[y\u0007\u001c?@p8z-\u0011\nm'", "5dc\u0010T5OO'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[\u001c@~\u0012<#", "Adc\u0010T5OO'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u0004\u00114", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", "5dc \\A>\u001b\u0002aBc)i\u0007", "u(9", "Adc \\A>\u001b)\u0010\u000fR\n\u0002\u000f", "uI\u0018#", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(MBG\u000fD\u000e,R}", "1n_F", "1n_F \u001c@#\u0002\b\tl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b+uBdb}EO\u000f@&m\u001d[+2\u001f}\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002&KifIImc\u0006s4\u001b]\nu\u001c=X>\tp6\u001508\u0015q\u0001]U\u0016HixS\u000bi=9\u00112I\u000fGY9", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j2);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default */
        public static /* synthetic */ DrawParams m4650copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, int i2, Object obj) {
            if ((1 & i2) != 0) {
                density = drawParams.density;
            }
            if ((2 & i2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((4 & i2) != 0) {
                canvas = drawParams.canvas;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                j2 = drawParams.size;
            }
            return drawParams.m4652copyUg5Nnss(density, layoutDirection, canvas, j2);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc */
        public final long m4651component4NHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss */
        public final DrawParams m4652copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            return new DrawParams(density, layoutDirection, canvas, j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m4002equalsimpl0(this.size, drawParams.size);
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m4007hashCodeimpl(this.size);
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m4010toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j2;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (1 | i2) != 0 ? DrawContextKt.getDefaultDensity() : density, (2 & i2) != 0 ? LayoutDirection.Ltr : layoutDirection, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? new EmptyCanvas() : canvas, (i2 + 8) - (i2 | 8) != 0 ? Size.Companion.m4015getZeroNHjbRc() : j2, null);
        }

        public final Density getDensity() {
            return this.density;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc */
        public final long m4653getSizeNHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk */
        public final void m4654setSizeuvyYCjk(long j2) {
            this.size = j2;
        }
    }
}
