package org.koin.core.definition;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bDJc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<$q$yّCU(\u001c*\teNogtJb\u000bQ\u001b\u000e\u0016~mD?cތu\u0018\u001f4Ro\u00063{n]=fҚD\u000561R>\u007f\u0005\u000f\u001bBH>x+KQ\f 3XrPQ;Q5A\u0018\fL%\u0019?li^6vsm<?#1qRP7_v|{\u0013/Z7\u000f\u0007ad+\u001f@߱\u0019%Y\r7ba?\u0011J\nG\u0015n7+;IyXde. E/]\u001burT`KİfѨ&˃g\u0006Y_&(&\u000b,\u0015J\u0015&\n7H4.Hs8\u0014A\u0007\u000bUVO0br\u0004\toN\u0017S\u0004[gG.~Sgݢ'NW\u0013\u0015\u000f.#/u1]d\u000e\u000f\u001d+V\bQwQnC˓R\n_G\u001e\u001b\u0001d\u0012*27W\u0002?{?6''G[\u007f#OqɘLDm\u0001-hvg\nRvPRnDGѪ\t\u0011bGjʧ\u001c~Sй0&"}, d2 = {"-ba2T;>2\u0019\u007f~g0\f\r9n", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "\"", "9h]1", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9s@\u007f$\u000b", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "2dU6a0MW#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9l<w)>]\r$Avk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AdR<a+:`-m\u000fi,\u000b", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "Ab^=X\u0018NO \u0003{b,\n", "7mS2k\u0012>g", "", "1kPGm", "Bx_2D<:Z\u001d\u007f~^9", "\u0012dU6a0MW#\b", "\u0017mS2k\u0012>g", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BeanDefinitionKt {
    public static final /* synthetic */ <T> BeanDefinition<T> _createDefinition(Kind kind, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, List<? extends KClass<?>> secondaryTypes, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition<>(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, secondaryTypes);
    }

    public static /* synthetic */ BeanDefinition _createDefinition$default(Kind kind, Qualifier qualifier, Function2 definition, List list, Qualifier scopeQualifier, int i2, Object obj) {
        List secondaryTypes = list;
        Qualifier qualifier2 = qualifier;
        Kind kind2 = kind;
        if ((i2 + 1) - (1 | i2) != 0) {
            kind2 = Kind.Singleton;
        }
        if ((2 & i2) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            secondaryTypes = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullParameter(kind2, "kind");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind2, secondaryTypes);
    }

    public static final String indexKey(KClass<?> clazz, Qualifier qualifier, Qualifier scopeQualifier) {
        String value;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        return KClassExtKt.getFullName(clazz) + AbstractJsonLexerKt.COLON + value + AbstractJsonLexerKt.COLON + scopeQualifier;
    }
}
