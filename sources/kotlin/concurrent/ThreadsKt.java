package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bӵLc\u0003\rI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tvAӄLeV4Zݷ2\u000f\u0002{<$i$yCAU\"}0ޛWN}gvJ`\f[W\u0014ǝ\u0011jZH\u0006~c\u0012\u001d2Zom4}uC9nvN\u0005N3R@\u007f\u0005\u000f\u001dBJ&u)G{\u0014\u00180NuRT#L3 B\fD \u000f%tg|>xvkCG)\u0013kRNUj^\u0007e>T`?\r=n>1FʺC\"MS1\u0015zaO\u0005Oq\u0004\u0012\u00176W5W\u0004o<h\u0002$\u0015q\\;g9̮b՝PӠВ++]t֢P\u00130z\u0001Ԣ=j\u0003أ\n9"}, d2 = {"Bga2T+", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "AsP?g", "", "7r3.X4H\\", "1n]AX?M1 z\tl\u0013\u0007\u0005.e\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "<`\\2", "", ">qX<e0Mg", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u001ce\u001a>b", "\"", "", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u0016/a~\u000f\u0006>|\u001el.u\u0018K})>#\u00031?7\u0017>VAJo>'#2BI\u0010a;R\u00010\u0012\"\u0012\u0013aN\u00049]\u0019V\u0017Ptv\u0002^A\"}\u001a", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ThreadsKt {
    private static final <T> T getOrSet(ThreadLocal<T> threadLocal, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(threadLocal, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        T t2 = threadLocal.get();
        if (t2 != null) {
            return t2;
        }
        T tInvoke = function0.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.concurrent.ThreadsKt$thread$thread$1] */
    public static final Thread thread(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ?? r1 = new Thread() { // from class: kotlin.concurrent.ThreadsKt$thread$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                block.invoke();
            }
        };
        if (z3) {
            r1.setDaemon(true);
        }
        if (i2 > 0) {
            r1.setPriority(i2);
        }
        if (str != null) {
            r1.setName(str);
        }
        if (classLoader != null) {
            r1.setContextClassLoader(classLoader);
        }
        if (z2) {
            r1.start();
        }
        return (Thread) r1;
    }

    public static /* synthetic */ Thread thread$default(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, Function0 function0, int i3, Object obj) {
        int i4 = i2;
        ClassLoader classLoader2 = classLoader;
        boolean z4 = z3;
        boolean z5 = z2;
        if ((i3 + 1) - (1 | i3) != 0) {
            z5 = true;
        }
        if ((2 & i3) != 0) {
            z4 = false;
        }
        if ((4 & i3) != 0) {
            classLoader2 = null;
        }
        String str2 = (8 & i3) == 0 ? str : null;
        if ((i3 & 16) != 0) {
            i4 = -1;
        }
        return thread(z5, z4, classLoader2, str2, i4, function0);
    }
}
