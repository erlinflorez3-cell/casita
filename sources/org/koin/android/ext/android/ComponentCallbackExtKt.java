package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<;!&i\u000eӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0Le^.ZS0\u000fs{J$cҕyCQU\"Ԃ*\teNo˧\u0007\u000ehŏ[\u000fL\u0015\u0019r2կcws\u001172pog3{pmAftD\u00078487(\b1.0P\u001ez\u0013Q[\u000e\"0nvPQ;Rm\u001c(\u0005\u001d'Gȭb˚MȤՂp]H7;\u000bwKf'\u000e:%M;Glu\u001b\u0002y$;BG5[$\u0002\u000f'ZaΪ\u0011>\b<-hU'SI\"Xf`\u0006\u0014#-g\u000fsqT_5Wf\f58gcy^><}\u0003\n\u0011T\u0012\u001e\b7H\\30e6\u0013\u001cv\tR\u001fWHސHʎyʨت\u0017*\b61ݧK\u0015PŎ?("}, d2 = {"5dc", "\"", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&EC", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006H\f! Gx\u001d\u001ar,<Vy\u001e={k\u0015WP=5:(\u0019q+7\u0011p,\u0018\u00037CSR-`R\u007f\u0007\u007f\"V\u0015R,\u0011\u0005f\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb*O\u000b(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&", "5dc\u0018b0G", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "7mY2V;", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";nS2", "\u001aj^A_0G\u001d\u007fz\u0010r\u001b\u007f\u0016/a~\u0016wA\u0001&+/y\r<L", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ComponentCallbackExtKt {

    /* JADX INFO: renamed from: org.koin.android.ext.android.ComponentCallbackExtKt$inject$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u000eӵLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "", "7me<^,", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ ComponentCallbacks $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.$this_inject = componentCallbacks;
            this.$qualifier = qualifier;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            Qualifier qualifier = this.$qualifier;
            Function0<ParametersHolder> function0 = this.$parameters;
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    public static final /* synthetic */ <T> T get(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = null;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static final Koin getKoin(ComponentCallbacks componentCallbacks) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin() : GlobalContext.INSTANCE.get();
    }

    public static final /* synthetic */ <T> Lazy<T> inject(ComponentCallbacks componentCallbacks, Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    public static /* synthetic */ Lazy inject$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new AnonymousClass1(componentCallbacks, qualifier, function0));
    }
}
