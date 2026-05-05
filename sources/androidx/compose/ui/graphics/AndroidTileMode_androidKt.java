package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
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
/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,r\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0015\u0010\u0019tʑQ0rdp.\u0001S\u05ec\u000eӆڷ8&a%\u007fESg(\u0001:\t}R\u0010g\u001dJԒ\n¼Ǉ\n\u0018~o:Om\u0006k\u0019'2pog3{sެ=`\u0003>ӏ 7*;\u007fڰ\u001dH)У\u0014\u007f"}, d2 = {"7rBBc7H`(~y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "7rBBc7H`(~y&v\u000e\u00057q~r", "uH\u0018'", "Bn0;W9HW\u0018m~e,d\u0013.e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u0006^\u0012Cv\r?X}u", "Bn0;W9HW\u0018m~e,d\u0013.eGr\r<\t#\u0016\u0012", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nn\u001a\u0013Fo\u001bze)<Ye*6mk", "Bn2<`7Ha\u0019m~e,d\u0013.e", "uKP;W9HW\u0018H|k(\b\f3c\u000eqiC|\u0016\u0017T.|@}%\u001dc| \r1y", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidTileMode_androidKt {

    /* JADX INFO: compiled from: AndroidTileMode.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m4082isSupported0vamqd0(int i2) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m4547equalsimpl0(i2, TileMode.Companion.m4552getDecal3opZhB0());
    }

    /* JADX INFO: renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m4083toAndroidTileMode0vamqd0(int i2) {
        if (TileMode.m4547equalsimpl0(i2, TileMode.Companion.m4551getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m4547equalsimpl0(i2, TileMode.Companion.m4554getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m4547equalsimpl0(i2, TileMode.Companion.m4553getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m4547equalsimpl0(i2, TileMode.Companion.m4552getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i2 == 1) {
            return TileMode.Companion.m4551getClamp3opZhB0();
        }
        if (i2 == 2) {
            return TileMode.Companion.m4553getMirror3opZhB0();
        }
        if (i2 == 3) {
            return TileMode.Companion.m4554getRepeated3opZhB0();
        }
        if (Build.VERSION.SDK_INT >= 31 && tileMode == Shader.TileMode.DECAL) {
            return TileModeVerificationHelper.INSTANCE.m4555getComposeTileModeDecal3opZhB0();
        }
        return TileMode.Companion.m4551getClamp3opZhB0();
    }
}
