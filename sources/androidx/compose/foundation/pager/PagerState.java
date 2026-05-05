package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.compose.pager.PageChangedCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŽ\u0014D57\u001eq\u007fZDkŞ\fA\u00146\u0013ǞJ~01\u001aw\rfr9FDmH4S[*%k\u0004é,[:qK;[\u001b\u0006\"\u001fOVgmoRZ\u0019L\u0017\u0006\u001c\u0007r,_U\u0001ز\u001a\u000fHBw?9Uw=O`|6\u000b!:\"Ny\r\u0001 +P\u0010\rzKK\u0012\u00178@\u0007:Z\rS\t\"\u0012\u0014E(ҵ&\\}N>Hr_B/9\u0003qBT4g0\u0013M\u0015Ͽ\\'#vi\u001e1E?5+%[\u0003\rVc?\u0019?y=\u000br/'AI{W<]\b\u0014++W\rcs.\\\u001bQh\f-5WcaP\u0016(}~\u0004\rJ\u0004\u0016\u0006-I6-0f\u0010\u000e9\u0004zSVP\n^H\u0004\u0003aL\u0017-Į;+O\u001bnQw;!NM{\r\r,ŀ\tn7[\\\u000ef\u001f!y\u000e\u0383aQn<\tg\u0010mMs\npp\u0002B\u0004^H\u00105\u0002\u0012<\u0019=7\n<؝%k\u0010L\u0005\r|ݓpnYi`HX\"\u001d\u0017G0\u000f\rhF|\u0005\u001aSd`2\u0011[!l\t\u0014\u0007A&Ϣ{</,X\u0004]Ŷh\u0003N\fܤ$_kE\u058cm\u0004\u000e\u0006:\u000f:;Rqߧ`jvBBlp\u000bXt͟R$al*22vm>ȓz\u000b\u008fJƱ6@\u007fʯ3tS'É\u0014`\u0004Lմ@-\u000em˛g(~\u0003\u0014T\no$\u0003\u0590\u007fh\\\u001f\u0004.ծͅ0}fğ,\n`CԒ%m#\u0017ص{iȗ=\u0381\u0004Hu֢F\u0015}$\u009bT\u0014!D־8\u00024Kэ\u000e\u0017)`DsE\u0015\u0003s˧L*')\u007f*\u0014IČ-\u007f\b\u0019srt3X]ݨ\u0016:v\ruS\rrѢxyF)H,d\u0019Ч=ar1mlSFٻ\u00047\u001eS\u00046\"E<;ϲ&5\u0016&(u\u0015*~wܥ-\u0012b='%k\u0012аb.p\u0011ъ\\bA>Ig~V\"RmIܩ\u05f8nx\u000eɯ\b|'AȞ@|q\u0005жL;4\fֵ\u0006D\r\u001fY\f?!̸|L.\u000el:CF$lǳ$)M\u0002j\u001erYż\nb\u000f8\u000eB17.*ݶ\u001fnX\u0011ן/6z\u001e5Oއa\u001d<7%d3B\t\u0019ͲS\u0002\u0006>}H\u0010mˑ\u0016JC\"ŊU>Z\u0007ױU`\u0006\u000fҢ_QV\u000fВ\u000eKE~4A\b}G\u0003ѐbB\u000bc%\u0019\u001ezP-ݛ$Y؞SI 8[\u0017\nsْBwι5\u0086K*sänR՛VԠ!C&Č8\u001a4m܁/v\f\u0004ͅM\u0015{ ؈Qf\"W\u007f+\u0004\u0014=\u0018۪\n1O!r)Ω\u000bϸ{8Qؕ\u007f_m7ݕ\u000b\u0015dtɲ,6:;ֳH\u0003\u0014U|\bXIׄ\u00078 U\u0007%&j߰\r~\n\f/\u0001σޭ\u001ac\bǌ\u0012\u00191\u0012̈́I\rs8ڵ\u0007fT\u0010ח\u0001+^\bL>!\t29̗\u0005ZK\u0017y2c\u001bd5US$t݀U\u0012o[ȁ\u001c1({ݙ\u0012\t_HðR8X?\u0001D\u001c, DʭaA\u0010}f/u4eič*GlXԾ0XSLޚ\u001e*z\u0012յS@\u0015iW\u0014C5\u0015jtZW<aAۭpé\u0010)\u001cΙOTl\u001a+4t|tҎ1ё\u001d\u001fcƬ\u0018r\u0015\u000f]IT-\bĝAװ;8\u0013 @x\u0017\u0010HpE\u00128Q!r.w\u0003ߡHÊA /ڒ<oj\u00144]\u0016aP\u001dD\u0011<%_^F3V\\H0q\u0016q\u0002o֍܃\u0015Ƭ\n\u007f\u000f\u001b;\u0005_n=,\u0007\u0013\u000f$_{7\u0004H\r\b\u001c1K'oIk\u0017?3H}LU 8*\t?$ޖȍ\u000fˋ0Y=G$\u0019c[\u0018\f%A2\u001d\u0016%\u0006c?aznj@ns\u0006\u0005\\n߂rH;Ir\u0019\u0002+|x&u|[\u00107w?\u008f\u001dHV,3\u000f\u0015h\u001ev\b/\\\u000f[\u0013e4\\Ԁ?ٽ\u0001\u0010Wƀ\u0011CW\u0019e/\u000b\u0005\u0013ͩ\u007f̿>>i\u058c\u0012IF\u00028/M\u0014Z\u000ex\u0016>mm<P\u0012;\u000e4{?ex\u007f\u000f\u001eVg\"ĵRր`~Uکz\rF<2\u007f~^\u001a9\u001e\u0016\\IG\u0006\f]x\u0015A4\u00064\u0018ڨ\u001e\u0382\u007f'%ǎs'\fTu\f\u0018Kc\"p=g4aǎV֒9edհ&0Y\u0016C\u0015.\u001darܻZB2,^9\u001cy5Z\u001ey\u0011DV$\u0007ߑ2ʒ\u0003`Kי\u0019\u001e%tcM6\u0011@\u001cOat\u0013;7\u0006\u0003\u0001\u0010yٍz߲\u0007\u0010IÈc\u001d,\u000fQ83u\u001d1l\u00106\u0017 ʓ~̚M\u0010\u000bʱ\u001b3=BW/o_#+<ȁ\u001bٮC\u0003$\"-`\u0014*ttuP\u0002\u000ePs9!\r̜+ےO])hH)\u001d\u0012E\u001e<KPU4Q<e9ɦ7ņcDD0vIUf;\u000b8'\bf#\u001c\u0004\nαy\u001dV3wTq\u001400|\u0017tXl\u0018\b*N&\u001a\u001aK' <\u001f֣<şYiu؊\fVfWgU<<rA\u000bf\u0013?:ޚH´p\u0019n߭N'_\rz\t\u000f:\u001fũ\u001cكp,/˾\u0019\u0005'K\u0019K\u0010bjζF֝\"ׇ̡9!ۆ&[e%Ue\u001e\u0010p.\u0006bLiA\u0005%oZFkѢJܯv\u0004t϶\u001eI\u0012;G2t+vZ\u0004ݠ\u00admȼ\f4&\u000e\u0003X:C{TWG-E5\u00111s2A\u0006:}_iй\u001b۠\f6eZ\u0001Ef}u>\n]7\u0012p|\fνCѡ\u007f7osU\rk?y\u0010wQ8\r\u001a\u0013:\"!аQ٥f\u0015u0SR\u0015z\rkO]\"\"W%>S}ܞJИN6:%\u0007kD9\u001bx|V=\t\u0014\re3Lʵ4ýBw~_m\u0013O^&o\r%E5\u0002\n[I\u001c_Y\u0002dɫ\"νSLuץ,ObwJ\u0007\u001ef\b֊uԾ_H\u001fܓ d:OH`\u0018\u001d\"Pc.H&=\u05fanĦOݍҞ<\u0015Ȍ\u0018\rFs7>X'eGuM\f\u001b~\u0005OQsgA\u0003gۡbԑB\u0016'J^O\u001c>R\u0017YN2\u0016g0OܫMѧ_\noЇi$m4y\u0015\u007f\"\u0006\u0004N\u001d.I\u0010Γ\u007fЈbAoϨ!W)|5\u0006o\nw @`.z. s\b<<=Ǟ\\\u0603@\u05f5ڒ-uƲv%G\u0015\u0010!]$#6s\r\b\u0007<aIS9_rr6n\n^}މ\n֥%\u0013Iۼf72\u0001\u0018t\n5\u007fy\u000fS`\u0013:\u001bynFT[ߨձ\u0005Ĺ\u000eQ9AYm')\u0010ad<\u0013.E#.\u0006&$2\"!Ӡ\u0014@%Y\u0012%ʵl9\u0017*\\=\fCP%ģ\u0019hN^\u0016fиԐ\u0013бb\r\b$OՖ/\u0002$ePsߑ-xЮi\u0018b\u0016ՏpJԱ}HLS̶\u000f>Si҇a3È)ɑ,L\u001fҞ6#0Ɖ1\u001aɤ/kjvҷn\u000fS\u0011ی_\u000bΈ7ӒD53ĴQ3\u000f˞\b;]Y\u0013\u0015ϠWܪh\u000fnʣ!` ߴsVi+\tgaZ־ڳeۙ FQ}'\u038b3Nڱ)z\u0017*Ь\u000b\u001bm!Z(֣^T\"g=Kw>\u0012/\u0011nk+Dm\u0007gێєpߌ6\\g_%ݲ]7n\u0004|5èQOn\u000f2 ŕ%F]\b@Yӥ!4E\u0016>\u007fikփ\u07bejǧx\u0010%9w\u0095]8ي\u0001\u001e'\u001aϭ}D\u0012\u0014 Lص\u001bL\u0015#\u0090a\u001a9<UzPXΕ\u0011\u001c\re\u0016Höݷa³|Ŀ϶\u0019\u0001ÜM\u001a\u0015))ܬ\n)E\u001bOJږ2zWgX|ͯ\f\u001d'\u000evU\u038bK\u000ez,0\tڢL͡vasǢح\u007f!1GOГN0\u000bXLu\u001c݇MЉK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "1ta?X5M>\u0015\u0001z", "", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "", "uH5uI", ">qT3X;<V\u0007|}^+\r\u0010/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nQ*Qv&WSN92", "uH5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_5IWE{Cg\u007fua:\u0007r*Qd%JLM<cR\u007f\u0013W\u0003", "/bRB`<EO(\t\b", "/mX:T;>R\u0007|\bh3\u0004v-o\u000b(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],JP\u007fG\u001b\u0019H\fX6\rZ", "/vP6g\u0013:g#\u000f\nF6{\r0i\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005GF\u001a\u0019wB=\u0014q;5r;Q\\]\u0014fQv>\u0018\u0012gc", "5dc\u000ej(Bb\u007fz\u000fh<\fp9d\u0004)\u007f@\u000eU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}y'deHgg9\\\u0006\u000eC`X<k:|<\u0018\u0013^\u000e[\u0001", "0dh<a+\u001b])\byl\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fX\u0001", "5dc\u000fX@H\\\u0018[\u0005n5{\u0017\u0013n\u00012:A\u000b' Fk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0004G`X5[/|M\u001d\u0011hqW,\u0017Z", "\nrTA \u0006\u0017", "", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "Adc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "uY\u0018#", "1`] V9HZ [v\\2\u000f\u0005<d>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1`] V9HZ _\u0005k>x\u0016.", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "1`] V9HZ _\u0005k>x\u0016.$~(\u0003@\u0003\u0013&G", "5dc\u0010h9KS\"\u000eeZ.|", "u(8", "5dc\u0010h9KS\"\u000eeZ.|r0f\u000e(\u000b!\u000e\u0013\u0015Vs\u0018E", "u(5", "1ta?X5M>&~{^;z\f\u0012a\t'\u0003@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "4ha@g\u001dBa\u001d{\u0002^\u0017x\u000b/", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u001aa\u0002(:A\u000b' Fk\u001d@\u0001./f}'7i$.", "4ha@g\u001dBa\u001d{\u0002^\u0017x\u000b/O\u0001)\n@\u0010", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u001aa\u0002(eA\u0002%\u0017V.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "7mS2k\u001bH>&~{^;z\f", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH", "7mc2e5:Z|\b\n^9x\u0007>i\n1iJ\u0011$\u0015G", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "5dc\u0016a;>`\"z\u0002B5\f\t<a}7\u007fJ\n\u0005!W|\f<5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "7r;.f;,Q&\t\u0002e\tx\u00075w{5z.\u0010\u0013&G", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7r;.f;,Q&\t\u0002e\r\u0007\u0016Aa\r'iO|&\u0017", "7rB0e6EZ|\bek6~\u0016/s\u000e", ":`bAF*K] \u0006z]\tx\u00075w{5z", "5dc\u0019T:MA\u0017\f\u0005e3|\b\fa}.\u000e<\u000e\u0016", ":`bAF*K] \u0006z]\r\u0007\u0016Aa\r'", "5dc\u0019T:MA\u0017\f\u0005e3|\b\u0010o\r:wM\u007f", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gH(%wEB\bm\u0002", "5dc\u0019T@Hc(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0019IE;x\u001b\u001a)rqHjl-XL", ":`h<h;0W(\u0002b^(\u000b\u0019<e\b(\u0005O", "5dc\u0019T@Hc(p~m/d\t+s\u00105{H\u0001 &\u0006p\u0018L\u007f$1h\u0002*@g#.TC7y4", ":`h<h;0W(\u0002\u0005n;d\t+s\u00105{H\u0001 &", ";`g V9HZ h{_:|\u0018", "", ";dP@h9>[\u0019\b\nL*\u0007\u0014/I\t9wG\u0005\u0016\u0013Vy\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "5dc\u001aX(Lc&~\u0003^5\fv-o\u000b(_I\u0012\u0013\u001eKn\nK\u00012|nq$Kt)@\fDE{=\u001d\u0011weC\u0010]9N}'CZN", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", ";h] V9HZ h{_:|\u0018", "<dP?X:M@\u0015\b|^", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ul\u00165ME7z4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7|mh(_rpNHW.&<oB\u0014\u0010ic", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "<t\\\u001aX(Lc&~eZ:\u000b\t=", "5dc\u001bh4&S\u0015\r\u000bk,g\u0005=s\u007f6:A\u000b' Fk\u001d@\u0001./f}'7i$.", ">`V266N\\(", "5dc\u001dT.>1#\u000f\u0004m", ">`V2F0SS", "5dc\u001dT.>A\u001d\u0014z\u001d-\u0007\u00198d{7\u007fJ\n\u0011$Gv\u000e8\u0005%", ">`V2F0SS\u000b\u0003\na\u001a\b\u0005-i\t*", "5dc\u001dT.>A\u001d\u0014zP0\f\f\u001dp{&\u007fI\u0003U\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", ">`V2F7:Q\u001d\b|", "5dc\u001dT.>A$zxb5~G0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", ">`V2e\u0013:g#\u000f\nB5}\u0013\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP#k0,%ua&\u0007q<U\u0006|", ">h];X+)O\u001b~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PLM\u0010kRz$\u0018 ic", "5dc\u001d\\5GS\u0018iv`,\u000bG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012KUW,[6\u0002=\u001cx^\u001c]\u0001", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "5dc\u001d_(<S!~\u0004m\u001az\u0013:ec1\r<\b\u001b\u0016C~\u0018I>:)]\u0012'J\u007fT/WSDj0-\u0019rj3\u0014c3Nr5G", ">nb6g0H\\\b\u0002\b^:\u007f\u00136d`5w>\u0010\u001b!P", "5dc\u001db:Bb\u001d\t\u0004M/\n\t=h\n/z!\u000e\u0013\u0015Vs\u0018E5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", ">qT3X;<V\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u00120", "5dc\u001de,?S(|}L;x\u0018/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012TLO,kPu+#\u000ei\u000e$", ">qT3X;<V\u001d\b|>5x\u00066e~", "5dc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "Adc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", ">qT:X(Lc&~Xh5\u000b\u0018<a\u00041\u000bN", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u001de,FS\u0015\r\u000bk,Z\u00138s\u000f5wD\n&%\u000fw\u001c\u001c[!\u0014_<!A}\u001f-IR?u=\u0018\"hh9\u0003q,", "u(9", "Adc\u001de,FS\u0015\r\u000bk,Z\u00138s\u000f5wD\n&%\u000fLz+\u00049?$<!A}\u001f-IR?u=\u0018\"hh9\u0003q,", "uI\u0018#", "\u0018", ">qTC\\6Na\u0004z\tl\u000b|\u0010>a", ">q^4e(F[\u0015\u000e~\\\u001az\u00169l\u0007\u0017wM\u0003\u0017&2k\u0010<", "5dc\u001de6@`\u0015\u0007\u0003Z;\u0001\u0007\u001dc\r2\u0003Go\u0013$Io\u001d'r'5", "Adc\u001de6@`\u0015\u0007\u0003Z;\u0001\u0007\u001dc\r2\u0003Go\u0013$Io\u001d'r'5", "uH\u0018#", ">q^4e(F[\u0015\u000e~\\\u001az\u00169l\u0007\u0017wM\u0003\u0017&2k\u0010<5$5`}\"3|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJA", "@d\\2T:N`\u0019\u0007zg;", "5dc\u001fX4>O'\u000f\b^4|\u0012>$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tCs", "Adc\u001fX4>O'\u000f\b^4|\u0012>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u00125a}\u001cE}#.UCDz\na\u0006", "@d\\2T:N`\u0019\u0007zg;;\b/l\u007f*wO\u0001", "@d\\2T:N`\u0019\u0007zg;d\u0013.i\u0001,{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJS>\u001d\u0019ie9\u00149", "5dc\u001fX4>O'\u000f\b^4|\u0012>M\n'\u007fA\u0005\u0017$\u0006p\u0018L\u007f$1h\u0002*@g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tC\u0006\u001fge:\u000bc9$", "Aba<_3)]'\u0003\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)iA(\u001coLC\u0015g;R\u00010\u001d", "Aba<_3:P ~hm(\f\t", "AdcA_,=>\u0015\u0001z", "5dc X;MZ\u0019}eZ.|", "AdcA_,=>\u0015\u0001z\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "AdcA_,=>\u0015\u0001zL;x\u0018/", "5dc X;MZ\u0019}eZ.|v>a\u000f(", "Adc X;MZ\u0019}eZ.|v>a\u000f(", "AdcA_,=>\u0015\u0001zL;x\u0018/$~(\u0003@\u0003\u0013&G", "B`a4X;)O\u001b~", "5dc!T9@S(iv`,", "B`a4X;)O\u001b~9],\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Co3<j5\u001dW\u001a\u007fzk,\u0006\u0007/", "5dc\"c\u000bHe\"]~_-|\u0016/n}(C!Ltf$aXzw/Eb|\u001cFq 7GP;r4\u001a#h", "Adc\"c\u000bHe\"]~_-|\u0016/n}(CFHe\u001e3:uzw/Eb|\u001cFq 7GP;r4\u001a#h", "Co3<j5\u001dW\u001a\u007fzk,\u0006\u0007/$~(\u0003@\u0003\u0013&G", "E`b\u001de,?S(|}b5~i9r\u0012$\t?", "/mX:T;>A\u0017\f\u0005e3k\u0013\u001aa\u0002(", "", ">`V2", ">`V2B-?a\u0019\u000e[k(z\u00183o\t", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uH5\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77q7QK7z8(\u001eVl9\u00059\u0013T\u00016NPWuZ\\\u007fG$!^\u0017N9VbcJ3rMG\u001b\u00170S\u000b\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000f", "@dbB_;", "Dhb6U3>7(~\u0003l\u001a\f\u0005Ce~\u0017~@n\u0013\u001fG", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000ff|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "/vP6g\u001a<`#\u0006\u0002=,\b\t8d\u007f1yD\u0001%", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1`]0X3)`\u0019\u007fzm*\u007fl0V\u00046\u007f=\b\u0017zVo\u0016JT(1b\u007f 6", "7mU<", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "5dc\u001cY-LS(]~l;x\u0012-ec1f<\u0003\u0017%", "7r62f;N`\u0019Zxm0\u0007\u0012\u0017a\u000f&~@\u000f\u0005\u0015Ty\u0015C", "Aba<_3\u001dS \u000ev", "7r=<g\u000e>a(\u000f\b^\bz\u00183o\t", ";`c0[\u001a<`#\u0006\u0002I6\u000b\r>i\n1mD\u0010\u001a|G\u0004", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gI2{duC\u0017r\u0010]v/2YX=`QrJi", ";`c0[\u001a<`#\u0006\u0002I6\u000b\r>i\n1mD\u0010\u001a|G\u0004L=\u00015>Xy/;w\u001f(ZCBk0,\u0015", "<nc6Y@)`\u0019\u007fzm*\u007f", ">da3b9FA\u0017\f\u0005e3", "@d`BX:MA\u0017\f\u0005e3k\u0013\u001aa\u0002(", "Aba<_3", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Aba<_3-]\u0004z|^", "uH5\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "AmP=G6\"b\u0019\u0007", "=eU@X;\u001f`\u0015|\nb6\u0006", "4na0X\u0019>[\u0019z\tn9|", "AmP=G6\"b\u0019\u00079_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "Bqh\u001fh5)`\u0019\u007fzm*\u007f", "1nT?V,\"\\\u0004z|^\u0019x\u00121e", "CoS.g,\u001cc&\fzg;g\u00051e", "CoS.g,-O&\u0001zm\u0017x\u000b/", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;
    private final LazyLayoutAnimateScrollScope animatedScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private /* synthetic */ PageChangedCallback dyn$pageChangedCallback;
    private /* synthetic */ int dyn$previousPage;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<Unit> measurementScopeInvalidator;
    private long minScrollOffset;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<Unit> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;
    private final MutableIntState programmaticScrollTargetPage$delegate;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Ru\b\u000f\u000e\u001c} \u000e\"\u0014", f = "\u001d-2/;\u001b;'9)p-5", i = {0, 0, 0, 0}, l = {TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME}, m = "0>:?4H:):JHFG0L.@GF", n = {"c^kY", "PdkSSjKVD-V/:", "_WiK", "_WiKA\\HZ;N,<8=3/\"%"}, s = {"xQ^", "xQ_", "uQ^", "rQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
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
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Ru\b\u000f\u000e\u001c} \u000e\"\u0014", f = "\u001d-2/;\u001b;'9)p-5", i = {0, 0, 0, 1}, l = {629, IptcDirectory.TAG_CAPTION_WRITER}, m = "B3CA?@xILKI?I@&KOL", n = {"\u0013jjOe", "bYtU^b2Y?IX3KS", "QbqI]", "\u0013jjOe"}, s = {"xQ^", "xQ_", "xQ`", "xQ^"})
    static final class C05301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05301(Continuation<? super C05301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public final /* synthetic */ void dyn$setPageChangedCallback(PageChangedCallback pageChangedCallback) {
        this.dyn$pageChangedCallback = pageChangedCallback;
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    public PagerState(int i2, float f2, PrefetchScheduler prefetchScheduler) {
        double d2 = f2;
        if (-0.5d > d2 || d2 > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5").toString());
        }
        this.upDownDifference$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3953getZeroF1C5BW0()), null, 2, null);
        this.animatedScrollScope = PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i2, f2, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i2;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f3) {
                return Float.valueOf(this.this$0.performScroll(f3));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return invoke(f3.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.density = PagerStateKt.UnitDensity;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.isScrollInProgress() ? this.this$0.getSettledPageState() : this.this$0.getCurrentPage());
            }
        });
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                int currentPage;
                if (this.this$0.isScrollInProgress()) {
                    if (this.this$0.getProgrammaticScrollTargetPage() != -1) {
                        currentPage = this.this$0.getProgrammaticScrollTargetPage();
                    } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release())) {
                        if (this.this$0.getLastScrolledForward()) {
                            currentPage = this.this$0.getFirstVisiblePage$foundation_release() + 1;
                        } else {
                            currentPage = this.this$0.getFirstVisiblePage$foundation_release();
                        }
                    } else {
                        currentPage = this.this$0.getCurrentPage();
                    }
                } else {
                    currentPage = this.this$0.getCurrentPage();
                }
                return Integer.valueOf(this.this$0.coerceInPageRange(currentPage));
            }
        });
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public /* synthetic */ PagerState(int i2, float f2, PrefetchScheduler prefetchScheduler, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (1 | i3) != 0 ? 0 : i2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? 0.0f : f2, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i2, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i3) != 0 ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f2);
    }

    public PagerState(int i2, float f2) {
        this(i2, f2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1266getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m3947unboximpl();
    }

    /* JADX INFO: renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m1268setUpDownDifferencek4lQ0M$foundation_release(long j2) {
        this.upDownDifference$delegate.setValue(Offset.m3926boximpl(j2));
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.firstVisiblePageOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f2) {
        long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f3 = this.accumulator + f2;
        long jRoundToLong = MathKt.roundToLong(f3);
        this.accumulator = f3 - jRoundToLong;
        if (Math.abs(f2) < 1.0E-4f) {
            return f2;
        }
        long j2 = jRoundToLong + jCurrentAbsoluteScrollOffset;
        long jCoerceIn = RangesKt.coerceIn(j2, this.minScrollOffset, this.maxScrollOffset);
        boolean z2 = j2 != jCoerceIn;
        long j3 = jCoerceIn - jCurrentAbsoluteScrollOffset;
        float f4 = j3;
        this.previousPassDelta = f4;
        if (Math.abs(j3) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f4 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f4 < 0.0f));
        }
        PagerMeasureResult value = this.pagerLayoutInfoState.getValue();
        int i2 = (int) j3;
        if (value.tryToApplyScrollWithoutRemeasure(-i2)) {
            applyMeasureResult$foundation_release(value, true);
            ObservableScopeInvalidator.m1199invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i2);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z2 ? Long.valueOf(j3) : Float.valueOf(f2)).floatValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.layoutWithMeasurement;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z2) {
        this.prefetchingEnabled = z2;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo710toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int i2) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final void setSettledPageState(int i2) {
        this.settledPageState$delegate.setIntValue(i2);
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m1265getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m1267setPremeasureConstraintsBRTryo0$foundation_release(long j2) {
        this.premeasureConstraints = j2;
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1264getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i2, float f2, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f2 = 0.0f;
        }
        return pagerState.scrollToPage(i2, f2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2, reason: invalid class name */
    /* JADX INFO: compiled from: PagerState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Ru\b\u000f\u000e\u001c} \u000e\"\u0014S$\u0015%#!\"\u000b'\t\u001b\"!`o", f = "\u001d-2/;\u001b;'9)p-5", i = {}, l = {498}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, int i2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$pageOffsetFraction = f2;
            this.$page = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PagerState.this.new AnonymousClass2(this.$pageOffsetFraction, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PagerState.this.awaitScrollDependencies(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            float f2 = this.$pageOffsetFraction;
            double d2 = f2;
            boolean z2 = false;
            if (-0.5d <= d2 && d2 <= 0.5d) {
                z2 = true;
            }
            if (z2) {
                PagerState.this.snapToItem$foundation_release(PagerState.this.coerceInPageRange(this.$page), this.$pageOffsetFraction, true);
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException(("pageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5").toString());
        }
    }

    public final Object scrollToPage(int i2, float f2, Continuation<? super Unit> continuation) {
        PageChangedCallback pageChangedCallback = this.dyn$pageChangedCallback;
        if (pageChangedCallback != null) {
            pageChangedCallback.invoke(i2, this.dyn$previousPage);
        }
        this.dyn$previousPage = i2;
        Object objScroll$default = ScrollableState.scroll$default(this, null, new AnonymousClass2(f2, i2, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i2, float f2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i2, f2);
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i2, float f2) {
        snapToItem$foundation_release(i2, f2, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i2) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i2));
    }

    public final void snapToItem$foundation_release(int i2, float f2, boolean z2) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i2, f2);
        if (z2) {
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.m1199invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1263getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i2, float f2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            f2 = 0.0f;
        }
        pagerState.requestScrollToPage(i2, f2);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PagerState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Ru\b\u000f\u000e\u001c} \u000e\"\u0014S#\u0017$)\u001a)+\u000b\u001c,*()\u0012.\u0010\")(gu", f = "\u001d-2/;\u001b;'9)p-5", i = {}, l = {576}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05291(Continuation<? super C05291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PagerState.this.new C05291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(PagerState.this, null, this, 1, null) == coroutine_suspended) {
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

    public final void requestScrollToPage(int i2, float f2) {
        if (isScrollInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C05291(null), 3, null);
        }
        snapToItem$foundation_release(i2, f2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateScrollToPage(int r13, float r14, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r15, kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i2, float f2, AnimationSpec animationSpec, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i2, f2, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(Continuation<? super Unit> continuation) {
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
        return objWaitForFirstLayout == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWaitForFirstLayout : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r6, androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.pager.PagerState.C05301
            if (r0 == 0) goto L71
            r5 = r9
            androidx.compose.foundation.pager.PagerState$scroll$1 r5 = (androidx.compose.foundation.pager.PagerState.C05301) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L71
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 == r0) goto L43
            if (r1 != r2) goto L77
            java.lang.Object r6 = r5.L$0
            androidx.compose.foundation.pager.PagerState r6 = (androidx.compose.foundation.pager.PagerState) r6
            kotlin.ResultKt.throwOnFailure(r4)
        L2a:
            r0 = -1
            r6.setProgrammaticScrollTargetPage(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L31:
            kotlin.ResultKt.throwOnFailure(r4)
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r8
            r5.label = r0
            java.lang.Object r0 = r6.awaitScrollDependencies(r5)
            if (r0 != r3) goto L52
            return r3
        L43:
            java.lang.Object r8 = r5.L$2
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r5.L$1
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            java.lang.Object r6 = r5.L$0
            androidx.compose.foundation.pager.PagerState r6 = (androidx.compose.foundation.pager.PagerState) r6
            kotlin.ResultKt.throwOnFailure(r4)
        L52:
            boolean r0 = r6.isScrollInProgress()
            if (r0 != 0) goto L5f
            int r0 = r6.getCurrentPage()
            r6.setSettledPageState(r0)
        L5f:
            androidx.compose.foundation.gestures.ScrollableState r1 = r6.scrollableState
            r5.L$0 = r6
            r0 = 0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.scroll(r7, r8, r5)
            if (r0 != r3) goto L2a
            return r3
        L71:
            androidx.compose.foundation.pager.PagerState$scroll$1 r5 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r5.<init>(r9)
            goto L13
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z2) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z2) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z2);
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult pagerMeasureResult, boolean z2) {
        if (z2) {
            this.scrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(pagerMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        this.minScrollOffset = PagerStateKt.calculateNewMinScrollOffset(pagerMeasureResult, getPageCount());
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i2) {
        if (getPageCount() > 0) {
            return RangesKt.coerceIn(i2, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean isGestureActionMatchesScroll(float f2) {
        if (getLayoutInfo().getOrientation() != Orientation.Vertical ? Math.signum(f2) != Math.signum(-Offset.m3937getXimpl(m1266getUpDownDifferenceF1C5BW0$foundation_release())) : Math.signum(f2) != Math.signum(-Offset.m3938getYimpl(m1266getUpDownDifferenceF1C5BW0$foundation_release()))) {
            if (!isNotGestureAction()) {
                return false;
            }
        }
        return true;
    }

    private final boolean isNotGestureAction() {
        return ((int) Offset.m3937getXimpl(m1266getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) Offset.m3938getYimpl(m1266getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    private final void notifyPrefetch(float f2, PagerLayoutInfo pagerLayoutInfo) {
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            boolean z2 = f2 > 0.0f;
            if (z2) {
                index = ((PageInfo) CollectionsKt.last((List) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1;
            } else {
                index = (((PageInfo) CollectionsKt.first((List) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
            }
            if (index >= 0 && index < getPageCount()) {
                if (index != this.indexToPrefetch) {
                    if (this.wasPrefetchingForward != z2 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                        prefetchHandle3.cancel();
                    }
                    this.wasPrefetchingForward = z2;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = this.prefetchState.m1190schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
                }
                if (z2) {
                    if ((((PageInfo) CollectionsKt.last((List) pagerLayoutInfo.getVisiblePagesInfo())).getOffset() + (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) - pagerLayoutInfo.getViewportEndOffset() >= f2 || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                        return;
                    }
                    prefetchHandle2.markAsUrgent();
                    return;
                }
                if (pagerLayoutInfo.getViewportStartOffset() - ((PageInfo) CollectionsKt.first((List) pagerLayoutInfo.getVisiblePagesInfo())).getOffset() >= (-f2) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle.markAsUrgent();
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        int index;
        if (this.indexToPrefetch == -1 || pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = ((PageInfo) CollectionsKt.last((List) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1;
        } else {
            index = (((PageInfo) CollectionsKt.first((List) pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public final float getOffsetDistanceInPages(int i2) {
        if (i2 < 0 || i2 > getPageCount()) {
            throw new IllegalArgumentException(("page " + i2 + " is not within the range 0 to " + getPageCount()).toString());
        }
        return (i2 - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i3 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                i2 = pagerState.scrollPosition.getCurrentPage();
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i2);
    }

    public final int matchScrollPositionWithKey$foundation_release(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i2);
    }
}
