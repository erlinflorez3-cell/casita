package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
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
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яġ\u0014D߬)\u001e\u007f\u007fLDqy\fǻ\u000e0!.Jչ*,(w\u000f߿r9FDmHDR[*%k\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C\u001d\u000f\u001eюr,_U\u0001] \u0015:B\u0006?;Mu>A`\u000b6\r 8#@y\u001b\u0001\"*N\u0013~zYK\u0014\u00126\\x:h\rU\u00050\u0012\u000e>6\u0001&\\mO>HziB/)\u0003qBd'gܞ\u0005M#F\\'\u0013wi\u001eA@?ߎ\u001d%i\u0003\u000fRaI\u001b\u000f\u007fF\u001dhU1[UyWDc\u0018\u001a%-_\r\fvTh5Wf\f58gcy^>.}z\n\u001cT\u0004<\u0016Wi4-(w )C\u0006\u0003bncؿbL\u0006\u000fq<\u001d:\u001051?A|acK\u0019|J*\u0017S#;P|8sT<jE'Zw_<iFMJ^\n\bA\u001c\u0010!h\b*\u0012=_\u007f]\u0014A4\u001d%EjQ#O{2iJg\u0005\u001ex\u0004czbWn&å\u001aA0\u001d\u001c`Jy\u0015mVZ~F!O,T5\u00026%fa\u0010\f/@(N}r\u001avS]\u00180GlG[~k<[gjc;Wc\u001enjvB[lh\u000bXtQk\f\tlXC8Hx-\u0010\u0017T_\u001c\"`Rۇ >2E)b\u001b]\u0013 HG#'o\\x\u0010-ga6In<\u0015\u0017 h\\\u001fy\u0018\u0005O,\u000bk:3QSE\u0019TUPtd\u0003)\u0007\r\u0014\u0018G\u0016L\u000eQ\u00056\u0004v\u0014 D<i]5=!\u001a\u0017/B\u0004=Ezr\u0014]}\u0018-z\u000b\u001d';\u0017..\r\u0003%:\u0005\u0003J}^G.|^\u0001. j\u0010{qF)G\u0012`;aDI\u0001(q<|8-\u000b%\u001e3'\b\"+<sHܨ\u001cȶ߳\u00181\u001b\tk\u0012\bb\b\f'&#\b48i\u0016}micB=HI\b~l.Tr\tBV\u0015\u0010\bp\td\u00139HO\u000b\tVfTQ4·e߿Ր\u0011r\\\u0007H?\bMB[w*\"e. dC3\u001ceYwo}K\u000b\u000fx\u001b:\u0011\u00021|@4=Nd\bh\u000f0\u0014\u000306oK\u0013&B\t2cDW\u0018\u001cSc\u0018\u0019خ~\nLs\u001f\u001d8W\u0004=\\\u0014z\u000flXX\u0005\u000fX\u000f3p\u0006\u0017^AN\u00115_'\u001eRZ/q=\u0019Y-\u000b+j}\u0003\u00151[JZ9)Vp\u00019]\u000eIO\u0002D\u0013_)\u001c{ ->\u0018\u000bNZ3+Ja \u000ezҍb\u0015[x^j|'vTT(O\u0019\u000b~\u001e<8\u00139+\u0016w\b2;~fweeJ\r\u001dD7\u0012$\u0003sH+-49[Iyp\u001a'\n\u0006k;,$P&-\u0004\u00030tW<v:~!:$%.}\u0012\u001a#_N\u0017̛N~x\u001e>\u000e<d\u00125\b\u0019\u0005w{y1@U>\u001b\u0018\tP\u00012\u0018\u0018\u0005c\u001d_;\u000fl1d\u0005\u00073`\u001f\u0019'{0Ad\u000bY\u001f\t8s!\u0011$$T#߱\fl/$_in\u0006{Qa\u0013QI{,q1^TL\u0010e~\u000e?8\u000b@\u0015i`}Jj\tjwZ]\u001e`z(\u0013v:5D\u001e\u0005HlH+OV\u0004.s]Jق#e\u0013[p\r\nZY('7xU+9B\u000b\u001e;%#I?z0\u000ebZ\t!\n\u001883FbH2-i&}d1(yQhc\u000e,\u001fG)JjI0M\u000b-̄?[9U)\u0017\u0007*H\bu\r?SzSc%X\u0014+\u0013SD\u0012jyt\f7!E_\u001bu\u001beqS+Eg\\':\u0004\u0014V/lq\u0012'|<ZETL}ߝD\n\u001034*\f\u000b3\u0002K7nDo^PV\"Y28p;\u0007\u007f1\u0004\u0005x\",\\u\u001esrfy:Q|$\u0019r@X9\u001d(KMv7#_\u001dV$F=\u0019Ԡ7!\u0003$_wF@YtS5\u0003sL\u0015\u0004\u0004hE\u0010H@LX\u00158DE\u0012\u0003\u0006\u001bvsQm\u001bP\u0018\u001d\u000f\u0014w_T\u000f\f\u0011>\u001e'Y6^Ql\n]P\u0011\u001eڝ\u0013.dBR\u0012\u0011\u001b&0N\u001d(\u001cZb%\u0013aZ\"S\u000e\u0017n)/])[SGMmzIOU \u001ck{c\u000f{\u000fp5\u0014f5Y/\u0011|+C\"\u001b/<\u000en>Hq\u001f\u0007کIdVX\\6Rq\u00060^zx\u0005jEm\u0001Jbk\u0018Ei\rvz7\nnA/E\u001d\u0007R\u0004E]\u0005\b\u0003\u001e\r1\u0019\u001b c9`3\"YaB\nNtI\u0004D4Hˀ\u0007aXnG0M}YM\u0003U,\u000f9]Eַ\u001aoO$4cLb\u0016\u001d\u001a\u001801\u001bRFX9H\u0012)?9\tة\u000fߪx\f<_P\u007f\u0014\f\u001e\u0013x\u001b{\u000b\u007fF2Ȩ~XoO\u0019LRe\u001e\t%c[\u0017C{)@AqW3}2ZתQƤ\\>%,>J!W2\u001dTy$HW>]U{wxIl`?q\\k^\u0001@r~\u0002L:V<vvAl_\u007f+Qr&7#!LOTzlZ1|Gц\u001d\u0001\u000f#y4\"\u0010\\vQ\n[@2c2S\fhu\r6\u0012x'\u0010\u0015*\u007fy5Ɗs,\u000bn\u001dQtM\u001cl3WX\u0004\u001a9bJh\u001c4-\tw4Ț\nB!\u001aW\u001d,\u001duzQ$A#h\r~6\u001ao(\u007f݄#3\u0015'ڽ 8]Z\u000bn\u0007\\S-Rݣ!ˬF{=Ζa\u0006\n4ow_6m\u001eW\u007f\u0018vvȫm՚\bcRЯo{p\u0014u4]y\u0017Yj]o\u0001`ީ+Ά\f\u0015/ܝhLX7:/\u0011\u0011F\u0018xm~z5\t\u0014\u0014]zLʷ4ýBsnʛÛ4FEXc̅a[.ˀ\f(ʈq\u00079%&IDD&لһuؼA\\$\u0011\u001fo2SfӘԪ["}, d2 = {"\u0012dU.h3M/ \n}Z\b\u0006\b\u001dc{/{.\f$\u001bPq", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "", "\u0012dU.h3M=\u001a\u007f\t^;X\u00123m{7\u007fJ\n\u0005\"Gm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u0012dU.h3MA\u001d\u0014z:5\u0001\u0011+t\u00042\u0005.\f\u0017\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\"qP;f-H`!h\bb.\u0001\u0012 e}7\u0006M^! Xo\u001bKv2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "3w_.a+!]&\u0003\u0010h5\f\u00056l\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "3w_.a+\u001f`#\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "1kX=", "", "7mXA\\(EE\u001d}\na", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4t[9J0=b\u001c", "3w_.a+\"\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "7mXA\\(EA\u001d\u0014z", "4t[9F0SS", "3w_.a+/S&\u000e~\\(\u0004\u0010C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "7mXA\\(E6\u0019\u0003|a;", "4t[9;,BU\u001c\u000e", "4`S2<5", "7mXA\\(E/ \n}Z", "4`S2B<M", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "B`a4X;\u001aZ$\u0002v", "AbP9X\u0010G", "7mXA\\(EA\u0017z\u0002^", "BqP;f-H`!h\bb.\u0001\u0012", "AbP9X\u0010G\u001b\u007fQoD/Dh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|(1\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e3(\f4E\u0011?r\nUu\u0017Dj}1c\fP\b\u0019\u0005E3q\u001c", "AbP9X\u0016Nb", "B`a4X;,Q\u0015\u0006z", "AbP9X\u0016Nb`eMS\u0012\u007fP\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|(1\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e3(\f4E\u0011?r\nUu!9y_OR\u0019U}$yK2>", "Aga6a2!]&\u0003\u0010h5\f\u00056l\u0014", "Aga6a2-]+z\b]:", "B`a4X;0W\u0018\u000e}", "Aga6a2(c(", "B`a4X;,W.~", "Aga6a2/S&\u000e~\\(\u0004\u0010C", "B`a4X;!S\u001d\u0001}m", "AkX1X\u0010G", "7mXA\\(E=\u001a\u007f\t^;", "AkX1X\u0010G6#\f~s6\u0006\u0018+l\u0007<", "7mXA\\(E=\u001a\u007f\t^;o", "AkX1X\u0010GD\u0019\f\nb*x\u00106y", "7mXA\\(E=\u001a\u007f\t^;p", "AkX1X\u0016Nb", "B`a4X;(T\u001a\rzm", "AkX1X\u0016Nb{\t\bbA\u0007\u0012>a\u0007/\u0010", "B`a4X;(T\u001a\rzm\u001f", "AkX1X\u0016Nb\n~\bm0z\u00056l\u0014", "B`a4X;(T\u001a\rzm ", "1qT.g, `\u0015\n}b*\u000bo+y\u007f5XG\u000b\u0015\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006X21d\u0001$5{|*aCHH;(\u0013nBC\u0014C5]v4'_R;2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "3mc2e", "3wXA", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmNMF\u001f\u0015\u001bV}Dv\u0005\u001b\u001a\u0018>@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000f^3h\u0014[,`DCms\u0005\u001d*W]*\u0013\nW v\\\u0003=NL\u0015\f4mEidH\u000f]dIx0!!bs\u001b1e~/s@M24>o\u000fYgaKn\u0002$0dAp\u0004@D\u001eIYc\u0003B\"QO\u001bj\u0007\u001bl90,/cmP\u001a\u0011k\u0017%1jc\t3a\nHR9v4B\nE_w#o\u00038mr&J%R\u0007zzQ\u0002h \u0003\u0010F+ =k", "1qT.g,&]\u0018\u0003{b,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7r4;T)ES\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmNMF\u001f\u0015\u001bV}Dv\u0005\u001b\u001a\u0018>@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000f^3h\u0014[,`DCms\u0005\u001d*W]*\u0013\nW v\\\u0003=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:kPc):(\u007f\u00115^\u000b\u00155C@\u001cA!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001c\u0017f&_=a)^AZ\u0011HWo\"|*b\u0006Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")!\u0007LN\"\u001b2\u0017AY\u001c>", "5dc", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-j", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-zhu\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJm]Q3(\u00160X\u0006Eq`\r\u0017\u000e3yVBje\u000b`\u0011~@6rJXrCEKMm4r\f)\u0019e>B #u#$2?;\u0006\u0005a\u0015\u0002V\u0004pGH\u001az63\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005H]\r\u000fDi\u001f<QR?u=s{dj8\u0014m0M\npEVV7f`r\u0007\u0010\u001b^\u0016J:\u0011\u000fb\u000b\u0013{@@-\f;M\fDH\u0002\r\u0016\fDPpV,S.u\u001etN3lEl)wQIPl8dU[&`B63\u0018{\"dW]*\u0013\nW v\\\u0003GhH\u0019xGy", "Bn09\\.G[\u0019\b\n", "BqP0^\b<b\u001d\u0010z>5\f\t<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmNMF\u001f\u0015\u001bV}Dv\u0005\u001b\u001a\u0018>@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fo:m\u001bc%\\\u0004\u0018.\u001c|#)h]\u0004m?:\r{Q\u0007qkF,D6.FxeTE9QEx/\u001bZ\u007f\u0002\u001b{8}:t:rA&?r\tZk\"G4", "BqP0^\b<b\u001d\u0010z>?\u0001\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmNW;.v9E\u000bIl\u0010\u0010 \u0017\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bRr3s\u0010g\u001d&\u0018D,\u001f{'\u001bu&\u0012MbO\u001aq_\u0004kfZbxB,IwiF\u000fk^@|#.O\u0006\u0001[\u0012kx:c:\u007f=8:s\tUpm", "Ehc58-?S\u0017\u000e", "3eU2V;", "/mX:T;B]\"x\b^3|\u0005=e", "/bc6i,\u001e\\(~\b", "/bc6i,\u001ef\u001d\u000e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m414invoke__ExYCQ(transformOrigin.m4568unboximpl());
        }

        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m414invoke__ExYCQ(long j2) {
            return new AnimationVector2D(TransformOrigin.m4564getPivotFractionXimpl(j2), TransformOrigin.m4565getPivotFractionYimpl(j2));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m4556boximpl(m415invokeLIALnN8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m415invokeLIALnN8(AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    public static final EnterTransition withEffect(EnterTransition enterTransition, TransitionEffect transitionEffect) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }

    public static final ExitTransition withEffect(ExitTransition exitTransition, TransitionEffect transitionEffect) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f2);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f2);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default */
    public static /* synthetic */ EnterTransition m411scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((2 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        return m410scaleInL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E */
    public static final EnterTransition m410scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2, long j2) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default */
    public static /* synthetic */ ExitTransition m413scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((2 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        }
        return m412scaleOutL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E */
    public static final ExitTransition m412scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2, long j2) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, finiteAnimationSpec, null), false, null, 55, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = true;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function1 = C03791.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$expandIn$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03791 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C03791 INSTANCE = ;

        C03791() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m418invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m418invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z2, Function1<? super IntSize, IntSize> function1) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((4 & i2) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = C03841.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03841 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C03841 INSTANCE = ;

        C03841() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m421invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m421invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z2, Function1<? super IntSize, IntSize> function1) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function1 = C03781.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03781 extends Lambda implements Function1<Integer, Integer> {
        public static final C03781 INSTANCE = ;

        C03781() {
        }

        public final Integer invoke(int i2) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<IntSize, IntSize> {
        final /* synthetic */ Function1<Integer, Integer> $initialWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m417invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m417invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), IntSize.m6807getHeightimpl(j2));
        }
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1<? super Integer, Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            final /* synthetic */ Function1<Integer, Integer> $initialWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m6800boximpl(m417invokemzRDjE0(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0 */
            public final long m417invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), IntSize.m6807getHeightimpl(j2));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = C03801.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03801 extends Lambda implements Function1<Integer, Integer> {
        public static final C03801 INSTANCE = ;

        C03801() {
        }

        public final Integer invoke(int i2) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03812 extends Lambda implements Function1<IntSize, IntSize> {
        final /* synthetic */ Function1<Integer, Integer> $initialHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03812(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m419invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m419invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j2), function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
        }
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1<? super Integer, Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            final /* synthetic */ Function1<Integer, Integer> $initialHeight;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03812(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m6800boximpl(m419invokemzRDjE0(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0 */
            public final long m419invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j2), function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function1 = C03821.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03821 extends Lambda implements Function1<Integer, Integer> {
        public static final C03821 INSTANCE = ;

        C03821() {
        }

        public final Integer invoke(int i2) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03832 extends Lambda implements Function1<IntSize, IntSize> {
        final /* synthetic */ Function1<Integer, Integer> $targetWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03832(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m420invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m420invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), IntSize.m6807getHeightimpl(j2));
        }
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1<? super Integer, Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            final /* synthetic */ Function1<Integer, Integer> $targetWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03832(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m6800boximpl(m420invokemzRDjE0(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0 */
            public final long m420invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), IntSize.m6807getHeightimpl(j2));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function1 = C03851.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z2, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03851 extends Lambda implements Function1<Integer, Integer> {
        public static final C03851 INSTANCE = ;

        C03851() {
        }

        public final Integer invoke(int i2) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03862 extends Lambda implements Function1<IntSize, IntSize> {
        final /* synthetic */ Function1<Integer, Integer> $targetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03862(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m422invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m422invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j2), function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
        }
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1<? super Integer, Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            final /* synthetic */ Function1<Integer, Integer> $targetHeight;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03862(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m6800boximpl(m422invokemzRDjE0(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0 */
            public final long m422invokemzRDjE0(long j2) {
                return IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j2), function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = C03871.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03871 extends Lambda implements Function1<Integer, Integer> {
        public static final C03871 INSTANCE = ;

        C03871() {
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7me<^,\u0006[{do@}`", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03882 extends Lambda implements Function1<IntSize, IntOffset> {
        final /* synthetic */ Function1<Integer, Integer> $initialOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03882(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m6757boximpl(m423invokemHKZG7I(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m423invokemHKZG7I(long j2) {
            return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), 0);
        }
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        return slideIn(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            final /* synthetic */ Function1<Integer, Integer> $initialOffsetX;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03882(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m6757boximpl(m423invokemHKZG7I(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I */
            public final long m423invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = C03891.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03891 extends Lambda implements Function1<Integer, Integer> {
        public static final C03891 INSTANCE = ;

        C03891() {
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7me<^,\u0006[{do@}`", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03902 extends Lambda implements Function1<IntSize, IntOffset> {
        final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03902(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m6757boximpl(m424invokemHKZG7I(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m424invokemHKZG7I(long j2) {
            return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
        }
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        return slideIn(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03902(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m6757boximpl(m424invokemHKZG7I(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I */
            public final long m424invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = C03911.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03911 extends Lambda implements Function1<Integer, Integer> {
        public static final C03911 INSTANCE = ;

        C03911() {
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7me<^,\u0006[{do@}`", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03922 extends Lambda implements Function1<IntSize, IntOffset> {
        final /* synthetic */ Function1<Integer, Integer> $targetOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03922(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m6757boximpl(m425invokemHKZG7I(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m425invokemHKZG7I(long j2) {
            return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), 0);
        }
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        return slideOut(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            final /* synthetic */ Function1<Integer, Integer> $targetOffsetX;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03922(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m6757boximpl(m425invokemHKZG7I(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I */
            public final long m425invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(j2))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = C03931.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,o\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C03931 extends Lambda implements Function1<Integer, Integer> {
        public static final C03931 INSTANCE = ;

        C03931() {
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7me<^,\u0006[{do@}`", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03942 extends Lambda implements Function1<IntSize, IntOffset> {
        final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03942(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m6757boximpl(m426invokemHKZG7I(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m426invokemHKZG7I(long j2) {
            return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
        }
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        return slideOut(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03942(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m6757boximpl(m426invokemHKZG7I(intSize.m6812unboximpl()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I */
            public final long m426invokemHKZG7I(long j2) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(j2))).intValue());
            }
        });
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        return Intrinsics.areEqual(horizontal, Alignment.Companion.getStart()) ? Alignment.Companion.getCenterStart() : Intrinsics.areEqual(horizontal, Alignment.Companion.getEnd()) ? Alignment.Companion.getCenterEnd() : Alignment.Companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        return Intrinsics.areEqual(vertical, Alignment.Companion.getTop()) ? Alignment.Companion.getTopCenter() : Intrinsics.areEqual(vertical, Alignment.Companion.getBottom()) ? Alignment.Companion.getBottomCenter() : Alignment.Companion.getCenter();
    }

    public static final <T extends TransitionEffect> T get(EnterTransition enterTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData$animation_release().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final <T extends TransitionEffect> T get(ExitTransition exitTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData$animation_release().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$createModifier$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return true;
        }
    }

    public static final Modifier createModifier(Transition<EnterExitState> transition, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Boolean> function0, String str, Composer composer, int i2, int i3) {
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2;
        ChangeSize changeSize;
        final AnonymousClass1 anonymousClass1 = function0;
        ComposerKt.sourceInformationMarkerStart(composer, 28261782, "C(createModifier)870@38224L31,871@38277L28,896@39249L56,898@39349L58:EnterExitTransition.kt#xbi5r1");
        if ((i3 & 4) != 0) {
            anonymousClass1 = AnonymousClass1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(28261782, i2, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i4 = (-1) - (((-1) - i2) | ((-1) - 14));
        EnterTransition enterTransitionTrackActiveEnter = trackActiveEnter(transition, enterTransition, composer, 126 & i2);
        int i5 = i2 >> 3;
        ExitTransition exitTransitionTrackActiveExit = trackActiveExit(transition, exitTransition, composer, (-1) - (((-1) - (112 & i5)) & ((-1) - i4)));
        int i6 = 1;
        boolean z2 = (enterTransitionTrackActiveEnter.getData$animation_release().getSlide() == null && exitTransitionTrackActiveExit.getData$animation_release().getSlide() == null) ? false : true;
        boolean z3 = (enterTransitionTrackActiveEnter.getData$animation_release().getChangeSize() == null && exitTransitionTrackActiveExit.getData$animation_release().getChangeSize() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = null;
        if (z2) {
            composer.startReplaceGroup(-821375963);
            ComposerKt.sourceInformation(composer, "878@38627L27,878@38576L79");
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            ComposerKt.sourceInformationMarkerStart(composer, -165041447, "CC(remember):EnterExitTransition.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = str + " slide";
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 & i4), 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-821278096);
            composer.endReplaceGroup();
            deferredAnimationCreateDeferredAnimation = null;
        }
        if (z3) {
            composer.startReplaceGroup(-821202177);
            ComposerKt.sourceInformation(composer, "883@38800L35,883@38751L85");
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            ComposerKt.sourceInformationMarkerStart(composer, -165035903, "CC(remember):EnterExitTransition.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 & i4), 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-821099041);
            composer.endReplaceGroup();
            deferredAnimationCreateDeferredAnimation2 = null;
        }
        if (z3) {
            composer.startReplaceGroup(-821034002);
            ComposerKt.sourceInformation(composer, "889@38995L48,887@38919L134");
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            ComposerKt.sourceInformationMarkerStart(composer, -165029650, "CC(remember):EnterExitTransition.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            deferredAnimationCreateDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) objRememberedValue3, composer, i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-820883777);
            composer.endReplaceGroup();
        }
        ChangeSize changeSize2 = enterTransitionTrackActiveEnter.getData$animation_release().getChangeSize();
        final boolean z4 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = exitTransitionTrackActiveExit.getData$animation_release().getChangeSize()) == null || changeSize.getClip()) && z3) ? false : true;
        int i7 = (i5 + 7168) - (i5 | 7168);
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock = createGraphicsLayerBlock(transition, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, str, composer, (i4 + i7) - (i4 & i7));
        Modifier.Companion companion = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(composer, -165018312, "CC(remember):EnterExitTransition.kt#9igjgp");
        boolean zChanged = composer.changed(z4);
        if (((((-1) - (((-1) - i2) | ((-1) - 7168))) ^ 3072) <= 2048 || !composer.changed(anonymousClass1)) && (i2 & 3072) != 2048) {
            i6 = 0;
        }
        int i8 = ((zChanged ? 1 : 0) + i6) - ((zChanged ? 1 : 0) & i6);
        Object objRememberedValue4 = composer.rememberedValue();
        if (i8 != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setClip(!z4 && anonymousClass1.invoke().booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier modifierThen = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue4).then(new EnterExitTransitionElement(transition, deferredAnimationCreateDeferredAnimation2, deferredAnimationCreateDeferredAnimation3, deferredAnimationCreateDeferredAnimation, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, anonymousClass1, graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return modifierThen;
    }

    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> transition, EnterTransition enterTransition, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 21614502, "C(trackActiveEnter)915@40149L40:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i2, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1583278438, "CC(remember):EnterExitTransition.kt#9igjgp");
        boolean z2 = (((14 & i2) ^ 6) > 4 && composer.changed(transition)) || (i2 + 6) - (i2 | 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$5(mutableState).plus(enterTransition));
        }
        EnterTransition enterTransitionTrackActiveEnter$lambda$5 = trackActiveEnter$lambda$5(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterTransitionTrackActiveEnter$lambda$5;
    }

    private static final EnterTransition trackActiveEnter$lambda$5(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final ExitTransition trackActiveExit(Transition<EnterExitState> transition, ExitTransition exitTransition, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1363864804, "C(trackActiveExit)935@41130L39:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i2, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1483140299, "CC(remember):EnterExitTransition.kt#9igjgp");
        boolean z2 = (((14 & i2) ^ 6) > 4 && composer.changed(transition)) || (-1) - (((-1) - i2) | ((-1) - 6)) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$8(mutableState).plus(exitTransition));
        }
        ExitTransition exitTransitionTrackActiveExit$lambda$8 = trackActiveExit$lambda$8(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return exitTransitionTrackActiveExit$lambda$8;
    }

    private static final ExitTransition trackActiveExit$lambda$8(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final Transition<EnterExitState> transition, final EnterTransition enterTransition, final ExitTransition exitTransition, String str, Composer composer, int i2) {
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation;
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2;
        ComposerKt.sourceInformationMarkerStart(composer, 642253525, "C(createGraphicsLayerBlock)985@42946L2853:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(642253525, i2, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)");
        }
        byte b2 = (enterTransition.getData$animation_release().getFade() == null && exitTransition.getData$animation_release().getFade() == null) ? false : true;
        byte b3 = (enterTransition.getData$animation_release().getScale() == null && exitTransition.getData$animation_release().getScale() == null) ? false : true;
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = null;
        if (b2 == true) {
            composer.startReplaceGroup(-675389204);
            ComposerKt.sourceInformation(composer, "968@42460L27,967@42377L120");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composer, -1545804535, "CC(remember):EnterExitTransition.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = str + " alpha";
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, ((-1) - (((-1) - i2) | ((-1) - 14))) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-675252433);
            composer.endReplaceGroup();
            deferredAnimationCreateDeferredAnimation = null;
        }
        if (b3 == true) {
            composer.startReplaceGroup(-675193780);
            ComposerKt.sourceInformation(composer, "974@42657L27,973@42574L120");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composer, -1545798231, "CC(remember):EnterExitTransition.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = str + " scale";
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            int i3 = (-1) - (((-1) - i2) | ((-1) - 14));
            deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, (i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-675057009);
            composer.endReplaceGroup();
            deferredAnimationCreateDeferredAnimation2 = null;
        }
        if (b3 == true) {
            composer.startReplaceGroup(-674987940);
            ComposerKt.sourceInformation(composer, "979@42781L136");
            deferredAnimationCreateDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer, (-1) - (((-1) - (i2 & 14)) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)), 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-674835793);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1545786157, "CC(remember):EnterExitTransition.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - (composer.changedInstance(deferredAnimationCreateDeferredAnimation) ? 1 : 0)) & ((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changed(enterTransition)) && (48 & i2) != 32) ? 0 : 1))))) & ((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(exitTransition)) && (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) ? 0 : 1)));
        boolean zChangedInstance = composer.changedInstance(deferredAnimationCreateDeferredAnimation2);
        int i5 = (i4 + (zChangedInstance ? 1 : 0)) - (i4 & (zChangedInstance ? 1 : 0)) != 1 ? 0 : 1;
        int i6 = ((((14 & i2) ^ 6) > 4 && composer.changed(transition)) || (i2 & 6) == 4) ? 1 : 0;
        int i7 = ((i5 + i6) - (i5 & i6)) | (composer.changedInstance(deferredAnimationCreateDeferredAnimation3) ? 1 : 0);
        Object objRememberedValue3 = composer.rememberedValue();
        if (i7 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
                @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                public final Function1 init() {
                    return EnterExitTransitionKt.createGraphicsLayerBlock$lambda$13$lambda$12(deferredAnimationCreateDeferredAnimation, deferredAnimationCreateDeferredAnimation2, transition, enterTransition, exitTransition, deferredAnimationCreateDeferredAnimation3);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = (GraphicsLayerBlockForEnterExit) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return graphicsLayerBlockForEnterExit;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function1 createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition.DeferredAnimation r6, androidx.compose.animation.core.Transition.DeferredAnimation r7, androidx.compose.animation.core.Transition r8, final androidx.compose.animation.EnterTransition r9, final androidx.compose.animation.ExitTransition r10, androidx.compose.animation.core.Transition.DeferredAnimation r11) {
        /*
            r5 = 0
            if (r6 == 0) goto L89
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            r1.<init>()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.runtime.State r4 = r6.animate(r1, r0)
        L15:
            if (r7 == 0) goto L87
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            r1.<init>()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.runtime.State r3 = r7.animate(r1, r0)
        L29:
            java.lang.Object r1 = r8.getCurrentState()
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PreEnter
            if (r1 != r0) goto L67
            androidx.compose.animation.TransitionData r0 = r9.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L5c
        L3b:
            long r0 = r0.m439getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r2 = androidx.compose.ui.graphics.TransformOrigin.m4556boximpl(r0)
        L43:
            if (r11 == 0) goto L54
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                static {
                    /*
                        androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1) androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r4) {
                    /*
                        r3 = this;
                        r2 = 0
                        r1 = 7
                        r0 = 0
                        androidx.compose.animation.core.SpringSpec r0 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r0, r0, r2, r1, r2)
                        androidx.compose.animation.core.FiniteAnimationSpec r0 = (androidx.compose.animation.core.FiniteAnimationSpec) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r2) {
                    /*
                        r1 = this;
                        androidx.compose.animation.core.Transition$Segment r2 = (androidx.compose.animation.core.Transition.Segment) r2
                        androidx.compose.animation.core.FiniteAnimationSpec r0 = r1.invoke(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.runtime.State r5 = r11.animate(r1, r0)
        L54:
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
        L5c:
            androidx.compose.animation.TransitionData r0 = r10.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L85
            goto L3b
        L67:
            androidx.compose.animation.TransitionData r0 = r10.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L7a
        L71:
            long r0 = r0.m439getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r2 = androidx.compose.ui.graphics.TransformOrigin.m4556boximpl(r0)
            goto L43
        L7a:
            androidx.compose.animation.TransitionData r0 = r9.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L85
            goto L71
        L85:
            r2 = r5
            goto L43
        L87:
            r3 = r5
            goto L29
        L89:
            r4 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.core.Transition$DeferredAnimation):kotlin.jvm.functions.Function1");
    }
}
