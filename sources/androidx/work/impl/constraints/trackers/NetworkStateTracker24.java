package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я5\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0011s{:%c$\u007fCCU }J\b[Tf}ñz`\u001bE\u001f\u0006Dx\u0019+\nh\ta \u0010JB\u001eACQ}@Q`#:ӯ$20=B\u000b\u000f(BH>\u0006AW\u0014\u0012 @XphaSaU& \fV /%3ɤPɇLleŽ\u007f5\u0011qZNU_fQ$όHù+\u0011\u000fc$4NA\u0006#3^\u001b\u0007\u0001g\u0016ŤAџA\u0007p'58ʇwh"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005T4-'rn?tr(]v\u0016THL2\\_?\fi", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#f F\u007f ;S1JgC\u001ej", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]o:", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u0015!P}\u001dIr)>h\fi m%@WPAYC\u001a$h7", "<dcDb9D1\u0015\u0006\u0002[(z\u000f", "/mS?b0=fb\u0011\u0005k2F\r7p\u0007qyJ\n%&Tk\u0012E\u00063~h\u000b\u001c5s\u0016;[\r$kC0\u001fug'\u0016_;Ne4CJT,i\u001fA{\u001d\u0012i X8\u0013bUH+k@5%Fw", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005T4-'rn?tr(]v\u0016THL2\\_?\fR\u001bZ\u001d`5\u001a\u000b7=+uA3\u001d\u000ej\u0015W", "AsP?g\u001bKO\u0017\u0005~g.", "", "As^=G9:Q\u001f\u0003\u0004`", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;
    private final NetworkStateTracker24$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v41, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(Context context, TaskExecutor taskExecutor) throws Throwable {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("7DDK=QN", (short) (C1633zX.Xd() ^ (-16135))));
        Intrinsics.checkNotNullParameter(taskExecutor, Wg.Zd("\u0003.?6/_KH9vnp", (short) (C1499aX.Xd() ^ (-22275)), (short) (C1499aX.Xd() ^ (-10552))));
        Context appContext = getAppContext();
        String strXd = C1561oA.Xd("w\u0005\u0005\u0006}|\u000f\u0005\u0013\u0007\u0013\u0019", (short) (OY.Xd() ^ 8617));
        Class<?> cls = Class.forName(Wg.vd("CQDSMH@\u000bMZV]KUX\u00135b^eSg`", (short) (C1580rY.Xd() ^ (-26024))));
        Class<?>[] clsArr = {Class.forName(Qg.kd("\f\u0002\u0016\u007fK\t|\t\u0001Fj\u000b\b}\u0002y", (short) (OY.Xd() ^ 6703), (short) (OY.Xd() ^ 10276)))};
        Object[] objArr = {strXd};
        short sXd = (short) (ZN.Xd() ^ 6231);
        short sXd2 = (short) (ZN.Xd() ^ 30611);
        int[] iArr = new int["{x\u0007d\n\u0003\u0003ry^o{~pij".length()];
        QB qb = new QB("{x\u0007d\n\u0003\u0003ry^o{~pij");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(appContext, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.ud("28.-_\"\u001f+**.X\u001a\u001cU\u0018\u0015&&P$\u001eM\u001b\u001b\u0019V\u0017\u001d\u0013\u0012D\u0018\u001c\u0012\u0006?\u007f\f\u0001\u000e\n\u0003|E\u0005z\tAU\u0001~}sp\u0001t\u0001r|\u0001Sfrdifr", (short) (ZN.Xd() ^ 17590)));
            this.connectivityManager = (ConnectivityManager) objInvoke;
            this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                    Logger.get().debug(NetworkStateTrackerKt.TAG, "Network capabilities changed: " + capabilities);
                    NetworkStateTracker24 networkStateTracker24 = this.this$0;
                    networkStateTracker24.setState(NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    Logger.get().debug(NetworkStateTrackerKt.TAG, "Network connection lost");
                    NetworkStateTracker24 networkStateTracker24 = this.this$0;
                    networkStateTracker24.setState(NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager));
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState getInitialState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e2) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e2);
        } catch (SecurityException e3) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e3);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Unregistering network callback");
            NetworkApi21.unregisterNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e2) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e3) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e3);
        }
    }
}
