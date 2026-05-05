package org.koin.androidx.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<;\"&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0LeN.ZS@\u000fs{:$si\u007fّSU`|B\rUȞuf\u0005I\u000b\u0013I\u000f\u0014\u0016\u0011lBH\u0004y\u000e\u0018\u00152PqW3{rmMf|D\t8@2:\n\u0005/ @G>{cEa\u000bp7\u0007\u0089@ƞ\f˟ŋ\u001e\u0012\u0014F8\f,e\u007fNdR3bƠ3#\u0011tĬN,g3\u0003\u058b=tSܴ\u0011\u0003"}, d2 = {"5dc", "\"", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|8ZE\u0005q>\"\u001e2_C\u0014cu\\t1RL\u0018\u001aZ\\}=ix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]K+.\u001evI \btWOG9?9y'\u001dZQ", "5dc\u0018b0G", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4MHm}$\u001flj\u0003\u0005m9N@\rQPW\u0002", "9nX; (GR&\t~]?D\u00079m\u000b2\n@z$\u0017No\nJv"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GetExtKt {
    @Deprecated(message = "8Y\u0001t|\u0004\u001eeAU2\u007fS)s\u0017\u001cU\u0017:\u0019m\rV")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T> T get(Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2042115543);
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            scope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            function0 = null;
        }
        composer.startReplaceableGroup(-909570880);
        int i4 = (-1) - (((-1) - (composer.changed(qualifier) ? 1 : 0)) & ((-1) - (((((896 & i2) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function0)) || (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256) ? 1 : 0)));
        boolean zChanged = composer.changed(scope);
        boolean z2 = (i4 + (zChanged ? 1 : 0)) - (i4 & (zChanged ? 1 : 0)) == 1;
        T t2 = (T) composer.rememberedValue();
        if (z2 || t2 == Composer.Companion.getEmpty()) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            t2 = (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
            composer.updateRememberedValue(t2);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return t2;
    }

    @Deprecated(message = "8Y\u0001t\u0001\u0007\u001c%cV1\t\u001e\u0018;[l[\u001c,Ro\u0011faUwx\u0016=cov_xGN`")
    @InterfaceC1492Gx
    public static final Koin getKoin(Composer composer, int i2) {
        composer.startReplaceableGroup(-1728138857);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1728138857, i2, -1, "org.koin.androidx.compose.getKoin (GetExt.kt:51)");
        }
        composer.startReplaceableGroup(564008160);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = GlobalContext.INSTANCE.get();
            composer.updateRememberedValue(objRememberedValue);
        }
        Koin koin = (Koin) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return koin;
    }
}
