package kotlin.jvm.internal;

import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0RnP.XT2\u000fy\u0002<$a$yCIn\"}(\u0015WNusvJp\u000bK\u000f\f\u001a\u0001j:կ]xc\u0014\u00157Xģ]Z}ok8\u0019s]EC86H}\u0013\u00012*v\u0011\u0007\u0005QM$\u0018@B\u0001:\u0001\u0011{\b*\u0016\u0014C8\u0001LbʄR6Vs\u001eg5(\u0013mPN?_^}]\u0017TV?\u0013\u0007c.+n;c\u00185Y\u0011\u000fj]U\u0002mpM\tv0?+w}ɱ:X\u000e\u001f]9]-urTx5Un-?+}i\u0012PV9\u0006\u001d\u0014\rj\n>\f5kF/0e62yϖr\u001cF^'vB.\u0005(J_+\u000eYC9I\u0003\u0018u\u0004#\\W\u0014\u0005;:K\u0001\u001d%\"T^x#'l}a3a@kU|\r\u0010\u0012DեrĊ\u0006.\u001c2M\u000e=\u000baF%'OaI%1k0LrjMݪbĈWoZ̲X$t&E9Y\u001ehD|\u0005\u001aQ+Ч.ҭQ\"\\͵\u0016\n\u00191j\n\r;3\u0019fO\u0017s!ܔ4܅'çjCaʤ{\u0010]LlGMSi%ohG&MAz\u0005\u0007lx(bȮ^͈&6`l\u0016|\n[\u001f(!:Ws23Z0O¢kǿ\u0005ٿFM\u0005ȁo\\n(\rhK&\t\u00032\u000fY\u001b^w\to\u0016\u0015q0\r`(.onkY|š$מ8\u0001;\t\u0005\u0012\u000efѮPo"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\no+\"G\\\u000e=v25b{ \r", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "1kP@f0?W\u0019\f", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000f\u001b\u0018Ko\u001b\u0012", "/qVB`,Gb'", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k$!Lo\fKz/>/", "7r<.e2>R\u0002\u000f\u0002e(y\u0010/", "", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%\u001bHs\u000eIL\f:U\u000f\u001c\u0001}%2T\r\"oB-j]%*", ">kPAY6K[\b\u0013\u0006^\u001c\b\u0014/r\\2\fI\u007f", "4kP4f", "", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%\u001bHs\u000eIL\f:U\u000f\u001c\u0001}%2T\r\"oB-jOgC\u0016j0W@4GMU,Za<#\u0003&e\u000e$\u000fPu", "/m]<g(MW#\b\t", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u000ee.N[\u0019\b\nl", "5dc\u0010_(La\u001d\u007f~^9", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%Kp\u0012<\u0004z", "5dc\u0013_(@aW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}U\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0013_(@aW\u0005\u0005m3\u0001\u0012)s\u000f'\u0003D}", "u(8", "u(I", "5dc\u001d_(MT#\f\u0003M@\b\t\u001fp\u000b(\t\u001d\u000b' F.\u0014F\u0006,9bw.Fl\u001d2J\u00027t=($dp=\u0011l:", "5dc\u001d_(MT#\f\u0003M@\b\t\u001fp\u000b(\t\u001d\u000b' F.\u0014F\u0006,9bw.Fl\u001d2J", "u(;8b;EW\"H\b^-\u0004\t-tI\u000ejT\f\u0017l", "/qa.l\nEO'\rcZ4|", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u000ee9:gv\u0006vl:e\u00057e", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkbE|(\u0013\u0011v\nExn#h\u000b$@ok", "/rBAe0GU", "1n]CX9M>&\u0003\u0003b;\u0001\u001a/T\n\u001a\t<\f\"\u0017T", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TypeReference implements KType {
    public static final Companion Companion = new Companion(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List<KTypeProjection> arguments;
    private final KClassifier classifier;
    private final int flags;
    private final KType platformTypeUpperBound;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԃt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̔~֒Yxe܈_>PsW3{q\u0014ʡ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\no+\"G\\\u000e=v25b{ uK 6X?Do>'j", "", "u(E", "\u0017RN\u001a4\u0019$3wxcN\u0013cd\fL_", "", "\u0017RN\u001aH\u001b\u001a0\u007f^t<\u0016co\u000fCn\fe)z\u0006\u000b2O", "\u0017RN\u001bB\u001b!7\u0002`tM gh", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, KType kType, int i2) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = kType;
        this.flags = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, boolean z2) {
        this(classifier, arguments, null, z2 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String asString(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        KType type = kTypeProjection.getType();
        TypeReference typeReference = type instanceof TypeReference ? (TypeReference) type : null;
        if (typeReference == null || (strValueOf = typeReference.asString(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getType());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[kTypeProjection.getVariance().ordinal()];
        if (i2 == 1) {
            return strValueOf;
        }
        if (i2 == 2) {
            return "in " + strValueOf;
        }
        if (i2 == 3) {
            return "out " + strValueOf;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String asString(boolean z2) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> javaClass = kClass != null ? JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else {
            int i2 = this.flags;
            if ((i2 + 4) - (i2 | 4) != 0) {
                name = "kotlin.Nothing";
            } else if (javaClass.isArray()) {
                name = getArrayClassName(javaClass);
            } else if (z2 && javaClass.isPrimitive()) {
                KClassifier classifier2 = getClassifier();
                Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                name = JvmClassMappingKt.getJavaObjectType((KClass) classifier2).getName();
            } else {
                name = javaClass.getName();
            }
        }
        String str = name + (getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new Function1<KTypeProjection, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(KTypeProjection it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.asString(it);
            }
        }, 24, null)) + (isMarkedNullable() ? Global.QUESTION : "");
        KType kType = this.platformTypeUpperBound;
        if (!(kType instanceof TypeReference)) {
            return str;
        }
        String strAsString = ((TypeReference) kType).asString(true);
        return Intrinsics.areEqual(strAsString, str) ? str : Intrinsics.areEqual(strAsString, new StringBuilder().append(str).append('?').toString()) ? str + '!' : "(" + str + ".." + strAsString + ')';
    }

    private final String getArrayClassName(Class<?> cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.classifier;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (-1) - (((-1) - this.flags) | ((-1) - 1)) != 0;
    }

    public String toString() {
        return asString(false) + " (Kotlin reflection is not available)";
    }
}
