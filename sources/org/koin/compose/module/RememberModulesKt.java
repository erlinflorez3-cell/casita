package org.koin.compose.module;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.module.Module;
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
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,i\bӵLc\u0003\rI\u00066\f6B\u0015\"4\u0012\u0006%njO0Le^.ZS0\u000f\u0004HBřs$ Bk] }0\tgP}f\u001dK\u000b\u0013I\u000f\u0014\u0018\u0011lBH\u0004y\u000e\u0018\u00152PrW3{pmPfxD\t8C2@\n\u000b\u0011\u001c:H>})Iy\u0011ܘ4@vB\u0019ҐSơ\u0019ŇĂB \u000f'մgS>Krұj]\"ɮmL"}, d2 = {"@d\\2`)>`~\t~g\u0014\u0007\b?l\u007f6", "", "Cm[<T+(\\y\t\b`6\f\u0018/n", "", "Cm[<T+(\\t{vg+\u0007\u0012/d", "Cm[<T+&]\u0018\u000f\u0002^:", ";nSB_,L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u0005!<`\b2\u0015w\u001e9WQ7h;\u001erdh@\u00159", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#8\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e$\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:Of\u0019V}\u001du\u000b\u0007rNdi\bGN\u001bF\u000e(|", "9nX; *H[$\t\t^"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RememberModulesKt {
    @KoinExperimentalAPI
    public static final void rememberKoinModules(Boolean bool, Boolean bool2, boolean z2, Function0<? extends List<Module>> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1703546888);
        if ((1 & i3) != 0) {
            bool = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            bool2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function0 = new Function0<List<? extends Module>>() { // from class: org.koin.compose.module.RememberModulesKt.rememberKoinModules.1
                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Module> invoke() {
                    return CollectionsKt.emptyList();
                }
            };
        }
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        composer.startReplaceableGroup(-553418377);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            List<Module> listInvoke = function0.invoke();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : z2;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            objRememberedValue = new CompositionKoinModuleLoader(listInvoke, koin, zBooleanValue, z2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
