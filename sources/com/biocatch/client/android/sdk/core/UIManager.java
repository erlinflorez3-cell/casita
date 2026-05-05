package com.biocatch.client.android.sdk.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.ActivityObserver;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.permissions.RuntimePermissionService;
import com.biocatch.client.android.sdk.events.ActivityChangedEvent;
import com.biocatch.client.android.sdk.events.ApplicationMaximizedEvent;
import com.biocatch.client.android.sdk.events.ApplicationMaximizingEvent;
import com.biocatch.client.android.sdk.events.ApplicationMinimizedEvent;
import com.biocatch.client.android.sdk.events.ApplicationMinimizingEvent;
import com.biocatch.client.android.sdk.events.DialogFragmentEvent;
import com.biocatch.client.android.sdk.events.FragmentChangedEvent;
import com.biocatch.client.android.sdk.events.PermissionsGrantedEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001jBI]xs\u0012\u0017˰JoU3UoS9hҚ>\u0005.P*\u0600\u0002\u0005\u000f\u001a2H\u0016x\u0003Ca\f\u001a0FvBR#M\r܅\u001a\u0006T \t\u001eboTȤ^Ǎ\u000e:]\"3ipNW_^}\u000eHVX5\u000f\u000faL.P;C\u0019=S1\fb_M\tWqk\fx+53as\u0006?h\u0004\"\u001fCO;h\u0003*j\u0011i`:4;SqYh\u000eV\u0007ߡ\u007f\rJ\u0014V\u000e5_F1*f\u000e\u000fa\r;YNi\u001a^p\u001aAa~\u001d3\u001bK+g5-Q*S'jO{3'N'\u000f\f9[\u0003$\u0011\u001b)r\u0010SGPn\\\u000fbRgK\u000e\u001cp\u0011\u001cZ\b>d\u0018/*'t+mEiZ;!\u001a\u001cxHu\u0014\u001d`\u0017i0f\u0011N0\u0011.7X#<^R\u0002\u001dk~j\u001f@Yc*w\u001f}6-P`\u0006Y9%>d\u007flw\te]8Duz\u007fg|\u0010&Wgxc9_\u0001(a\u0001\rZS\u0005p\u0013}~B\u0002&\u000b`6?JH\u0019&>\u0010\rd\u001a9J? 6d0?@t\u0015v+NFO&!_\t\u0013V\u0013\u001d>2.\u0002$##GOʷtom%\u00127\u000b\u000e:-ok{\u0018łY\"nbE/\u0015.\f\u007fu\u0002|KZ\u001d.u\u0004\u000fh\u001a(ji/k-W\u00037d\u001a-sf;q_\u0001*')\u0017*\u0013I\u0019Fg6}A8nnbO\u0003\u001cxԱ`ѓ'\blрJsT\f_id\rk>w\u00061k\u0013ҁ:٫\t\u001f&ݒQ{0~M-q*sȹyӄ3\u0015iӠ:{<\u0006z\u000fT\u0002<׀.І\u001aojГ.FILaa\u000f@2$\u001b\u0019XG\u0019\r^Ⱥ\u0015Ό\u00113PШ5|d@e\u000b]\u0007=\u0081.ޛtVcƥc{\f:F_Xz\u001a͢\u0016ڎG%\u0019\u07bd$s{{c\\9Yeϛ\r֭5n\u001aΒ\u000e,daz\t^\u0011J̻8װ?b\rµʨ(h"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w='#g=\u001a\u0017hn\u000f", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000f2g}-Hm#\u0004", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;\f$Hg6&\u0015qp \u000bd,L\u000b%NL,(cYo9\u0012\u0018hc", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "/bc6i0Mgvzxa,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)AJoE\"$|?5\u0005f,$", ":hU2V@<Z\u0019lzk=\u0001\u0007/", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "@t]A\\4>>\u0019\f\u0003b:\u000b\r9nm(\tQ\u0005\u0015\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0019^\u007f6KTN\u0017\\_zA\" ^\u0018W\u0019\r\u0012jE\"n\u001a", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4nLc\u0010\u0011U\u0013\u0005E:lUm=uEDE8\u0011`\u0015^*f>97]x\u001d\u001chNB\b\u0003SZYVzge[\u0017\u00028y%keN\u000flYFr#.I~A\u000e;W\u00025x,M24>l\u000fTu\u0017D(\b\u0015*_J+$2C\u0001?Xtyj>\u001c2\u001fr\b\u0017qCzxvelWk\u0017k\u0005[Brc~7(l<Sw^$J\t@W\t\u0013\fP vdVM\u001fSJ\u0018zL*i\u001a\u0011\u0002la\u001a8#=#~w.fE#y\u0007r@Ux]M\u0013lW\u000ep\u0015ndV|.:wZG+;SF\u007f`BuY\u0014>\n\f\u0003\u001f\u0004v>\t:\u001d.n\u001bcAcd1\u001btO1\u001dqA\t\u001f8;\u0010VOxk\f|{{\u0018pF\u0012aH6}B?L4 CgK\u000eK$N\u0019+Z\u001f3_>$Aa=3T{\u000eI\u000f+\u0006\u001b :4yQ(ud\u001cv\u0015\u001b\u000ew\u001d\u001a\u001b\u000e`R$[\u0017xQ6\u001a\u000bl3\u0003\u0010w\nY", "/bc6i0Mg\u0003{\t^9\u000e\t<s", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/df,\nOV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\nKR?|8-)R^G\u0007p=N\u0004|", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc\u001fX:M`\u001d|\n^+m\r/wa5\u0006P\f}\u001bU~", "", "6`]1_,\u001a^$\u0006~\\(\f\r9ng$\u000fD\t\u001b,Gn", "", "6`]1_,\u001a^$\u0006~\\(\f\r9ng,\u0005D\t\u001b,Gn", "=m00g0OW(\u0013Xk,x\u0018/d", "/bc6i0Mg", "0t]1_,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "=m5?T.FS\"\u000eg^:\r\u0011/d", "4l", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "=m<<i,-]uzxd.\n\u0013?n~", "=m<<i,-]uzxd.\n\u0013?n~f\n?\u0007\u0011dA=\b\u0007px\u0003*w-7t\u0016*[C", "=m<<i,-]y\t\b^.\n\u0013?n~", "=m<<i,-]y\t\b^.\n\u0013?n~f\n?\u0007\u0011dA=\b\u0007px\u0003*w-7t\u0016*[C", "@dV6f;>`\u0003{\t^9\u000e\t<", "=ab2e=>`", "AsP?g", "As^=", "Cma2Z0Lb\u0019\fd[:|\u0016@e\r", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class UIManager extends FragmentManager.FragmentLifecycleCallbacks implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    private final ActivityCache activityCache;
    private final LinkedList<ActivityObserver> activityObservers;
    private final ApplicationCache applicationCache;
    private final ConfigurationRepository configurationRepository;
    private WeakReference<Activity> currentActivity;
    private final EventBusService eventBusService;
    private final Lifecycle lifecycleService;
    private final RuntimePermissionService runtimePermissionService;
    private final Utils utils;

    public UIManager(ApplicationCache applicationCache, ActivityCache activityCache, Lifecycle lifecycleService, EventBusService eventBusService, Utils utils, ConfigurationRepository configurationRepository, RuntimePermissionService runtimePermissionService) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(activityCache, "activityCache");
        Intrinsics.checkNotNullParameter(lifecycleService, "lifecycleService");
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(runtimePermissionService, "runtimePermissionService");
        this.applicationCache = applicationCache;
        this.activityCache = activityCache;
        this.lifecycleService = lifecycleService;
        this.eventBusService = eventBusService;
        this.utils = utils;
        this.configurationRepository = configurationRepository;
        this.runtimePermissionService = runtimePermissionService;
        this.activityObservers = new LinkedList<>();
    }

    private final void handleApplicationMaximized() {
        this.eventBusService.publish(new ApplicationMaximizingEvent());
        this.eventBusService.publish(new ApplicationMaximizedEvent());
    }

    private final void handleApplicationMinimized() {
        this.eventBusService.publish(new ApplicationMinimizingEvent());
        this.eventBusService.publish(new ApplicationMinimizedEvent());
    }

    public final List<?> getRestrictedViewGroupList() {
        return this.utils.toList(this.configurationRepository.getString(ConfigurationFields.restrictedViewGroupList));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Log.Companion.getLogger().info("Activity \"" + activity.getLocalClassName() + "\" resumed");
            this.currentActivity = new WeakReference<>(activity);
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                supportFragmentManager.registerFragmentLifecycleCallbacks(this, true);
            }
            this.activityCache.set(activity);
            Iterator<ActivityObserver> it = this.activityObservers.iterator();
            while (it.hasNext()) {
                it.next().onActivityChanged(activity);
            }
            this.eventBusService.publish(new ActivityChangedEvent(activity));
            List<String> listGrantedPermissions = this.runtimePermissionService.grantedPermissions();
            if (listGrantedPermissions == null || listGrantedPermissions.isEmpty()) {
                return;
            }
            this.eventBusService.publish(new PermissionsGrantedEvent(listGrantedPermissions));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("onActivityResumed error", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onFragmentResumed(fm, fragment);
        if (!getRestrictedViewGroupList().isEmpty()) {
            this.eventBusService.publish(new FragmentChangedEvent(fragment));
        }
        if (fragment instanceof DialogFragment) {
            this.eventBusService.publish(new DialogFragmentEvent((DialogFragment) fragment));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground$sdk_3_3_0_936_release() {
        handleApplicationMinimized();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onMoveToForeground$sdk_3_3_0_936_release() {
        handleApplicationMaximized();
    }

    public final void registerObserver(ActivityObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.activityObservers.add(observer);
    }

    public final void start() throws Throwable {
        Application application = this.applicationCache.get();
        this.lifecycleService.addObserver(this);
        Object[] objArr = {this};
        Method method = Class.forName(ZO.xd("Z.BgHv\t|rnr$g$(r\u001c\u0016\u0002\u0001vz\u0002", (short) (Od.Xd() ^ (-27232)), (short) (Od.Xd() ^ (-28377)))).getMethod(Ig.wd("2zJ$v\u001b0th\u0007\u001ap/\u0018+\u0012@S\u0018N\u0012{GL\u001b\\X7\rp\u001fAo\u001c", (short) (C1580rY.Xd() ^ (-31229))), Class.forName(C1626yg.Ud(":.VyQE\u0001R\u0004|BVPj0/\u0016*\u0010nb~tP\tev\u0006%F!\u0007w<Ye70d:[\u0001j\u001e\u000bhix\u0001/", (short) (FB.Xd() ^ 5615), (short) (FB.Xd() ^ 6368))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void stop() {
        FragmentManager supportFragmentManager;
        Application applicationTryGet = this.applicationCache.tryGet();
        if (applicationTryGet != null) {
            applicationTryGet.unregisterActivityLifecycleCallbacks(this);
        }
        this.lifecycleService.removeObserver(this);
        WeakReference<Activity> weakReference = this.currentActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this);
    }

    public final void unregisterObserver(ActivityObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.activityObservers.remove(observer);
    }
}
