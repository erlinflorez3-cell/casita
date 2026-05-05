package com.dynatrace.agent.di;

import android.app.Application;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.OneAgentStartup;
import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.OneAgentStartupImpl;
import com.dynatrace.agent.api.CommunicationManagerBridgeImpl;
import com.dynatrace.agent.api.OneAgentFacade;
import com.dynatrace.agent.api.OneAgentLifecycleManagerBridgeImpl;
import com.dynatrace.agent.api.OneAgentUserInteractionManagerBridgeImpl;
import com.dynatrace.agent.api.ServerDataListenerImpl;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.communication.di.CommunicationModule;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.exitreason.di.ExitReasonModule;
import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.agent.lifecycle.callback.CurrentViewTracker;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.di.MetricsModule;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.di.StorageModule;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.agent.view.ViewContextManager;
import com.dynatrace.agent.view.ViewSummarizer;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.communication.ServerConfigurationListener;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яſ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVgmoRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMwމA`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>ԟt]P/+ɅqBd'g0\u0003N\u0015Fj'\u0015vg\u001f3@M5\u001dǬ[\u0003\u001dRc?\t@y=\u001bh/ݐ3I\nW>X\u0006\u0015\u001d+e\reö.\\\u001bQh\f-,WcaP\u0016ߊ\u007fz\u0012\rDǉ\u0016\u0006=H6- g\u0010\u000eItzSFQ\n^X\u007f\u0003ʨ>\u0017;\u007f;+?\u001cnQw;!\u05cb?{\u001b\r&#\u0007o)[b\u000eh\u0015!T}\u0383G҅^\u001axN8Xul`1&\b*\u00144U\u007fG{?/')E]Q#On\u0012LRk\u000f\u0005\u000fmcqXHN(\u0007\u0018M)7\u0013jHr\r\u0004P\u0003a<\u0015[&l\u0007,\u0013#$j\u0004T!S\u001dʽSjox[lR+=AOY\u001dGTW\njAEic>r)Λ\u0016͖@b\r֚7Na\u001er\\V5\tʎlݻ{{L\u0088\\\u001f@S\n\u001cbA\bǌ^ČL\u0003&Փ\u0012\t\u0017urh>\u0016+՟&ғm$|էQ\\j\t\bg'b\u0003ʌbĘ1AYځi2c<\u00014+>]ѫuõKgT܁\u001dx$\u0012m{N3pߜSȠA\u0013\u0017ȯy>\u0010K]L!\u0005(˪\u0014ؠ~|\u0002Ҹ\ft<\b j\u001fM7ʇLׅX\u0017*Ԯ/~1*|\u007f(\u0005\u001dڬIϭX\u000bcŬ\u001a~\u0011}TNf\"[ȗ ݵ\u0005o*Ĝ\u00069QM5\u0016&;\u0006֕cԃmo6Ӡ3\u001e4\u001d}\u0004Z\r݁shYϡJ=>sg*\u000f12\u0019\u001bBv\u0018͎\fH\u0011ͩ%5Nor 'D[;G}\u00158\u0003ݻrÆ_:\u001b̊NC<\u0012Bsq1љbI-ݎeUm\"{\u0001-\u0017XE\"\u000b*hEܡ\u001eݞ$V_łY?\u0014,06otك\tB\u0011ӗL.BB\u0019~%u\u0014L\u0013\u007ft\u001deĢ4¡w;^Օ%\bj\u0015`\u0005\u000f\u0005Ț%0\tϓ'5$9CrUyT\u0017Gc`D*\u07fc\u000bƨnO\u0007ܺu7R\u0019Q\u001bV\u001eWՍGزGI\nԍTV74\u0004o:\u007f±\u0001#JȰ3;WYm@\u0001m\u0019 |N\u0013BՆjXVÝA\u0001\u0001I\u001c\nZ\u001b\u0019ggr\u001e2\u0004َPߺ;C\"݅gS7W$|\u0012\u0018ɴ1\f=σUKpf5O(_IR  N|Zȏ#Ǜ[\u000enŊ.*Hl\n\u0016\u0011YƤ\u0017V(ɌFLzK\u0018\bģ:-"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`%y\u001b<T/=d\b)7v%\u0004", "", "=mT\u000eZ,Gbv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", ":dV.V@,S&\u0010zk\n\u0007\u00120i\u00028\t<\u0010\u001b!PV\u0012J\u0006%>Y\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?a\u00060@q\u0014*\\GEt}\f\u0015ur9\u0014A6Ww+I\\[(kV|Fz\u0016h\u001dN4\r\u0012/", "6sc=9(<b#\f\u000f", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "AdR<a+ S\"lzk=\u0001\u0007/L\n&wO\u000b$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\fF\u007f$\u0017Y\u0007\u000e7z'2KC\"u2\u001a$rn\u000f", "1n]3\\.N`\u0015\u000e~h5g\u0019,l\u00046~@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY$", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0001 GK\u0010<\u007f4\u0013c\u0007!;o&;IR?u=s{fkAPb@Wr6THL,&Nt=\u001d!$\fX3\u0015\u000fb\u000b3rL7hv0Q\u0002&u\u000b\u001d\u001a\r5wF)T\u001aOC\u0014\nJ%wSU]y\u0011=Na7n\u0010^fX<:-#;\u0017%pX>\u0013\u007fQ\r\u0002V\u0004p15\u0019\bI$KKeOFsWL\u0002#.O\u0006\u0001x6f\u0004+}-\u0011\n\u0011@j\bZv#\f(V\u00113c\u007f\b\"4K\u001dL_9\\hG\ru)e\u0007W^@<bApnO\u0013\u0005Y&_?j5g5\\\u000e\bH\u0004\u001e#U\f>Yy^\u0005\t$vt\u0013B\u001f\u001en\u001anN+^r\u0003\fT\u0018)?\u001a;Yur([FW ^O6\u0016\u0004#B)yD\u001fzGp[!k-5\u0006\u001bM |G>v[R9\u000e =\u0002T\\'|jF{F !4AcAMp,\u0012ka%\u0019t\u000e_\u0010", "1na266K])\u000e~g,j\u00079p\u007f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "As^?T.>;#}\u000be,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$9#k/Az\u00120M+EjD%\u0015>", "1n];X*MW*\u0003\nr\n\u007f\t-k\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "2`c.U(LSwz\nZ\u001a\u0007\u0019<c\u007f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "3mS\u001db0Gb|\b{h\u000bx\u0018+S\n8\t>\u0001", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=i", "/bc6i,\u001e\\\u0018i\u0005b5\fl8f\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "2x].`0<1#\b{b.[\u0005>am2\fM~\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@-5a\b-K7tBV?Co2{\u001fqb=\tB(]r\u0015Q\\[*\\(", "1n\\:h5BQ\u0015\u000e~h5d\u00058a\u0002(\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T\"", "3uT;g\rE]+`\u0005o,\n\u00129r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u0001>w(\u0010WT;x=(\">", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "3uT;g\u001bA`#\u000e\ne,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;x\n", ";dc?\\*L;#}\u000be,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@$9#e Fz\u001a,[+EjD%\u0015>", "5dc\u001aX;KW\u0017\rbh+\r\u0010/", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u001fG~\u001b@t3~X\u0002i\u001fm%;QAIS>\u001d%oa\u000f", ";dc?\\*L@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "5dc\u001aX;KW\u0017\rg^7\u0007\u00173t\n5\u0010", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u001fG~\u001b@t3~A}/Dq\u0014<:CFuB\"$rnM\\", "DhTDF<F[\u0015\f~s,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z\u001aCMP\u0011", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0005FY\u0007/\u0016q$9IR9n4+j", "5dc\u001fh4\u001ed\u0019\b\n=0\u000b\u0014+t}+{M", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0001Poi>v.D9\u000f @|t2[N7z2!\u0015u7", "DhTD66Gb\u0019\u0012\nF(\u0006\u00051e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0016IL7m4+j", "=mT\u000eZ,GbyzxZ+|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011Y\u0017<R'5b\r\u00013k\u0012-M\u0019", "5dc\u001ca,\u001aU\u0019\b\n?(z\u0005.e", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0013RsW&\u007f%\u0011[})FN\u0012,IB;A", "DhTDG9:Q\u001f~\b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~Wy'>j\u0012,S\r\u0019{A+\u0015qp*\u000bc>=\u0004#ERN92", "=mT\u000eZ,Gb\u0007\u000evk;\r\u0014\u000fv\u007f1\u000b\u001f\u0005%\"C~\f?v2", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxu?MLJJ8, dp7\nc9$", "5dc\u001ca,\u001aU\u0019\b\nL;x\u0016>u\u000b\b\r@\n&uK}\u00198\u0006#8Y\u000b", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0001Poi>v.DG\r\u001cD|&9-T;tC|\u0019vl5\u0016a/N\u0004|", "3wXAE,:a#\bbh+\r\u0010/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#|$\u0001M)2\\0;gB(\u001ePk8\u0017j,$", "3wXAE,:a#\bek6z\t=s\n5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9$", "=mT\u000eZ,Gb\u0007\u000evk;\r\u0014", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxk", "5dc\u001ca,\u001aU\u0019\b\nL;x\u0016>u\u000b", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0001Poi>v.DG\r\u001cD|&9#", "1n\\:h5BQ\u0015\u000e~h5d\u00058a\u0002(\t\u001d\u000e\u001b\u0016Io", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?a\u00060@q\u0014*\\GEt}{\u001fpiI\u0010g*J\u0006+QU6(eNt=!ng\u0012M-\rZ", "5dc\u0010b4Fc\"\u0003xZ;\u0001\u00138M{1wB\u0001$sTs\r>v", "u(;0b4\bR-\bvm9x\u0007//{1zM\u000b\u001b\u0016\u0011k\u0010<\u007f4~W\b(?}\u001f2K?Jo>'^FkA\u000fs5Rt#VPX5DN{9\u0016\u0012gj[/\f\u0007Y\u0017", ":hU2V@<Z\u0019fvg(~\t<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~C\u0007 \u0013o\u00167\\*?l4\u001c)fh9n_5Jx'T\"", "=mT\u000eZ,Gb\u007f\u0003{^*\u0011\u00076eg$\u0005<\u0003\u0017$$|\u0012;x%", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@,9Z}\u001eKk\u001d.\u0017-Dk\u0010 \u0015qp \u000bd,L\u000b%NL6(eNt=!ng\u0012M-\rZ", "5dc\u001ca,\u001aU\u0019\b\nE0}\t-y}/{(| \u0013Io\u001b\u0019\u0004)4[}", "u(;0b4\bR-\bvm9x\u0007//{1zM\u000b\u001b\u0016\u0011k\u0010<\u007f4~`\u0002!7k*,TC\u0005U=\u001epjaB\u0016J0Ov%[JU,DN{9\u0016\u0012gj[/\f\u0007Y\u0017", "CrT?<5MS&zxm0\u0007\u0012\u0017a\t$}@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_\u0018VC\u0017m4'$Xo9\u0014G5]v4CJ]0f[Z9\u001d\u000e\\\u000e[\u0001", "=mT\u000eZ,Gb\t\rzk\u0010\u0006\u0018/r{&\u000bD\u000b ~Cx\n>v2\u0012f\u0002\u001f9m", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@5CY\u000b\u001c5|\u001a8V\r%t4y\u0017hjHvq,[Z0VL[(ZavG\u001dyV\u0017J-\r\u00126N(mF7t", "5dc\u001ca,\u001aU\u0019\b\nN:|\u0016\u0013n\u000f(\t<~&\u001bQxu8\u007f!7Y\u000b|Dq\u00150M", "u(;0b4\bR-\bvm9x\u0007//{1zM\u000b\u001b\u0016\u0011k\u0010<\u007f4~i\f Di\u0014=QMD5\u001e'\u0015Dc9\u0010r\u001c\\v4+U],iNpL\u0018\u001ccuJ4\t\u0007YN\u0001{H6!\b\u0002", "BdP?76P\\", "", "\u0016n[1X9", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CoreComponent {
    public static final Holder Holder = new Holder(null);
    private static CoreComponent instance = null;
    private final EndPointInfo activeEndPointInfo;
    private final CommunicationManager communicationManager;
    private final CommunicationManagerBridge communicationManagerBridge;
    private final NetworkConnectivityChecker connectivityChecker;
    private final CoroutineScope coreCoroutineScope;
    private final EventDatabaseDataSource databaseDataSource;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final EndPointInfoDataSource endPointInfoDataSource;
    private final EventFlowGovernor eventFlowGovernor;
    private final EventThrottler eventThrottler;
    private final ExitReasonModule exitReasonModule;
    private final ExitReasonProcessor exitReasonProcessor;
    private final OneAgentLifecycleManager lifecycleManager;
    private final MetricsModule metricsModule;
    private final MetricsRepository metricsRepository;
    private final OneAgentFacade oneAgentFacade;
    private final OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
    private final OneAgentStartup oneAgentStartup;
    private final OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher;
    private final OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge;
    private final OneAgentEventDispatcher rumEventDispatcher;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final StorageModule storageModule;
    private final OneAgentUserInteractionManager userInteractionManager;
    private final ViewContextManager viewContextManager;
    private final ViewSummarizer viewSummarizer;
    private final CurrentViewTracker viewTracker;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4I[|c܉\u0010Hԏ ?aL0D?`ҽ:\u0007&209BE\u000f\u001eBH>{+GY\u0012*0nwjV\u001bU\u001d\u001a@\u000fn$\u000f(tg|Axtc:=/\u001bkXMUl`\u0001[\u001b^TU\u001c'e,;X7c&UW\u0011\u0019j[m\u0016\bwK\u0019\u0001)=*wv Kf\u0015,\u0015YT=c\u0001<t\u0007g_:*qNӍOP\u0014?@~\n%T\u0004<\u000bwV</2h\u001e\rawIԢLг\u0006^JȕіeO"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`%y\u001b<T/=d\b)7v%l0MBj4+j", "", "\nh]6g\u0005", "u(E", "7mbAT5<S", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`%y\u001b<T/=d\b)7v%\u0004", "7mXA66F^#\bzg;", "", "=mT\u000eZ,Gbv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", ":dV.V@,S&\u0010zk\n\u0007\u00120i\u00028\t<\u0010\u001b!PV\u0012J\u0006%>Y\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?a\u00060@q\u0014*\\GEt}\f\u0015ur9\u0014A6Ww+I\\[(kV|Fz\u0016h\u001dN4\r\u0012/", "6sc=9(<b#\f\u000f", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "AdR<a+ S\"lzk=\u0001\u0007/L\n&wO\u000b$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\fF\u007f$\u0017Y\u0007\u000e7z'2KC\"u2\u001a$rn\u000f", "1n]3\\.N`\u0015\u000e~h5g\u0019,l\u00046~@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY$", "5dc\u0016a:MO\"|z", "Adc!X:M7\"\r\nZ5z\t", "1n\\=b5>\\(", "Adc!X:M7\"\r\nZ5z\tmc\n0u?\u0015 \u0013V|\n:v\u001f1[})Fg#.TC7y4", "BdP?76P\\", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Holder {
        private Holder() {
        }

        public /* synthetic */ Holder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void initComponent$default(Holder holder, OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                factory = null;
            }
            holder.initComponent(oneAgentConfiguration, timeProvider, serverConfigurationListener, factory, application, secondGenServiceLocator, configurationPublisher);
        }

        public final CoreComponent getInstance() {
            return CoreComponent.instance;
        }

        public final void initComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener legacyServerConfigurationListener, Call.Factory factory, Application applicationContext, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher) {
            Intrinsics.checkNotNullParameter(oneAgentConfiguration, "oneAgentConfiguration");
            Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
            Intrinsics.checkNotNullParameter(legacyServerConfigurationListener, "legacyServerConfigurationListener");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(secondGenServiceLocator, "secondGenServiceLocator");
            Intrinsics.checkNotNullParameter(configurationPublisher, "configurationPublisher");
            if (CoreComponent.instance == null) {
                CoreComponent coreComponent = new CoreComponent(oneAgentConfiguration, timeProvider, legacyServerConfigurationListener, factory, applicationContext, secondGenServiceLocator, configurationPublisher, null);
                Holder holder = CoreComponent.Holder;
                CoreComponent.instance = coreComponent;
            }
        }

        @JvmStatic
        public final void setTestInstance$com_dynatrace_agent_release(CoreComponent coreComponent) {
            CoreComponent.instance = coreComponent;
        }

        public final void tearDown() {
            Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "tearDown OneAgent");
            try {
                CoreComponent coreComponent = CoreComponent.instance;
                if (coreComponent != null) {
                    coreComponent.tearDown();
                }
                CoreComponent.instance = null;
            } catch (Exception e2) {
                CoreComponent.instance = null;
                Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "tearDown OneAgent with exception", e2);
            }
        }
    }

    private CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, final SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher) throws Throwable {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.coreCoroutineScope = CoroutineScope;
        Application application2 = application;
        StorageModule storageModule = new StorageModule(application2, CoroutineScope);
        this.storageModule = storageModule;
        NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl = new NetworkConnectivityCheckerImpl(application2, CoroutineScope);
        this.connectivityChecker = networkConnectivityCheckerImpl;
        EventDatabaseDataSource eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release = storageModule.provideEventDatabaseDataSource$com_dynatrace_agent_release();
        this.databaseDataSource = eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release;
        ServerConfigurationDataSource serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideServerConfigurationDataSource$com_dynatrace_agent_release();
        this.serverConfigurationDataSource = serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release;
        EndPointInfoDataSource endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideStartupConfigurationDataSource$com_dynatrace_agent_release();
        this.endPointInfoDataSource = endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release;
        EndPointInfo endPointInfo = new EndPointInfo(oneAgentConfiguration.getApplicationId(), oneAgentConfiguration.getBeaconUrl());
        this.activeEndPointInfo = endPointInfo;
        DynamicConfigDataSource dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release = storageModule.provideDynamicConfigurationDataSource$com_dynatrace_agent_release();
        this.dynamicConfigDataSource = dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release;
        CommunicationManager communicationManagerProvideCommunicationManager = new CommunicationModule(factory, timeProvider, oneAgentConfiguration.getVersion(), eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, endPointInfo, new ServerDataListenerImpl(serverConfigurationListener, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release, configurationPublisher), CoroutineScope, networkConnectivityCheckerImpl).provideCommunicationManager();
        this.communicationManager = communicationManagerProvideCommunicationManager;
        EventFlowGovernor eventFlowGovernor = new EventFlowGovernor(null, CoroutineScope, 1, 0 == true ? 1 : 0);
        this.eventFlowGovernor = eventFlowGovernor;
        SessionInformationProvider sessionInformationProviderLocateSessionInformationProvider = secondGenServiceLocator.locateSessionInformationProvider();
        this.sessionInformationProvider = sessionInformationProviderLocateSessionInformationProvider;
        EventThrottler eventThrottler = new EventThrottler(timeProvider, oneAgentConfiguration.getEventThrottlingLimit(), 60, 60, CoroutineScope, new EventThrottler.SummaryReceiver() { // from class: com.dynatrace.agent.di.CoreComponent$eventThrottler$1
            @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
            public void onDroppedEventSummary(String summary) {
                Intrinsics.checkNotNullParameter(summary, "summary");
                secondGenServiceLocator.locateSelfMonitoring().reportLogEvent("EventThrottlingGrail", summary);
            }

            @Override // com.dynatrace.agent.events.EventThrottler.SummaryReceiver
            public void onInvalidEventSummary(String str) {
                EventThrottler.SummaryReceiver.DefaultImpls.onInvalidEventSummary(this, str);
            }
        });
        this.eventThrottler = eventThrottler;
        MetricsModule metricsModule = new MetricsModule(application2, secondGenServiceLocator, storageModule.provideMetricsDataSource$com_dynatrace_agent_release(), CoroutineScope);
        this.metricsModule = metricsModule;
        MetricsRepository metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release = metricsModule.provideMetricsRepository$com_dynatrace_agent_release();
        this.metricsRepository = metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release;
        ViewSummarizer viewSummarizer = new ViewSummarizer();
        this.viewSummarizer = viewSummarizer;
        OneAgentEventDispatcher oneAgentEventDispatcher = new OneAgentEventDispatcher(oneAgentConfiguration, timeProvider, eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release, CoroutineScope, viewSummarizer, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, dynamicConfigDataSourceProvideDynamicConfigurationDataSource$com_dynatrace_agent_release, eventThrottler, eventFlowGovernor, sessionInformationProviderLocateSessionInformationProvider);
        this.rumEventDispatcher = oneAgentEventDispatcher;
        ViewContextManager viewContextManager = new ViewContextManager(eventFlowGovernor, timeProvider, viewSummarizer, oneAgentEventDispatcher);
        this.viewContextManager = viewContextManager;
        this.oneAgentFacade = new OneAgentFacade(sessionInformationProviderLocateSessionInformationProvider, viewContextManager, oneAgentEventDispatcher);
        CurrentViewTracker currentViewTracker = new CurrentViewTracker(sessionInformationProviderLocateSessionInformationProvider, viewContextManager, application, oneAgentConfiguration);
        this.viewTracker = currentViewTracker;
        OneAgentStartupEventDispatcher oneAgentStartupEventDispatcher = new OneAgentStartupEventDispatcher(10000L, oneAgentConfiguration, CoroutineScope, oneAgentEventDispatcher, secondGenServiceLocator.locateSelfMonitoring());
        this.oneAgentStartupEventDispatcher = oneAgentStartupEventDispatcher;
        ExitReasonModule exitReasonModule = new ExitReasonModule(application2, timeProvider, 0L, oneAgentEventDispatcher, sessionInformationProviderLocateSessionInformationProvider, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release, storageModule.provideExitReasonDataSource$com_dynatrace_agent_release(), oneAgentConfiguration.getNativeCrashReporting(), oneAgentConfiguration.getAnrReporting(), 4, null);
        this.exitReasonModule = exitReasonModule;
        ExitReasonProcessor exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release = exitReasonModule.provideExitReasonProcessor$com_dynatrace_agent_release();
        this.exitReasonProcessor = exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release;
        this.oneAgentStartup = new OneAgentStartupImpl(communicationManagerProvideCommunicationManager, exitReasonProcessorProvideExitReasonProcessor$com_dynatrace_agent_release, eventDatabaseDataSourceProvideEventDatabaseDataSource$com_dynatrace_agent_release, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release, endPointInfoDataSourceProvideStartupConfigurationDataSource$com_dynatrace_agent_release, endPointInfo, CoroutineScope, configurationPublisher, metricsRepositoryProvideMetricsRepository$com_dynatrace_agent_release);
        this.communicationManagerBridge = new CommunicationManagerBridgeImpl(communicationManagerProvideCommunicationManager);
        OneAgentLifecycleManager oneAgentLifecycleManagerProvideLifecycleManager = new LifecycleModule(timeProvider, application, oneAgentEventDispatcher, oneAgentStartupEventDispatcher, sessionInformationProviderLocateSessionInformationProvider).provideLifecycleManager();
        this.lifecycleManager = oneAgentLifecycleManagerProvideLifecycleManager;
        this.oneAgentLifecycleManagerBridge = new OneAgentLifecycleManagerBridgeImpl(oneAgentLifecycleManagerProvideLifecycleManager);
        OneAgentUserInteractionManager oneAgentUserInteractionManagerProvideUserInteractionManager = new UserInteractionModule(CoroutineScope, timeProvider, oneAgentEventDispatcher, sessionInformationProviderLocateSessionInformationProvider, serverConfigurationDataSourceProvideServerConfigurationDataSource$com_dynatrace_agent_release).provideUserInteractionManager();
        this.userInteractionManager = oneAgentUserInteractionManagerProvideUserInteractionManager;
        this.oneAgentUserInteractionManagerBridge = new OneAgentUserInteractionManagerBridgeImpl(oneAgentUserInteractionManagerProvideUserInteractionManager);
        currentViewTracker.setUp();
    }

    /* synthetic */ CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, timeProvider, serverConfigurationListener, (i2 + 8) - (i2 | 8) != 0 ? null : factory, application, secondGenServiceLocator, configurationPublisher);
    }

    public /* synthetic */ CoreComponent(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, ServerConfigurationListener serverConfigurationListener, Call.Factory factory, Application application, SecondGenServiceLocator secondGenServiceLocator, ConfigurationPublisher configurationPublisher, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, timeProvider, serverConfigurationListener, factory, application, secondGenServiceLocator, configurationPublisher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tearDown() {
        this.viewTracker.tearDown();
        this.communicationManager.stopCommunication();
        this.storageModule.tearDown();
        CoroutineScopeKt.cancel$default(this.coreCoroutineScope, null, 1, null);
    }

    public final CommunicationManagerBridge getCommunicationManagerBridge() {
        return this.communicationManagerBridge;
    }

    public final MetricsModule getMetricsModule() {
        return this.metricsModule;
    }

    public final MetricsRepository getMetricsRepository() {
        return this.metricsRepository;
    }

    public final OneAgentFacade getOneAgentFacade() {
        return this.oneAgentFacade;
    }

    public final OneAgentLifecycleManagerBridge getOneAgentLifecycleManagerBridge() {
        return this.oneAgentLifecycleManagerBridge;
    }

    public final OneAgentStartup getOneAgentStartup() {
        return this.oneAgentStartup;
    }

    public final OneAgentStartupEventDispatcher getOneAgentStartupEventDispatcher() {
        return this.oneAgentStartupEventDispatcher;
    }

    public final OneAgentUserInteractionManagerBridge getOneAgentUserInteractionManagerBridge() {
        return this.oneAgentUserInteractionManagerBridge;
    }

    public final OneAgentEventDispatcher getRumEventDispatcher() {
        return this.rumEventDispatcher;
    }
}
