package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
/* JADX INFO: compiled from: ProcessCameraProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŅ\u0014D57\u001eq\u007fZDkt\nA\u000e0\u0019LJ~8,\u001aw\rlr9>JmH4U[*\u001dt\u00044*[,qQ^]\u001a\u0014\"\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=?`|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\u0005ٙKŷ\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&\\mN>H\u0003]B/)\u0003qBd'gܞ\u0005M#F\\܋\u0015vo-3@M5\u001d%Y\u0005\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>ݙ\b\u0014#+WՕer<\\\rQf\f/+ecSP\u00148\u000e\u07be\u001ael\u0004<\u0005_G\u0007m\u001fl\bԧ7t\u0001S\t:\u0010\u0006Z\u007f)\nf\u001b3)K+gE\u0017Uof1Ne(5\u0013,P\u0019p7Z\u0003:\u0011\u0019)\u0003\u0010Q_\u0001pAV~\"Yk\u001d4vp3B\u0006FF.a,\u001d<J=?k=3#\u0002\u0001vx\u0016x5tv\t\u0002\\XF(m&9@\b:\u0012r\u001b%mfS\u0007cWLɟX\t\u0004@!Y%\u0016JH=\u0010|w\u0019mxvu\nSY\u0017;g)\u0004\u000e\u0006e\u000f7C\r{\u0010\u0010\u000f=\u0019\bop,pfp{<^jQ:2v\u0015@{\n~f\fA^o\u0006*iD;)b\u001bG\u0013 X@+@\u000e\u0011\t\u0012\u0015Sa[In˨x\t\u000f\u000e%\u0007}\u000f\u0011IZ;\u0011.;\u0001i=)*e$~3+c5\u0001:\u0005\u0010uZ\tdlD8\u0006\u007f.Y29\u007fs\u0004\u0013W\u000b7w\u001a3UN\u0003e\u007fP@)A\u0011B%I/Fg62!0n%bO\u0003CRzl;;\b\u0013\u0003@a\u000f\tU-l\u000b\nAyv\u0011\u0014TNf)K4f9\u000f::\u0003E/S'K/&1_\u0019o)\u0002o\\\u001c)\u000fn\u0003sPDcD\u0002\u0013UklS8w\u0006ERj2zPZH\u0019\n8F\u0017\u0003%3vx+\u0005\u001fF[ZG}\u0015\u0019\\\u0011~%s:A'D4vm8D[}Bps)\u001f\u001ckg\u001c%\u0012\\SX\u001d[#{_1B KrnW\u0011\"v\u0006<&D\u0015Sb3~9(BwT\b9e\u001biN\u001c\tT^e\u001f\u0019BB\"Z\u0005+\u001b}%yVZxE\u000fcZ\u0015\rDK(\t;7\u0004}Hj.\u0012i/\n=\u000b1i}6-:ŠHTGqp^\u000fb]]q\fHKTu7q\u0004u\u001c:(|KEF\u001di[\u001f`\u000f6n\red|g%\u0014\u001d\u0013\rb\u007fͩ\u0007է\u0012F\"\u0011\u0011\u001e]x\u0010d3S\\\u007f\b^(\n/P9\u000f\u001c\u0003sH+-48[?wlJlٖ[WS\u007f\u000e*.-T\u0017/go\u000e\u0015\u0016\u000e\u001fH!\n\u0016\u0011\u000e?S\u000f`Z˻Vƶv\u0014F\n<\\\u0010A\"\u0015dhy\bqO5<\u0005\u0006p]\u001f>Ơgp{p[\u001c\u0011y\u0002p\b\u0003E\\-\u000b7M\\)h\\J\u0011\u00027\u0007&6\u0014kҵ!߱\fb1ց qv\t\u0004Qq\fYHBˎmʘ4R&ݙo\f\u0004\u001eBV>\u0014iq\u0004>#\t3ְNŃ\u0012^r۪5\r\u001aE,\u0005\u000fJn\u0011AM\\qL\u0002e7W\u001f2ưSֿ\u000b\u0004MÒv??pW)G<\u001bwF\u00179\u0005Pa#\u001fXa7\u00106gj-\u001d«IՆ+Y,ݦ5\u00114l]:X\u0007Z3dĴ;և< Fюj(ItKAG5Ẅ́:۰s\u0007!ƺ;]aJB\u0001+'cׇ{܊o:{ق±'\t"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW'\u0004/3Y\f.\u0015i\u001e.Z?&x>/\u0019gaF\\", "\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW#z&5W\u0012\u001e>ms*UCHg\u001f+\u001fye8\u0007p\u0002", "u(E", "1`\\2e(\"\\\u001a\t\t", "", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8Z.6cS", "/bc6i,\u001c]\"|\u000bk9|\u0012>C{0{M|z Hy\u001c", "5dc\u000eV;Bd\u0019\\\u0005g*\r\u0016<e\t7Y<\t\u0017$CS\u0017=\u00013", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u000eV;Bd\u0019\\\u0005g*\r\u0016<e\t7Y<\t\u0017$CS\u0017=\u00013", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "/uP6_(;Z\u0019\\\u0005g*\r\u0016<e\t7Y<\t\u0017$CS\u0017=\u00013", "5dc\u000ei(BZ\u0015{\u0002^\n\u0007\u0012-u\r5{I\u0010t\u0013Oo\u001b8Z.6c\f", "1`\\2e((^\u0019\fvm0\u0006\u000b\u0017o~(", "", "5dc\u0010T4>`\u0015h\u0006^9x\u00183n\u0002\u0010\u0006?\u0001", "u(8", "Adc\u0010T4>`\u0015h\u0006^9x\u00183n\u0002\u0010\u0006?\u0001", "uH\u0018#", "7r2<a*N`&~\u0004m\nx\u0011/r{\u0010\u0006?\u0001\u0001 ", "", "u(I", ";BP:X9:7\"\u007f\u0005F(\b", "", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b Vo\u001bEr,~7y(7z\u0012\u001e[C\u0019gB\u001epg]D\u0016c9\rT#OL[(@QH", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b\u001fRvW)v3Df\u0002\u001eFm\u0015\fIK;x0\u0002\u001eik\u000f", ";BP:X9:F", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8iz", ";BP:X9:Fv\t\u0004_0~s<o\u0011,z@\u000e", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8i\u0003?b~$9,\u0001;WT?j4+j", ";BP:X9:F|\b~m0x\u00103z\u007f\t\fO\u0011$\u0017", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", ";BP:X9:F\u0007\u0002\u000bm+\u0007\u001b8F\u00107\fM\u0001", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", ";B^;g,Qb", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";KX3X*RQ ~XZ4|\u0016+R\u007f3\u0006N\u0005&!T\u0004", "\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW#z&5W\u0012\u001e>ms*UCHg!\u001e ro=\u0016m9bL", ";K^0^", "", "0h]1G6%W\u001a~xr*\u0004\t", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8L", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", ">qX:T9R1\u0015\u0007zk(j\t6e}7\u0006M", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8d%<Y{/Azk", "AdR<a+:`-\\vf,\n\u0005\u001de\u0007(yO\u000b$", ">qX:T9R:\u0015\u0013\u0005n;j\t>t\u00041}N", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J}\u0013[y\u001eKd%Dh\u0002)9{k", "AdR<a+:`-evr6\r\u0018\u001de\u000f7\u007fI\u0003%", "DhTDC6Kb", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\b\u001bG\u0002xF\u00044\u000b", "3eU2V;L", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8V&6Y{/\r", "CrT\u0010T:>a", "", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u0007%GM\nJvz", "0h]1G6%W\u001a~xr*\u0004\tmc{0{M|\u0011\u001eKp\u000e:\u000b#<Yw-7t\u0016*[C", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|*VBHu8\u001d(2_5\u000fc9J@%QYNu:Nz=!\u000eH\u000eU+\u000b\u0014cNyU@@\u001e\u00156M\u0001N2~\b\u001e\u000eBf:@`\u001dGCrqI)uBG_\u0001G?Tl7:r[&[GD(\u0013\u0005b\u0019dX.\u0017w\u001d\u000f|_y1NC-\u0005H3,mjUIxWJJ\u000e\u001bTz\u0005\u001c6W\btr)\f472.\u0003Ut\u0018\bEt)6lP\u0015&EK\u0017HMqKS:\u0017g,k\f\ru~/\u0015mepDX\u0005g$[~Rc\u0001I=\u0010KXE{,B\u0010>%\n$\r\u000emTiWRpJg\u0016yC/i\u0015\u0002\u00160\u0016\u00186\u0016JUXf4l7\u0017\u0003\u0017h\u0016\b\nY\u0019XWD\u0019lX|_V\u0003m4t\u0019I./\u0015:\u0001_C9m\u0012<\u0001\u0018zr", "1`\\2e(,S ~xm6\n", "CrT\u0010T:>5&\t\u000bi", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u0007%GM\nJv\u0007Bc\u000e+\r", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|*VBHu8\u001d(2_5\u000fc9J@%QYNu:Nz=!\u000eH\u000eU+\u000b\u0014cNyd+3(\u00079S\u0006:{J\n\u0012\u00165wl\fT\u001aTy^eO)FBg_O\u000b(Ak)q\u0016c\u001co\u00048 \u001cq&\u00172N8\u0017{\u001dnnZytc\u001d", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt!Pm\u001eI\u0004%>h[\u001c?m#*#", "Ah]4_,\u001cO!~\bZ\n\u0007\u00120i\u00026", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt!Pm\u001eI\u0004%>h[\u001c?m#*\f1?t6%\u0015F]A\u0007p(,\u00010HPP\u0002", "1n]3\\.N`\u0019b\u0004l;x\u0012-ec1\u000b@\u000e \u0013N", "", "1`\\2e(11#\b{b.", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8i\u0003?b~$9C", "5dc\u000ei(BZ\u0015{\u0002^\nx\u0011/r{\f\u0005A\u000b%", "5dc\u0010T4>`\u0015\\\u0005g-\u0001\u000b", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b\u001fRvW\u001ar-5fy}Av\u00172O\u0019", "1`\\2e(\"\\\u001a\t", "5dc\u0010T4>`\u0015b\u0004_6", "5dc\u001ce\nKS\u0015\u000ez<(\u0005\t<ar\f\u0005N\u0010\u0013 Eo", "1n]AX?M", "6`b\u0010T4>`\u0015", "7r1<h5=", "CrT\u0010T:>", "7r??X=BS+", "7rE6W,H1\u0015\n\nn9|", "Adc\u0010T4>`\u0015q", "1`\\2e(1", "Adc\u0010b5MS,\u000e", "AgdAW6P\\t\r\u000fg*", "CmQ6a+", "uZ;.a+K]\u001d}\u000e(*x\u0011/r{qyJ\u000e\u0017`7}\u000e\u001ar35/A\u0011", "CmQ6a+\u001aZ ", "\u0011n\\=T5B]\"", "1`\\2e(\u0006Z\u001d\u007fz\\@z\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    public static final Companion Companion = new Companion(null);
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;
    private CameraX mCameraX;
    private CameraXConfig.Provider mCameraXConfigProvider;
    private ListenableFuture<CameraX> mCameraXInitializeFuture;
    private ListenableFuture<Void> mCameraXShutdownFuture;
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository;
    private final Object mLock = new Object();

    @JvmStatic
    public static final void configureInstance(CameraXConfig cameraXConfig) {
        Companion.configureInstance(cameraXConfig);
    }

    @JvmStatic
    public static final ListenableFuture<ProcessCameraProvider> getInstance(Context context) {
        return Companion.getInstance(context);
    }

    private ProcessCameraProvider() {
        ListenableFuture<Void> listenableFutureImmediateFuture = Futures.immediateFuture(null);
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    public final ListenableFuture<Void> shutdownAsync() {
        ListenableFuture<Void> listenableFutureImmediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessCameraProvider.shutdownAsync$lambda$0(this.f$0);
            }
        });
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            Intrinsics.checkNotNull(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        if (cameraX2 != null) {
            Intrinsics.checkNotNull(cameraX2);
            listenableFutureImmediateFuture = cameraX2.shutdown();
        } else {
            listenableFutureImmediateFuture = Futures.immediateFuture(null);
        }
        Intrinsics.checkNotNullExpressionValue(listenableFutureImmediateFuture, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
            this.mCameraInfoMap.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.mCameraX = null;
        this.mContext = null;
        return listenableFutureImmediateFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(ProcessCameraProvider this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.unbindAll();
        this$0.mLifecycleCameraRepository.clear();
    }

    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                LayoutSettings DEFAULT2 = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT2, "DEFAULT");
                return bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT2, null, CollectionsKt.emptyList(), (UseCase[]) Arrays.copyOf(useCases, useCases.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                LayoutSettings DEFAULT2 = LayoutSettings.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT2, "DEFAULT");
                ViewPort viewPort = useCaseGroup.getViewPort();
                List<CameraEffect> effects = useCaseGroup.getEffects();
                Intrinsics.checkNotNullExpressionValue(effects, "useCaseGroup.effects");
                List<UseCase> useCases = useCaseGroup.getUseCases();
                Intrinsics.checkNotNullExpressionValue(useCases, "useCaseGroup.useCases");
                UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
                return bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT2, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0503 A[Catch: all -> 0x0710, TRY_LEAVE, TryCatch #0 {all -> 0x0710, blocks: (B:3:0x0026, B:5:0x002d, B:7:0x0033, B:14:0x011e, B:16:0x0124, B:18:0x0132, B:20:0x0148, B:22:0x015e, B:23:0x018c, B:25:0x0192, B:26:0x01a7, B:28:0x01ad, B:30:0x01bf, B:32:0x01ce, B:33:0x01d2, B:119:0x05cd, B:120:0x05ff, B:34:0x01e5, B:40:0x022a, B:41:0x022d, B:42:0x022e, B:43:0x0233, B:44:0x0234, B:46:0x0249, B:48:0x0261, B:49:0x0266, B:50:0x026d, B:56:0x02c3, B:58:0x02d9, B:64:0x032f, B:65:0x0336, B:66:0x0341, B:68:0x0349, B:70:0x034f, B:71:0x0356, B:73:0x037b, B:74:0x0382, B:76:0x0394, B:123:0x060a, B:129:0x0647, B:130:0x064a, B:78:0x039e, B:80:0x03b7, B:82:0x03c5, B:88:0x041c, B:91:0x0433, B:97:0x044b, B:103:0x04a4, B:105:0x04c1, B:117:0x05a3, B:118:0x05c9, B:93:0x043c, B:95:0x0442, B:107:0x04f9, B:108:0x04fd, B:110:0x0503, B:112:0x0526, B:114:0x053b, B:116:0x0567, B:131:0x064b, B:133:0x065b, B:134:0x065e, B:135:0x065f, B:136:0x0664, B:137:0x0665, B:143:0x06aa, B:144:0x06ad, B:146:0x06af, B:147:0x06b3, B:149:0x06b5, B:150:0x06b9, B:151:0x06ba, B:153:0x06cb, B:154:0x06ce, B:155:0x06cf, B:161:0x070c, B:162:0x070f), top: B:166:0x0026, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043c A[Catch: all -> 0x0710, TryCatch #0 {all -> 0x0710, blocks: (B:3:0x0026, B:5:0x002d, B:7:0x0033, B:14:0x011e, B:16:0x0124, B:18:0x0132, B:20:0x0148, B:22:0x015e, B:23:0x018c, B:25:0x0192, B:26:0x01a7, B:28:0x01ad, B:30:0x01bf, B:32:0x01ce, B:33:0x01d2, B:119:0x05cd, B:120:0x05ff, B:34:0x01e5, B:40:0x022a, B:41:0x022d, B:42:0x022e, B:43:0x0233, B:44:0x0234, B:46:0x0249, B:48:0x0261, B:49:0x0266, B:50:0x026d, B:56:0x02c3, B:58:0x02d9, B:64:0x032f, B:65:0x0336, B:66:0x0341, B:68:0x0349, B:70:0x034f, B:71:0x0356, B:73:0x037b, B:74:0x0382, B:76:0x0394, B:123:0x060a, B:129:0x0647, B:130:0x064a, B:78:0x039e, B:80:0x03b7, B:82:0x03c5, B:88:0x041c, B:91:0x0433, B:97:0x044b, B:103:0x04a4, B:105:0x04c1, B:117:0x05a3, B:118:0x05c9, B:93:0x043c, B:95:0x0442, B:107:0x04f9, B:108:0x04fd, B:110:0x0503, B:112:0x0526, B:114:0x053b, B:116:0x0567, B:131:0x064b, B:133:0x065b, B:134:0x065e, B:135:0x065f, B:136:0x0664, B:137:0x0665, B:143:0x06aa, B:144:0x06ad, B:146:0x06af, B:147:0x06b3, B:149:0x06b5, B:150:0x06b9, B:151:0x06ba, B:153:0x06cb, B:154:0x06ce, B:155:0x06cf, B:161:0x070c, B:162:0x070f), top: B:166:0x0026, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r33) {
        /*
            Method dump skipped, instruction units count: 1813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.ProcessCameraProvider.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    public final Camera bindToLifecycle$camera_lifecycle_release(LifecycleOwner lifecycleOwner, CameraSelector primaryCameraSelector, CameraSelector cameraSelector, LayoutSettings primaryLayoutSettings, LayoutSettings secondaryLayoutSettings, ViewPort viewPort, List<? extends CameraEffect> effects, UseCase... useCases) {
        CameraInternal cameraInternalSelect;
        RestrictedCameraInfo restrictedCameraInfo;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(primaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInternal cameraInternalSelect2 = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
            Intrinsics.checkNotNullExpressionValue(cameraInternalSelect2, "primaryCameraSelector.se…cameraRepository.cameras)");
            cameraInternalSelect2.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
            Intrinsics.checkNotNull(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            if (cameraSelector != null) {
                CameraX cameraX2 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX2);
                cameraInternalSelect = cameraSelector.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(cameraSelector);
                Intrinsics.checkNotNull(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternalSelect = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : ArraysKt.filterNotNull(useCases)) {
                for (LifecycleCamera lifecycleCameras2 : lifecycleCameras) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCameras2, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera2 = lifecycleCameras2;
                    if (lifecycleCamera2.isBound(useCase) && !Intrinsics.areEqual(lifecycleCamera2, lifecycleCamera)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(cameraInternalSelect2, cameraInternalSelect, restrictedCameraInfo2, restrictedCameraInfo, primaryLayoutSettings, secondaryLayoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            if (useCases.length != 0) {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                Intrinsics.checkNotNull(lifecycleCamera);
                List listListOf = CollectionsKt.listOf(Arrays.copyOf(useCases, useCases.length));
                CameraX cameraX6 = this.mCameraX;
                Intrinsics.checkNotNull(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera, viewPort, effects, listListOf, cameraX6.getCameraFactory().getCameraCoordinator());
            } else {
                Intrinsics.checkNotNull(lifecycleCamera);
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "mLifecycleCameraRepository.lifecycleCameras");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(UseCase... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() != 2) {
                this.mLifecycleCameraRepository.unbind(CollectionsKt.listOf(Arrays.copyOf(useCases, useCases.length)));
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.mLifecycleCameraRepository.unbindAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        boolean z2;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z2 = true;
        } catch (IllegalArgumentException unused) {
            z2 = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z2;
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            Intrinsics.checkNotNullExpressionValue(cameras, "mCameraX!!.cameraRepository.cameras");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "camera.cameraInfo");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            Intrinsics.checkNotNull(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            Intrinsics.checkNotNullExpressionValue(concurrentCameraSelectors, "mCameraX!!.cameraFactory…concurrentCameraSelectors");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        Intrinsics.checkNotNullExpressionValue(cameraSelector, "cameraSelector");
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        Object restrictedCameraInfo;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.mCameraX;
            Intrinsics.checkNotNull(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId cameraIdCreate = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            Intrinsics.checkNotNullExpressionValue(cameraIdCreate, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                restrictedCameraInfo = this.mCameraInfoMap.get(cameraIdCreate);
                if (restrictedCameraInfo == null) {
                    restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                    this.mCameraInfoMap.put(cameraIdCreate, restrictedCameraInfo);
                }
                Unit unit = Unit.INSTANCE;
            }
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) restrictedCameraInfo;
            Trace.endSection();
            return restrictedCameraInfo2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListenableFuture<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            ListenableFuture<CameraX> listenableFuture = this.mCameraXInitializeFuture;
            if (listenableFuture != null) {
                Intrinsics.checkNotNull(listenableFuture, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return listenableFuture;
            }
            final CameraX cameraX = new CameraX(context, this.mCameraXConfigProvider);
            ListenableFuture<CameraX> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17(this.f$0, cameraX, completer);
                }
            });
            this.mCameraXInitializeFuture = future;
            Intrinsics.checkNotNull(future, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider this$0, final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraX, "$cameraX");
        Intrinsics.checkNotNullParameter(completer, "completer");
        synchronized (this$0.mLock) {
            FutureChain futureChainFrom = FutureChain.from(this$0.mCameraXShutdownFuture);
            final Function1<Void, ListenableFuture<Void>> function1 = new Function1<Void, ListenableFuture<Void>>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ListenableFuture<Void> invoke(Void r2) {
                    return cameraX.getInitializeFuture();
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(function1, obj);
                }
            }, CameraXExecutors.directExecutor());
            Intrinsics.checkNotNullExpressionValue(futureChainTransformAsync, "cameraX = CameraX(contex…                        )");
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r3) {
                    completer.set(cameraX);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable t2) {
                    Intrinsics.checkNotNullParameter(t2, "t");
                    completer.setException(t2);
                }
            }, CameraXExecutors.directExecutor());
            Unit unit = Unit.INSTANCE;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenableFuture getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ListenableFuture) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final CameraXConfig cameraXConfig) {
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.mLock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                };
                Unit unit = Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        CameraConfig cameraConfig = null;
        for (CameraFilter cameraFilter : cameraSelector.getCameraFilterSet()) {
            Intrinsics.checkNotNullExpressionValue(cameraFilter, "cameraSelector.cameraFilterSet");
            CameraFilter cameraFilter2 = cameraFilter;
            if (!Intrinsics.areEqual(cameraFilter2.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter2.getIdentifier());
                Context context = this.mContext;
                Intrinsics.checkNotNull(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        Intrinsics.checkNotNull(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i2) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        Intrinsics.checkNotNull(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        Intrinsics.checkNotNullExpressionValue(activeConcurrentCameraInfos, "mCameraX!!.cameraFactory…tiveConcurrentCameraInfos");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: compiled from: ProcessCameraProvider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{J$cҕw٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007mDI\u0004|\u000e\u0016\u001d7Zom9\u0014t\u0006Mn{N\u000b0428(\u0007/\"ZL\u001e\u007f\u0013Cy\u0016X5\u0011|HS%M3\u001châ@ŋ\u0005\u001edɡߗ:S"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW'\u0004/3Y\f.\u0015i\u001e.Z?&x>/\u0019gaFEA6V\u0002#PPX52", "", "u(E", "A@_=<5Lb\u0015\bx^", "\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW'\u0004/3Y\f.\u0015i\u001e.Z?&x>/\u0019gaF\\", "1n]3\\.N`\u0019b\u0004l;x\u0012-e", "", "1`\\2e(11#\b{b.", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8i\u0003?b~$9C", "5dc\u0016a:MO\"|z", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1`\\2e(\u0006Z\u001d\u007fz\\@z\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ListenableFuture<ProcessCameraProvider> getInstance(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Preconditions.checkNotNull(context);
            ListenableFuture orCreateCameraXInstance = ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context);
            final Function1<CameraX, ProcessCameraProvider> function1 = new Function1<CameraX, ProcessCameraProvider>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ProcessCameraProvider invoke(CameraX cameraX) {
                    ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                    Intrinsics.checkNotNullExpressionValue(cameraX, "cameraX");
                    processCameraProvider.setCameraX(cameraX);
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context applicationContext = ContextUtil.getApplicationContext(context);
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(context)");
                    processCameraProvider2.setContext(applicationContext);
                    return ProcessCameraProvider.sAppInstance;
                }
            };
            ListenableFuture<ProcessCameraProvider> listenableFutureTransform = Futures.transform(orCreateCameraXInstance, new Function() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ProcessCameraProvider.Companion.getInstance$lambda$0(function1, obj);
                }
            }, CameraXExecutors.directExecutor());
            Intrinsics.checkNotNullExpressionValue(listenableFutureTransform, "context: Context): Liste…tExecutor()\n            )");
            return listenableFutureTransform;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (ProcessCameraProvider) tmp0.invoke(obj);
        }

        @JvmStatic
        public final void configureInstance(CameraXConfig cameraXConfig) {
            Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }
}
