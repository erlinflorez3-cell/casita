package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bӵLc\u0003\u0010Iي8\u000bDB\u0007\":\u001b\u007f\u0007tjA0Je`W`ݷB\u000f\u001azd(i$\nCiVJ\u0010(\t]P\u007fs~Lj\u000bq\u0013\u0016\u0018\tjZN\u0004{$\u0017Ƥ6B}EݵQv"}, d2 = {"@d\\2`)>`\u0004~\bf0\u000b\u00173o\t\u0016\u000b<\u0010\u0017", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r,$", ">da:\\:LW#\b", "", "=m?2e4Ba'\u0003\u0005g\u0019|\u0017?l\u000f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kq\u0019.W@`\u0018\u0011{\u001f\u007fC0h\u0010U]wQIP^3h\u001anfg:G,\u0018\u007f'\u001frY<SfS\u001ezV\bukQ\"hG Mm1", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PermissionStateKt {
    public static final PermissionState rememberPermissionState(String permission, Function1<? super Boolean, Unit> function1, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        composer.startReplaceableGroup(923020361);
        if ((i3 & 2) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.PermissionStateKt.rememberPermissionState.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(923020361, i2, -1, "com.google.accompanist.permissions.rememberPermissionState (PermissionState.kt:36)");
        }
        MutablePermissionState mutablePermissionStateRememberMutablePermissionState = MutablePermissionStateKt.rememberMutablePermissionState(permission, function1, composer, i2 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutablePermissionStateRememberMutablePermissionState;
    }
}
