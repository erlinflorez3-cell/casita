package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
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
/* JADX INFO: compiled from: RequiresPermission.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC1492Gx
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000e]Lш|\u0004O\u00128é6B\r14\u0012}\u0007njG9LeN2Xݿ*%ӆ,4RZ\\qMF\u0016L\u000e(\u000fO\\g\u007fnx[\u001bO\u0015\u0006$z\u00032YW\t]@\u0010`E\u007fK9M}AQf\u00058\u0015 `#f|\u0015\u0007 *V\u0015\u000fzqQ\\%>B\t@b\u000f]\u0005H\u00134Aŋ\u0005\"tiT8Vs.M='\u001boRP7_^}{\u0010ТX+%xg\"9G\bB#*k\u00035XÜC\u0007WsC\nv/w8Wso6\u0007\u0001Џ\u0019/g\u000fcr4eԍUl"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017#Ws\u001b<\u0005\u00105f\u0006$E{\u001a8V\u0019", "", "D`[BX", "", "/k[\u001cY", "", "/mh\u001cY", "1n]1\\;B]\"z\u0002", "", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "u(I", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", " dP1", "%qXAX", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@Documented
public @interface RequiresPermission {

    /* JADX INFO: compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000e]Lш|\u0004W\u00068\u000b4B\u0005Ӵ,(Մ7f\u00198pLuN4Ra*'k*5th2q[;\u0004\u001bԥ&\rgPmg|Lӂ\u000fF"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017#Ws\u001b<\u0005\u00105f\u0006$E{\u001a8V\u0002(k0\u001dj", "", "D`[BX", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017#Ws\u001b<\u0005\u00105f\u0006$E{\u001a8V\u0019", "u(;.a+K]\u001d}\u000e((\u0006\u00129t{7\u007fJ\n`\u0004G{\u001e@\u0004%CD}-?q$<QMDA", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Read {
        RequiresPermission value() default @RequiresPermission;
    }

    /* JADX INFO: compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000e]Lш|\u0004W\u00068\u000b4B\u0005Ӵ,(Մ7f\u00198pLuN4Ra*'k*5th2q[;\u0004\u001bԥ&\rgPmg|Lӂ\u000fF"}, d2 = {"\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017#Ws\u001b<\u0005\u00105f\u0006$E{\u001a8V\u0002-x8-\u0015>", "", "D`[BX", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\nm\u0017#Ws\u001b<\u0005\u00105f\u0006$E{\u001a8V\u0019", "u(;.a+K]\u001d}\u000e((\u0006\u00129t{7\u007fJ\n`\u0004G{\u001e@\u0004%CD}-?q$<QMDA", "/m]<g(MW#\b"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Write {
        RequiresPermission value() default @RequiresPermission;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
