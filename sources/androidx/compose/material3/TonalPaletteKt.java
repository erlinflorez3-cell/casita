package androidx.compose.material3;

import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0015\u0016OيH\u000b\\AUӭ.߽{\rnʑQ2JeV/ʈW,"}, d2 = {"\u0010`b2_0GS\b\t\u0004Z3g\u00056e\u000f7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/>U\u0005\u000b3t\u0016=\\C\u0011", "5dc\u000fT:>Z\u001d\bzM6\u0006\u00056P{/{O\u0010\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$c\u0007\u001c>X\u00125MRJk\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TonalPaletteKt {
    private static final TonalPalette BaselineTonalPalette = new TonalPalette(PaletteTokens.INSTANCE.m3401getNeutral1000d7_KjU(), PaletteTokens.INSTANCE.m3422getNeutral990d7_KjU(), PaletteTokens.INSTANCE.m3421getNeutral980d7_KjU(), PaletteTokens.INSTANCE.m3420getNeutral960d7_KjU(), PaletteTokens.INSTANCE.m3419getNeutral950d7_KjU(), PaletteTokens.INSTANCE.m3418getNeutral940d7_KjU(), PaletteTokens.INSTANCE.m3417getNeutral920d7_KjU(), PaletteTokens.INSTANCE.m3416getNeutral900d7_KjU(), PaletteTokens.INSTANCE.m3415getNeutral870d7_KjU(), PaletteTokens.INSTANCE.m3414getNeutral800d7_KjU(), PaletteTokens.INSTANCE.m3413getNeutral700d7_KjU(), PaletteTokens.INSTANCE.m3412getNeutral600d7_KjU(), PaletteTokens.INSTANCE.m3410getNeutral500d7_KjU(), PaletteTokens.INSTANCE.m3409getNeutral400d7_KjU(), PaletteTokens.INSTANCE.m3407getNeutral300d7_KjU(), PaletteTokens.INSTANCE.m3406getNeutral240d7_KjU(), PaletteTokens.INSTANCE.m3405getNeutral220d7_KjU(), PaletteTokens.INSTANCE.m3404getNeutral200d7_KjU(), PaletteTokens.INSTANCE.m3403getNeutral170d7_KjU(), PaletteTokens.INSTANCE.m3402getNeutral120d7_KjU(), PaletteTokens.INSTANCE.m3400getNeutral100d7_KjU(), PaletteTokens.INSTANCE.m3411getNeutral60d7_KjU(), PaletteTokens.INSTANCE.m3408getNeutral40d7_KjU(), PaletteTokens.INSTANCE.m3399getNeutral00d7_KjU(), PaletteTokens.INSTANCE.m3425getNeutralVariant1000d7_KjU(), PaletteTokens.INSTANCE.m3435getNeutralVariant990d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3434getNeutralVariant950d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3433getNeutralVariant900d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3432getNeutralVariant800d7_KjU(), PaletteTokens.INSTANCE.m3431getNeutralVariant700d7_KjU(), PaletteTokens.INSTANCE.m3430getNeutralVariant600d7_KjU(), PaletteTokens.INSTANCE.m3429getNeutralVariant500d7_KjU(), PaletteTokens.INSTANCE.m3428getNeutralVariant400d7_KjU(), PaletteTokens.INSTANCE.m3427getNeutralVariant300d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3426getNeutralVariant200d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3424getNeutralVariant100d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), PaletteTokens.INSTANCE.m3423getNeutralVariant00d7_KjU(), PaletteTokens.INSTANCE.m3438getPrimary1000d7_KjU(), PaletteTokens.INSTANCE.m3448getPrimary990d7_KjU(), PaletteTokens.INSTANCE.m3447getPrimary950d7_KjU(), PaletteTokens.INSTANCE.m3446getPrimary900d7_KjU(), PaletteTokens.INSTANCE.m3445getPrimary800d7_KjU(), PaletteTokens.INSTANCE.m3444getPrimary700d7_KjU(), PaletteTokens.INSTANCE.m3443getPrimary600d7_KjU(), PaletteTokens.INSTANCE.m3442getPrimary500d7_KjU(), PaletteTokens.INSTANCE.m3441getPrimary400d7_KjU(), PaletteTokens.INSTANCE.m3440getPrimary300d7_KjU(), PaletteTokens.INSTANCE.m3439getPrimary200d7_KjU(), PaletteTokens.INSTANCE.m3437getPrimary100d7_KjU(), PaletteTokens.INSTANCE.m3436getPrimary00d7_KjU(), PaletteTokens.INSTANCE.m3451getSecondary1000d7_KjU(), PaletteTokens.INSTANCE.m3461getSecondary990d7_KjU(), PaletteTokens.INSTANCE.m3460getSecondary950d7_KjU(), PaletteTokens.INSTANCE.m3459getSecondary900d7_KjU(), PaletteTokens.INSTANCE.m3458getSecondary800d7_KjU(), PaletteTokens.INSTANCE.m3457getSecondary700d7_KjU(), PaletteTokens.INSTANCE.m3456getSecondary600d7_KjU(), PaletteTokens.INSTANCE.m3455getSecondary500d7_KjU(), PaletteTokens.INSTANCE.m3454getSecondary400d7_KjU(), PaletteTokens.INSTANCE.m3453getSecondary300d7_KjU(), PaletteTokens.INSTANCE.m3452getSecondary200d7_KjU(), PaletteTokens.INSTANCE.m3450getSecondary100d7_KjU(), PaletteTokens.INSTANCE.m3449getSecondary00d7_KjU(), PaletteTokens.INSTANCE.m3464getTertiary1000d7_KjU(), PaletteTokens.INSTANCE.m3474getTertiary990d7_KjU(), PaletteTokens.INSTANCE.m3473getTertiary950d7_KjU(), PaletteTokens.INSTANCE.m3472getTertiary900d7_KjU(), PaletteTokens.INSTANCE.m3471getTertiary800d7_KjU(), PaletteTokens.INSTANCE.m3470getTertiary700d7_KjU(), PaletteTokens.INSTANCE.m3469getTertiary600d7_KjU(), PaletteTokens.INSTANCE.m3468getTertiary500d7_KjU(), PaletteTokens.INSTANCE.m3467getTertiary400d7_KjU(), PaletteTokens.INSTANCE.m3466getTertiary300d7_KjU(), PaletteTokens.INSTANCE.m3465getTertiary200d7_KjU(), PaletteTokens.INSTANCE.m3463getTertiary100d7_KjU(), PaletteTokens.INSTANCE.m3462getTertiary00d7_KjU(), null);

    public static final TonalPalette getBaselineTonalPalette() {
        return BaselineTonalPalette;
    }
}
