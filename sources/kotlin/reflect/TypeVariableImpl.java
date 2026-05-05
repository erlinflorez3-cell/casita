package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP\u008cZS8şs{:$c$\u007f\\C٥\"}8\tWNmgvJh\u001aK\u000f\f\u0016\u0001jBI]xc\u0014\u00172P{G3SoE9nz>\u0005&2(9\u0010ڎ1 :J v)Cy\u000bB0nqz]\u001dQ\u0013\u001c*\u0006l#Ә\"\\uR~YzbR/Q\t\u001aH\\.w2\u0013L;N\u001bܢ\r?\u0005,4X9K\u0014k]#\rX¹M\rgqk\u0010\u0019157ayg8h\u007fZ\u001fY\\ոar4jM`n\u001b?1_e[P<3&\u000bԫ\u0011<\u0012\u001fN8V@E v\n\u001e3#\u0006\u0002P\u0017\u0016ެF\u007f\tu~&3\u0015K1I\u001dvQ\u0010FG^Ѽ\u007f\u0005\u001b/k\u0007|7sT<`[/\u001d}_Hi@k`\u0015\u001e\"C{\u001d\tb0BJD\u0010\u0006=\u0016).E@}o\u0002)/\b\u001aHr\u007f=\u00191takjHn%Eݮ9Ҋ\r\fbե\u0087\t\t"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xT\u00143{1|$\u001bCl\u0015<Z-@`S", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017\bC|\u00128s,5/", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq]@\n\u0017$Kml<t,1fy/;w\u001f\u0004", "\u001aj^A_0G\u001d&~{e,z\u0018xT\u00143{$\t\"\u001e\u001d", "Bx_2C(KO!~\n^9", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "uKZ<g3B\\b\fz_3|\u0007>/e\u0017\u0010K\u0001\u0002\u0013Tk\u0016<\u0006%B/A\u0011", "3pd._:", "", "=sW2e", "", "5dc\u000ea5Hb\u0015\u000e~h5", "\"", "", "/m]<g(MW#\bXe(\u000b\u0017", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkbE|(\u0013\u0011v\nExn1b\u0007*Fi%2WL\u0005G='\u001fw]H\u000bm5$", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "", "u(J\u0019](OOb\u0006vg.F\u00058n\n7wO\u0005! \u0011K\u0017E\u000141h\u0002*@C", "5dc\u000fb<GR'", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", "u(J\u0019](OOb\u0006vg.F\u0016/f\u0007(yOJ\u0006+Roc", "5dc\u0011X*EO&~y:5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0014X5>`\u001d|Y^*\u0004\u0005<a\u000f,\u0006I", "5dc\u001bT4>", "", "5dc!l7><\u0015\u0007z", "6`b566=S", "", "BnBAe0GU", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
    private final KTypeParameter typeParameter;

    public TypeVariableImpl(KTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.typeParameter = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    public final <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        return null;
    }

    public final Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List<KType> upperBounds = this.typeParameter.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.computeJavaType((KType) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.typeParameter));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.typeParameter.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
