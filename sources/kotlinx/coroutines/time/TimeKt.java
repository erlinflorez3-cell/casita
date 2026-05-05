package kotlinx.coroutines.time;

import com.dynatrace.android.agent.Global;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u000bnjO0L͜P.hS2\u000f\u0002{<$iҕyCAU\"}8\tWN}gvJp\u000bK\u000f\f\u0017\u0001j:P]ތu&\u001d˰Zom2}sK9xtd\u0006f\u074c`أ}\u0005\u000f\u001cBl\u001ey\u0013I[\u000e\"0\u0007uhV-O\u000b܅ \u000bf&\u0011 lg\u0015;vp\u000e>=)\u001bipOmdH![\u0014^Z7\u000f\u0007ad0n;U\u0017+م\u0011\fzaO\u0005Oq\u0004\n\u0017+W/W{o6\u0007\u0001Z\u001aC\u000f\u001bf\u000b&\u000b\u0004qb\u0012ʬ9Y\fQ`\u00108wA\u0006;G4\u0012\u0014'`.[\u001b\u0017\"\u001c?\r\tY?`\nnH\u0010|q6]/.A;=+hg`i(|D߉\t\r,3\u0019?/ll\u000e'\u001a;V}\u0383?VpAVN\"Ykn4\u0016p\u000eB%6F\u00101\f\u0011\\*5?k?3#{\u0002\u000fI\u0016\u0005\u0015dxU\u007fQvOP\u0001ގ;*\u000f !լ#ʐkX\\^2\u0010]\u001cb\u0007\u001c\u0007˙$\\\u0006Q9j\u001edgj\u007fi\u0014b*'5ωE^\u001fo\u001cWQ^a6\u0002\t\u001emj\u0018\u001a>Ld\u0015X\u0015Uc\u0014jb8$BH1\u0015&\nTR\u001c\u0015H> +b>֞\u001d\\\u001b\\I٣\u0001˩\u0001\tmo\u0001\u001a\rkK$1\u0002Lt7\u0002\u0017\\˂s\u0001"}, d2 = {"2d[.l", "", "2ta.g0H\\", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016g\u001d!Vv\u0012E@#?f\b0Fq\u001f.[\r\u0019u=-\u0019qq5\u0016g6WLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "2dQ<h5<S", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "Bh\\2b<M", "A`\\=_,", ">da6b+", "=mC6`,Hc(", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0014}\u001a5LCHA", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFJ&2TB;x\n\u0005\u001adr5Pr0Vvp&\\[(kV|Fix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0013OXf", "Ehc5G0FS#\u000f\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001bL\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "Ehc5G0FS#\u000f\nH9e\u00196l", "1nT?V,-]\u0001\u0003\u0002e0\u000b", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TimeKt {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Duration duration) {
        return FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final Object delay(Duration duration, Continuation<? super Unit> continuation) {
        Object objDelay = DelayKt.delay(coerceToMillis(duration), continuation);
        return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
    }

    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, Duration duration, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), function1);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, Duration duration) {
        return FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <T> Object withTimeout(Duration duration, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return TimeoutKt.withTimeout(coerceToMillis(duration), function2, continuation);
    }

    public static final <T> Object withTimeoutOrNull(Duration duration, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), function2, continuation);
    }
}
