package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RqP\u008cZS@\u000fsڔ<$q$yّCU(\u0007*ޛWNu\bvJp\u000bKƤ\u000e\u0016\u000fj4I[xu\u0005\u001d˰Z{O5]o\u00049pvF\u0005f3P7\u001a\u0017\u0007ɝ8H8\u0003\u000bE[\fX0PrJRSN3\u001c2\u0018D\u001f\u000f\u001f\u0005s^8Xl$:?%\u0013i\tOUb`\u0007[\u0011^Z7\u000f\u0007ad+n<e\u001b3Y\u001b\thZm\nouK\r\u0001'U4y{]6f\n,\u0017AN;h#,b\u0005_l$'Y\\{\u0010^\u001c@\u0002\u000b\u0002\u001d@\u0014\u000e\f(v>[)\u0007\u001a\u0014ޗ\u0003r{L`\u0004nBFzq8'%F4Y;;xW`I\u001avC\f\u0007\u001d\u001ei\u0001~#kTTaC\u001e\u0005{_Bi@kZ\u0015\nq\u001c{Վ\tn\u0012,\u00140\u000e\u007f?}!.]&eZY5'ǽ\u0010Hls\u0007\u0007ph\u001aibJP\"5\u0017e,)\u001e`Cr\u0006\u0014\\dZ<\u0011\u0014\u001cd\t\u000e\bY!\u000bzl+3\u0014fUxkzM$\nS4\u0017;gz\u0004\u000e\u0006F\u000f;;Qq\u001ayT\r\u0013mGzKfyZY\u001c\\l(h3vo0\n\u0002ͩ\\\f;>Os,4r1)^%HI\u001fpC\u001d\u001beYv\u0011'`C&\u0013ijt\u0019\u0003`\\7p\u0016{y6\u000bd:3QSE\u0019lUPmz|ɦ\u000b\u0013"}, d2 = {"1qT.g,+c\"\u000e~f,d\t=s{*{\u001c\u007f\u0013\"Vo\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006c5>h\u0002(7U\u0016<[?=k\u0010\u001d\u0011sp9\u00149", "\u001b", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", ";db@T.>B-\nz", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Bx_2H9E", "", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "1kP@f\u0013HO\u0018~\b", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "EqXAX\u0010=S\"\u000e~m@m\u00056u\u007f6", "", "5dc\u0018X@L", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u0006U\u000ePL", ";db@T.>4\u001d~\u0002]", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "5dc\u000fh0ER\u0019\fir7|", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ReflectionKt {
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(final Class<M> messageType, String str, Syntax syntax, ClassLoader classLoader, boolean z2) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        final Class builderType = getBuilderType(messageType);
        Function0 function0 = new Function0() { // from class: com.squareup.wire.internal.ReflectionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReflectionKt.createRuntimeMessageAdapter$lambda$0(builderType, messageType);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ArrayIteratorKt.iterator(messageType.getDeclaredFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            WireField wireField = (WireField) Kl.qd(field, WireField.class);
            if (wireField != null) {
                Integer numValueOf = Integer.valueOf(wireField.tag());
                Intrinsics.checkNotNull(field);
                linkedHashMap.put(numValueOf, new FieldBinding(wireField, messageType, field, builderType, z2, classLoader));
            } else if (Intrinsics.areEqual(field.getType(), OneOf.class)) {
                Intrinsics.checkNotNull(field);
                for (OneOf.Key<?> key : getKeys(field)) {
                    linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, builderType, key, z2));
                }
            }
        }
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(messageType);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(kotlinClass, builderType, function0, mapUnmodifiableMap, str, syntax));
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, boolean z2, ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        ProtoAdapter protoAdapter = ProtoAdapter.Companion.get(messageType);
        return createRuntimeMessageAdapter(messageType, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z2);
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            classLoader = cls.getClassLoader();
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, z2);
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z2, ClassLoader classLoader, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z2, classLoader);
    }

    public static final Message.Builder createRuntimeMessageAdapter$lambda$0(Class cls, Class cls2) throws IllegalAccessException, InstantiationException {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(cls2);
        }
        Object objNewInstance = cls.newInstance();
        Intrinsics.checkNotNull(objNewInstance);
        return (Message.Builder) objNewInstance;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Class<?> cls2 = Class.forName(cls.getName() + "$Builder");
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<B of com.squareup.wire.internal.ReflectionKt.getBuilderType>");
            objM8980constructorimpl = Result.m8980constructorimpl(cls2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
            objM8980constructorimpl = null;
        }
        Class<B> cls3 = (Class) objM8980constructorimpl;
        return cls3 == null ? KotlinConstructorBuilder.class : cls3;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) throws IllegalAccessException, NoSuchFieldException {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
        return (Set) obj;
    }
}
