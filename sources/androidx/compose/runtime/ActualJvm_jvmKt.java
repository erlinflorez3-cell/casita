package androidx.compose.runtime;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,p\bӵLc\u0003\u0010Iي8\u000b<B\u0007Ӭ4\u0012\u0006јnʑA0RkP.XT2\u000f\u0002{<řc$\bCCU0}*\tUWog\u0005JbŏK\u000f\u001c\u0016\u0001̓DOcތu\u0012=1\tģW9[oU9\u000fu|ӌ8@0:\u0012\u0005/\u001dZL\u001ez\u0013Cy\u0011XؓX\u0001HX%M3!B\fL(\u0019 rf|;\u000fǍu`=,\u001bipQWc>\u0007e\rt_W\u001c\u0005m66P9E\u0015SV1\u0014қ_?\tM8ܵݾl'5:a eFp\u007fZ&KQ\u0013ƞ\u00017\r\t_j$'YZ\u0014Z^\u001a@\u0003\u000b}\u001d<J\u001f44ρ2- tNԄ\u07baxraRh*lU\u0018z(J7'\u0006đ9MKj_vS\u0019|<,\u000f\u001b4;\u0007~#kTTtC(\u001bȯWśU@K_v&_Ɲ{\u001c\td\bÏ\u0012Ig\u0006?}!.]>eui)1m\u0012H\u000b\u0001%\u001f\trY֟`c`\"\u001d2g*7(ʗH\u0002"}, d2 = {"1ta?X5MB\u001c\fzZ+`\b", "", "1ta?X5MB\u001c\fzZ+e\u00057e", "", "3mbBe,&c(zwe,", "", "7s", "", "7cT;g0Mg{z\ta\n\u0007\b/", "", "7mbAT5<S", "7me<^,\u001c]!\n\u0005l(y\u0010/", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "1n\\=b::P ~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001b\u0001Pu", "7me<^,\u001c]!\n\u0005l(y\u0010/F\n5h@\u000f'\u001eV", "\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001b\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c", "Ax]0[9H\\\u001d\u0014z]", Global.BLANK, ":nR8", "0k^0^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "\u000fs^:\\*+S\u001a~\b^5z\t", "$", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\"dbAB5Eg", "\u001ana4\"1>b\u0016\fvb5\u000bR+n\t2\u000b<\u0010\u001b!P}W+v3DC\u0007'KC", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ActualJvm_jvmKt {
    public static /* synthetic */ void AtomicReference$annotations() {
    }

    public static final void ensureMutable(Object obj) {
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3634synchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }

    public static final void invokeComposable(Composer composer, Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, Function2<? super Composer, ? super Integer, ? extends T> function2) {
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(composer, 1);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }
}
