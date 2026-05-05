package kotlin.jvm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
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
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bӵLc\u0003\u001dI\u00066\f6B\u0015\"4ߚ\u007f\u0007txA0JmP.`ݷ2\u000fq\u0005<$i-yCId\"}(\tgku\u0005\u0007J\t)c\u0017\fǝ\u0007jBH}x\f$76RoE4{\u000fެ=`\u0003V%E@ĲP\u0002\u0015\u0005 )X\u0010=zqJ,\u00186ϋ~:z\r{\u0006B\u0012L>VEɉ`kf8Nnk=O\\\u0011mZT7a@|\u0014\u0013tYG\u0019|ѭ,1h=E\u00175SI\r\u0001bg\tOsM\u0005/-U2\u007fלW\rݡ\u0002Џ\u00195_\u000fcz4e\u001dSf\u001656o\u000fY\\&.\b|\f\r\u0003\u0004<\u000bGJ4Ʀ(f0\u0014Cv\u0003S\u0007P0]xEѐe@''\u0006@9G3hWpI)n[\n\u0016%$3\u0003~!\"T<e5!Zȭ_1y@kZv\n =$֕pĊ\u0006.\u001c2M\u000f=\u000f1g%6OgI+1q\u0012JTg=\u0005\u000fg\u0002nrNF̎|\u0016_*7\u001e\u0003Jt\u0007{P\u001bXZ\u0010\u0004ʄT]ê\n˙$f\b>'9\u001e\\gjo\u007f[m*N=|O_~m\u001eW\u007f^a:qi\u0016Р`v<?jt-^vDc\f!\\V!h\rн\u0014{\u0014FT#!B_\u001d*LD9)^%HI\u001eX@+\u000e\u007f`nɭ\rT[$1{Lz\u0019\u0003`\\7o\u0016w\u007fpʬd&ECWN'6uKvN\u0015)\u0017\u0001\u0004\u007f\u000egzFlr\u001c߯c{H\u0016HKy5M\u0015\u001f~o202{\u0012ȌiUe\u0014-\u0016\u000b\u0016ӡ?\n"}, d2 = {"/m]<g(MW#\bXe(\u000b\u0017", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\"", "", "5dc\u000ea5Hb\u0015\u000e~h5Z\u0010+s\u000e", "uKY.i(\bZ\u0015\b|((\u0006\u00129t{7\u007fJ\n`rPx\u0018Kr49c\u0007uzT\u001c8\\J?t}+\u0015ih9\u0005ru4T.CZ\\\u0002", "2dR9T9B\\\u001bcvo(Z\u0010+s\u000e", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u0013", "", "5dc\u0011X*EO&\u0003\u0004`\u0011x\u001a+C\u0007$\nN?\u0013 Py\u001d8\u0006)?b\f", "uKY.i(\bZ\u0015\b|(\f\u0006\u00197;C\u0019", "5dc\u0011X*EO&\u0003\u0004`\u0011x\u001a+C\u0007$\nN", "uKY.i(\bZ\u0015\b|(\f\u0006\u00197;C\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0003<U\f.\r", "8`e.", "5dc\u0017T=:1 z\tljx\u00128o\u000f$\u000bD\u000b %", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000b`", "5dc\u0017T=:1 z\tl", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\u00138\b!~`y)97s5IQIA", "8`e.63:a'", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~7\u0005\u001cE{k", "5dc\u001fh5MW!~Xe(\u000b\u0017\u0019fe\u0006\u0003<\u000f%zP}\u001d8\u007f#5\u0018y)@w%*\\GEtB", "5dc\u001fh5MW!~Xe(\u000b\u0017\u0019fe\u0006\u0003<\u000f%zP}\u001d8\u007f#5", "8`e.B)CS\u0017\u000eir7|", "5dc\u0017T=:=\u0016\u0004z\\;k\u001d:e", "8`e.C9B[\u001d\u000e~o,k\u001d:e", "5dc\u0017T=:>&\u0003\u0003b;\u0001\u001a/T\u00143{", "9nc9\\5", "5dc\u0018b;EW\"\\\u0002Z:\u000b", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkbF\u000b&\u001eKxWIv&<Y{/\u0001Ss5IQIA", "7r0?e(R=\u001a", "", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class JvmClassMappingKt {
    public static final <T extends Annotation> KClass<? extends T> getAnnotationClass(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Class<? extends Annotation> clsAnnotationType = t2.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        KClass<? extends T> kotlinClass = getKotlinClass(clsAnnotationType);
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kotlinClass;
    }

    private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(Enum<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r02) {
    }

    public static final <T> Class<T> getJavaClass(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Class<T> cls = (Class<T>) t2.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    public static final <T> Class<T> getJavaClass(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).getJClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void getJavaClass$annotations(KClass kClass) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> Class<T> getJavaObjectType(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!cls.isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals(ProfileMeasurement.UNIT_BYTES)) {
                        cls = (Class<T>) Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (Class<T>) Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        cls = (Class<T>) Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                    }
                    break;
            }
        }
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> Class<T> getJavaPrimitiveType(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (cls.isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return Integer.TYPE;
                    }
                    break;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return Float.TYPE;
                    }
                    break;
                case -515992664:
                    if (name.equals("java.lang.Short")) {
                        return Short.TYPE;
                    }
                    break;
                case 155276373:
                    if (name.equals("java.lang.Character")) {
                        return Character.TYPE;
                    }
                    break;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return Boolean.TYPE;
                    }
                    break;
                case 398507100:
                    if (name.equals("java.lang.Byte")) {
                        return Byte.TYPE;
                    }
                    break;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return Long.TYPE;
                    }
                    break;
                case 399092968:
                    if (name.equals("java.lang.Void")) {
                        return Void.TYPE;
                    }
                    break;
                case 761287205:
                    if (name.equals("java.lang.Double")) {
                        return Double.TYPE;
                    }
                    break;
            }
        }
        return null;
    }

    public static final <T> KClass<T> getKotlinClass(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static final <T> Class<KClass<T>> getRuntimeClassOfKClassInstance(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class<KClass<T>> cls = (Class<KClass<T>>) kClass.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8~\u0016mY\u000eg\u000bb$<Sn`\"f\u0019wKY{Z.TO\u000b%&kXeU`\u001ckHX08M\"eZ}+fOzyMs&\u0014P'\u0004\u0006\u0006H\u000e{\u001a/:(L\u0011\u000f\u001d1\u001a;K\u0011R\u000f\u0001B0:f/Da/\u0003|.x'\u0004$5>{#$x[\u0018_8ML%\r\u001c'MGo\u001db2*cxF}dg8,?\u0019\f4$}-Rk`\u0017$ad9\u0013U<yP\u001f<\u000e(\u007fP\u001ft6\u0015\u0002(\u0015w(:m[g\u0003|\\b%Vt\t(`g\nCQ8\u001fT~", replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(KClass kClass) {
    }

    public static final /* synthetic */ boolean isArrayOf(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
