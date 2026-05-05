package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яō\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ffxB8ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0004$\u0011O\\monPZ\u0013C\u001d%\u001ex\u0001,QU~l\u001a\u000f@Bw?9Sw=O`|6\u000b :\"Ny\r\u0001 *P\u0010\rzKK\u0012\u00128@\u0007:Z҈U\u0005(\u001d\u000e>&\b&\\}N>Hr_B/9\u0003qĩV'u0\u0005ձ\u0015Fj'\u0015vg\"3@EA\u001d%Y\u0007\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>X\u0006\u0016\u001d+e\reö.\\\u001bQh\f-/WcaP\u0016(}\u0003\u0004\rR\u0004\u0016ͺ-ΞDƦJf6\rs4\u0003WNP\u001a^p\u0001\u000beD\u0019=\u007fa.I\u001ftUy;GSG\u0004\u000b\r,)\u0019p7Z\u0003\u0015p\u001d!T\u0006YISV<vW\u001aaCm\u0012zz\u0004@\u0003^RĬ3{\u001f:_3E\u0001Q#O\u00122LR\u000f\u000f\u0005\u000f|\u001ai\u001bNNJ\u0007\u0016e/O #Jr.\u0004P\u0003]r\u0011\u0016*b1\u0016\bA%\r{JL=\u0010|_/}3Sk6=/\u0015] \u00034\u001eefv3cV\u0014\u0016o\u0001\u000f\u0016U;\u00114\u001fz\u000bs\u001a\u000bt(P7xn\u001e)\u0014D|>C6M%44ZAIb#|\u001b X@+>&n1 \r\u000bK$1nTz\u00178h^\u0007n\u00161\u0010@Ex0fYQc\u001eV[0\u0017L~9\u0006-.0Ku\b_L\u001b&<iD6$VQQ]BC\u0013\rfJ\u0002[U|vs\u0010e\u0012U\u000bC\u000eWQvm\u007f\b\u0019u\\dx\bgTE2'b\u0001a d.\n(ZCMq\u0015#[lN9\u0017\"B\\y\u0015\u0005M#k\u000187\u000bwECU\"F\u0002\"r-gmk\u007f.(\t=j;Є\nti$5zQ\f7\u0002L\u0012g\r\u0005:$\u001b\u0013rLx? B7DSG\u0011Yr9n8{T_\u0004tQD\u000f\u0007U\n\u0006Cs\fgF_X\u0004\n\u0012\\fQq)Oif\u001c;\u0012pSZ\u001dX#}Gm@Vm$d\u000bz\t^\u0016:,~WI2\u001d<7^d0JX#C\u0003y6\u0014\t3^_='xV<Qd_lx\u000b\u0011x\tn\u0016x!X\u0011/\u0013AQ\u00115_\u00154Z\u001d=q\u0005\u0019SK/Kn]R~%Y\u0019\u001b9c6fV#E\fHy\u0006DZ_)\u001c{6 \u0001&\u000btZ\u0018I>\u0002\u0015mOH^9e+b-\u0019 @jNPO/~\u000bhT\n=fIU\u0001Lz/bM&\u0015s \u000fu\\+\u001d\u000b+C\r/u C\u000eUI\u0019\u0019W\u0002e5S\u007f\u001e\u001fN{4z/?o\u0010|\t\fP\u0001*:.pe!\u0013~%42XO\u000b\n\\lfU\u0010\u0019\u001a\u0015tX\u001a^gTo9zmZK\u0017}:gzL\u0007U9\b-E\u001f\b|\u0017h\u001d7,}2!Cr:?cflY\u000e\"\u0001>\u001fd\r\u0013-\u001e<{h\u001fY\u0016oU9=ZBa_V\u0003\"\f\u000f\u0012u2:\u001b(]Qd>Vd7a\u001dFe\u007fvjVt%\u00107\u0007\u0015~vnW'|^\u0001\u0012|/e\u001eOa\u001bux\t\u001aDw`Q5`z37`\u001b6<?'\u0011/zt./r\r\u0001q\u007f,[V\u0005A(\u001aq$\u001ctI:\u0014YF8 ,?4A3h/8>\u000b\u001bL?_+Y\u0019?yeG\u0014s\u001f\u0019coܱW+2ʈ\u0015\u0003\u0013L\b?<F\u0002F\u000b#]\u001fFߩcǃ?%=֍\u001d3\u001a\u0013}J-]:ȁ\u001bˋ0I=\u0096n\fcR\u0018\u0010/&4\u0006$7.X\b\u05fd,ن`@^؛(\u00134,Nnr&ؼp~{ԁDk\u001e\trq2@O\u0012,\u0019rC\u0001˸xخIMpݟ[P\u001b],7=\u000b\u007fؗ#ϧ\u0014Oy˟{Z\u0001SG^s;Az̿>8i\u058c\u0012IFr8 }#bk\u0003l\u0004P\u000e\u0019١\u0016\u0013\u0015Խ\u00103X{\u000e|m:5i\u000fFd])QO\u007f#@=%\u001dl\u0019Ծ\u0017ʲ\u001a:Pǆ\u001a\u007fP\u007f#3SIybU4'\r/')];\u0005Sr\u0095KE]ߎp??V\u0019\u0012՛\\/"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PP,L\u00014FPW.@[}M#od\u0017W+\u000b\u0014]K-D", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "7mXAF;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "3uT;g\n:Z {v\\2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076']N5k0nD\u001b\u000fV\fTwb", "/tc<66K`\u0019|\n", "", ":dV.V@-S,\u000e[b,\u0004\b\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "BdgA90>Z\u0018lze,z\u00183o\t\u0010wI|\u0019\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fm_5M\u00041KKauZ\\zH\u001e ZWO5\u001d\u000eX=3rN@h\u0017,\\\u0011\u0005l\n\u0017&\u001d~nyQV\u001dPu\u001c?%2sVh?\u000bGJT@&k\u0013\\\u0019Z@\u0007y\tX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019D9.NvZBTs_E>6\u001f^\u000bAx2Zp)\t\u001c\u0004G9\u0017h\u0005Rf\u0006MZ\b\u0015\u0002C=0%CF\u0017>^-svF\u0019r-aQ\u000flE:\u0018atgR\u0018Pl\u0017nD+m\u0001>R\u0004MMy\u001ep5~UjZ\u0019\t\u000e#[ePC\u0019c\u0005$y,\u001eh\r\u0005\u0003sm\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#S\u0019:S\u0017iZsedwm'|\u0011[~=T=zTS|\f%8\u000b\u0014T`d", "5dc\u000eh;H1#\f\b^*\f", "u(I", "0`c0[\u000b>^(\u0002", "", "1ta?X5M3,\u000e\bZ*\f\t.T\u007f;\u000b-\u0001#'G}\u001d+\u0001+5b", "3cXA66F[\u0015\byl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "5dc\u0012i,Gbvz\u0002e)x\u00075", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju2\u007f2W[.=\\[\u0002\u001b\u0010\u0019a\u000bJ)\u0013Q/", "3wc?T*MS\u0018mzq;d\u00138i\u000f2\t(\u000b\u0016\u0017", "7r00g0OS", "5dc\u0019X.:Q-mzq;]\r/l~\u0016\u000b<\u0010\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7|.O?9\u007f#\u001e(wB=\u0007j+<\u0006#VL$", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006Ih\u0013 Cq\u000eI", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\rRv.F:N3\\P\u0002A\u001e\u001bB\nW'\u000f\u0005f\u0017", "D`[BX", "BdgA90>Z\u0018ove<|", "5dc!X?M4\u001d~\u0002]\u001dx\u0010?e>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "Adc!X?M4\u001d~\u0002]\u001dx\u0010?e>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fJT", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "/cS\u0012W0M1#\u0007\u0003Z5{z3t\u0003\u0005wO~\u001a", "", "3cXA66F[\u0015\by", "0dV6a\t:b\u0017\u0002Z]0\f", "0dV6a\t:b\u0017\u0002Z]0\fl8t\u007f5\u0005<\b", "1kT.e\u0014>b\u0015dzr\u001a\f\u0005>e\u000e", "AsPAX:", "1k^@X\nH\\\"~xm0\u0007\u0012", "1n\\:\\;\u001c]!\n\u0002^;\u0001\u00138", "BdgA", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF~0<Y\r$Avy7NM\u0011", "1n\\:\\;\u001c]\"\u000ezg;", "7m_Bg\nH\\(~\u0004m\u0010\u0006\n9", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)Fm\u001f=1L<u\n", "4kP4f", "=oc@", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1n\\:\\;\u001c]&\fz\\;\u0001\u00138", "1na?X*MW#\b^g-\u0007", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kF\u000425W\r$Avy7NM\u0011", "1n\\:\\;-S,\u000e", "", "<df\u0010h9L]&i\u0005l0\f\r9n", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fO", "0dU<e,%S\"\u0001\na", "/ec2e\u0013>\\\u001b\u000e}", "2d[2g,,c&\f\u0005n5{\r8gn(\u000fOd tQn\u000e'\u0001)>h\f", "3mS\u000fT;<Vx}~m", "3mS\u000fT;<Vx}~m\u0010\u0006\u0018/r\t$\u0003", "3mbBe,\u001aQ(\u0003\f^", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4h]6f/\u001c]!\n\u0005l0\u0006\u000b\u001ee\u00137", "5dc\u0010h9L]&\\vi:d\u0013.e", "@d`\u001ab+>a", "5dc\u0012k;KO\u0017\u000ez]\u001b|\u001c>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "@d`BX:M", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\0;wD\u001e#w7", "5dc\u0015T5=Z\u0019\f", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc X3>Q(~yM,\u0010\u0018", "5dc!X?M/\u001a\u000ezk\n\r\u0016=o\r", ";`g\u0010[(Ka", "5dc!X?M0\u0019\u007f\u0005k,Z\u0019<s\n5", ":nV\u0011X)NU", ";db@T.>", "", ">da3b9F1#\b\n^?\fp/n\u0010\u0004yO\u0005! ", "7c", ">da3b9F3\u0018\u0003\nh9X\u0007>i\n1", "3cXAb9\u001aQ(\u0003\u0005g", ">da3b9F6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "5dbAh9>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9p8\u007f$Gf\u0002/;v\u0018\u0010MQJ{A\u001ej", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "1n]@h4>`", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E$\n&tQx\u001cL~%B/", ">da3b9F>&\u0003\fZ;|f9m\b$\u0005?", "/bc6b5", "2`c.", ">qTC\\,P6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9xIv69Y\u0010\u001c4t\u0016\u0011IL:}A\"$lj;hc:]\u00074G\"", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "@d_<e;\u001fc \u0006\t\\9|\t8M\n'{", "3mP/_,=", "@d`BX:M1)\f\th9l\u0014.a\u000f(\n", "1ta@b9.^\u0018z\n^\u0014\u0007\b/", "Ad]1>,R3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "Ad]1F@Gb\u001c~\tbA|\b\u0015e\u0014\b\r@\n&", "1nS2", "Adc\u0010b4I]'\u0003\u0004`\u0019|\u000b3o\t", "AsP?g", "3mS", "Adc\u0010b4I]'\u0003\u0004`\u001b|\u001c>", "Adc X3>Q(\u0003\u0005g", "CoS.g,\"\\$\u000f\nL;x\u0018/", "AsPAX", "7m_Bg\u0014>b\u001c\tyF(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076/L]/fQZ9\u001d\u000e\\\u000e[\u0001", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final LegacyTextFieldState legacyTextFieldState;
    private final TextFieldSelectionManager textFieldSelectionManager;
    private TextFieldValue textFieldValue;
    private final ViewConfiguration viewConfiguration;

    private final void logDebug(String str) {
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z2, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z2;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z2, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, inputEventCallback2, z2, (8 & i2) != 0 ? null : legacyTextFieldState, (16 & i2) != 0 ? null : textFieldSelectionManager, (i2 + 32) - (i2 | 32) == 0 ? viewConfiguration : null);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final TextFieldValue getTextFieldValue$foundation_release() {
        return this.textFieldValue;
    }

    public final void setTextFieldValue$foundation_release(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    private final boolean ensureActive(Function0<Unit> function0) {
        boolean z2 = this.isActive;
        if (z2) {
            function0.invoke();
        }
        return z2;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setTextFieldValue$foundation_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, RecordingInputConnection_androidKt.toExtractedText(textFieldValue));
            }
            TextRange textRangeM6369getCompositionMzsxiRA = textFieldValue.m6369getCompositionMzsxiRA();
            int iM6121getMinimpl = textRangeM6369getCompositionMzsxiRA != null ? TextRange.m6121getMinimpl(textRangeM6369getCompositionMzsxiRA.m6127unboximpl()) : -1;
            TextRange textRangeM6369getCompositionMzsxiRA2 = textFieldValue.m6369getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m6121getMinimpl(textFieldValue.m6370getSelectiond9O1mEE()), TextRange.m6120getMaximpl(textFieldValue.m6370getSelectiond9O1mEE()), iM6121getMinimpl, textRangeM6369getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM6369getCompositionMzsxiRA2.m6127unboximpl()) : -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        if (i2 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(CollectionsKt.toMutableList((Collection) this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i2) {
        if (TextRange.m6117getCollapsedimpl(this.textFieldValue.m6370getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = (i2 + 1) - (i2 | 1) != 0;
        this.extractedTextMonitorMode = z2;
        if (z2) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
    }

    private final void sendSynthesizedKeyEvent(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, handwritingGesture, this.viewConfiguration, executor, intConsumer, new Function1<EditCommand, Unit>() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EditCommand editCommand) {
                    invoke2(editCommand);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EditCommand editCommand) {
                    RecordingInputConnection.this.addEditCommandWithBatch(editCommand);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m6121getMinimpl(this.textFieldValue.m6370getSelectiond9O1mEE()), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z2 = this.isActive;
        return z2 ? beginBatchEditInternal() : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.isActive;
        if (!z2) {
            return z2;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i2 + 1) - (1 | i2) != 0;
        boolean z8 = (i2 + 2) - (2 | i2) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            z3 = (i2 + 16) - (16 | i2) != 0;
            z4 = (8 & i2) != 0;
            z2 = (i2 + 4) - (4 | i2) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                z6 = true;
            }
            if (!z3 && !z4 && !z2 && !z6) {
                if (Build.VERSION.SDK_INT >= 34) {
                    z3 = true;
                    z4 = true;
                    z2 = true;
                    z6 = true;
                } else {
                    z3 = true;
                    z4 = true;
                    z2 = true;
                }
            }
        } else {
            z2 = false;
            z6 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z2, z6);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            z2 = false;
            switch (i2) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        int iM6301getDefaulteUduSuo;
        boolean z2 = this.isActive;
        if (z2) {
            if (i2 == 0) {
                iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
            } else {
                switch (i2) {
                    case 2:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6303getGoeUduSuo();
                        break;
                    case 3:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6307getSearcheUduSuo();
                        break;
                    case 4:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6308getSendeUduSuo();
                        break;
                    case 5:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6304getNexteUduSuo();
                        break;
                    case 6:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6302getDoneeUduSuo();
                        break;
                    case 7:
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6306getPreviouseUduSuo();
                        break;
                    default:
                        String str = "IME sends unsupported Editor Action: " + i2;
                        iM6301getDefaulteUduSuo = ImeAction.Companion.m6301getDefaulteUduSuo();
                        break;
                }
            }
            this.eventCallback.mo1511onImeActionKlQnJC8(iM6301getDefaulteUduSuo);
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.isActive;
        return z2 ? this.autoCorrect : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.isActive;
        if (z2) {
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.isActive;
        if (z2) {
            return false;
        }
        return z2;
    }
}
