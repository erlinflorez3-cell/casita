package org.koin.android.scope;

import android.content.ComponentCallbacks;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.android.ext.android.ComponentCallbackExtKt;
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
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<Ȑ\u0007\"2\u0012\u007f\u0007|jA0Jh`Q`ݷB\u000f\u001azT*aҕ\u007fCcUH~J\t\u0016N\u0018otJh\r[\u0011\u001c\u0015'm߽MU\u0007a*,@G\bECO\u007f=g_#<%&8ĲFy-\u0001H+p\u0010=zŲO\f 7X\nHZ%O\u001b\u0019@\u0005^&\u0007Ȧjgv6vm\u0006:u#ɨmB\\0wM\u000bW%Ld)\u001dv\u0010\u001dYFW;\u001bǬa\u0003/R\n@+?8=ݾl'52ʇwb"}, d2 = {"1qT.g,,Q#\nz", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\"", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&EC", "And?V,", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006H\f! Gx\u001d\u001ar,<Vy\u001e={k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u001056iT<C\u001e\u0016cWL5\u001a\u0005#O\"xO7hu*S\r;>", "5dc\u001ce\nKS\u0015\u000ezL*\u0007\u0014/", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006H\f! Gx\u001d\u001ar,<Vy\u001e={kq4IEz;\"\u001e2H5\u001cw\u0002", "5dc V6IS\u0003\fcn3\u0004", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006H\f! Gx\u001d\u001ar,<Vy\u001e={kq4MHm}$\u001flj\u0003\u0005m9N@5EVY,&@pG\u001f\u00120", "<df V6IS", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ComponentCallbacksExtKt {
    public static final <T extends ComponentCallbacks> Scope createScope(T t2, Object obj) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return ComponentCallbackExtKt.getKoin(t2).createScope(KoinScopeComponentKt.getScopeId(t2), KoinScopeComponentKt.getScopeName(t2), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentCallbacks componentCallbacks, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(componentCallbacks, obj);
    }

    public static final <T extends ComponentCallbacks> Lazy<Scope> getOrCreateScope(final T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.android.scope.ComponentCallbacksExtKt.getOrCreateScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                Scope scopeOrNull = ComponentCallbacksExtKt.getScopeOrNull(t2);
                return scopeOrNull == null ? ComponentCallbacksExtKt.createScope$default(t2, null, 1, null) : scopeOrNull;
            }
        });
    }

    public static final <T extends ComponentCallbacks> Scope getScopeOrNull(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return ComponentCallbackExtKt.getKoin(t2).getScopeOrNull(KoinScopeComponentKt.getScopeId(t2));
    }

    public static final <T extends ComponentCallbacks> Lazy<Scope> newScope(final T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.android.scope.ComponentCallbacksExtKt.newScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return ComponentCallbacksExtKt.createScope$default(t2, null, 1, null);
            }
        });
    }
}
