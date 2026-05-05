package com.biocatch.client.android.sdk.techicalServices;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6B\u0005\"4\u0012\u0006\u0013nj?0LeV7Zݷ2\u000f\u0002{<řc$\bCCU \u007f(ߢOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u0011k\u0013'2pqo9[rU;vsd\u0004P60<\u0012\u0005/\u001fpHX\r\tIc\f@2ptHY%M3\"B\nL$\u0019\u001e\u000bl\u00156\u0011\u000bkCG%\u0019hpXWi>\be\u0013VT-\u000e\r`L7p=C\"=U\u0019\u0006\u0001`\b\u000fM\u007fU\u0005\u0017)W/W\u0003o6\u0007\nЕ\u0019;"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u0019Nw.GJ]0f[bL\u0018\u0019hc", "", "u(E", "/rb2e;'](g\u000be3", "", "=aY2V;", ";db@T.>", "", "/rb2e;-`)~", "3w_?X:LW#\b", "", "4h]190>Z\u0018", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "1kPGm", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "<`\\2", ";`Z24*<S'\r~[3|", "4hT9W", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    private final void assertNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str.toString());
        }
    }

    private final void assertTrue(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final Field findField(Class<?> cls, String str) {
        assertNotNull(cls, "Class must not be null");
        assertTrue(str != null, "name field must be specified");
        while (!Intrinsics.areEqual(Object.class, cls) && cls != null) {
            try {
                Field[] fields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(fields, "fields");
                for (Field field : fields) {
                    if (str == null || Intrinsics.areEqual(str, field.getName())) {
                        return field;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void makeAccessible(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if ((Modifier.isPublic(field.getModifiers()) && Modifier.isPublic(field.getDeclaringClass().getModifiers()) && !Modifier.isFinal(field.getModifiers())) || field.isAccessible()) {
            return;
        }
        field.setAccessible(true);
    }
}
