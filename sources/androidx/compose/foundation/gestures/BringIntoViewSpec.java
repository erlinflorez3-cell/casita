package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: BringIntoViewSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<G\u0007\"2\u0018}l|ʑW9tev-\u000bR3W\n\n9<[Rss?c \u0016\"7Q~kuubZ9E?\n$\u0001\u0003,wW?qb'@B\bECO\u007f=gb#7;t\tŉ:ѩ\t\u00052,N\u0013\u0005~ǈJÈ۸0Dx<X,{\u0004ܮ\u0016\u0010ͅ$\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "", "Aba<_3\u001a\\\u001d\u0007vm0\u0007\u0012\u001dp\u007f&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "5dc V9HZ Z\u0004b4x\u00183o\t\u0016\u0007@~", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "1`[0h3:b\u0019lxk6\u0004\u0010\u000ei\u000e7wI~\u0017", "=eU@X;", "Ahi2", "1n]AT0GS&l~s,", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    default AnimationSpec<Float> getScrollAnimationSpec() {
        return Companion.getDefaultScrollAnimationSpec();
    }

    default float calculateScrollDistance(float f2, float f3, float f4) {
        return Companion.defaultCalculateScrollDistance$foundation_release(f2, f3, f4);
    }

    /* JADX INFO: compiled from: BringIntoViewSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njG5LeN4Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018quq\u0007J\t\u0012s\u0013\u0014!\u0011jZP\u0006|k\u001e'2pvo7[|U9\u000f{|ӌڶ6\">\bU\u0013(+`\u0010%|\u001aŸ\u000eܘ4Fxíj\u000fS\b(\u0016VS.\u00066bwPFH\u001bdh5ݭ\u0007oJ÷?a6\u0005[\u0016ШX6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u0012dU.h3M0&\u0003\u0004`\u0010\u0006\u00189V\u0004(\u000e.\f\u0017\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "5dc\u0011X-:c \u000eWk0\u0006\u000b\u0013n\u000f2lD\u0001)\u0005Ro\fzw/Eb|\u001cFq 7GP;r4\u001a#h", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u0018x8'\u0017LjH\u0011T0N\t\u0015RLL\u0002", "\u0012dU.h3MA\u0017\f\u0005e3X\u00123m{7\u007fJ\n\u0005\"Gm", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "5dc\u0011X-:c \u000eh\\9\u0007\u00106A\t,\u0004<\u0010\u001b!P]\u0019<t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "2dU.h3M1\u0015\u0006xn3x\u0018/S}5\u0006G\bu\u001bU~\nEt%", "=eU@X;", "Ahi2", "1n]AT0GS&l~s,", "2dU.h3M1\u0015\u0006xn3x\u0018/S}5\u0006G\bu\u001bU~\nEt%sZ\b0@l\u0012=QMDeA\u001e\u001ch]G\u0007", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
        };

        private Companion() {
        }

        public final AnimationSpec<Float> getDefaultScrollAnimationSpec() {
            return DefaultScrollAnimationSpec;
        }

        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation_release() {
            return DefaultBringIntoViewSpec;
        }

        public final float defaultCalculateScrollDistance$foundation_release(float f2, float f3, float f4) {
            float f5 = f3 + f2;
            if ((f2 >= 0.0f && f5 <= f4) || (f2 < 0.0f && f5 > f4)) {
                return 0.0f;
            }
            float f6 = f5 - f4;
            return Math.abs(f2) < Math.abs(f6) ? f2 : f6;
        }
    }
}
