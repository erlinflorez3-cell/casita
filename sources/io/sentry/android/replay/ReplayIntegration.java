package io.sentry.android.replay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import io.sentry.Breadcrumb;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.ISentryExecutorService;
import io.sentry.Integration;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.ReplayController;
import io.sentry.ScopeCallback;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.transport.RateLimiter;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯŽ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfr9FDmHDR[*%k\u0004é,[:qKП]\u001a\u0014\"\u0011OTgon`Z\u0013C%\u0006\u001eюr,_U\u0001] \u0018:B\u0006?;Mu=A`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~zIK\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&\\mQ>H\u0003]Bǂ+\u0003\u007fBV'e3\u0005M#F\\܋\u0015vw\u001e3¨?5+%[\u0003\rVc?\u0019?yܵ\rh='3IyX>X\u0016\u0014\u001d+U\u0010er<\\\rQf\u000e/+]cSP\u0014+\u007fz\n\u0019D\u0004\u0014\u000b/HD-\"f\u000e\u000e;t\tSHP\b_J\u007f\u0011a>\u0017+\u007f;+O\u001bnQg;!NE\u0003\r\r$#\tn7[\\\u000ef!!Y\u000e\u0383aQn<xN8Ymm2q\u0013\u0002X\u0006`G.2,\u0011\\\u001bU7\n>S!\u001a\b\u0001D\\lEungyVVG:nD?:\r\u001ac\\d3uÏXX:\u001c\u000eɳS\r\f\u0018\u0017.c\u0010<O- R]q\u0002j{g\u001a1=rOa~m\u001eWglI4\u007fp \u0003`\u0006,\\Ls\u0015g\u0015Sΐ\u0010db:28N} y\u0002Jt #4OqJIB0Gl%i\u00114Z^\r\u001aoi\u0017'њX=*\u0015y*z\u001c\u0011Rbv\u0016\u007f\tK<|\u000f;C@\u007fE)I[\"vN\u0015@\u0017\u0010\u0004\u000fux֙KVr(\u0006[\u00023&\u001c?WUX#\u0011\u000f)`\u001eCDz\u0003uYS\u00125\u0018\u0015{%:\u0017Lw\u0016pp:\u007f\u0003R_V'\"%~\t\"6qѣ}aT\u001c\bWd\u000fiEar1aLRF\u0006\u001d\u001fL/\u0011}(|C9[/-\u0018\b\u0014]#w\\\u0018|>\u001dh\u000f4\u0004}!<t&~\u0011bЄ6E>[i\u0005D54n\tHn~\b\nR\tb\"IGot\u0001y>M\u0019E\u0016\u0004\u0017=\u001d\u007f\u0005rǈ\u0017y\u0004F>e0\u0007S\u007f\u001adi=!Ocg\u001c\u0007a[9Z؝\u000e\u000b\nS7'*\u00078V\u0006-96\u0014?08W:\u0011\u0016\u0003\u001dӺ8,JTSIb7\u001e\u0010)J\r_W'@\u0011\f;\u0005X\u0005~bVVTxE\u000fqp\u0001G\u0015Ao\u00115_O4Z\u001d5q\u0005\u0019SKSaj\u0018\u0005txCD\u0003ra<!\u0007\u0019\u001auCw\u0019|\u0018\u0010/{A\b\ff)C1\u000b&)\u0010i\u0011\u000eA`b\u0019-|N\u0013OXz\u001b\\0\u0003\u0017z+Xl\u000e\u001de1O!K)A\u0015T\u0006\u0014[\u001a/a\u000b=O\u001a\u000bA^\u001b[Pe1K(\u0003\u0014U[\u001eg\u0004\f\u0016\u00018'2?Q`eo~\n\f}\u0001*:,pb!\u0013~j42XX\u000b\n\\CfS\u0010\u0018\u001a\u0013\r?2\fiN5\u0012\u0005\u0006p\u0016\u0019|\u0018K\u0005c\u001d>Q\u0017/7dc\u0007-~gO;\u00164!Cr:?\u001efXY\u0016\"\u0001>\u001fdR\u0013-\u001et{h\u001f\u0012\u007f_\u001bZGkX\u0012wD\u001b$\f\f\u0012u2t\u001b(]Ad;Vd7'3V \u0014lY@d#Vo\u0014E\rVN)\u0013b\u0011#\"r O\u0019M\u0015S[)\r\u00127a&O{\u0019Sc=@}\b(%[IN+z\u000e\u001eZ\t!J.,}Tb`2)o#\u001c\u0001YͼWԺ<B\u0010ϴa\u001a\u001f6r8NF3Ӎ\u001eՀU3I˒a\r#A\u001eo5#\fպSƽ)*\tεQ\u001bM\u001eImPre\u0013yˇ\u001bΘ\u001fWnծuIsk?\u0014\u0012gZ~{\u0004l\u000e\u00109 ˂Qɭ}UH\u0094Z-2I\u001ew9~sW\u001f߮kЪDV{ӒT88]\u0007DQoCԮuԤ0o ĵ|]g]O%d+RiB-\u001b/\u001cށjނ\u000fJ\u0015ҵ,9\u001527]g\t\u001e|\n@YwIٌ1ۺa<\u001bŎTF@~Nyu^0إ\u0012Я\u0016TkÅ;y_\u000f(8@=cՀ$ٽV`\bуm15|\u000fFd\u000f/\u000e\u0018ǖޖ@Ǧ(h6D\u0012@\u0014LFJ\u001d5\f~1#!j_uWF@dR\u05f7)Ǳ_%\u000eȷ8\u0014UNm\u000fhNIB9~Օ\\?kn\u0015['^t-\u001b\u0006\u0011?>If>H?n\u0005<U;Э\u0012ͭ|D0Ғ\u0001D>\\\u0017bS_\u0011\u001cMKk\u0014\u0014\f\tĒ9ׄh\u00113ŋ(z`\u000e;-';Y\u07b3Më\u0017\u000b&ҍ\nC1.%3Tz6\u0018\u007f\u001aߑqM(\u0005g\u0007/lVh=Wc\nfvO(\u0006Vך\u0010*-6\u0016\u0019*uw\u0015o\u0014Hw\u0013NFVWaaX?v\u0019ث\u0011ߪx\f6ڿ\t~\u0014W\u001e.r-EJ\u000eQڝ2z\u000fY_p\u0002=uqlz\u007fhU-\u0006\u0019lM\b\u0010\u0012_6տzӐ`XF܂(GNQ\u001a\";f\n}^(^V\u0004#$+J؆ǀ\u0011\u06018u8f\u007f6t\u001bVeD}V/i\u007f]B3Qr(?\u001fGִū\u0010كp6/8N3'7\u0019Mg]\"~ޗz\u001a"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1ma)Fm\u0018;IR?u=s", "\u001ah^{f,Gb&\u0013DB5\f\t1r{7\u007fJ\nl", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rdh@\u0004_*TL", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u0010<\u00054Ef}.\u0001\\ >KF(k2(\"gaFd_3Us#ER$", "\u001ah^{f,Gb&\u0013DK,\b\u0010+y]2\u0005O\u000e!\u001eNo\u001b\u0012", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&EC", "\u001ah^{f,Gb&\u0013DB\n\u0007\u00128e}7\u007fJ\n\u0005&C~\u001eJa2?j\u0002\u001f7zT\u0012+MDt4\u001c$lkBtr(]\u000751I\\,icrJi", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\nm\u0013&GV\u0012Dz45f<\u0004$i%.4GCoC\b\u0012vaF\u0018c9$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2`c2C9Hd\u001d}zk", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\ndt'T|\u000eE\u0006\u00041h}\u000bDw'2LCHA", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt@\u0001nCY\u0007/D\u0002_=Z?Dy?(\"w+\u001dds9[v0V+J;\\=\u007fG%\u0016Y\u000e[\u0001Pu", "@dR<e+>`\u0004\f\u0005o0{\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<t/BX}-\r", "@dR<e+>`v\t\u0004_0~s<o\u0011,z@\u000e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1n]3\\.\u001cV\u0015\b|^+", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "@d_9T@\u001cO\u0017\u0002zI9\u0007\u001a3d\u007f5", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "@d_9T@\u001cO$\u000e\u000bk,j\u0018<a\u000f(}Tk$!Xs\r<\u0004", "7r5B_3,S'\r~h5", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b9", ";`X;?6H^\u0019\f]Z5{\u0010/r", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~Ay$@T 8XCHN0'\u0014oaF\\", "5dbAh9>@\u0019|\u0005k+|\u0016\u001ar\n9\u007f?\u0001$", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u0010<\u00054Ef}.\u0001O\u0016<\\SHk!\u001e\u0013rn8\u0007p\u0002", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt@\u0001nCY\u0007/D\u0002_=Z?Dy?(\"w+\u001dds9[v0V+J;\\=\u007fG%\u0016Y\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[E=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0002:kQq'Eb\u0002^1mIp'FE\u0011NOm~z\bnx(_\u0017\u0012l>|nLim\u0012\u001d\u0007f&hI+[\n6_\u0010BH9\"'Q\u0006>oC%\u0018\u000b+7MEG$;\u000b${D/B\r\f\u0002m\u0018)\u0004|Cc\u001eo.h\u0001R$\u001129\u001c\u0005WR\u0019zQ\u001e7,\u0003dU~(@\u0002[\u001fd$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt@\u0001nCY\u0007/D\u0002_=Z?Dy?(\"w+\u001dds9[v0V+J;\\=\u007fG%\u0016Y\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[E=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0002:H<", "1`_Ah9>A(\fvm,~\u001d", "5dbAh9>@\u0019|\u0005k+|\u0016", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "7r4;T)ES\u0018", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7r4;T)ES\u0018=\t^5\f\u0016C_{1zM\u000b\u001b\u0016A|\u000eG}!IS\u000b >m\u0012<M", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", "7r<.a<:Z\u0004z\u000bl,", "7r<.a<:Z\u0004z\u000bl,;\u0017/n\u000f5\u0010:| \u0016Ty\u0012;p25d\u0005\u001cKg#.TC7y4", ":hU2V@<Z\u0019", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1md$8m\u0014BKJ;A", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "@`]1b4", "\u001ah^{f,Gb&\u0013Dn;\u0001\u0010xR{1zJ\tl", "5dc\u001fT5=]!", "u(;6buLS\"\u000e\bru\r\u00183lI\u0015wI\u007f!\u001f\u001d", "@`]1b4|R\u0019\u0006z`(\f\t", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "@dR<e+>`", "@d_9T@\u001b`\u0019zy\\9\r\u0011,C\n1\r@\u000e&\u0017T", "\u001ah^{f,Gb&\u0013DK,\b\u0010+y\\5{<\u007f\u0015$Ww\u000b\u001a\u0001.FY\u000b/7zk", "@d_9T@\u001cO\u0017\u0002z=0\n", "\u001aiPCTuB]b_~e,R", "5dc\u001fX7EO-\\v\\/|g3r", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "@d_9T@\u001ef\u0019|\u000bm6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u001fX7EO-^\u000e^*\r\u00189r", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`5m\u0011<u5<Y|\u007fJm\u0014>\\MHY4+&l_9\\", "@d_9T@\u001ef\u0019|\u000bm6\nG.e\u0007(}<\u0010\u0017", "@n^AI0>e'l\u0006r", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9zF\u00014&]}2E[!B#", "5dc\u001fb6MD\u001d~\rl\u001a\b\u001dms\u007f1\u000bM\u0015\u0011\u0013Pn\u001bFz$/f}+>i*(ZCBk0,\u0015", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006c/?hn$7\u007f$\u001cXW\u0011", "@n^AI0>e'l\u0006rj{\t6e\u0002$\u000b@", "1`_Ah9>@\u0019\n\u0002Z@", "", "7rC2e4B\\\u0015\u000e~g.", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "1gT0^\n:\\\u0006~xh9{", "1kT.a<I@\u0019\n\u0002Z@\u000b", "CmU6a0LV\u0019}g^7\u0004\u0005CI~", "", "1k^@X", "4h]._0SS\u0004\fzo0\u0007\u0019=R\u007f3\u0003<\u0015", "5dc\u000fe,:R\u0017\f\u000bf)Z\u00138v\u007f5\u000b@\u000e", "5dc\u001fX7EO-by", "7rA2V6KR\u001d\b|", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "<df\u0010b5?W\u001b", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^! Hs\u0010L\u0004!D]\b)\r", "=m2<a5>Q(\u0003\u0005g\u001a\f\u0005>u\u000e\u0006~<\n\u0019\u0017F", "AsPAh:", "\u001ah^{f,Gb&\u0013DB\n\u0007\u00128e}7\u007fJ\n\u0005&C~\u001eJa2?j\u0002\u001f7zT\fWLDk2-\u0019rj'\u0016_;^\u0005|", "=m;<j\u0014>[#\f\u000f", "=mA.g,%W!\u0003\n</x\u00121e~", "@`c2?0FW(~\b", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\nm\u0013&GV\u0012Dz45fS", "=mB0e,>\\'\u0002\u0005m\u0019|\u00079r~(z", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "Aba2X5LV#\u000e", "4qP:X\u001bB[\u0019\r\nZ4\b", "", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">`d@X", ">`d@X\u0010Gb\u0019\f\u0004Z3", "@dV6f;>`", "@dV6f;>`\u0006\t\u0005m\u001d\u0001\tAL\u00046\u000b@\n\u0017$U", "@dbB`,", "@dbB`,\"\\(~\bg(\u0004", "Adc\u000fe,:R\u0017\f\u000bf)Z\u00138v\u007f5\u000b@\u000e", "1n]CX9MS&", "AsP?g", "As^=", "Cma2Z0Lb\u0019\fgh6\fy3e\u0012\u000f\u007fN\u0010\u0017 G|\u001c", "\u001eqTC\\6Na\u0006~\u0006e(\u0011k3n\u000f", " d_9T@\u001ef\u0019|\u000bm6\nv/r\u0011,y@o\u001a$Gk\r\u001dr#Dc\u000b4", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReplayIntegration implements Integration, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, ReplayController, ComponentCallbacks, IConnectionStatusProvider.IConnectionStatusObserver, RateLimiter.IRateLimitObserver {
    public static final int $stable = 8;
    private CaptureStrategy captureStrategy;
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private GestureRecorder gestureRecorder;
    private Function0<GestureRecorder> gestureRecorderProvider;
    private IHub hub;
    private final AtomicBoolean isEnabled;
    private final AtomicBoolean isManualPause;
    private final ReplayLifecycle lifecycle;
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;
    private final Lazy random$delegate;
    private Recorder recorder;
    private final Function1<Boolean, ScreenshotRecorderConfig> recorderConfigProvider;
    private final Function0<Recorder> recorderProvider;
    private ReplayBreadcrumbConverter replayBreadcrumbConverter;
    private final Function1<SentryId, ReplayCache> replayCacheProvider;
    private Function1<? super Boolean, ? extends CaptureStrategy> replayCaptureStrategyProvider;
    private final Lazy replayExecutor$delegate;
    private final Lazy rootViewsSpy$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0005\"Bߚ(\u0007\u0015iy3ǲiH<R\u001c0\u001dl\u00144R]j\u0006ٺ?X"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1ma)Fm\u0018;IR?u=\\\u007fuaJ\u000bm<\\c'RSJ@?V{Li", "\u001ah^{f,Gb&\u0013Da0\u0006\u0018=/\\$yF\u0002\u001b\u001eNk\u000bCvz", "u(E", "Ag^B_+\u001e\\&\u0003xa", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class PreviousReplayHint implements Backfillable {
        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜N.hݷZ\u000f\u001azt'Ӯ(qQ;\u001e(\f%!O|k\u0018rX_#C=\f\\\r;8WV\u0011]@\u0011\tԒ{У7Mwމˉd{"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1ma)Fm\u0018;IR?u=\\\u0002hl@\u0003w\fav%W[X9JR\u007fN\u0018\u0010Z|Q8\r\u0001X\" lSA,\u001c\u0002", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "u(E", "1mc", "", "<df![9>O\u0018", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "@", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder("SentryReplayIntegration-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(r2, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, Function0<? extends Recorder> function0, Function1<? super Boolean, ScreenshotRecorderConfig> function1, Function1<? super SentryId, ReplayCache> function12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.recorderConfigProvider = function1;
        this.replayCacheProvider = function12;
        this.random$delegate = LazyKt.lazy(new Function0<Random>() { // from class: io.sentry.android.replay.ReplayIntegration$random$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Random invoke() {
                return new Random();
            }
        });
        this.rootViewsSpy$delegate = LazyKt.lazy(new Function0<RootViewsSpy>() { // from class: io.sentry.android.replay.ReplayIntegration$rootViewsSpy$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RootViewsSpy invoke() {
                return RootViewsSpy.Companion.install();
            }
        });
        this.replayExecutor$delegate = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.ReplayIntegration$replayExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.ReplayExecutorServiceThreadFactory());
            }
        });
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = NoOpReplayBreadcrumbConverter.getInstance();
        Intrinsics.checkNotNullExpressionValue(noOpReplayBreadcrumbConverter, "getInstance()");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycle = new ReplayLifecycle();
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iCurrentDateProvider, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : function0, (8 & i2) != 0 ? null : function1, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? function12 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, Function0<? extends Recorder> function0, Function1<? super Boolean, ScreenshotRecorderConfig> function1, Function1<? super SentryId, ReplayCache> function12, Function1<? super Boolean, ? extends CaptureStrategy> function13, MainLooperHandler mainLooperHandler, Function0<GestureRecorder> function02) {
        this(ContextKt.appContext(context), dateProvider, function0, function1, function12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = function13;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function02;
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, Function1 function1, Function1 function12, Function1 function13, MainLooperHandler mainLooperHandler, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iCurrentDateProvider, function0, function1, function12, (i2 + 32) - (i2 | 32) != 0 ? null : function13, (i2 + 64) - (i2 | 64) != 0 ? null : mainLooperHandler, (i2 + 128) - (i2 | 128) == 0 ? function02 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanRecord() {
        IHub iHub;
        IHub iHub2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions = null;
            }
            if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iHub = this.hub) == null || (rateLimiter2 = iHub.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iHub2 = this.hub) == null || (rateLimiter = iHub2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String str) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (StringsKt.startsWith$default(name, "replay_", false, 2, (Object) null)) {
                String str2 = name;
                String string = getReplayId().toString();
                Intrinsics.checkNotNullExpressionValue(string, "replayId.toString()");
                if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) string, false, 2, (Object) null)) {
                    String str3 = str;
                    if (StringsKt.isBlank(str3) || !StringsKt.contains$default((CharSequence) str2, (CharSequence) str3, false, 2, (Object) null)) {
                        FileUtils.deleteRecursively(file);
                    }
                }
            }
        }
    }

    static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        SentryOptions sentryOptions2 = null;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        ISentryExecutorService executorService = sentryOptions.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "options.executorService");
        SentryOptions sentryOptions3 = this.options;
        if (sentryOptions3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
        } else {
            sentryOptions2 = sentryOptions3;
        }
        ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.ReplayIntegration$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ReplayIntegration.finalizePreviousReplay$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$5(ReplayIntegration this$0) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SentryOptions sentryOptions = this$0.options;
        SentryOptions sentryOptions2 = null;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            SentryOptions sentryOptions3 = this$0.options;
            if (sentryOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions3 = null;
            }
            String str = (String) persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions3, PersistingScopeObserver.REPLAY_FILENAME, String.class);
            if (str != null) {
                SentryId sentryId = new SentryId(str);
                if (Intrinsics.areEqual(sentryId, SentryId.EMPTY_ID)) {
                    cleanupReplays$default(this$0, null, 1, null);
                    return;
                }
                ReplayCache.Companion companion = ReplayCache.Companion;
                SentryOptions sentryOptions4 = this$0.options;
                if (sentryOptions4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions4 = null;
                }
                LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions4, sentryId, this$0.replayCacheProvider);
                if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
                    cleanupReplays$default(this$0, null, 1, null);
                    return;
                }
                SentryOptions sentryOptions5 = this$0.options;
                if (sentryOptions5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions5 = null;
                }
                Object obj = persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions5, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
                List<Breadcrumb> list = obj instanceof List ? (List) obj : null;
                CaptureStrategy.Companion companion2 = CaptureStrategy.Companion;
                IHub iHub = this$0.hub;
                SentryOptions sentryOptions6 = this$0.options;
                if (sentryOptions6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                } else {
                    sentryOptions2 = sentryOptions6;
                }
                CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iHub, sentryOptions2, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
                if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
                    Hint hint = HintUtils.createWithTypeCheckHint(new PreviousReplayHint());
                    IHub iHub2 = this$0.hub;
                    Intrinsics.checkNotNullExpressionValue(hint, "hint");
                    ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iHub2, hint);
                }
                this$0.cleanupReplays(str);
                return;
            }
        }
        cleanupReplays$default(this$0, null, 1, null);
    }

    private final Random getRandom() {
        return (Random) this.random$delegate.getValue();
    }

    private final ScheduledExecutorService getReplayExecutor() {
        return (ScheduledExecutorService) this.replayExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onScreenshotRecorded$lambda$0(Ref.ObjectRef screen, IScope it) {
        Intrinsics.checkNotNullParameter(screen, "$screen");
        Intrinsics.checkNotNullParameter(it, "it");
        String screen2 = it.getScreen();
        screen.element = screen2 != null ? StringsKt.substringAfterLast$default(screen2, '.', (String) null, 2, (Object) null) : 0;
    }

    private final synchronized void pauseInternal() {
        if (this.isEnabled.get() && this.lifecycle.isAllowed(ReplayState.PAUSED)) {
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.pause();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.pause();
            }
            this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.PAUSED);
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final synchronized void resumeInternal() {
        IHub iHub;
        IHub iHub2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.isEnabled.get() && this.lifecycle.isAllowed(ReplayState.RESUMED)) {
            if (!this.isManualPause.get()) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions = null;
                }
                if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() != IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iHub = this.hub) == null || (rateLimiter2 = iHub.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iHub2 = this.hub) == null || (rateLimiter = iHub2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.resume();
                    }
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.resume();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.RESUMED);
                }
            }
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.ReplayController
    public synchronized void captureReplay(Boolean bool) {
        if (this.isEnabled.get() && isRecording()) {
            SentryId sentryId = SentryId.EMPTY_ID;
            CaptureStrategy captureStrategy = this.captureStrategy;
            SentryOptions sentryOptions = null;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                } else {
                    sentryOptions = sentryOptions2;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(Intrinsics.areEqual((Object) bool, (Object) true), new Function1<Date, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.captureReplay.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Date date) {
                        invoke2(date);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Date newTimestamp) {
                        Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
                        CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy3 != null) {
                            CaptureStrategy captureStrategy4 = ReplayIntegration.this.captureStrategy;
                            Integer numValueOf = captureStrategy4 != null ? Integer.valueOf(captureStrategy4.getCurrentSegment()) : null;
                            Intrinsics.checkNotNull(numValueOf);
                            captureStrategy3.setCurrentSegment(numValueOf.intValue() + 1);
                        }
                        CaptureStrategy captureStrategy5 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy5 == null) {
                            return;
                        }
                        captureStrategy5.setSegmentTimestamp(newTimestamp);
                    }
                });
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        RateLimiter rateLimiter;
        if (this.isEnabled.get() && this.lifecycle.isAllowed(ReplayState.CLOSED)) {
            SentryOptions sentryOptions = this.options;
            SentryOptions sentryOptions2 = null;
            if (sentryOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1561oA.ud("zz}qvtx", (short) (Od.Xd() ^ (-2587))));
                sentryOptions = null;
            }
            sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
            IHub iHub = this.hub;
            if (iHub != null && (rateLimiter = iHub.getRateLimiter()) != null) {
                rateLimiter.removeRateLimitObserver(this);
            }
            SentryOptions sentryOptions3 = this.options;
            if (sentryOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1561oA.yd("NNQERPT", (short) (Od.Xd() ^ (-30218))));
                sentryOptions3 = null;
            }
            if (sentryOptions3.getSessionReplay().isTrackOrientationChange()) {
                try {
                    Context context = this.context;
                    ReplayIntegration replayIntegration = this;
                    short sXd = (short) (C1499aX.Xd() ^ (-26764));
                    int[] iArr = new int["\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41".length()];
                    QB qb = new QB("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = {Class.forName(Xg.qd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\t\r\r\r\u0005\u000f\u0016e\u0005\u0011\u0012\t\t\f\u0015\u001e", (short) (C1607wl.Xd() ^ 18694), (short) (C1607wl.Xd() ^ 30049)))};
                    Object[] objArr = {replayIntegration};
                    short sXd2 = (short) (ZN.Xd() ^ 10698);
                    short sXd3 = (short) (ZN.Xd() ^ 2813);
                    int[] iArr2 = new int["^l\u0013\u001b\u0007\u0010KR-OC\u0005lu&,\r+S7<M~zc{&C".length()];
                    QB qb2 = new QB("^l\u0013\u001b\u0007\u0010KR-OC\u0005lu&,\r+S7<M~zc{&C");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                        i3++;
                    }
                    Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(context, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Throwable unused) {
                }
            }
            stop();
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.close();
            }
            this.recorder = null;
            getRootViewsSpy$sentry_android_replay_release().close();
            ScheduledExecutorService replayExecutor = getReplayExecutor();
            Intrinsics.checkNotNullExpressionValue(replayExecutor, ZO.xd("]VoMpi\u001d\ru&2C <", (short) (ZN.Xd() ^ 23890), (short) (ZN.Xd() ^ 3231)));
            ScheduledExecutorService scheduledExecutorService = replayExecutor;
            SentryOptions sentryOptions4 = this.options;
            if (sentryOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1626yg.Ud("f\u001fn(\u0002SJ", (short) (C1580rY.Xd() ^ (-2972)), (short) (C1580rY.Xd() ^ (-12761))));
            } else {
                sentryOptions2 = sentryOptions4;
            }
            ExecutorsKt.gracefullyShutdown(scheduledExecutorService, sentryOptions2);
            this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.CLOSED);
        }
    }

    @Override // io.sentry.ReplayController
    public ReplayBreadcrumbConverter getBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override // io.sentry.ReplayController
    public SentryId getReplayId() {
        SentryId currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy$delegate.getValue();
    }

    public final AtomicBoolean isEnabled$sentry_android_replay_release() {
        return this.isEnabled;
    }

    public final AtomicBoolean isManualPause$sentry_android_replay_release() {
        return this.isManualPause;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STOPPED) < 0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) throws Throwable {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        Recorder recorder;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.isEnabled.get() && isRecording()) {
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.stop();
            }
            Function1<Boolean, ScreenshotRecorderConfig> function1 = this.recorderConfigProvider;
            if (function1 == null || (screenshotRecorderConfigFrom = function1.invoke(true)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.Companion;
                Context context = this.context;
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions = null;
                }
                SentryReplayOptions sessionReplay = sentryOptions.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(screenshotRecorderConfigFrom);
            }
            Recorder recorder3 = this.recorder;
            if (recorder3 != null) {
                recorder3.start(screenshotRecorderConfigFrom);
            }
            if (this.lifecycle.getCurrentState$sentry_android_replay_release() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(RateLimiter rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        IHub iHub = this.hub;
        if (iHub != null) {
            iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.ReplayIntegration$$ExternalSyntheticLambda1
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    ReplayIntegration.onScreenshotRecorded$lambda$0(objectRef, iScope);
                }
            });
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ReplayCache replayCache, Long l2) throws IOException {
                    invoke(replayCache, l2.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ReplayCache onScreenshotRecorded, long j2) throws IOException {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    onScreenshotRecorded.addFrame$sentry_android_replay_release(bitmap, j2, objectRef.element);
                    this.checkCanRecord();
                }
            });
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(final File screenshot, final long j2) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ReplayCache replayCache, Long l2) {
                    invoke(replayCache, l2.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ReplayCache onScreenshotRecorded, long j3) {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    ReplayCache.addFrame$default(onScreenshotRecorded, screenshot, j2, null, 4, null);
                    this.checkCanRecord();
                }
            }, 1, null);
        }
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(MotionEvent event) {
        CaptureStrategy captureStrategy;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // io.sentry.ReplayController
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        WindowRecorder windowRecorder;
        GestureRecorder gestureRecorder;
        Intrinsics.checkNotNullParameter(iHub, Ig.wd("\u0007;$", (short) (C1580rY.Xd() ^ (-27393))));
        short sXd = (short) (Od.Xd() ^ (-2031));
        int[] iArr = new int["3]O(f3`".length()];
        QB qb = new QB("3]O(f3`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(sentryOptions, new String(iArr, 0, i2));
        this.options = sentryOptions;
        if (!sentryOptions.getSessionReplay().isSessionReplayEnabled() && !sentryOptions.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            ILogger logger = sentryOptions.getLogger();
            SentryLevel sentryLevel = SentryLevel.INFO;
            Object[] objArr = new Object[0];
            short sXd2 = (short) (ZN.Xd() ^ 32504);
            int[] iArr2 = new int["8IVUJOM}OAKF:Qv?Hs7;D11:20vi77f9&13.&_1\u001f1!Z-)\u001d\u001a\u001f\u001b\u001d\u0018\u0016".length()];
            QB qb2 = new QB("8IVUJOM}OAKF:Qv?Hs7;D11:20vi77f9&13.&_1\u001f1!Z-)\u001d\u001a\u001f\u001b\u001d\u0018\u0016");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            logger.log(sentryLevel, new String(iArr2, 0, i3), objArr);
            return;
        }
        this.hub = iHub;
        Function0<Recorder> function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = function0.invoke()) == null) {
            MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            ScheduledExecutorService replayExecutor = getReplayExecutor();
            Intrinsics.checkNotNullExpressionValue(replayExecutor, C1593ug.zd("\b{\b\u0005z\u0014`\u0015\u0003\u0002\u0015\u0015\u0011\u0015", (short) (Od.Xd() ^ (-26755)), (short) (Od.Xd() ^ (-28020))));
            windowRecorder = new WindowRecorder(sentryOptions, this, mainLooperHandler, replayExecutor);
        }
        this.recorder = windowRecorder;
        Function0<GestureRecorder> function02 = this.gestureRecorderProvider;
        if (function02 == null || (gestureRecorder = function02.invoke()) == null) {
            gestureRecorder = new GestureRecorder(sentryOptions, this);
        }
        this.gestureRecorder = gestureRecorder;
        this.isEnabled.set(true);
        sentryOptions.getConnectionStatusProvider().addConnectionStatusObserver(this);
        RateLimiter rateLimiter = iHub.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(this);
        }
        if (sentryOptions.getSessionReplay().isTrackOrientationChange()) {
            try {
                Context context = this.context;
                ReplayIntegration replayIntegration = this;
                Class<?> cls = Class.forName(C1561oA.od("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (ZN.Xd() ^ AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH)));
                Class<?>[] clsArr = new Class[1];
                short sXd3 = (short) (C1499aX.Xd() ^ (-28426));
                int[] iArr3 = new int["6D;JHC?\n@MMTFPW\u0012(UTXXXPZa1P\\]TTW`i".length()];
                QB qb3 = new QB("6D;JHC?\n@MMTFPW\u0012(UTXXXPZa1P\\]TTW`i");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr2 = {replayIntegration};
                Method method = cls.getMethod(Wg.Zd("OZu\u00112LV|d\u001b2Nd|\r/L3Z~\u0016%=Xw\u001a", (short) (C1607wl.Xd() ^ 8289), (short) (C1607wl.Xd() ^ 930)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.INFO, C1561oA.Xd("_\r\f\u0010\u0010\u0010\b\u0012\u0019h\b\u0014\u0015\f\f\u000f\u0018!N\u0019$Q!#)U\u0018.\u001a#'\u001d\u001f*$k`15-*4;)=3::l171?98GtMFF\u007fNz>B}GAOFOII\u0006Ia\t=P_`W^^\u0011dXdaWp", (short) (C1499aX.Xd() ^ (-11541))), th);
            }
        }
        IntegrationUtils.addIntegrationToSdkVersion(Wg.vd("L`liWp", (short) (Od.Xd() ^ (-1794))));
        SentryIntegrationPackageStorage.getInstance().addPackage(Qg.kd("C6J8@\u000b9>{@19>;A\u00019*274:l ,!.*#\u001dd)\u001b% \u0014+", (short) (OY.Xd() ^ 21621), (short) (OY.Xd() ^ 26041)), hg.Vd("pfihcj", (short) (C1580rY.Xd() ^ (-21553)), (short) (C1580rY.Xd() ^ (-10630))));
        finalizePreviousReplay();
    }

    @Override // io.sentry.ReplayController
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(ReplayBreadcrumbConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override // io.sentry.ReplayController
    public synchronized void start() {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        BufferCaptureStrategy bufferCaptureStrategy;
        CaptureStrategy captureStrategyInvoke;
        if (this.isEnabled.get()) {
            SentryOptions sentryOptions = null;
            if (!this.lifecycle.isAllowed(ReplayState.STARTED)) {
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                } else {
                    sentryOptions = sentryOptions2;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions3 = this.options;
            if (sentryOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions3 = null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions3.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                SentryOptions sentryOptions4 = this.options;
                if (sentryOptions4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions4 = null;
                }
                if (!sentryOptions4.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    SentryOptions sentryOptions5 = this.options;
                    if (sentryOptions5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    } else {
                        sentryOptions = sentryOptions5;
                    }
                    sentryOptions.getLogger().log(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    return;
                }
            }
            Function1<Boolean, ScreenshotRecorderConfig> function1 = this.recorderConfigProvider;
            if (function1 == null || (screenshotRecorderConfigFrom = function1.invoke(false)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.Companion;
                Context context = this.context;
                SentryOptions sentryOptions6 = this.options;
                if (sentryOptions6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions6 = null;
                }
                SentryReplayOptions sessionReplay = sentryOptions6.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            Function1<? super Boolean, ? extends CaptureStrategy> function12 = this.replayCaptureStrategyProvider;
            if (function12 == null || (captureStrategyInvoke = function12.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions7 = this.options;
                    if (sentryOptions7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions7 = null;
                    }
                    IHub iHub = this.hub;
                    ICurrentDateProvider iCurrentDateProvider = this.dateProvider;
                    ScheduledExecutorService replayExecutor = getReplayExecutor();
                    Intrinsics.checkNotNullExpressionValue(replayExecutor, "replayExecutor");
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions7, iHub, iCurrentDateProvider, replayExecutor, this.replayCacheProvider);
                } else {
                    SentryOptions sentryOptions8 = this.options;
                    if (sentryOptions8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions8 = null;
                    }
                    IHub iHub2 = this.hub;
                    ICurrentDateProvider iCurrentDateProvider2 = this.dateProvider;
                    Random random2 = getRandom();
                    ScheduledExecutorService replayExecutor2 = getReplayExecutor();
                    Intrinsics.checkNotNullExpressionValue(replayExecutor2, "replayExecutor");
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions8, iHub2, iCurrentDateProvider2, random2, replayExecutor2, this.replayCacheProvider);
                }
                captureStrategyInvoke = bufferCaptureStrategy;
            }
            this.captureStrategy = captureStrategyInvoke;
            if (captureStrategyInvoke != null) {
                CaptureStrategy.DefaultImpls.start$default(captureStrategyInvoke, screenshotRecorderConfigFrom, 0, null, null, 14, null);
            }
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start(screenshotRecorderConfigFrom);
            }
            registerRootViewListeners();
            this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.STARTED);
        }
    }

    @Override // io.sentry.ReplayController
    public synchronized void stop() {
        if (this.isEnabled.get() && this.lifecycle.isAllowed(ReplayState.STOPPED)) {
            unregisterRootViewListeners();
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.stop();
            }
            GestureRecorder gestureRecorder = this.gestureRecorder;
            if (gestureRecorder != null) {
                gestureRecorder.stop();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.stop();
            }
            this.captureStrategy = null;
            this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.STOPPED);
        }
    }
}
