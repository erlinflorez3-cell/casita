package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmInline;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004W\u00068é6B\rӬ4\u0012}\bnjG9LeN7ZS8\u0010s{:'c$\u007fICU ~*\t]ZogtM`ŗ\u0002%إ4\u0019\u00130Oǁ\u0007\\0\u000ebF\u001e?\u001cMN>q`\u0015WE18!H\u007f\u0013\u00032,^\u000f%}ŲO\u000e\u00184Nu\u0003j\u001b[\u001d\u001a@\rn&\u000f-tid5vo$ǔ0ݭ\u0007kH^5px\n[\u001f^V=\f%tӿ/B=I#:\u001c\u0013\u0015hsA\u0019>(ܵKؚ-ݳ/KynD]H\"#Cg\r\f\flٯ\u0004Ōd\u000e-E]~\u0014]\u001cD\u0010z**\u0003\u0018؝\n)NL;97\u0017\u001c9\rr\u0002G\u0007FެF\u0004\u0013c<\u001f3\t\u0004:G%~Q\u0010BO\u0013Ѽ\u007f\t% )\f|*,j\u001cb-\u001djv\u007f4\b̵\u0014ʲP̆]CuՎ\u0001d\b6\u0012=ϣ~1ɘ\u00100-$e^ަ'C"}, d2 = {"\u001aj^A_0G\u001d\u0006~\tn3\f^", "\"", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "7r5.\\3N`\u0019", "", "7r5.\\3N`\u0019F~f7\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7rBBV*>a'", "7rBBV*>a'F~f7\u0004", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "u(E", "3pd._:", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "3wR2c;B]\"h\bG<\u0004\u0010", "", "3wR2c;B]\"h\bG<\u0004\u0010vi\b3\u0003", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011", "5dc\u001ce\u0015NZ ", "5dc\u001ce\u0015NZ F~f7\u0004", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "\u0011n\\=T5B]\"", "\u0014`X9h9>", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Result<T> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Object value;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\bnj?3JͣIDɟ\u0004*=j<9*[ҸuCIUb\u001e0\ngTwi~J!\u000eq\u0011&\u0018~i:L\u0006|k\u0016'2pt\u0006ݔSڱA9nz~%.9:>\n\u0007\u0011\u001apK>x\u001bEQ\u000b 3ptHZ%MK\u001dXçDŋ\u0005\u001ejpߗ:R"}, d2 = {"\u001aj^A_0G\u001d\u0006~\tn3\fG\ro\b3wI\u0005! \u001d", "", "u(E", "4`X9h9>", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "\"", "3wR2c;B]\"", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "AtR0X:L", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> Object failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return Result.m8980constructorimpl(ResultKt.createFailure(exception));
        }

        private final <T> Object success(T t2) {
            return Result.m8980constructorimpl(t2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<C\u0007\"2\u0012\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fOC٥ Ԃ8ޛ\u007fR\u0016fWJ9\u000b\u0004\u001a\u0016\u001a\u0007kDI\u0004zٕ\u0016\u000f@E8PAQ\b=ge%<\u0013&J$Nx3\b`ݩHX|\tKc\f@9\u0007\u0005\u0003X\u001bW\u001d\u001a@\u0011\u00054Q,jhf6vn\u0014>\u0006ݒ\u0005ݦFN/ڿ݇\u0001Y"}, d2 = {"\u001aj^A_0G\u001d\u0006~\tn3\fG\u0010a\u0004/\fM\u0001l", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "3wR2c;B]\"", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\b", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Result m8979boximpl(Object obj) {
        return new Result(obj);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static <T> Object m8980constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m8981equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).m8989unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m8982equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl */
    public static final Throwable m8983exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrNull-impl */
    private static final T m8984getOrNullimpl(Object obj) {
        if (m8986isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m8985hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl */
    public static final boolean m8986isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* JADX INFO: renamed from: isSuccess-impl */
    public static final boolean m8987isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m8988toStringimpl(Object obj) {
        return obj instanceof Failure ? ((Failure) obj).toString() : "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m8981equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m8985hashCodeimpl(this.value);
    }

    public String toString() {
        return m8988toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ Object m8989unboximpl() {
        return this.value;
    }
}
