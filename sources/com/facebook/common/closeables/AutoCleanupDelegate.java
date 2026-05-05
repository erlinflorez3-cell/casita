package com.facebook.common.closeables;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDZc|\u0004Oي8\u000b4B\u0007\"B\u0012\u007f\u0007tjA0JhP.hS2\u000fq~:8qҕ\u001aEA٥(|R\u0019_Rwi\u0005I\t\fS\u0013\u0016\u0018\u000firH\u0004x\u001e5\u001f:HoM5eqS8\u0017ҚF\u0015.5:D\n\u0007\u0011\u001a`Ϻ x\u000bCy\u0011@4Ϯt:`\u0013\u0016)(\u001a\u001e@6\u007fTձ\u0018TDQ\u0005_P.Q\u0004\u001aJ\\1w4\rM\u0013G\u00032Sȏaӿ/@EA]Qa\u0010\u001fR\nD3E\u007fF\u001dj=&YJ$_Db\u0018\u0018%+U\u000e\f}Vb\u0013_x\u000e=*\u0006Ҫ\u0012\u05cb\u000e߭{z\n\u001c\r\u001c\u001c\t?T>/*f>ԄCv\u0003SnU0b\u0019Ș|ˋ:\u0017-Į\u0004;G\u001d~Sw:O\u05cb\u000eީ\u0011ڟ\"%\tn/bړ\u0012p"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n~\u001e!Uo\n9}%C#Y0Fws5M?D{?|\u0015oa;\u0003r,$", "\"", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "", "1ta?X5MD\u0015\u0006\u000b^", "1kT.a<I4)\bxm0\u0007\u0012", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012g", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc#T3NS", "BgX@E,?", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "Adc#T3NS", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2jOf5\u0018_uUr0I\u00168)aRpLiUK", "4aR<e,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class AutoCleanupDelegate<T> implements ReadWriteProperty<Object, T> {
    private final Function1<T, Unit> cleanupFunction;
    private T currentValue;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCleanupDelegate(T t2, Function1<? super T, Unit> cleanupFunction) {
        Intrinsics.checkNotNullParameter(cleanupFunction, "cleanupFunction");
        this.currentValue = t2;
        this.cleanupFunction = cleanupFunction;
    }

    public /* synthetic */ AutoCleanupDelegate(Object obj, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : obj, function1);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.currentValue;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, T t2) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t3 = this.currentValue;
        if (t3 != null && t3 != t2) {
            this.cleanupFunction.invoke(t3);
        }
        this.currentValue = t2;
    }
}
