package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.ZN;

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
/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq|<$q$yّCU(}*\tUQog\u0005Jb\u000bI\u000f\f*\u000f̓\\I\u0004w\u0016\u0011$rM\u007fCAM\b=gaҽ:\u0005.4j>\b\u0012\u0019\u001aXVV\u000bCIY\u001b*0n~\u0001fUS\u0013**\u0006l.G2%m\\G`l\fHu7KwP`?_^\u000b}\u0011Tg?\r%ud+\u0011CC\u0018=S1\u000b)¼AƄCqEݛ9550aum5\u0007\u0006jƆ7̠\u0011]z̦-\u0017_g$'YW\u001a '˂*Þ~\u007f%>\n\u0017\u00141\u0019:;%~\b<?KɄUĖT\u0002fۍȾ~w"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.\u0001$(Km\u000e#z&5W\u0012\u001e>mt2[N7z2!\u0015u7", "", ">q^C\\+>`", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DCY\u001f", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ":`bA70L^\u0015\u000exa\u0019\r\u00128a|/{", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.\u0001$(Km\u000e#z&5W\u0012\u001e>mt2[N7z2!\u0015u \u0018\u000bq7J\u0006%J9^5eNoD\u0014g", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "5dc\u0019\\->Q-|\u0002^", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5/", "@dV6f;Kg", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "=mB2e=BQ\u0019i\b^\u001a\r\u0014/ri1XD\n\u0016", "", "=mB2e=BQ\u0019i\b^\u001a\r\u0014/ri1YM\u0001\u0013&G", "=mB2e=BQ\u0019i\b^\u001a\r\u0014/ri1Z@\u000f&$Q\u0004", "=mB2e=BQ\u0019i\b^\u001a\r\u0014/ri1iO|$&", ">nbA70L^\u0015\u000exa\u0019\r\u00128a|/{", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "\u0012hb=T;<V\u0006\u000f\u0004g(y\u0010/", ":hU2V@<Z\u0019F\t^9\u000e\r-ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ServiceLifecycleDispatcher {
    private final Handler handler;
    private DispatchRunnable lastDispatchRunnable;
    private final LifecycleRegistry registry;

    public ServiceLifecycleDispatcher(LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new LifecycleRegistry(provider);
        this.handler = new Handler();
    }

    private final void postDispatchRunnable(Lifecycle.Event event) throws Throwable {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        Handler handler = this.handler;
        Intrinsics.checkNotNull(dispatchRunnable2);
        Object[] objArr = {dispatchRunnable2};
        Method method = Class.forName(C1561oA.Qd("KWLYUNH\u0011QT\u000e'?K@G?K", (short) (ZN.Xd() ^ 3594))).getMethod(C1561oA.od("<:==\t;\f7316\u0010&\u00103\"1 ", (short) (C1607wl.Xd() ^ 27263)), Class.forName(C1593ug.zd("?7M9\u0007F<JD\f1UOPDFQK", (short) (C1580rY.Xd() ^ (-8595)), (short) (C1580rY.Xd() ^ (-13704)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void onServicePreSuperOnCreate() throws Throwable {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnBind() throws Throwable {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnStart() throws Throwable {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnDestroy() throws Throwable {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnjG9L͜P.`S2şqڔJř\f$ B{h*\u00020\tgN\u0016h~Nh\r[\u000f4\u0019ѱn,WYAc \u0018JB\u001eIya@LGb\r63#ݨ&>\u0002ڎ\u0019\u001c0M\u001e|KOY\f*0nq\u0011Ĩ\u000f̂\t\u001a\u001aß\u000f,\u000f%tg|>\u001fǐiƠ3#\u000b݃ŒR2"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.\u0001$(Km\u000e#z&5W\u0012\u001e>mt2[N7z2!\u0015u \u0018\u000bq7J\u0006%J9^5eNoD\u0014g", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@dV6f;Kg", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\"Y\u007f$E|#B#*7t3+\u001fl`LPj0Ov%[JU,&9v>\u0014\u0010n\fU+KdjA-}\u001az\u0010", "5dc\u0012i,Gb", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5\u0018]17v%\u0004", "E`b\u0012k,<c(~y", "", "@t]", "", ":hU2V@<Z\u0019F\t^9\u000e\r-ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DispatchRunnable implements Runnable {
        private final Lifecycle.Event event;
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(LifecycleRegistry registry, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }
    }
}
