package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
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
/* JADX INFO: compiled from: Trackers.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0RnP\u008cZS@\u000fsڔ<$q$yCA\\ \u00038ޛ\u007fN\u0016f/\u001a`\u0010S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO?SoK=xzF\u000702P>(\n\u0011 0H\u001e}\u0013Cy\u0014\"<FpH[%S\u0015\u001c\"\u0006l*/#lsT6Vwu@?%\u0013ipTUd݁\u0001M\u001bR%<\u001bzy$;BG5C+\u0002\b\u07baVaGšWsC\u0012v5w:Wzo6\u0007\bЏ\u00191WՕut,k\u0013a1!54gi[R\u001e(&\u0005*\u0012ʀ\b\u0014\u000eΩ`03+t\u0016^H\u0003}kF`\u0004nB.\u0001\u0010;а)\u0006;ٿQ\u001dlcoIϳRJ"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005ZA\u001a\u0013naF\u00159", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "0`cAX9R1\u001cz\b`0\u0006\u000b\u001er{&\u0002@\u000e", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "", "0`cAX9R<#\u000eah>k\u0016+c\u0006(\t", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005H0-$hnMom;5\u000196YJ*bR\u007f\u0013", "<dcDb9DA(z\n^\u001b\n\u0005-k\u007f5", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#f F\u007f ;S1JgC\u001ej", "As^?T.><#\u000eah>k\u0016+c\u0006(\t", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]\u0013E\u000b:u\u000b\u0010\u0015!~|zO\\YK\u0002 |\u000b'rOgn\u0007CENq8.\u001bl\u0019Z@:1\";v%q^=\u0017wW\u001a\u0002A\u0007ceM\u0019\b\u000e\u000b:vZSOsTO>9)X\u0002A\u0016:c{tr7\rB9C`\tTv&\bm\u0006\u0011*bA44\u007f\u0019\u000fNZc\u0003\u0001'\u0018w\u0006k\u001a|o1/\u001fer9/\u000b\u0010\\$e9`rJI\\\u0013D\u0013s\u001d2MH@e\u0003#\u0018\u0014 qnXQdc\u000e\u0016nJ\"l\u001fL`p!*=#9]\u0018w\u0019l3K\u0019\tu\u000erwbB\"zL\u000f\u0001\u0015\u0005edum:\u0001\u001cPj1UE\u0005aPk\u0014\u001fC\u000fT\u000e*ogHyC!n\u0003GbFqm+\u000fpb\u0011&c6\"\u001f:\u0007EC", "5dc\u000fT;MS&\u0013Xa(\n\u000b3n\u0002\u0017\t<~\u001d\u0017T", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u0015!P}\u001dIr)>h\fiFz\u0012,SCHy}{\u001fqoH\u0014_0W\u0006\u0016THL2\\_H", "5dc\u000fT;MS&\u0013ch;c\u0013AT\r$yF\u0001$", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u0015!P}\u001dIr)>h\fiFz\u0012,SCHy}z\u0011wp9\u0014w\u0015X\u0006\u000eQ^=9XPx=!g", "5dc\u001bX;P]&\u0005hm(\f\t\u001er{&\u0002@\u000e", "5dc g6KO\u001b~ch;c\u0013AT\r$yF\u0001$", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Trackers {
    private final ConstraintTracker<Boolean> batteryChargingTracker;
    private final BatteryNotLowTracker batteryNotLowTracker;
    private final ConstraintTracker<NetworkState> networkStateTracker;
    private final ConstraintTracker<Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
    }

    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> networkStateTracker, ConstraintTracker<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    public /* synthetic */ Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker constraintTracker2, ConstraintTracker constraintTracker3, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        ConstraintTracker constraintTrackerNetworkStateTracker = constraintTracker2;
        StorageNotLowTracker storageNotLowTracker = constraintTracker3;
        BatteryNotLowTracker batteryNotLowTracker2 = batteryNotLowTracker;
        BatteryChargingTracker batteryChargingTracker = constraintTracker;
        int i3 = (-1) - (((-1) - i2) | ((-1) - 4));
        String strXd = C1561oA.Xd("Ubbi[ol'[kligbaukrrHuu|n\u0003\u007f", (short) (C1633zX.Xd() ^ (-2212)));
        if (i3 != 0) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t", (short) (Od.Xd() ^ (-15222)))).getMethod(Qg.kd("PM['UTOKDASGLJ\u001eIGL<NI", (short) (ZN.Xd() ^ 2244), (short) (ZN.Xd() ^ 14477)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(context2, strXd);
                batteryChargingTracker = new BatteryChargingTracker(context2, taskExecutor);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("kwlyunh1epnsckp)=hfk[mh", (short) (FB.Xd() ^ 24399), (short) (FB.Xd() ^ 27326))).getMethod(C1561oA.ud("liwCqpkg`]ochf:echXje", (short) (OY.Xd() ^ 779)), new Class[0]);
            try {
                method2.setAccessible(true);
                Context context3 = (Context) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(context3, strXd);
                batteryNotLowTracker2 = new BatteryNotLowTracker(context3, taskExecutor);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            short sXd = (short) (C1499aX.Xd() ^ (-11613));
            int[] iArr = new int["FRGTPIC\f@KIN>FK\u00048cafVhc".length()];
            QB qb = new QB("FRGTPIC\f@KIN>FK\u00048cafVhc");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
                i4++;
            }
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Yd("zy\nW\b\t\u0006\u0004~}\u0012\b\u000f\u000fd\u0012\u0012\u0019\u000b\u001f\u001c", (short) (C1607wl.Xd() ^ 5771)), new Class[0]);
            try {
                method3.setAccessible(true);
                Context context4 = (Context) method3.invoke(context, objArr3);
                Intrinsics.checkNotNullExpressionValue(context4, strXd);
                constraintTrackerNetworkStateTracker = NetworkStateTrackerKt.NetworkStateTracker(context4, taskExecutor);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(Xg.qd("Yg^mkfb-cppwisz5Kxx\u007fq\u0006\u0003", (short) (C1633zX.Xd() ^ (-11110)), (short) (C1633zX.Xd() ^ (-13666)))).getMethod(Jg.Wd("|\u001e\u0019/\t\\F\u000e4\u0014q\u0012eWwN\u0018\u0002 ~e", (short) (FB.Xd() ^ 12519), (short) (FB.Xd() ^ 31428)), new Class[0]);
            try {
                method4.setAccessible(true);
                Context context5 = (Context) method4.invoke(context, objArr4);
                Intrinsics.checkNotNullExpressionValue(context5, strXd);
                storageNotLowTracker = new StorageNotLowTracker(context5, taskExecutor);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker2, constraintTrackerNetworkStateTracker, storageNotLowTracker);
    }

    public final ConstraintTracker<Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    public final ConstraintTracker<NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    public final ConstraintTracker<Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }
}
