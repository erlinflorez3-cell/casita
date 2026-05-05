package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
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
/* JADX INFO: compiled from: LazyListLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4G\u0007\"B\u0012\u007f\u0007lkA0RnP.XX2\u000f\u0002{<$a'yCIs\"}8\tWNmht/pŏs\u000f4\u0015I|:Imx\f\u0013E\u0007\u0019ĺAݯQsU;fvD\bpD0<\u0012\u0005/\u001b`\u001dfͣ|ŲO\u0010*2FuHU]_\u0013 *\u0006l!7r3ɸPɇLpu<5*\u0011l\u0013`5gH|{\u0016|)}˰xҐ\"/X9;\u001f3^S\u0019`gW\u0003m~sY?Ѿ)ȅMwo8^\u000e\"${_\u001bm\u000b&\u000b\u0006(ԇ\u000eˏ/S{MV\u001f6zK\f\u001bN\u001c\u000e4(\u001fͺ/բj\f&5z\u0006aC!\u001alV\u0018z\u0010KMyVĨ-߆\u001aƘј`:ϭR;\u0014\u0007\u001341\u0018?1il&`C\u001c+ɔSśUDUJT#g@>\u001a~|\u001a0\u00142W\u007f]\u0018?ImÍ9٦='9m\beR\u0006ѱ\u0004`èSxZKF̰\u000bD62\t\u0012yLf\u000b\u000b~Sй00ܴ U"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001b\u001a)rqHjl-XL", "", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", ";`X;4?Ba|\u000ezf\u001a\b\u0005-i\t*", "5dc\u001aT0G/,\u0003\tB;|\u0011\u001dp{&\u007fI\u0003", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "@de2e:>:\u0015\u0013\u0005n;", "", "5dc\u001fX=>`'~aZ@\u0007\u0019>", "u(I", "Bnc._\u0010MS!\rXh<\u0006\u0018", "5dc!b;:Z|\u000ezf:Z\u0013?n\u000f", "DhTDc6Kbx\byH-}\u0017/t", "5dc#\\,P^#\f\n>5{r0f\u000e(\u000b", "DhTDc6Kb\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019", "u(9", "DhTDc6Kb\u0007\u000evk;f\n0s\u007f7", "5dc#\\,P^#\f\nL;x\u0016>O\u0001)\n@\u0010", "Dhb6U3>7(~\u0003l\u0010\u0006\n9", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pEB\bm\u0002", "5dc#\\:BP ~^m,\u0005\u0017\u0013n\u00012", "u(;7T=:\u001d)\u000e~euc\r=tU", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyListLayoutInfo {
    default int getAfterContentPadding() {
        return 0;
    }

    default int getBeforeContentPadding() {
        return 0;
    }

    default int getMainAxisItemSpacing() {
        return 0;
    }

    default boolean getReverseLayout() {
        return false;
    }

    int getTotalItemsCount();

    int getViewportEndOffset();

    int getViewportStartOffset();

    List<LazyListItemInfo> getVisibleItemsInfo();

    /* JADX INFO: compiled from: LazyListLayoutInfo.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
        public static long m1124getViewportSizeYbymL2g(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.mo1123getViewportSizeYbymL2g();
        }

        @Deprecated
        public static Orientation getOrientation(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getOrientation();
        }

        @Deprecated
        public static boolean getReverseLayout(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getReverseLayout();
        }

        @Deprecated
        public static int getBeforeContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getBeforeContentPadding();
        }

        @Deprecated
        public static int getAfterContentPadding(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getAfterContentPadding();
        }

        @Deprecated
        public static int getMainAxisItemSpacing(LazyListLayoutInfo lazyListLayoutInfo) {
            return LazyListLayoutInfo.super.getMainAxisItemSpacing();
        }
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    default long mo1123getViewportSizeYbymL2g() {
        return IntSize.Companion.m6813getZeroYbymL2g();
    }

    default Orientation getOrientation() {
        return Orientation.Vertical;
    }
}
