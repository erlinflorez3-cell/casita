package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: Carousel.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<G\u0007\"B\u0012\u007f\u0007lkA0ZeP.XU2\u000f\u0002{<$a,yCI[\"}8\tWNmgtϺpŏs\u000f4\u001596<}cxuB\u001fCR~m5ޜsG?c\u0005<\u000b$B$>\u007f+\u0006*;X\u001f%|ŲO\u0016\u00183Pv@V\u001dO\u000b 8\fN\"\u0011\u001e\u000bn|7XpkBG#1kRR5hH|{\u000fТX'\u001b\u0001*89VO5C<{\u00035j\fC\u0011D\n=3\u007fW+9b\fWdoF(e7]\u0016urT^[ĬbВ++WҪ\u001c\\\u001c0\u0010z*\u000f\u0013ǌ\u0010Ν+H6Ʀj#\u0016\u000eK%\u0003dP_0`۰\u0004\u0005g9'+\u00067;;!lwfK*^F*\u0007ڟ\"-\u0007q1aZ\u0012p\u0017!Z\u001eWASP=vU8Z\u0014Ъ\u0006Ͳf\u00022ʶ\u0001V\u000e:\u0014\u0011\\#[{٦='9m\bURuG.nxki\u0001Tp&|%O*7\u0018\u0011\u0005#EB¯ԈX¯\u0015]$V\r\u0012\u0016(8^}M/30PUzw}ܽa$"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cS];\u0007Q0cv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120M1?\u00014s", "9dh9\\5>:\u001d\r\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/uP6_(;Z\u0019l\u0006Z*|", "7sT:F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0001\u00181\u0007", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001c\\P7z4 )>", "5dc g9:b\u0019\u0001\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u00171Jx0-\u0015ju\u000f", "\nrTA \u0006\u0017", "Asa.g,@g\u0007\u000evm,", "5dc g9:b\u0019\u0001\u000fL;x\u0018/", "Adc g9:b\u0019\u0001\u000fL;x\u0018/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw;RHgC\u001e\u0017|7|w", "Asa.g,@g\u0007\u000evm,;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1`[0h3:b\u0019fvb5X\u001c3sj$}@n\u001b,G", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ">`V2F7:Q\u001d\b|", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;
    private final Function2<Float, Float, KeylineList> keylineList;
    private final MutableState strategyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselPageSize(Function2<? super Float, ? super Float, KeylineList> function2, float f2, float f3) {
        this.keylineList = function2;
        this.beforeContentPadding = f2;
        this.afterContentPadding = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState$delegate.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState$delegate.setValue(strategy);
    }

    public final Strategy getStrategy() {
        return getStrategyState();
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(Density density, int i2, int i3) {
        float f2 = i2;
        float f3 = i3;
        setStrategyState(new Strategy(this.keylineList.invoke(Float.valueOf(f2), Float.valueOf(f3)), f2, f3, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().isValid() ? MathKt.roundToInt(getStrategy().getItemMainAxisSize()) : i2;
    }
}
