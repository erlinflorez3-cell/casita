package com.dynatrace.agent.lifecycle.callback;

import android.app.Activity;
import android.app.Application;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.view.ViewContextManagerApi;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Xg;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{B-cҕyCIU\"}(\nWN}gvJ`\u000bIƤ\u001cǝ)jZH\u0016\u001em\u0016\u001d2Zom4]sK;xtd\b060<\u0012\u0005/\u001f:L\u001e|\u0013Cy\u0013ܘ4BvB`\u0016\u0016\t(\u001e\u001e>N\u000ef`u\\NH\u001bj\u0003=1\u0012\u0002B|4\u00104\u000b]%F\u00038S\u000b*,9RO5C2\u0004\u0007\u0015bs?1P8QUt5'CI\"X\rݜ\u0002Џ\u0019+WՕ.~4^\u001dQ\u000f\u000f}ˆQӍOP\u0016ߊH\u0007\n\u0011T\u0004<\u000b}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001YXP0e\u0019Ș|ˋ:\u0017-Į\u00047G%~Q\u0010Fo\u05ceC߉\t\r&ŀѐr4"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~Wy'>j\u0012,S\r\u0019{A+\u0015qp*\u000bc>=\u0004#ERN92", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~Wy'>j\u0012,S\r\u0018gB\u001epfp=\u0018g;b]+HLL@ZYr\u001b\u0010\u0019a\u000bJ)\u0013\u0013/", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "DhTD66Gb\u0019\u0012\nF(\u0006\u00051e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0016IL7m4+pse\u000f", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "=mT\u000eZ,Gbv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0016\u001b\u0011]\u000eJ\u0005)?ba)8w#6IR?u=\t\"rr=\u0006c9$]%QT\u0018+p[nL!\u000eX\u000e\u0018'\u000f\u0005bPm\u007fH71Q\u001dM\u0002MF\u000b\u0015%\u000eHyX>_\fIy\"QL->-UhxTKIas`\u0017jf8EE+\u0018o\u0015*lZ7_bQ\u001bz\u001cx{pC(\b4\">7WHExd\u0006^0\u001f'}w\u001bA6~4u1\u0006D72s\tUpm\u0002O", "/ka2T+R/\u0018}z]", "", "Adc\"c", "", "BdP?76P\\", "=m00g0OW(\u0013g^:\r\u0011/d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "=m00g0OW(\u0013eZ<\u000b\t.", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CurrentViewTracker extends BaseActivityLifecycleCallbacks {
    private boolean alreadyAdded;
    private final Application applicationContext;
    private final OneAgentConfiguration oneAgentConfiguration;
    private final SessionInformationProvider sessionInformationProvider;
    private final ViewContextManagerApi viewContextManager;

    public CurrentViewTracker(SessionInformationProvider sessionInformationProvider, ViewContextManagerApi viewContextManager, Application applicationContext, OneAgentConfiguration oneAgentConfiguration) {
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(viewContextManager, "viewContextManager");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(oneAgentConfiguration, "oneAgentConfiguration");
        this.sessionInformationProvider = sessionInformationProvider;
        this.viewContextManager = viewContextManager;
        this.applicationContext = applicationContext;
        this.oneAgentConfiguration = oneAgentConfiguration;
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (sessionInformationMetricsCollectSessionInfo.isActiveGrailSession()) {
            this.viewContextManager.clearContext();
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "stop view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo);
        }
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        String className = activity.getComponentName().getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        if (!sessionInformationMetricsCollectSessionInfo.isActiveGrailSession() || className.length() <= 0) {
            Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "start view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo + " name: " + className);
        } else {
            ViewContextManagerApi.DefaultImpls.storeContext$default(this.viewContextManager, null, className, 1, null);
        }
    }

    public final void setUp() throws Throwable {
        boolean z2 = (this.oneAgentConfiguration.getInstrumentationFlavor() == InstrumentationFlavor.FLUTTER || this.oneAgentConfiguration.getInstrumentationFlavor() == InstrumentationFlavor.REACT_NATIVE || this.oneAgentConfiguration.getInstrumentationFlavor() == InstrumentationFlavor.MAUI) ? false : true;
        if (this.oneAgentConfiguration.getActivityMonitoring() && z2 && !this.alreadyAdded) {
            Application application = this.applicationContext;
            Object[] objArr = {this};
            Method method = Class.forName(C1561oA.yd("+7,95.(p#10l~-,'C<9K?DB", (short) (C1499aX.Xd() ^ (-2941)))).getMethod(Xg.qd("aUX[fhZh8[mcqeqwKiggf}hrlKjvwnnqz\u0004", (short) (ZN.Xd() ^ 8270), (short) (ZN.Xd() ^ 12702)), Class.forName(C1561oA.Yd("N\\Sb`[W\"Vfg&:jkhfa`tjqq(Fi{q\u007fs\u007f\u0006Ywuut\fv\u0001zYx\u0005\u0006||\u007f\t\u0012", (short) (C1633zX.Xd() ^ (-23060)))));
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                this.alreadyAdded = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final void tearDown() {
        this.applicationContext.unregisterActivityLifecycleCallbacks(this);
        this.alreadyAdded = false;
    }
}
