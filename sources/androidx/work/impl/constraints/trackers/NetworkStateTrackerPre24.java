package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

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
/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0011s{J$c$wFCU(}*ޛWN}gvϺ`ŏYƤ6\u001c\tl<I\u0004x\f\u0011OERsM4eok;pxD\b82P<ѩ\t\u0001(/\u0011\u001e\u0005\f[K:$`D~Mj\r{\u0019`&VJ.\u00076\\\u0016U\rԢnҺ>/+Ʌ:T\\/w0+MC\u001b+ܢ\u000fțe\"CB=>#/$\u001b\u0015]s?1K(\u0012[ة)ݳ/S\u0004Y<e\u000e\"--U\u001ck\u0003͏`\u001a"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005T4-'rn?tr(]v\u0016THL2\\_]J\u0014^)c", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005HA(\u0011g_5\u0015r\u0019Nt'K]N9:\\{K#\u001fV\u0012W:{\u0012U?*nQ\r", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#f F\u007f ;S1JgC\u001ej", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]o:", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u0015!P}\u001dIr)>h\fi m%@WPAYC\u001a$h7", "7mc2a;\u001fW \u000ezk", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "5dc\u0016a;>\\(_~e;|\u0016ma\t1\u0006O|&\u001bQx\u001c", "u(E", "5dc\u0016a;>\\(_~e;|\u0016", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VP\u0012C\u0006%B/", "=m1?b(=Q\u0015\r\nK,z\t3v\u007f", "", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;

    public static /* synthetic */ void getIntentFilter$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateTrackerPre24(Context context, TaskExecutor taskExecutor) throws Throwable {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("!,*/\u001f1,", (short) (FB.Xd() ^ 12620)));
        Intrinsics.checkNotNullParameter(taskExecutor, C1561oA.Yd("[I\\U0dRQdd`d", (short) (C1607wl.Xd() ^ 27255)));
        Context appContext = getAppContext();
        short sXd = (short) (OY.Xd() ^ 4454);
        short sXd2 = (short) (OY.Xd() ^ 13837);
        int[] iArr = new int["ANNOGFXN\\P\\b".length()];
        QB qb = new QB("ANNOGFXN\\P\\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (Od.Xd() ^ (-10795));
        short sXd4 = (short) (Od.Xd() ^ (-29202));
        int[] iArr2 = new int["e[B=+\u0016\u0002:VQC8\u001a\u0012\u0007+/L8/\u0011\u0015\u007f".length()];
        QB qb2 = new QB("e[B=+\u0016\u0002:VQC8\u001a\u0012\u0007+/L8/\u0011\u0015\u007f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1626yg.Ud("yV,p\b\u001a\u0016N}\nYOiveq", (short) (C1633zX.Xd() ^ (-2852)), (short) (C1633zX.Xd() ^ (-7358))), Class.forName(ZO.xd("\r\u00061\bawY'eT\u0019P8,k\r", (short) (C1580rY.Xd() ^ (-3958)), (short) (C1580rY.Xd() ^ (-691)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(appContext, objArr);
            Intrinsics.checkNotNull(objInvoke, Ig.wd("C|eJ\u0005\u00139N+p{\u0001\u0010\r;]\"V~n\u0001+yPz\u0012m^\u0010\u0014<\r}<:lH*6\u001a(D\u0010t<hh\"\nR&Pp\u0017NC2%IR_\u0015Pc\u000eH\u007fX", (short) (C1633zX.Xd() ^ (-30364))));
            this.connectivityManager = (ConnectivityManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION)) {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Network broadcast received");
            setState(NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        return new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState getInitialState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }
}
