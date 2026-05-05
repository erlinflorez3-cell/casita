package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.InterfaceC1492Gx;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O&8\u000bDB\u0007\"2\u0013\u007f\u0007tsA0JfP.`S2şs{J$cҕyCQU\"}(\u000fWN}gvJ`\u000fI#\u001cǝ)jZH\u0016,c'\u001fDPoWA]wM?pt<\u000661P:\u0010\u0004/\u001b:\\\u0016v\tFc\u001a\"8PvJR\u0013N\u001b\u0019@\bT\u001f/\u001f֔kNDL-'@43\toB\\,w0+S\u001dLZ'\u001b}y\u001eYFGI\u001b%a\u0003\u001f`kG\u0013E\u0002=\u000bi=&YK\nVdY\u0010(\u001b+]\u0010u\u00016d\u0015Wp\f-,ebyR$'&{ԫ\u0011<\u0012\u0016N?V7E\u001a\u0015\u0012>7\u0003}k@~\u000e\u000fH\u000e\by8-$.AqMct_pS\u0019|A,\t\u001b);\u0001\u001d-\"hVn#+lw\u007f;\u0002DKSf\n\bI4\u00189p\u0010;\u001c0u\n_\u007f\u001f9/%eg\u007f7i\u0002\u0010Z\\g%\u000f\u0011latjHn.\u001f\u001aE7!\f\tR+\u00194^bkD\u0011{&\u0005\u000b\f\u0013+ \u000b\u0004\u00035m\u001e\\c\u0001i\u0019W\u000e\u000e3:~7\bz2\" ElHMQ\u0012\u001a\u0012V\u0005*W<\u0011\u001c!~Pk$Z\u000b2RBV\u0004(\u0004\fL^\u0012#2Er23Z3G]]`\u00118ZA+\u0013\u0010jv)\u0017`C,\u0013o4t\u000f\u0002f[\u001fq\u0016y\u0012B\u000b{:-oWe\u001d4`:hb\tS\u000b\r\u0010\u0018G\u0016R\u000eQ=.\u0004U\u0014,&\"IW?=\u0019\u0010\u0015(`\u0004[F#Ǭq˛Q\u0012/ϕM\u0006\u001dB\u0001.\u0016\u000eAѴ.߯nJWܷg:\u0005a\u000b/\u0018l\u0010\u007fqF\u0001HyS9]lJIÈe\u0084R8\u0005þo*3\u0006\b\"+;\u0004ρ)ޗ\u001aw\u001c٬ֻez"}, d2 = {"\u001ab^:\")KO.~D;9x\u001e/A}7\u007fQ\u0005&+.s\u000f<t93`}}3t\u001d+IAAR8,$hj9\u00149", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "7m0=c\u0014>a'z|b5~u/g\u00046\u000bM|&\u001bQxjC\u0001#;`\u0002.F", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Adb@\\6G6\u0015\bye0\u0006\u000b\fl\n&\u0002G\u0005%&", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005L\u0005$\r<J'&KvW*v4\u000b\u001dn", "Adb@\\6G6\u0015\bye0\u0006\u000b\u000fn{%\u0003@\u007f", "", "@dV6f;>`|\bVi7d\t=s{*{(| \u0013Io\u001b", "uYI\u0019](OOb\u000f\nb3Fv/tU\u000f\u0001<\u0012\u0013`W~\u0012C@\u00135hSc(", "=m00g0OW(\u0013Xk,x\u0018/d", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "0t]1_,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "@dV6f;>`\u0003\bVi7\u0004\r-a\u000f,\u0006I", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Adc\u0016a\bI^\u0001~\tl(~\r8gl(}D\u000f&$C~\u0012F\u007f\u0002<c{&>q$=", "0k^0^3Ba(", "Adc X:LW#\b]Z5{\u00103n\u0002\u0005\u0003J~\u001d\u001eK}\u001d", "Ag^B_+!O\"}\u0002^\u0013\u0001\n/c\u0014&\u0003@h\u0017&Jy\rJZ.\u0011W\r$Hq%B", "4na X:LW#\b]Z5{\u00103n\u0002", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set) {
        this((Set) set, (Set) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) ((i2 + 2) - (i2 | 2) != 0 ? SetsKt.emptySet() : set2));
    }

    public BrazeActivityLifecycleCallbackListener(boolean z2) {
        this(z2, false, null, null, 14, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z2, boolean z3) {
        this(z2, z3, null, null, 12, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z2, boolean z3, Set<? extends Class<?>> set) {
        this(z2, z3, set, null, 8, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z2, boolean z3, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z2;
        this.registerInAppMessageManager = z3;
        this.inAppMessagingRegistrationBlocklist = set == null ? SetsKt.emptySet() : set;
        this.sessionHandlingBlocklist = set2 == null ? SetsKt.emptySet() : set2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + BrazeActivityLifecycleCallbackListener.this.inAppMessagingRegistrationBlocklist;
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + BrazeActivityLifecycleCallbackListener.this.sessionHandlingBlocklist;
            }
        }, 6, (Object) null);
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean z2, boolean z3, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? true : z2, (2 & i2) != 0 ? true : z3, (Set<? extends Class<?>>) ((4 & i2) != 0 ? SetsKt.emptySet() : set), (Set<? extends Class<?>>) ((-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? SetsKt.emptySet() : set2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityCreated.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: " + activity.getClass();
            }
        }, 6, (Object) null);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.Companion.getInstance();
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityPaused.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Automatically calling lifecycle method: unregisterInAppMessageManager for class: " + activity.getClass();
                }
            }, 6, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityResumed.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Automatically calling lifecycle method: registerInAppMessageManager for class: " + activity.getClass();
                }
            }, 6, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityStarted.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Automatically calling lifecycle method: openSession for class: " + activity.getClass();
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityStopped.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Automatically calling lifecycle method: closeSession for class: " + activity.getClass();
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final void registerOnApplication(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, EO.Od("$\u007fL6gP,", (short) (C1607wl.Xd() ^ 23444)));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("s\u007ft\u0002}vp9mxv{ksx1Epnscup", (short) (C1607wl.Xd() ^ 18584))).getMethod(C1593ug.zd("('7\u00055631,+?5<<\u0012??F8LI", (short) (C1607wl.Xd() ^ 5473), (short) (C1607wl.Xd() ^ 18324)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Intrinsics.checkNotNull(context2, C1561oA.od("<B87i,)5448b$&_\"\u001f00Z.(W%%#`!'\u001d\u001cN\"&\u001c\u0010I\n\u0016\u000b\u0018\u0014\r\u0007O\u0002\u0010\u000fK]\f\u000b\u0006\u0002zw\n}\u0003\u0001", (short) (C1633zX.Xd() ^ (-17517))));
                Application application = (Application) context2;
                BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = this;
                Class<?> cls = Class.forName(C1561oA.Kd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0011!\"`t%&#!\u001c\u001b/%,,", (short) (C1580rY.Xd() ^ (-22823))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Wg.Zd("UvX[C2\u0019W\b\u0004s\"$D4!\u001b\u0006oV72\u001dDapqVS72)w\u0006maKuMF@\u000e\u0018\u0013\u0004iVLQL", (short) (C1633zX.Xd() ^ (-3214)), (short) (C1633zX.Xd() ^ (-27558))));
                Object[] objArr2 = {brazeActivityLifecycleCallbackListener};
                Method method2 = cls.getMethod(C1561oA.Xd("dX[^ik]k;^pfthtzNljji\u0001kuoNmyzqqt}\u0007", (short) (C1580rY.Xd() ^ (-862))), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(application, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.registerOnApplication.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to register this lifecycle callback listener directly against application class";
                }
            }, 4, (Object) null);
        }
    }

    public final void setInAppMessagingRegistrationBlocklist(final Set<? extends Class<?>> blocklist) {
        Intrinsics.checkNotNullParameter(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.setInAppMessagingRegistrationBlocklist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "setInAppMessagingRegistrationBlocklist called with blocklist: " + blocklist;
            }
        }, 6, (Object) null);
        this.inAppMessagingRegistrationBlocklist = blocklist;
    }

    public final void setSessionHandlingBlocklist(final Set<? extends Class<?>> blocklist) {
        Intrinsics.checkNotNullParameter(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.setSessionHandlingBlocklist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "setSessionHandlingBlocklist called with blocklist: " + blocklist;
            }
        }, 6, (Object) null);
        this.sessionHandlingBlocklist = blocklist;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Class<?> cls = activity.getClass();
        if (Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.shouldHandleLifecycleMethodsInActivity.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Skipping automatic registration for notification trampoline activity class.";
                }
            }, 6, (Object) null);
            return false;
        }
        if (z2) {
            if (this.sessionHandlingBlocklist.contains(cls)) {
                return false;
            }
        } else if (this.inAppMessagingRegistrationBlocklist.contains(cls)) {
            return false;
        }
        return true;
    }
}
