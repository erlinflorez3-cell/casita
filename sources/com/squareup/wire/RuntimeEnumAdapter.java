package com.squareup.wire;

import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JgP.hS2\u000fq|<$i*yCAU\"}0\u0012WȞog|Ϻb\u000bI\u0010\u001cǝ\u0017\u007fTO[ތk\u001172poo9]qM9'sd\u0006X17x\u0017\u000bЏ*4V\u0012\u000f\u0001SM\u001c\u0012fϋ\u001f=b\u0011[\t2\u00124Cŋ\u0005 bm\\=\t\u0002cN?-\u0011kZT7a@|\u0004εtWܮ\u0011xg$9H\u007f;#0k\u00035\\\"?KR\u007fI\u001dh]ݐ[M\u0002dNX.\"[=̠\u0011]\u00015%\u0016_p$'Y`\u0014Q^ @y\u0011z;OJؑ\u0006oN<A2f6\u001cy\tCeNR\u001adR\u0002\u000balЍS\u0003\nڂ;ӸjQiݢi\\E\u0005\u001d\u000f4\"/xwſ`\u05f8d\u0015#ƘɖUG"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqhP\n&\u001bOomE\u0007-\u0011Xy+Fm#\u0004", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq[I\u0011\u001frFk\u0019Kv2\u000b", "8`e.G@IS", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fyJ\t`%S\u007f\nIv5@#\u0010$Dm_\u001caLJgGsXY", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "4q^:I(Ec\u0019fzm/\u0007\b", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "5dc\u0013e6FD\u0015\u0006\u000b^\u0014|\u00182o~", "4q^:I(Ec\u0019", "D`[BX", "", "uH\u0018\u0019V6F\u001d'\u000b\u000bZ9|\u0019:/\u0012,\t@J\t\u001bTomE\u0007-\u000b", "3pd._:", "", "=sW2e", "", "6`b566=S", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    public static final Companion Companion = new Companion(null);
    private Method fromValueMethod;
    private final Class<E> javaType;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018rui\u0007Pj\rS\u000fL\u001a'mLO[wk\u001672pto=[uU?pvF\u0005f6P?@\nи\u001e2"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqhP\n&\u001bOomE\u0007-\u0011Xy+Fm#l+MCv0'\u0019rj\u000f", "", "\nh]6g\u0005", "u(E", "1qT.g,", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqhP\n&\u001bOomE\u0007-\u0011Xy+Fm#\u0004", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "3md:G@IS", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> enumType) {
            Intrinsics.checkNotNullParameter(enumType, "enumType");
            return new RuntimeEnumAdapter<>(enumType, ProtoAdapter.Companion.get(enumType).getSyntax());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType) {
        this(javaType, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(javaType, "javaType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType, Syntax syntax) {
        super((KClass<WireEnum>) JvmClassMappingKt.getKotlinClass(javaType), syntax, Internal.getIdentityOrNull(javaType));
        Intrinsics.checkNotNullParameter(javaType, "javaType");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.javaType = javaType;
    }

    @JvmStatic
    public static final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> cls) {
        return Companion.create(cls);
    }

    private final Method getFromValueMethod() throws NoSuchMethodException {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        Method method2 = this.javaType.getMethod("fromValue", Integer.TYPE);
        this.fromValueMethod = method2;
        Intrinsics.checkNotNullExpressionValue(method2, "also(...)");
        return method2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && Intrinsics.areEqual(((RuntimeEnumAdapter) obj).getType(), getType());
    }

    @Override // com.squareup.wire.EnumAdapter
    protected E fromValue(int i2) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = getFromValueMethod().invoke(null, Integer.valueOf(i2));
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter");
        return (E) objInvoke;
    }

    public int hashCode() {
        KClass<?> type = getType();
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }
}
