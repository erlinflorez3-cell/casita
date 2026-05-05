package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\bl˸ˏ/Z͜f3\u0003SX\u000e${8)$2\u007fCSUH~R\r]P\u007fg\u001dM!/å\u0013\f"}, d2 = {"\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "", "7mc2e*>^(", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1gP6a", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", "\u0011gP6a", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a&yCQU\"}(\u000bU3}˧\u001fJ\t\n\f\u0015\u0014\u0016\u0011jZJ\u001c\u001d&\u0018\u001d4Zom6\u0014\u0014\u0006AnxN\u000761P=@)I(8N(v)J{\u0010 8Xph[SqM  \u0010V /!#\f\u0017<Vtu:],I\u000e\u000bd5jH|{εvX5\u0019\u000faL.p;C\"=S1\u0015\u0019\u007f\b\u0019M\u0001U\u0005\u0017ѧW/W\u007fo6\u0007\u0003D\u00199\\%]!4#)\u001av\u001a7CO\u0012֟\u0001\u00126\u0004\u0013{;?4\u0012\u00144`.[(-,V9\u0003\u0004k@~\u0005%fȾ~s"}, d2 = {"\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", "", "1`[9", "\u001anZ5g;I!b\\ve3R", "1n];X*MB\u001d\u0007zh<\fp3l\u0007,\n", "", "1n];X*MW#\b", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1Q", ">q^0X,=", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "@dP1G0FS#\u000f\nF0\u0004\u00103s", "Ehc566G\\\u0019|\nM0\u0005\t9u\u000f", "Bh\\2b<M", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "Ehc5E,:R\b\u0003\u0003^6\r\u0018", "Ehc5J9Bb\u0019m~f,\u0007\u0019>", "EqXAX\u001bB[\u0019\t\u000bm\u0014\u0001\u00106i\u000e", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i2, TimeUnit timeUnit);

        Chain withReadTimeout(int i2, TimeUnit timeUnit);

        Chain withWriteTimeout(int i2, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<řaҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f>\u0014\u0017\u0011jZK\u0006\u001ac\u0014\u001d5Z\u000bOD]~k>žx@\u000b&B(>\u0001\u0015\u0003 0n\u0018\u0007|SK:\u001b^D7ôZԁLĨ܈\u0012\u000bF#\u0007ɀ\r\u0016MɍLv"}, d2 = {"\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^!\u001fRk\u0017@\u0001.\u000b", "", "u(E", "7me<^,", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1gP6a", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final Function1<? super Chain, Response> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return block.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
