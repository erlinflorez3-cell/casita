package kotlin.reflect;

import com.dynatrace.android.agent.Global;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&˛\bDZc|İI\u0006>\u00146B\u0005*4\u0012\u0006\u0013nj?2LeVLZS@\u000fs{:&c$\bCCU \u007f*\teNogtKb\u000bY\u000f\u000e\u0016~m4Ic\be\u0012\u001d˰JoE3UoK[ht<\u0005&\u00178\u0600\"\t\u0007ɝ8G.u+Cy\fZSN\u0016RRC˟5. ,V*\u0011$bf^8^k\fb]J#kXMU\bv!֔\u0011FbPU\u0018oHC@mߎE7a)\u001f`kA\u0013? P\u0015l7)AH\"\u007fd\u0004F8Ʀ/O\u001b\nC>j\u0006i`:)as:ׇRˎ,\u0002\u000b}\u0013?\u0012\u0012\u001e)N/;\u001f7 \u001c9\rr\u0002B\u0007&5۵\u0002ѐe@''\u0006:9=3hWgI\u001e\u001fO\n\r%\u001eQ\u0003%E2ڒ\u0010\u05ce\u0019%dyW:_DUJT\u0012gB>\u001c~l\u001a*22}$\u0006ɭ\u0013ѧ\u001b/G]?./o\u001aJJq\u0005\n1\u0001aujHn/%:\u000eҏ\u000bɔ^Nt\u0007q^b\\D\u0013S+b\u0017N$!1t}L#5\u0010|b\u0017{Aܻ_ܦ)9v9_\u0003y\u0012o;dHCg4&oi\u000f\u0014mT9ۚZڋF]\u001c\\bA06`l\u0016\u0012\n_\u001f*!NWw,6<1GyCZ9B\u0019ˮ~Ȥcdx\u0012\u0005rA(\u001bk*\u0014\u0017\u0017!v~\u0010\u007fz_++\u0002XQ\u0018ڃ7Ԋ*_2j:\u001f1\u000b\u0017u\u0006jupܪP\u001a"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xK]$\u0003G|\u0014\u001eGE", Global.BLANK, "\u001aj^A_0G\u001d&~{e,z\u0018xK[1\u0005J\u0010\u0013&GnmCv-5b\ru", "7r0/f;KO\u0017\u000e", "", "7r0/f;KO\u0017\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "u(I", "7r56a(E", "7r56a(E\u0012\u0015\b\u0004h;x\u00183o\t6", "7r>=X5", "7r>=X5|O\"\b\u0005m(\f\r9n\u000e", "7rBBf7>\\\u0018", "7rBBf7>\\\u0018=vg5\u0007\u0018+t\u00042\u0005N", "<`\\2", "", "5dc\u001bT4>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ">`a.`,MS&\r", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKj$\t<\t\u0017&G|c", "5dc\u001dT9:[\u0019\u000ezk:;\u00058n\n7wO\u0005! U", "5dc\u001dT9:[\u0019\u000ezk:", "u(;7T=:\u001d)\u000e~euc\r=tU", "@dcBe5-g$~", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "5dc\u001fX;N`\"m\u000fi,;\u00058n\n7wO\u0005! U", "5dc\u001fX;N`\"m\u000fi,", "u(;8b;EW\"H\b^-\u0004\t-tI\u000ejT\f\u0017l", "Bx_2C(KO!~\n^9\u000b", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "5dc!l7>>\u0015\fvf,\f\t<s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc!l7>>\u0015\fvf,\f\t<s", "Dhb6U0EW(\u0013", "\u001aj^A_0G\u001d&~{e,z\u0018xKp,\nD}\u001b\u001eK~\"\u0012", "5dc#\\:BP\u001d\u0006~m@;\u00058n\n7wO\u0005! U", "5dc#\\:BP\u001d\u0006~m@", "u(;8b;EW\"H\b^-\u0004\t-tI\u000elD\u000f\u001b\u0014Kv\u0012K\u000bz", "1`[9", "/qV@", "", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "1`[95@", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KCallable<R> extends KAnnotatedElement {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getName$annotations() {
        }

        public static /* synthetic */ void getParameters$annotations() {
        }

        public static /* synthetic */ void getReturnType$annotations() {
        }

        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        public static /* synthetic */ void getVisibility$annotations() {
        }

        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void isFinal$annotations() {
        }

        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void isSuspend$annotations() {
        }
    }

    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    KType getReturnType();

    List<KTypeParameter> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
