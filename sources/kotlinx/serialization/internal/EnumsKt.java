package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
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
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u0003\u0012Iي8\u000b<N\u0007Ӭ4\u0012\u0006\u0016nj?0LeVGZS0\u0015\u0004iBřs*\u0002EKU`}P\boZm˧|J\u0003\u0011S\u0011\u0016\u0016?jZJ\u0006|k\u0014'2pro=[sU?pvF\u0005f2P=*\u0011\u000f BP z\u000bEa\u000b@3nujd\u001bT\u001d(\"\u0010N(\u0011 lg|>^k\f?](3uPW?g@~]\rt\\=\f%fd*Ë;5#/k`\u0015]sE\u0013A\u0002=KhU&KUyɎDX(\u001a%-_\r$rT]5Un\u000e?+}f{Z\u001c,\u0010\u0001\f\u000fL\u0004T\u0006UM^9(l \u0016Cx\u0003UVO0ap\u0005+sD#=\u000eC5I#vSq;GVMz3\u0012L(GmĲ_T\u001cm-Rb\u0006i7aBMH\u0015\n\b<\u000e\u0010vç\u0010*,6W\u0002?{W.E&g_G%9k0Ktq\u0005\txnckbH\u0007\"\u001d\u001b})Á\u0010ZRsʶo`"}, d2 = {"1qT.g,\u001a\\\"\t\nZ;|\b\u000fn\u00100i@\u000e\u001b\u0013Ns#<\u0004", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\"", "", "Ada6T3'O!~", "", "D`[BX:", "", "<`\\2f", "3mc?l\bG\\#\u000evm0\u0007\u0012=", "", "1kP@f\bG\\#\u000evm0\u0007\u0012=", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~9\u00070?C\f\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001dBD\u0013aN\u00049]\u0019V\u0017Pt\t\u000ebK3jS;)\u0011u%\u000bDr\u0010\b%\u0012?sF8=\u0015C\u000b\u0011?H%qH#[\u0003PKT^9h\u0016hf8CC.#m(\u001frY\u0004MbY\u001b\u0002Y}pz\u0011'zE(:t_[A~YF}p\u00059{\u0005\u0016._x@t:Y", "1qT.g,&O&\u0005z]\f\u0006\u00197S\u007f5\u007f<\b\u001b,G|", "/m]<g(MW#\b\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~9\u00070?C\f\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001dBD\u0013aN\u00049]\u0019V\u0017Pt\t\u000ebK3jS;)\u0011u%\u000bDr\u0010\b%\u0012?sF\u0006=\u0016Q\t\u001cyJ<2TYl}CHIw&s\u0010i&& ($!u\u0015\"le.\u0017Q", "1qT.g,,W!\n\u0002^\f\u0006\u00197S\u007f5\u007f<\b\u001b,G|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~9\u00070?CY\u0015SMJr8'(2o9\u0014g(Uz<C[R6e\u001cX+\u0014\u001f^\nU/\"\u0005f\u0017", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EnumsKt {
    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                enumDescriptor.pushClassAnnotation(annotation);
            }
        }
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t2 = values[i2];
            int i4 = i3 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i3);
            if (strName == null) {
                strName = t2.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i3);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    enumDescriptor.pushAnnotation(annotation2);
                }
            }
            i2++;
            i3 = i4;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t2 = values[i2];
            int i4 = i3 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i3);
            if (strName == null) {
                strName = t2.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt.getOrNull(annotations, i3);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i2++;
            i3 = i4;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String serialName, T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new EnumSerializer(serialName, values);
    }
}
