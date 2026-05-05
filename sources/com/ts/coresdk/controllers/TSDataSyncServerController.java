package com.ts.coresdk.controllers;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.JsonStringConvertor;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.TSTimer;
import com.ts.coresdk.lifecycle.TSLifeCycleManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00116B\u0005#4\u0012\u000e\u0007nj?1LeV5ZS0\u0010s{J$c$wDCU(\u001d*\teNogtKb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00155JoM3UoC9htD#(2(L\u0002\u0005\u0017\u001a2H\u0016v\u0011ŏs\u000e\u0018ؓN.bT\u0013L\u0013XB\u0006l\\Aglk\\V`l\f9?-\u0011\u000bZT7a@|\u0004εt[7\u001d\u0005\t67P9E\u0015[م\u0013\tb[u\u0002m\u000eM\tv^?+wvg:f8,\u0015YZ\u001dc\u0001_t\u0007g_:?˦SeQ\u000b\u001cc@\u0016\n0T\u0004<(WL<M2f>Ԅcx\u0001tXP0r۰\u0004|gY%IHT9\\3f\u007f\u0004k#\\W\u0014\u000b\u001d 3\u0001%ď\ny>d#<lw\u007fEҨD?Nq\u0018\u007f\u0006\u0011\u0012\u0019z\u0002X&`K\u000eO\u0014\u0011\\\u001aU;iZ;!\u001a\rxHu\u001e\u001d`\u0017gׂVJFJ|?\u007f?\u00176rD\u0013'\u001cTbxD\u0011{0\u001b\u0007ą\f\u0015&\u0007\u0006gi2\u001ezgh\u0018\r\u0014qܦ)1lcg\u001c4\u001begv3cs*$уVx\u001amJ\u0010Mmtqk\f\t~X&@h\u0003\u0010&\u0010\u000bNܟ\u00174E!*_tR'\r-H1@rE\u000b)wZ\u0017\u001b/\\9$\u0011\u000b<v\u001f\u007f~p7oς|K2-nSuN_g1&\u0004D/4č'\t\u0005&\u000et0yU\u007f\u0005\u0016$w,*$:QW??#\u000f5ǻ`']KZ\u0014}Sc\u0011]y-}\u001db\u0001.\u0016\u001c1pݽdlP\u0003bKj\u001el(;\b\u0013\"*gT\u001b_ej\n\u0012Ŭyx\u0011zTPN{;\u001eN)\u000f\u0017:|cAϡ+\u001f\u001c-\"eeskk\b.(aE&KЅ\u0006Нg\u001awdW]@<\t]g\u0005V\"Ro9B\u0007jN٨Nީ8\u0011;JGh~[\te\u00199\u0016l\u0017.\u001dp\rܪh\u001a&}\u000bʡaͫwG\u0006\u0016dK3\u001a\u001egu{\u0006K\u000b\u0016\u0001\u000fH\u000bRφz݁ A(X]n\u0017=V\b&HY;\u0011\u0014r\tb4\u0003ш\u0014դGXq\b\u0016\u000b\u000eW0'%IZyKX\u001eT'p\u0005[;`\u001cǻ#Ǆ\u0005\u0003\u00175$\u000eCGU\u0002ToGeH\u007f\u00025?\u001bAʮ\u0001ݝ)/LV?46rQ)S|[U\u00128\u0014G_Ԗ{q\u001c8N{K^N\u001b\u0010ܵ\u0013چz4f\r[\u0002\\\u0003"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+rrjH\u0014m3Uv4\u001d", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", RemoteSettings.FORWARD_SLASH_STRING, "", "@", "\u0017", AdkSettings.PLATFORM_TYPE_MOBILE, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%w&;KC\u0011", ">", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%w&;KC\u0011", "1", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "\u0018", ExifInterface.GPS_MEASUREMENT_2D, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0017\u007fH\u0001$l", "D", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0017\u007fH\u0001$l", ExifInterface.GPS_MEASUREMENT_3D, "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ExifInterface.LONGITUDE_EAST, "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "4", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013#Y\u0007\u001f\u0016i%*?MHq4+xqbC\\", "C", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013#Y\u0007\u001f\u0016i%*?MHq4+xqbC\\", "5", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+j", Global.QUESTION, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+j", "6", ">/", ">0", "", "/cS\u0011T;:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`V}W:\u000125g|&\u0001Q\u0005\u001c5M:{;\u001exqbC\\'\u001d", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f&\u0006HJ&%\u0011m\u0018Iv34_G\u0004&[}8LSBk\u0018'\u0016r7|w", ">1", "1gP;Z,)O&z\u0003^;|\u0016=", "uH9\u0019V6F\u001d(\rD\\6\n\t=d\u0006q_/n~!F\u007f\u0015<Z.6cSc(", "1gT0^\tNT\u001a~\bE0\u0005\r>", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b\u001dn", "=m0=c3BQ\u0015\u000e~h5`\u0012\fa}.}M\u000b' F", "u(E", "=m0=c3BQ\u0015\u000e~h5`\u0012\u0010o\r(}M\u000b' F", "@dV6f;>`\u0001\tyn3|l0N\u007f&{N\u000f\u0013$[", "AbW2W<ESu\u000f{_,\nw3m\u007f\f\u0005O\u0001$(Cv", "uI;0b4\bb'Hxh9|\u0017.kI\fj.h!\u0016Wv\u000e \u007f&?/A\u0011", "AbW2W<ES\u000b\t\bd,\n", "Ax]07(MO\u000b\u0003\na\u001a|\u0016@e\r", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u00148U\rJy}\u001c\u001fuaG\u0006iu2e\u0015/VM<cRVF\u0015\u001c0Q?", "BqX4Z,K2\u0015\u000ev", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015KMC5C,^fkF\u0007q+T@\u000b6:66[by=w\u001b[\u0018$n}", ">2", ">3", ">4", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA52(\u001ewnC\u000ej,[\u0005p6:-(kN`G$\u001fX\u000e$\u0012\u000b\u000fa\u000b3|\u000e5)\u0015,W\u0001A2~\u0016\u001f\u001dBtwIV\u001dUC\u0004c %wBGs\u0003E/Eo;d\u00195\u0001A!8.\u001c;()2N8\u0017{a\u0010x\u001cwqpV&\u0005?+>zi\u00104]C<}&}G\u000bs\u0004<ez+\u0002\u0011\r54\f(u", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+SLP'mg-NT;ESN\u0016Y`rJ%\u0012gkJ2\u0014\u0002U?*D", "\"", "\u0013"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSDataSyncServerController<T, E> implements TSLifeCycleManager.ITSLifeCycleObserverCallback {

    /* JADX INFO: renamed from: o */
    private final Context f18249o;

    /* JADX INFO: renamed from: p */
    private final TSDataSource<T> f18250p;

    /* JADX INFO: renamed from: q */
    private final TSDataSyncServer<T, E> f18251q;

    /* JADX INFO: renamed from: r */
    private int f18252r;

    /* JADX INFO: renamed from: s */
    private long f18253s;

    /* JADX INFO: renamed from: u */
    private final TSSendDataWorkerInfo f18254u;

    /* JADX INFO: renamed from: v */
    private TSTimer f18255v;

    /* JADX INFO: renamed from: w */
    private final List<ITSModuleInfo> f18256w;

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> A;

        /* JADX INFO: renamed from: x */
        int f18257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TSDataSyncServerController<T, E> f18258y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ITSModuleInfo f18259z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(TSDataSyncServerController<T, E> tSDataSyncServerController, ITSModuleInfo iTSModuleInfo, List<? extends T> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18258y = tSDataSyncServerController;
            this.f18259z = iTSModuleInfo;
            this.A = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f18258y, this.f18259z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f18257x != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                TSDataSource tSDataSource = ((TSDataSyncServerController) this.f18258y).f18250p;
                TSDataSyncServerController<T, E> tSDataSyncServerController = this.f18258y;
                ITSModuleInfo iTSModuleInfo = this.f18259z;
                List<T> list = this.A;
                synchronized (tSDataSource) {
                    tSDataSyncServerController.registerModuleIfNecessary(iTSModuleInfo);
                    if (!((TSDataSyncServerController) tSDataSyncServerController).f18255v.isInitialized()) {
                        tSDataSyncServerController.scheduleBufferTimeInterval(((TSDataSyncServerController) tSDataSyncServerController).f18253s, iTSModuleInfo);
                    }
                    ((TSDataSyncServerController) tSDataSyncServerController).f18250p.addData((List) list, iTSModuleInfo);
                    tSDataSyncServerController.checkBufferLimit(iTSModuleInfo);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message != null) {
                    TSDataSyncServerController<T, E> tSDataSyncServerController2 = this.f18258y;
                    TSLog.e(((TSDataSyncServerController) tSDataSyncServerController2).f18249o, this.f18259z, message, th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TSDataSyncServerController<T, E> B;
        final /* synthetic */ int C;
        final /* synthetic */ long D;
        final /* synthetic */ ITSModuleInfo E;

        /* JADX INFO: renamed from: x */
        int f18260x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TSDataSyncServerController<T, E> tSDataSyncServerController, int i2, long j2, ITSModuleInfo iTSModuleInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.B = tSDataSyncServerController;
            this.C = i2;
            this.D = j2;
            this.E = iTSModuleInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.B, this.C, this.D, this.E, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f18260x != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                TSDataSyncServerController<T, E> tSDataSyncServerController = this.B;
                int i2 = this.C;
                tSDataSyncServerController.checkBufferLimit(this.E);
                ((TSDataSyncServerController) tSDataSyncServerController).f18252r = i2;
                ((TSDataSyncServerController) this.B).f18253s = this.D;
                this.B.scheduleBufferTimeInterval(this.D, this.E);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message != null) {
                    TSDataSyncServerController<T, E> tSDataSyncServerController2 = this.B;
                    TSLog.e(((TSDataSyncServerController) tSDataSyncServerController2).f18249o, this.E, message, th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements TSTimer.ITSTimerTask {
        final /* synthetic */ TSDataSyncServerController<T, E> F;
        final /* synthetic */ ITSModuleInfo G;

        c(TSDataSyncServerController<T, E> tSDataSyncServerController, ITSModuleInfo iTSModuleInfo) {
            this.F = tSDataSyncServerController;
            this.G = iTSModuleInfo;
        }

        @Override // com.ts.coresdk.TSTimer.ITSTimerTask
        public void doTask() {
            try {
                TSDataSource tSDataSource = ((TSDataSyncServerController) this.F).f18250p;
                TSDataSyncServerController<T, E> tSDataSyncServerController = this.F;
                synchronized (tSDataSource) {
                    for (ITSModuleInfo iTSModuleInfo : ((TSDataSyncServerController) tSDataSyncServerController).f18256w) {
                        if (((TSDataSyncServerController) tSDataSyncServerController).f18250p.isNotEmpty(iTSModuleInfo)) {
                            tSDataSyncServerController.syncDataWithServer(((TSDataSyncServerController) tSDataSyncServerController).f18250p.fetchAndRemove(iTSModuleInfo), null, iTSModuleInfo);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message != null) {
                    ITSModuleInfo iTSModuleInfo2 = this.G;
                    TSDataSyncServerController<T, E> tSDataSyncServerController2 = this.F;
                    if (iTSModuleInfo2 != null) {
                        TSLog.e(((TSDataSyncServerController) tSDataSyncServerController2).f18249o, iTSModuleInfo2, message, th);
                    }
                }
            }
        }
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TSDataSyncServerController<T, E> H;
        final /* synthetic */ T I;
        final /* synthetic */ ITSModuleInfo J;
        final /* synthetic */ E K;

        /* JADX INFO: renamed from: x */
        int f18261x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TSDataSyncServerController<T, E> tSDataSyncServerController, T t2, ITSModuleInfo iTSModuleInfo, E e2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.H = tSDataSyncServerController;
            this.I = t2;
            this.J = iTSModuleInfo;
            this.K = e2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.H, this.I, this.J, this.K, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f18261x != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                TSDataSource tSDataSource = ((TSDataSyncServerController) this.H).f18250p;
                T t2 = this.I;
                TSDataSyncServerController<T, E> tSDataSyncServerController = this.H;
                ITSModuleInfo iTSModuleInfo = this.J;
                E e2 = this.K;
                synchronized (tSDataSource) {
                    if (t2 != null) {
                        ((TSDataSyncServerController) tSDataSyncServerController).f18250p.addData(t2, iTSModuleInfo);
                    }
                    List<T> listFetchAndRemove = ((TSDataSyncServerController) tSDataSyncServerController).f18250p.fetchAndRemove(iTSModuleInfo);
                    TSLog.d(((TSDataSyncServerController) tSDataSyncServerController).f18249o, iTSModuleInfo, "sync data with server for " + listFetchAndRemove);
                    tSDataSyncServerController.syncDataWithServer(listFetchAndRemove, e2, iTSModuleInfo);
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message != null) {
                    TSLog.e(((TSDataSyncServerController) this.H).f18249o, this.J, message, th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public TSDataSyncServerController(Context context, TSDataSource<T> tSDataSource, TSDataSyncServer<T, E> tSDataSyncServer, int i2, long j2, TSSendDataWorkerInfo tSSendDataWorkerInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tSDataSource, "");
        Intrinsics.checkNotNullParameter(tSDataSyncServer, "");
        this.f18249o = context;
        this.f18250p = tSDataSource;
        this.f18251q = tSDataSyncServer;
        this.f18252r = i2;
        this.f18253s = j2;
        this.f18254u = tSSendDataWorkerInfo;
        this.f18255v = new TSTimer();
        this.f18256w = new ArrayList();
        TSLifeCycleManager.f18280a.d(context).a(this);
    }

    public final void checkBufferLimit(ITSModuleInfo iTSModuleInfo) {
        try {
            if (!this.f18250p.isNotEmpty(iTSModuleInfo) || this.f18250p.size(iTSModuleInfo) < this.f18252r) {
                return;
            }
            syncDataWithServer(this.f18250p.fetchAndRemove(iTSModuleInfo), null, iTSModuleInfo);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                TSLog.e(this.f18249o, iTSModuleInfo, message, th);
            }
        }
    }

    public final void registerModuleIfNecessary(ITSModuleInfo iTSModuleInfo) {
        List<ITSModuleInfo> list = this.f18256w;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ITSModuleInfo) it.next()).subSystemName(), iTSModuleInfo.subSystemName())) {
                    return;
                }
            }
        }
        this.f18256w.add(iTSModuleInfo);
    }

    public final void scheduleBufferTimeInterval(long j2, ITSModuleInfo iTSModuleInfo) {
        this.f18255v.scheduleTask(j2, new c(this, iTSModuleInfo));
    }

    static /* synthetic */ void scheduleBufferTimeInterval$default(TSDataSyncServerController tSDataSyncServerController, long j2, ITSModuleInfo iTSModuleInfo, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            iTSModuleInfo = null;
        }
        tSDataSyncServerController.scheduleBufferTimeInterval(j2, iTSModuleInfo);
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
    private final void scheduleWorker() {
        TSSendDataWorkerInfo tSSendDataWorkerInfo;
        Data dataBuild;
        try {
            tSSendDataWorkerInfo = this.f18254u;
        } catch (Throwable unused) {
            return;
        }
        if (tSSendDataWorkerInfo != null) {
            JsonArray jsonArray = new JsonArray();
            Iterator<T> it = this.f18256w.iterator();
            while (true) {
                dataBuild = null;
                String json = null;
                if (!it.hasNext()) {
                    break;
                }
                ITSModuleInfo iTSModuleInfo = (ITSModuleInfo) it.next();
                com.ts.coresdk.controllers.a aVar = new com.ts.coresdk.controllers.a(iTSModuleInfo.subSystemName(), iTSModuleInfo.isLoggerEnabled(this.f18249o), iTSModuleInfo.endpointIgnoreList(this.f18249o), iTSModuleInfo.tenantID(), iTSModuleInfo.version());
                JsonStringConvertor jsonStringConvertor = JsonStringConvertor.INSTANCE;
                try {
                    json = new Gson().toJson(aVar);
                } catch (Throwable unused2) {
                    String str = json;
                }
                if (json != null) {
                    jsonArray.add(json);
                }
                return;
            }
            if (tSSendDataWorkerInfo.getKeyForWorker() != null) {
                Pair[] pairArr = {TuplesKt.to(tSSendDataWorkerInfo.getKeyForWorker(), jsonArray.toString())};
                Data.Builder builder = new Data.Builder();
                Pair pair = pairArr[0];
                builder.put((String) pair.getFirst(), pair.getSecond());
                dataBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "");
            }
            com.ts.coresdk.b.a.a.INSTANCE.a(this.f18249o, tSSendDataWorkerInfo.getWorker(), dataBuild);
        }
    }

    public final void syncDataWithServer(List<? extends T> list, E e2, ITSModuleInfo iTSModuleInfo) {
        try {
            this.f18251q.sendDataToServer((List) list, (Object) e2, iTSModuleInfo);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                TSLog.e(this.f18249o, iTSModuleInfo, message, th);
            }
        }
    }

    public final void addData(T t2, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        addData((List) CollectionsKt.listOf(t2), iTSModuleInfo);
    }

    public final void addData(List<? extends T> list, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(this, iTSModuleInfo, list, null), 3, null);
    }

    public final void changeParameters(int i2, long j2, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(this, i2, j2, iTSModuleInfo, null), 3, null);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityCreated(Activity activity, Bundle bundle) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityDestroyed(Activity activity) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityPaused(Activity activity) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityResumed(Activity activity) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityStarted(Activity activity) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onActivityStopped(Activity activity) {
        TSLifeCycleManager.ITSLifeCycleObserverCallback.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onApplicationInBackground() {
        this.f18255v.cancel();
        scheduleWorker();
    }

    @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
    public void onApplicationInForeground() {
        scheduleBufferTimeInterval$default(this, this.f18253s, null, 2, null);
    }

    public final void triggerData(T t2, E e2, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        TSLog.d(this.f18249o, iTSModuleInfo, "trigger action with " + (t2 != null ? t2 : "empty"));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(this, t2, iTSModuleInfo, e2, null), 3, null);
    }
}
