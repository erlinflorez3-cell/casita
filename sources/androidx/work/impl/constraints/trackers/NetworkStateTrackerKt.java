package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,u\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0010nj?0Le^.Zݷ2\u000f\u0002{<řc$\bCC٥2\u001a0\u0013gTwi~J\t\fq\u001a6\u001a\u0007vDI\u0004\u0006\u000e\u0016\u001d@ZomB\u0014t]EnҚN\u0005N1x\u0603{ڱ\u0005\u001a2Ϻ0\u0013\tCc\f@1hphTC\f[܆\u0014ĂB*\u0011 bj\\:`nc?=)#\u007fPU?_^\u0005u\rtV]KMѮ ҋD;M\u0017+Z\u0011\u0010ҡ_O"}, d2 = {"\"@6", "", "/bc6i,'S(\u0011\u0005k2j\u0018+t\u007f", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#f F\u007f ;S1JgC\u001ej", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "5dc\u000eV;Bd\u0019gzm>\u0007\u00165S\u000f$\u000b@?\u0013 Py\u001d8\u0006)?b\f", "uKP;W9HW\u0018H\u0004^;Ff9n\t(yO\u0005(\u001bV\u0004u8\u007f!7Y\u000buz^", "5dc\u000eV;Bd\u0019gzm>\u0007\u00165S\u000f$\u000b@", "uKP;W9HW\u0018H\u0004^;Ff9n\t(yO\u0005(\u001bV\u0004u8\u007f!7Y\u000buzT\u00127LPEo31^zkF\r-0V\u0002.\u0011JX5ja\u007f9\u0018\u001bi\u001c\u0018\u0014\r\u0014kK1t2F\u001b\u0017,\u001f", "7r00g0OS\u0002~\np6\n\u000f a\u0007,z<\u0010\u0017\u0016", "", "uKP;W9HW\u0018H\u0004^;Ff9n\t(yO\u0005(\u001bV\u0004u8\u007f!7Y\u000buzb", "\u001cdcDb9DA(z\n^\u001b\n\u0005-k\u007f5", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkStateTrackerKt {
    private static final String TAG;

    public static /* synthetic */ void getActiveNetworkState$annotations(ConnectivityManager connectivityManager) {
    }

    public static final ConstraintTracker<NetworkState> NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new NetworkStateTracker24(context, taskExecutor);
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"NetworkStateTracker\")");
        TAG = strTagWithPrefix;
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        boolean zHasCapabilityCompat = false;
        try {
            NetworkCapabilities networkCapabilitiesCompat = NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager, NetworkApi23.getActiveNetworkCompat(connectivityManager));
            if (networkCapabilitiesCompat == null) {
                return false;
            }
            zHasCapabilityCompat = NetworkApi21.hasCapabilityCompat(networkCapabilitiesCompat, 16);
            return zHasCapabilityCompat;
        } catch (SecurityException e2) {
            Logger.get().error(TAG, "Unable to validate active network", e2);
            return zHasCapabilityCompat;
        }
    }

    public static final NetworkState getActiveNetworkState(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(connectivityManager), ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
