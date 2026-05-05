package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d̉=!4i\bDJd|\u0004O\u000b8é6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XU2\u000f\u0002{<$i-yCAY\"}8\tWȞog\u0005Jb\u000bY\u000f\u000e\u0016~k4Icxe\u0012\u0015:JoU3UoS9ht<\u000e(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\u000e\u001a0VpBR\u0013^\r\u001a(\u0006F \u0007\u001fdgd6Plc=GB\u0011mZP=^^\u0002u\rtZW\u0011\u0005h6+n?{՝cھ\u0002ޗқ_A\tH\u007fG\u001d\u001c52CK\nVd](\u0014C1\u007f\u0011ky>\\3Y\u0011\u001c57go[R\u001e(&\u007f\f\u000fL\u0004<\u0014UUtƩ`Ɋ\u0007Ԅ\u07baxtYO^\u0012va\u000e\fy8-$.8S9Il\u0002eI f7*\rS̛aҠmďƟX\u0010f')^\u00101?dX?^M8^em2v\u0013\u00068\u000bHG.7,\u0015<+=7\nNSUy\u0018`tw\b\u0015o\u0017XׂVRF:~\u001c=C\u0019\u000e`J\u000b\u001f{adgZ\u0014ܖ ^\r\u0016\u0018\u0019&u\b>'+6i_jyj{y8<uϊuףm\u0088ް[;dPCo{goq\u000f\u0016U;\u0011\n\u0001fpY<^j/:2vr@,\ndf<#CO\u0001J9Ϝ5#b-X\t$[Q~\u000fe\u0001\u0003 \u0010dBR\u0006Ȑ(~\u000f\u0019`bv\twzO2#{2/QQc5Tlhׂrţ\"Ȕҋw\u0002M\tZid\f$\u0019m}6\u0015H>y/k\u0019?\u000379\u001a-sT9ϓ\u0010͠\u0011\u05fdϸ\u0001{\u0015_v8\u007fSx\u0016Db\u0001I}Y?\"%d#'\u0016k\u0018y\u0010N+Kqh#[l^#\tgbf:\u0013\u0004MEU\u0017}8\u0015G=E7\u001dD|$1%a\f\u0012\u007f0\nb=B#|JϽ*ޗn̥жa4AaW\u0004\u0017\u00160O\u0005\u0005XG\u0019|0B7:=7VH|p\u0005@}?=\u001e~7<\u001e\u0001e\n?݇s\b:Fo0y\\\u000e\u0016dIK+]dw|\u001csů\u000fT\u0015\"\u001b\u00027\b\"\u001eC&|rr\u000b@\u0006\"4dX\u0002اCĮ\bӗҬ0>\u000e7Qv\u0002%\u001e(\u0018Hu\u000eE7jsi\\>X\u0007cnH3h\fǾ_Ț\u007fϓܓ7 ~c?\u000f\u0006&b^{4\u0017RK\u000eCj}\u0005\u0017)9Kl9I0\t\u0005\u0019YuCw\u0017f8UI\u0006\u001c\u007f\u001dH'+\"Ð\u001c%?i!e|In\r[jt~\u0007#va|%Ĺ\u0003\u0005\u0003&L\u0010\u0015$)Qxu\tH\\P\b7q6/.\u000b͉EӒ{ݭ̍\u001f/\fe;[aB\"X\u0014Yi:,\rH U\n%%j^&f8eKn$\u0012.\u0013\u0012\u001a#_N\t̛N~x\">\u000e<h\u00125\b\u0019\u0005s{\t1OU.˭\nLQ\u0001\t\u0010i\u0006sp[\u0011)\u0002AX\nn[lK mӔlöWŔϳ\u0015U&\u000b\u001f\",ݼ%-i bW,wc\u0017%\u001caa\r9d\u00046q3@RL&/{\u0006\u0004XpV\"kbS>r?trRY\u001e^\u0019D\u0013,<5\u001a|\r\u0001v\u0017#6VrL\u0001]nISiF_\u0011\u0017\u0015UXT&ܳVI!OB\u0011uA\u0007\u0013\t@\t\u000f\u0010;R\u0018!(\u05ff07LlM -r4oj\tL\u0006U:R\bZ-<(uիvԯB\\(WSȼ2OL)\u0001CT.o5Me4_\t=o\u0011\u000e\u0011\u001cm~܊oDyO\u0003)5(\u007f\u001d]labEv\\6:\u0007ʩN\tS{f\u0015gEY7K$ \u0014P\u0011\u001a.RLԹy-\u0006]AN0xlB\\y}C6,Fnr?u))\u0013\u0018b\u00023\u0004ukpbF˒\u0018#JV:3r UOn\u007f1^\u001dG$7=\"W@G\u0007\u001e\b\nF;K\u0003M]x\fsC}\u0012zJgF{W@\b84dBZq,\u0003og^>_BA\u001b=\u0010abq\u0010oK\u001dĔO\u0001LNl~SZr\rF\u0015Jx>S\u001c\u001a4>ǽL!\b\u0016Zf\u001b,CIyGmLf}1\u001d?wS\u001dk١)ߒCU\u007f\u001bUػ2\u00191bXc\u0002\u0005\u0005\u0004U{v1\u0015\u000e C:WXN\u001aX\u0001\u0016\u0010Udv,r\u0006t4s0>fh\u0005jEm\u0001J;k\rEq\u00052posj!-GW\u001dn\u0004Z]-\u0010<(q)$\u001b-\u0002>ߊ'}\u0013IN\u0002\u000euYW\u0003so*\u0013rZ0].ܽ3KQ\u0005fkE2gA\u0005\u0012Fa4\b#$\u0011\u0004A\u0001T݈\u001e̿P6dd`ÂX\u001f+Zj=\u0017\u001d\f\\@hg\f=\u0014Fz(E=o@ZV\u0001\u000bWO\u0019\u0018Xr rzY[{C{)@Aq?\u007f}\u0017DzW\\fv/]6B#\u0002H9T\u0019,|7u/\u0006s~z\u0003\u0003eؕ]>qHt\u007fx\u007ft@iDbb|*v^,\u001eэHl\u000fx\u0001NG)rn2-\\\u0003z\u001b\u0011\u0001y}E+}ݵ5ƛk3H]yͪRkk_J4*\u0013a&I,o96\u001b%D\t%\u0007Nf!,|\u0007]02\b]?vfF\u001c;\u0011?sx\n:\u000e:\u00193c\u001f_XQ\u0004W\u000bj\u000f%.\u001aosg~QG\u0011`T8B^h\n\u001d]\u05f9)8\u0002\u001e/\u0018H\u0015EnGy\"Mg\u0003_C\f!ă\u0002s}8\u001dq\u0018\u001dsL)U\u0010\u001d!_>M&#\bS \u0382@ܢ&)2C-X\u0010\u0011LJ`0K\u0001=<HNtu\u0011%7m<?\u0003/&>}@\u0004f\flDCMU\f\u001bs:uʞF¡HԄȽ/I\u0014\u0013$Jg\u001e{>s?j\u0015`\f\u0018\u0004_\u0016$diI/w6jd{H5_\u000f$l[.H_vp|v~}>JF\u0013\"+Vu?\"nL\u0010puJS\u0015\u0001\u001fGQsi\u001bF!(\u000f@l\u001fUǐ\u001fҥ\rۺĳ\tMje$\u0006]*N\u0019-[2u\fQPmxo66\"wD>M\u0010Cr%\u007f``Eg\r\u000ee%\u001e'\u001dk6~v\u07b4\u0006˭Yʉˋ_\n\u0014\u0019t\\h)OV\u0005.%\u0005\u001b\u0017me2.S)5C\u0014!.\u0005ݛkԝ̈lUjL,Asw5\u0004\u0016\u0006O\u0016i\u001fDbT\f\u000e\ts4}\u000bGͿ\u008a\u0012³˳G0\u000ei\u0013<d6CaY1ma\u0019\u0019Y}\u0010bP\f%%O0;(6\u001b\u0005\u001f\u007f\u00178\"q\u0018\u0007\u001d}\t>8w2Oկ\u0010ʄy͞Ŀ\u0014\"[hM\u001a3plݞ\u0018!w/\u0007Ƽ\u000bۮPo\u0006.xo\u000b\u0006l\u0011gqj\\UԪ8ޅ,\u0012.RI\u0014\u0003hR)s(r\u001adٯ!\u06dd(2\u0014əϾ\u001bap\u0001uٲn\u0011\u0011ı8H"}, d2 = {"2dU.h3MB#\u000fxa\u001a\u0004\u0013:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", ";nd@X\u001aE]$", ";nd@X\u001bHB#\u000fxa\u001a\u0004\u0013:R{7\u007fJ", "", "/vP6g\u000bKO\u001bh\b<(\u0006\u0007/l\u0007$\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "/vP6g\u000bKO\u001bh\b<(\u0006\u0007/l\u0007$\u000bD\u000b ^Tx}\u001a}$\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27YC\u001e!a\u0012Wt\u000b\u000ffK4}H@\u001f\u0016u'\fDw\u0005\u0015&\nDnzK,S.~\u0011\u0007=roBbaC1>Jb(sa", "/vP6g\u000bKO\u001bh\bN7", "6`b\u0011e(@U\u0019}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "/vP6g\u000bKO\u001bh\bN7D\u000e\u00195K7N\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000e,vM\u0004$|E22Dcl\u0004WPIk*rU='eI>-$m(\u001frY\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u000er{*eM^\u0013 Eo\u0015Cr49c\u0007", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u000er{*eM^\u0013 Eo\u0015Cr49c\u0007gDv\u0006\fTB\u001f", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001ao\u00041\u000b@\u000e\u0005\u001eQzwIT!>W}'>i%2WL", ">nX;g,KB-\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "=m?<\\5MS&l\u0002h7i\t+c\u0003(z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1gP;Z,", "=uT?F3H^", "", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001ao\u00041\u000b@\u000e\u0005\u001eQzwIT!>W}'>i%2WL\u0003m\u0013|\u001cGh\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27V$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e.\u007f\u001f\u0005H-q\u0010Wi\u0007QQTf3d\u001a)zfCI(\u001d\u0002\u0015*lZ7_?:\u0016ncu1nC\"|\u0002\u000e;r[DTE", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001eo\u0010&~.\b!\"1|k8\u007f#5`\u0005\u001cFq 7", "=mC<h*AA \t\u0006K,x\u00072e~", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001eo\u0010&~.\b!\"1|k8\u007f#5`\u0005\u001cFq 7\u0015H%;\u007f-g;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000f,vM\u0004$|E22Dcl\u0004WPIk*rU='eI>-$m(\u001frY\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "/vP6g\u0013H\\\u001bi\b^:\u000br<C{1y@\b\u001e\u0013Vs\u0018E", "/vP6g\u0013H\\\u001bi\b^:\u000br<C{1y@\b\u001e\u0013Vs\u0018E>2>I['6Q", "/vP6g\u0017HW\"\u000ezk\u001a\u0004\u0013:O\r\u0006wI~\u0017\u001eNk\u001d@\u0001.", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/vP6g\u0017HW\"\u000ezk\u001a\u0004\u0013:O\r\u0006wI~\u0017\u001eNk\u001d@\u0001.|d\u0007q\u0017L\n\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27V$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:DV\u001eV\n\"uOrRS]_\u0003V=Tf4maF#fIA(\u001d;\u001e,p\u001a/\u001a\u0005Q v\\\u0003u1()\u000463Bwd\u0013\u001bV[F\u0004.#TEu\u001c?b\u0005:x6\u0004Bs\u0014n\u000eZk!NZ\b\u00196e\u0017j\r;8$;\u0015jqu@WR\u001cf\b\fq\u000b", "/vP6g\u001bHc\u0017\u0002he6\br<C{1y@\b\u001e\u0013Vs\u0018E", "/vP6g\u001bHc\u0017\u0002he6\br<C{1y@\b\u001e\u0013Vs\u0018E>*\u001f)I/\n@", "/vP6g\u001d>`(\u0003xZ3[\u0016+gi5Y<\n\u0015\u0017Nv\nKz/>", "/vP6g\u001d>`(\u0003xZ3[\u0016+gi5Y<\n\u0015\u0017Nv\nKz/>!\u000b)'K\u001d-1", "/vP6g\u001d>`(\u0003xZ3g\u00133n\u000f(\t.\b!\"1|k8\u007f#5`\u0005\u001cFq 7", "/vP6g\u001d>`(\u0003xZ3g\u00133n\u000f(\t.\b!\"1|k8\u007f#5`\u0005\u001cFq 7\u0015E\u001aJ;|\u001cH", "/vP6g\u001d>`(\u0003xZ3k\u0013?c\u0003\u0016\u0003J\f\u0001$%k\u0017:v,<U\r$Av", "/vP6g\u001d>`(\u0003xZ3k\u0013?c\u0003\u0016\u0003J\f\u0001$%k\u0017:v,<U\r$Av]37\u0013\u0007z\u0007p", "2dc2V;\u001d`\u0015\u0001\\^:\f\u0019<e\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "=m3?T.,b\u0015\f\n", "=m3?T.\u001e\\\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=m3?T.\u001cO\"|ze", "=m3?T.", "2qP444Hc\"\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nWkt;t\u007fIZ\u0019\u0011~&}\u000b*xOWn}QJS,\u000bt\u0015],`DCniX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0i!b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\f!J{vM\u0015l(+\u0006\u0018o?A(incVXdg j9jo|FV\u0010G\u001f3{,B\u0010>%\u0001\u0011\u0012\tmWbNC\u0019cV", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "2nf;", "Ak^=G9BU\u001b~\b</x\u00121e", "=uT?F3H^\u0003\u007f{l,\f", "Ag^B_+\u001ae\u0015\u0003\nM6\r\u00072S\u00072\u0007", "=qX2a;:b\u001d\t\u0004E6z\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nYkt;t\u007fIZ\u0019\u0011~&}\u000b*xOWn}QJS,\u000bt\u0015],`DCoiX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0i!b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\n!Jqu=\u001br#`\u001bW`?9$osc\u0012\u0010\u0011m Z1pc\u000b@\u001c\b>W~%4F\r\fE\u0007\u0019\t\u00103itMM$*g zS)c\u001aL\bw e/&FW\u001el4hE\u0017s\u0019q6\u001b\u007fcLaF/\u0016wZy_`9\"@\u0006\u001bY07T<\u0005\u001c!y\u0019%8\n\u001bz,wsKOyy*!NU\u0002i\\8\r1=\u001f\u001eg6+t", "2dc2V;\u001d`\u0015\u0001\\^:\f\u0019<e\u000e\u0004|O\u0001$}Qx\u0010'\u0004%Cg", "2dc2V;!]&\u0003\u0010h5\f\u00056D\r$}\"\u0001%&W|\u000eJ", "=m7<e0S]\"\u000eve\u000b\n\u00051", "2dc2V;/S&\u000e~\\(\u0004g<a\u0002\n{N\u0010'$G}", "=mE2e;BQ\u0015\u0006Yk(~", "2qP4", "2qP4 1(#d\u000eM1", ";nc6b5\u001c]\"\r\u000bf,{", "2qP4 \u001dG/\r\u000bF`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000e,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\ri-e963\u0018{\"djP<\u0019\f`\u0011\u0001\u001cctkG\"\n43Bwd\u001c,u_K{+(\u0015\u0001\t\u001a{Y\u00054r<\b>3D.e[p\u0016Mb\u0003\u001ew2(-0EC\u0017H\u0015a\u007fyH\u001ew#j\b\u001c,\u0013;\"tilX\u000b\u0016a!d\u000b%F\u00063c\u0002\bPk\u001e)\u0010h?`y\u0013\u0018\\", "6na6m6Gb\u0015\u0006Yk(~", "6na6m6Gb\u0015\u0006Yk(~P4OOs\u000b\u0013S", "7r?<\\5MS&n\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "7r?<\\5MS&n\u0006&\u000b\u0005zyfL:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\HoC", ">nX;g,KA \t\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", ">nX;g,KA \t\u0006&\fOv\u001aZ`\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~J\u0002 IK 7NG={A\u001a$lkB\\Go/", "DdaA\\*:Zw\fv`", "DdaA\\*:Zw\fv`s\u0002r~1\u000fzN", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0045, code lost:
    
        if (r4.isConsumed() == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x010f -> B:126:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0113 -> B:126:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0131 -> B:82:0x0041). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m753awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, long r13, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r15, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r16) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m753awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x005b -> B:38:0x0031). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m759dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, long r6, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L5e
            r4 = r9
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r4 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5e
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L64
            java.lang.Object r8 = r4.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r5 = r4.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r3)
        L31:
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            if (r3 != 0) goto L3b
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L3b:
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r3)
            if (r0 == 0) goto L46
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        L46:
            r8.invoke(r3)
            long r6 = r3.m5383getIdJ3iCeTQ()
            goto L51
        L4e:
            kotlin.ResultKt.throwOnFailure(r3)
        L51:
            r4.L$0 = r5
            r4.L$1 = r8
            r4.label = r1
            java.lang.Object r3 = m746awaitDragOrCancellationrnUCldI(r5, r6, r4)
            if (r3 != r2) goto L31
            return r2
        L5e:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r4 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r4.<init>(r9)
            goto L19
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m759dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x008c, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r9) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x00bc -> B:69:0x0031). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m746awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m746awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m764invokek4lQ0M(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m764invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function1 = AnonymousClass2.INSTANCE;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            function0 = AnonymousClass3.INSTANCE;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function02 = AnonymousClass4.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass4 INSTANCE = ;

        AnonymousClass4() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007tʑQ0rdx2`SB\u000f\u001a|d(i&\nCiVJ\u00020\fgN\u0016k5RҼ\u000fE\u0015\u000b$~"}, d2 = {"\n`]<a@F])\rS", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "Ak^=G9BU\u001b~\b</x\u00121e", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzMo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006\u001etkEE\bG", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001#\u00117Y\u0011\u0005s\u000b\u0010\u001f\u001d5w:-`\u0014P\t\u0015\u0003%2sVh=|CJGb\u007fIOP"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function3<PointerInputChange, PointerInputChange, Offset, Unit> {
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Function1<? super Offset, Unit> function1) {
            super(3);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
            m765invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-0AR0LA0 */
        public final void m765invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
            function1.invoke(Offset.m3926boximpl(pointerInputChange2.m5385getPositionF1C5BW0()));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$6 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ Function0<Unit> $onDragEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Function0<Unit> function0) {
            super(1);
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(PointerInputChange pointerInputChange) {
            function0.invoke();
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5
            final /* synthetic */ Function1<Offset, Unit> $onDragStart;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(Function1<? super Offset, Unit> function12) {
                super(3);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                m765invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.m3947unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-0AR0LA0 */
            public final void m765invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
                function1.invoke(Offset.m3926boximpl(pointerInputChange2.m5385getPositionF1C5BW0()));
            }
        }, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.6
            final /* synthetic */ Function0<Unit> $onDragEnd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Function0<Unit> function03) {
                super(1);
                function0 = function03;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function0.invoke();
            }
        }, function02, AnonymousClass7.INSTANCE, null, function2, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$7 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function0<Boolean> {
        public static final AnonymousClass7 INSTANCE = ;

        AnonymousClass7() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return true;
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass9(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071a#%5'&8\t8(/\u0010/>@B@4Ct\u000b", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {247, 253, 972, 1014, 1025}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "XdkZ[WN+EQT", "PmcOfJQ\\9B96FJ", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "SeyT", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "cewIZINVF\u001eK><=35%Z+\u001d", "cewIZINVF}O@", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "SeyT", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "cewIZINVF\u001eK><=35%Z+\u001d", "ShcM7lGUJ}O@", "cewIZINVF}O@", "\u0013jjOe\u001aFY7AE?\t>\u00154s\u00103W\u0019Z\u0010!", "^hkK`jC[?ITm@P", "\u0013jjOe\u001aC^7CZ\u000eI;&\u0015%\f2\u0006'h\u000b\u0015eOWvFN&oi\u001al\\", "_ekTf[T\u000b?P\n3M"}, s = {"xQ^", "xQ^", "xQ_", "\u0007Q^", "xQ^", "xQ_", "xQ`", "xQb", "xQc", "rQ^", "xQ^", "xQ_", "xQ`", "xQb", "xQc", "xQd", "rQ^", "xQ^", "xQ`", "xQa", "xQb"})
    static final class AnonymousClass9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
        final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref.LongRef $overSlop;
        final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
        float F$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(Function0<Boolean> function0, Ref.LongRef longRef, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.$shouldAwaitTouchSlop = function0;
            this.$overSlop = longRef;
            this.$orientationLock = orientation;
            this.$onDragStart = function3;
            this.$onDrag = function2;
            this.$onDragCancel = function02;
            this.$onDragEnd = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            anonymousClass9.L$0 = obj;
            return anonymousClass9;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:193:0x00c6, code lost:
        
            if (((r8 != null ? r8 == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.geometry.Offset.m3938getYimpl(r1) : androidx.compose.ui.geometry.Offset.m3937getXimpl(r1) : androidx.compose.ui.geometry.Offset.m3935getDistanceimpl(r1)) == 0.0f) == false) goto L162;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x0151, code lost:
        
            if (r10 == false) goto L229;
         */
        /* JADX WARN: Code restructure failed: missing block: B:231:0x01c8, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m761isPointerUpDmW0f2w(r4.getCurrentEvent(), r0) != false) goto L163;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:178:0x0094, B:187:0x00b6], limit reached: 135 */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0202 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:241:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x02fa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:282:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:286:0x0281 A[SYNTHETIC] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0169 -> B:226:0x0194). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x0248 -> B:225:0x0193). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:266:0x0298 -> B:226:0x0194). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x02ca -> B:222:0x018c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x02f8 -> B:155:0x0034). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 771
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.AnonymousClass9.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04422 extends Lambda implements Function1<Offset, Unit> {
        public static final C04422 INSTANCE = ;

        C04422() {
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m766invokek4lQ0M(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m766invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04433 extends Lambda implements Function0<Unit> {
        public static final C04433 INSTANCE = ;

        C04433() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function1 = C04422.INSTANCE;
        }
        if ((2 & i2) != 0) {
            function0 = C04433.INSTANCE;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function02 = C04444.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04444 extends Lambda implements Function0<Unit> {
        public static final C04444 INSTANCE = ;

        C04444() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071a#%5'&8\t8(/\u0010/>@B@4C\u00128G9G\"FF@*MAPQ\u0003\u0015", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 1, 2}, l = {ExifDirectoryBase.TAG_TILE_LENGTH, ExifDirectoryBase.TAG_TILE_OFFSETS, 329}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c"}, s = {"xQ^", "xQ^", "xQ^"})
    static final class C04455 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04455(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super C04455> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04455 c04455 = new C04455(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            c04455.L$0 = obj;
            return c04455;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C04455) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x005f A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:74:0x0088, B:75:0x008b, B:77:0x0093, B:79:0x00a2, B:81:0x00ae, B:82:0x00b1, B:83:0x00b4, B:84:0x00ba, B:67:0x0058, B:68:0x005b, B:70:0x005f, B:63:0x0041, B:64:0x0044, B:60:0x002f), top: B:90:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0093 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:74:0x0088, B:75:0x008b, B:77:0x0093, B:79:0x00a2, B:81:0x00ae, B:82:0x00b1, B:83:0x00b4, B:84:0x00ba, B:67:0x0058, B:68:0x005b, B:70:0x005f, B:63:0x0041, B:64:0x0044, B:60:0x002f), top: B:90:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00ba A[Catch: CancellationException -> 0x00c2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:74:0x0088, B:75:0x008b, B:77:0x0093, B:79:0x00a2, B:81:0x00ae, B:82:0x00b1, B:83:0x00b4, B:84:0x00ba, B:67:0x0058, B:68:0x005b, B:70:0x005f, B:63:0x0041, B:64:0x0044, B:60:0x002f), top: B:90:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C04455.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 */
        /* JADX INFO: compiled from: DragGestureDetector.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function2.invoke(pointerInputChange, Offset.m3926boximpl(PointerEventKt.positionChange(pointerInputChange)));
                pointerInputChange.consume();
            }
        }
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04455(function1, function0, function02, function2, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0048, code lost:
    
        if (r4.isConsumed() == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0120 -> B:126:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0124 -> B:126:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0142 -> B:82:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m756awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, long r13, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r15, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r16) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m756awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x004c, code lost:
    
        if (r4.isConsumed() == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0121 -> B:126:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0125 -> B:126:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0143 -> B:82:0x0048). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m755awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, int r18, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r19, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m755awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00c3, code lost:
    
        if ((r1 == 0.0f) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00f5, code lost:
    
        if (m761isPointerUpDmW0f2w(r15.getCurrentEvent(), r0) != false) goto L95;
     */
    /* JADX WARN: Path cross not found for [B:109:0x0091, B:118:0x00b3], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0111 -> B:86:0x0041). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: verticalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m763verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m763verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0099, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m3938getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r9)) == 0.0f ? 1 : 0) == 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00c9 -> B:71:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m754awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m754awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04502 extends Lambda implements Function1<Offset, Unit> {
        public static final C04502 INSTANCE = ;

        C04502() {
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m768invokek4lQ0M(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m768invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04513 extends Lambda implements Function0<Unit> {
        public static final C04513 INSTANCE = ;

        C04513() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((1 & i2) != 0) {
            function1 = C04502.INSTANCE;
        }
        if ((2 & i2) != 0) {
            function0 = C04513.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            function02 = C04524.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04524 extends Lambda implements Function0<Unit> {
        public static final C04524 INSTANCE = ;

        C04524() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071a#%5'&8\u001b+9<2-,8\u0011@07\u00187FHJH<K|\u000f", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 1, 1}, l = {479, 481, 489}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "^lgXEbQW"}, s = {"xQ^", "xQ^", "xQ_"})
    static final class C04535 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04535(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C04535> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onVerticalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04535 c04535 = new C04535(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c04535.L$0 = obj;
            return c04535;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C04535) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r13.label
                r0 = 3
                r2 = 2
                r3 = 1
                if (r4 == 0) goto L2a
                if (r4 == r3) goto L44
                if (r4 == r2) goto L72
                if (r4 != r0) goto Lb7
                kotlin.ResultKt.throwOnFailure(r14)
            L14:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r0 = r14.booleanValue()
                if (r0 == 0) goto L24
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.$onDragEnd
                r0.invoke()
            L21:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L24:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.$onDragCancel
                r0.invoke()
                goto L21
            L2a:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                r10 = r13
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r13.L$0 = r7
                r13.label = r3
                r8 = 0
                r9 = 0
                r11 = 2
                r12 = 0
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r7, r8, r9, r10, r11, r12)
                if (r14 != r1) goto L43
                return r1
            L43:
                goto L4b
            L44:
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                kotlin.ResultKt.throwOnFailure(r14)
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
                r4.<init>()
                long r8 = r14.m5383getIdJ3iCeTQ()
                int r10 = r14.m5388getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r11 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r11.<init>()
                kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                r12 = r13
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r13.L$0 = r7
                r13.L$1 = r4
                r13.label = r2
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m755awaitVerticalPointerSlopOrCancellationgDDlDlE(r7, r8, r10, r11, r12)
                if (r14 != r1) goto L71
                return r1
            L71:
                goto L7d
            L72:
                java.lang.Object r4 = r13.L$1
                kotlin.jvm.internal.Ref$FloatRef r4 = (kotlin.jvm.internal.Ref.FloatRef) r4
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                kotlin.ResultKt.throwOnFailure(r14)
            L7d:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                if (r14 == 0) goto L21
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r13.$onDragStart
                long r2 = r14.m5385getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3926boximpl(r2)
                r5.invoke(r2)
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r3 = r13.$onVerticalDrag
                float r2 = r4.element
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)
                r3.invoke(r14, r2)
                long r2 = r14.m5383getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r6 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r4 = r13.$onVerticalDrag
                r6.<init>()
                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                r5 = r13
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r4 = 0
                r13.L$0 = r4
                r13.L$1 = r4
                r13.label = r0
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m763verticalDragjO51t88(r7, r2, r6, r5)
                if (r14 != r1) goto L14
                return r1
            Lb7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C04535.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 */
        /* JADX INFO: compiled from: DragGestureDetector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function2.invoke(pointerInputChange, Float.valueOf(Offset.m3938getYimpl(PointerEventKt.positionChange(pointerInputChange))));
                pointerInputChange.consume();
            }
        }
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04535(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0045, code lost:
    
        if (r4.isConsumed() == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x011d -> B:126:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0121 -> B:126:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x013f -> B:82:0x0041). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m750awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, long r13, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r15, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r16) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m750awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x004c, code lost:
    
        if (r4.isConsumed() == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0121 -> B:126:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0125 -> B:126:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0143 -> B:82:0x0048). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m749awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, int r18, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r19, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m749awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00c0, code lost:
    
        if ((r1 == 0.0f) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00f2, code lost:
    
        if (m761isPointerUpDmW0f2w(r15.getCurrentEvent(), r0) != false) goto L95;
     */
    /* JADX WARN: Path cross not found for [B:109:0x008e, B:118:0x00b0], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x010e -> B:86:0x003e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: horizontalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m760horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m760horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0099, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m3937getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r9)) == 0.0f ? 1 : 0) == 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00c9 -> B:71:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m748awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, long r16, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m748awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04462 extends Lambda implements Function1<Offset, Unit> {
        public static final C04462 INSTANCE = ;

        C04462() {
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m767invokek4lQ0M(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m767invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04473 extends Lambda implements Function0<Unit> {
        public static final C04473 INSTANCE = ;

        C04473() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function1 = C04462.INSTANCE;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = C04473.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            function02 = C04484.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function02, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04484 extends Lambda implements Function0<Unit> {
        public static final C04484 INSTANCE = ;

        C04484() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071a#%5'&8\r591C99@.:\u0013B29\u001a9HJLJ>M~\u0011", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 1, 1}, l = {IptcDirectory.TAG_SOURCE, 629, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "^lgXEbQW"}, s = {"xQ^", "xQ^", "xQ_"})
    static final class C04495 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04495(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C04495> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onHorizontalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04495 c04495 = new C04495(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c04495.L$0 = obj;
            return c04495;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C04495) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r13.label
                r0 = 3
                r2 = 2
                r3 = 1
                if (r4 == 0) goto L2a
                if (r4 == r3) goto L44
                if (r4 == r2) goto L72
                if (r4 != r0) goto Lb7
                kotlin.ResultKt.throwOnFailure(r14)
            L14:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r0 = r14.booleanValue()
                if (r0 == 0) goto L24
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.$onDragEnd
                r0.invoke()
            L21:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L24:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.$onDragCancel
                r0.invoke()
                goto L21
            L2a:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                r10 = r13
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r13.L$0 = r7
                r13.label = r3
                r8 = 0
                r9 = 0
                r11 = 2
                r12 = 0
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r7, r8, r9, r10, r11, r12)
                if (r14 != r1) goto L43
                return r1
            L43:
                goto L4b
            L44:
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                kotlin.ResultKt.throwOnFailure(r14)
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
                r4.<init>()
                long r8 = r14.m5383getIdJ3iCeTQ()
                int r10 = r14.m5388getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r11 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r11.<init>()
                kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                r12 = r13
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r13.L$0 = r7
                r13.L$1 = r4
                r13.label = r2
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m749awaitHorizontalPointerSlopOrCancellationgDDlDlE(r7, r8, r10, r11, r12)
                if (r14 != r1) goto L71
                return r1
            L71:
                goto L7d
            L72:
                java.lang.Object r4 = r13.L$1
                kotlin.jvm.internal.Ref$FloatRef r4 = (kotlin.jvm.internal.Ref.FloatRef) r4
                java.lang.Object r7 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                kotlin.ResultKt.throwOnFailure(r14)
            L7d:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                if (r14 == 0) goto L21
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r13.$onDragStart
                long r2 = r14.m5385getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3926boximpl(r2)
                r5.invoke(r2)
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r3 = r13.$onHorizontalDrag
                float r2 = r4.element
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)
                r3.invoke(r14, r2)
                long r2 = r14.m5383getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r6 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r4 = r13.$onHorizontalDrag
                r6.<init>()
                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                r5 = r13
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r4 = 0
                r13.L$0 = r4
                r13.L$1 = r4
                r13.label = r0
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m760horizontalDragjO51t88(r7, r2, r6, r5)
                if (r14 != r1) goto L14
                return r1
            Lb7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C04495.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 */
        /* JADX INFO: compiled from: DragGestureDetector.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(PointerInputChange pointerInputChange) {
                function2.invoke(pointerInputChange, Float.valueOf(Offset.m3937getXimpl(PointerEventKt.positionChange(pointerInputChange))));
                pointerInputChange.consume();
            }
        }
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04495(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ca, code lost:
    
        if ((r1 == 0.0f) == false) goto L89;
     */
    /* JADX WARN: Path cross not found for [B:101:0x0098, B:110:0x00ba], limit reached: 67 */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0117 -> B:82:0x0049). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-VnAYq1g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m757dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r10, long r11, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r13, androidx.compose.foundation.gestures.Orientation r14, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r15, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m757dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, androidx.compose.foundation.gestures.Orientation, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: drag-VnAYq1g$$forInline */
    private static final Object m758dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (m761isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j2;
            while (true) {
                InlineMarker.mark(0);
                Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (Boolean.valueOf(PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.m5383getIdJ3iCeTQ();
                } else {
                    long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(((orientation == null ? Offset.m3935getDistanceimpl(jPositionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Offset.m3938getYimpl(jPositionChangeIgnoreConsumed) : Offset.m3937getXimpl(jPositionChangeIgnoreConsumed)) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function12.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.m5383getIdJ3iCeTQ();
        }
    }

    /* JADX INFO: renamed from: awaitDragOrUp-jO51t88 */
    private static final Object m747awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j2, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j2;
        while (true) {
            int i2 = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.m5383getIdJ3iCeTQ();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-pn7EDYM */
    private static final Object m752awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Continuation<? super PointerInputChange> continuation2 = continuation;
        if (m761isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float fM762pointerSlopE8SPZFQ = m762pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j2;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation);
        while (true) {
            int i3 = 0;
            InlineMarker.mark(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation2, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m5383getIdJ3iCeTQ();
            } else {
                Offset offsetM841addPointerInputChangeGcwITfU = touchSlopDetector.m841addPointerInputChangeGcwITfU(pointerInputChange3, fM762pointerSlopE8SPZFQ);
                if (offsetM841addPointerInputChangeGcwITfU != null) {
                    function2.invoke(pointerInputChange3, offsetM841addPointerInputChangeGcwITfU);
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                }
            }
            continuation2 = continuation;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0030  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m751awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r10, long r11, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L30
            r7 = r13
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r7 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r7
            int r0 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L30
            int r0 = r7.label
            int r0 = r0 - r2
            r7.label = r0
        L19:
            java.lang.Object r2 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r8 = 1
            r0 = 0
            if (r1 == 0) goto L42
            if (r1 != r8) goto L3a
            java.lang.Object r9 = r7.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r5 = r7.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            goto L36
        L30:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r7.<init>(r13)
            goto L19
        L36:
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            goto La9
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L42:
            kotlin.ResultKt.throwOnFailure(r2)
            androidx.compose.ui.input.pointer.PointerEvent r1 = r10.getCurrentEvent()
            boolean r1 = m761isPointerUpDmW0f2w(r1, r11)
            if (r1 == 0) goto L50
            return r0
        L50:
            androidx.compose.ui.input.pointer.PointerEvent r1 = r10.getCurrentEvent()
            java.util.List r9 = r1.getChanges()
            int r4 = r9.size()
            r3 = 0
        L5d:
            if (r3 >= r4) goto L78
            java.lang.Object r5 = r9.get(r3)
            r1 = r5
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            long r1 = r1.m5383getIdJ3iCeTQ()
            boolean r1 = androidx.compose.ui.input.pointer.PointerId.m5367equalsimpl0(r1, r11)
            if (r1 == 0) goto L75
        L70:
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            if (r5 != 0) goto L7a
            return r0
        L75:
            int r3 = r3 + 1
            goto L5d
        L78:
            r5 = r0
            goto L70
        L7a:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r4.element = r5
            androidx.compose.ui.platform.ViewConfiguration r1 = r10.getViewConfiguration()
            long r2 = r1.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            r1.<init>(r4, r9, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            r7.L$0 = r5     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            r7.L$1 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            r7.label = r8     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            java.lang.Object r1 = r10.withTimeout(r2, r1, r7)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> La2
            if (r1 != r6) goto La9
            return r6
        La2:
            T r0 = r9.element
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            if (r0 != 0) goto Laa
            r0 = r5
        La9:
            return r0
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m751awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w */
    public static final boolean m761isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z2 = true;
        }
        return true ^ z2;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ */
    public static final float m762pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.m5457equalsimpl0(i2, PointerType.Companion.m5462getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl((float) 0.125d);
        mouseSlop = fM6638constructorimpl;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(18);
        defaultTouchSlop = fM6638constructorimpl2;
        mouseToTouchSlopRatio = fM6638constructorimpl / fM6638constructorimpl2;
    }
}
