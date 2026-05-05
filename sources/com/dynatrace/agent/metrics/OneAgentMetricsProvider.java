package com.dynatrace.agent.metrics;

import android.content.Context;
import android.content.res.Resources;
import com.dynatrace.agent.common.connectivity.LocalBuild;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.events.enrichment.NetworkTypeExtensionsKt;
import com.dynatrace.agent.util.RootDetector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.XS2\u000fy\u0005<$a%yCIa\"}(\u000fWNumvJ`\u000bIƤ\u001cǝ)jZH\u00163m\u0016\u001d2Zom4]sK;xtd\b0S(8\b\t\u00195:Y \u0006)Fƚ\u0010\u001c6F\u0001@X\u0014]\u0007 \u0018,F0\u0003.\\\u0016WdMǰa<5-\u0011t\u000bR5cH|{\u0016\u000fX5!\u000faL8\t;C*=S1\u001d\u001b_M\u001aWqk\u0012935+as\u00067/ß\u0016Ʀ/O\u0015ƞC2j\u0007i`:*\u0002ՕeׂT\u000e0»K#\u001b@\u001c)\u00168X=[\u001dǴ\f\u00189z\u0003YFW\u0012`H\u0006!iF\u00195\u007fa4g =Ϣcޅ\u001dN?ަU\u001c,/\u0019nOhڍ\u0012f\u001dÑlyW?_O\u000eW\\\u001aq=\u001c\u0011Ͳf\b2ʶHI\u0006@\n ~&3Is9Q.Ƞ\u0006NLϙ\u000f\u0007f{axʖLX"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u000f>YY\"7v%\u0016MRHo2,\u007fukJ\u000bb,[L", "", "<dcDb9D1#\b\u0004^*\f\r@i\u000f<YC\u0001\u0015\u001dG|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7r32i0<S\u0006\t\u0005m,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1n]AX?M", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u0018E@#?b\u0007 5|\u001a?QRO5\u001d\u001e$zkF\rA6W\u007f'E[R=`a\u0007\u001b\u0017\u0012X\u0014N8bkUJ#{N;\u001eQ*S\u000bJh\n\u001b_k?s\u007fBi\u001f\u001d`\u001b\u007fP0lO#d\u000bO\u000bFr3b\u001bc'eH\u0004\u0005$z\u0017*lZ7UQ\u0017\u0002", ";`]BY(<b)\fzk", "", "5dc\u001aT5NT\u0015|\nn9|\u0016", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ";nS2_", "5dc\u001ab+>Z", "=rE2e:B]\"", "5dc\u001cf\u001d>`'\u0003\u0005g", "<dcDb9DA(z\n^", "2de6V,(`\u001d~\u0004m(\f\r9n", "", ">`R8T.><\u0015\u0007z", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentMetricsProvider {
    private final Context applicationContext;
    private final Function1<Context, Boolean> isDeviceRooted;
    private final String manufacturer;
    private final String model;
    private final NetworkConnectivityChecker networkConnectivityChecker;
    private final String osVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public OneAgentMetricsProvider(NetworkConnectivityChecker networkConnectivityChecker, Context applicationContext, Function1<? super Context, Boolean> isDeviceRooted) {
        Intrinsics.checkNotNullParameter(networkConnectivityChecker, "networkConnectivityChecker");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(isDeviceRooted, "isDeviceRooted");
        this.networkConnectivityChecker = networkConnectivityChecker;
        this.applicationContext = applicationContext;
        this.isDeviceRooted = isDeviceRooted;
        this.manufacturer = LocalBuild.INSTANCE.getManufacturer();
        this.model = LocalBuild.INSTANCE.getModel();
        this.osVersion = LocalBuild.INSTANCE.getOs();
    }

    public /* synthetic */ OneAgentMetricsProvider(NetworkConnectivityChecker networkConnectivityChecker, Context context, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkConnectivityChecker, context, (i2 + 4) - (i2 | 4) != 0 ? new Function1() { // from class: com.dynatrace.agent.metrics.OneAgentMetricsProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OneAgentMetricsProvider._init_$lambda$0((Context) obj));
            }
        } : function1);
    }

    public static final boolean _init_$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return RootDetector.INSTANCE.isDeviceRooted(it);
    }

    public final int deviceOrientation() throws Throwable {
        Context context = this.applicationContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("#2\u000b{9\u0016s ZIK2eQ:Xp\u007f_h\u001c\u0012r", (short) (C1633zX.Xd() ^ (-31909)), (short) (C1633zX.Xd() ^ (-31505)))).getMethod(ZO.xd("Mn\u001c\u0011\u0006FW5\u001d3I\u0007", (short) (Od.Xd() ^ (-13582)), (short) (Od.Xd() ^ (-9337))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getConfiguration().orientation;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean isDeviceRooted() {
        return this.isDeviceRooted.invoke(this.applicationContext).booleanValue();
    }

    public final String networkState() {
        return NetworkTypeExtensionsKt.getStringRepresentation(this.networkConnectivityChecker.currentNetworkState().getNetworkType());
    }

    public final String packageName() throws Throwable {
        Context context = this.applicationContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud(".pMReSv\u0018\u001c7MQPG,f7\"\u000f>9 \u001a", (short) (Od.Xd() ^ (-29072)), (short) (Od.Xd() ^ (-20616)))).getMethod(Ig.wd("\u001fMN\u0003c@\\j9\u0004jc\u0005\u0007", (short) (Od.Xd() ^ (-27167))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(str, EO.Od("#z\u0018\u000fh?gm:\u0019\u0004tKI\u007f`=7z", (short) (C1607wl.Xd() ^ 29316)));
            return str;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
