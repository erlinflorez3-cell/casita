package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0RnP.XS2\u000f\u0002{<$a$yCQU\"Ԃ*\teNogtMb\u000bY\u000f\u000e\u0016~\u00144Ikxe܈\u00172XoG3SyC˨`\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCVY\u0011*0nvjV\u001bT\u001d\u001a@\u000e\u0005%Ә\"\\uW~ezbR/Q\t\u001aF\\.w0+U=LZ'\u001b\u0001y\u001eYK}:չ)S\u0011\u0013\u001b¼?\u0011L\n=3vW-1I\u0002fNX.$E1U\rk\u0004>\\3a\u0011\u0012-+]ucP<8(\u0001\u0002\rJ\u0017&\u0006UX^3 f\u0016\"Kt!cpV\b^P\u0015\u0013ad-U\u00069+G2~Q\u0010KIT={\u0013%6#/~QaZ\u000en.3T&aaWF=Vh\"Yk}4vh\u00028\u001fHG.?,\u00174\u00173Ss9Q1\u001c\bNDu\u0014\u001d`\u0017c\u001aXN@0\r.7X\u0019<`Jd\u0013\u000bhT\u0007<AS\"T\u0015\u001e \u0013Nl(B'%\u001eogh\u0018z}c\u0010%=\tOY\u001d{>]?^AXic>q\u0003|\u001a?J\u0007\u001dX\u0015R\u0004\u0012`\\6GJH\u0019 (\u0002JN\u001a9J? ,d27\u0019j<`\u0003LRq\u0003\u000f_h\u0011(~\u0003Cj\bɦ#ڏ֊\u0005Rb\u001a}\u0012A̧-\u000bm:-o_e\u001f,U0\u0014L|Q\u0017/y\u0006Gux_L\u001b&&[\u0002 $+QQ]MC\u0015\u0005)@/EEz\u0003\u0016WS\u00125\r\u0015y=K\u00194m\bx\u001fD`\u0019Z\u007fZ\u001d\"\u0005q\u000b#6t0\u007fgF\t[{T9knOx\u0003gQf8+\u001bO$+\u0001}9\u00155[SW#\u001cw\"G-a\fy 4\u007fb\u001d?\re2<\u0014\u001cub_wJ;fY\n\u0005D\"2\b\u001bBvz(\u000eH\tB)KHot!\\>M\u0019L\u0016f5<=v\\[H1\b}b>\u00100yC\f3vCS!}Ymm{kt\u000bx\u001f:\u0011\u00021|34=Nf\bh\u000f0\u0014\u001606oK\u0013\u000bB\t2WD<6\u001bsZo\u0006\u001e\u001f\u0018F\u000e\u001fG8HsI{&T'l\u0007N\u000b`S\u00079*/\u000f?9$xC`\u001dmtd_i8\u0001aM!\u001b\u0019_/l++R|Q\u001bVh1\u0011K]Qz\u001a62WYsqo\u001aj0|KRH!?Q\u001f\u0013\u000f0\r\u001b\u0006jTd\u0005F~R|2Y\u0005\u0001|\u001cq\"\u000f9)\u007fxub;\u0003fweSJ\u0007\u001dD7>$|\u0012VK3\f5;uajB7,]Y;\fA8 U\u0014;&ȱVʪҁ\u000e_!t$-^ȡ\u0003\u0017 h 2<zzx\n<3NO0C2\u0019dYy$9@U;\u001d\fHKv\n\"c\u001bs\u001f[\u0011\u0003t^ny\u001d=\u0001#\u000f'[j+X\tJAY&X\u001f=,\u0015T/f\u000eh)\u001e\u000e{h\u001f{\u007fa\u0013+=\u001aBa_@\u0003$\u0004\u001f\b\t\u001c*\u00038EA\\MLx!\\\u001bR\b\u0014dj6y\r\fW*-\u0005N^\u001f*LF!.\u00155=\u0019-s%G\u000f\u00174KO&/Jj?IGb\u0011u(\u0005+\u001b:\u0011\u000500H\t\u0001\u001b\u007f,[V\u0005C 'g@\u0006d16{K>B\u0016I)\u000e??\u000b>&>j84;\u007fCq\u001f\u0017\u0001#W\u001eo5)epWS3J\u0019|/\u001do\u007f7kH\u0015OrQ??u!Wt]=5\u0014\\W\u0012\beX\"ec\u0005\u001f\u00122O5SB\u0012Un\u0010:%*$\u0014\u001b;\u007fsAx0e\\N|\fW26Z<tD1v\u0005x\"\u001a\\o\u001esr\fy4o\u000bD\u001fJ>8U\u0005\u0007s]\u0019\u007f\u0011D\u001bv,7=\u0016Y9\u001d|\u001e\u0002\n@YY#S5\\ko+s2Jbg<yUtq*4=BZijx#i_>HB\u0013\u0013\u0004\u0006gj`.pM\u001e-K\u0005}N\\']qh\u0011@\u001d\\v.p\u001c;\f\u001c.VP\u001a}xp[\u0018ҝFؓހK\u0014\\;/]Ys3G=g\u0019\noY\u007f\u001cU9aO4Iר4ƶۇ\tW'\u0011rq]ɻj9u_Vl(Z^\f\u000eSs`\u0010r\tt.s0>Ah~\tS\u000e\u0007\"\u001fKg-e-B\u0013=ad\u001f>OW\u001db\u0006)3x\u0010\u0017(AG#;$Y9@8\f\r_T,\u000ebIcE\u0006I>\u0013\u0012P'/\u0014\tGAy|\u0007kE\u0019e\n\u0017\fN7T\f\u0019$p3+i<2\u0010\tR6dD`K\b!\u0017Hp\u000f\t\u0011$.:H\u0006\fC\u0006\u001f\u007f45iop24p\u0017egj*:\u0016ultgl]+$)n7w\u0011qow\u0014\u001da\r^D\u0017eGX\u00130*M,g{VKH\u0017\u0004s\u001epyTn4q4\u001a@\u0015\u007fxfrb{>jX\u001d\u001flO\f@iD\u0011\u0019\u0011vNA\u001e\t\u0005,UFxp\u001f\u0001\u000fry\u0017BGt|)gAb:aPc$*ьIԑ¤nc}a\n\b{Ͱ\u000e}s\u0015\u00153L\u0017x\nl\u0013xH\u0004\u001a?bL`@*Yr'\u001cx80\u0014\f\u000b\u0016Dn\u0002b\u0002{%rr,;\u001eHQ\b?M!!\u00151<6B}^\u0001nf\u000b=.*\u0016O\u0018H{C\u007fYs*C\bwU4k2A}\u0018\bP\u0013q\u0012\u0012xb#}\u007f\u0013\u0017c.[@\u001fYjiq\b\u0010\"7m \u0015U\u0012x:P20m\u0019\u000fd(zltx3T}\f]\u0005&\u00148mL\u000f~]\u0016DqC[]\raE/ \u0018{Os~9d&IDJ\u007fRsui[l\u0016`\u0017 \n7\u0010\u0002\u007fsBE\b8h:kH\u001c_\u0003Bz{4 Zt\u0010\u0005v~q@C\u001c\r\"'VsW3p+e`u#S\t\u001f-gWKd\u0019h)(\u000fBn\u0018\u0015Hf\f&\u001b0\u0015{j \u0016Gk\u0011@y%\f\nmc_Q\u007fH\u001a8_\u0010}\u0016DM\u00185g\u001d$Vd5u\u0007!UQ\u001eWtU\b\u007faJG\fjP5a\b\u001c|~L~\u001dq\rr.\u0005*\u000b\u0017m%20K\"+w}\u0019\u0016\u0015frA]v\t|zL~\fa-0\f<9\u0013o/F\u0014*\b\u000e,s4}\u00061FN\u0013\u001aR[.6$5kR\u0005CCY1mc7\u001eߟv҂ȩF\u0007\u0013r/cSĴ)o4+oC6RI\u0019v)\u0019!\u0010JYU\u000f3Q\u0005'22>0\u0006\u0016E\n!svw.1y66s\u0017zdm,>\u001bupwlLgqjm/}<E6M>Ri$\u0013bJ'if\\\u0017<.O0*2\u001a\u001dH\u001b\u000bx.u|Rp%x4\u001dE\tF;+1\u0015>\u0001/\u0019Sc1\u0014LnmF\u0013%\u0017|VC '\r>\u0018\r87#\u0004\u0014\u0015}2JIy\u007f'kB\u000b:*\u0011$Tk\u0012\rZ\u001cE\u001adol(?<)\u000fH~E!ppz\u0004=b)r7\u0001a8O_j<D^W\u0001\u001c\u007f5P`_en]*G,>aEBceP,umCI35%\u001f\u0019\u001c%\t#5\u007f}v*m\u00126*\u001aB\rX\tC\u0019N&\":\u0014\u0003Ezib>rhU*$6}NUg\"j\u0019aB#RMH\u0012\u000fO\r\r4IE\u000bI:3RJQA\u001c{G\u0004\u0007\r\u0013\u00151K\u001a_0z\u0006+\u0004\"2\u007fh\u0010r\u0010{fK\u0006\u00187ua1`\u0012<VRo\u000bba\u0012z\u001br\u0018\u00192NQ\u0018\u001b\u0005vy:Nujj\u0005]r9.\u0014l6{s$Msf^\f<\u001dm!\u0017s%f\u0017\u0019E\u0017 M\u0015~j}\u0016\u000bk&1b^\u007f\u0002C\u0012\u0002]SxH`\u0017`tzGȾ\u001eďͰ.V&Y\u0019\u00108C,9dxtPʹe\u000b6ǘ2d.\u0010<tٶP?`\u0004cڏUi\u001cѬX0Ӿuh\u0005(?P\u0017?lͲԃ2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006V8@c\f 6L#8XBE}=\u0006\u0015qq\u0018\u0007d(^}6U\"", "", "u(E", "\u0017sT:66Gb\u0019\b\nI({\b3n\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "5dc\u0016g,F1#\b\n^5\fs+d~,\u0005B", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\"qP6_0GU||\u0005g", "", "3w_.a+>R", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u00114", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007-9^\u007f6KTNu:\\zH\u001e Z\u001b$\u000fpHJ", "=tc9\\5>R\b~\u000em\r\u0001\t6d]2\u0003J\u000e%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "BdgA66E]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "1n]AT0GS&\\\u0005e6\n", "1ta@b9\u001c] \t\b", "3qa<e\nN`'\t\b<6\u0004\u0013<", "Ad[2V;B]\"\\\u0005e6\n\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHtc3Nt6KVW\nfY|J\"g", "4nRBf,=0#\fy^9Z\u00136o\r", "CmU<V<LS\u0018[\u0005k+|\u0016\ro\u00072\t", "2hb.U3>Ru\t\b],\nf9l\n5", "3qa<e\tH`\u0018~\b<6\u0004\u0013<", "4nRBf,=:\u0019zyb5~l-o\t\u0006\u0006G\u000b$", "CmU<V<LS\u0018ezZ+\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "3qa<e\u0013>O\u0018\u0003\u0004`\u0010z\u00138C\n/\u0006M", "4nRBf,=B&z~e0\u0006\u000b\u0013c\n1YJ\b!$", "CmU<V<LS\u0018m\bZ0\u0004\r8gc&\u0006I^!\u001eQ|", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "3qa<e\u001bKO\u001d\u0006~g.`\u00079n]2\u0003J\u000e", "4nRBf,=:\u0015{ze\n\u0007\u00109r", "CmU<V<LS\u0018ev[,\u0004f9l\n5", "2hb.U3>R\u007fzw^3Z\u00136o\r", "3qa<e\u0013:P\u0019\u0006Xh3\u0007\u0016", ">kP0X/HZ\u0018~\b<6\u0004\u0013<", "2hb.U3>R\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$", "=tc9\\5>R\b~\u000em\r\u0001\t6d]2\u0003J\u000e%^5~UHk\f)", "uI9\u0017=\u0011%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001|\u0016A\\\rIk;\u001e\u0013weC\u0010-\u001bN\n65LU,ZavG\u001dod\u0015X8\u001bZ>&\tS)\u001c\u0004l\u0011.f Mepzr\u001aQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bRr3s\u0010g\u001d&\u0018D,\u001f{'\u001bu&\u0012m_7TYN\u0003ftQ\u001dyKm<wcQO}U\u0006|#.K\t{\u000e9&>\u001at@\u0013\u0015.6k\u0004)q\u001fHk\u0007j", "4nRBf,=B\u0019\u0012\n<6\u0004\u0013<", "CmU<V<LS\u0018mzq;Z\u00136o\r", "3qa<e\u001b>f(\\\u0005e6\n", "3qa<e\nH\\(z~g,\nf9l\n5", "4nRBf,=> zx^/\u0007\u0010.e\r\u0006\u0006G\u000b$", "CmU<V<LS\u0018i\u0002Z*|\f9l~(\t\u001e\u000b\u001e!T", "3qa<e\u0017EO\u0017~}h3{\t<C\n/\u0006M", "4nRBf,=>&~{b?Z\u00136o\r", "CmU<V<LS\u0018i\b^-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0004\fz_0\u0010f9l\n5", "3qa<e\u0017KS\u001a\u0003\u000e<6\u0004\u0013<", "4nRBf,=A)\u007f{b?Z\u00136o\r", "CmU<V<LS\u0018l\u000b_-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0007\u000f{_0\u0010f9l\n5", "3qa<e\u001aNT\u001a\u0003\u000e<6\u0004\u0013<", "=tc9\\5>R\b~\u000em\r\u0001\t6d]2\u0003J\u000e%^VXXCrl\u0019", "uI9\u0017=\u0011#8}evg+\n\u00133d\u0013qyJ\t\"!UoW=\u00015>Xy/;w\u001fw\\CNz},\u0015oa7\u0016g6W@\u0016G_]\u001a\\Yr;#\u0016d\u0017,5\u0014\u000ffOyS)\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+@[\u0003FNOf)wU]'dED2\u0014;&+q_2\u0012{\u001dn|Z\u0005quG&P\u001c\b\"Q?*\tVQEs4)Oz\u000b[0b|6~;\u0004}22s\u0005Xk\u0014E,B\u0004,oP\b*6C\u0012\u001dUj\u007fyLc", "4nRBf,=1#\b\nZ0\u0006\t<C\n/\u0006M", "CmU<V<LS\u0018\\\u0005g;x\r8e\r\u0006\u0006G\u000b$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "=tc9\\5>R\b~\u000em\r\u0001\t6d]2\u0003J\u000e%^(Na$\\vC", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rJkG-^va@\u0007a;R\u00010\u0011;N?k@rD\u0014\u0010i\u0012X4j\u000f`K1|\u001a\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+>D`CJDo4h\u000brfZDB/\u001e\u007f\u0019du`7\u0019\u007f[\u0011<0\u0004orQ'zEy\"Q?*)S\u0019#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fl\u0001Zg%BZ\u007fbuKA:5\u0017@\u0013FJA\u007fsH\u001bvt", ">n_Bc\u0017K]$~\bm0|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bDw!.ZR?kBs", "/mR5b9-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>iY)5p ;<WFk\n", ">n_Bc\u0017K]$~\bm0|\u0017vplxXS\f%UOk\u001d<\u0004)1`K\u001aDm\u001d.IQ;", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\u001a0R\u0001EzJv \u0019Eu[O`\u001bG\u0007$yA7>", "BdgA90>Z\u0018\\\u0005e6\n\u0017", "4nRBf,=7\"}~\\(\f\u0013<C\n/\u0006M", "CmU<V<LS\u0018b\u0004]0z\u0005>o\r\u0006\u0006G\u000b$", "2hb.U3>R|\byb*x\u00189r]2\u0003J\u000e", "3qa<e\u0010GR\u001d|vm6\nf9l\n5", "BdgA90>Z\u0018\\\u0005e6\n\u0017vS\u000fo\b5g\u000b", "BdgA90>Z\u0018\\\u0005e6\n\u0017vthr\u0003<Hz", "BdgA90>Z\u0018\\\u0005e6\n\u0017vF^{c&R%", ";`c2e0:Zfx\b^3|\u0005=e", "/0 FF,Kd\u001d|zl\f\u0006\u0005,l\u007f'"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding = PaddingKt.m1012PaddingValuesYgX7TsA(ExposedDropdownMenu_androidKt.ExposedDropdownMenuItemHorizontalPadding, Dp.m6638constructorimpl(0));

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuDefaults$TrailingIcon$1 */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, Modifier modifier, int i2, int i3) {
            super(2);
            z = z2;
            modifier = modifier;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ExposedDropdownMenuDefaults.this.TrailingIcon(z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuDefaults$TrailingIcon$2 */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $expanded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z2, int i2) {
            super(2);
            z = z2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ExposedDropdownMenuDefaults.this.TrailingIcon(z, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    private ExposedDropdownMenuDefaults() {
    }

    public final void TrailingIcon(boolean z2, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1987096744);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TrailingIcon)520@22966L83:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            i4 = (i2 + 6) - (6 & i2);
        } else if ((i2 + 6) - (6 | i2) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (2 | i3);
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (48 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i4 + 19) - (19 | i4) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1987096744, i4, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
            }
            IconKt.m2168Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), (String) null, RotateKt.rotate(companion, z2 ? 180.0f : 0.0f), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $expanded;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z22, Modifier companion2, int i22, int i32) {
                    super(2);
                    z = z22;
                    modifier = companion2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: textFieldColors-FD9MK7s */
    public final TextFieldColors m2106textFieldColorsFD9MK7s(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long value = j39;
        long value2 = j35;
        long value3 = j33;
        long value4 = j32;
        long jM4177copywmQWz5c$default = j30;
        long value5 = j27;
        long value6 = j26;
        long value7 = j25;
        long value8 = j24;
        long value9 = j3;
        long value10 = j19;
        long jM4177copywmQWz5c$default2 = j22;
        long value11 = j21;
        long jM4177copywmQWz5c$default3 = j18;
        long value12 = j7;
        long value13 = j17;
        long value14 = j37;
        long value15 = j29;
        long value16 = j15;
        long value17 = j6;
        long value18 = j16;
        long jM4177copywmQWz5c$default4 = j14;
        long value19 = j23;
        long value20 = j20;
        long value21 = j2;
        long value22 = j13;
        long jM4177copywmQWz5c$default5 = j38;
        long value23 = j8;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long jM4177copywmQWz5c$default6 = j34;
        long value24 = j10;
        long value25 = j11;
        long value26 = j31;
        long value27 = j9;
        long value28 = j12;
        long value29 = j36;
        long value30 = j28;
        long jM4177copywmQWz5c$default7 = j4;
        long value31 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, 768358577, "C(textFieldColors)P(27:c#ui.graphics.Color,37:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,1:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,29,21:c#ui.graphics.Color,31:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)573@27038L5,574@27126L5,576@27233L5,579@27421L5,580@27516L5,581@27613L5,582@27709L5,583@27802L5,584@27883L5,585@27979L5,586@28058L7,588@28178L5,590@28293L5,592@28415L5,596@28640L5,598@28756L5,599@28857L5,601@28977L5,605@29196L5,607@29314L5,609@29429L5,611@29551L5,615@29773L5,616@29865L5,617@29954L5,618@30050L5,619@30140L5,620@30238L5,621@30338L5,623@30457L5,626@30657L5,627@30750L5,628@30845L5,630@30959L5,633@31154L5,634@31247L5,635@31342L5,637@31456L5,640@31651L5,642@31709L2230:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i6 + 1) - (i6 | 1) != 0) {
            value21 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6);
        }
        if ((i6 & 2) != 0) {
            value9 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((i6 & 4) != 0) {
            jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            value31 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            value17 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i6 & 32) != 0) {
            value12 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i6 + 64) - (i6 | 64) != 0) {
            value23 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i6 + 128) - (i6 | 128) != 0) {
            value27 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            value24 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            value25 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((i6 + 1024) - (i6 | 1024) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((i6 & 2048) != 0) {
            i8 = 6;
            value28 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        } else {
            i8 = 6;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4096)) != 0) {
            value22 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, i8);
        }
        if ((i6 + 8192) - (i6 | 8192) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, i8), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 & 16384) != 0) {
            i9 = 6;
            value16 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        } else {
            i9 = 6;
        }
        if ((32768 + i6) - (32768 | i6) != 0) {
            value18 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i9);
        }
        if ((65536 & i6) != 0) {
            value13 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i9);
        }
        if ((131072 + i6) - (131072 | i6) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, i9), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - 262144) | ((-1) - i6)) != 0) {
            i10 = 6;
            value10 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            i10 = 6;
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i6)) != 0) {
            value20 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i10);
        }
        if ((1048576 & i6) != 0) {
            value11 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i10);
        }
        if ((2097152 & i6) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, i10), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((4194304 & i6) != 0) {
            i11 = 6;
            value19 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            i11 = 6;
        }
        if ((8388608 + i6) - (8388608 | i6) != 0) {
            value8 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i11);
        }
        if ((16777216 + i6) - (16777216 | i6) != 0) {
            value7 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i11);
        }
        if ((33554432 & i6) != 0) {
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i11);
        }
        if ((AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL + i6) - (67108864 | i6) != 0) {
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, i11);
        }
        if ((134217728 & i6) != 0) {
            value30 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11);
        }
        if ((268435456 + i6) - (268435456 | i6) != 0) {
            value15 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11);
        }
        if ((536870912 + i6) - (536870912 | i6) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i11), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 & 1073741824) != 0) {
            i12 = 6;
            value26 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i12 = 6;
        }
        if ((i7 + 1) - (i7 | 1) != 0) {
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2)) != 0) {
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4)) != 0) {
            jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i12), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 8)) != 0) {
            i13 = 6;
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i13 = 6;
        }
        if ((i7 + 16) - (i7 | 16) != 0) {
            value29 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13);
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            value14 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 64)) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i13), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 & 128) != 0) {
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(768358577, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
        }
        int i14 = i5 << 12;
        int i15 = ((-1) - (((-1) - i5) | ((-1) - 14))) | ((458752 + i14) - (458752 | i14)) | ((-1) - (((-1) - 3670016) | ((-1) - i14))) | (29360128 & i14);
        int i16 = (234881024 + i14) - (234881024 | i14);
        int i17 = (-1) - (((-1) - ((i15 + i16) - (i15 & i16))) & ((-1) - (i14 & 1879048192)));
        int i18 = i5 >> 18;
        int i19 = (-1) - (((-1) - i18) | ((-1) - 14));
        TextFieldColors textFieldColorsM2692colors0hiis_0 = TextFieldDefaults.INSTANCE.m2692colors0hiis_0(value21, value9, jM4177copywmQWz5c$default7, value31, value17, value12, value23, value27, value24, value25, textSelectionColors2, value28, value22, jM4177copywmQWz5c$default4, value16, value18, value13, jM4177copywmQWz5c$default3, value10, value20, value11, jM4177copywmQWz5c$default2, value19, value8, value7, value6, value5, value30, value15, jM4177copywmQWz5c$default, value26, 0L, 0L, 0L, 0L, value4, value3, jM4177copywmQWz5c$default6, value2, value29, value14, jM4177copywmQWz5c$default5, value, composer, (i2 + 2147483646) - (i2 | 2147483646), (-1) - (((-1) - i3) | ((-1) - 2147483646)), (i4 + 2147483646) - (i4 | 2147483646), i17, ((i19 + 3072) - (i19 & 3072)) | ((i18 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i18)) | ((-1) - (((-1) - i18) | ((-1) - 896))), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2692colors0hiis_0;
    }

    /* JADX INFO: renamed from: outlinedTextFieldColors-FD9MK7s */
    public final TextFieldColors m2102outlinedTextFieldColorsFD9MK7s(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long value = j39;
        long jM4177copywmQWz5c$default = j38;
        long value2 = j35;
        long value3 = j33;
        long value4 = j32;
        long value5 = j31;
        long jM4177copywmQWz5c$default2 = j30;
        long value6 = j28;
        long value7 = j27;
        long value8 = j25;
        long value9 = j24;
        long value10 = j29;
        long value11 = j23;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long value12 = j20;
        long value13 = j37;
        long jM4213getTransparent0d7_KjU = j8;
        long jM4177copywmQWz5c$default3 = j14;
        long jM4177copywmQWz5c$default4 = j18;
        long value14 = j13;
        long value15 = j15;
        long value16 = j10;
        long value17 = j2;
        long value18 = j19;
        long jM4177copywmQWz5c$default5 = j34;
        long jM4177copywmQWz5c$default6 = j26;
        long value19 = j12;
        long jM4213getTransparent0d7_KjU2 = j9;
        long value20 = j36;
        long jM4177copywmQWz5c$default7 = j22;
        long value21 = j3;
        long jM4213getTransparent0d7_KjU3 = j7;
        long value22 = j16;
        long value23 = j11;
        long jM4213getTransparent0d7_KjU4 = j6;
        long value24 = j5;
        long value25 = j21;
        long jM4177copywmQWz5c$default8 = j4;
        long value26 = j17;
        ComposerKt.sourceInformationMarkerStart(composer, -1567195085, "C(outlinedTextFieldColors)P(27:c#ui.graphics.Color,37:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,29,20:c#ui.graphics.Color,30:c#ui.graphics.Color,1:c#ui.graphics.Color,10:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)734@37917L5,735@38007L5,737@38116L5,740@38308L5,745@38624L5,746@38722L5,747@38801L7,748@38900L5,749@38994L5,751@39107L5,754@39305L5,756@39423L5,758@39538L5,760@39660L5,764@39883L5,766@40003L5,768@40120L5,770@40244L5,774@40470L5,775@40564L5,776@40655L5,778@40765L5,781@40958L5,782@41058L5,784@41172L5,786@41293L5,789@41497L5,790@41592L5,791@41689L5,793@41805L5,796@42004L5,797@42099L5,798@42196L5,800@42312L5,803@42511L5,805@42577L2206:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            value17 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6);
        }
        if ((i6 + 2) - (i6 | 2) != 0) {
            value21 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((i6 & 4) != 0) {
            jM4177copywmQWz5c$default8 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 & 8) != 0) {
            value24 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6);
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            jM4213getTransparent0d7_KjU4 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i6 + 32) - (i6 | 32) != 0) {
            jM4213getTransparent0d7_KjU3 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i6 & 64) != 0) {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i6 & 128) != 0) {
            jM4213getTransparent0d7_KjU2 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i6 & 256) != 0) {
            value16 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            value23 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((i6 & 1024) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2048)) != 0) {
            i8 = 6;
            value19 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        } else {
            i8 = 6;
        }
        if ((i6 + 4096) - (i6 | 4096) != 0) {
            value14 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, i8);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8192)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, i8), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16384)) != 0) {
            i9 = 6;
            value15 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        } else {
            i9 = 6;
        }
        if ((32768 + i6) - (32768 | i6) != 0) {
            value22 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i9);
        }
        if ((65536 & i6) != 0) {
            value26 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i9);
        }
        if ((131072 + i6) - (131072 | i6) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, i9), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((262144 & i6) != 0) {
            i10 = 6;
            value18 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            i10 = 6;
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i6)) != 0) {
            value12 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i10);
        }
        if ((-1) - (((-1) - 1048576) | ((-1) - i6)) != 0) {
            value25 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i10);
        }
        if ((-1) - (((-1) - 2097152) | ((-1) - i6)) != 0) {
            jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, i10), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - 4194304) | ((-1) - i6)) != 0) {
            i11 = 6;
            value11 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            i11 = 6;
        }
        if ((-1) - (((-1) - 8388608) | ((-1) - i6)) != 0) {
            value9 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i11);
        }
        if ((16777216 + i6) - (16777216 | i6) != 0) {
            value8 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i11);
        }
        if ((-1) - (((-1) - 33554432) | ((-1) - i6)) != 0) {
            jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i11), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) | ((-1) - i6)) != 0) {
            i12 = 6;
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        } else {
            i12 = 6;
        }
        if ((-1) - (((-1) - 134217728) | ((-1) - i6)) != 0) {
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12);
        }
        if ((268435456 + i6) - (268435456 | i6) != 0) {
            value10 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12);
        }
        if ((536870912 + i6) - (536870912 | i6) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i12), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 + 1073741824) - (i6 | 1073741824) != 0) {
            i13 = 6;
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i13 = 6;
        }
        if ((i7 + 1) - (i7 | 1) != 0) {
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13);
        }
        if ((i7 & 2) != 0) {
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4)) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i13), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 + 8) - (i7 | 8) != 0) {
            i14 = 6;
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i14 = 6;
        }
        if ((i7 + 16) - (i7 | 16) != 0) {
            value20 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i14);
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            value13 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i14);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 64)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, i14), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 + 128) - (i7 | 128) != 0) {
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1567195085, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
        }
        int i15 = i5 << 12;
        int i16 = ((-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - i5) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i15)))))) | ((3670016 + i15) - (3670016 | i15)))) & ((-1) - ((-1) - (((-1) - 29360128) | ((-1) - i15)))))) | ((-1) - (((-1) - 234881024) | ((-1) - i15)));
        int i17 = (i15 + 1879048192) - (i15 | 1879048192);
        int i18 = i5 >> 18;
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        TextFieldColors textFieldColorsM2361colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2361colors0hiis_0(value17, value21, jM4177copywmQWz5c$default8, value24, jM4213getTransparent0d7_KjU4, jM4213getTransparent0d7_KjU3, jM4213getTransparent0d7_KjU, jM4213getTransparent0d7_KjU2, value16, value23, textSelectionColors3, value19, value14, jM4177copywmQWz5c$default3, value15, value22, value26, jM4177copywmQWz5c$default4, value18, value12, value25, jM4177copywmQWz5c$default7, value11, value9, value8, jM4177copywmQWz5c$default6, value7, value6, value10, jM4177copywmQWz5c$default2, value5, 0L, 0L, 0L, 0L, value4, value3, jM4177copywmQWz5c$default5, value2, value20, value13, jM4177copywmQWz5c$default, value, composer, (i2 + 2147483646) - (i2 | 2147483646), (i3 + 2147483646) - (i3 | 2147483646), (-1) - (((-1) - i4) | ((-1) - 2147483646)), (i16 + i17) - (i16 & i17), ((-1) - (((-1) - ((-1) - (((-1) - (i18 & 14)) & ((-1) - 3072)))) & ((-1) - ((-1) - (((-1) - i18) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) | ((-1) - (((-1) - i18) | ((-1) - 896))), 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2361colors0hiis_0;
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    /* JADX INFO: renamed from: popupProperties-pR6Bxps$material3_release */
    public final PopupProperties m2105popupPropertiespR6Bxps$material3_release(String str, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1724259382, "C(popupProperties)P(0:c#material3.MenuAnchorType)861@45439L35:ExposedDropdownMenu.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1724259382, i2, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer, 0, 3);
        int i3 = !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState) ? 393248 : 393216;
        if (MenuAnchorType.m2238equalsimpl0(str, MenuAnchorType.Companion.m2242getPrimaryEditableMg6Rgbw()) || (MenuAnchorType.m2238equalsimpl0(str, MenuAnchorType.Companion.m2244getSecondaryEditableMg6Rgbw()) && !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState))) {
            i3 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i3, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return popupProperties;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    public final /* synthetic */ void TrailingIcon(boolean z2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-473088613);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TrailingIcon)886@46586L32:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? 32 : 16)));
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, i3, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
            }
            int i5 = ((-1) - (((-1) - i3) | ((-1) - 14))) | 48;
            int i6 = i3 << 3;
            TrailingIcon(z2, Modifier.Companion, composerStartRestartGroup, i5 | ((i6 + 896) - (i6 | 896)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $expanded;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(boolean z22, int i22) {
                    super(2);
                    z = z22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: textFieldColors-tN0la-I */
    public final /* synthetic */ TextFieldColors m2108textFieldColorstN0laI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long value = j37;
        long value2 = j34;
        long value3 = j33;
        long jM4177copywmQWz5c$default = j32;
        long value4 = j31;
        long value5 = j30;
        long value6 = j35;
        long value7 = j29;
        long jM4177copywmQWz5c$default2 = j28;
        long value8 = j27;
        long value9 = j5;
        long value10 = j17;
        long value11 = j23;
        long jM4177copywmQWz5c$default3 = j36;
        long value12 = j25;
        long value13 = j19;
        long value14 = j26;
        long value15 = j13;
        long value16 = j22;
        long value17 = j24;
        long value18 = j2;
        long value19 = j6;
        long value20 = j18;
        long value21 = j11;
        long jM4177copywmQWz5c$default4 = j16;
        long jM4177copywmQWz5c$default5 = j12;
        long value22 = j21;
        long value23 = j10;
        long value24 = j8;
        long value25 = j3;
        long value26 = j7;
        long value27 = j9;
        long value28 = j14;
        long jM4177copywmQWz5c$default6 = j20;
        long value29 = j15;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long jM4177copywmQWz5c$default7 = j4;
        ComposerKt.sourceInformationMarkerStart(composer, 611690079, "C(textFieldColors)P(26:c#ui.graphics.Color,35:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,0:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,28,20:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,22:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,27:c#ui.graphics.Color,36:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,21:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,32:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,24:c#ui.graphics.Color,33:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,25:c#ui.graphics.Color,34:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)891@46833L5,892@46921L5,894@47028L5,897@47216L5,898@47304L5,899@47397L5,900@47478L5,901@47574L5,902@47653L7,904@47773L5,906@47888L5,908@48010L5,912@48235L5,914@48351L5,915@48452L5,917@48572L5,921@48791L5,923@48909L5,925@49024L5,927@49146L5,931@49368L5,932@49460L5,933@49549L5,934@49645L5,935@49735L5,936@49833L5,937@49933L5,939@50052L5,942@50252L5,943@50345L5,944@50440L5,946@50554L5,949@50749L5,950@50842L5,951@50937L5,953@51051L5,956@51246L5,958@51286L2215:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            value18 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6);
        }
        if ((i6 & 2) != 0) {
            value25 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((i6 & 4) != 0) {
            jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 & 8) != 0) {
            value9 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6);
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            value19 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i6 & 32) != 0) {
            value26 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 64)) != 0) {
            value24 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 128)) != 0) {
            value27 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            value23 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        }
        if ((i6 + 1024) - (i6 | 1024) != 0) {
            value21 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6);
        }
        if ((i6 + 2048) - (i6 | 2048) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4096)) != 0) {
            value15 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        }
        if ((i6 & 8192) != 0) {
            value28 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6);
        }
        if ((i6 & 16384) != 0) {
            value29 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6);
        }
        if ((32768 & i6) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((65536 & i6) != 0) {
            value10 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        }
        if ((131072 & i6) != 0) {
            value20 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6);
        }
        if ((262144 & i6) != 0) {
            value13 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i6)) != 0) {
            jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((1048576 + i6) - (1048576 | i6) != 0) {
            value22 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - 2097152) | ((-1) - i6)) != 0) {
            value16 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 4194304) | ((-1) - i6)) != 0) {
            value11 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6);
        }
        if ((8388608 & i6) != 0) {
            value17 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6);
        }
        if ((16777216 & i6) != 0) {
            value12 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        }
        if ((33554432 & i6) != 0) {
            value14 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) | ((-1) - i6)) != 0) {
            value8 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((134217728 + i6) - (134217728 | i6) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((268435456 & i6) != 0) {
            value7 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((536870912 + i6) - (536870912 | i6) != 0) {
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1073741824)) != 0) {
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i7 & 1) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 & 2) != 0) {
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4)) != 0) {
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 8)) != 0) {
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i7 & 16) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
        }
        int i8 = i2 << 3;
        int i9 = i2 << 6;
        int i10 = (-1) - (((-1) - ((-1) - (((-1) - ((65534 & i2) | ((i8 + 458752) - (i8 | 458752)))) & ((-1) - ((i9 + 3670016) - (i9 | 3670016)))))) & ((-1) - ((-1) - (((-1) - i9) | ((-1) - 29360128)))));
        int i11 = i9 & 234881024;
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = i9 & 1879048192;
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = i3 << 6;
        int i16 = ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 126))) | ((i15 + 896) - (896 | i15)) | (7168 & i15);
        int i17 = i15 & 57344;
        int i18 = (i16 + i17) - (i16 & i17);
        int i19 = (i15 + 458752) - (i15 | 458752);
        int i20 = (-1) - (((-1) - ((-1) - (((-1) - (((i18 + i19) - (i18 & i19)) | (i15 & 3670016))) & ((-1) - (i15 & 29360128))))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 234881024)))));
        int i21 = (-1) - (((-1) - i15) | ((-1) - 1879048192));
        int i22 = (i20 + i21) - (i20 & i21);
        int i23 = i4 << 6;
        int i24 = (-1) - (((-1) - ((i3 >> 24) & 126)) & ((-1) - ((i23 + 896) - (896 | i23))));
        int i25 = (i23 + 7168) - (7168 | i23);
        int i26 = ((i24 + i25) - (i24 & i25)) | ((i23 + 57344) - (i23 | 57344));
        int i27 = (-1) - (((-1) - i23) | ((-1) - 458752));
        int i28 = ((i26 + i27) - (i26 & i27)) | ((-1) - (((-1) - i23) | ((-1) - 3670016)));
        int i29 = (-1) - (((-1) - i23) | ((-1) - 29360128));
        int i30 = (-1) - (((-1) - ((-1) - (((-1) - ((i28 + i29) - (i28 & i29))) & ((-1) - ((i23 + 234881024) - (i23 | 234881024)))))) & ((-1) - ((-1) - (((-1) - i23) | ((-1) - 1879048192)))));
        int i31 = i5 << 6;
        int i32 = (-1) - (((-1) - ((-1) - (((-1) - ((i4 >> 24) & 126)) & ((-1) - (896 & i31))))) & ((-1) - ((-1) - (((-1) - i31) | ((-1) - 7168)))));
        int i33 = (i31 + 57344) - (i31 | 57344);
        long j38 = value19;
        long j39 = value19;
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        TextFieldColors textFieldColorsM2106textFieldColorsFD9MK7s = m2106textFieldColorsFD9MK7s(value18, value25, jM4177copywmQWz5c$default7, value9, value19, j38, j39, value26, value24, value27, textSelectionColors3, value23, value21, jM4177copywmQWz5c$default5, value15, value28, value29, jM4177copywmQWz5c$default4, value10, value20, value13, jM4177copywmQWz5c$default6, value22, value16, value11, value17, value12, value14, value8, jM4177copywmQWz5c$default2, value7, value5, value4, jM4177copywmQWz5c$default, value3, value2, value6, jM4177copywmQWz5c$default3, value, composer, i14, i22, i30, ((-1) - (((-1) - (((-1) - (((-1) - (((i32 + i33) - (i32 & i33)) | (i31 & 458752))) & ((-1) - ((-1) - (((-1) - i31) | ((-1) - 3670016)))))) | (i31 & 29360128))) & ((-1) - (i31 & 234881024)))) | (i31 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2106textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: outlinedTextFieldColors-tN0la-I */
    public final /* synthetic */ TextFieldColors m2104outlinedTextFieldColorstN0laI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long value = j35;
        long value2 = j33;
        long value3 = j25;
        long value4 = j26;
        long jM4177copywmQWz5c$default = j20;
        long value5 = j13;
        long value6 = j19;
        long value7 = j22;
        long value8 = j18;
        long value9 = j27;
        long value10 = j21;
        long value11 = j34;
        long value12 = j17;
        long value13 = j14;
        long jM4213getTransparent0d7_KjU = j7;
        long jM4177copywmQWz5c$default2 = j12;
        long value14 = j37;
        long jM4177copywmQWz5c$default3 = j28;
        long value15 = j15;
        long value16 = j30;
        long value17 = j11;
        long value18 = j23;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long jM4177copywmQWz5c$default4 = j16;
        long value19 = j9;
        long jM4213getTransparent0d7_KjU2 = j6;
        long value20 = j2;
        long jM4177copywmQWz5c$default5 = j32;
        long value21 = j8;
        long jM4177copywmQWz5c$default6 = j24;
        long jM4177copywmQWz5c$default7 = j4;
        long jM4177copywmQWz5c$default8 = j36;
        long value22 = j31;
        long value23 = j5;
        long value24 = j29;
        long value25 = j10;
        long value26 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, -388128543, "C(outlinedTextFieldColors)P(26:c#ui.graphics.Color,35:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,28,20:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.graphics.Color,22:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,27:c#ui.graphics.Color,36:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,21:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,32:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,24:c#ui.graphics.Color,33:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,25:c#ui.graphics.Color,34:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)1003@53726L5,1004@53816L5,1006@53925L5,1009@54117L5,1012@54307L5,1013@54405L5,1014@54484L7,1015@54583L5,1016@54677L5,1018@54790L5,1021@54988L5,1023@55106L5,1025@55221L5,1027@55343L5,1031@55566L5,1033@55686L5,1035@55803L5,1037@55927L5,1041@56153L5,1042@56247L5,1043@56338L5,1045@56448L5,1048@56641L5,1049@56741L5,1051@56855L5,1053@56976L5,1056@57180L5,1057@57275L5,1058@57372L5,1060@57488L5,1063@57687L5,1064@57782L5,1065@57879L5,1067@57995L5,1070@58194L5,1072@58234L2199:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i6 + 1) - (i6 | 1) != 0) {
            value20 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6);
        }
        if ((i6 & 2) != 0) {
            value26 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((i6 & 4) != 0) {
            jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            value23 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6);
        }
        if ((i6 & 16) != 0) {
            jM4213getTransparent0d7_KjU2 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 32)) != 0) {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i6 + 64) - (i6 | 64) != 0) {
            value21 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 128)) != 0) {
            value19 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 256)) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            value25 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1024)) != 0) {
            value17 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6);
        }
        if ((i6 + 2048) - (i6 | 2048) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i6 + 4096) - (i6 | 4096) != 0) {
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        }
        if ((i6 + 8192) - (i6 | 8192) != 0) {
            value13 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6);
        }
        if ((i6 + 16384) - (i6 | 16384) != 0) {
            value15 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6);
        }
        if ((32768 & i6) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((65536 + i6) - (65536 | i6) != 0) {
            value12 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        }
        if ((131072 + i6) - (131072 | i6) != 0) {
            value8 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - 262144) | ((-1) - i6)) != 0) {
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6);
        }
        if ((524288 & i6) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - 1048576) | ((-1) - i6)) != 0) {
            value10 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        }
        if ((2097152 + i6) - (2097152 | i6) != 0) {
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6);
        }
        if ((4194304 & i6) != 0) {
            value18 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 8388608) | ((-1) - i6)) != 0) {
            jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - 16777216) | ((-1) - i6)) != 0) {
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        }
        if ((33554432 & i6) != 0) {
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) | ((-1) - i6)) != 0) {
            value9 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 134217728) | ((-1) - i6)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((268435456 & i6) != 0) {
            value24 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 536870912) | ((-1) - i6)) != 0) {
            value16 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i6 & 1073741824) != 0) {
            value22 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i7 + 1) - (i7 | 1) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 & 2) != 0) {
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i7 & 4) != 0) {
            value11 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i7 & 8) != 0) {
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i7) | ((-1) - 16)) != 0) {
            jM4177copywmQWz5c$default8 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i7 & 32) != 0) {
            value14 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388128543, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
        }
        int i8 = (-1) - (((-1) - ((65534 + i2) - (65534 | i2))) & ((-1) - ((i2 << 3) & 458752)));
        int i9 = i2 << 6;
        int i10 = (i9 + 3670016) - (i9 | 3670016);
        int i11 = ((-1) - (((-1) - (((i8 + i10) - (i8 & i10)) | ((-1) - (((-1) - i9) | ((-1) - 29360128))))) & ((-1) - (i9 & 234881024)))) | ((-1) - (((-1) - i9) | ((-1) - 1879048192)));
        int i12 = i3 << 6;
        int i13 = ((-1) - (((-1) - (((i2 >> 24) & 126) | ((i12 + 896) - (896 | i12)))) & ((-1) - ((-1) - (((-1) - i12) | ((-1) - 7168)))))) | ((i12 + 57344) - (i12 | 57344)) | ((i12 + 458752) - (i12 | 458752));
        int i14 = (i12 + 3670016) - (i12 | 3670016);
        int i15 = (-1) - (((-1) - ((-1) - (((-1) - (((i13 + i14) - (i13 & i14)) | ((-1) - (((-1) - i12) | ((-1) - 29360128))))) & ((-1) - (i12 & 234881024))))) & ((-1) - ((i12 + 1879048192) - (i12 | 1879048192))));
        int i16 = i4 << 6;
        int i17 = ((-1) - (((-1) - (i3 >> 24)) | ((-1) - 126))) | ((i16 + 896) - (896 | i16));
        int i18 = (-1) - (((-1) - i16) | ((-1) - 7168));
        int i19 = ((-1) - (((-1) - ((-1) - (((-1) - (((i17 + i18) - (i17 & i18)) | ((i16 + 57344) - (i16 | 57344)))) & ((-1) - ((-1) - (((-1) - i16) | ((-1) - 458752))))))) & ((-1) - ((i16 + 3670016) - (i16 | 3670016))))) | ((-1) - (((-1) - i16) | ((-1) - 29360128)));
        int i20 = (-1) - (((-1) - i16) | ((-1) - 234881024));
        int i21 = ((i19 + i20) - (i19 & i20)) | ((-1) - (((-1) - i16) | ((-1) - 1879048192)));
        int i22 = i5 << 6;
        int i23 = ((i4 >> 24) & 126) | ((-1) - (((-1) - i22) | ((-1) - 896)));
        int i24 = (i22 + 7168) - (7168 | i22);
        int i25 = ((-1) - (((-1) - ((-1) - (((-1) - ((i23 + i24) - (i23 & i24))) & ((-1) - ((-1) - (((-1) - i22) | ((-1) - 57344))))))) & ((-1) - ((i22 + 458752) - (i22 | 458752))))) | ((-1) - (((-1) - i22) | ((-1) - 3670016)));
        int i26 = (i22 + 29360128) - (i22 | 29360128);
        int i27 = (i25 + i26) - (i25 & i26);
        int i28 = (-1) - (((-1) - i22) | ((-1) - 234881024));
        int i29 = (i27 + i28) - (i27 & i28);
        int i30 = (-1) - (((-1) - i22) | ((-1) - 1879048192));
        TextFieldColors textFieldColorsM2102outlinedTextFieldColorsFD9MK7s = m2102outlinedTextFieldColorsFD9MK7s(value20, value26, jM4177copywmQWz5c$default7, value23, jM4213getTransparent0d7_KjU2, jM4213getTransparent0d7_KjU2, jM4213getTransparent0d7_KjU2, jM4213getTransparent0d7_KjU, value21, value19, textSelectionColors2, value25, value17, jM4177copywmQWz5c$default2, value5, value13, value15, jM4177copywmQWz5c$default4, value12, value8, value6, jM4177copywmQWz5c$default, value10, value7, value18, jM4177copywmQWz5c$default6, value3, value4, value9, jM4177copywmQWz5c$default3, value24, value16, value22, jM4177copywmQWz5c$default5, value2, value11, value, jM4177copywmQWz5c$default8, value14, composer, i11, i15, i21, (i29 + i30) - (i29 & i30), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2102outlinedTextFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: textFieldColors-St-qZLY */
    public final /* synthetic */ TextFieldColors m2107textFieldColorsStqZLY(long j2, long j3, long j4, long j5, long j6, TextSelectionColors textSelectionColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Composer composer, int i2, int i3, int i4, int i5) {
        long jM4177copywmQWz5c$default = j24;
        long value = j20;
        long value2 = j23;
        long value3 = j19;
        long value4 = j22;
        long value5 = j16;
        long jM4177copywmQWz5c$default2 = j3;
        long value6 = j21;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long value7 = j15;
        long value8 = j6;
        long value9 = j14;
        long value10 = j5;
        long jM4177copywmQWz5c$default3 = j13;
        long jM4177copywmQWz5c$default4 = j9;
        long value11 = j11;
        long jM4177copywmQWz5c$default5 = j17;
        long value12 = j10;
        long value13 = j8;
        long value14 = j18;
        long value15 = j4;
        long value16 = j7;
        long value17 = j12;
        long value18 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1343678550, "C(textFieldColors)P(19:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,18,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,22:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,16:c#ui.graphics.Color,23:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)1117@60636L5,1119@60743L5,1122@60930L5,1123@61011L5,1124@61107L5,1125@61186L7,1127@61306L5,1129@61421L5,1131@61543L5,1135@61768L5,1137@61884L5,1138@61985L5,1140@62105L5,1144@62324L5,1146@62442L5,1148@62557L5,1150@62679L5,1154@62901L5,1155@62993L5,1156@63082L5,1157@63178L5,1158@63268L5,1159@63359L5,1161@63473L5,1197@65427L5,1198@65521L5,1200@65638L5,1203@65842L5,1204@65934L5,1205@66028L5,1207@66145L5,1210@66349L5,1165@63611L2754:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i5 + 1) - (i5 | 1) != 0) {
            value18 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            value15 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6);
        }
        if ((i5 + 8) - (i5 | 8) != 0) {
            value10 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((i5 & 16) != 0) {
            value8 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((i5 & 32) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((i5 & 64) != 0) {
            value16 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        }
        if ((i5 & 128) != 0) {
            value13 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 256)) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 + 512) - (i5 | 512) != 0) {
            value12 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        }
        if ((i5 & 1024) != 0) {
            value11 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6);
        }
        if ((i5 + 2048) - (i5 | 2048) != 0) {
            value17 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6);
        }
        if ((i5 & 4096) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 & 8192) != 0) {
            value9 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        }
        if ((i5 + 16384) - (i5 | 16384) != 0) {
            value7 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6);
        }
        if ((32768 & i5) != 0) {
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6);
        }
        if ((65536 & i5) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i5)) != 0) {
            value14 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - 262144) | ((-1) - i5)) != 0) {
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6);
        }
        if ((524288 & i5) != 0) {
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 1048576) | ((-1) - i5)) != 0) {
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6);
        }
        if ((2097152 & i5) != 0) {
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        }
        if ((4194304 & i5) != 0) {
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((i5 + 8388608) - (i5 | 8388608) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343678550, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
        }
        long value19 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        int i6 = (i2 + 14) - (14 | i2);
        int i7 = i2 << 3;
        int i8 = (i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i7);
        int i9 = ((i6 + i8) - (i6 & i8)) | ((i7 + 896) - (i7 | 896));
        int i10 = i2 << 9;
        int i11 = 7168 & i10;
        int i12 = ((i9 + i11) - (i9 & i11)) | ((-1) - (((-1) - (i2 << 6)) | ((-1) - 57344))) | ((-1) - (((-1) - i10) | ((-1) - 458752)));
        int i13 = i2 << 12;
        int i14 = (i13 + 3670016) - (i13 | 3670016);
        int i15 = (i12 + i14) - (i12 & i14);
        int i16 = i2 << 15;
        int i17 = i16 & 29360128;
        int i18 = (-1) - (((-1) - ((-1) - (((-1) - ((i15 + i17) - (i15 & i17))) & ((-1) - (i16 & 234881024))))) & ((-1) - ((-1) - (((-1) - i16) | ((-1) - 1879048192)))));
        int i19 = i3 << 15;
        int i20 = ((-1) - (((-1) - ((i2 >> 15) & 65534)) & ((-1) - (i19 & 458752)))) | ((i19 + 3670016) - (i19 | 3670016));
        int i21 = (-1) - (((-1) - i19) | ((-1) - 29360128));
        int i22 = ((-1) - (((-1) - ((i20 + i21) - (i20 & i21))) & ((-1) - ((-1) - (((-1) - i19) | ((-1) - 234881024)))))) | ((i19 + 1879048192) - (i19 | 1879048192));
        int i23 = i4 << 15;
        int i24 = ((-1) - (((-1) - (((-1) - (((-1) - (i3 >> 15)) | ((-1) - 65534))) | ((-1) - (((-1) - i23) | ((-1) - 458752))))) & ((-1) - ((i23 + 3670016) - (i23 | 3670016))))) | ((-1) - (((-1) - i23) | ((-1) - 29360128)));
        int i25 = i4 << 18;
        int i26 = (-1) - (((-1) - i24) & ((-1) - (i25 & 234881024)));
        int i27 = (-1) - (((-1) - i25) | ((-1) - 1879048192));
        long j25 = value18;
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        TextFieldColors textFieldColorsM2106textFieldColorsFD9MK7s = m2106textFieldColorsFD9MK7s(value18, value18, jM4177copywmQWz5c$default2, j25, value15, value15, value15, value15, value10, value8, textSelectionColors3, value16, value13, jM4177copywmQWz5c$default4, value12, value11, value17, jM4177copywmQWz5c$default3, value9, value7, value5, jM4177copywmQWz5c$default5, value14, value3, value, value6, value4, value2, value2, jM4177copywmQWz5c$default, value2, value19, value20, jM4177copywmQWz5c$default6, value21, value22, value23, jM4177copywmQWz5c$default7, value24, composer, i18, i22, (i26 + i27) - (i26 & i27), (-1) - (((-1) - ((i4 >> 6) & 14)) & ((-1) - (i23 & 1879048192))), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2106textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: outlinedTextFieldColors-St-qZLY */
    public final /* synthetic */ TextFieldColors m2103outlinedTextFieldColorsStqZLY(long j2, long j3, long j4, long j5, long j6, TextSelectionColors textSelectionColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Composer composer, int i2, int i3, int i4, int i5) {
        long jM4177copywmQWz5c$default = j24;
        long jM4177copywmQWz5c$default2 = j17;
        long value = j23;
        long value2 = j20;
        long value3 = j14;
        long jM4177copywmQWz5c$default3 = j13;
        long value4 = j8;
        long value5 = j16;
        long value6 = j12;
        long jM4177copywmQWz5c$default4 = j21;
        long value7 = j2;
        long value8 = j10;
        long jM4213getTransparent0d7_KjU = j4;
        long jM4177copywmQWz5c$default5 = j9;
        long value9 = j15;
        long value10 = j7;
        long jM4177copywmQWz5c$default6 = j3;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        long value11 = j19;
        long value12 = j6;
        long value13 = j11;
        long value14 = j5;
        long value15 = j22;
        long value16 = j18;
        ComposerKt.sourceInformationMarkerStart(composer, -836383316, "C(outlinedTextFieldColors)P(19:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,18,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,22:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,16:c#ui.graphics.Color,23:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)1216@66578L5,1218@66687L5,1222@66922L5,1223@67020L5,1224@67099L7,1225@67198L5,1226@67292L5,1228@67405L5,1231@67603L5,1233@67721L5,1235@67836L5,1237@67958L5,1241@68181L5,1243@68301L5,1245@68418L5,1247@68542L5,1251@68768L5,1252@68862L5,1253@68953L5,1255@69063L5,1258@69256L5,1259@69349L5,1261@69465L5,1297@71405L5,1298@71499L5,1300@71616L5,1303@71820L5,1304@71912L5,1305@72006L5,1307@72123L5,1310@72327L5,1265@69605L2738:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6);
        }
        if ((i5 & 2) != 0) {
            jM4177copywmQWz5c$default6 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 + 4) - (i5 | 4) != 0) {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i5 & 8) != 0) {
            value14 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6);
        }
        if ((i5 + 16) - (i5 | 16) != 0) {
            value12 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6);
        }
        if ((i5 & 32) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            value10 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 128)) != 0) {
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 256)) != 0) {
            jM4177copywmQWz5c$default5 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 512)) != 0) {
            value8 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        }
        if ((i5 + 1024) - (i5 | 1024) != 0) {
            value13 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2048)) != 0) {
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4096)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i5 + 8192) - (i5 | 8192) != 0) {
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        }
        if ((i5 & 16384) != 0) {
            value9 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - 32768) | ((-1) - i5)) != 0) {
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6);
        }
        if ((65536 & i5) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((131072 & i5) != 0) {
            value16 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        }
        if ((262144 & i5) != 0) {
            value11 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i5)) != 0) {
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 1048576) | ((-1) - i5)) != 0) {
            jM4177copywmQWz5c$default4 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((2097152 + i5) - (2097152 | i5) != 0) {
            value15 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - 4194304) | ((-1) - i5)) != 0) {
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8388608)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-836383316, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
        }
        long value17 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long jM4177copywmQWz5c$default7 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        long jM4177copywmQWz5c$default8 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        int i6 = i2 & 14;
        int i7 = i2 << 3;
        int i8 = (i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i7);
        int i9 = (i6 + i8) - (i6 & i8);
        int i10 = (i7 + 896) - (i7 | 896);
        int i11 = (i9 + i10) - (i9 & i10);
        int i12 = i2 << 9;
        int i13 = i2 << 12;
        int i14 = i2 << 15;
        int i15 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((i11 | (7168 & i12)) | ((i2 << 6) & 57344))) & ((-1) - (i12 & 458752))))) & ((-1) - ((i13 + 3670016) - (i13 | 3670016)))))) & ((-1) - ((-1) - (((-1) - i14) | ((-1) - 29360128)))));
        int i16 = (i14 + 234881024) - (i14 | 234881024);
        int i17 = (i15 + i16) - (i15 & i16);
        int i18 = (i14 + 1879048192) - (i14 | 1879048192);
        int i19 = (i17 + i18) - (i17 & i18);
        int i20 = i3 << 15;
        int i21 = (-1) - (((-1) - ((((-1) - (((-1) - ((i2 >> 15) & 65534)) & ((-1) - ((i20 + 458752) - (i20 | 458752))))) | (i20 & 3670016)) | ((-1) - (((-1) - i20) | ((-1) - 29360128))))) & ((-1) - ((i20 + 234881024) - (i20 | 234881024))));
        int i22 = (-1) - (((-1) - i20) | ((-1) - 1879048192));
        int i23 = (i21 + i22) - (i21 & i22);
        int i24 = i3 >> 15;
        int i25 = i4 << 15;
        int i26 = (-1) - (((-1) - ((i24 + 65534) - (i24 | 65534))) & ((-1) - (i25 & 458752)));
        int i27 = (i25 + 3670016) - (i25 | 3670016);
        int i28 = (-1) - (((-1) - ((i26 + i27) - (i26 & i27))) & ((-1) - (i25 & 29360128)));
        int i29 = i4 << 18;
        int i30 = i4 >> 6;
        long j25 = value7;
        long j26 = jM4213getTransparent0d7_KjU;
        long j27 = jM4213getTransparent0d7_KjU;
        long j28 = jM4213getTransparent0d7_KjU;
        long j29 = value;
        long j30 = value7;
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        long j31 = value;
        TextFieldColors textFieldColorsM2102outlinedTextFieldColorsFD9MK7s = m2102outlinedTextFieldColorsFD9MK7s(value7, j25, jM4177copywmQWz5c$default6, j30, jM4213getTransparent0d7_KjU, j26, j27, j28, value14, value12, textSelectionColors3, value10, value4, jM4177copywmQWz5c$default5, value8, value13, value6, jM4177copywmQWz5c$default3, value3, value9, value5, jM4177copywmQWz5c$default2, value16, value11, value2, jM4177copywmQWz5c$default4, value15, value, j29, jM4177copywmQWz5c$default, j31, value17, value18, jM4177copywmQWz5c$default7, value19, value20, value21, jM4177copywmQWz5c$default8, value22, composer, i19, i23, (-1) - (((-1) - ((-1) - (((-1) - i28) & ((-1) - ((-1) - (((-1) - i29) | ((-1) - 234881024))))))) & ((-1) - (i29 & 1879048192))), ((i30 + 14) - (i30 | 14)) | ((-1) - (((-1) - i25) | ((-1) - 1879048192))), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2102outlinedTextFieldColorsFD9MK7s;
    }

    private static final boolean popupProperties_pR6Bxps$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
