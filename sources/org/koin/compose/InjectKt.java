package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.stable.StableHoldersKt;
import org.koin.compose.stable.StableParametersDefinition;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<;\"&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0LeN/j\u00198ş\u0004{z#{(wّIT0|R\u0011UNug\u0007Lp\nq\u00106\u001c~j:Kmx\f\u0015?FHwM7e}M;ptd\u000b61P=b\u0007\u0017\u0019\tOV͔\u0001ǈJÈܘ4@~BjR[\u000e2\u0012L=@\u0005$ձuMLG\u001de@/1\u0003\u0002Dd&\u000e1-S\u0013Fb)%v\u0010![T==#)k\u0011\u0017Tk?1E\b<3m\u0010)AHR^|ݡ\u0006ѥ\u0014ۀ̠\u0011]\u0001.؛\u0005Vh\u000f-˝\u007f\u0012Jם\u00122"}, d2 = {"9nX;<5CS\u0017\u000e", "\"", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|8ZE\u0005q>\"\u001e2_C\u0014cu\\t1RL\u0018\u001aZ\\}=ix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]K+.\u001evI \btWOG9?9y'\u001dZQ", "@d\\2`)>`~\t~g\u0010\u0006\u000e/c\u000f", "9nX; *H[$\t\t^"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InjectKt {
    public static final /* synthetic */ <T> T koinInject(Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        StableParametersDefinition stableParametersDefinitionRememberStableParametersDefinition;
        composer.startReplaceableGroup(414512006);
        if ((1 & i3) != 0) {
            qualifier = null;
        }
        if ((2 & i3) != 0) {
            scope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        composer.startReplaceableGroup(1274527078);
        if (function0 == null) {
            stableParametersDefinitionRememberStableParametersDefinition = null;
        } else {
            int i4 = i2 >> 6;
            stableParametersDefinitionRememberStableParametersDefinition = StableHoldersKt.rememberStableParametersDefinition(function0, composer, (i4 + 14) - (i4 | 14));
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1274527144);
        boolean z2 = (-1) - (((-1) - (composer.changed(qualifier) ? 1 : 0)) & ((-1) - (composer.changed(scope) ? 1 : 0))) == 1;
        T t2 = (T) composer.rememberedValue();
        if (z2 || t2 == Composer.Companion.getEmpty()) {
            Function0<ParametersHolder> parametersDefinition = stableParametersDefinitionRememberStableParametersDefinition != null ? stableParametersDefinitionRememberStableParametersDefinition.getParametersDefinition() : null;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            t2 = (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parametersDefinition);
            composer.updateRememberedValue(t2);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return t2;
    }

    @Deprecated(message = "")
    public static final /* synthetic */ <T> T rememberKoinInject(Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        StableParametersDefinition stableParametersDefinitionRememberStableParametersDefinition;
        composer.startReplaceableGroup(-505490445);
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((2 & i3) != 0) {
            scope = KoinApplicationKt.rememberCurrentKoinScope(composer, 0);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        composer.startReplaceableGroup(-207995524);
        if (function0 == null) {
            stableParametersDefinitionRememberStableParametersDefinition = null;
        } else {
            int i4 = i2 >> 6;
            stableParametersDefinitionRememberStableParametersDefinition = StableHoldersKt.rememberStableParametersDefinition(function0, composer, (i4 + 14) - (i4 | 14));
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-207995458);
        boolean zChanged = composer.changed(qualifier);
        boolean zChanged2 = composer.changed(scope);
        boolean z2 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
        T t2 = (T) composer.rememberedValue();
        if (z2 || t2 == Composer.Companion.getEmpty()) {
            Function0<ParametersHolder> parametersDefinition = stableParametersDefinitionRememberStableParametersDefinition != null ? stableParametersDefinitionRememberStableParametersDefinition.getParametersDefinition() : null;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            t2 = (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parametersDefinition);
            composer.updateRememberedValue(t2);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return t2;
    }
}
