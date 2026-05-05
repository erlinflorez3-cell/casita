package kotlin.reflect;

import java.util.Collection;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&˛\bDRш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjGLLe^.ZS0\u0012s{B-c$wTCU0}*\tUVog|Vb\u000bI\u0010\u000e\u0016\u0007\t4I[|e\u0012%2JoE4UoS9ht<\u0006(288\u0002\u0005\u0007\u001e2H\u001e|\u0003CQ\r\u0018\u0015V\u0081bX\u0013˟\u0013\u0019:\u0006l 1\u001e\u000bh~6vn\u000e:]&KzP\u0011?_^\t}\u0013T\u0018?\u000f\r`L+\u0007ˡ5]+aG\u001fR\n\u0005Ic:M\u0013/?'YU$]D \u0018\u0016+*}\r$\u0018v~\u0013Ux\u001873_i[R\u001e(.\u07be*\u0013j\tdΡ)ρ27*h\u000e\u0015A|\u000bUFY\u0010h\u0013\u0018\tlN\u0017S\fiO\u0010ӽhЂeE)P=\t\u0013\u00156%\u0007y/i%&n$3T&]gu\u0017רJݳ\u000ecMo\n\u0001p\nB\u00066V\u000e=L)<(=7\nEYEBɝJזk\u0001\u0015bnewZ`B(\u007f$Ez!\u001am\\d3w\u0007x/´\u0013ܖ ^\u0017\u007f\u000e'.d\u0010>'8\u001e\\ \u0001w\u007fe]81e\u000b\u000e֒p«\u0012aI`9K_k(cX\f\"M\rz\u0013o~B\u0002\u0018\u0011\u0001~ϗ4ʮn\u001a\b}Jf\u001a\u001bJAw3B:\u00021j.`\u0003LNw!_ވ\\ӳ\u0014\td5*\u001dw,\r\u000b\u0007ij~@\u007f\u0007dD|\u000f.ce(ک\u001błY,x6\u0003?\u0015\u0007\f\u0002M\u0003ZU\u001d\u0005$\u0013m{N\"P](ȥ?т\u0013\t94\bKST\u000bgWj 5K\u001d\b.Sr>m\u0018n\u0001,fkxo\u0003\u001cxՕ`ѓ'\u0012t\u0002\u007f\u0003T\u0003_eZ-iH\u001a\u0013\u0011|TXH\u0003\u0015#.%\u0007pPĜc2\u001aۖ\u001fə{\u001e?\u0017g\u0002wwF{h44~6\u001c:\n.qxP\u0014Ц\u0012ΖK˕\u0003H2&r*PP\u0003y\u000ej\u0017]]EVk|rl7{6\u0006̵h¡0\u0011\tXaf!\u001dNZ<\u000eB\u0002S\b$fS)\u0017Lcg$ޮyŌ9yE.aֲ3ߎ\u0016&M\"\\\bp\u0011H\byIDs\ft\u0013o!&J+j3aͶVɎ\n\u0014\u0013\u0002L\u0014\u001dD\u0003`\u0002pn\u0014dzlVv;\u000ft\u0017E\u0001ܨ\u0001ܓ7(\t77<{Nl1ij\u000f\u0006m')$g\u0005v';D\u0003sIW\u000f%a՝_ƀM\fF\u0006Md{s\b\u000e>T\u000bO\u00132)vi\u0013uu^\u001dAy;͗fʝ\u0016pbP(h\r\u0003\u0015\u0010BJ\u001dLĨS;"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\"", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK^(yG|$\u0013Vs\u0018ET/>hy$@m#\u0004", "\u001aj^A_0G\u001d&~{e,z\u0018xK[1\u0005J\u0010\u0013&GnmCv-5b\ru", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000f\u001b\u0018Ko\u001b\u0012", "1n]@g9NQ(\t\bl", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK`8\u0005>\u0010\u001b!PE", "5dc\u0010b5Lb&\u000fxm6\n\u0017ma\t1\u0006O|&\u001bQx\u001c", "u(E", "5dc\u0010b5Lb&\u000fxm6\n\u0017", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "7r0/f;KO\u0017\u000e", "", "7r0/f;KO\u0017\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(I", "7r2<`7:\\\u001d\t\u0004", "7r2<`7:\\\u001d\t\u0004\u001d(\u0006\u00129t{7\u007fJ\n%", "7r3.g(", "7r3.g(|O\"\b\u0005m(\f\r9n\u000e", "7r56a(E", "7r56a(E\u0012\u0015\b\u0004h;x\u00183o\t6", "7r5Ba", "7r5Baj:\\\"\t\nZ;\u0001\u00138s", "7r8;a,K", "7r8;a,K\u0012\u0015\b\u0004h;x\u00183o\t6", "7r>=X5", "7r>=X5|O\"\b\u0005m(\f\r9n\u000e", "7rB2T3>R", "7rB2T3>RWz\u0004g6\f\u0005>i\n1\n", "7rE._<>", "7rE._<>\u0012\u0015\b\u0004h;x\u00183o\t6", ";d\\/X9L", "\u001aj^A_0G\u001d&~{e,z\u0018xK]$\u0003G|\u0014\u001eGE", "5dc\u001aX4;S&\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u001aX4;S&\r", "<dbAX+\u001cZ\u0015\r\t^:", "5dc\u001bX:MS\u0018\\\u0002Z:\u000b\t=${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u001bX:MS\u0018\\\u0002Z:\u000b\t=", "=aY2V;\"\\'\u000evg*|", "5dc\u001cU1>Q(b\u0004l;x\u0012-e>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001cU1>Q(b\u0004l;x\u0012-e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "?tP9\\-BS\u0018gvf,", "", "5dc\u001eh(EW\u001a\u0003z]\u0015x\u0011/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AdP9X+,c\u0016|\u0002Z:\u000b\t=", "", "5dc X(ES\u0018l\u000b[*\u0004\u0005=s\u007f6:<\n !Vk\u001d@\u0001.C", "5dc X(ES\u0018l\u000b[*\u0004\u0005=s\u007f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "Ah\\=_,'O!~", "5dc \\4IZ\u0019gvf,", "At_2e;R^\u0019\r", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "5dc h7>`(\u0013\u0006^:;\u00058n\n7wO\u0005! U", "5dc h7>`(\u0013\u0006^:", "Bx_2C(KO!~\n^9\u000b", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "5dc!l7>>\u0015\fvf,\f\t<s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc!l7>>\u0015\fvf,\f\t<s", "Dhb6U0EW(\u0013", "\u001aj^A_0G\u001d&~{e,z\u0018xKp,\nD}\u001b\u001eK~\"\u0012", "5dc#\\:BP\u001d\u0006~m@;\u00058n\n7wO\u0005! U", "5dc#\\:BP\u001d\u0006~m@", "u(;8b;EW\"H\b^-\u0004\t-tI\u000elD\u000f\u001b\u0014Kv\u0012K\u000bz", "3pd._:", "=sW2e", "6`b566=S", "", "7r8;f;:\\\u0017~", "D`[BX", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getConstructors$annotations() {
        }

        public static /* synthetic */ void getMembers$annotations() {
        }

        public static /* synthetic */ void getNestedClasses$annotations() {
        }

        public static /* synthetic */ void getObjectInstance$annotations() {
        }

        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        public static /* synthetic */ void getSupertypes$annotations() {
        }

        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        public static /* synthetic */ void getVisibility$annotations() {
        }

        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void isCompanion$annotations() {
        }

        public static /* synthetic */ void isData$annotations() {
        }

        public static /* synthetic */ void isFinal$annotations() {
        }

        public static /* synthetic */ void isFun$annotations() {
        }

        public static /* synthetic */ void isInner$annotations() {
        }

        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void isSealed$annotations() {
        }

        public static /* synthetic */ void isValue$annotations() {
        }
    }

    boolean equals(Object obj);

    Collection<KFunction<T>> getConstructors();

    @Override // kotlin.reflect.KDeclarationContainer
    Collection<KCallable<?>> getMembers();

    Collection<KClass<?>> getNestedClasses();

    T getObjectInstance();

    String getQualifiedName();

    List<KClass<? extends T>> getSealedSubclasses();

    String getSimpleName();

    List<KType> getSupertypes();

    List<KTypeParameter> getTypeParameters();

    KVisibility getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
