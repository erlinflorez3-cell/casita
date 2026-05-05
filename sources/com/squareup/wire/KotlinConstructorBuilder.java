package com.squareup.wire;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import okio.ByteString;
import yg.InterfaceC1492Gx;
import yg.Kl;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0R\tP.`Y2\u000f\u0002{<$q$yCI٥\"Ԃ*\t]mogtJb\u000bQ\u000f\u000e\u0016~o4Ic\u0017e\u0012%2JoE3SڎSʠ\t\u0007<ӌ.1JD\n\u0007\u0011\u001apG x\u000bC\u0012\r@0h\u0003@Q\u001bN-&\"\bN G\u001dli^6\u000fm\f<_/\u0013kRNm^@~]\r\rUU\u000f/`9kSG?#(k\t\u0017Tk?9ӊ Aݾl)-0Wy Lf\u0010,\u0015Y`=a\u00018t\u0005\u007fk<-9b{Mf\rV\u0004C\n\u001bP\u001c\u000e48x2;,~\b<>;r\u001cN^\u0017vD\u0016y\u0010BG)\u000eEC9Iq\u001alI/f72˜S2ţ\u0005n/r\u001d$n-3Z\bSAQnWvg2_Mo\u0014p\u0019̣X\bvGPA\n\u0014F\u001d59k9Yܩ\u001a\u0006\u001fֶiЛ\t`pׅ:xVG:\t&9:\t:cTt\u0015y`Vh,?X,X\u0017\u007f\u001e\u0012Nh&FO-fʝQŹmjUΪZM=sOu~m\u001eWggCGas cbvBJLh\u0015\\vBY\r\tjV,`PAݛyԞHN\u0014Ǝ\u0003k\u007f+LLA\u001bl\u0015v\f.XQ\u0011\u0019ajh>\nd=4\u000by$z\n\u0011Pbq\u001eo'SZ\u00057ø/ۮU5!ğƇ&\u0005"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqaJ\u0010\u001e\u001bPM\u0018E\u00054Bi{/Azr>QJ:kAs", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", ";db@T.>B-\nz", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "4hT9W\u001d:Z)~bZ7", "", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;L", "", "@d_2T;>Ry\u0003ze+m\u00056u\u007f\u0010wK", "", ";`_\u0013\\,ER~~\u000fO(\u0004\u0019/M{3", "Adc", "", "4hT9W", "D`[BX", "1k^/U,K=(\u0002zk\u0010\u000br8ei)\n", "5dc", "0tX9W", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nh\u0017%Uk\u0010<L", "2dR9T9>R\u0004\f\u0005m6]\r/l~6", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqaJ\u0010\u001e\u001bPM\u0018E\u00054Bi{/Azr>QJ:kA\\\u007fukH\u0011D0N}&\u001d", "\u001eq^Ab\rBS }", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, Pair<WireField, Object>> fieldValueMap;
    private final Map<Integer, Pair<WireField, Map<?, ?>>> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, Pair<WireField, List<?>>> repeatedFieldValueMap;

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\fljOӄtev-\u0013l:\u0017y{L(k$wDiV*\u00020\u000bgN\u0016jĔN\\\u0011G\u001d\u000bf\fx,aY\t]\u0018\u0010`CņC9UڎU;fzD\fpA0:\u0012\u0005/\u001dݵL\u0016~ٙ[M\u0012\u001a>Iª>\\"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqaJ\u0010\u001e\u001bPM\u0018E\u00054Bi{/Azr>QJ:kA\\\u007fukH\u0011D0N}&\u001d", "", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Eha290>Z\u0018", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;L", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fyJ\t`%S\u007f\nIv5@#\u0010$Dm_ QP;L8\u001e\u001cg7|w", "5dc!l7>", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "5dc$\\9>4\u001d~\u0002]", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nr\u001b$GP\u0012<}$\u000b", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> type, WireField wireField) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(wireField, "wireField");
            this.type = type;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(Class<M> messageType) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.messageType = messageType;
        int length = messageType.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField wireField) {
        Collection<Pair<WireField, Object>> collectionValues = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((Pair) it.next()).getFirst());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField2 = (WireField) obj;
            if (Intrinsics.areEqual(wireField2.oneofName(), wireField.oneofName()) && wireField2.tag() != wireField.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] annotationArrCX = Kl.cX(field);
            Intrinsics.checkNotNullExpressionValue(annotationArrCX, "getDeclaredAnnotations(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : annotationArrCX) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) CollectionsKt.firstOrNull((List) arrayList2);
            if (wireField != null) {
                Class<?> type = field.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                protoField = new ProtoField(type, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t2).getWireField().schemaIndex()), Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t3).getWireField().schemaIndex()));
            }
        });
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        List<ProtoField> listDeclaredProtoFields = declaredProtoFields(this.messageType);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator<ProtoField> it = listDeclaredProtoFields.iterator();
        while (it.hasNext()) {
            arrayDeque.add(it.next());
        }
        List<ProtoField> list = listDeclaredProtoFields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(clsArr);
        spreadBuilder.add(ByteString.class);
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
        IntRange intRange = new IntRange(0, clsArr.length);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((IntIterator) it3).nextInt() == listDeclaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) arrayDeque.removeFirst()).getWireField()));
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        M mNewInstance = declaredConstructor.newInstance(Arrays.copyOf(array, array.length));
        Intrinsics.checkNotNull(mNewInstance, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
        return mNewInstance;
    }

    public final Object get(WireField field) {
        List<?> second;
        Map<?, ?> second2;
        Intrinsics.checkNotNullParameter(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Pair<WireField, Map<?, ?>> pair = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
            return (pair == null || (second2 = pair.getSecond()) == null) ? MapsKt.emptyMap() : second2;
        }
        if (field.label().isRepeated()) {
            Pair<WireField, List<?>> pair2 = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
            return (pair2 == null || (second = pair2.getSecond()) == null) ? CollectionsKt.emptyList() : second;
        }
        Pair<WireField, Object> pair3 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
        Object second3 = pair3 != null ? pair3.getSecond() : null;
        return (second3 == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.Companion.get(field.adapter()).getIdentity() : second3;
    }

    public final void set(WireField field, Object obj) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Map<Integer, Pair<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer numValueOf = Integer.valueOf(field.tag());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            map.put(numValueOf, TuplesKt.to(field, TypeIntrinsics.asMutableMap(obj)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, Pair<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer numValueOf2 = Integer.valueOf(field.tag());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<*>");
            map2.put(numValueOf2, TuplesKt.to(field, TypeIntrinsics.asMutableList(obj)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), TuplesKt.to(field, obj));
        if (obj == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }
}
