package com.dynatrace.agent;

import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.AttributeAggregator;
import com.dynatrace.agent.events.enrichment.AttributeSupplier;
import com.dynatrace.agent.events.enrichment.AttributeSupplierKt;
import com.dynatrace.agent.events.enrichment.EnrichmentPipelineKt;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.events.enrichment.ProtectedAttributesSupplier;
import com.dynatrace.agent.events.enrichment.SessionInformationSupplier;
import com.dynatrace.agent.events.enrichment.TimeMetrics;
import com.dynatrace.agent.events.enrichment.TimeMetricsSupplier;
import com.dynatrace.agent.events.enrichment.TimeMetricsSupplierKt;
import com.dynatrace.agent.events.enrichment.ViewContextSupplier;
import com.dynatrace.agent.events.enrichment.sanitation.EventSizeSanitizerKt;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationContext;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationStrategiesKt;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.agent.view.ViewContext;
import com.dynatrace.agent.view.ViewSummarizer;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONException;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŏ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;Mu>A`\u000b6\r H\"@y\u000b\u0002\"*V\u0019~zIL\u0014\u0012>@xíZ\rc\u0005\"Ň\u000e>6\u0001&\\mN>HzlB/1ɅqBT*g0\u000bT\u0015FZ)\u0015vw\u001e3@=5\u001d%i\u0003\u000fRq?\u000b?\b=\rؒ/'AI{W<_\b\u0014#IW\rsr.\\\u000bQh\f=+WcQP\u0016(\u000ez\u0004ȞD\u0004$\u0006/Ξ4Ʀ0Ǒ8\u000eas33PT\u0010^Z\u007f)bF\u001b3\u0002K+g\u001evUo?1Ne\u0001\u0015\u0011,)\u0019nObd\u0014f\u0015)\\\u0010Q_ZPAVX\"Ykx\u0014tp\u000eB\u0004^T\u00103\n\u001fF\u0017SFk=11\u0004\u0002vUwz\u0013r\u0001S\u0018eXD0\u0003.7X\u001eɔ^Fj\u001byg\u001df:.e\u001c\u0003%.\f!?twj;k$\u0017]v\n\u0003M\f(U3tVqn\u001a(\u001eM'ICr{\u0010\u0010t'\u0018M_z\u0005\u0007\u000brW\u001a\u007ft(PX\u000f~X%\nkf\fATou*WD1G\u0001EL\u0011CZA+/\u0010hv8\u0017^C(\u0013k:s7+f[\u001f\u0019.\rͅ0|nMuv_\\1&\u0004D\u00198\u000bF\u001f~\"$wkZsdlD\u001a\u0006\u007f.;29\u007fUm!\u001d'A<\u00121UN\td\u007fw(&)&@#³l.u536:\u000f\u0003J}vG&\u0005\u0002\u000b#6\t0}ou\u0013G\u0012\u0005;_Lz\u000b\u0003\bl~<\u000b*7\u001eS' &\u000bgECU;F\u0006\"W-kmm\u007f0\u0010a=P\u000bd2U**̔fQke\u0004eW\b\u0017>PF\u001d\u0007Pk\u0003w6f98\u001bX`A\u0013\u0017\u0007F[3G\bv\u000b<\u000f\u0007U\nd)n,]tsͫwC\f?'i3?eS\u0016\u0010\u001eOj.b\u000f8/,5|A4=N\u0007\bf\u0017U\u001esF\\q?p9T\tRirPPvQ\u000b\u0002\u0006>\u001d0Jm2/2p\u0018kZ\u001cy\u0011\\\u0005n5nS\t94\u0011\u0003\u001f54wc[\u001blt}_x@8k.\u0019\u001dzO-\u000b5-TTgTV\u0011܁\u000fEc}y#<\u0004Ud\u0006\u0007\u007f\u001dH'+AÐ\u001c%?\u000e!e|mn\r[jt#\u0007\u0014vR|DW7A|ɽ@\n\u001dJae\u00010z-zp(;Q[\u0019\u0017rMMњ;ސJ\u001d3HCp\u0006*xT?{\u0006uk\u0002\u0016C8'2\u0019Q`eR~\n\fKj \u007f[z\b\u0019\u0015` 2ux;#\u0014<PNU\u00125\u0012\u0013\r!\u001a>QN5S\u0005\u0010ROxz b\u001b\u000e\u0005T9,\u0017C\\y|vh)\u0019/]4#Zj:?\u001bN\u001f?JZݾd̢:\bptX]q5\tk})=/=:Ba_\u007f\u0019\u001eN+\bu\u001c*\u0003)k͊X؉Bd\u0011Ϟ=Ne\u0010vjVgK׆+ِ\u0001~P՝a\u001fBJ\u000b\u001e\u00134\u000eآ!˝\u0011GhԂTQW,91\u0001FqΣ4цs(~֫SFp|\u0018*p\u0012Iψiǋ1F\\شj3g.\u0006d11\"Ԛ:ܥ\f,\u0019Àa;hD8>\u000b'rԠSߥE\u0019\u0019۴eD\u0014}\u001f\u0019cy(Ɲ'ݜ\u0005|\t\u008d\u0010\u0006?{Rse\u0004yˇ\u0011Θ\u001fWnծuAs^?\f0x!ӰO\u07b2Z\u000fiβ\u001aAS2\u0012Un\u0015`٭&ڱ\nu+Ǉ\u0016IVBwbPX\u0004W2@XOEސ%ؼp~{ԁDk\u001e\u000frwɎ8\u0012"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0005FY\u0007/\u0016q$9IR9n4+j", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "=mT\u000eZ,Gbv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "3uT;g\u000b:b\u0015{vl,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", ";dc?\\*L@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "DhTDF<F[\u0015\f~s,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z\u001aCMP\u0011", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "2x].`0<1#\b{b.[\u0005>am2\fM~\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@-5a\b-K7tBV?Co2{\u001fqb=\tB(]r\u0015Q\\[*\\(", "3uT;g\u001bA`#\u000e\ne,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;x\n", "3uT;g\rE]+`\u0005o,\n\u00129r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u0001>w(\u0010WT;x=(\">", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0001 GK\u0010<\u007f4\u0013c\u0007!;o&;IR?u=s{fkAPb@Wr6THL,&Nt=\u001d!$\fX3\u0015\u000fb\u000b3rL7hv0Q\u0002&u\u000b\u001d\u001a\r5wF)T\u001aOC\u0014\nJ%wSU]y\u0011=Gb3sUm,fG6&\u0014;\u0018\u001820?\n\u0005bonaudcU\u0019Y43:[eVRmU\u0012[%)SEv&;T\u00048p+\u0004}&8d\u000eZ1 >m\u0006\u0019*j\u000b\u000f&EI\u0017=YPuwH\u001cl.k\u0015\"8\u001c7#tlgQ\"P[!h?qn\u0005@R\u0014\b'y\"1V\u000eFdy\u0003\u0007\u0011/m;0A%\\J\u0019\u0005M\u001en\u001e~\u0001fa\u00180\u0016FhXy._I\u0017\u0004\rhJy\faK\u0011}L%mXHBUy,\u007fw%R\u001dBX8tR\rk\u0012\u0016=\u0010T\r,}v>{6\\02=Z8o`8\tg\u001d\u0010\u0019tI\u001c,\u000b;\u000bSDpn\u0005#$\u0002\u0018q[\u0011l:&\fCNGjw#aU\r\u0006Yf\u0019(\\\"+^t_>]s>Y8\u001c\u000f\u000e8t\u0015\u001cu.uO)t/xE \u0015\u0006w!-x\u000baO\u001aOqjWD\b\bk<\u0003\u0010w-f\u001fTJ(WCJW\u0004\u001b1\bGP\b2aFCcKz*0O[e\u0019P\u0010.4\u001eh \t\u0007sN<78 \u0016| >*W7$E\u001c\u0018\u0001\u001fAwk\fc.\n\u0012,\u001f\u000bG8R <=iV$;\t\u000esXgz\u007f+Ia\u000fQ\b#~o|-\u0002vsnrRM\f-9:\n\u0010;Vg.M5\u000bxf7\u000e-\u0005UP!yEv'&4~\u001eOx\u0006'T9M2", ";nS6Y0>`'", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>hd$@s\u0016-9S;{4s", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\bAl\u001a/QCHA", "5dc\u001ab+BT\u001d~\bljz\u00137_~<\u0005<\u0010$\u0013Eo\b8x%>hw-7t\u0016*[C", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%y\u0017:\u00072BY\u0007/\u001eq\u001f4MB'{4.\u0015>", "/cS\u0012i,Gb\u0001\tyb-\u0001\t<", "", "3uT;g\u0014HR\u001d\u007f~^9", "@d\\<i,\u001ed\u0019\b\nF6{\r0i\u007f5", "2hb=T;<V\u0007~\tl0\u0007\u0012\u001ar\n3{M\u0010\u001b\u0017Ua\u0012Ky\u00125g\r-;k%2WLI", "", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0010{O\u000e\u001b\u0015U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u00135g\f$Avy7NMHs0-\u0019rj!\u0007r9Rt5\u001d", "2hb=T;<Vx\u0010zg;n\r>hl(\nO\u000e\u001b\u0015Vs\u0018E\u0005", "3uT;g\nH\\(~\u000em", "", "", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW;\u000b.1h\u000b\u001c5m_*OCDz}&\u0015wn=\u0005qu<v5UPX5@[sG!\u001aV\u001dR5\u0016lYP1rBEt}\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj92", "/fT;g\u0011L]\"", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\n\u0005\u0013ri\u0003\u0006w5J\u00064CJNuXTrF#[b\u000e]8\u0011\u0003g\u000b\u0012nRE#\u00125-\u000b<r\u000e\u0014\u0012\u001d9ty*V\u001fT}\u0013\u0004\u0017\u001fOKUpu\u0011HAk,.u\\\"\\8IyWb", "2hb=T;<Vx\u0010zg;", "AsP?g\u001bB[\u0019\r\nZ4\b", "", "2ta.g0H\\", "7r0=\\\u0019>^#\f\n^+", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV{{.m\u0018D@$Iby/Di\u0014.\u0017?=k=-^paH\u0014g*\\@\u0015GZ\\0f[VF\u0015\u001cg\u0016J:\u0011\u000fb)$}Q;\u001d\u0016\u0002>w\"m|\u001d\u0012W<fyD yD~\u0015sP~,7", ";dc?\\*L2\u0015\u000ev", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "2hb=T;<Vx\u0010zg;n\r>hm7\t<\u0010\u0017\u0019[", "A`]6g0SS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u001aJ\u007f+VH]0f[PG\u001d!Z!]\u0001", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "CoS.g,,O\"\u0003\nbA|\b\u0014s\n1", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "A`]6g0SS\u0018c\th5", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW;\u000b.1h\u000b\u001c5m_*OCDz}&\u0015wn=\u0005qu<v5UPX5@[sG!\u001aV\u001dR5\u0016lYP1rBEt}\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005\u001ffYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}xYw\u001b", "2hb=T;<V|\b\n^9\u0006\u00056E\u0011(\u0005O", "Dda6Y0>R}\r\u0005g\u0016y\u000e/c\u000f", "2hb=T;<V|\b\n^9\u0006\u00056E\u0011(\u0005O?\u0015!Oi\rP\u007f!Dfy\u001e7g\u00120MLJeA\u001e\u001ch]G\u0007", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>'$ljI\u0003r0X\u007f|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "@dR<e+-W!~\tm(\u0005\u0014", "=uT?e0=O\u0016\u0006z:;\f\u00163b\u00107{N", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9ts7Y}+GY$", ">q^AX*MS\u0018Z\nm9\u0001\u0006?t\u007f6", "1n[9X*M0\u0015\r~\\\u0014|\u0018<i}6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV{}Lk\u001f8@5D]\u0005i\u001eq$=#*@gE\u001a^xp=\u000e-\u0013R\u00056\u001dB51Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D+=)\u00173M\u000b\u0005m\u0012\u0014_\u000fEsnQZ\u001aP\b^VQ2fU]i\u0003\u0012\u0017,h4s\u0013c&&8D1\u001e\u0002(\u001fqP<SY]\u001a\u0002V\u0003wcV\u001d\u0005Ay\u0002T`BVk\u001fCp0!\u0015et\u00172V\u0004\u0001", "As^?X\fOS\"\u000e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "3uT;g\u0019>Q#\fy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentEventDispatcher implements RumEventDispatcher {
    private final CoroutineScope coroutineScope;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final EventDatabaseDataSource eventDatabase;
    private final EventFlowGovernor eventFlowGovernor;
    private final EventThrottler eventThrottler;
    private final MetricsRepository metricsRepository;
    private final ConcurrentLinkedQueue<EventModifier> modifiers;
    private final OneAgentConfiguration oneAgentConfiguration;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private final ViewSummarizer viewSummarizer;

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $completedJsonObject;
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ long $startTimestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JSONObject jSONObject, long j2, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$completedJsonObject = jSONObject;
            this.$startTimestamp = j2;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return OneAgentEventDispatcher.this.new AnonymousClass1(this.$completedJsonObject, this.$startTimestamp, this.$sessionInformationMetrics, this.$eventContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(OneAgentEventDispatcher.this, this.$completedJsonObject, this.$startTimestamp, CollectionsKt.emptyList(), CollectionsKt.listOf(new SessionInformationSupplier(this.$sessionInformationMetrics)), this.$eventContext, null, this, 32, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ JSONObject $jsonObject;
        final /* synthetic */ Object $recordTimestamp;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JSONObject jSONObject, Object obj, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$jsonObject = jSONObject;
            this.$recordTimestamp = obj;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return OneAgentEventDispatcher.this.new AnonymousClass2(this.$jsonObject, this.$recordTimestamp, this.$sessionInformationMetrics, this.$eventContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject jSONObject = this.$jsonObject;
                Object obj2 = this.$recordTimestamp;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Number");
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(oneAgentEventDispatcher, jSONObject, ((Number) obj2).longValue(), CollectionsKt.emptyList(), CollectionsKt.listOf(new SessionInformationSupplier(this.$sessionInformationMetrics)), this.$eventContext, null, this, 32, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $completedJsonObject;
        final /* synthetic */ MetricsData $metricsData;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ long $startTimestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(JSONObject jSONObject, long j2, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$completedJsonObject = jSONObject;
            this.$startTimestamp = j2;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$metricsData = metricsData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return OneAgentEventDispatcher.this.new AnonymousClass3(this.$completedJsonObject, this.$startTimestamp, this.$sessionInformationMetrics, this.$metricsData, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject jSONObject = this.$completedJsonObject;
                long j2 = this.$startTimestamp;
                List listEmptyList = CollectionsKt.emptyList();
                List listListOf = CollectionsKt.listOf(new SessionInformationSupplier(this.$sessionInformationMetrics));
                final MetricsData metricsData = this.$metricsData;
                this.label = 1;
                if (oneAgentEventDispatcher.dispatchInternalEvent(jSONObject, j2, listEmptyList, listListOf, null, new Function0() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrichmentPipelineKt.collectStoredMetricsSuppliers(metricsData);
                    }
                }, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithRestrictions$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C11101 extends FunctionReferenceImpl implements Function1<JSONObject, SanitationContext> {
        public static final C11101 INSTANCE = new C11101();

        C11101() {
            super(1, SanitationStrategiesKt.class, "sanitizeRumEvent", "sanitizeRumEvent(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return SanitationStrategiesKt.sanitizeRumEvent(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithRestrictions$3 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C11113 extends FunctionReferenceImpl implements Function1<JSONObject, SanitationContext> {
        public static final C11113 INSTANCE = new C11113();

        C11113() {
            super(1, SanitationStrategiesKt.class, "sanitizeRumEvent", "sanitizeRumEvent(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return SanitationStrategiesKt.sanitizeRumEvent(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithStrategy$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\b\u000e"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11123 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ long $recordTimestamp;
        final /* synthetic */ SanitationContext $sanitationContext;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ TimeMetrics $timeMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11123(SanitationContext sanitationContext, long j2, TimeMetrics timeMetrics, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super C11123> continuation) {
            super(1, continuation);
            this.$sanitationContext = sanitationContext;
            this.$recordTimestamp = j2;
            this.$timeMetrics = timeMetrics;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        public static final List invokeSuspend$lambda$1() {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            AttributeSupplierKt.addAttribute(listCreateListBuilder, EventKeys.Characteristics.IS_API_REPORTED, true);
            return CollectionsKt.build(listCreateListBuilder);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return OneAgentEventDispatcher.this.new C11123(this.$sanitationContext, this.$recordTimestamp, this.$timeMetrics, this.$sessionInformationMetrics, this.$eventContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C11123) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject sanitizedJson = this.$sanitationContext.getSanitizedJson();
                long j2 = this.$recordTimestamp;
                AttributeSupplier[] attributeSupplierArr = {new TimeMetricsSupplier(this.$timeMetrics), new AttributeSupplier() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithStrategy$3$$ExternalSyntheticLambda0
                    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
                    public final List supply() {
                        return OneAgentEventDispatcher.C11123.invokeSuspend$lambda$1();
                    }
                }};
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(oneAgentEventDispatcher, sanitizedJson, j2, CollectionsKt.listOf((Object[]) attributeSupplierArr), CollectionsKt.listOf(new SessionInformationSupplier(this.$sessionInformationMetrics)), this.$eventContext, null, this, 32, null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchSessionPropertiesWithRestrictions$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C11131 extends FunctionReferenceImpl implements Function1<JSONObject, SanitationContext> {
        public static final C11131 INSTANCE = new C11131();

        C11131() {
            super(1, SanitationStrategiesKt.class, "sanitizeSessionProperties", "sanitizeSessionProperties(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return SanitationStrategiesKt.sanitizeSessionProperties(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$storeEvent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EventRecord $eventRecord;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11141(EventRecord eventRecord, Continuation<? super C11141> continuation) {
            super(2, continuation);
            this.$eventRecord = eventRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OneAgentEventDispatcher.this.new C11141(this.$eventRecord, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                EventDatabaseDataSource eventDatabaseDataSource = OneAgentEventDispatcher.this.eventDatabase;
                EventRecord eventRecord = this.$eventRecord;
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "storing event: " + eventRecord);
                this.label = 1;
                if (eventDatabaseDataSource.put(eventRecord, this) == coroutine_suspended) {
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

    public OneAgentEventDispatcher(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, EventDatabaseDataSource eventDatabase, MetricsRepository metricsRepository, CoroutineScope coroutineScope, ViewSummarizer viewSummarizer, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, EventThrottler eventThrottler, EventFlowGovernor eventFlowGovernor, SessionInformationProvider sessionInformationProvider) {
        Intrinsics.checkNotNullParameter(oneAgentConfiguration, "oneAgentConfiguration");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
        Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewSummarizer, "viewSummarizer");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.checkNotNullParameter(dynamicConfigDataSource, "dynamicConfigDataSource");
        Intrinsics.checkNotNullParameter(eventThrottler, "eventThrottler");
        Intrinsics.checkNotNullParameter(eventFlowGovernor, "eventFlowGovernor");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        this.oneAgentConfiguration = oneAgentConfiguration;
        this.timeProvider = timeProvider;
        this.eventDatabase = eventDatabase;
        this.metricsRepository = metricsRepository;
        this.coroutineScope = coroutineScope;
        this.viewSummarizer = viewSummarizer;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
        this.eventThrottler = eventThrottler;
        this.eventFlowGovernor = eventFlowGovernor;
        this.sessionInformationProvider = sessionInformationProvider;
        this.modifiers = new ConcurrentLinkedQueue<>();
    }

    public /* synthetic */ OneAgentEventDispatcher(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, EventDatabaseDataSource eventDatabaseDataSource, MetricsRepository metricsRepository, CoroutineScope coroutineScope, ViewSummarizer viewSummarizer, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, EventThrottler eventThrottler, EventFlowGovernor eventFlowGovernor, SessionInformationProvider sessionInformationProvider, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, timeProvider, eventDatabaseDataSource, metricsRepository, (i2 + 16) - (i2 | 16) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope, viewSummarizer, serverConfigurationDataSource, dynamicConfigDataSource, eventThrottler, eventFlowGovernor, sessionInformationProvider);
    }

    public static final Unit dispatchEventWithRestrictions$lambda$1(JSONObject sanitizedJson) throws JSONException {
        Intrinsics.checkNotNullParameter(sanitizedJson, "sanitizedJson");
        if (JsonObjectExtensionsKt.hasKeyIn(sanitizedJson, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
            sanitizedJson.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit dispatchEventWithRestrictions$lambda$2(JSONObject jSONObject, JSONObject sanitizedJson) throws JSONException {
        Intrinsics.checkNotNullParameter(sanitizedJson, "sanitizedJson");
        if (JsonObjectExtensionsKt.hasKeyIn(sanitizedJson, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
            sanitizedJson.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        }
        JsonObjectExtensionsKt.putAllAttributesOf(sanitizedJson, jSONObject);
        return Unit.INSTANCE;
    }

    private final void dispatchEventWithStrategy(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Function1<? super JSONObject, SanitationContext> function1, Function1<? super JSONObject, Unit> function12) throws JSONException {
        TimeMetrics timeMetrics = new TimeMetrics(this.timeProvider.millisSinceEpoch(), Duration.Companion.m10409getZEROUwyO8pc(), null);
        SanitationContext sanitationContextInvoke = function1.invoke(jSONObject);
        function12.invoke(sanitationContextInvoke.getSanitizedJson());
        if (TimeMetricsSupplierKt.hasInvalidNumberType(sanitationContextInvoke.getSanitizedJson(), "duration")) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped because 'duration' has invalid type");
            return;
        }
        TimeMetricsSupplierKt.setNegativeValueToDefault(sanitationContextInvoke.getSanitizedJson(), "duration");
        long startTime = timeMetrics.getStartTime();
        JSONObject sanitizedJson = sanitationContextInvoke.getSanitizedJson();
        if (sanitizedJson.has("duration")) {
            sanitizedJson.put(EventKeys.START_TIME, startTime - sanitizedJson.getLong("duration"));
        }
        if (TimeMetricsSupplierKt.hasInvalidNumberWithRange(sanitationContextInvoke.getSanitizedJson(), EventKeys.START_TIME)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped because 'start_time' has invalid type or value");
        } else {
            this.eventFlowGovernor.enqueue(new C11123(sanitationContextInvoke, startTime, timeMetrics, sessionInformationMetrics, objArr, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void dispatchEventWithStrategy$default(OneAgentEventDispatcher oneAgentEventDispatcher, JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Function1 function1, Function1 function12, int i2, Object obj) throws JSONException {
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            function12 = new Function1() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OneAgentEventDispatcher.dispatchEventWithStrategy$lambda$5((JSONObject) obj2);
                }
            };
        }
        oneAgentEventDispatcher.dispatchEventWithStrategy(jSONObject, sessionInformationMetrics, objArr, function1, function12);
    }

    public static final Unit dispatchEventWithStrategy$lambda$5(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Object dispatchInternalEvent(JSONObject jSONObject, final long j2, List<? extends AttributeSupplier> list, List<? extends AttributeSupplier> list2, Object[] objArr, Function0<? extends List<? extends AttributeSupplier>> function0, Continuation<? super Unit> continuation) throws JSONException {
        ServerConfigurationV4 serverConfiguration = this.serverConfigurationDataSource.getServerConfiguration();
        AgentState agentState = this.dynamicConfigDataSource.getAgentState();
        if (serverConfiguration.getCapture() && (agentState instanceof AgentState.Enabled) && !((AgentState.Enabled) agentState).getOnlyHighPriorityEvents()) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.addAll(function0.invoke());
            listCreateListBuilder.addAll(list);
            ViewContext viewContextObtainViewContext = this.viewSummarizer.obtainViewContext();
            if (viewContextObtainViewContext != null) {
                listCreateListBuilder.add(new ViewContextSupplier(viewContextObtainViewContext));
            }
            AttributeAggregator attributeAggregator = new AttributeAggregator(CollectionsKt.build(listCreateListBuilder));
            List listCreateListBuilder2 = CollectionsKt.createListBuilder();
            listCreateListBuilder2.add(new ProtectedAttributesSupplier(this.oneAgentConfiguration.getApplicationId(), this.oneAgentConfiguration.getVersion()));
            listCreateListBuilder2.addAll(list2);
            JSONObject jSONObjectEnrichRumEvent = EnrichmentPipelineKt.enrichRumEvent(jSONObject, attributeAggregator, new AttributeAggregator(CollectionsKt.build(listCreateListBuilder2)), this.modifiers, objArr);
            if (jSONObjectEnrichRumEvent == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event has been dropped during enrichment");
                return Unit.INSTANCE;
            }
            this.viewSummarizer.incorporateEvent(jSONObjectEnrichRumEvent);
            if (!this.eventThrottler.acceptEvent(jSONObjectEnrichRumEvent)) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped by throttling");
                return Unit.INSTANCE;
            }
            EventSizeSanitizerKt.performSizeSanitation(jSONObjectEnrichRumEvent, serverConfiguration, new Function2() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OneAgentEventDispatcher.dispatchInternalEvent$lambda$11(this.f$0, j2, ((Integer) obj).intValue(), (String) obj2);
                }
            });
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event not dispatched because capture is off: " + serverConfiguration);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object dispatchInternalEvent$default(final OneAgentEventDispatcher oneAgentEventDispatcher, JSONObject jSONObject, long j2, List list, List list2, Object[] objArr, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            function0 = new Function0() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OneAgentEventDispatcher.dispatchInternalEvent$lambda$7(this.f$0);
                }
            };
        }
        return oneAgentEventDispatcher.dispatchInternalEvent(jSONObject, j2, list, list2, objArr, function0, continuation);
    }

    public static final Unit dispatchInternalEvent$lambda$11(OneAgentEventDispatcher oneAgentEventDispatcher, long j2, int i2, String sanitizedJsonString) {
        Intrinsics.checkNotNullParameter(sanitizedJsonString, "sanitizedJsonString");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is accepted with size " + i2 + " bytes");
        oneAgentEventDispatcher.storeEvent(new EventRecord(0L, sanitizedJsonString, j2, false, i2, 1, null));
        return Unit.INSTANCE;
    }

    public static final List dispatchInternalEvent$lambda$7(OneAgentEventDispatcher oneAgentEventDispatcher) {
        return EnrichmentPipelineKt.collectCachedMetricsSuppliers(oneAgentEventDispatcher.metricsRepository.getCachedMetrics());
    }

    public static final Unit dispatchSessionPropertiesWithRestrictions$lambda$0(JSONObject sanitizedJson) throws JSONException {
        Intrinsics.checkNotNullParameter(sanitizedJson, "sanitizedJson");
        sanitizedJson.put(EventKeys.Characteristics.HAS_SESSION_PROPERTIES, true);
        return Unit.INSTANCE;
    }

    private final Job storeEvent(EventRecord eventRecord) {
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C11141(eventRecord, null), 3, null);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public boolean addEventModifier(EventModifier eventModifier) {
        Intrinsics.checkNotNullParameter(eventModifier, "eventModifier");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "add event modifier: " + eventModifier);
        return this.modifiers.add(eventModifier);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, long j2, long j3, SessionInformationMetrics sessionInformationMetrics, boolean z2, Object[] objArr) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        jsonObject.put(EventKeys.START_TIME, j2);
        jsonObject.put("duration", j3);
        if (z2) {
            jsonObject.put(EventKeys.Characteristics.IS_API_REPORTED, true);
        } else {
            jsonObject.remove(EventKeys.Characteristics.IS_API_REPORTED);
        }
        this.eventFlowGovernor.enqueue(new AnonymousClass1(jsonObject, j2, sessionInformationMetrics, objArr, null));
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, long j2, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        Intrinsics.checkNotNullParameter(metricsData, "metricsData");
        jsonObject.put(EventKeys.START_TIME, j2);
        jsonObject.put("duration", 0);
        jsonObject.remove(EventKeys.Characteristics.IS_API_REPORTED);
        this.eventFlowGovernor.enqueue(new AnonymousClass3(jsonObject, j2, sessionInformationMetrics, metricsData, null));
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        Object objOpt = jsonObject.opt(EventKeys.START_TIME);
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "The given JSON event must have a valid start_time! json: " + jsonObject);
        } else if ((objOpt2 instanceof Long) || (objOpt2 instanceof Integer)) {
            this.eventFlowGovernor.enqueue(new AnonymousClass2(jsonObject, objOpt, sessionInformationMetrics, objArr, null));
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "The given JSON event must have a valid duration! json: " + jsonObject);
        }
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEventWithRestrictions(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, objArr, C11101.INSTANCE, new Function1() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneAgentEventDispatcher.dispatchEventWithRestrictions$lambda$1((JSONObject) obj);
            }
        });
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEventWithRestrictions(JSONObject jsonObject, final JSONObject agentJson, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(agentJson, "agentJson");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, objArr, C11113.INSTANCE, new Function1() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneAgentEventDispatcher.dispatchEventWithRestrictions$lambda$2(agentJson, (JSONObject) obj);
            }
        });
    }

    public final Object dispatchInternalEvent$com_dynatrace_agent_release(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        Object objDispatchInternalEvent$default = dispatchInternalEvent$default(this, jSONObject, jSONObject.getLong(EventKeys.START_TIME), CollectionsKt.emptyList(), CollectionsKt.listOf(new SessionInformationSupplier(this.sessionInformationProvider.collectSessionInfo())), null, null, continuation, 32, null);
        return objDispatchInternalEvent$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDispatchInternalEvent$default : Unit.INSTANCE;
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchSessionPropertiesWithRestrictions(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, null, C11131.INSTANCE, new Function1() { // from class: com.dynatrace.agent.OneAgentEventDispatcher$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneAgentEventDispatcher.dispatchSessionPropertiesWithRestrictions$lambda$0((JSONObject) obj);
            }
        });
    }

    public final ConcurrentLinkedQueue<EventModifier> getModifiers$com_dynatrace_agent_release() {
        return this.modifiers;
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public boolean removeEventModifier(EventModifier eventModifier) {
        Intrinsics.checkNotNullParameter(eventModifier, "eventModifier");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "remove event modifier: " + eventModifier);
        return this.modifiers.remove(eventModifier);
    }
}
