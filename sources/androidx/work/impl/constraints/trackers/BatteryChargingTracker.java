package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: compiled from: BatteryChargingTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u0003\rIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?3Le^.ZS0\u0011s{J$cҕyCIU\"Ԃ(\u000eeȞ\u0018m~Lj\u000bq\u000f4\u00159}<Mcyu\u0012=4RsM6eok=žx6\u0013%z0F\u0007\u001d\u0001H*x\u0014\u0005\t[K:!v@9H`\u001de\u0005H#6B.\u000f6\\\u0016]|\\=oH5;\u0003\u0018B\u0005{6ܵ~֔\u0011Jl)\u0013}o&{RE>-%\u0002\r='2ρ\u0005ӭuA\u001dj-29U־[H"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005H0-$hnMdf([x+PN=9XPx=!g", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005HA(\u0011g_5\u0015r\u0019Nt'K]N9:\\{K#\u001fV\u0012W:{\u0012U?*nQ\r", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]o:", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "7mc2a;\u001fW \u000ezk", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "5dc\u0016a;>\\(_~e;|\u0016", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VP\u0012C\u0006%B/", "7r1.g;>`-\\}Z5~\t.I\t7{I\u0010t\u001aC|\u0010@\u007f'", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1?b(=Q\u0015\r\nK,z\t3v\u007f", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryChargingTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean getInitialState() throws Throwable {
        IntentFilter intentFilter = new IntentFilter(Wg.vd("q}v\u0004{tr;\u0002\u0006\u000f~\u0003\bDvcskpj)@>\\[O[]bIM1=960", (short) (C1607wl.Xd() ^ 8528)));
        Context appContext = getAppContext();
        Object[] objArr = {null, intentFilter};
        Method method = Class.forName(Qg.kd("p|q~zsm6jusxhpu.Bmkp`rm", (short) (OY.Xd() ^ 27234), (short) (OY.Xd() ^ 546))).getMethod(C1561oA.yd("\u0011\u0003\b\t\u0016\u0016\n\u0016hz{|\u0004\u0010\u0002\u000e", (short) (C1499aX.Xd() ^ (-32123))), Class.forName(hg.Vd("t\u0001u\u0003~wq:nyw|lty2Etpaca^ooL^[\\_kYe", (short) (OY.Xd() ^ 29498), (short) (OY.Xd() ^ 6550))), Class.forName(C1561oA.ud("JVKXTMG\u0010DOMRBJO\b\"FK;CH\u0019;=D4@", (short) (C1607wl.Xd() ^ 9071))));
        try {
            method.setAccessible(true);
            Intent intent = (Intent) method.invoke(appContext, objArr);
            if (intent == null) {
                Logger.get().error(BatteryChargingTrackerKt.TAG, C1561oA.Yd("\u0006\u0005\u0015j\u0011\r\u0019\u000f\b\u0014{\u001e\f \u0012M[O\u001f'\u001f T\u001f%,\u001e(/[/#\"%*8((", (short) (FB.Xd() ^ 18053)));
                return false;
            }
            return Boolean.valueOf(isBatteryChangedIntentCharging(intent));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        Logger.get().debug(BatteryChargingTrackerKt.TAG, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    setState(false);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    setState(false);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    setState(true);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    setState(true);
                    break;
                }
                break;
        }
    }

    private final boolean isBatteryChangedIntentCharging(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
