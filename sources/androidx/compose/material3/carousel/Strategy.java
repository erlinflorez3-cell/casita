package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r'4\u0012}\nnjGNLeN8ZS@\u000fsڔ<$i-yCAb\"}0\u000fWNmgtϺpŏa86\u0016'idH~9\u000b\u0018#BF}?KM\u001e>Id\u00038\u001d `%H}\u0013\u00052*v\u0013\u0007~QP$\u0012^C\u0001>`\u0013e\u0005H\u0015ĂB \u000f%\u001d1T6Xpk:G#1jRX5gH\u0003]\u000fVTU\u000e%j.5NAM\u001b5U\u0013\u0007\u0001\\m\fOuK\u0007\u0001'U.Ywe:p\u007fB\u0018;S\u001bb\u000b&\u000b\bad\u001a-CO\u0012Nח\u0012(\u0006\u0006D\u001eJ$&\u0006U`^3(\b \u0010Is!R\u0007Ч\u0002'g\u000e\u001dy6E&079\\3f\u007fdk\u001d\\[\u0014\u0005;!S\u0007t!iy&`C3\u001bȭΦ5QFc\u0011T\u0018\u0001Um2\u0019)\u0016z\u0013>M\u0018/*\u0014ѧ\u001b+?كQ%'w\u0010U\u0015v\u0005\u0007xh\u0002lʐLF*Â.90\u0017\u001ag\u0015s\u0013phT\u0007/ҭQ\"\\͵\u0016\n\u0019/j\u0005\r03\u0010fO\u0017jҷQc\u0012ɘGh=i||^lGhK;ae a\u0001wBHםf\u000b`٨ZU\u0012lj;r>V~(w*G%ۿ\u0015\u0558Cq$ع|='q-H14\u0019ˉ~ȤcZpɭOcA;\u001biR\r֊\u0005Vdʙ\bi~`:\u001611;[i5G)\ffמ8\u0001;\t\u0005\u000f\u000eT8[UP\u0005\u0016$Xދ$\u001c\"ߙi1C/\u001d\fyG\u00105]R\u0003gaM@()\u0006ɍ\u0013Ap֫\u007f\np\u000e:s;V]r/\"%aIֿ\nܐ\u0004yi¿KSqs#[l_IÈ[\u0084R8\u0005þȽ\"O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001c\\P7z4 )>", "", "2dU.h3M9\u0019\u0013\u0002b5|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "/uP6_(;Z\u0019l\u0006Z*|", "", "7sT:F7:Q\u001d\b|", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw3COr8'\u0015OeG\u00169\r/W\b\u000b=", "AsP?g\u0012>g \u0003\u0004^\u001a\f\t:s", "", "3mS\u0018X@EW\"~hm,\b\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw3COr8'\u0015OeG\u00169\u0013Sr8C\u0016^;`Y<$\u0018 ic50\t\u0016U\u000b4}H>hn0W\u0011\u0011IalvQ&", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(5", "5dc\u000ei(BZ\u0015{\u0002^\u001a\b\u0005-e", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "5dc\u0011X-:c \u000e`^@\u0004\r8e\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u0017);\u007f;\"\u001ehH=\u0015r\u0002", "5dc\u0012a+$S-\u0006~g,j\u0018/p\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", "3mS [0?bw\u0003\tm(\u0006\u0007/", "3mS [0?b\u0004\t~g;\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "7rE._0=", "", "u(I", "7sT:@(B\\t\u0012~l\u001a\u0001\u001e/", "5dc\u0016g,F;\u0015\u0003\u0004:?\u0001\u0017\u001di\u0015(", "5dc\u0016g,FA$zxb5~", "5dc g(Kb~~\u000fe0\u0006\t\u001dt\u007f3\n", "AsP?g\u001aAW\u001a\u000eYb:\f\u00058c\u007f", "AsP?g\u001aAW\u001a\u000eeh0\u0006\u0018=", "3pd._:", "=sW2e", "5dc\u0018X@EW\"~ab:\fi9rm&\tJ\b\u001e\u0001Hp\u001c<\u0006", "Aba<_3(T\u001a\rzm", ";`g V9HZ h{_:|\u0018", "@nd;W\u001bH<\u0019z\b^:\fv>e\u000b", "5dc\u0018X@EW\"~ab:\fi9rm&\tJ\b\u001e\u0001Hp\u001c<\u0006c=U\r Dq\u00125\u001b=Hk;\u001e\u0011va", "6`b566=S", "", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Strategy {
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Strategy Empty = new Strategy(KeylineListKt.emptyKeylineList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f2, float f3, float f4, float f5) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f2;
        this.itemSpacing = f3;
        this.beforeContentPadding = f4;
        this.afterContentPadding = f5;
        float startShiftDistance = StrategyKt.getStartShiftDistance(list, f4);
        this.startShiftDistance = startShiftDistance;
        float endShiftDistance = StrategyKt.getEndShiftDistance(list2, f5);
        this.endShiftDistance = endShiftDistance;
        this.startShiftPoints = StrategyKt.getStepInterpolationPoints(startShiftDistance, list, true);
        this.endShiftPoints = StrategyKt.getStepInterpolationPoints(endShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f2 == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public Strategy(KeylineList keylineList, float f2, float f3, float f4, float f5) {
        this(keylineList, StrategyKt.getStartKeylineSteps(keylineList, f2, f3, f4), StrategyKt.getEndKeylineSteps(keylineList, f2, f3, f5), f2, f3, f4, f5);
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy, float f2, float f3, boolean z2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        return strategy.getKeylineListForScrollOffset$material3_release(f2, f3, z2);
    }

    public final KeylineList getKeylineListForScrollOffset$material3_release(float f2, float f3, boolean z2) {
        int toStepIndex;
        float fMax = Math.max(0.0f, f2);
        float f4 = this.startShiftDistance;
        float fMax2 = Math.max(0.0f, f3 - this.endShiftDistance);
        if (f4 > fMax || fMax > fMax2) {
            float fLerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f4, fMax);
            FloatList floatList = this.startShiftPoints;
            List<KeylineList> list = this.startKeylineSteps;
            if (fMax > fMax2) {
                fLerp = StrategyKt.lerp(0.0f, 1.0f, fMax2, f3, fMax);
                floatList = this.endShiftPoints;
                list = this.endKeylineSteps;
            }
            ShiftPointRange shiftPointRange = StrategyKt.getShiftPointRange(list.size(), floatList, fLerp);
            if (z2) {
                if (MathKt.roundToInt(shiftPointRange.getSteppedInterpolation()) == 0) {
                    toStepIndex = shiftPointRange.getFromStepIndex();
                } else {
                    toStepIndex = shiftPointRange.getToStepIndex();
                }
                return list.get(toStepIndex);
            }
            return KeylineListKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
        }
        return this.defaultKeylines;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z2 = this.isValid;
        if (!z2 && !((Strategy) obj).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z2 == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && Intrinsics.areEqual(this.startShiftPoints, strategy.startShiftPoints) && Intrinsics.areEqual(this.endShiftPoints, strategy.endShiftPoints) && Intrinsics.areEqual(this.defaultKeylines, strategy.defaultKeylines);
    }

    public int hashCode() {
        boolean z2 = this.isValid;
        return !z2 ? Boolean.hashCode(z2) : (((((((((((((((((((Boolean.hashCode(z2) * 31) + Float.hashCode(this.availableSpace)) * 31) + Float.hashCode(this.itemSpacing)) * 31) + Float.hashCode(this.beforeContentPadding)) * 31) + Float.hashCode(this.afterContentPadding)) * 31) + Float.hashCode(getItemMainAxisSize())) * 31) + Float.hashCode(this.startShiftDistance)) * 31) + Float.hashCode(this.endShiftDistance)) * 31) + this.startShiftPoints.hashCode()) * 31) + this.endShiftPoints.hashCode()) * 31) + this.defaultKeylines.hashCode();
    }

    /* JADX INFO: compiled from: Strategy.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001c\\P7z4 )'?C\u000fn(Wz1P\"", "", "u(E", "\u0013l_Al", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001c\\P7z4 )>", "5dc\u0012`7Mg", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u00171Jx0-\u0015ju\u000f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }
    }
}
