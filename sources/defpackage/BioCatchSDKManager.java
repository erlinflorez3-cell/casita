package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.biocatch.client.android.sdk.BioCatchClient;
import com.biocatch.client.android.sdk.contract.ExtendedOptions;
import com.biocatch.client.android.sdk.contract.LogLevel;
import com.biocatch.client.android.sdk.contract.State;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.facebook.react.bridge.ReactMethod;
import defpackage.BioCatchSDKManager;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001aAX<6(MQ\u001clYD\u0014x\u0012+g\u007f5Q", "", "u(E", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sy\r9c{7yCz$\u0017No\nJv"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BioCatchSDKManager {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BioCatchSDKManager";

    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{B-c$wJCU(\u0004*\tUSog\u0005Jb\u000bI\u0010\fǤy\u0001ߚyU'\\R\u00148BņC3[o\u0006gnwN\u0005N6R<\b\n\u0019\u001aXJ@|\tIc\u000e(/nwjf\u0013M\u0013\"*\u0014N\"\u0011\u001e\u000bq^8Xl\f>E\"1r\u000bt5jH|{\u0011vZ5\u0013\u000fc4*n>e)+S\u0011\u000fjiO\u0005Oqk\u000fx)7+wwm5\u0007\t\\;9[%]!*\r\u000b_f$)AN\u0012R\u0001\".w\t\u0004%J\u0014\u0010\u0016'v0=\u001cv\b<7\u000bq\u0002I\u0019(lO\u0018z\u0010:G+\u000e9C;1e\u007fhk-T7\n\r%,3\u0003~!\nV\u001eb%\u001b\u0003{g0\u007fI\u0006n\\\u0018q=\u001c\b!h\u00100\u001c2]~]\u0003AB\u001d%EcQ11m\u0012Hrq\u0007\u0007ph\u0002mhGn+7<E9!\f\tH\u0015\u000byVlZB\u0010{#\u0005\u001b\u0004\b!(t\u0006L#5\u0010|YxkzM\f\u000e;.\u0015@\"\u001dy\u001eo9\r7eUq!yR%\u0016oBp\u000bphXR:a\r<(2Vr(\u0006\fF^\fA<Os,4Z5/[CQKNPS\u0015\t\u000e^\u0019\u0014\rgK$1}Tz\u0017\u0007h^\u0007n\u0016\u007fy@\u0003`05Y_E\u001b6UPrD~3\u0007-w\u0016F\u0016U\u000eQ5F\u0004j\u0014 D\u001eiW=S+\u0011\u0015(`\u0004]KZx}Sc\u0011U\u0002-\u000e\u0015;v6\u007f\u0016zr<`\u0019T_V'\"%b\t\"6mHNo]\u0013G\u0012X;_La\u000b\u0003\b>~<\u000b\u001e7\u001eS\u0003 (\u000bKEE=\u001cDyD3#gui\u001e5*h\u0015&\u0003\u007f\u001c,\u0012  jW]@VPKo}l>T\u0001\tBVr\u0010\u0016R\u000bD\raRQf\u0001VfQ!.,oOR\u001b\u000en[h\u0017 \u0004B4w,\nB,\u001b\u000fW+\u0011[[\u007f{}Ml\u000bx\u0019\u001a\r\f1\u001d\u00162<N_ \u0011\u0017N\u001esF:q?p\u001bT\tR6\\B\u0016\u0011[V\u007f\u0005>\u00020Ze\u000f%:Z\u0002KX\u001eT'ffJ\u0015`sd7)/\b_?,yM13o\u001d\u07bf\u0002ҕ6\u0001[߹ͨ\u001f\n"}, d2 = {"\u001aAX<6(MQ\u001clYD\u0014x\u0012+g\u007f5:\u001e\u000b\u001f\"Cx\u0012F\u007fz", "", "u(E", "\"@6", "", "1gP;Z,\u001c]\"\u000ezq;", "", "1n]AX?M<\u0015\u0007z", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "4kd@[", "5dc g(MS", "5dc#X9LW#\b", ">`d@X", "@dbB`,", "Adc\u0010h:M]!~\b;9x\u0012.", "1tbAb4>`u\fvg+", "Adc\u0019b.%S*~\u0002", ":nV\u0019X=>Z|\b\n", "", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "1tbAb4>`\u0007~\tl0\u0007\u0012\u0013D", "AsP?g\u001a\u001d9", "Et_\"e3", "1tbAb4>`|]", "6xQ?\\+,] \u000f\nb6\u0006", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "As^=", "CoS.g,\u001cc'\u000e\u0005f,\nv/s\u000e,\u0006Idu", "@dP0gsGO(\u0003\f^sy\r9c{7yCz$\u0017No\nJv"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                try {
                    iArr[State.STOPPED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.STARTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.STARTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[State.PAUSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[State.FAULTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeContext$default(Companion companion, String str, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            companion.changeContext(str, application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void changeContext$lambda$4(String contextName, Function1 function1) {
            Intrinsics.checkNotNullParameter(contextName, "$contextName");
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTING || BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.changeContext(contextName);
                    String str = "BioCatch context changed: " + contextName;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str2 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void flush$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 & 2) != 0) {
                function1 = null;
            }
            companion.flush(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void flush$lambda$22(Function1 function1) {
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.flush();
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getState$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 2) - (i2 | 2) != 0) {
                function1 = null;
            }
            companion.getState(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getState$lambda$28(Function1 function1) {
            try {
                State state = BioCatchClient.INSTANCE.getState();
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "ERROR" : "FAULTED" : "PAUSED" : "STARTED" : "STARTING" : "STOPPED";
                HashMap map = new HashMap();
                map.put(SentryThread.JsonKeys.STATE, new StringBuilder().append(state.ordinal()).toString());
                map.put("stateName", str);
                String str2 = "BioCatch state: " + map;
                if (function1 != null) {
                    function1.invoke(str);
                }
            } catch (Exception e2) {
                String str3 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke("ERROR");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getVersion$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                function1 = null;
            }
            companion.getVersion(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void getVersion$lambda$31(Function1 function1) {
            try {
                String version = BioCatchClient.INSTANCE.getVersion();
                String str = "BioCatch version: " + version;
                if (function1 != null) {
                    function1.invoke(version);
                }
            } catch (Exception e2) {
                String str2 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke("X.X.X");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void pause$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                function1 = null;
            }
            companion.pause(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void pause$lambda$13(Function1 function1) {
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTING || BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.pause();
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void resume$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 2) - (i2 | 2) != 0) {
                function1 = null;
            }
            companion.resume(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void resume$lambda$16(Function1 function1) {
            try {
                if (BioCatchClient.INSTANCE.getState() == State.PAUSED) {
                    BioCatchClient.INSTANCE.resume();
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setCustomerBrand$default(Companion companion, String str, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 4) - (i2 | 4) != 0) {
                function1 = null;
            }
            companion.setCustomerBrand(str, application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setCustomerBrand$lambda$25(String customerBrand, Function1 function1) {
            Intrinsics.checkNotNullParameter(customerBrand, "$customerBrand");
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTING || BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.setCustomerBrand(customerBrand);
                    String str = "BioCatch setCustomerBrand: " + customerBrand;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str2 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setLogLevel$default(Companion companion, int i2, Application application, Function1 function1, int i3, Object obj) throws Throwable {
            if ((i3 + 4) - (i3 | 4) != 0) {
                function1 = null;
            }
            companion.setLogLevel(i2, application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setLogLevel$lambda$34(int i2, Function1 function1) {
            try {
                LogLevel logLevel = LogLevel.ERROR;
                if (i2 == 1) {
                    logLevel = LogLevel.DEBUG;
                } else if (i2 == 2) {
                    logLevel = LogLevel.INFO;
                } else if (i2 == 3) {
                    logLevel = LogLevel.WARNING;
                } else if (i2 == 4) {
                    logLevel = LogLevel.ERROR;
                } else if (i2 == 6) {
                    logLevel = LogLevel.VERBOSE;
                }
                BioCatchClient.INSTANCE.setLogLevel(logLevel);
                String str = "BioCatch Log Level: " + logLevel;
                if (function1 != null) {
                    function1.invoke(true);
                }
            } catch (Exception e2) {
                String str2 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startNewSession$default(Companion companion, String str, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 4) - (i2 | 4) != 0) {
                function1 = null;
            }
            companion.startNewSession(str, application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startNewSession$lambda$10(String str, Function1 function1) {
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTING || BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.startNewSession(str);
                    String str2 = "BioCatch new session started: " + str;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str3 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startSDK$default(Companion companion, String str, String str2, String str3, Application application, boolean z2, Activity activity, Function1 function1, int i2, Object obj) throws Throwable {
            Activity activity2 = activity;
            boolean z3 = z2;
            if ((i2 & 16) != 0) {
                z3 = false;
            }
            if ((i2 & 32) != 0) {
                activity2 = null;
            }
            companion.startSDK(str, str2, str3, application, z3, activity2, (i2 & 64) == 0 ? function1 : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0079: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:34:?, block:B:18:0x0079 */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0093: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:36:?, block:B:22:0x0093 */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x00ad: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:38:?, block:B:26:0x00ad */
        public static final void startSDK$lambda$1(Activity activity, String wupUrl, String customerID, Application application, String str, Function1 function1, boolean z2) {
            Function1 function12;
            Function1 function13;
            Function1 function14;
            Intrinsics.checkNotNullParameter(wupUrl, "$wupUrl");
            Intrinsics.checkNotNullParameter(customerID, "$customerID");
            Intrinsics.checkNotNullParameter(application, "$application");
            try {
                if (BioCatchClient.INSTANCE.getState() != State.STOPPED) {
                    if (function1 != null) {
                        function1.invoke(false);
                        return;
                    }
                    return;
                }
                ExtendedOptions extendedOptions = new ExtendedOptions();
                extendedOptions.setEnableHybridSolution(z2);
                if (activity != null) {
                    BioCatchClient.INSTANCE.start(wupUrl, customerID, application, str, extendedOptions, activity);
                } else {
                    BioCatchClient.start$default(BioCatchClient.INSTANCE, wupUrl, customerID, application, str, extendedOptions, null, 32, null);
                }
                String str2 = "BioCatch SDK started with csid: " + str;
                if (function1 != null) {
                    function1.invoke(true);
                }
            } catch (NullPointerException e2) {
                String str3 = "An exception (SDKM - NPE) occurred with BioCatch: " + e2;
                if (function14 != null) {
                    function14.invoke(false);
                }
            } catch (RuntimeException e3) {
                String str4 = "An exception (SDKM - RE) occurred with BioCatch: " + e3;
                if (function13 != null) {
                    function13.invoke(false);
                }
            } catch (Exception e4) {
                String str5 = "An exception (SDKM - E) occurred with BioCatch: " + e4;
                if (function12 != null) {
                    function12.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stop$default(Companion companion, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 2) - (i2 | 2) != 0) {
                function1 = null;
            }
            companion.stop(application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void stop$lambda$19(Function1 function1) {
            try {
                if (BioCatchClient.INSTANCE.getState() != State.STOPPED) {
                    BioCatchClient.INSTANCE.stop();
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateCustomerSessionID$default(Companion companion, String str, Application application, Function1 function1, int i2, Object obj) throws Throwable {
            if ((i2 + 4) - (i2 | 4) != 0) {
                function1 = null;
            }
            companion.updateCustomerSessionID(str, application, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateCustomerSessionID$lambda$7(String customerSessionID, Function1 function1) {
            Intrinsics.checkNotNullParameter(customerSessionID, "$customerSessionID");
            try {
                if (BioCatchClient.INSTANCE.getState() == State.STARTING || BioCatchClient.INSTANCE.getState() == State.STARTED) {
                    BioCatchClient.INSTANCE.updateCustomerSessionID(customerSessionID);
                    String str = "BioCatch csid updated: " + customerSessionID;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                } else if (function1 != null) {
                    function1.invoke(false);
                }
            } catch (Exception e2) {
                String str2 = "An exception occurred with BioCatch: " + e2;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void changeContext(final String str, Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            Intrinsics.checkNotNullParameter(str, Jg.Wd("\u000b\u001c\u0010\u001b\u001f7(\u001912/", (short) (C1580rY.Xd() ^ (-20481)), (short) (C1580rY.Xd() ^ (-1663))));
            int length = str.length();
            ZO.xd("\r8\u0006!w\u0011\b|D<y}\u001b:h11 ", (short) (OY.Xd() ^ 20306), (short) (OY.Xd() ^ 30642));
            if (length == 0) {
                C1626yg.Ud("C{1Z3\u0005G\u0004IH_=AZTAWE$\u001d*f[{\u0013\\y2IS{\\\u0013\u0001$Kl\n\u0011$\u0006b.d\u0013", (short) (C1633zX.Xd() ^ (-30169)), (short) (C1633zX.Xd() ^ (-8645)));
                if (function1 != null) {
                    function1.invoke(false);
                    return;
                }
                return;
            }
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Ig.wd("\u0002>f\f\n_.OZy2v/9&\u0001A", (short) (C1499aX.Xd() ^ (-17096)))).getDeclaredMethod(EO.Od("\"gH\u0005a'LQ0 \u001fu2", (short) (C1580rY.Xd() ^ (-22616))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.changeContext$lambda$4(str, function1);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Qd("frgtpic,lo)BZf[bZf", (short) (C1499aX.Xd() ^ (-30856))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1593ug.zd("\u001c\u0014*\u0016c#\u0019'!h\u000e2,-!#.(", (short) (C1499aX.Xd() ^ (-12475)), (short) (C1499aX.Xd() ^ (-6342))));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(C1561oA.od("FDGG", (short) (C1580rY.Xd() ^ (-8374))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                short sXd = (short) (C1607wl.Xd() ^ 24812);
                int[] iArr = new int["},^%9%(49/66h9./B@A55qJ=I>v\u001aBI\u001e=QAG\u001a\u0001".length()];
                QB qb = new QB("},^%9%(49/66h9./B@A55qJ=I>v\u001aBI\u001e=QAG\u001a\u0001");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                String str2 = new String(iArr, 0, i2) + e4;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void flush(Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Wg.Zd("hG:e g\u007f\u0007ev/n\u000f\\z-W", (short) (C1607wl.Xd() ^ 25549), (short) (C1607wl.Xd() ^ 24812))).getDeclaredMethod(C1561oA.Xd("~}\u000eg|\u0006\fj\u000f\u0010\u0012\b\u0016", (short) (Od.Xd() ^ (-25002))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.flush$lambda$22(function1);
                    }
                };
                Class<?> cls = Class.forName(Wg.vd("\u0004\u0012\t\u0018\u000e\t\u0005O\n\u000fJew\u0006|\u0006\u0018&", (short) (ZN.Xd() ^ 19075)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Qg.kd("C9M7\u0003@4@8}!C;:,,5-", (short) (C1607wl.Xd() ^ 31722), (short) (C1607wl.Xd() ^ 16617)));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(hg.Vd("ECFF", (short) (Od.Xd() ^ (-28596)), (short) (Od.Xd() ^ (-15863))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str = C1561oA.ud("Y\u00066z\rvw\u0002\u0005x}{,zml}yxjh#yjtg\u001e?ej=ZlZ^/\u0014", (short) (OY.Xd() ^ 11511)) + e4;
                C1561oA.yd("\u001a@E\u00185G59#\u0013\u0019\u001a-9+0-9", (short) (OY.Xd() ^ 8983));
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void getState(Application application, final Function1<? super String, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Class<?> cls = Class.forName(C1561oA.Yd("+90?=84~AF\u0002!EFH>L", (short) (OY.Xd() ^ 13593)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (C1607wl.Xd() ^ 4478);
                    short sXd2 = (short) (C1607wl.Xd() ^ 6739);
                    int[] iArr = new int["ts\u0004]r{\u0002`\u0005\u0006\b}\f".length()];
                    QB qb = new QB("ts\u0004]r{\u0002`\u0005\u0006\b}\f");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.getState$lambda$28(function1);
                    }
                };
                short sXd3 = (short) (ZN.Xd() ^ 22857);
                short sXd4 = (short) (ZN.Xd() ^ 1196);
                int[] iArr2 = new int["k\u0011\f4Xlmq:W\u0018m\u000e0Por5".length()];
                QB qb2 = new QB("k\u0011\f4Xlmq:W\u0018m\u000e0Por5");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(ZO.xd("\u001a?\u0007-WwH\u0013~<\u0001C&!G,\fp", (short) (OY.Xd() ^ 24882), (short) (OY.Xd() ^ 28024)));
                Object[] objArr2 = {runnable};
                short sXd5 = (short) (OY.Xd() ^ 4354);
                short sXd6 = (short) (OY.Xd() ^ 26001);
                int[] iArr3 = new int["4\r3<".length()];
                QB qb3 = new QB("4\r3<");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str = Ig.wd("\tg\t(k\u0001fZ\u00178<aG\u0011\u0001'[r+\u0016=QWEXX2#\\\u0015\rOz\u0004>V\r", (short) (FB.Xd() ^ 19023)) + e4;
                EO.Od("+\u0001v)8\u0018)8aEH*hu\u0013}(A", (short) (C1607wl.Xd() ^ 126));
                if (function1 != null) {
                    function1.invoke(C1561oA.Qd(" ,+')", (short) (C1633zX.Xd() ^ (-6998))));
                }
            }
        }

        public final void getVersion(Application application, final Function1<? super String, Unit> function1) throws Throwable {
            Handler handler;
            if (application != null) {
                handler = new Handler(application.getMainLooper());
            } else {
                short sXd = (short) (FB.Xd() ^ 22411);
                short sXd2 = (short) (FB.Xd() ^ 12009);
                int[] iArr = new int["jxo~|ws>\u0001\u0006A`\u0005\u0006\b}\f".length()];
                QB qb = new QB("jxo~|ws>\u0001\u0006A`\u0005\u0006\b}\f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.od(".+9\u0011$+/\f.--!-", (short) (ZN.Xd() ^ 31782)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Object[] objArr2 = {new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BioCatchSDKManager.Companion.getVersion$lambda$31(function1);
                }
            }};
            Method method = Class.forName(C1561oA.Kd("&4+:83/y<A|\u00182@7@:H", (short) (C1580rY.Xd() ^ (-30406)))).getMethod(C1561oA.Xd("338:", (short) (C1580rY.Xd() ^ (-14972))), Class.forName(Wg.Zd("\u0002M2qN`&\u0007\u007f\u001b\u000fF\u0010d(=\u0007T", (short) (C1499aX.Xd() ^ (-30161)), (short) (C1499aX.Xd() ^ (-5015)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public final void pause(Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Class<?> cls = Class.forName(Wg.vd("iun{slj3or0Mkjnbj", (short) (C1499aX.Xd() ^ (-23954))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (C1580rY.Xd() ^ (-7237));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-13571));
                    int[] iArr = new int["[Xf>QX\\9[ZZNZ".length()];
                    QB qb = new QB("[Xf>QX\\9[ZZNZ");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                        i2++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.pause$lambda$13(function1);
                    }
                };
                short sXd3 = (short) (C1633zX.Xd() ^ (-6747));
                short sXd4 = (short) (C1633zX.Xd() ^ (-8642));
                int[] iArr2 = new int["r~s\u0001|uo8x{5Nfrgnfr".length()];
                QB qb2 = new QB("r~s\u0001|uo8x{5Nfrgnfr");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.ud("3)='r0$0(m\u00113+*\u001c\u001c%\u001d", (short) (C1633zX.Xd() ^ (-24437))));
                Object[] objArr2 = {runnable};
                Method method = cls2.getMethod(C1561oA.yd("``eg", (short) (C1580rY.Xd() ^ (-32003))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str = C1561oA.Yd("<j\u001dcwcfrwmtt'wlm\u0001~\u007fss0\t{\b|5X\u0001\b\\{\u0010\u007f\u0006X?", (short) (C1499aX.Xd() ^ (-30497))) + e4;
                short sXd5 = (short) (FB.Xd() ^ 13793);
                short sXd6 = (short) (FB.Xd() ^ 15814);
                int[] iArr3 = new int["/W^3RfV\\H:BEZh\\cbp".length()];
                QB qb3 = new QB("/W^3RfV\\H:BEZh\\cbp");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i4)) + sXd6);
                    i4++;
                }
                new String(iArr3, 0, i4);
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void resume(Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Jg.Wd("\u0013].\u007fY\u0016*8T\u001c1\u000fT\u000fu%\u0015", (short) (C1607wl.Xd() ^ 8852), (short) (C1607wl.Xd() ^ 16690))).getDeclaredMethod(ZO.xd("LWxnBh\u0011\u0001&\u0004B\u001b6", (short) (Od.Xd() ^ (-13956)), (short) (Od.Xd() ^ (-29781))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.resume$lambda$16(function1);
                    }
                };
                Class<?> cls = Class.forName(C1626yg.Ud("SzL!~_'l\u00176:G:K_!Oa", (short) (ZN.Xd() ^ 6084), (short) (ZN.Xd() ^ 21064)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Ig.wd("|#&q^_\u0001&_\u0007-2{qdo1<", (short) (C1607wl.Xd() ^ 31851)));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(EO.Od("v\u001e\u0012t", (short) (Od.Xd() ^ (-21931))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str = C1561oA.Qd("[\b8|\u000fxy\u0004\u0007z\u007f}.|on\u007f{zlj%{lvi Agl?\\n\\`1\u0016", (short) (C1580rY.Xd() ^ (-21717))) + e4;
                C1593ug.zd("i\u0012\u0019m\r!\u0011\u0017\u0003t|\u007f\u0015#\u0017\u001e\u001d+", (short) (C1607wl.Xd() ^ 32384), (short) (C1607wl.Xd() ^ 1938));
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void setCustomerBrand(final String str, Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            Intrinsics.checkNotNullParameter(str, C1561oA.od("x\n\u0007\u0007\u0001}t\u0001O~lxm", (short) (ZN.Xd() ^ 31323)));
            int length = str.length();
            C1561oA.Kd(";cj?^rbhTFNQfthon|", (short) (C1499aX.Xd() ^ (-511)));
            if (length == 0) {
                Wg.Zd("\u001cU~'\u000b4SLE\u001d7+J1g\u0004>TKj#\u007f4\ry^\u0017>'W*\u0018\u0004e_Nn\u001at/[0_\u000f;*V", (short) (C1580rY.Xd() ^ (-15223)), (short) (C1580rY.Xd() ^ (-4287)));
                if (function1 != null) {
                    function1.invoke(false);
                    return;
                }
                return;
            }
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1561oA.Xd("\u001e,#20+'q49t\u001489;1?", (short) (ZN.Xd() ^ 17590))).getDeclaredMethod(Wg.vd("\u001e\u001d)\u0003\u001c%'\u0006\u001e\u001f\u001d\u0013%", (short) (Od.Xd() ^ (-4864))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.setCustomerBrand$lambda$25(str, function1);
                    }
                };
                Class<?> cls = Class.forName(Qg.kd("CODQMF@\tIL\u0006\u001f7C8?7C", (short) (OY.Xd() ^ 11159), (short) (OY.Xd() ^ 30656)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(hg.Vd("mcwa-j^jb(KmedVV_W", (short) (C1580rY.Xd() ^ (-27764)), (short) (C1580rY.Xd() ^ (-8882))));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(C1561oA.ud("6477", (short) (Od.Xd() ^ (-2265))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str2 = C1561oA.yd("O},r\u000bvu\u0002zpss*zkl\u0014\u0012\u000f\u0003\u0007C\u0018\u000b\u000b\u007f4W\u0004\u000b[zbRT'\u0012", (short) (C1633zX.Xd() ^ (-5407))) + e4;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        @ReactMethod
        public final void setLogLevel(final int i2, Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            if (application != null) {
                handler = new Handler(application.getMainLooper());
            } else {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.Yd("{\n\u0001\u0010\u000e\t\u0005O\u0012\u0017Rq\u0016\u0017\u0019\u000f\u001d", (short) (C1633zX.Xd() ^ (-12351)))).getDeclaredMethod(Xg.qd("65E\u001f4=C\"FGI?M", (short) (C1580rY.Xd() ^ (-3785)), (short) (C1580rY.Xd() ^ (-17411))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    BioCatchSDKManager.Companion.setLogLevel$lambda$34(i2, function1);
                }
            };
            short sXd = (short) (OY.Xd() ^ 27638);
            short sXd2 = (short) (OY.Xd() ^ 23977);
            int[] iArr = new int["G;\u0017\fz^<\u007f#\u000e>B:A\u001d\fvm".length()];
            QB qb = new QB("G;\u0017\fz^<\u007f#\u000e>B:A\u001d\fvm");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                i3++;
            }
            Object[] objArr2 = {runnable};
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1626yg.Ud("\u0016XN?", (short) (Od.Xd() ^ (-25399)), (short) (Od.Xd() ^ (-10821))), Class.forName(ZO.xd("ba\u0002d\u001b8\u0005HDB\u007fz^!.!\u0014n", (short) (C1499aX.Xd() ^ (-21890)), (short) (C1499aX.Xd() ^ (-32439)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public final void startNewSession(final String str, Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Ig.wd("Y6>l:f=\u007f\u0002\u0012R\u000f\u0007\t]pP", (short) (C1580rY.Xd() ^ (-9111)))).getDeclaredMethod(EO.Od("1\u007f\\\u001a]\n?E\u001f\u0010\u0013e]", (short) (Od.Xd() ^ (-29633))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.startNewSession$lambda$10(str, function1);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Qd("\u001b'\u001c)%\u001e\u0018`!$]v\u000f\u001b\u0010\u0017\u000f\u001b", (short) (C1580rY.Xd() ^ (-25880))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1593ug.zd("QI_K\u0019XN\\V\u001eCgabVXc]", (short) (Od.Xd() ^ (-2310)), (short) (Od.Xd() ^ (-10307))));
                Object[] objArr2 = {runnable};
                short sXd = (short) (OY.Xd() ^ 5694);
                int[] iArr = new int["HFII".length()];
                QB qb = new QB("HFII");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str2 = C1561oA.Kd("\u0014Bt;O;>JOELL~ODEXVWKK\b`S_T\r0X_4SgW]0\u0017", (short) (C1607wl.Xd() ^ 3377)) + e4;
                Wg.Zd("\u0013re\u0015\u007fvB\u0014Z0\u0003aa3\u0003tO ", (short) (FB.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagCameraTemperature), (short) (FB.Xd() ^ 20712));
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void startSDK(final String str, final String str2, final String str3, final Application application, final boolean z2, final Activity activity, final Function1<? super Boolean, Unit> function1) throws Throwable {
            short sXd = (short) (C1607wl.Xd() ^ 201);
            int[] iArr = new int["10,\u00120+".length()];
            QB qb = new QB("10,\u00120+");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
            Intrinsics.checkNotNullParameter(str2, Wg.vd("m\u0001\u007f\u0002}|u\u0004[W", (short) (Od.Xd() ^ (-28822))));
            short sXd2 = (short) (C1633zX.Xd() ^ (-21239));
            short sXd3 = (short) (C1633zX.Xd() ^ (-28513));
            int[] iArr2 = new int["\u001c*)$ \u0019\u0016(\u001c!\u001f".length()];
            QB qb2 = new QB("\u001c*)$ \u0019\u0016(\u001c!\u001f");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Intrinsics.checkNotNullParameter(application, new String(iArr2, 0, i3));
            int length = str.length();
            hg.Vd("&LQ$ASAE/\u001f%&9E7<9E", (short) (OY.Xd() ^ 14337), (short) (OY.Xd() ^ 7360));
            if (length == 0) {
                short sXd4 = (short) (ZN.Xd() ^ 3599);
                int[] iArr3 = new int["\u0016\u0013\rp\r\u00068\bw\bu\u0001w\u0006u\u0002.pmyxx|'hj$qwml\u001fmo\u001c`gilp".length()];
                QB qb3 = new QB("\u0016\u0013\rp\r\u00068\bw\bu\u0001w\u0006u\u0002.pmyxx|'hj$qwml\u001fmo\u001c`gilp");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                new String(iArr3, 0, i4);
                if (function1 != null) {
                    function1.invoke(false);
                    return;
                }
                return;
            }
            if (str2.length() == 0) {
                short sXd5 = (short) (C1499aX.Xd() ^ (-15229));
                int[] iArr4 = new int["\r\u001e\u001b\u001b\u0015\u0012\t\u0015jd?\u000f~\u000f|\b\u001f-\u001d)U\u0018\u0015!  $N\u0010\u0012K\u0019~ts&tv#gnpsw".length()];
                QB qb4 = new QB("\r\u001e\u001b\u001b\u0015\u0012\t\u0015jd?\u000f~\u000f|\b\u001f-\u001d)U\u0018\u0015!  $N\u0010\u0012K\u0019~ts&tv#gnpsw");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                    i5++;
                }
                new String(iArr4, 0, i5);
                if (function1 != null) {
                    function1.invoke(false);
                    return;
                }
                return;
            }
            try {
                Handler handler = new Handler(application.getMainLooper());
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.startSDK$lambda$1(activity, str, str2, application, str3, function1, z2);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Yd("\u0018&\u001d,*%!k.3n\n$2)2,:", (short) (C1633zX.Xd() ^ (-27980))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Xg.qd("TLbN\u001c[Q_Y!FjdeY[f`", (short) (C1580rY.Xd() ^ (-17178)), (short) (C1580rY.Xd() ^ (-20959))));
                Object[] objArr = {runnable};
                Method method = cls.getMethod(Jg.Wd("ih|M", (short) (C1580rY.Xd() ^ (-15415)), (short) (C1580rY.Xd() ^ (-6298))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                String str4 = ZO.xd("y&\"<- E\u0017\u000f{P+X\u000eC-@dw$*x7\u0003\u0015\u0018V\u00046i>y\u0014\u0014\u0017~\u0007", (short) (Od.Xd() ^ (-32550)), (short) (Od.Xd() ^ (-29142))) + e3;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void stop(Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1626yg.Ud("3}\n&p\u001dLS@*\u0001\u0010Sl\u0011{\r", (short) (C1499aX.Xd() ^ (-15312)), (short) (C1499aX.Xd() ^ (-425)))).getDeclaredMethod(Ig.wd("\u001cAB{o\u001b\u0004Q*IHc\u001e", (short) (FB.Xd() ^ 5256)), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.stop$lambda$19(function1);
                    }
                };
                Class<?> cls = Class.forName(EO.Od("\u0010lf\u001a\n)\u0006A6[nlTU9*g\\", (short) (C1580rY.Xd() ^ (-12934))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (-28473));
                int[] iArr = new int["8.B,w5)5-r\u001680/!!*\"".length()];
                QB qb = new QB("8.B,w5)5-r\u001680/!!*\"");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(C1593ug.zd("77<>", (short) (OY.Xd() ^ 16042), (short) (OY.Xd() ^ 18335)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str = C1561oA.od("\u0011=m2D./9<053c2%$510\" Z1\",\u001fUv\u001d\"t\u0012$\u0012\u0016fK", (short) (C1633zX.Xd() ^ (-25891))) + e4;
                C1561oA.Kd("[\u0004\u000b_~\u0013\u0003\ttfnq\u0007\u0015\t\u0010\u000f\u001d", (short) (C1607wl.Xd() ^ 23521));
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }

        public final void updateCustomerSessionID(final String str, Application application, final Function1<? super Boolean, Unit> function1) throws Throwable {
            Handler handler;
            Intrinsics.checkNotNullParameter(str, Wg.Zd("\u001dI\u001b\u0003Y\u001ei]\u001e7\u0019?\u0012]1eM", (short) (Od.Xd() ^ (-24439)), (short) (Od.Xd() ^ (-2680))));
            int length = str.length();
            C1561oA.Xd("(PW,K_OUA3;>SaU\\[i", (short) (OY.Xd() ^ 7127));
            if (length == 0) {
                short sXd = (short) (Od.Xd() ^ (-9926));
                int[] iArr = new int["Xkjlhg`nPcrsjqqM)\u0006WI[KXQaSa\u0010TSab\u0005\u000b7z~:\n\u0012\n\u000b?\u0010\u0014B\t\u0012uz\u0001".length()];
                QB qb = new QB("Xkjlhg`nPcrsjqqM)\u0006WI[KXQaSa\u0010TSab\u0005\u000b7z~:\n\u0012\n\u000b?\u0010\u0014B\t\u0012uz\u0001");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                new String(iArr, 0, i2);
                if (function1 != null) {
                    function1.invoke(false);
                    return;
                }
                return;
            }
            try {
                if (application != null) {
                    handler = new Handler(application.getMainLooper());
                } else {
                    Companion companion = this;
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Qg.kd("\u001e*\u001f,(!\u001bc$'`} \u001f\u001f\u0013\u001f", (short) (C1580rY.Xd() ^ (-10615)), (short) (C1580rY.Xd() ^ (-21006)))).getDeclaredMethod(hg.Vd("yv\u0005\\ovzWyxxlx", (short) (C1607wl.Xd() ^ 1263), (short) (C1607wl.Xd() ^ 28953)), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Runnable runnable = new Runnable() { // from class: BioCatchSDKManager$Companion$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        BioCatchSDKManager.Companion.updateCustomerSessionID$lambda$7(str, function1);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.ud(")5*73,&n/2k\u0005\u001d)\u001e%\u001d)", (short) (C1499aX.Xd() ^ (-28214))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.yd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0004Kp\u0015\u000f\u0010\u0004\u0006\u0001z", (short) (C1499aX.Xd() ^ (-12908))));
                Object[] objArr2 = {runnable};
                Method method = cls.getMethod(C1561oA.Yd("88=?", (short) (C1580rY.Xd() ^ (-17599))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                String str2 = Xg.qd("\u00020b)=),8=3::l=23FDE99uNAMBz\u001eFM\"AUEK\u001e\u0005", (short) (C1607wl.Xd() ^ 740), (short) (C1607wl.Xd() ^ 3130)) + e4;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        }
    }
}
