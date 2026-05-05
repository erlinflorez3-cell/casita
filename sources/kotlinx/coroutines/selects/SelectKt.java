package kotlinx.coroutines.selects;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<;\"&i\u0016DLc\u000b\u0004I\u0006>\u000b6B\u0015\"4\u0012}\u0007njO0LeV\u008cZS@\u000fs{:$c$\bCC٥\"}8\tWNmivJh\fK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00152JoM<UoS9ht<\b(20>\u0002\u0005\u0007\u001c2H&v\u0003CQ\f\u001a0VpBR\u0013R\u001dZ ßV G\u001d|iTȤVk\u000eW5%\u0011iZe7g@\u0003]\u000fVTm\f%c.-P7c\u0018STΫ\u000bRaCIӑ8ܸ\u0005p/-1H\u0004WDW\u001e\u0013Ʀ/O\u001bb\u000b\bj\u001di`:@SUsM`\u000eVz)\u0016=\n\u0012)\u001epX?=)\u0015\u001bԧ7~x\\PV\bhR\u0002\u0001g\\35\u0013C<O\u001a\u0015Yň?#T@\f\u000b\u0013(3\u0003t'\u0002q\u001eq%*\u0003\fΦ5[FFXT\u0010cMo\nv\t :\u0006@G.2\u0012\u0010\\\u001ek7sG1E\u0004\u0002vi\u0018z\u0013\u0007\u0001S\u0018r\u000f@BL$LBX\u001ckTs3sÏXb2\u001a]\"Z\u0011\u000e\n\u0019&\u0003\u0003L45!dN\u0017qҷQg\u0010.?l=c~m\u0014]_kCHat&`\u0001~݀CFh\u000ehlH]\u001c\\b.HBXn y\u0012C|\u0014A9(qzJ\u0003վ\u001bÅ\u0019J\u000b\u001ePX\u001d\u0015my\u0001\u0010-t\nɷUȐ(t\u0011ɖph~\u0011\u007fxwLSʣtέEQ=ӧFa0\u000bL|Q'U͡RěkLOƂ\r\"\u0004x\u0014 D:\u0010֚\u0002ˮ\u0017\u000f\u0007ǻR\u000e;ldr\u0014y$ȿ)ϸ\u0001y\u0017\u0090\t:u1\u0003pZ\tA\u07bdQݚ\u001b\"~ܥ\u0013/\u0016\u000f\u0018y\u0010nQõeӝ\u000f[Fδ\u0013\u000fggf8+-uǊ'˽s\"\u0005ކMU5I.wBWk˖_ɳs4\u0002ʬ'(z\u0013\u0012Z\f݅nhVk8[\u0004Yj\u000fMP,к\u0007LNs\b\u000eH\u0013D\u000f9Ngo\u0001kH`\u001b/\u0004g58ޛt`aC#u\u0004>>a0yi͟$qS6'L\u0002oƽqUb\u0014Z\u0015\u0010\u0015\f3t\u0018BJ0Xgb734zH\u0002QLr\u0014j\u0011Ӻ86B\u0011\u001bIZs\u0016\u0012\u0001\u0006lj\u001f,BU\u0004;\\\u000f\u0003\u0005חZR\u000biUf'4\u0011\u0001\u00159D֭ED\u0015~\\S]k҅\u0005]#\u0012+pU\tv'1JzF+*h\u00019H\fJ\n\u0002<\u0012oԊlqt\u001aG8H-S(*gYμc\u00016g\u001b[jXtx\u0018lxY2<\u000f\f\u0013\rj\u0012۪\u000f#U{\u007fh3V^y=I@\u000e'W9\u0018\"{\u0012Nɴ1\u0010;6MOp\u001e7}]Ya\u000e\u0018$0)\u001asOd\u0006\u0015\u0017Um,J% \u001eȫ\u0006\u0013\u0019Y0\n4T\u0005t\u00104.A_\u0015C\u0013)]\bs֏%J-4|\fHUxz\u0010i\u0013p~h\u001b\u0014|0\u0005\u0002ӊ1Z#\u00127S4\u001dh\\@\u0017y0h\u0015\u0010\u0016+%M>6ii\u0010Uq\u0011ԓjU`\u001b<OS:vACb\u001e\u0004 (\u0002ą.^.\u001eK\\SHt\u000bbrhĠ\u001eqz9zs:1ِ\u0001\tNg!\u0019:P\u0003 j5]&/n\u001dXv\u00062Mõ*+7[O!=<\u001bq.|7\u0015J~\u0005\u001a:D\u0019r.z<1VVS\u0019Ua4ot\u0003T_U:R\bZ\u0014<\u0018]ah\bNq*/KQ9BG\u001dܗ\u0019B\fx\u0017\u001f;taU+0'ε\u0011 O\u000bGjh{٥v-5\u0018\u007f!]pK';kr4\u001c\u0015u[\u0015L\u0012^ւe6O>U$\u007f_P\u0002\u0010%J6\u0016\u00123\u001aU3X*\u000eoPZ\u0004Y\u001a%X>~F3G\u001b\r\u0004\f<iFv\u0013b\u0010;\u0002z\u001a'ܻBY"}, d2 = {"Ad[2V;", Global.BLANK, "0tX9W,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0014}\u001a5LCHA", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", " dV6f;KO(\u0003\u0005g\r\r\u0012-t\u00042\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1kPBf,(P\u001e~xm", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", ">`a.`", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E$\n&\u0017Tx\nCT/Bc\u000e/;v\u0016<)N?A", "\u001eq^0X:L@\u0019\r\u000be;]\u00198c\u000f,\u0006I", "1kPBf,+S'\u000f\u0002m", "\u001dm2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\u0012T<\u001aL&)@\u0003\\ZL\u001avu\u000fSo\u000fj:a\u0007\u007f%^q&_", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "Bqh\u001fX:N[\u0019", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "=m2.a*>Z z\nb6\u0006", "1`d@X", "D`[BX", "1n]AX?M", "\"QH,F\f%3vmtL\u001cZf\u000fSm\tk'", "", "\"QH,F\f%3vmtK\fih\u0011Im\u0017[-", "\"QH,F\f%3vmt<\bef\u000fLf\bZ", "\"QH,F\f%3vmt:\u0013ih\u000bDs\"i gvt6Ol", "\"qh X3>Q(]zm(\u0001\u0010/dl(\nP\b&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006e2IG}'7k%\rMR7o;\u001e\u0014UaG\u0017j;$", "Bqh X3>Q(b\u0004m,\n\u0012+ll(\nP\b&", "!S0!8&+3z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "!S0!8&\u001c=\u0001ia>\u001b\\g", "!S0!8&\u001c/\u0002\\ZE\u0013\\g", "\u001cNN\u001f8\u001a.:\b", "\u001e@A\u000e@&\u001c:tnh>&G", "5dc\u001d4\u0019\u001a;\u0013\\a:\u001cjh)0", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~G\u0012(4w\u001d\u0004", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SelectKt {
    private static final int TRY_SELECT_ALREADY_SELECTED = 3;
    private static final int TRY_SELECT_CANCELLED = 2;
    private static final int TRY_SELECT_REREGISTER = 1;
    private static final int TRY_SELECT_SUCCESSFUL = 0;
    private static final Function3<Object, Object, Object, Object> DUMMY_PROCESS_RESULT_FUNCTION = new Function3() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kotlin.jvm.functions.Function3
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };
    private static final Symbol STATE_REG = new Symbol("STATE_REG");
    private static final Symbol STATE_COMPLETED = new Symbol("STATE_COMPLETED");
    private static final Symbol STATE_CANCELLED = new Symbol("STATE_CANCELLED");
    private static final Symbol NO_RESULT = new Symbol("NO_RESULT");
    private static final Symbol PARAM_CLAUSE_0 = new Symbol("PARAM_CLAUSE_0");

    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    public static /* synthetic */ void RegistrationFunction$annotations() {
    }

    public static final TrySelectDetailedResult TrySelectDetailedResult(int i2) {
        if (i2 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i2 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i2 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i2 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i2).toString());
    }

    public static final Symbol getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    public static final <R> Object select(Function1<? super SelectBuilder<? super R>, Unit> function1, Continuation<? super R> continuation) {
        SelectImplementation selectImplementation = new SelectImplementation(continuation.getContext());
        function1.invoke(selectImplementation);
        return selectImplementation.doSelect(continuation);
    }

    private static final <R> Object select$$forInline(Function1<? super SelectBuilder<? super R>, Unit> function1, Continuation<? super R> continuation) {
        InlineMarker.mark(3);
        Continuation continuation2 = null;
        continuation2.getContext();
        throw null;
    }

    public static final boolean tryResume(CancellableContinuation<? super Unit> cancellableContinuation, Function3<? super Throwable, Object, ? super CoroutineContext, Unit> function3) {
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, function3);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }
}
