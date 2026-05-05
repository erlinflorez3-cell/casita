package kotlinx.coroutines.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<C\u0007Ӭ4\u0012\u0006\u0013nj?4LeV7Zݷ2\u000f\u0002{<řc$\bCC٥\"}0\u000fWNmgvJp\u000bKƤ\u000e\u0016\u0007q4կ]xs\u0012\u00172XoG3SoE9ns>\u0005&3*8\u0010\u0005\t\u001a8H\u0018v\u0001DQ\f(ؓpphQ=M3\u001aR!N&\u000f\u001ftid5vnmB5#\u0011lZP=^^\u0001֔\u0011HZ,\u001b|*,9JO5C0\u0004\u0007\u0015^s?1L8QM\u000155CI\"ff\\\u000e$-+}\u001e\u000ex4n\u001dSv\u000bU/\u0016w\u0014w\u001c;\u0010z*!l\b\u001c\u001b?H\\CJn\u0016%Kx!l)P`vr\u0004\tmN\u0017S\ry?ݰ\u001ff_{\u00048\\R\u0014\u0005;:S\u0005|-sT<mE#b\u000fi5\u007fY&H-\" Qъ\bpp\u001fr >e\u0018/*-^\u001b3Ls9Q7\u001c\fVc\u007f|\u0015bxS\u0018sv`h\u0003^=8+$Zr\u0001Kk\u0019ZfO)MJXM\u0012X!.]\u0010>7$>P&řkҷQ]\u0012ɘ\u007ftE\\\u0007m$Vgb\n̓SӒ\u0014aZΘdQJi\u001dX\u0015A\n`1ٹ*ϒ6L\u0003\u0012}\u0004RWܥ\u0017V"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\r9g\f$@o}*QL\u0019uA(%weB\u0007B0\\\u0002#VJQ,i(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E(|\u001b %y\u001bF\u000749b}~;{!*\\A>kAs", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "1`d@X", "", "3qa<e\u000fB\\(", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~\\", "7l\\2W0:b\u0019", "5dc\u0016`4>R\u001dz\n^", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ~\u0013KxkF\u0004/Eh\u0002)7L\u001a<X?Ji7\u001e\">", "7r36f7:b\u0017\u0002c^,{\t.", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", ":h\\6g,=>\u0015\fve3|\u00103s\b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", ">`a._3>Z\u001d\r\u0003", "", "<`\\2", "7me<^,(\\\b\u0003\u0003^6\r\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "Bh\\2@0EZ\u001d\r", "", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>+\u001fxp=\u0010c\nX\u007f6G_]\u0002 9xG#\u0019^\u0017at\u000b\u000ffK4}H@\u001f\u0016u(\u0006Is\u000b\u001a\u0012\u000b<jS>_\u000fNyj", "2hb=T;<V", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oCWnN\u0010[a\nW-VucE#D", "AbW2W<ES\u0006~\tn4|d0t\u007f5Z@\b\u0013+", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", ";hb@\\5@", "BnBAe0GU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    private final Throwable cause;
    private final String errorHint;

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : str);
    }

    private final Void missing() {
        String str;
        if (this.cause == null) {
            MainDispatchersKt.throwMissingMainDispatcherException();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb = new StringBuilder("Module with the Main dispatcher had failed to initialize");
        String str2 = this.errorHint;
        if (str2 == null || (str = ". " + str2) == null) {
            str = "";
        }
        throw new IllegalStateException(sb.append(str).toString(), this.cause);
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0012Y)4]q`H9\nx\u0018SyK{o\\\tcg{\feP\revMK0A;\u001e\u0016Y~6`W?%L9(\u0011YSM)\u000b9\u0010v\u0011sv\"Z\u0010;m7\n\bQ\u0013~\u0010T3")
    @InterfaceC1492Gx
    public Object delay(long j2, Continuation<? super Unit> continuation) {
        return Delay.DefaultImpls.delay(this, j2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i2, String str) {
        missing();
        throw new KotlinNothingValueException();
    }

    public Void scheduleResumeAfterDelay(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo10551scheduleResumeAfterDelay(long j2, CancellableContinuation cancellableContinuation) {
        scheduleResumeAfterDelay(j2, (CancellableContinuation<? super Unit>) cancellableContinuation);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Main[missing" + (this.cause != null ? ", cause=" + this.cause : "") + AbstractJsonLexerKt.END_LIST;
    }
}
