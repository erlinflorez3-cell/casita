package org.koin.android.scope;

import android.app.Service;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bDZc|İI\u0006>é6B\u0005\"4\u0012\u0006\u0007nj?0Le^.ZݷB%yڔL$\n#\u001aCiUJ\u0006(\t]O\u007fi\u0005I\t\r\n\u0014\u001e\u001e\u0007mDI\u0004w\u0006\u0012=2ZwM7eok>\ttd\u00058>0>\u0012\u0007\u0017\u0019XG8v)C\u0012\u0011*>NwRX\u001dO\u0015\u001a@\u0005l()\u001e\u000bgߗ:Q"}, d2 = {"1qT.g,,Q#\nz", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001a`]1e6BRbz\u0006iuj\t<v\u0004&{\u0016", "And?V,", "", "1qT.g,,S&\u0010~\\,j\u00079p\u007f", "2dbAe6RA\u0019\f\fb*|v-o\u000b(", "", "5dc V6IS\u0003\fcn3\u0004", "AdaC\\*>A\u0017\t\u0006^", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ServiceExtKt {
    public static final Scope createScope(Service service, Object obj) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), obj);
    }

    public static /* synthetic */ Scope createScope$default(Service service, Object obj, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            obj = null;
        }
        return createScope(service, obj);
    }

    public static final Scope createServiceScope(Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        Koin koin = ComponentCallbackExtKt.getKoin(service);
        Scope scopeOrNull = koin.getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
        return scopeOrNull == null ? koin.createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), service) : scopeOrNull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void destroyServiceScope(Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        ((AndroidScopeComponent) service).getScope().close();
    }

    public static final Scope getScopeOrNull(Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
    }

    public static final Lazy<Scope> serviceScope(final Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.android.scope.ServiceExtKt.serviceScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return ServiceExtKt.createServiceScope(service);
            }
        });
    }
}
