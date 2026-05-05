package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@ReactModule(name = "\u0014(+&*\"")
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000fy{<řc$\u007fGCU }*\teNogtMb\u000bQ\u0018\u000e\u0016~l4Ic\u0005e\u0012\u00152JoM:UoC<fyLӌ>RR8(\u00041\u001aXHHu\u001b\u0004^\u001c\u0016>A\t:\u0001\u000f]\t(\u0015\u001e>N\u0005ɉ`g\\;\u0011zkBG#1rrR5iH|{\u0018\rho\u001b\u0005m6+n@e\u00193`\u001b\u0007\u0001i\u0006\u0017\b\u0018K\u0014\u0001'U4yweFp\u007fB [S\u001bn\u000b&\u000b\u0010\u0002d\u001a9CO\u0012V\u0001\u00126\u000b\u0013{;PJ\"N5VCE\u001a\u0015\u0011>7\u0003\tk@~\r%VH\toM/%.<[=)~iai2\u0015KD\u0013\u001b8;\u0001\u001d5\fX\u001c{-\u001b\u0003\u0014\u00186\u001aFKef\n\bF4\u00189p\u0010H\u001c0u\t_\u007f\u001fM/%eo\u007f7qw\u0010N\\g%\f7èUׂVHH̎ë\u001aX"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000f;u\u001a7O+EjD%\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f &q\u001e2VE)v4\u001cj", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001cKP?vC\r\u0019paFfv,L\u00076QY$", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`W[+\t\u0003h\u000b#nUE/\u00137S\u000fJ2\u0005\u0015%\u000eBkl@V\u001e\u0011X\u0015\u0007/9sQcl\t/=N^,d\u00195`M", "8`e.G0FS&fvg(~\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u00149", "1`[9<+ESvz\u0002e)x\u00075s", "", "4qP:X\u001bB[\u0019", "", "1`[9G0FS&\r", "Bh\\2e\u0010\u001da", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7I#;IW\u0011", "1qT.g,-W!~\b", "1`[9U(<Y|]Yh<y\u0010/", "2ta.g0H\\w\t\u000b[3|", "8rB0[,=c \u0003\u0004`\u001b\u0001\u0011/", "@d_2T;", "", "2d[2g,-W!~\b", "Bh\\2e\u0010=2#\u000fwe,", "3lXAG0FSw\f~_;n\u0005<n\u00041}", "E`a;\\5@;\u0019\r\tZ.|", "", "6`b\u000eV;Bd\u0019m~f,\n\u0017\u0013nl$\u0005B\u0001", "@`]4X\u0014L", "", "7me._0=O(~", "Adc X5=7\u0018\u0006z>=|\u0012>s", "Ad]1<+ESx\u0010zg;\u000b", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TimingModule extends NativeTimingSpec implements JavaScriptTimerExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "Timing";
    private final JavaTimerManager javaTimerManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000f;u\u001a7O+EjD%\u0015'?C\u000fn(Wz1P\"", "", "u(E", "\u001c@<\u0012", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimingModule(ReactApplicationContext reactContext, DevSupportManager devSupportManager) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.javaTimerManager = new JavaTimerManager(reactContext, this, ReactChoreographer.Companion.getInstance(), devSupportManager);
    }

    @Override // com.facebook.react.modules.core.JavaScriptTimerExecutor
    public void callIdleCallbacks(double d2) {
        JSTimers jSTimers;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callIdleCallbacks(d2);
    }

    @Override // com.facebook.react.modules.core.JavaScriptTimerExecutor
    public void callTimers(WritableArray timerIDs) {
        JSTimers jSTimers;
        Intrinsics.checkNotNullParameter(timerIDs, "timerIDs");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callTimers(timerIDs);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d2, double d3, double d4, boolean z2) {
        this.javaTimerManager.createAndMaybeCallTimer((int) d2, (int) d3, d4, z2);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d2) {
        this.javaTimerManager.deleteTimer((int) d2);
    }

    @Override // com.facebook.react.modules.core.JavaScriptTimerExecutor
    public void emitTimeDriftWarning(String warningMessage) {
        JSTimers jSTimers;
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.emitTimeDriftWarning(warningMessage);
    }

    @VisibleForTesting
    public final boolean hasActiveTimersInRange(long j2) {
        return this.javaTimerManager.hasActiveTimersInRange$ReactAndroid_release(j2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.javaTimerManager.onInstanceDestroy();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z2) {
        this.javaTimerManager.setSendIdleEvents(z2);
    }
}
