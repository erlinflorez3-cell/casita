package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bӵLc\u0003\"I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007t\rA0RnP.`S2\u000fq{L_iҕ\nCiTJ\b0\tgTwi~J\t\rq\u001064~j:Lm\u0011m \u001f>RqO3{qM;ptd\u000bN72:\n\u0005/!XLV{ټGK\u001a\u001aؼDy"}, d2 = {"@d\\2`)>`\u0001\u000f\u0002m0\b\u0010/P\u007f5\u0004D\u000f%\u001bQx\u001c*\u0006!DY", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>TR?v;\u001e\u007fhnA\u000bq:R\u00010U:](kRH", ">da:\\:LW#\b\t", "", "", "=m?2e4Ba'\u0003\u0005g:i\t=u\u00077", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000e\u0015)\u00107S\u0010;uVoyQ\u001chzJ \u0012Q\u0004\u0017|ArdDWi\u0002R=Nf8sUj\u001diB>2\"u#$v\u001a\u0016\u001a\u0003b\u0015}YyRgT!~F2BwdT3~QKt|", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MultiplePermissionsStateKt {
    public static final MultiplePermissionsState rememberMultiplePermissionsState(List<String> permissions, Function1<? super Map<String, Boolean>, Unit> function1, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        composer.startReplaceableGroup(-57132327);
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function1 = new Function1<Map<String, ? extends Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MultiplePermissionsStateKt.rememberMultiplePermissionsState.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
                    invoke2((Map<String, Boolean>) map);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, Boolean> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-57132327, i2, -1, "com.google.accompanist.permissions.rememberMultiplePermissionsState (MultiplePermissionsState.kt:36)");
        }
        int i4 = (i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i2 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        MultiplePermissionsState multiplePermissionsStateRememberMutableMultiplePermissionsState = MutableMultiplePermissionsStateKt.rememberMutableMultiplePermissionsState(permissions, function1, composer, (i4 + 8) - (i4 & 8), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return multiplePermissionsStateRememberMutableMultiplePermissionsState;
    }
}
