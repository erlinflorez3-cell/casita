package kotlinx.coroutines;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG1Le^.ZS0\u0010s{J$cҕyCIU\"}(\rWNupvJ`\rK\u000f\u001c\u0016\u0001j2R]xk\u0018\u0017˰JoM?UڎCʣf\u000bȂ-\"8ĲFx5\u0001H*\tƺu\u000bGY\r*0v\u0081JZ\u0013M\u0013\u001c*\bT\u001f/!l5T6Vpu\u0002?4\u0013xpTϮc:\u0003T\u001dLZ/\u001dxg$QIGF%4\nΈ\u07baVeE\nOwC\rx)-1o}gGh\u000fB ۣS\u0017cy6b\u000bYp\u000e-1uo[R\u001e(&\b\u0012\fj\t\u001e\u000e-H<;2h\u001e\rat\u0003[FP\u0010mZ\u0002\u0011`d\u001dӾ\u000451I)w\u001ayI0f7*\u0012=&1\u0019\u0007%kT\u0014aC4\u0005{_:i@kN\u0017\u0016gW\u0006\u0004'çHĖ\u0005ΥK\u007f=\u0017Y7%AO]O\"OnHӍE0E\u0013}\u0001\u001bycXOPtގ;4\u000f\u0013jJj\r{RZ^R\u001a]-d\u00164ܱ˙$f}C1+\u0016V_jopsg\u001a6?uedˇo\u0018]@n9;Ys\u0012gX\u001d O>r\u0005\u0007sXR:_#ͬ#zQx.\u0010}ZM:\u0013xƴrd=:P1^+G1$\t̍}QݴYv0\u0017ZC&\u0013iZڏ7ɖ\u0001bvouya,3ʠR5GQC\u001b>W8gb\u007fST\u0005s\u000eK\u007f\u0014W]|%$[ދ$  @a5C\u001b\u001f\u0001/8(6U]\u0003t\b˧ɟ+\u0005\u0003\u0001\u001fAn6w\npvRjz[_cE-Ցb|)\u000ft\u0006\u007fiV|Miz\u0017k@Yr1fRMf\u00025'$%\u000f}:~K,q'M\u001e}\u0014=$y_\u007fn\\\u007f)Ў%܌i\u0004:\u0005^\u0001psu2iLy_\ra:&\u0003\u0002pH1\u0382\t\u000b\u0010B1KHo\n7ߠ7\u0016\u0012=$~\u0007Z47úZ\u000b#}~L.\u0016͈*GTо`ǜ)\u0013USu\u007f>[j\rb\u0011 \n*4%\u0016r݃\"ݫ[b\u0011ݵVI&:Y\u0003r\u0016L\u0018R:ʙ@\u0012\u0011Jdo\f\u0018\u000b\u0002Le5 BS\u0004J\rՕ֭|f\\O\u0015fKh1,\u0007\u00055=.\nE@3xܑX9i9\u0011Y#\u0011+lU\u0005\r1;Fd9I5n\u007f9J\u0014G \u03818\u0086K)u @\u001cF&\u0015\u001fX\u0017I9\b\u00156ۃ2Ϳ\u000fUl̯5\u0007 ujP8(-\u00013\u0012\u0013\u0084\u0011Ո\u001dOzŷ3<Za\u00107q.7[ؐ-\u000b$~i[)Cދ9U"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d<u\u0003?b\r$@}\u0012=QMDA", Global.BLANK, "", "@dbB_;", "1`]0X3!O\"}\u0002^9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gvp8\u007f$<Y\u000bu", "=m2.a*>Z z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "D`[BX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n]AX?M", "", "7cT:c6MS\"\u000eg^:\r\u0011/", "1`]0X3\u001cO)\rz", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006t/Bc\u000e/;v\u0016<\u0017!7t2\u001e\u001cK]B\u0006j,[L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqNa|\u00131{l\f]\fP{^_>.hDh5`L=V^sk\bh\u001f&)=1\u001e\u0004\u0015\u0018oP\u0004Ml", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1`]0X3ES\u0018", "", "5dc\u0010T5<S \u0006z]", "u(I", "7me<^,!O\"}\u0002^9\u000b", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "1n\\=b5>\\(J", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006t/Bc\u000e/;v\u0016<\u0017!7t2\u001e\u001cK]B\u0006j,[L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqNa|\u00131{l\f]\fP{^_>.hDh5`L=V^sk\bh\u001f&)=1\u001e\u0004\u0015\u0018oP\u0004MbY\u001b\u0002Y}pz\u0011\u0017\u0005E.N|_OE}\u001f\u001a~/*R{\u0007\u001216~4\u00041\rD&Eh\u000fT=", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class CompletedContinuation<R> {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final Function3<Throwable, R, CoroutineContext, Unit> onCancellation;
    public final R result;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r2, CancelHandler cancelHandler, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj, Throwable th) {
        this.result = r2;
        this.cancelHandler = cancelHandler;
        this.onCancellation = function3;
        this.idempotentResume = obj;
        this.cancelCause = th;
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 + 2) - (2 | i2) != 0 ? null : cancelHandler, (i2 + 4) - (4 | i2) != 0 ? null : function3, (i2 + 8) - (8 | i2) != 0 ? null : obj2, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? th : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 + 1) - (1 | i2) != 0) {
            obj = completedContinuation.result;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            function3 = completedContinuation.onCancellation;
        }
        if ((8 & i2) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            th = completedContinuation.cancelCause;
        }
        return completedContinuation.copy(obj, cancelHandler, function3, obj2, th);
    }

    public final R component1() {
        return this.result;
    }

    public final CancelHandler component2() {
        return this.cancelHandler;
    }

    public final Function3<Throwable, R, CoroutineContext, Unit> component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final CompletedContinuation<R> copy(R r2, CancelHandler cancelHandler, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj, Throwable th) {
        return new CompletedContinuation<>(r2, cancelHandler, function3, obj, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.areEqual(this.result, completedContinuation.result) && Intrinsics.areEqual(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.areEqual(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.areEqual(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.areEqual(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        R r2 = this.result;
        int iHashCode = (r2 == null ? 0 : r2.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> cancellableContinuationImpl, Throwable th) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cancellableContinuationImpl.callCancelHandler(cancelHandler, th);
        }
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        if (function3 != null) {
            cancellableContinuationImpl.callOnCancellation(function3, th, this.result);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }
}
