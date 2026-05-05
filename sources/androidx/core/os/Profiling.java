package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.core.os.Profiling;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,u\bDJg|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS8\u000fsڔ<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u000f\u001e*\u0007rDOezm\u0012=<pxo7[zU9\u000f\u0001|\n8V0@\u0012\u0005/'ZL\u001e\u0002\u0013Cy\u0018B4N~RR;\\5$ \u0016V&\u0011 lg|@v}$?GS\u0011{ZNUl`\u0001[\u0018^TU\u0019'e,>X7c)UY\u0011\u0015j]U\u0002m\u0001m\u0011v7?3Yug6\u0007\n*\u0014Y`Sb\u000bBj\u001ai`:4[SqVh\u000eV\u0004+\u0006\u001bL\u001c\u0014\u0016)X.[$\u0015\u0019T8\u0015~aóh\u0002\rAVа4ي\u001b%\bđKE)fiai\u0018%ќN˿\u0011\u001e+Ч\u000f-iU&`C\u001a+Ȱ$śU@Eʰn\u0016g?\u0006\u0004\u001faXÒVΥK\u007f7Ʌ1:%(O[g\"wȀTҩHg~ݓ\u0001tamjHn!Eݮ\nҊ\r\fbե\u0005\u0011yUlXZ\u0017$ȿ'Θ\u0002\b\u001b\u05fe|\u0004J(=\u0010|U?Ȍ=ܷa\n-Äϲ;o"}, d2 = {"\u0019DH,5\u001c\u001f4xkt?\u0010co)Pi\u000f_\u001et", "", "\u0019DH,7\u001c+/\bbdG&dv", "\u0019DH,9\u0019\u001e?\t^c< vk$", "\u0019DH,F\b&>\u007fbc@&`q\u001eEl\u0019W'zs\u000b6O{", "\u0019DH,F\u001033\u0013dW", "\u0019DH,G\u0019\u001a1~x_:\u001dX\u0003\u000bLf\u0012Y\u001coz\u00010]", "$@;\"8&\u001bCy_ZK&]l\u0016Ly\u0013e'dt\u000bANq*T\u0001\"8", "", "$@;\"8&\u001bCy_ZK&]l\u0016Ly\u0013e'dt\u000bA\\q%X\u001f\u0012I^\u0001\u0017Z", "@dV6f;>`y\t\b:3\u0004s<o\u0001,\u0003D\n\u0019\u0004G}\u001eC\u00063", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001a`]1e6BRb\t\t(\u0017\n\u00130i\u0007,\u0005Bm\u0017%Wv\u001d\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", ":hbAX5>`", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E\u001e\u000b %Ww\u000eIL", "@d`BX:M>&\t{b3\u0001\u00121", ">q^3\\3B\\\u001bkzj<|\u0017>", "\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\r", "Cma2Z0Lb\u0019\f[h9X\u00106P\r2|D\b\u001b I\\\u000eJ\u0007,Dg", "1na2R9>Z\u0019z\t^"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1, reason: invalid class name */
    /* JADX INFO: compiled from: Profiling.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u0018\b\tvjg1re\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001a`]1e6BRb\t\t(\u0017\n\u00130i\u0007,\u0005Bm\u0017%Wv\u001d\u0012"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|\u0001t>\u0001\u0006Ad\b\u0006}\u0002\u0006\u0004\n\u0004A\u0011\u0005\b\u000b\u0016\u0018\n\u0018l\u0017\u001bj\u0017\u0018| \u001e\u0016\u001a\u001e\u001c\"\u001c\b\u001c+.&//`n", f = "\u001d>:02404,q.6", i = {}, l = {79}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super ProfilingResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super ProfilingResult> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final Consumer consumer = new Consumer() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.AnonymousClass1.invokeSuspend$lambda$0(producerScope, (ProfilingResult) obj2);
                    }
                };
                Context context = this.$context;
                Object[] objArr = {ProfilingManager.class};
                Method method = Class.forName(Qg.kd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (C1633zX.Xd() ^ (-4541)), (short) (C1633zX.Xd() ^ (-30107)))).getMethod(C1561oA.ud("\u0003\u007f\u000ek\u0011\n\ny\u0001ev\u0003\u0006wpq", (short) (Od.Xd() ^ (-20805))), Class.forName(hg.Vd("0&:$o-!-%j~'\u001b,+", (short) (C1499aX.Xd() ^ (-25642)), (short) (C1499aX.Xd() ^ (-17316)))));
                try {
                    method.setAccessible(true);
                    final ProfilingManager profilingManager = (ProfilingManager) method.invoke(context, objArr);
                    profilingManager.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda1
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            runnable.run();
                        }
                    }, consumer);
                    this.label = 1;
                    if (ProduceKt.awaitClose(producerScope, new Function0<Unit>() { // from class: androidx.core.os.Profiling.registerForAllProfilingResults.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            profilingManager.unregisterForAllProfilingResults(consumer);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(Wg.vd("ihpq\"wo!%qapoh] 6yy{\u0002\u0006u15xz\u0004yvm0\u0006^MYJ\u0003CPPNQQCI=", (short) (C1607wl.Xd() ^ 16395)));
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ProducerScope producerScope, ProfilingResult result) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            producerScope.mo10484trySendJP2dKIU(result);
        }
    }

    public static final Flow<ProfilingResult> registerForAllProfilingResults(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FlowKt.callbackFlow(new AnonymousClass1(context, null));
    }

    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> consumer) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.yd("v\u0002\u0004\tt\u0007\u0006", (short) (FB.Xd() ^ 21934)));
        Intrinsics.checkNotNullParameter(executor, C1561oA.Yd("WkYXkkgk", (short) (ZN.Xd() ^ IptcDirectory.TAG_EXPIRATION_TIME)));
        short sXd = (short) (OY.Xd() ^ 27179);
        short sXd2 = (short) (OY.Xd() ^ 28353);
        int[] iArr = new int["\u007f}\t\u000b|\u0007~\r".length()];
        QB qb = new QB("\u007f}\t\u000b|\u0007~\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(consumer, new String(iArr, 0, i2));
        Object[] objArr = {ProfilingManager.class};
        Method method = Class.forName(Jg.Wd("g=g\u0007_.Zo:vi-.\f>H\u0012r+\u0005J\u0007\u0016", (short) (C1607wl.Xd() ^ 31210), (short) (C1607wl.Xd() ^ 16561))).getMethod(C1626yg.Ud("F,<\u0018BG\nQvYqAuF\u0007k", (short) (C1607wl.Xd() ^ 19659), (short) (C1607wl.Xd() ^ 16867)), Class.forName(ZO.xd("@2<;y`J26\ng~0\u0007S", (short) (FB.Xd() ^ 14486), (short) (FB.Xd() ^ 23671))));
        try {
            method.setAccessible(true);
            ((ProfilingManager) method.invoke(context, objArr)).registerForAllProfilingResults(executor, consumer);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> consumer) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 20760);
        int[] iArr = new int["t\u0002\u0002\tz\u000f\f".length()];
        QB qb = new QB("t\u0002\u0002\tz\u000f\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd2 = (short) (OY.Xd() ^ 11508);
        short sXd3 = (short) (OY.Xd() ^ 32002);
        int[] iArr2 = new int["\bN\tBB\u0004+1".length()];
        QB qb2 = new QB("\bN\tBB\u0004+1");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(consumer, new String(iArr2, 0, i3));
        Object[] objArr = {ProfilingManager.class};
        Method method = Class.forName(C1561oA.Xd("GUL[YTP\u001bQ^^eWah#9ffm_sp", (short) (Od.Xd() ^ (-19344)))).getMethod(Qg.kd("FCQ/TMM=D):FI;45", (short) (C1633zX.Xd() ^ (-2912)), (short) (C1633zX.Xd() ^ (-617))), Class.forName(Wg.vd("C9M7\u0003@4@H\u000e\"J>ON", (short) (Od.Xd() ^ (-13635)))));
        try {
            method.setAccessible(true);
            ((ProfilingManager) method.invoke(context, objArr)).unregisterForAllProfilingResults(consumer);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Ig.wd("z9*\u0010\bf\u000f", (short) (C1499aX.Xd() ^ (-29949))));
        Intrinsics.checkNotNullParameter(profilingRequest, EO.Od("_/oJ=\u0016+O\fV_U)\u001bx_", (short) (OY.Xd() ^ 19671)));
        Object[] objArr = {ProfilingManager.class};
        Method method = Class.forName(C1561oA.Qd(";G<IE>8\u00015@>C3;@x\r86;+=8", (short) (ZN.Xd() ^ 23451))).getMethod(C1561oA.od("jguSxqqahM^jm_XY", (short) (C1607wl.Xd() ^ 27026)), Class.forName(C1593ug.zd("JBXD\u0012QGUO\u0017-WM`a", (short) (C1633zX.Xd() ^ (-26762)), (short) (C1633zX.Xd() ^ (-12912)))));
        try {
            method.setAccessible(true);
            ((ProfilingManager) method.invoke(context, objArr)).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
