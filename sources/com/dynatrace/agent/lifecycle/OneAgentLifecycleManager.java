package com.dynatrace.agent.lifecycle;

import android.app.Application;
import android.os.Build;
import com.dynatrace.agent.lifecycle.callback.ActivityLifecycleListener;
import com.dynatrace.agent.lifecycle.callback.ActivityLifecycleListenerLegacy;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`\\2şs{J$cҕyCIU\"}(\tUȞ}˧\u001fJ\t\n\u0004,\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\nڶ6$>\u007f\u0013\bb.V\u001c\u000fzqXT\u0016>N\t:\u0001\u001a\u001e\u0011(\u0012\u001e>N\u0002tմiߑ:Htҗ\u000b;1\u0007\u0002B|,6ܡ~֔\u0011F\\܋]\u0003o&C@e>kǯ_Ϋ\u000bRcΪSK\u007fG\u001dhU2\u0002ɡuɱ:X\bϬƬ/^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~C\u0007 \u0013o\u00167\\*?l4\u001c)fh9n_5Jx'T\"", "", "/o_ g(Kb)\nbZ5x\u000b/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~5\t+%|\u0012;\\SFS0'\u0011jaF\\", "Dhb6U0EW(\u0013bZ5x\u000b/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~J\u0002.;j\u001a5QROS0'\u0011jaF\\", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u001e\u001bHo\fPt,5#Y+B[%*ZRKv\u001c\u001a\u001edc9\u00149\u0013L\u0001/\u0011Kb5Xa\u007f9\u0012\u0012$\nP+\u0016\u0014#H(oD53\u00063IK,l\u000f\u0010\u0013\u0012<n\u007fV>\fPu\u0017uN~OBb^\u0007QED,&o\u0017)xgEA(\u0012m(\u001frY\u0004Ml", "7r0=c\u001aMO&\u000ez]", "", "/bc6i0Mg\u007f\u0003{^*\u0011\u00076ef,\nO\u0001 \u0017T", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "=m0=c\u001aMO&\u000e", "", "=m04X5MA\u001c\u000f\n]6\u000f\u0012", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentLifecycleManager {
    private final Application.ActivityLifecycleCallbacks activityLifecycleListener;
    private final AppStartupManager appStartupManager;
    private final Application application;
    private boolean isAppStarted;

    public OneAgentLifecycleManager(AppStartupManager appStartupManager, VisibilityManager visibilityManager, Application application) {
        Intrinsics.checkNotNullParameter(appStartupManager, "appStartupManager");
        Intrinsics.checkNotNullParameter(visibilityManager, "visibilityManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.appStartupManager = appStartupManager;
        this.application = application;
        this.activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new ActivityLifecycleListener(appStartupManager, visibilityManager) : new ActivityLifecycleListenerLegacy(appStartupManager, visibilityManager);
    }

    public final void onAgentShutdown() {
        this.isAppStarted = false;
        this.application.unregisterActivityLifecycleCallbacks(this.activityLifecycleListener);
    }

    public final void onAppStart() throws Throwable {
        if (this.isAppStarted) {
            return;
        }
        this.isAppStarted = true;
        this.appStartupManager.onStartupPhase(AppStartupPhase.APPLICATION_CREATE);
        Application application = this.application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleListener;
        short sXd = (short) (C1580rY.Xd() ^ (-16549));
        short sXd2 = (short) (C1580rY.Xd() ^ (-4489));
        int[] iArr = new int["\u001e*\u001f,(!\u001bc\u0016$#_q \u001f\u001a\u0016\u000f\f\u001e\u0012\u0017\u0015".length()];
        QB qb = new QB("\u001e*\u001f,(!\u001bc\u0016$#_q \u001f\u001a\u0016\u000f\f\u001e\u0012\u0017\u0015");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (ZN.Xd() ^ 9164);
        short sXd4 = (short) (ZN.Xd() ^ 9032);
        int[] iArr2 = new int["v\u0003w\u0005\u0001ys<n|{8Jxwrngdvjom\">_ocoakoA]YWTiRZR/LVUJHIPW".length()];
        QB qb2 = new QB("v\u0003w\u0005\u0001ys<n|{8Jxwrngdvjom\">_ocoakoA]YWTiRZR/LVUJHIPW");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {activityLifecycleCallbacks};
        Method method = cls.getMethod(C1561oA.ud("VHIJSSCO\u001d>NBN@JN <863H191\u000e+54)'(/6", (short) (Od.Xd() ^ (-8089))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
