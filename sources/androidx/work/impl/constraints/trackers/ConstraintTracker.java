package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Xg;
import yg.ZN;
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
/* JADX INFO: compiled from: ConstraintTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lrA0ZeP.hS2\u000fq\u0001<$i$yCAX #8ޛwPm˧|I\u000b\u000bq\u000fF+~l<Mcyu\u0012=4RsM6eok=žx6\u0013%z4F\u0011\u001d\u0001HBx\u001a\u0005\u0014[Q\u001c\u0014@@'í\u0001\u001d\u0016\u0017(,\u001e>N\u0019NfugNN|_J/YɅ\u0018R\u0017-mK\u0015M;^\u001bKU|o:C@eM[I$\u0015\u0015Xs?1AHܺ\u0007ص+-3ɞ\fY<_\u000e\u001ce;]\u0016ut<[;ĩ7ϲ3˦SeSP\u001c2H\u000b\n\u0018T\u0004Dͺ}υ0ǉ\u001ej \u00109\u0001\u0001`\u0011h\u0010lZ\f\u000biF\u001d5\u0002C+oӕ\u0015a\u0010Jo\u05ce9߉\t\r&ŀQz/ll\u000e\u000f\u0015qƛyΦ5QH׀\u0019p\u0018lUm:͏\u0013\u00068\u0016HG6\u07fc2Ul[{ڢgޠ'+\u0004\u0004NXu\u0004%bnhwh\u0019L0q.7X\rbɱF\u0081\tkXӹй0."}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "\"", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "B`b88?>Q)\u000e\u0005k", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u001d8\u0005+5l}\u001eG| ;\u001727y:}(h_I\u0016m9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005o<)\u001c2qH\u000bj:\u0018\u0006#URN?\\P\u0003L\u001e\u001f$|J9\u0013dlA\"~SA,]o:", "/o_\u0010b5MS,\u000e", "5dc\u000ec7\u001c]\"\u000ezq;", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "1ta?X5MA(z\n^", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ":hbAX5>`'", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCn\u0017&\u001d", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#[*@{%;IGDz\u001b\"#waB\u0007p\u0002", ":nR8", "<df g(MS", "AsPAX", "5dc g(MS", "Adc g(MS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "/cS\u0019\\:MS\"~\b", "", ":hbAX5>`", "@d\\<i,%W'\u000ezg,\n", "AsP?g\u001bKO\u0017\u0005~g.", "As^=G9:Q\u001f\u0003\u0004`", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class ConstraintTracker<T> {
    private final Context appContext;
    private T currentState;
    private final LinkedHashSet<ConstraintListener<T>> listeners;
    private final Object lock;
    private final TaskExecutor taskExecutor;

    public abstract T getInitialState();

    public abstract void startTracking();

    public abstract void stopTracking();

    protected ConstraintTracker(Context context, TaskExecutor taskExecutor) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("\u001b((/!52", (short) (C1607wl.Xd() ^ 14522)));
        Intrinsics.checkNotNullParameter(taskExecutor, C1561oA.Yd("\u0015\u0003\u0016\u000fi\u001e\f\u000b\u001e\u001e\u001a\u001e", (short) (C1633zX.Xd() ^ (-13234))));
        this.taskExecutor = taskExecutor;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("/=4CA<8\u00039FFM?IP\u000b!NNUG[X", (short) (ZN.Xd() ^ 154), (short) (ZN.Xd() ^ 25518))).getMethod(Jg.Wd(">@B:]\u0001o \u0006/-UOq9\u0011\u0004\u001518_", (short) (C1499aX.Xd() ^ (-26305)), (short) (C1499aX.Xd() ^ (-18493))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(context2, ZO.xd("]$kKhKOZb0}t3T7t6F\u001b\u0006v\u0002]kT\u0004", (short) (FB.Xd() ^ 424), (short) (FB.Xd() ^ 3225)));
            this.appContext = context2;
            this.lock = new Object();
            this.listeners = new LinkedHashSet<>();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected final Context getAppContext() {
        return this.appContext;
    }

    public final void addListener(ConstraintListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            if (this.listeners.add(listener)) {
                if (this.listeners.size() == 1) {
                    this.currentState = getInitialState();
                    Logger.get().debug(ConstraintTrackerKt.TAG, getClass().getSimpleName() + ": initial state = " + this.currentState);
                    startTracking();
                }
                listener.onConstraintChanged(this.currentState);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeListener(ConstraintListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                stopTracking();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final T getState() {
        T t2 = this.currentState;
        return t2 == null ? getInitialState() : t2;
    }

    public final void setState(T t2) {
        synchronized (this.lock) {
            T t3 = this.currentState;
            if (t3 == null || !Intrinsics.areEqual(t3, t2)) {
                this.currentState = t2;
                final List list = CollectionsKt.toList(this.listeners);
                this.taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTracker._set_state_$lambda$4$lambda$3(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_state_$lambda$4$lambda$3(List listenersList, ConstraintTracker this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(this$0.currentState);
        }
    }
}
