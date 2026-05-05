package com.biocatch.client.android.sdk.collection.collectors.callInfo;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import com.biocatch.client.android.sdk.events.PermissionsGrantedEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import yg.C1499aX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Qg;
import yg.Wg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtJb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00153JoM?UoC:htD\u0005(݅*8\u0010\u0005\t\u001a0H\u0018v\u0011CS\f\u00183F\u0081Pĥ=S\u0015\u001c\"\u0006l /\u001d\rg|7\t m>=%\u001bipQ7c>\u0001e\rtY7\u0011\u0005g6+n>E\u00193[\u001b\u0007\u0001dO\u0007M{U\u0005\u001727/W\u007fo6\u0007\rЏ\u0019+]\u001b&\u00014w\u001dQ\u000f(W/]\u0001cP<F>\u007fD\u001bJ#&\u0006Ud^1(\u0007 \u000ea\u00169g\tV\u0010\u0001Z\u007f)}|\u0018m\u0006ANQ\u001b\u0015m(OaTE \u001d\rL?G\u0003iab3x\u0015Ip>R\u0002cNL`N8isBZͦd͆.\bHI\u0006@\n#~)3Js9Q5\"V\u001f\u05caiЛ\td\u0001UogVVrz$CB\t:g\u001bߢ\u0007\u07fbTT`\u008caY*V\u001f}6\u0016vςy˶%%\u0018ʚ zw\u0002e]8=e;\u000eցp«\u0012[Q`9N_}`m`\u0001,?jm[֝h͞W\fb٢x.@P\u0003\u0010&\u0005\u001b\u008b\u000eƱ6?yʉ\u00058?\u001dt\u0015v\btՖCҴ\r_bӐ`\u000bb9<\u0003\u0018+Kժ\u0003˩`pwΟ֗MR"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[8\nU2p\u000eZK\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[8\nU2p\u000eZK\fxC7&]", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>kJ2\u0014hbB.NU7(\u0017\u000fE\u000b:o\u0001\u0019k", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "Bd[2c/H\\-fvg(~\t<", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017P^!>U\u007f DC", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "Bd[2c/H\\-e~l;|\u0012/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[>|N2\r\u0010\\K-\u0003+;-\u0017,R\u0002H>", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+3(\u00079S\u0006:2\u0010\f\u001d\u000e@mzKjY6y\u001cuL,rOmGuP=Gb7:r]'d\u00047(\u001eo\u0015*fSw\u0006\u0005R\u001e|Vx1eQ!\u0003B-Lla\u0010Cyb<>\u0017.O\u0003\u0006g\u0019V~3>*\b>(2s\u0003N1\u0016Ebx\u001e;&=0%CF\u0017>\u0015qtr\b\fr&h\b\fq9;\"/cmO\u0016\u0007[&eBo)~3Y\r\"Rp\u001fp*mBby \f\u0011-\u0002LMQ*T\n\u001a}\u001a\t]\u001b\u000bLc\u001c&,\u0012LW\u00122(f;M\u001c\u001824\u0015zfM\u0019o\u0012\u001elQ<Ya|$\u007f\u0004\u0011V)7YJz\\L}Y\u00014\u000e\u0013\u0003+\u0002mL\u0003$\u001326AW88G+\u0014f`,\u001df\u0002\u001a)6@\u0002[O8<\u00020$}!wRXN", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "6`]1_,", "", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r&kA&\u0019vo=\u0011l:0\u0004#P[N+<crF#g", "6`]1_,&S'\rv`,", "AsPAX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JJ3c6{>\u001e[8\nU2z\u0014UP$D", "@dV6f;>`\b~\u0002^7\u007f\u00138y", "AsP?g", "As^=", "Cma2Z0Lb\u0019\fi^3|\u00142o\t<", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CallInfoCollector extends ContinuousCollector<CallInfoModel> implements ICallInfoEventHandler {
    private final Context context;
    private final EventBusService eventBusService;
    private final PermissionService permissionService;
    private final ITelephonyListener telephonyListener;
    private final TelephonyManager telephonyManager;
    private final Utils utils;

    public CallInfoCollector(EventBusService eventBusService, TelephonyManager telephonyManager, Utils utils, ITelephonyListener telephonyListener, PermissionService permissionService, Context context) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(telephonyListener, "telephonyListener");
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        Intrinsics.checkNotNullParameter(context, "context");
        this.eventBusService = eventBusService;
        this.telephonyManager = telephonyManager;
        this.utils = utils;
        this.telephonyListener = telephonyListener;
        this.permissionService = permissionService;
        this.context = context;
    }

    private final void registerTelephony() throws Throwable {
        Object obj = this.telephonyListener;
        if (obj instanceof PhoneStateListenerWrapper) {
            this.telephonyManager.listen((PhoneStateListener) obj, 32);
            return;
        }
        if (obj instanceof TelephonyCallbackWrapper) {
            TelephonyManager telephonyManager = this.telephonyManager;
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("{\b|\n\u0006~xA\u0006\u0011\u000f\u0014\u0004\f\u0011IMxv{k}x", (short) (C1499aX.Xd() ^ (-2332)))).getMethod(Qg.kd("\u001a\u0017%|\u0010\u0017\u001bp#\u000f\f\u001d\u001b\u0015\u0017", (short) (Od.Xd() ^ (-17012)), (short) (Od.Xd() ^ (-29574))), new Class[0]);
            try {
                method.setAccessible(true);
                telephonyManager.registerTelephonyCallback((Executor) method.invoke(context, objArr), (TelephonyCallback) this.telephonyListener);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private final void unregisterTelephony() {
        Object obj = this.telephonyListener;
        if (obj instanceof PhoneStateListenerWrapper) {
            this.telephonyManager.listen((PhoneStateListener) obj, 0);
        } else if (obj instanceof TelephonyCallbackWrapper) {
            this.telephonyManager.unregisterTelephonyCallback((TelephonyCallback) obj);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.CallInfo;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isCallInfo;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.CALLINFO;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(PermissionsGrantedEvent event) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPermissionsGranted().contains("android.permission.READ_PHONE_STATE")) {
            start();
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.callInfo.ICallInfoEventHandler
    public void handleMessage(CallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        long jCurrentTimeMillis = this.utils.currentTimeMillis();
        addToQueue(new CallInfoModel(getContextIDCache().get(), getCurrentEventId(), jCurrentTimeMillis, state));
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() throws Throwable {
        this.eventBusService.subscribe(this);
        if (isStarted()) {
            Log.Companion.getLogger().error("Call Info collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Call Info collector is already started. Aborting the start operation.");
        }
        if ((!this.utils.isVersionGreaterOrEqualTo(23) || this.utils.isVersionGreaterOrEqualTo(31)) && !this.permissionService.hasPermission("android.permission.READ_PHONE_STATE")) {
            Log.Companion.getLogger().info("Application has no permission to access call information. Call information will not be collected.");
            return;
        }
        this.telephonyListener.register(this);
        setStarted(true);
        registerTelephony();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        setStarted(false);
        unregisterTelephony();
        this.telephonyListener.unregister(this);
        this.eventBusService.unsubscribe(this);
    }
}
