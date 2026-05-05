package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import yg.InterfaceC1492Gx;
import yg.Kl;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\bnjGRLeV:ZS0\u000fs{J$c$wECU(Ԃ*\tUN}˧\u0017P`ŏQ\u000e.\u0016'j\\Oezm\u0012U1pp\u007fF]yK;xzF\u000702X\u0600(\bв\u001e,N\u0014\u0005\u007f\f`\u001a\u001eHB\u00079\t҈}\t(\u001f\u001e>N\tdpʄR6Vz&M=2\u001bip^Wc>\ne\r|Öm!țe\u001e9Q\bM#+k\u000f\u0017Tk?1G\u0002?\u0015h]ݐYPJɑ8ݼ\u0004\u0014\u001dۀ %k{>h\u0015Sp\f]˃_e[P<0&\u0002Rȡ>Ǭ\u0012\u0006/Ξ~A(p \u0016Cv\u0003SvА\u0018]p\u000bQʫBа)\u007f;ٿݶ\u001fx"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006V.Eab.Avv8ZK7zC\u001e\">", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq[I\u0011\u001frFk\u0019Kv2\u000b", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E \n'\u001f#n\nG\u0006%B/A\u0011", "Asa6a.-]\nz\u0002n,", "", "", "D`[BX\u001bHA(\f~g.", "Cma2V6@\\\u001d\u0014z]\n\u0004\u0005=s]2\u0005N\u0010$'E~\u0018I", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqYJ\n%&T\u007f\fK\u00012\u000b", "4q^:F;KW\"\u0001", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011}\u001aLr25i\tiIq#.\u00175?x4}\u001exi\u000f", "BnBAe0GU\u0003\fcn4y\t<", "", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017'x\u001eDLh\u001c^y137\u001d*VE\u0005U1#\u0015fp\u000f", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> adapter) throws IllegalAccessException {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        KClass<?> type = adapter.getType();
        Intrinsics.checkNotNull(type);
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) type);
        Intrinsics.checkNotNull(javaClass, "null cannot be cast to non-null type java.lang.Class<E of com.squareup.wire.internal.EnumJsonFormatter>");
        WireEnum[] wireEnumArr = (WireEnum[]) javaClass.getEnumConstants();
        if (wireEnumArr == null) {
            Iterator it = ArrayIteratorKt.iterator(javaClass.getDeclaredClasses());
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                String simpleName = cls.getSimpleName();
                if (!Intrinsics.areEqual(simpleName, "Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                    Field field = (Field) ArraysKt.first(declaredFields);
                    if (Intrinsics.areEqual(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type E of com.squareup.wire.internal.EnumJsonFormatter");
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        Annotation[] annotationArrYX = Kl.YX(cls);
                        Intrinsics.checkNotNullExpressionValue(annotationArrYX, "getAnnotations(...)");
                        Annotation[] annotationArr = annotationArrYX;
                        int length = annotationArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                annotation = null;
                                break;
                            }
                            annotation = annotationArr[i2];
                            if (annotation instanceof WireEnumConstant) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        WireEnumConstant wireEnumConstant = annotation instanceof WireEnumConstant ? (WireEnumConstant) annotation : null;
                        if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
                        Object objFirst = ArraysKt.first(constructors);
                        Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type java.lang.reflect.Constructor<E of com.squareup.wire.internal.EnumJsonFormatter>");
                        this.unrecognizedClassConstructor = (Constructor) objFirst;
                    }
                }
            }
        } else {
            Iterator it2 = ArrayIteratorKt.iterator(wireEnumArr);
            while (it2.hasNext()) {
                WireEnum wireEnum2 = (WireEnum) it2.next();
                Intrinsics.checkNotNull(wireEnum2, "null cannot be cast to non-null type kotlin.Enum<*>");
                String strName = ((Enum) wireEnum2).name();
                linkedHashMap.put(strName, wireEnum2);
                linkedHashMap.put(String.valueOf(wireEnum2.getValue()), wireEnum2);
                linkedHashMap2.put(wireEnum2, strName);
                WireEnumConstant wireEnumConstant2 = (WireEnumConstant) Kl.qd(javaClass.getDeclaredField(strName), WireEnumConstant.class);
                if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum2);
                    linkedHashMap2.put(wireEnum2, wireEnumConstant2.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        E e2 = this.stringToValue.get(value);
        if (e2 != null) {
            return e2;
        }
        Constructor<E> constructor = this.unrecognizedClassConstructor;
        if (constructor != null) {
            return constructor.newInstance(Integer.valueOf(Integer.parseInt(value)));
        }
        return null;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
