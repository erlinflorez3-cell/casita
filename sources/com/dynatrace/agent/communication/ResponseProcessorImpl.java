package com.dynatrace.agent.communication;

import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationState;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
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
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rgr9>Km߉6Ri*\u0017k\u00025,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001exp-QU\u000f]\u001a\u000f8Cw?Akw=O`|Ȃ\r @+@y\u000b\u0001\"*^\u0010~ٙKK\"\u00128@v<Z\rc\u0005\"\u0012\f>(\u00014\\oޮ>H\u0003]B/9\u0003qBT'g0\u0013M\u0015Fb܋\u0015vg#1¨MߎE%\u0002\u0002GgkC\u0011?\n=3i7+9K\fWd[ÿ\u0018\u00171S\u001bb;3j\ri`:0qcӍOR\u00142\u0006\u0006D1J\u0010&\u0006UU^1(t \u000ea\u0004#WN`\u001a^p\u0011+eD)=\u007fa>\u007fӬ%Ђe;'b\u007f\n\u0013\"6#/{Q_b$x\u0015Ik>Qy\fNU`N8fmq\u0012\nz\u0002X\u0013`K\u000e?\u0014\u0011\\(UAiS;'{\u0004XD\u0016\u00133{\u0019Wwd`@P\u0002F;8&$Zr\u0003K߯\u000fԜ\\,\u001fldz\u0015\u001e \u0013Ni(@/7(N}{\u001an[m\"%]wg]|\u0005&Wg\u007fc9_\u0006(a\u0001\u001aZ?\u0005\r\u0013|~B\u0002\u0019\u000b`68JH\u0019'(\u0006Rh$\u0019BA\u0002\u001cbH_4\r\u0019V 6Bo\u001bOݣ\u0019ӳ\u0014~bXl/wJ\r\t/]\rt}\u000f\u0011IZ%\u0011&;Qi5G7\u0006&vF\u0015#5\u0012$\u0004U\ndGz\u0010\\߲\u0014ދ$\u0016(b\u001a\u0007K='~W?21Ss\u000be\u007fxB+\t\r\u0012\u000fiy^k\u0016|\t,\u000f}z~bC:\"dq3\u0019t\u000f(xâ~Qi\u0003\u001baDx\u0003\u0005_Bth\r\r/$5\u0003\u007f\"+B[t7!&y*.C\u0014\f\u00176І8ˏ\u0013&\u0003\u0019LjqJ\bb\u007fjbA>Ig4V\"Ru3HNj\u0006>Z\tb0cLOt\tVf^;3\fx\u001f,;\u0004\u0007c@\u0013}\u0014L0u)\"ZDй\u001dǜ)\u0013S\u000bu&>Wj\u000bb\u000f8\fRυp݁ =(݈(n\u00172\u001esF9\u0018ݨdƀ@\t,҉|H\u0016\u0011[T\u0018\rfĂ\fʮc\u000f\u001fϨ§wt"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016<XMDy4\t\"r_9\u0015q6[Z/RS$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016<XMDy4\t\"r_9\u0015q6[L", "3uT;g\u000b:b\u0015{vl,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007fHm\u001f=,?Jg1\u001a#h@5\u0016_\u001aX\u00074EL$\u0013Z\\z\u0007\u0013&c\n]8\t\u0003Y\u000b pD@.Q*S\nCr\nU%\u0012=j:1Z\u0018Gd\"\u007fR-gFf5=8", ":`bA66GT\u001d\u0001\u000bk(\f\r9nl(y@\f&\u001bQx|@~%\u001dg", "", "/fT\u001cY\u0013:a(\\\u0005g-\u0001\u000b", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "/fT\u001cY\u0013:a(\\\u0005g-\u0001\u000bvU\u0012<e\u0013\f\u0015", "u(9", "6`]1_,\u001c]\"\u007f~`\u0019|\u0017:o\t6{", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "1n]3\\.+S'\n\u0005g:|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "B`a4X;\u001e\\\u0018\n\u0005b5\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "@dc?l\u0014:\\\u0015\u0001zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016=ZW#g=\u001a\u0017hn\u000f", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]\u0001s\u0003cImmX@\u001b\u00179E\u007f;2|\u000e\u0016\u0017D4~Q`\u001dC{\u0015?@&2&b^dQENq\u000em\rirC8D,]p-$d_;\u0006ySZnTypv\u0011\u0017\u0005@,Nv_DA~YF}p\fK\u000b\u0005&\u001aT}'v-\u0011\n\u0011<n\u0014Rk!\b\\\u0003\"6lP+/6J\\\u001dUl\u0005pG\u001ed.e\u0012\u00178x\u0018\u001eav_\u0012\u0016\u0003f\u0019%\u001f^d\u00015a[", "1n]AX?M4#\fkZ3\u0001\b\ro\t)\u007fBm\u0017#Wo\u001cKc%Cd\b)Em", "AdaCX9\u001dO(zji+x\u0018/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "6`]1_,\u001dO(zg^:\b\u00138s\u007f", "2`c.E,L^#\b\t^", "Ad]A7(MO", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", ";na27(MO\u0004~\u0004]0\u0006\u000b", "", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]\u0001s\u0003cImmX@\u001b\u00179E\u007f;2|\u000e\u0016\u0017D4~Q`\u001dC{\u0015?@&2&b^dQENq\u000em\rirC?65\u0010;)*lWwp\u007fa H9wqo\u0011\u0018\u000fA MzWDE9Q>t0.\u0015y\u0002\u001a:h}/r)\u001384?.qKv%RFt\u001e(^A4{+#\u0019IZjyu\b\fr,k\u0018\u001df>1'/CmQ\u001e\u000bf'WDei\n\r\u0016lCE\u0001\u0011pMzK]C~\u0006\f$kt\u001f", "=ac.\\5\u001c]\"\u000ezq;]\u0013<N\n\u0006\u0006I\n\u0017\u0015Vs\u001f@\u00069", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fU\u0004\u0002D5/\u00170S\u000b\u0011", "<dgAE,M`-l\nZ;|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "1n]AX?M4#\fkZ3\u0001\b\u000ea\u000f$h@\r'\u0017U~z<\u00050?b\f ", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r)kA/\u0015u@5\u0016_\u001cYu#VL$\u0013aN\u00049]\"i\u0012Uts\tgPyc+=)\u00173M\u000b\u0005f\u000b\u0019 \u001eDnyBdY%\u0004\u001e\u0005E2xBhc\u0004P\u0017\tI/`\u001d[fc6C&][\u0016 hN=_", "=ac.\\5\u001c]\"\u000ezq;]\u0013<E\r5\u0006M", "@db=b5LS", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0018\r\u0014fUy", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]iy\u0005hN8D+5)\u0010uH\u0016Dd\u0010\u0019\u0012\f54lDV\u0019VC#\u0005K6dHY)xD\u000b%k)O\u0016c&k\u001eC%\u001eG\u007f\u0019rXw\t\u0010\\\r\u0002_ueg\u0011\u0015|8-M7YPMweEx%\u001bZ\u007f\u0002\u001b{Et:\u0002Ak032f\u0005X=~<h\u0001^+pJ#5C8\u0011?\u0015_wlG\u001d2\u001dk\u0010\u0016r>5\u0017atgR\u0018P;!c=qh\u00055N\u0015BSx\u00036B\u000eB1`\u001b\u0013\u0016+qn\u0013A%a\u000b*\u007fH+_\u001fL`p!+2\u001fMU\u001el4h\r\u0011y\u000edI\bE`?\u001er\u0012yjPrYfE", "=ac.\\5\u001c]\"\u000ezq;]\u0013<S\u0010&y@\u000f%", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d\r\u0019\u001d\u0003WA2|\u001a", "=mE._0=1#\b{b.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AdaCX9\u001dO(z", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]iz\u0015W?$|R\r\u0006\u00066QK:|\n\b%\u001b1hp\fR\u0012G\u0003$?O8rSUay\u0011@B,\nm\u000bJ'`CI\b\u001dr#pON8\u0012ER%{N\ttcE\u0019D4&>vj\u0010Cy]D\u00050#Iw\u0007\u0016<a>\u0018t<\u0011H\u00122m\u0001Mg%\u0014E~\u001f;cE0o;M\u001b\tLs~jM\u0012r(oQnr>/(iol\u0015dmc!j<ehJ5\\\u0013HY~\u00190F\r\f9\u0004\u001e\u0018\u000b-}aXG%]V]WI\u001ep\rL\nb!\u001ew\u007f:^\u000ff95", "=ac.\\5\u001dW'zwe,{f9n\u000f(\u000fO", "2hb.U3>B\u001d\u0007z", "1n\\:F;:b\u0019", "=ac.\\5\u001dW'zwe,{f9n\u000f(\u000fOH\u0014,\u0018V_I\u0005", "uI;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\fWKC{=\"\u0013dp=\u0011l\u001a]r6G\"5*fZ<<(\u001bV\u001d['\u000b\u0005#=&nMFh\u0016;S\u000f7j\u0001U\u0015\u000b~JyAA\u001aK\u0003$YJ*r\u001c@]\u0004O\u000bDv3`\u001bl\u0019Z:\u0004 \u0016q\"*2N8\u0012\u0004c\u001avPuvkQ\"D%$Mzo.AxQ>t4t2y\u0002\u001a{W\t4p<\u00110(6.\u0001Mg!M(v\u001f4dQ0*48\"CUl?hI\u00122\ra\u0015\u001fbB\u0010\u0015taSS\u000e\u0003l\u00171\u001cgi\u0010>V\u000f\bGy\"1V\u000eFdy#Rd.vtML+P\u0010\u001ezMw#w\b~w\u0014e5\u0012F[XR'd7K\"^", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ResponseProcessorImpl implements ResponseProcessor {
    private final EventDatabaseDataSource eventDatabase;
    private long lastConfigurationReceptionTimeMs;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ResponseProcessorImpl.this.contextForValidDataRequestResponse(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$handleConfigResponse$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "AdaCX9\u001dO(zji+x\u0018/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ResponseProcessorImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((AnonymousClass2) create(serverDataUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ResponseProcessorImpl.this.contextForValidConfigRequestResponse((ServerDataUpdate) this.L$0);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$handleDataResponse$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "AdaCX9\u001dO(zji+x\u0018/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11202 extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {
        final /* synthetic */ boolean $moreDataPending;
        final /* synthetic */ List<EventRecord> $sentData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11202(List<EventRecord> list, boolean z2, Continuation<? super C11202> continuation) {
            super(2, continuation);
            this.$sentData = list;
            this.$moreDataPending = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11202 c11202 = ResponseProcessorImpl.this.new C11202(this.$sentData, this.$moreDataPending, continuation);
            c11202.L$0 = obj;
            return c11202;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((C11202) create(serverDataUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ServerDataUpdate serverDataUpdate = (ServerDataUpdate) this.L$0;
                this.label = 1;
                obj = ResponseProcessorImpl.this.contextForValidDataRequestResponse(serverDataUpdate, this.$sentData, this.$moreDataPending, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public ResponseProcessorImpl(EventDatabaseDataSource eventDatabase, TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.eventDatabase = eventDatabase;
        this.timeProvider = timeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommunicationContext contextForValidConfigRequestResponse(ServerDataUpdate serverDataUpdate) {
        if (!Intrinsics.areEqual(serverDataUpdate.getState(), AgentState.Disabled.INSTANCE)) {
            return new CommunicationContext(Duration.Companion.m10409getZEROUwyO8pc(), new CommunicationState.Waiting(null, 1, null), serverDataUpdate, null);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to AgentState in config response");
        return new CommunicationContext(RetryManagerKt.getDISABLE_AGENT_TIME(), CommunicationState.Inactive.INSTANCE, serverDataUpdate, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object contextForValidDataRequestResponse(com.dynatrace.agent.communication.api.ServerDataUpdate r10, java.util.List<com.dynatrace.agent.storage.db.EventRecord> r11, boolean r12, kotlin.coroutines.Continuation<? super com.dynatrace.agent.communication.CommunicationContext> r13) {
        /*
            r9 = this;
            r3 = r13
            r7 = r10
            r4 = r12
            boolean r0 = r3 instanceof com.dynatrace.agent.communication.ResponseProcessorImpl.AnonymousClass1
            if (r0 == 0) goto L90
            r5 = r3
            com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1 r5 = (com.dynatrace.agent.communication.ResponseProcessorImpl.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L90
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L1c:
            java.lang.Object r3 = r5.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L7e
            if (r0 != r2) goto L96
            boolean r4 = r5.Z$0
            java.lang.Object r7 = r5.L$0
            com.dynatrace.agent.communication.api.ServerDataUpdate r7 = (com.dynatrace.agent.communication.api.ServerDataUpdate) r7
            kotlin.ResultKt.throwOnFailure(r3)
        L32:
            com.dynatrace.agent.communication.api.AgentState r1 = r7.getState()
            com.dynatrace.agent.communication.api.AgentState$Disabled r0 = com.dynatrace.agent.communication.api.AgentState.Disabled.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L56
            java.lang.String r1 = "dtxCommunication"
            java.lang.String r0 = "response handling: disable agent due to AgentState in data response"
            com.dynatrace.android.agent.util.Utility.devLog(r1, r0)
            com.dynatrace.agent.communication.CommunicationContext r3 = new com.dynatrace.agent.communication.CommunicationContext
            long r4 = com.dynatrace.agent.communication.RetryManagerKt.getDISABLE_AGENT_TIME()
            com.dynatrace.agent.communication.CommunicationState$Inactive r6 = com.dynatrace.agent.communication.CommunicationState.Inactive.INSTANCE
            com.dynatrace.agent.communication.CommunicationState r6 = (com.dynatrace.agent.communication.CommunicationState) r6
            r8 = 0
            r3.<init>(r4, r6, r7, r8)
        L55:
            return r3
        L56:
            if (r4 == 0) goto L69
            com.dynatrace.agent.communication.CommunicationContext r3 = new com.dynatrace.agent.communication.CommunicationContext
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r4 = r0.m10409getZEROUwyO8pc()
            com.dynatrace.agent.communication.CommunicationState$PendingData r6 = com.dynatrace.agent.communication.CommunicationState.PendingData.INSTANCE
            com.dynatrace.agent.communication.CommunicationState r6 = (com.dynatrace.agent.communication.CommunicationState) r6
            r8 = 0
            r3.<init>(r4, r6, r7, r8)
            goto L55
        L69:
            com.dynatrace.agent.communication.CommunicationContext r3 = new com.dynatrace.agent.communication.CommunicationContext
            long r4 = com.dynatrace.agent.communication.CommunicationManagerImplKt.getDEFAULT_SCHEDULING_TIME()
            com.dynatrace.agent.communication.CommunicationState$Waiting r6 = new com.dynatrace.agent.communication.CommunicationState$Waiting
            r0 = 0
            r6.<init>(r0, r2, r0)
            com.dynatrace.agent.communication.CommunicationState r6 = (com.dynatrace.agent.communication.CommunicationState) r6
            r8 = 0
            r3 = r3
            r7 = r7
            r3.<init>(r4, r6, r7, r8)
            goto L55
        L7e:
            kotlin.ResultKt.throwOnFailure(r3)
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r0 = r9.eventDatabase
            r5.L$0 = r7
            r5.Z$0 = r4
            r5.label = r2
            java.lang.Object r0 = r0.delete(r11, r5)
            if (r0 != r1) goto L32
            return r1
        L90:
            com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1 r5 = new com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1
            r5.<init>(r3)
            goto L1c
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ResponseProcessorImpl.contextForValidDataRequestResponse(com.dynatrace.agent.communication.api.ServerDataUpdate, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object obtainContextForError(ResponseResult.Retry retry, EndPointInfo endPointInfo, RetryManager retryManager, CommunicationState communicationState, Continuation<? super CommunicationContext> continuation) {
        ServerDataUpdate serverDataUpdate = retry.getServerDataUpdate();
        if (Intrinsics.areEqual(serverDataUpdate != null ? serverDataUpdate.getState() : null, AgentState.Disabled.INSTANCE)) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to AgentState in " + retry);
            return m7109obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, retry.getServerDataUpdate(), continuation, 3, null);
        }
        RetryInfo incrementedRetryInfo = retryManager.getIncrementedRetryInfo(endPointInfo, retry.getRetryReason());
        if (!RetryManagerKt.isMaxRetryAttempt(incrementedRetryInfo)) {
            return new CommunicationContext(RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo), communicationState, retry.getServerDataUpdate(), null);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to max retry attempts reached");
        return m7109obtainDisabledContextbz6L7rs$default(this, RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo), null, endPointInfo, retryManager, retry.getServerDataUpdate() != null ? ServerDataUpdate.copy$default(retry.getServerDataUpdate(), AgentState.Disabled.INSTANCE, null, null, 6, null) : null, continuation, 2, null);
    }

    private final CommunicationContext obtainContextForNoConnectivity(RetryManager retryManager, EndPointInfo endPointInfo, ResponseResult.RetryExecution retryExecution, CommunicationState communicationState) {
        RetryInfo incrementedRetryInfo = retryManager.getIncrementedRetryInfo(endPointInfo, retryExecution.getRetryReason());
        long associatedRetryTime = RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo);
        if (!RetryManagerKt.isMaxRetryAttempt(incrementedRetryInfo)) {
            return new CommunicationContext(associatedRetryTime, communicationState, null, null);
        }
        retryManager.clearRetryState(endPointInfo);
        return new CommunicationContext(associatedRetryTime, CommunicationState.Offline.INSTANCE, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object obtainContextForSuccess(ResponseResult.Success success, EndPointInfo endPointInfo, RetryManager retryManager, Function2<? super ServerDataUpdate, ? super Continuation<? super CommunicationContext>, ? extends Object> function2, Continuation<? super CommunicationContext> continuation) {
        retryManager.clearRetryState(endPointInfo);
        this.lastConfigurationReceptionTimeMs = this.timeProvider.millisSinceEpoch();
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: updated last config reception time: " + this.lastConfigurationReceptionTimeMs);
        return function2.invoke(success.getServerDataUpdate(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX INFO: renamed from: obtainDisabledContext-bz6L7rs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7108obtainDisabledContextbz6L7rs(long r11, com.dynatrace.agent.communication.CommunicationState r13, com.dynatrace.agent.storage.db.EndPointInfo r14, com.dynatrace.agent.communication.RetryManager r15, com.dynatrace.agent.communication.api.ServerDataUpdate r16, kotlin.coroutines.Continuation<? super com.dynatrace.agent.communication.CommunicationContext> r17) {
        /*
            r10 = this;
            r2 = r17
            r7 = r13
            r8 = r16
            r5 = r11
            boolean r0 = r2 instanceof com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1
            if (r0 == 0) goto L5d
            r4 = r2
            com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1 r4 = (com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L5d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 != r1) goto L63
            long r5 = r4.J$0
            java.lang.Object r8 = r4.L$3
            com.dynatrace.agent.communication.api.ServerDataUpdate r8 = (com.dynatrace.agent.communication.api.ServerDataUpdate) r8
            java.lang.Object r15 = r4.L$2
            com.dynatrace.agent.communication.RetryManager r15 = (com.dynatrace.agent.communication.RetryManager) r15
            java.lang.Object r14 = r4.L$1
            com.dynatrace.agent.storage.db.EndPointInfo r14 = (com.dynatrace.agent.storage.db.EndPointInfo) r14
            java.lang.Object r7 = r4.L$0
            com.dynatrace.agent.communication.CommunicationState r7 = (com.dynatrace.agent.communication.CommunicationState) r7
            kotlin.ResultKt.throwOnFailure(r3)
        L3b:
            r15.clearRetryState(r14)
            com.dynatrace.agent.communication.CommunicationContext r4 = new com.dynatrace.agent.communication.CommunicationContext
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L45:
            kotlin.ResultKt.throwOnFailure(r3)
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r0 = r10.eventDatabase
            r4.L$0 = r7
            r4.L$1 = r14
            r4.L$2 = r15
            r4.L$3 = r8
            r4.J$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.deleteAll(r4)
            if (r0 != r2) goto L3b
            return r2
        L5d:
            com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1 r4 = new com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1
            r4.<init>(r10, r2)
            goto L19
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ResponseProcessorImpl.m7108obtainDisabledContextbz6L7rs(long, com.dynatrace.agent.communication.CommunicationState, com.dynatrace.agent.storage.db.EndPointInfo, com.dynatrace.agent.communication.RetryManager, com.dynatrace.agent.communication.api.ServerDataUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: obtainDisabledContext-bz6L7rs$default, reason: not valid java name */
    static /* synthetic */ Object m7109obtainDisabledContextbz6L7rs$default(ResponseProcessorImpl responseProcessorImpl, long j2, CommunicationState communicationState, EndPointInfo endPointInfo, RetryManager retryManager, ServerDataUpdate serverDataUpdate, Continuation continuation, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = RetryManagerKt.getDISABLE_AGENT_TIME();
        }
        if ((2 & i2) != 0) {
            communicationState = CommunicationState.Inactive.INSTANCE;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            serverDataUpdate = new ServerDataUpdate(AgentState.Disabled.INSTANCE, null, null);
        }
        return responseProcessorImpl.m7108obtainDisabledContextbz6L7rs(j2, communicationState, endPointInfo, retryManager, serverDataUpdate, continuation);
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    /* JADX INFO: renamed from: ageOfLastConfig-UwyO8pc */
    public long mo7106ageOfLastConfigUwyO8pc() {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(this.timeProvider.millisSinceEpoch(), DurationUnit.MILLISECONDS);
        Duration.Companion companion2 = Duration.Companion;
        return Duration.m10341minusLRDsOJo(duration, DurationKt.toDuration(this.lastConfigurationReceptionTimeMs, DurationUnit.MILLISECONDS));
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    public Object handleConfigResponse(ResponseResult responseResult, EndPointInfo endPointInfo, RetryManager retryManager, Continuation<? super CommunicationContext> continuation) {
        if (responseResult instanceof ResponseResult.Retry) {
            return obtainContextForError((ResponseResult.Retry) responseResult, endPointInfo, retryManager, new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.RETRYING), continuation);
        }
        if (responseResult instanceof ResponseResult.TooManyRequests) {
            return m7109obtainDisabledContextbz6L7rs$default(this, ((ResponseResult.TooManyRequests) responseResult).m7113getDelayUwyO8pc(), new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS), endPointInfo, retryManager, null, continuation, 16, null);
        }
        if (responseResult instanceof ResponseResult.Success) {
            return obtainContextForSuccess((ResponseResult.Success) responseResult, endPointInfo, retryManager, new AnonymousClass2(null), continuation);
        }
        if (responseResult instanceof ResponseResult.UnexpectedError) {
            return m7109obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, null, continuation, 19, null);
        }
        if (responseResult instanceof ResponseResult.RetryExecution) {
            return obtainContextForNoConnectivity(retryManager, endPointInfo, (ResponseResult.RetryExecution) responseResult, new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.RETRYING));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    public Object handleDataResponse(ResponseResult responseResult, EndPointInfo endPointInfo, List<EventRecord> list, RetryManager retryManager, boolean z2, Continuation<? super CommunicationContext> continuation) {
        if (responseResult instanceof ResponseResult.Retry) {
            return obtainContextForError((ResponseResult.Retry) responseResult, endPointInfo, retryManager, new CommunicationState.Waiting(CommunicationState.ConnectionStatus.RETRYING), continuation);
        }
        if (responseResult instanceof ResponseResult.TooManyRequests) {
            return m7109obtainDisabledContextbz6L7rs$default(this, ((ResponseResult.TooManyRequests) responseResult).m7113getDelayUwyO8pc(), new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS), endPointInfo, retryManager, null, continuation, 16, null);
        }
        if (responseResult instanceof ResponseResult.Success) {
            return obtainContextForSuccess((ResponseResult.Success) responseResult, endPointInfo, retryManager, new C11202(list, z2, null), continuation);
        }
        if (responseResult instanceof ResponseResult.UnexpectedError) {
            return m7109obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, null, continuation, 19, null);
        }
        if (responseResult instanceof ResponseResult.RetryExecution) {
            return obtainContextForNoConnectivity(retryManager, endPointInfo, (ResponseResult.RetryExecution) responseResult, new CommunicationState.Waiting(CommunicationState.ConnectionStatus.RETRYING));
        }
        throw new NoWhenBranchMatchedException();
    }
}
