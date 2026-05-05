package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&˛\bDZc|İI\u0006>\u00146B\u0005$4\u0012\u0006\bnʑ?\u0016Z͜p0Xݷ8\u000e\u001c\u0002D&k$8BiUb\u00110\ngN\u0016i\u001fNh\u000e[\u000f<ǝ?\u000f߽MU\u0007aZ\u001d@G\b?aO AGf\r63'xFة}\r"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,58}!7z#.L\u0019", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u0018\u0017T|\u000e;L", "1n\\=_,MS", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n\\=_,MSx\u0012x^7\f\r9n{/\u0003T", "3wR2c;B]\"", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface CompletableDeferred<T> extends Deferred<T> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r2, function2);
        }

        public static <T, E extends CoroutineContext.Element> E get(CompletableDeferred<T> completableDeferred, CoroutineContext.Key<E> key) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, key);
        }

        public static <T> CoroutineContext minusKey(CompletableDeferred<T> completableDeferred, CoroutineContext.Key<?> key) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, key);
        }

        public static <T> CoroutineContext plus(CompletableDeferred<T> completableDeferred, CoroutineContext coroutineContext) {
            return Deferred.DefaultImpls.plus(completableDeferred, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fnw\u000e\u0012\u0006HxoQ\t7&q_$OR]vBT%??%i\u001a9\fgJznQs\u0013KJ#V*\fH\u000b\u0001\u0011/:+Y\u0012\u0001u6G\u0001T\u0015L\u007fOBg2aszSfn;)\taEO9\u0004/a\u001eN_Q//CIf\u000f&8\u0001Aeo\u000b4+aHG\u0003.n8W\u0003\u0014\u0012Ci\u0004,W%\u0017}'':B\fV<\u000bS]=\u0003m0\\hg6 .w\u0012*\u0018xh\u000el\n{o\u000e.LvU\u001a]-2 Y?\u0011\u0001;WNaoS%nY%\u000f{\"Em1S:&\u0002")
        @InterfaceC1492Gx
        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }

    boolean complete(T t2);

    boolean completeExceptionally(Throwable th);
}
