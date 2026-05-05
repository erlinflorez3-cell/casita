package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: MotionTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6B\u000504\u0012\u000e\u0007nj?CJΝHDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u0003\tHc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L&\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPU?_^~$μ\u0019ù+\r~ѭn7N?M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v0?+wu.̳+ÿ\u0018\u00153˽]i\u00010t\u0005\u007fbbʳ}յgKXʫx\u0004\t\u0007%<2\u0010\\ΰ\u001bͶ1\u001anڜ^?\u0003~k@~\u00045۔Rѐe6\u001fӛP?9F3f\u007fc\u0012ϑ!Ѽ\u007f\u0005\u0015̔s\r|/sT<bkØ'ɐU1Y̵\u000eT\\\u0019q=\u001c\u0006GîTò\b0Oĉ\u007f\b\u001f>/%e]\u0010\u0601sȠ\u0006HLϙG\u0011nyki\u0001J\u0017̕Aގ;*\u0011ȱ+Sr\u0017\u0004P\u0003k¯\u0015S$\u0381\u001f\u007f\u000e'.qHK/;(N}{ȬnSe܃=1lNg\u0004<\u001deQv3cdӒ\u0014gZΘ,AB{\u0013m7Qa&r\\V5ĘLp\u0018Ǯ\u0014FT'!G\u0010\u0001*PD1GoČL\t&ՓY~\u000f|h}`\u000ebQ<\u0003\u00187ڲ\r\u0007Xʔ\tqm\u0018WAMo0MYQc,łY(pؔ\u0015%\r \u0002\u0015\u0018vZidlD\tʀ\u007f&\u001e֝QS5`!$O8@&EEz\u0006ϯUS\u001a\u05fd\u0013~\u007f4I}~v\u0016\u0011\t,\u000f}ߝSZ\u001fǱ\u000f`xJ\u0016yѩ}\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001U =QMDZ>$\u0015qo\u000f", "", "u(E", "\u0012ta.g0H\\x\u0012\nk(c\u00138gK", "", "\u0012ta.g0H\\x\u0012\nk(c\u00138gL", "\u0012ta.g0H\\x\u0012\nk(c\u00138gM", "\u0012ta.g0H\\x\u0012\nk(c\u00138gN", "\u0012ta.g0H\\\u007f\t\u0004`w", "\u0012ta.g0H\\\u007f\t\u0004`x", "\u0012ta.g0H\\\u007f\t\u0004`y", "\u0012ta.g0H\\\u007f\t\u0004`z", "\u0012ta.g0H\\\u0001~yb<\u0005T", "\u0012ta.g0H\\\u0001~yb<\u0005U", "\u0012ta.g0H\\\u0001~yb<\u0005V", "\u0012ta.g0H\\\u0001~yb<\u0005W", "\u0012ta.g0H\\\u0007\u0002\u0005k;H", "\u0012ta.g0H\\\u0007\u0002\u0005k;I", "\u0012ta.g0H\\\u0007\u0002\u0005k;J", "\u0012ta.g0H\\\u0007\u0002\u0005k;K", "\u0013`b6a.\u001e[$\u0002vl0\u0012\t.A}&{G\u0001$\u0013VokLs)36}5;m#", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Gj\u001a,*CPo4+tdo=\u0010e\u0002", "5dc\u0012T:B\\\u001b^\u0003i/x\u00173z\u007f'W>~\u0017\u001eG|\nKv\u0003EV\u0002\u001e\u0014m+2MP", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001K&+QA\u0018kI\"\u0015uA5\u0015g5PL", "\u0013`b6a.\u001e[$\u0002vl0\u0012\t.C\u0010%\u007f>]\u0017,Ko\u001b", "5dc\u0012T:B\\\u001b^\u0003i/x\u00173z\u007f'YP}\u001b\u0015$o#@v2", "\u0013`b6a.\u001e[$\u0002vl0\u0012\t.D\u007f&{G\u0001$\u0013VokLs)36}5;m#", "5dc\u0012T:B\\\u001b^\u0003i/x\u00173z\u007f'Z@~\u0017\u001eG|\nKv\u0003EV\u0002\u001e\u0014m+2MP", "\u0013`b6a.%S\u001bzxr\bz\u0007/l\u007f5wO\u0001t'Ds\f\u0019v:9Y\u000b", "5dc\u0012T:B\\\u001bez`(z\u001d\u000bc}(\u0003@\u000e\u0013&GM\u001e9z#\u0012Y\u0013$7z", "\u0013`b6a.%S\u001bzxr\n\r\u00063c\\(\u0011D\u0001$", "5dc\u0012T:B\\\u001bez`(z\u001d\ru|,y\u001d\u0001,\u001bG|", "\u0013`b6a.%S\u001bzxr\u000b|\u0007/l\u007f5wO\u0001t'Ds\f\u0019v:9Y\u000b", "5dc\u0012T:B\\\u001bez`(z\u001d\u000ee}(\u0003@\u000e\u0013&GM\u001e9z#\u0012Y\u0013$7z", "\u0013`b6a.%W\"~vk\n\r\u00063c\\(\u0011D\u0001$", "5dc\u0012T:B\\\u001be~g,x\u0016\ru|,y\u001d\u0001,\u001bG|", "\u0013`b6a.,b\u0015\byZ9{d-c\u007f/{M|&\u0017%\u007f\u000b@t\u00025n\u0002 D", "5dc\u0012T:B\\\u001bl\nZ5{\u0005<d[&y@\b\u0017$C~\u000e\u001a\u0007\"9WZ Lq\u0016;", "\u0013`b6a.,b\u0015\byZ9{f?b\u0004&X@\u0016\u001b\u0017T", "5dc\u0012T:B\\\u001bl\nZ5{\u0005<d]8xD~s\u0017\\s\u000eI", "\u0013`b6a.,b\u0015\byZ9{g/c\u007f/{M|&\u0017%\u007f\u000b@t\u00025n\u0002 D", "5dc\u0012T:B\\\u001bl\nZ5{\u0005<d^(y@\b\u0017$C~\u000e\u001a\u0007\"9WZ Lq\u0016;", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MotionTokens {
    public static final int $stable = 0;
    public static final double DurationExtraLong1 = 700.0d;
    public static final double DurationExtraLong2 = 800.0d;
    public static final double DurationExtraLong3 = 900.0d;
    public static final double DurationExtraLong4 = 1000.0d;
    public static final double DurationLong1 = 450.0d;
    public static final double DurationLong2 = 500.0d;
    public static final double DurationLong3 = 550.0d;
    public static final double DurationLong4 = 600.0d;
    public static final double DurationMedium1 = 250.0d;
    public static final double DurationMedium2 = 300.0d;
    public static final double DurationMedium3 = 350.0d;
    public static final double DurationMedium4 = 400.0d;
    public static final double DurationShort1 = 50.0d;
    public static final double DurationShort2 = 100.0d;
    public static final double DurationShort3 = 150.0d;
    public static final double DurationShort4 = 200.0d;
    public static final MotionTokens INSTANCE = new MotionTokens();
    private static final CubicBezierEasing EasingEmphasizedCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingEmphasizedAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 0.8f, 0.15f);
    private static final CubicBezierEasing EasingEmphasizedDecelerateCubicBezier = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
    private static final CubicBezierEasing EasingLegacyCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLegacyAccelerateCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingLegacyDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLinearCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);

    private MotionTokens() {
    }

    public final CubicBezierEasing getEasingEmphasizedCubicBezier() {
        return EasingEmphasizedCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedAccelerateCubicBezier() {
        return EasingEmphasizedAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedDecelerateCubicBezier() {
        return EasingEmphasizedDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyCubicBezier() {
        return EasingLegacyCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyAccelerateCubicBezier() {
        return EasingLegacyAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyDecelerateCubicBezier() {
        return EasingLegacyDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLinearCubicBezier() {
        return EasingLinearCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardCubicBezier() {
        return EasingStandardCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardAccelerateCubicBezier() {
        return EasingStandardAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardDecelerateCubicBezier() {
        return EasingStandardDecelerateCubicBezier;
    }
}
