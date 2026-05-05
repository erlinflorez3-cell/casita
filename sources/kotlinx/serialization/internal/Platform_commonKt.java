package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d̉=!,x\bDZc|\u0004G\b8\u000b<N\u0007\"2\u0012\u007f\u0007t\u000bAӄLe^.Zݷ2\u000f\u0002{<$q$yّCU(\u001c*\tUNog|PbŏK\u000f\u00140\u0001̓4Ikxe܈\u00172XoG3[ڎE9vt>ӌ(207\u0002ڎ\u0019(8L(v)H{\u0010 6XphWS˟\u001d* \rV&\u0011 lg|;vt\u0006:]#I݃Zi5hH\u0003]\u000fVTm\u0018%k>-FʺC MW\u0013\u0007X\\m\r\u0006оC\u001d\u000450CO\u0004YFXF\u001fC7o\u000fcö4g-Up\f-,}o\u0012ֶ\u0014@\u0013\t\u0005%B\u0014\u0010\u0016'\u000f9['\u0007\n\u0014ޗ\u0003}{D`\u0002dC.\b(ة\u001d=\u001dA9Q!vSq;GNez-\u0015.%\u0011nO[j\r\u000f$aƘɐU1_PU|\\\u001bq=\u001c\u0016\u0011d\bÏ\u0012;g\u00025z\u001fA?+G]I#gv0\\tw\u0005\u001axtckbH\u0007-~\u0018G*O\u001f\tZ+ʎqĥSАD![3l\r\u000e\n# \u000b\u0011j9M\u0010|i/ȉ\u0003[k\u000e=/\u0015<\u0002r{\u000e]:\rK{ȡ{\u001eom\u000f\u0014mX\u000b\thfHT:r#̥BNVК(}\fF^\fA2mpR4\u0003տ\u001bÅ\u0019P\u000b\u001ePD\r\u000be[v\u0012кT8,\u0006o˟%7\u007f˯`\u000e"}, d2 = {"\u0013L?!L&\u001d3\u0007\\gB\u0017kr\u001c_[\u0015h\u001ct", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0012@\u0017-G\u0013]ZL\nil\u001aTi\u0015u\u001cm\u0004r;.\nE\u007f/DU\r$Av$", "u(E", ")KZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L", "<nc\u001fX.Ba(~\b^+d\t=s{*{", "", "1kP@f\u0015:[\u0019", "1`R5X+,S&\u0003ve\u0015x\u0011/s", "", "1`bA", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "1n\\=T*M/&\fvr", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u001ebF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/", "3kT:X5Ma{z\ta\n\u0007\b/B\u0014", "", "\u0019", "", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "9b[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "Ada6T3Bh\u0019\fch;i\t1i\u000e7{M\u0001\u0016", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final Set<String> cachedSerialNames(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i2 = 0; i2 < elementsCount; i2++) {
            hashSet.add(serialDescriptor.getElementName(i2));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> DeserializationStrategy<T> cast(DeserializationStrategy<?> deserializationStrategy) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "<this>");
        return deserializationStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> KSerializer<T> cast(KSerializer<?> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SerializationStrategy<T> cast(SerializationStrategy<?> serializationStrategy) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "<this>");
        return serializationStrategy;
    }

    public static final SerialDescriptor[] compactArray(List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : serialDescriptorArr;
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i2 = iHashCode * 31;
            K kInvoke = selector.invoke(it.next());
            iHashCode = i2 + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    private static /* synthetic */ void getEMPTY_DESCRIPTOR_ARRAY$annotations() {
    }

    public static final KClass<Object> kclass(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (classifier instanceof KTypeParameter) {
            throw new IllegalStateException(("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported as " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + classifier).toString());
    }

    public static final String notRegisteredMessage(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String notRegisteredMessage(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    public static final Void serializerNotRegistered(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException(notRegisteredMessage(kClass));
    }
}
