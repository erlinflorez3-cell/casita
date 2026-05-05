package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŁ\u0014D߬)\u001ew\fL܀kt\u001aA\u000e0\u00110J~8,\u001aw\ror9>JmH4_[*%k\u00044*],qQП]\u001a\u0014\"\u0011OThonXZ\u0013¼\u0017\u0006,xr,OU\u0001](\u000f:B\u0006?;ݹw=O`|6\u000b&:\"F\u0003\r\u0001 +P\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\f@(\u00014\\oN<Jt]P/+\u0003oDV'u0\u0005M\u0013H\\'#vi\u001eA@?5#*[\u0003\u001dRc?\tFy=\u001bh/'1N{WLX\b\u0014\u001b.W\rsr.ؘ\rQv\f/+Udcו\u000e6#\u0013{;h4\u0012\u0014T`.[H\u0017\f\u001cb\rr\u0002?\u0001\u0011lr\u0018\u0006q8'%._YjӸjQgmIRE/\u001d\rLW1\u007f/\u0011l\u001bp\u0017+T&}GPnn˓R\n_o\u001e\u0017vb\u0010`\u001c=W\u0002?{?Z-$e\rޠ'!q4xWmv\u0013\u0018\u0001`yTX@P\u001b,6X:ɔ^Dj7\u001ccZX:Ie)d\t\u000e\bALrvjRٚ\u0014NU\u001b\u001a}S]\u0018^GsG[~k<\u0004O]afɄg\u0010g\u0005''E<p?psRU\u001cZ\u000bT81v\u001cݻ{{J\u0001<&8?\u007fWL9A\u001bl\u0015v/4Ao.ȤcZnB/Z9$\u0011&<t7>\u0001bvou7a,+\u001eR3GQCX>UP&d\u00011G\u0017s.\t\u0018PU\u000f\u0005\u0016$\u0019,$$^QQ]\u0003C\u001e\roJ\r=G\\r\u0014}{Cؠ~|\u007fA\u0002g\u05cek\bx8D\fx\u0013gTEN'b\u0001l d.D\u0012U\t\u0013{_\u001b]NI!/\bmҡ<|\u000bQd&͓nܲĿ9/Is+c\u0010G=]y]\u0018\u001c^}pX>t\u0014N\\g$>zQ\f\u0002kGW%\u0017I2&|\u0003pt\u0019)ڇF\t:?yIҡcݥެ<O\u0011\u007f\f8\u001fօ\f~)s:A\u001c.8<3BsqRDbQz)M\u00022\u001eqY3#J=T;\u007f?F*\u001ckj\u0007[paH\u0006\"Ufק:pPTʔ#DCL\u001d\u001bEdi4k)Zʮc\u0019\u001d\u000fRyA4\u001eV~b|'\u0015wUu1,\u0011~=}LS\u00985\u000fs#d5i\u0010\u0011U#\u000fAJ_\u0016v:;Fd9Ir\u0007[խIgI&\u0012<\n%9oqu2\u0019(\u0014-W(\u001dIQ?;%\u000bͿ\u000f_j+t|\u0018DbP(/%\\\r%L\u001f\u001f\r)O!K\u0011\bٮR\u0002= *\u0007\u001d\"9\t\u0012\u0003\n)+/\u00165[iwD͂+{]\u0006\u0002տ\u000eį\u001fٴؗx#b;\u001cK\"$) .w&d\u0012\tA7N^^N\u00031\".6s\u007f\u0006AA+^\b)(%N\u000fCl4\u007f{l\u0007N{l\u00124\u0006\u000f\u0011OIV(o]T+r?M\\\u0014\u001fYщ\u0010֦ޓ\\\u0013\u0006~#\u00127F\u0016OA\u0010}u\u0019vy=s\u000fA.\u001a\u0019(ɵHb,m7y$\u0016ZZ6\u0003SXc=\u0013w#֬Zq\u001cO\u0003(\u0013z4)B\u0003/LlP+4t0Nh=)1\u001f\n\f\u000e֜\u001f\u001eS<>!_Xg\u001be8;s6j)\u0003hW%\u000488!r.^rߠf`Kԣ?YRl;ܟxɷI8J݊L%\u001c\u0011GZf!\u0015я\u001c̄?Y;A'\u0015\u0019\u0017>\b}\n9GxVk%X\u0007SӖ\u000fק}7s\u009f\f9x*=\u0017\u0010'eoS%cd#ڿ^֮iJ\u0007\u07b7\u0004b\u001dkDIcDt\u009a(ˑ\u0004\n'\u07fbD\u001a\u0004.\u0018E_I\u0001ؤ^ȡZ{_\u00044.NpJ/Uo\u0019\b\u00189\u0002\u0018\"e2Ȧ6ф~\u001c!DL.En\rS[k\u001a\u001fR\u001c]\u0014e\u0010\\Ӿ5ٽ\u0001\u0018WqN/atS?j`\\\u001f\u0002\u0015R2\u0010HPÜ\u0013Đ.\u00065\u009atox}\u0006Q\u000e\"\u000fܹ_ƒ\bw9ׯ\u0001\fn10'yu\u001d՞/ܱQAjޑ`\u001b2sFB:\n\\ߨ\u0001Ц\u001b\u0002\u0006\u07bf\u0001)!I_soHh͠}ؗ!\u0019c%\u0014)\u007flMVctxIGK#mxW\fƷ/֓Y!S\u07bdK!\u000e\u0004C.uU\u0015ϗ|Ө\n\u000eMĹh$R\u0013\\(\u001c1\u0007ߤRڧ^Ke\u0001*#UW\u001b\u0001\r5\u0003Ci\u0001)+eiEֱ(Ǎ1x\nϷ0M'0#\u001e\u00028\t׀FԿ5>\u0004ŀ|]c\u001b\u0006I>\u00048į#ǵ\nG7AYpngE8eB\u001f\u0018.G<\u0006A#9ӻeَ\u0012\"g̜lJdJ`K\b3=ޟl٠~|\u0014.\u001a]m\bC)\u001f\u0007<MI\u0006X.Do7nwj*R\u001c.=ڏ[ǕI/\u000e\u001bDZ\u007f;˱Od\u001cqWƣtl\u0016Г*8Ȱ\u0006\"+\u001fy{vf\u0007ŇƎcފn{bZ)Yb)\u0007٤Һr"}, d2 = {"\u0011n]AT0GS&by", "", "\u0016na6m6Gb\u0015\u0006^\\6\u0006s+d~,\u0005B", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015b9Bh#\b\nZ3`\u00079nj$z?\u0005 \u0019", "u(5", "\u0014", "\u0017b^;7,?O)\u0006\nL0\u0012\t\u0017o~,|D\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u0016V6G2\u0019\u007fvn3\fv3z\u007f\u0010\u0006?\u0005\u0018\u001bG|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "\u001a`Q2_\u0010=", "\u001adP1\\5@7\u0018", "\u001bh]\u0013b*Na\u0019}aZ)|\u0010\u0016i\t(^@\u0005\u0019\u001aV", "5dc\u001a\\5\u001f]\u0017\u000f\t^+c\u0005,e\u0007\u000f\u007fI\u0001y\u0017Kq\u0011K", "\u001bh] h7I]&\u000e~g.k\tBtf,\u0005@c\u0017\u001bIr\u001d", "5dc\u001a\\5,c$\n\u0005k;\u0001\u00121T\u007f;\u000b'\u0005 \u0017*o\u0012>y4", "\u001bh]!X?M:\u001d\bzA,\u0001\u000b2t", "5dc\u001a\\5-S,\u000eab5|k/i\u0002+\u000b", "\u001ekP0X/HZ\u0018~\b:5\u0001\u0011+t\u00042\u0005\u001f\u0001\u001e\u0013[Y\u001b\u001b\u000721h\u0002*@", "", "\u001ekP0X/HZ\u0018~\b:5\u0001\u0011+t\u00042\u0005\u001f\u0011$\u0013Vs\u0018E", "\u001ekP0X/HZ\u0018~\bB+", "\u001eqT3\\?\"R", "\u001eqT3\\?,c\u001a\u007f~q\u001b|\u001c>P{'zD\n\u0019", "5dc\u001de,?W,l\u000b_-\u0001\u001c\u001ee\u00137f<\u007f\u0016\u001bPq", "!tU3\\?\"R", "!t_=b9MW\"\u0001^]", "!t_=b9MW\"\u0001ih7g\u0005.d\u00041}", "5dc h7I]&\u000e~g.k\u0013:P{'zD\n\u0019", "\"dgA90>Z\u0018Z\u0004b4x\u00183o\t\u0007\fM|&\u001bQx", "\"dgA90>Z\u0018by", "\"dgA90>Z\u0018iv]+\u0001\u00121", "5dc!X?M4\u001d~\u0002]\u0017x\b.i\t*", "\"qP6_0GU|}", "(da<66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc'X9H1#\b\tm9x\r8t\u000e", "u(9", "\u0018", ":`h<h;\"R", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "5dc\u0019T@Hc(by", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "\u0011n\\:b5\u001dS\u0017\t\bZ;\u0001\u00138B\n;", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u001dMVJL8\u001e\u001cgPM\u0012c\u0002", "D`[BX", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", ":`Q2_", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", ">qT3\\?", "AtU3\\?", "At_=b9MW\"\u0001i^?\f", "Ah]4_,%W\"~", "", "3mP/_,=", "7r4?e6K", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "1n]AT0GS&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw<CNz\u0015\"\u0015o`(\u001bn,$],C]JucN{?]\u007fi\u001bR4\u000fZ@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0013/FuP@Rl.c\u001f)\u001bfBE.\"qb+l\u001a=\n\u000fbZv[\u0005wv\u0011\n~F4:tJSAxc=~4'G\u000b{\u001c;.[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\u000bcO%k\u0017\u0015f>z\u001evm-I\u001f\u0010[&_?jmJ\u0018b\u000f<Xs\u001f0\u0013T)a\u0004$\u0010\u000b-7jZKdU\u0011#nS&i\u001a\u0011LG(%,%Ac\u00185\u007fF=W\"\u0010lAU\u0001jK^qX\u0019kZve`}m\u0017\t\u001aG07UEC(*u\u001a%;\u0005\u0014H\"\u0005q\fzF\u001c#4AcAp*\u0010\u001bpQ1\u001dqAht\u00147\faGrgA,&\u0006Wi\r\u001e[M<\f<O\u0013K2EaZ\tFc\u001fe\u0013S\u001f>gx\u001f\f`\u0005=\u0014o\u001e\t\u0002:|\u001d%:oVW(e*3p\u0015X_d\u0012$\u0002|aM#W\u0017m[\u0012\u0018\bc:\u000f\u001e\"\u0010i\u001f\\\n(?IRR\u007fh7\u0011\rT\u0013.VF}mCD\u0005*P\u0012\u0013\u0004N\u0016#O$I \n\u0005jN\u0005HM+\u000b\u0002`C\u0015a\u0005\u0013B(%\u000bcE?l\rdm\t|;\u001a\u0006B8y\u000bP>j\u0005f\u001cr+hKpog\u001dC\u001c(aS\u00021yg1\u0010ke\u0006>P\u000e\u00186C?z\u0010DN-@Z+x{*w\u0019$\u0017Z$\u001d}=qz'P{!LJm-Qr\u0011E|a=dM\u000f^:)\u0019\u0016c\u0011Bkw1\u0001*SYL4_%JB}\u001dK-n)\n&\u001dA,\u0001UC'}\u001bI#bA\u000f\n\u0018Y\rb\u0003K^\u001c]xdc\u0017n65", "\u0012dR<e(MW#\b", "1n]AX5M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M", "\u0012dR<e(MW#\bBB=O}?3o", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh\u001d2", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "\u0012dR<e(MW#\bB,\u0011Dy\u00199g", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4YZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~w\u0001Ke\u0014Oy^SK1sPg_\u0007\u001d%\tS", "\"dgA90>Z\u0018m\bZ5\u000b\r>i\n1i>\u000b\"\u0017", "7m_Bg\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0012VNKz\u001f!\u0011va\u000f", "4nRBf,=:\u0015{ze\u001b|\u001c>S\u000f<\u0003@^!\u001eQ|", "CmU<V<LS\u0018ev[,\u0004w/x\u000f\u0016\u000bT\b\u0017tQv\u0018I", ":`Q2_\nHZ#\f", "Ag^D?(;S ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":`Q2_\u0017K]\u001b\fzl:", ":`Q2_\u001b>f(l\nr3|f9l\n5", ":`Q2_\nH\\(~\u0004m\n\u0007\u00109r", ">kP0X/HZ\u0018~\bH7x\u00073t\u0014", ">qT3\\?,c\u001a\u007f~q\u0016\b\u0005-i\u000f<", "\"dgA90>Z\u0018m\bZ5\u000b\r>i\n1i>\u000b\"\u0017\u000fT\"\u000fWs\u001ag", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw1LF{C\t\u0018do9\\H\u00113k\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqRa|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\u0007WJTf2dU='dED2\u0014~n~,A", "/mX:T;>0#\fy^9j\u0018<o\u0006(WNn&\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "4nRBf,=", "4nRBf,=0#\fy^9k\f3c\u00061{N\u000f", "CmU<V<LS\u0018[\u0005k+|\u0016\u001eh\u0004&\u0002I\u0001%%", "/mX:T;>0#\fy^9j\u0018<o\u0006(WNn&\u0013VoU%\u0007\u0012BDM\f", "uYI'?(GR&\t~]?F\u00079m\u000b2\n@J\u001f\u0013Vo\u001b@r,\u0003#l J|v2MJ:I>%\u001fuo\u000fgD\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_fJI63\u0014G", "6dX4[;(`\u000e~\bh", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "EhSA[\u0016KH\u0019\f\u0005", "2dU.h3M3&\f\u0005k\u001a|\u0011+n\u000f,yN", "2dU.h3M3&\f\u0005k\u0014|\u0017=a\u0002(", "BdgA90>Z\u0018[v\\2~\u00169u\t'", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", ";`c2e0:Zfx\b^3|\u0005=e", "Ag^DC3:Q\u0019\u0002\u0005e+|\u0016", "Ag^DC9>T\u001d\u0012hn-}\rB"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m6638constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6638constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m6638constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m6638constructorimpl(24);

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.internal.TextFieldType r47, final java.lang.String r48, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, final androidx.compose.ui.text.input.VisualTransformation r50, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, boolean r58, boolean r59, boolean r60, final androidx.compose.foundation.interaction.InteractionSource r61, final androidx.compose.foundation.layout.PaddingValues r62, final androidx.compose.material3.TextFieldColors r63, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r64, androidx.compose.runtime.Composer r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instruction units count: 3346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.internal.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m2995Decoration3JVO9M(final long j2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208685580);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(j2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            int i4 = composerStartRestartGroup.changed(textStyle) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 + 147) - (147 | i3) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, (i3 + PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION) - (i3 | PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    long j3 = j2;
                    TextStyle textStyle2 = textStyle;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i6 = i2;
                    TextFieldImplKt.m2995Decoration3JVO9M(j3, textStyle2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i6 + 1) - (i6 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m2996DecorationIv8Zu3U(final long j2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(660142980);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk");
        if ((6 & i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(j2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j2));
            int i4 = ProvidedValue.$stable;
            int i5 = i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function2, composerStartRestartGroup, (i5 + i4) - (i5 & i4));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TextFieldImplKt.m2996DecorationIv8Zu3U(j2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z2, final String str) {
        return z2 ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline outlineMo621createOutlinePq9zytI = shape.mo621createOutlinePq9zytI(cacheDrawScope.m3827getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        OutlineKt.m4437drawOutlinewDX37Ww$default(drawScope, outlineMo621createOutlinePq9zytI, colorProducer2.mo2078invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
                    }
                });
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
    /* JADX INFO: renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m2997TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase r29, long r30, long r32, long r34, boolean r36, kotlin.jvm.functions.Function7<? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.m2997TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase, long, long, long, boolean, kotlin.jvm.functions.Function7, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m3000animateBorderStrokeAsStateNuRrP5Q(boolean z2, boolean z3, boolean z4, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State<Color> stateRememberUpdatedState;
        State<Dp> stateRememberUpdatedState2;
        float f4 = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 2047013045, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i2, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jM2673indicatorColorXeAY9LY$material3_release = textFieldColors.m2673indicatorColorXeAY9LY$material3_release(z2, z3, z4);
        if (z2) {
            composer.startReplaceGroup(1023053998);
            ComposerKt.sourceInformation(composer, "445@17754L84");
            stateRememberUpdatedState = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(jM2673indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023165505);
            ComposerKt.sourceInformation(composer, "447@17868L33");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(jM2673indicatorColorXeAY9LY$material3_release), composer, 0);
            composer.endReplaceGroup();
        }
        if (z2) {
            composer.startReplaceGroup(1023269417);
            ComposerKt.sourceInformation(composer, "453@18068L85");
            if (!z4) {
                f4 = f3;
            }
            stateRememberUpdatedState2 = AnimateAsStateKt.m465animateDpAsStateAjpBEmI(f4, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023478388);
            ComposerKt.sourceInformation(composer, "455@18183L46");
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m6636boximpl(f3), composer, (-1) - (((-1) - (i2 >> 15)) | ((-1) - 14)));
            composer.endReplaceGroup();
        }
        State<BorderStroke> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m600BorderStrokecXLIe8U(stateRememberUpdatedState2.getValue().m6652unboximpl(), stateRememberUpdatedState.getValue().m4188unboximpl()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState3;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f2 = 16;
        TextFieldPadding = Dp.m6638constructorimpl(f2);
        MinFocusedLabelLineHeight = Dp.m6638constructorimpl(f2);
        MinSupportingTextLineHeight = Dp.m6638constructorimpl(f2);
        float f3 = 48;
        IconDefaultSizeModifier = SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f3));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
