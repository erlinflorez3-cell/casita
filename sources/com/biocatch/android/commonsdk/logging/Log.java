package com.biocatch.android.commonsdk.logging;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.ActivityObserver;
import com.biocatch.android.commonsdk.core.performance.PerfCounterEntry;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\r.4ߚ\u007f\u0007|jA0JhP.`S2şs{J$c$wDCU(~*\tUTog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[zs܈-Srom2\u0006n^yez6ӯ$208B\u0011\u000f$BH>\u0002+GY\u0018*0n}\u0003^\u001b[\u001d\u001a@\u0011n$\u000f-tg|9\u0011\u0003kHG#1trR5nH|{\u0010vZ5\u001d\u000fc4*nH}!3e\u001b\u0007\u0001fo\u0007M\u0001U\u0005\u0017*oAW\u0006o6\u0007\u000bD\u00199^%]!)\r\u000b_p$)AN\u0012\\\u0019@6\u000b\u0013{;G4\u0012\u0014+`.[\u001f\u0017\u0010\u00143\u0003\u0002kBf\u0001\rE0\u0003g6%9\u00185A8Ii\u0002iA\u0019\\8\u0014\u0007#\u001dQ\u00045!$`\u001cu-\u001b\u0003\u0003\u00025_OUH|\r\"S{\u0019\tb0544U\u000fG{?1G+EkQ%7j0Y\ru\u0005\u001axh\u0002t\u0003NN2\u0007\u0018M)7\u001d#Tr\u001b\u0004P\u0003[\\\u0017[,l\t\u0014\u0007A1#w\u0005-3'fO\u0017t\u001bQk\u0019=/\u0015:\"\u0005y%o9\r>eUq\u001fyR%\u0017oBp\u0015phXR:k%40J`j>\u0003,H\\%+2m\fdT:L1\\CS3\"PE\u0015\t\u000e_\u0019\u0016\rcK&\u0019hRw9\u0007^]\tq}ww/En0IYQc$VY0\u0006L|Q%E\bHSuk_L\u001b!&Y\n/.\u001agTwS!.\u0017)`\r]IZ\u0002}Q{\u0015W\u0001\u000b\n'=~-\u0016\u00193|:\u0001\u0003J}_G&\u0005m\u000b#6gH\u0010of\u0013G\u0012_;_LX\u000b\u0003\b?~>\u000b\u00157 ;\u007f\u001e3MG;D?#&y$/Cd\fkFІ{ˏ\u0013&|ЁTDq\u001a\bb\u007fb\tյDա]\u000bFЭ<n\tHVq\u0018\nH\u0011B\u0016βLc"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6s", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\nKR?|8-)R^G\u0007p=N\u0004|", "u(E", "1n]AX?M<\u0015\u0007z", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "", ":de2_", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", "5dc\u0019X=>Z", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i>w\u00180QL=5\u0014\u0005\u001fjH9\u0018c3$", "Adc\u0019X=>Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G'Ao\u00182VE\u0005K\u001b(\u0017OaJ\u0007j\u0002\u0012g", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1qXA\\*:Z", ";db@T.>", ExifInterface.GPS_MEASUREMENT_3D, "", "2dQBZ", "2hb=T;<V\u0001~\tl(~\t", "AsP0^\u001bKO\u0017~", "3qa<e", "5dc g(<Y\b\fv\\,", "7mU<", ":nV\u001dX9?1#\u000f\u0004m,\n", ">da366N\\(~\b>5\f\u0016C", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_RF#\u001fnc", "<df\u0012a;Kg", "=m00g0OW(\u0013Xa(\u0006\u000b/d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "BqP0X", "E`a;\\5@", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Log implements ActivityObserver {
    public static final Companion Companion = new Companion(null);
    private static final Log log = new Log();
    private static final HashSet<ILogClient> mLogClients = new HashSet<>();
    private ELogLevel level = ELogLevel.WARNING;
    private final AtomicReference<String> contextName = new AtomicReference<>();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007njO0Le^.Zݷ2\u000fy{<řc$\u007fRCU \u007f(ޢPdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u0016k\u001c'2pzoC[{UApx<\u000402P@(\u0012!\u001aXPǘzzQYT\u001e>O\t:\u0001\u0018}\t(\"\u001e>N\tnhuONH\u001b_\u0011ǅ%ɨmBVϋ0?\u000bP%F\u0003)C;Ґ\"/X9;\u00193XS#`aW\u0013OsM\u0005\u0017/U22yg8h\u007fB\u001d\nXcơt͉`\u0005YӠИ+<"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6\\rriD\u0003l0X\u007f|", "", "u(E", ":nV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6s", ":nV4X9", "5dc\u0019b.@S&", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i>w\u00180QL=5\u001b(\u0017>", ";K^463BS\"\u000e\t", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001fR> roe9\u0010r\u0002", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "AtQ@V9BP\u0019e\u0005`\n\u0004\r/n\u000f", "", ":nV\u0010_0>\\(\r", "", "uZ;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i>w\u00180QL=5\u0018\u0005\u001fj?@\u000bc5]Lj8", "CmbBU:<`\u001d{zE6~f6i\u007f1\u000b", ":nV\u0010_0>\\(", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Log getLogger() {
            return Log.log;
        }

        public final void subscribeLogClient(ILogClient... logClients) {
            Intrinsics.checkNotNullParameter(logClients, "logClients");
            CollectionsKt.addAll(Log.mLogClients, logClients);
        }

        public final void unsubscribeLogClient(ILogClient logClient) {
            Intrinsics.checkNotNullParameter(logClient, "logClient");
            Log.mLogClients.remove(logClient);
        }
    }

    private Log() {
    }

    private final void dispatchMessage(ELogLevel eLogLevel, String str, String str2, String str3) {
        Iterator<T> it = mLogClients.iterator();
        while (it.hasNext()) {
            try {
                ((ILogClient) it.next()).onLogMessage(eLogLevel, str == null ? "" : str, str2 != null ? str2 : "", str3);
            } catch (JSONException unused) {
            }
        }
    }

    static /* synthetic */ void dispatchMessage$default(Log log2, ELogLevel eLogLevel, String str, String str2, String str3, int i2, Object obj) {
        if ((2 & i2) != 0) {
            str = "";
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            str3 = log2.contextName.get();
        }
        log2.dispatchMessage(eLogLevel, str, str2, str3);
    }

    private final String getStackTrace(Throwable th) {
        return String.valueOf(android.util.Log.getStackTraceString(th));
    }

    public final void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        int i2 = configurationRepository.getInt(ConfigurationFields.logBufferSize);
        int i3 = configurationRepository.getInt(ConfigurationFields.logLevel);
        if (configurationRepository.getBoolean(ConfigurationFields.shouldOverrideLocalLogLevel)) {
            this.level = ELogLevel.Companion.getLevel(i3);
        }
        for (ILogClient iLogClient : mLogClients) {
            iLogClient.setMaxSize(i2);
            iLogClient.clearLogEntriesByLevel(this.level);
        }
    }

    public final void critical(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.CRITICAL;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void critical(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.CRITICAL;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, getStackTrace(th), null, 8, null);
        }
    }

    public final void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.DEBUG;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void debug(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        dispatchMessage$default(this, ELogLevel.DEBUG, message, getStackTrace(th), null, 8, null);
    }

    public final void error(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.ERROR;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void error(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.ERROR;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, getStackTrace(th), null, 8, null);
        }
    }

    public final void error(Throwable th) {
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.ERROR;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, null, getStackTrace(th), null, 10, null);
        }
    }

    public final ELogLevel getLevel() {
        return this.level;
    }

    public final void info(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.INFO;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void info(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.INFO;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, getStackTrace(th), null, 8, null);
        }
    }

    public final void logPerfCounter(PerfCounterEntry perfCounterEntry) {
        Intrinsics.checkNotNullParameter(perfCounterEntry, "perfCounterEntry");
        Iterator<T> it = mLogClients.iterator();
        while (it.hasNext()) {
            ((ILogClient) it.next()).onPerfCounterEntry(perfCounterEntry);
        }
    }

    public final void newEntry(ELogLevel level, String str, String str2) {
        Intrinsics.checkNotNullParameter(level, "level");
        dispatchMessage$default(this, level, str, null, str2, 4, null);
    }

    @Override // com.biocatch.android.commonsdk.core.ActivityObserver
    public void onActivityChanged(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AtomicReference<String> atomicReference = this.contextName;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s_%s", Arrays.copyOf(new Object[]{activity.getLocalClassName(), activity.getTitle()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        atomicReference.set(str);
    }

    public final void setLevel(ELogLevel eLogLevel) {
        Intrinsics.checkNotNullParameter(eLogLevel, "<set-?>");
        this.level = eLogLevel;
    }

    public final void trace(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.TRACE;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void trace(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.TRACE;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, getStackTrace(th), null, 8, null);
        }
    }

    public final void warning(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.WARNING;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, null, null, 12, null);
        }
    }

    public final void warning(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        ELogLevel eLogLevel = this.level;
        ELogLevel eLogLevel2 = ELogLevel.WARNING;
        if (eLogLevel.isLowerOrEqual(eLogLevel2)) {
            dispatchMessage$default(this, eLogLevel2, message, getStackTrace(th), null, 8, null);
        }
    }
}
