package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
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
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:%c$\u007fCC٥\"}8\tWNmhtopŏk\u0011\fǝ\u0007i\\Oezm\u0012U1po\u007fF]sK:xtd\u0007060;\u0012\u0005/\u001eݵL\u0010\u0005\u007f\fY\u001a\u001eH@\u001fG\u0003\u0011[\u00132\u00124Mf%fbu^NH\u001bj\u0001Ck\twSf'\u000e=Ca]Rb-%v\u0010%\u0002«9߱\u0019%[ΈWbiG\u001b? F[ع)ݳ/M\fY<b\u000e\u001fƬ/a"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005HA(\u0011g_5\u0015r\u0019Nt'K]N9:\\{K#\u001fV\u0012W:{\u0012U?*nQ\r", "\"", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]o:", "0q^.W*:a(kz\\,\u0001\u001a/r", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "7mc2a;\u001fW \u000ezk", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "5dc\u0016a;>\\(_~e;|\u0016", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VP\u0012C\u0006%B/", "=m1?b(=Q\u0015\r\nK,z\t3v\u007f", "", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "AsP?g\u001bKO\u0017\u0005~g.", "As^=G9:Q\u001f\u0003\u0004`", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    private final BroadcastReceiver broadcastReceiver;

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Intent intent);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.this$0.onBroadcastReceive(intent);
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() throws Throwable {
        Logger logger = Logger.get();
        String str = BroadcastReceiverConstraintTrackerKt.TAG;
        StringBuilder sbAppend = new StringBuilder().append(getClass().getSimpleName());
        short sXd = (short) (C1499aX.Xd() ^ (-26790));
        short sXd2 = (short) (C1499aX.Xd() ^ (-10537));
        int[] iArr = new int["\u000fOv.2:S/R-\u0005\u0018!Hh\\\u000f\u0004c\u007fMU".length()];
        QB qb = new QB("\u000fOv.2:S/R-\u0005\u0018!Hh\\\u000f\u0004c\u007fMU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        logger.debug(str, sbAppend.append(new String(iArr, 0, i2)).toString());
        Context appContext = getAppContext();
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        IntentFilter intentFilter = getIntentFilter();
        short sXd3 = (short) (OY.Xd() ^ 23809);
        int[] iArr2 = new int["w]!\u0007\u001bH_HO+,\u0014Ve;^;a8V\tsE".length()];
        QB qb2 = new QB("w]!\u0007\u001bH_HO+,\u0014Ve;^;a8V\tsE");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Object[] objArr = {broadcastReceiver, intentFilter};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1593ug.zd("\u001d\u0011\u0014\u0017\"$\u0016$\u0005\u0019\u0018\u001b .\u001e,", (short) (C1607wl.Xd() ^ 9536), (short) (C1607wl.Xd() ^ 1955)), Class.forName(EO.Od("\u000eag\u001c\u00039\u0006R6to\u00161JZ8h\u000fc\rO&}\u0014d.\u001fvN@!sP", (short) (FB.Xd() ^ 30603))), Class.forName(C1561oA.Qd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fD^\u0003\bw\u007f\u0005Uwy\u0001p|", (short) (OY.Xd() ^ 28344))));
        try {
            method.setAccessible(true);
            method.invoke(appContext, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() throws Throwable {
        Logger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, getClass().getSimpleName() + C1561oA.od("C(|twijkttdpfjb\u001ak]Z[^jXd", (short) (OY.Xd() ^ 27672)));
        Context appContext = getAppContext();
        Object[] objArr = {this.broadcastReceiver};
        Method method = Class.forName(C1561oA.Kd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%", (short) (FB.Xd() ^ 7057))).getMethod(C1561oA.Xd("XRWKNQ\\^P^?SRUZhXf", (short) (C1580rY.Xd() ^ (-17067))), Class.forName(Wg.Zd("\u0003\u0018%&A\u001e N$?\u0019E\u0001)\u0018yd\b#w\"\u0006$\u0005!\u0005\u0003 j\u0017z\u001d\t", (short) (FB.Xd() ^ 10848), (short) (FB.Xd() ^ 26205))));
        try {
            method.setAccessible(true);
            method.invoke(appContext, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
