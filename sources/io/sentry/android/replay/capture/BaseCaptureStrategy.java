package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IHub;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BaseCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яő\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[:qK;k\u001a\u0006\"\u000fOVg}nRZ\u0011H\u0017\u0006,xr,_U\u0001]\u0018\u0017:B}E;MuBA`\u000b6\rړ:\"Ny\r\u0001 .P\u0010\rzKK\u0012\u00178@\u0007:Z\rS\u0007\"\u0012\u001c>(\u0001$\\oNLHt]@3+\u0003wNV'e4\u0005M#F\\'\u0013{i\u001eA@?ߎ\u001d%a\n\u000fRaD\u000b?\u007f[\rh='3IyW>X\u000e\u0014\u001d+U\rer<\\\rQf\f/+ecSP\u001cߊ\u007fz\u0002\rD\u0004$\u0006/H47 \u0006\u001eԄQp#SnO:^>|;.F\u001b3\u007fK+g\u001cvWo=1PMz3\u0010.'\u000fr9[\u0003\u0013p\u0019)Z\u0010Q_XP`NN\u0018aU\u000b\u0014\u0002r\u0011X\u000eΥK\n5\u0007!4\u001d1G]?)Gx\u0012JTg%\u0013vg\u0002rʐL@0}^ք)\u0017drD\u0013^\u001cTb3D\u0011{w\u0005\u000b\fd+ \u000bIl%3\u001dfO\u0017s\u001bQkg=/\u0015Y\nrylo9\rUeUqoyR%6oBh\u0005f+ZS:\u001e\r0(2Vz(y\u0012C|\u001aC8Eq*\u0015D1G~EN\t\u001eP#\u0015\t\u000e|\u0019\u0018\u0005TAo\u001bk:s7K\u0001jvou[a4\rb2-o6K\u0018T9Rt:|1l\u0017y\u0010IwLuc\u001b,<WD.$\u0001QQ]%C\u0013\r]J\u0002[x\u0013\u0007._[z?z+a??v\u0018\u007f\b\u0019[rt3P]@/\"%F97PU\u000efyT\u000bKsV!Zl8\u0003\u0005i<\u0015(+r? +˚}\u0012-\u00073E5\u000e.C$B%rsh\u001exԃf\u0019,\u007fu\n2o&qhW\u0004%KKYj\u0015=h\u0014к\u0007LNu\b\u000eH\u0015D\u000f9NgX\u0001iH^!.DV¡0\u0017vak@\u0019{\u000e64ePhS\u007f$^q\r??\u001a܍s6т[\u00197'\u0018\u001b\u007fAp(\u001bk\u000ffYr\tvu\"\u0006VCAؠ\u0013,9,:,J}#EjhL\u007f+\u0004TR'\u0017`\r$\r\\\u0012bit\"X\u0018pVv XK϶\u0013=$\u0004E7\u000byVV5iXsc0\u0019,\u0001NEVު/NZD+.^\r\u001bGcIouF\u0017W:\u0004j6{է\u001c\u0007#M(!?]!a|6\u0005\u007fef^d%y\u0015D\u0015à/Ή~|\u001c3Rە\n'G\u000b\u007fr1\\P\u000e6q\t\u0011\u001bT+\u001d\u000bCSt\tM\b;σK9\u001b\u001c-{eIS\u007f\u001e\u001ff\u00174x/Oo\u000e\u0015T\u000el@\u001a\u007f\u0007zM\u0019&`1\u001a-x?ҽ\u000e8\u000eA_\b9\u000e#`_q\u001e\u0014P:;}\u001cA\u0012Xǰ\u000emrn~[\u0011\u000fv3\\\u007f\u0015!`0\u00198c-YHŷ>\u001bY+h\u0017\u0006 %(%<.W9\u0012_c\u0017X\u001aA\"Á1Խo*o(xX,v7y$kphp=IPe>\u0013p\rpP\f&^\u0019[\u0015x\u001a\u0007,|-j\u000f\u0015!A^rLn_='cs\u000f]_5G\f]n'?MW\u001be\u001aQ\u0004x\u0011\u001f\u0013Rd\u000b~XP_ۇ\f\u05ff09N§U\u001c-j2\u007f\u0005\u0005,^SL\u0013 :&&\u0017?\\H lsH2\u0012Ǡ5¡\u001d\u0017\t́P\bu\u001f'N;za@B\u0001+\u000b=C\bK\u0004:\"A)wmcF߽ʿf֑)EmN-,\u0010\u0007b\u0001S\u007fd,\u0002.OSS=J~N#\"\u001fRF6y1\u001a]1vL\u00161~+JөƷ&ń:~L%M\u0015\u0007\u0015\".o<\u0002\n{c:g\t;iPL.El5J$ˋ{߃H\rMũ\b\u001b\u0014RK\u0017+:&ƃB\u0557MrUҍ-kJ\u0015\f\u0006P1\u00109PÜBĐ.\u00065\u009a%ux\u0016\u0006Q\u000e<\u000fܻ\u000fƒ\b}9ׯx\u0002fH&T\u001c\u0003T6tx{B9ޔBǦ(^6˷\\$\u0014DFHE\t4\u000b7ŋͺ3˝wKO\u0014\\-/O)]+53\u0018;pM\n\nXklc\u000f{dp5\u0014\u0010;\u0018_\u000e;Ƙ۱\u007fԐ/>OXDS8y\u001e\u0010K\u001aVFdzJ_{h\u0001D^9rEs\u007fJZs*k־\u0001Ǒf;sf\u0017gE\u0015?{c+E\u0016\u0012\u0014 PG\u001dȝ\"]?=3y\u0013=N}\u000ebob\roY\u00101o` ]\u000f\u0016ĊCپpVmǪiiM\u0005$ U+\\٥&\u008ek\u0019qپ:a\t\u000bD\u0007yZY\u0019)fp+eߌv\u07be2\u0012@ˑ\u001e?\fRp^\u0006dm\u0005D.\u001fLwSx\u0016Be\u001e*+.\f\u001a\u0002݉\u058b>қu!kQe]|rtZD\\el`\u0015\ba+n2)VtH\u0019kb\u001c5$Zn+q6\u0002/\u0013D))#\u0001:ޜ̰HՒ\u001dvW\u007f!\"R\u0004!bv\u0015O]\u0003n2uD\u0018;F\u000fScc-\u0013e\u0016')uMR$w!\u0002/[\u001c\tZdå˓wĐ\u007fm;8\u0013G:\u001e-\u0007D:\u0001X\r\u0007S\u0006\u0012BΞ6D"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014i$.+?FzD+\u0015VpF\u0003r,P\u000b|", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b9", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "2`c2C9Hd\u001d}zk", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\ndt'T|\u000eE\u0006\u00041h}\u000bDw'2LCHA", "@d_9T@\u001ef\u0019|\u000bm6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "@d_9T@\u001cO\u0017\u0002zI9\u0007\u001a3d\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_\u00120S8A\u001b\"\u001f2o9\u0010r9b@6THW:g\\\u007fL]u8\u001e[8\r\u000eh  }D\",\u0012=M\u0001;uVr\u001b\nFf:Re\u0014NC\u0013\u007fJ'xSf_\u0003V\u000b3`-d\u000bo$\\9\u001a7\u0014o)*r]\u001c\n\td\u0015pRONmQ(\u0002<-\brlN\u000fpeEr6#U\u0005\u0006[\u0013h})\u00041\u000e=u\f(u", "1`R5X", "5dc\u0010T*AS", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006c%@`y4\u0015i\u00141M\u0019", "Adc\u0010T*AS", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004W)v0<U\u0012}3k\u0019.#\u0007,", "1ta?X5M3*~\u0004m:", "\u001aiPCTuNb\u001d\u0006D=,\t\u0019/;", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}v(Gx\u001d\u0012", "5dc\u0010h9KS\"\u000eZo,\u0006\u0018=", "u(;7T=:\u001d)\u000e~eu[\t;u\u007f}", "\nrTA \u0006\u0017", "1ta?X5M@\u0019\n\u0002Z@`\b", "5dc\u0010h9KS\"\u000eg^7\u0004\u0005CI~", "u(;6buLS\"\u000e\bru\b\u00169t\n&\u0006GJ\u0005\u0017P~\u001bPZ$\u000b", "Adc\u0010h9KS\"\u000eg^7\u0004\u0005CI~", "uKX<\":>\\(\f\u000f(7\n\u0013>o}2\u0003\nn\u0017 V|\" uzxJ", "1ta?X5M@\u0019\n\u0002Z@`\bmd\u007f/{B|&\u0017", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "", "1ta?X5MA\u0019\u0001\u0003^5\f", "5dc\u0010h9KS\"\u000eh^.\u0005\t8t", "u(8", "Adc\u0010h9KS\"\u000eh^.\u0005\t8t", "uH\u0018#", "1ta?X5MA\u0019\u0001\u0003^5\fG.e\u0007(}<\u0010\u0017", "5dbAh9>1#\b\f^9\f\t<", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u0010<\u00054Ef}.\u0001Z\u00169T?OM4,$xn9dm5_v4VL[\u0002", "7rC2e4B\\\u0015\u000e~g.", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", ">da@\\:MW\"\u0001Zq,z\u0019>o\r", "5dc\u001dX9LW'\u000e~g.\\\u001c/c\u00107\u0006M", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`5m\u0011<u5<Y|\u007fJm\u0014>\\MHY4+&l_9\\", ">da@\\:MW\"\u0001Zq,z\u0019>o\rfz@\b\u0017\u0019C~\u000e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "@dR<e+>`v\t\u0004_0~", "5dc\u001fX*H`\u0018~\b<6\u0006\n3g", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006d#BY})Ep =:C9uA\u001d\u0015u?C\u0010d0PL", "Adc\u001fX*H`\u0018~\b<6\u0006\n3g", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004W*t25Y\u0007.:w%\u001bMAEx3\u001e\"FkB\bg.$:\u0018", "@dR<e+>`v\t\u0004_0~G.e\u0007(}<\u0010\u0017", "@d_9T@\u001cO\u0017\u0002z=0\n", "\u001aiPCTuB]b_~e,R", "5dc\u001fX7EO-\\v\\/|g3r", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "5dc\u001fX7EO-^\u000e^*\r\u00189r", "@d_9T@,b\u0015\f\nM0\u0005\t=t{0\u0007", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5T 7O\u0019", "5dc\u001fX7EO-l\nZ9\fw3m\u007f6\u000b<\t\"", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u0015WL=A", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017K5\u00125d\u0005\u001cK\\*9M\u0019", "@d_9T@-g$~", "5dc\u001fX7EO-m\u000fi,", "u(;6buLS\"\u000e\bruj\t8t\r<h@\f\u001e\u0013[O\u001f<\u007f4sF}+>i*\u001daN;A", "Adc\u001fX7EO-m\u000fi,", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0015{K\b\u0013+'\u0001\u000eE\u0006c\"Y\t'3\u0002\u0005BXC\u0011/%", "@d_9T@-g$~9],\u0004\t1a\u000f(", "", "Aba2X5\u001ab\u0007\u000evk;", "5dc V9>S\"Z\nL;x\u0016>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc V9>S\"Z\nL;x\u0016>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Aba2X5\u001ab\u0007\u000evk;;\b/l\u007f*wO\u0001", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "AdV:X5MB\u001d\u0007zl;x\u0011:", "5dc X.FS\"\u000eib4|\u0017>a\b3", "u(;7T=:\u001d)\u000e~eu[\u0005>eU", "Adc X.FS\"\u000eib4|\u0017>a\b3", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;C\u0019", "AdV:X5MB\u001d\u0007zl;x\u0011:$~(\u0003@\u0003\u0013&G", "1qT.g,,S\u001b\u0007zg;`\u0012>e\r1wG", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "2ta.g0H\\", "", "1ta?X5MA\u0019\u0001\u0003^5\fw3m\u007f6\u000b<\t\"", "AdV:X5M7\u0018", "6dX4[;", "EhSA[", "4qP:X\u0019:b\u0019", "0hc\u001fT;>", "0qT.W*Kc!{\t", "", "\u001ah^{f,Gb&\u0013D;9|\u0005.c\r8\u0004=V", "3uT;g:", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">`d@X", ">da@\\:MO\u0016\u0006z:;\u0007\u00113c", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "", "\"", "=m25T5@S", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", ">q^=X9Mg\u0002z\u0003^", "=kS#T3NS", "<df#T3NS", "7mXA\\(ED\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbH@G.}K;(Q7V\fFh\u000e\u001b\u001a\u000eC4]BR\u000f9\u0007\u0019\u0005A\u0014uPd_\u0007VU\u001b", ">da@\\:MO\u0016\u0006z:;\u0007\u00113ch8\u0003G|\u0014\u001eG", "@dbB`,", "AsP?g", "As^=", "\u0011n\\=T5B]\"", " d_9T@)S&\r~l;\u0001\u00121E\u0013(yP\u0010!$5o\u001bMz#5H\u0001-7i\u0015\u000fIAJuA2", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CaptureStrategy";
    private ReplayCache cache;
    private final Deque<RRWebEvent> currentEvents;
    private final ReadWriteProperty currentReplayId$delegate;
    private final ReadWriteProperty currentSegment$delegate;
    private final ICurrentDateProvider dateProvider;
    private final ReplayGestureConverter gestureConverter;
    private final IHub hub;
    private final AtomicBoolean isTerminating;
    private final SentryOptions options;
    private final Lazy persistingExecutor$delegate;
    private final ReadWriteProperty recorderConfig$delegate;
    private final Function1<SentryId, ReplayCache> replayCacheProvider;
    private final ScheduledExecutorService replayExecutor;
    private final AtomicLong replayStartTimestamp;
    private final ReadWriteProperty replayType$delegate;
    private final ReadWriteProperty screenAtStart$delegate;
    private final ReadWriteProperty segmentTimestamp$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014i$.+?FzD+\u0015VpF\u0003r,P\u000be%VV7X[vG\u001dg", "", "u(E", "\"@6", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜N.hݷZ\u000f\u001azt'Ӯ(qQ;\u001e(\f%!O|k\u0018rX_#C=\f\\\r;8WV\u0011]@\u0011\tԒ{У7Mwމˉd{"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014i$.+?FzD+\u0015VpF\u0003r,P\u000be4LY3Xf]=! ^\u001c]/\u0016\u00079T$lTF)\u0015\u001aI\u000fLl~\f\u0005\u0011BjlA7\fE\t\u001f\u0003U~", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "u(E", "1mc", "", "<df![9>O\u0018", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "@", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder("SentryReplayPersister-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(r2, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я/\u001d̉=!4i\bDRш|İI\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?0LeV.Zݷ2\u000f\u0002{<$a%\u001aBП[\"\u0014̝9_^kwp`Y9C\u001f\n&z\u0001+\u007fǁ'\\Z3@E\bAIL&މif\u0003:\u001d\"H!fy5\t(/`\u0014\u0007zIL:\u0018vϢpĐV\r[\fb&\u0014F8\u0001Le\u0018XDR\u0005cJ13\u0003\u0018K|2&0Ey\u001bRl';\u007f\u0012$9DO7+$\u0002\u00037ZiD\u001bC\u0002=\u000biU-[O\u0002XNZ\u0016\u0013Kۀ\u0016լ]ę*\\\u0013^1 5,gk[T\u001e*\u000ey2Ȟj\u0006dͽ)ρ2-\"Ǒۅ\u0012A"}, d2 = {"7n\u001e@X5M`-Hvg+\n\u00133dI5{K\b\u0013+\u0011m\nG\u00065BYG|3{\u0016\fINJ{A\u001e\u0003wn5\u0016c.b52GY\\0jan:\u001b\u00126\u001dX3\u0011\u0003BQ+u@4&\bj\u0016", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "", "D`[BX", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "5dc#T3NS", "BgX@E,?", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "@t]\u0016a\t:Q\u001f\u0001\bh<\u0006\b", "", "B`b8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2jOf5\u0018_uUr0I\u00168)aRpLiUK", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2<T> implements ReadWriteProperty<Object, T> {
        final /* synthetic */ Function3<String, T, T, Unit> $onChange;
        final /* synthetic */ String $propertyName;
        final /* synthetic */ BaseCaptureStrategy this$0;
        private final AtomicReference<T> value;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(T t2, BaseCaptureStrategy baseCaptureStrategy, Function3<? super String, ? super T, ? super T, Unit> function3, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = function3;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t2);
        }

        private final void runInBackground(final Function0<Unit> function0) {
            if (this.this$0.options.getMainThreadChecker().isMainThread()) {
                ExecutorsKt.submitSafely(this.this$0.getPersistingExecutor(), this.this$0.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        function0.invoke();
                    }
                });
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.this$0.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public T getValue(Object obj, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.value.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty<?> property, final T t2) {
            Intrinsics.checkNotNullParameter(property, "property");
            final T andSet = this.value.getAndSet(t2);
            if (Intrinsics.areEqual(andSet, t2)) {
                return;
            }
            final Function3<String, T, T, Unit> function3 = this.$onChange;
            final String str = this.$propertyName;
            runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
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
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function3.invoke(str, andSet, t2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCaptureStrategy(SentryOptions options, IHub iHub, ICurrentDateProvider dateProvider, ScheduledExecutorService replayExecutor, Function1<? super SentryId, ReplayCache> function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.hub = iHub;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = function1;
        this.persistingExecutor$delegate = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistingExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayPersistingExecutorServiceThreadFactory());
            }
        });
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final Object obj = null;
        final String str = "";
        this.recorderConfig$delegate = new ReadWriteProperty<Object, ScreenshotRecorderConfig>(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public ScreenshotRecorderConfig getValue(Object obj2, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj2, KProperty<?> property, final ScreenshotRecorderConfig screenshotRecorderConfig) {
                Intrinsics.checkNotNullParameter(property, "property");
                final ScreenshotRecorderConfig andSet = this.value.getAndSet(screenshotRecorderConfig);
                if (Intrinsics.areEqual(andSet, screenshotRecorderConfig)) {
                    return;
                }
                final String str2 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj3 = andSet;
                        ScreenshotRecorderConfig screenshotRecorderConfig2 = (ScreenshotRecorderConfig) screenshotRecorderConfig;
                        if (screenshotRecorderConfig2 == null) {
                            return;
                        }
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig2.getRecordingHeight()));
                        }
                        ReplayCache cache2 = baseCaptureStrategy.getCache();
                        if (cache2 != null) {
                            cache2.persistSegmentValues(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig2.getRecordingWidth()));
                        }
                        ReplayCache cache3 = baseCaptureStrategy.getCache();
                        if (cache3 != null) {
                            cache3.persistSegmentValues(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig2.getFrameRate()));
                        }
                        ReplayCache cache4 = baseCaptureStrategy.getCache();
                        if (cache4 != null) {
                            cache4.persistSegmentValues(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig2.getBitRate()));
                        }
                    }
                });
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp$delegate = new ReadWriteProperty<Object, Date>(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public Date getValue(Object obj2, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj2, KProperty<?> property, final Date date) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Date andSet = this.value.getAndSet(date);
                if (Intrinsics.areEqual(andSet, date)) {
                    return;
                }
                final String str3 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj3 = andSet;
                        Date date2 = (Date) date;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(ReplayCache.SEGMENT_KEY_TIMESTAMP, date2 == null ? null : DateUtils.getTimestamp(date2));
                        }
                    }
                });
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final Object obj2 = null;
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart$delegate = new ReadWriteProperty<Object, String>(obj2, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public String getValue(Object obj3, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj3, KProperty<?> property, final String str4) {
                Intrinsics.checkNotNullParameter(property, "property");
                final String andSet = this.value.getAndSet(str4);
                if (Intrinsics.areEqual(andSet, str4)) {
                    return;
                }
                final String str5 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str6 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj4 = str4;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str6, String.valueOf(obj4));
                        }
                    }
                });
            }
        };
        final SentryId sentryId = SentryId.EMPTY_ID;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId$delegate = new ReadWriteProperty<Object, SentryId>(sentryId, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryId> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(sentryId);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public SentryId getValue(Object obj3, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj3, KProperty<?> property, final SentryId sentryId2) {
                Intrinsics.checkNotNullParameter(property, "property");
                final SentryId andSet = this.value.getAndSet(sentryId2);
                if (Intrinsics.areEqual(andSet, sentryId2)) {
                    return;
                }
                final String str5 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str6 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj4 = sentryId2;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str6, String.valueOf(obj4));
                        }
                    }
                });
            }
        };
        final int i2 = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment$delegate = new ReadWriteProperty<Object, Integer>(i2, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i2);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public Integer getValue(Object obj3, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj3, KProperty<?> property, final Integer num) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Integer andSet = this.value.getAndSet(num);
                if (Intrinsics.areEqual(andSet, num)) {
                    return;
                }
                final String str6 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str7 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj4 = num;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str7, String.valueOf(obj4));
                        }
                    }
                });
            }
        };
        final Object obj3 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType$delegate = new ReadWriteProperty<Object, SentryReplayEvent.ReplayType>(obj3, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj3);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public SentryReplayEvent.ReplayType getValue(Object obj4, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj4, KProperty<?> property, final SentryReplayEvent.ReplayType replayType) {
                Intrinsics.checkNotNullParameter(property, "property");
                final SentryReplayEvent.ReplayType andSet = this.value.getAndSet(replayType);
                if (Intrinsics.areEqual(andSet, replayType)) {
                    return;
                }
                final String str7 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str8 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj5 = replayType;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str8, String.valueOf(obj5));
                        }
                    }
                });
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    public /* synthetic */ BaseCaptureStrategy(SentryOptions sentryOptions, IHub iHub, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iHub, iCurrentDateProvider, scheduledExecutorService, (i2 + 16) - (i2 | 16) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j2, Date date, SentryId sentryId, int i2, int i3, int i4, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i5, int i6, String str, List list, Deque deque, int i7, Object obj) {
        Deque deque2 = deque;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        if ((i7 & 64) != 0) {
            replayType = baseCaptureStrategy.getReplayType();
        }
        if ((i7 & 128) != 0) {
            replayCache = baseCaptureStrategy.cache;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 256)) != 0) {
            i5 = baseCaptureStrategy.getRecorderConfig().getFrameRate();
        }
        if ((i7 & 512) != 0) {
            i6 = baseCaptureStrategy.getRecorderConfig().getBitRate();
        }
        if ((i7 + 1024) - (i7 | 1024) != 0) {
            str = baseCaptureStrategy.getScreenAtStart();
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2048)) != 0) {
            list = null;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4096)) != 0) {
            deque2 = baseCaptureStrategy.currentEvents;
        }
        return baseCaptureStrategy.createSegmentInternal(j2, date, sentryId, i2, i3, i4, replayType, replayCache, i5, i6, str, list, deque2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        Object value = this.persistingExecutor$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomic(T t2, String str, Function3<? super String, ? super T, ? super T, Unit> function3) {
        return new AnonymousClass2(t2, this, function3, str);
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomic(Function3<? super String, ? super T, ? super T, Unit> function3) {
        return new AnonymousClass2(null, this, function3, "");
    }

    static /* synthetic */ ReadWriteProperty persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            function3 = new Function3<String, T, T, Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomic.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str2, Object obj3, Object obj4) {
                    invoke2(str2, obj3, obj4);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str2, T t2, T t3) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues(str, String.valueOf(t3));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomicNullable(T t2, String str, Function3<? super String, ? super T, ? super T, Unit> function3) {
        return new AnonymousClass2(t2, this, function3, str);
    }

    static /* synthetic */ ReadWriteProperty persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((1 & i2) != 0) {
            obj = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function3 = new Function3<String, T, T, Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomicNullable.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str2, Object obj3, Object obj4) {
                    invoke2(str2, obj3, obj4);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str2, T t2, T t3) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues(str, String.valueOf(t3));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    protected final CaptureStrategy.ReplaySegment createSegmentInternal(long j2, Date currentSegmentTimestamp, SentryId replayId, int i2, int i3, int i4, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i5, int i6, String str, List<Breadcrumb> list, Deque<RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return CaptureStrategy.Companion.createSegment(this.hub, this.options, j2, currentSegmentTimestamp, replayId, i2, i3, i4, replayType, replayCache, i5, i6, str, list, events);
    }

    protected final ReplayCache getCache() {
        return this.cache;
    }

    protected final Deque<RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryId getCurrentReplayId() {
        return (SentryId) this.currentReplayId$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment$delegate.getValue(this, $$delegatedProperties[4])).intValue();
    }

    protected final ScreenshotRecorderConfig getRecorderConfig() {
        return (ScreenshotRecorderConfig) this.recorderConfig$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    protected final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    protected final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType$delegate.getValue(this, $$delegatedProperties[5]);
    }

    protected final String getScreenAtStart() {
        return (String) this.screenAtStart$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp$delegate.getValue(this, $$delegatedProperties[1]);
    }

    protected final AtomicBoolean isTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        setRecorderConfig(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List<RRWebIncrementalSnapshotEvent> listConvert = this.gestureConverter.convert(event, getRecorderConfig());
        if (listConvert != null) {
            CollectionsKt.addAll(this.currentEvents, listConvert);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
    }

    protected final void setCache(ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(SentryId sentryId) {
        Intrinsics.checkNotNullParameter(sentryId, "<set-?>");
        this.currentReplayId$delegate.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i2) {
        this.currentSegment$delegate.setValue(this, $$delegatedProperties[4], Integer.valueOf(i2));
    }

    protected final void setRecorderConfig(ScreenshotRecorderConfig screenshotRecorderConfig) {
        Intrinsics.checkNotNullParameter(screenshotRecorderConfig, "<set-?>");
        this.recorderConfig$delegate.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(replayType, "<set-?>");
        this.replayType$delegate.setValue(this, $$delegatedProperties[5], replayType);
    }

    protected final void setScreenAtStart(String str) {
        this.screenAtStart$delegate.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(Date date) {
        this.segmentTimestamp$delegate.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(ScreenshotRecorderConfig recorderConfig, int i2, SentryId replayId, SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1<SentryId, ReplayCache> function1 = this.replayCacheProvider;
        if (function1 == null || (replayCache = function1.invoke(replayId)) == null) {
            replayCache = new ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(i2);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setRecorderConfig(recorderConfig);
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }
}
