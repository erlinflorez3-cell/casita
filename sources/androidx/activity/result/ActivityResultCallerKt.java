package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDRc|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u000fs{J$c$wCS%(Ԃ:\u000f_Pwg\u001dJ\t\nc\u0011\fǝ\u0007kLK[wk\u001472proC[sUEpvF\u0005f32:\n\u0005G\u001cXM@z\tIc\fX1p\u0001HY%Y\u0015\u001c\"\u0006\u0005\"\u0011 lg|6vtҺ>/1\f\u0002\u001a\\ϋw6\rO\u001dF\u0003';u\u0002 1¨E65'Y\u0002\u0015T\u0004?1B\"M\u0013l?3;K\u0004W|Y\u0010\u0016%+\u0016\u000f\fwV`\u0013Wx\fm,\u007fgYZ&(&\u0006,\u001dJ\u000b&\u00127J>-`h\u0018\u0010Ct!SnXؿbB\u000e\u0007ˑ:$"}, d2 = {"@dV6f;>`y\t\b:*\f\r@i\u000f<h@\u000f'\u001eV", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\"gD'\u0013kaF\\", "", "\u0017", "\u001d", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\u0019g;%\u0015u7", "1n]Ae(<b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "7m_Bg", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<EM\u0001%'N~W\u0018t49j\u0002/KZ\u0016<]JJI0%\u001chn\u000fm_5M\u00041KKauXP\u0002A%\u0016i\"\u00188\r\u0013iH38BA(\u00179E\u007fJ2\\\n%\u0012Fn\u007fVC\u0010U\n\u001c\u0005\u001f3qUf[wV\u0017,g&u\b)$XC<m}n\u001e\u001bf_\u0004p\u0002] yV\u00031lX!D94GkjJOxc\u0006U7(I\u000b{\u001c;$Jn[)\r37@h\u0004^1\u0014<m|&0kUp36J#FZ-QjM\u0012y#p\u001czbCA tL_X\u0018\u0005`\u0017h\u000b", "@dV6f;Kg", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR(k6\"#wnM\\", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<EM\u0001%'N~W\u0018t49j\u0002/KZ\u0016<]JJI0%\u001chn\u000fm_5M\u00041KKauXP\u0002A%\u0016i\"\u00188\r\u0013iH38BA(\u00179E\u007fJ2\\\n%\u0012Fn\u007fVC\u0010U\n\u001c\u0005\u001f3qUf[wV\u0017,g&u\b)$XC<m}n\u001e\u001bf_\u0004pw\\\u0010\u007f\\}fz\u0011\u0015xG(OqjZ\u000f|UJ\u0005..\u0015Wu!6ix:\t\u001a\u0004B:=sqKi\u001cLm\u0006)\u0002CG15=@\u001c\tPt}6?\u001eq\u001dp\f\u0018kCzyunaW\u0013\u0011fb1xH[\n6_\u0010BH\u0003^#D\u000eFl}$\u001dP1msYJ*\u001e\\\u0018\u007fH3c \u0017of&,5%$U\u001fq(b7Zh", "/bc6i0Mg`\u0005\nq&\n\t6e{6{"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, ActivityResultRegistry activityResultRegistry, final Function1<? super O, Unit> function1) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                function1.invoke(obj);
            }
        }), activityResultContract, i2);
    }

    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, final Function1<? super O, Unit> function1) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                function1.invoke(obj);
            }
        }), activityResultContract, i2);
    }
}
