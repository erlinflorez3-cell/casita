package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU( *\teNog\u0005JbŏK\u000f\u0014\"\u0001j2I]xs\u0012\u0017˰JoU3UoC9fӛ6\u001bړb\"fxE\u0006 *Н\u0014v\tC\u0014R 5XphX=Q\u0013!*\u0006l(1\"jpf6vv\u000e>=.\u001bipZWq6|[\u001a^`7\u000f\u0007aL:P9E\u0015Sc1\u0015\u0003aE\u0003M\u0003U\u0005\u00179W1OseIp\u007fB's[\u001bq\u000b&\u000b\u001a\u0002d\u001a.CO\u0012S\u0019\u001e6\u000e\u0013{;S4\u0014\u0014?`0C\u0019\u0015\u0018T3E\u0005aAh\u0002\rDVЮcي\u001b+\bđC;!i_eދ\u001dg"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000e^CDzBs", "", "u(E", "!DB <\u0016'MxoZG\u001bvh\u0018Ci\u0007[-", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0001 \u0015Qn\u000eI\u0005n\u0014U\r\u001c\u0017v\u00148LCHA", "5dc 8\u001a,7\u0003gt>\u001d\\q\u001e__\u0011Y*_v\u0004\u0006m\u0018Dp'?c\u007f'7g\u00172ZC8gB\u001e\u000fieF\u0007`(\\v!UL\\:`\\{K", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`\u0017Pm\u0018;v2C#\\\u001cFiu7KM:kAs", "0tX9W\u001a>a'\u0003\u0005g", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000e^CDz\n", "4ha2U(LSt\n\u0006", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "Adb@\\6G2\u0019\u000evb3\u000b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\rMR7o;,j", "Adb@\\6Ga\u0007~\nm0\u0006\u000b=", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\"", "AtQ@V9BP\u0019\f\t", "", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i%m$<QMDYD\u001b#fn=\u0004c9\r_#OL$", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i%m$<QMDYD\u001b#fn=\u0004c9$", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005$\u007f", "", "4ha2U(LSt\u000f\na,\u0006\u00183c{7\u007fJ\n\u0006!Mo\u0017", "5dc\u000ec7EW\u0017z\nb6\u0006l8f\n", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011d\t';k\u0012=QMDO=\u001f\u001f>", "Bn3.g(\u001c] \u0006z\\;\u0001\u00138S\u000f$\u000b@", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0014U\r\u001c\u0015w\u001d5MAJo>'\u0003w]H\u00079", "AtQ@V9BP\u0019\f", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionEvents {
    public static final SessionEvents INSTANCE = new SessionEvents();
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder dataEncoderBuild = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(dataEncoderBuild, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = dataEncoderBuild;
    }

    private SessionEvents() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map, String str, String str2, int i2, Object obj) {
        String str3 = str;
        Map mapEmptyMap = map;
        if ((8 & i2) != 0) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if ((16 & i2) != 0) {
            str3 = "";
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, mapEmptyMap, str3, (i2 + 32) - (i2 | 32) == 0 ? str2 : "");
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber sessionSubscriber) {
        return sessionSubscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }

    public final SessionEvent buildSession(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map<SessionSubscriber.Name, ? extends SessionSubscriber> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState(subscribers.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState(subscribers.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), firebaseInstallationId, firebaseAuthenticationToken), getApplicationInfo(firebaseApp));
    }

    public final ApplicationInfo getApplicationInfo(FirebaseApp firebaseApp) throws Throwable {
        Intrinsics.checkNotNullParameter(firebaseApp, Qg.kd("cem_[Yj[6dc", (short) (Od.Xd() ^ (-9393)), (short) (Od.Xd() ^ (-28424))));
        Context applicationContext = firebaseApp.getApplicationContext();
        String strVd = hg.Vd("tv~plj{lGut1cqpkg`]ochf:echXje", (short) (OY.Xd() ^ 28701), (short) (OY.Xd() ^ 4796));
        Intrinsics.checkNotNullExpressionValue(applicationContext, strVd);
        short sXd = (short) (OY.Xd() ^ 29647);
        int[] iArr = new int["BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?".length()];
        QB qb = new QB("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("SR^;QTYPKJ0DUN", (short) (C1580rY.Xd() ^ (-25621))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(applicationContext, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Yd("[i`omhd/erryku|7Mzz\u0002s\b\u0005", (short) (ZN.Xd() ^ 29203))).getMethod(Xg.qd(",+;\u0018*-6-43\u001c1?3:9G", (short) (C1499aX.Xd() ^ (-19489)), (short) (C1499aX.Xd() ^ (-31648))), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(applicationContext, objArr2);
                Class<?> cls = Class.forName(Jg.Wd("/:Yf\rJ+\bBq:\u001e\u001a@a\\F\u0005lPz\u001cm\u0003Rs`Hz/`[\u0014", (short) (ZN.Xd() ^ 2579), (short) (ZN.Xd() ^ 25194)));
                Class<?>[] clsArr = new Class[2];
                short sXd2 = (short) (ZN.Xd() ^ 27650);
                short sXd3 = (short) (ZN.Xd() ^ 14305);
                int[] iArr2 = new int["\u0004u8cL\u000fg,L\u0007\f1aoN+".length()];
                QB qb2 = new QB("\u0004u8cL\u000fg,L\u0007\f1aoN+");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr3 = {str, 0};
                Method method3 = cls.getMethod(C1626yg.Ud("X\u001a ld\u0013B(yu#\u001a\u000e$", (short) (ZN.Xd() ^ 21790), (short) (ZN.Xd() ^ 29090)), clsArr);
                try {
                    method3.setAccessible(true);
                    PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                    String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
                    String applicationId = firebaseApp.getOptions().getApplicationId();
                    Intrinsics.checkNotNullExpressionValue(applicationId, Ig.wd("\u0014g@\u001at\u0016Rjv)-F<-7\tQH\u0014$\u0018\u0002ec1lK)ulU\rV", (short) (C1499aX.Xd() ^ (-8500))));
                    String str2 = Build.MODEL;
                    short sXd4 = (short) (Od.Xd() ^ (-13508));
                    int[] iArr3 = new int["zM\u0014qX".length()];
                    QB qb3 = new QB("zM\u0014qX");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Intrinsics.checkNotNullExpressionValue(str2, new String(iArr3, 0, i4));
                    String str3 = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(str3, C1561oA.Qd("_QWOJ[L", (short) (ZN.Xd() ^ 32110)));
                    LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
                    Intrinsics.checkNotNullExpressionValue(str, C1593ug.zd("]OR[RYXBVc\\", (short) (C1633zX.Xd() ^ (-17777)), (short) (C1633zX.Xd() ^ (-16553))));
                    String str4 = packageInfo.versionName;
                    if (str4 == null) {
                        str4 = strValueOf;
                    }
                    String str5 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str5, C1561oA.od("namsc]^nnj\\h", (short) (C1633zX.Xd() ^ (-13259))));
                    ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
                    Context applicationContext2 = firebaseApp.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, strVd);
                    ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
                    ProcessDetailsProvider processDetailsProvider2 = ProcessDetailsProvider.INSTANCE;
                    Context applicationContext3 = firebaseApp.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, strVd);
                    return new ApplicationInfo(applicationId, str2, C1561oA.Kd("SPSR[", (short) (FB.Xd() ^ 17095)), str3, logEnvironment, new AndroidApplicationInfo(str, str4, strValueOf, str5, currentProcessDetails, processDetailsProvider2.getAppProcessDetails(applicationContext3)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
