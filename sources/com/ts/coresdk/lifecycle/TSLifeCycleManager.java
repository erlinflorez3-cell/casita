package com.ts.coresdk.lifecycle;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDR\u0005|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007lkA0R\u0005P.hS2\u000fy\u001a<$a&yCI^\"Ԃ*\teNog|JbŏK\u000f\u001c\u0016\u0001jBI]xc\u001d\u00172XoE\u074ccڎ[8\u0011td(X3!X\u0001E\u0010 *X\u0014\u0005\t[K:\u0016ضDr@s\u001boM/ \u0013V /-\rk\\D`l\f>u#ɨmDT4m@E`\u001bEl';\t\u0012\"9NO5C6٨\u0007\tXZM\u0016\b\u0011K\u001c\u0001'U=yweDp\u007fB)[U\u001bs\u000b(r\u0004\u007fuR;˦SeQg\u001c@@\u0010\n&T\u0004<\u0018WL<;2f6\"y\tɤWBV\u001bl\\H\u0010oQ/%.E[=)tiai-\u0015K߉\t\u000f$>\u000f\tipb*x\u0015If(U?_X=vbPmǀq\u0006v~\u0010DLMU\u001dG{?@G)EiQ#O\u007f2LR}\u000f\u0005\u000f}\u001a}ʐLB(\f$Or\u001e\u001ax\\d3}\u0001Xf:)MJhM\u0012ݔ\u0017\"b\u0016J;m%\\n\u0001i\u0019_\u000e\u000e3=~7\b\u00032\"Ć=`9T_}Xv`},?jt5\\tPk\f\tmn\"ĘLl\u0016~\nW\u001f&!1Ww,6<1G]CH9\u001e\u0001ASȅk˖l\u0014\u0007V9&\u0011lt\u0004\u0017\bh\\\u001fs>}ͅ0\u0001h$3F_;iPc/\u0001L\r)\u0017\u0003\u001c\u007fupzPtv&{e\u007fH\u0016HB\u007f8k\u001d=\u0007_2XΓGʆviYO\u00182\t\t"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+j", RemoteSettings.FORWARD_SLASH_STRING, "", "", "0y", "\u001aiPCTuNb\u001d\u0006DL,\f^", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0w", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", AdkSettings.PLATFORM_TYPE_MOBILE, "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+Se7", "", "0x", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "1", ">/", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+SLP'mg-NT;ESN\u0016Y`rJ%\u0012gkJ2\u0014\u0002U?*D", "", "uKR<`uMab|\u0005k,\u000b\b5/\u0007,|@~+\u0015NoW+d\f9Z}}Kk\u001d.5?Dg6\u001e\"'E(tJ0Ov\u0005[JU,FO\u0001=!#Z\u001b,'\u0014\fV=\"t\u001az\u0010", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ">0", "=m00g0OW(\u0013Xk,x\u0018/d", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015l}Cx\rI\u0001)4#\b.\u0001J&7LJ;Aw\u000f", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "\u0017SB\u0019\\->1-|\u0002^\u0016y\u0017/r\u0011(\t\u001e|\u001e\u001eDk\fB", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSLifeCycleManager implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18280a = new a(null);
    private static volatile TSLifeCycleManager bA = null;
    public final Context bx;
    private final List<b> by;
    private Set<String> bz;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r\"4\u0012}\u0011njGӄJJ^\u008c\u0003SX\u001f4\u001bB(s$ FkY(}:\t}M\u0018m|Lr\rY\u000e4\u0017?~߽MW~a \u0014zW}EKM\u001e@id\u00036\u001d `!~\u000eڱ\u0005\u001c0N\u001e}CXY\u0014*0nsjV\u001bM\u001d\u001a@\u0005\u00054Ә\"^mVDO5rH8;\u0003\u0018E~+m0\u0015M;E\u001b;˼zc$4N>}23]\u001b\u0007\u0001^o\u0007MqU\u0005\u0017&W/Wuo6\u0007\u0001Z)ۣS\u000fc|4aMfn\u0017?+}f{T\u001c(\u0010z*\f\u0003\u0018؝\n)N9;!/\u001d\u001c?\rr\u0002C\u0001\u0006lB\u0018z\u00105]9ő7-?'tX*H'[O{3\u0010d7ъr#aa\u001cn](b\u0007i1\u007fC\u0004\\ݳ\u000e[C|\u0012~"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+SLP'mg-NT;ESN\u0016Y`rJ%\u0012gkJ2\u0014\u0002U?*D", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ">/", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ">0", "", "=m00g0OW(\u0013Xk,x\u0018/d", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015l}Cx\rI\u0001)4#\b.\u0001J&7LJ;Aw\u000f", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "=m0=c3BQ\u0015\u000e~h5`\u0012\fa}.}M\u000b' F", "u(E", "=m0=c3BQ\u0015\u000e~h5`\u0012\u0010o\r(}M\u000b' F", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public interface ITSLifeCycleObserverCallback {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            public static void onActivityCreated(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivityDestroyed(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivityPaused(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivityResumed(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivitySaveInstanceState(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(bundle, "");
            }

            public static void onActivityStarted(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivityStopped(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback, Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onApplicationInBackground(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback) {
            }

            public static void onApplicationInForeground(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback) {
            }
        }

        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);

        void onApplicationInBackground();

        void onApplicationInForeground();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0005%4\u0012\u0006јlʘ:FǏ\u0016H\\[\u00141\u0015kڷ8&a+\u007fK\u0004j(\u0003:\t}M\u0018k|Nr\u000bq\u0012L\u001bѱn.OZ\u0007cb%@D\bAIL\u001e<o`36[ڗ>ŕ<}\r\u0003 *V\u0011"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+Sd7", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+j", "0@", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\u0004){>\u0015\u0015\u001eG9|*])6Y[45t\u0016\u0016IL7m4+j", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", ExifInterface.GPS_MEASUREMENT_2D, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\r.\u0001k ;MQ:q}%\u0019ia7\u001ba3N@\u001653R-\\0\u0007;\u001b\u0012B\nW'\u000f\u0005f\u0017", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TSLifeCycleManager d(Context context) {
            TSLifeCycleManager tSLifeCycleManager;
            Intrinsics.checkNotNullParameter(context, "");
            if (TSLifeCycleManager.bA != null) {
                TSLifeCycleManager tSLifeCycleManager2 = TSLifeCycleManager.bA;
                Intrinsics.checkNotNull(tSLifeCycleManager2);
                return tSLifeCycleManager2;
            }
            synchronized (this) {
                if (TSLifeCycleManager.bA == null) {
                    a aVar = TSLifeCycleManager.f18280a;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1626yg.Ud(">X[mH5\u000b_[Ic-q*Yi8p'\u0015h_h", (short) (C1607wl.Xd() ^ 24755), (short) (C1607wl.Xd() ^ 21578))).getMethod(Ig.wd("Ux\u00066=\u0019-A\tV\u0011\"XcZ\u001fX^\u0006C{", (short) (Od.Xd() ^ (-4445))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Context context2 = (Context) method.invoke(context, objArr);
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        TSLifeCycleManager.bA = new TSLifeCycleManager(context2, null);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                tSLifeCycleManager = TSLifeCycleManager.bA;
                Intrinsics.checkNotNull(tSLifeCycleManager);
            }
            return tSLifeCycleManager;
        }
    }

    private static final class b implements ITSLifeCycleObserverCallback {
        private final WeakReference<ITSLifeCycleObserverCallback> bB;
        private a bC;

        public enum a {
            None,
            Foreground,
            Background
        }

        public b(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback) {
            Intrinsics.checkNotNullParameter(iTSLifeCycleObserverCallback, "");
            this.bB = new WeakReference<>(iTSLifeCycleObserverCallback);
            this.bC = a.None;
        }

        private final ITSLifeCycleObserverCallback a(WeakReference<ITSLifeCycleObserverCallback> weakReference) {
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback = weakReference.get();
            if (iTSLifeCycleObserverCallback != null) {
                return iTSLifeCycleObserverCallback;
            }
            return null;
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityCreated(activity, bundle);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityDestroyed(activity);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityPaused(activity);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityResumed(activity);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivitySaveInstanceState(activity, bundle);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityStarted(activity);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
            if (iTSLifeCycleObserverCallbackA != null) {
                iTSLifeCycleObserverCallbackA.onActivityStopped(activity);
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onApplicationInBackground() {
            if (this.bC != a.Background) {
                ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
                if (iTSLifeCycleObserverCallbackA != null) {
                    iTSLifeCycleObserverCallbackA.onApplicationInBackground();
                }
                this.bC = a.Background;
            }
        }

        @Override // com.ts.coresdk.lifecycle.TSLifeCycleManager.ITSLifeCycleObserverCallback
        public void onApplicationInForeground() {
            if (this.bC != a.Foreground) {
                ITSLifeCycleObserverCallback iTSLifeCycleObserverCallbackA = a(this.bB);
                if (iTSLifeCycleObserverCallbackA != null) {
                    iTSLifeCycleObserverCallbackA.onApplicationInForeground();
                }
                this.bC = a.Foreground;
            }
        }
    }

    private TSLifeCycleManager(Context context) throws Throwable {
        this.bx = context;
        Intrinsics.checkNotNull(context);
        Application application = (Application) context;
        Object[] objArr = {this};
        Method method = Class.forName(EO.Od("$X<2g/N'\u001a-'F\u00052.\f6Fkv+hQ", (short) (C1607wl.Xd() ^ 24350))).getMethod(C1593ug.zd("\u000f\u0003\u0006\t\u0014\u0016\b\u0016e\t\u001b\u0011\u001f\u0013\u001f%x\u0017\u0015\u0015\u0014+\u0016 \u001ax\u0018$%\u001c\u001c\u001f(1", (short) (C1499aX.Xd() ^ (-15441)), (short) (C1499aX.Xd() ^ (-17865))), Class.forName(C1561oA.Qd("\".#0,%\u001fg\u001a('cu$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019Mi\u000b\u001b\u000f\u001b\r\u0017\u001bl\t\u0005\u0003\u007f\u0015}\u0006}Zw\u0002\u0001ust{\u0003", (short) (C1633zX.Xd() ^ (-882)))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
            this.by = Collections.synchronizedList(new ArrayList());
            this.bz = new LinkedHashSet();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public /* synthetic */ TSLifeCycleManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void b(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback) {
        if (c(this.bx)) {
            iTSLifeCycleObserverCallback.onApplicationInForeground();
        }
    }

    private final boolean c(Context context) throws Throwable {
        Object[] objArr = {C1561oA.od("lm}q}oy}", (short) (ZN.Xd() ^ 4523))};
        Method method = Class.forName(C1561oA.Kd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (OY.Xd() ^ 20254))).getMethod(C1561oA.Xd("%$4\u0014;68*3\u001a-;@4/2", (short) (C1499aX.Xd() ^ (-13447))), Class.forName(Wg.Zd("z?*bs\u007fJ%\u0003\u0017\u0012\u007fC\bb,", (short) (OY.Xd() ^ 5597), (short) (OY.Xd() ^ 10490))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) objInvoke).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                String str = runningAppProcessInfo.processName;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("Yg^mc^Z%cppwakr-+XX_I]Z", (short) (FB.Xd() ^ 4792))).getMethod(Qg.kd(">;I$45<163\u001b-8/", (short) (FB.Xd() ^ 30780), (short) (FB.Xd() ^ 11709)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (Intrinsics.areEqual(str, (String) method2.invoke(context, objArr2)) && runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return false;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void a(ITSLifeCycleObserverCallback iTSLifeCycleObserverCallback) {
        Intrinsics.checkNotNullParameter(iTSLifeCycleObserverCallback, "");
        b bVar = new b(iTSLifeCycleObserverCallback);
        this.by.add(bVar);
        b(bVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivityCreated(activity, bundle);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivityDestroyed(activity);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivityPaused(activity);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivityResumed(activity);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            if (this.bz.size() == 0) {
                List<b> list2 = this.by;
                Intrinsics.checkNotNullExpressionValue(list2, "");
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onApplicationInForeground();
                }
            }
            Set<String> set = this.bz;
            String className = activity.getComponentName().getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            set.add(className);
            List<b> list3 = this.by;
            Intrinsics.checkNotNullExpressionValue(list3, "");
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).onActivityStarted(activity);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        List<b> list = this.by;
        Intrinsics.checkNotNullExpressionValue(list, "");
        synchronized (list) {
            List<b> list2 = this.by;
            Intrinsics.checkNotNullExpressionValue(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onActivityStopped(activity);
            }
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                callingActivity.getClassName();
            }
            this.bz.remove(activity.getComponentName().getClassName());
            if (this.bz.size() == 0) {
                List<b> list3 = this.by;
                Intrinsics.checkNotNullExpressionValue(list3, "");
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).onApplicationInBackground();
                }
            }
        }
    }
}
