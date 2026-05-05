package com.dynatrace.agent.common.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.hS2\u000f\u0002{<$a*wّQ٥J}P\b\u0010cwk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004{ٕ\u0016\u00118F}D{S}LQ`#@K4z.F\n\u001d\u0007*,X\u0010%\u0005qTR\u0013xL~Kj\u0013]\u0007*\u00124HN\nd\\8ZDH\u0005]h0yɈkŌR'gܞMY\u001bHl';y8ӟ-Ë;5\u001dǬ$\u0011\u0015XsA\u0019> D[ؕ)ݳ/I{Ɏ\u0007v\u000e\u001c-1_\u000fmrTf3Z7І)˦SoSִ\u001e*}\u0006\n\u0019T\u0006\u0014\u00135Vͼ1,"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u000f\u0015\u0010`\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtB\u00014<]\u00073\u0001k ;WSJo=\u001e#2?C\u0014m<]z0G:L6gRH\u0001\u0005", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "<dcDb9DA(z\n^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IC", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?tr(]v|", "5dc\u001bX;P]&\u0005hm(\f\tma\t1\u0006O|&\u001bQx\u001c", "u(E", "5dc\u001bX;P]&\u0005hm(\f\t", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*y!BY|\u0001>w(\u0004", "1ta?X5M<\u0019\u000e\rh9\u0003v>a\u000f(", "@dV6f;>`\u0002~\np6\n\u000f\ra\u0007/x<~\u001dwNy ", "@dV6f;>`u\f\u0005Z+z\u0005=tl(y@\u0005(\u0017TP\u0015F\t", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class NetworkConnectivityCheckerImpl implements NetworkConnectivityChecker {
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final SharedFlow<NetworkState> networkState;

    /* JADX INFO: renamed from: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u0018\b\tvjg1re\u000f6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?tr(]v|"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super NetworkState>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl, NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1 networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1) throws Throwable {
            Context context = networkConnectivityCheckerImpl.context;
            NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1 networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$12 = networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1;
            short sXd = (short) (C1633zX.Xd() ^ (-13109));
            short sXd2 = (short) (C1633zX.Xd() ^ (-12045));
            int[] iArr = new int["AOFUSNJ\u0015KXX_Q[b\u001d3``gYmj".length()];
            QB qb = new QB("AOFUSNJ\u0015KXX_Q[b\u001d3``gYmj");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr = {networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$12};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("weK#?,i+\r4n *US_\u001bU", (short) (ZN.Xd() ^ 17398), (short) (ZN.Xd() ^ 2364)), Class.forName(Jg.Wd("K\u001f]2\bH\f\u001c*|D\u0011Z*xx%\u001ca\u001au;\u0002Z4X4xS\u001es)J", (short) (FB.Xd() ^ 23600), (short) (FB.Xd() ^ 3643))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                return Unit.INSTANCE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = NetworkConnectivityCheckerImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super NetworkState> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl = NetworkConnectivityCheckerImpl.this;
                final ?? r7 = new BroadcastReceiver() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        NetworkType networkType;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        ConnectivityManager connectivityManager = networkConnectivityCheckerImpl.connectivityManager;
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        boolean z2 = false;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            z2 = true;
                        }
                        if (activeNetworkInfo != null) {
                            int type = activeNetworkInfo.getType();
                            networkType = type != 0 ? type != 1 ? type != 9 ? NetworkType.OTHER : NetworkType.ETHERNET : NetworkType.WIFI : NetworkType.CELLULAR;
                        } else {
                            networkType = NetworkType.NONE;
                        }
                        producerScope.mo10484trySendJP2dKIU(new NetworkState(z2, networkType));
                    }
                };
                IntentFilter intentFilter = new IntentFilter(Ig.wd("\"\nQ<h\u001d0*\u0017r\b\u001b\u001d3&\u0005\u001b*\u000fA}U!2\u007fm}0w\u000b\u0007)Nl\u001dh", (short) (ZN.Xd() ^ 12887)));
                Context context = NetworkConnectivityCheckerImpl.this.context;
                BroadcastReceiver broadcastReceiver = (BroadcastReceiver) r7;
                Class<?> cls = Class.forName(EO.Od("%\n\u000e<sC\\?<&)\u000bGXPeXt==\u0006N\u001e", (short) (C1580rY.Xd() ^ (-7137))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (C1580rY.Xd() ^ (-10747));
                int[] iArr = new int["?K@MIB<\u00059DBG7?D|\u0010?;,.,)::\u0017)&'*6$0".length()];
                QB qb = new QB("?K@MIB<\u00059DBG7?D|\u0010?;,.,)::\u0017)&'*6$0");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                short sXd2 = (short) (ZN.Xd() ^ 28247);
                short sXd3 = (short) (ZN.Xd() ^ 30052);
                int[] iArr2 = new int["We\\kid`+annugqx3Ou|nx\u007fRvz\u0004u\u0004".length()];
                QB qb2 = new QB("We\\kid`+annugqx3Ou|nx\u007fRvz\u0004u\u0004");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
                    i4++;
                }
                clsArr[1] = Class.forName(new String(iArr2, 0, i4));
                Object[] objArr = {broadcastReceiver, intentFilter};
                Method method = cls.getMethod(C1561oA.od("\u0001rst}}myXjghkweq", (short) (OY.Xd() ^ 26972)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    final NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl2 = NetworkConnectivityCheckerImpl.this;
                    this.label = 1;
                    if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NetworkConnectivityCheckerImpl.AnonymousClass1.invokeSuspend$lambda$0(networkConnectivityCheckerImpl2, r7);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(C1626yg.Ud("\t1Mhr\tE\u0017{\u001d8\u001d^\u0010^.w\u000be7$<ATw\t:\u001f!8\u0001\u0016\u0014\u0002R*\r,\u001c\u000b\u001b92H\u0012\u0012\u0002", (short) (ZN.Xd() ^ 32730), (short) (ZN.Xd() ^ 13187)));
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u0018\b\tvjg1re\u000f6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?tr(]v|"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11161 extends SuspendLambda implements Function2<ProducerScope<? super NetworkState>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C11161(Continuation<? super C11161> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl, NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1 networkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1) {
            ConnectivityManager connectivityManager = networkConnectivityCheckerImpl.connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(networkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11161 c11161 = NetworkConnectivityCheckerImpl.this.new C11161(continuation);
            c11161.L$0 = obj;
            return c11161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super NetworkState> producerScope, Continuation<? super Unit> continuation) {
            return ((C11161) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final ?? r6 = new ConnectivityManager.NetworkCallback() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        Intrinsics.checkNotNullParameter(network, "network");
                        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                        producerScope.mo10484trySendJP2dKIU(new NetworkState(networkCapabilities.hasCapability(16), networkCapabilities.hasTransport(1) ? NetworkType.WIFI : networkCapabilities.hasTransport(0) ? NetworkType.CELLULAR : networkCapabilities.hasTransport(3) ? NetworkType.ETHERNET : NetworkType.OTHER));
                    }
                };
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
                ConnectivityManager connectivityManager = NetworkConnectivityCheckerImpl.this.connectivityManager;
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, (ConnectivityManager.NetworkCallback) r6);
                }
                final NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl = NetworkConnectivityCheckerImpl.this;
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkConnectivityCheckerImpl.C11161.invokeSuspend$lambda$0(networkConnectivityCheckerImpl, r6);
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

    public NetworkConnectivityCheckerImpl(Context context, CoroutineScope coroutineScope) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("\u0011\u001e\u001e%\u0017+(", (short) (C1499aX.Xd() ^ (-31796))));
        Intrinsics.checkNotNullParameter(coroutineScope, Wg.Zd("\u0018pp\u0017Y&\u0010\nudyz1#", (short) (C1607wl.Xd() ^ 24894), (short) (C1607wl.Xd() ^ 14580)));
        this.context = context;
        this.coroutineScope = coroutineScope;
        String strXd = C1561oA.Xd("o||}ut\u0007|\u000b~\u000b\u0011", (short) (C1633zX.Xd() ^ (-21417)));
        Class<?> cls = Class.forName(Wg.vd("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA", (short) (Od.Xd() ^ (-5643))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1633zX.Xd() ^ (-19682));
        short sXd2 = (short) (C1633zX.Xd() ^ (-32228));
        int[] iArr = new int["NDXB\u000eK?KC\t-MJ@D<".length()];
        QB qb = new QB("NDXB\u000eK?KC\t-MJ@D<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strXd};
        Method method = cls.getMethod(hg.Vd("pm{Y~wwgnSdpse^_", (short) (ZN.Xd() ^ 8327), (short) (ZN.Xd() ^ 14018)), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            this.connectivityManager = objInvoke instanceof ConnectivityManager ? (ConnectivityManager) objInvoke : null;
            this.networkState = LocalBuild.INSTANCE.getVersionSdk() >= 26 ? registerNetworkCallbackFlow() : registerBroadcastReceiverFlow();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void getNetworkState$annotations() {
    }

    private final SharedFlow<NetworkState> registerBroadcastReceiverFlow() {
        return FlowKt__ShareKt.shareIn$default(FlowKt.callbackFlow(new AnonymousClass1(null)), this.coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }

    private final SharedFlow<NetworkState> registerNetworkCallbackFlow() {
        return FlowKt__ShareKt.shareIn$default(FlowKt.callbackFlow(new C11161(null)), this.coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 0, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.dynatrace.agent.common.connectivity.NetworkState currentNetworkState() {
        /*
            r6 = this;
            com.dynatrace.agent.common.connectivity.LocalBuild r0 = com.dynatrace.agent.common.connectivity.LocalBuild.INSTANCE
            int r1 = r0.getVersionSdk()
            r0 = 23
            r5 = 0
            r4 = 1
            r3 = 0
            if (r1 < r0) goto L53
            android.net.ConnectivityManager r0 = r6.connectivityManager
            if (r0 == 0) goto L51
            android.net.Network r1 = r0.getActiveNetwork()
        L15:
            android.net.ConnectivityManager r0 = r6.connectivityManager
            if (r0 == 0) goto L1d
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r1)
        L1d:
            if (r5 == 0) goto L4f
            r0 = 16
            boolean r2 = r5.hasCapability(r0)
        L25:
            if (r5 == 0) goto L31
            boolean r0 = r5.hasTransport(r4)
            if (r0 == 0) goto L39
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.WIFI
        L2f:
            if (r0 != 0) goto L33
        L31:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.NONE
        L33:
            com.dynatrace.agent.common.connectivity.NetworkState r1 = new com.dynatrace.agent.common.connectivity.NetworkState
            r1.<init>(r2, r0)
        L38:
            return r1
        L39:
            boolean r0 = r5.hasTransport(r3)
            if (r0 == 0) goto L42
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.CELLULAR
            goto L2f
        L42:
            r0 = 3
            boolean r0 = r5.hasTransport(r0)
            if (r0 == 0) goto L4c
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.ETHERNET
            goto L2f
        L4c:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.OTHER
            goto L2f
        L4f:
            r2 = r3
            goto L25
        L51:
            r1 = r5
            goto L15
        L53:
            android.net.ConnectivityManager r0 = r6.connectivityManager
            if (r0 == 0) goto L5b
            android.net.NetworkInfo r5 = r0.getActiveNetworkInfo()
        L5b:
            if (r5 == 0) goto L64
            boolean r0 = r5.isConnectedOrConnecting()
            if (r0 != r4) goto L64
            r3 = r4
        L64:
            if (r5 == 0) goto L83
            int r1 = r5.getType()
            if (r1 == 0) goto L80
            if (r1 == r4) goto L7d
            r0 = 9
            if (r1 == r0) goto L7a
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.OTHER
        L74:
            com.dynatrace.agent.common.connectivity.NetworkState r1 = new com.dynatrace.agent.common.connectivity.NetworkState
            r1.<init>(r3, r0)
            goto L38
        L7a:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.ETHERNET
            goto L74
        L7d:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.WIFI
            goto L74
        L80:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.CELLULAR
            goto L74
        L83:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.NONE
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl.currentNetworkState():com.dynatrace.agent.common.connectivity.NetworkState");
    }

    @Override // com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker
    public SharedFlow<NetworkState> getNetworkState() {
        return this.networkState;
    }
}
