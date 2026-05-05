package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĭ\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6Ri*\u0017ӆ\u00044:[,ڎK;c#\u0006̝\u0011O\\monPZ\u0013C\u001d(\u001exx8QU\u000f]\u001a\u000f8Cw?IMw=?i|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00138@~XZ\rc\u0005\"\u0012\u001c>(\u00014\\oNLHtҗB/9\u0003qBT'g0\u0013M\u0015Fb.\u0015Ǹi\u001eA@?5\u001b%[\u0003\u001dRc?\u0019?yܵ\rh='3IyYNݞ~\"ƃCO;\\#*j\u0005i`:([UiK^\u0010@w)~=B\n\u000e\u0014+`.[\u001f\u0017\u001c\u00143\u0003xkN`\u0004nB.\u0003q8'%.2A8Im\u0002gA\u0019\\@\u0014\u0005;(S\u0007t!i_&`C'\u0005}W1_MUH|\u0018\nCs\u0004~q\u001a*2>w\u00125{\u001f>/1G]I#O}\u0012JTg%\u0018\u000fy\u001an˦G̱ؗr\u0018=>\u0017!rնc\u0013ߘhT\u0007+AQ*T\u001f}6\u0014Pb}</'(N}k\u001apS]\u0018)Gfe^\u001f\u007f\u0014WGdKCae a\u0001~$ALb3W|A\u0002\u0013\u000bb.\"@Q\u0003\u0010&\u0006tT\u0012\u0013@J\n\u001cb8a\u001fb\u0015V\u00106Bo\u000b9e`h\u001e\u000el3R\u0011\u001a6z\t\u000f`t|\u007fi\tIZ\u000fp$=A\u007fHG7\u0006*n4\u000b9\u001f\u0001\n~u~\u0013Lǻkֵ\u0091Y}&.(Ri(KП'~W121SL\u000be\u007fNB-\u0001|\b\u0011Sh\\j8pv,nnbO\u0003\u001cR\u000bdr1\u000e|\u000e\ncVzukd\rk>wq\u0019XjUh\u0003\u000b\u001f,.\u0019oP\u0007e3I'+!\u0010\u0014]!\u0012coo<\u0007z\u000fT\u0003\u0016\u00162c$\u007fz]m4K8wk\u000f@2$\u001b\u0016pY1|\u06ddAކΌ\u00115N[r\fn\u001b[ߒG}\u0015\u0006\\\u0011~Vs:A\u0002.:4_8u[}Bas+\u0017Mak\u0006mya;^\u0015\n\u0019\u0002I|\"\u001eM \u0005_r\u000b@\u0006\"\u0017L@ii5B\u000f$B5T\b9M\u0005o\f\u0010\t\u000b^_=#bHy;d\u001blx\u000bd\u000f\n߳DǷՃ.\u0003\u0005+A;\u0011\"?܊\u0006F\u0003.\u00146\u000fS5\tI|\u007f\u0005l%9Fl9I+\t\u0007\u0011EkGa\u0002d\tw=sk}\u0012P&\r\u001fR\u0018IAa\u0013ov^]!T\u0013U\u0015|\u0018f`W:)-\u0005-\u0014B\n\u001d\u00161O!{\u00133RN\u0006D[\u001a/%t/\r\f\u000br^\u001b[\u0014{2؊Hݝ͂+}]mI\u001c \u0019.ٴ\u001ctO[\b\u0012t\nu\u001bh(\"\u001ch\u0002\u0017\u0015h 21zzx\n<\fNO082'dYy}9N7-|\u0006pSxz\u001ac\u001bb\u0005T9\n\u00177\\y|6h\u001d71}4\u0019XhE)SNdA\u0006\u001a\u00154,N\b\u00117@Uih~zg[;9_s0a?Fj \u0014\u001e(\rJ/ƍ'ֽͪZODx\u0017{\u0005ܱV\u001c~\u0003(\u0013s<-\"~\u0017H\r\u0014C8Tr6d]8I1i\u0013_n\u0017\u0006UIT)ATO\u001be1!nV}A\u0007H\u0004\r\u007fXN9\u0005\u0006g:=^`M\u001c7YR\u007ft\u00056KsKp\u0019\\\u0015\u001c\u0015GZf%n`(%SQaKI\u0015\u000f P\u0006\u001e\u0013I9x^k%X\u000f-\u0005\u001bN\u00121\u001aH$;\u0001EG\u000f\u001e>\blIIMgb&:'\u0016P\rc{X%`Z`eW, mN\u0010\f/$R-\u0006%\u0010E_G@^\u000bG\u001dtՋ\u0003ڏń:pJKU\u0016\u00112\u0018V\u00024\u0004zkuDC\u000b\u0014GqN4=t\u0017G]h(:Z\fsBe;\u001c(aB-\u001a]\"X1Yt]/\u000b\u000fj>$\u000eHdy<\nIPYX\u0012[@\u001bc\u0003\u0007{\u0005w\u001cH\u0014\u001d\r2-ATp\u007f\u000fRF[{|Tltzc@\u0011B\u0007\u000f<\u070e-PD#\u0006D1p\u00170\u0001zd#\u0013KG\"Bw\u0016d\u007f9\u001d?`U\u00183m\u0003UOW\u0002XkAC\r}J\u00074{[3\\QOr4-\u007f\u00195^KdI2*\u0007\u0012>IrU(D'RXq>?HP-hsa\u000f>7=\u00048\u0016\u0011@\u001cOit\u0019;=gpbUQh'<\u0019\u000foDC%,\u0010QH3}\u001d9N\u007f\u0018^_T++w;\u0013cZ!]\u0005U.oR\u001d\\sc1YU}:EW*\u0014)<d}\u0012\u0018%Rq\u0011rNd9J[Y?\u000eRl\u001fz#\u000bD\u000bf\\L=ܶ\u0010ߊɲ9=e~:m\u0080\tLWm\u0002۳\u0002\u001eeڷ]\u000eӊ/}'\u007fIq?d&ǻ\u058bn"}, d2 = {"\u0010`b6V\u001b>f(", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "7m[6a,\u001c]\"\u000ezg;", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001bv\u001d2VC*kG-rrjH\u0007l;$", "\u0010`b6V\u001b>f(Fka*\u000eu\u001a8", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G91*:S9#y#0GE\b!6_>\u0013p8Y\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fI#HZg}l\bkr'l\u0012\u001cbB\u0007|I)T", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "\u0010`b6V\u001b>f(FgP6N\u0018\u001fw", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G91*:S9#y#0GE\b!6_>\u0013p8Y\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fL\u0017\tMpqwA\u0012f-+e\u0018i?>\u0004robX\r\u0007jlB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C\"\u0019\u00103qmI\rx^\t%zR\"lfff*\t", "\u0010`b6V\u001b>f(FIR\u0012\u0004\f!E", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G91*:S<Ap8\u001b\u0015\f\u0007\u00169\"\\'\u007f\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oCL\u001cNOku6\u001c\u0018p*k\u0016\u000eo\u000b\u0015|)V", "\u0010`b6V\u001b>f(FWi\u000bN\u000e=M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011NhA7}\u000e&\u001f\u001b;7\u0011Oo\u0001a|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0006ywf|\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mK}dUIwU\u0006R1'V\u0006\u0006\u0012?.X\u000f8\u001e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011NhA7}\u000e&\u001f\u001b;7\u0011Oo\u0001a|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0006ywf|~OL7\t\t]\u0015qeCeqO$\u0005F$\bzkOTs]<>\u0005)S\u0007\u0002 2eJ\u000fXpt", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011NhA7}\u000e&\u001f\u001b;7\u0011Oo\u0001a|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0006ywf|~OL7\t\t]\u0015qeCeqO$\u0005F$\b}_\u0010G|QGw+\u001dYEU\u001c9b\u0002\u0016\u00027\u0003D(6qZ2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQkl=<#sep\u001erj!\b", "\u001a`h<h;0W(\u0002ab5\u0003\u0017\u000bn~\f\u0005G\u0005 \u0017%y\u0017Kv.D", "6`b\u0016a3B\\\u0019\\\u0005g;|\u0012>", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "Ad[2V;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "=mB5b>-`\u0015\b\te(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rNi{\u0005lP\u0012~AE.\f;Y\u0011?r\n|\u0012\u0015EjF", "\u001a`h<h;0W(\u0002ab5\u0003\u0017\u000bn~\f\u0005G\u0005 \u0017%y\u0017Kv.D!\u000f\nA:\u0017#A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018\u0006'Z[\u0018\be[|L\u0010!Z\r<:\u001a\tbCyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchE\u001d6,g&u\b)-k>Am{m$pOL7\t\t]\u0015qeCeqO$\u0005F$\b}_\u0010TohK>\u0016\u001f^\u000be!F_t\u0001X\"g\u0018\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006#C\u0015ru\u007fMWi)j\u0017WC?:(FakL\u0016\u001b\u001c\u0004[Ckf\u00127_[%Ex\u00144P\u0003AnC\u0013\u0013\u000f/wsI\r\u001c^\u0011#o@1c\u001b\fLu\u0018/=_Ec\u000el+c7Z!RV8\u0013{WR\u0019zQmwT\u0002hav+6\u0006f0\u001d<JI\u0001VB\u0003Y\u0014>\t\u0016\t+s3R}\u007f\u00152!H\\<`nxhqZ,&RE&\u001e=/\u0002_\u0016Ud\u00026\u001c\u0002\u00172\u0002&e\b9\u0012<?Xn,Eq\u0015eLcP\u001f0W\u001ez6[\u0012KZ\u0001?Nm!I\u00025\u0001\u001e&:&?T/p*3n\fUgy%:%\u000fX[k1vR\f9", ";dP@h9>E\u001d\u000e}M,\u0010\u0018\u001ca\t*{(\u0001\u0013%W|\u000e\u001a\u0001.Ch\u000b\u001c;v%<", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";dP@h9:P ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "Ag^B_+&S\u0015\r\u000bk,c\r8k\u000e", "Ad[2V;B]\"byL(\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "", "Ad[2V;B]\"kz`0\u000b\u0018<a\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJi", "BdgA@6=W\u001a\u0003zk", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "=m?9T*>V#\u0006y^9c\u0005Co\u00107", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "BdgA@6=W\u001a\u0003zkszi26]\bW", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018\u0006'Z[\u0018\be[|L\u0010!Z\r<:\u001a\tbCyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fK\u0012i,c>Cm\u0019\u0003!di`7\b\u000bW\u001b{`CHwP\u0017\n<.G91*:S9#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007ft\t\u0015v\u0018QmB\u00166ePp\u0007@E\" GkysRLU\u001fo\u0012\u0015s5>nLj_Y\u000bPm&_<+F\u0005Ea[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rocq\u0015\u0012FX\u001cr.^J\u0017\u0011\u0013pC\u0016\nY\r\u0016zX\u0019lG\u0002_axmEx$Xj;U;zSGo\u001d$}n\u000b\u0006\u001dqxF\u0004?p/.LfBig/\u0018=:\u001e\"fE&#,DKPJvi\u00025\u0015G\u001elF\u0017j:C\u00057?W4\u007fFjU\u0012'g\\\u000f<K\u0015<6[\u001cLjz9S8\u0013\u0011\fty#%*5yQ(ud\u0010v\u0015\n\u0019s'8fV\u001c5\u0012V\u0012{RL\u0019\u0011%-\u000f\u0018-Pv\u0015\u0016\u0011-\r\"XGz 7\b\u000b*", "4nd;W(MW#\btk,\u0004\t+s\u007f", "2hb=_(RS\u0018mzq;"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BasicTextKt {
    /* JADX INFO: renamed from: BasicText-VhcvRP8 */
    public static final void m1314BasicTextVhcvRP8(final String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        Modifier modifierM1317textModifiercFh6CEA;
        ColorProducer colorProducer2 = colorProducer;
        int i9 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        Function1<? super TextLayoutResult, Unit> function12 = function1;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)101@5004L7,151@6858L41:BasicText.kt#423gt5");
        if ((i6 & 1) != 0) {
            i7 = (-1) - (((-1) - i5) & ((-1) - 6));
        } else if ((i5 & 6) == 0) {
            i7 = (-1) - (((-1) - (composerStartRestartGroup.changed(str) ? 4 : 2)) & ((-1) - i5));
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            int i11 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i7 = (i7 + i11) - (i7 & i11);
        }
        int i12 = (-1) - (((-1) - i6) | ((-1) - 4));
        if (i12 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
        }
        int i13 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i13 != 0) {
            i7 |= 3072;
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024)));
        }
        int i14 = i6 & 16;
        if (i14 != 0) {
            i7 |= 24576;
        } else if ((-1) - (((-1) - i5) | ((-1) - 24576)) == 0) {
            int i15 = composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192;
            i7 = (i7 + i15) - (i7 & i15);
        }
        int i16 = i6 & 32;
        if (i16 != 0) {
            i7 = (i7 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i7 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i5) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        int i17 = (i6 + 64) - (i6 | 64);
        if (i17 != 0) {
            i7 = (i7 + 1572864) - (i7 & 1572864);
        } else if ((i5 & 1572864) == 0) {
            int i18 = composerStartRestartGroup.changed(i9) ? 1048576 : 524288;
            i7 = (i7 + i18) - (i7 & i18);
        }
        int i19 = (i6 + 128) - (i6 | 128);
        if (i19 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i5) | ((-1) - 12582912)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(i4) ? 8388608 : 4194304)));
        }
        int i20 = (-1) - (((-1) - i6) | ((-1) - 256));
        if (i20 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 100663296));
        } else if ((i5 & 100663296) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(colorProducer2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i7) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (i10 != 0) {
                companion = Modifier.Companion;
            }
            if (i12 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            SelectionController selectionController = null;
            if (i13 != 0) {
                function12 = null;
            }
            if (i14 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i16 != 0) {
                z3 = true;
            }
            if (i17 != 0) {
                i9 = Integer.MAX_VALUE;
            }
            i8 = i19 == 0 ? i4 : 1;
            if (i20 != 0) {
                colorProducer2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1186827822, i7, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(i8, i9);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localSelectionRegistrar);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) objConsume;
            if (selectionRegistrar != null) {
                composerStartRestartGroup.startReplaceGroup(-1589202404);
                ComposerKt.sourceInformation(composerStartRestartGroup, "103@5140L7,105@5286L69,105@5203L152,108@5364L234");
                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localTextSelectionColors);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                long jM1747getBackgroundColor0d7_KjU = ((TextSelectionColors) objConsume2).m1747getBackgroundColor0d7_KjU();
                Object[] objArr = {selectionRegistrar};
                Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328352935, "CC(remember):BasicText.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Long invoke() {
                            return Long.valueOf(selectionRegistrar.nextSelectableId());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                long jLongValue = ((Number) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4)).longValue();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328350274, "CC(remember):BasicText.kt#9igjgp");
                boolean z4 = (-1) - (((-1) - ((composerStartRestartGroup.changed(jLongValue) ? 1 : 0) | (composerStartRestartGroup.changed(selectionRegistrar) ? 1 : 0))) & ((-1) - (composerStartRestartGroup.changed(jM1747getBackgroundColor0d7_KjU) ? 1 : 0))) == 1;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new SelectionController(jLongValue, selectionRegistrar, jM1747getBackgroundColor0d7_KjU, null, 8, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                selectionController = (SelectionController) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1588686502);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (selectionController != null || function12 != null) {
                composerStartRestartGroup.startReplaceGroup(-1588564052);
                ComposerKt.sourceInformation(composerStartRestartGroup, "130@6178L7");
                Modifier modifierM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                AnnotatedString annotatedString = new AnnotatedString(str, null, null, 6, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localFontFamilyResolver);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                modifierM1317textModifiercFh6CEA = m1317textModifiercFh6CEA(modifierM4339graphicsLayerAp8cVGQ$default, annotatedString, textStyle2, function12, iM6576getClipgIe3tQ8, z3, i9, i8, (FontFamily.Resolver) objConsume3, null, null, selectionController, colorProducer2, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1587866335);
                ComposerKt.sourceInformation(composerStartRestartGroup, "143@6671L7");
                Modifier modifierM4339graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume4 = composerStartRestartGroup.consume(localFontFamilyResolver2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                modifierM1317textModifiercFh6CEA = modifierM4339graphicsLayerAp8cVGQ$default2.then(new TextStringSimpleElement(str, textStyle2, (FontFamily.Resolver) objConsume4, iM6576getClipgIe3tQ8, z3, i9, i8, colorProducer2, null));
                composerStartRestartGroup.endReplaceGroup();
            }
            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1317textModifiercFh6CEA);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, emptyMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i8 = i4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1<? super TextLayoutResult, Unit> function13 = function12;
            final int i21 = iM6576getClipgIe3tQ8;
            final boolean z5 = z3;
            final int i22 = i9;
            final int i23 = i8;
            final ColorProducer colorProducer3 = colorProducer2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
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

                public final void invoke(Composer composer2, int i24) {
                    String str2 = str;
                    Modifier modifier3 = modifier2;
                    TextStyle textStyle4 = textStyle3;
                    Function1<TextLayoutResult, Unit> function14 = function13;
                    int i25 = i21;
                    boolean z6 = z5;
                    int i26 = i22;
                    int i27 = i23;
                    ColorProducer colorProducer4 = colorProducer3;
                    int i28 = i5;
                    BasicTextKt.m1314BasicTextVhcvRP8(str2, modifier3, textStyle4, function14, i25, z6, i26, i27, colorProducer4, composer2, RecomposeScopeImplKt.updateChangedFlags((i28 + 1) - (i28 & 1)), i6);
                }
            });
        }
    }

    /* JADX INFO: renamed from: BasicText-RWo7tUw */
    public static final void m1312BasicTextRWo7tUw(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, Map<String, InlineTextContent> map, ColorProducer colorProducer, Composer composer, final int i5, final int i6) {
        int i7;
        SelectionController selectionController;
        int i8;
        int i9;
        Function1<? super TextLayoutResult, Unit> function12 = function1;
        ColorProducer colorProducer2 = colorProducer;
        Map<String, InlineTextContent> mapEmptyMap = map;
        int i10 = i4;
        int i11 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)196@9257L7:BasicText.kt#423gt5");
        if ((i6 + 1) - (i6 | 1) != 0) {
            i7 = (-1) - (((-1) - i5) & ((-1) - 6));
        } else if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i12 = (i6 + 2) - (i6 | 2);
        if (i12 != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((-1) - (((-1) - i5) | ((-1) - 48)) == 0) {
            int i13 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i7 = (i7 + i13) - (i7 & i13);
        }
        int i14 = (i6 + 4) - (i6 | 4);
        if (i14 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
        }
        int i15 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i15 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i16 = i6 & 16;
        if (i16 != 0) {
            i7 |= 24576;
        } else if ((i5 + 24576) - (i5 | 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192;
        }
        int i17 = i6 & 32;
        if (i17 != 0) {
            i7 = (i7 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i7 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        int i18 = (i6 + 64) - (i6 | 64);
        if (i18 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 1572864));
        } else if ((i5 & 1572864) == 0) {
            int i19 = composerStartRestartGroup.changed(i11) ? 1048576 : 524288;
            i7 = (i7 + i19) - (i7 & i19);
        }
        int i20 = (i6 + 128) - (i6 | 128);
        if (i20 != 0) {
            i7 = (i7 + 12582912) - (i7 & 12582912);
        } else if ((i5 + 12582912) - (i5 | 12582912) == 0) {
            i7 |= composerStartRestartGroup.changed(i10) ? 8388608 : 4194304;
        }
        int i21 = (i6 + 256) - (i6 | 256);
        if (i21 != 0) {
            i7 |= 100663296;
        } else if ((-1) - (((-1) - i5) | ((-1) - 100663296)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(mapEmptyMap) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i22 = (i6 + 512) - (i6 | 512);
        if (i22 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(colorProducer2) ? 536870912 : 268435456)));
        }
        if ((i7 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            i9 = i11;
            i8 = i10;
        } else {
            if (i12 != 0) {
                companion = Modifier.Companion;
            }
            if (i14 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i15 != 0) {
                function12 = null;
            }
            if (i16 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i17 != 0) {
                z3 = true;
            }
            if (i18 != 0) {
                i11 = Integer.MAX_VALUE;
            }
            if (i20 != 0) {
                i10 = 1;
            }
            if (i21 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (i22 != 0) {
                colorProducer2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1064305212, i7, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(i10, i11);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localSelectionRegistrar);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) objConsume;
            if (selectionRegistrar != null) {
                composerStartRestartGroup.startReplaceGroup(-1584983428);
                ComposerKt.sourceInformation(composerStartRestartGroup, "198@9393L7,200@9539L69,200@9456L152,203@9617L234");
                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localTextSelectionColors);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                long jM1747getBackgroundColor0d7_KjU = ((TextSelectionColors) objConsume2).m1747getBackgroundColor0d7_KjU();
                Object[] objArr = {selectionRegistrar};
                Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328216839, "CC(remember):BasicText.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Long invoke() {
                            return Long.valueOf(selectionRegistrar.nextSelectableId());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                long jLongValue = ((Number) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4)).longValue();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328214178, "CC(remember):BasicText.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(jLongValue);
                boolean zChanged2 = composerStartRestartGroup.changed(selectionRegistrar);
                boolean zChanged3 = (((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1) | composerStartRestartGroup.changed(jM1747getBackgroundColor0d7_KjU);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new SelectionController(jLongValue, selectionRegistrar, jM1747getBackgroundColor0d7_KjU, null, 8, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                selectionController = (SelectionController) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1584467526);
                composerStartRestartGroup.endReplaceGroup();
                selectionController = null;
            }
            boolean zHasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
            boolean zHasLinks = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
            if (zHasInlineContent || zHasLinks) {
                i8 = i10;
                i9 = i11;
                composerStartRestartGroup.startReplaceGroup(-1583391888);
                ComposerKt.sourceInformation(composerStartRestartGroup, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328167685, "CC(remember):BasicText.kt#9igjgp");
                boolean z4 = (i7 + 14) - (14 | i7) == 4;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final MutableState mutableState = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AnnotatedString annotatedStringBasicText_RWo7tUw$lambda$5 = BasicText_RWo7tUw$lambda$5(mutableState);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localFontFamilyResolver);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                FontFamily.Resolver resolver = (FontFamily.Resolver) objConsume3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328147596, "CC(remember):BasicText.kt#9igjgp");
                boolean zChanged4 = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                            invoke2(textSubstitutionValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                            AnnotatedString original;
                            MutableState<AnnotatedString> mutableState2 = mutableState;
                            if (textSubstitutionValue.isShowingSubstitution()) {
                                original = textSubstitutionValue.getSubstitution();
                            } else {
                                original = textSubstitutionValue.getOriginal();
                            }
                            mutableState2.setValue(original);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                int i23 = (-1) - (((-1) - (i7 >> 3)) | ((-1) - 910));
                int i24 = i7 >> 12;
                int i25 = (i24 + 57344) - (i24 | 57344);
                int i26 = i7 << 6;
                int i27 = (-1) - (((-1) - (((-1) - (((-1) - ((i23 + i25) - (i23 & i25))) & ((-1) - ((-1) - (((-1) - (i7 << 9)) | ((-1) - 458752)))))) | (3670016 & i26))) & ((-1) - ((29360128 + i26) - (29360128 | i26))));
                int i28 = 234881024 & i26;
                int i29 = ((i27 + i28) - (i27 & i28)) | (i26 & 1879048192);
                int i30 = i7 >> 21;
                m1315LayoutWithLinksAndInlineContentvOo2fZY(companion, annotatedStringBasicText_RWo7tUw$lambda$5, function12, zHasInlineContent, mapEmptyMap, textStyle2, iM6576getClipgIe3tQ8, z3, i9, i8, resolver, selectionController, colorProducer2, (Function1) objRememberedValue4, composerStartRestartGroup, i29, (i30 + 896) - (i30 | 896), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1584294453);
                ComposerKt.sourceInformation(composerStartRestartGroup, "229@10603L7,217@10089L814");
                Modifier modifierM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume4 = composerStartRestartGroup.consume(localFontFamilyResolver2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i8 = i10;
                i9 = i11;
                Modifier modifierM1317textModifiercFh6CEA = m1317textModifiercFh6CEA(modifierM4339graphicsLayerAp8cVGQ$default, annotatedString, textStyle2, function12, iM6576getClipgIe3tQ8, z3, i11, i10, (FontFamily.Resolver) objConsume4, null, null, selectionController, colorProducer2, null);
                EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1317textModifiercFh6CEA);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl, emptyMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1<? super TextLayoutResult, Unit> function13 = function12;
            final int i31 = iM6576getClipgIe3tQ8;
            final boolean z5 = z3;
            final int i32 = i9;
            final int i33 = i8;
            final Map<String, InlineTextContent> map2 = mapEmptyMap;
            final ColorProducer colorProducer3 = colorProducer2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
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

                public final void invoke(Composer composer2, int i34) {
                    AnnotatedString annotatedString2 = annotatedString;
                    Modifier modifier3 = modifier2;
                    TextStyle textStyle4 = textStyle3;
                    Function1<TextLayoutResult, Unit> function14 = function13;
                    int i35 = i31;
                    boolean z6 = z5;
                    int i36 = i32;
                    int i37 = i33;
                    Map<String, InlineTextContent> map3 = map2;
                    ColorProducer colorProducer4 = colorProducer3;
                    int i38 = i5;
                    BasicTextKt.m1312BasicTextRWo7tUw(annotatedString2, modifier3, textStyle4, function14, i35, z6, i36, i37, map3, colorProducer4, composer2, RecomposeScopeImplKt.updateChangedFlags((i38 + 1) - (i38 & 1)), i6);
                }
            });
        }
    }

    private static final AnnotatedString BasicText_RWo7tUw$lambda$5(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: BasicText-BpD7jsM */
    public static final /* synthetic */ void m1311BasicTextBpD7jsM(String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        int i7 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        Function1 function12 = function1;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)279@12355L234:BasicText.kt#423gt5");
        String str2 = str;
        if ((i5 + 1) - (i5 | 1) != 0) {
            i6 = (i4 + 6) - (i4 & 6);
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = (-1) - (((-1) - i5) | ((-1) - 2));
        if (i8 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i9 = (i5 + 4) - (i5 | 4);
        if (i9 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 256 : 128)));
        }
        int i10 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i10 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i4 & 3072) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024)));
        }
        int i11 = (-1) - (((-1) - i5) | ((-1) - 16));
        if (i11 != 0) {
            i6 = (i6 + 24576) - (i6 & 24576);
        } else if ((i4 & 24576) == 0) {
            int i12 = composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192;
            i6 = (i6 + i12) - (i6 & i12);
        }
        int i13 = (i5 + 32) - (i5 | 32);
        if (i13 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((196608 & i4) == 0) {
            int i14 = composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = i5 & 64;
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i4) | ((-1) - 1572864)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(i7) ? 1048576 : 524288)));
        }
        if ((i6 + 599187) - (599187 | i6) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (i8 != 0) {
                companion = Modifier.Companion;
            }
            if (i9 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i10 != 0) {
                function12 = null;
            }
            if (i11 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i13 != 0) {
                z3 = true;
            }
            if (i15 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022429478, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:278)");
            }
            int i16 = (i6 + 14) - (14 | i6);
            int i17 = ((i16 + 12582912) - (i16 & 12582912)) | ((-1) - (((-1) - i6) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i18 = (-1) - (((-1) - i6) | ((-1) - 896));
            int i19 = ((i17 + i18) - (i17 & i18)) | ((i6 + 7168) - (7168 | i6));
            int i20 = (-1) - (((-1) - 57344) | ((-1) - i6));
            int i21 = (i19 + i20) - (i19 & i20);
            int i22 = (-1) - (((-1) - 458752) | ((-1) - i6));
            int i23 = (i21 + i22) - (i21 & i22);
            int i24 = (-1) - (((-1) - i6) | ((-1) - 3670016));
            int i25 = (i23 + i24) - (i23 & i24);
            str2 = str2;
            Modifier modifier2 = companion;
            m1314BasicTextVhcvRP8(str2, modifier2, textStyle2, (Function1<? super TextLayoutResult, Unit>) function12, iM6576getClipgIe3tQ8, z3, i7, 1, (ColorProducer) null, composerStartRestartGroup, i25, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str3 = str2;
            final Modifier modifier3 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1 function13 = function12;
            final int i26 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i27 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
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

                public final void invoke(Composer composer2, int i28) {
                    String str4 = str3;
                    Modifier modifier4 = modifier3;
                    TextStyle textStyle4 = textStyle3;
                    Function1<TextLayoutResult, Unit> function14 = function13;
                    int i29 = i26;
                    boolean z5 = z4;
                    int i30 = i27;
                    int i31 = i4;
                    BasicTextKt.m1311BasicTextBpD7jsM(str4, modifier4, textStyle4, function14, i29, z5, i30, composer2, RecomposeScopeImplKt.updateChangedFlags((i31 + 1) - (i31 & 1)), i5);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: BasicText-4YKlhWE */
    public static final /* synthetic */ void m1309BasicText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, Map map, Composer composer, final int i4, final int i5) {
        int i6;
        Map mapEmptyMap = map;
        int i7 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        Function1 function12 = function1;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)303@13046L273:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = (i5 + 2) - (i5 | 2);
        if (i8 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i9 = (i5 + 4) - (i5 | 4);
        if (i9 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
        }
        int i10 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i10 != 0) {
            i6 = (i6 + 3072) - (i6 & 3072);
        } else if ((i4 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i11 = (-1) - (((-1) - i5) | ((-1) - 16));
        if (i11 != 0) {
            i6 |= 24576;
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192)));
        }
        int i12 = i5 & 32;
        if (i12 != 0) {
            i6 = (i6 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i4) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 131072 : 65536)));
        }
        int i13 = (-1) - (((-1) - i5) | ((-1) - 64));
        if (i13 != 0) {
            i6 |= 1572864;
        } else if ((i4 + 1572864) - (i4 | 1572864) == 0) {
            int i14 = composerStartRestartGroup.changed(i7) ? 1048576 : 524288;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = (-1) - (((-1) - i5) | ((-1) - 128));
        if (i15 != 0) {
            i6 = (i6 + 12582912) - (i6 & 12582912);
        } else if ((i4 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 8388608 : 4194304;
        }
        if ((i6 + 4793491) - (4793491 | i6) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (i8 != 0) {
                companion = Modifier.Companion;
            }
            if (i9 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i10 != 0) {
                function12 = null;
            }
            if (i11 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i12 != 0) {
                z3 = true;
            }
            if (i13 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (i15 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648605928, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:302)");
            }
            int i16 = (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i6) | ((-1) - 14)))) & ((-1) - 12582912)))) & ((-1) - ((-1) - (((-1) - i6) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))))) & ((-1) - (896 & i6))))) & ((-1) - ((-1) - (((-1) - i6) | ((-1) - 7168)))))) | (57344 & i6))) & ((-1) - (458752 & i6)));
            int i17 = (-1) - (((-1) - 3670016) | ((-1) - i6));
            int i18 = (i16 + i17) - (i16 & i17);
            int i19 = i6 << 3;
            m1312BasicTextRWo7tUw(annotatedString, companion, textStyle2, function12, iM6576getClipgIe3tQ8, z3, i7, 1, mapEmptyMap, null, composerStartRestartGroup, (-1) - (((-1) - i18) & ((-1) - ((i19 + 234881024) - (i19 | 234881024)))), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1 function13 = function12;
            final int i20 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i21 = i7;
            final Map map2 = mapEmptyMap;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                public final void invoke(Composer composer2, int i22) {
                    AnnotatedString annotatedString2 = annotatedString;
                    Modifier modifier3 = modifier2;
                    TextStyle textStyle4 = textStyle3;
                    Function1<TextLayoutResult, Unit> function14 = function13;
                    int i23 = i20;
                    boolean z5 = z4;
                    int i24 = i21;
                    Map<String, InlineTextContent> map3 = map2;
                    int i25 = i4;
                    BasicTextKt.m1309BasicText4YKlhWE(annotatedString2, modifier3, textStyle4, function14, i23, z5, i24, map3, composer2, RecomposeScopeImplKt.updateChangedFlags((i25 + 1) - (i25 & 1)), i5);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: BasicText-4YKlhWE */
    public static final /* synthetic */ void m1310BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i4, Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        int i9 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        Function1 function12 = function1;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)327@13717L86:BasicText.kt#423gt5");
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((-1) - (((-1) - i5) | ((-1) - 6)) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i7 |= 48;
        } else if ((-1) - (((-1) - i5) | ((-1) - 48)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i11 = (i6 + 4) - (i6 | 4);
        if (i11 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
        }
        int i12 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i12 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((i5 & 3072) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024)));
        }
        int i13 = (-1) - (((-1) - i6) | ((-1) - 16));
        if (i13 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i5) | ((-1) - 24576)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192)));
        }
        int i14 = (i6 + 32) - (i6 | 32);
        if (i14 != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i5)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(z3) ? 131072 : 65536)));
        }
        int i15 = i6 & 64;
        if (i15 != 0) {
            i7 = (i7 + 1572864) - (i7 & 1572864);
        } else if ((i5 + 1572864) - (i5 | 1572864) == 0) {
            int i16 = composerStartRestartGroup.changed(i9) ? 1048576 : 524288;
            i7 = (i7 + i16) - (i7 & i16);
        }
        int i17 = (-1) - (((-1) - i6) | ((-1) - 128));
        if (i17 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i5) | ((-1) - 12582912)) == 0) {
            i7 |= composerStartRestartGroup.changed(i4) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4793491)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (i10 != 0) {
                companion = Modifier.Companion;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i12 != 0) {
                function12 = null;
            }
            if (i13 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i14 != 0) {
                z3 = true;
            }
            if (i15 != 0) {
                i9 = Integer.MAX_VALUE;
            }
            i8 = i17 == 0 ? i4 : 1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1542716361, i7, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:327)");
            }
            m1314BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function12, iM6576getClipgIe3tQ8, z3, i9, i8, (ColorProducer) null, composerStartRestartGroup, i7 & 33554430, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i8 = i4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1 function13 = function12;
            final int i18 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i19 = i9;
            final int i20 = i8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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

                public final void invoke(Composer composer2, int i21) {
                    BasicTextKt.m1310BasicText4YKlhWE(str, modifier2, textStyle3, function13, i18, z4, i19, i20, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: BasicText-VhcvRP8 */
    public static final /* synthetic */ void m1313BasicTextVhcvRP8(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i4, Map map, Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        Map mapEmptyMap = map;
        int i9 = i3;
        boolean z3 = z2;
        int iM6576getClipgIe3tQ8 = i2;
        Function1 function12 = function1;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)341@14269L240:BasicText.kt#423gt5");
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i7 = (-1) - (((-1) - (composerStartRestartGroup.changed(annotatedString) ? 4 : 2)) & ((-1) - i5));
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i11 = (-1) - (((-1) - i6) | ((-1) - 4));
        if (i11 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i12 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
            i7 = (i7 + i12) - (i7 & i12);
        }
        int i13 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i13 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i5) | ((-1) - 3072)) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            i7 = (i7 + i14) - (i7 & i14);
        }
        int i15 = (-1) - (((-1) - i6) | ((-1) - 16));
        if (i15 != 0) {
            i7 = (i7 + 24576) - (i7 & 24576);
        } else if ((i5 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192;
        }
        int i16 = i6 & 32;
        if (i16 != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i5)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(z3) ? 131072 : 65536)));
        }
        int i17 = i6 & 64;
        if (i17 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 1572864));
        } else if ((i5 + 1572864) - (i5 | 1572864) == 0) {
            i7 |= composerStartRestartGroup.changed(i9) ? 1048576 : 524288;
        }
        int i18 = (i6 + 128) - (i6 | 128);
        if (i18 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 12582912));
        } else if ((i5 & 12582912) == 0) {
            int i19 = composerStartRestartGroup.changed(i4) ? 8388608 : 4194304;
            i7 = (i7 + i19) - (i7 & i19);
        }
        int i20 = (i6 + 256) - (i6 | 256);
        if (i20 != 0) {
            i7 = (i7 + 100663296) - (i7 & 100663296);
        } else if ((-1) - (((-1) - i5) | ((-1) - 100663296)) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i7 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (i10 != 0) {
                companion = Modifier.Companion;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i13 != 0) {
                function12 = null;
            }
            if (i15 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i16 != 0) {
                z3 = true;
            }
            if (i17 != 0) {
                i9 = Integer.MAX_VALUE;
            }
            i8 = i18 == 0 ? i4 : 1;
            if (i20 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851408699, i7, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:341)");
            }
            m1312BasicTextRWo7tUw(annotatedString, companion, textStyle2, function12, iM6576getClipgIe3tQ8, z3, i9, i8, mapEmptyMap, null, composerStartRestartGroup, (i7 + 268435454) - (i7 | 268435454), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i8 = i4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle3 = textStyle2;
            final Function1 function13 = function12;
            final int i21 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i22 = i9;
            final int i23 = i8;
            final Map map2 = mapEmptyMap;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
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

                public final void invoke(Composer composer2, int i24) {
                    BasicTextKt.m1313BasicTextVhcvRP8(annotatedString, modifier2, textStyle3, function13, i21, z4, i22, i23, map2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i5) & ((-1) - 1))), i6);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1 */
    /* JADX INFO: compiled from: BasicText.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,p\bDZc|\u0004G\u0007>éFD\u0015!Z\u0011 \u0007\u0015ji4Rf`.\u0001Rp\u0017ө\u007f6*]2t"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "7s", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^CHY2( h7\u001eJJ1J\b#\u0011SJ5^\u001cYG\u001d\u00140"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<SaverScope, Long, Long> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l2) {
            return invoke(saverScope, l2.longValue());
        }

        public final Long invoke(SaverScope saverScope, long j2) {
            if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
                return Long.valueOf(j2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2 */
    /* JADX INFO: compiled from: BasicText.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,p\bDJd\u0003İY\bF\n\\A/&:\u0012\u0010\u0007\u0015i\u007f8ǲiJ4Sa,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uI\u0018\u0019](OOb\u0006vg.Fo9n\u0002}"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<Long, Long> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Long l2) {
            return invoke(l2.longValue());
        }

        public final Long invoke(long j2) {
            return Long.valueOf(j2);
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l2) {
                return invoke(saverScope, l2.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j2) {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
                    return Long.valueOf(j2);
                }
                return null;
            }
        }, AnonymousClass2.INSTANCE);
    }

    public static final List<Pair<Placeable, Function0<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, Function0<Boolean> function0) {
        if (function0.invoke().booleanValue()) {
            TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Measurable measurable = list.get(i2);
                Object parentData = measurable.getParentData();
                Intrinsics.checkNotNull(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                TextRangeLayoutMeasureResult textRangeLayoutMeasureResultMeasure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
                arrayList.add(new Pair(measurable.mo5514measureBRTryo0(Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getHeight(), textRangeLayoutMeasureResultMeasure.getHeight())), textRangeLayoutMeasureResultMeasure.getPlace()));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: textModifier-cFh6CEA */
    private static final Modifier m1317textModifiercFh6CEA(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, null, colorProducer, function13, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, null));
    }

    /* JADX INFO: renamed from: LayoutWithLinksAndInlineContent-vOo2fZY */
    public static final void m1315LayoutWithLinksAndInlineContentvOo2fZY(final Modifier modifier, final AnnotatedString annotatedString, final Function1<? super TextLayoutResult, Unit> function1, final boolean z2, Map<String, InlineTextContent> map, final TextStyle textStyle, final int i2, final boolean z3, final int i3, final int i4, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function12, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Function1 function13;
        final MutableState mutableState;
        TextMeasurePolicy textMeasurePolicy;
        Map<String, InlineTextContent> mapEmptyMap = map;
        Composer composerStartRestartGroup = composer.startRestartGroup(645129368);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LayoutWithLinksAndInlineContent)P(6,13,8,2,3,12,9:c#ui.text.style.TextOverflow,11,4,5,1,10)578@22283L117,565@21843L1459:BasicText.kt#423gt5");
        if ((i7 & 1) != 0) {
            i8 = (i5 + 6) - (i5 & 6);
        } else if ((-1) - (((-1) - i5) | ((-1) - 6)) == 0) {
            i8 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i5));
        } else {
            i8 = i5;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2)) != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 48));
        } else if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 256 : 128)));
        }
        if ((i7 & 8) != 0) {
            i8 = (i8 + 3072) - (i8 & 3072);
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i10 = (i7 + 16) - (i7 | 16);
        if (i10 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 24576));
        } else if ((i5 & 24576) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(mapEmptyMap) ? 16384 : 8192)));
        }
        if ((i7 + 32) - (i7 | 32) != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i7 + 64) - (i7 | 64) != 0) {
            i8 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(i2) ? 1048576 : 524288)));
        }
        if ((i7 + 128) - (i7 | 128) != 0) {
            i8 |= 12582912;
        } else if ((12582912 & i5) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(z3) ? 8388608 : 4194304)));
        }
        if ((i7 + 256) - (i7 | 256) != 0) {
            i8 = (i8 + 100663296) - (i8 & 100663296);
        } else if ((100663296 + i5) - (100663296 | i5) == 0) {
            i8 |= composerStartRestartGroup.changed(i3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i7 + 512) - (i7 | 512) != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 805306368));
        } else if ((805306368 + i5) - (805306368 | i5) == 0) {
            i8 |= composerStartRestartGroup.changed(i4) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 1024)) != 0) {
            i9 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((i6 + 6) - (i6 | 6) == 0) {
            i9 = i6 | (composerStartRestartGroup.changedInstance(resolver) ? 4 : 2);
        } else {
            i9 = i6;
        }
        if ((i7 + 2048) - (i7 | 2048) != 0) {
            i9 |= 48;
        } else if ((i6 + 48) - (i6 | 48) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(selectionController) ? 32 : 16;
            i9 = (i9 + i11) - (i9 & i11);
        }
        if ((i7 + 4096) - (i7 | 4096) != 0) {
            i9 = (i9 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i6) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(colorProducer) ? 256 : 128;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 8192)) != 0) {
            i9 = (i9 + 3072) - (i9 & 3072);
        } else if ((-1) - (((-1) - i6) | ((-1) - 3072)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i8) | ((-1) - 306783379)) == 306783378 && (i9 + 1171) - (1171 | i9) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645129368, i8, i9, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)");
            }
            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                composerStartRestartGroup.startReplaceGroup(-619323167);
                ComposerKt.sourceInformation(composerStartRestartGroup, "539@20954L38");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297072527, "CC(remember):BasicText.kt#9igjgp");
                boolean z4 = (i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i8) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new TextLinkScope(annotatedString);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                textLinkScope = (TextLinkScope) objRememberedValue;
            } else {
                composerStartRestartGroup.startReplaceGroup(-619265198);
                composerStartRestartGroup.endReplaceGroup();
                textLinkScope = null;
            }
            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                composerStartRestartGroup.startReplaceGroup(-619074547);
                ComposerKt.sourceInformation(composerStartRestartGroup, "545@21203L90");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297064507, "CC(remember):BasicText.kt#9igjgp");
                int i12 = (-1) - (((-1) - ((i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i8) == 32 ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(textLinkScope) ? 1 : 0)));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i12 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final AnnotatedString invoke() {
                            AnnotatedString annotatedStringApplyAnnotators$foundation_release;
                            TextLinkScope textLinkScope2 = textLinkScope;
                            return (textLinkScope2 == null || (annotatedStringApplyAnnotators$foundation_release = textLinkScope2.applyAnnotators$foundation_release()) == null) ? annotatedString : annotatedStringApplyAnnotators$foundation_release;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                function0 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-618966357);
                ComposerKt.sourceInformation(composerStartRestartGroup, "548@21307L8");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297061261, "CC(remember):BasicText.kt#9igjgp");
                boolean z5 = (i8 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final AnnotatedString invoke() {
                            return annotatedString;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function0 = (Function0) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> pairResolveInlineContent = z2 ? AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, mapEmptyMap) : new Pair<>(null, null);
            List<AnnotatedString.Range<Placeholder>> listComponent1 = pairResolveInlineContent.component1();
            List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> listComponent2 = pairResolveInlineContent.component2();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-618671702);
                ComposerKt.sourceInformation(composerStartRestartGroup, "558@21610L61");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297051512, "CC(remember):BasicText.kt#9igjgp");
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    function13 = null;
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    function13 = null;
                }
                mutableState = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function13 = null;
                composerStartRestartGroup.startReplaceGroup(-618591630);
                composerStartRestartGroup.endReplaceGroup();
                mutableState = null;
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-618506565);
                ComposerKt.sourceInformation(composerStartRestartGroup, "562@21777L44");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297046185, "CC(remember):BasicText.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = (Function1) new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
                            invoke2((List<Rect>) list);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Rect> list) {
                            MutableState<List<Rect>> mutableState2 = mutableState;
                            if (mutableState2 == null) {
                                return;
                            }
                            mutableState2.setValue(list);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                function13 = (Function1) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-618442830);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            AnnotatedString annotatedString2 = (AnnotatedString) function0.invoke();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textLinkScope);
            int i13 = (i8 & 896) != 256 ? 0 : 1;
            int i14 = ((zChangedInstance ? 1 : 0) + i13) - ((zChangedInstance ? 1 : 0) & i13);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i14 != 0 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        TextLinkScope textLinkScope2 = textLinkScope;
                        if (textLinkScope2 != null) {
                            textLinkScope2.setTextLayoutResult(textLayoutResult);
                        }
                        Function1<TextLayoutResult, Unit> function14 = function1;
                        if (function14 != null) {
                            function14.invoke(textLayoutResult);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1317textModifiercFh6CEA = m1317textModifiercFh6CEA(modifierM4339graphicsLayerAp8cVGQ$default, annotatedString2, textStyle, (Function1) objRememberedValue6, i2, z3, i3, i4, resolver, listComponent1, function13, selectionController, colorProducer, function12);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-617202116);
                ComposerKt.sourceInformation(composerStartRestartGroup, "599@23147L55,600@23233L39");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297002334, "CC(remember):BasicText.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textLinkScope);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextLinkScope textLinkScope2 = textLinkScope;
                            return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function0 function02 = (Function0) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -296999598, "CC(remember):BasicText.kt#9igjgp");
                boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = (Function0) new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends Rect> invoke() {
                            MutableState<List<Rect>> mutableState2 = mutableState;
                            if (mutableState2 != null) {
                                return mutableState2.getValue();
                            }
                            return null;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                TextMeasurePolicy textMeasurePolicy2 = new TextMeasurePolicy(function02, (Function0) objRememberedValue8);
                composerStartRestartGroup.endReplaceGroup();
                textMeasurePolicy = textMeasurePolicy2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-617362851);
                ComposerKt.sourceInformation(composerStartRestartGroup, "595@22992L55");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297007294, "CC(remember):BasicText.kt#9igjgp");
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textLinkScope);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextLinkScope textLinkScope2 = textLinkScope;
                            return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LinksTextMeasurePolicy linksTextMeasurePolicy = new LinksTextMeasurePolicy((Function0) objRememberedValue9);
                composerStartRestartGroup.endReplaceGroup();
                textMeasurePolicy = linksTextMeasurePolicy;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1317textModifiercFh6CEA);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, textMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -515487512, "C:BasicText.kt#423gt5");
            if (textLinkScope == null) {
                composerStartRestartGroup.startReplaceGroup(-515480539);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(537560924);
                ComposerKt.sourceInformation(composerStartRestartGroup, "567@21894L18");
                textLinkScope.LinksComposables(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            }
            if (listComponent2 == null) {
                composerStartRestartGroup.startReplaceGroup(-515428893);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-515428892);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*569@21966L48");
                AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, listComponent2, composerStartRestartGroup, (-1) - (((-1) - (i8 >> 3)) | ((-1) - 14)));
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Map<String, InlineTextContent> map2 = mapEmptyMap;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
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

                public final void invoke(Composer composer2, int i15) {
                    BasicTextKt.m1315LayoutWithLinksAndInlineContentvOo2fZY(modifier, annotatedString, function1, z2, map2, textStyle, i2, z3, i3, i4, resolver, selectionController, colorProducer, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }
}
