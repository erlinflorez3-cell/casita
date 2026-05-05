package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.cache.disk.DefaultDiskStorage;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
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
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eqܜLDyt\fǻ\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmH<p[*%k\u00044:[,qY;]\u001a\u0004\"\u0011OdgonXZ\u0013C\u001dإ\u001eюr,_U\u0001ز\u001a\u000fHBw?9Mw=Gl|Ȃ\r H\"@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00138@\u0007:Z\rc\u0005\"\u0012\fF(\u00014\\oN<It]P/+\u0003oKV'u0\u0005M\u0013PZ܋#Ǹ\u007fbSB=ߎ#$\u0004\t\u0017Tk?I> ==iklq\nqg@f\u0001,\u001b;Q\u001d]!)\u000b\u0007aj\u001a+CUsM`\u000e^»)\u0001\u001dy\n\u000e\u0014-`e=Mv9\u00142\u0005\ncU`\u0004nB6Э\u0010?а)\n95I!l\\q=\u001fT]\b\u0015\u0015.)\u0011p1[\u0003\u001c\u000f\"+X\bSGPnLvV8`My\npp\u0012B\n@I\u0010/2߾\\(5=a913\u0004\u0002vWђuݓ¾lSwf\u0011]0\u0018.7X\u0017<dR\u000f\u001dq`Vh,G۳J\u007fMåF̯\u001fοʟ@!3<\u0017lv\u0017\u0003M\f\u0018U9teqt{\u0010g9\u0015ڨc\u0001*߇ ٥uܝ͖@b\u0013\t/Qa=r\\V0xʎ)ߑvӻΌR\f!d\b\u0001*gD1Gj[ȀAەAˆҴ\r_h\u001bX\u000ebg<\u0003\u00182;ժ?̿[ʙ״kxW^Eo0bYQkӧlš`ش3êɠ\u000b~\u00022\u0010vZ}dlL߯\u001cݫ^ۿ\u0019ߙֺ3=!AGs@9EE\u0003ǩ\u0016\u0001[J?&\u0003x\u001fLx=\u001eōϡt6ftZUZ\"2xdxIAt\b\ngV|Wc\u000bެ\nKYv\u0013[RMf\f3'N)\u000f*:|ch\nڲ[ʯvҡڏ\u0019ak&8p\b '&+Ё4[qN\b\u000eW\\BLHX\u0010˚й&.r\rRNp\u0003\u0018D\u000f:3lXItvf:]\u000be̎\u0015\u0014<\u0011\u0001Xq9A~,<tʕhыB͟љbC3O\u0016lu-\u0006K\u000b\u0019z\u0013\u0018K\u00141%ܞbܼ^߁Vłס4\byYD\u0004\u0004l\u0013\u007f!$b:d\b9F\u001biV\u001c\t\u0015^_=-\t\u00816ŌZ\u000e\\ۿ-nV\u001cxQp):\u0007\u000f\u0011C\u001e/߶_\u001e\u001c^+Вe҅\u0005S%̿k|]\u000f~+;Fd9Qι\u0007\u0012aԸ_ƀM\u0002>ߤ\u0018A{\u0006\b\u0012H\u001a\r\u001dxȰIT(ΰa۞4d\u0013ٝ|Pj\u0013 \u0004#l0G\u0017\u0007\r\u0016L\u0010\u001f\r)O)ŷ\u0011MzmN̂Eױ\u0005\u001dL͈\u0017\u000e\u0003\u0005T=}\u001fCPUI\u0019\u0017]<.Ěȑ}л$*/\u0006zGj~&h\u0010\u0002)_f:$\u000b\u001aB#\u0004054I\u0005\n\u001aC\u00188_\u0002iøAg̲o\u0002'J71r\u0011RMn~0o|k~[\u001b\u0005v1\u0005\b\u001d:`!\u0019)c-Ag\tB'RN_g֪ ߴ%˿߱\fb1ց uvq\u0004Uk\u000f;/\u001a-\u00103\u0007ܿ ݼ#y}âz`6'SV{Q;Ӻ^\u05cfFW\u0016ߜ;:rx$/$~\u000fH\u0015ƷA9\u001dݴ Ү37!ےʽ\rIh\u0007\n\\û*h"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fua\u000f", "\"", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", ">q^1h*>4\u001d\u0006z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001aiPCTuB]b_~e,R", "Ada6T3Bh\u0019\f", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u000eIz!<]\u0013 DC", "7mXAG(LY'e~l;", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011S\u0017@\u0006)1`\u000257zq9Q\u0019", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/oX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "1na?h7MW#\b]Z5{\u0010/r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011M\u0018I\u00045@h\u0002*@P\u00127LJ;x\n", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001d\u0011w]G\u0016m9N@%QYNuJR\u007fA\u0010\u0019^#N8bk^=5j\u000eG.\f3\u0013h?v\u0010a|\n>i}LZ\u000fZC\u0014qP%vUcly\u0011?Oo*.ii*iJE3\u0018{\"}dY-\u0011{`fYX\u0004vnK\"\u000e\u0002\"HzeVTs^<\u0003p|U\t\u0002\"A\\}+b+\u000e?*\f(u", "!BA\u000eG\n!M\u0007n[?\u0010o", "", "/bc<e", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012D\u0002,55{/Azk", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\"", "2`c.", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "5dc\u0011T;:", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/", "2nf;f;KS\u0015\u0007[e6\u000f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u001d8\u0006%\u000b", "5dc\u0011b>Ga(\fzZ4]\u00109w>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "4h[2", "5dc\u0013\\3>", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "4h[2\u0017+>Z\u0019\u0001vm,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "7mXAG(LY'", "6`]1_,+S\u0015}", "@dP1", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b;,XQH", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9{@\u007f'<Yh-Ak\u0016<[\"7z0\f$rn9EK,\\\u0005#IL\r\u0019\\Nq\u0013z\u0018d\u001dU/\u0016NWK1xTF#\u0011,WK\u0019r\n\u001b\u001a\u0017Ef\u007fF`\u0019\u001d={z=:d\u0010`[\u0003I\u000b/_/d\nnr", "6`]1_,.^\u0018z\n^", "CoS.g,", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b>7[N\u0002=i", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9{@\u007f'<Yh-Ak\u0016<[\"7z0\f$rn9EK,\\\u0005#IL\r\u001cgQnL\u0014gA\u0014X:\u0014\tb\u000b\"xQA/\u00170R\u0002I2^\u0016\u001f\u001d9s\u0001>e\u0014Q\u0003j9(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010", "@dP145=7\"\u0003\n", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@dP145=7\"\u0003\nH9g\u00169p{*wO\u0001r F^\u0011I\u00017\u0016U\u0002'Gz\u0016", "@dP145=7\"\u0003\nH9g\u00169p{*wO\u0001w\u0013Kv\u001eIv", "@dP17(MO", "@dP17(MO\u0003\f]Z5{\u0010/C\n5\tP\f&\u001bQx", "BqP;f-H`!Z\u0004]\u001e\n\r>e", "BqP;f-H`!", "B", "1`[9X9\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1TV^;`[r\u001b\u001e\u001bi\u000ea:bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "CoS.g,\u001dO(z", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "EqXAX\u000b:b\u0015", "<df\u0011T;:", "EqXAX\u000b:b\u0015=yZ;x\u0017>o\r(u>\u000b$\u0017", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "1qT.g,)O&~\u0004m\u000b\u0001\u0016/c\u000f2\tD\u0001%", "\u0011n\\=T5B]\"", "\u001bdb@T.>", "#mR9b:>O\u0016\u0006zH<\f\u0014?tm7\t@|\u001f", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SingleProcessDataStore<T> implements DataStore<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final Flow<T> data;
    private final MutableStateFlow<State<T>> downstreamFlow;
    private final Lazy file$delegate;
    private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;
    private final Function0<File> produceFile;
    private final CoroutineScope scope;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {1, 1}, l = {276, 281, 284}, m = "71?6?9*F;9M?", n = {"dffGf[", "\u0013jjOe\u001aJHD>R/,J#''\u001c!\u001ccj\u0013\f\u0004|\u000bcm\f4j#"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0, 0, 1, 1, 1, 2}, l = {ExifDirectoryBase.TAG_TILE_WIDTH, 348, 505}, m = "A526\u0014B9\u001fEAM", n = {"dffGf[.V9E", "XdkZ6WVH", "dffGf[.V9E", "XdkZ6WVH", "XdkZ[WNPP;Z3FH\u00025 '.\f&\u001c", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x"}, s = {"xQ_", "xQ`", "xQ_", "xQ`", "xQa", "xQa"})
    static final class C07971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07971(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C07971> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0}, l = {302}, m = "A526\u0014B9\u001fEAM)M,OMOAHCWI&TK<Q\\Zc3OX\\fdX", n = {"c^kY"}, s = {"xQ^"})
    static final class C07981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07981(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C07981> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0}, l = {311}, m = "A526\u0014B9\u001fEAM)M,OMOAHCWI+GPT^\\P", n = {"c^kY"}, s = {"xQ^"})
    static final class C07991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07991(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C07991> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0}, l = {381}, m = "A526\u00175I7", n = {"c^kY"}, s = {"xQ^"})
    static final class C08001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08001(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C08001> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "A526\u00175I7&J!;I@IC\"OSTXTYOVV", n = {"c^kY", "Tn", "Tn", "][y*SjC"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C08011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08011(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C08011> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0, 0, 0}, l = {402, HttpStatus.SC_GONE}, m = "CB2@F:DHD\u0019G>2NFRD", n = {"c^kY", "Rkt*SjC(D>.+JB", "Rkt*SjC"}, s = {"xQ^", "xQ_", "xQ`"})
    static final class C08021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08021(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C08021> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(Function0<? extends File> produceFile, Serializer<T> serializer, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, CorruptionHandler<T> corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = DefaultDiskStorage.FileType.TEMP;
        this.file$delegate = LazyKt.lazy(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                File file = (File) ((SingleProcessDataStore) this.this$0).produceFile.invoke();
                String it = file.getAbsolutePath();
                synchronized (SingleProcessDataStore.Companion.getActiveFilesLock$datastore_core()) {
                    if (SingleProcessDataStore.Companion.getActiveFiles$datastore_core().contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = SingleProcessDataStore.Companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    ((SingleProcessDataStore) this.this$0).downstreamFlow.setValue(new Final(th));
                }
                Object activeFilesLock$datastore_core = SingleProcessDataStore.Companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    SingleProcessDataStore.Companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2<Message<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.Message) obj, th);
                return Unit.INSTANCE;
            }

            public final void invoke(SingleProcessDataStore.Message<T> msg, Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred<T> ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineScope CoroutineScope = coroutineScope;
        NoOpCorruptionHandler noOpCorruptionHandler = corruptionHandler;
        List listEmptyList = (i2 + 4) - (4 | i2) != 0 ? CollectionsKt.emptyList() : list;
        noOpCorruptionHandler = (i2 + 8) - (8 | i2) != 0 ? new NoOpCorruptionHandler() : noOpCorruptionHandler;
        if ((i2 + 16) - (i2 | 16) != 0) {
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        this(function0, serializer, listEmptyList, noOpCorruptionHandler, CoroutineScope);
    }

    @Override // androidx.datastore.core.DataStore
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, completableDeferredCompletableDeferred$default, this.downstreamFlow.getValue(), continuation.getContext()));
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    public final File getFile() {
        return (File) this.file$delegate.getValue();
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007\"2\u0014\u007f\u0007|jA0ZeP\u008cX\u0004@ş\u0014}:#i#\"CiUR}(\u0010\u0010SmiĔNZ\u0019D_\u001e$z\u00034YW\t]H\u000eHA\u001eB\nޠqެ=d\r8\u000b$@'\u0603x\u0005\t#ݻL\u001a"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\"", "\"", "", "u(E", ":`bAF;:b\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u001d8\u0006%\u000b", "5dc\u0019T:MA(z\n^", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\u0015!ToW*\u0006!DYS", " dP1", "#oS.g,", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b;,XQH", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b>7[N\u0002=i", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static abstract class Message<T> {
        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract State<T> getLastState();

        private Message() {
        }

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005$Bߚ \tljG/tkX0bSp\u000e\u001a{t7k0\u007fDS]*\u007f2\t\u0006N}f\u001dLҼ\u000fC\u001d\tf\u0013x-a]\t_\"\u000fhB\u0006>aOFޠ;žx<\rړJ$>}\u0013\u0006ʆ.N"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b;,XQH", "\"", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\"", ":`bAF;:b\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u001d8\u0006%\u000b", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9{Kr45/A\u0011", "5dc\u0019T:MA(z\n^", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\u0015!ToW*\u0006!DYS", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }
        }

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0LeV\u008cZݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmp\u0005Ϻ\u0003\rI\u000f\u0014\u0015)p<Kex$\u0011=2\u0003OOb[pUdfsF\u00160AX8ѩ\t\u000b -X\u0016|~SM\u0012\u0018VE\u0001Bb\u0013]\u0007*\u0012<>N\u0007.`wPLG\u001bdh13\rwJf-o2\rMCF\u00030\u001d\u0003o(CHG7%%\n\u0003\u001dQ\nJ\u0013C\u007fI\u001dhU4ɛH֕ɱ:X\u000e\"e@]\u0015ux6^\u0015Q\u0017\fU4յgQXʫ@y\u0001\u000b\u001bLT\u001d\u00143`.['Ǵ\f\u0014;ο\u000bUFa\u0010p\u0013\u001a\tkN\u001f5\u0002C+o\u001b|P\u0010Foע9߉\t\u0013&ŀ\u0019p'nb\"1T)U\u0010|7PPNX]@Yǀq\u000eve\u00120\n4W\u00025\u000273'-GaI%1k8Hrm\u0007\tpjih\u0001On$Ļ\u0015ճҊ\r\u0014bDr\u001c\u0004RZm:'۶\u001cV\u000f}\u000e*ا`\u0010"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\u000b>7[N\u0002=i", "\"", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawnc:\\r)G\"", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "B", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "/bZ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,58}!7z#.L\u0019", ":`bAF;:b\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u001d8\u0006%\u000b", "1`[9X9\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QLN52(\"rqH\u000bl,\\@\u0005QTY3\\an:\u001b\u00129\u000eO+\u001a\u0012Y@yU@@\u001e\u00156M\u0001N2\u007f\b%\nCyzOVYE\u0004\"u\u000b\u0017wBh_O.GOq1h\u0015)\u001bfGD4#u\"\u001bv\u001a\f\u0014\t]!\u0002V\u0003gEQ\"\n87MC\u001f7", "5dc\u000eV2", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Oz\u0015<\u0006!2`}~7n\u0016;ZC:A", "5dc\u0010T3ES&\\\u0005g;|\u001c>", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "5dc\u0019T:MA(z\n^", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\u0015!ToW*\u0006!DYS", "5dc!e(Ga\u001a\t\bf", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        public static final class Update<T> extends Message<T> {
            private final CompletableDeferred<T> ack;
            private final CoroutineContext callerContext;
            private final State<T> lastState;
            private final Function2<T, Continuation<? super T>, Object> transform;

            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }

            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, CompletableDeferred<T> ack, State<T> state, CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }
        }
    }

    public final Object handleRead(Message.Read<T> read, Continuation<? super Unit> continuation) {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object andInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(value, UnInitialized.INSTANCE)) {
                    Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (value instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.SingleProcessDataStore.Message.Update<T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.handleUpdate(androidx.datastore.core.SingleProcessDataStore$Message$Update, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore.C07981
            if (r0 == 0) goto L28
            r4 = r6
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r4 = (androidx.datastore.core.SingleProcessDataStore.C07981) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L28
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L32
            java.lang.Object r0 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            goto L2e
        L28:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r4 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r4.<init>(r5, r6)
            goto L16
        L2e:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L4e
            goto L48
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L4b
            r4.label = r0     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r5.readAndInit(r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 != r2) goto L48
            return r2
        L48:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4b:
            r2 = move-exception
            r0 = r5
            goto L4f
        L4e:
            r2 = move-exception
        L4f:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r1 = r0.downstreamFlow
            androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
            r0.<init>(r2)
            r1.setValue(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore.C07991
            if (r0 == 0) goto L25
            r4 = r6
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r4 = (androidx.datastore.core.SingleProcessDataStore.C07991) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            java.lang.Object r0 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            goto L2b
        L25:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r4 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r4.<init>(r5, r6)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L48
            goto L53
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L45
            r4.label = r0     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r5.readAndInit(r4)     // Catch: java.lang.Throwable -> L45
            if (r0 != r2) goto L53
            return r2
        L45:
            r2 = move-exception
            r0 = r5
            goto L49
        L48:
            r2 = move-exception
        L49:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r1 = r0.downstreamFlow
            androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
            r0.<init>(r2)
            r1.setValue(r0)
        L53:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInitOrPropagateFailure(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInit(kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readAndInit(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(kotlin.coroutines.Continuation<? super T> r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore.C08011
            if (r0 == 0) goto L2d
            r7 = r9
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r7 = (androidx.datastore.core.SingleProcessDataStore.C08011) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r1 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r5 = 3
            r4 = 2
            r0 = 1
            if (r2 == 0) goto L53
            if (r2 == r0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r5) goto L37
            java.lang.Object r0 = r7.L$1
            java.lang.Object r3 = r7.L$0
            androidx.datastore.core.CorruptionException r3 = (androidx.datastore.core.CorruptionException) r3
            goto L33
        L2d:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r7 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r7.<init>(r8, r9)
            goto L13
        L33:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.io.IOException -> L86
            goto L83
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3f:
            java.lang.Object r3 = r7.L$1
            androidx.datastore.core.CorruptionException r3 = (androidx.datastore.core.CorruptionException) r3
            java.lang.Object r2 = r7.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L75
        L4b:
            java.lang.Object r2 = r7.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: androidx.datastore.core.CorruptionException -> L65
            goto L61
        L53:
            kotlin.ResultKt.throwOnFailure(r1)
            r7.L$0 = r8     // Catch: androidx.datastore.core.CorruptionException -> L62
            r7.label = r0     // Catch: androidx.datastore.core.CorruptionException -> L62
            java.lang.Object r1 = r8.readData(r7)     // Catch: androidx.datastore.core.CorruptionException -> L62
            if (r1 != r6) goto L61
            return r6
        L61:
            return r1
        L62:
            r3 = move-exception
            r2 = r8
            goto L66
        L65:
            r3 = move-exception
        L66:
            androidx.datastore.core.CorruptionHandler<T> r0 = r2.corruptionHandler
            r7.L$0 = r2
            r7.L$1 = r3
            r7.label = r4
            java.lang.Object r1 = r0.handleCorruption(r3, r7)
            if (r1 != r6) goto L75
            return r6
        L75:
            r7.L$0 = r3     // Catch: java.io.IOException -> L84
            r7.L$1 = r1     // Catch: java.io.IOException -> L84
            r7.label = r5     // Catch: java.io.IOException -> L84
            java.lang.Object r0 = r2.writeData$datastore_core(r1, r7)     // Catch: java.io.IOException -> L84
            if (r0 != r6) goto L82
            return r6
        L82:
            r0 = r1
        L83:
            return r0
        L84:
            r1 = move-exception
            goto L87
        L86:
            r1 = move-exception
        L87:
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ExceptionsKt.addSuppressed(r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readDataOrHandleCorruption(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008b  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.core.SingleProcessDataStore] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readData(kotlin.coroutines.Continuation<? super T> r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore.C08001
            if (r0 == 0) goto L2d
            r6 = r8
            androidx.datastore.core.SingleProcessDataStore$readData$1 r6 = (androidx.datastore.core.SingleProcessDataStore.C08001) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2d
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 1
            if (r1 == 0) goto L41
            if (r1 != r4) goto L39
            java.lang.Object r2 = r6.L$2
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r6.L$1
            java.io.Closeable r3 = (java.io.Closeable) r3
            java.lang.Object r4 = r6.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            goto L33
        L2d:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r6.<init>(r7, r8)
            goto L13
        L33:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L37
            goto L6a
        L37:
            r1 = move-exception
            goto L70
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L41:
            kotlin.ResultKt.throwOnFailure(r0)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L76
            java.io.File r0 = r7.getFile()     // Catch: java.io.FileNotFoundException -> L76
            r3.<init>(r0)     // Catch: java.io.FileNotFoundException -> L76
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.io.FileNotFoundException -> L76
            r2 = 0
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.io.FileNotFoundException -> L76
            r1 = r3
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch: java.lang.Throwable -> L6e
            androidx.datastore.core.Serializer<T> r0 = r7.serializer     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L6e
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L6e
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L6e
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L6e
            r6.label = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.readFrom(r1, r6)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r5) goto L69
            return r5
        L69:
            r4 = r7
        L6a:
            kotlin.io.CloseableKt.closeFinally(r3, r2)     // Catch: java.io.FileNotFoundException -> L79
            return r0
        L6e:
            r1 = move-exception
            r4 = r7
        L70:
            throw r1     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r1)     // Catch: java.io.FileNotFoundException -> L79
            throw r0     // Catch: java.io.FileNotFoundException -> L79
        L76:
            r1 = move-exception
            r4 = r7
            goto L7a
        L79:
            r1 = move-exception
        L7a:
            java.io.File r0 = r4.getFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L8b
            androidx.datastore.core.Serializer<T> r0 = r4.serializer
            java.lang.Object r0 = r0.getDefaultValue()
            return r0
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.readData(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object transformAndWrite(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.CoroutineContext r11, kotlin.coroutines.Continuation<? super T> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.SingleProcessDataStore.C08021
            if (r0 == 0) goto L92
            r8 = r12
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r8 = (androidx.datastore.core.SingleProcessDataStore.C08021) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L92
            int r0 = r8.label
            int r0 = r0 - r1
            r8.label = r0
        L13:
            java.lang.Object r1 = r8.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 == r4) goto L6a
            if (r0 != r5) goto L99
            java.lang.Object r3 = r8.L$1
            java.lang.Object r4 = r8.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.ResultKt.throwOnFailure(r1)
        L2d:
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r2 = r4.downstreamFlow
            androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
            if (r3 == 0) goto L3e
            int r0 = r3.hashCode()
        L37:
            r1.<init>(r3, r0)
            r2.setValue(r1)
        L3d:
            return r3
        L3e:
            r0 = 0
            goto L37
        L40:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> r0 = r9.downstreamFlow
            java.lang.Object r2 = r0.getValue()
            androidx.datastore.core.Data r2 = (androidx.datastore.core.Data) r2
            r2.checkHashCode()
            java.lang.Object r3 = r2.getValue()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r0.<init>(r10, r3, r6)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r8.L$0 = r9
            r8.L$1 = r2
            r8.L$2 = r3
            r8.label = r4
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r11, r0, r8)
            if (r1 != r7) goto L68
            return r7
        L68:
            r4 = r9
            goto L77
        L6a:
            java.lang.Object r3 = r8.L$2
            java.lang.Object r2 = r8.L$1
            androidx.datastore.core.Data r2 = (androidx.datastore.core.Data) r2
            java.lang.Object r4 = r8.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.ResultKt.throwOnFailure(r1)
        L77:
            r2.checkHashCode()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r0 == 0) goto L81
            goto L3d
        L81:
            r8.L$0 = r4
            r8.L$1 = r1
            r8.L$2 = r6
            r8.label = r5
            java.lang.Object r0 = r4.writeData$datastore_core(r1, r8)
            if (r0 != r7) goto L90
            return r7
        L90:
            r3 = r1
            goto L2d
        L92:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r8 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r8.<init>(r9, r12)
            goto L13
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.transformAndWrite(kotlin.jvm.functions.Function2, kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core(T r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.writeData$datastore_core(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
            } else {
                throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
            }
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u0012\u007f\u0007lkA0RuP.XS2\u000fy\u0002<$a$wCQ٥J}P\b\u0010Ywk|Jr\u000bq\u0010و\u001axx.\u0012[\u0007b*\u000f`H6S{S}DQ`#<K4z0F\u0002\u001d\u0001H0x\u0014\u0005\u0004[K:\u001cvT9X`\u0015e\u0005H\u00186B.\f6\\\u0016XfLziR/Q\u0010\u001aF\\5w0+ZSZ\u001d5\u001b~y\u001eYFg9#.k\u00035_\"SSN\u007f=\u001dhU(ȅMy_̬p\u0002\u001a\u00189Sվa\u0002"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawvl*U\u00015GHK3\\<\u0003L\u001f\"i{]8\r\u0001a\u0017", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "4h[2B<M^)\u000ehm9|\u00057", "\u001aiPCTuB]b_~e,f\u0019>p\u00107iO\u000e\u0017\u0013OE", "uKY.i(\bW#H[b3|r?t\u000b8\u000b.\u0010$\u0017Cwc\u007fg", "5dc\u0013\\3>=)\u000e\u0006n;j\u0018<e{0", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0019u\u000f3\fOn&$Gk\u0016\u0012", "1k^@X", "", "4kd@[", "EqXAX", AdkSettings.PLATFORM_TYPE_MOBILE, "", "0xc2f", "=eU", "", ":d]", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    private static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.fileOutputStream.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b2) throws IOException {
            Intrinsics.checkNotNullParameter(b2, "b");
            this.fileOutputStream.write(b2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i2, int i3) throws IOException {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, i2, i3);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>,6B\r.4\u0012}\u000blʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B]IV2\u00042\u000b_N\u0016j\u001dL\u0011ŏ\u001aƦ\bȀ|p4կmzc\u0016\u001d7\u0013\u0002M9eok87қ8ӯ$8*\u0600\u0012\u0007\u0007!8PǞz\u0004"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012Ex,5D\u000b*5m$<,?Jg\"-\u001fuawdm4Yr0KVW\u0002", "", "u(E", "/bc6i,\u001fW ~\t", "", "", "5dc\u000eV;Bd\u0019_~e,\u000bG.a\u000f$\nO\u000b$\u0017Am\u0018Iv", "u(;7T=:\u001d)\u000e~euj\t>;", "/bc6i,\u001fW ~\tE6z\u000f", "5dc\u000eV;Bd\u0019_~e,\u000bo9c\u0006fz<\u0010\u0013%Vy\u001b<p#?f}", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
